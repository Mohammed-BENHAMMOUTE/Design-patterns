class FormattingDecorator extends DocumentDecorator {
    private String format;

    public FormattingDecorator(Document document, String format) {
        super(document);
        this.format = format;
    }

    @Override
    public String getContent() {
        return applyFormat(super.getContent());
    }

    @Override
    public void save(String filename) throws IOException {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(applyFormat(super.getContent()));
        }
    }

    private String applyFormat(String content) {
        // Simple formatting for demonstration
        switch (format.toLowerCase()) {
            case "uppercase":
                return content.toUpperCase();
            case "lowercase":
                return content.toLowerCase();
            default:
                return content;
        }
    }
}