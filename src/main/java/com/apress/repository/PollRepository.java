package com.apress.repository;

import com.apress.domain.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



public interface PollRepository extends JpaRepository<Poll, Long> {





}
