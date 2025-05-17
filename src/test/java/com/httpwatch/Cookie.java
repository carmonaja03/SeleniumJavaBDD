package com.httpwatch  ;

import com4j.*;

/**
 * Represents a cookie that was used in a request or response message
 */
@IID("{0285A8EF-8290-4BCD-9482-7BE19A86136D}")
public interface Cookie extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Name of the cookie
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
   * Value of the cookie
   * </p>
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String value();


  /**
   * <p>
   * The internet domain name to which this cookie applies
   * </p>
   * <p>
   * Getter method for the COM property "Domain"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String domain();


  /**
   * <p>
   * The URL path to which this cookie applies
   * </p>
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String path();


  /**
   * <p>
   * The date/time when this cookie expires
   * </p>
   * <p>
   * Getter method for the COM property "Expires"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Date expires();


  /**
   * <p>
   * Indicates if the cookie will be deleted at the end of the browser session
   * </p>
   * <p>
   * Getter method for the COM property "IsSessionCookie"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  boolean isSessionCookie();


  /**
   * <p>
   * The source of the cookie if known, e.g. Server, Javascript, Stored
   * </p>
   * <p>
   * Getter method for the COM property "Source"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String source();


  /**
   * <p>
   * Indicates the state of the HttpOnly flag for this cookie
   * </p>
   * <p>
   * Getter method for the COM property "IsHttpOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  boolean isHttpOnly();


  /**
   * <p>
   * Indicates if the state of the HttpOnly flag is known for this cookie
   * </p>
   * <p>
   * Getter method for the COM property "IsHttpOnlyKnown"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  boolean isHttpOnlyKnown();


  /**
   * <p>
   * Indicates the state of the Secure flag for this cookie
   * </p>
   * <p>
   * Getter method for the COM property "IsSecure"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  boolean isSecure();


  /**
   * <p>
   * Indicates if the state of the Secure flag is known for this cookie
   * </p>
   * <p>
   * Getter method for the COM property "IsSecureKnown"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  boolean isSecureKnown();


  // Properties:
}
