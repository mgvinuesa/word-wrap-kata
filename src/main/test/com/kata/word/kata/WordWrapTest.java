package com.kata.word.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * TODO LIST
 * - Recortar por espacio
 * 		hola manuel,8 -> hola\nmanuel
 * 		hola morata manuel, 8 -> hola\nmorata\nmanuel
 * 
 * - Recortar palabra simple
 * 		hello,8 --> hello
 * 		francisco,3 -> fra\nnci\n...
 * 
 * - Recortar combinado
 * 		hello francisco, 3
 * 		hello\nfrancisco->hel\no\nfra\n\nci...
 *
 */
public class WordWrapTest {

	@Test
	public void no_divide_texto_menor_que_el_factor_de_division()
	{
		Wrapper wrapper = new Wrapper();
		assertEquals("hello", wrapper.wrap("hello", 8));  
	}
	
	@Test
	public void divide_texto_mayor_que_el_factor_de_division(){
		Wrapper wrapper = new Wrapper();
		assertEquals("helloman\nuel", wrapper.wrap("hellomanuel", 8));  
	}


	
	
}
