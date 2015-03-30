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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qbex
 */
public class FileManager {

    public void read(String name) {
        try {
            String linea = new String();
            File file = new File(name + ".txt");
            BufferedReader entrada;
            entrada = new BufferedReader(new FileReader(file));
            List<ActionEvent> listevents = new ArrayList<ActionEvent>();

            do {//for (int i = 0; i < 278; i++) {

                linea = entrada.readLine();
                String[] temp = linea.split("|");

                ActionEvent event = new ActionEvent(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[5]);
                listevents.add(event);
                
                    
            } while (entrada.ready());

            //return contenido;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void write() {

    }

    public void open() {

    }

}
