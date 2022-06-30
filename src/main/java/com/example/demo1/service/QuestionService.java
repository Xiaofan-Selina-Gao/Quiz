package com.example.demo1.service;

import java.util.List;

import com.example.demo1.model.Question;

public interface QuestionService {
	
	public List<Question> getQuestions();
	
	public void saveQuestion(Question theQuestion);
	public Question getQuestion(int theId);
	public void deleteQuestion(int theId);

}
