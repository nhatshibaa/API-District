package com.example.apidistrict.controller;

import com.example.apidistrict.service.DistrictService;
import com.example.apidistrict.service.RoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DistrictController {
    @Autowired
    DistrictService districtService;

    @RequestMapping(path = "/district", method = RequestMethod.GET)
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(districtService.findAll());
    }
}
