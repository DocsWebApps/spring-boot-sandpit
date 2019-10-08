package com.docswebapps.files.service.impl;
import com.docswebapps.files.service.FileBooksService;
import org.jboss.logging.Logger;
import org.springframework.core.env.Environment;
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
    private Environment env;

    public FileBooksServiceImpl(Environment env) {
        this.env = env;
    }

    @Override
    public Map<String,String> parseBooksFile() throws IOException {
        Map<String,String> cache = new HashMap<>();
        String fileName = env.getProperty("FILES_FILE_BOOKS_SERVICE_INFILE");
        File file = (fileName == null) ? new File("test.txt") : new File(fileName);
        if(file.canRead()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] lineItem = line.split(",");
                    cache.put(lineItem[0], lineItem[1]);
                }
            } catch(Exception e) {
                log.error("Houston, we have a problem! " + e.getMessage());
                System.out.println(fileName);
            }
        }
        cache.put("Dave","Conformational Analysis");
        return cache;
    }

}
