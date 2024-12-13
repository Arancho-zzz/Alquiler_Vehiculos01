package co.edu.ue.controller;

import co.edu.ue.model.Pago;
import co.edu.ue.service.PagoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
@RequestMapping("/pagos")
public class PagoController {

    @Autowired
    private PagoService pagoService;

    // Obtener todos los pagos
    @GetMapping
    public List<Pago> getAllPagos() {
        return pagoService.getAllPagos();
    }

    // Obtener un pago por ID
    @GetMapping("/{id}")
    public Pago getPagoById(@PathVariable int id) {
        return pagoService.getPagoById(id);
    }

    // Crear un nuevo pago
    @PostMapping
    public Pago addPago(@RequestBody Pago pago) {
        return pagoService.addPago(pago);
    }

    // Actualizar un pago existente
    @PutMapping("/{id}")
    public Pago updatePago(@PathVariable int id, @RequestBody Pago pago) {
       
        pago.setPagoID(id);
        return pagoService.updatePago(pago);
    }

    // Eliminar un pago por ID
    @DeleteMapping("/{id}")
    public boolean deletePago(@PathVariable int id) {
        return pagoService.deletePago(id);
    }
}