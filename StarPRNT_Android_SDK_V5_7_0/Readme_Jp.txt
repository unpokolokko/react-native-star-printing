************************************************************
      StarPRNT SDK Ver 5.7.0
         Readme_Jp.txt                  スター精密（株）
************************************************************

 1. 概要
 2. Ver 5.7.0 についての変更点
 3. 内容
 4. 適用
 5. 制限事項
 6. 著作権
 7. 変更履歴

==========
 1. 概要
==========

  本パッケージは、StarPRNT SDK Ver 5.7.0 です。
  StarIO/starioextension/smcloudservicesは、Starプリンタを使用するアプリケーションの開発を
  容易にするためのライブラリです。

  本ソフトウェアは現在、Android 4.3 - Android 8.1に対応しています。

  詳細な説明は、SDKドキュメントファイルを参照ください。


=============================
 2. Ver 5.7.0 についての変更点
=============================

  [StarIO]
   - バグ修正
      * SM-T300、SM-T300i、SM-T400iのESC/POS Mobileエミュレーションでブラックマーク有効時、
        ブラックマークを検出するとプリンタオフラインと判定されてしまうことがある問題を修正
  
  [StarIOExtension]
   - 以下APIのサポート終了
      * StarIoExt.createScaleCommandBuilderメソッド
      * StarIoExt.createScaleConnectParserメソッド 
      * StarIoExt.createScaleWeightParserメソッド
      * ScaleModel列挙型
      * IScaleCommandBuilderインターフェイス
      * IPeripheralCommandParser.createReceiveCommandsメソッド
      * IScaleWeightParserインターフェイス
   
  [SMCloudServices]
   - 機能追加
      * CloudServices.showRegistrationView メソッド
        SCSダッシュボードのパスワードを変更した場合に、ローカルのパスワードを更新出来るようにしました。

  [SDK]
   - サンプルコードの追加
      * 迂回印刷の実装例


==========
 3. 内容
==========

  StarPRNT_Android_SDK_V5_7_0
  |- Readme_En.txt                          // リリースノート (英語)
  |- Readme_Jp.txt                          // リリースノート (日本語)
  |- SoftwareLicenseAgreement.pdf           // ソフトウエア使用許諾書 (英語)
  |- SoftwareLicenseAgreement_Jp.pdf        // ソフトウエア使用許諾書 (日本語)
  |- SoftwareLicenseAgreementAppendix.pdf   // ソフトウエア使用許諾書付録 (英語)
  |
  +- Documents
  |  |- StarPRNT_Android_SDK_En.pdf         // StarPRNT SDKドキュメント (英語)
  |  |- StarPRNT_Android_SDK_Jp.pdf         // StarPRNT SDKドキュメント (日本語)
  |  |- CommandEmulator_on_SMCS.pdf         // SMCSコマンドエミュレータのコマンド対応リスト (英語)
  |  +- CommandEmulator_on_SMCS_Jp.pdf      // SMCSコマンドエミュレータのコマンド対応リスト (日本語)
  |
  +- Software
     |- SDK                                 // サンプルプログラム (Ver 5.7.0)
     +- Distributables
        |- StarIOPort3.1.jar                // StarIOPort3.1.jar (Ver 2.3.1)
        |- starioextension.jar              // starioextension.jar (Ver 1.9.0)
        +- smcloudservices.aar              // smcloudservices.aar (Ver 1.4.0)


==========
 4. 適用
==========

  対応プリンタについてはStarPRNT SDKドキュメントを参照ください。

  対応エミュレーションについては以下になります。
     - StarPRNT
     - Star Line Mode
     - Star Graphic Mode
     - ESC/POS
     - ESC/POS Mobile
     - Star Dot Impact

       コマンドの詳細は各コマンド仕様書を参照ください。
       各マニュアルはスター精密のウェブサイトで入手可能です。


===============
 5. 制限事項
===============

  1. Android5.0でUSBプリンタを接続した場合、最後に接続した1台としか通信できません。

  2. SM-L200では、BluetoothセキュリティをPinCode有効でお使いください。

  3. Bluetooth I/Fでご利用の場合、メモリスイッチの"ASB機能"は、デフォルト設定(無効)のままご利用ください。
     (バンク7/ビットC)
  
  4. 弊社での動作確認の中で、Android Nを搭載したNexus9にUSBデバイス（弊社USBプリンタを含む）を接続した時、
     まれにAndroid OSがハングアップする現象が確認されています。
     この場合、OS再起動により復帰することが出来ます。

  5. Android端末によってはBluetoothインターフェイスで大量のデータ(※)を送信する場合、印刷が遅くなったり、
     間欠印字が発生したりすることがあります。
     その際にはデータを分割し、送信間隔をあけることで改善される場合があります。
     ※例えば、appendBitmapメソッドで生成されたデータ


===========
 6. 著作権
===========

  スター精密（株）Copyright 2016-2018


=============
 7. 変更履歴
=============

  Ver 5.7.0
   2018/06/29 : [StarIO]
                  - バグ修正
                    * SM-T300、SM-T300i、SM-T400iのESC/POS Mobileエミュレーションでブラックマーク有効時、
                      ブラックマークを検出するとプリンタオフラインと判定されてしまうことがある問題を修正
  
                [StarIOExtension]
                  - 以下APIのサポート終了
                    * StarIoExt.createScaleCommandBuilderメソッド
                    * StarIoExt.createScaleConnectParserメソッド 
                    * StarIoExt.createScaleWeightParserメソッド
                    * ScaleModel列挙型
                    * IScaleCommandBuilderインターフェイス
                    * IPeripheralCommandParser.createReceiveCommandsメソッド
                    * IScaleWeightParserインターフェイス
   
                [SMCloudServices]
                  - 機能追加
                    * CloudServices.showRegistrationView メソッド
                      SCSダッシュボードのパスワードを変更した場合に、ローカルのパスワードを更新出来るようにしました。

                [SDK]
                  - サンプルコードの追加
                    * 迂回印刷の実装例

  Ver 5.6.0
   2018/05/21 : [StarIO]
                  - 機能追加
                    * mC-Print2, mC-Print3に対応
                    * getPortメソッドのportSettingsパラメータに指定できるオプションを追加
                    * StarPrinterStatusクラスにconnectedInterfaceフィールドを追加
  
                [starioextension]
                  - 機能追加
                    * トップマージンを設定するメソッドを追加
                    * 印字領域を設定するメソッドを追加
                    * appendSoundメソッドに駆動時間、ディレイ時間を設定するパラメータを追加
                  - バグ修正
                    * IScaleWeightParserインターフェイスのparseメソッドが適切な結果を返さない場合がある問題を修正
  
                [SDK]
                  - サンプルコードの追加
                    * USBシリアルナンバーを設定・初期化するサンプルコードの追加
                  - オープンソースライセンス項目を追加

  Ver 5.5.0
   2018/01/31 : [StarIO]
                  - getFirmwareInformationメソッドでTSP100IIILAN/TSP100IIIW/TSP100IIIUのファームウェアバージョンを
                    取得できるよう変更
                  - starioextensionライブラリでステータス監視中に、LANインターフェイスのプリンタ電源オフ後、タイムアウト
                    時間内にプリンタが復帰すると、印字できなくなる場合がある問題を修正

                [starioextension]
                  - 水平タブを設定・クリアするメソッドを追加

                [SDK]
                  - サンプルコードの追加
                    * UTF-8におけるCJK統合漢字 印字サンプルの実装例
                      (TSP650II JP2/TWモデル ファームウェアバージョン4.0以降のみ対応)

  Ver 5.4.1
   2017/09/21 : [starioextension]
                  - ESC/POSエミュレーションにて、Bitmapの印刷時に余分な空白が含まれてしまう問題を修正

  Ver 5.4.0
   2017/09/06 : [Support OS]
                  - 最低サポートOSバージョンを4.3に変更

                [StarIO]
                  - BluetoothインターフェイスでまれにbeginCheckedBlockメソッドが失敗することがある問題を修正

                [starioextension]
                  - 機能追加
                    * スケール、カスタマーディスプレイを制御するためのAPIを追加
                    * SM-Lシリーズ用のグラフィックデータ圧縮コマンドを生成する機能を追加
                  - バグ修正
                    * onAccessoryDisconnectメソッドが呼ばれたタイミングでdisconnectメソッドを実行すると、
                      正しくプリンタと切断できない場合がある問題を修正
                    * PortNameを"BT:"で指定した場合、プリンタ切断時にonAccessoryDisconnectメソッドが呼ばれない問題を修正
                    * connectメソッドのコールバックが正しく呼ばれない場合がある問題を修正

                [SDK]
                  - Bluetooth設定、ファームウェアバージョン取得、
                    シリアルナンバー取得、ライブラリバージョン取得機能を利用する実装例を追加
                  - アプリケーションIDをcom.starmicronics.starprntsdkからcom.StarMicronics.StarIOSDKに変更
                    既にVer 5.3.0をインストールしている場合、Ver 5.4.0は別のアプリとしてインストールされます
                  - AndroidManifest.xmlにBLUETOOTH_ADMIN権限を追加
                    一部Android端末でプリンタとのBluetooth通信時にBLUETOOTH_ADMIN権限が要求されることがあるため

  Ver 5.3.0
   2017/04/17 : [StarIO]
                  - TSP100IIIU, SM-L300に対応
                  - LANインターフェースのプリンタとの接続性を向上

                [starioextension]
                  - ブラックマーク、ページモードコマンドを生成するメソッドを追加

                [SDK]
                  - ブラックマーク、ページモード機能を利用する実装例を追加

  Ver 5.2.0
   2017/03/08 : [StarIO]
                  - 機能改善
                    * SM-L200のBluetooth Mac Address拡張対応。
                    * ESC/POS Mobileにて、プリンタとの接続性を向上。

                [smcloudservices]
                  - バグ修正
                    * uploadBitmap機能/updateStatus機能が正しく動作しない不具合を修正。
                  - バージョンアップ
                    * MicroReceipts機能を追加
                      MicroReceipts機能は印刷用紙の削減を提供します。

                [SDK]
                  - サンプルコードの追加
                    * mPOPで使用可能なUSB周辺機器対応（2次元バーコードリーダ、はかり）の実装例

  Ver 5.1.0
   2016/11/18 : [StarIO]
                  - Android 7.0対応
                  - 制限事項の修正
                    * BSC10 LANインターフェースでgetFirmwareInformationメソッドをサポート

                [smcloudservices]
                  - バージョンアップ
                    * AllReceiptsクラスにuploadDataメソッドを追加
                      uploadDataメソッドで送信したデータはSMCSコマンドエミュレータによりデジタルレシート画像にレンダリングされます。
                      SMCSコマンドエミュレータで使用可能なコマンドはCommandEmulator_on_SMCS_Jp.pdfを参照ください。
                  - バグ修正
                    * 接続中でないUSBデバイスが切断された場合にもonAccessoryDisconnectメソッドが呼ばれる問題を修正

                [SDK]
                  - サンプルコードの追加
                    * StarPRNT/StarLine/ESCPOSにおけるAllReceipts対応の実装例
                  - AllReceiptsコマンドエミュレータのコマンド対応リストを追加

  Ver 5.0.1
   2016/08/11 : 新規発行
