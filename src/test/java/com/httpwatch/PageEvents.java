package com.httpwatch  ;

import com4j.*;

/**
 * Contains page level event timings
 */
@IID("{5422D39D-A1DD-40EF-A4C2-C36C101D693B}")
public interface PageEvents extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The DOM Load event timing for the page
   * </p>
   * <p>
   * Getter method for the COM property "DOMLoad"
   * </p>
   * @return  Returns a value of type com.httpwatch.PageEvent
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  com.httpwatch.PageEvent domLoad();


  /**
   * <p>
   * The Page Load event timing for the page
   * </p>
   * <p>
   * Getter method for the COM property "PageLoad"
   * </p>
   * @return  Returns a value of type com.httpwatch.PageEvent
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  com.httpwatch.PageEvent pageLoad();


  /**
   * <p>
   * The HTTP Load event timing for the page
   * </p>
   * <p>
   * Getter method for the COM property "HTTPLoad"
   * </p>
   * @return  Returns a value of type com.httpwatch.PageEvent
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  com.httpwatch.PageEvent httpLoad();


  /**
   * <p>
   * The Render Start event timing for the page
   * </p>
   * <p>
   * Getter method for the COM property "RenderStart"
   * </p>
   * @return  Returns a value of type com.httpwatch.PageEvent
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  com.httpwatch.PageEvent renderStart();


  // Properties:
}
