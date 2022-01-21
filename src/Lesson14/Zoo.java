package Lesson14;


import Lesson14.Model.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Zoo {
    public static void main(String[] args) {


        Map<String, Pet> petHashMap = new HashMap<>();
        petHashMap.put("Cat",new Cat("John"));
        petHashMap.put("Dog",new Dog("Maks"));
        petHashMap.put("Parrot", new Parrot("Luke"));

        Set<String> keys = petHashMap.keySet();
        System.out.println(keys);

        for (Map.Entry<String, Pet> zoo : petHashMap.entrySet()
             ) {
            System.out.println("Pets' key: "+ zoo.getKey()+
                    " Pets' name: " +zoo.getValue().getName());

        }

        for (Pet voice:petHashMap.values()
             ) {
            voice.voice();

        }



        }


    }

