package com.pega.Session8.ThrowandThrows;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import org.openqa.selenium.ElementNotSelectableException;

public class ComposeEmailTest {

	public static void main(String[] args)  {

		//deliberately throw an error
		//throw new Exception ("Some error");

		//throws -2 types of exceptions one is checked and other unchecked

	/*	String[] x=new String[2];
		x[0]="Boston";
		x[1]="Cambridge";
		//x[2]="Belmont";*/


		/*try {
			Thread.sleep (5000);
		} catch (InterruptedException e) {
			e.printStackTrace ( );
		}*/
		try {
			delay ();
		} catch (InterruptedException e) {
			e.printStackTrace ( );
		}catch(ElementNotSelectableException e){}
		catch(ElementNotFoundException e){

		}

	}

	public static void delay() throws InterruptedException {
		Thread.sleep (5000);
	}



}
