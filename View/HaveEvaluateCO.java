package View;

import Process.Evaluate;
import Process.EvaluateDao;
import Process.MessageDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class HaveEvaluateCO extends javax.swing.JDialog {

    /**
     * Creates new form HaveEvaluateAPL
     */
    private int COMPANYNO, INTERVIEWSCHEDULENO;

    /**
     * Creates new form HaveEvaluateAPL
     */
    public HaveEvaluateCO(java.awt.Frame parent, boolean modal, int maCom, int maITS) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

        COMPANYNO = maCom;
        INTERVIEWSCHEDULENO = maITS;

        HienThi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblINTERVIEWSCHEDULE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCOMPANY = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMARK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaCOMMENT = new javax.swing.JTextArea();
        btnAlt = new javax.swing.JButton();
        btnDlt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã lịch:");

        lblINTERVIEWSCHEDULE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblINTERVIEWSCHEDULE.setText("jLabel6");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã công ty:");

        lblCOMPANY.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCOMPANY.setText("jLabel5");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Điểm đánh giá:");

        txtMARK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nhận xét:");

        txaCOMMENT.setColumns(20);
        txaCOMMENT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaCOMMENT.setRows(5);
        jScrollPane1.setViewportView(txaCOMMENT);

        btnAlt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_maintenance_16px.png"))); // NOI18N
        btnAlt.setText("Sửa đánh giá");
        btnAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltActionPerformed(evt);
            }
        });

        btnDlt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_Delete_16px.png"))); // NOI18N
        btnDlt.setText("Xóa đánh giá");
        btnDlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDltActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("ĐÁNH GIÁ ỨNG VIÊN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtMARK)
                    .addComponent(lblCOMPANY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblINTERVIEWSCHEDULE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnAlt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnDlt)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblINTERVIEWSCHEDULE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCOMPANY))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMARK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlt)
                    .addComponent(btnDlt))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltActionPerformed
        // TODO add your handling code here:
        int mark_co = Integer.parseInt(txtMARK.getText());
        String comment_co = txaCOMMENT.getText();
        EvaluateDao dao = new EvaluateDao();

        try {
            Evaluate ev = new Evaluate(mark_co, comment_co);

            int choose = MessageDialog.showConfirmDialog(this, "Bạn có chắc muốn sửa đánh giá?", "Hỏi");
            if (choose == JOptionPane.YES_OPTION) {
                if (dao.updateEvaluateCO(COMPANYNO, INTERVIEWSCHEDULENO, ev)) {
                    MessageDialog.showMessageDialog(this, "Sửa thành công!", "Thông báo");
                } else {
                    MessageDialog.showConfirmDialog(this, "Sửa thất bại!", "Thông báo");
                }
            }
        } catch (Exception e) {
            MessageDialog.showErrorDialog(this, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnAltActionPerformed

    private void btnDltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDltActionPerformed
        // TODO add your handling code here:
        EvaluateDao dao = new EvaluateDao();
        try {
            int choose = MessageDialog.showConfirmDialog(this, "Bạn có chắc muốn xóa đánh giá?", "Hỏi");
            if (choose == JOptionPane.YES_OPTION) {
                if (dao.deleteEvaluateCO(COMPANYNO, INTERVIEWSCHEDULENO)) {
                    MessageDialog.showMessageDialog(this, "Xóa thành công!", "Thông báo");
                    this.dispose();
                } else {
                    MessageDialog.showConfirmDialog(this, "Xoa that bai!", "Thông báo");
                }
            }
        } catch (Exception e) {
            MessageDialog.showErrorDialog(this, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnDltActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlt;
    private javax.swing.JButton btnDlt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCOMPANY;
    private javax.swing.JLabel lblINTERVIEWSCHEDULE;
    private javax.swing.JTextArea txaCOMMENT;
    private javax.swing.JTextField txtMARK;
    // End of variables declaration//GEN-END:variables

    private void HienThi() {
        EvaluateDao dao = new EvaluateDao();
        Evaluate ev = new Evaluate();
        try {
            ev = dao.getInformationCO(COMPANYNO, INTERVIEWSCHEDULENO);
        } catch (Exception ex) {
            MessageDialog.showErrorDialog(this, ex.getMessage(), "Lỗi");
        }
        lblINTERVIEWSCHEDULE.setText(String.valueOf(INTERVIEWSCHEDULENO));
        lblCOMPANY.setText(String.valueOf(COMPANYNO));
        txtMARK.setText(String.valueOf(ev.getMARK()));
        txaCOMMENT.setText(ev.getCOMMENT());
    }

}
