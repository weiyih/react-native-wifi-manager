
# react-native-wifi-manager

This is a WIP to create a native WiFi Manager wrapper.

## Getting started

`$ npm install react-native-wifi-manager --save`

### Mostly automatic installation

`$ react-native link react-native-wifi-manager`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-wifi-manager` and add `RNWifiManager.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNWifiManager.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.weiyih.react-native-wifi-manager.RNWifiManagerPackage;` to the imports at the top of the file
  - Add `new RNWifiManagerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-wifi-manager'
  	project(':react-native-wifi-manager').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-wifi-manager/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-wifi-manager')
  	```

## Usage
```javascript
import RNWifiManager from 'react-native-wifi-manager';

// TODO: What to do with the module?
RNWifiManager;
```
  