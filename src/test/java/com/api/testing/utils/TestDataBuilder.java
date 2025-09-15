package com.api.testing.utils;


import com.api.testing.pojos.AddPlaceRequest;
import com.api.testing.pojos.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDataBuilder {
    public static AddPlaceRequest createValidAddPlaceRequest()
    {
        AddPlaceRequest addPlaceRequest=new AddPlaceRequest();
        Location location=new Location();
        location.setLat(-38.383494);
        location.setLng(33.427362);
        addPlaceRequest.setLocation(location);
        addPlaceRequest.setAccuracy(50);
        addPlaceRequest.setName("Keeladi");
        addPlaceRequest.setPhone_number("1234567890");
        addPlaceRequest.setAddress("99, Murugan Street");
        List<String> typesList=new ArrayList<>();
        typesList.add("Conjuring");
        typesList.add("Manirathnam");
        addPlaceRequest.setTypes(typesList);
        addPlaceRequest.setWebsite("http://google.com");
        addPlaceRequest.setLanguage("Tamil");
        return addPlaceRequest;
    }

    public static Map<String, Object> createInvalidAddPlacePayload() {
        Map<String, Object> invalidPayload = new HashMap<>();
        invalidPayload.put("accuracy", 50);
        return invalidPayload;
    }
    public static Map<String, Object> createDeletePlacePayload(String placeId) {
        Map<String, Object> payload = new HashMap<>();
        payload.put("place_id", placeId);
        return payload;
    }
}
