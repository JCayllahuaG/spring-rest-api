package com.softtech.springrestapi.experience_design.domain.model.aggregates;

import com.softtech.springrestapi.experience_design.domain.model.valueobjects.classes.Gallery;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.classes.Itinerary;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.enums.ExperienceStatus;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.ExperienceData;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.Price;
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
@Table(name = "experiences")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ExperienceStatus status;

    @Embedded
    private ExperienceData data;

    @Embedded
    private Price price;

    @Embedded
    private Gallery gallery;

    @ManyToOne
    private Agency agency;

    @Embedded
    private Itinerary itinerary;


}
