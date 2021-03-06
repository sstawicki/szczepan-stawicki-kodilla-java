package com.kodilla.hibarnate.manytomany.dao;

import com.kodilla.hibarnate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> retrieveEmployeesLastname(@Param("LASTNAME") String lastname);

    @Query
    List<Employee> findMatchingName(@Param("NAME") String key);
}
