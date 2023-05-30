package com.apress.repository;

import com.apress.domain.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



public interface OptionRepository extends JpaRepository<Option, Long> {

}
