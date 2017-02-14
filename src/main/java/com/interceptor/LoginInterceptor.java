package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

public class LoginInterceptor implements WebRequestInterceptor { 
	/**
	 * 超时拦截
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		String session = (String) WebUtils.getSessionAttribute(request,
				"username");
		if(session != null) {
			return true;
		}else {
			throw new Exception();
		}
		
	}
	
	 public void postHandle(HttpServletRequest request,  
	            HttpServletResponse response, Object handler,  
	            ModelAndView modelAndView) throws Exception {  
	  
	    }  
	  
	    public void afterCompletion(HttpServletRequest request,  
	            HttpServletResponse response, Object handler, Exception ex)  
	            throws Exception {  
	  
	    }  

		@Override
		public void preHandle(WebRequest request) throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void postHandle(WebRequest request, ModelMap model) throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterCompletion(WebRequest request, Exception ex) throws Exception {
			// TODO Auto-generated method stub
			
		}  
}
