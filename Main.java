import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        f.setQuantidadeHorasTrabalhadas(sc.nextInt());

        System.out.println("Digite o valor da hora trabalhada: ");
        f.setValorHora(sc.nextInt());
        f.calcularSalario();

        System.out.println("O valor do seu salário é: " + f.salario);

    }
}