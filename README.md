### 1. 리액트 플러그인 설치 (AOS/IOS 공통 설정)

#### 1.1 플러그인 다운로드
터미널에서 아래의 명령어를 통해 리액트 플러그인을 프로젝트에 다운로드 합니다.

```shell
$ npm install --save git+https://github.com/WisetrackerTechteam/Tracker-react-package.git
```

#### 1.2 플러그인 설치 확인

프로젝트에 플러그인이 정상 다운로드되면 다음과 같이 플러그인 파일이 추가된 것을 확인할 수 있습니다.

<img src="http://www.wisetracker.co.kr/wp-content/uploads/2019/08/react_node.png" width="400" height="400">

#### 1.3 Wisetracker AppKey 발급

http://report.wisetracker.co.kr 로그인

설정 > 기본설정 > 서비스 > Android 분석코드 (AppKey) 클릭 > AppKey 복사 후 적용

![Appkey 등록](https://dzf8vqv24eqhg.cloudfront.net/userfiles/6274/8379/ckfinder/images/016.png?dc=201702100857-66 "Appkey 등록")

### 2. Android 리액트 플러그인 설정

#### 2.1 Http 통신 허용 설정 
리액트 프로젝트의 **targetSdkVersion 28 이상**일 경우 http 통신 허용 설정을 해야 합니다.
app/res/xml/network_security_config (**없으면 생성**) 위치에 아래의 내용 추가

```xml
<!-- app/res/xml/network_security_config.xml -->
<?xml version="1.0" encoding="utf-8"?>
<network-security-config>
    <domain-config cleartextTrafficPermitted="true">
        <domain includeSubdomains="true">www.wisetracker.co.kr</domain>
        <domain includeSubdomains="true">trk.wisetracker.co.kr</domain>
    </domain-config>
</network-security-config>
```

#### 2.2 AndroidManifest.xml 설정 (/react-plugin/android/src/main/AndroidManifest.xml)

#### a) 디버깅 모드 설정

```xml
<!-- 개발용 true 배포용 false 권장 -->
<meta-data
	android:name="WiseTrackerLogState" 
	android:value="true" />
```

#### b) 딥링크 설정
딥링크로 진입할 android:scheme="YOUR_SCHEME" 스키마와 android:host="YOUR_HOST" 호스트를 설정해 주세요.

```xml
<!-- 예시는 wisetracker://wisetracker.co.kr 링크로 진입시 딥링크 분석이 가능하며, 사용될 값을 직접 수정해 주세요. -->
<activity android:name="kr.co.wisetracker.tracker.DeepLinkActivity" 
          android:launchMode="singleTop" >
    <intent-filter>
        <action android:name="android.intent.action.VIEW" />
        <category android:name="android.intent.category.DEFAULT" />
        <category android:name="android.intent.category.BROWSABLE" />
	<!-- 딥링크로 진입될 스키마와 호스트 정보 입력 -->
        <data android:host="wisetracker.co.kr"
              android:scheme="wisetracker" />
    </intent-filter>
</activity>
```

### 3. IOS 리액트 플러그인 설정
#### 1) XCode 프로젝트 세팅: 아래의 화면과 같이 설치한 플러그인 폴더 아래에 있는 파일들 중 아래 4가지 파일들을 프로젝트 경로에 가져다 놓습니다.(Drag & Drop
![](http://www.wisetracker.co.kr/wp-content/uploads/2019/09/react_folder-1.png)


#### 2) info.plist파일 디버깅 모드 세팅
info.plist 파일을 open할때 list로 보기 가 아니라 source로 보기를 선탁하신뒤, 아래의 key/value값을 붙혀 넣습니다.

```xml
// 개발용 true. 배포용 false 권장
    <key>WiseTrackerLogState</key>
    <string>true</string>
```

#### 3) 외부 유입 경로 분석 ( Deeplink )
앱이 설치된 이후 DeepLink를 통해서 앱이 실행되는 경로 분석이 필요한 경우 
네이티브 프로젝트의 AppDelegate 정의 항목중 openURL 함수 구현부에 아래와 같이 추가해줍니다.

 #import<WiseTracker/WiseTracker.h> 추가

```Objective-c
-(BOOL)application:(UIApplication *)application openURL:(NSURL *)url sourceApplication:(NSString *)sourceApplication annotation:(id)annotation{
	[WiseTracker urlRefererCheck:sourceApplication url:url];
	return YES;
}
```

### 4. 플러그인 초기화
리액트 프로젝트에서 앱 시작시 최초 로드되는 .js 파일에 플러그인을 초기화하는 코드를 추가합니다.

```javascript

import Wisetracker from 'react-plugin/wrapper/bridge.js';

componentDidMount() {
    Wisetracker.setWisetrackerAppkey("YOUR_APP_KEY");   // 앱키 입력
    Wisetracker.initialization();  			// 초기화 함수 호출
    Wisetracker.startPage("YOUR_PAGE_VALUE"); 		// 페이지 정보 입력
}

```
