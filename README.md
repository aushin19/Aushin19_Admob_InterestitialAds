
# Admob Interestitial Ads

A simple way to integrate interestitial ads on android projects.


## Installation

### Gradle
Make sure that the repositories section includes Jitpack

```bash
  allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
Add the library to the dependencies:

```bash    
implementation 'com.github.aushin19:Aushin19_Admob_InterestitialAds:1.0.0'
```
## Usage

### Intialization

```java
Aushin19InterstitialAds aushin19InterstitialAds = new Aushin19InterstitialAds(MainActivity.this, "ca-app-pub-3940256099942544/1033173712");
```

### Load Ads

```java
aushin19InterstitialAds.loadAd();
```

### Show Ads

```java
aushin19InterstitialAds.showAd();
```

## Manifest
Make sure that you have allow internet permission
```xml
<uses-permission android:name="android.permission.INTERNET"/>
```

Also update your `MANIFEST` file with this changes
```xml
<manifest>
    <application>
        <!-- Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713 -->
        <meta-data
            android:name="com.google.android.gms.ads.APPLICATION_ID"
            android:value="ca-app-pub-xxxxxxxxxxxxxxxx~yyyyyyyyyy"/>
    </application>
</manifest>
```

