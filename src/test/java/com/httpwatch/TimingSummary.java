package com.httpwatch  ;

import com4j.*;

/**
 * A summary of a timing with a log or page
 */
@IID("{A78CB278-109B-41B2-9971-42A90CB19315}")
public interface TimingSummary extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The minimum value of this timing in seconds
   * </p>
   * <p>
   * Getter method for the COM property "Minimum"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  double minimum();


  /**
   * <p>
   * The maximum value of this timing in seconds
   * </p>
   * <p>
   * Getter method for the COM property "Maximum"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  double maximum();


  /**
   * <p>
   * The total value of this timing in seconds
   * </p>
   * <p>
   * Getter method for the COM property "Total"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  double total();


  /**
   * <p>
   * The average value of this timing in seconds
   * </p>
   * <p>
   * Getter method for the COM property "Average"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  double average();


  /**
   * <p>
   * The number of entries with this timing
   * </p>
   * <p>
   * Getter method for the COM property "Occurrences"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int occurrences();


  // Properties:
}
