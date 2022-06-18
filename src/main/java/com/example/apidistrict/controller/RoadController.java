package com.example.apidistrict.controller;

import com.example.apidistrict.entity.District;
import com.example.apidistrict.entity.Road;
import com.example.apidistrict.service.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1")
public class RoadController {
    @Autowired
    RoadService roadService;


    @RequestMapping(path = "/roads/name", method = RequestMethod.GET)
    public ResponseEntity<?> findAllByName (@RequestParam String name){
        return ResponseEntity.ok(roadService.findAllByName(name));
    }

    @RequestMapping(path = "/roads", method = RequestMethod.GET)
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(roadService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST, path = "/roads")
    public ResponseEntity<Road> create(@RequestBody Road road) {
        road.setCreatedAt(LocalDateTime.now());
        return ResponseEntity.ok(roadService.save(road));
    }
}
