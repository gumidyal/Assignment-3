package com.mcfarevee.shopping;
import java.io.PrintWriter;
import java.util.ArrayList;
import com.mcfarevee.groceries.BulkItem;
import com.mcfarevee.groceries.Item;
import com.mcfarevee.groceries.ManyPackages;
import com.mcfarevee.groceries.Package;


public class Cart {
  ArrayList<Item> cart;

  public Cart() {
    this.cart = new ArrayList<Item>();
  }

  public void addItem(Item someitem) {
    this.cart.add(someitem);
  }
  public int numThings() {
    int num = 0;
    for (int i = 0; i < this.cart.size(); i++) {
      if (this.cart.get(i) instanceof ManyPackages) {
        ManyPackages temp = (ManyPackages) this.cart.get(i);
        num += temp.getCount();
      } 
      else {
        num += 1;
      }
    }
    return num;
  }
  public int numEntries() {
    return this.cart.size();
  }
  public void printContents(PrintWriter pen) {
    for (int i = 0; i < this.cart.size(); i++) {
      pen.println(this.cart.get(i).toString());
    }
  }
  public int getPrice() {
    int price = 0;
    for (int i = 0; i < this.cart.size(); i++) {
      price += this.cart.get(i).getPrice();
    }
    return price;
  }


  public void remove(String name) {
    for (int i = 0; i < this.cart.size(); i++) {
      if (this.cart.get(i).toString().contains(name)) {
        this.cart.remove(i);
        i--;
      }
    }
  }
}
