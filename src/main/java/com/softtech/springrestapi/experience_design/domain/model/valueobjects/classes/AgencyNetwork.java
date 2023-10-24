package com.softtech.springrestapi.experience_design.domain.model.valueobjects.classes;

import com.softtech.springrestapi.experience_design.domain.model.aggregates.Agency;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.List;

@Embeddable
public class AgencyNetwork {

    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Agency> agencies;


    public void expandAgencyNetwork(Agency agency){
        this.agencies.add(agency);
    }


}
