package sk.fei.stuba.oop.skuskart.support;

import java.util.concurrent.atomic.AtomicInteger;


public class IdGeneratorComponents {
    private static final AtomicInteger generator = new AtomicInteger(0);

    public static int newId() {
        return generator.getAndIncrement();
    }
}
