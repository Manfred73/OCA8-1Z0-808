public class Scratch {

	public static void main(String[] args) {
		Scratch s = new Scratch();
		System.out.println(s.howMany(true, true, true));
		System.out.println(s.howMany(true,  new boolean[] {true,true}));
		System.out.println(s.howMany(true, new boolean[2]));
	}
	
	public int howMany(boolean b, boolean... b2) {
		return b2.length;
	}
}
