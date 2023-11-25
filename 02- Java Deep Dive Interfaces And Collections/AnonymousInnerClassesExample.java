package com.example.javaInterfacesAndCollections;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousInnerClassesExample {
	
	    public static void main(String[] args) {
	    	
	        Button button = new Button("Click Me");
	        
	        button.addActionListener(new ActionListener() {
	        	
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.out.println("Button Clicked");
	            }
	        });
	    }
}


/*
 * Anonymous Inner Classes:
 * 
 * Anonymous inner classes are unnamed classes defined inside a method. They are
 * often used for event handling and interface implementation.
 */