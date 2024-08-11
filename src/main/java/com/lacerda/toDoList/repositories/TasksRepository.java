package com.lacerda.toDoList.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lacerda.toDoList.model.Tasks;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Long>{
	
	List<Tasks> findTaskByUserId(Long id);
	List<Tasks> findTaskByData(LocalDate date);
	
}
