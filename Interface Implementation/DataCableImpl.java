package com.xworkz.Ruler.multiple;

import javax.xml.crypto.Data;

public class DataCableImpl implements DataCable {
    @Override
    public void connectToPort() {
        System.out.println("Running the CoonectPort in DataCableImpl");
    }

    @Override
    public void transferData() {
        System.out.println("Running the tranfserData in DataCableImpl");
    }
}
