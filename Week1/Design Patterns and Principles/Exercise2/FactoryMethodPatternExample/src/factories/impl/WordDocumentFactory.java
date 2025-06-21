package factories.impl;

import documents.Document;
import documents.impl.WordDocument;
import factories.DocumentFactory;

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDoc() {
        return new WordDocument();
    }

}
