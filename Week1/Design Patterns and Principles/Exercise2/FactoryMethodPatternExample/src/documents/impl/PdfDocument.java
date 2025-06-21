package documents.impl;

import documents.Document;

public class PdfDocument implements Document {

    @Override
    public void openDoc() {
          System.out.println("This will open a pdf document: "+this.getClass().getName());
    }

}
