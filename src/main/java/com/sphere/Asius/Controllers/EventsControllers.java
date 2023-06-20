package com.sphere.Asius.Controllers;


import com.sphere.Asius.Entity.Events;
import com.sphere.Asius.Services.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/evento")
@CrossOrigin("*")
public class EventsControllers {

    @Autowired
    private EventsService eventoService;

    @PostMapping("/agregar")
    public ResponseEntity<Events> guardarEvento(@RequestBody Events events){
        Events eventoGuardado = eventoService.agregarEvento(events);
        return ResponseEntity.ok(eventoGuardado);
    }

    @GetMapping("/{idEvents}")
    public Events listarEventoPorId(@PathVariable("idEvents") Long idEvents){
        return eventoService.obtenerEvento(idEvents);
    }


    @GetMapping("/listar")
    public ResponseEntity<?> listarEvento(){
        return ResponseEntity.ok(eventoService.obtenerEvento());
    }

    @PutMapping("/modificar")
    public Events actualizarEvento(@RequestBody Events events){
        return eventoService.actualizarEvento(events);
    }

    @DeleteMapping("/eliminar/{idEvents}")
    public void eliminarEvento(@PathVariable("idEvents") Long idEvents){
        eventoService.eliminarEvento(idEvents);
    }







}
