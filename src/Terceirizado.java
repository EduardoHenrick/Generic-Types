public class Terceirizado extends Empregado {

    private String empresaTerceirizada;

    public Terceirizado(String nome, Double salario, Integer tempoEmpresa, String empresaTerceirizada) {
        super(nome, salario, tempoEmpresa);
        this.empresaTerceirizada = empresaTerceirizada;
    }

    public String getEmpresaTerceirizada() {
        return empresaTerceirizada;
    }

    @Override
    public String toString() {
        return nome + " (" + empresaTerceirizada + ")";
    }
}
