package basicoqfunciona;

import java.util.Scanner;

public class BasicoFunciona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual seu nome");
        String nome = sc.nextLine();
        
        System.out.println("Digite sua senha");
        int senha = sc.nextInt();
        
        System.out.println("Digite novamente");
        int senha2 = sc.nextInt();
        
        int tentativa = 0;
        while(senha2 != senha && tentativa < 3) {
            System.out.println("Digite a senha correta");
            senha2 = sc.nextInt();
            tentativa++;
            
            if(tentativa >= 3) {
                System.out.println("Sessao expirada!");
                return;
            }
        }
        
        if(senha2 == senha) {
            System.out.println("Bem vindo ao sistema de notas");
        
        System.out.println("Quantos alunos há na sua classe");
        int alunos = sc.nextInt();
        
        int contador = 0;
        int soma = 0;
        while(alunos > contador) {
            System.out.println("Qual a nota do aluno " + (contador + 1) + ":");
            int nota = sc.nextInt();
            soma += nota;
            contador++;
        } 
        
        double media = (double) soma / alunos;
            System.out.println(media);
        }        
    }
}
