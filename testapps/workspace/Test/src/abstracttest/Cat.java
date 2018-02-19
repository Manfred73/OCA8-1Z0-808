package abstracttest;

public class Cat implements Walk, Run {

	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}
	
	@Override
	public int getSpeed() {
		return 1;
	}

}
