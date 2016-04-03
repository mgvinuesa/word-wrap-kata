package com.kata.word.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
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

	private Wrapper wrapper;
	
	@Before
	public void setUp(){
		this.wrapper = new Wrapper();
	}
	
	@Test
	public void no_divide_texto_menor_que_el_factor_de_division(){
		assertEquals("hello", wrapper.wrap("hello", 8));  
	}
	
	@Test
	public void divide_texto_mayor_que_el_factor_de_division(){
		assertEquals("helloman\nuel", wrapper.wrap("hellomanuel", 8));  
	}
	
	@Test
	public void no_divide_texto_con_palabras_menor_que_el_factor_de_division(){
		assertEquals("hi boy", wrapper.wrap("hi boy", 8));  
	}

	@Test
	public void divide_texto_con_palabras_mayor_que_el_factor_de_division(){
		assertEquals("hello\nboy", wrapper.wrap("hello boy", 5));  
	}


	
	
}
