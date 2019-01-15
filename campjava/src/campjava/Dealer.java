/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campjava;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author c0116043
 */
public class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<Integer>();

    public Dealer() {
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i <= 13; i++) {
                cards.add(i);
            }
        }
    }

    public ArrayList<Integer> deal() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 2; i++) {
            Random rnd = new Random();
            int ran = rnd.nextInt(cards.size());
            a.add(cards.get(ran));
            cards.remove(ran);

        }
        return a;
    }

    public ArrayList<Integer> hit() {
        ArrayList<Integer> b = new ArrayList<Integer>();
        Random rnd = new Random();
        int ran = rnd.nextInt(cards.size());

        b.add(cards.get(ran));
        cards.remove(ran);
        return b;
    }

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
        int sum=0;
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
