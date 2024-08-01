package com.example.exerciciofixacaoabstracts;

import com.example.exerciciofixacaoabstracts.entities.LegalPerson;
import com.example.exerciciofixacaoabstracts.entities.Person;
import com.example.exerciciofixacaoabstracts.entities.PhysicalPerson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler os dados de N contribuintes (N fornecedios pelo usuário), os quais
* podem ser pessoa física ou pessoa ju´ridica, depois mostra ro valor do imposto pago por cada um
* bem como o total de imposto arrecadado.
* Os dados de pessoa físcia são: nome, renda, anual e gastos com saúde. Os dados de pessoa jurídica
* são nome, renda anual e numero de funcionarios. As regras para cáulculo de imposto são as seguintes:
*
* Pessoa física: Pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em
* diante pagam 25 % de imposto. Se a pessoa teve gasto com sáude, 50% destes gastos são abatidos do imposto
* Exemplo: Uma Pessoa cuja renda foi de 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica: 50000 * 25%) - (2000 * %50) = 11500.00
*
* Pesoa juridica: Pessoas juridicas pagam 16% de impostos. Porém, se a empresa possuir mais de 10 funcionários, ela
* paga 14% de imposto.
* Exemplo: Uma empresa cuja renda foi 4000000.00 e possui 25 funcionários, o imposto fica: 400000 * 14% = 56000.00 */

@SpringBootApplication
public class ExercicioFixacaoAbstractsApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i =1; i <= n; i++){
            System.out.println("Tax Payer #" + i + " data:");
            System.out.print("Individual or company (i/c)?: ");
            char opc = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual Income: ");
            double anualincome = sc.nextDouble();

            if(opc == 'i'){
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new PhysicalPerson(name,anualincome,health));
            }else{
                System.out.print("Number if employees: ");
                int employees = sc.nextInt();
                list.add(new LegalPerson(name,anualincome,employees));
            }
        }
        double sum = 0;
        System.out.println("TAXES PAID:");
        for(Person p1 : list){
            System.out.println(String.format("%.2f", p1.totalTax()));
            sum += p1.totalTax();

        }
        System.out.println("TOTAL TAXES: $" + String.format("%.2f",sum));

    sc.close();
    }

}
