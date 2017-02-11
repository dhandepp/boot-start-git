package P1;

class FooRunnable implements Runnable {
public void run() {
for(int x = 1; x < 6; x++) {

System.out.println("Runnable running "+Thread.currentThread().getName());
}
}
}

public class TestThreads {
public static void main (String [] args) {
FooRunnable r = new FooRunnable();
Thread t = new Thread(r,"Mayur1T");
t.start();

for(int x = 1; x < 6; x++) {
System.out.println("Main running");
}

}
}