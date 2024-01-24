package servicios.uno.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import servicios.uno.model.Persona;

public interface  PersonaRepo extends JpaRepository<Persona,Long> {
    
}
