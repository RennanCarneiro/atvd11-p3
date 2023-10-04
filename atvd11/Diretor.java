package atvd11;

import java.util.Scanner;

public class Diretor extends Funcionario {
    private String segTurno;
    
     public Diretor(String nome, String inscricao, double salario, String turno, String segTurno) {
        super(nome, inscricao, salario, turno);
        this.segTurno = segTurno;
    }
    public double criarDescontos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da mensalidade atual do aluno: ");
        double mensalidade = sc.nextDouble();
        System.out.println("Insira quantos % de desconto");
        double desconto = sc.nextDouble() * 0.01;
        System.out.println("Com desconto, ficará esse valor: ");
        return  mensalidade / desconto;
    }
    public void encomendarFardas(){
        Scanner sc = new Scanner(System.in);
        int encomendar = sc.nextInt();
        System.out.println("Total de fardas encomendadas: " + encomendar);
    }
    public void gerenciarProfessores(){

    }
}
