package com.sci.cs402.week03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PlayFairTest {

  @Test
  public void testScenario1() {

    PlayFair playFair = new PlayFair("abdelghany");

    String plainText = "document";
    String cipherText = "lkgzsycr";

    Assertions.assertEquals(cipherText, playFair.encrypt(plainText));

    Assertions.assertEquals(plainText, playFair.decrypt(playFair.encrypt(plainText)));
  }

  @Test
  public void testScenario2() {

    PlayFair playFair = new PlayFair("password");

    String plainText = "username";
    String cipherText = "xprdmstd";

    Assertions.assertEquals(cipherText, playFair.encrypt(plainText));

    Assertions.assertEquals(plainText, playFair.decrypt(playFair.encrypt(plainText)));
  }

  @Test
  public void testScenario3() {

    PlayFair playFair = new PlayFair("page");

    String plainText = "attack";
    String cipherText = "errekq";

    Assertions.assertEquals(cipherText, playFair.encrypt(plainText));

    Assertions.assertEquals(plainText, playFair.decrypt(playFair.encrypt(plainText)));
  }

  @Test
  public void testScenario4() {

    PlayFair playFair = new PlayFair("online");

    String plainText = "calculator";
    String cipherText = "dbcksedqnq";

    Assertions.assertEquals(cipherText, playFair.encrypt(plainText));

    Assertions.assertEquals(plainText, playFair.decrypt(playFair.encrypt(plainText)));
  }

  @Test
  public void testScenario5() {

    PlayFair playFair = new PlayFair("playfair");

    String plainText = "assertions";
    String cipherText = "yqnkdornot";

    Assertions.assertEquals(cipherText, playFair.encrypt(plainText));

    Assertions.assertEquals(plainText, playFair.decrypt(playFair.encrypt(plainText)));
  }

  @Test
  public void testScenario6() {

    PlayFair playFair = new PlayFair("java");

    String plainText = "share";
    String cipherText = "tgvqfw";

    Assertions.assertEquals(cipherText, playFair.encrypt(plainText));

    Assertions.assertEquals(plainText + "x", playFair.decrypt(playFair.encrypt(plainText)));
  }

  @Test
  public void testScenario7() {

    PlayFair playFair = new PlayFair("gravity");

    String plainText = "cryptographyandnetworksecurity";
    String cipherText = "YVCNBMRAVOFBROYQMEAWVFGMYXAGYB".toLowerCase();


    Assertions.assertEquals(cipherText, playFair.encrypt(plainText));

    Assertions.assertEquals(plainText, playFair.decrypt(playFair.encrypt(plainText)));

  }
}
