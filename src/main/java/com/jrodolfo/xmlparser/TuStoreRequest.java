package com.jrodolfo.xmlparser;

/**
 * Created by joao.r.oliveira on 09-Sep-2016.
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
                "ns2ID='" + ns2ID + '\'' +
                ", ns2Type='" + ns2Type + '\'' +
                ", ns2Version='" + ns2Version + '\'' +
                ", ns2Timestamp='" + ns2Timestamp + '\'' +
                ", ns2Sender='" + ns2Sender + '\'' +
                ", ns2Receiver='" + ns2Receiver + '\'' +
                ", ns5Priority='" + ns5Priority + '\'' +
                ", ns2Denomination='" + ns2Denomination + '\'' +
                ", ns2ValuableType='" + ns2ValuableType + '\'' +
                ", ns2InventoryType='" + ns2InventoryType + '\'' +
                ", ns2InventoryUnit='" + ns2InventoryUnit + '\'' +
                ", ns2Quantity='" + ns2Quantity + '\'' +
                ", ns2Value='" + ns2Value + '\'' +
                ", ns2TuId='" + ns2TuId + '\'' +
                ", ns5SrcLoc='" + ns5SrcLoc + '\'' +
                ", ns5DestLoc='" + ns5DestLoc + '\'' +
                ", ns5IsHoldOver='" + ns5IsHoldOver + '\'' +
                '}';
    }

    public String getNs2ID() {
        return ns2ID;
    }

    public void setNs2ID(String ns2ID) {
        this.ns2ID = ns2ID;
    }

    public String getNs2Type() {
        return ns2Type;
    }

    public void setNs2Type(String ns2Type) {
        this.ns2Type = ns2Type;
    }

    public String getNs2Version() {
        return ns2Version;
    }

    public void setNs2Version(String ns2Version) {
        this.ns2Version = ns2Version;
    }

    public String getNs2Timestamp() {
        return ns2Timestamp;
    }

    public void setNs2Timestamp(String ns2Timestamp) {
        this.ns2Timestamp = ns2Timestamp;
    }

    public String getNs2Sender() {
        return ns2Sender;
    }

    public void setNs2Sender(String ns2Sender) {
        this.ns2Sender = ns2Sender;
    }

    public String getNs2Receiver() {
        return ns2Receiver;
    }

    public void setNs2Receiver(String ns2Receiver) {
        this.ns2Receiver = ns2Receiver;
    }

    public String getNs5Priority() {
        return ns5Priority;
    }

    public void setNs5Priority(String ns5Priority) {
        this.ns5Priority = ns5Priority;
    }

    public String getNs2Denomination() {
        return ns2Denomination;
    }

    public void setNs2Denomination(String ns2Denomination) {
        this.ns2Denomination = ns2Denomination;
    }

    public String getNs2ValuableType() {
        return ns2ValuableType;
    }

    public void setNs2ValuableType(String ns2ValuableType) {
        this.ns2ValuableType = ns2ValuableType;
    }

    public String getNs2InventoryType() {
        return ns2InventoryType;
    }

    public void setNs2InventoryType(String ns2InventoryType) {
        this.ns2InventoryType = ns2InventoryType;
    }

    public String getNs2InventoryUnit() {
        return ns2InventoryUnit;
    }

    public void setNs2InventoryUnit(String ns2InventoryUnit) {
        this.ns2InventoryUnit = ns2InventoryUnit;
    }

    public String getNs2Quantity() {
        return ns2Quantity;
    }

    public void setNs2Quantity(String ns2Quantity) {
        this.ns2Quantity = ns2Quantity;
    }

    public String getNs2Value() {
        return ns2Value;
    }

    public void setNs2Value(String ns2Value) {
        this.ns2Value = ns2Value;
    }

    public String getNs2TuId() {
        return ns2TuId;
    }

    public void setNs2TuId(String ns2TuId) {
        this.ns2TuId = ns2TuId;
    }

    public String getNs5SrcLoc() {
        return ns5SrcLoc;
    }

    public void setNs5SrcLoc(String ns5SrcLoc) {
        this.ns5SrcLoc = ns5SrcLoc;
    }

    public String getNs5DestLoc() {
        return ns5DestLoc;
    }

    public void setNs5DestLoc(String ns5DestLoc) {
        this.ns5DestLoc = ns5DestLoc;
    }

    public String getNs5IsHoldOver() {
        return ns5IsHoldOver;
    }

    public void setNs5IsHoldOver(String ns5IsHoldOver) {
        this.ns5IsHoldOver = ns5IsHoldOver;
    }
}
