package exam;

public class ColorTV extends Tv {

	private int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	void printProperty() {
		System.out.println(getSize()+"인치"+color+"컬러");
	}
}
