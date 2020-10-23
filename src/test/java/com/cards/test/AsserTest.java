package com.cards.test;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.cards.models.Card;


public class AsserTest {
	
	@Test
	public void testHasActiveCards() {

		/* Data */
		
		List<Card> cards = Arrays.asList(
				new Card( "1111222233334441",false),
				new Card( "1111222233334442",false),
				new Card( "1111222233334443",false),
				new Card( "1111222233334444",false),
				new Card( "1111222233334445",false),
				new Card( "1111222233334446",false)
				);
	}
	
	/* Test */


}
