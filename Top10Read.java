/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinequiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nikamahani
 */
public class Top10Read {

    /**
     * @param args the command line arguments
     */
    ArrayList<String> top10 = new ArrayList<String>();

    public void readFile(String filePath) throws FileNotFoundException {

        int j = 0;
        int i = 0;
        Scanner s = new Scanner(new File(filePath));
        String line;
        while (s.hasNext()) {
           top10.add(s.next());
        }

    }

}

