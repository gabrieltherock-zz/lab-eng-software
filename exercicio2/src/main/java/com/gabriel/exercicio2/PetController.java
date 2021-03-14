package com.gabriel.exercicio2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PetController {

    @GetMapping(value = "/pets")
    public List<String> mostraNomes() {
        Pet pet1 = new Pet(1,"Rex","cachorro","dobberman");
        Pet pet2 = new Pet(2,"Juliao","cachorro","xiuauaua");
        Pet pet3 = new Pet(3,"Topper","cachorro","dalmata");
        List<String> pets = Arrays.asList(pet1.getNome(), pet2.getNome(), pet3.getNome());
        return pets;
    }

    @GetMapping(value = "/lista")
    public List<Pet> mostraPets() {
        Pet pet1 = new Pet(1,"Rex","cachorro","dobberman");
        Pet pet2 = new Pet(2,"Juliao","cachorro","xiuauaua");
        Pet pet3 = new Pet(3,"Topper","cachorro","dalmata");
        List<Pet> pets = Arrays.asList(pet1, pet2, pet3);
        return pets;
    }
}
