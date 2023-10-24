package com.softtech.springrestapi.experience_design.domain.model.aggregates;

import com.softtech.springrestapi.experience_design.domain.model.valueobjects.classes.AgencyNetwork;
import com.softtech.springrestapi.experience_design.domain.model.valueobjects.records.Person;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.domain.AbstractAggregateRoot;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
@Table(name = "managers")
public class Manager extends AbstractAggregateRoot<Manager> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Person person;

    @Embedded
    private AgencyNetwork agencyNetwork;
}
