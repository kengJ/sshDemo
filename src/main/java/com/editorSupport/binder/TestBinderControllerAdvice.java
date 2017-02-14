package com.editorSupport.binder;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import com.editorSupport.CustomDeptEditor;
import com.model.TestModel;

@ControllerAdvice
public class TestBinderControllerAdvice {

	@InitBinder
	public void initBinder(WebDataBinder binder) { 
	    binder.registerCustomEditor(TestModel.class, new CustomDeptEditor());  
	 }
}
