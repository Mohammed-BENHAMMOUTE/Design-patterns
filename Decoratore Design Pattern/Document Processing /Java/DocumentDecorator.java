abstract class DocumentDecorator implements Document {
    protected Document wrappedDocument;

    public DocumentDecorator(Document document) {
        this.wrappedDocument = document;
    }

    @Override
    public String getContent() {
        return wrappedDocument.getContent();
    }

    @Override
    public void save(String filename) throws IOException {
        wrappedDocument.save(filename);
    }
}