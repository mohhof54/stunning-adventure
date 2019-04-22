/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecf02.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Stagiaire
 */
public class AFPAONLINE {
 private String Groupe;
    private String Profil;
    
  

    public AFPAONLINE() throws IOException {

        File file = new File("C:\\Users\\Stagiaire\\Desktop\\ecf 02 java\\AFPAONLINE.CSV");
 
       
        
        // creates the file
        file.createNewFile();

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);
       
        // Writes the content to the file
        writer.write("Civilité;Nom;Prenom;Login;Password;Email;Profil;Groupe");
        writer.write("\n MR;Madere;Jean-Pierre;Madere.Jean-Pierre;!AFPA2019; JeanPierreMadere@gmail.com;Pompey-"  + ";CDI14");
        

        writer.flush();
        writer.close();
    }
}
