

	public class Square implements Shape {

		private String fillColor;
		private int borderWidth,size ;
		private HexColorValidator value;
		private static final String SQUARE = "Square";

		public Square(String fillColor, int borderWidth, int size) throws Exception {
			this.value = new HexColorValidator();
			if (value.validate(fillColor)) {
				this.fillColor = fillColor;
			}

			if (borderWidth > 0) {
				this.borderWidth = borderWidth;
			} else
				throw new Exception(SQUARE + " Invalid Border Width");

			if (size > 0) {
				this.size = size;
			} else
				throw new Exception(SQUARE + " Invalid Size");
		}

		@Override
		public void draw() {
			int i, j;
			for (i = 0; i < size; i++) {
				for (j = 0; j < size; j++) {
					if (i == 0 || i == size - 1 || j == 0 || j == size - 1)
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
		}

		@Override
		public double getArea() {

			return size * size;
		}

		@Override
		public String getName() {
			return SQUARE;
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
	


