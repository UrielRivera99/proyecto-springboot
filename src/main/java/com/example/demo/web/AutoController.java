package com.example.demo.web;


import com.example.demo.dto.AutoDTO;
import com.example.demo.service.AutoService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/autos")
@RequiredArgsConstructor
public class AutoController {

    private final AutoService autoService;

    @GetMapping("/all")
    public ResponseEntity<List<AutoDTO>> getAutos(){
        return ResponseEntity.ok(autoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutoDTO> getAutoByID(@PathVariable long id){
        return ResponseEntity.ok(autoService.getById(id));
    }

}
