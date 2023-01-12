package application;

import entites.Funcionarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        List<Funcionarios> list = new ArrayList<>();

        System.out.print("Quantas pessoas você gostaria de registrar? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){

            System.out.println();
            System.out.println("Emplyoee #" + (i+1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (temId(list,id)){
                System.out.println("Este ID já existe! Tente novamente: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salary: ");
            Double salario = sc. nextDouble();
            Funcionarios funci = new Funcionarios(id, nome, salario);
            list.add(funci);
        }

        System.out.println();
        System.out.print("Qual o ID do funcionário que irá receber o aumento? ");
        int idSalario = sc.nextInt(); // Li o ID

        Funcionarios funci = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
        //Integer pos = posicao(list, idSalario); //Procurei o ID
        if (funci == null){ // Se não encontrar False
            System.out.println("ID não encontrado! ");
        } else {
            System.out.print("Digite a porcentagem: ");
            Double porcentagem = sc.nextDouble();//Vou perguntar a porcentagem
            funci.aumentoSalario(porcentagem); //Para acrecentar no salário do funcionário
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionarios f: list) {
            System.out.println(f);
        }


        sc.close();
    }

    public static Integer posicao (List<Funcionarios> list, int id) {

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id) {
                return  i;
            }
        }
            return  null;
    }

    public static boolean temId (List<Funcionarios>list, int id){
        Funcionarios funci = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funci != null;
    }
}