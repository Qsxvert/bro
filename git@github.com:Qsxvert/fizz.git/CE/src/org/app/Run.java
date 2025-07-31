package org.app;

import org.particles.Bozon;
import org.particles.Lepton;

public class Run {
	
	public static void main(String[] args) {
		
		Bozon[] higgs = new Bozon[9];
		
		Lepton[] electron = new Lepton[9];
		
		for (int i = 0; i < 9; i++) {
			electron[i] = new Lepton();
			electron[i].setDirection((float)Math.random());
			System.out.println(electron[i].getDirection());
		}
	}

}
