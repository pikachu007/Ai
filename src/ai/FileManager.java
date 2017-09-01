/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.io.FileWriter;
import java.io.PrintWriter;


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
