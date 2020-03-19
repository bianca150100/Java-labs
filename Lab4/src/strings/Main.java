package strings;

public class Main {

    static String membruClasa;

    public static void main(String[] args){

        System.out.println(membruClasa);

        String s1= "";
        String s2= " abc ";
        System.out.println(s2); //abc
        s2.toUpperCase();
        System.out.println(s2); //abc
       // s2=s2.toUpperCase();
      //  System.out.println(s2); //ABC

        String s3= new String(" abc ");
        System.out.println(s2 ==s3); //false
        String s4= " abc ";
        System.out.println(s2 ==s4); //true

        System.out.println(s2.equals(s3)); //true
        s3= s3.intern();
        System.out.println(s2 == s3); //true

        s3.toUpperCase();
        System.out.println(s3);

        String adresa = s1 + s2 +s3.toUpperCase();
        StringBuilder sb=new StringBuilder(adresa);
        sb.append(1234);
        System.out.println(sb);

        StringBuffer sbf=new StringBuffer(adresa);
        StringBuffer sbff= new StringBuffer(sb);
        StringBuilder sbb=new StringBuilder(sbf);

    }
}
