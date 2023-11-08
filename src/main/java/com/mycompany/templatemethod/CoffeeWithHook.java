
package com.mycompany.templatemethod;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
//Arzate Martinez Oscar Giovanny 20211122
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void addCondiments() {
       System.out.println("Agregar Azucar y Leche");
    }

    @Override
    void brew() {
        System.out.println("Goteando café a través del filtro");
    }

    @Override
     boolean customerWantsCondiments() {
        String respuesta = getUserInput();
        
        return respuesta.toLowerCase().startsWith("1");
        
    }

    private String getUserInput() {
        String respuesta = null;

        System.out.println("¿Quieres azúcar y leche con tu café (1)Si/(2)No?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        try {
            respuesta = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error, ingrese una respuesta valida (1)Si/(2)No");
        }
        if (respuesta == null) {
            return "No";
        }

        return respuesta;
    }
}