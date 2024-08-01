package com.example.exerciciofixacaoabstracts.entities;

import org.springframework.cglib.util.ParallelSorter;

public class PhysicalPerson extends Person{
    private double health;

    public PhysicalPerson() {
    }

    public PhysicalPerson(String name, double annualincome, double health){
        super(name,annualincome);
        this.health = health;
    }

    public double getHealth(){
        return health;
    }

    public double setHealth(double health){
       return this.health = health;
    }
    @Override
    public double totalTax() {
        if(annualincome < 20000) {
            return (annualincome * 15 / 100) - (health * 50 / 100);
        }else{
            return (annualincome * 25 / 100) - (health * 50 / 100);
        }
    }
}
