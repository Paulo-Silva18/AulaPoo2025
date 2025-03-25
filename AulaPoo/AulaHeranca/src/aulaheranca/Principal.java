/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaheranca;

/**
 *
 * @author IFTM
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Funcionario maria = new Funcionario();
        maria.setNome("Maria");
        maria.setSobrenome(("Beatriz"));
        maria.setSalario(620.00);
        System.out.println("Funcionário: " + maria.getNome() + " " + maria.getSobrenome() + "\n" + "Salário: R$" + maria.getSalario());
        
        
        FuncionarioComissionado marcelo = new FuncionarioComissionado();
        marcelo.setNome("Marcelo");
        marcelo.setSobrenome("Junior");
        marcelo.setSalario(100.00);
        marcelo.setComissao(50.00);
        marcelo.setVendas(10);
        
        System.out.println("****************************************************");
        
        String mostrar = "Funcionário Comissionado: " +  marcelo.getNome() + " " + marcelo.getSobrenome() + "\n" + "Salário fixo: R$" + marcelo.getSalario();
        
        System.out.println(mostrar + "\n" + "Comissão: R$" + marcelo.getComissao() + "\n" + "Qtde vendas: " + marcelo.getVendas());
        
        System.out.println("mais 3 vendas");
        marcelo.acrescentarVendas(3);
        System.out.println(mostrar + "\n" + "Comissão: R$" + marcelo.getComissao() + "\n" + "Qtde vendas: " + marcelo.getVendas() + "Salário final: " + marcelo.calcularComissao());
        
        System.out.println("****************************************************");
        System.out.println("zerar vendas");
        marcelo.zerarVendas();
        System.out.println(mostrar + "\n" + "Comissão: R$" + marcelo.getComissao() + "\n" + "Qtde vendas: " + marcelo.getVendas() + "Salário final: " + marcelo.calcularComissao());
        System.out.println("****************************************************");

        
    }
    
}
