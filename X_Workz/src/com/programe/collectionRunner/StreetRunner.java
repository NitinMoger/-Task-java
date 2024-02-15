package com.programe.collectionRunner;

import com.programe.collectionDTO.StreetDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreetRunner {
    public static void main(String[] args) {
        StreetDTO streetDTO=new StreetDTO("Vivekananda Road",80,"ChaiWala",3);
        StreetDTO streetDTO1=new StreetDTO("BTM Layout",50,"Appu",5);
        StreetDTO streetDTO2=new StreetDTO("Jayanagar",100,"Cafe",7);
        StreetDTO streetDTO3=new StreetDTO("JP Nagar",70,"Amrutha",6);
        StreetDTO streetDTO4=new StreetDTO("Banashankari",50,"Swarnaloka",8);

        List<StreetDTO> list=new ArrayList<>();
        list.add(streetDTO);
        list.add(streetDTO1);
        list.add(streetDTO2);
        list.add(streetDTO3);
        list.add(streetDTO4);

        Comparator<StreetDTO> ref=(p1, p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getStreetName(), p2.getStreetName());
        };
        Comparator<StreetDTO> ref1=(p1,p2)->
        {
            return Integer.compare(p1.getTotalShops(), p2.getTotalShops());
        };
        Comparator<StreetDTO> ref2=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getShopName(), p2.getShopName());
        };
        Comparator<StreetDTO> ref3=(p1,p2)->
        {
            return Double.compare(p1.getStreetLength(), p2.getStreetLength());
        };
        Collections.sort(list,ref);
        System.out.println("Street Name in Ascending Order");
        for(StreetDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref1);
        System.out.println("Total Shops in Ascending Order");
        for(StreetDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref2);
        System.out.println("Shop name in Ascending Order");
        for(StreetDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref3);
        System.out.println("Street length in Ascending Order");
        for(StreetDTO val:list)
        {
            System.out.println(val);
        }

        System.out.println("==========================");
        System.out.println("All properties in Descending order");

        Comparator<StreetDTO> ref4=(p1, p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getStreetName(), p1.getStreetName());
        };
        Comparator<StreetDTO> ref5=(p1,p2)->
        {
            return Integer.compare(p2.getTotalShops(), p1.getTotalShops());
        };
        Comparator<StreetDTO> ref6=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getShopName(), p1.getShopName());
        };
        Comparator<StreetDTO> ref7=(p1,p2)->
        {
            return Double.compare(p2.getStreetLength(), p1.getStreetLength());
        };
        Collections.sort(list,ref4);
        System.out.println("Street Name in descending Order");
        for(StreetDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref5);
        System.out.println("Total Shops in descending Order");
        for(StreetDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref6);
        System.out.println("Shop name in descending Order");
        for(StreetDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref7);
        System.out.println("Street length in descending Order");
        for(StreetDTO val:list)
        {
            System.out.println(val);
        }

    }
}
