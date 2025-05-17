package com.httpwatch  ;

import com4j.*;

/**
 * A list of requests with the same error or status code
 */
@IID("{237800E5-58C3-4A42-BA42-E84FAEA906AE}")
public interface ResultSummary extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The result of the requests in the same format displayed in HttpWatch, e.g. 200, (Cached), etc.
   * </p>
   * <p>
   * Getter method for the COM property "Result"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String result();


  /**
   * <p>
   * The status code and description, e.g. 200 OK
   * </p>
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String description();


  /**
   * <p>
   * The number of entries with this status or error code
   * </p>
   * <p>
   * Getter method for the COM property "Occurrences"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  int occurrences();


  // Properties:
}
