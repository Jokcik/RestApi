package com.remind.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by User on 25.05.2017.
 */
@XmlRootElement(name = "specialities")
public class Specialities {

    private List<Speciality> specialities;

    @XmlElement(name = "speciality")
    public List<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(List<Speciality> specialities) {
        this.specialities = specialities;
    }
}
