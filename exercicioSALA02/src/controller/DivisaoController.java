package controller;

public class DivisaoController {

	public DivisaoController() {
		super();
	}

	public int divide(int a, int b) {
		if (a < b) {
			return a;
		} else {
			a = a - b;
			return divide(a, b);
		}
	}
}
