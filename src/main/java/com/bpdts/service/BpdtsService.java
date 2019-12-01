package com.bpdts.service;

import com.bpdts.dto.BpdtsDto;

import java.util.List;
import java.util.Optional;

public interface BpdtsService{

    List<BpdtsDto> retrieveListOfUsers();
}
