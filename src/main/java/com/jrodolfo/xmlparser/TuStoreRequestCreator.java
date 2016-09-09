package com.jrodolfo.xmlparser;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;

import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.xml.sax.SAXException;


/**
 * Created by Rod Oliveira on 09-Sep-2016.
 */
public class TuStoreRequestCreator {

    /**
     * Creates a TuStoreRequest object
     * @param source - name of the XML file
     *
     * @throws SAXException
     * @throws IOException
     */
    public static TuStoreRequest createTuStoreRequest(String source) throws SAXException, IOException {
        TuStoreRequest result;


//        InputStream inputStream = TuStoreRequest.class.getClassLoader().getResourceAsStream(source);

        InputStream  inputStream = MethodHandles.lookup().lookupClass().getClassLoader().getResourceAsStream(source);

        DigesterLoader digesterLoader = DigesterLoader.newLoader(new TuStoreRequestModule());
        Digester digester = digesterLoader.newDigester();
        result = digester.parse(inputStream);
        return result;
    }

}
