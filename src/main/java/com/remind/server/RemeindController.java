package com.remind.server;

import com.remind.entity.Speciality;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by User on 19.05.2017.
 */
@RestController
@RequestMapping("/remeind")
public class RemeindController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Speciality method() {
        return createMockSpeciality();
    }

    private Speciality createMockSpeciality() {
        return new Speciality(1, "fafasd");
    }
}
