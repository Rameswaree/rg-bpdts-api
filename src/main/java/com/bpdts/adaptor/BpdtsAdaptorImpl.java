package com.bpdts.adaptor;

import com.bpdts.dto.BpdtsDto;
import com.bpdts.dto.BpdtsDtoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class BpdtsAdaptorImpl implements BpdtsAdaptor {

    @Value("${prop.bpdts.latitude}")
    String londonLatitude;

    @Value("${prop.bpdts.longitude}")
    String londonLongitude;

    @Value("${prop.bpdts.url}")
    String bpdtsUrl;
    
    @Autowired
    private RestTemplate restTemplate;

    public BpdtsAdaptorImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<BpdtsDto> retrieveListOfUsers() {
        
        BpdtsDtoList bpdtsDtoListEntity = restTemplate.getForObject(bpdtsUrl,BpdtsDtoList.class);
        return bpdtsDtoListEntity.getBpdtsDtoList();
    }

    @Override
    public boolean distanceBetweenCoordinates(String latitude, String longitude) {
        boolean distanceFlag = false;

        if ((latitude == londonLatitude) && (longitude == londonLongitude)) {
            distanceFlag = true;
        }
        else {
            double theta = Double.valueOf(longitude) - Double.valueOf(londonLongitude);
            double dist = Math.sin(Math.toRadians(Double.valueOf(latitude))) * Math.sin(Math.toRadians(Double.valueOf(londonLatitude))) + Math.cos(Math.toRadians(Double.valueOf(latitude))) * Math.cos(Math.toRadians(Double.valueOf(londonLatitude))) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;

            if(dist<=50)
                distanceFlag = true;
        }
        return distanceFlag;
    }
}
