package org.springframework.samples.petclinic.sfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jt on 2019-02-16.
 */
@Configuration
public class YannyConfig {

    @Bean
    YannyWordProducer laurelWordProducer(){
        return new YannyWordProducer();
    }
}
