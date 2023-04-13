package t8_test2;

public class Test1Service {
	String[][] product = {
			{"1","냉장고","1250000"},
			{"2","에어컨","850000"},
			{"3","TV","920000"},
			{"4","쇼파","1200000"},
			{"5","공기청정기","530000"}
	};

	public void getProduct() {
		System.out.println("\t* 상 품 리 스 트 *");
		System.out.println("====================================");
		System.out.println("번호\t상품명\t상품가격");
		System.out.println("------------------------------------");
		for(int i=0; i<product.length; i++) {
			for(int j=0; j<product[0].length; j++) {
				System.out.print(product[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("====================================");
	}

	// 문자형식의 숫자를 숫자로 변환 : Integer.parseInt()
	public void getProductSerach(int sel) {
		int price = (int)(Integer.parseInt(product[sel-1][2]) * 1.1);
		System.out.println("선택하신 "+product[sel-1][1]+"는 실제구매가격이 "+price+"입니다.");
	}
	
	
}
