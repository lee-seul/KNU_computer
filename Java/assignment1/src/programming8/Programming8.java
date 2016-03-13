package programming8;

public class Programming8 {
	public static void main(String[] args) {
		double speed =3e+5 ,distance = 1.5e+8;
		
		System.out.printf("태양까지의 거리: %e, 속도: %e \n태양에서 지구까지 걸리는 시간: %e초 \n",
				distance, speed, distance/speed );
	}

}
