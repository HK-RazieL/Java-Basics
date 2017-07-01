package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class URLParser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] urlInfo = reader.readLine().split("://");

        String protocol = urlInfo.length > 1 ? urlInfo[0] : "";
        String serverAndResource = urlInfo.length > 1 ? urlInfo[1] : urlInfo[0];
        int index = serverAndResource.indexOf("/");
        String server = index > 0 ? serverAndResource.substring(0, index) : serverAndResource;
        String resource = index > 0 ? serverAndResource.substring(index + 1) : "";

        System.out.println(String.format("[protocol] = \"%s\"%n[server] = \"%s\"%n[resource] = \"%s\"", protocol.trim(), server.trim(), resource.trim()));
    }
}
