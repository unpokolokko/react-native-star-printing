using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace React.Native.Star.Printing.RNReactNativeStarPrinting
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNReactNativeStarPrintingModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNReactNativeStarPrintingModule"/>.
        /// </summary>
        internal RNReactNativeStarPrintingModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNReactNativeStarPrinting";
            }
        }
    }
}
