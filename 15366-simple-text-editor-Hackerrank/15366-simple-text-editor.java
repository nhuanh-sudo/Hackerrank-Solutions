import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        StringBuilder S = new StringBuilder();
        Stack<String> history = new Stack<>();
        
        Scanner sc = new Scanner(System.in);
        
        int Q = sc.nextInt();
        
        for (int i = 0; i < Q; i++) {
            int type = sc.nextInt();
            
            if (type == 1) {
                String W = sc.next();
                S.append(W);
                history.push("2 " + W.length());
            }
            else if (type == 2) {
                int k = sc.nextInt();
                String sDeleted = S.substring(S.length() - k);
                history.push("1 " + sDeleted);
                S.delete(S.length() - k, S.length()); 
            }
            else if (type == 3) {
                int k = sc.nextInt();
                System.out.println(S.charAt(k - 1));
            }
            else if (type == 4) {
                if (!history.isEmpty()) {
                    String command = history.pop();
                    String[] parts = command.split(" ");
                    
                    String maLenh = parts[0];
                    String giaTri = parts[1];
                    
                    if (maLenh.equals("1")) {
                        S.append(giaTri);
                    } 
                    else if (maLenh.equals("2")) {
                        int soLuongXoa = Integer.parseInt(giaTri);
                        S.delete(S.length() - soLuongXoa, S.length());
                    }
                    
                }
            }
        }
    }
} 



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna