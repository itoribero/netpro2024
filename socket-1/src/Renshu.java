class Renshu {

    // xを2倍にして返す関数
    public int doubleValue(int x) {
        return x * 2;
    }

    //ここに続きを実装していく。
    public int sumUpToN(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }

        return sum;
    }

    public int sumFromPtoQ(int p, int q){
        int sum = 0;
        if(p > q){
            return -1;
        }

        for(int i = p; i <= q; i++){
            sum += i;
        }

        return sum;
    }

    public int sumFromArrayIndex(int[] a, int index){
        if(index < 0 || index >= a.length){
            return -1;
        }
        else{
            int sum = 0;
            for(int i = index; i < a.length; i++){
                sum += a[i];
            }
            return sum;
        }
    }

    public int selectMaxValue(int[] a){
        int maxValue = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > maxValue){
                maxValue = a[i];
            }
        }

        return maxValue;
    }

    public int selectMinValue(int[] a){
        int minValue = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < minValue){
                minValue = a[i];
            }
        }

        return minValue;
    }

    public int selectMaxIndex(int[] a){
        int indexOfMaxValue = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i] > a[indexOfMaxValue]){
                indexOfMaxValue = i;
            }
        }

        return indexOfMaxValue;
    }

    public int selectMinIndex(int[] a){
        int indexOfMinValue = 0;
        for(int i = 1; i < a.length; i++){
            if(a[i] < a[indexOfMinValue]){
                indexOfMinValue = i;
            }
        }

        return indexOfMinValue;
    }

    public void swapArrayElements(int[] p, int i, int j){
        int storedValue = p[i];
        p[i] = p[j];
        p[j] = storedValue;
    }

    public boolean swapTwoArrays(int[] a, int[] b){
        int[] storedArray = new int[a.length];
        if(a.length != b.length){
            return false;
        }

        for(int i = 0; i < storedArray.length; i++){
            storedArray[i] = a[i];
            a[i] = storedArray[i];
            a[i] = b[i];
            b[i] = storedArray[i];
        }
        
        return true;
    }
}