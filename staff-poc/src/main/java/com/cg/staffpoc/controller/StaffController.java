package com.cg.staffpoc.controller;

import com.cg.staffpoc.entity.Staff;
import com.cg.staffpoc.service.StaffService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/staff")
public class StaffController {
    private final StaffService staffService;

    // Constructor injection
    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/2023")
    public ResponseEntity<List<Staff>> getStaffJoinedIn2023WithCriteria() {
        int year = 2023;
        double salaryThreshold = 30000.0;
        List<Staff> staffList = staffService.findStaffByCriteria(year, salaryThreshold);
        // Filter staff assigned to more than a single project
        staffList = staffList.stream()
                .filter(staff -> staff.getProjects().size() > 1)
                .collect(Collectors.toList());

        return new ResponseEntity<>(staffList, HttpStatus.OK);
    }

}

