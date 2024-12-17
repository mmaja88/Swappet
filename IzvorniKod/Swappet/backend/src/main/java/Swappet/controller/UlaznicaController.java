package Swappet.controller;

import Swappet.model.Ulaznica;
import Swappet.service.UlaznicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ulaznica")
public class UlaznicaController {

    @Autowired
    private UlaznicaService ulaznicaService;

    // Fetch all Ulaznica records
    @GetMapping("/all")
    public ResponseEntity<List<Ulaznica>> getAllUlaznice() {
        List<Ulaznica> ulaznice = ulaznicaService.getAllUlaznice();
        return ResponseEntity.ok(ulaznice);
    }

    // Fetch a specific Ulaznica by ID
    @GetMapping("/{id}")
    public ResponseEntity<Ulaznica> getUlaznicaById(@PathVariable Integer id) {
        Ulaznica ulaznica = ulaznicaService.getUlaznicaById(id);
        return ulaznica != null ? ResponseEntity.ok(ulaznica) : ResponseEntity.notFound().build();
    }

    // Kupnja ulaznica (1 ili više)
    @PostMapping("/kupnja")
    public ResponseEntity<String> purchaseTickets(@RequestBody TicketPurchaseRequest request) {
        ulaznicaService.purchaseTickets(request.getBuyerEmail(), request.getTicketIds());
        return ResponseEntity.ok("Ulaznica/e uspješno kupljena/e.");
    }
}

class TicketPurchaseRequest {
    private String buyerEmail;
    private List<Integer> ticketIds;

    // Getters and Setters
    public String getBuyerEmail() {
        return buyerEmail;
    }

    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    public List<Integer> getTicketIds() {
        return ticketIds;
    }
    public void setTicketIds(List<Integer> ticketIds) {
        this.ticketIds = ticketIds;
    }
}

