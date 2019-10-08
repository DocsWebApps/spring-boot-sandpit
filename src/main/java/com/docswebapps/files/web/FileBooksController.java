package com.docswebapps.files.web;
import com.docswebapps.files.service.FileBooksService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import java.util.Map;

@Controller
@RequestMapping("/files")
public class FileBooksController {
    private final FileBooksService fileBooksService;

    public FileBooksController(FileBooksService fileBooksService) {
        this.fileBooksService = fileBooksService;
    }

    @GetMapping(value = "/readBooks")
    public String booksFileRead(Model model) throws IOException {
        Map<String,String> booksMap = this.fileBooksService.parseBooksFile();
        model.addAttribute("books", booksMap);
        model.addAttribute("keys", booksMap.keySet());
        return "readBooks";
    }
}
