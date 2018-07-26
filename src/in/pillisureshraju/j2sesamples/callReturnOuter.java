package in.pillisureshraju.j2sesamples;
import in.pillisureshraju.j2sesamples.Inner;
public class callReturnOuter {
	public static void main(String args[]) {
		ReturnOuter ro1 = new Inner().callMethod();
	}
}
