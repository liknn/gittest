package cn.ssm.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.ssm.dao.UserDao;
import cn.ssm.domain.User;

/**
 * @author kn
 * @desc ÓÃ»§¿ØÖÆÆ÷ 
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Resource
	private UserDao userDao;

	@RequestMapping("/view")
	public String view() {
		return "main/login";
	}

	@RequestMapping("/indexview")
	public String index() {
		return "main/index";
	}

	@RequestMapping(value="/login", method= RequestMethod.POST)
	public ModelAndView login(User model, HttpSession session) {
		System.out.println(model);
		User user = userDao.findByUserName(model.getUserName());

		if (null == user || !user.getPassword().equals(model.getPassword())) {
			return new ModelAndView("redirect:/login.jsp");
		} else {
			session.setAttribute("user", user);
			ModelAndView mav = new ModelAndView();
			mav.setViewName("index");
			return mav;
		}
	}
	
	
}
