class CariMax {
	public static void main (String[] args) {
		int angka1 = 30;
		int angka2 = 50;
		int angka3 = 70;
		
		int max = 0;

		max = angka1 >= max ? angka1 : max;
		max = angka2 >= max ? angka2 : max;
		max = angka3 >= max ? angka3 : max;

		System.out.println("Angka paling besar adalah "+max);
	}
]