package com.example.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.college.entity.College;

public interface CollegeRepo extends JpaRepository<College, Integer> {

}
