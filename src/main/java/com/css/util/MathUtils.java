package com.css.util;

/** Collection of math related utils. */
public class MathUtils {

  private MathUtils() {}

  
  /** @return a Possion random number with mean value {@code mean}. */
  public static int generatePoissonNumber(double mean) {
     Random r = new Random();
    double L = Math.exp(-mean);
    int k = 0;
    double p = 1.0;
    do {
      p = p * r.nextDouble();
      k++;
    } while (p > L);
    return k - 1;
  }
}
