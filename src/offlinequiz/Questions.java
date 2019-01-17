/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinequiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author felkku
 */
public class Questions {

    public void importPackage() throws FileNotFoundException {
        
    }

    /**
     *
     */
    public void listFilesForFolder() {
        File folder = new File("src/offlinequiz/packages");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
                
                String string = file.getName();
                String[] parts = string.split("\\.");
    
    List<String> questionsList = new ArrayList<String>();

        questionsList.add(parts[0]);
            }
        }
    }
}