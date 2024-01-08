package com.Xworkz.Laptop.LaptopRunner;

public class RuleImpl implements SellerRule , DeliveryRule{
    @Override
    public boolean replacement() {
        return false;
    }

    @Override
    public double deliveryCharges() {
        return 0;
    }

    public boolean damaged() {
        return false;
    }

    @Override
    public int packed() {
        return 0;
    }
}
