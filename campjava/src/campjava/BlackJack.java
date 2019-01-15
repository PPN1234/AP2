/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campjava;

/**
 *
 * @author c0116043
 */
public class BlackJack{
    public static void main(String[] args) {
          Dealer dealer=new Dealer();
          User user=new User();
        
        dealer.deal();
        dealer.setCards(dealer.deal());
        System.out.println("ディーラの最初の手札は"+dealer.open()+"です。");
        dealer.deal();
        user.setCards(dealer.deal());
        System.out.println("プレイヤーの最初の手札は"+user.open()+"です。");
        for(int i=0; dealer.checkSum()==true; i++){
        if(dealer.checkSum()==true){     
            dealer.setCards(dealer.hit());
            System.out.println("ディーラはカードを１枚引きました。手札は"+dealer.open()+"です。");
        }
        }
        for(int j=0; user.checkSum()==true; j++){
        if( user.checkSum()==true){
           user.setCards(dealer.hit());
            System.out.println("プレイヤーはカードを１枚引きました。手札は"+user.open()+("です。"));
        }
        }
        if(dealer.open()>=22 && user.open()>=22){
            System.out.println("お互いに２２を超えたので引き分けです。");
        }else if(dealer.open()>=22 && user.open()<=21){
            System.out.println("プレイヤーの勝ちです。");
        }else if(user.open()>=22 && dealer.open()<=21){
            System.out.println("ディーラーの勝ちです。");
        }else if(dealer.open()==21 && user.open()==21){
            System.out.println("お互いにブラックジャックです。");
        }else if(dealer.open()==21 && user.open()<=20){
            System.out.println("ディーラーがブラックジャックで勝ちです。");
        }else if(user.open()==21 && dealer.open()<=20){
            System.out.println("プレイヤーがブラックジャックで勝ちです。");
        }else if(dealer.open()>user.open()){
            System.out.println("ディーラーが２２を超えずプレイヤーよりも２１に近いので勝ちです。");
        }else if(user.open()>dealer.open()){
            System.out.println("プレイヤーが２２を超えずディーラーよりも２１に近いので勝ちです。");
        }

    }
}
