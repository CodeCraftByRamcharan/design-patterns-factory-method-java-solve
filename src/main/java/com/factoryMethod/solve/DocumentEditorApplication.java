package com.factoryMethod.solve;

import com.factoryMethod.solve.factory.PaymentServiceFactory;
import com.factoryMethod.solve.service.DocumentEditorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DocumentEditorApplication implements CommandLineRunner{

	private final DocumentEditorService editorService;
	private final PaymentServiceFactory paymentServiceFactory;

	public DocumentEditorApplication(DocumentEditorService editorService,
									 PaymentServiceFactory paymentServiceFactory) {
		this.editorService = editorService;
        this.paymentServiceFactory = paymentServiceFactory;
    }

	public static void main(String[] args) {
		SpringApplication.run(DocumentEditorApplication.class, args);
	}

	@Override
	public void run(String... args) {
		editorService.openDocument("word");
		editorService.openDocument("pdf");
		editorService.openDocument("text");
		paymentServiceFactory.getProcessor("pay").process();
		paymentServiceFactory.getProcessor("credit").process();
	}
}
