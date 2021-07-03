package com.gray.RabbitMQConsumer.service;

// Alternative implementation using the @RabbitListener Annotation

import com.gray.RabbitMQConsumer.model.Company;
import com.gray.RabbitMQConsumer.repository.CompanyRepository;
import com.gray.RabbitMQConsumer.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.gray.RabbitMQConsumer.model.Employee;

@Component
public class RabbitMQConsumer {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    CompanyRepository companyRepository;

    @RabbitListener(queues = "${gray.rabbitmq.employeeQueueName}", containerFactory = "jsaFactory")
    public void receivedMessage(Employee employee) {
       System.out.println("Received Message From RabbitMQ: " + employee);
       Employee savedEmp = employeeRepository.save(employee);
       System.out.println("Employee saved to db::: " + savedEmp);
    }

    @RabbitListener(queues = "${gray.rabbitmq.companyQueueName}", containerFactory = "jsaFactory")
    public void receivedMessage(Company company) {
        System.out.println("Received Message From RabbitMQ: " + company);
        Company savedCo = companyRepository.save(company);
        System.out.println("Company saved to db::: " + savedCo);
    }

}