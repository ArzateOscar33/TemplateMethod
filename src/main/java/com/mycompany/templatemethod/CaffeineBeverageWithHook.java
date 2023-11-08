
package com.mycompany.templatemethod;
//Arzate Martinez Oscar Giovanny 20211122
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
     if (customerWantsCondiments()) {
	addCondiments();	
     }	
    boilWater();
    brew();
    pourInCup();

       
    }

    abstract void addCondiments();



    void pourInCup() {
        System.out.println("Sirviendo en la taza ");
    }

    abstract void brew();

    void boilWater() {
        System.out.println("Agua hirviendo");
    }
        boolean customerWantsCondiments() {
        return true;
    }
}