package edu.wctc.jpalab.entity.recipe;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "photo", schema = "recipie")
public class RecipePhoto {
    @Id
    @Column(name = "photo_id")
    private int id;
    @Column(name = "photo_recipie_id")
    private int photoRecipieId;
    @Column(name = "photo_filename")
    private String fileName;
    @Column(name = "photo_caption")
    private String caption;
    @Column(name = "photo_datestamp")
    private LocalDateTime dateStamp;
    @Column(name = "photo_visible")
    private int visible;

}
