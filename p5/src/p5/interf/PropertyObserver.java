/**
 * 
 */
package p5.interf;

/**
 * @author lucia
 *
 */
public interface PropertyObserver<V> {
	void propertyChanged(ObservableProperty<V> property, V oldValue);
}
