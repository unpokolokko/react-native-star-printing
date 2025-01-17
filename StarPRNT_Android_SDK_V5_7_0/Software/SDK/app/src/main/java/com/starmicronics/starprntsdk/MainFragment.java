package com.starmicronics.starprntsdk;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import com.starmicronics.cloudservices.CloudServices;
import com.starmicronics.stario.StarIOPort;
import com.starmicronics.starioextension.StarIoExt;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends ItemListFragment implements CommonAlertDialogFragment.Callback {

    private static final int PRINTER_SET_REQUEST_CODE = 1;

    private static final String PRINTER_LANG_SELECT_DIALOG           = "PrinterLanguageSelectDialog";

    private static final String BLACK_MARK_LANG_SELECT_DIALOG        = "BlackMarkLanguageSelectDialog";
    private static final String BLACK_MARK_PASTE_LANG_SELECT_DIALOG  = "BlackMarkPasteLanguageSelectDialog";

    private static final String PRINTER_LANG_SELECT_PAGE_MODE_DIALOG = "PrinterLanguageSelectPageModeDialog";

    private static final String PRINT_REDIRECTION_LANG_SELECT_DIALOG = "PrintRedirectionLanguageSelectDialog";

    private static final String MPOP_COMBINATION_LANG_SELECT_DIALOG  = "mPOPCombinationLanguageSelectDialog";

    private static final String ALL_RECEIPT_LANG_SELECT_DIALOG       = "AllReceiptLanguageSelectDialog";

    private static final String SERIAL_NUMBER_DIALOG                 = "SerialNumberDialog";

    private static final String LICENSE_DIALOG                       = "LicenseDialog";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

        updateList();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.infoIcon) {
            LicenseDialogFragment dialog = LicenseDialogFragment.newInstance(LICENSE_DIALOG);
            dialog.show(getChildFragmentManager());
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PRINTER_SET_REQUEST_CODE) {
            updateList();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        super.onItemClick(parent, view, position, id);

        Intent intent = new Intent(getActivity(), CommonActivity.class);

        switch (position) {
            case 1: {   // Tapped Destination Device row
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_printer_search);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Search Port");
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_RELOAD_BUTTON, true);
                intent.putExtra(CommonActivity.BUNDLE_KEY_PRINTER_SETTING_INDEX, 0);    // Index of the backup printer

                startActivityForResult(intent, PRINTER_SET_REQUEST_CODE);
                break;
            }
            case 3: {   // Tapped Printer row (Sample)
                LanguageSelectDialogFragment dialog = LanguageSelectDialogFragment.newInstance(PRINTER_LANG_SELECT_DIALOG);
                dialog.show(getChildFragmentManager());
                break;
            }
            case 4: {   // Tapped Printer row (Black Mark)
                EnJpLanguageSelectDialogFragment dialog = EnJpLanguageSelectDialogFragment.newInstance(BLACK_MARK_LANG_SELECT_DIALOG);
                dialog.show(getChildFragmentManager());
                break;
            }
            case 5: {   // Tapped Printer row (Black Mark Paste)
                EnJpLanguageSelectDialogFragment dialog = EnJpLanguageSelectDialogFragment.newInstance(BLACK_MARK_PASTE_LANG_SELECT_DIALOG);
                dialog.show(getChildFragmentManager());
                break;
            }
            case 6: {   // Tapped Printer row (Page Mode)
                EnJpLanguageSelectDialogFragment dialog = EnJpLanguageSelectDialogFragment.newInstance(PRINTER_LANG_SELECT_PAGE_MODE_DIALOG);
                dialog.show(getChildFragmentManager());
                break;
            }
            case 7: {   // Tapped Printer row (Print Re-Direction Sample)
                CombinationLanguageSelectDialogFragment dialog = CombinationLanguageSelectDialogFragment.newInstance(PRINT_REDIRECTION_LANG_SELECT_DIALOG);
                dialog.show(getChildFragmentManager());
                break;
            }
            case 9: {   // Tapped CashDrawer row
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_cash_drawer);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Cash Drawer");
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);

                startActivity(intent);
                break;
            }
            case 11: {   // Tapped Barcode Reader row
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_barcode_reader_ext);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Barcode Reader Ext");
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_RELOAD_BUTTON, true);

                startActivity(intent);
                break;
            }
            case 13: {   // Tapped Display row
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_display);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Display");
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);

                startActivity(intent);
                break;
            }
            case 15: {   // Tapped Combination row
                CombinationLanguageSelectDialogFragment dialog = CombinationLanguageSelectDialogFragment.newInstance(MPOP_COMBINATION_LANG_SELECT_DIALOG);
                dialog.show(getChildFragmentManager());
                break;
            }
            case 17: {   // Tapped API row
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_api);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "API");
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);

                startActivity(intent);
                break;
            }
            case 19: {   // Tapped AllReceipts row
                AllReceiptLanguageSelectDialogFragment dialog = AllReceiptLanguageSelectDialogFragment.newInstance(ALL_RECEIPT_LANG_SELECT_DIALOG);
                dialog.show(getChildFragmentManager());
                break;
            }
            case 21: {   // Tapped Device Status row (Device Status/Firmware Information)
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_device_status);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Device Status");
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_RELOAD_BUTTON, true);

                startActivity(intent);
                break;
            }
            case 22: {   // Tapped Device Status row (Product Serial Number)
                SerialNumberDialogFragment dialog = SerialNumberDialogFragment.newInstance(SERIAL_NUMBER_DIALOG);
                dialog.show(getChildFragmentManager());
                break;
            }
            case 24: {   // Tapped Bluetooth Setting row
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_bluetooth_setting);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Bluetooth Setting");
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_RELOAD_BUTTON, true);

                startActivity(intent);
                break;
            }
            case 25: {   // Tapped USB Serial Number row
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_usb_serial_number_setting);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "USB Serial Number");
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);

                startActivity(intent);
                break;
            }
            case 27: {   // Tapped Library Version row
                CommonAlertDialogFragment dialog = CommonAlertDialogFragment.newInstance("");
                dialog.setTitle("Library Version");
                dialog.setMessage(
                        "StarIOPort3.1 version " + StarIOPort.getStarIOVersion() + "\n" +
                        StarIoExt.getDescription() + "\n" +
                        CloudServices.getDescription());
                dialog.setPositiveButton("OK");
                dialog.show(getChildFragmentManager());
                break;
            }
        }
    }

    @Override
    public void onDialogResult(String tag, Intent data) {
        boolean isCanceled = data.hasExtra(CommonAlertDialogFragment.LABEL_NEGATIVE);

        if (isCanceled) return;

        switch (tag) {
            case PRINTER_LANG_SELECT_DIALOG: {
                int language = data.getIntExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, PrinterSettingConstant.LANGUAGE_ENGLISH);

                Intent intent = new Intent(getActivity(), CommonActivity.class);
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_printer);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Printer");
                intent.putExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, language);
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);

                startActivity(intent);

                break;
            }
            case BLACK_MARK_LANG_SELECT_DIALOG: {
                int language = data.getIntExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, PrinterSettingConstant.LANGUAGE_ENGLISH);

                Intent intent = new Intent(getActivity(), CommonActivity.class);
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_blackmark);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Black Mark");
                intent.putExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, language);
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);

                startActivity(intent);

                break;
            }
            case BLACK_MARK_PASTE_LANG_SELECT_DIALOG: {
                int language = data.getIntExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, PrinterSettingConstant.LANGUAGE_ENGLISH);

                Intent intent = new Intent(getActivity(), CommonActivity.class);
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_blackmark_paste);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Black Mark Paste");
                intent.putExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, language);
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);

                startActivity(intent);

                break;
            }
            case PRINTER_LANG_SELECT_PAGE_MODE_DIALOG: {
                int language = data.getIntExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, PrinterSettingConstant.LANGUAGE_ENGLISH);

                Intent intent = new Intent(getActivity(), CommonActivity.class);
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_page_mode);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Page Mode");
                intent.putExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, language);
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);

                startActivity(intent);

                break;
            }
            case PRINT_REDIRECTION_LANG_SELECT_DIALOG: {
                int language = data.getIntExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, PrinterSettingConstant.LANGUAGE_ENGLISH);

                Intent intent = new Intent(getActivity(), CommonActivity.class);
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_print_redirection);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Print Re-Direction");
                intent.putExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, language);
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);

                startActivity(intent);

                break;
            }
            case MPOP_COMBINATION_LANG_SELECT_DIALOG: {
                int language = data.getIntExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, PrinterSettingConstant.LANGUAGE_ENGLISH);

                Intent intent = new Intent(getActivity(), CommonActivity.class);
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_combination);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Combination");
                intent.putExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, language);
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);

                startActivity(intent);

                break;
            }
            case ALL_RECEIPT_LANG_SELECT_DIALOG: {
                int language = data.getIntExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, PrinterSettingConstant.LANGUAGE_ENGLISH);

                Intent intent = new Intent(getActivity(), CommonActivity.class);
                intent.putExtra(CommonActivity.BUNDLE_KEY_ACTIVITY_LAYOUT, R.layout.activity_all_receipts);
                intent.putExtra(CommonActivity.BUNDLE_KEY_TOOLBAR_TITLE, "Star Micronics Cloud");
                intent.putExtra(CommonActivity.BUNDLE_KEY_LANGUAGE, language);
                intent.putExtra(CommonActivity.BUNDLE_KEY_SHOW_HOME_BUTTON, true);

                startActivity(intent);

                break;
            }
        }
    }

    private void updateList() {
        adapter.clear();

        PrinterSettingManager settingManager = new PrinterSettingManager(getActivity());
        PrinterSettings       settings       = settingManager.getPrinterSettings();

        boolean isDeviceSelected     = false;
        int     modelIndex           = ModelCapability.NONE;
        String  modelName            = "";
        boolean isBluetoothInterface = false;
        boolean isUsbInterface       = false;

        if (settings != null) {
            isDeviceSelected     = true;
            modelIndex           = settings.getModelIndex();
            modelName            = settings.getModelName();
            isBluetoothInterface = settings.getPortName().toUpperCase().startsWith("BT:");
            isUsbInterface       = settings.getPortName().toUpperCase().startsWith("USB:");
        }

        addTitle("Destination Device");
        addPrinterInfo(settingManager.getPrinterSettingsList());

        addTitle("Printer");
        addMenu("Sample",                     isDeviceSelected);
        addMenu("Black Mark Sample",          isDeviceSelected && ModelCapability.canUseBlackMark(modelIndex));
        addMenu("Black Mark Sample (Paste)",  isDeviceSelected && ModelCapability.canUseBlackMark(modelIndex));
        addMenu("Page Mode Sample",           isDeviceSelected && ModelCapability.canUsePageMode(modelIndex));
        addMenu("Print Re-Direction Sample",  isDeviceSelected);

        addTitle("Cash Drawer");
        addMenu("Sample",                     isDeviceSelected && ModelCapability.canUseCashDrawer(modelIndex));

        addTitle("Barcode Reader");
        addMenu("StarIoExtManager Sample",    isDeviceSelected && ModelCapability.canUseBarcodeReader(modelIndex));

        addTitle("Display");
        addMenu("Sample",                     isDeviceSelected && ModelCapability.canUseCustomerDisplay(modelIndex, modelName));

        addTitle("Combination");
        addMenu("StarIoExtManager Sample",    isDeviceSelected && ModelCapability.canUseBarcodeReader(modelIndex));

        addTitle("API");
        addMenu("Sample",                     isDeviceSelected);

        addTitle("Star Micronics Cloud");
        addMenu("Sample",                     isDeviceSelected && ModelCapability.canUseAllReceipt(modelIndex));

        addTitle("Device Status");
        addMenu("Sample",                     isDeviceSelected);
        addMenu("Product Serial Number",      isDeviceSelected && ModelCapability.canGetProductSerialNumber(modelIndex, modelName, isBluetoothInterface));

        addTitle("Interface");
        addMenu("Bluetooth Setting",          isDeviceSelected && isBluetoothInterface);
        addMenu("USB Serial Number",          isDeviceSelected && ModelCapability.settableUsbSerialNumberLength(modelIndex, modelName, isUsbInterface) != 0);

        addTitle("Appendix");
        addMenu("Library Version");
    }

    private void addPrinterInfo(List<PrinterSettings> settingsList) {
        if (settingsList.size() == 0) {
            List<TextInfo> mainTextList = new ArrayList<>();

            mainTextList.add(new TextInfo("Unselected State", R.id.menuTextView, R.anim.blink, Color.RED));

            adapter.add(new ItemList(R.layout.list_main_row, mainTextList, ContextCompat.getColor(getActivity(), R.color.lightskyblue), true));
        }
        else {
            List<TextInfo> textList = new ArrayList<>();

            // Get a port name, MAC address and model name of the destination printer.
            String portName   = settingsList.get(0).getPortName();
            String macAddress = settingsList.get(0).getMacAddress();
            String modelName  = settingsList.get(0).getModelName();

            if (portName.startsWith(PrinterSettingConstant.IF_TYPE_ETHERNET) ||
                portName.startsWith(PrinterSettingConstant.IF_TYPE_BLUETOOTH)) {
                textList.add(new TextInfo(modelName, R.id.deviceTextView));
                if (macAddress.isEmpty()) {
                    textList.add(new TextInfo(portName,                           R.id.deviceDetailTextView));
                }
                else {
                    textList.add(new TextInfo(portName + " (" + macAddress + ")", R.id.deviceDetailTextView));
                }
            }
            else {  // USB interface
                textList.add(new TextInfo(modelName, R.id.deviceTextView));
                textList.add(new TextInfo(portName,  R.id.deviceDetailTextView));
            }

            adapter.add(new ItemList(R.layout.list_destination_device_row, textList, ContextCompat.getColor(getActivity(), R.color.lightskyblue), true));
        }
    }
}
