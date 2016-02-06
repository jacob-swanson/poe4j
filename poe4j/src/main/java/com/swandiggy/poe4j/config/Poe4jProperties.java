package com.swandiggy.poe4j.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Jacob Swanson
 * @since 1/16/2016
 */
@Data
@ConfigurationProperties(prefix = "poe4j")
public class Poe4jProperties {

    private String ggpk;
    private String[] ggpkLocations = {"C:\\Program Files (x86)\\Steam\\steamapps\\common\\Path of Exile\\Content.ggpk"};

}
