package com.Automation.Dragdrop;

public class TestDragDrop extends HandleDragdrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		invokeBrowser();
		System.out.println("------------------------------");
		runURL("https://jqueryui.com/droppable/");
		System.out.println("------------------------------");
		drapDropOperations();

	}

}
