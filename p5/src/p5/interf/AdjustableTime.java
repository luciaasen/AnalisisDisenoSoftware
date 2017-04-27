/**
 * 
 */
package p5.interf;

import p5.exc.IllegalArgumentException;

/**
 * @author lucia
 *
 */
public interface AdjustableTime extends ObservableProperty<Integer>{
		void incrementTime(int inc) throws IllegalArgumentException;
}
