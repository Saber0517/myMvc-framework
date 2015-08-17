package cn.johnyu.mymvc.framework;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandlerExecutionChain {
	private  Object handler;
	private HandlerInterceptor[] interceptors;
	
	
	boolean applyPreHandle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return false;
	}

	/**
	 * Apply postHandle methods of registered interceptors.
	 */
	void applyPostHandle(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) throws Exception {
		
	}

	/**
	 * Trigger afterCompletion callbacks on the mapped HandlerInterceptors.
	 * Will just invoke afterCompletion for all interceptors whose preHandle invocation
	 * has successfully completed and returned true.
	 */
	void triggerAfterCompletion(HttpServletRequest request, HttpServletResponse response, Exception ex)
			throws Exception {

	}
}


