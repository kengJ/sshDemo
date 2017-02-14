package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.model.TestModel;

@Controller
public class JsonAction {
	
	private ModelAndView mv = new ModelAndView();
	
	@RequestMapping(value="/jsonTest")
	@ResponseBody
	public TestModel JsonTest(){
		TestModel tm = new TestModel();
		tm.setId("1");
		tm.setName("name");
		tm.setPasswd("passwd");
		return tm;
	}
}
