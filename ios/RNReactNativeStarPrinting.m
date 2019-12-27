
//created by Nurizzati Rohim
//on 06/09/2018
//with sheer willpower & a lot of googling around.
#import "RNReactNativeStarPrinting.h"
#import "StarBitmap.h"
#import "RasterDocument.h"
#import "StarIO/SMPort.h"

@import UIKit;
@implementation RNReactNativeStarPrinting

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE(RNReactNativeStarPrinting)

RCT_EXPORT_METHOD(printReceipt:(NSString *)receiptDetails callback:(RCTResponseSenderBlock)callback)
{
    
    self.receiptDetails = receiptDetails;
    
    /*1. search printers*/
    NSArray *portArray = [SMPort searchPrinter];
    
    PortInfo *portx = [portArray objectAtIndex:0];
    
    NSLog(@"Port Name 1: %@", portx.portName);
    NSLog(@"MAC Address 1 : %@", portx.macAddress);
    NSLog(@"Model Name 1: %@", portx.modelName);
    
    /*2. get port*/
    SMPort *port = nil;
    //NSString *portName = @"TCP:192.168.0.83";
    NSString *portName = portx.portName;
    NSLog(@"portName here: %@", portName);
    NSString *portSettings = @"";
    
    @try
    {
        port = [SMPort getPort:portName:portSettings:10000];
        
        NSLog(@"Portxxxx: %@", port);
        
    }
    @catch (PortException *e)
    {
        //There was an error opening port
        NSLog(@"Error: %@", e);
        
    }
    
    
    /*3. print */
    int width = 576;
    
    NSURL *localurl = [NSURL URLWithString:receiptDetails];
    NSData *data = [NSData dataWithContentsOfURL:localurl];
    
    
    UIImage *imageToPrint = [[UIImage alloc] initWithData:data];
    
    NSLog(@"image: %@", data);
    
    NSMutableData *commandsToPrint = [NSMutableData new];
    
    //changing UIImage to bitmap
    StarBitmap *starbitmap = [[StarBitmap alloc] initWithUIImage:imageToPrint :width :false];
    
    RasterDocument *rasterDoc = [[RasterDocument alloc] initWithDefaults:RasSpeed_Medium
                                                      endOfPageBehaviour:RasPageEndMode_FeedAndFullCut endOfDocumentBahaviour:RasPageEndMode_FeedAndFullCut topMargin:RasTopMargin_Standard pageLength:0 leftMargin:0 rightMargin:0];
    
    NSData *shortcommand = [rasterDoc BeginDocumentCommandData];
    [commandsToPrint appendData:shortcommand];
    
    shortcommand = [starbitmap getImageDataForPrinting:YES];
    [commandsToPrint appendData:shortcommand];
    
    shortcommand = [rasterDoc EndDocumentCommandData];
    [commandsToPrint appendData:shortcommand];
    
    int commandSize = (int)commandsToPrint.length;
    NSLog(@"commandSize: %d", commandSize);
    
    unsigned char *dataToSentToPrinter = (unsigned char *)malloc(commandSize);
    [commandsToPrint getBytes:dataToSentToPrinter length:commandSize];
    
    //start printing
    StarPrinterStatus_2 starPrinterStatus;
    
    @try
    {
        
        NSLog(@"starPort: %@", port);
        
        if(port == nil){
            
            NSLog(@"StarPort returns nil");
            
        } else {
            
            //start checking the completion of printing
            [port beginCheckedBlock:&starPrinterStatus :2];
            
            if(starPrinterStatus.offline == SM_TRUE)
            {
                //there was an error writing to port
                NSLog(@"error - there was an error writing to port:");
            }
            
            int totalAmountWritten = 0;
            while (totalAmountWritten < commandSize)
            {
                NSLog(@"totalAmountWritten: %d", totalAmountWritten);
                NSLog(@"commandSize: %d", commandSize);
                
                int remaining = commandSize - totalAmountWritten;
                int amountWritten = [port writePort:dataToSentToPrinter :totalAmountWritten :remaining];
                totalAmountWritten += amountWritten;
                
                NSLog(@"amountWritten: %d", amountWritten);
                NSLog(@"remaining: %d", remaining);
                
            }
            
            if (starPrinterStatus.offline == SM_TRUE)
            {
                NSLog(@"error - there was an error writing to port:");
                
            }
            
            //end checking the completion of printing
            port.endCheckedBlockTimeoutMillis = 30000;
            [port endCheckedBlock:&starPrinterStatus :2];
            
        }
        
    }
    @catch (PortException *exception){
        //do anything
        NSLog(@"Error: %@", exception);
        
    }
    @finally
    {
        
        [SMPort releasePort:port];
        
        NSString *resultString = @"success";
        NSLog(@"result: %@", resultString);
        
    }
}
@end
  
