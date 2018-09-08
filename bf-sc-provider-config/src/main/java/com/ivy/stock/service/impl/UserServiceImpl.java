package com.ivy.stock.service.impl;

import com.ivy.stock.repository.UserRepository;
import com.ivy.stock.base.BaseService;
import com.ivy.stock.base.DAOInterface;
import com.ivy.stock.model.User;
import com.ivy.stock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Administrator on 8/14 0014.
 */
@Transactional
@Service
public class UserServiceImpl  extends BaseService<User> implements UserService{

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;


    @Override
    protected EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    protected DAOInterface<User> getDAOInterface() {
        return userRepository;
    }
}
