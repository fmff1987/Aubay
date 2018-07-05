/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import control.ProductControl;
import stock.model.Product;


import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


import java.util.Collection;


@Named("productBean")
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

    
    
    
    public String create(Product p){
        pC.createPrdt(p);
        return "index";
    }
    
    public void remove(){
        pC.removePrdt(p.id);
    }
    
    public Collection<Product> getPList(){
        return pC.getPrdt();
    }
    
  
        
}
