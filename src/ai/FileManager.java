/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qbex
 */
public class FileManager {

    public void write(String linea) {
           FileWriter fichero;
        try {
            fichero = new FileWriter("prueba.txt",true);
            PrintWriter pw = new PrintWriter(fichero);

            pw.println(linea);
            fichero.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
