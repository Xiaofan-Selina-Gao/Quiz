package com.example.demo1.DAO;

import java.util.List;

import com.example.demo1.model.Question;

public interface QuestionDAO {
	
	public List<Question> getQuestions();
	public void saveQuestion(Question question);
	public Question getQuestion(int theId);
	public void deleteQuestion(int theId);

}
