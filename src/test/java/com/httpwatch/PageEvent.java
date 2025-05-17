package com.httpwatch  ;

import com4j.*;

/**
 * Contains a page level timing
 */
@IID("{57602A1E-6929-476F-9CB8-1461432337F3}")
public interface PageEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Indicates if this page event applies to the page
   * </p>
   * <p>
   * Getter method for the COM property "Valid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  boolean valid();


  /**
   * <p>
   * The offset in seconds of the page event from the start of the page
   * </p>
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  double value();


  // Properties:
}
