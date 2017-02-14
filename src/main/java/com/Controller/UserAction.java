package com.Controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.model.User;
import com.service.IUserService;
import com.webModel.LoginUser;


@Controller
@RequestMapping("/index")
public class UserAction {
	@Resource
	private IUserService userService;
	private ModelAndView mv;
	
	@RequestMapping(value="addUser")
	public ModelAndView AddUser(LoginUser loginUser){
		User user = new User(loginUser.getUserName(),loginUser.getPassword());
		userService.addUser(user);
		mv.setViewName("redirect:userList.do");
		mv.addObject("adduser", user);
		return mv;
	}
	
	@RequestMapping(value="userList")
	public ModelAndView UserList(){
		List<User> userList = userService.UserList();
		mv.setViewName("UserList");
		mv.addObject("userList", userList);
		return mv;
	}
	
	@RequestMapping(value="delUser")
	public ModelAndView DelUser(String UserName){
		User user = userService.DelUserByName(UserName);
		mv.setViewName("UserList");
		mv.addObject("delUser", user);
		return mv;
	}
	
	@RequestMapping(value="updatePassword")
	public ModelAndView EditUser(LoginUser loginUser){
		userService.UpdatePassword(loginUser.getUserName(), loginUser.getPassword());
		return mv;
	}
	
}
