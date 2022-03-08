package com.sci.cs402.week02;

import com.sci.cs402.utilities.Utils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MonoAlphabeticTest {

  @Test
  public void testScenario1() {

    char[] keys = new char[26];
    for (int i = 0; i < 26; i++) {
      keys[i] = (char) ('a' + i);
    }

    for (int i = 0; i < 1000; i++) {
      int I = (int) (Math.random() * 26);
      int J = (int) (Math.random() * 26);
      char tmp = keys[I];
      keys[I] = keys[J];
      keys[J] = tmp;
    }

    Map<Character, Character> mp = new HashMap<>();
    for (int i = 0; i < 26; i++) {
      mp.put((char) ('a' + i), keys[i]);
    }

    MonoAlphabetic monoAlphabetic = new MonoAlphabetic(keys);
    System.out.println(Arrays.toString(keys));
    System.out.println(monoAlphabetic.encrypt("the quick brown fox jumps over the lazy dog"));
    int times = 100;
    String plainText, cipherText, resultPlainText, trueCipherText;
    while (times-- > 0) {

      plainText = Utils.generateRandomPlainText();
      cipherText = monoAlphabetic.encrypt(plainText);
      resultPlainText = monoAlphabetic.decrypt(cipherText);
      trueCipherText = getTrueCipherText(mp, plainText);

//      Assertions.assertEquals(plainText, resultPlainText);

      Assertions.assertEquals(cipherText, trueCipherText);

      System.out.println("plain text=" + plainText + " & cipher text=" + cipherText);
    }

  }

  private String getTrueCipherText(Map<Character, Character> mp, String plainText) {
    String res = "";
    for (int i = 0; i < plainText.length(); i++) {
      res += mp.get(plainText.charAt(i));
    }
    return res;
  }

}
