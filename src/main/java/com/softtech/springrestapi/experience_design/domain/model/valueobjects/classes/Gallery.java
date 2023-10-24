package com.softtech.springrestapi.experience_design.domain.model.valueobjects.classes;

import com.softtech.springrestapi.experience_design.domain.model.entities.ExperienceImage;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.List;

@Embeddable
public class Gallery{

    @OneToMany(mappedBy = "experience", orphanRemoval = true)
    private List<ExperienceImage> images;
}
