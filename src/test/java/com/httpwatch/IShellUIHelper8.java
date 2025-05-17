package com.httpwatch  ;

import com4j.*;

/**
 * Shell UI Helper Control Interface 8
 */
@IID("{66DEBCF2-05B0-4F07-B49B-B96241A65DB2}")
public interface IShellUIHelper8 extends com.httpwatch.IShellUIHelper7 {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(93) //= 0x5d. The runtime will prefer the VTID if present
  @VTID(97)
  java.lang.String getCVListData();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(94) //= 0x5e. The runtime will prefer the VTID if present
  @VTID(98)
  java.lang.String getCVListLocalData();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(95) //= 0x5f. The runtime will prefer the VTID if present
  @VTID(99)
  java.lang.String getEMIEListData();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(96) //= 0x60. The runtime will prefer the VTID if present
  @VTID(100)
  java.lang.String getEMIEListLocalData();


  /**
   */

  @DISPID(97) //= 0x61. The runtime will prefer the VTID if present
  @VTID(101)
  void openFavoritesPane();


  /**
   */

  @DISPID(98) //= 0x62. The runtime will prefer the VTID if present
  @VTID(102)
  void openFavoritesSettings();


  /**
   * @param bstrUrl Mandatory java.lang.String parameter.
   */

  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
  @VTID(103)
  void launchInHVSI(
    java.lang.String bstrUrl);


  // Properties:
}
