package com.example.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.DAO.QuestionDAO;
import com.example.demo1.model.Question;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionDAO questionDao;

	@Override
	public List<Question> getQuestions() {
		return questionDao.getQuestions();
	}

	@Override
	public void saveQuestion(Question theQuestion) {
		questionDao.saveQuestion(theQuestion);
		
	}

	@Override
	public Question getQuestion(int theId) {
		return questionDao.getQuestion(theId);
	}

	@Override
	public void deleteQuestion(int theId) {
		questionDao.deleteQuestion(theId);
		
	}

}
