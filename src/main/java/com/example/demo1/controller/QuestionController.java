package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo1.DAO.UserDAO;
import com.example.demo1.model.Question;
import com.example.demo1.service.QuestionService;


@Controller
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/list")
	public String listQuestions(Model theModel) {
		List<Question> theQuestions = questionService.getQuestions();
		theModel.addAttribute("questions", theQuestions);
		return "listQuestion";
	}
}
