package com.httpwatch  ;

import com4j.*;

/**
 * Contains a list of HTTP requests
 */
@IID("{91F5E904-988E-4F69-A1C4-D17B9388490C}")
public interface Entries extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * The number of entries
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
   * Access individual entries using a value between 0 and Count - 1
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type com.httpwatch.Entry
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  com.httpwatch.Entry item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(9)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * A summary of the requests for this page
   * </p>
   * <p>
   * Getter method for the COM property "Summary"
   * </p>
   * @return  Returns a value of type com.httpwatch.Summary
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  com.httpwatch.Summary summary();


  /**
   * <p>
   * Finds a request by ID or URL
   * </p>
   * @param searchAfterEntry Mandatory com.httpwatch.Entry parameter.
   * @param searchFor Mandatory java.lang.String parameter.
   * @return  Returns a value of type com.httpwatch.Entry
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  com.httpwatch.Entry find(
    com.httpwatch.Entry searchAfterEntry,
    java.lang.String searchFor);


  // Properties:
}
