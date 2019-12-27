************************************************************
      StarIO for iOS SDK Ver 3.17.3
         Readme_Jp.txt                  スター精密（株）
************************************************************

 1. 概要
 2. ver 3.17.3 についての変更点
 3. 内容
 4. 適用
 5. 制約事項
 6. 著作権
 7. 変更履歴

==========
 1. 概要
==========

  本パッケージ"StarIO_iOS_SDK_V3_17_3_20180206.zip"は、iOS用のStarIO
  およびそのSDKです。
  StarIOは、Starプリンタを使用するアプリケーションの開発を容易にする
  ためのライブラリです。

  本パッケージにはStarIO.framework バージョン2.3.3 が含まれています。
  対応OSは、iOS 7.0 - 11.2.5 です。

  詳細は別紙ドキュメントファイルを参照ください。


================================
 2. Ver 3.17.3 についての変更点
================================

  [StarIO]
   - getFirmwareInformationメソッドでTSP100IIILAN/TSP100IIIWのファームウェアバージョンを
     取得できるよう変更
   - TSP100IIIUとTSP100IIIBIを同時にiOS端末に接続すると、TSP100IIIBIに印刷を実行した際に
     TSP100IIIUから印刷されてしまう事がある問題を修正


==========
 3. 内容
==========

  StarIO_iOS_SDK_V3_17_3_20180206
  |
  | Readme_En.txt                       // リリースノート(英語)
  | Readme_Jp.txt                       // リリースノート(日本語)
  | SoftwareLicenseAgreement.pdf        // ソフトウエア使用許諾書(英語)
  | SoftwareLicenseAgreement_jp.pdf     // ソフトウエア使用許諾書(日本語)
  |
  +- Documents
  |  +- StarIO_ESCPOS_PortablePrinter_iOS_SDK.pdf     // 説明資料(英語版:   モバイルプリンタ用 [ESC/POS Mode])
  |     StarIO_ESCPOS_PortablePrinter_iOS_SDK_Jp.pdf  // 説明資料(日本語版: モバイルプリンタ用 [ESC/POS Mode])
  |     StarIO_POSPrinter_iOS_SDK.pdf                 // 説明資料(英語版:   POSプリンタ用)
  |     StarIO_POSPrinter_iOS_SDK_Jp.pdf              // 説明資料(日本語版: POSプリンタ用)
  |     StarIO_StarPRNT_iOS_SDK.pdf                   // 説明資料(英語版:   モバイルプリンタ用 [StarPRNT Mode])
  |     StarIO_StarPRNT_iOS_SDK_Jp.pdf                // 説明資料(日本語版: モバイルプリンタ用 [StarPRNT Mode])
  |     StarIO_DK-AirCash_iOS_SDK.pdf                 // 説明資料(英語版:   DK-AirCash用)
  |     StarIO_DK-AirCash_iOS_SDK_Jp.pdf              // 説明資料(日本語版: DK-AirCash用)
  |     StarIO_ProxiPRNT_iOS_SDK.pdf                  // 説明資料(英語版: ProxiPRNT用)
  |     ProxiPRNT_UsersGuide_en.pdf                   // ProxiPRNT用ユーザーガイド (英語版: ProxiPRNT用)
  |     StarMicronics_POSPrinters_Mac_Ethernet.pdf    // 説明資料(英語版: POSプリンタ用)
  |
  +- Software
     +- Distributables
     |  +- StarIO.framework                 // iOS用StarIO フレームワーク (Ver 2.3.3)
     |     StarIO_Extension.framework       // iOS用StarIO_Extension フレームワーク (Ver 1.8.0)
     |     SMCloudServices.framework        // iOS用SMCloudServices フレームワーク (Ver 1.4.4)
     |
     +- Samples
        +- IOS_SDK                          // iOS用サンプルプログラム
           IOS_SDK.xcodeproj                // iOS用サンプルプログラム プロジェクトファイル (Ver 3.17.3)
           StarIO.framework                 // iOS用StarIO フレームワーク (Ver 2.3.3)
           StarIO_Extension.framework       // iOS用StarIO_Extension フレームワーク (Ver 1.8.0)
           SMCloudServices.framework        // iOS用SMCloudServices フレームワーク (Ver 1.4.4)


=============
 4. 適用
=============
  ■ 対象OS
   iOS 7.0 - 11.2.5

  ■ 対象プリンタモデル
   ◇ プリンタモデル (F/W ver)
       SM-S210I            (Ver 1.0以上)
       SM-S220I            (Ver 2.0以上)
       SM-S230I            (Ver 1.0以上)
       SM-T300             (Ver 1.1以上)
       SM-T300I            (Ver 2.4以上)
       SM-T400I            (Ver 2.4以上)
       SM-L200             (Ver 1.0以上)
       SM-L300             (Ver 1.0以上)
       TSP100U *           (Ver 1.3以上)
       TSP100GT *          (Ver 1.0以上)
       TSP100ECO *         (Ver 1.0以上)
       TSP100LAN           (Ver 2.0以上)
       TSP100IIIBI         (Ver 1.0以上)
       TSP100IIILAN        (Ver 1.0以上)
       TSP100IIIW          (Ver 1.0以上)
       TSP100IIIU          (Ver 1.0以上)
       FVP10               (Ver 1.2以上)
       TSP650              (Ver 3.0以上)
       TSP650II            (Ver 1.0以上)
       TSP700II            (LAN : Ver 3.0以上,  Bluetooth : Ver 4.0以上)
       TSP800II            (LAN : Ver 1.2以上,  Bluetooth : Ver 2.0以上)
       SP700               (LAN : Ver 3.0以上,  Bluetooth : Ver 4.0以上)
       POP10(mPOP)         (Ver 1.0以上)

       * Apple AirMac Expressが必要です。

   ◇ DK-AirCash (F/W ver)
       SAC10               (有線LAN : Ver 2.0以上, Bluetooth : Ver 1.0以上, 無線LAN: Ver 3.0以上)

   ◇ 対応インターフェース
       LAN:       IFBD-HE07/HE08/BE07 (Ver 2.0.0以上）
       Bluetooth: IFBD-HB03/HB04      (Ver 1.0.0以上)

   ◇ 対応エミュレーション
      - Star Line Mode
      - Raster Graphics Mode
      - ESC/POS Mode

     * お客様が作成するアプリケーションが生成する印刷イメージが
       グラフィックデータだけで構成される場合には、Raster Graphics Modeの
       利用をお勧めします。

       また、お客様が作成するアプリケーションが生成する印刷イメージが
       プリンタ内蔵フォント(デバイスフォント)を利用される場合には
       Star Line Modeをご利用ください。

       ただし、プリンタモデルによっては、サポートできるエミュレーションが異なるため
       詳細は下記のリストをご参照ください。


    [Star Line Mode 対応モデルー覧]
     - FVP10
     - TSP650
     - TSP650II
     - TSP700II
     - TSP800II
     - TUP500

       対応しているコマンドの詳細は「STAR Line Mode コマンド仕様書」を参照ください。
       このマニュアルは、スター精密のウェブサイトで入手可能です。

     - SP700

       対応しているコマンドの詳細は「STAR コマンド仕様書」を参照ください。
       このマニュアルは、スター精密のウェブサイトで入手可能です。

     - SM-S210i (F/W 3.0以降)
     - SM-S220i (F/W 3.0以降)
     - SM-S230i
     - SM-T300i (F/W 3.0以降)
     - SM-T400i (F/W 3.0以降)
     - SM-L200
     - SM-L300
     - POP10(mPOP)

       対応しているコマンドの詳細は「StarPRNTコマンド仕様書」を参照ください。
       このマニュアルは、スター精密のウェブサイトで入手可能です。

    [Raster Graphics Mode 対応モデル一覧]
     - TSP100LAN
     - FVP10 
     - TSP650 
     - TSP650II 
     - TSP700II 
     - TSP800II 
     - TSP100U (*2)
     - TSP100GT (*2)
     - TSP100ECO (*2)
     - TSP100IIIBI
     - TSP100IIILAN
     - TSP100IIIW
     - TSP100IIIU
     - SM-S210i (F/W 3.0以降)
     - SM-S220i (F/W 3.0以降)
     - SM-S230i
     - SM-T300i (F/W 3.0以降)
     - SM-T400i (F/W 3.0以降)
     - SM-L200
     - SM-L300

       (*2) Apple AirMac Expressが必要です。

       コマンドの詳細は「STAR Line Mode コマンド仕様書」内の、
       「3.4） ラスターグラフィックス コマンド詳細」を参照ください。
       このマニュアルは、スター精密のウェブサイトで入手可能です。

     - SM-S210i (F/W 3.0以降)
     - SM-S220i (F/W 3.0以降)
     - SM-S230i
     - SM-T300i (F/W 3.0以降)
     - SM-T400i (F/W 3.0以降)
     - SM-L200
     - SM-L300

       コマンドの詳細は「StarPRNT Mode コマンド仕様書」内の
       「2.3.8 Bit Image Graphics」をご参照ください。
       このマニュアルは、スター精密のウェブサイトで入手可能です。


    [ESC/POS Mode 対応モデル一覧]
     - SM-T300
     - SM-S210I
     - SM-S220I
     - SM-S230I
     - SM-T300I
     - SM-T400I

      コマンドの詳細は「Starコマンド仕様書（モバイルプリンター）」の
      「1. コマンド一覧表」を参照ください。
      このマニュアルは、スター精密のウェブサイトで入手可能です。

    [DK-AirCash 対応モデル一覧]
     - SAC10/SAC10 Wireless LAN

       対応しているコマンドの詳細は「製品仕様書」を参照ください。
       このマニュアルは、スター精密のウェブサイトで入手可能です。


=============
 5. 制約事項
=============

  1. SAC10 F/W Ver 1.0との組み合わせ利用についての制約

     SAC10を下記条件のもとご使用になる場合、F/W 2.0以上が必須となります。
     StarIOをご使用になる前に、SAC10のF/Wバージョンをご確認ください。
       - LANインターフェースにてご使用になる場合
       - getDipSwitchInformationメソッドをご使用になる場合

     F/Wバージョンは"Star Setting Utility"を使用して確認する事ができます。
     Star Setting Utilityは、App Storeから入手可能です。

     Star Setting Utilityは、起動後にLAN上のSAC10を自動的に検出し、リストアップ
     します。
     リストアップされたSAC10をタップすると、WebブラウザにSAC10の設定画面が
     表示されます。設定画面上の[Display Status] - [Firmware Info.]をタップすると
     "Main F/W:"欄にF/Wのバージョンが表示されます。

     Telnetを使用して確認する場合は、"SAC10シリーズ 製品仕様書"をご参照ください。

  2. Bluetooth Low Energyモデルは、プリンターとの接続に時間がかかることがあります。
     詳しくはPDFマニュアルのgetPort API項を参照ください。

  3. Bluetoothでご利用の場合、メモリスイッチの"ASB機能"は、デフォルト設定(無効)のまま
     ご利用ください。(バンク7/ビットC)

  4. iOS 10.0 - 10.2.1 および iOS 11.0 - 11.2.2において、getPort、begin/endCheckedBlockでエラーが発生し、
     その後searchPrinter APIで発見できなくなる事があります。
     iOS設定画面を見ると、『接続済み』と表示されますが、「一般」-「情報」に当該デバイス情報が
     表示されなくなります。

     [復帰方法]
     一旦プリンタ電源を切るか、iOS設定画面機能を使い、Bluetoothコネクションを切断し
     再接続します。

  5. 下記モデルにおいて、“writePort”を使用して大量のデータをプリンタに送信した後、データを送りきる前に
     ”releasePort”が実行されますと、アプリからプリンタを認識できず使用不能となる現象が確認されています。

     - SM-S210i (ファームウェア 3.1以降)
     - SM-S230i (ファームウェア 1.3)
     - SM-T300i (ファームウェア 3.1以降)
     - SM-T400i (ファームウェア 3.1以降)

     また、以下のモデルにおいて同様の処理が実行されますと、Bluetooth接続が切断される事があります。

     - mPOP

     (本現象はApple社へ報告済みです)

     StarIO SDKの場合、PrinterFunctionsクラス、MiniPrinterFunctionsクラス内のsendCommandsメソッドで
     データを送りきるまでwritePortをループしていますが、指定時間内(*1)にデータを送りきれなかった場合は
     releasePortするようになっており、上記の現象が発生する事があります。
 
     本現象を防止するため、アプリで同様の処理を行う場合は、印刷データを送りきるのに十分な長さの時間を
     指定するようにしてください。
 
     (*1) sample source codeの”sendCommand”メソッド内では、”endTime.tv_sec”で指定されています。

     なお、プリンタが使用不能な状態になった場合は"設定"の"Bluetooth"画面にてプリンタとの接続を一旦切断し
     再度接続することで再び使用可能となります。
     Bluetooth接続が切断された場合は、Auto Connection機能が有効であれば自動的に再接続されます。
     Auto Connectionが無効の場合はiOSの"設定"画面から手動で再接続を行ってください。

  6. 本SDKではiOS 11 にて稀にBluetoothプリンタと通信できなくなる現象を回避するため、getPort後に
     スリープを行っています。
     弊社の評価では、0.2秒のスリープを行うことで本現象が発生しないことを確認できましたが
     実際にお客様のアプリケーションで使用する際は十分に動作確認を行い、必要に応じて
     スリープ時間を適宜変更してください。

  7. 本パッケージ内のライブラリは、Xcode 9.2にてビルドされています。
     アプリや他社ライブラリが異なるXcodeを用いてビルドされていた場合、Bitcodeのバージョンの違いにより、
     アプリのArchiveに失敗する事があります。

     このような場合、使用しているXcodeのバージョンを確認し、バージョンを揃えるか
     プロジェクト設定の"Build Settings" - "Build Options" - "Enable Bitcode"から
     Bitcode機能を無効にしてください。


===========
 6. 著作権
===========

  スター精密（株）Copyright 2018


=============
 7. 更新履歴
=============

  Ver 3.17.3
   2018/02/06 : [StarIO]
                  - getFirmwareInformationメソッドでTSP100IIILAN/TSP100IIIWのファームウェアバージョンを
                    取得できるよう変更
                  - TSP100IIIUとTSP100IIIBIを同時にiOS端末に接続すると、TSP100IIIBIに印刷を実行した際に
                    TSP100IIIUから印刷されてしまう事がある問題を修正

  Ver 3.17.2     
   2017/10/31 : [Support OS]
                  - iOS 11をサポート

                [StarIO]
                  - Bluetooth Low EnergyのgetPortメソッドの信頼性を向上
                  - [ESC/POSモード] LANプリンタにて、印刷中にエラーが発生した時にendCheckedBlock APIが
                    例外をスローしてしまう問題を修正。

                [StarIO_Extension.framework]
                  - iOS 11
                    - connectメソッドでプリンタと通信できなくなる事がある問題を修正。

                [SMCloudServices.framework]
                  - iOS 11
                    - クローズボタンが拡大表示されてしまう問題を修正。

                [StarIO SDK]
                  - iOS 11
                    - BluetoothのgetPortメソッドにて、Bluetoothプリンタを認識できなくなる事がある問題を修正。


  Ver 3.17.1
   2017/08/16 :   [StarIO]
                  - SM-T300DWとの通信の信頼性を向上。

  Ver 3.17.0
   2017/03/31 :   [StarIO]
                  - 対応モデル追加（TSP100IIIU, SM-L300）
                  - EthernetにてgetPortメソッドに失敗した時のパフォーマンスを改善

  Ver 3.16.3
   2017/02/08 :   [StarIO]
                  ESC/POSモードのBluetoothモバイルプリンタがSniff Modeに入っていると、通信に失敗する事が
                  ある問題を修正。
                  
  Ver 3.16.2
   2017/01/19 :   [StarIO]
                  - モバイルプリンタ、mPOPに対し、SMBluetoothManagerクラスのapplyメソッドが失敗する事がある
                    問題を修正。
                  - BluetoothプリンタがSniff Modeに入っていると、通信に失敗する事がある問題を修正。
                  - iOS 9にて、getPort直後に実行したAPIに失敗する事がある問題を修正。
                  - iOS 10対応
                      - SM-S210i, SM-S220i, SM-T300i, SM-T400iにて、ラスター印刷後に通信不能になる事がある
                        問題を修正。
                      - SM-L200において、接続に時間がかかる問題を修正。

  Ver 3.16.0
   2016/03/18 :   [SDK]
                  - Star Raster Mode画面にAllReceiptsのサンプルコードを追加。

  Ver 3.15.2
   2016/01/18 :   Bluetooth Low Energy通信における下記の問題の対応。
                  - beginCheckedBlock, releasePortの前にコネクションが切断されると制御が返らなくなる事がある
                    問題。
                  - コネクション切断によりbeginCheckedBlock呼び出しが失敗した際、次回のbeginCheckedBlockが失敗する
                    事がある問題。

  Ver 3.15.1
   2015/12/08 :   - SM-L200 プリンタにてテキストデータとして300行程度の長い印刷を行った際、メモリ使用量が増加して
                    アプリがクラッシュする問題を修正

  Ver 3.15.0
   2015/09/30 :   - POP10(mPOP)対応
                  - BLED10-U(ProxiPRNT専用BLEドングル)対応(*1)
                  - BLEプリンタについて、MACアドレスを指定した接続に対応
                  - iOS 6にてBLEプリンタが正常に動作しない問題を修正
                  - Bitcodeに対応
                  - StarIO.frameworkのファイルサイズ削減

                  [SDK]
                  - POP10(mPOP)追加
                  - ProxiPRNTボタン追加(*1)
                  - iOS 9で発生する以下の問題を修正
                    - Star Raster ModeのSample Receipt(Japanese)を選択するとクラッシュする問題を修正
                    - Raster Graphics Text Printing画面の特定のフォントを選択するとクラッシュする問題を修正

                  [マニュアル]
                  - StarIO_StarPRNT_iOS_SDK.pdfにmPOPの説明を追加
                  - ProxiPRNT専用のマニュアル(英語)を追加(*1)
                  - マニュアルの名称変更(*2)
                      モバイルプリンタ(ESC/POS)用SDKマニュアル (日本語/英語)
                      モバイルプリンタ(StarPRNT Mode)用SDKマニュアル (日本語/英語)
                      POSプリンタ用SDKマニュアル (日本語/英語)
                      DK-AirCash用SDKマニュアル (日本語/英語)

                 (*1) BLED10-Uは日本国内では販売しておりません
                 (*2) マニュアル名称は3.内容のDocuments項を参照ください。

  Ver 3.14.1
   2015/07/17:  [SDK]
                - UTF-8に対応したプリンタ用のサンプルレシート機能を追加しました(*)
                - UTF-8に対応したプリンタ用のTextFormatting機能を追加しました(*)
               (*)利用できるプリンタファームウェアのバージョンについてはマニュアルをご確認してください。

  Ver 3.14.0
   2015/04/10:  - SM-L200(Bluetooth Low Energy), SM-S230i対応。
                - StarPRNT Mode対応。
                - Bluetooth設定APIをモバイルプリンタに対応。
                - 対応OSをiOS 6.0以降に変更。

                [StarIO]
                  - portSettingsパラメータのフォーマットを変更。

                [SDK]
                  - フランス語、ポルトガル語、スペイン語、ロシア語のサンプルレシートを追加。
                  - 画面表示をiPhone 6/6 plusに最適化。

  Ver 3.13.1
   2015/03/09 : [StarIO]
                  - searchPrinter API(LAN)にて発生していたメモリリークを修正。
                  - searchPrinter API(Bluetooth)にて、実行中に接続されているBluetooth
                    デバイスの電源をオフにするとクラッシュする事がある問題を修正。
                  - SAC10 Wireless LANのgetPort, getDipSwitchInformation APIで発生していた
                    メモリリークを修正。

                [SDK]
                  - (StarBitmapクラス)モバイルプリンタでイメージ印刷を行った際に、下部に
                    余白が入ってしまう問題を修正。
                  - Targetから32bitビルド用設定を削除。

  Ver 3.13.0
   2014/10/23 : SAC10 Wireless LAN 対応追加。
                iPhone 6/6+に対応。

                [StarIO]
                  (POSプリンタ)beginCheckedBlockメソッドの処理速度向上。

                [SDK]
                  (iOS 8 + iPad)一部ウィンドウに余白が入ってしまう問題を修正。

                [マニュアル]
                  - SAC10 Wireless LANモデルの説明をマニュアルへ追加。

  Ver 3.12.0
   2014/09/10 : [StarIO]
                  - StarIOVersionメソッド追加。
                  - getDipSwitchInformationメソッド追加
                    (* SAC10 ファームウェアVer.2.0以降のみ対応)
                  - Bluetooth POSプリンタの印刷速度を改善。

                [SDK]
                  - ドットインパクトプリンタ(SP700)印刷サンプルを追加。
                  - "Sample Receipt", "Text Formatting"を繁体字中国語、簡体字中国語に対応。
                    (* モバイルプリンタは繁体字中国語のみ)                 
                  - "Get Cash Drawer Dip Switch Information"追加。
                    (* SAC10のみ対応)
                  - イメージファイルの印刷をサンプルコードを追加しました。

                [マニュアル]
                 - 上記追加機能についての説明をマニュアルへ追加

  Ver 3.10.3
   2014/07/23 : [StarIO]
                  - Bluetooth通信にて、releasePort実行前に再度getPortを実行した状況において、
                    再接続に関する問題を修正。

                  - Bluetooth接続が切断された直後に正しく印刷できない問題に対応するための
                    データタイムアウト機能(*3)について、タイムアウト時間指定の機能を追加。

                    (*3) データタイムアウト機能は以下のモデルにて対応
                          - TSP650II F/W 2.0以降
                          - TSP700II F/W 5.0以降
                          - TSP800II F/W 2.0以降

                  - beginCheckedBlockでBluetooth切断を検知し例外スローする機能を追加。

                  - getPortで10秒未満のタイムアウトを指定された場合、10秒に設定し直すよう変更。

                [マニュアル]
                  - データタイムアウト機能に関する記述を追加。

  Ver 3.10.2
   2014/06/24 : [StarIO]
                  - POSプリンタ(LAN)通信にて、beginCheckedBlockが誤ったステータスを
                    返す事がある問題を修正。

                [SDK]
                  - POSプリンタのラスター印刷において、データ圧縮が
                    機能せず、印刷に時間がかかる問題を修正。

  Ver 3.10.1
   2014/04/28 : [StarIO]
                  - iOS 7.1でのBluetooth通信に対応。
                  - モデル名/ファームウェア取得APIを追加。(getFirmwareInformationメソッド)
                  - SM-T300WLAN  F/W 2.3以前でbegin/endCheckedBlockが使用できる
                    ように変更。
                  - Ver 3.9.0において発生していた、AirMac経由でUSBプリンタを
                    使用した際、印刷ができない問題を修正。
                    
                [マニュアル]
                  - 上記追加機能についての説明をマニュアルへ追加

 Ver 3.9.0
  2013/12/05 : [StarIO]
               - iPhone 5s, iPad Air, iPad mini Retina Displayモデルのarm64 
                 CPUに対応。それに伴い、対応iOSバージョンをiOS5.1.1以上に
                 変更。
               - Bluetooth設定変更API追加。(SMBluetoothManagerクラス)
               - generateBitImageCommandメソッドをcompressRasterDataに名称変更。
               - searchPrinterメソッドの信頼性向上。
               - endCheckedBlockTimeoutMillisプロパティ追加。
               - モバイルプリンタにて、getParsedStatusから返されるステータス
                 構造体のうち、headThermistorErrorおよびslipTOFメンバが
                 不定値になる問題を修正。

               [SDK]
               - "Open Cash Drawer 2"追加。

               [マニュアル]
               - 上記追加機能についての説明をマニュアルへ追加。
               - 誤記訂正。

 Ver 3.8.0
  2013/09/20 : iOS7対応。
               バグ修正: POSプリンタ(Bluetooth, LAN)でデータ送信中に電源オフ
                         もしくはオフライン状態になると、アプリケーションが
                         操作不能になる事がある問題を修正。
               UIとオンラインヘルプの誤記訂正。
               その他バグ修正。

 Ver 3.7.2
  2013/08/13 : DK-AirCash(SAC10) MFiモデル対応。
               [Bluetoothモバイルプリンタ] endCheckedBlock安定性改善。

 Ver 3.7.1
  2013/07/04 : DK-AirCash(SAC10)対応。
               Bluetoothの切断APIおよびサンプルプログラムを追加。(POSプリンタおよびDK-AirCashのみ)
               getPortのportNameにBluetooth MACアドレスを指定できるよう修正。
               バグ修正:
                  (Bluetoothモバイルプリンター)
                  endCheckedBlock, getParsedStatusが正常に動作しない事がある問題を修正。
               [SDK]
                 DK-AirCash用サンプルコード追加
                 Bluetoothの接続機能を追加。(要iOS6以降)
                 バグ修正:
                    アラート内のボタンを連続でタップした場合にアプリケーションが正常動作しない問題の修正
               [マニュアル]
                 DK-AirCash用マニュアル追加。
                 StarPrinterStatus構造体を追加
                 disconnectメソッドの仕様を追加
                 誤記訂正
 Ver 3.6.0
  2013/05/16 : TSP1000サポート終了
               searchPrinterメソッドでBluetoothとLANを個別に検索できるよう修正
               ビルド時に発生していたwarningを修正
               StarIO.frameworkおよびIOS_SDK内のメモリリークを修正
               [SDK]
                 全印刷処理にbeginCheckedBlock, endCheckedBlockを使用するよう修正
                 "Check Status"にて、ドロワステータスを表示するよう変更
                 "Drawer Open Status"を追加
               [マニュアル]
                 誤記訂正

 Ver 3.4.0
  2013/02/12 : iOS6.1対応
               generateBitImageCommandメソッドを追加
               SM-T300i, SM-T400i 正式サポート
               ページモード切替スイッチをUIに追加。(モバイルプリンタ)
               送信データ量を削減するサンプルコードを追加。(POSプリンタ)

 Ver 3.3.0   
  2013/01/18 : SM-S210I(Bluetooth), TSP650II(LAN/Bluetooth)対応。
               iPad用UIを追加。
               beginCheckedBlock/endCheckedBlockメソッドを追加(全モデル)
               その他バグ修正。

 Ver 3.2.0
  2012/11/07 : SM-S220I(Bluetooth)対応。
               モバイルプリンタの2インチ幅印刷サンプルを追加。
               begin/endCheckedBlockメソッドおよびサンプルプログラム追加。
               connectedプロパティおよびサンプルプログラム追加。
               [バグ修正] 文字コード関係のwarningを解消

 Ver 3.1.0
  2012/10/02 : iPhone5およびiOS6対応
               - StarIOをarmv7, armv7s向けにビルド。
               - サンプルプログラムをXcode4.5用に変更

 Ver 3.0.1
  2012/10/02 : マニュアルに動作環境の記述を追加。

 Ver 3.0.0
  2012/08/31 : [バグ修正] データ送受信中のデータ落ちを修正(TCP/IP)
               AirPort ExpressのUSBプリンタ共有機能対応(USB)
               プリンタ検索API (searchPrinter) を追加。
               SDKのUIをツリー構造に変更。
               SDKにサンプルレシート印刷を追加。

 Ver 2.3.0
  2012/05/30 : [バグ修正] スリープ状態のプリンタにgetPortメソッドを実行すると
               StarIOがクラッシュする問題を修正した。

 Ver 2.2.0
  2012/04/27 : 標準のStarIOクラス名をPortからSMPortに変更。
               サンプルプログラムをRetinaディスプレイに対応。
               ARCに対応したサンプルプログラムを追加。

 Ver 2.1.0
  2012/01/12 : 機能追加 (日本漢字印刷)
               日本語版ドキュメント新規追加

 Ver 2.0.0
  2011/12/09 : Xcode4 対応
               英語版ドキュメント新規追加

 Ver 1.2.1.1
  2011/06/03 : 新規発行
