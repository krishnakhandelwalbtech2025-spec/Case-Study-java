package com.smarthome.devices;

public class App {
    public static void main(String[] args) throws Exception {
        SmartDevices LD01 = new SmartLight("L-01",true);
        SmartDevices T99 = new SmartThermostat("T-99", false);

        LD01.displayDeviceDetails();
        T99.displayDeviceDetails();
    }
}