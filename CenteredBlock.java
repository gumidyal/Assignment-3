package csc207.gumidyal.layout;


public class CenteredBlock implements TextBlock{
    
  //+--------+------------------------------------------------------------
   // | Fields |
   // +--------+

  
   TextBlock block;

   
   int width;

   // +--------------+------------------------------------------------------
   // | Constructors |
   // +--------------+

   
    public CenteredBlock(TextBlock block, int width) {
      this.block = block;
      this.width = width;
    } // CenteredBlock(TextBlock, int)

    /**
     * Get the ith row of the block.
     */
    public String row(int i) throws Exception{
      //important information
      int w = this.block.width(); //width of input block
      int h = this.block.height(); //height of input block
      int buffer = (width - 2 - w)/2;
      
      // check
      if ((w + 2) > width) {
        throw new Exception ("Invalid entry: text block too wide for the desired width of centered block");
      }
      
      if ((i == 0) || (i == h+1)) {
        return "+" + TBUtils.dashes(width-2) + "+";
      }
      // Stuff within the box
      else if ((i > 0) && (i <= h)) {
        return "|" + TBUtils.spaces(buffer) + this.block.row(i-1) + TBUtils.spaces(buffer) + "|";
      }
      // Everything else
      else {
        throw new Exception("Invalid row " + i);
      }      
    } // row(int)

 
    public int height() {
      return this.block.height() + 2;
    } // height()

   
    public int width() {
      return width;
    } // width()
  } // class TruncatedBlock{


