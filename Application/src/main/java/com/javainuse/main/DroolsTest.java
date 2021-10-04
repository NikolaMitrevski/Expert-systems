package com.javainuse.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.javainuse.model.Bicikla;

public class DroolsTest {

	public static final void main(String[] args) {
		try {

			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rule");

			Bicikla bicikl = new Bicikla();
			
			FactHandle fact1;

			bicikl.setGuma_stanje("mekana");
			bicikl.setVentil_stanje("los");
			
			fact1 = kSession.insert(bicikl);
			kSession.fireAllRules();

			System.out.println("Rezultat: " + bicikl.getGuma_akcija2() + bicikl.getGuma_akcija1());

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
