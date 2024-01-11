package com.programe.CollectionRunner;

import com.programe.collectionDTO.SkywalkDTO;
import com.programe.collectionDTO.SkywalkDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SkywalkRunner {
        public static  void main(String[] args) {
            SkywalkDTO skywalkDTO=new SkywalkDTO("Mumbai",12.5,100,150);
            SkywalkDTO skywalkDTO1=new SkywalkDTO("Bengaluru",25.5,25,100);
            SkywalkDTO skywalkDTO2=new SkywalkDTO("Hyderbad",10.5,10,200);
            SkywalkDTO skywalkDTO3=new SkywalkDTO("JammuKashmir",12.5,5,250);
            SkywalkDTO skywalkDTO4=new SkywalkDTO("Nepal",30.5,10,350);

            List<SkywalkDTO> list=new ArrayList<>();
            list.add(skywalkDTO);
            list.add(skywalkDTO1);
            list.add(skywalkDTO2);
            list.add(skywalkDTO3);
            list.add(skywalkDTO4);


            Comparator<SkywalkDTO> ref=(p1, p2)->
            {
                return String.CASE_INSENSITIVE_ORDER.compare(p1.getCityName(), p2.getCityName());
            };
            Comparator<SkywalkDTO> ref1=(p1,p2)->
            {
                return Double.compare(p1.getHeight(), p2.getHeight());
            };
            Comparator<SkywalkDTO> ref2=(p1,p2)->
            {
                return Integer.compare(p1.getLength(), p2.getLength());
            };
            Comparator<SkywalkDTO> ref3=(p1,p2)->
            {
                return Integer.compare(p1.getCapacity(), p2.getCapacity());
            };
            Collections.sort(list,ref);
            System.out.println("City name in Ascending Order");
            for(SkywalkDTO val:list)
            {
                System.out.println(val);
            }
            Collections.sort(list,ref1);
            System.out.println("height in Ascending Order");
            for(SkywalkDTO val:list)
            {
                System.out.println(val);
            }
            Collections.sort(list,ref2);
            System.out.println("length in Ascending Order");
            for(SkywalkDTO val:list)
            {
                System.out.println(val);
            }
            Collections.sort(list,ref3);
            System.out.println("capacity in Ascending Order");
            for(SkywalkDTO val:list)
            {
                System.out.println(val);
            }


            System.out.println("===========================");
            System.out.println("All properties in descending order");
            Comparator<SkywalkDTO> ref4=(p1, p2)->
            {
                return String.CASE_INSENSITIVE_ORDER.compare(p2.getCityName(), p1.getCityName());
            };
            Comparator<SkywalkDTO> ref5=(p1,p2)->
            {
                return Double.compare(p2.getHeight(), p1.getHeight());
            };
            Comparator<SkywalkDTO> ref6=(p1,p2)->
            {
                return Integer.compare(p2.getLength(), p1.getLength());
            };
            Comparator<SkywalkDTO> ref7=(p1,p2)->
            {
                return Integer.compare(p2.getCapacity(), p1.getCapacity());
            };
            Collections.sort(list,ref4);
            System.out.println("City name in descending Order");
            for(SkywalkDTO val:list)
            {
                System.out.println(val);
            }
            Collections.sort(list,ref5);
            System.out.println("height in descending Order");
            for(SkywalkDTO val:list)
            {
                System.out.println(val);
            }
            Collections.sort(list,ref6);
            System.out.println("length in descending Order");
            for(SkywalkDTO val:list)
            {
                System.out.println(val);
            }
            Collections.sort(list,ref7);
            System.out.println("capacity in descending Order");
            for(SkywalkDTO val:list)
            {
                System.out.println(val);
            }



        }

}
