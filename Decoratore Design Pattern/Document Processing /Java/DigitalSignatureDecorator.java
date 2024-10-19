class DigitalSignatureDecorator extends DocumentDecorator {
    private String privateKey;

    public DigitalSignatureDecorator(Document document, String privateKey) {
        super(document);
        this.privateKey = privateKey;
    }

    @Override
    public String getContent() {
        return super.getContent() + "\n" + sign(super.getContent());
    }

    @Override
    public void save(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(super.getContent() + "\n" + sign(super.getContent()));
        }
    }

    private String sign(String content) {
        // Simple signing for demonstration
        return "Signed with key: " + privateKey.substring(0, 5) + "...";
    }
}