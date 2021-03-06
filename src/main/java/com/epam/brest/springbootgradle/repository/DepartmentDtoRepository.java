package com.epam.brest.springbootgradle.repository;

import com.epam.brest.springbootgradle.entity.DepartmentDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentDtoRepository extends CrudRepository<DepartmentDto, Long> {

    /**
     * Return all departments with average salary
     **/
    @Query(value = "SELECT d.id, d.name, AVG(e.salary) AS avg_salary, COUNT(e.id) AS number_of_employees FROM " +
            "department d LEFT JOIN employee e ON d.id = e.department_id GROUP BY d.id, d.name", nativeQuery = true)
    List<DepartmentDto> findAll();
}
