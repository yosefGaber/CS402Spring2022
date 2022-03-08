package com.sci.cs402.utilities;

public class Utils {

  public static String generateRandomPlainText() {
    int sz = 15 + (int) (Math.random() * 7);
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < sz; i++) {
      res.append((char) ('a' + (int) (Math.random() * 26)));
    }
    return res.toString();
  }
}
