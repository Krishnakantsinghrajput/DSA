import java.util.*;
public class wordPattern {
    public static void main(String[] args) {
      String  pattern = "abba", s = "dog cat cat dog";
      boolean ans=WordPatternFun(pattern, s);
      System.out.println(ans);
    }

    public static boolean WordPatternFun(String pattern,String s){
        String word[]=s.split(" ");
        if(pattern.length()!=word.length){
            return false;
        }
        Map<Character,String> ch=new HashMap<>();
          Map<String,Character> words=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
char c=pattern.charAt(i);
String w=word[i];
if(ch.containsKey(c)){
    if(!(ch.get(c).equals(w))){
        return false;
    }
}
else{
    ch.put(c, w);
}

if(words.containsKey(w)){
    if(words.get(w)!=c){
        return false;

    }
}
else{
    words.put(w, c);
}
        }
        return true;
    }


}
