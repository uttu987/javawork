import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        //Strii=ng
        String arr[] = {"aaa","abcd","maana"};
        for(String res:arr){
            if(res.matches("[a-z]{4}")==true){
                System.out.println(res);
            }
        }
        System.out.println("jhbdasb");
    }
}
