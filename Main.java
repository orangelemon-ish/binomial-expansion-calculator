import java.util.*;
class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("factorial (1), coefficient (2), single term (3), or expansion (4)? ");
		int choice = scan.nextInt();

		if (choice == 1) {
			System.out.print("number: ");
			int x = scan.nextInt();
			System.out.println(BinomialTheorem.factorial(x));
		} else if (choice == 2) {
			System.out.print("n: ");
			int n = scan.nextInt();
			System.out.print("r: ");
			int r = scan.nextInt();
			System.out.println(BinomialTheorem.nChooseR(n, r));
		} else if (choice == 3 || choice == 4) {
			System.out.print("first coefficient: ");
			int x = scan.nextInt();
			System.out.print("second coefficient: ");
			int y = scan.nextInt();
			System.out.print("power: ");
			int pow = scan.nextInt();
			BinomialTheorem bin = new BinomialTheorem(x, y, pow);
			if (choice == 3) {
				System.out.print("term number: ");
				int term = scan.nextInt();
				System.out.println(bin.singleTerm(term));
			} else if (choice == 4) {
				System.out.println(bin);
			}
		} else {
			System.out.println("sorry, choice not available");
		}

  }
}
