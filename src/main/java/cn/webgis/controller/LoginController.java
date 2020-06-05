package cn.webgis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login/*")
public class LoginController {

    @RequestMapping("login_lsl")
    public ModelAndView login_lsl(String username, String password) {
        System.out.println("用户名是:" + username);
        System.out.println("密码是:" + password);
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("username", username + "-------");
        modelAndView.addObject("password", password + "-------");
        modelAndView.addObject("msg", "登录成功!");
        return modelAndView;
    }
    //抄了一遍体验了一下
    @RequestMapping("login_cyj")
    public ModelAndView login_cyj(String username, String password) {
        System.out.println("用户名是:" + username);
        System.out.println("密码是:" + password);
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("username", username + "-------");
        modelAndView.addObject("password", password + "-------");
        modelAndView.addObject("msg", "登录成功!");
        return modelAndView;
    }
}
