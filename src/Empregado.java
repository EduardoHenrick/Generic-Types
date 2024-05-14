public class Empregado {

    protected String nome;
    protected Double salario;
    protected Integer tempoEmpresa;

    public Empregado(String nome, Double salario, Integer tempoEmpresa){
        this.nome = nome;
        this.salario = salario;
        this.tempoEmpresa = tempoEmpresa;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Integer getTempoEmpresa() {
        return tempoEmpresa;
    }
    public void setTempoEmpresa(Integer tempoEmpresa) {
        this.tempoEmpresa = tempoEmpresa;
    }

    @Override
    public String toString() {
        return nome;
    }
}
