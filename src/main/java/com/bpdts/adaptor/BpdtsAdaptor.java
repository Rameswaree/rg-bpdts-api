package com.bpdts.adaptor;

import com.bpdts.dto.BpdtsDto;

import java.util.List;

public interface BpdtsAdaptor {

    List<BpdtsDto> retrieveListOfUsers();

    boolean distanceBetweenCoordinates(String latitude, String longitude);
}
