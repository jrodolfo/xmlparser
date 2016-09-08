package com.jrodolfo.xmlparser;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * Created by joao.r.oliveira on 08-Sep-2016.
 */
public class XmlParser {

    final String fileName;
    final long fileSizeInBytes;
    final long thresholdFileSize;
    final List<String> nodesToMatch;

    public XmlParser(String fileName, List<String> nodesToMatch, long thresholdFileSize) throws FileNotFoundException {
        this.fileName = fileName;
        this.fileSizeInBytes = Util.getTotalSizeOfFileInBytes(fileName);
        this.thresholdFileSize = thresholdFileSize;
        this.nodesToMatch = nodesToMatch;
    }

    public void parse() {
        if (fileSizeInBytes <= thresholdFileSize) {
            new DomXmlParser().parse(fileName, nodesToMatch);
        } else {
            new SaxXmlParser().parse(fileName, nodesToMatch);
        }
    }
}
