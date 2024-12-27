package com.agiledcoders.observer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PubSubRunner {
    public static void main(String[] args) {
        final Observer<String> observer = new ObserverImpl();
        final Subject<String> subject = new SubjectImpl();
        subject.register(observer);

        final int[] count = {0};
        try {
            ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            // Produce
            executorService.scheduleAtFixedRate(() -> subject.notify("Count: " + count[0]++), 0, 100, TimeUnit.MILLISECONDS);

            // Block the main
            Thread.sleep(1000);
            executorService.shutdown();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-------------------Finished-------------------");
    }
}
