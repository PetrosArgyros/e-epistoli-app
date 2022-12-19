/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;

public class Pdf {
 
    public static String imagePath = "png.png";
    public static String imagePath1 = "version1.png";
    public void createPdf() throws IOException, DocumentException {
        
         Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("dd.MM.yyyy");
        
       Document document = new Document(PageSize.A4, 5, 5, 20, 20);
        BaseFont fonty1 = BaseFont.createFont("C:/Windows/Fonts/arial.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        fonty1.setSubset(true);
        
        BaseFont fonty2 = BaseFont.createFont("C:/Windows/Fonts/arialbd.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        fonty2.setSubset(true);
        
            JFileChooser dialog = new JFileChooser();
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
                String filePath = dialog.getSelectedFile().getPath()+ ".pdf";
                
        Font myfonty1 = new Font(fonty1, 12, Font.NORMAL);
        Font myfonty2 = new Font(fonty2, 14, Font.NORMAL);
        PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();
        
        //πρωτο κουμπι 
        
         Image img = Image.getInstance(imagePath);
         img.setAbsolutePosition(20f, 720f); // θεση στην α4
         img.scaleToFit(100, 100);            // μεγεθος εικονας
         document.add(img);
         
        Paragraph p02 = new Paragraph(Stoixeia.Name + " " + Stoixeia.subName, myfonty1);
        p02.setAlignment(Element.ALIGN_CENTER);
        document.add(p02);
        
       // Paragraph p03 = new Paragraph(Stoixeia.University, myfonty1);
        
       // p03.setAlignment(Element.ALIGN_CENTER);
        //document.add(p03);
        
        
        Paragraph p07 = new Paragraph(Stoixeia.Idiotita, myfonty1);
        p07.setAlignment(Element.ALIGN_CENTER);
        document.add(p07);
     
        
        Paragraph p05 = new Paragraph(Stoixeia.panepisthmio, myfonty1);
        p05.setAlignment(Element.ALIGN_CENTER);
        document.add(p05);
        
        
         Paragraph p06 = new Paragraph(Stoixeia.mail, myfonty1);
        p06.setAlignment(Element.ALIGN_CENTER);
        document.add(p06);
        
        Paragraph p0007 = new Paragraph(Stoixeia.tel, myfonty1);
        p0007.setAlignment(Element.ALIGN_CENTER);
        document.add(p0007);
        
        
        
        
        //hmerominia
        Paragraph p001 = new Paragraph(ft.format(dNow));
        p001.setAlignment(Element.ALIGN_RIGHT);
        document.add(p001);
        
        Paragraph p006 = new Paragraph("\n"
                + "\n"
               );
        
        
        
        document.add(p006);
        if(Stoixeia.fylo=="female"){ 
            Paragraph p1 = new Paragraph(Stoixeia.Stoixeia1 + "για την κα." + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp, myfonty2);
            document.add(p1);
                    if(Stoixeia.metaptixiakoidos2=="True"){
                        Paragraph p2 = new Paragraph("Η κα. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " ενδιαφέρεται " + Stoixeia.idos1 +" " + Stoixeia.Tmima + " στο πανεπιστήμιο " + Stoixeia.University , myfonty1);
                        document.add(p2);
                    }
                    else if(Stoixeia.ergasiaidos2=="True"){
                        Paragraph p2 = new Paragraph("Η κα. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " ενδιαφέρεται για " + Stoixeia.Thesh + " στο/στη " + Stoixeia.h_Ergasia , myfonty1);
                        document.add(p2);
                }
                    else if(Stoixeia.ypotrofiaidos2=="True"){
                        Paragraph p2 = new Paragraph("Η κα. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " ενδιαφέρεται " + Stoixeia.idos1 + " του ιδρύματος " + Stoixeia.Idryma , myfonty1);
                        document.add(p2);
                    }
        }
                
        
        
        else if(Stoixeia.fylo=="male"){ 
        Paragraph p1 = new Paragraph(Stoixeia.Stoixeia1 + "για τον κ. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp, myfonty2);
        document.add(p1);
        if(Stoixeia.metaptixiakoidos2=="True"){
                        Paragraph p2 = new Paragraph("Ο κος. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " ενδιαφέρεται " + Stoixeia.idos1 + " "+ Stoixeia.Tmima + " στο " + Stoixeia.University , myfonty1);
                        document.add(p2);
                    }
                    else if(Stoixeia.ergasiaidos2=="True"){
                     Paragraph p2 = new Paragraph("Ο κος. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " ενδιαφέρεται για " + Stoixeia.Thesh + " στο/στη " + Stoixeia.h_Ergasia , myfonty1);
                        document.add(p2);
                }
                    else if(Stoixeia.ypotrofiaidos2=="True"){
                        Paragraph p2 = new Paragraph("Ο κος. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " ενδιαφέρεται " + Stoixeia.idos1 + " του ιδρύματος " + Stoixeia.Idryma , myfonty1);
                        document.add(p2);
                    }
        
        }
        
        if(Stoixeia.fylo=="female"){ 
            if(Proptixiakes_Metaptixiakes.proptixiaki=="True"){
                
            if(Proptixiakes_Metaptixiakes.ekkremei1=="True"){
                    Paragraph p3 = new Paragraph("Είναι προπτυχιακή φοιτήτρια του πανεπιστημιου " + Proptixiakes_Metaptixiakes.panepistimio_1 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_1, myfonty1);
                        document.add(p3);
        }
            else if(Proptixiakes_Metaptixiakes.ekkremei1=="False"){
                    Paragraph p3 = new Paragraph("Είναι προπτυχιακή απόφοιτη του πανεπιστημιο " + Proptixiakes_Metaptixiakes.panepistimio_1 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_1, myfonty1);
                        document.add(p3);
        }
            }
            if(Proptixiakes_Metaptixiakes.metaptixiako1=="True"){
            if(Proptixiakes_Metaptixiakes.ekkremei2=="True"){
                    Paragraph p4 = new Paragraph("Είναι μεταπτυχιακή φοιτήτρια του πανεπιστημιο " + Proptixiakes_Metaptixiakes.panepistimio_2 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_2, myfonty1);
                        document.add(p4);
        }
            else if(Proptixiakes_Metaptixiakes.ekkremei2=="False"){
                    Paragraph p4 = new Paragraph("Είναι μεταπτυχιακή απόφοιτη του πανεπιστημιο " + Proptixiakes_Metaptixiakes.panepistimio_2 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_2, myfonty1);
                        document.add(p4);
        }
            }
            if(Proptixiakes_Metaptixiakes.metaptixiako2=="True"){
             if(Proptixiakes_Metaptixiakes.ekkremei3=="True"){
                    Paragraph p5 = new Paragraph("Είναι μεταπτυχιακή φοιτήτρια του πανεπιστημιο " + Proptixiakes_Metaptixiakes.panepistimio_3 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_3, myfonty1);
                        document.add(p5);
        }
            else if(Proptixiakes_Metaptixiakes.ekkremei3=="False"){
                    Paragraph p5 = new Paragraph("Είναι μεταπτυχιακή απόφοιτη του πανεπιστημιο " + Proptixiakes_Metaptixiakes.panepistimio_3 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_3, myfonty1);
                        document.add(p5);
        }
            }
            if(Proptixiakes_Metaptixiakes.ptixiaki=="True"){
              if(Proptixiakes_Metaptixiakes.ekkremei4=="True"){
                    Paragraph p6 = new Paragraph("Πραγματοποιεί στην παρούσα φάση την πτυχιακή της με θέμα " + Proptixiakes_Metaptixiakes.thema_1 + " τη χρονιά " + Proptixiakes_Metaptixiakes.year_1 +" με επιβλέποντα καθηγητή τον/την Κ. " +Proptixiakes_Metaptixiakes.epivlepon_kathigitis_1 , myfonty1);
                        document.add(p6);
        }
            else if(Proptixiakes_Metaptixiakes.ekkremei4=="False"){
                   Paragraph p6 = new Paragraph("Παρέδωσε την πτυχιακή της με θέμα " + Proptixiakes_Metaptixiakes.thema_1 + " τη χρονιά " + Proptixiakes_Metaptixiakes.year_1 +" με επιβλέποντα καθηγητή τον/την Κ. " +Proptixiakes_Metaptixiakes.epivlepon_kathigitis_1 , myfonty1);
                         document.add(p6);
        }
            }
            if(Proptixiakes_Metaptixiakes.didaktoriki=="True"){
               if(Proptixiakes_Metaptixiakes.ekkremei5=="True"){
                    Paragraph p7 = new Paragraph("Εκπονεί στην παρούσα φάση την Διδακτορική της διατριβή με θέμα " + Proptixiakes_Metaptixiakes.thema_2 + " τη χρονιά " + Proptixiakes_Metaptixiakes.year_2 +" με επιβλέποντα καθηγητή τον/την" +Proptixiakes_Metaptixiakes.epivlepon_kathigitis_2 , myfonty1);
                        document.add(p7);
        }
            else if(Proptixiakes_Metaptixiakes.ekkremei5=="False"){
                   Paragraph p7 = new Paragraph("Ολοκλήρωσε με επιτυχία την Διδακτορική της διατριβή με θέμα " + Proptixiakes_Metaptixiakes.thema_2 + " τη χρονιά " + Proptixiakes_Metaptixiakes.year_2 +" με επιβλέποντα καθηγητή τον/την Κ. " +Proptixiakes_Metaptixiakes.epivlepon_kathigitis_2 , myfonty1);
                         document.add(p7);
        }
            }
        
        }
        else if(Stoixeia.fylo=="male"){ 
            if(Proptixiakes_Metaptixiakes.ekkremei1=="True"){
                    Paragraph p3 = new Paragraph("Είναι προπτυχιακός φοιτητής του πανεπιστημιο " + Proptixiakes_Metaptixiakes.panepistimio_1 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_1, myfonty1);
                        document.add(p3);
        }
            else if(Proptixiakes_Metaptixiakes.ekkremei1=="False"){
                    Paragraph p3 = new Paragraph("Είναι προπτυχιακός απόφοιτός του πανεπιστημιο " + Proptixiakes_Metaptixiakes.panepistimio_1 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_1, myfonty1);
                        document.add(p3);
        }
            if(Proptixiakes_Metaptixiakes.ekkremei2=="True"){
                    Paragraph p4 = new Paragraph("Είναι μεταπτυχιακός φοιτητής του πανεπιστημιο " + Proptixiakes_Metaptixiakes.panepistimio_2 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_2, myfonty1);
                        document.add(p4);
        }
            else if(Proptixiakes_Metaptixiakes.ekkremei2=="False"){
                    Paragraph p4 = new Paragraph("Είναι μεταπτυχιακός απόφοιτός του πανεπιστημιο " + Proptixiakes_Metaptixiakes.panepistimio_2 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_2, myfonty1);
                        document.add(p4);
        }
             if(Proptixiakes_Metaptixiakes.ekkremei3=="True"){
                    Paragraph p5 = new Paragraph("Είναι μεταπτυχιακός φοιτητής του πανεπιστημιο " + Proptixiakes_Metaptixiakes.panepistimio_3 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_3, myfonty1);
                        document.add(p5);
        }
            else if(Proptixiakes_Metaptixiakes.ekkremei3=="False"){
                    Paragraph p5 = new Paragraph("Είναι μεταπτυχιακός απόφοιτός του πανεπιστημιο " + Proptixiakes_Metaptixiakes.panepistimio_3 + " στο τμήμα " + Proptixiakes_Metaptixiakes.tmima_3, myfonty1);
                        document.add(p5);
        }
              if(Proptixiakes_Metaptixiakes.ekkremei4=="True"){
                    Paragraph p6 = new Paragraph("Πραγματοποιεί στην παρούσα φάση την πτυχιακή του με θέμα " + Proptixiakes_Metaptixiakes.thema_1 + " τη χρονιά " + Proptixiakes_Metaptixiakes.year_1 +" με επιβλέποντα καθηγητή τον/την Κ. " +Proptixiakes_Metaptixiakes.epivlepon_kathigitis_1 , myfonty1);
                        document.add(p6);
        }
            else if(Proptixiakes_Metaptixiakes.ekkremei4=="False"){
                   Paragraph p6 = new Paragraph("Παρέδωσε την πτυχιακή του με θέμα " + Proptixiakes_Metaptixiakes.thema_1 + " τη χρονιά " + Proptixiakes_Metaptixiakes.year_1 +" με επιβλέποντα καθηγητή τον/την Κ. " +Proptixiakes_Metaptixiakes.epivlepon_kathigitis_1 , myfonty1);
                         document.add(p6);
        }
               if(Proptixiakes_Metaptixiakes.ekkremei5=="True"){
                    Paragraph p7 = new Paragraph("Εκπονεί στην παρούσα φάση την Διδακτορική του διατριβή με θέμα " + Proptixiakes_Metaptixiakes.thema_2 + " τη χρονιά " + Proptixiakes_Metaptixiakes.year_2 +" με επιβλέποντα καθηγητή τον/την" +Proptixiakes_Metaptixiakes.epivlepon_kathigitis_2 , myfonty1);
                        document.add(p7);
        }
            else if(Proptixiakes_Metaptixiakes.ekkremei5=="False"){
                   Paragraph p7 = new Paragraph("Ολοκλήρωσε με επιτυχία την Διδακτορική του διατριβή με θέμα " + Proptixiakes_Metaptixiakes.thema_2 + " τη χρονιά " + Proptixiakes_Metaptixiakes.year_2 +" με επιβλέποντα καθηγητή τον/την Κ. " +Proptixiakes_Metaptixiakes.epivlepon_kathigitis_2 , myfonty1);
                         document.add(p7);
        }
        
        }
        
        if(Stoixeia.fylo=="female"){ 
            if(Proyphresia_praktiki.proipiresia5 == "True"){
            Paragraph p8 = new Paragraph("Η κα. " + Stoixeia.subName_Yp + " έκανε την πρακτική της στο/στη  " + Proyphresia_praktiki.xoros_ergasias1 + " με ειδικότητα " + Proyphresia_praktiki.eidikotita1 + " τη χρονιά " + Proyphresia_praktiki.xronia1, myfonty1);
                         document.add(p8);
        }
            if(Proyphresia_praktiki.proipiresia5 == "True"){
            Paragraph p9 = new Paragraph("Η κα. " + Stoixeia.subName_Yp + " έχει προϋπηρεσία στο/στη " + Proyphresia_praktiki.xoros_ergasias2 + " με ειδικότητα " + Proyphresia_praktiki.eidikotita2 + " τη χρονιά " + Proyphresia_praktiki.xronia2, myfonty1);
                         document.add(p9);
        }
        }
        else if(Stoixeia.fylo=="male"){ 
            if(Proyphresia_praktiki.proipiresia5 == "True"){
            Paragraph p8 = new Paragraph("Ο κος. " + Stoixeia.subName_Yp + " έκανε την πρακτική του στο/στηc  " + Proyphresia_praktiki.xoros_ergasias1 + " με ειδικότητα " + Proyphresia_praktiki.eidikotita1 + " τη χρονιά " + Proyphresia_praktiki.xronia1, myfonty1);
                         document.add(p8);
        }
            if(Proyphresia_praktiki.proipiresia5 == "True"){
            Paragraph p9 = new Paragraph("Ο κος. " + Stoixeia.subName_Yp + " έχει προϋπηρεσία στο/στη " + Proyphresia_praktiki.xoros_ergasias2 + " με ειδικότητα " + Proyphresia_praktiki.eidikotita2 + " τη χρονιά " + Proyphresia_praktiki.xronia2, myfonty1);
                         document.add(p9);
        }
        }
        
        if(Agglika_Sunisto.Gnosi=="True" && Agglika_Sunisto.Epipedo=="True"){
            Paragraph p10 = new Paragraph(Agglika_Sunisto.Gnosi_Agglikon + " Επιπλέον γνωρίζει " + Agglika_Sunisto.Gnosi1 + " με " + Agglika_Sunisto.Epipedo1 + " επίπεδο γνώσεων." , myfonty1);
                         document.add(p10);
            }
        else {
            Paragraph p10 = new Paragraph(Agglika_Sunisto.Gnosi_Agglikon , myfonty1);
                         document.add(p10);
            }
       
        if(Stoixeia.Ergasia1=="True"){
            for(String checkbox : CheckBox_Ergasia.CheckBox_Ergasia){
        Paragraph p11 = new Paragraph(checkbox, myfonty1);
        document.add(p11);
        }
        }
         else{
        for(String checkbox : CheckBox_Ekpaideush.CheckBox_Ekpaideush){
        Paragraph p11 = new Paragraph(checkbox, myfonty1);
        document.add(p11);
        }
        }
        
        if(Stoixeia.fylo=="female"){ 
             if(Stoixeia.metaptixiakoidos2=="True"){
                        Paragraph p12 = new Paragraph("Κατα συνέπεια, " + Agglika_Sunisto.Sinisto +" την κα. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " για να παρακολουθήσει το μεταπτυχιακό  σας." , myfonty1);
                    document.add(p12);
                    }
                    else if(Stoixeia.ergasiaidos2=="True"){
                     Paragraph p12 = new Paragraph("Κατα συνέπεια, " + Agglika_Sunisto.Sinisto +" την κα. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " για να εργαστεί στην εταιρία σας." , myfonty1);
                    document.add(p12);
                }
                    else if(Stoixeia.ypotrofiaidos2=="True"){
                        Paragraph p12 = new Paragraph("Κατα συνέπεια, " + Agglika_Sunisto.Sinisto +" την κα. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " για να πάρει την υποτροφία." , myfonty1);
                        document.add(p12);
                    }
        }
        else if(Stoixeia.fylo=="male"){ 
             if(Stoixeia.metaptixiakoidos2=="True"){
                        Paragraph p12 = new Paragraph("Κατα συνέπεια, " + Agglika_Sunisto.Sinisto +" τον Κ. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " για να παρακολουθήσει το μεταπτυχιακό  σας." , myfonty1);
                    document.add(p12);
                    }
                    else if(Stoixeia.ergasiaidos2=="True"){
                     Paragraph p12 = new Paragraph("Κατα συνέπεια, " + Agglika_Sunisto.Sinisto +" τον Κ. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " για να εργαστεί στην εταιρία σας." , myfonty1);
                    document.add(p12);
                }
                    else if(Stoixeia.ypotrofiaidos2=="True"){
                        Paragraph p12 = new Paragraph("Κατα συνέπεια, " + Agglika_Sunisto.Sinisto +" τον Κ. " + Stoixeia.Name_Yp + " " + Stoixeia.subName_Yp + " για να πάρει την υποτροφία." , myfonty1);
                        document.add(p12);
                    }
        }
        Paragraph p007 = new Paragraph("\n"
                + "\n"
                + "\n"
                + "\n"
               );
        
        document.add(p007);
        Paragraph p13 = new Paragraph("Υπογραφή                " , myfonty1);
        p13.setAlignment(Element.ALIGN_RIGHT);
        document.add(p13);
        
         //δευτερο κουμπι 
         
          Image img1 = Image.getInstance(imagePath1);
          img1.scaleToFit(120, 120);           // μεγεθος εικονας
          img1.setAlignment(Element.ALIGN_RIGHT);
         document.add(img1);
        /*
                //***********καθηγητης
        Paragraph p1 = new Paragraph("Συντάκτης", myfonty);
        document.add(p1);
        
        Paragraph p2 = new Paragraph("Όνομα: " + Stoixeia.Name, myfonty);
        document.add(p2);
        
        Paragraph p3 = new Paragraph("Επώνυμο: " + Stoixeia.subName, myfonty);
        document.add(p3);
        
        Paragraph p4 = new Paragraph("Ιδιότητα: " + Stoixeia.Idiotita, myfonty);
        document.add(p4);
     
         Paragraph p5 = new Paragraph("Τηλέφωνο: " + Stoixeia.panepisthmio, myfonty);
        document.add(p5);
        
        Paragraph p281 = new Paragraph(Stoixeia.tel, myfonty);
        document.add(p281);
        
        Paragraph p282 = new Paragraph(Stoixeia.mail, myfonty);
        document.add(p282);

        */
        
        document.close();
    }
    }
}