package org.semen.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.semen.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
