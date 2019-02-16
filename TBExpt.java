package csc207.gumidyal.layout;

import java.io.PrintWriter;
//import java.io.Strings;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2019
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    TextBlock block = new TextLine("Hello");

    // Print out the block
    TBUtils.print(pen, block);
    
    pen.println();

    /*
    
    // Create a block to use
    TextBlock block2 = new BoxedBlock(new TextLine("Hello"));

    // Print out the block
    TBUtils.print(pen, block2);
    
    //exercise3
    TextBlock block3 = new BoxedBlock(new TextLine("mamma mia!"));
    TBUtils.print(pen, block3);
    
    //exercise4a
    TextBlock block4a = new BoxedBlock(new VComposition(new TextLine("hello"), new TextLine("goodbye")));
    TBUtils.print(pen, block4a);
    
  //exercise4b 
    TextBlock block4b = new HComposition(new BoxedBlock(new TextLine("hello")), new TextLine("goodbye"));
    TBUtils.print(pen, block4b);
    
    */
    
    
    /*
     * Begin work for Assignment 3
     */
    
    //Grid
    TextBlock grid1 = new Grid(7, 5, '*');
    TBUtils.print(pen, grid1);
  
    //Grid
    //TextBlock boxedgrid1 = new BoxedBlock(new Grid(3, 4, '*'));
    //TBUtils.print(pen, boxedgrid1);
  
    //TruncatedBlock
    TextBlock blockfortruncatedblock = new VComposition (new VComposition((new TextLine("Happy")), new TextLine("Valentine's Day")), new TextLine("Everybody!"));
    TextBlock truncatedblock= new TruncatedBlock(blockfortruncatedblock, 9);
    TBUtils.print(pen, truncatedblock);
    
    //CenteredBlock
    TextBlock blockforcenteredblock = new VComposition(new TextLine("happy"), new TextLine("sappy"));
    TextBlock centeredblock= new CenteredBlock(blockforcenteredblock, 13);
    TBUtils.print(pen, centeredblock);
    TextBlock boxblock = new BoxedBlock(blockforcenteredblock);
    TBUtils.print(pen, boxblock);
 
    //pen.println(centeredblock.width());
    
    
    
    
    
    // Clean up after ourselves.
    pen.close();
  } // main(String[])
  
  
  

} // class TBExpt
