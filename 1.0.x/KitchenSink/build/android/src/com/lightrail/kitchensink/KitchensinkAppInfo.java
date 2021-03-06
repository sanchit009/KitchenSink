package com.lightrail.kitchensink;

import org.appcelerator.titanium.ITiAppInfo;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiProperties;
import org.appcelerator.titanium.util.Log;

/* GENERATED CODE
 * Warning - this class was generated from your application's tiapp.xml
 * Any changes you make here will be overwritten
 */
public class KitchensinkAppInfo implements ITiAppInfo
{
	private static final String LCAT = "AppInfo";
	
	public KitchensinkAppInfo(TiApplication app) {
		TiProperties properties = app.getAppProperties();
					
		properties.setBool("ti.android.debug", true);
					
		properties.setString("ti.deploytype", "development");
					
		properties.setString("ti.android.google.map.api.key", "0ZnKXkWA2dIAu2EM-OV4ZD2lJY3sEWE5TSgjJNg");
	}
	
	public String getId() {
		return "com.lightrail.kitchensink";
	}
	
	public String getName() {
		return "KitchenSink";
	}
	
	public String getVersion() {
		return "1.0";
	}
	
	public String getPublisher() {
		return "Appcelerator";
	}
	
	public String getUrl() {
		return "appcelerator.com";
	}
	
	public String getCopyright() {
		return "2010 by Appcelerator";
	}
	
	public String getDescription() {
		return "No description provided";
	}
	
	public String getIcon() {
		return "default_app_logo.png";
	}
	
	public boolean isAnalyticsEnabled() {
		return true;
	}
	
	public String getGUID() {
		return "6fe33f33fd1f4e95a06d2d217170866d";
	}
}
