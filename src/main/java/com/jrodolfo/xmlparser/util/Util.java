package com.jrodolfo.xmlparser.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rod Oliveira on 08-Sep-2016.
 */
public class Util {

    static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static List<String> stringToList(final String listOfElements) {
        return Arrays.asList(listOfElements.split("\\s*,\\s*"));
    }

    /**
     *
     * @param fileName
     * @return -1 if something goes wrong, otherwise it returns the size of the file in number of the bytes
     * @throws FileNotFoundException
     */
    public static long getTotalSizeOfFileInBytes(final String fileName) throws FileNotFoundException {
        long fileSize = -1;
        InputStream inputStream = MethodHandles.lookup().lookupClass().getClassLoader().getResourceAsStream(fileName);
        try {
            fileSize = inputStream.available();
            logger.debug("File " + fileName + " has " + fileSize + " bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileSize;
    }
}
