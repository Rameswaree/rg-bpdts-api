package com.bpdts.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BpdtsDtoList {

    private List<BpdtsDto> bpdtsDtoList;

    public BpdtsDtoList(){
        bpdtsDtoList = new ArrayList<>();
    }

    public List<BpdtsDto> getBpdtsDtoList() {
        return bpdtsDtoList;
    }
}
