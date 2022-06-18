package com.example.apidistrict.repo;

import com.example.apidistrict.entity.District;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DistrictRepo extends JpaRepository<District, String>{
    List<District> findByName(String name);
}
