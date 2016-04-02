package program6;

public class Program6 {

	public static void main(String[] args) {
		int i, n = 2;
		
		while(n<=100){
			for(i=2; i<n;i++){
				if(n%i==0){
					break;
				}
			}
			if(i==n){
				System.out.print(n+ " ");
			}
			n++;
		}

	}

}
