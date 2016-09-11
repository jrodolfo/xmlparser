package com.jrodolfo.xmlparser;


import org.apache.commons.digester3.Digester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandles;

/**
 * Created by Rod Oliveira on 10-Sep-2016.
 */
public class XmlDigester {

    static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    public Root root = new Root();

    public Root DigesterIt(File file) throws IOException, SAXException
    {
        logger.debug("Parsing file " + file + " with DigesterIt");
        Digester digester = new Digester();
        digester.push(this);
        digester.addCallMethod("root/ns5:TuStoreRequest", "addTuStoreRequest", 17);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:Header/ns2:ID", 0);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:Header/ns2:Type", 1);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:Header/ns2:Version", 2);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:Header/ns2:Timestamp", 3);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:Header/ns2:Sender", 4);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:Header/ns2:Receiver", 5);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:MessageBody/ns2:Priority", 6);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:MessageBody/ns2:TuLine/ns2:TuDetail/ns2:Denomination", 7);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:MessageBody/ns2:TuLine/ns2:TuDetail/ns2:ValuableType", 8);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:MessageBody/ns2:TuLine/ns2:TuDetail/ns2:InventoryType", 9);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:MessageBody/ns2:TuLine/ns2:TuDetail/ns2:InventoryUnit", 10);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:MessageBody/ns2:TuLine/ns2:TuDetail/ns2:Quantity", 11);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:MessageBody/ns2:TuLine/ns2:TuDetail/ns2:Value", 12);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:MessageBody/ns2:TuLine/ns2:TuId", 13);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:MessageBody/ns5:SrcLoc", 14);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:MessageBody/ns5:DestLoc", 15);
        digester.addCallParam("root/ns5:TuStoreRequest/ns5:MessageBody/ns5:IsHoldOver", 16);
        digester.parse(file);
        return root;
    }

    public void addTuStoreRequest(
            String ns2ID,
            String ns2Type,
            String ns2Version,
            String ns2Timestamp,
            String ns2Sender,
            String ns2Receiver,
            String ns5Priority,
            String ns2Denomination,
            String ns2ValuableType,
            String ns2InventoryType,
            String ns2InventoryUnit,
            String ns2Quantity,
            String ns2Value,
            String ns2TuId,
            String ns5SrcLoc,
            String ns5DestLoc,
            String ns5IsHoldOver)
    {
        TuStoreRequest tuStoreRequest = new TuStoreRequest(ns2ID,
                ns2Type,
                ns2Version,
                ns2Timestamp,
                ns2Sender,
                ns2Receiver,
                ns5Priority,
                ns2Denomination,
                ns2ValuableType,
                ns2InventoryType,
                ns2InventoryUnit,
                ns2Quantity,
                ns2Value,
                ns2TuId,
                ns5SrcLoc,
                ns5DestLoc,
                ns5IsHoldOver);
        root.addTuStoreRequest(tuStoreRequest);
        logger.debug("tuStoreRequest added ns2ID=\"" + ns2ID + "\"");
    }

}
