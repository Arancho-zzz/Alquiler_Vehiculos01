package co.edu.ue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import co.edu.ue.model.Alquiler;
import co.edu.ue.service.AlquilerService;

import java.util.List;
@RestController
@RequestMapping("/alquiler") // Base URL for Alquiler endpoints
public class AlquilerController {

    @Autowired
    private AlquilerService alquilerService;

    // Add a new Alquiler
    @PostMapping
    public ResponseEntity<Alquiler> addAlquiler(@RequestBody Alquiler alquiler) {
    	Alquiler createdAlquiler = alquilerService.addAlquiler(alquiler);
        return new ResponseEntity<>(createdAlquiler, HttpStatus.CREATED);
    }

 //   // Update an existing Alquiler
    @PutMapping("/{id}")
    public ResponseEntity<Alquiler> updateAlquiler(@PathVariable int id, @RequestBody Alquiler alquiler) {
        Alquiler existingAlquiler = alquilerService.getAlquilerById(id);
        if (existingAlquiler != null) {
            alquiler.setId(id); // Ensure the ID is set correctly
            Alquiler updatedAlquiler = alquilerService.updateAlquiler(alquiler);
            return new ResponseEntity<>(updatedAlquiler, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Get all Alquileres
    @GetMapping
    public ResponseEntity<List<Alquiler>> getAllAlquileres() {
        List<Alquiler> alquileres = alquilerService.getAllAlquiler();
        return new ResponseEntity<>(alquileres, HttpStatus.OK);
    }

    // Get a single Alquiler by ID
    @GetMapping("/{id}")
    public ResponseEntity<Alquiler> getAlquilerById(@PathVariable int id) {
        Alquiler alquiler = alquilerService.getAlquilerById(id);
        if (alquiler != null) {
            return new ResponseEntity<>(alquiler, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Delete an Alquiler by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlquiler(@PathVariable int id) {
        boolean isDeleted = alquilerService.deleteAlquilerById(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}