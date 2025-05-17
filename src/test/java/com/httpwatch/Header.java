package com.httpwatch  ;

import com4j.*;

/**
 * Contains the name and value of a single HTTP header
 */
@IID("{E4B992AF-8CE5-4B3B-8697-EE31916D8DB4}")
public interface Header extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Name of the HTTP header
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * Value of the HTTP header
   * </p>
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String value();


  // Properties:
}
