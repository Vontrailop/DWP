package servicios.uno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import servicios.uno.model.Persona;
import servicios.uno.repository.PersonaPage;
import servicios.uno.repository.PersonaRepo;

@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepo repo;

    @Autowired
    private PersonaPage repoPage;

    public List<Persona>  getListPersona(){
        return repo.findAll();
    }

    public Optional<Persona> getById(Long id){
        return repo.findById(id);
    }

    public Persona savePersona(Persona bean){
        return repo.save(bean);
    }

    public void deletePersona (Long id){
        repo.deleteById(id);
    }

    public Page<Persona> PageofPersona(Pageable page){
        return repo.findAll(page);
    }

}
