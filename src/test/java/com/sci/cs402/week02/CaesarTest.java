package com.sci.cs402.week02;

import com.sci.cs402.utilities.Utils;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CaesarTest {

  @Test
  public void allExpectedKeysTestScenario() {
    Caesar caesar;
    String plainText, cipherText;
    for (int key = 1; key < 26; key++) {
      caesar = new Caesar(key);
      plainText = Utils.generateRandomPlainText();
      cipherText = caesar.encrypt(plainText);
      Assertions.assertNotNull(cipherText);
      for (int j = 0; j < cipherText.length(); j++) {
        Assertions.assertEquals(cipherText.charAt(j),
            (char) ('a' + (plainText.charAt(j) - 'a' + key) % 26));
      }
      Assertions.assertEquals(plainText, caesar.decrypt(cipherText));
      System.out.println("The plain text = " + plainText + ", cipher text= " + cipherText);
    }
  }

  @Test
  public void fileTestScenario() throws IOException {
    File plainTextFile = new File("in.txt");
    PrintWriter pw = new PrintWriter(plainTextFile);
    int sz = 13 + (int) (Math.random() * 5);
    while (sz-- > 0) {
      pw.println(Utils.generateRandomPlainText());
    }
    pw.flush();
    pw.close();

    Caesar caesar = new Caesar((int) (Math.random() * 26));

    File cipherTextFile = caesar.encrypt(plainTextFile);

    File plainTextFileAfterDecrypt = caesar.decrypt(cipherTextFile);

    Scanner reader1 = new Scanner(plainTextFile);
    Scanner reader2 = new Scanner(plainTextFileAfterDecrypt);

    while (reader1.hasNext() && reader2.hasNext()) {
      Assertions.assertEquals(reader1.nextLine(), reader2.nextLine());
    }

  }
}
