/*p.164 실습문제2
예시 입력 1 
없음
예시 출력 1
1
1 2 3
1
1 2 3 4
1 2
*/

public class Main1arrangement_2
{
	public static void main(String[] args) {
		int n [][] = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		
		for(int i=0; i<n.length; i++) {
		    for(int j=0; j<n[i].length; j++)
		        System.out.print(n[i][j] + " ");
		    System.out.println();
		}
	}
}
