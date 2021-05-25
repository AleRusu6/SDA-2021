
public class Circle implements Shape{
	private String fillColor;
	private int borderWidth;
	private int radius;
	private HexColorValidator hcv;
	private static final String CIRCLE = "Circle";

	public Circle(String fillColor, int borderWidth, int radius) throws Exception {
		this.hcv = new HexColorValidator();
		if (hcv.validate(fillColor)) {
			this.fillColor = fillColor;
		}
		if (borderWidth > 0) {
			this.borderWidth = borderWidth;
		} else
			throw new Exception(CIRCLE + " Invalid Border Width");

		if (radius > 0) {
			this.radius = radius;
		} else
			throw new Exception(CIRCLE + " Invalid Radius");
	}

	@Override
	public void draw() {
		double dist;
		for (int i = 0; i <= 2 * radius; i++) {
			for (int j = 0; j <= 2 * radius; j++) {
				dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius));
				if (dist > radius - 0.5 && dist < radius + 0.5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public String getName() {
		return CIRCLE;
	}

	@Override
	public String getHexFillColor() {
		return fillColor;
	}

	@Override
	public int getBorderWidth() {
		return borderWidth;
	}

}
