package com.raj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.domain.Employee;

@Repository
public interface RabbitMQRepository extends JpaRepository<Employee, Long>{

}
