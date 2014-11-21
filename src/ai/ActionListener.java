/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.util.LinkedList;
import java.util.List;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;

/**
 *
 * @author qbex
 */
public class ActionListener extends ListenerAdapter {

    public List<String> actions = new LinkedList<>();

    public ActionListener() {
        

    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {

        this.actions.add(String.valueOf(nke.getKeyCode()));

        if (nke.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
            for (String action : this.actions) {
                System.out.println(action);
            }
        }
    }

}
