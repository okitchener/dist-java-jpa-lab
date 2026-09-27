package edu.wctc.jpalab.entity.recipe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "chef", schema = "recipe")
@Getter
@Setter
public class Chef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chef_id")
    private Integer id;

    @Column(name = "chef_firstname")
    private String firstName;

    @Column(name = "chef_lastname")
    private String lastName;

    @Column(name = "chef_avatar")
    private String avatar;
}
