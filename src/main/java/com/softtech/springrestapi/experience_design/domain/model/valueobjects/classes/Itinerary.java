package com.softtech.springrestapi.experience_design.domain.model.valueobjects.classes;

import com.softtech.springrestapi.experience_design.domain.model.entities.ItineraryItem;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import java.util.List;

@Embeddable
public class Itinerary {
    @OneToMany(mappedBy = "experience", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ItineraryItem> itineraryItems;
}
