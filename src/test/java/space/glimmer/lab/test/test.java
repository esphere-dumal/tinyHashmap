package space.glimmer.lab.test;

import space.glimmer.lab.GlimmerHashMap;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class test {
    public static void main(String[] args) {
//        Map<String, String> smap = new HashMap();
//        smap.put("Hello", "Hey");
//        smap.put("Fruit", "Apple");
//        smap.put("Vegetable", "Tomato");
//        smap.put("JunkFood", "FrenchFried");
//        smap.put("JunkFood", "Cola");
//        smap.put("JunkFood", "OrangeJuice");
//        smap.put("JunkFood", "KFC");
//        smap.put("Drink", "Cola");
//
        GlimmerHashMap tmap = new GlimmerHashMap();
//
//        for (Map.Entry<String, String> entry : smap.entrySet()) {
//            tmap.put(entry.getKey(), entry.getValue());
//        }
//
//        System.out.println(tmap.get("Hello"));
//        System.out.println(tmap.get("Fruit"));
//        System.out.println(tmap.get("Vegetable"));
//        System.out.println(tmap.get("JunkFood"));
//        System.out.println(tmap.get("Drink"));
//        tmap.remove("Drink");
//        assertEquals(null, tmap.get("Drink"));
//        tmap.remove("JunkFood");
//        assertEquals(null, tmap.get("JunkFood"));
//        tmap.put("Beer", "unhealthy");
//        System.out.println(tmap.put("Beer","healthy"));
//        System.out.println(tmap.remove("Beer"));
        assertEquals(null, tmap.get(""));
        assertEquals(null, tmap.get(null));
        tmap.put(null, "woohoo");
        System.out.println(tmap.get(null));
        assertEquals("woohoo", tmap.get(null));

        tmap.put(null, null);
        assertEquals(null, tmap.get(null));

        tmap.put(null, "");
        System.out.println(tmap.get(null));
        assertEquals("", tmap.get(null));
        tmap.remove(null);
    }
}
