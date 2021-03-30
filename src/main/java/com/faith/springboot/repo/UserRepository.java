package com.faith.springboot.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.springboot.entity.User;

//extends from crud repository class to get all CRUD opertions
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	@Transactional
	@Modifying
	@Query("from User where userName=?1 and passWord=?2")
	public User findByUsernameAndPassword(String fullname, String password);
}
