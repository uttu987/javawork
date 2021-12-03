import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {
        String target = "3213dabjb% dfd dcs13";
        Pattern p = Pattern.compile("\\d\\d");
        Matcher m = p.matcher(target);
        int ctr= 0;
        while(m.find())
        {
            ctr++;
            System.out.println(m.start()+"--"+m.end()+"--"+m.group());
        }
        System.out.println(ctr);
    }
}
