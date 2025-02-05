import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class Frame1 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;   
    JTextField f1, f2;   
    JButton b1,b2;
    Frame1()
    {
    l1=new JLabel("Geethanjali College of Engineering and Technology");
    l1.setBounds(150,50,2000,70);   l1.setForeground(Color.BLUE.darker());
    l1.setFont(new Font("Calisto MT", Font.BOLD,50));
    l2=new JLabel("FACULTY PUBLICATIONS INTERFACE");   
    l2.setBounds(150,125,2000,70);   l2.setForeground(new Color(0, 200, 0));
    l2.setFont(new Font("Calisto MT", Font.BOLD,50));
    l3=new JLabel("U S E R N A M E :");   l3.setFont(new Font("Calisto MT", Font.BOLD ,30)); l3.setForeground(new Color(204, 102, 0));
    l4=new JLabel("P A S S W O R D :");   l4.setFont(new Font("Calisto MT",Font.BOLD ,30)); l4.setForeground(new Color(204, 102, 0));
    f1=new JTextField();   f2=new JTextField();
    b1=new JButton("LOGIN");    b2=new JButton("New User? REGISTER HERE.");
    setExtendedState(JFrame.MAXIMIZED_BOTH); 
    setLayout(null);
    l3.setBounds(150, 200, 450, 60);
    f1.setBounds(500, 215, 700, 30);
    l4.setBounds(150, 300, 450, 60);
    f2.setBounds(500, 315, 700, 30);
    b1.setBounds(500,400,700,40);
    b2.setBounds(500,450,700,40);
    add(l1); add(l2);
    add(l3); add(f1); add(l4); add(f2); 
    add(b1); b1.addActionListener(this);
    add(b2); b2.addActionListener(this);
    setVisible(true);
    getContentPane().setBackground(Color.WHITE);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent ae)
        {
            if(ae.getSource()==b1)
            {
        try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/21r11a0562","root", "MySql#2022");
                    PreparedStatement pst = cn.prepareStatement("SELECT* FROM LoginDetails WHERE username = ? AND password = ?");
                    pst.setString(1, f1.getText());
                    pst.setString(2, f2.getText());
                    ResultSet rs = pst.executeQuery(); int userId=-1;
                    if (rs.next()) {
                        userId = rs.getInt("user_id");
                            new F2(userId);
                                } else {
                                    JOptionPane.showMessageDialog(this,"Authentication failed!");
                                }
        pst.close(); rs.close(); cn.close();
                } 
        catch (Exception e) {
                    JOptionPane.showMessageDialog(this,e);
                }
    }
            else if(ae.getSource()==b2)
            {
                new F3(); //Registration window will open.
            }

        }
        public static void main(String args[])
        {
            new Frame1();
        }

}
class F2 extends javax.swing.JFrame 
{
    int id; int c=0;
public F2(int id) 
{
    this.id=id;
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea2.setEditable(false);
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Date From:");

        jLabel2.setText("Date To:");

        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setForeground(new java.awt.Color(0, 0, 255));
        jButton3.setText("Show All");

        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);

        jLabel3.setText("No. of publications:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(139, 139, 139))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(jTextField2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setText("WELCOME...");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Submit a new publication:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setText("Enter the date (YYYY-MM-DD): ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setForeground(new java.awt.Color(0, 102, 0));
        jButton5.setText("Submit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("Clear");

        jLabel8.setText("Enter title:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 757, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Your publications:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton4))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) //Show Button
    {                                         
        try{ 
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/21r11a0562","root","MySql#2022");
            PreparedStatement ptr=cn.prepareStatement("SELECT* FROM Publications WHERE user_id="+id+" AND date BETWEEN ? AND ?");
            PreparedStatement ptr2=cn.prepareStatement("SELECT COUNT(*) FROM Publications WHERE user_id="+id+" AND date BETWEEN ? AND ?");
            ptr.setString(1, jTextField1.getText());
			ptr.setString(2, jTextField2.getText());
            ptr2.setString(1, jTextField1.getText());
			ptr2.setString(2, jTextField2.getText());
             ResultSet rs,rs1;
             rs1=ptr2.executeQuery();
             int c=0;
             if(rs1.next())
             jTextField3.setText(rs1.getString(1));
             rs1.close();
             rs=ptr.executeQuery();
             while(rs.next())
            {
                if(c==0)
                {
                jTextArea2.setText(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3)); c++;
                }
                else
                {
                jTextArea2.setText(jTextArea2.getText()+"\n"+rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
                }
            }
            ptr.close(); rs.close(); cn.close();
        }
        catch(Exception s3)
    {
        JOptionPane.showMessageDialog(this,s3);
    }

    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) //Cancel Button
    {                                         
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextArea2.setText("");
        c=0;
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) //Show All Button
    {                                         
        try{ 
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/21r11a0562","root","MySql#2022");
            ResultSet rs,rs1; 
            String sql="SELECT* FROM Publications WHERE user_id="+id;
            String sql2="SELECT COUNT(*) FROM Publications WHERE user_id="+id;
            Statement st=cn.createStatement(); 
            rs1=st.executeQuery(sql2);
            if(rs1.next())
            jTextField3.setText(rs1.getString(1));
            rs1.close();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                if(c==0)
                {
                jTextArea2.setText(rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3)); c++;
                }
                else
                {
                jTextArea2.setText(jTextArea2.getText()+"\n"+rs.getString(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
                }
            }
            
            st.close(); rs.close(); cn.close();
        }
        catch(Exception s4)
    {
        JOptionPane.showMessageDialog(this,s4);
    }

    }              
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) //Logout Button
    {                                            
        new Frame1();    
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) //Submit Button 
    {                                         
        try{ 
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/21r11a0562","root","MySql#2022");
        PreparedStatement ptr=cn.prepareStatement("INSERT INTO Publications(title,p_text,date,user_id) VALUES(?,?,?,?)");
            ptr.setString(1, jTextField5.getText());
			ptr.setString(2, jTextArea1.getText());
			ptr.setString(3, jTextField4.getText());
            ptr.setInt(4,id);
            ptr.executeUpdate();
			cn.close();
			JOptionPane.showMessageDialog(this,"Successfully submitted. Thank you!");
    }
    catch(Exception s1)
    {
        JOptionPane.showMessageDialog(this,s1);
    }
    }                                        
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) //Clear Button 
    {                                         
        jTextArea1.setText("");
        jTextField5.setText("");
        jTextField4.setText("");
    }
    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) 
    {                                            

    }                                           
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration                   
}
class F3 extends JFrame implements ActionListener
{
    JButton b; JTextField f1,f2; JLabel l2,l3,l4;
	F3()
	{
		setLayout(null); setExtendedState(JFrame.MAXIMIZED_BOTH); setDefaultCloseOperation(EXIT_ON_CLOSE);
        l2=new JLabel("R E G I S T R A T I O N  F O R M");   
        l2.setBounds(150,125,2000,70);   l2.setForeground(Color.BLACK);
        l2.setFont(new Font("Calisto MT", Font.BOLD,50));
        l3=new JLabel("Set your username: ");   l3.setFont(new Font("Calisto MT", Font.BOLD ,30)); l3.setForeground(new Color(204, 102, 0));
        l4=new JLabel("Set your password:");   l4.setFont(new Font("Calisto MT",Font.BOLD ,30)); l4.setForeground(new Color(204, 102, 0));
        f1=new JTextField();   f2=new JTextField(); 
        b=new JButton("REGISTER");
        l3.setBounds(150, 200, 450, 60);
        f1.setBounds(500, 215, 700, 30);
        l4.setBounds(150, 300, 450, 60);
        f2.setBounds(500, 315, 700, 30);
        b.setBounds(500,400,700,40);
        b.addActionListener(this);
        add(b); add(f1); add(f2); add(l2); add(l3); add(l4);
        setVisible(true);
        getContentPane().setBackground(Color.LIGHT_GRAY);
}
	
public void actionPerformed(ActionEvent e) 
{
	if(e.getSource()==b) 
    {
		try {
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/21r11a0562","root","MySql#2022");
			System.out.println("Database connected.");
			PreparedStatement ptr=cn.prepareStatement("INSERT INTO LoginDetails(username,password) VALUES(?,?)");
            ptr.setString(1, f1.getText());
			ptr.setString(2, f2.getText());
            ptr.executeUpdate();
			cn.close();
			JOptionPane.showMessageDialog(this,"Successfully registered.");
		}
		catch(Exception ae) 
        {
            JOptionPane.showMessageDialog(this,ae);			
		}
	}
}
}

