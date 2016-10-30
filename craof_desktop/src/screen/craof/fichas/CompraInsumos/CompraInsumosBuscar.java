/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen.craof.fichas.CompraInsumos;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import org.controle.craof.Controle_Compra_Insumos;
import org.entidade.craof.CompraInsumos;
import org.entidade.craof.Plantio;
import screen.craof.FrameAuxiliar;
import screen.craof.SegundaTela;
import screen.craof.fichas.ControlePlantio.ControlePlantioBuscar;

/**
 *
 * @author Luan
 */
public class CompraInsumosBuscar extends javax.swing.JPanel {

    /**
     * Creates new form CompraInsumosBuscar
     */
    public CompraInsumosBuscar(SegundaTela segundaTela) {
        initComponents();
        this.segundaTela = segundaTela;
        inicializar();
    }

    public void inicializar() {
        controle = new Controle_Compra_Insumos();
        compraInsumos = new CompraInsumos();
        listaCompraInsumos = new ArrayList();
        try {
            listaCompraInsumos = controle.obterTodosRelatorio();
            System.out.println(listaCompraInsumos.size());
            DefaultTableModel model = (DefaultTableModel) wtbRelatorio.getModel();
            model.getDataVector().removeAllElements();
            for (CompraInsumos aux : listaCompraInsumos) {
                model.addRow(new Object[]{aux.getId_compraInsumo(), aux.getDataCompra(), aux.getInsumo().getDescricao(), aux.getQuantidade(), aux.getFinalidade()});
            }
        } catch (ParseException | SQLException ex) {
            Logger.getLogger(ControlePlantioBuscar.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        wtbRelatorio = new javax.swing.JTable();
        obterRelatorio = new javax.swing.JButton();
        wtDataInicial = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");
            wtDataInicial = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }
        wlData = new javax.swing.JLabel();
        wlRelatorio = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        wtDataFinal = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");
            wtDataFinal = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }
        wlData1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        wtbRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Data", "Produto", "Quantidade", "Finalidade de uso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(wtbRelatorio);

        obterRelatorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        obterRelatorio.setText("OBTER RELATÓRIO");
        obterRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obterRelatorioActionPerformed(evt);
            }
        });

        wtDataInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wtDataInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wtDataInicialActionPerformed(evt);
            }
        });

        wlData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wlData.setText("Data Inicial:");

        wlRelatorio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wlRelatorio.setText("RELATÓRIO DE COMPRA DE INSUMO");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        wtDataFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        wlData1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wlData1.setText("Data Final:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/craof80.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("NOVA FICHA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(wlData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wlData1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(obterRelatorio)
                .addGap(134, 134, 134))
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jButton1)
                .addGap(61, 61, 61)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(156, 156, 156)
                .addComponent(wlRelatorio)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(wlRelatorio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(wlData1)
                        .addComponent(wtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(obterRelatorio))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(wlData)
                        .addComponent(wtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.segundaTela.voltar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void obterRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obterRelatorioActionPerformed
        controle = new Controle_Compra_Insumos();
        compraInsumos = new CompraInsumos();
        listaCompraInsumos = new ArrayList();
        try {
            listaCompraInsumos = controle.obterRelatorio(wtDataInicial.getText().toString(), wtDataFinal.getText().toString());
            System.out.println(listaCompraInsumos.size());
            DefaultTableModel model = (DefaultTableModel) wtbRelatorio.getModel();
            model.getDataVector().removeAllElements();
            for (CompraInsumos aux : listaCompraInsumos) {
                model.addRow(new Object[]{aux.getId_compraInsumo(), aux.getDataCompra(), aux.getInsumo().getDescricao(), aux.getQuantidade(), aux.getFinalidade()});
            }
        } catch (ParseException | SQLException ex) {
            Logger.getLogger(ControlePlantioBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_obterRelatorioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameAuxiliar c = new FrameAuxiliar(this);
        try {
            c.abrirPanel(new CompraInsumosCadastrar(c), "Inserir compra de Insumo");
            inicializar();
        } catch (SQLException ex) {
            Logger.getLogger(CompraInsumosBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void wtDataInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wtDataInicialActionPerformed

    }//GEN-LAST:event_wtDataInicialActionPerformed

    public void atualizarTabela(CompraInsumos compra) {
        DefaultTableModel model = (DefaultTableModel) wtbRelatorio.getModel();
        model.getDataVector().removeAllElements();
        listaCompraInsumos.add(compra);
        for (CompraInsumos aux : listaCompraInsumos) {
            model.addRow(new Object[]{aux.getId_compraInsumo(), aux.getDataCompra(), aux.getInsumo().getDescricao(), aux.getQuantidade(), aux.getFinalidade()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton obterRelatorio;
    private javax.swing.JLabel wlData;
    private javax.swing.JLabel wlData1;
    private javax.swing.JLabel wlRelatorio;
    private javax.swing.JTextField wtDataFinal;
    private javax.swing.JTextField wtDataInicial;
    private javax.swing.JTable wtbRelatorio;
    // End of variables declaration//GEN-END:variables
    SegundaTela segundaTela;
    private Controle_Compra_Insumos controle;
    private CompraInsumos compraInsumos;
    private ArrayList<CompraInsumos> listaCompraInsumos;
}