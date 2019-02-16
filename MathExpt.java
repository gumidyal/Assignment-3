package csc207.gumidyal.layout;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * A few simple experiments with our utilities.
 * Version 1.1 of February 2019.
 */
public class MathExpt {
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);

    // Print some square roots.
    int i = 2;
    double root = MathUtils.squareRoot(i);
    pen.println("The square root of " + i + " seems to be " + root);
    pen.println(root + "^2 = " + (root * root));

    Integer j = 2;
    double root1 = MathUtils.squareRoot(j);
    pen.println("The square root of " + j + " seems to be " + root1);
    pen.println(root1 + "^2 = " + (root1 * root1));

    Float k = (float) 2.3;
    double root2 = MathUtils.squareRoot(k);
    pen.println("The square root of " + k + " seems to be " + root2);
    pen.println(root2 + "^2 = " + (root2 * root2));

    Double l = 3.2;
    double root3 = MathUtils.squareRoot(l);
    pen.println("The square root of " + l + " seems to be " + root3);
    pen.println(root3 + "^2 = " + (root3 * root3));

    
    BigInteger m = new BigInteger("12345");
    double root4 = MathUtils.squareRoot(m);
    pen.println("The square root of " + m + " seems to be " + root4);
    pen.println(root4 + "^2 = " + (root4 * root4));

    BigDecimal n = new BigDecimal("2.3");
    double root5 = MathUtils.squareRoot(n);
    pen.println("The square root of " + n + " seems to be " + root5);
    pen.println(root5 + "^2 = " + (root5 * root5));

    double f = 2.3;
    double root6 = MathUtils.squareRoot(f);
    pen.println("The square root of " + f + " seems to be " + root5);
    pen.println(root6 + "^2 = " + (root6 * root6));

    
    
    // We're done. Clean up.
    pen.close();
  } // main(String[])
} // class MathExpt
