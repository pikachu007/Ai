/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.util.List;
import jdk.nashorn.internal.runtime.Source;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

/**
 *
 * @author qbex
 */
public class ActionCapture {

    public void configure(ActionListener actionListener) {
        GlobalScreen.getInstance().addNativeKeyListener(actionListener);
    }

    public void start() {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println(ex.getMessage());
            System.exit(1);
        }

    }

    void stop(List<String> actions) {
        
        
    }

}
