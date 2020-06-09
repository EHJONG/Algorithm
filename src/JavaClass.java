import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JavaClass {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String answer = solution(participant, completion);
        System.out.println("answer : " + answer);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for (i =0; i<completion.length; i++){
            if(!(participant[i].equals(completion[i]))){
                return participant[i];
            }
        }
        return participant[i];
    }
}