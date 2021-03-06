package cn.yxffcode.modularspring.plugin.api;

import java.util.regex.Pattern;

/**
 * @author gaohang on 2/15/18.
 */
public abstract class PluginConfigConstants {
  private PluginConfigConstants() {
  }

  public static final String PLUGIN_NAME = "pluginName";

  public static final String EXPORT_PACKAGES = "exportPackages";

  public static final String ACTIVATOR = "activator";

  public static final String PLUGIN_PKG_SUFFIX = ".zip";

  public static final String PLUGIN_PKG_PREFIX = "META-INF/plugin/";

  public static final String PLUGIN_CONFIG_PATH = "META-INF/plugin.json";
}
