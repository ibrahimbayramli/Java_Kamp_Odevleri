package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.entities.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();
    void delete(Long id);
    void add(Language lesson);
    void update(Language lesson);
    Language getbyid(Long id);
}
