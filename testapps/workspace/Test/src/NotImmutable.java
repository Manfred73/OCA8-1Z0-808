
public class NotImmutable {
	
	private StringBuilder builder;
	
	public NotImmutable(StringBuilder b) {
		builder = b;
	}
	
	public StringBuilder getBuilder() {
		return builder;
	}
}
