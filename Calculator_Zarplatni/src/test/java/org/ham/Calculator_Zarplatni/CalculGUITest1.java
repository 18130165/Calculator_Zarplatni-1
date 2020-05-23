package org.ham.Calculator_Zarplatni;//указываем, в каком пакете находится класс

import static org.junit.Assert.assertEquals;
import org.junit.*;
import org.ham.Calculator_Zarplatni.ButtonEventListener;
import org.ham.Calculator_Zarplatni.CalculGUI;
import org.junit.Test;

class CalculGUITestTest1 {

	@Test
	public void testGUI2() throws Exception {
		ButtonEventListener prw = new ButtonEventListener();
		CalculGUI RTV = new CalculGUI(); //создание объекта класса CalculGUI
		RTV.setVisible(true);
		CalculGUI.input1.setText("20"); //задаем значение первого поля 
		CalculGUI.input2.setText("20000"); //задаем значение второго поля 
		CalculGUI.input3.setText("15000"); //задаем значение третьего поля 
		CalculGUI.input4.setText("20"); //задаем значение четвертого поля 
		
		RTV.button.doClick(); //нажимаем кнопку "Выполнить расчет"
		String result = CalculGUI.input5.getText(); 
		
		assertEquals("35000.0",result); // сравнение полученного результата и ожидаемого значения
	}

}