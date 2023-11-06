package corejavaprograms;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Languages in the list:");
        for (String language : list) {
            System.out.println(language);
        }
    }
}

