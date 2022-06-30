package com.example.demo1.DAO;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo1.model.Question;

@Repository
public class QuestionDAOImpl implements QuestionDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Question> getQuestions() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Question> cq = cb.createQuery(Question.class);
		Root<Question> root = cq.from(Question.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		List<Question> res = query.getResultList();
		return res;
	}

	@Override
	public void saveQuestion(Question theQuestion) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theQuestion);
		
	}

	@Override
	public Question getQuestion(int theId) {
		Session session = sessionFactory.getCurrentSession();
		Question theQuestion = session.get(Question.class, theId);
		return theQuestion;
	}

	@Override
	public void deleteQuestion(int theId) {
		Session session = sessionFactory.getCurrentSession();
		Question question = session.byId(Question.class).load(theId);
		session.delete(question);
		
	}
	
}
