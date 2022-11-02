package kodlama.io.devs.dataAccess.concretes;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages=new ArrayList<>();
        languages.add(new Language(1L,"Java"));
        languages.add(new Language(2L,"Python"));
        languages.add(new Language(3L,"GOLang"));
        languages.add(new Language(4L,"JavaScript"));
    }

    @Override
    public Language getById(Long id) {
        for(Language l:languages){
            if(Objects.equals(l.getId(), id)){
                return l;
            }
        }
        return null;
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void delete(Long id) {
        for(Language l:languages){
            if(Objects.equals(l.getId(), id)){
                languages.remove(l);
            }
        }

    }

    @Override
    public void add(Language language) {
        languages.add(language);

    }

    @Override
    public void update(Language language) {
        for (Language l:languages){
            if(l.getId().equals(language.getId())){
                l.setName(language.getName());
            }
        }

    }
}
