package com.httpwatch  ;

import com4j.*;

/**
 * Shell UI Helper Control Interface 6
 */
@IID("{987A573E-46EE-4E89-96AB-DDF7F8FDC98C}")
public interface IShellUIHelper6 extends com.httpwatch.IShellUIHelper5 {
  // Methods:
  /**
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(74)
  void msStopPeriodicTileUpdate();


  /**
   * @param pollingUris Mandatory java.lang.Object parameter.
   * @param startTime Optional parameter. Default value is com4j.Variant.getMissing()
   * @param uiUpdateRecurrence Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(75)
  void msStartPeriodicTileUpdate(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pollingUris,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startTime,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object uiUpdateRecurrence);


  /**
   * @param pollingUris Mandatory java.lang.Object parameter.
   * @param startTime Optional parameter. Default value is com4j.Variant.getMissing()
   * @param uiUpdateRecurrence Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(76)
  void msStartPeriodicTileUpdateBatch(
    @MarshalAs(NativeType.VARIANT) java.lang.Object pollingUris,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startTime,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object uiUpdateRecurrence);


  /**
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(77)
  void msClearTile();


  /**
   * @param fChange Mandatory boolean parameter.
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(78)
  void msEnableTileNotificationQueue(
    boolean fChange);


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(79)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object msPinnedSiteState();


  /**
   * @param fChange Mandatory boolean parameter.
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(80)
  void msEnableTileNotificationQueueForSquare150x150(
    boolean fChange);


  /**
   * @param fChange Mandatory boolean parameter.
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(81)
  void msEnableTileNotificationQueueForWide310x150(
    boolean fChange);


  /**
   * @param fChange Mandatory boolean parameter.
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(82)
  void msEnableTileNotificationQueueForSquare310x310(
    boolean fChange);


  /**
   * @param bstrNotificationXml Mandatory java.lang.String parameter.
   * @param bstrNotificationId Mandatory java.lang.String parameter.
   * @param bstrNotificationTag Mandatory java.lang.String parameter.
   * @param startTime Optional parameter. Default value is com4j.Variant.getMissing()
   * @param expirationTime Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(83)
  void msScheduledTileNotification(
    java.lang.String bstrNotificationXml,
    java.lang.String bstrNotificationId,
    java.lang.String bstrNotificationTag,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startTime,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object expirationTime);


  /**
   * @param bstrNotificationId Mandatory java.lang.String parameter.
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(84)
  void msRemoveScheduledTileNotification(
    java.lang.String bstrNotificationId);


  /**
   * @param pollingUri Mandatory java.lang.String parameter.
   * @param startTime Optional parameter. Default value is com4j.Variant.getMissing()
   * @param uiUpdateRecurrence Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(85)
  void msStartPeriodicBadgeUpdate(
    java.lang.String pollingUri,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object startTime,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object uiUpdateRecurrence);


  /**
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(86)
  void msStopPeriodicBadgeUpdate();


  /**
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(87)
  void msLaunchInternetOptions();


  // Properties:
}
