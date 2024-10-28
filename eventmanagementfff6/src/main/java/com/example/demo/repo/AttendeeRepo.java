package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Attendee.AttendeeEntity;

public interface AttendeeRepo extends JpaRepository<AttendeeEntity, Long> {

    List<AttendeeEntity> findByCategory(String category);

    List<AttendeeEntity> findByname(String name);
    //void deleteById(Long id);
}
