/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Stateless;

/**
 *
 * @author Juanes
 */
@Stateless
public class Calbean implements CalbeanLocal {

    @Override
    public Integer sum(int val1, int val2) {
        return val1+val2  ;
    }
    @Override
    public Integer res(int val1, int val2) {
        return val1-val2  ;
    }
    @Override
    public Integer mul(int val1, int val2) {
        return val1*val2  ;
    }
    @Override
    public Integer div(int val1, int val2) {
        return val1/val2  ;
    }
    
    @Override
    public Integer mod(int val1, int val2) {
        return val1%val2  ;
    }

    @Override
    public Integer pot(int val1, int val2) {
        int Resul = (int) Math.pow(val1, val2);
        return Resul;
    }    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
