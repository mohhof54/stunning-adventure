/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecf02.java;

import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;

/**
 *
 * @author Stagiaire
 */
public class Retrieving {

    public static void printCellValue(Cell cell) {
        switch (cell.getCellType()) {

            case STRING:
                System.out.print(cell.getRichStringCellValue());
                break;
            case NUMERIC:
                if (DateUtil.isCellDateFormatted((org.apache.poi.ss.usermodel.Cell) cell)) {
                    System.out.print(cell.getDateCellValue());
                } else {
                    System.out.print(cell.getNumericCellValue());
                }
                break;
            case BLANK:
                System.out.print("");
                break;
            default:
                System.out.print("");
        }

        System.out.print("\t");

    }

    public class Afpaonline {

        public void display() {
            ArrayList cell = new ArrayList();
            cell.add("civilite");
            cell.add("nom");
            cell.add("prenom");
            cell.add("login");
            cell.add("password");
            cell.add("email");
            cell.add("Mesure");
            cell.add("Titre");
            cell.add("Nom Usuel");
        }
    }
}
