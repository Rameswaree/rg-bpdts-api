package com.bpdts.service;

import com.bpdts.adaptor.BpdtsAdaptor;
import com.bpdts.dto.BpdtsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BpdtsServiceImpl implements BpdtsService {

    static final String LONDON="London";
    private BpdtsAdaptor bpdtsAdaptor;

    @Autowired
    public BpdtsServiceImpl(BpdtsAdaptor bpdtsAdaptor){
        this.bpdtsAdaptor = bpdtsAdaptor;
    }

    @Override
    public List<BpdtsDto> retrieveListOfUsers() {

        List<BpdtsDto> bpdtsDtoList = new ArrayList<>();
        List<BpdtsDto> bpdtsDtos = bpdtsAdaptor.retrieveListOfUsers().stream().filter(bpdtsDto-> bpdtsDto.getCity().equalsIgnoreCase(LONDON) && bpdtsAdaptor.distanceBetweenCoordinates(bpdtsDto.getLatitude(), bpdtsDto.getLongitude())).collect(Collectors.toList());

        if(bpdtsDtos !=null && bpdtsDtos.size() > 0){
             bpdtsDtoList.addAll(bpdtsDtos);
        }
        return bpdtsDtoList;
    }
}
