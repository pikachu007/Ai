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
import org.jnativehook.mouse.NativeMouseWheelEvent;
import org.jnativehook.mouse.NativeMouseWheelListener;

public class WheelListener implements NativeMouseWheelListener {

    public String e;

    @Override
    public void nativeMouseWheelMoved(NativeMouseWheelEvent nmwe) {
        e = String.valueOf(nmwe.getWheelRotation());
    }
}
