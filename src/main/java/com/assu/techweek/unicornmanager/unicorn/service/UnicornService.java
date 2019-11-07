/**
 * 
 */
package com.assu.techweek.unicornmanager.unicorn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.assu.techweek.unicornmanager.unicorn.model.Unicorn;

/**
 * @author x738235
 *
 */
@Service
public class UnicornService {

	
	
	public List<Unicorn> getAllUnicorns()
	{
		final List<Unicorn> liste = new ArrayList<Unicorn>();
		
		Unicorn uni1 = new Unicorn();
		uni1.setAge(12);
		uni1.setCouleur("rose");
		uni1.setId(1);
		uni1.setNom("Licorne rose");
		
		liste.add(uni1);
		
		return liste;
		
	}
	
	
}
