package com.httpwatch  ;

import com4j.*;

/**
 * Holds the name and value of a POST parameter
 */
@IID("{575364B8-39FD-4C20-A552-3DEC11746942}")
public interface POSTParameter extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Name of the POST parameter
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
   * Value of the POST parameter
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
   * The size of the POST parameter in bytes
   * </p>
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  int size();


  /**
   * <p>
   * Indicates if the size of the POST parameter is known
   * </p>
   * <p>
   * Getter method for the COM property "IsSizeKnown"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  boolean isSizeKnown();


  /**
   * <p>
   * The content type of an uploaded file
   * </p>
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String type();


  /**
   * <p>
   * Indicates if the parameter was an uploaded file
   * </p>
   * <p>
   * Getter method for the COM property "IsFile"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  boolean isFile();


  /**
   * <p>
   * The name of the uploaded file
   * </p>
   * <p>
   * Getter method for the COM property "FileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String fileName();


  /**
   * <p>
   * Exports the contents of the POST parameter to a file
   * </p>
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  void export(
    java.lang.String fileName);


  /**
   * <p>
   * The position of the POST parameter in the request message, e.g. 3 for third, 0 for unknown
   * </p>
   * <p>
   * Getter method for the COM property "index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  int index();


  // Properties:
}
