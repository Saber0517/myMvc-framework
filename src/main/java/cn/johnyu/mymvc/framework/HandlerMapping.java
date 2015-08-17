package cn.johnyu.mymvc.framework;

import javax.servlet.http.HttpServletRequest;

public interface HandlerMapping {
	HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception;
}
