package com.httpwatch  ;

import com4j.*;

/**
 * Provides information about the item in the browser cache
 */
@IID("{30108071-50D2-40B6-9107-D8300B1FA764}")
public interface CacheInfo extends Com4jObject {
  // Methods:
  /**
   * <p>
   * True if the URL's content is stored in the browser cache
   * </p>
   * <p>
   * Getter method for the COM property "URLInCache"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  boolean urlInCache();


  /**
   * <p>
   * The date/time when the cached entry is set to expire.
   * </p>
   * <p>
   * Getter method for the COM property "Expires"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.util.Date expires();


  /**
   * <p>
   * Indicates if the expiration date/time was set by the server for this cached entry
   * </p>
   * <p>
   * Getter method for the COM property "IsExpiresSet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  boolean isExpiresSet();


  /**
   * <p>
   * The date/time when the cached entry was last updated by the browser
   * </p>
   * <p>
   * Getter method for the COM property "LastUpdate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  java.util.Date lastUpdate();


  /**
   * <p>
   * The date/time when the browser last used the cached entry
   * </p>
   * <p>
   * Getter method for the COM property "LastAccess"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Date lastAccess();


  /**
   * <p>
   * The modification date/time returned by the server for the content in this cached entry
   * </p>
   * <p>
   * Getter method for the COM property "LastModified"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Date lastModified();


  /**
   * <p>
   * Indicates if the last modification date/time was set by the server for this cached entry
   * </p>
   * <p>
   * Getter method for the COM property "IsLastModifiedSet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  boolean isLastModifiedSet();


  /**
   * <p>
   * Holds the unique identifier used by the server to version the resource
   * </p>
   * <p>
   * Getter method for the COM property "ETag"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String eTag();


  /**
   * <p>
   * The number of times that the cached entry has been accessed by IE
   * </p>
   * <p>
   * Getter method for the COM property "HitCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  int hitCount();


  /**
   * <p>
   * Indicates if the date/time when the cached entry was last updated by the browser is available
   * </p>
   * <p>
   * Getter method for the COM property "IsLastUpdateSet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  boolean isLastUpdateSet();


  /**
   * <p>
   * Indicates if the date/time when the browser last used the cached entry is available
   * </p>
   * <p>
   * Getter method for the COM property "IsLastAccessSet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  boolean isLastAccessSet();


  // Properties:
}
