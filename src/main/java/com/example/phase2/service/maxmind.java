package com.example.phase2.service;

import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
    @Service
    public class maxmind {
        public String data() throws IOException {
            URL urlVariable= new URL("http://10.12.10.81:8080/ip");
            URLConnection urlConnection = urlVariable.openConnection();
            BufferedReader buffer = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String inputLine;
            String maxmindData = "";
            while ((inputLine = buffer.readLine()) != null) {
                maxmindData += inputLine;
            }

            buffer.close();
            return maxmindData ;
        }

    }

