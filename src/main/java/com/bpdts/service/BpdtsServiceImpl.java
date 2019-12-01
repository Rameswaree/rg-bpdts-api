package com.bpdts.service;

import com.bpdts.domain.Bpdts;
import com.bpdts.dto.BpdtsDto;
import com.bpdts.repository.BpdtsDataRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BpdtsServiceImpl implements BpdtsService {

    static final String LONDON="London";
    private BpdtsDataRepository bpdtsDataRepository;

    @Autowired
    public BpdtsServiceImpl(BpdtsDataRepository bpdtsDataRepository) {
        this.bpdtsDataRepository = bpdtsDataRepository;
    }

    @Override
    public List<BpdtsDto> retrieveListOfUsers(Optional<String> city) {

        List<BpdtsDto> bpdtsDtoList = new ArrayList<>();
        List<Bpdts> bpdtsList = new ArrayList<>();
        if(city.equals(LONDON)){
            bpdtsList = bpdtsDataRepository.findBpdtsByCity(city);
        }

        return bpdtsDtoList;
    }
}
