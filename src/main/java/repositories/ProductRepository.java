/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import stock.model.Product;

public class ProductRepository extends EntityRepository<Product>{
    private static final ProductRepository INSTANCE = new ProductRepository();

    private ProductRepository() {

    }

    public static ProductRepository getInstance() {
        return INSTANCE;
    }

}
