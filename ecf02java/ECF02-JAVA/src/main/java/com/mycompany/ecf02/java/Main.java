/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecf02.java;

import java.io.IOException;

/**
 *
 * @author Stagiaire
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       ReadingCell myCell=new ReadingCell();
       myCell.printCellValue();
       AFPAONLINE afpa= new AFPAONLINE();
    }
    
}
