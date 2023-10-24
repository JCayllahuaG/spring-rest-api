package com.softtech.springrestapi.experience_design.domain.model.entities;

import com.softtech.springrestapi.experience_design.domain.model.aggregates.Experience;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.enums.ImageHierarchy;
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
@Table(name = "experience_images")
public class ExperienceImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    private String description;

    private ImageHierarchy imageHierarchy;

    @ManyToOne
    private Experience experience;
}
