package com.jrodolfo.xmlparser.sax;

import java.util.List;

/**
 * Created by Rod Oliveira on 09-Sep-2016.
 */
public class TuStoreRequest {

    String ns2ID;
    String ns2Type;
    String ns2Version;
    String ns2Timestamp;
    String ns2Sender;
    String ns2Receiver;
    String ns5Priority;
    String ns2Denomination;
    String ns2ValuableType;
    String ns2InventoryType;
    String ns2InventoryUnit;
    String ns2Quantity;
    String ns2Value;
    String ns2TuId;
    String ns5SrcLoc;
    String ns5DestLoc;
    String ns5IsHoldOver;

    public TuStoreRequest(String ns2ID,
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
                          String ns5IsHoldOver) {
        this.ns2ID = ns2ID;
        this.ns2Type = ns2Type;
        this.ns2Version = ns2Version;
        this.ns2Timestamp = ns2Timestamp;
        this.ns2Sender = ns2Sender;
        this.ns2Receiver = ns2Receiver;
        this.ns5Priority = ns5Priority;
        this.ns2Denomination = ns2Denomination;
        this.ns2ValuableType = ns2ValuableType;
        this.ns2InventoryType = ns2InventoryType;
        this.ns2InventoryUnit = ns2InventoryUnit;
        this.ns2Quantity = ns2Quantity;
        this.ns2Value = ns2Value;
        this.ns2TuId = ns2TuId;
        this.ns5SrcLoc = ns5SrcLoc;
        this.ns5DestLoc = ns5DestLoc;
        this.ns5IsHoldOver = ns5IsHoldOver;
    }

    @Override
    public String toString() {
        return "TuStoreRequest{" +
                "ns2ID=\"" + ns2ID + '\"' +
                ", ns2Type=\"" + ns2Type + '\"' +
                ", ns2Version=\"" + ns2Version + '\"' +
                ", ns2Timestamp=\"" + ns2Timestamp + '\"' +
                ", ns2Sender=\"" + ns2Sender + '\"' +
                ", ns2Receiver=\"" + ns2Receiver + '\"' +
                ", ns5Priority=\"" + ns5Priority + '\"' +
                ", ns2Denomination=\"" + ns2Denomination + '\"' +
                ", ns2ValuableType=\"" + ns2ValuableType + '\"' +
                ", ns2InventoryType=\"" + ns2InventoryType + '\"' +
                ", ns2InventoryUnit=\"" + ns2InventoryUnit + '\"' +
                ", ns2Quantity=\"" + ns2Quantity + '\"' +
                ", ns2Value=\"" + ns2Value + '\"' +
                ", ns2TuId=\"" + ns2TuId + '\"' +
                ", ns5SrcLoc=\"" + ns5SrcLoc + '\"' +
                ", ns5DestLoc=\"" + ns5DestLoc + '\"' +
                ", ns5IsHoldOver=\"" + ns5IsHoldOver + '\"' +
                '}';
    }

    /**
     * Overloading toString to allow printing only the content of some nodes
     * @param nodesToMatch we print only the content of these nodes
     * @return a string with a list of nodes name and nodes value
     */
    public String toString(List<String> nodesToMatch) {
        String result = "";
        for (String elementName : nodesToMatch) {
            try {
                result += getValue(elementName);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        return result;
    }

    String getValue(String elementName) {
        String elementValue = "";
        switch (elementName.toLowerCase()) {
            case "ns2:id"            : elementValue = getNs2ID();            break;
            case "ns2:type"          : elementValue = getNs2Type();          break;
            case "ns2:version"       : elementValue = getNs2Version();       break;
            case "ns2:timestamp"     : elementValue = getNs2Timestamp();     break;
            case "ns2:sender"        : elementValue = getNs2Sender();        break;
            case "ns2:receiver"      : elementValue = getNs2Receiver();      break;
            case "ns5:priority"      : elementValue = getNs5Priority();      break;
            case "ns2:denomination"  : elementValue = getNs2Denomination();  break;
            case "ns2:valuabletype"  : elementValue = getNs2ValuableType();  break;
            case "ns2:inventorytype" : elementValue = getNs2InventoryType(); break;
            case "ns2:inventoryunit" : elementValue = getNs2InventoryUnit(); break;
            case "ns2:quantity"      : elementValue = getNs2Quantity();      break;
            case "ns2:value"         : elementValue = getNs2Value();         break;
            case "ns2:tuid"          : elementValue = getNs2TuId();          break;
            case "ns5:srcloc"        : elementValue = getNs5SrcLoc();        break;
            case "ns5:destloc"       : elementValue = getNs5DestLoc();       break;
            case "ns5:isholdover"    : elementValue = getNs5IsHoldOver();    break;
        }
        return "Node \"" + elementName + "\" found with value \"" + elementValue + "\"\n";
    }

    public String getNs2ID() {
        return ns2ID;
    }

    public String getNs2Type() {
        return ns2Type;
    }

    public String getNs2Version() {
        return ns2Version;
    }

    public String getNs2Timestamp() {
        return ns2Timestamp;
    }

    public String getNs2Sender() {
        return ns2Sender;
    }

    public String getNs2Receiver() {
        return ns2Receiver;
    }

    public String getNs5Priority() {
        return ns5Priority;
    }

    public String getNs2Denomination() {
        return ns2Denomination;
    }

    public String getNs2ValuableType() {
        return ns2ValuableType;
    }

    public String getNs2InventoryType() {
        return ns2InventoryType;
    }

    public String getNs2InventoryUnit() {
        return ns2InventoryUnit;
    }

    public String getNs2Quantity() {
        return ns2Quantity;
    }

    public String getNs2Value() {
        return ns2Value;
    }

    public String getNs2TuId() {
        return ns2TuId;
    }

    public String getNs5SrcLoc() {
        return ns5SrcLoc;
    }

    public String getNs5DestLoc() {
        return ns5DestLoc;
    }

    public String getNs5IsHoldOver() {
        return ns5IsHoldOver;
    }

}
