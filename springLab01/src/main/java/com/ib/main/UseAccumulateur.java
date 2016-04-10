package com.ib.main;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ib.accumulateur.Accumulateur;

public class UseAccumulateur {

	private static Logger log = LoggerFactory.getLogger(UseAccumulateur.class);
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/com/ib/accumulateur/AccumulateurApplicationContext.xml");
		log.info("------------------------------------- Singleton ----------------------------");
		Accumulateur accumulateur = applicationContext.getBean("accumulateur", Accumulateur.class);
		accumulateur.accumule(23);
		accumulateur.accumule(27);
		applicationContext.getBean("accumulateur", Accumulateur.class).accumule(45);
		log.info("Valeur finale  {}", accumulateur.valeurActuelle());//resultat = 95
		
		log.info("------------------------------------- Prototype ----------------------------");
		Accumulateur accumulateurPrototype = applicationContext.getBean("accumulateurProto", Accumulateur.class);
		accumulateurPrototype.accumule(18);
		accumulateurPrototype.accumule(5);
		applicationContext.getBean("accumulateurProto", Accumulateur.class).accumule(45);
		log.info("Valeur finale  {}", accumulateurPrototype.valeurActuelle());//resultat = 23, la ligne precedente pas prise en compte car nouvelle instance
	}

}
