/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import stock.model.Shelf;

public class ShelfRepository extends EntityRepository<Shelf>{
    private static final ShelfRepository INSTANCE = new ShelfRepository();

    public static ShelfRepository getInstance() {
        return INSTANCE;
    }

    public ShelfRepository() {
    }
}
