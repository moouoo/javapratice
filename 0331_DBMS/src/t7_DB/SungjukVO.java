package t7_DB;

public class SungjukVO {
	private int idx;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private String grade;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		tot = kor + eng + mat;
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		avg = tot / 3;
		this.avg = avg;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade() {
		String grade;
		if(avg>=90) grade = "A";
		else if(avg < 90 && avg >= 80) grade = "B";
		else if(avg < 80 && avg >= 70) grade = "C";
		else if(avg < 70 && avg >= 60) grade = "D";
		else grade = "F";
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "SungjukVO [idx=" + idx + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot="
				+ tot + ", avg=" + avg + ", grade=" + grade + "]";
	}


	
}
