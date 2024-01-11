package com.programe.CollectionRunner;

import com.programe.collectionDTO.ThermometerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ThermometerRunner {
    public static void main(String[] args) {
        ThermometerDTO thermometerDTO=new ThermometerDTO("Mercury Thermometer","Analog or Dial Display","glass",200.0);
        ThermometerDTO thermometerDTO1=new ThermometerDTO("Alcohol Thermometer","Digital Display","Metal",400.0);
        ThermometerDTO thermometerDTO2=new ThermometerDTO("Infrared Thermometer","Liquid Crystal Display","Glass",450.0);
        ThermometerDTO thermometerDTO3=new ThermometerDTO("Bimetallic Thermometer","Light-Emitting Diode Display","Metal",250.0);
        ThermometerDTO thermometerDTO4=new ThermometerDTO("Gas Thermometer","Infrared Display","Plastic",100.0);

        List<ThermometerDTO> list= new ArrayList<>();
        list.add(thermometerDTO);
        list.add(thermometerDTO1);
        list.add(thermometerDTO2);
        list.add(thermometerDTO3);
        list.add(thermometerDTO4);

        Comparator<ThermometerDTO> ref=(p1,p2)->
        {
          return String.CASE_INSENSITIVE_ORDER.compare(p1.getType(), p2.getType());
        };
        Comparator<ThermometerDTO> ref1=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getDisplayType(), p2.getDisplayType());
        };
        Comparator<ThermometerDTO> ref2=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p1.getMaterial(), p2.getMaterial());
        };
        Comparator<ThermometerDTO> ref3=(p1,p2)->
        {
            return Double.compare(p1.getCost(), p2.getCost());
        };
        Collections.sort(list,ref);
        System.out.println("Types in Ascending Order");
        for(ThermometerDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref1);
        System.out.println("displayType in Ascending Order");
        for(ThermometerDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref2);
        System.out.println("matrial in Ascending Order");
        for(ThermometerDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref3);
        System.out.println("cost in Ascending Order");
        for(ThermometerDTO val:list)
        {
            System.out.println(val);
        }
        System.out.println("================================");
        System.out.println("Properties in Descending Order");
        Comparator<ThermometerDTO> ref4=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getType(), p1.getType());
        };
        Comparator<ThermometerDTO> ref5=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getDisplayType(), p1.getDisplayType());
        };
        Comparator<ThermometerDTO> ref6=(p1,p2)->
        {
            return String.CASE_INSENSITIVE_ORDER.compare(p2.getMaterial(), p1.getMaterial());
        };
        Comparator<ThermometerDTO> ref7=(p1,p2)->
        {
            return Double.compare(p2.getCost(), p1.getCost());
        };
        Collections.sort(list,ref4);
        System.out.println("Types in descending Order");
        for(ThermometerDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref5);
        System.out.println("displayType in Descending Order");
        for(ThermometerDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref6);
        System.out.println("matrial in Descending Order");
        for(ThermometerDTO val:list)
        {
            System.out.println(val);
        }
        Collections.sort(list,ref7);
        System.out.println("cost in Descending Order");
        for(ThermometerDTO val:list)
        {
            System.out.println(val);
        }
    }
}
