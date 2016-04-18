public class ContinueTest{
    public static void main(String args[]){
    
        String s = "no new is good new";
        int n = 0;

        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) != 'n')
                continue;
            n++;
        }
        System.out.println("문장에서 발견된 n의 개수 " + n);
    
    
        for(int i = 0; i < 20; i++){
            if(i%2==0)
                continue
            System.out.println(i);
        }
    
    }
}
