package com.utility.parser.parser.json;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;

public class JavaxJsonReader {

    public static void main(String[] args) {
        try {
            File jsonFile = ResourceUtils.getFile("classpath:input/myFile.json");
        } catch (FileNotFoundException e) {
            System.out.println("Exception occuured  - file does not exist in resources directory");

            e.printStackTrace();
        }
    }
}
