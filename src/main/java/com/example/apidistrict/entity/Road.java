package com.example.apidistrict.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roads")
public class Road {
    @Id
    private String id;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private RoadStatus status;

    @ManyToOne
    @JoinColumn(name = "districtId", referencedColumnName = "id")
    private District district;
    @Column(updatable = false,insertable = false)
    private String districtId;
}
