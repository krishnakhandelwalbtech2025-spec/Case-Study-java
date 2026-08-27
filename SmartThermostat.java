package com.smarthome.devices;

public final class SmartThermostat extends SmartDevices {

    public SmartThermostat(String deviceID, boolean isOn){
        super(deviceID,isOn);
    }

    @Override
    public String GetStatus(){
        return isOn ? "AC is Running" : "AC is Idle";
    }

    @Override
    public double calculatePower(){
        return isOn ? 1500.0 : 0.0;
    }
}