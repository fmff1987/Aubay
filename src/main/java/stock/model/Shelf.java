/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.model;

/**
 *
 * @author HP
 */
public class Shelf extends Entity{
    private int capacity;
    private float rent;
    private Product product;

    //GET AND SET
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public float getRent() {
        return rent;
    }
    public void setRent(float rent) {
        this.rent = rent;
    }

    public Shelf() {
        this.capacity = 1;
    }
    
}
