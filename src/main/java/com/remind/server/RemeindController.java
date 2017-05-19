package com.remind.server;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by User on 19.05.2017.
 */
@Controller
@RequestMapping("/remeind")
public class RemeindController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String method(ModelMap modelMap) {
        return "Hello!";
    }
}
