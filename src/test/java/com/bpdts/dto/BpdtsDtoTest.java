package com.bpdts.dto;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BpdtsDtoTest {

    BpdtsDto bpdtsDto = new BpdtsDto();

    @Test
    public void shouldReturnFirstName()
    {
        bpdtsDto.setFirst_name("Reemu");
        assertThat(bpdtsDto.getFirst_name(), is("Reemu"));
    }
}