package com.sci.cs402.week02;

import java.io.File;
import java.io.IOException;

public class PlayFair {

  private final PlayFairKey playFairKey;

  public PlayFair(String key) {
    this.playFairKey = new PlayFairKey(key);
  }

  public String encrypt(String plainText) {
    return null;
  }

  public String decrypt(String cipherText) {
    return null;
  }

  public File encrypt(File plainTextFile) throws IOException {
    return null;
  }

  public File decrypt(File cipherTextFile) throws IOException {
    return null;
  }

  /**
   * Playfair key class the manage the initialization of the key matrix and the
   * encryption/decryption of two letters.
   */
  static class PlayFairKey {

    private static final int MATRIX_SIZE = 5;

    private final char[][] keyMatrix = new char[MATRIX_SIZE][MATRIX_SIZE];

    public PlayFairKey(String key) {
      buildKeyMatrix(key);
    }

    /**
     * Initialization the key matrix.
     */
    private void buildKeyMatrix(String key) {
      // TODO implement the method
    }

    public String encrypt(char ch1, char ch2) {
      // Hint:
      // get row position of ch1 (let I1)
      // get column position of ch1 (let J1)
      // get row position of ch2 (let I2)
      // get column position of ch2 (let J2)
      // the result should be keyMatrix[I1][J2] appended with keyMatrix[I2][J1]
      // should handle the letter in the same column or the same row
      return null;
    }

    public String decrypt(char ch1, char ch2) {
      // the reverse of the encryption mechanism
      return null;
    }

//    private int rowPosition(char ch) {
//      return -1;
//    }
//
//    private int columnPosition(char ch) {
//      return -1;
//    }

  }
}
