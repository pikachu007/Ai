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
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

public class MouseListener implements NativeMouseInputListener{
    public String e;
    
    @Override
    public void nativeMouseClicked(NativeMouseEvent nme) {
        e=String.valueOf(nme.getClickCount());
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent nme) {
         e=String.valueOf(nme.getButton());
    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent nme) {
         e=String.valueOf(nme.getButton());
    }

    @Override
    public void nativeMouseMoved(NativeMouseEvent nme) {
         e=String.valueOf(nme.getX() + ", " + nme.getY());
    }

    @Override
    public void nativeMouseDragged(NativeMouseEvent nme) {
        e=String.valueOf(nme.getX() + ", " + nme.getY());
    }
    
}
