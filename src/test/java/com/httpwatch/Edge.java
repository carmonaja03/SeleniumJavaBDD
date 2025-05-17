package com.httpwatch  ;

import com4j.*;

/**
 * Used to access Edge extension
 */
@IID("{59B6CE76-AEB8-46DF-AE7D-509285D6ED7D}")
public interface Edge extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Create a new tab within Edge and access it via HttpWatch
   * </p>
   * @param edgeChannel Optional parameter. Default value is ""
   * @return  Returns a value of type com.httpwatch.Plugin
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  com.httpwatch.Plugin _new(
    @Optional @DefaultValue("") java.lang.String edgeChannel);


  /**
   * <p>
   * Returns the path to the HttpWatch CRX Edge extension file
   * </p>
   * <p>
   * Getter method for the COM property "HttpWatchCRXFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String httpWatchCRXFile();


  // Properties:
}
