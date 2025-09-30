/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import dao.PessoasDAO;
import java.util.List;
import objects.Pessoas;

/**
 *
 * @author IFTM
 */
public class PessoasBO {
    PessoasDAO pDAO;

    public PessoasBO(){
        pDAO = new PessoasDAO();
    }
    
    public Pessoas salvar(Pessoas p){
        return pDAO.salvar(p);
    } 
    
    public Pessoas editar(Pessoas p){
        return pDAO.editar(p);
    }
    
    public List<Pessoas> getPessoas(){
        return pDAO.getPessoas();
    }
    
    public List<Pessoas> getPessoas(Pessoas p){
        return pDAO.getPessoas(p);
    }
    
    public List<Pessoas> getPessoas(String nome){
        return pDAO.getPessoas(nome);
    }
    
    public Pessoas getPessoas(int idpessoa){
        return pDAO.getPessoas(idpessoa);
    }
     
}
