package in.pillisureshraju.j2sesamples;

class ReturnOuter {

}

class Inner extends ReturnOuter {
	ReturnOuter callMethod() {
		System.out.println("Return Outer Class");
		return new ReturnOuter();
	}

}