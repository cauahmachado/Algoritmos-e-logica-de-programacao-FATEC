package hackerrank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//tabuada

public class aIntroducaoex003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        for (int i=1;i<=10;i++){
            int c =i*n;
            System.out.println(n+" * "+i+" = "+c);
        }
    }
}
