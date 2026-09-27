package edu.wctc.jpalab.entity.collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "collector", schema = "collection")
@Getter
@Setter
public class Collector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "collector_id")
    private Integer id;

    @Column(name = "collector_firstname")
    private String firstName;

    @Column(name = "collector_lastname")
    private String lastName;

    @Column(name = "collector_avatar")
    private String avatar;
}
