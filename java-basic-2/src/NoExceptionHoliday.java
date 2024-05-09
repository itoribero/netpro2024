import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NoExceptionHoliday {
    public static void main(String[] args) {
		NoExceptionHoliday noE=new NoExceptionHoliday();
	}

	NoExceptionHoliday(){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader というのは、データ読み込みのクラス(型)
		// クラスの変数を作るには、new を使う。

		// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
		//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
		while (true) {
            try {
                System.out.println("何日ですか?");
                String line = reader.readLine();
                int day = Integer.parseInt(line);
                System.out.println("日付" + day + "日ですね。");
    
                test(day);
            }
            catch(IOException e) {
                System.out.println(e);
            } catch (NoHolidayException e) {
                e.printStackTrace();
            }   
        }
	}

	void test(int day) throws NoHolidayException{
		if(
            (1 <= day && day <= 3) || 
            (7 <= day && day <= 10) || 
            (13 <= day && day <= 17) || 
            (20 <= day && day <= 24) || 
            (27 <= day && day <= 31)
        )
        {
			throw new NoHolidayException();
		}
	}
}
