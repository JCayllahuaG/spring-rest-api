package com.softtech.springrestapi.experience_design.domain.model.aggregates;

import com.softtech.springrestapi.experience_design.domain.model.entities.Location;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "agencies")
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    private Manager manager;

    @OneToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;


}
