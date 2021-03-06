package com.jrodolfo.xmlparser.sax;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
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

        InputStream inputStream = MethodHandles.lookup().lookupClass().getClassLoader().getResourceAsStream(fileName);
        logger.debug("Parsing file " + fileName + " using SaxXmlParser");
        XmlDigester xmlDigester = new XmlDigester();

        try {
            root = xmlDigester.DigesterIt(inputStream);
            System.out.println(root.toString(nodesToMatch));
        } catch (IOException e) {
            logger.error("IOException message='" + e.getMessage() + "'");
            e.printStackTrace();
        } catch (SAXException e) {
            logger.error("SAXException message='" + e.getMessage() + "'");
            e.printStackTrace();
        }  catch (Exception e) {
            logger.error("Exception message='" + e.getMessage() + "'");
            e.printStackTrace();
        }

    }
}
