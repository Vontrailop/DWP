package servicios.uno.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import servicios.uno.model.Persona;

public interface  PersonaPage extends PagingAndSortingRepository<Persona,Long> {
    
}
