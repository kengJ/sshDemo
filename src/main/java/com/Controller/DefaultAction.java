package com.Controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.service.IMenuHeaderService;

@Controller
//@RequestMapping(value="/")
public class DefaultAction {

	@Resource
	private IMenuHeaderService menuHeaderService;
	
	private ModelAndView mv = new ModelAndView();
	
//	@ResponseBody
//	@RequestMapping(value="getTop")
//	public ModelAndView GetTop(){
//		mv.setViewName("default/top");
//		return mv;
//	}
	
//	@ResponseBody
//	@RequestMapping(value="getLeft")
//	public ModelAndView GetLeft(){
//		List<MenuHeader> list = menuHeaderService.getMenuList();
//		mv.setViewName("default/left");
//		mv.addObject("munus", list);
//		return mv;
//	}
	
//	@ResponseBody
//	@RequestMapping(value="getMain")
//	public ModelAndView GetMain(){
//		mv.setViewName("default/main");
//		return mv;
//	}
	
//	@ResponseBody
//	@RequestMapping(value="getRight")
//	public ModelAndView GetRight(){
//		mv.setViewName("default/right");
//		return mv;
//	}
	
	@RequestMapping(value="/addMenu")
	public ModelAndView AddMenuHeader(String HeaderName){
		menuHeaderService.AddMenuHeader(HeaderName);
		mv.setViewName("redirect:getMenuHeader");
		return mv;
	}
	
	@RequestMapping(value="/errTest.do")
	public String ErrTest(){
		return "error";
	}
}
