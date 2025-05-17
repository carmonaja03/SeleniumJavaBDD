package com.httpwatch  ;

import com4j.*;

/**
 * Contains a list of headers in an HTTP request or response message
 */
@IID("{F9F5CDCD-245F-4666-AD51-B742D1F7296E}")
public interface Headers extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * The number of headers
   * </p>
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  int count();


  /**
   * <p>
   * Access individual headers using a value between 0 and Count - 1
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com.httpwatch.Header
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  com.httpwatch.Header item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
