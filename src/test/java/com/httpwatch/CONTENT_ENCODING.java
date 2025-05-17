package com.httpwatch  ;

import com4j.*;

/**
 */
public enum CONTENT_ENCODING implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  CONTENT_ENCODING_DEFAULT(0),
  /**
   * <p>
   * The value of this constant is 20127
   * </p>
   */
  CONTENT_ENCODING_ASCII(20127),
  /**
   * <p>
   * The value of this constant is 65001
   * </p>
   */
  CONTENT_ENCODING_UTF8(65001),
  /**
   * <p>
   * The value of this constant is 20936
   * </p>
   */
  CONTENT_ENCODING_CHINESE(20936),
  /**
   * <p>
   * The value of this constant is 10002
   * </p>
   */
  CONTENT_ENCODING_CHINESE_BIG5(10002),
  /**
   * <p>
   * The value of this constant is 28597
   * </p>
   */
  CONTENT_ENCODING_GREEK(28597),
  /**
   * <p>
   * The value of this constant is 28598
   * </p>
   */
  CONTENT_ENCODING_HEBREW(28598),
  /**
   * <p>
   * The value of this constant is 51949
   * </p>
   */
  CONTENT_ENCODING_KOREAN(51949),
  /**
   * <p>
   * The value of this constant is 51932
   * </p>
   */
  CONTENT_ENCODING_JAPANESE(51932),
  /**
   * <p>
   * The value of this constant is 932
   * </p>
   */
  CONTENT_ENCODING_JAPANESE_SHIFT_JIS(932),
  /**
   * <p>
   * The value of this constant is 1251
   * </p>
   */
  CONTENT_ENCODING_RUSSIAN(1251),
  ;

  private final int value;
  CONTENT_ENCODING(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
