package com.mcfarevee.groceries;

public class BulkItem implements Item {
  
  BulkFood food;
  Unit unit;
  int amount;
 
  public BulkItem(BulkFood food, Unit unit, int amount) {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
  }
  public Weight getWeight() {
    return new Weight(this.unit, this.amount);
  }
  public int getPrice() {
    return (this.food.pricePerUnit * this.amount);
  }
  public String toString() {
    String amount = String.valueOf(this.amount);
    String unit = this.unit.toString();
    String all = amount.concat(" ").concat(unit).concat(" of ").concat(this.food.name);
    return all;
  }
  public boolean equal(Object item) {
    if (item instanceof BulkItem) {
      BulkItem other = (BulkItem) item;
      return (this.food.equals(other.food) && this.unit.equals(other.unit)
          && this.amount == other.amount);
    } else {
      return (item instanceof BulkItem);
    }
  }

  public BulkFood getFood() {
    return this.food;
  }

  public Unit getUnit() {
    return this.unit;
  }

  public int getAmount() {
    return this.amount;
  }
}//class
