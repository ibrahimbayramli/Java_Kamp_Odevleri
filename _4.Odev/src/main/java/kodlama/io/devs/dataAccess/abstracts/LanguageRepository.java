package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.Language;

import java.util.List;

public interface LanguageRepository {
    Language getById(Long id);
    List<Language> getAll();
    void delete(Long id);
    void add(Language language);
    void update(Language language);
}
