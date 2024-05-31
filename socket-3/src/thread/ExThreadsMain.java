package thread;

import java.util.ArrayList;

public class ExThreadsMain implements Runnable{
   char myAlfabetChar;

    // main メソッドはプログラムのエントリーポイントです。
    public static void main(String[] args){
        int alfabetNum = 26;
        ArrayList cList = new ArrayList<>();
        ArrayList<ExThreadsMain> ctList = new ArrayList<>();
        ArrayList<Thread> threadList = new ArrayList<>();

        for(int i = 0; i < alfabetNum; i++){
            cList.add((char)(97 + i));
            ctList.add(new ExThreadsMain());
            threadList.add(new Thread(ctList.get(i)));
            ctList.get(i).setChar(cList.get(i));
        }

        for(int i = 0; i < threadList.size(); i++){
            threadList.get(i).start();
        }
    }

    public void setChar(Object object) {
        myAlfabetChar = (char)object;
    }

    // run メソッドは、新しいスレッドが実行するコードを含みます。
    public void run() {
        // この try-catch ブロックは、0 から 9 までの値を 1000 ミリ秒間隔で出力するループを実行します。
        try {
            for(int i = 0; i < 10; i++) {
                System.out.println(myAlfabetChar + String.valueOf(i * i));

                // スレッドを 1000 ミリ秒間一時停止します。
                Thread.sleep(1000);  // ミリ秒単位のスリープ時間
            }
        }
        catch(InterruptedException e) {
            // スレッドが中断された場合は、例外を出力します。
            System.err.println(e);
        }
    }
}
