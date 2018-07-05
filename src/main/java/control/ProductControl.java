/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import stock.model.Product;
import stock.model.Shelf;
import java.util.Collection;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import repositories.EntityRepository;
import repositories.ProductRepository;

@RequestScoped
public class ProductControl {
    
    @Inject 
    ProductRepository dbProduct;

       
    public void createPrdt(Product p){
        dbProduct.create(p);
    }
    public static void shelf(Shelf s, Product p){
        p.getShelf().add(s);
        s.setProduct(p);
    }
    public  Product searchPrdt(long id){
        return (Product) dbProduct.searchX(id);
    }
    
    public  void removePrdt(long id){
        dbProduct.remove(id);
    }
    
    public Collection<Product> getPrdt(){
        return dbProduct.searchAll();
    }
    
    public  void editPrdt(Product prdt){
        dbProduct.edit(prdt);
    }
}
