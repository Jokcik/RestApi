package com.remind.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by User on 19.05.2017.
 */
@XmlRootElement
@Entity
@Table(name = "speciality")
public class Speciality {
    private int id;
    private String name;

    public Speciality(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Speciality() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
