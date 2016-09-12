package com.jrodolfo.xmlparser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rod on 11-Sep-2016.
 */
public class Root {

    List<TuStoreRequest> listOfTuStoreRequest = new ArrayList<>();

    public Root(){}

    public Root(List<TuStoreRequest> listOfTuStoreRequest) {
        this.listOfTuStoreRequest = listOfTuStoreRequest;
    }

    @Override
    public String toString() {
        String tuStoreRequestStr = "";
        int i = 1;
        for (TuStoreRequest tuStoreRequest : listOfTuStoreRequest) {
            tuStoreRequestStr += "\n" + i + ") " + tuStoreRequest.toString();
            i++;
        }
        String result = "Root{" +
                "listOfTuStoreRequest=" + tuStoreRequestStr +
                '}';
        return result;
    }

    public String toString(List<String> nodesToMatch) {
        String tuStoreRequestStr = "";
        int i = 1;
        for (TuStoreRequest tuStoreRequest : listOfTuStoreRequest) {
            tuStoreRequestStr += "\n" + i + ") " + tuStoreRequest.toString(nodesToMatch);
            i++;
        }
        return tuStoreRequestStr;
    }

    public List<TuStoreRequest> getListOfTuStoreRequest() {
        return listOfTuStoreRequest;
    }

    public void setListOfTuStoreRequest(List<TuStoreRequest> listOfTuStoreRequest) {
        this.listOfTuStoreRequest = listOfTuStoreRequest;
    }

    public void addTuStoreRequest(TuStoreRequest tuStoreRequest) {
        this.listOfTuStoreRequest.add(tuStoreRequest);
    }
}
