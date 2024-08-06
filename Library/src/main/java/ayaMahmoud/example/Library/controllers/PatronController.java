package ayaMahmoud.example.Library.controllers;


import java.io.*;

import ayaMahmoud.example.Library.repo.*;
import ayaMahmoud.example.Library.models.entity.*;
import ayaMahmoud.example.Library.services.PatronServiceInterface;


import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("/api/patron")
public class PatronController {

    @Autowired
    public PatronServiceInterface patronServiceinterface;

    @GetMapping
    public List<Patron> getAllPatrons() {
        return patronServiceinterface.findAllPatron();
    }

    @GetMapping("/{id}")
    public Patron getPatron(@PathVariable Long id) {
        return patronServiceinterface.findPatronById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Patron addPatron(@RequestBody Patron patron) {
        return patronServiceinterface.add(patron);
    }

    @PutMapping("/{id}")
    public Patron updatePatron(@PathVariable Long id, @RequestBody Patron newPatron) {
        return patronServiceinterface.updateById(id, newPatron);
    }

    @DeleteMapping("/{id}")
    public void deletePatron(@PathVariable Long id) {
        patronServiceinterface.deleteById(id);
    }



}
