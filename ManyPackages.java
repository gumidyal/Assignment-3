package com.mcfarevee.groceries;

public class ManyPackages implements Item{
  Package type;
  int count;

  public ManyPackages(Package type, int count) {
    this.type = type;
    this.count = count;
  }
  public Weight getWeight() {
    int total = this.type.getWeight().amount * this.count;
    Weight total1 = new Weight(this.type.getWeight().unit, total);
    return total1;
  }
  public int getPrice() {
    return (this.type.getPrice() * this.count);
  }
  public String toString() {
    String quantity = String.valueOf(this.count);
    String all = quantity.concat(" x ").concat(this.type.toString());
    return all;
  }
  public boolean equals(Item otherpackage) {
    return (this == otherpackage);
  }
  public int getCount() {
    return this.count;
  }
}
