package com.httpwatch  ;

import com4j.*;

/**
 * Used to access Internet Explorer plugin
 */
@IID("{9F8FEB96-0027-45A8-AC7F-25F1A558F85E}")
public interface IE extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Attach HttpWatch to an existing instance of Internet Explorer
   * </p>
   * @param pBrowser Mandatory com.httpwatch.IWebBrowser2 parameter.
   * @return  Returns a value of type com.httpwatch.Plugin
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  com.httpwatch.Plugin attach(
    com.httpwatch.IWebBrowser2 pBrowser);


  /**
   * <p>
   * Create a new instance of HttpWatch within IE
   * </p>
   * @return  Returns a value of type com.httpwatch.Plugin
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  com.httpwatch.Plugin _new();


  // Properties:
}
