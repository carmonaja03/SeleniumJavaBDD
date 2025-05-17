package com.httpwatch  ;

import com4j.*;

/**
 * Provides access to an HTTP request in the HttpWatch log
 */
@IID("{F00EDAEF-92F9-4921-BFB2-3BE1FCBE8E66}")
public interface Entry extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The URL for this HTTP request
   * </p>
   * <p>
   * Getter method for the COM property "URL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String url();


  /**
   * <p>
   * The HTTP method used, e.g. GET or POST
   * </p>
   * <p>
   * Getter method for the COM property "Method"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String method();


  /**
   * <p>
   * The time when the entry was started as a formatted string as an offset from the start of the log
   * </p>
   * <p>
   * Getter method for the COM property "Started"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String started();


  /**
   * <p>
   * The time when the entry was started in seconds as an offset from the start of the log
   * </p>
   * <p>
   * Getter method for the COM property "StartedSecs"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  double startedSecs();


  /**
   * <p>
   * The date/time when the entry was started.
   * </p>
   * <p>
   * Getter method for the COM property "StartedDateTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Date startedDateTime();


  /**
   * <p>
   * Returns the time take to complete the request in seconds
   * </p>
   * <p>
   * Getter method for the COM property "Time"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(12)
  double time();


  /**
   * <p>
   * The result of the request in the same format displayed in HttpWatch, e.g. 200, (Cached), etc.
   * </p>
   * <p>
   * Getter method for the COM property "Result"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String result();


  /**
   * <p>
   * The state of the cache entry for this URL before the request was sent
   * </p>
   * <p>
   * Getter method for the COM property "CacheBefore"
   * </p>
   * @return  Returns a value of type com.httpwatch.CacheInfo
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(14)
  com.httpwatch.CacheInfo cacheBefore();


  /**
   * <p>
   * The state of the cache entry for this URL after the request was sent
   * </p>
   * <p>
   * Getter method for the COM property "CacheAfter"
   * </p>
   * @return  Returns a value of type com.httpwatch.CacheInfo
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(15)
  com.httpwatch.CacheInfo cacheAfter();


  /**
   * <p>
   * The IP address of the server or proxy to which this request was sent
   * </p>
   * <p>
   * Getter method for the COM property "ServerIP"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String serverIP();


  /**
   * <p>
   * The TCP port of the server or proxy to which this request was sent
   * </p>
   * <p>
   * Getter method for the COM property "ServerPort"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(17)
  int serverPort();


  /**
   * <p>
   * The IP address on the client used to send this request
   * </p>
   * <p>
   * Getter method for the COM property "ClientIP"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String clientIP();


  /**
   * <p>
   * The TCP port on the client used to process this request
   * </p>
   * <p>
   * Getter method for the COM property "ClientPort"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(19)
  int clientPort();


  /**
   * <p>
   * Returns information about the request message
   * </p>
   * <p>
   * Getter method for the COM property "Request"
   * </p>
   * @return  Returns a value of type com.httpwatch.Request
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(20)
  com.httpwatch.Request request();


  /**
   * <p>
   * Returns information about the response message
   * </p>
   * <p>
   * Getter method for the COM property "Response"
   * </p>
   * @return  Returns a value of type com.httpwatch.Response
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(21)
  com.httpwatch.Response response();


  /**
   * <p>
   * Returns information about the content to which this request refers
   * </p>
   * <p>
   * Getter method for the COM property "Content"
   * </p>
   * @return  Returns a value of type com.httpwatch.Content
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(22)
  com.httpwatch.Content content();


  /**
   * <p>
   * In HttpWatch Basic Edition this set to true for URLs that are not supported for extended HTTP information
   * </p>
   * <p>
   * Getter method for the COM property "IsRestrictedURL"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(23)
  boolean isRestrictedURL();


  /**
   * <p>
   * The number of bytes sent over the network to the server
   * </p>
   * <p>
   * Getter method for the COM property "BytesSent"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(24)
  int bytesSent();


  /**
   * <p>
   * The number of bytes received over the network from the server
   * </p>
   * <p>
   * Getter method for the COM property "BytesReceived"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(25)
  int bytesReceived();


  /**
   * <p>
   * This value is set to true if the request has finished processing
   * </p>
   * <p>
   * Getter method for the COM property "IsComplete"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(26)
  boolean isComplete();


  /**
   * <p>
   * The HTTP status code from the server
   * </p>
   * <p>
   * Getter method for the COM property "StatusCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(27)
  int statusCode();


  /**
   * <p>
   * Holds any errors that have occurred
   * </p>
   * <p>
   * Getter method for the COM property "Error"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String error();


  /**
   * <p>
   * Set to true for redirections
   * </p>
   * <p>
   * Getter method for the COM property "IsRedirect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(29)
  boolean isRedirect();


  /**
   * <p>
   * The URL to which the browser is being redirected
   * </p>
   * <p>
   * Getter method for the COM property "RedirectURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String redirectURL();


  /**
   * <p>
   * The page that contains this request
   * </p>
   * <p>
   * Getter method for the COM property "Page"
   * </p>
   * @return  Returns a value of type com.httpwatch.Page
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(31)
  com.httpwatch.Page page();


  /**
   * <p>
   * The request level timings
   * </p>
   * <p>
   * Getter method for the COM property "Timings"
   * </p>
   * @return  Returns a value of type com.httpwatch.Timings
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(32)
  com.httpwatch.Timings timings();


  /**
   * <p>
   * The warning for this request
   * </p>
   * <p>
   * Getter method for the COM property "Warnings"
   * </p>
   * @return  Returns a value of type com.httpwatch.Warnings
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(33)
  com.httpwatch.Warnings warnings();


  @VTID(33)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.Warnings.class})
  com.httpwatch.Warning warnings(
    int index);

  /**
   * <p>
   * A comment that can be assigned to a request
   * </p>
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String comment();


  /**
   * <p>
   * A comment that can be assigned to a request
   * </p>
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param pOut Mandatory java.lang.String parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(35)
  void comment(
    java.lang.String pOut);


  /**
   * <p>
   * A unique ID for each request
   * </p>
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(36)
  int id();


  /**
   * <p>
   * An identifier for the TCP connection used by this request or -1 if no connection used (e.g. with (Cache) entries)
   * </p>
   * <p>
   * Getter method for the COM property "ConnectionID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(37)
  int connectionID();


  /**
   * <p>
   * Indicates if this request used the SPDY protocol
   * </p>
   * <p>
   * Getter method for the COM property "IsSPDY"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(38)
  boolean isSPDY();


  /**
   * <p>
   * The ID of the SPDY or HTTP/2 stream used by this request. (0 for non-SPDY requests)
   * </p>
   * <p>
   * Getter method for the COM property "StreamID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(39)
  int streamID();


  /**
   * <p>
   * Indicates if this request used the HTTP/2 protocol
   * </p>
   * <p>
   * Getter method for the COM property "IsHTTP2"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(40)
  boolean isHTTP2();


  /**
   * <p>
   * Indicates the protocol use by HTTP/2 and SPDY connections
   * </p>
   * <p>
   * Getter method for the COM property "Protocol"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String protocol();


  // Properties:
}
