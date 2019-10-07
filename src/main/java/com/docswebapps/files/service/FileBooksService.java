package com.docswebapps.files.service;
import java.io.IOException;
import java.util.Map;

public interface FileBooksService {
    Map<String, String> parseBooksFile() throws IOException;
    void readBooksFile() throws IOException;
}
