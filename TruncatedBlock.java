package csc207.gumidyal.layout;

public class TruncatedBlock implements TextBlock {
  public int width;
  TextBlock block;
  
  public TruncatedBlock(TextBlock tb, int width) {
    this.block = tb;
    this.width = width;
    
  }

 public String row(int i) throws Exception {
   int h = this.block.height();
   if ((i >= 0) && (i < h)) {
     String truncate = this.block.row(i).substring(0, this.width);
     return truncate;
   } else {
     throw new Exception("Invalid " + i);
   }
 }
 public int height() {
   return this.block.height();
 } 

 public int width() {
   return this.block.width();
 } 
}// class
