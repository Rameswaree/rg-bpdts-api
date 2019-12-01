package com.bpdts.service;

import com.bpdts.dto.BpdtsDto;
import com.bpdts.repository.BpdtsDataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class BpdtsServiceImpl implements BpdtsService {

    static final String LONDON="London";
    private BpdtsDataRepository bpdtsDataRepository;

    @Autowired
    public BpdtsServiceImpl(BpdtsDataRepository bpdtsDataRepository) {
        this.bpdtsDataRepository = bpdtsDataRepository;
    }

    @Override
    public List<BpdtsDto> retrieveListOfUsers() {

        List<BpdtsDto> bpdtsDtoList = new ArrayList<>();
        return bpdtsDtoList;
    }
}
