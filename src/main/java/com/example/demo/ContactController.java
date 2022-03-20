package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController{
    @GetMapping("/contacts") //quiero que cuando yo ponga contacts en el ordenador me ejecute la funcion que voy a escribir ahora
    //get es para coger
    public String getContacts(){ 
        return "Hola Mundo";
    }
    //Post es para poner
    @PostMapping("/contacts")
    public Contact postContacts(@RequestBody Contact contact){//tu vas a recibir informacion de tipo Contact (hemos hecho un constructor en la otra clase)
        //contact.setSurname("Sanchez");
        return contact;
        //si envio un post me devuelve Hola Mundo POST
    }
    //en funcion del metodo me devuelve una cosa u otra 
    //en el post le voy a enviar contenido como respondo yo a esos datos?
    //recibir contenido haciendote una clase 
}