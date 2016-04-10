/**
 * 
 */
package com.ib.accumulateur.impl;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ib.accumulateur.Accumulateur;
import com.ib.accumulateur.Calculatrice;

/**
 * @author ib
 *
 */
public class AccumulateurImpl implements Accumulateur {

	private Logger log = LoggerFactory.getLogger(getClass());
	private Calculatrice calculatrice;
	private long currentValue = 0;
	/***
	 * Methode pour injecter le collaborateur
	 * @param calculatrice
	 */
	public void setCalculatrice(Calculatrice calculatrice) {
		this.calculatrice = calculatrice;
	}
	/* (non-Javadoc)
	 * @see com.ib.accumulateur.Accumulateur#accumule(long)
	 */
	@Override
	public void accumule(long value) {
		currentValue = calculatrice.add(currentValue, value);
	}

	/* (non-Javadoc)
	 * @see com.ib.accumulateur.Accumulateur#valeurActuelle()
	 */
	@Override
	public long valeurActuelle() {
		// TODO Auto-generated method stub
		return currentValue;
	}
	@PostConstruct
	public void initValeur(){
		log.info("Init de la classe AccumulateurImpl");
	}

}
