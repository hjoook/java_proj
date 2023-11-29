package lab.chap06;

public class Product {

	//1.필드
	private long     idx;      // 번호
	private String   proName;  // 제품명
	private int      qty;      // 제품 갯수 
	private int      year;     // 년 
	private String   proColor; // 제품색

	
	// 기본 생성자
	Product(){}

	//getter (출력) /setter(입력) 를 생성
	public final long getIdx() {
		return idx;
	}

	public final void setIdx(long idx) {
		this.idx = idx;
	}

	public final String getProName() {
		return proName;
	}

	public final void setProName(String proName) {
		this.proName = proName;
	}

	public final int getQty() {
		return qty;
	}

	public final void setQty(int qty) {
		this.qty = qty;
	}

	public final int getYear() {
		return year;
	}

	public final void setYear(int year) {
		this.year = year;
	}

	public final String getProColor() {
		return proColor;
	}

	public final void setProColor(String proColor) {
		this.proColor = proColor;
	}



	// toString
	@Override
	public String toString() {
		return "Product [idx=" + idx + ", proName=" + proName + ", qty=" + qty + ", year=" + year + ", proColor="
				+ proColor + "]";
	}
	

	
	
	


}
