package com.softtech.springrestapi.experience_design.domain.model.entities;

import com.softtech.springrestapi.experience_design.domain.model.aggregates.Agency;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;
    private String city;
    private Double latitude;
    private Double longitude;


}
