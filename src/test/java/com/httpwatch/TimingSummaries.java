package com.httpwatch  ;

import com4j.*;

/**
 * Contains summaries of a timing with a log or page
 */
@IID("{5EC931D6-6F2D-456E-BE4F-0CF7E0A4A9A3}")
public interface TimingSummaries extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The summary of the Blocked time
   * </p>
   * <p>
   * Getter method for the COM property "Blocked"
   * </p>
   * @return  Returns a value of type com.httpwatch.TimingSummary
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  com.httpwatch.TimingSummary blocked();


  /**
   * <p>
   * The summary of the  DNS Lookup time
   * </p>
   * <p>
   * Getter method for the COM property "DNSLookup"
   * </p>
   * @return  Returns a value of type com.httpwatch.TimingSummary
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  com.httpwatch.TimingSummary dnsLookup();


  /**
   * <p>
   * The summary of the  TCP connect time
   * </p>
   * <p>
   * Getter method for the COM property "Connect"
   * </p>
   * @return  Returns a value of type com.httpwatch.TimingSummary
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  com.httpwatch.TimingSummary connect();


  /**
   * <p>
   * The summary of the  Send time
   * </p>
   * <p>
   * Getter method for the COM property "Send"
   * </p>
   * @return  Returns a value of type com.httpwatch.TimingSummary
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  com.httpwatch.TimingSummary send();


  /**
   * <p>
   * The summary of the  Wait time
   * </p>
   * <p>
   * Getter method for the COM property "Wait"
   * </p>
   * @return  Returns a value of type com.httpwatch.TimingSummary
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  com.httpwatch.TimingSummary wait_();


  /**
   * <p>
   * The Receive time in seconds
   * </p>
   * <p>
   * Getter method for the COM property "Receive"
   * </p>
   * @return  Returns a value of type com.httpwatch.TimingSummary
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  com.httpwatch.TimingSummary receive();


  /**
   * <p>
   * The summary of the  TTFB (Time To First Byte)
   * </p>
   * <p>
   * Getter method for the COM property "TTFB"
   * </p>
   * @return  Returns a value of type com.httpwatch.TimingSummary
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  com.httpwatch.TimingSummary ttfb();


  /**
   * <p>
   * The summary of the  Network time
   * </p>
   * <p>
   * Getter method for the COM property "Network"
   * </p>
   * @return  Returns a value of type com.httpwatch.TimingSummary
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  com.httpwatch.TimingSummary network();


  /**
   * <p>
   * The summary of the  CacheRead time
   * </p>
   * <p>
   * Getter method for the COM property "CacheRead"
   * </p>
   * @return  Returns a value of type com.httpwatch.TimingSummary
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  com.httpwatch.TimingSummary cacheRead();


  /**
   * <p>
   * The summary of the  SSL Handshake time
   * </p>
   * <p>
   * Getter method for the COM property "SSLHandshake"
   * </p>
   * @return  Returns a value of type com.httpwatch.TimingSummary
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  com.httpwatch.TimingSummary sslHandshake();


  // Properties:
}
