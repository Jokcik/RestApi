package com.remind.server;

import com.remind.entity.Specialities;
import com.remind.entity.Speciality;
import com.remind.repository.SpecialityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by User on 19.05.2017.
 */
@RestController
@RequestMapping("/api")
public class RemeindController {

    @Autowired
    private SpecialityRepository specialityRepository;

    @RequestMapping(value = "/specialities", method = RequestMethod.GET, produces = "!application/json")
    @ResponseBody
    public Specialities getAllSpecialisesXml() {
        Specialities specialities = new Specialities();
        specialities.setSpecialities(specialityRepository.findAll());
        return specialities;
    }

    @RequestMapping(value = "/specialities", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Speciality> getAllSpecialisesJson() {
        return specialityRepository.findAll();
    }

    @RequestMapping(value = "/specialities/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Speciality getSpecialisesById(@PathVariable("id") int id) {
        return specialityRepository.findOne(id);
    }

    @RequestMapping(value = "/specialities", method = RequestMethod.POST)
    @ResponseBody
    public Speciality SaveSpecialises(@RequestBody Speciality speciality) {
        return specialityRepository.saveAndFlush(speciality);
    }

    @RequestMapping(value = "/specialities/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Speciality UpdateSpecialises(@PathVariable("id") int id, @RequestBody Speciality speciality) {
        speciality.setId(id);
        return specialityRepository.saveAndFlush(speciality);
    }

    @RequestMapping(value = "/specialities/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void getAllSpecialises(@PathVariable int id) {
        specialityRepository.delete(id);
    }
}
