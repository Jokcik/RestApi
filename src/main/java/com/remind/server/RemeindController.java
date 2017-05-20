package com.remind.server;

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

    @RequestMapping(value = "/specialities", method = RequestMethod.GET)
    @ResponseBody
    public List<Speciality> getAllSpecialises() {
        return specialityRepository.findAll();
    }

    @RequestMapping(value = "/specialities", method = RequestMethod.POST)
    @ResponseBody
    public Speciality getAllSpecialises(@RequestBody Speciality speciality) {
        return specialityRepository.saveAndFlush(speciality);
    }
}
