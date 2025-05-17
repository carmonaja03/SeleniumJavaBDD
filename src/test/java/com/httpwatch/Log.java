package com.httpwatch  ;

import com4j.*;

/**
 * This is a list of HTTP requests that have been recorded in HttpWatch
 */
@IID("{53BD74EF-9E8B-4575-A8A3-E49A5B8D27FC}")
public interface Log extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Enable or disable the current filter
   * </p>
   * @param enable Mandatory boolean parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  void enableFilter(
    boolean enable);


  /**
   * <p>
   * Indicates if filtering is currently enabled in the log
   * </p>
   * <p>
   * Getter method for the COM property "IsFilterEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(8)
  boolean isFilterEnabled();


  /**
   * <p>
   * Saves the current log to a .hwl file
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(9)
  void save(
    java.lang.String fileName);


  /**
   * <p>
   * Export the log as XML
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  void exportXML(
    java.lang.String fileName);


  /**
   * <p>
   * Export the log as CSV
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  void exportCSV(
    java.lang.String fileName);


  /**
   * <p>
   * Indicates if the file was originaly recorded in HttpWatch Basic Edition
   * </p>
   * <p>
   * Getter method for the COM property "RecordedInBasicEdition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(12)
  boolean recordedInBasicEdition();


  /**
   * <p>
   * The unfiltered list of pages recorded by HttpWatch
   * </p>
   * <p>
   * Getter method for the COM property "Pages"
   * </p>
   * @return  Returns a value of type com.httpwatch.Pages
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(13)
  com.httpwatch.Pages pages();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.Pages.class})
  com.httpwatch.Page pages(
    int index);

  /**
   * <p>
   * The filtered list of pages recorded by HttpWatch
   * </p>
   * <p>
   * Getter method for the COM property "FilteredPages"
   * </p>
   * @return  Returns a value of type com.httpwatch.Pages
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(14)
  com.httpwatch.Pages filteredPages();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.Pages.class})
  com.httpwatch.Page filteredPages(
    int index);

  /**
   * <p>
   * The unfiltered list of entries recorded by HttpWatch
   * </p>
   * <p>
   * Getter method for the COM property "Entries"
   * </p>
   * @return  Returns a value of type com.httpwatch.Entries
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(15)
  com.httpwatch.Entries entries();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.Entries.class})
  com.httpwatch.Entry entries(
    int index);

  /**
   * <p>
   * The filtered list of entries recorded by HttpWatch
   * </p>
   * <p>
   * Getter method for the COM property "FilteredEntries"
   * </p>
   * @return  Returns a value of type com.httpwatch.Entries
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(16)
  com.httpwatch.Entries filteredEntries();


  @VTID(16)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.Entries.class})
  com.httpwatch.Entry filteredEntries(
    int index);

  /**
   * <p>
   * Indicates if the log file contains request level timing information
   * </p>
   * <p>
   * Getter method for the COM property "HasNetworkTimings"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(17)
  boolean hasNetworkTimings();


  /**
   * <p>
   * Indicates if the log file contains page grouping information
   * </p>
   * <p>
   * Getter method for the COM property "HasPageGrouping"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(18)
  boolean hasPageGrouping();


  /**
   * <p>
   * Indicates if the log file contains timezone information
   * </p>
   * <p>
   * Getter method for the COM property "HasTimeZone"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(19)
  boolean hasTimeZone();


  /**
   * <p>
   * The offset in minutes from UTC of the time zone used to record the log file
   * </p>
   * <p>
   * Getter method for the COM property "TimeZoneOffsetMinutes"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(20)
  int timeZoneOffsetMinutes();


  /**
   * <p>
   * A comment that can be assigned to a log file
   * </p>
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String comment();


  /**
   * <p>
   * A comment that can be assigned to a log file
   * </p>
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param pOut Mandatory java.lang.String parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(22)
  void comment(
    java.lang.String pOut);


  /**
   * <p>
   * The browser that recorded the log file (e.g. 'Internet Explorer')
   * </p>
   * <p>
   * Getter method for the COM property "BrowserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String browserName();


  /**
   * <p>
   * The version of the browser that recorded the log file
   * </p>
   * <p>
   * Getter method for the COM property "BrowserVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String browserVersion();


  /**
   * <p>
   * The version of the application that recorded the log file
   * </p>
   * <p>
   * Getter method for the COM property "RecordedByVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String recordedByVersion();


  /**
   * <p>
   * Export the log as an HTTP Archive (.HAR)
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(26)
  void exportHAR(
    java.lang.String fileName);


  /**
   * <p>
   * Indicates if the log file was directly or indirectly imported from a HTTP Archive HAR file
   * </p>
   * <p>
   * Getter method for the COM property "WasImportedFromHAR"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(27)
  boolean wasImportedFromHAR();


  /**
   * <p>
   * The version of the HAR specification that was used to import this log
   * </p>
   * <p>
   * Getter method for the COM property "HARVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String harVersion();


  /**
   * <p>
   * The version of the HWL file from which this log was read, e.g. '6.0', '7.0', '8.1' etc
   * </p>
   * <p>
   * Getter method for the COM property "HWLVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String hwlVersion();


  /**
   * <p>
   * Export a set of fields as a CSV file
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   * @param fieldList Mandatory java.lang.String parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(30)
  void exportFieldsAsCSV(
    java.lang.String fileName,
    java.lang.String fieldList);


  /**
   * <p>
   * Enable or disable all warnings
   * </p>
   * @param enable Mandatory boolean parameter.
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(31)
  void enableWarnings(
    boolean enable);


  /**
   * <p>
   * Enable or disable a single warning, e.g. 'HW1001'
   * </p>
   * @param warningID Mandatory java.lang.String parameter.
   * @param enable Mandatory boolean parameter.
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(32)
  void enableWarningByID(
    java.lang.String warningID,
    boolean enable);


  /**
   * <p>
   * The name of the application that recorded the log file
   * </p>
   * <p>
   * Getter method for the COM property "RecordedByAppName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String recordedByAppName();


  /**
   * <p>
   * Export the log as an HTTP Archive (.HAR)
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   * @param majorVersion Mandatory int parameter.
   * @param minorVersion Mandatory int parameter.
   * @param maxTextBodySize Mandatory int parameter.
   * @param maxBinaryBodySize Mandatory int parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(34)
  void exportHAREx(
    java.lang.String fileName,
    int majorVersion,
    int minorVersion,
    int maxTextBodySize,
    int maxBinaryBodySize);


  // Properties:
}
