package com.agiledcoders.eventstore;

public class Runner {

    public static void main(String[] args) {
        EventStore store = new EventStore();
        A forA = new A(store);
        B forB = new B(store);

        forA.raise();
        forB.raise();
    }

    static class A implements EventHandler {
        private final EventStore store;

        A(EventStore store) {
            this.store = store;
            this.store.subscribe("From-B", this);
        }

        @Override
        public void handle(String eventName, Object obj) {
            System.out.println("----------From A---------");
            System.out.println(obj);
            System.out.println();
        }

        public void raise() {
            this.store.raise("From-A", "Coming from A");
        }
    }

    static class B implements EventHandler {

        private final EventStore store;

        B(EventStore store) {
            this.store = store;
            this.store.subscribe("From-A", this);
        }

        @Override
        public void handle(String eventName, Object obj) {
            System.out.println("----------From B---------");
            System.out.println(obj);
            System.out.println();
        }

        public void raise() {
            this.store.raise("From-B", "Coming from B");
        }
    }
}
