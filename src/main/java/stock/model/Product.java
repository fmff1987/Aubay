/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.model;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author HP
 */
public class Product extends Entity{
    private ArrayList <Shelf> shelfList = new ArrayList<>();
    private int discount;
    private int iva;
    private float pvp;          //price for sell

    //GET AND SET
    public ArrayList<Shelf> getShelf() {
        return shelfList;
    }

    
    /*public String getShelfString(){
        String temp2= " "; 
        for (Shelf s: shelfList){
            temp2 += s.getId() + " ";
        }
        return temp2;
    }*/
    
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public int getIva() {
        return iva;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }
    public float getPvp() {
        return pvp;
    }
    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    
    @Override
    public String toString(){
        return String.valueOf(this.getId());
    }
    
}
