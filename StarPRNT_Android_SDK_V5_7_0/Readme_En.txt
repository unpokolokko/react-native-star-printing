************************************************************
      StarPRNT SDK Ver 5.7.0
         Readme_En.txt             Star Micronics Co., Ltd.
************************************************************

 1. Overview
 2. Ver 5.7.0 Changes
 3. Contents
 4. Scope
 5. Limitation
 6. Copyright
 7. Release History

=============
 1. Overview
=============

  This package contains StarPRNT SDK Ver 5.7.0.
  StarIO/starioextension/smcloudservices is a library for supporting application
  development for Star printers.

  Supported OS  :  Android 4.3 - Android 8.1

  Refer to SDK documents included in this package for details.


======================
 2. Ver 5.7.0 Changes
======================

  [StarIO]
   - Fixed a bug that a printer status might be judged to be offline when black mark is
     detected in case of SM-T300, SM-T300i and SM-T400i in ESC/POS mobile emulation and
     black mark enabled.

  [StarIOExtension]
   - End of support
      * StarIoExt.createScaleCommandBuilder method
      * StarIoExt.createScaleConnectParser method
      * StarIoExt.createScaleWeightParser method
      * ScaleModel enum
      * IScaleCommandBuilder interface
      * IPeripheralCommandParser.createReceiveCommands method
      * IScaleWeightParser interface
   
  [SMCloudServices]
   - Added features
　   * CloudServices.showRegistrationView method
       When the password of SCS dash board is changed, you can update local password too.
  
  [SDK]
   - Added sample codes for Print Re-Direction.


=============
 3. Contents
=============

  StarPRNT_Android_SDK_V5_7_0
  |- Readme_En.txt                          // Release Notes (English)
  |- Readme_Jp.txt                          // Release Notes (Japanese)
  |- SoftwareLicenseAgreement.pdf           // Software License Agreement (English)
  |- SoftwareLicenseAgreement_Jp.pdf        // Software License Agreement (Japanese)
  |- SoftwareLicenseAgreementAppendix.pdf   // Software License Agreement Appendix (English)
  |
  +- Documents
  |  |- StarPRNT_Android_SDK_En.pdf         // StarPRNT SDK Document (English)
  |  |- StarPRNT_Android_SDK_Jp.pdf         // StarPRNT SDK Document (Japanese)
  |  |- CommandEmulator_on_SMCS.pdf         // Supported command list of Command Emulator on SMCS (English)
  |  +- CommandEmulator_on_SMCS_Jp.pdf      // Supported command list of Command Emulator on SMCS (Japanese)
  |
  +- Software
     |- SDK                                 // Samples (Ver 5.7.0)
     +- Distributables
        |- StarIOPort3.1.jar                // StarIOPort3.1.jar (Ver 2.3.1)
        |- starioextension.jar              // starioextension.jar (Ver 1.9.0)
        +- smcloudservices.aar              // smcloudservices.aar (Ver 1.4.0)


==========
 4. Scope
==========

  Please refer to the StarPRNT SDK document about the supported printers.

  Works with these Emulation:
     - StarPRNT Mode
     - Star Line Mode
     - Star Graphic Mode
     - ESC/POS
     - ESC/POS Mobile
     - Star Dot Impact

       Please refer to each command specification for details.
       You can download this manual from Star web site.


===============
 5. Limitation
===============

  1. Only the last connected USB printer can communicate with Android V5.0.

  2. Please use "PIN code enable" in Bluetooth security with SM-L200.

  3. When using printer with Bluetooth Interface, please do not change the memory switch setting of "ASB Status"
     from default value(invalid). (Bank 7/Bit C)

  4. During our test, we have confirmed using Nexus9 with Android 7.0 may rarely cause a hang-up.
     To recover from this phenomenon, restart the OS.

  5. With some Android devices, the transmission of large amounts of data(*) via Bluetooth may cause slow
     printing or intermittent printing.
     The printing can be improved by splitting data and extending the transmission interval.
     (*)e.g., data created by appendBitmap method


==============
 6. Copyright
==============

  Copyright 2016-2018 Star Micronics Co., Ltd. All rights reserved.


====================
 7. Release History
====================

  Ver 5.7.0]
   2018/06/29 : [StarIO]
                  - Fixed a bug that a printer status might be judged to be offline when black mark is
                    detected in case of SM-T300, SM-T300i and SM-T400i in ESC/POS mobile emulation and
                    black mark enabled.

                [StarIOExtension]
                  - End of support
                    * StarIoExt.createScaleCommandBuilder method
                    * StarIoExt.createScaleConnectParser method
                    * StarIoExt.createScaleWeightParser method
                    * ScaleModel enum
                    * IScaleCommandBuilder interface
                    * IPeripheralCommandParser.createReceiveCommands method
                    * IScaleWeightParser interface

                [SMCloudServices]
                  - Added features
　                  * CloudServices.showRegistrationView method
                      When the password of SCS dash board is changed, you can update local password too.

                [SDK]
                  - Added sample codes for Print Re-Direction.

  Ver 5.6.0
   2018/05/21 : [StarIO]
                  - Added features
                    * Added mC-Print2 and mC-Print3.
                    * Added options to portSettings of getPort method.
                    * Added the connectedInterface field to StarPrinterStatus class.

                [starioextension]
                  - Added features
                    * Added method for setting top margin.
                    * Added method for setting printable area.
                    * Added drive time parameter and delay time parameter to the appendSound method.
                  - Fixed Bugs
                    * Fixed a bug that parse method of IScaleWeightParser interface might not return proper result.

                 [SDK]
                  - Added Sample Codes 
                    * Added sample codes for setting or initializing USB serial number.
                  - Added Open Source License item.

  Ver 5.5.0
   2018/01/31 : [StarIO]
                  - Changed to be able to get the firmware version of TSP100IIILAN, TSP100IIIW and TSP100IIIU with the
                    getFirmwareInformation method.
                  - Fixed a bug that printing fails when printer restores within timeout after turning off printer power
                    under monitoring with starioextension library in the LAN interface.

                [starioextension]
                  - Added method for setting or clearing horizontal tab.

                [SDK]
                  - Added Sample Codes.
                    * Implementation of the CJK unified ideographs printing sample under UTF-8.
                      (Supported by TSP650II(JP2/TW) with firmware version 4.0 or later only)

  Ver 5.4.1
   2017/09/21 : [starioextension]
                 - Fixed Bug
                   * The appendBitmap method caused extra margin in ESC/POS emulation.

  Ver 5.4.0
   2017/09/06 : [Support OS]
                 - Supported OS version: 4.3 or later.

                [StarIO]
                 - Fixed a bug that the beginCheckedBlock method sometimes fails in the Bluetooth interface.

                [starioextension]
                 - Added features
                   * Added API for Scale, Display control.
                   * Added graphic data compression function for SM-L series.
                 - Fixed Bugs
                   * Executing the disconnect method when the onAccessoryDisconnect method is called
                     might not correctly disconnect from the printer.
                   * If the PortName is specified with "BT:", the onAccessoryDisconnect method will not
                     be called when disconnecting the printer.
                   * The callback of the connect method might not be correctly called.

                [SDK]
                 - Added sample codes for getting serial number, Firmware version and Library version,
                   and setting Bluetooth.
                 - Changed the Application ID from com.starmicronics.starprntsdk to com.StarMicronics.StarIOSDK.
                   If you have already installed Ver 5.3.0, Ver 5.4.0 will be installed as the other app. 
                 - Added the BLUETOOTH_ADMIN permission to the AndroidManifest.xml because some Android devices
                   sometimes require the BLUETOOTH_ADMIN permission during Bluetooth communication.


  Ver 5.3.0
   2017/04/17 : [StarIO]
                 - Added TSP100IIIU and SM-L300.
                 - Connectivity improve with LAN interface Printer.

                [starioextension]
                 - Added methods that creates Black Mark/Page Mode commands.

                [SDK]
                 - Added sample code for Black Mark/Page Mode function.

  Ver 5.2.0
   2017/03/08 : [StarIO]
                 - Connectivity improvements
                   * Bluetooth Mac Address for SM-L200.
                   * ESC/POS Mobile.

                [smcloudservices]
                 - Fixed Bug.
                   * Debug uploadBitmap/updateStatus method function.

                 - Added the MicroReceipt function.
                     MicroReceipt function will reduce paper.

                [SDK]
                 - Add Sample Code.
                   * 2D barcode reader and scale available with mPOP.

  Ver 5.1.0
   2016/11/18 : [StarIO]
                  - Support Android 7.0.
                  - Supported the getFirmwareInformation method with BSC10 with LAN interface. 

                [starioextension/smcloudservices]
                  - Added uploadData method in AllReceiipts class.
                    * Added the uploadData method to the AllReceipts class.   
                      Data which is transmitted by uploadData method is rendered to digital receipt image by Command Emulator on SMCS.
                      Refer to "CommandEmulator_on_SMCS.pdf" for details.

                  - Fixed Bug.
                    * onAccessoryDisconnect method is called even when disconnecting USB devices other than the printer.

                [SDK]
                  - Add Sample Codes.
                    * Implementation of the AllReceipts support on StarPRNT, StarLine, ESC/POS Mobile and ESC/POS.
                  - Add supported command lists of AllReceipts command emulator.

  Ver.5.0.1
   2016/08/11 : First release.
