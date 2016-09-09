package com.jrodolfo.xmlparser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.util.List;

/**
 * Created by Rod Oliveira on 08-Sep-2016.
 */
public class SaxXmlParser {

    final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public void parse(String fileName, List<String> nodesToMatch) {

        URL url = MethodHandles.lookup().lookupClass().getClassLoader().getResource(fileName);
        File xmlFile = new File(url.toString().replace("file:/", ""));
        logger.debug("Parsing file " + xmlFile + " with SaxXmlParser");
        logger.debug("Nodes to match:");
        for (String nodeName : nodesToMatch) {
            logger.debug("nodeName='" + nodeName);
        }
    }
}
