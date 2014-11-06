/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

/**
 *
 * @author qbex
 */
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyListener implements NativeKeyListener {

    public String e;

    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {
        e = nke.getKeyText(nke.getKeyCode());
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {
        e = nke.getKeyText(nke.getKeyCode());
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {
        e = nke.getKeyText(nke.getKeyCode());
    }

}
