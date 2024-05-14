/**
 * Síntese
 *   Objetivo: Fazer uso de um método genérico com limitar tipos
 *   Entrada: Nenhuma
 *   Saída: Nome do funcionário e o valor da gratificação
 */
public class ExemploLimitacao2 {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Joao",500.0,5);
        System.out.println("Gratificação do funcionario" + empregado1.getNome()+" :" + descobreGratificacao(empregado1));

        Empregado empregado2 = new Empregado("Maria",500.0,11);
        System.out.println("Gratificação do funcionario " + empregado2.getNome()+" :" + descobreGratificacao(empregado2));
        //String empregado3 = new String("Emanoel");
        //Não compilará pelo fato de não ser Empregado ou subclasse
    }

    public static < T extends Empregado >
    Double descobreGratificacao(T empregado){
        Empregado auxEmpregado = (Empregado)empregado;
        Double aumento = 0.0;
        if(auxEmpregado.getTempoEmpresa()< 10)
            aumento = auxEmpregado.getSalario()*1.1;
        else
            aumento = auxEmpregado.getSalario()*1.3;
        return aumento;
    }
}
