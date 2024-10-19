public class DocumentProcessingSystem {
    public static void main(String[] args) {
        try {
            Document doc = new BasicDocument("Hello, this is a sample document.");
            doc = new EncryptionDecorator(doc, "secret-key");
            doc = new CompressionDecorator(doc);
            doc = new FormattingDecorator(doc, "uppercase");
            doc = new DigitalSignatureDecorator(doc, "private-key-12345");

            System.out.println("Processed content:");
            System.out.println(doc.getContent());

            doc.save("processed_document.txt");
            System.out.println("Document saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}