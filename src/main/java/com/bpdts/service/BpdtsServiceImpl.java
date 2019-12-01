package com.bpdts.service;

import com.bpdts.dto.BpdtsDto;
import com.bpdts.repository.UserDataRepository;

import java.util.ArrayList;
import java.util.List;

public class BpdtsServiceImpl implements BpdtsService {

    static final String LONDON="London";
    private BpdtsDataRepository bpdtsDataRepository;

    @Override
    public List<BpdtsDto> retrieveListOfUsers() {

        List<BpdtsDto> bpdtsDtoList = new ArrayList<>();


        return bpdtsDtoList;
    }
}
