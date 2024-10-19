class CompressionDecorator extends DocumentDecorator {
    public CompressionDecorator(Document document) {
        super(document);
    }

    @Override
    public String getContent() {
        return compress(super.getContent());
    }

    @Override
    public void save(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(compress(super.getContent()));
        }
    }

    private String compress(String content) {
        byte[] input = content.getBytes();
        byte[] output = new byte[input.length];
        Deflater deflater = new Deflater();
        deflater.setInput(input);
        deflater.finish();
        int compressedDataLength = deflater.deflate(output);
        return Base64.getEncoder().encodeToString(output);
    }
}