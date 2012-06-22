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

		names.put("project_url", 1);
		members.add(new SizzleString());

		names.put("homepage_url", 2);
		members.add(new SizzleString());

		names.put("created_date", 3);
		members.add(new SizzleInt());

		names.put("id", 4);
		members.add(new SizzleString());

		names.put("description", 5);
		members.add(new SizzleString());

		names.put("programming_languages", 6);
		members.add(new SizzleArray(new SizzleString()));

		names.put("licenses", 7);
		members.add(new SizzleArray(new SizzleString()));

		names.put("topics", 8);
		members.add(new SizzleArray(new SizzleString()));

		names.put("maintainers", 9);
		members.add(new SizzleArray(new PersonProtoTuple()));

		names.put("developers", 10);
		members.add(new SizzleArray(new PersonProtoTuple()));

		names.put("code_repositories", 11);
		members.add(new SizzleArray(new CodeRepositoryProtoTuple()));

		names.put("bug_repositories", 12);
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
