package com.httpwatch  ;

import com4j.*;

/**
 * Represents the HTTP response message and its contents
 */
@IID("{BEAF8831-18CF-4B1B-AD18-112C675A2443}")
public interface Response extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The response line from the server, e.g. HTTP/1.1 200 OK
   * </p>
   * <p>
   * Getter method for the COM property "StatusLine"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String statusLine();


  /**
   * <p>
   * The cookies received from the server
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
   * The headers received from the server
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
   * The raw HTTP response stream
   * </p>
   * <p>
   * Getter method for the COM property "Stream"
   * </p>
   * @return  Returns a value of type byte[]
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(10)
  byte[] stream();


  /**
   * <p>
   * The number of chunks in the response stream
   * </p>
   * <p>
   * Getter method for the COM property "Chunks"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(11)
  int chunks();


  // Properties:
}
