package com.bpdts.adaptor;

import com.bpdts.dto.BpdtsDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BpdtsAdaptorImpl implements BpdtsAdaptor {

    @Value("${prop.bpdts.latitude}")
    String londonLatitude;

    @Value("${prop.bpdts.longitude}")
    String londonLongitude;

    @Value("${prop.bpdts.url}")
    String bpdtsUrl;

    @Override
    public List<BpdtsDto> retrieveListOfUsers() {
        return null;
    }

    @Override
    public boolean distanceBetweenCoordinates(String latitude, String longitude) {
        boolean distanceFlag=false;

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
                distanceFlag= true;
        }
        return distanceFlag;
    }
}
