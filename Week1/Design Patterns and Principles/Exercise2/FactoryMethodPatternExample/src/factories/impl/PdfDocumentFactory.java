package factories.impl;

import documents.Document;
import documents.impl.PdfDocument;
import factories.DocumentFactory;

public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDoc() {
       return new PdfDocument();
    }

}
