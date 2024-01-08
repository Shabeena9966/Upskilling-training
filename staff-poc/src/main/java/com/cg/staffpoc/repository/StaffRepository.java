package com.cg.staffpoc.repository;

import com.cg.staffpoc.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
    @Query(value = "SELECT * FROM staff WHERE YEAR(join_date) = :year AND salary > :salary", nativeQuery = true)
    List<Staff> findByJoinDateYearAndSalaryGreaterThan(@Param("year") int year, @Param("salary") double salary);
}
