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
public class EventosDAO {
    Connection conn;
    
    public EventosDAO(){
        conn = new Conexao().conectar();
    }
    public Eventos salvar(Eventos e) {
        try{
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO evento(titulo, data, local, idpessoa) values(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, e.getTitulo());
            stmt.setString(2, e.getData());
            stmt.setString(3, e.getLocal());
            stmt.setInt(4, e.getPessoas().getIdpessoa());
            stmt.execute();
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                e.setIdevento(rs.getInt("idevento"));
            }
            else{
                e.setIdevento(-1);
            }
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return e;
    }
    
    public Eventos editar(Eventos e) {
        try{
            PreparedStatement stmt = conn.prepareStatement("UPDATE evento SET titulo = ?, data = ?, local = ? WHERE idevento = ?", Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, e.getTitulo());
            stmt.setString(2, e.getData());
            stmt.setString(3, e.getLocal());
            stmt.setInt(4, e.getPessoas().getIdpessoa());
            stmt.execute();
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
        return e;
    }
    
    public List<Eventos> getEventos(){
        List<Eventos> lstE = new ArrayList<>();
        ResultSet rs;
        
        try{
            PreparedStatement ppStmt = conn.prepareStatement("SELECT * FROM evento");
            rs = ppStmt.executeQuery();
            while(rs.next()){
                lstE.add(getEvento(rs));
            }
            
        }
        catch(SQLException ex) {
            ex.printStackTrace();
        }
        return lstE;
    }
    
    private Eventos getEvento(ResultSet rs) throws SQLException {
        Pessoas p = new Pessoas();
        Eventos e = new Eventos();
        e.setIdevento(rs.getInt("idevento"));
        e.setTitulo(rs.getString("titulo"));
        e.setData(rs.getString("data"));
        e.setLocal(rs.getString("local"));
        p.setIdpessoa(rs.getInt("idpessoa"));
        e.setPessoas(p);
      
        return e;
        
    }
}
