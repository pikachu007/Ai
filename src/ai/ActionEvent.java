/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

import java.util.Date;

/**
 *
 * @author ricardo
 */
public class ActionEvent {

    private int id;
    private String time;
    private String device;
    private String action;
    private String window;
    private String control;
    
    public ActionEvent(int id,String time, String device, String action, String window, String control) {
        this.id = id;
        this.time = time;
        this.device = device;
        this.action = action;
        this.window = window;
        this.control = control;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }
    
    
}
