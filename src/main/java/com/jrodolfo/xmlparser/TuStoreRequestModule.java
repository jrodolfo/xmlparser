package com.jrodolfo.xmlparser;

import org.apache.commons.digester3.binder.AbstractRulesModule;

/**
 * Created by Rod Oliveira on 09-Sep-2016.
 */
public class TuStoreRequestModule extends AbstractRulesModule {

    @Override
    protected void configure() {

        // Register a ObjectCreateRule on matching pattern "ns5:TuStoreReque". Later on, in the parsing phase,
        // when encounters a <ns5:TuStoreRequest> element, Apache Digester will fire this rule to create a TuStoreRequest object.
        forPattern("root/ns5:TuStoreRequest").createObject().ofType("com.jrodolfo.xmlparser.TuStoreRequest").then().setProperties();
        forPattern("root/ns5:TuStoreRequest/ns5:Header/ns2:ID").setBeanProperty().withName("ns2ID");
    }

}
