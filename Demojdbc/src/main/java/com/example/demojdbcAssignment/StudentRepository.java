package com.example.demojdbcAssignment;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface StudentRepository extends JpaRepositoryImplementation<Student, Integer> {

}
