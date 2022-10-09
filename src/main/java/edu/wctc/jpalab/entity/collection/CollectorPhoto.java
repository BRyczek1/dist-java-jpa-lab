package edu.wctc.jpalab.entity.collection;

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
@Table(name = "photo", schema = "collection")
public class CollectorPhoto {
    @Id
    @Column(name = "photo_id")
    private int id;
    @Column(name = "photo_collector_id")
    private int collectorId;
    @Column(name = "photo_filename")
    private String fileName;
    @Column(name = "photo_datestamp")
    private LocalDateTime datestamp;
    @Column(name = "photo_visible")
    private int visible;
}
