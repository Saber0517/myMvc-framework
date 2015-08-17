package cn.johnyu.mymvc.framework;

import java.util.Locale;

public interface ViewResolver {	
	View resolveViewName(String viewName, Locale locale) throws Exception;
}