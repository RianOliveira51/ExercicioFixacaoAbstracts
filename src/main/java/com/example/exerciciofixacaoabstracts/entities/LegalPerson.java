package com.example.exerciciofixacaoabstracts.entities;

public class LegalPerson extends Person{
    private Integer qtdemployees;

    public LegalPerson(){

    }
    public LegalPerson(String name, double annualincome, Integer qtdPerson){
        super(name,annualincome);
        this.qtdemployees = qtdPerson;
    }

    public Integer getQtdemployees(){
        return qtdemployees;
    }

    public void setQtdPerson(Integer qtdemployees){
        this.qtdemployees = qtdemployees;
    }

    @Override
    public double totalTax() {
        if(qtdemployees < 10 ){
            return (annualincome * 16 / 100);
        }else {
            return (annualincome * 14 / 100);
        }
    }
}
