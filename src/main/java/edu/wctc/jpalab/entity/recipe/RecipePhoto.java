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

import java.time.LocalDateTime;

@Entity
@Table(name = "photo", schema = "recipe")
@Getter
@Setter
public class RecipePhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "photo_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "photo_recipe_id")
    private Recipe recipe;

    @Column(name = "photo_filename")
    private String filename;

    @Column(name = "photo_caption")
    private String caption;

    @Column(name = "photo_datestamp")
    private LocalDateTime datestamp;

    @Column(name = "photo_visible")
    private String visible;
}
