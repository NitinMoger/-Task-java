package com.programe.collectionRunner;

import com.programe.collectionDTO.RadioDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RadioRunner {
    public static void main(String[] args) {
        RadioDTO radioDTO=new RadioDTO("Sony",5000,5,"Shortwave Radio");
        RadioDTO radioDTO1=new RadioDTO("Mi",2500,2,"Aviation Radio");
        RadioDTO radioDTO2=new RadioDTO("Realme",3000,3,"Satellite Radio");
        RadioDTO radioDTO3=new RadioDTO("Philips",4000,4,"longwave Radio");
        RadioDTO radioDTO4=new RadioDTO("JBL",2000,3,"Digital Radio");

        List<RadioDTO> list=new ArrayList<>();
        list.add(radioDTO);
        list.add(radioDTO1);
        list.add(radioDTO2);
        list.add(radioDTO3);
        list.add(radioDTO4);

        Comparator<RadioDTO> ref=(p1, p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getBrand(), p2.getBrand());
        };
        Comparator<RadioDTO> ref1=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getType(), p2.getType());
        };
        Comparator<RadioDTO> ref2=(p1,p2)->
        {
            return Double.compare(p1.getCost(), p2.getCost());
        };
        Comparator<RadioDTO> ref3=(p1,p2)->
        {
            return Integer.compare(p1.getWarranty(), p2.getWarranty());
        };
        Collections.sort(list,ref);
        System.out.println("Brand in Ascending Order");
        for(RadioDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref1);
        System.out.println("Type in Ascending Order");
        for(RadioDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref2);
        System.out.println("cost in Ascending Order");
        for(RadioDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref3);
        System.out.println("Warranty in Ascending Order");
        for(RadioDTO val:list)
        {
            System.out.println(val);
        }

        System.out.println("============================");
        System.out.println("All properties in Descending Order");
        Comparator<RadioDTO> ref4=(p1, p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getBrand(), p1.getBrand());
        };
        Comparator<RadioDTO> ref5=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getType(), p1.getType());
        };
        Comparator<RadioDTO> ref6=(p1,p2)->
        {
            return Double.compare(p2.getCost(), p1.getCost());
        };
        Comparator<RadioDTO> ref7=(p1,p2)->
        {
            return Integer.compare(p2.getWarranty(), p1.getWarranty());
        };
        Collections.sort(list,ref4);
        System.out.println("Brand in descending Order");
        for(RadioDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref5);
        System.out.println("Type in descending Order");
        for(RadioDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref6);
        System.out.println("cost in descending Order");
        for(RadioDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref7);
        System.out.println("Warranty in descending Order");
        for(RadioDTO val:list)
        {
            System.out.println(val);
        }
    }
}
