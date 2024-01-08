package com.xworkz.Ruler.multiple;

public class Contract extends AbstractSeweageRule implements BBMpRule {


    @Override
    public void tree_planting() {
        System.out.println("Tree Planting methods");
    }

    @Override
    public void garbage_disposal() {
        System.out.println("garbage Disposal methods");
    }

    @Override
    public void market_research() {
        System.out.println("Market Research methods");
    }

    @Override
    public String properties() {
        System.out.println("Properties methods");
        return null;

    }

    @Override
    public String departments() {
        System.out.println("Departments methods");
        return null;

    }

    @Override
    public int total_state() {
        System.out.println("total_state methods");
        return 0;
    }

    @Override
    public boolean follow() {
        System.out.println("follow method");
        return false;
    }

    @Override
    public int total_numbers_follows() {
        System.out.println("total_numbers_follows methods");
        return 0;
    }
}
