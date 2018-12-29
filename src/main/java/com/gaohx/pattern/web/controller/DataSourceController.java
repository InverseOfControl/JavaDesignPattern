package com.gaohx.pattern.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataSourceController {

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/getDataSourceName/{name}")
    public Object getDataSourceName(@PathVariable String name) {
        JdbcTemplate jdbcTemplate = applicationContext.getBean(name,JdbcTemplate.class);
        return jdbcTemplate.queryForMap("SELECT * FROM offer_ext WHERE offer_ext_id = 114000277483");
    }
}
