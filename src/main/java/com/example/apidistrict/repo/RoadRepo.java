package com.example.apidistrict.repo;

import com.example.apidistrict.entity.Road;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoadRepo extends JpaRepository<Road, String>{
    List<Road> findByName(String name);
    List<Road> findByNameContaining(String name);;
}
