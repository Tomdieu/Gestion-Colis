package com.example.tpinfo3055.demo.Colis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/colis")
public class ColisController {

    private final ColisService colisService;

    public ColisController(ColisService colisService) {
        this.colisService = colisService;
    }

    @GetMapping
    public String getColis() {
        return colisService.getAllColis();
    }

    @GetMapping(value = "/{id}")
    public String getAColis() {
        return "A Colis";
    }
}
