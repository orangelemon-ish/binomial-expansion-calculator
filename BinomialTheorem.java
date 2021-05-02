public class BinomialTheorem {
	private int x;
	private int y;
	private int exp;

	public BinomialTheorem(int first, int second, int power) {
		x = first;
		y = second;
		exp = power;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getExp() {
		return exp;
	}

	public static int factorial(int x) {
		if(x <= 1) {
			return 1;
		} else {
			return x * factorial(x-1);
		}
	}
	
	public static int nChooseR(int n, int r) {
		int num = factorial(n);
		int denom = factorial(n-r) * factorial(r);
		return num/denom;
	}

	public String singleTerm(int term) {
		int c = nChooseR(exp, term-1);
		c *= (int) Math.pow(x, exp-(term-1));
		c *= (int) Math.pow(y, term-1);

		String termStats = "" + c + "x^" + (exp-(term-1)) + "y^" + (term-1);
		return termStats;
	}

	public int[] binomialExpansion() {
		int a = this.getX();
		int b = this.getY();
		int p = this.getExp();
		int[] coefs = new int[p+1];
		for(int i = 0; i <= p; i++) {
			int coef = nChooseR(p, i) * (int) Math.pow(a, p-i) * (int) Math.pow(b, i);
			coefs[i] = coef;
		}
		return coefs;
	}

	public String toString() {
		int[] c = this.binomialExpansion();
		String expansion = "";
		for(int i = 0; i < c.length; i++) {
			expansion += c[i] + " ";
		}
		return expansion;
	}
	
}
