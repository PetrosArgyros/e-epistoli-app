
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre
*/
import java.awt.event.*;
import java.io.File;

import javax.swing.JFileChooser;

public class myListener2 implements ActionListener {
	public static String chooser1;
	 public void actionPerformed(ActionEvent event)
	    {
		 	JFileChooser chooser1= new JFileChooser();
		 	int returnVal = chooser1.showOpenDialog(chooser1);
		 	if (returnVal == JFileChooser.APPROVE_OPTION){
		 		
		 		File file1 = chooser1.getSelectedFile(); 
                Pdf.imagePath1 = file1.getAbsolutePath();
		 	}
	    }

}
