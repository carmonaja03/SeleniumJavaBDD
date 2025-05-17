package com.httpwatch  ;

import com4j.*;

/**
 * Contains a list of the cookies use in an HTTP request or response message
 */
@IID("{E8BB54CB-32C4-4E31-BD02-FFF4670201DB}")
public interface Cookies extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * The number cookies
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
   * Access individual cookies using a value between 0 and Count - 1
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com.httpwatch.Cookie
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  com.httpwatch.Cookie item(
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
