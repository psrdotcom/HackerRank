package in.pillisureshraju.j2sesamples;

public class JanShatabdiLayoutPosition {

	private static final int _MAXSEATS = 107;

	public static void main(String[] args) {
		int ele1 = 1;

		String asile = "Asile", middle = "Middle", window = "Window";
		int rowLen = 6;
		String seat = null;
		int val = ele1;
		
		for (int i = ele1; i < _MAXSEATS; i++, ele1++) {
			if (ele1 > 0 && ele1 < 5) {
				if (ele1 == 4) {
					val = ele1 + 1;
				} else {
					val = ele1;
				}
			} else if (ele1 > 4 && ele1 < 106) {
				val = ele1 - 5;
			} else if(ele1 == 106){
				val = 0;
			} else {
				return;
			}

			int order = val % rowLen;
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
