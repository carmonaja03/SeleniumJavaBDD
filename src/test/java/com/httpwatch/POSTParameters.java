package com.httpwatch  ;

import com4j.*;

/**
 * Contains a list of POST values sent in an HTTP request message
 */
@IID("{6C1B38A6-9F2C-4DC5-BEFA-629964C5B7F0}")
public interface POSTParameters extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * The number of POST parameters
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
   * Access individual POST parameters using a value between 0 and Count - 1
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com.httpwatch.POSTParameter
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  com.httpwatch.POSTParameter item(
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
