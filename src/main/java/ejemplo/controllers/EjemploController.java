package ejemplo.controllers;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.*;

import ejemplo.modelo.userIni;
import ejemplo.repository.EjemploRepository;
@RestController
@RequestMapping("/")
public class EjemploController {
    
    private final EjemploRepository ejemploRepository;

    public EjemploController(EjemploRepository tareasRepository) {
        this.ejemploRepository = tareasRepository;
    } 

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public userIni crearEjemplo(@RequestBody userIni todo) {
        return ejemploRepository.save(todo);
    }

    @GetMapping("/")
    public Iterable<userIni> getEjemplo() {
        return ejemploRepository.findAll();
    }
}