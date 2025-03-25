/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosclasseheranca;

/**
 *
 * @author IFTM
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Paulo");
        p1.setCodigo(01);
        p1.setDataCadastro("02/01/2025");
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Pedro");
        p2.setCodigo(02);
        p2.setDataCadastro("22/05/2025");
        
        System.out.println("Pessoa 1: Nome: " + p1.getNome() + "; " + "Codigo: " + p1.getCodigo() + "; " + " Data de cadastro: " + p1.getDataCadastro() + "\n");
        
        System.out.println("Pessoa 2: Nome: " + p2.getNome() + "; " + "Codigo: " + p2.getCodigo() + "; " + " Data de cadastro: " + p2.getDataCadastro() + "\n");
        
        Cliente c1 = new Cliente();
        c1.setNome("Joao");
        c1.setCodigo(03);
        c1.setDataCadastro("10/10/2025");
        c1.setEmail("123@gmail.com");
        c1.setEndereco("Rua São João 123");
        c1.setTelefone("00000-0000");
        
        Cliente c2 = new Cliente();
        c2.setNome("Maria");
        c2.setCodigo(04);
        c2.setDataCadastro("24/03/2025");
        c2.setEmail("456@gmail.com");
        c2.setEndereco("Rua Teodoro 456");
        c2.setTelefone("99999-9999");
        
        System.out.println("****************************************************");
        
        System.out.println("Cliente 1: Nome: " + c1.getNome() + "; " + "Codigo: " + c1.getCodigo() + "; " + "Data de cadastro: " + c1.getDataCadastro() + "; " + "Email: " + c1.getEmail() + "; " + "Endereco: " + c1.getEndereco() + "; " + "Telefone: " + c1.getTelefone() + "\n");
        
        System.out.println("Cliente 2: Nome: " + c2.getNome() + "; " + "Codigo: " + c2.getCodigo() + "; " + "Data de cadastro: " + c2.getDataCadastro() + "; " + "Email: " + c2.getEmail() + "; " + "Endereco: " + c2.getEndereco() + "; " + "Telefone: " + c2.getTelefone() + "\n");
        
        
        Usuario u1 = new Usuario();
        u1.setNome("Ze");
        u1.setCodigo(05);
        u1.setDataCadastro("25/10/2025");
        u1.setLogin("Paulo");
        u1.setSenha("123");
        
        
        Usuario u2 = new Usuario();
        u2.setNome("Jorge");
        u2.setCodigo(06);
        u2.setDataCadastro("26/10/2025");
        u2.setLogin("Pedro");
        u2.setSenha("456");
        
        System.out.println("****************************************************");
        
        System.out.println("Usuario 1: Nome: " + u1.getNome() + "; " + "Codigo: " + u1.getCodigo() + "; " + " Data de cadastro: " + u1.getDataCadastro() + "; " + "Login: " + u1.getLogin() + "; " + "Senha: " + u1.getSenha() + "\n");
        
        System.out.println("Usuario 2: Nome: " + u2.getNome() + "; " + "Codigo: " + u2.getCodigo() + "; " + " Data de cadastro: " + u2.getDataCadastro() + "; " + "Login: " + u2.getLogin() + "; " + "Senha: " + u2.getSenha() + "\n");


    }
    
}
