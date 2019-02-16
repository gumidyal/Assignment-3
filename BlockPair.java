package csc207.gumidyal.layout;

public class BlockPair implements TextBlock {

  TextBlock block;
  
  public BlockPair(TextBlock block) {
    this.block = block;
  }
  
  
  /*
   * @throws Exception
   */
  public String row(int i) throws Exception {
    int h = this.block.height();
    if ((i >= 0 && (i < h)) {
      String row = this.block.row(i);
      String pair = row.concat(row);
      return pair;
    } 
    else {
      throw new Exception("Invalid row " + i);
    }
  }
  
  public int height() {
    return this.block.height();
  }
  
  public int width() {
    return (this.block.width() * 2);
  }
}//class
