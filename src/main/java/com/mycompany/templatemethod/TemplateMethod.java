package com.mycompany.templatemethod;
//Arzate Martinez Oscar Giovanny 20211122

import java.io.IOException;
import java.util.Scanner;

public class TemplateMethod {

    public static void main(String[] args) throws IOException {
    
		Tea tea = new Tea();
		Coffee coffee = new Coffee();
 
		System.out.println("\nPreparando Te");
		tea.prepareRecipe();
 
		System.out.println("\nPreparando Cafe");
		coffee.prepareRecipe();

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\nPreparando Te Con Limon");
		teaHook.prepareRecipe();
 
		System.out.println("\nPreparando Cafe con Leche y Azucar");
		coffeeHook.prepareRecipe();


    }
}
