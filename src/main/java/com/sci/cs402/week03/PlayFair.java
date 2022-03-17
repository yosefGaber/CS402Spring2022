package com.sci.cs402.week03;

import java.io.File;
import java.io.IOException;
public class PlayFair {

    /**
     * @param args the command line arguments
     */

    private String KeyWord        = new String();
    private String Key            = new String();
    private char   matrix[][] = new char[5][5];
 
    public void setKey(String k)
    {
        String K_adjust = new String();
        boolean x = false;
        K_adjust = K_adjust + k.charAt(0);
        for (int i = 1; i < k.length(); i++)
        {
            for (int j = 0; j < K_adjust.length(); j++)
            {
                if (k.charAt(i) == K_adjust.charAt(j))
                {
                    x = true;
                }
            }
            if (x == false)
                K_adjust = K_adjust + k.charAt(i);
            x = false;
        }
        KeyWord = K_adjust;
    }
 
    public void KeyGen()
    {
        boolean x = true;
        char current;
        Key = KeyWord;
        for (int i = 0; i < 26; i++)
        {
            current = (char) (i + 97);
            if (current == 'j')
                continue;
            for (int j = 0; j < KeyWord.length(); j++)
            {
                if (current == KeyWord.charAt(j))
                {
                    x = false;
                    break;
                }
            }
            if (x)
                Key = Key + current;
            x = true;
        }
        System.out.println(Key);
        matrix();
    }
 
    private void matrix()
    {
        int counter = 0;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                matrix[i][j] = Key.charAt(counter);
                System.out.print(matrix[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }
 
    private String format(String old_text)
    {
        int i = 0;
        int len = 0;
        String text = new String();
        len = old_text.length();
        for (int tmp = 0; tmp < len; tmp++)
        {
            if (old_text.charAt(tmp) == 'j')
            {
                text = text + 'i';
            }
            else
                text = text + old_text.charAt(tmp);
        }
        len = text.length();
        for (i = 0; i < len; i = i + 2)
        {
            if (text.charAt(i + 1) == text.charAt(i))
            {
                text = text.substring(0, i + 1) + 'x' + text.substring(i + 1);
            }
        }
        return text;
    }
 
    private String[] Divid2Pairs(String new_string)
    {
        String Original = format(new_string);
        int size = Original.length();
        if (size % 2 != 0)
        {
            size++;
            Original = Original + 'x';
        }
        String x[] = new String[size / 2];
        int counter = 0;
        for (int i = 0; i < size / 2; i++)
        {
            x[i] = Original.substring(counter, counter + 2);
            counter = counter + 2;
        }
        return x;
    }
 
    public int[] GetDiminsions(char letter)
    {
        int[] key = new int[2];
        if (letter == 'j')
            letter = 'i';
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (matrix[i][j] == letter)
                {
                    key[0] = i;
                    key[1] = j;
                    break;
                }
            }
        }
        return key;
    }
 
    public String encryptMessage(String Source)
    {
        String src_arr[] = Divid2Pairs(Source);
        String Code = new String();
        char one;
        char two;
        int part1[] = new int[2];
        int part2[] = new int[2];
        for (int i = 0; i < src_arr.length; i++)
        {
            one = src_arr[i].charAt(0);
            two = src_arr[i].charAt(1);
            part1 = GetDiminsions(one);
            part2 = GetDiminsions(two);
            if (part1[0] == part2[0])
            {
                if (part1[1] < 4)
                    part1[1]++;
                else
                    part1[1] = 0;
                if (part2[1] < 4)
                    part2[1]++;
                else
                    part2[1] = 0;
            }
            else if (part1[1] == part2[1])
            {
                if (part1[0] < 4)
                    part1[0]++;
                else
                    part1[0] = 0;
                if (part2[0] < 4)
                    part2[0]++;
                else
                    part2[0] = 0;
            }
            else
            {
                int temp = part1[1];
                part1[1] = part2[1];
                part2[1] = temp;
            }
            Code = Code + matrix[part1[0]][part1[1]]
                    + matrix[part2[0]][part2[1]];
        }
        return Code;
    }
 
    public static void main(String[] args)
    {
        PlayFair x = new PlayFair();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Key:");
        String keyword = sc.next();
        x.setKey(keyword);
        x.KeyGen();
        System.out
                .println("Enter word to encrypt: (Make be even)");
        String key_input = sc.next();
        if (key_input.length() % 2 == 0)
        {
            System.out.println("Encryption: " + x.encryptMessage(key_input));
        }
        else
        {
            System.out.println("Message length should be even");
        }
        sc.close();
    }
}
/*
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
   * Playfair key class that manage the initialization of the key matrix and the
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
*/
