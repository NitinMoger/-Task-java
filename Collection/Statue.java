package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Statue {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("Golden Temple Amritsar");
        collection.add("Bhagat Singh");
        collection.add("Hampi");
        collection.add("Ram Mandhir");
        collection.add("Subhas Chandra Bosh");
        collection.add("Gate way of India");
        collection.add("Vallabhbhai patel");
        collection.add("Buddha");
        collection.add("Vivekananda");
        collection.add("Veera Savarkar");
        collection.add("Shiva");
        collection.add("Ambedkar");
        collection.add("Anjaneya");
        collection.add("Kempegowda");
        collection.add("RAni chennamma");
        collection.add("Statue of Bhudha");
        collection.add("Nelson Mandela");
        collection.add("Ken Saro-Wiwa");
        collection.add("Ganesh statue");
        collection.add("Surya Temple");
        collection.add("Krishna Statue");
        collection.add("Vayu");
        collection.add("Durga matha");
        collection.add("Parashu Ram statue");
        collection.add("Jatayu");
        collection.add("Shiva Staute");
        collection.add("Parvati");
        collection.add("Shivaji Maharaj");
        collection.add("Basaveshwara Statue");
        collection.add("Mother Teresa Statue");
        collection.add("Tribal Queen Mando Statue");
        collection.add("Sardar Patel Memorial");
        collection.add("Statue of Guru Nanak");
        collection.add("Veer Abhimanyu Statue");
        collection.add("Statue of Ahilyabai Holkar:");
        collection.add("Statue of Rani Padmini");
        collection.add("Golden Temple Amritsar");
        collection.add("Statue of Kabir Das");
        collection.add("Goodse");
        collection.add("Statue of Deendayal Upadhyaya");
        collection.add("Statue of Rani Lakshmibai");
        collection.add("Statue of Bhagat Singh");
        Iterator<String> ref= collection.iterator();
        while(ref.hasNext())
        {
            String val= ref.next();
            if(val.endsWith("r"))
            {
                System.out.println("The Statue name is ending with r:" +val);
            }
        }
    }
}
