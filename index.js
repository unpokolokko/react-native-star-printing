
/*

DISCLAIMER

if the codes work, it is created by Nurizzati Rohim 
if it is not, I dunno who wrote it.

WARNING 

Do not touch anything, very fragile
*/

import { NativeModules } from 'react-native';
var StarPrinting = NativeModules.RNReactNativeStarPrinting;
//const { RNReactNativeStarPrinting } = NativeModules;

class RNReactNativeStarPrintingModule {

	print(receiptDetails) {

	    return new Promise(function(resolve, reject) {
	      StarPrinting.printReceipt(receiptDetails, function(result, error) {
	        error != null ? reject(error) : resolve(result);
	      });
	    });

  	}

}

module.exports = new RNReactNativeStarPrintingModule();
//export default RNReactNativeStarPrinting;
