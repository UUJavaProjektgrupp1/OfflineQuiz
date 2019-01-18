/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinequiz;

import static java.awt.AWTEventMulticaster.add;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nikamahani
 */
public class arrayQuestion {

    static int answer = 4;
    static int question = 20;

    static String[][] myArray = new String[question][answer];

    public void readFile(String filePath) throws FileNotFoundException {

        int j = 0;
        int i = 0;
        Scanner s = new Scanner(new File(filePath));
        s.useDelimiter(";");
        String line;
        while (s.hasNext()) {
            while (i < 20) {
                line = s.next();
                myArray[i][j] = line;
                while (j < 3) {
                    line = s.next(); // Checka filen
                    j++;
                    myArray[i][j] = line;

                }
                i++;
                j = 0;

            }

        }

    }

    public String[][] getArray() {
        //return Arrays.copyOf(myArray, myArray.length);

        return myArray;
    }
}
