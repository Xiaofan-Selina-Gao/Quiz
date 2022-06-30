package com.example.demo1.controller;

import com.example.demo1.DAO.UserDAO;
import com.example.demo1.model.Question;
import com.example.demo1.model.Quiz;
import com.example.demo1.model.User;
import com.example.demo1.service.QuizService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserLoginController {
    @Autowired
    private UserDAO userDAO;
    
    @Autowired
    private QuizService quizService;
    
    @GetMapping("/login")
    public ModelAndView userLogin() {
    	ModelAndView mv = new ModelAndView();
    	mv.setViewName("login");
    	return mv;
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView userLogin(@RequestParam String username ,  @RequestParam String password) {

        ModelAndView mv = new ModelAndView();

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        String name = userDAO.loginUser(user);

        if (name != null) {
            List<Quiz> theQuizes = quizService.getAllQuiz();
    		mv.addObject("quizes", theQuizes);
            mv.setViewName("index");
        } else {
            mv.addObject("msg", "Invalid user id or password.");
            mv.setViewName("login");
        }

        return mv;
    }
}
