
/**
 * Síntese
 *   Objetivo: Fazer uso de um método genérico sem limitar tipos
 *   Entrada: Nenhuma
 *   Saída: Nome do funcionário e o valor da gratificação
 */
public class ExemploLimitacao1 {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Joao", 500.0, 5);
        print(empregado1);

        Empregado empregado2 = new Empregado("Maria", 500.0, 11);
        print(empregado2);

        Terceirizado empregado3 = new Terceirizado("Dudu", 3500.0, 3, "Confirp");
        print(empregado3);
    }

    private static void print(Empregado empregado) {
        System.out.println("Gratificação do funcionario " + empregado + ": " + descobreGratificacao(empregado));
    }

    public static <T extends Empregado> Double descobreGratificacao(T empregado) {
        Empregado auxEmpregado = empregado;
        Double aumento = 0.0;
        if (auxEmpregado.getTempoEmpresa() < 10)
            aumento = auxEmpregado.getSalario() * 1.1;
        else
            aumento = auxEmpregado.getSalario() * 1.3;
        return aumento;
    }
}


























































