/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campjava;

import java.util.ArrayList;

/**
 *
 * @author c0116043
 */
abstract class Human {

    ArrayList<Integer> myCards = new ArrayList<Integer>();
    abstract protected int open();
    abstract protected void setCards(ArrayList<Integer> a);
    abstract protected boolean checkSum();
       
    }