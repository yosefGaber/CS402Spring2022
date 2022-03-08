package com.sci.cs402.week02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MonoAlphabeticAttackTest {

  @Test
  public void testScenario1(){

    MonoAlphabeticAttack monoAlphabeticAttack = new MonoAlphabeticAttack();

    String plainTextToLearn = "faculty of science cairo university";
    String cipherTextToLearn = "koawtnb jk lafspas aofij wpfqsilfnb";

    String cipherText = "al fl kfps";

    Assertions.assertEquals(cipherText, "cs is fine");

  }

  @Test
  public void testScenario2(){

    MonoAlphabeticAttack monoAlphabeticAttack = new MonoAlphabeticAttack();

    String plainTextToLearn = "the quick brown fox jumps over the lazy dog";
    String cipherTextToLearn ="uxr ivlpf megha bgq cvdjk gtre uxr yszw ngo";

    String cipherText = "suuspf xld agh";

    Assertions.assertEquals(cipherText, "attack him now");

  }
}
