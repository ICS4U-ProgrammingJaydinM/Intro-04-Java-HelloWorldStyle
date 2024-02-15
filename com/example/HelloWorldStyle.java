package com.example;

/**
 * Prints Hello world and goodbye to Kent.
 *
 * @author Jaydin Madore
 * @version 1.0
 * @since 2024/02/13
 */


// HelloWorldStyle class
public final class HelloWorldStyle {

  /** Private constructor to prevent instantiation. */
  private HelloWorldStyle() {
    throw new UnsupportedOperationException("Cannot instantiate");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {
    System.out.println("Hello Kent\n");
    System.out.println("goodbye Kent\n");
  }
}
