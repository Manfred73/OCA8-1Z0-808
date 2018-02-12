public class TestMutability {

	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("initial");
		NotImmutable problem = new NotImmutable(sb);
		sb.append(" added");
		StringBuilder gotBuilder = problem.getBuilder();

		gotBuilder.append(" more");
		System.out.println(problem.getBuilder());		// prints: initial added more

		sb = new StringBuilder("initial");
		System.out.println("sb expect 'initial': " + sb);
		Immutable im = new Immutable(sb);
		sb.append(" added");
		System.out.println("sb expect 'initial added': " + sb);
		gotBuilder = im.getBuilder();
		System.out.println("gotBuilder expect 'initial': " + gotBuilder);
		
		gotBuilder.append(" more");
		System.out.println("gotBuilder expect 'initial more': " + gotBuilder);
		
		System.out.println(im.getBuilder());			// prints: initial
		System.out.println(im.getValue());				// prints: initial			
	}
}
