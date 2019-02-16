package com.mcfarevee.groceries;

public class Package implements Item{
  String name;
  Weight weight;
  int price;

 
  public Package(String name, Weight weight, int price) {
    this.name = name;
    this.weight = weight;
    this.price = price;
  }

  public Weight getWeight() {
    return this.weight;
  }
  public int getPrice() {
    return this.price;
  }
  public String toString() {
    String amount = String.valueOf(this.weight.amount);
    String unit = this.weight.getUnit().toString();
    String all = amount.concat(" ").concat(unit).concat(" of ").concat(this.name);
    return all;
  }
  public boolean equals(Object item) {
    if (item instanceof Package) {
      Package otherpackage = (Package) item;
      return (this.name.equals(otherpackage.name) && this.weight.equals(otherpackage.weight)
          && this.price == otherpackage.price);
    } else {
      return (item instanceof Package);
    }

    }
  
  public String getName() {
    return this.name;
  }
}//class
