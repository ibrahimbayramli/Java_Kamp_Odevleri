package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/language")
public class LanguageControllers {
    private final LanguageService languageService;

    public LanguageControllers(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/get/{id}")
    public Language getbyid(@PathVariable Long id) {
        return languageService.getbyid(id);
    }
    @GetMapping("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody Language language) {
        languageService.add(language);
    }
    @GetMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        languageService.delete(id);
    }

    @PostMapping("/update")
    public void update(@RequestBody Language language) {
        languageService.update(language);
    }
}
