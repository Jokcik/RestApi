package com.remeind.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by User on 19.05.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.remeind")
public class WebConfig extends WebMvcConfigurerAdapter{

}
