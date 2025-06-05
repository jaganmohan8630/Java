public class prob23 {                       
    public static void main(String[] args) {
        String jjm = "This is Jagan Mohan".toLowerCase(); // Convert to lowercase for consistency
        // int[] freq = new int[26]; // Array to store letter counts

        // for (int i = 0; i < jjm.length(); i++) {
        //     char c = jjm.charAt(i);
        //     if (c >= 'a' && c <= 'z') {  // Only consider alphabetic characters
        //         freq[c - 'a']++;  // Increment count
        //     }
        // }

        // // Print the frequency of each letter
        // for (char letter = 'a'; letter <= 'z'; letter++) {
        //     if (freq[letter - 'a'] > 0) {
        //         System.out.println(letter + " → " + freq[letter - 'a']);
        //     }
        // }

        int arr[] = new int[26];
        for(int i=0;i<jjm.length();i++){
            char c = jjm.charAt(i);
            if(c>='a' && c<='z'){
                arr[c-'a']++;
            }
        }
        for(char i ='a';i<='z';i++){
            if(arr[i-'a']>0)
            System.out.printf("%c: %d\n",i,arr[i-'a']);
        }
    }
}
