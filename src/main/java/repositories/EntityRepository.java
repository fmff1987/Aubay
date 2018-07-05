/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import stock.model.Entity;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author HP
 */
public abstract class EntityRepository <T extends Entity> {

    Map <Long, T> dataBase = new LinkedHashMap<>();
    protected long highestId = 0;
    
    protected long nextId(){
        return ++highestId;
    }
    public long create(T obj){
        //inserir validaçoes TRY/CATCH
        long id = nextId(); 
        obj.setId(id);
        dataBase.put(id, obj);
        return id;
    }
    public Collection<T> searchAll(){
        return dataBase.values();          //Retorna uma coleçao de objetos de uma classe X
    }
    public T searchX(long id){  
        return dataBase.get(id);
    }
    public void edit(T obj){
        dataBase.put(obj.getId(), obj);
    }
    public void remove(long id){
        dataBase.remove(id);
    }
}
