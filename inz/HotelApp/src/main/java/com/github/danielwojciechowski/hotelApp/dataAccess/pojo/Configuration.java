package com.github.danielwojciechowski.hotelApp.dataAccess.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Daniel on 2014-11-14.
 */
@Entity
@Data
public class Configuration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;
    private String confValue;

}