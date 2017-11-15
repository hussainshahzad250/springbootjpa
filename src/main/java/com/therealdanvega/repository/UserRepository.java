package com.therealdanvega.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.therealdanvega.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

	

}
