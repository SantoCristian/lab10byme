package it.unibo.mvc;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public final class ClassFileReader {
    public static final String SEP = File.separator;
    public static final String FILE_STRING = "src/main/resources/config.yml";

    private int max;
    private int min;
    private int attempt;

    public ClassFileReader(){
        try (
            final InputStreamReader r = new InputStreamReader(ClassLoader.getSystemResourceAsStream(FILE_STRING))
            final BufferedReader b = new BufferedReader(r)
        ) {
            final String s = b.readLine();
            final String[] arrStrings = s.split(":");
        }

        this.max = arrStrings[0];
        this.min = arrStrings[1];
        this.attempt = arrStrings[2];
    }

    //metodi get



}
  