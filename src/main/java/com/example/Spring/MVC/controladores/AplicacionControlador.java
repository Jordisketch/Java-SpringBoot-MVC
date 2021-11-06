package com.example.Spring.MVC.controladores;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Esto se va a encargar de recibir peticiones
@Controller
public class AplicacionControlador {


    //Getmapping requiere la url con la que se va a ejecutar
    @GetMapping("/bienvenido")      //Model funciona para enviar datos a la vista
    public String mostrarBienvenida(Model modelo){

        //Aqui iria una consulta a la base de datos
        String nombreUsuario = "Adam";

        //Envia los datos a la vista
        modelo.addAttribute("Nombre", nombreUsuario );

        //Esto devuelve la vista que se desea sin la extension del archivo
        return "inicio";
    }

    @GetMapping("/calculadora")
    public String mostrarCalculadora(){

        return "calculadora";
    }

    @GetMapping("/resultado")
    public String mostrarResultado(int numero1, int numero2, Model modelo){
        int resultado = numero1 * numero2;

        modelo.addAttribute("Resultado", resultado);

        return "resultado";
    }
}
