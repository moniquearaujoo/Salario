public class Funcionario {

    int valorHora;
    int quantidadeHorasTrabalhadas;
    float salario;

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    public void setQuantidadeHorasTrabalhadas(int quantidadeHorasTrabalhadas) {
        this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
    }

    public void calcularSalario() {
        salario = valorHora*quantidadeHorasTrabalhadas;
    }


}
