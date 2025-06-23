package com.factoryMethod.solve.service;

import com.factoryMethod.solve.factory.Document;
import com.factoryMethod.solve.factory.DocumentFactory;
import org.springframework.stereotype.Service;

@Service
public class DocumentEditorService {
    private final DocumentFactory documentFactory;

    public DocumentEditorService(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    public void openDocument(String type) {
        Document doc = documentFactory.createDocument(type);
        doc.open();
    }
}
