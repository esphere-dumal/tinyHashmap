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
public class PartCTest {


    @Test
    public void resizeTestC() {
        GlimmerHashMap tmap = new GlimmerHashMap();

        for (int i = 0; i <= 350; i++) {
            String key = "Key." + i;
            String value = "Value." + i;
            tmap.put(key, value);

            assertEquals(i+1,tmap.size());

            if (i == 5) {
                assertEquals(16, tmap.getThreshold());
            }
            if (i == 14) {
                assertEquals(16, tmap.getThreshold());
            }
            if (i == 15) {
                assertEquals(16, tmap.getThreshold());
            }
            if (i == 16) {
                assertEquals(32, tmap.getThreshold());
            }
            if (i == 32) {
                assertEquals(64, tmap.getThreshold());
            }
            if (i == 50) {
                assertEquals(64, tmap.getThreshold());
            }
            if (i == 67) {
                assertEquals(128, tmap.getThreshold());
            }
            if (i == 211) {
                assertEquals(256, tmap.getThreshold());
            }
            if (i == 305) {
                assertEquals(512, tmap.getThreshold());
            }
        }

        for (int i = 0; i <= 50; i++) {
            String key = "Key." + i;
            String value = "Value." + i;
            assertEquals(value, tmap.get(key));
        }
    }

    @Test
    public void randomTestC() {
        GlimmerHashMap tmap = new GlimmerHashMap();

        List<String> randomList = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            String s = UUID.randomUUID().toString();
            randomList.add(s);
            tmap.put(s, s);
        }

        for (String s : randomList) {
            assertEquals(s, tmap.get(s));
        }

    }

}
