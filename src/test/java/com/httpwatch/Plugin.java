package com.httpwatch  ;

import com4j.*;

/**
 * Used to control the HttpWatch Plugin
 */
@IID("{F18298C2-6F2D-417B-8EFA-4A5AC4C64C9A}")
public interface Plugin extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns a reference to the IE browser object (IE Only)
   * </p>
   * <p>
   * Getter method for the COM property "Container"
   * </p>
   * @return  Returns a value of type com.httpwatch.IWebBrowser2
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  com.httpwatch.IWebBrowser2 container();


  /**
   * <p>
   * The log of recorded requests
   * </p>
   * <p>
   * Getter method for the COM property "Log"
   * </p>
   * @return  Returns a value of type com.httpwatch.Log
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  com.httpwatch.Log log();


  /**
   * <p>
   * Starts recording HTTP data
   * </p>
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  void record();


  /**
   * <p>
   * Returns true if recording is enabled
   * </p>
   * <p>
   * Getter method for the COM property "IsRecording"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  boolean isRecording();


  /**
   * <p>
   * Stops recording data
   * </p>
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void stop();


  /**
   * <p>
   * Clears the current log
   * </p>
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  void clear();


  /**
   * <p>
   * Closes the HttpWatch plug-in window
   * </p>
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  void closeWindow();


  /**
   * <p>
   * Opens the HttpWatch plug-in window
   * </p>
   * @param unDocked Mandatory boolean parameter.
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  void openWindow(
    boolean unDocked);


  /**
   * <p>
   * Go to the specified URL
   * </p>
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void gotoURL(
    java.lang.String url);


  /**
   * <p>
   * Indicates if the browsr is loading the current page
   * </p>
   * <p>
   * Getter method for the COM property "IsLoadingPage"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  boolean isLoadingPage();


  /**
   * <p>
   * Empty the browser cache
   * </p>
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  void clearCache();


  /**
   * <p>
   * Clear all saved and session cookies
   * </p>
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  void clearAllCookies();


  /**
   * <p>
   * Clear all session cookies
   * </p>
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  void clearSessionCookies();


  /**
   * <p>
   * Indicates if IE will automatically record
   * </p>
   * <p>
   * Getter method for the COM property "AutoRecord"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  boolean autoRecord();


  /**
   * <p>
   * Indicates if IE will automatically record
   * </p>
   * <p>
   * Setter method for the COM property "AutoRecord"
   * </p>
   * @param pRet Mandatory boolean parameter.
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(21)
  void autoRecord(
    boolean pRet);


  /**
   * <p>
   * Indicates if a confirmation message will be displayed before auto-recording starts
   * </p>
   * <p>
   * Getter method for the COM property "AutoRecordConfirmation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  boolean autoRecordConfirmation();


  /**
   * <p>
   * Indicates if a confirmation message will be displayed before auto-recording starts
   * </p>
   * <p>
   * Setter method for the COM property "AutoRecordConfirmation"
   * </p>
   * @param pRet Mandatory boolean parameter.
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(23)
  void autoRecordConfirmation(
    boolean pRet);


  /**
   * <p>
   * Indicates if log files will automatically saved when recording is automatically started
   * </p>
   * <p>
   * Getter method for the COM property "AutoSave"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  boolean autoSave();


  /**
   * <p>
   * Indicates if log files will automatically saved when recording is automatically started
   * </p>
   * <p>
   * Setter method for the COM property "AutoSave"
   * </p>
   * @param pRet Mandatory boolean parameter.
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(25)
  void autoSave(
    boolean pRet);


  /**
   * <p>
   * The time in minutes after which the current log file will be automatically saved
   * </p>
   * <p>
   * Getter method for the COM property "AutoSaveTimeout"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(26)
  int autoSaveTimeout();


  /**
   * <p>
   * The time in minutes after which the current log file will be automatically saved
   * </p>
   * <p>
   * Setter method for the COM property "AutoSaveTimeout"
   * </p>
   * @param pRet Mandatory int parameter.
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(27)
  void autoSaveTimeout(
    int pRet);


  /**
   * <p>
   * The directory to which log files should be automatically saved
   * </p>
   * <p>
   * Getter method for the COM property "AutoSavePath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String autoSavePath();


  /**
   * <p>
   * The directory to which log files should be automatically saved
   * </p>
   * <p>
   * Setter method for the COM property "AutoSavePath"
   * </p>
   * @param pRet Mandatory java.lang.String parameter.
   */

  @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
  @VTID(29)
  void autoSavePath(
    java.lang.String pRet);


  /**
   * <p>
   * The maximum age of log files in days before they will be purged from the directory used for automated saves. (Use 0 for no purging)
   * </p>
   * <p>
   * Getter method for the COM property "AutoPurgeDays"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743831) //= 0x60020017. The runtime will prefer the VTID if present
  @VTID(30)
  int autoPurgeDays();


  /**
   * <p>
   * The maximum age of log files in days before they will be purged from the directory used for automated saves. (Use 0 for no purging)
   * </p>
   * <p>
   * Setter method for the COM property "AutoPurgeDays"
   * </p>
   * @param pRet Mandatory int parameter.
   */

  @DISPID(1610743831) //= 0x60020017. The runtime will prefer the VTID if present
  @VTID(31)
  void autoPurgeDays(
    int pRet);


  /**
   * <p>
   * Closes the browser in which HttpWatch is embedded
   * </p>
   */

  @DISPID(1610743833) //= 0x60020019. The runtime will prefer the VTID if present
  @VTID(32)
  void closeBrowser();


  /**
   * <p>
   * Indicates if the browser is loading the current page
   * </p>
   * @param waitForPageLoadEvent Mandatory boolean parameter.
   * @param waitForRenderStartEvent Mandatory boolean parameter.
   * @param httpIdleSecs Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  boolean isLoadingPageEx(
    boolean waitForPageLoadEvent,
    boolean waitForRenderStartEvent,
    int httpIdleSecs);


  /**
   * <p>
   * Assigns a comment to the next page that is recorded in HttpWatch
   * </p>
   * <p>
   * Getter method for the COM property "NextPageComment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743835) //= 0x6002001b. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String nextPageComment();


  /**
   * <p>
   * Assigns a comment to the next page that is recorded in HttpWatch
   * </p>
   * <p>
   * Setter method for the COM property "NextPageComment"
   * </p>
   * @param pOut Mandatory java.lang.String parameter.
   */

  @DISPID(1610743835) //= 0x6002001b. The runtime will prefer the VTID if present
  @VTID(35)
  void nextPageComment(
    java.lang.String pOut);


  // Properties:
}
