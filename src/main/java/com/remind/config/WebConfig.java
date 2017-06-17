package com.remind.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.remind.entity.Speciality;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.xml.Jaxb2RootElementHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 19.05.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.remind")
public class WebConfig extends WebMvcConfigurerAdapter{
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        converter.setGson(gson);

        converters.add(converter);


        converters.add(new Jaxb2RootElementHttpMessageConverter());

//        converters.add(new Jaxb2CollectionHttpMessageConverter<Collection>());
        Jaxb2RootElementHttpMessageConverter converter1 = new Jaxb2RootElementHttpMessageConverter();
    }
}
