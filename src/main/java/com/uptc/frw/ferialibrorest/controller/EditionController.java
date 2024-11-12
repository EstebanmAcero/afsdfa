package com.uptc.frw.ferialibrorest.controller;

import com.uptc.frw.ferialibrorest.jpa.models.Edition;
import com.uptc.frw.ferialibrorest.service.EditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("edition")
public class EditionController {
    @Autowired
    private EditionService editionService;
    @GetMapping
    public List<Edition> getAllEditions() {
        return editionService.findAllEdition();
    }
    @GetMapping("{id}")
    public Edition getEditionById(@PathVariable long id) {
        return editionService.findByIdEdition(id);
    }
    @PostMapping
    public Edition createEdition(@RequestBody Edition edition){
        return editionService.saveEdition(edition);
    }
    @PutMapping
    public Edition updateEdition(@RequestBody Edition edition){
        return editionService.updateEdition(edition);
    }
    @DeleteMapping
    public void deleteEdition(@RequestParam long id){
        editionService.deleteEdition(id);
    }
}
