package com.example.apidistrict.service;

import com.example.apidistrict.entity.Road;
import com.example.apidistrict.repo.RoadRepo;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoadService {

    final RoadRepo roadRepo;

    public RoadService(RoadRepo roadRepo) {
        this.roadRepo = roadRepo;
    }

    public List<Road> findAll (){
        return roadRepo.findAll();
    }

    public Road save (Road road){
        return roadRepo.save(road);
    }

    public Map<String, Object> findAllByName(String name){
        Map<String, Object> response = new HashMap<>();
        List<Road> roadList = roadRepo.findByNameContaining(name);
        response.put("name", roadList);
        return response;
    }
}
