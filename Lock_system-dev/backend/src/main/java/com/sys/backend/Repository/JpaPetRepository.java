package com.sys.backend.Repository;

import com.sys.backend.Entity.Entity_demo;
import com.sys.backend.Entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaPetRepository extends JpaRepository<Pet, Integer> {
}
