package com.httpwatch  ;

import com4j.*;

/**
 * Contains a Request Level Timings
 */
@IID("{BBCC50D3-8A27-46C9-A457-4E4B6BF936FD}")
public interface Timing extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Indicates if this timing applies to the request
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
   * The start time as an offset in seconds from the start of the request
   * </p>
   * <p>
   * Getter method for the COM property "Started"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  double started();


  /**
   * <p>
   * The duration of the timing in seconds
   * </p>
   * <p>
   * Getter method for the COM property "Duration"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  double duration();


  // Properties:
}
