package com.jrodolfo.xmlparser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.List;

/**
 * Created by joao.r.oliveira on 08-Sep-2016.
 */
public class DomXmlParser {

    final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public void parse(String fileName, List<String> nodesToMatch) {
        logger.debug("Parsing fileName='" + fileName + "' with DomXmlParser...");
        logger.debug("Nodes to match:");
        for (String nodeName : nodesToMatch) {
            logger.debug("nodeName='" + nodeName);
        }
    }
}
