package com.mycompany.templatemethod;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
//Arzate Martinez Oscar Giovanny 20211122
public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    void addCondiments() {
        System.out.println("Agregando Limon");
    }

    @Override
    void brew() {
        System.out.println("Remojar el te ");
    }

    @Override
     boolean customerWantsCondiments() {
        String respuesta = getUserInput();
        //SI la respuesta es SI retornara un True
        return respuesta.toLowerCase().startsWith("1");
    }

    private String getUserInput() {
        String respuesta = null;

        System.out.println("¿Quieres limón con tu té? (1)Si/(2)No?");

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        try {
            respuesta = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error, ingrese una respuesta valida (1)Si/(2)No");
        }
        if (respuesta == null) {
            return "no";
        }

        return respuesta;
    }
}