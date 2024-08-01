package com.example.exerciciofixacaoabstracts.entities;

public abstract class Person {

    protected String name;
    protected double annualincome;

     public Person(){

     }

    public Person(String name, double annualincome){
         this.name = name;
         this.annualincome = annualincome;
    }

    public String getName(){
         return name;
    }

    public void setName(String name){
         this.name = name;
    }

    public double getAnnualincome(){
         return annualincome;
    }

    public void setAnnualincome(double annualincome){
         this.annualincome = annualincome;
    }

    public abstract double totalTax();
}

