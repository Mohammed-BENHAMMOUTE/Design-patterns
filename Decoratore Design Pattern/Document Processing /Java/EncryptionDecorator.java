class EncryptionDecorator extends DocumentDecorator {
    private String encryptionKey;

    public EncryptionDecorator(Document document, String encryptionKey) {
        super(document);
        this.encryptionKey = encryptionKey;
    }

    @Override
    public String getContent() {
        return encrypt(super.getContent());
    }

    @Override
    public void save(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(encrypt(super.getContent()));
        }
    }

    private String encrypt(String content) {
        // Simple XOR encryption for demonstration
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < content.length(); i++) {
            encrypted.append((char) (content.charAt(i) ^ encryptionKey.charAt(i % encryptionKey.length())));
        }
        return Base64.getEncoder().encodeToString(encrypted.toString().getBytes());
    }
}