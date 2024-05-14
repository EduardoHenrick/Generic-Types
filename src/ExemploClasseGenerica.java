

/**
 * Síntese
 *   Objetivo: Mostrar a utilização de uma classe genérica
 *   Entrada: Nenhuma
 *   Saída: Visualização de cada objeto diferente criado através da
 *   ClasseGenerica
 */
public class ExemploClasseGenerica {
    public static void main(String[] args) {
        ClasseGenerica< String > objStr = new ClasseGenerica<>();
        ClasseGenerica< Integer > objInt = new ClasseGenerica<>();
        ClasseGenerica< Boolean > objBoolean = new ClasseGenerica<>();

        objStr.setAtributo("String objeto generico");
        objInt.setAtributo(100);
        objBoolean.setAtributo(Boolean.TRUE);

        //Objetos Criados
        System.out.println("Criado como String : "+objStr.getAtributo());
        System.out.println("Criado como Integer : "+objInt.getAtributo());
        System.out.println("Criado como Boolean : "+objBoolean.getAtributo());
    }
}
