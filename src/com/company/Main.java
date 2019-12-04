package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Bird bird = new Bird();
        Pigeon pigeon = new Pigeon();

        Animal [] animals = {animal, bird, pigeon};

        for (Animal an : animals)
        {
            an.breathe();
        }
    }
}
 class Animal{

     {
         System.out.println("Blok kodu animal");
     }
     static {
         System.out.println("Statyczny blok kodu animal");
     }
     public Animal() {


         System.out.println("Konstruktor Animal");
     }

     void breathe()
     {
         System.out.println("Oddech zwierzaka");
     }
 }
 class Bird extends Animal{
     {
         System.out.println("Blok kodu Bird");
     }
     static {
         System.out.println("Statyczny blok kodu Bird");
     }
    public Bird() {

         System.out.println("Konstruktor Bird");
     }

     @Override
     void breathe() {
       //  super.breathe();
         System.out.println("Ptasi oddech");
     }
 }
 class Pigeon extends Bird{
     {
         System.out.println("Blok kodu Pigeon");
     }

     static{
         System.out.println("Statyczny blok kodu Pigeon");
     }
     public Pigeon() {

         System.out.println("Konstruktor Pigeon");
     }

     @Override
     void breathe() {
        // super.breathe();
         System.out.println("Oddech golebia");
     }
 }

