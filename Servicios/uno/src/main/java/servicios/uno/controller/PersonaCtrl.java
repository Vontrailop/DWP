package servicios.uno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import servicios.uno.model.Persona;
import servicios.uno.service.PersonaService;

@RestController
@RequestMapping("/api/personas")
@CrossOrigin(origins = "http://localhost:5173")  // Especifica el origen permitido
public class PersonaCtrl {

    @Autowired
    PersonaService service;

    @GetMapping
    public List<Persona> getAll() {
        return service.getListPersona();
    }

    @GetMapping("/{id}")
    public Persona getByIdPersona(@PathVariable Long id) {
        return service.getById(id).orElse(null);
    }

    @PostMapping
    public Persona savePersona(@RequestBody Persona bean) {
        return service.savePersona(bean);
    }

    @PostMapping("/page")
    Page<Persona> getAll(Pageable pageable) {
        return service.PageofPersona(pageable);
    }
}
