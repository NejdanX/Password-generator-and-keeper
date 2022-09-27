package com.nejdangroup.pgk.repositories;

import com.nejdangroup.pgk.models.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface ResourceRepository extends JpaRepository<Resource, Long> {

    @Query("SELECT r FROM Resource r WHERE r.name = :name")
    Optional<Resource> findByName(@Param("name") String name);
}
