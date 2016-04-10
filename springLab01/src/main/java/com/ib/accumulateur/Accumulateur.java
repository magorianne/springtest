/**
 * 
 */
package com.ib.accumulateur;

/**
 * @author ib
 *
 */
public interface Accumulateur {
 void accumule(long value);
 
 long valeurActuelle();
 
}
