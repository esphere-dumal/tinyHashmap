package space.glimmer.lab.test;

import space.glimmer.lab.GlimmerHashMap;
import space.glimmer.lab.container.Bucket;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class test {
    public static void main(String[] args) {
        GlimmerHashMap tmap = new GlimmerHashMap();

        tmap.put("EaFBFBFBFBFBFBFBFBFB", "b");
        tmap.put("FBEaFBFBFBFBFBFBFBFB", "b");
        tmap.put("FBFBEaFBFBFBFBFBFBFB", "b");
        tmap.put("FBFBFBEaFBFBFBFBFBFB", "b");
        tmap.put("FBFBFBFBEaFBFBFBFBFB", "b");
        tmap.put("FBFBFBFBFBEaFBFBFBFB", "b");
        tmap.put("FBFBFBFBFBFBEaFBFBFB", "b");
        tmap.put("FBFBFBFBFBFBFBEaFBFB", "b");
        tmap.put("FBFBFBFBFBFBFBFBEaFB", "b");

        Bucket b = tmap.getBucket("FBFBFBFBFBFBFBFBEaFB");
        assertEquals("bst", b.checkContainerType());

        tmap.remove("FBFBFBFBFBFBFBFBEaFB");
        tmap.remove("FBFBFBFBFBFBFBEaFBFB");
        tmap.remove("FBFBFBFBFBFBEaFBFBFB");
        tmap.remove("FBFBFBFBFBEaFBFBFBFB");
        tmap.remove("FBFBFBFBEaFBFBFBFBFB");
        tmap.remove("FBFBFBEaFBFBFBFBFBFB");

        assertEquals("nodelist", b.checkContainerType());
    }
}
