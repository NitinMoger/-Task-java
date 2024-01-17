package com.programe.CollectionRunner;

import com.programe.collectionDTO.AlaramDTO;
import com.programe.collectionDTO.CardBoardDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardBoardRunner {
    public static void main(String[] args) {
        CardBoardDTO cardBoardDTO=new CardBoardDTO("Black",100,1);
        CardBoardDTO cardBoardDTO1=new CardBoardDTO("White",200,3);
        CardBoardDTO cardBoardDTO2=new CardBoardDTO("Pink",1500,4);
        CardBoardDTO cardBoardDTO3=new CardBoardDTO("Red",1000,10);
        CardBoardDTO cardBoardDTO4=new CardBoardDTO("Gray",700,6);

        List<CardBoardDTO> list=new ArrayList<>();
        list.add(cardBoardDTO);
        list.add(cardBoardDTO1);
        list.add(cardBoardDTO2);
        list.add(cardBoardDTO3);
        list.add(cardBoardDTO4);

        Collections.sort(list);
        System.out.println("After Sorting in Asending order");
        for (CardBoardDTO ref : list) {
            System.out.println(ref);
        }

        Collections.sort(list, (o1, o2) -> Integer.compare(o2.getQuantity(), o1.getQuantity()));
        System.out.println("After Sorting in Descending order");
        for (CardBoardDTO ref : list) {
            System.out.println(ref);
        }

    }
}
