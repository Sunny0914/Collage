package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Collage;

@Repository
public interface CollageRepository extends JpaRepository<Collage, Integer> {

}
