using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Wifi.Manager.RNWifiManager
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNWifiManagerModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNWifiManagerModule"/>.
        /// </summary>
        internal RNWifiManagerModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNWifiManager";
            }
        }
    }
}
