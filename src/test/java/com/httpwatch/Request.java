package com.httpwatch  ;

import com4j.*;

/**
 * Represents the HTTP request message and its contents
 */
@IID("{154C9B6D-0D8C-4C8F-B70E-2BD12EA13102}")
public interface Request extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The HTTP request line sent to the server, e.g. GET / HTTP/1.1 
   * </p>
   * <p>
   * Getter method for the COM property "RequestLine"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String requestLine();


  /**
   * <p>
   * The cookies sent to the server
   * </p>
   * <p>
   * Getter method for the COM property "Cookies"
   * </p>
   * @return  Returns a value of type com.httpwatch.Cookies
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(8)
  com.httpwatch.Cookies cookies();


  @VTID(8)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.Cookies.class})
  com.httpwatch.Cookie cookies(
    int index);

  /**
   * <p>
   * The headers sent to the server
   * </p>
   * <p>
   * Getter method for the COM property "Headers"
   * </p>
   * @return  Returns a value of type com.httpwatch.Headers
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(9)
  com.httpwatch.Headers headers();


  @VTID(9)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.Headers.class})
  com.httpwatch.Header headers(
    int index);

  /**
   * <p>
   * The POST parameters sent to the server
   * </p>
   * <p>
   * Getter method for the COM property "POSTParameters"
   * </p>
   * @return  Returns a value of type com.httpwatch.POSTParameters
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  com.httpwatch.POSTParameters postParameters();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.POSTParameters.class})
  com.httpwatch.POSTParameter postParameters(
    int index);

  /**
   * <p>
   * The encoding scheme used in a POST request message
   * </p>
   * <p>
   * Getter method for the COM property "POSTMimeType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String postMimeType();


  /**
   * <p>
   * The parameters encoded in the query string section of the URL
   * </p>
   * <p>
   * Getter method for the COM property "QueryStringValues"
   * </p>
   * @return  Returns a value of type com.httpwatch.QueryStringValues
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(12)
  com.httpwatch.QueryStringValues queryStringValues();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.QueryStringValues.class})
  com.httpwatch.QueryStringValue queryStringValues(
    int index);

  /**
   * <p>
   * The raw HTTP response stream
   * </p>
   * <p>
   * Getter method for the COM property "Stream"
   * </p>
   * @return  Returns a value of type byte[]
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(13)
  byte[] stream();


  /**
   * <p>
   * The raw request body
   * </p>
   * <p>
   * Getter method for the COM property "Data"
   * </p>
   * @return  Returns a value of type byte[]
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(14)
  byte[] data();


  /**
   * <p>
   * The request body as a unicode string
   * </p>
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String text();


  // Properties:
}
