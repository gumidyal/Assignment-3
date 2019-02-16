package com.mcfarevee.groceries;

public class NonFood implements Item {
  String name;
  Weight weight;
  int price;


  public NonFood(String name, Weight weight, int price) {
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
    return this.name;
  }
  public boolean equals(Object item) {
    if (item instanceof NonFood) {
      NonFood other = (NonFood) item;
      return (this.name.equals(other.name) && this.weight.equals(other.weight)
          && this.price == other.price);
    } 
    else {
      return (item instanceof NonFood);
    }
  }
}
