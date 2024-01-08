package com.cg.staffpoc.service;

import com.cg.staffpoc.entity.Staff;
import com.cg.staffpoc.repository.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    // Constructor injection
    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> findStaffByCriteria(int year, double salary) {
        return staffRepository.findByJoinDateYearAndSalaryGreaterThan(year, salary);
    }

}

