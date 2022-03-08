package com.sci.cs402.week02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AffineCaesarTest {

  @Test
  public void testScenario1() {
    AffineCaesar affineCaesar = new AffineCaesar(5, 7);
    String plainText = "abdelghany";
    String cipherText = "hmwbklqhux";

    Assertions.assertEquals(cipherText, affineCaesar.encrypt(plainText));

    Assertions.assertEquals(plainText, affineCaesar.decrypt(affineCaesar.encrypt(plainText)));
  }

  @Test
  public void testScenario2() {
    AffineCaesar affineCaesar = new AffineCaesar(5, 7);
    String plainText = "document";
    String cipherText = "wzrdpbuy";

    Assertions.assertEquals(cipherText, affineCaesar.encrypt(plainText));

    Assertions.assertEquals(plainText, affineCaesar.decrypt(affineCaesar.encrypt(plainText)));
  }

  @Test
  public void testScenario3() {
    AffineCaesar affineCaesar = new AffineCaesar(5, 7);
    String plainText = "you have to solve this question";
    String cipherText = "xzd qhib yz tzkib yqvt jdbtyvzu";

    Assertions.assertEquals(cipherText, affineCaesar.encrypt(plainText));

    Assertions.assertEquals(plainText, affineCaesar.decrypt(affineCaesar.encrypt(plainText)));
  }

  @Test
  public void testScenario4() {
    AffineCaesar affineCaesar = new AffineCaesar(17, 19);
    String plainText = "java is a programming language";
    String cipherText = "qtmt zn t owxrwtppzgr ytgrvtrj";

    Assertions.assertEquals(cipherText, affineCaesar.encrypt(plainText));

    Assertions.assertEquals(plainText, affineCaesar.decrypt(affineCaesar.encrypt(plainText)));
  }

  @Test
  public void testScenario5() {
    AffineCaesar affineCaesar = new AffineCaesar(19, 15);
    String plainText = "human languages are redundant";
    String cipherText = "sfjpc qpczfpznt pan anufcupcm";

    Assertions.assertEquals(cipherText, affineCaesar.encrypt(plainText));

    Assertions.assertEquals(plainText, affineCaesar.decrypt(affineCaesar.encrypt(plainText)));
  }

  @Test
  public void testScenario6() {
    AffineCaesar affineCaesar = new AffineCaesar(7, 25);
    String plainText = "letters are not equally commonly used";
    String cipherText = "ybccbov zob mtc bhjzyyl ntfftmyl jvbu";

    Assertions.assertEquals(cipherText, affineCaesar.encrypt(plainText));

    Assertions.assertEquals(plainText, affineCaesar.decrypt(affineCaesar.encrypt(plainText)));
  }

  @Test
  public void testScenario7() {
    AffineCaesar affineCaesar = new AffineCaesar(9, 0);
    String plainText = "letters are not equally commonly used";
    String cipherText = "vkppkxg axk nwp koyavvi sweewnvi ygkb";

    Assertions.assertEquals(cipherText, affineCaesar.encrypt(plainText));

    Assertions.assertEquals(plainText, affineCaesar.decrypt(affineCaesar.encrypt(plainText)));
  }
}
