package sizzle.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A {@link SizzleProtoTuple}.
 * 
 * @author rdyer
 * 
 */
public class ProjectProtoTuple extends SizzleProtoTuple {
	private final static List<SizzleType> members = new ArrayList<SizzleType>();
	private final static Map<String, Integer> names = new HashMap<String, Integer>();

	static {
		names.put("name", 0);
		members.add(new SizzleString());

		names.put("url", 1);
		members.add(new SizzleString());

		names.put("code_repositories", 2);
		members.add(new SizzleArray(new CodeRepositoryProtoTuple()));

		names.put("bug_repositories", 3);
		members.add(new SizzleArray(new BugRepositoryProtoTuple()));
	}

	/**
	 * Construct a ProjectProtoTuple.
	 */
	public ProjectProtoTuple() {
		super(members, names);
	}

	@Override
	public String toJavaType() {
		return "sizzle.types.Toplevel.Project";
	}
}
