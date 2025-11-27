class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s=text.split(" ");
        int typables=0;

        for(String word:s){
            boolean ok = true;
            for(int i=0;i<brokenLetters.length();i++){
                if(word.contains(brokenLetters.charAt(i)+"")){
                    ok=false;
                    break;//this break is very important turned 11ms to 3 ms;
                }
            }
            if(ok) typables++;
        }
        return typables;
    }
}

/* class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] s=text.trim().split("\\s+");
        int typables=0,flag=0;
        for(String t:s){
            for(int i=0;i<brokenLetters.length();i++){
                if(t.contains(brokenLetters.charAt(i)+"")) flag=1;
            }
            if(flag==0) typables++;
            flag=0;
        }
        return typables;
    }
} */