package com.httpwatch  ;

import com4j.*;

/**
 * Holds the name and value of a parameter encoded in the querystring section of a URL
 */
@IID("{CE39DFFD-65FF-4B1A-B38D-541D3ECBDBEC}")
public interface QueryStringValue extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Name of the query string parameter
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
   * Value of the query string parameter
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
