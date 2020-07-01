package org.springframework.samples.petclinic.web;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringJUnitWebConfig(locations = {"classpath:spring/mvc-test-config.xml", "classpath:spring/mvc-core-config.xml"})
class OwnerControllerTest {

    @Autowired
    OwnerController ownerController;

    @Autowired
    ClinicService clinicService;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(ownerController).build();
    }

    MockMvc mockMvc;


    @Test
    void tempTest() {

        //ownerController
    }

    @Test
    void initCreationForm() throws Exception {
        mockMvc.perform(get("/owners/new"))
                .andExpect(status().isOk())
        ;
    }
}