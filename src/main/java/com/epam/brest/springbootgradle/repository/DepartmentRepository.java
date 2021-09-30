package com.epam.brest.springbootgradle.repository;

import com.epam.brest.springbootgradle.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

    /**
     * Return all departments
     **/
    List<Department> findAll();

    /**
     * Return one department by ID
     **/
    Optional<Department> findById(Long id);

    /**
     * Return one department by name
     **/
    List<Department> findByName(String name);

    /**
     * Create new department or update selected department
     **/
    Department save(Department department);

    /**
     * Delete selected department by ID
     **/
    void deleteById(Long id);
}
