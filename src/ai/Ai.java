/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

/**
 *
 * @author Storm
 */
public class Ai {

    /**
     *
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ActionCapture ac = new ActionCapture();
        ac.start();
        ActionListener al = new ActionListener();
        ac.configure(al);
        ac.stop(al.actions);

    }

}
