package com.httpwatch  ;

import com4j.*;

/**
 * Provides a summary of a set of requests
 */
@IID("{8340029F-30FB-458B-98E2-A9641DC5D0AB}")
public interface Summary extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns the elapsed time for all the requests in the page or log
   * </p>
   * <p>
   * Getter method for the COM property "Time"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  double time();


  /**
   * <p>
   * The number of network round trips
   * </p>
   * <p>
   * Getter method for the COM property "RoundTrips"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  int roundTrips();


  /**
   * <p>
   * The number of bytes sent over the network to the server
   * </p>
   * <p>
   * Getter method for the COM property "BytesSent"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  int bytesSent();


  /**
   * <p>
   * The number of bytes received over the network from the server
   * </p>
   * <p>
   * Getter method for the COM property "BytesReceived"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  int bytesReceived();


  /**
   * <p>
   * The number of bytes saved by compression
   * </p>
   * <p>
   * Getter method for the COM property "CompressionSavedBytes"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int compressionSavedBytes();


  /**
   * <p>
   * The number of DNS lookups
   * </p>
   * <p>
   * Getter method for the COM property "DNSLookUps"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  int dnsLookUps();


  /**
   * <p>
   * The number of TCP connects
   * </p>
   * <p>
   * Getter method for the COM property "TCPConnects"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  int tcpConnects();


  /**
   * <p>
   * The total number of bytes of overhead on HTTPS requests
   * </p>
   * <p>
   * Getter method for the COM property "TotalHTTPSOverhead"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  int totalHTTPSOverhead();


  /**
   * <p>
   * The average number of bytes of overhead per HTTPS requests
   * </p>
   * <p>
   * Getter method for the COM property "AverageHTTPSOverhead"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  int averageHTTPSOverhead();


  /**
   * <p>
   * The HTTP status code from the server
   * </p>
   * <p>
   * Getter method for the COM property "StatusCodes"
   * </p>
   * @return  Returns a value of type com.httpwatch.ResultSummaries
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  com.httpwatch.ResultSummaries statusCodes();


  @VTID(16)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.ResultSummaries.class})
  com.httpwatch.ResultSummary statusCodes(
    int index);

  /**
   * <p>
   * Holds any errors that have occurred
   * </p>
   * <p>
   * Getter method for the COM property "Errors"
   * </p>
   * @return  Returns a value of type com.httpwatch.ResultSummaries
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  com.httpwatch.ResultSummaries errors();


  @VTID(17)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.ResultSummaries.class})
  com.httpwatch.ResultSummary errors(
    int index);

  /**
   * <p>
   * A summary of the timings
   * </p>
   * <p>
   * Getter method for the COM property "TimingSummaries"
   * </p>
   * @return  Returns a value of type com.httpwatch.TimingSummaries
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  com.httpwatch.TimingSummaries timingSummaries();


  /**
   * <p>
   * A summary of the warnings
   * </p>
   * <p>
   * Getter method for the COM property "WarningSummaries"
   * </p>
   * @return  Returns a value of type com.httpwatch.WarningSummaries
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  com.httpwatch.WarningSummaries warningSummaries();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.WarningSummaries.class})
  com.httpwatch.WarningSummary warningSummaries(
    int index);

  // Properties:
}
