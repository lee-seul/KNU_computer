public class StringTest{
    public static void main(String args[]){
        String s = "Lee Seul";

        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.concat(" hh"));
        System.out.println(s.equals("lee seul"));
        System.out.println(s.equalsIgnoreCase("lee seul"));
        System.out.println(s.replace("l", "p"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    
    }
}
