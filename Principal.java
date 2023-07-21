/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recherche;
import java.awt.Color;
import java.awt.Cursor;
import java.io.FileNotFoundException;
import java.io.IOException;
import static safar.application.stem_counter.Main.launchConsole;
import safar.util.normalization.impl.SAFARNormalizer;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextArea;
/**
 *
 * @author Nexsoft.tn
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    public Principal() {
        initComponents();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recherche dans des documents");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("تحسين");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setLabel("بحث");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Systeme Question Réponse Arab");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("Amelioration de recherche information  arab sur le web");
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String str=jTextField1.getText();
					 
	/////////////////•	debut Normalisation	//////////////////
						//Get SAFAR normalizer     
					        SAFARNormalizer normalizer = new SAFARNormalizer();
							
					        // Normalize the text
					        String normalizedText = normalizer.normalize(str, "ad", "$ x");
 /////////////////•	fin  Normalisation	//////////////////
///////////•	debut  Elimination des mots vides /////////////////////////
	        // Print the normalized text
	        System.out.println(normalizedText);
	        
	        String chaineASupprimer="ماهي";
	         
	        normalizedText = normalizedText.replace(chaineASupprimer, "");
	        String chaineASupprimer1="من";
	        normalizedText = normalizedText.replace(chaineASupprimer1, "");
	        String chaineASupprimer3="ما";
	        normalizedText = normalizedText.replace(chaineASupprimer3, "");
	        String chaineASupprimer4="ماهو";
	        normalizedText = normalizedText.replace(chaineASupprimer4, "");
	        String chaineASupprimer5="هو";
	        normalizedText = normalizedText.replace(chaineASupprimer5, "");
                
	        System.out.println(normalizedText);                  
		jTextField1.setText(normalizedText);
 ///////////•	Fin   Elimination des mots vides ///////////////////////////////////////////////////////                                               
/////////////////////////•	l’extraction de ressource PN/////////////////////////////////////                                           
                                                
                String[] tab = normalizedText.split(" ");
	        int lenght = tab.length;
	        System.out.println("Premier mot ["+tab[0]+"]\n Dernier mot ["+tab[lenght-1]+"]\n nombre de mots ["+lenght+"]\n");  
	                                           
/////////////////////////•Fin	l’extraction de ressource PN/////////////////////////////////////                                           
                      jTextField1.setText(""+tab[lenght-1]+"");                         
                                                
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////                                               
                                                
					
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    File repertoire=new File("E:/doc/");
    final String liste[] = repertoire.list(); 
			 		
		 int nb=0;
                 String ch="";
                 //float score=0;
			 
					  if (liste != null) { 
						   
						  
						  
						  
						  
				            for (int i = 0; i < liste.length; i++) {
                                                try {
                                                    // System.out.println(liste[i]);
                                                    
                                                    
                                                    
                                                    File file = new File("E:/doc/"+liste[i]);
                                                  
       String[] words = null;  
    // Créer l'objet File Reader
     double nbmot=0;
    FileReader fr = new FileReader(file);
    // Créer l'objet BufferedReader  
    BufferedReader br = new BufferedReader(fr);  
    String str;     
    // Mot à rechercher
       String search= jTextField1.getText();
    // Initialise le compteur de mots à zéro
    double count = 0;    
    
     
    
    
    
    
    
                                                    try {
                                                        while((str = br.readLine()) != null)
                                                        {
                                                            
                                                            // Divisez le mot en utilisant l'espace
                                                            //calcul nombre de mot dans file
                                                             words = str.split(" ");
                                                             nbmot = nbmot + words.length; 
                                                            // System.out.println(nbmot);
                                                            //tester l existance du mot
                                                            for (String word : words)
                                                            {
                                                                //Chercher le mot
                                                                if (word.equals(search))
                                                                {
                                                                    // Si présent, incrémenter le nombre
                                                                    count++;
                                                                     
                                                                }
                                                            }
                                                        }                                               } catch (IOException ex) {
                                                        Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
             
                                                        
                                                        }
                                                    //affichr resultat
    if(count!=0) 
    {
      //////////////////////////calcul scrore////////////////////////
      //double score=Math.log(count/nbmot);
         double score=(count/nbmot);   
         System.out.println(score);
      ch+=("Le mot" + search +"est présent "+ count + "fois dans le fichier"+liste[i]+"avec Score"+score+"\n");
    }
    else
    {
      System.out.println("Le mot ne se trouve pas dans le fichier!");
    } 
    fr.close();
   }                                            catch (IOException ex) {
                                                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                                }  


				            // resultat = "Nombre d'occurence: "+count + ":nles index des  occurences: " + resultat; 
                                           //  ch="Le mot     "+str+"   se trouve dans:::E:/doc/"+liste[i]+"avec nombre d'occurence "+nb+"";
                                             
				     jTextArea1.append(ch);
                                       jTextArea1.append("*****************************************************************************");
                                      
                                     jTextArea1.setLineWrap(true); 
                                   
				                
				                
				                
				                
				            }
				         
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}