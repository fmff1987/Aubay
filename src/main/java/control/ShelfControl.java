/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import stock.model.Shelf;
import java.util.Collection;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import repositories.EntityRepository;
import repositories.ShelfRepository;

/**
 *
 * @author HP
 */

@RequestScoped
public class ShelfControl {
    
    @Inject
    ShelfRepository dbShelf;
   
    
    public void createShelf(Shelf s){
        dbShelf.create(s);
    }
    
    public Shelf searchShelf(long id){
        return (Shelf)dbShelf.searchX(id);
    }
    
    public void removeShelf(long id){
        dbShelf.remove(id);
    }
    
    public Collection<Shelf> getShelf(){
        return dbShelf.searchAll();
    }
    
    public void editShelf(Shelf shelf){
        dbShelf.edit(shelf);
    }    
}
