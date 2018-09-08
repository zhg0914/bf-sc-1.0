/**
 * 
 */
package com.ivy.stock.repository;

import com.ivy.stock.base.DAOInterface;
import com.ivy.stock.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends DAOInterface<User>{
    User findByUsername(String username);
}
