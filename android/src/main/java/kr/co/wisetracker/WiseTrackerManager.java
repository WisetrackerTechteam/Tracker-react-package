package kr.co.wisetracker;

import android.util.Log;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import javax.annotation.Nonnull;

import kr.co.wisetracker.tracker.WiseTracker;

public class WiseTrackerManager extends ReactContextBaseJavaModule {

    private final String TAG = "WiseTrackerManager";

    public WiseTrackerManager(@Nonnull ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Nonnull
    @Override
    public String getName() {
        return "WiseTrackerManager";
    }

    @ReactMethod
    public void initialization() {
        try {
            Toast.makeText(getReactApplicationContext(), "init", Toast.LENGTH_SHORT).show();
            WiseTracker.init(getReactApplicationContext());
        } catch (Exception e) {
            Log.e(TAG, "initialization error !!", e);
        }
    }

    @ReactMethod
    public void initStart() {
        try {
            WiseTracker.initStart(getReactApplicationContext());
        } catch (Exception e) {
            Log.e(TAG, "initStart error !!", e);
        }
    }

    @ReactMethod
    public void initEnd() {
        try {
            WiseTracker.initEnd();
        } catch (Exception e) {
            Log.e(TAG, "initEnd error !!", e);
        }
    }


    @ReactMethod
    public void sendTransaction() {
        try {
            WiseTracker.sendTransaction();
        } catch (Exception e) {
            Log.e(TAG, "sendTransaction error !!", e);
        }
    }

    @ReactMethod
    public void initPushSet(String key, String value) {
        try {
            WiseTracker.initPushSet(key, value);
        } catch (Exception e) {
            Log.e(TAG, "initPushSet error !!", e);
        }
    }

    @ReactMethod
    public void putInitData(String key, String value) {
        try {
            WiseTracker.putInitData(key, value);
        } catch (Exception e) {
            Log.e(TAG, "putInitData error !!", e);
        }
    }

    @ReactMethod
    public void startPage(String data) {
        try {
            WiseTracker.startPage(data);
        } catch (Exception e) {
            Log.e(TAG, "startPage error !!", e);
        }
    }

    @ReactMethod
    public void endPage(String data) {
        try {
            WiseTracker.endPage(data);
        } catch (Exception e) {
            Log.e(TAG, "endPage error !!", e);
        }
    }

    @ReactMethod
    public void endStartPage(String data) {
        try {
            WiseTracker.endStartPage(data);
        } catch (Exception e) {
            Log.e(TAG, "endStartPage error !!", e);
        }
    }

    @ReactMethod
    public void putSessionData(String key, String value) {
        try {
            WiseTracker.putSessionData(key, value);
        } catch (Exception e) {
            Log.e(TAG, "putSessionData error !!", e);
        }
    }

    @ReactMethod
    public void putSessionReferrer(String referrer) {
        try {
            WiseTracker.putSessionReferrer(referrer);
        } catch (Exception e) {
            Log.e(TAG, "putSessionReferrer error !!", e);
        }
    }

    @ReactMethod
    public void putInstallReferrer(String referrer) {
        try {
            WiseTracker.putInstallReferrer(referrer);
        } catch (Exception e) {
            Log.e(TAG, "putSessionReferrer error !!", e);
        }
    }

    @ReactMethod
    public void sendGoalData() {
        try {
            WiseTracker.sendGoalData();
        } catch (Exception e) {
            Log.e(TAG, "setGoal error !!", e);
        }
    }

    @ReactMethod
    public void setGoal(String key, String value) {
        try {
            WiseTracker.setGoal(key, Double.valueOf(value));
        } catch (Exception e) {
            Log.e(TAG, "setGoal error !!", e);
        }
    }

    @ReactMethod
    public void setAcceptPushReceived(String isAccepted) {
        try {
            WiseTracker.setAcceptPushReceived(Boolean.valueOf(isAccepted));
        } catch (Exception e) {
            Log.e(TAG, "setAcceptPushReceived error !!", e);
        }
    }

    @ReactMethod
    public void setGoalCustomMvtTag(String key, String value) {
        try {
            WiseTracker.setGoalCustomMvtTag(key, value);
        } catch (Exception e) {
            Log.e(TAG, "setGoalCustomMvtTag error !!", e);
        }
    }

    @ReactMethod
    public void setGoalProduct(String code) {
        try {
            WiseTracker.setGoalProduct(code);
        } catch (Exception e) {
            Log.e(TAG, "setGoalProduct error !!", e);
        }
    }

    @ReactMethod
    public void setGoalProductArray(String[] array) {
        try {
            WiseTracker.setGoalProductArray(array);
        } catch (Exception e) {
            Log.e(TAG, "setGoalProductArray error !!", e);
        }
    }

    @ReactMethod
    public void setGoalProductType(String type) {
        try {
            WiseTracker.setGoalProductType(type);
        } catch (Exception e) {
            Log.e(TAG, "setGoalProductType error !!", e);
        }
    }

    @ReactMethod
    public void setGoalProductTypeArray(String[] array) {
        try {
            WiseTracker.setGoalProductTypeArray(array);
        } catch (Exception e) {
            Log.e(TAG, "setGoalProductTypeArray error !!", e);
        }
    }

    @ReactMethod
    public void setGoalProductCategory(String code) {
        try {
            WiseTracker.setGoalProductCategory(code);
        } catch (Exception e) {
            Log.e(TAG, "setGoalProductCategory error !!", e);
        }
    }

    @ReactMethod
    public void setExhibit(String exhibit) {
        try {
            WiseTracker.setExhibit(exhibit);
        } catch (Exception e) {
            Log.e(TAG, "setExhibit error !!", e);
        }
    }

    @ReactMethod
    public void setProduct(String key, String value) {
        try {
            WiseTracker.setProduct(key, value);
        } catch (Exception e) {
            Log.e(TAG, "setProduct error !!", e);
        }
    }

    @ReactMethod
    public void setProductType(String type) {
        try {
            WiseTracker.setProductType(type);
        } catch (Exception e) {
            Log.e(TAG, "setProductType error !!", e);
        }
    }

    @ReactMethod
    public void setProductCategory(String category, String name) {
        try {
            WiseTracker.setProductCategory(category, name);
        } catch (Exception e) {
            Log.e(TAG, "setProductCategory error !!", e);
        }
    }

    @ReactMethod
    public void setOrderCustomMvtTag(String key, String value) {
        try {
            WiseTracker.setOrderCustomMvtTag(key, value);
        } catch (Exception e) {
            Log.e(TAG, "setOrderCustomMvtTag error !!", e);
        }
    }

    @ReactMethod
    public void setOrderCustomMvtTagArray(String key, String[] array) {
        try {
            WiseTracker.setOrderCustomMvtTagArray(key, array);
        } catch (Exception e) {
            Log.e(TAG, "setOrderCustomMvtTagArray error !!", e);
        }
    }

    @ReactMethod
    public void setOrderProduct(String code) {
        try {
            WiseTracker.setOrderProduct(code);
        } catch (Exception e) {
            Log.e(TAG, "setOrderProduct error !!", e);
        }
    }

    @ReactMethod
    public void setOrderProductArray(String[] array) {
        try {
            WiseTracker.setOrderProductArray(array);
        } catch (Exception e) {
            Log.e(TAG, "setOrderProductArray error !!", e);
        }
    }

    @ReactMethod
    public void setOrderProductType(String type) {
        try {
            WiseTracker.setOrderProductType(type);
        } catch (Exception e) {
            Log.e(TAG, "setOrderProductType error !!", e);
        }
    }

    @ReactMethod
    public void setOrderProductTypeArray(String[] array) {
        try {
            WiseTracker.setOrderProductTypeArray(array);
        } catch (Exception e) {
            Log.e(TAG, "setOrderProductTypeArray error !!", e);
        }
    }

    @ReactMethod
    public void setOrderProductCategory(String category) {
        try {
            WiseTracker.setOrderProductCategory(category);
        } catch (Exception e) {
            Log.e(TAG, "setOrderProductCategory error !!", e);
        }
    }

    @ReactMethod
    public void setOrderProductCategoryArray(String[] array) {
        try {
            WiseTracker.setOrderProductCategoryArray(array);
        } catch (Exception e) {
            Log.e(TAG, "setOrderProductCategoryArray error !!", e);
        }
    }

    @ReactMethod
    public void setOrderAmount(String value) {
        try {
            WiseTracker.setOrderAmount(Double.valueOf(value));
        } catch (Exception e) {
            Log.e(TAG, "setOrderAmount error !!", e);
        }
    }

    @ReactMethod
    public void setOrderAmountArray(String[] array) {
        try {
            if (array == null || array.length == 0) {
                return;
            }
            double[] valueArray = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                valueArray[i] = Double.valueOf(array[i]);
                Log.d("cordova", "value[" + i + "] = " + valueArray[i]);
            }
            WiseTracker.setOrderAmountArray(valueArray);
        } catch (Exception e) {
            Log.e(TAG, "setOrderAmountArray error !!", e);
        }
    }

    @ReactMethod
    public void setOrderConversionData(String key, String value) {
        try {
            WiseTracker.setOrderConversionData(key, Double.valueOf(value));
        } catch (Exception e) {
            Log.e(TAG, "setOrderConversionData error !!", e);
        }
    }

    @ReactMethod
    public void setOrderConversionDataArray(String key, String[] array) {
        try {
            if (array == null || array.length == 0) {
                return;
            }
            double[] valueArray = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                valueArray[i] = Double.valueOf(array[i]);
                Log.d("cordova", "value[" + i + "] = " + valueArray[i]);
            }
            WiseTracker.setOrderConversionDataArray(key, valueArray);
        } catch (Exception e) {
            Log.e(TAG, "setOrderConversionDataArray error !!", e);
        }
    }

    @ReactMethod
    public void useIkwdWithConversion(String value) {
        try {
            WiseTracker.useIkwdWithConversion(value);
        } catch (Exception e) {
            Log.e(TAG, "useIkwdWithConversion error !!", e);
        }
    }

    @ReactMethod
    public void useMvt1WithConversion(String value) {
        try {
            WiseTracker.useMvt1WithConversion(value);
        } catch (Exception e) {
            Log.e(TAG, "useMvt1WithConversion error !!", e);
        }
    }

    @ReactMethod
    public void useMvt2WithConversion(String value) {
        try {
            WiseTracker.useMvt2WithConversion(value);
        } catch (Exception e) {
            Log.e(TAG, "useMvt2WithConversion error !!", e);
        }
    }

    @ReactMethod
    public void useMvt3WithConversion(String value) {
        try {
            WiseTracker.useMvt3WithConversion(value);
        } catch (Exception e) {
            Log.e(TAG, "useMvt3WithConversion error !!", e);
        }
    }

    @ReactMethod
    public void setOrderNo(String orderNo) {
        try {
            WiseTracker.setOrderNo(orderNo);
        } catch (Exception e) {
            Log.e(TAG, "setOrderNo error !!", e);
        }
    }

    @ReactMethod
    public void setOrderQuantity(String value) {
        try {
            WiseTracker.setOrderQuantity(Integer.valueOf(value));
        } catch (Exception e) {
            Log.e(TAG, "setOrderQuantity error !!", e);
        }
    }

    @ReactMethod
    public void setOrderQuantityArray(String[] array) {
        try {
            if (array == null || array.length == 0) {
                return;
            }
            int[] valueArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                valueArray[i] = Integer.valueOf(array[i]);
            }
            WiseTracker.setOrderQuantityArray(valueArray);
        } catch (Exception e) {
            Log.e(TAG, "setOrderQuantityArray error !!", e);
        }
    }

    @ReactMethod
    public void setContents(String contents) {
        try {
            WiseTracker.setContents(contents);
        } catch (Exception e) {
            Log.e(TAG, "setContents error !!", e);
        }
    }

    @ReactMethod
    public void setPageIdentity(String identify) {
        try {
            WiseTracker.setPageIdentity(identify);
        } catch (Exception e) {
            Log.e(TAG, "setPageIdentity error !!", e);
        }
    }

    @ReactMethod
    public void setSearchKeyword(String keyword) {
        try {
            WiseTracker.setSearchKeyword(keyword);
        } catch (Exception e) {
            Log.e(TAG, "setSearchKeyword error !!", e);
        }
    }

    @ReactMethod
    public void setGoalSearchKeyword(String goalSearchKeyword) {
        try {
            WiseTracker.setGoalSearchKeyword(goalSearchKeyword);
        } catch (Exception e) {
            Log.e(TAG, "setGoalSearchKeyword error !!", e);
        }
    }

    @ReactMethod
    public void setOrderSearchKeyword(String orderSearchKeyword) {
        try {
            WiseTracker.setOrderSearchKeyword(orderSearchKeyword);
        } catch (Exception e) {
            Log.e(TAG, "setOrderSearchKeyword error !!", e);
        }
    }

    @ReactMethod
    public void setOrderSearchKeywordArray(String[] array) {
        try {
            WiseTracker.setOrderSearchKeywordArray(array);
        } catch (Exception e) {
            Log.e(TAG, "setOrderSearchKeywordArray error !!", e);
        }
    }

    @ReactMethod
    public void setSearchKeywordResult(String count) {
        try {
            WiseTracker.setSearchKeywordResult(Integer.valueOf(count));
        } catch (Exception e) {
            Log.e(TAG, "setSearchKeywordResult error !!", e);
        }
    }

    @ReactMethod
    public void setSearchKeywordCategory(String category) {
        try {
            WiseTracker.setSearchKeywordCategory(category);
        } catch (Exception e) {
            Log.e(TAG, "setSearchKeywordCategory error !!", e);
        }
    }

    @ReactMethod
    public void setMember(String member) {
        try {
            WiseTracker.setMember(member);
        } catch (Exception e) {
            Log.e(TAG, "setMember error !!", e);
        }
    }

    @ReactMethod
    public void setGender(String gender) {
        try {
            WiseTracker.setGender(gender);
        } catch (Exception e) {
            Log.e(TAG, "setGender error !!", e);
        }
    }

    @ReactMethod
    public void setAge(String age) {
        try {
            WiseTracker.setAge(age);
        } catch (Exception e) {
            Log.e(TAG, "setAge error !!", e);
        }
    }

    @ReactMethod
    public void setUserAttribute(String key, String value) {
        try {
            WiseTracker.setUserAttribute(key, value);
        } catch (Exception e) {
            Log.e(TAG, "setUserAttribute error !!", e);
        }
    }

    @ReactMethod
    public void setCustomMvtTag(String key, String value) {
        try {
            WiseTracker.setCustomMvtTag(key, value);
        } catch (Exception e) {
            Log.e(TAG, "setCustomMvtTag error !!", e);
        }
    }

    @ReactMethod
    public void setOrderDate(String orderDate) {
        try {
            WiseTracker.setOrderDate(orderDate);
        } catch (Exception e) {
            Log.e(TAG, "setOrderDate error !!", e);
        }
    }

    @ReactMethod
    public void setOrderDateArray(String orderDate, String count) {
        try {
            WiseTracker.setOrderDateArray(orderDate, Integer.valueOf(count));
        } catch (Exception e) {
            Log.e(TAG, "setOrderDateArray error !!", e);
        }
    }

    @ReactMethod
    public void setWisetrackerAppkey(String appKey) {
        try {
            WiseTracker.setWisetrackerAppkey(appKey);
        } catch (Exception e) {
            Log.e(TAG, "setWisetrackerAppkey error !!", e);
        }
    }

    @ReactMethod
    public void setWisetrackerDebugMode(String mode) {
        try {
            WiseTracker.setWisetrackerDebugMode(Boolean.valueOf(mode));
        } catch (Exception e) {
            Log.e(TAG, "setWisetrackerDebugMode error !!", e);
        }
    }

    @ReactMethod
    public void sendClickData(String key, String value) {
        try {
            WiseTracker.sendClickData(key, value);
        } catch (Exception e) {
            Log.e(TAG, "sendClickData error !!", e);
        }
    }

    @ReactMethod
    public void sendImmediatelyClickData(String key, String value) {
        try {
            WiseTracker.sendImmediatelyClickData(key, value);
        } catch (Exception e) {
            Log.e(TAG, "sendImmediatelyClickData error !!", e);
        }
    }

}
