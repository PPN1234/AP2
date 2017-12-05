/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package en09;

public class Tweet {

    //フィールド
    private int tweetNo;	//ツイートの番号
    private String twitterID;	//twitterID
    private String name;	//氏名
    private String tweetTime;	//投稿日時
    private String text;	//投稿内容

    //コンストラクタ
    public Tweet(int no,String tid,String n,String t,String te) {
            this.tweetNo=no;
            this.twitterID=tid;
            this.name=n;
            this.tweetTime=t;
            this.text=te;
        //とりあえず何もしない
    }

    @Override
    public String toString() {
        return tweetNo+":"+ twitterID+"( "+name+")<br>" +tweetTime+"<br>"+text+"<br>";
    }
    
}
