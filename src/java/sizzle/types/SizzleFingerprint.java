package sizzle.types;

import sizzle.compiler.TypeException;

/**
 * A {@link SizzleScalar} representing a 64 bit signature value.
 * 
 * @author anthonyu
 * 
 */
public class SizzleFingerprint extends SizzleScalar {
	/** {@inheritDoc} */
	@Override
	public SizzleScalar arithmetics(final SizzleType that) {
		// no math for fingerprints
		throw new TypeException("incorrect type " + this + " for arithmetic with " + that);
	}

	/** {@inheritDoc} */
	@Override
	public boolean accepts(final SizzleType that) {
		return this.assigns(that);
	}

	/** {@inheritDoc} */
	@Override
	public String toJavaType() {
		return "long";
	}

	/** {@inheritDoc} */
	@Override
	public String toBoxedJavaType() {
		return "Long";
	}

	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "fingerprint";
	}
}
