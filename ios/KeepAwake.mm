#import "KeepAwake.h"
#import <UIKit/UIKit.h>

@implementation KeepAwake
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(activate)
{
  dispatch_async(dispatch_get_main_queue(), ^{
    [UIApplication sharedApplication].idleTimerDisabled = YES;
  });
}

RCT_EXPORT_METHOD(deactivate)
{
  dispatch_async(dispatch_get_main_queue(), ^{
    [UIApplication sharedApplication].idleTimerDisabled = NO;
  });
}

@end
