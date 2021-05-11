package com.drs.test.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.drs.test.demo.Entities.User;

public interface CRUDRepo extends CrudRepository<User, Long> {

}
