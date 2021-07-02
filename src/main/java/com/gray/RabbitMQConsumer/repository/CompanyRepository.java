package com.gray.RabbitMQConsumer.repository;

import com.gray.RabbitMQConsumer.model.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CompanyRepository extends CrudRepository<Company, Long> {

    Company save(Company company);

    Optional<Company> findById(Long aLong);

    Iterable<Company> findAll();

    void deleteById(Long aLong);

    void delete(Company company);
}
