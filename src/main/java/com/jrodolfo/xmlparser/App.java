package com.jrodolfo.xmlparser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Properties;

/**
 * TODO: add comments
 *
 */
public class App 
{
    final Properties properties;
    final List<String> filesToParse;
    final List<String> nodesToMatch;
    final long thresholdFileSize;
    final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    public App() {
        properties = PropertyValues.getProperties();
        filesToParse = Util.stringToList(properties.getProperty("files.to.parse"));
        nodesToMatch = Util.stringToList(properties.getProperty("nodes.to.match"));
        thresholdFileSize = Long.parseLong(properties.getProperty("threshold.file.size"));
    }

    public static void main(String[] args)
    {
        App app = new App();
        XmlParser xmlParser;
        for (String fileName : app.filesToParse) {
            try {
                xmlParser = new XmlParser(fileName, app.nodesToMatch, app.thresholdFileSize);
                xmlParser.parse();
            } catch (FileNotFoundException e) {
                app.logger.error("FileNotFoundException message='" + e.getMessage() + "'");
                e.printStackTrace();
            }
        }
    }
}
