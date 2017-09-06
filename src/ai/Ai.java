/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.mouse.NativeMouseWheelListener;

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

        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.out.println("There was a problem registering the native hook.");
            System.out.println(ex.getMessage());

            System.exit(1);
        }

        ListenerAdapter listener = new ListenerAdapter();

        GlobalScreen.addNativeKeyListener(listener);
        GlobalScreen.addNativeMouseListener(listener);
        GlobalScreen.addNativeMouseMotionListener(listener);
        GlobalScreen.addNativeMouseWheelListener((NativeMouseWheelListener) listener);

    }

}
