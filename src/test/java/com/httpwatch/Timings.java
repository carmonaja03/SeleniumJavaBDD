package com.httpwatch  ;

import com4j.*;

/**
 * Contains Request Level Timings
 */
@IID("{71F7B683-98D5-4451-B20E-2DEA1E4D22B1}")
public interface Timings extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The Blocked time in seconds for this request
   * </p>
   * <p>
   * Getter method for the COM property "Blocked"
   * </p>
   * @return  Returns a value of type com.httpwatch.Timing
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  com.httpwatch.Timing blocked();


  /**
   * <p>
   * The DNS Lookup time in seconds for this request
   * </p>
   * <p>
   * Getter method for the COM property "DNSLookup"
   * </p>
   * @return  Returns a value of type com.httpwatch.Timing
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  com.httpwatch.Timing dnsLookup();


  /**
   * <p>
   * The TCP connect time in seconds for this request
   * </p>
   * <p>
   * Getter method for the COM property "Connect"
   * </p>
   * @return  Returns a value of type com.httpwatch.Timing
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  com.httpwatch.Timing connect();


  /**
   * <p>
   * The Send time in seconds for this request
   * </p>
   * <p>
   * Getter method for the COM property "Send"
   * </p>
   * @return  Returns a value of type com.httpwatch.Timing
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  com.httpwatch.Timing send();


  /**
   * <p>
   * The Wait time in seconds for this request
   * </p>
   * <p>
   * Getter method for the COM property "Wait"
   * </p>
   * @return  Returns a value of type com.httpwatch.Timing
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  com.httpwatch.Timing wait_();


  /**
   * <p>
   * The Receive time in seconds for this request
   * </p>
   * <p>
   * Getter method for the COM property "Receive"
   * </p>
   * @return  Returns a value of type com.httpwatch.Timing
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  com.httpwatch.Timing receive();


  /**
   * <p>
   * The TTFB (Time To First Byte) in seconds for this request
   * </p>
   * <p>
   * Getter method for the COM property "TTFB"
   * </p>
   * @return  Returns a value of type com.httpwatch.Timing
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  com.httpwatch.Timing ttfb();


  /**
   * <p>
   * The Network time in seconds for this request
   * </p>
   * <p>
   * Getter method for the COM property "Network"
   * </p>
   * @return  Returns a value of type com.httpwatch.Timing
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  com.httpwatch.Timing network();


  /**
   * <p>
   * The CacheRead time in seconds for this request
   * </p>
   * <p>
   * Getter method for the COM property "CacheRead"
   * </p>
   * @return  Returns a value of type com.httpwatch.Timing
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  com.httpwatch.Timing cacheRead();


  /**
   * <p>
   * The SSL Handshake time in seconds for this request
   * </p>
   * <p>
   * Getter method for the COM property "SSLHandshake"
   * </p>
   * @return  Returns a value of type com.httpwatch.Timing
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  com.httpwatch.Timing sslHandshake();


  // Properties:
}
