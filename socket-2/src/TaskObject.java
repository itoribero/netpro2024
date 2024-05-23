import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskObject implements Serializable, ITask{
    private int execNumber;
    private int result;

    public int getExecNumber(){
        return execNumber;
    }

    public void setResult(int result){
        this.result = result;
    }

    @Override
    public void setExecNumber(int x) {
        execNumber = x;
    }

    @Override
    public void exec() {
        setResult(getPrimeList(execNumber));
    }

    @Override
    public int getResult() {
        return result;
    }

    private int getPrimeList(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        List<Integer> primes = new ArrayList<>();
        
        for (int p = 2; p*p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p*p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        for (int p = 2; p <= n; p++) {
            if (isPrime[p]) {
                primes.add(p);
            }
        }
        
        return primes.getLast();
    }
}
