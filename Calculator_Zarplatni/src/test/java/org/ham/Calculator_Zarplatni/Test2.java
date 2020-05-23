
package org.ham.Calculator_Zarplatni;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {

	@Test
	public void test2() throws Exception {
		ButtonEventListener prw = new ButtonEventListener();
		CalculGUI RTV = new CalculGUI(); //создание объекта класса CalculGUI
		RTV.setVisible(true);
		CalculGUI.input1.setText("4"); //задаем значение первого поля 
		CalculGUI.input2.setText("15000"); //задаем значение второго поля 
		CalculGUI.input3.setText("0"); //задаем значение третьего поля 
		CalculGUI.input4.setText("8"); //задаем значение четвертого поля 
		RTV.button.doClick(); //нажимаем кнопку "Выполнить расчет"
		String result = CalculGUI.input5.getText(); 
		
		assertEquals("7500.0",result); // сравнение полученного результата и ожидаемого значения
	}

}