package sizzle.types;

/**
 * A {@link SizzleProtoTuple}.
 * 
 * @author rdyer
 * 
 */
public class FileTypeProtoMap extends SizzleMap {
	/**
	 * Construct a ProjectProtoTuple.
	 */
	public FileTypeProtoMap() {
		super(new SizzleInt(), new SizzleString());
	}
}
