package com.jrodolfo.xmlparser.dom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.util.List;

/**
 * Created by Rod Oliveira on 08-Sep-2016.
 */
public class DomXmlParser {

    final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public void parse(String fileName, List<String> nodesToMatch) {

        InputStream inputStream = MethodHandles.lookup().lookupClass().getClassLoader().getResourceAsStream(fileName);
        logger.debug("Parsing file " + fileName + " using DomXmlParser");

        try {
            Document xmlDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream);
            xmlDocument.getDocumentElement().normalize();
            NodeList nodeList;
            System.out.println("");
            for (String nodeName : nodesToMatch) {
                nodeList = xmlDocument.getElementsByTagName(nodeName);
                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    System.out.println("Node \"" + nodeName + "\" found with value \"" + node.getTextContent() + "\"");
                }
            }
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
