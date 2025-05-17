package com.httpwatch  ;

import com4j.*;

/**
 * Used to access Chrome extension
 */
@IID("{09609DDF-174B-478F-A403-DFC01D82F2C3}")
public interface Chrome extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Create a new tab within Chrome and access it via HttpWatch
   * </p>
   * @param chromeChannel Optional parameter. Default value is ""
   * @return  Returns a value of type com.httpwatch.Plugin
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  com.httpwatch.Plugin _new(
    @Optional @DefaultValue("") java.lang.String chromeChannel);


  /**
   * <p>
   * Returns the path to the HttpWatch CRX Chrome extension file. Required when using Selenium.
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
