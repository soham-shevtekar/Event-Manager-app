package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Attendee.Event;

public interface EventRepo extends JpaRepository<Event, Long>{

}
