package com.softtech.springrestapi.experience_design.infraestructure.repositories;

import com.softtech.springrestapi.experience_design.domain.model.aggregates.Agency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AgencyRepository extends JpaRepository<Agency, Long>{
    @Query("SELECT CASE WHEN COUNT(m) > 0 THEN true ELSE false END FROM Agency m WHERE m.agencyDetails.name = :name")
    Boolean existsByName(@Param("name") String name);
}
