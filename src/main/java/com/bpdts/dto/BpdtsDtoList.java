package com.bpdts.dto;

import java.util.ArrayList;
import java.util.List;

public class BpdtsDtoList {

    private List<BpdtsDto> bpdtsDtoList;

    public BpdtsDtoList(){
        bpdtsDtoList = new ArrayList<>();
    }

    public List<BpdtsDto> getBpdtsDtoList() {
        return bpdtsDtoList;
    }
}
