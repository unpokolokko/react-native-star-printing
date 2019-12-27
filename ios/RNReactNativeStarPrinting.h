
#if __has_include("RCTBridgeModule.h")
#import "RCTBridgeModule.h"
#else
#import <React/RCTBridgeModule.h>
#endif
#import <Foundation/Foundation.h>

@interface RNReactNativeStarPrinting : NSObject <RCTBridgeModule>
@property(nonatomic, strong) NSString *receiptDetails;
@property (nonatomic, strong) RCTResponseSenderBlock callback;
@end
  
