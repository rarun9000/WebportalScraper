/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jospehsportal;

import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.awt.Color;
import static java.lang.System.exit;

/**
 *
 * @author RK
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Portal p1=new Portal();
    boolean check=p1.checkserver();
    public Login() {
        initComponents();
        //tocheck if the serveer is up or down
        
        if(check){
            error.setText("Server is Up :)");
        }
        else{
            loginbtn.setEnabled(false);
            error.setText("Server unavailable. please try again later");
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

        background = new javax.swing.JPanel();
        stjoseph = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        headingbackground = new javax.swing.JLabel();
        enterusername = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        userlogintext = new javax.swing.JLabel();
        enterpassword = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        showhide = new javax.swing.JButton();
        loginbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(645, 491));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stjoseph.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        stjoseph.setForeground(new java.awt.Color(255, 255, 255));
        stjoseph.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stjoseph.setText("St. Joseph's College Of Engineering");
        background.add(stjoseph, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 40));

        heading.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("Student Information Portal");
        heading.setToolTipText("");
        background.add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 680, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXIT");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 60, 30));

        headingbackground.setBackground(new java.awt.Color(0, 90, 140));
        headingbackground.setForeground(new java.awt.Color(79, 145, 224));
        headingbackground.setOpaque(true);
        background.add(headingbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 110));

        enterusername.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        enterusername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        enterusername.setText("Enter Username :");
        background.add(enterusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 150, -1));

        username.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        background.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 230, 30));

        userlogintext.setBackground(new java.awt.Color(74, 182, 240));
        userlogintext.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        userlogintext.setForeground(new java.awt.Color(255, 255, 255));
        userlogintext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userlogintext.setText("User Login");
        userlogintext.setOpaque(true);
        background.add(userlogintext, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 123, 404, 30));

        enterpassword.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        enterpassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        enterpassword.setText("Enter Password :");
        background.add(enterpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 150, -1));

        password.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        background.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 230, 30));

        loginbtn.setBackground(new java.awt.Color(74, 92, 111));
        loginbtn.setFont(new java.awt.Font("Book Antiqua", 1, 20)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        background.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 90, 30));

        error.setFont(new java.awt.Font("Book Antiqua", 0, 16)); // NOI18N
        error.setForeground(new java.awt.Color(253, 14, 38));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error.setText("*Enter valid Username or password");
        background.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 410, -1));

        showhide.setBackground(new java.awt.Color(0, 75, 225));
        showhide.setFont(new java.awt.Font("Book Antiqua", 1, 12)); // NOI18N
        showhide.setForeground(new java.awt.Color(255, 255, 255));
        showhide.setText("show");
        showhide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showhideActionPerformed(evt);
            }
        });
        background.add(showhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 70, 23));

        loginbg.setBackground(new java.awt.Color(255, 255, 255));
        loginbg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        loginbg.setOpaque(true);
        background.add(loginbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 410, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showhideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showhideActionPerformed
        String var=showhide.getText();
        if(var.equals("show")){
            showhide.setText("hide");
            password.setEchoChar((char)0);
        }
        else{
            showhide.setText("show");
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showhideActionPerformed
    
    static HtmlPage studentview=null;
    static Portal p=new Portal();
    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        String un=username.getText().trim();
        String pass=password.getText().trim();
        
        if(un.equals("") || pass.equals("")){
            error.setText("Enter valid username and password");
        }
        else{
            //boolean check=p.checklogin(username.getText(),password.getText());
            boolean check=p.checklogin(un,pass);
            if(!check){
                error.setText("username or password is incorrect");
            }
            else{
                //nextpage
                
                p=new Portal(un,pass);
               // System.out.println("login: " +p);
                studentview=p.login();
                Menu.studview=studentview;
                Menu.prev=p;
                Menu menu=new Menu();                  
                this.dispose();                
                menu.setVisible(true);
            }
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
         username.setText(username.getText().toUpperCase());
    }//GEN-LAST:event_usernameKeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setOpaque(true);
        jLabel1.setForeground(Color.black);
        jLabel1.setBackground(new Color(74,182,240));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setOpaque(false);
        jLabel1.setForeground(Color.white);
        jLabel1.setBackground(new Color(0,90,140));
    }//GEN-LAST:event_jLabel1MouseExited

    /**
     * @param args the command line arguments
     */
    static Login login=null;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 login=new Login();
                login.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel enterpassword;
    private javax.swing.JLabel enterusername;
    public static javax.swing.JLabel error;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel headingbackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginbg;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton showhide;
    private javax.swing.JLabel stjoseph;
    private javax.swing.JLabel userlogintext;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
