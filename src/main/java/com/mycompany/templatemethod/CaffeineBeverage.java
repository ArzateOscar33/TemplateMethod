package com.mycompany.templatemethod;
//Arzate Martinez Oscar Giovanny 20211122
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
    }


    abstract void brew();

    void pourInCup() {
        System.out.println("Sirviendo en la taza ");
    }

    void boilWater() {
        System.out.println("Agua Hirviendo");
    }

}
