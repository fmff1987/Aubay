/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import control.ProductControl;
import control.ShelfControl;
import stock.model.Product;
import stock.model.Shelf;


import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

import java.util.Collection;
import javafx.scene.control.TableColumn.CellEditEvent;



@RequestScoped
public class ProductBean {
   
    private Product p = new Product();
    
    @Inject
    ProductControl pC; //Assim é criado o objeto pC da classe ProductControl 

    public Product getP() {
        return p;
    }

    public void setP(Product product) {
        this.p = product;
    }  

    public Product search(long id){
        return pC.searchPrdt(id);
    }

    public  void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void edit(){
        addMessage("Produto Editado", "ID: " + p.getId());
    }
    
    public void cancelEdit(){
        addMessage("Edição Cancelada", "ID: " + p.getId());
    }
    
    
    public  void create(Product p){
        pC.createPrdt(p);
        addMessage("Produto Criado", "ID: " + p.getId());
    }
    
    public void remove(){
        pC.removePrdt(p.id);
        addMessage("Produto Removido", "");
    }
    
    public Collection<Product> getPList(){
        return pC.getPrdt();
    }
    
  
    
    public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
        
}
