package com.gray.RabbitMQConsumer.repository;


import com.gray.RabbitMQConsumer.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Optional<Employee> findById(Long Id);

    List<Employee> findAll();

    Employee save(Employee employee);

    void deleteById(Long Id);

    void delete(Employee employee);

}
