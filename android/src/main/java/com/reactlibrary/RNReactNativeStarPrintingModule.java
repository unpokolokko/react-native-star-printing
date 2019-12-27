
/*
Code is written by Nurizzati Rohim
*/

package com.reactlibrary;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

import com.starmicronics.starioextension.ICommandBuilder;
import com.starmicronics.stario.PortInfo;
import com.starmicronics.stario.StarIOPort;
import com.starmicronics.stario.StarIOPortException;

import com.starmicronics.starprntsdk.Communication;
import com.starmicronics.starprntsdk.ModelCapability;
import com.starmicronics.starprntsdk.PrinterSettingManager;
import com.starmicronics.starprntsdk.PrinterSettings;
import com.starmicronics.starprntsdk.functions.PrinterFunctions;

import static com.starmicronics.starioextension.StarIoExt.Emulation;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static android.app.PendingIntent.getActivity;

public class RNReactNativeStarPrintingModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;
    private String receiptDetails;
    private Callback callback;
    private Bitmap mBitmap;
    private int mLanguage;
    private boolean mIsForeground;
    private int       mPrinterSettingIndex;
    private int       mModelIndex;
    private String    mPortName;
    private String    mPortSettings;
    private String    mMacAddress;
    private String    mModelName;
    private Boolean   mDrawerOpenStatus;
    private int       mPaperSize;
    private ICommandBuilder builder;
    Charset encoding;

	  public RNReactNativeStarPrintingModule(ReactApplicationContext reactContext) {
	    super(reactContext);
	    this.reactContext = reactContext;
	  }

	  @Override
	  public String getName() {
	    return "RNReactNativeStarPrinting";
	  }

	  @ReactMethod
	  public void testing(final String test, Callback testcallback) {
	      testcallback.invoke(test);
	  }

	  private class SearchTask extends AsyncTask<String, Void, Void>{

	    SearchTask() {
	        super();
	    }

	  	  private List<PortInfo> mPortList;

		  @Override
		  protected Void doInBackground(String... interfaceType) {

		    try {
		       mPortList = StarIOPort.searchPrinter(interfaceType[0]);

		    } catch (StarIOPortException e) {
		       mPortList = new ArrayList<>();
		    }

		    return null;
		  }

		   @Override
		   protected void onPostExecute(Void doNotUse){

		      for (PortInfo info : mPortList) {

		        PrinterSettingManager settingManager = new PrinterSettingManager(getReactApplicationContext());

		        mModelIndex = 2;
		        mPortName = info.getPortName();
		        mPortSettings = ModelCapability.getPortSettings(mModelIndex);
		        mMacAddress = info.getMacAddress();
		        mModelName = info.getModelName();
		        mDrawerOpenStatus = true;
		        mPaperSize = 576;
		        settingManager.storePrinterSettings(
		            mPrinterSettingIndex,
		            new PrinterSettings(mModelIndex, mPortName, mPortSettings, mMacAddress, mModelName, mDrawerOpenStatus, mPaperSize)
		        );

		      }
		  }

		}

       @ReactMethod
    	public void printReceipt(final String receiptDetails, final Callback callback ){

	        try {

	            //find port and set port
	            String selectedInterface = "TCP:";

	            SearchTask searchTask = new SearchTask();
	            searchTask.execute(selectedInterface);

	            //print receipt
	            //TODO change to print photos instead - pass over photos url & change to bitmap
	            this.receiptDetails = receiptDetails;
	            this.callback = callback;

	            Uri myUri = Uri.parse(receiptDetails);

	            mBitmap = MediaStore.Images.Media.getBitmap(getReactApplicationContext().getContentResolver(),myUri);

	            print();

	            callback.invoke("Success");

	        }catch (Exception ex){

	            String error = "Error : " + ex.toString();
	            callback.invoke(error);

	        }
    	}

        
        private final Communication.SendCallback mCallback = new Communication.SendCallback() {	
	        @Override
	        public String onStatus(boolean result, Communication.Result communicateResult) {
	            if (!mIsForeground) {
	                return null;
	            }

	            String msg;

	            switch (communicateResult) {
	                case Success:
	                    msg = "Success!";
	                    break;
	                case ErrorOpenPort:
	                    msg = "Fail to openPort";
	                    break;
	                case ErrorBeginCheckedBlock:
	                    msg = "Printer is offline (beginCheckedBlock)";
	                    break;
	                case ErrorEndCheckedBlock:
	                    msg = "Printer is offline (endCheckedBlock)";
	                    break;
	                case ErrorReadPort:
	                    msg = "Read port error (readPort)";
	                    break;
	                case ErrorWritePort:
	                    msg = "Write port error (writePort)";
	                    break;
	                default:
	                    msg = "Unknown error";
	                    break;
	            }

	            return msg;

	        }
    	};

}
