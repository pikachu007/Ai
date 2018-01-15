/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ai;

/**
 *
 * @author ricardo
 */
public class Action {

    private int id;
    private String device;
    private String action;
    private String time;
    private String placement;
    

    public Action(int id, String time, String device, String action, String placement) {
        this.id = id;
        this.time = time;
        this.device = device;
        this.action = action;
        this.placement=placement;
    }
    
    
    public int getId() {
        return id;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
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
}
