import java.util.*;

public class EX01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a, b, tmp, sum = 0;
		System.out.println("첫번째 수");
		a = sc.nextInt();

		System.out.println("두번째 수");
		b = sc.nextInt();

		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		
		
		
		for (int i = a; i <= b; i++) {
			sum+=i;
			
		}
		
		System.out.printf("%d에서 %d사이의 합계는 %d입니다.", a, b, sum);
	}

}
