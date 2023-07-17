//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends




class Solution {
    public String FirstNonRepeating(String A) {
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        for (char ch : A.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);

            boolean foundNonRepeating = false;
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                if (entry.getValue() == 1) {
                    result.append(entry.getKey());
                    foundNonRepeating = true;
                    break;
                }
            }

            if (!foundNonRepeating) {
                result.append('#');
            }
        }

        return result.toString();
    }
}
