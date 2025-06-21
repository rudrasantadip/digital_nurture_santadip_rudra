package documents.impl;

import documents.Document;

public class ExcelDocument  implements Document {

    @Override
    public void openDoc() {
        System.out.println("This will open a excel document: "+this.getClass().getName());
    }

}
