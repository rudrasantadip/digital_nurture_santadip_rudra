package tests;

import documents.Document;
import factories.DocumentFactory;
import factories.impl.ExcelDocumentFactory;
import factories.impl.PdfDocumentFactory;
import factories.impl.WordDocumentFactory;

public class FactoryTest {
    public static void main(String[] args) {
          DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDoc();
        wordDoc.openDoc();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDoc();
        pdfDoc.openDoc();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDoc();
        excelDoc.openDoc();
    }
}
