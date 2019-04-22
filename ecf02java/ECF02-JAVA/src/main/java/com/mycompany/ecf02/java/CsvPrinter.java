/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ecf02.java;

import java.io.FileWriter;

/**
 *
 * @author Stagiaire
 */
public class CsvPrinter {
    try (CSVPrinter printer = new CSVPrinter(new FileWriter("csv.txt"), CSVFormat.EXCEL)) {
     printer.printRecord("id", "userName", "firstName", "lastName", "birthday");
     printer.printRecord(1, "john73", "John", "Doe", LocalDate.of(1973, 9, 15));
     printer.println();
     printer.printRecord(2, "mary", "Mary", "Meyer", LocalDate.of(1985, 3, 29));
 } catch (IOException ex) {
     ex.printStackTrace();
 }
}
