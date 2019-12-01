package com.bpdts.service;

import com.bpdts.adaptor.BpdtsAdaptor;
import com.bpdts.dto.BpdtsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        List<BpdtsDto> bpdtsDtos = bpdtsAdaptor.retrieveListOfUsers();

        if(bpdtsDtos !=null && bpdtsDtos.size() > 0){
            for(BpdtsDto bpdtsDto: bpdtsDtos){
                if(bpdtsDto.getCity().equalsIgnoreCase(LONDON) ||
                        bpdtsAdaptor.distanceBetweenCoordinates(bpdtsDto.getLatitude(), bpdtsDto.getLongitude())){
                    bpdtsDtoList.add(bpdtsDto);
                }
            }
        }
        return bpdtsDtoList;
    }
}
