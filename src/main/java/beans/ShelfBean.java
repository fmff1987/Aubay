/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;



import control.ShelfControl;
import stock.model.Shelf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import java.util.Collection;

@Named ("shelfBean")
@RequestScoped
public class ShelfBean {
    
    private Shelf s = new Shelf();
    
    public Shelf getS() {
        return s;
    }
    
    public void setS(Shelf s) {
        this.s = s;
    }
        
    @Inject
    ShelfControl sC;
    
    public Collection<Shelf> getSList(){
        return sC.getShelf();
    }


     public  void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void create(Shelf s){
        sC.createShelf(s);
        addMessage("Prateleira Criada", "ID: " + s.getId());
    }
    
}
