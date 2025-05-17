package com.httpwatch  ;

import com4j.*;

/**
 * Provides access to a page in the HttpWatch log
 */
@IID("{BE4A78A7-B009-4B09-A2E4-E8EA96159599}")
public interface Page extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The title for this page
   * </p>
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String title();


  /**
   * <p>
   * The time when the page was started as a formatted string as an offset from the start of the log
   * </p>
   * <p>
   * Getter method for the COM property "Started"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String started();


  /**
   * <p>
   * The time when the page was started in seconds as an offset from the start of the log
   * </p>
   * <p>
   * Getter method for the COM property "StartedSecs"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  double startedSecs();


  /**
   * <p>
   * The date/time when the page was started.
   * </p>
   * <p>
   * Getter method for the COM property "StartedDateTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  java.util.Date startedDateTime();


  /**
   * <p>
   * Indicates if this page was a dynamic update to a previously loaded page
   * </p>
   * <p>
   * Getter method for the COM property "Dynamic"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  boolean dynamic();


  /**
   * <p>
   * The HTTP entries recorded for this page
   * </p>
   * <p>
   * Getter method for the COM property "Entries"
   * </p>
   * @return  Returns a value of type com.httpwatch.Entries
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  com.httpwatch.Entries entries();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={com.httpwatch.Entries.class})
  com.httpwatch.Entry entries(
    int index);

  /**
   * <p>
   * A boolean value indicating that this page contains a single request that was not directly associated with a window or tab
   * </p>
   * <p>
   * Getter method for the COM property "Unknown"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  boolean unknown();


  /**
   * <p>
   * The event timings for this
   * </p>
   * <p>
   * Getter method for the COM property "Events"
   * </p>
   * @return  Returns a value of type com.httpwatch.PageEvents
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  com.httpwatch.PageEvents events();


  /**
   * <p>
   * In HttpWatch Basic Edition this set to true for page's whose URL is not supported for extended HTTP information
   * </p>
   * <p>
   * Getter method for the COM property "IsRestrictedURL"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  boolean isRestrictedURL();


  /**
   * <p>
   * A comment that can be assigned to a page
   * </p>
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String comment();


  /**
   * <p>
   * A comment that can be assigned to a page
   * </p>
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param pOut Mandatory java.lang.String parameter.
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(17)
  void comment(
    java.lang.String pOut);


  // Properties:
}
