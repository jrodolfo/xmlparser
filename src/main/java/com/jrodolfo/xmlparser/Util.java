package com.jrodolfo.xmlparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rod Oliveira on 08-Sep-2016.
 */
public class Util {

    public static List<String> stringToList(final String listOfElements) {
        return Arrays.asList(listOfElements.split("\\s*,\\s*"));
    }

    public static long getTotalSizeOfFileInBytes(final String fileName) throws FileNotFoundException {
        URL url = MethodHandles.lookup().lookupClass().getClassLoader().getResource(fileName);
        File file = new File(url.toString().replace("file:/", ""));

        if (file != null) {
            return file.length();
        } else {
            throw new FileNotFoundException("File '" + fileName + "' was not found in the classpath.");
        }
    }
}
