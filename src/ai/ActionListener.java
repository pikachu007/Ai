/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.util.EventListener;

/**
 *
 * @author qbex
 */
public interface ActionListener extends EventListener {

    void actionCapture(KeyListener kl);

}
