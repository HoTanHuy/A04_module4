package com.codegym.furama.config;

import com.codegym.furama.formatter.DateFomatter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configurable
public class ConfigFomatter implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new DateFomatter());
//        registry.addConverter(new DateConverter());
    }
}
