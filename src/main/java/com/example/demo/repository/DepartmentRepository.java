package com.example.demo.repository;

import com.example.demo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
//    <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-cache</artifactId>
//        </dependency>
//<!-- https://mvnrepository.com/artifact/com.hazelcast/hazelcast-spring -->
//<dependency>
//    <groupId>com.hazelcast</groupId>
//    <artifactId>hazelcast-spring</artifactId>
//
//</dependency>
}
