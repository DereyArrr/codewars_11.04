//Вам даны два массива строк a1 и а2. Пусть x будет любая строка в первом массиве и y будет любой строкой во втором массиве.
//Find max(abs(length(x) − length(y)))
//Если a1 и/или a2 пусты, верните -1.

class MaxDiffLength {

    public static int mxdiflg(String[] a1, String[] a2) {
        if(a1.length == 0| a2.length == 0){
            return -1;
        }
        int k=0;
for(int i=0; i<a1.length;i++) {
    for(int j=0; j<a2.length;j++) {
        if (Math.abs(a1[i].length()-a2[j].length())>k){
k = Math.abs(a1[i].length()-a2[j].length());
        };
    }
}
return k;
}
    }

//Возвращает количество гласных в заданной строке.
//Мы будем рассматривать a, e, i, o, u как гласные (но не y).
class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        String s = "aeiou";
        for(int i=0; i<str.length();i++) {
            for(int j=0; j<s.length();j++) {
                if(str.charAt(i)==s.charAt(j)){
                    vowelsCount++;
                }
            }
        }
        return vowelsCount;
    }

}



public class main {
    public static void main(String[] args) {
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        System.out.println(MaxDiffLength.mxdiflg(s1,s2));

        System.out.println(Vowels.getCount("abracadabra"));

    }
}
