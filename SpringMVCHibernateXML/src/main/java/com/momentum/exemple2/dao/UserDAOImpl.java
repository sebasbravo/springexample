package com.momentum.exemple2.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.momentum.exemple2.model.User;

public class UserDAOImpl implements UserDAO {
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>)sessionFactory.getCurrentSession()
								.createCriteria(User.class)
								.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();		
		return listUser;
	}

}
