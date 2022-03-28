package exam;

public class Won2Dollar extends Converter {
	public Won2Dollar(double ratio) {
		this.ratio = ratio;
	}
	@Override
	protected double convert(double src) {
		
		return src/ratio;
	}

	@Override
	protected String getSrcString() {
		
		return "원";
	}

	@Override
	protected String getDestString() {
		
		return "달러";
	}

}
