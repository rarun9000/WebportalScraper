package jospehsportal;

import com.gargoylesoftware.htmlunit.html.HtmlPage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RK
 */
public class Menu extends javax.swing.JFrame {    /**
     * Creates new form Menu
     */
    static HtmlPage studview=null;
    static Portal prev=null;
    public Menu() {
        initComponents();
        //System.out.println("Menu: "+studview+"\n"+prev);
        try{
            name1.setText(studview.getElementById("tdName").asText());
            course1.setText(studview.getElementById("tdCourse").asText());
            dept1.setText(studview.getElementById("tdDept").asText());
            batch1.setText(studview.getElementById("tdBatch").asText());
            section1.setText(studview.getElementById("tdSection").asText());
            regno1.setText(studview.getElementById("cphBody_lblRegNo").asText());
            rollno1.setText(studview.getElementById("cphBody_lblRollNo").asText());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        notesmenu = new javax.swing.JLabel();
        attendance = new javax.swing.JLabel();
        attendance1 = new javax.swing.JLabel();
        marksmenu = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        couse = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        dept = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        batch = new javax.swing.JLabel();
        scetion = new javax.swing.JLabel();
        regno = new javax.swing.JLabel();
        course1 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        dept1 = new javax.swing.JLabel();
        rollno1 = new javax.swing.JLabel();
        batch1 = new javax.swing.JLabel();
        section1 = new javax.swing.JLabel();
        regno1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 63, 107));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(null);

        notesmenu.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        notesmenu.setForeground(new java.awt.Color(255, 255, 255));
        notesmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notesmenu.setText("Attendance");
        notesmenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(notesmenu);
        notesmenu.setBounds(0, 220, 150, 50);

        attendance.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        attendance.setForeground(new java.awt.Color(255, 255, 255));
        attendance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attendance.setText("Log out");
        attendance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendanceMouseClicked(evt);
            }
        });
        jPanel2.add(attendance);
        attendance.setBounds(40, 470, 68, 24);

        attendance1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        attendance1.setForeground(new java.awt.Color(255, 255, 255));
        attendance1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        attendance1.setText("Notes");
        attendance1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        attendance1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendance1MouseClicked(evt);
            }
        });
        jPanel2.add(attendance1);
        attendance1.setBounds(0, 280, 150, 50);

        marksmenu.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        marksmenu.setForeground(new java.awt.Color(255, 255, 255));
        marksmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        marksmenu.setText("Marks");
        marksmenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        marksmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marksmenuMouseClicked(evt);
            }
        });
        jPanel2.add(marksmenu);
        marksmenu.setBounds(0, 160, 150, 50);

        menu.setBackground(new java.awt.Color(0, 102, 204));
        menu.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(255, 255, 255));
        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setText("Menu ");
        menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        menu.setOpaque(true);
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        jPanel2.add(menu);
        menu.setBounds(0, 45, 148, 40);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 520));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(650, 440));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("St. Joseph's College Of Engineering");
        jPanel1.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 700, 50));

        title.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Student View");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 700, 30));

        bg.setBackground(new java.awt.Color(46, 186, 229));
        bg.setOpaque(true);
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 85));

        couse.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        couse.setText("Course            :");
        jPanel1.add(couse, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 100, 30));

        name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        name.setText("Student Name  :");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 110, 30));

        dept.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dept.setText("Dept               :");
        jPanel1.add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 100, 30));

        rollno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rollno.setText("Roll No            :");
        jPanel1.add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 100, 30));

        batch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        batch.setText("Batch               :");
        jPanel1.add(batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, 30));

        scetion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        scetion.setText("Section            :");
        jPanel1.add(scetion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 100, 30));

        regno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        regno.setText("Reg No            :");
        jPanel1.add(regno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 100, 30));

        course1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(course1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 160, 30));

        name1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 190, 30));

        dept1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(dept1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 160, 30));

        rollno1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(rollno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 160, 30));

        batch1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(batch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 160, 30));

        section1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(section1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 160, 30));

        regno1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(regno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 160, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("  General Data");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 700, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceMouseClicked
        Login l=new Login();
        l.p1=prev;
        l.check=true;
        l.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_attendanceMouseClicked

    private void marksmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marksmenuMouseClicked
        //navigate to marks gui
        Marks m=new Marks();
        m.p=prev;
        m.studview=studview;        
        m.welcome.setText("Welcome, "+ name1.getText());        
        m.setVisible(true);        
    }//GEN-LAST:event_marksmenuMouseClicked

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuMouseClicked

    private void attendance1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendance1MouseClicked
        Notes.p=prev;
        Notes.studp=studview;
        Notes n=new Notes();
        n.setVisible(true);
    }//GEN-LAST:event_attendance1MouseClicked

    /**
     * @param args the command line arguments
     */
    static Menu m=null;
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                m=new Menu();
                m.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attendance;
    private javax.swing.JLabel attendance1;
    private javax.swing.JLabel batch;
    private javax.swing.JLabel batch1;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel course1;
    private javax.swing.JLabel couse;
    private javax.swing.JLabel dept;
    private javax.swing.JLabel dept1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel marksmenu;
    private javax.swing.JLabel menu;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel notesmenu;
    private javax.swing.JLabel regno;
    private javax.swing.JLabel regno1;
    private javax.swing.JLabel rollno;
    private javax.swing.JLabel rollno1;
    private javax.swing.JLabel scetion;
    private javax.swing.JLabel section1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
