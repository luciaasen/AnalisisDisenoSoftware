/**
 * 
 */
package p5.interf;

/**
 * @author lucia
 *
 */

// Used by the Observed to notify the observers the Observed property has changed
public interface PropertyObserver<V> {
	void propertyChanged(ObservableProperty<V> property, V oldValue);
}
