public class TestMutability {

	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("initial");
		NotImmutable problem = new NotImmutable(sb);
		sb.append(" added");
		StringBuilder gotBuilder = problem.getBuilder();

		gotBuilder.append(" more");
		System.out.println(problem.getBuilder());		// prints: initial added more

		sb = new StringBuilder("initial");
		Immutable im = new Immutable(sb);
		sb.append(" added");
		gotBuilder = im.getBuilder();

		gotBuilder.append(" more");
		System.out.println(im.getBuilder());			// prints: initial
		System.out.println(im.getValue());				// prints: initial			
	}
}
