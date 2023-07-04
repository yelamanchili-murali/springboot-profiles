package com.example.springbootprofiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProfileEntrypoint {

    @Value("${my.prop}")
    private String myProp;

    @Value("${spring.datasource.driver-class-name}")
    private String springDatasourceDriverClassName;

    @Value("${spring.datasource.url}")
    private String springDatasourceUrl;

    @Value("${spring.datasource.username}")
    private String springDatasourceUsername;

    @Value("${spring.datasource.password}")
    private String springDatasourcePassword;

    @GetMapping
    @ResponseBody
    public Map<String, String> home() {

        Map<String, String> profile = new HashMap<>();

        profile.put("myProp", myProp);
        profile.put("springDatasourceDriverClassName", springDatasourceDriverClassName);
        profile.put("springDatasourceUrl", springDatasourceUrl);
        profile.put("springDatasourceUsername", springDatasourceUsername);
        profile.put("springDatasourcePassword", springDatasourcePassword);

        return profile;
    }
}
