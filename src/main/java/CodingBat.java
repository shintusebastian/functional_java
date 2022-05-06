import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class CodingBat {//coding bat practice questions

    public static void main(String[] args) {


        float n = 1.15F;
        int s = (int) n;
int [] nums={1,4,6,8,4,7,2};

        int length = nums.length;//here, length is a property
        String sh = "skhkwe";
        sh.length();//here length is a method.

        String t1 = "xxcaazz", t2 = "xxbaaz";


        String shi = "xxx";
        System.out.println(countXX(sh));
    }

    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'x') && (str.charAt(i + 1) == 'x')) {
                count++;
            }
        }
        return count;
    }

    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + 2) {// we must write i=i+2; otherwise it will show "not a statement".
            result += str.charAt(i);
        }
        return result;
    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0, 1 + i);//here in each iteration, we add the substring of the chars from 0 to i.
        }
        return result;
    }

    //coding bat
    public String startOz(String str) {

        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;


    }

    public boolean stringE(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'e')) {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

    public boolean lastDigit(int a, int b) {
        String v1 = String.valueOf(a);
        String v2 = String.valueOf(b);
        return (v1.charAt(v1.length() - 1) == (v2.charAt((v2.length() - 1))));

    }

    public String endUp(String str) {
        String result = "";
        if (str.length() <= 3) {
            return str.toUpperCase();
        } else

            return str.substring(0, str.length() - 4) + str.substring(str.length() - 3, str.length() - 1).toUpperCase(Locale.ROOT);

    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] + 5 == nums[i + 1]) && Math.abs((nums[i] - 1) - nums[i + 2]) <= 2) {
                return true;
            }
        }
        return false;
    }

    public String comboString(String a, String b) {
        int alength, blength;
        String big, small;
        alength = a.length();
        blength = b.length();


        if ((alength == 0) || (blength == 0)) {
            return a + b;
        }

        if (alength > blength) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        return small + big + small;
    }

    public String theEnd(String str, boolean front) {
        if (front == false) return str.substring(str.length() - 1);
        return str.substring(0, 1);
    }

    public String deFront(String str) {
        String result = "";
        String a = str.substring(0, 1), b = str.substring(1, 2);
        if (str.length() < 1) return result;
        else if ((str.length() == 1) && str.charAt(0) == 'a') return str;
        else if ((str.length() == 1) && str.charAt(0) != 'a') return "";
        else if ((str.length() >= 2) && (str.charAt(0) == 'a') && (str.charAt(1) == 'b')) {
            return str;
        } else if ((str.length() >= 2) && (str.charAt(0) == 'a') && (str.charAt(1) != 'b')) {
            return a + str.substring(2);

        } else if (((str.length() >= 2) && (str.charAt(0) != 'a') && (str.charAt(1) == 'b'))) {
            return b + str.substring(2);
        } else return str.substring(2);


    }
    public String withoutX2(String str) {// very important logic.
        String result="";
        for(int i=0;i<str.length();i++){
            if(i==0 && str.charAt(i)!='x')
                result+=str.charAt(i);

            if(i==1 && str.charAt(i)!='x')
                result+=str.charAt(i);
            if(i>1 )
                result+=str.charAt(i);
        }
        return result;
    }


}
