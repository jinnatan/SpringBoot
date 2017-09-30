package com.jt.boot.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jt.boot.test.models.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{

}
