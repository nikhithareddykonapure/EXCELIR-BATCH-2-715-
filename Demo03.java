class Demo03 {

	static int gcd(int a, int b)
	{
		int i;
		if (a < b)
			i = a;
		else
			i = b;

		for (i = i; i > 1; i--) {

			if (a % i == 0 && b % i == 0)
				return i;
		}

		return 1;
	}
	public static void main(String[] args)
	{
		int a = 30, b = 20;

		System.out.println("GCD = " + gcd(b, a));
	}
}
