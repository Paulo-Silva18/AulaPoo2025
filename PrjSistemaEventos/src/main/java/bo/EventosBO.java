/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import dao.EventosDAO;
import java.util.List;
import objects.Eventos;

/**
 *
 * @author IFTM
 */
public class EventosBO {
    EventosDAO eDAO;

    public EventosBO(){
        eDAO = new EventosDAO();
    }
    
    public Eventos salvar(Eventos e){
        return eDAO.salvar(e);
    } 
    
    public Eventos editar(Eventos e){
        return eDAO.editar(e);
    }
    
    public List<Eventos> getEventos(){
        return eDAO.getEventos();
    }
}
