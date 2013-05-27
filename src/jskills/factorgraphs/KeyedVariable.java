// Generated by delombok at Mon May 27 20:39:51 CEST 2013
package jskills.factorgraphs;

public class KeyedVariable<TKey, TValue> extends Variable<TValue> {
	private final TKey key;
	
	public KeyedVariable(TKey key, TValue prior, String name, Object... args) {
		super(prior, name, args);
		this.key = key;
	}
	
	@java.lang.SuppressWarnings("all")
	public TKey getKey() {
		return this.key;
	}
}