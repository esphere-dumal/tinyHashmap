package space.glimmer.lab.test;

import org.junit.Test;
import space.glimmer.lab.GlimmerHashMap;
import space.glimmer.lab.container.Bucket;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.assertEquals;


/**
 * @author Lehr
 * @create: 2021-01-16
 */
public class PartATest {


    @Test
    public void basicTestA() {
        Map<String, String> smap = new HashMap();
        smap.put("Hello", "Hey");
        smap.put("Fruit", "Apple");
        smap.put("Vegetable", "Tomato");
        smap.put("JunkFood", "FrenchFried");
        smap.put("JunkFood", "Cola");
        smap.put("JunkFood", "OrangeJuice");
        smap.put("JunkFood", "KFC");
        smap.put("Drink", "Cola");

        GlimmerHashMap tmap = new GlimmerHashMap();

        for (Map.Entry<String, String> entry : smap.entrySet()) {
            tmap.put(entry.getKey(), entry.getValue());
        }

        assertEquals("Hey", tmap.get("Hello"));
        assertEquals("Apple", tmap.get("Fruit"));
        assertEquals("Tomato", tmap.get("Vegetable"));
        assertEquals("KFC", tmap.get("JunkFood"));
        assertEquals("Cola", tmap.get("Drink"));

        tmap.remove("Drink");
        assertEquals(null, tmap.get("Drink"));

        tmap.remove("JunkFood");
        assertEquals(null, tmap.get("JunkFood"));

        tmap.put("Beer", "unhealthy");
        assertEquals("unhealthy", tmap.put("Beer", "healthy"));
        assertEquals("healthy", tmap.remove("Beer"));

    }


    @Test
    public void nullTestA() {

        GlimmerHashMap tmap = new GlimmerHashMap();

        assertEquals(null, tmap.get(""));

        assertEquals(null, tmap.get(null));

        tmap.put(null, "woohoo");
        assertEquals("woohoo", tmap.get(null));

        tmap.put(null, null);
        assertEquals(null, tmap.get(null));

        tmap.put(null, "");
        assertEquals("", tmap.get(null));

        tmap.remove(null);

        tmap.put(null, null);
        assertEquals(null, tmap.get(null));

    }

}
