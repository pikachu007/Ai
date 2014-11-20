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

    /**asddsas
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListenerComponent key =new ListenerComponent();
        key.addActionListener(new MovesCapture());
/*
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }
        //TODO corregir
        KeyListener key= new KeyListener(args);
        MouseListener mouse = new MouseListener();
        WheelListener wheel= new WheelListener();
        
        //Add the appropriate listeners for the object.
        GlobalScreen.getInstance().addNativeKeyListener(key);
        GlobalScreen.getInstance().addNativeMouseListener(mouse);
        GlobalScreen.getInstance().addNativeMouseMotionListener(mouse);
        GlobalScreen.getInstance().addNativeMouseWheelListener(wheel);
        */
        
        
    }

}
