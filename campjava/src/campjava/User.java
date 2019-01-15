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
public class User extends Human {

    @Override
    protected void setCards(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            myCards.add(a.get(i));
        }
    }

    @Override
    protected boolean checkSum() {
        int num = open();

        if (num < 17) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    protected int open() {
        int sum = 0;
        for (int i = 0; i < myCards.size(); i++) {
            if (myCards.get(i) >= 10) {
                sum += 10;
            } else {
                sum += myCards.get(i);
            }
        }
        return sum;
    }
}
