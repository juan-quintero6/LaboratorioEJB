/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.session;

import javax.ejb.Local;

/**
 *
 * @author Juanes
 */
@Local
public interface CalbeanLocal {

    Integer sum(int val1, int val2);
    Integer res(int val1, int val2);
    Integer mul(int val1, int val2);
    Integer div(int val1, int val2);    
    Integer mod(int val1, int val2); 
    Integer pot(int val1, int val2);     
}
