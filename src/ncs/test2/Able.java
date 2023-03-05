package ncs.test2;

public class Able implements Comparable<Able> {
	String empno;
	int net, ejb, xml, total;

	public Able(int total) { // Constructor
		this.total = total;
	}

	public Able(String no, int n, int e, int x) { // Constructor
		empno = no;
		net = n;
		ejb = e;
		xml = x;
		total = n + e + x;
	}

	public int getTotal() {
		return total;
	}

	@Override
	public int compareTo(Able o) {
		int result = getTotal() - o.getTotal();
		if(result == 0) {
			result = empno.compareTo(o.empno);
		}
		return result;
	}

	@Override
	public String toString() {
		return "Able [empno=" + empno + ", net=" + net + ", ejb=" + ejb + ", xml=" + xml + ", total=" + total
				+ ", getTotal()=" + getTotal() + "]\n";
	}
	
}