
package Database;


public class Loading_Form extends javax.swing.JFrame {

   
    public Loading_Form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        percentage = new javax.swing.JLabel();
        Myprogress = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setLayout(null);

        percentage.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 1, 24)); // NOI18N
        percentage.setForeground(new java.awt.Color(255, 255, 255));
        percentage.setText("%");
        jPanel1.add(percentage);
        percentage.setBounds(280, 265, 50, 50);
        jPanel1.add(Myprogress);
        Myprogress.setBounds(0, 310, 600, 20);

        jLabel2.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("School Management System");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 20, 360, 45);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\school-removebg-preview.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 100, 240, 130);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 330);

        setSize(new java.awt.Dimension(592, 324));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
        Loading_Form myloading = new Loading_Form();
        myloading.setVisible(true);
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(50);
                myloading.Myprogress.setValue(i);
                myloading.percentage.setText(Integer.toString(i)+"%    ");
            }
            
        } catch (Exception e) 
        {
            
        }
        Student_Form1 form2 = new Student_Form1();
        form2.show();
        myloading.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Myprogress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel percentage;
    // End of variables declaration//GEN-END:variables
}
