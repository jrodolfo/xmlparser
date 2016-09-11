package com.jrodolfo.xmlparser;

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
}
