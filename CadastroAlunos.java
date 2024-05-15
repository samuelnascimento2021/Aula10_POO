
import java.util.Scanner;
public class CadastroAlunos {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = 3;

        Aluno[] aluno = new Aluno[num];

        for(int i = 0; i<num; i++){
            System.out.println("\n---------------------------------");
            System.out.print("Insira o nome do aluno: ");
            String nome = s.nextLine();
            System.out.print("Insira a idade do aluno: ");
            int idade = s.nextInt();
            System.out.println("\n---------------------------------");

            aluno[i] = new Aluno(nome, idade);
            s.nextLine();
        }

        System.out.println("Lista de Alunos Cadastrados:");
        for (int i = 0; i <num; i++) {
            System.out.println("Nome: " + aluno[i].getNome());
            System.out.println("Idade: " + aluno[i].getIdade());
            System.out.println();
        }
    }
}
