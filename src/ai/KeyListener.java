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
import org.jnativehook.keyboard.NativeKeyListener;

/**
 *
 * @author qbex
 */
public class KeyListener implements NativeKeyListener {
    long startTime;
    long endTime;
            
    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {
        FileManager fm = new FileManager();
        fm.write("Key Typed: " + nke.getKeyText(nke.getKeyCode()));
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {
        this.endTime=System.nanoTime();
        long t=this.endTime-this.startTime;
        FileManager fm = new FileManager();
        fm.write("Key Pressed: " +t+"," + nke.getKeyText(nke.getKeyCode()));
        this.startTime = System.nanoTime();
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {
        this.endTime=System.nanoTime();
        long t=this.endTime-this.startTime;
        FileManager fm = new FileManager();
        fm.write("Key Released: " +t+","+ nke.getKeyText(nke.getKeyCode()));
        this.startTime = System.nanoTime();
    }

}
