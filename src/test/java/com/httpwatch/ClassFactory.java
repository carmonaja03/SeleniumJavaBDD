package com.httpwatch  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  /**
   * The Controller is used to create new instances of HttpWatch and open existing log files
   */
  public static com.httpwatch.IController createController() {
    return COM4J.createInstance( com.httpwatch.IController.class, "{C4CEDB78-2B64-4703-99BE-A037A849D703}" );
  }

  /**
   * WebBrowser Control
   */
  public static com.httpwatch.IWebBrowser createWebBrowser_V1() {
    return COM4J.createInstance( com.httpwatch.IWebBrowser.class, "{EAB22AC3-30C1-11CF-A7EB-0000C05BAE0B}" );
  }

  /**
   * WebBrowser Control
   */
  public static com.httpwatch.IWebBrowser2 createWebBrowser() {
    return COM4J.createInstance( com.httpwatch.IWebBrowser2.class, "{8856F961-340A-11D0-A96B-00C04FD705A2}" );
  }

  /**
   * Internet Explorer Application.
   */
  public static com.httpwatch.IWebBrowser2 createInternetExplorer() {
    return COM4J.createInstance( com.httpwatch.IWebBrowser2.class, "{0002DF01-0000-0000-C000-000000000046}" );
  }

  /**
   * Internet Explorer Application with default integrity of Medium
   */
  public static com.httpwatch.IWebBrowser2 createInternetExplorerMedium() {
    return COM4J.createInstance( com.httpwatch.IWebBrowser2.class, "{D5E8041D-920F-45E9-B8FB-B1DEB82C6E5E}" );
  }

  /**
   * ShellDispatch Load in Shell Context
   */
  public static com.httpwatch.IShellWindows createShellWindows() {
    return COM4J.createInstance( com.httpwatch.IShellWindows.class, "{9BA05972-F6A8-11CF-A442-00A0C90A8F39}" );
  }

  public static com.httpwatch.IShellUIHelper9 createShellUIHelper() {
    return COM4J.createInstance( com.httpwatch.IShellUIHelper9.class, "{64AB4BB7-111E-11D1-8F79-00C04FC2FBE1}" );
  }

  public static com.httpwatch.IShellNameSpace createShellNameSpace() {
    return COM4J.createInstance( com.httpwatch.IShellNameSpace.class, "{55136805-B2DE-11D1-B9F2-00A0C98BC547}" );
  }
}
