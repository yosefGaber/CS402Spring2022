package com.sci.cs402.week02;

import com.sci.cs402.utilities.Utils;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CaesarAttackTest {

  @Test
  public void attackWithoutFileTestScenario() {

    CaesarAttack caesarAttack = new CaesarAttack();

    String plainText = Utils.generateRandomPlainText();
    String cipherText = new Caesar((int) (Math.random() * 26)).encrypt(plainText);

    List<String> result = caesarAttack.attack(cipherText);
    List<String> expect = new ArrayList<>();

    for (int i = 1; i < 26; i++) {
      expect.add(new Caesar(i).decrypt(cipherText));
    }

    Assertions.assertEquals(result.size(), expect.size());

    for (int i = 0; i < result.size(); i++) {
      Assertions.assertEquals(result.get(i), expect.get(i));
    }
  }
}
