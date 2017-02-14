package com.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @category 全局异常处理
 * @author heyanzhu
 *
 */
@ControllerAdvice
public class ErrorAction {
	@ExceptionHandler
	public ModelAndView exceptionHandler(Exception e){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error");
		mv.addObject("exception", e);
		return mv;
	}
}
