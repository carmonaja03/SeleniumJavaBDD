package com.httpwatch  ;

import com4j.*;

/**
 * Shell UI Helper Control Interface 7
 */
@IID("{60E567C8-9573-4AB2-A264-637C6C161CB1}")
public interface IShellUIHelper7 extends com.httpwatch.IShellUIHelper6 {
  // Methods:
  /**
   * @param bstrFlagString Mandatory java.lang.String parameter.
   * @param vfFlag Mandatory boolean parameter.
   */

  @DISPID(85) //= 0x55. The runtime will prefer the VTID if present
  @VTID(88)
  void setExperimentalFlag(
    java.lang.String bstrFlagString,
    boolean vfFlag);


  /**
   * @param bstrFlagString Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(89)
  boolean getExperimentalFlag(
    java.lang.String bstrFlagString);


  /**
   * @param bstrValueString Mandatory java.lang.String parameter.
   * @param dwValue Mandatory int parameter.
   */

  @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
  @VTID(90)
  void setExperimentalValue(
    java.lang.String bstrValueString,
    int dwValue);


  /**
   * @param bstrValueString Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
  @VTID(91)
  int getExperimentalValue(
    java.lang.String bstrValueString);


  /**
   */

  @DISPID(92) //= 0x5c. The runtime will prefer the VTID if present
  @VTID(92)
  void resetAllExperimentalFlagsAndValues();


  /**
   * @param bstrUrl Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(89) //= 0x59. The runtime will prefer the VTID if present
  @VTID(93)
  boolean getNeedIEAutoLaunchFlag(
    java.lang.String bstrUrl);


  /**
   * @param bstrUrl Mandatory java.lang.String parameter.
   * @param flag Mandatory boolean parameter.
   */

  @DISPID(90) //= 0x5a. The runtime will prefer the VTID if present
  @VTID(94)
  void setNeedIEAutoLaunchFlag(
    java.lang.String bstrUrl,
    boolean flag);


  /**
   * @param bstrUrl Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
  @VTID(95)
  boolean hasNeedIEAutoLaunchFlag(
    java.lang.String bstrUrl);


  /**
   * @param bstrUrl Mandatory java.lang.String parameter.
   * @param automated Mandatory boolean parameter.
   */

  @DISPID(91) //= 0x5b. The runtime will prefer the VTID if present
  @VTID(96)
  void launchIE(
    java.lang.String bstrUrl,
    boolean automated);


  // Properties:
}
