# react-native-star-printing
An EasyStore react-native library to merge StarIO Android and IOS sdk for react native app. 


# react-native-star-printing

## General Steps for Both Platforms
1. Copy the  library folder to AppDirectory/node_modules folder. (Example : MyApp/node_modules.
2. Open terminal and run following command in your project root path

`$ react-native link react-native-star-printing`


### Manual installation


#### iOS

1. Go to Target settings > `General` tab, make sure `libRNReactNativeStarPrinting.a` is in `Linked Frameworks and Libraries` section
2. Go to `Frameworks`  > check for if all frameworks has been included. 

    i.  `Foundation.framework`
    ii. `CoreImage.framework`
    iii. `CoreBluetooth.framework`
    iv.`QuartzCore.framework`
    v. `ExternalAccessory.framework`
    vi. `UIKit.frameworkCoreGraphics.framework`
    vii. `StarIO.framework`
   viii. `SMCloudServices.framework`
    ix. `StarIO_Extension.framework`
    
3. If not present, then you can right-click on `Frameworks` > Add Files to “Your-Project-Name” > Add `StarIO.framework` , `SMCloudServices.framework` , `StarIO_Extension.framework`. For adding other frameworks, go to `Project Settings` > target `Build Phases` > `Link Binary with Libraries` > click ‘+’ and add these frameworks : `Foundation.framework` , `CoreImage.framework` , `CoreBluetooth.framework`, `QuartzCore.framework` , `ExternalAccessory.framework` , `UIKit.frameworkCoreGraphics.framework`
    
4. Navigate to `AppProject/node_modules/react-native-star-printing/node_modules` and delete `react-native` folder

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNReactNativeStarPrintingPackage;` to the imports at the top of the file
  - Add `new RNReactNativeStarPrintingPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-star-printing'
  	project(':react-native-star-printing').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-star-printing/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-star-printing')
  	```

## Usage
```javascript

var StarPrint = require("react-native-star-printing");

// TODO: What to do with the module?
RNReactNativeStarPrinting;

Let receiptDetails = “file:////something.png” 

StarPrint.print(receiptDetails).then(function(result) {
        console.log(result);
});
```
  
