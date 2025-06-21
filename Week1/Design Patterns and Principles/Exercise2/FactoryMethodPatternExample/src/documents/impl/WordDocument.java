package documents.impl;

import documents.Document;

public class WordDocument implements Document {
    @Override
    public void openDoc() {
       System.out.println("This will open a word document: "+this.getClass().getName());
    }

}
