package cn.johnyu.mymvc.framework;

import java.util.HashMap;

public class ModelAndView {
	private String viewName;
	private HashMap<String,Object> model=new HashMap<String,Object>();
	public void setViewName(String viewName){}
	public String getViewName(){return viewName;}
	public void addAttribute(String key,String obj){}
	public HashMap<String, Object> getModel(){return model;}
}

