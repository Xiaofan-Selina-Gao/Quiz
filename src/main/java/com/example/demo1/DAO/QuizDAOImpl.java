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

import com.example.demo1.model.Quiz;

@Repository
public class QuizDAOImpl implements QuizDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Quiz> getAllQuizs() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Quiz> cq = cb.createQuery(Quiz.class);
		Root<Quiz> root = cq.from(Quiz.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		List<Quiz> res = query.getResultList();
		return res;
	}

}
