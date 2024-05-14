/**
 * Síntese
 *   Objetivo: Mostrar a utilização de ArrayList sem o uso de generics
 *   Entrada: Nenhuma
 *   Saída: Exceção gerada pela incorreta utilização do ArrayList
 */
import java.util.ArrayList;
import java.util.List;

public class ExemploGenerics1 {
    public static void main(String[] args) {

        List inteiros = new ArrayList();


        inteiros.add(new Integer(2));
        inteiros.add(new Integer(4));
        inteiros.add("teste");
        Integer total = 0;

        for (int i = 0; i < inteiros.size(); i++)
            total+=(Integer)inteiros.get(i);
        System.out.println("O total é : "+total);
    }

}
