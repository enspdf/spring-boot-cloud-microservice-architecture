package me.shackox.department.repository;

import org.springframework.stereotype.Repository;

import me.shackox.department.entity.Department;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentId(Long departmentId);

}
