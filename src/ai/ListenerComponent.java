/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.awt.Component;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

/**
 *
 * @author Storm
 */
public class ListenerComponent extends Component {

    MovesCapture receptor;

    public ListenerComponent() {
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException ex) {
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());

            System.exit(1);
        }

        KeyListener key = new KeyListener(this);

        GlobalScreen.getInstance().addNativeKeyListener(key);

        createEvent(key);
    }

    public void addActionListener(MovesCapture recep) {
        if (receptor == null) {
            receptor = recep;
        } else {
            System.out.println("No se soportan multiples Receptores");
            System.exit(0);
        }
    }

    public void createEvent(KeyListener key) {

        receptor.actionCapture(key);

    }
}
