package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {
	private final intArrayStack stack;

	public defaultCountingOutRhymer() {
		this.stack = new intArrayStack();
	}

	public defaultCountingOutRhymer(intArrayStack stack) {
		this.stack = stack;
	}

	public void countIn(int in) {
		stack.countIn(in);
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	protected int peekaboo() {
		return stack.peekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}
}
