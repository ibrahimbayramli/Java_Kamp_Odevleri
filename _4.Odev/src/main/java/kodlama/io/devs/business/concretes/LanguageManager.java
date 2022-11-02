package kodlama.io.devs.business.concretes;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    private final LanguageRepository languageRepository;

    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void delete(Long id) {
        languageRepository.delete(id);
    }

    @Override
    public void add(Language language) {
      if(!(isEmpty(language)&&isSimilar(language))){
          languageRepository.add(language);
      }
    }

    @Override
    public void update(Language language) {
        if(!(isEmpty(language)&&isSimilar(language))){
            languageRepository.update(language);
        }
    }

    @Override
    public Language getbyid(Long id) {
        return languageRepository.getById(id);
    }

    boolean isSimilar(Language language){
        for(Language l:languageRepository.getAll()){
            if(l.getName().equalsIgnoreCase(language.getName())){
                return true;
            }
        }
        return false;
    }
    boolean isEmpty(Language language){
        return language.getName().matches("/\s/g");
    }
}
