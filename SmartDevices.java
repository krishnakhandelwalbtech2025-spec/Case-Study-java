package com.smarthome.devices;

public abstract class SmartDevices implements Controllable {
    protected String deviceID;
    protected boolean isOn;

    public SmartDevices(String deviceID, boolean isOn){
        this.isOn=isOn;
        this.deviceID=deviceID;
    }

    public final String getNetwork(){
        return "Home WiFi";
    }

    abstract double calculatePower();

    public void displayDeviceDetails(){
        System.out.println();
        System.out.println(getNetwork());
        System.out.println("Device ID: "+deviceID);
        System.out.println("Status: "+GetStatus());
        System.out.println("Power: "+calculatePower()+"W");
        System.out.println();
    }
}