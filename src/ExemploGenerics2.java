/**
 * Síntese
 *   Objetivo: Mostrar a utilização de ArrayList com o uso de generics
 *   Entrada: Nenhuma
 *   Saída: O resultado total do array de inteiros
 */
import java.util.ArrayList;

public class ExemploGenerics2 {
    public static void main(String[] args) {
        ArrayList< Integer > inteiros = new ArrayList< Integer >();

        inteiros.add(new Integer(2));
        inteiros.add(new Integer(4));

        //inteiros.add("teste");
        // A linha de cima está comentada pelo fato de não poder
        //ser adicionada como código,
        // o array inteiros somente aceita objetos do tipo
        //inteiro(Pelo fato de utilizar GENERICS!).
        Integer total = 0;
        for (int i = 0; i < inteiros.size(); i++)
            total+=(Integer)inteiros.get(i);
        System.out.println("O total é : "+total);
    }
}
