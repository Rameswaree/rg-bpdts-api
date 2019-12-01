package com.bpdts.web;

import com.bpdts.dto.BpdtsDto;
import com.bpdts.service.BpdtsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BpdtsController{

        private BpdtsServiceImpl bpdtsService;

        @Autowired
        public BpdtsController(BpdtsServiceImpl bpdtsService){
            this.bpdtsService = bpdtsService;
        }

        @GetMapping(value = {"/instructions/{city}", "/instructions"})
        public ResponseEntity<List<BpdtsDto>> getUserList(@PathVariable Optional<String> city) {

            List<BpdtsDto> bpdtsDto = null;
            try{
                bpdtsDto = bpdtsService.retrieveListOfUsers(city);
            }catch(Exception e){
                return new ResponseEntity(null, HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity(bpdtsDto, HttpStatus.OK);
        }
}
