package edu.wctc.jpalab.entity.recipe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "recipe", schema = "recipe")
@Getter
@Setter
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "recipe_chef_id")
    private Chef chef;

    @Column(name = "recipe_title")
    private String title;

    @Column(name = "recipe_description")
    private String description;
}
