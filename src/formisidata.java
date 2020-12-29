import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class formisidata extends javax.swing.JFrame {

    koneksi con=new koneksi();
    private String file;
   
    
    public formisidata() {
        initComponents();
      
    }
    
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbuktiIjazah = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblnama = new javax.swing.JLabel();
        lblTTL = new javax.swing.JLabel();
        lblJK = new javax.swing.JLabel();
        lblanakKe = new javax.swing.JLabel();
        lblagama = new javax.swing.JLabel();
        lblJsodara = new javax.swing.JLabel();
        lblgolDarah = new javax.swing.JLabel();
        lblalamat = new javax.swing.JLabel();
        lbltahunLulus = new javax.swing.JLabel();
        lblasalSekolah = new javax.swing.JLabel();
        lbldaraDiri = new javax.swing.JLabel();
        nohp = new javax.swing.JTextField();
        kd_siswa = new javax.swing.JTextField();
        agama = new javax.swing.JComboBox<>();
        jumsaudara = new javax.swing.JTextField();
        tgllahir = new javax.swing.JTextField();
        asalsek = new javax.swing.JTextField();
        tahunsek = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        lblFoto = new javax.swing.JLabel();
        goldarah = new javax.swing.JComboBox<>();
        jk = new javax.swing.JComboBox<>();
        btnBrowseFile2 = new javax.swing.JButton();
        btnBrowseFile = new javax.swing.JButton();
        ijazah = new javax.swing.JTextField();
        foto = new javax.swing.JTextField();
        btnselesai = new javax.swing.JButton();
        cek = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        lblnama1 = new javax.swing.JLabel();
        anakke = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblFoto1 = new javax.swing.JLabel();
        lbltahunLulus1 = new javax.swing.JLabel();
        lbltahunLulus2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        lblbuktiIjazah.setForeground(new java.awt.Color(255, 255, 255));
        lblbuktiIjazah.setText("B. Bukti Ijazah");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnama.setForeground(new java.awt.Color(255, 255, 255));
        lblnama.setText("1. Kd_Siswa");
        jPanel2.add(lblnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 25));

        lblTTL.setForeground(new java.awt.Color(255, 255, 255));
        lblTTL.setText("3. Tanggal Lahir");
        jPanel2.add(lblTTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, 25));

        lblJK.setForeground(new java.awt.Color(255, 255, 255));
        lblJK.setText("2. Jenis Kelamin");
        jPanel2.add(lblJK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 25));

        lblanakKe.setForeground(new java.awt.Color(255, 255, 255));
        lblanakKe.setText("5. Anak Ke");
        jPanel2.add(lblanakKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 25));

        lblagama.setForeground(new java.awt.Color(255, 255, 255));
        lblagama.setText("4. Agama");
        jPanel2.add(lblagama, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 25));

        lblJsodara.setForeground(new java.awt.Color(255, 255, 255));
        lblJsodara.setText("6. Jumlah Bersaudara");
        jPanel2.add(lblJsodara, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 25));

        lblgolDarah.setForeground(new java.awt.Color(255, 255, 255));
        lblgolDarah.setText("9. Gol. Darah");
        jPanel2.add(lblgolDarah, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 25));

        lblalamat.setForeground(new java.awt.Color(255, 255, 255));
        lblalamat.setText("8. Alamat");
        jPanel2.add(lblalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 25));

        lbltahunLulus.setForeground(new java.awt.Color(255, 255, 255));
        lbltahunLulus.setText("13. Foto");
        jPanel2.add(lbltahunLulus, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 100, 25));

        lblasalSekolah.setForeground(new java.awt.Color(255, 255, 255));
        lblasalSekolah.setText("10. Asal Sekolah");
        jPanel2.add(lblasalSekolah, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 100, 25));

        lbldaraDiri.setForeground(new java.awt.Color(255, 255, 255));
        lbldaraDiri.setText("A. Data Diri");
        jPanel2.add(lbldaraDiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 69, -1));
        jPanel2.add(nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 142, -1));
        jPanel2.add(kd_siswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 52, -1));

        agama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Hindu", "Budha" }));
        agama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agamaActionPerformed(evt);
            }
        });
        jPanel2.add(agama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));
        jPanel2.add(jumsaudara, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 52, -1));
        jPanel2.add(tgllahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 142, -1));
        jPanel2.add(asalsek, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 142, -1));
        jPanel2.add(tahunsek, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 142, -1));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel2.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 142, -1));

        lblFoto.setForeground(new java.awt.Color(255, 255, 255));
        lblFoto.setText("B.Ijazah ");
        jPanel2.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, 20));

        goldarah.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O", " " }));
        goldarah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goldarahActionPerformed(evt);
            }
        });
        jPanel2.add(goldarah, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 50, 20));

        jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan", " " }));
        jPanel2.add(jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, -1));

        btnBrowseFile2.setText("Browse File");
        btnBrowseFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseFile2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnBrowseFile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 100, 20));

        btnBrowseFile.setText("Browse File");
        btnBrowseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseFileActionPerformed(evt);
            }
        });
        jPanel2.add(btnBrowseFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 100, 20));
        jPanel2.add(ijazah, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 140, -1));
        jPanel2.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 140, 20));

        btnselesai.setText("Back");
        btnselesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselesaiActionPerformed(evt);
            }
        });
        jPanel2.add(btnselesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        cek.setText("Selesai");
        cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekActionPerformed(evt);
            }
        });
        jPanel2.add(cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("7. No.Hp");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));
        jPanel2.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 142, -1));

        lblnama1.setForeground(new java.awt.Color(255, 255, 255));
        lblnama1.setText("1. Nama Lengkap ");
        jPanel2.add(lblnama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 25));
        jPanel2.add(anakke, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 52, -1));

        jLabel7.setMaximumSize(new java.awt.Dimension(20, 10));
        jLabel7.setMinimumSize(new java.awt.Dimension(10, 5));
        jLabel7.setPreferredSize(new java.awt.Dimension(10, 5));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 130, 130));

        lblFoto1.setForeground(new java.awt.Color(255, 255, 255));
        lblFoto1.setText("C. Foto");
        jPanel2.add(lblFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, -1, 20));

        lbltahunLulus1.setForeground(new java.awt.Color(255, 255, 255));
        lbltahunLulus1.setText("11. Tahun Lulus");
        jPanel2.add(lbltahunLulus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 100, 25));

        lbltahunLulus2.setForeground(new java.awt.Color(255, 255, 255));
        lbltahunLulus2.setText("12. Ijazah");
        jPanel2.add(lbltahunLulus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 100, 25));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 130, 130));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 890, 440));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 0, 28, 67));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Form Pengisisan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 0, 232, -1));

        jLabel3.setFont(new java.awt.Font("Bodoni MT Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Biodata Calon Siswa Baru");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 36));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sketch.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 90, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agamaActionPerformed
        
    }//GEN-LAST:event_agamaActionPerformed

    private void btnselesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselesaiActionPerformed
        pengisisandata u = new pengisisandata();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnselesaiActionPerformed

    private void btnBrowseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseFileActionPerformed

        
        jFileChooser1.setSelectedFile(null);
        jFileChooser1.showOpenDialog(this);
        file=jFileChooser1.getSelectedFile().toString();
        file=file.replace('\\', '/');
        ijazah.setText(file);
        
        ImageIcon icon = new ImageIcon(new ImageIcon(file).getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH));
        jLabel7.setIcon(icon);
        
        
    }//GEN-LAST:event_btnBrowseFileActionPerformed

    private void cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekActionPerformed
     int pil=0;
     int pil2=0;
     int pil3=0;
     String jeniskelamin="",agamaa="", goldarahh="";
     try{
         pil=jk.getSelectedIndex();
         if(pil==1){
             jeniskelamin="Laki-Laki";
             
         }else if (pil==2){
             
             jeniskelamin="Perempuan";
         }
         
         if(pil2==1){
             agamaa="Islam";
         }else if (pil2==2){
             
             agamaa="Kristen";
                
         } else if (pil2==3){
             
             agamaa="Hindu";
         }else if (pil2==4){
             
             agamaa="Buddha";
         }
         
         
         if(pil3==1){
             goldarahh="A";
             
             
         }else if (pil3==2){
             goldarahh="B";
             
             
         }else if (pil3==3){
             
             goldarahh="AB";
             
         }else if(pil3==4){
              goldarahh="O";
             
         }
  
         con.setkoneksi();
         String sql="insert into tbl_datasiswa values('"+kd_siswa.getText()+"','"+nama.getText()+"','"+jk.getSelectedItem().toString()+"','"+tgllahir.getText()+"','"+agama.getSelectedItem().toString()+"','"
                 +anakke.getText()+"','"+jumsaudara.getText()+"','"+nohp.getText()+"','"+alamat.getText()+"','"+goldarah.getSelectedItem().toString()+"','"
                 +asalsek.getText()+"','"+tahunsek.getText()+"','"+ijazah.getText()+"','"+foto.getText()+"')";
         con.st.executeUpdate(sql);
         JOptionPane.showMessageDialog(null, "Data Berhasil di simpan","Koneksi Sukses",JOptionPane.INFORMATION_MESSAGE);
         JOptionPane.showMessageDialog(null, "Silahkan ke menu Data Siswa","Koneksi Sukses",JOptionPane.INFORMATION_MESSAGE);
         new pengisisandata().show();
         this.dispose();
              
     }catch (Exception e){
         
         JOptionPane.showMessageDialog(null,"Data Gagal tersimpan" ,"Informasi",JOptionPane.INFORMATION_MESSAGE);
        
     }   
        
     
      
    }//GEN-LAST:event_cekActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void btnBrowseFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseFile2ActionPerformed
        // TODO add your handling code here:
        jFileChooser2.setSelectedFile(null);
        jFileChooser2.showOpenDialog(this);
        file=jFileChooser2.getSelectedFile().toString();
        file=file.replace('\\', '/');
        foto.setText(file);
        
        ImageIcon icon = new ImageIcon(new ImageIcon(file).getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH));
        jLabel8.setIcon(icon);
    }//GEN-LAST:event_btnBrowseFile2ActionPerformed

    private void goldarahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goldarahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goldarahActionPerformed

 
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(formisidata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formisidata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formisidata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formisidata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formisidata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> agama;
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField anakke;
    private javax.swing.JTextField asalsek;
    private javax.swing.JButton btnBrowseFile;
    private javax.swing.JButton btnBrowseFile2;
    private javax.swing.JButton btnselesai;
    private javax.swing.JButton cek;
    private javax.swing.JTextField foto;
    private javax.swing.JComboBox<String> goldarah;
    private javax.swing.JTextField ijazah;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jk;
    private javax.swing.JTextField jumsaudara;
    private javax.swing.JTextField kd_siswa;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblFoto1;
    private javax.swing.JLabel lblJK;
    private javax.swing.JLabel lblJsodara;
    private javax.swing.JLabel lblTTL;
    private javax.swing.JLabel lblagama;
    private javax.swing.JLabel lblalamat;
    private javax.swing.JLabel lblanakKe;
    private javax.swing.JLabel lblasalSekolah;
    private javax.swing.JLabel lblbuktiIjazah;
    private javax.swing.JLabel lbldaraDiri;
    private javax.swing.JLabel lblgolDarah;
    private javax.swing.JLabel lblnama;
    private javax.swing.JLabel lblnama1;
    private javax.swing.JLabel lbltahunLulus;
    private javax.swing.JLabel lbltahunLulus1;
    private javax.swing.JLabel lbltahunLulus2;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nohp;
    private javax.swing.JTextField tahunsek;
    private javax.swing.JTextField tgllahir;
    // End of variables declaration//GEN-END:variables

   
}
