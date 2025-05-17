package com.httpwatch  ;

import com4j.*;

/**
 * Contains a Warning that was detected for an HTTP request
 */
@IID("{B7A07AA1-F28C-4616-A1E2-6DA53AB39752}")
public interface Warning extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The numeric part of the ID, e.g. 1001 for HW1001
   * </p>
   * <p>
   * Getter method for the COM property "Code"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  int code();


  /**
   * <p>
   * The identifier for a warning, e.g. 'HW1001'
   * </p>
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String id();


  /**
   * <p>
   * The type of the warning, e.g. 'Performance'
   * </p>
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String type();


  /**
   * <p>
   * The description of the warning
   * </p>
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String description();


  // Properties:
}
