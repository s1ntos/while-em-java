package basicoqfunciona;

import java.util.Scanner;

public class BasicoFunciona {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();

        System.out.println("Digite sua senha:");
        int senha = sc.nextInt();

        System.out.println("Digite novamente a senha:");
        int senha2 = sc.nextInt();

        int tentativa = 0;
        while (senha2 != senha && tentativa < 3) {
            System.out.println("Senha incorreta. Tente novamente:");
            senha2 = sc.nextInt();
            tentativa++;

            if (tentativa >= 3) {
                System.out.println("Sessão expirada!");
                sc.close();
                return; // Para o programa
            }
        }

        System.out.println("Bem-vindo ao sistema de notas, " + nome + "!");

        System.out.println("Quantos alunos há na sua classe?");
        int alunos = sc.nextInt();

        int contador = 0;
        int soma = 0;

        while (contador < alunos) {
            System.out.println("Qual a nota do aluno " + (contador + 1) + ":");
            int nota = sc.nextInt();
            soma += nota;
            contador++;
        }

        double media = (double) soma / alunos;
        System.out.printf("A média da turma é: %.2f%n", media);

        sc.close();            
    }
}
