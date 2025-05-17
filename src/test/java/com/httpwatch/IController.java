package com.httpwatch  ;

import com4j.*;

/**
 * The Controller is used to create new instances of HttpWatch and open existing log files
 */
@IID("{D35BBD87-F493-433B-AA84-E5F17180374C}")
public interface IController extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Used to access Internet Explorer plugin
   * </p>
   * <p>
   * Getter method for the COM property "IE"
   * </p>
   * @return  Returns a value of type com.httpwatch.IE
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  com.httpwatch.IE ie();


  /**
   * <p>
   * Opens an HttpWatch log file (.hwl)
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.httpwatch.Log
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(8)
  com.httpwatch.Log openLog(
    java.lang.String fileName);


  /**
   * <p>
   * Waits for the current page to be downloaded
   * </p>
   * @param plugin Mandatory com.httpwatch.Plugin parameter.
   * @param timeOutSecs Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(9)
  boolean wait_(
    com.httpwatch.Plugin plugin,
    int timeOutSecs);


  /**
   * <p>
   * Set to true if HttpWatch Basic Edition is installed
   * </p>
   * <p>
   * Getter method for the COM property "IsBasicEdition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(10)
  boolean isBasicEdition();


  /**
   * <p>
   * The version of HttpWatch being used.
   * </p>
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String version();


  /**
   * <p>
   * Waits for the current page to be downloaded
   * </p>
   * @param plugin Mandatory com.httpwatch.Plugin parameter.
   * @param timeOutSecs Mandatory int parameter.
   * @param waitForPageLoadEvent Mandatory boolean parameter.
   * @param waitForRenderStartEvent Mandatory boolean parameter.
   * @param httpIdleSecs Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(12)
  boolean waitEx(
    com.httpwatch.Plugin plugin,
    int timeOutSecs,
    boolean waitForPageLoadEvent,
    boolean waitForRenderStartEvent,
    int httpIdleSecs);


  /**
   * <p>
   * Attach HttpWatch to an existing instance of Internet Explorer or Chrome that has a page with the specified title
   * </p>
   * @param pageTitle Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.httpwatch.Plugin
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(13)
  com.httpwatch.Plugin attachByTitle(
    java.lang.String pageTitle);


  /**
   * <p>
   * Used to access Chrome Extension
   * </p>
   * <p>
   * Getter method for the COM property "Chrome"
   * </p>
   * @return  Returns a value of type com.httpwatch.Chrome
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(14)
  com.httpwatch.Chrome chrome();


  /**
   * <p>
   * Used to access Edge Extension
   * </p>
   * <p>
   * Getter method for the COM property "Edge"
   * </p>
   * @return  Returns a value of type com.httpwatch.Edge
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(15)
  com.httpwatch.Edge edge();


  // Properties:
}
