package com.softtech.springrestapi.experience_design.infraestructure.repositories;

import com.softtech.springrestapi.experience_design.domain.model.aggregates.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IManagerRepository extends JpaRepository<Manager, Long> {

    @Query("SELECT CASE WHEN COUNT(m) > 0 THEN true ELSE false END FROM Manager m WHERE m.person.dni = :dni")
    Boolean existsByDni(@Param("dni") String dni);
}
