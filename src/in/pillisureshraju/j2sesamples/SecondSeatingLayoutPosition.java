package in.pillisureshraju.j2sesamples;

class SecondSeatingLayoutPosition {
	private static final int _MAXSEATS = 109;

	public static void main(String[] args) {

		String asile = "Asile", middle = "Middle", window = "Window";
		int rowLen = 6;
		String seat = null;
		for (int i = 1; i < _MAXSEATS; i++) {
			int order = i % rowLen;
			switch (order) {
			case 0:
			case 1:
				seat = window;
				break;
			case 2:
			case 5:
				seat = middle;
				break;
			case 3:
			case 4:
				seat = asile;
				break;
			}
			
			System.out.println("Seat No " + i + ": " + seat);
		}
	}
}