package my.example;


public class MyThread extends Thread {



    public static void main(String[] args) {

        Thread t1 = new Thread(MyThread::sayHello);
        Thread t2 = new Thread(MyThread::sayBye);

        t1.start();
        t2.start();
    }

    public static void sayHello(){
        //System.out.println("Hello" + Thread.currentThread().getName());
        long start =System.currentTimeMillis();
        for (int i=0; i<10; i+=2) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long end =System.currentTimeMillis();
        System.out.println("The Execution Time"+": " +(end-start)/1000+"s");
    }

    public static void sayBye(){
        //System.out.println("Hello" + Thread.currentThread().getName());
        for(int i=1; i<10; i+=2){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try{
                Thread.sleep(500);

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
