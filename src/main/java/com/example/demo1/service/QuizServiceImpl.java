package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.DAO.QuizDAO;
import com.example.demo1.model.Quiz;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	private QuizDAO quizDao;
	
	@Override
	public List<Quiz> getAllQuiz() {
		return quizDao.getAllQuizs();
	}

}
