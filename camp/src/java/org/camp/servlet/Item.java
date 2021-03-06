package org.camp.servlet;

/**
 * 一つの商品をあらわすクラス
 */
public class Item {

  private int    id    = 0; // 商品に付与されたID
  private String name  = ""; // 商品名
  private int    price = 0; // 値段

  /**
   * コンストラクタ
   *
   * 商品ID,名前，値段を引数に取る．
   */
  public Item(int id, String name, int price) {

    this.id = id;
    this.name = name;
    this.price = price;
  }

  /**
   * 商品IDを返す．
   */
  public int getId() {

    return id;
  }

  /**
   * 商品の名前を返す．
   */
  public String getName() {

    return name;
  }

  /**
   * 商品の値段を返す
   */
  public int getPrice() {

    return price;
  }
}