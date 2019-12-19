//
//  WiseTrackerManager.m
//  AwesomeProject
//
//  Created by Woncheol Heo on 2019. 4. 25..
//  Copyright © 2019년 Facebook. All rights reserved.
//

#import "WiseTrackerManager.h"
#import <React/RCTLog.h>
#import <WiseTracker/WiseTracker.h>

@implementation WiseTrackerManager

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(setWisetrackerAppkey:(NSString *)appKey)
{
    [WiseTracker applicationKey:appKey];
    [WiseTracker setApplication: RCTSharedApplication()];
}

RCT_EXPORT_METHOD(initialization)
{
    dispatch_async(dispatch_get_main_queue(), ^{
        [WiseTracker initEnd];
    });
}

RCT_EXPORT_METHOD(startPage:(NSString *)pageId )
{
  [WiseTracker startPage:pageId];
}

RCT_EXPORT_METHOD(endPage:(NSString *)pageId)
{
  [WiseTracker endPage:pageId];
}

RCT_EXPORT_METHOD(sendTransactionImmediate)
{
  [WiseTracker sendTransactionImmediate];
}

RCT_EXPORT_METHOD(setGoal:(NSString *)key value:(NSInteger)value)
{
  RCTLogInfo(@"This func call [WiseTracker setGoal]!!!! awesome :%@ %ld", key, (long)value);
  [WiseTracker setGoal:key value:[NSNumber numberWithInteger:value]];
}

RCT_EXPORT_METHOD(endStartPage:(NSString *)endPageId key:(NSString *)startPageId)
{
  [WiseTracker endPage:endPageId];
  [WiseTracker startPage:startPageId];
}

RCT_EXPORT_METHOD(setGoalById:(NSString *)pageId key:(NSString *)key value:(NSInteger )value)
{
  [WiseTracker setGoal:key value:[NSNumber numberWithInteger:value] byId:pageId];
}

RCT_EXPORT_METHOD(setAcceptPushReceived:(BOOL)isAccept)
{
  [WiseTracker setAcceptPushReceived:isAccept];
}

RCT_EXPORT_METHOD(setAcceptPushReceivedById:(NSString *)pageId isAccept:(BOOL)isAccept)
{
  [WiseTracker setAcceptPushReceived:isAccept byId:pageId];
}

RCT_EXPORT_METHOD(setMember:(NSString *)isMember)
{
  [WiseTracker setMember:isMember];
}

RCT_EXPORT_METHOD(setGender:(NSString *)gender)
{
  [WiseTracker setGender:gender];
}

RCT_EXPORT_METHOD(setAge:(NSString *)age)
{
  [WiseTracker setAge:age];
}

RCT_EXPORT_METHOD(setUserAttribute:(NSString *)key value:(NSString *)value)
{
  [WiseTracker setUserAttribute:key attribute:value];
}

RCT_EXPORT_METHOD(setContents:(NSString *)contents)
{
  [WiseTracker setContents:contents];
}

RCT_EXPORT_METHOD(setContentsById:(NSString *)contents pageId:(NSString *)pageId)
{
  [WiseTracker setContents:contents byId:pageId];
}

RCT_EXPORT_METHOD(setPageIdentity:(NSString *)pi)
{
  [WiseTracker setPageIdentity:pi];
}

RCT_EXPORT_METHOD(setSearchKeyword:(NSString *)keyword)
{
  [WiseTracker setSearchKeyword:keyword];
}

RCT_EXPORT_METHOD(setGoalSearchKeyword:(NSString *)keyword)
{
  [WiseTracker setGoalSearchKeyword:keyword];
}

RCT_EXPORT_METHOD(setOrderSearchKeywordl:(NSString *)keyword)
{
  [WiseTracker setOrderSearchKeyword:keyword];
}

RCT_EXPORT_METHOD(setOrderSearchKeywordArray:(NSArray *)keywordArray)
{
  [WiseTracker setOrderSearchKeywordArray:keywordArray];
}

RCT_EXPORT_METHOD(setSearchKeywordById:(NSString *)keyword pageId:(NSString *)pageId)
{
  [WiseTracker setSearchKeyword:keyword byId:pageId];
}

RCT_EXPORT_METHOD(setSearchKeywordResult:(NSInteger)cnt)
{
  [WiseTracker setSearchKeywordResult:cnt];
}

RCT_EXPORT_METHOD(setSearchKeywordResultById:(NSInteger)cnt pageId:(NSString *)pageId)
{
  [WiseTracker setSearchKeywordResult:cnt byId:pageId];
}

RCT_EXPORT_METHOD(setSearchKeywordCategory:(NSString *)category)
{
  [WiseTracker setSearchKeywordCategory:category];
}

RCT_EXPORT_METHOD(setSearchKeywordCategoryById:(NSString *)category pageId:(NSString *)pageId)
{
  [WiseTracker setSearchKeywordCategory:category byId:pageId];
}

RCT_EXPORT_METHOD(setCustomMvtTag:(NSString *)key value:(NSString *)value)
{
  [WiseTracker setCustomMvtTag:key value:value];
}

RCT_EXPORT_METHOD(setCustomMvtTag:(NSString *)key value:(NSString *)value pageId:(NSString *)pageId)
{
  [WiseTracker setCustomMvtTag:key value:value byId:pageId];
}

RCT_EXPORT_METHOD(setGoalCustomMvtTag:(NSString *)key value:(NSString *)value)
{
  [WiseTracker setGoalCustomMvtTag:key value:value];
}

RCT_EXPORT_METHOD(setGoalCustomMvtTag:(NSString *)key value:(NSString *)value pageId:(NSString *)pageId)
{
  [WiseTracker setGoalCustomMvtTag:key value:value byId:pageId];
}

RCT_EXPORT_METHOD(setGoalCustomMvtTagById:(NSString *)key value:(NSString *)value pageId:(NSString *)pageId)
{
  [WiseTracker setGoalCustomMvtTag:key value:value byId:pageId];
}

RCT_EXPORT_METHOD(setOrderCustomMvtTag:(NSString *)key value:(NSString *)value)
{
  [WiseTracker setOrderCustomMvtTag:key value:value];
}

RCT_EXPORT_METHOD(setOrderCustomMvtTagArray:(NSString *)key mvtTagArray:(NSArray *)mvtTagArray)
{
  [WiseTracker setOrderCustomMvtTagArray:key value:mvtTagArray];
}

RCT_EXPORT_METHOD(setOrderCustomMvtTagById:(NSString *)key value:(NSString *)value pageId:(NSString *)pageId )
{
  [WiseTracker setOrderCustomMvtTag:key value:value byId:pageId];
}

RCT_EXPORT_METHOD(setExhibit:(NSString *)exhibit)
{
  [WiseTracker setExhibit:exhibit];
}

RCT_EXPORT_METHOD(setOrderNo:(NSString *)orderNo)
{
  [WiseTracker setOrderNo:orderNo];
}

RCT_EXPORT_METHOD(setOrderNoById:(NSString *)orderNo pageId:(NSString *)pageId)
{
  [WiseTracker setOrderNo:orderNo byId:pageId];
}


RCT_EXPORT_METHOD(setProduct:(NSString *)code name:(NSString *)name)
{
  [WiseTracker setProduct:code name:name];
}

RCT_EXPORT_METHOD(setProductById:(NSString *)code name:(NSString *)name pageId:(NSString *)pageId)
{
  [WiseTracker setProduct:code name:name byId:pageId];
}

RCT_EXPORT_METHOD(setGoalProduct:(NSString *)code)
{
  [WiseTracker setGoalProduct:code];
}

RCT_EXPORT_METHOD(setGoalProductById:(NSString *)code pageId:(NSString *)pageId)
{
  [WiseTracker setGoalProduct:code byId:pageId];
}

RCT_EXPORT_METHOD(setGoalProductArray:(NSArray *)productArray)
{
  [WiseTracker setGoalProductArray:productArray];
}

RCT_EXPORT_METHOD(setGoalProductArrayById:(NSArray *)productArray pageId:(NSString *)pageId)
{
  [WiseTracker setGoalProductArray:productArray byId:pageId];
}

RCT_EXPORT_METHOD(setOrderProduct:(NSString *)code)
{
  [WiseTracker setOrderProduct:code];
}

RCT_EXPORT_METHOD(setOrderProductById:(NSString *)code pageId:(NSString *)pageId)
{
  [WiseTracker setOrderProduct:code byId:pageId];
}

RCT_EXPORT_METHOD(setOrderProductArray:(NSArray *)productArray)
{
  [WiseTracker setOrderProductArray:productArray];
}

RCT_EXPORT_METHOD(setOrderProductArrayById:(NSArray *)productArray pageId:(NSString *)pageId)
{
  [WiseTracker setOrderProductArray:productArray byId:pageId];
}

RCT_EXPORT_METHOD(setProductCategory:(NSString *)code name:(NSString *)name )
{
  [WiseTracker setProductCategory:code name:name];
}

RCT_EXPORT_METHOD(setProductCategoryById:(NSString *)code name:(NSString *)name pageId:(NSString *)pageId)
{
  [WiseTracker setProductCategory:code name:name byId:pageId];
}

RCT_EXPORT_METHOD(setGoalProductCategory:(NSString *)code)
{
  [WiseTracker setGoalProductCategory:code];
}

RCT_EXPORT_METHOD(setGoalProductCategoryArray:(NSArray *)categoryArray)
{
  [WiseTracker setGoalProductCategoryArray:categoryArray];
}

RCT_EXPORT_METHOD(setGoalProductCategoryArrayById:(NSArray *)categoryArray pageId:(NSString *)pageId)
{
  [WiseTracker setGoalProductArray:categoryArray byId:pageId];
}

RCT_EXPORT_METHOD(setOrderProductCategory:(NSString *)code)
{
  [WiseTracker setOrderProductCategory:code];
}

RCT_EXPORT_METHOD(setOrderProductCategoryById:(NSString *)code pageId:(NSString *)pageId)
{
  [WiseTracker setOrderProductCategory:code byId:pageId];
}

RCT_EXPORT_METHOD(setOrderProductCategoryArray:(NSArray *)categoryArray)
{
  [WiseTracker setOrderProductCategoryArray:categoryArray];
}

RCT_EXPORT_METHOD(setOrderProductCategoryArrayById:(NSArray *)categoryArray pageId:(NSString *)pageId)
{
  [WiseTracker setOrderProductCategoryArray:categoryArray byId:pageId];
}

RCT_EXPORT_METHOD(setProductType:(NSString *)type)
{
  [WiseTracker setProductType:type];
}

RCT_EXPORT_METHOD(setProductTypeById:(NSString *)type pageId:(NSString *)pageId)
{
  [WiseTracker setProductType:type byId:pageId];
}

RCT_EXPORT_METHOD(setGoalProductType:(NSString *)type)
{
  [WiseTracker setGoalProductType:type];
}

RCT_EXPORT_METHOD(setGoalProductTypeById:(NSString *)type pageId:(NSString *)pageId)
{
  [WiseTracker setGoalProductType:type byId:pageId];
}

RCT_EXPORT_METHOD(setGoalProductTypeArray:(NSArray *)typeArray)
{
  [WiseTracker setGoalProductTypeArray:typeArray];
}

RCT_EXPORT_METHOD(setGoalProductTypeArrayById:(NSArray *)typeArray pageId:(NSString *)pageId)
{
  [WiseTracker setGoalProductTypeArray:typeArray byId:pageId];
}

RCT_EXPORT_METHOD(setOrderProductType:(NSString *)type)
{
  [WiseTracker setOrderProductType:type];
}

RCT_EXPORT_METHOD(setOrderProductTypeById:(NSString *)type pageId:(NSString *)pageId)
{
  [WiseTracker setOrderProductType:type byId:pageId];
}

RCT_EXPORT_METHOD(setOrderProductTypeArray:(NSArray *)typeArray)
{
  [WiseTracker setOrderProductTypeArray:typeArray];
}

RCT_EXPORT_METHOD(setOrderAmount:(NSNumber *)amount)
{
  [WiseTracker setOrderAmount:amount];
}

RCT_EXPORT_METHOD(setOrderAmountById:(NSInteger )amount pageId:(NSString *)pageId)
{
  [WiseTracker setOrderAmount:amount byId:pageId];
}

RCT_EXPORT_METHOD(setOrderAmountArray:(NSArray *)amountArray)
{
  [WiseTracker setOrderAmountArray:amountArray];
}

RCT_EXPORT_METHOD(setOrderAmountArrayById:(NSArray *)amountArray pageId:(NSString *)pageId)
{
  [WiseTracker setOrderAmountArray:amountArray byId:pageId];
}

RCT_EXPORT_METHOD(setOrderQuantity:(NSInteger)quantity)
{
  [WiseTracker setOrderQuantity:quantity];
}

RCT_EXPORT_METHOD(setOrderQuantityById:(NSInteger)quantity pageId:(NSString *)pageId)
{
  [WiseTracker setOrderQuantity:quantity byId:pageId];
}

RCT_EXPORT_METHOD(setOrderQuantityArray:(NSArray *)quantityArray)
{
  [WiseTracker setOrderQuantityArray:quantityArray];
}

RCT_EXPORT_METHOD(setOrderQuantityArrayById:(NSArray *)quantityArray pageId:(NSString *)pageId)
{
  [WiseTracker setOrderQuantityArray:quantityArray byId:pageId];
}

RCT_EXPORT_METHOD(sendClickData:(NSString *)eventCode eventName:(NSString *)eventName)
{
  [WiseTracker sendClickData:eventCode eventName:eventName];
}

RCT_EXPORT_METHOD(sendGoalData)
{
  [WiseTracker sendGoalData];
}

RCT_EXPORT_METHOD(setPaymentTypeForOllehTv:(NSString *)mCd sCd:(NSString *)sCd)
{
  [WiseTracker setPaymentTypeForOllehTv:mCd sCd:sCd];
}

RCT_EXPORT_METHOD(setOrderConversionData:(NSString *)key value:(NSNumber *)value)
{
  [WiseTracker setOrderConversionData:value key:key];
}

RCT_EXPORT_METHOD(setOrderConversionDataById:(NSString *)key value:(NSInteger)value pageId:(NSString *)pageId)
{
  [WiseTracker setOrderConversionData:value key:key byId:pageId];
}

RCT_EXPORT_METHOD(setOrderConversionDataArrayById:(NSArray *)dataArray key:(NSString *)key pageId:(NSString *)pageId)
{
  [WiseTracker setOrderConversionDataArray:dataArray key:key byId:pageId];
}

RCT_EXPORT_METHOD(setInternalEvent:(NSString *)value)
{
  [WiseTracker setInternalEvent:value];
}

RCT_EXPORT_METHOD(setOrderConversionDataArray:(NSArray *)dataArray key:(NSString *)key)
{
  [WiseTracker setOrderConversionDataArray:dataArray key:key];
}

RCT_EXPORT_METHOD(useIkwdWithConversion:(NSString *)value)
{
  [WiseTracker useIkwdWithConversion:value];
}

RCT_EXPORT_METHOD(useMvt1WithConversion:(NSString *)value)
{
  [WiseTracker useMvt1WithConversion:value];
}

RCT_EXPORT_METHOD(useMvt2WithConversion:(NSString *)value)
{
  [WiseTracker useMvt2WithConversion:value];
}

RCT_EXPORT_METHOD(useMvt3WithConversion:(NSString *)value)
{
  [WiseTracker useMvt3WithConversion:value];
}

RCT_EXPORT_METHOD(setOrderDate:(NSString *)date)
{
  [WiseTracker setOrderDate:date];
}

RCT_EXPORT_METHOD(setOrderDateArray:(NSString *)date itemCount:(NSInteger)itemCount)
{
  [WiseTracker setOrderDateArray:date itemCount:itemCount];
}

@end
