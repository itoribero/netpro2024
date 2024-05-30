package thread;

public class MyThread extends Thread {
    public void run() {
        // スレッドが実行する処理を記述
        System.out.println("MyThread is running");
    }

    public static void main(String[] args) throws InterruptedException {
        // 新しいスレッドを作成して開始
        MyThread thread = new MyThread();
        Thread.sleep(4000);
        thread.start();
    }
}