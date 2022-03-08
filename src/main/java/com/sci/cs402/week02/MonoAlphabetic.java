package com.sci.cs402.week02;

import java.io.File;
import java.io.IOException;

public class MonoAlphabetic {

  /**
   * The array size should be 26 and the alphabetic letters should be distributed between all the
   * elements. key[0] should be the cipher letter of encrypting the letter 'a' and k[1] should be
   * the cipher letter of encrypting the letter 'b' and so on ...
   */
  private final char[] key;

  /**
   * Hint: create another char array with 26 elements let say keyRevert. Configure keyRevert[0] the
   * letter of decrypting the letter 'a' and keyRevert[1] the letter of decrypting the letter 'b'
   * and so on ...
   */
//  private char[] keyRevert;
  public MonoAlphabetic(char[] key) {
    this.key = key;
//    initKeyRevert(key);
  }

//  private void initKeyRevert(char[] key) {
//  }

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
}
