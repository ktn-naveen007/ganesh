package com.jaiganesh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaiganesh.entities.Users;
@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

	public Users findByUsernameAndPassword(String username, String password);
}
