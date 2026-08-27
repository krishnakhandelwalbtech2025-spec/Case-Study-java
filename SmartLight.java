package com.smarthome.devices;

public class SmartLight extends SmartDevices {
    public SmartLight(String deviceID, boolean isOn){
        super(deviceID,isOn);
    }

    @Override
    public String GetStatus(){
        return isOn ? "Light is ON" : "Light is OFF";
    }

    @Override
    public double calculatePower(){
        return isOn ? 15.0 : 0.0;
    }
}