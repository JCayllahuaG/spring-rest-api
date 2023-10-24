package com.softtech.springrestapi.experience_design.domain.model.valueobjects.classes;

import com.softtech.springrestapi.experience_design.domain.model.aggregates.Experience;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;

@Embeddable
public class Portfolio {
    @OneToMany(mappedBy = "agency", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Experience> experiences;


    public void addExperienceToPortfolio(Experience experience){
        this.experiences.add(experience);
    }
}
