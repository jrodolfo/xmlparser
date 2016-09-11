package com.jrodolfo.xmlparser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.util.List;

/**
 * Created by Rod Oliveira on 08-Sep-2016.
 */
public class SaxXmlParser {

    private static TuStoreRequest tuStoreRequest = null;
    private static Root root = null;

    final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public void parse(String fileName, List<String> nodesToMatch) {

        URL url = MethodHandles.lookup().lookupClass().getClassLoader().getResource(fileName);
        File file = new File(url.toString().replace("file:/", ""));


        logger.debug("Parsing file " + file + " with SaxXmlParser");
        logger.debug("Nodes to match:");
        for (String nodeName : nodesToMatch) {
            logger.debug("nodeName=" + nodeName);
        }

        XmlDigester xmlDigester = new XmlDigester();
        try {
            root = xmlDigester.DigesterIt(file);
            logger.debug("root: " + root);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

    }
}
