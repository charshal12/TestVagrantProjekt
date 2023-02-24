package com.utils;

import Modal.Team;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class JacksonObjectMapper {
    public static final String TEST_INPUT_FOLDER = "inputJson";
    public static final String JSON_EXTENSION = ".json";

    public  Team getDataInObjectFromJson(String fileName) throws IOException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        String filePath = TEST_INPUT_FOLDER.concat("/").concat(fileName).concat(JSON_EXTENSION);
        InputStream inputStream = classLoader.getResourceAsStream(filePath);

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //convert json string to object
        Team team = objectMapper.readValue(inputStream, Team.class);
        /*System.out.println("Team Object : " + team.toString());*/
        return team;
    }
}
