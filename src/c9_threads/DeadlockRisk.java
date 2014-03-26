package c9_threads;

public class DeadlockRisk {

    private static class Resource {

        public int value;
    }
    private final Resource resourceA = new Resource();
    private final Resource resourceB = new Resource();

    public int read() {
        synchronized (resourceA) { // May deadlock here
            synchronized (resourceB) {
                return resourceB.value + resourceA.value;
            }
        }
    }

    public void write(int a, int b) {
        synchronized (resourceB) { // May deadlock here
            synchronized (resourceA) {
                resourceA.value = a;
                resourceB.value = b;
            }
        }
    }
}
