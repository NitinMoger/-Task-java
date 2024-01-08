package com.xworkz.Ruler.multiple;

public class SeweageRuleRunner
{
    public static void main(String[] args) {
        System.out.println("STart the main in SeweageRuleRunner");
        System.out.println();
         Contract ref=new Contract();
         ref.departments();
         ref.follow();
         ref.garbage_disposal();
         ref.market_research();
         ref.properties();
         ref.total_numbers_follows();
         ref.total_state();
         ref.tree_planting();
        System.out.println("====================================");

        MetroContractor ref1=new MetroContractor();
        ref1.total_number_garbageRules();
        ref1.departments();
        ref1.follow();
        ref1.market_research();
        ref1.properties();
        ref1.type_of_grabage();
        ref1.garbage_disposal();
        ref1.total_numbers_follows();
        ref1.total_state();
        ref1.tree_planting();
        System.out.println();


        System.out.println("End the main in SeweageRuleRunner");
    }
}
