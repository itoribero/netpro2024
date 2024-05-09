public class XmasTreeKadai {
    public static void main(String[] args) {
        // 木の高さ
        int TreeHeight = 30;
        // 葉の最大横幅
        int leafNum = 38;
        // 葉の部分の高さ
        int leafHeight = leafNum / 2;
        // 幹の太さ
        int mikiWidth = 4;

        for(int i = 0; i < TreeHeight; i++){
            for(int j = 0; j < leafNum; j++){
                if(i < leafHeight){
                    if(j < leafHeight - i){
                        if((i+j)%3 == 0){
                            System.out.print(" ");
                        }
                        else if ((i+j)%3 == 1) {
                            System.out.print("+");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    else if( j >= leafHeight + i){
                        if((i+j)%3 == 0){
                            System.out.print(" ");
                        }
                        else if ((i+j)%3 == 1) {
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("+");
                        }
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else{
                    if(j < leafHeight - mikiWidth / 2){
                        System.out.print(" ");
                    }
                    else if( j >= leafHeight + mikiWidth / 2){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}