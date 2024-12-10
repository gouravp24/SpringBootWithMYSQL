package com.igr.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igr.jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
