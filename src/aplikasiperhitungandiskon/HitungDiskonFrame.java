/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasiperhitungandiskon;

/**
 *
 * @author ACER A314
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class HitungDiskonFrame extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    /**
     * Creates new form HitungDiskonFrame
     */
    public HitungDiskonFrame() {
        initComponents();
        initTable(); // Inisialisasi model JTable
    }
    
    private void initTable() {
        // Model tabel dengan kolom: Harga Asli, Diskon, Penghematan, Harga Akhir
        tableModel = new DefaultTableModel(new String[]{"Harga Asli", "Diskon (%)", "Penghematan", "Harga Akhir"}, 0);
        tblRiwayat.setModel(tableModel);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHargaAsli = new javax.swing.JTextField();
        cbbDiskon = new javax.swing.JComboBox<>();
        sldDiskon = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        lblHargaAkhir = new javax.swing.JLabel();
        lblHemat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKupon = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRiwayat = new javax.swing.JTable();
        btnHapusRiwayat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aplikasi Hitung Diskon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semibold", 1, 18))); // NOI18N

        jLabel1.setText("Input Harga");

        cbbDiskon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5%", "10%", "15%", " " }));
        cbbDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDiskonActionPerformed(evt);
            }
        });

        sldDiskon.setMajorTickSpacing(5);
        sldDiskon.setMaximum(15);
        sldDiskon.setMinimum(5);
        sldDiskon.setPaintLabels(true);
        sldDiskon.setPaintTicks(true);
        sldDiskon.setSnapToTicks(true);
        sldDiskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldDiskonStateChanged(evt);
            }
        });

        jLabel2.setText("Total belanja anda adalah: Rp.");

        lblHargaAkhir.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lblHargaAkhir.setText("00000000");

        lblHemat.setText("...");

        jLabel3.setText("Kupon");

        btnHitung.setText("Proses");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        tblRiwayat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRiwayat);

        btnHapusRiwayat.setText("Hapus Riwayat");
        btnHapusRiwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusRiwayatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHargaAkhir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(41, 41, 41)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHargaAsli)
                                    .addComponent(txtKupon, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbbDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnHitung))
                                    .addComponent(sldDiskon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblHemat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHapusRiwayat)
                                .addGap(14, 14, 14))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHargaAsli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtKupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sldDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblHargaAkhir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHemat)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnHapusRiwayat))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
        // Validasi Input Harga Asli
        double hargaAsli = Double.parseDouble(txtHargaAsli.getText());
        if (hargaAsli <= 0) {
            JOptionPane.showMessageDialog(this, "Harga asli harus lebih dari 0.");
            return;
        }

        // Ambil Diskon dari ComboBox atau Slider
        int diskon = cbbDiskon.getSelectedItem() != null
                ? Integer.parseInt(cbbDiskon.getSelectedItem().toString().replace("%", ""))
                : sldDiskon.getValue();

        // Validasi Kupon
        String kupon = txtKupon.getText().trim();
        int tambahanDiskon = 0;
        if (!kupon.isEmpty()) {
            if (kupon.equalsIgnoreCase("UNISKUY")) {
                tambahanDiskon = 5;
            } else if (kupon.equalsIgnoreCase("UNISKACIHUY")) {
                tambahanDiskon = 10;
            } else {
                JOptionPane.showMessageDialog(this, "Kupon tidak valid.");
                return;
            }
        }

        // Hitung Total Diskon dan Harga Akhir
        int totalDiskon = diskon + tambahanDiskon;
        if (totalDiskon > 100) totalDiskon = 100;

        double penghematan = hargaAsli * totalDiskon / 100;
        double hargaAkhir = hargaAsli - penghematan;

        // Tampilkan Hasil
        lblHargaAkhir.setText(String.format("Rp. %.2f", hargaAkhir));
        lblHemat.setText("Anda berhasil menghemat: Rp. " + String.format("%.2f", penghematan));

        // Tambahkan Riwayat ke Tabel
        tableModel.addRow(new Object[]{hargaAsli, totalDiskon + "%", penghematan, hargaAkhir});

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Masukkan angka yang valid untuk harga asli.");
    }
    }                                         

    private void btnHapusRiwayatActionPerformed(java.awt.event.ActionEvent evt) {                                                
    // Hapus semua baris di tabel
    tableModel.setRowCount(0); // Reset jumlah baris menjadi 0
    }                                               

    private void cbbDiskonActionPerformed(java.awt.event.ActionEvent evt) {                                          
    // Sinkronkan nilai ComboBox dengan Slider
    String selectedItem = (String) cbbDiskon.getSelectedItem();
    if (selectedItem != null) {
        int comboValue = Integer.parseInt(selectedItem.replace("%", ""));
        sldDiskon.setValue(comboValue);
    }
    }                                         

    private void sldDiskonStateChanged(javax.swing.event.ChangeEvent evt) {                                       
    // Sinkronkan nilai Slider dengan ComboBox
    int sliderValue = sldDiskon.getValue();
    cbbDiskon.setSelectedItem(sliderValue + "%");        
    }                                      

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
            java.util.logging.Logger.getLogger(HitungDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HitungDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HitungDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HitungDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HitungDiskonFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnHapusRiwayat;
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> cbbDiskon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHargaAkhir;
    private javax.swing.JLabel lblHemat;
    private javax.swing.JSlider sldDiskon;
    private javax.swing.JTable tblRiwayat;
    private javax.swing.JTextField txtHargaAsli;
    private javax.swing.JTextField txtKupon;
    // End of variables declaration                   
}
