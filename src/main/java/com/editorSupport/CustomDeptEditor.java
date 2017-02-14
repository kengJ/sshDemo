package com.editorSupport;

import java.beans.PropertyEditorSupport;

import com.model.TestModel;

public class CustomDeptEditor extends PropertyEditorSupport {
	public void setAsText(String text) {
		if(text.indexOf(",") > 0) {
	        TestModel dept = new TestModel();
	        String[] arr = text.split(",");
	        dept.setId(Integer.parseInt(arr[0])+"");
	        dept.setName(arr[1]);
	        setValue(dept);
	    } else {
	        throw new IllegalArgumentException("dept param is error");
	    }
    }
}
