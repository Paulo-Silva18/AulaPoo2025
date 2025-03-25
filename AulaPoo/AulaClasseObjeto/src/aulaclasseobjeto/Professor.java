package aulaclasseobjeto;

/**
 *
 * @author IFTM
 */
public class Professor {
    private String nome;
    private String departamento;
    
    public void mostrarInformacoes (){
        System.out.println("Nome do professor(a): " + nome + "\nDepartamento: " + departamento);
    }
    
    // metodos setters
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public void setDepartamento (String departamento){
        this.departamento = departamento;
    }
    
    // metodos getters
    public String getNome(){
        return "Ms." + this.nome;
    }
    
    public String getDepartamento (){
        return this.departamento;
    }
}
