package space.glimmer.lab.test;

import space.glimmer.lab.GlimmerHashMap;
import space.glimmer.lab.container.Bucket;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class test {
    public static void main(String[] args) {
        GlimmerHashMap tmap = new GlimmerHashMap();

        for (int i = 0; i <= 350; i++) {
            String key = "Key." + i;
            String value = "Value." + i;
            tmap.put(key, value);
            System.out.println(tmap.size());
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
            if(i == 255) {
                String str = "this is break";
            }
            if (i == 305) {
                assertEquals(512, tmap.getThreshold());
            }
        }

//        for (int i = 0; i <= 50; i++) {
//            String key = "Key." + i;
//            String value = "Value." + i;
//            assertEquals(value, tmap.get(key));
//        }
    }
}
