package sizzle.types;

/**
 * A {@link SizzleProtoTuple}.
 * 
 * @author rdyer
 * 
 */
public class RepositoryTypeProtoMap extends SizzleMap {
	/**
	 * Construct a ProjectProtoTuple.
	 */
	public RepositoryTypeProtoMap() {
		super(new SizzleInt(), new SizzleString());
	}
}
