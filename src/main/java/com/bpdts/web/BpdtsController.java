package com.bpdts.web;

import com.bpdts.dto.BpdtsDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BpdtsController{

        @GetMapping("/instructions")
        public ResponseEntity<BpdtsDto> getUserList() {

            BpdtsDto bpdtsDto = null;
            try{
                bpdtsDto = new BpdtsDto();
            }catch(Exception e){

                return new ResponseEntity(null, HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity(bpdtsDto, HttpStatus.OK);
        }
}
