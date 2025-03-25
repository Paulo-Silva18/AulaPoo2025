package aulaclasseobjeto;

/**
 *
 * @author IFTM
 */
public class Principal {
    public static void main(String[] args) {
        
        Professor jean = new Professor();
        jean.setNome("Jean Lucas Sousa");
        jean.setDepartamento("Informática II");
//        jean.nome = "Jean Lucas";
//        jean.departamento = "Informática II";
        
        Professor josele = new Professor();
        josele.setNome("Josele França");
        josele.setDepartamento("Administração");
//        josele.nome = "Josele França";
//        josele.departamento = "Administração";
        
//        jean.mostrarInformacoes();;
//        josele.mostrarInformacoes();
        
        System.out.println("Professores da instituição: " + jean.getNome() + " - " + josele.getNome());
    }
    
}
