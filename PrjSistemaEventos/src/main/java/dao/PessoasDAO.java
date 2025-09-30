/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import objects.Eventos;
import objects.Pessoas;
import util.Conexao;

/**
 *
 * @author IFTM
 */
public class PessoasDAO {
    Connection conn;
    
    public PessoasDAO(){
        conn = new Conexao().conectar();
    }
    public Pessoas salvar(Pessoas p) {
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO pessoa(nome, email, idevento) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setInt(3, p.getEventos().getIdevento());
            stmt.execute();
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                p.setIdpessoa(rs.getInt("idpessoa"));
            }
            else{
                p.setIdpessoa(-1);
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
    }
    
    public Pessoas editar(Pessoas p) {
        try{
            PreparedStatement stmt = conn.prepareStatement("UPDATE pessoa SET nome = ?, email = ? WHERE idpessoa = ?", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getEmail());
            stmt.setInt(3, p.getIdpessoa());
            stmt.execute();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return p;
    }
    
    public List<Pessoas> getPessoas(Pessoas p){
        List<Pessoas> lstP = new ArrayList<>();
        ResultSet rs;
        try{
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa");
            rs = ppStmt.executeQuery();
            while(rs.next()) {
                lstP.add(getPessoa(rs));
            }
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return lstP;
    }
    
    public List<Pessoas> getPessoas(String nome){
        List<Pessoas> lstP = new ArrayList<>();
        ResultSet rs;
        
        try{
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa WHERE nome ILIKE ?");
            ppStmt.setString(1, nome+ "%");
            rs = ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPessoa(rs));
            }
            
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return lstP;
    }   
    
    public Pessoas getPessoas(int idpessoa) {
        Pessoas p = new Pessoas();
        ResultSet rs;
        try{
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa WHERE idpessoa ", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ppStmt.setInt(1, idpessoa);
            rs = ppStmt.executeQuery();
            rs.first();
            p = getPessoa(rs);
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return p;
    }
    
    public List<Pessoas> getPessoas(){
        List<Pessoas> lstP = new ArrayList<>();
        ResultSet rs;
        
        try{
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM pessoa");
            rs = ppStmt.executeQuery();
            while(rs.next()){
                lstP.add(getPessoa(rs));
            }
            
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return lstP;
    }
    
    private Pessoas getPessoa(ResultSet rs) throws SQLException {
        Pessoas p = new Pessoas();
        Eventos e = new Eventos();
        p.setIdpessoa(rs.getInt("idpessoa"));
        p.setNome(rs.getString("nome"));
        p.setEmail(rs.getString("email"));
        e.setIdevento(rs.getInt("idevento"));
        p.setEventos(e);
      
        return p;
        
    }
}
