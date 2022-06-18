package com.example.apidistrict.service;

import com.example.apidistrict.entity.District;
import com.example.apidistrict.repo.DistrictRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {

    final DistrictRepo districtRepo;

    public DistrictService(DistrictRepo districtRepo) {
        this.districtRepo = districtRepo;
    }

    public List<District> findAll (){
        return districtRepo.findAll();
    }
}
