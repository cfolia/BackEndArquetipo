package com.spring.crud.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table
public class SportsIcon implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String specialName;
    private String sports;
    private int age;
    private boolean olampian;

}