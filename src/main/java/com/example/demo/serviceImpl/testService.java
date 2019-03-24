package com.example.demo.serviceImpl;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class testService {

    public String getJsonData(String region){
        String jsonData="";
        JSONObject jobj = new JSONObject();
        jobj.put("region",region);
        jobj.put("siteName","test Site 1");
        jobj.put("siteAddress","113/114 Karam Ali");
        jobj.put("siteCity","Meerut");
        jobj.put("latitude","-22.234116");
        jobj.put("longitude","76.285431");

        JSONArray jsonArr = new JSONArray();
        JSONObject contactJson = new JSONObject();
        contactJson.put("contactName","test Contact 1");
        contactJson.put("contactEmail","contact123@gmal.com");
        contactJson.put("contactPhone","98760012");
        jsonArr.add(contactJson);

        jobj.put("contact",jsonArr);
        jsonData=jobj.toJSONString();
        return jsonData;
    }
}
