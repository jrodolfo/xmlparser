package com.jrodolfo.xmlparser.sax;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rod on 11-Sep-2016.
 */
public class Root {

    List<TuStoreRequest> listOfTuStoreRequest = new ArrayList<>();

    public Root(){}

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

    /**
     * Overloading toString to allow printing only the content of some nodes
     * @param nodesToMatch we print only the content of these nodes
     * @return a string with a list of nodes name and nodes value
     */
    public String toString(List<String> nodesToMatch) {
        String tuStoreRequestStr = "";
        int i = 1;
        for (TuStoreRequest tuStoreRequest : listOfTuStoreRequest) {
            tuStoreRequestStr += "\n" + i + ") " + tuStoreRequest.toString(nodesToMatch);
            i++;
        }
        return tuStoreRequestStr;
    }

    public void addTuStoreRequest(TuStoreRequest tuStoreRequest) {
        this.listOfTuStoreRequest.add(tuStoreRequest);
    }
}
