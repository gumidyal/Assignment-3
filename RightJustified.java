package csc207.gumidyal.layout;

public class RightJustified implements TextBlock{

  TextBlock block;
  int width;

  public RightJustified(TextBlock block, int width) {
    this.block = block;
    this.width = width;
  } 
  public String row(int i) throws Exception {
    if (this.width >= this.block.width()) {
      String space = "  ";
      int h = this.block.height();

      if ((i >= 0) && (i < h)) {
        int lengthOfSpace = this.width - this.block.width();

        while (space.length() < lengthOfSpace) {
          space = space.concat(space);
        } 
        space = space.substring(0, lengthOfSpace);
        return space.concat(this.block.row(i));
      } 
      else {
        throw new Exception("Invalid row " + i);
      }
    }
    else {
      throw new Exception("Invalid width" + this.width);
    } 
  }

  public int height() {
    return this.block.height();
  }

  public int width() {
    return this.width;
  }

} //class
