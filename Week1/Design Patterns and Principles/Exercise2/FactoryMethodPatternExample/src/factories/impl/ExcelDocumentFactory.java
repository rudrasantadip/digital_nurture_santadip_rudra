package factories.impl;

import documents.Document;
import documents.impl.ExcelDocument;
import factories.DocumentFactory;

public class ExcelDocumentFactory extends DocumentFactory {

    @Override
    public Document createDoc() {
        return new ExcelDocument();
    }
     
}
