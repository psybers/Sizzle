package sizzle.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Boa domain-specific functions
 * 
 * @author rdyer
 * 
 */
public class BoaIntrinsics {
	private static String[] fixingRegex = {
		"issue(s)?[\\s]+(#)?[0-9]+",
		"issue[\\s]+# [0-9]+",
		"bug[\\s]+(#)?[0-9]+",
		"bug[\\s]+# [0-9]+",
		"fix",
		"bug id=[0-9]+"
	};

	private static List<Pattern> fixingPatterns = new ArrayList<Pattern>();

	static {
		for (String s : BoaIntrinsics.fixingRegex)
			fixingPatterns.add(Pattern.compile(s));
	}

	/**
	 * Is a log message indicating it is a fixing revision?
	 * 
	 * @param log the revision's log message to mine
	 * @return true if the log indicates a fixing revision
	 */
	@FunctionSpec(name = "isfixingrevision", returnType = "bool", formalParameters = { "string" })
	public static boolean isfixingrevision(final String log) {
		for (Pattern p : fixingPatterns)
			if (p.matcher(log).matches())
				return true;

		return false;
	}
}
