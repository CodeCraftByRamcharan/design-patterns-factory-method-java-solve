package com.factoryMethod.solve.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DocumentFactory {
    private final Map<String, Document> documentMap;

    @Autowired
    public DocumentFactory(Map<String, Document> documentMap) {
        this.documentMap = documentMap;
    }

    public Document createDocument(String type) {
        Document doc = documentMap.get(type.toLowerCase());
        if (doc == null) {
            throw new IllegalArgumentException("Unknown document type: " + type);
        }
        return doc;
    }

}
