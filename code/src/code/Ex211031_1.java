package code;

import java.util.Scanner;

public class Ex211031_1 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int left = 0;
		int right = 0;
		int res = 0;
		int sum = 0;

		// 가로의 수 만큼 높이 입력
		// 가로 입력값
		int hor = Integer.parseInt(sc.nextLine());

		// 높이 입력값
		String hei = sc.nextLine();
		String[] strHei = hei.split(" ");

		// 가로값 크기의 배열
		int[] height = new int[hor];

		// 높이 값 정수로 변환해서 배열에 넣기
		int i = 0;
		while (i < hor) {
			height[i] = Integer.parseInt(strHei[i]);
			i++;
		}

		// 배열 0, 1, 2, 3 ,... ,hor-3, hor-2, hor-1
		int j = 2;
		while (j < hor - 2) {

			// 왼쪽 두 높이 중 큰 값
			if (height[j - 1] >= height[j - 2]) {
				left = height[j - 1];
			} else {
				left = height[j - 2];
			}

			// 오른쪽 두 높이 중 큰 값
			if (height[j + 1] >= height[j + 2]) {
				right = height[j + 1];
			} else {
				right = height[j + 2];
			}

			// 왼쪽 오른쪽 중 큰 값을 중앙과 비교
			if (left >= right) {
				if (height[j] >= left) {
					res = height[j] - left; // 중앙 높이와의 차
					sum += res; // 결과합
				}
			} else {
				if (height[j] >= right) {
					res = height[j] - right; // 중앙 높이와의 차
					sum += res; // 결과합
				}
			}

			j++;
		}

		System.out.println("# " + sum); 

	}

}
