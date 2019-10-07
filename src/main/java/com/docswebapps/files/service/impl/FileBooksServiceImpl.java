package com.docswebapps.files.service.impl;
import com.docswebapps.files.service.FileBooksService;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class FileBooksServiceImpl implements FileBooksService {
    private final static Logger log = Logger.getLogger(FileBooksServiceImpl.class);
    private Map<String,String> cache = new HashMap<>();

    public Map<String,String> parseBooksFile() throws IOException {
        this.readBooksFile();
        cache.put("Dave","Conformational Analysis");
        return cache;
    }

    public void readBooksFile() throws IOException {
      File file = new File("C:\\MyCode\\Java\\spring-boot-sandpit\\src\\main\\resources\\InFiles\\books.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineItem = line.split(",");
                cache.put(lineItem[0], lineItem[1]);
            }
        } catch(Exception e) {
            log.error("Houston, we have a problem! " + e.getMessage());
        }
    }
}
