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
public class PartBTest {

    @Test
    public void nodelistToBstTestB() {
        GlimmerHashMap tmap = new GlimmerHashMap();
        tmap.put("EaFBFBFBFBFBFBFBFBFB", "b");
        tmap.put("FBEaFBFBFBFBFBFBFBFB", "b");
        tmap.put("FBFBEaFBFBFBFBFBFBFB", "b");
        Bucket b = tmap.getBucket("EaFBFBFBFBFBFBFBFBFB");
        assertEquals("nodelist", b.checkContainerType());

        tmap.put("FBFBFBEaFBFBFBFBFBFB", "b");
        tmap.put("FBFBFBFBEaFBFBFBFBFB", "b");
        tmap.put("FBFBFBFBFBEaFBFBFBFB", "b");
        tmap.put("FBFBFBFBFBFBEaFBFBFB", "b");
        tmap.put("FBFBFBFBFBFBFBEaFBFB", "b");
        tmap.put("FBFBFBFBFBFBFBFBEaFB", "b");


        assertEquals("bst", b.checkContainerType());
    }

    @Test
    public void bstToNodelistTestB() {
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
