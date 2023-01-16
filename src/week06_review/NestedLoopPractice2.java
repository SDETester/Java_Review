package week06_review;

public class NestedLoopPractice2 {

    public static void main(String[] args) {
        String s = "abcabcabcabcbbbbbb";
        String result = "";

        for (int j = 0; j< s.length();j++){
            char c = s.charAt(j);
            int f = 0;

            for(int i = 0; i< s.length(); i++){
                if(s.charAt(i) == c){
                    f++;
            if(result.contains(""+c)){
            continue;
            } result += c+""+f;

            if(f==1) {
                result += c;

            }}}}}}