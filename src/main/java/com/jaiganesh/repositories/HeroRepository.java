package com.jaiganesh.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jaiganesh.entities.Employee;
import com.jaiganesh.entities.Hero;
@Repository
public interface HeroRepository extends JpaRepository<Hero, Integer> {
	@Query(nativeQuery=true,value="select  * from heros")
	public List<Hero> getHerosName();
}
