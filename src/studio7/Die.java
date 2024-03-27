package studio7;

public class Die {
	private int n;
	
	public Die(int n) {
		this.n = n;
	}
	
	public int roll() {
		int result = (int) ((Math.random()*this.n)+1);
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die Regular = new Die(6);
		System.out.println(Regular.roll());
	}

}
