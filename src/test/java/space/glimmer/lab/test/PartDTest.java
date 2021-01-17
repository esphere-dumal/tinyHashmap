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
public class PartDTest {

    //todo:这个还没测出什么大的并发问题
    @Test
    public void basicConcurrencyTestD() throws InterruptedException {
        GlimmerHashMap tmap = new GlimmerHashMap();
        final Map<String, String> smap = new ConcurrentHashMap<>();
        //final Map<String, String> tmap = new HashMap<>();

        int num = 300;
        final CountDownLatch countDownLatch = new CountDownLatch(num);

        int keySize = 90000;
        String[] keys = new String[keySize];

        for (int i=0;i<keySize;i++){
            keys[i] = "Key."+i;//UUID.randomUUID().toString();
        }

        for (int i=0;i<num;i++){
            Runnable r = ()->{
                for (int m=0;m<100;m++) {
                    String key = "Key."+Math.abs(UUID.randomUUID().toString().hashCode())%keySize;
                    String value = UUID.randomUUID().toString();
                    smap.put(key,value);
                    tmap.put(key,value);
                    String dek = "Key."+Math.abs(value.hashCode())%keySize;
                    smap.remove(dek);
                    tmap.remove(dek);
                }
                countDownLatch.countDown();
            };
            r.run();
        }

        //等待所有线程完成写入操作
        countDownLatch.await();
        assertEquals(smap.size(),tmap.size());
        for (String k : smap.keySet()) {
            assertEquals(smap.get(k), tmap.get(k));
        }

    }


}
