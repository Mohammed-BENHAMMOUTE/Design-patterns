interface Document {
    String getContent();
    void save(String filename) throws IOException;
}