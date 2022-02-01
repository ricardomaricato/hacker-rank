package dataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n < 1 || n > 1000) {
			System.out.println("Input not allowed!");
			return;
		}

		int operations = in.nextInt();
		if (operations < 1 || operations > 10000) {
			System.out.println("Input not allowed!");
			return;
		}

		BitSet bitSet1 = new BitSet(n);
		BitSet bitSet2 = new BitSet(n);

		for (int i = 0; i < operations; i++) {
			String op = in.next();
			int op1 = in.nextInt();
			int op2 = in.nextInt();

			if (op.equals("AND")) {
				if (op1 == 1) {
					bitSet1.and(bitSet2);
				} else {
					bitSet2.and(bitSet1);
				}
			}

			if (op.equals("OR")) {
				if (op1 == 1) {
					bitSet1.or(bitSet2);
				} else {
					bitSet2.or(bitSet1);
				}
			}

			if (op.equals("XOR")) {
				if (op1 == 1) {
					bitSet1.xor(bitSet2);
				} else {
					bitSet2.xor(bitSet1);
				}
			}

			if (op.equals("SET")) {
				if (op1 == 1) {
					bitSet1.set(op2);
				} else {
					bitSet2.set(op2);
				}
			}

			if (op.equals("FLIP")) {
				if (op1 == 1) {
					bitSet1.flip(op2);
				} else {
					bitSet2.flip(op2);
				}
			}

			System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
		}
	}
}
