/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
import java.awt.event.*;

import javax.swing.JFileChooser;

public class myListener implements ActionListener {
	public static String chooser;
	 public void actionPerformed(ActionEvent event)
	    {
		 	JFileChooser chooser= new JFileChooser();
		 	int returnVal = chooser.showOpenDialog(chooser);
		 	if (returnVal == JFileChooser.APPROVE_OPTION){
		 		
		 		chooser.getSelectedFile().getName(); 
		 	}
	    }

}
*/

import java.awt.event.*;
import java.io.File;

import javax.swing.JFileChooser;

public class myListener implements ActionListener {
	public static String chooser;
	 public void actionPerformed(ActionEvent event)
	    {
		 	JFileChooser chooser= new JFileChooser();
		 	int returnVal = chooser.showOpenDialog(chooser);
		 	if (returnVal == JFileChooser.APPROVE_OPTION){
		 		
		 		File file = chooser.getSelectedFile(); 
                Pdf.imagePath = file.getAbsolutePath();
		 	}
	    }

}
