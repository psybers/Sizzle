package sizzle.types;

/**
 * A {@link SizzleProtoTuple}.
 * 
 * @author rdyer
 * 
 */
public class BugStatusProtoMap extends SizzleMap {
	/**
	 * Construct a ProjectProtoTuple.
	 */
	public BugStatusProtoMap() {
		super(new SizzleInt(), new SizzleString());
	}
}
