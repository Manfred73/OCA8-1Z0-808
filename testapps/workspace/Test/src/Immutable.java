
public class Immutable {
	
	private StringBuilder builder;
	
	public Immutable(StringBuilder b) {
		builder = new StringBuilder(b);
	}

	public StringBuilder getBuilder() {
		return new StringBuilder(builder);
	}
	
	public String getValue() {
		return builder.toString();
	}
}
