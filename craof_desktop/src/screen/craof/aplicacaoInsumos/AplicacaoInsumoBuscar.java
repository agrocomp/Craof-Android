/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen.craof.aplicacaoInsumos;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.controle.craof.Controle_Compra_Insumos;
import org.controle.craof.Controle_aplicacao;
import org.entidade.craof.CompraInsumos;
import screen.craof.FrameAuxiliar;
import screen.craof.produzirInsumo.*;
import screen.craof.SegundaTela;
import screen.craof.fichas.CompraInsumos.CompraInsumosBuscar;
import screen.craof.fichas.CompraInsumos.CompraInsumosCadastrar;
import screen.craof.fichas.ControlePlantio.ControlePlantioBuscar;

/**
 *
 * @author Luan
 */
public class AplicacaoInsumoBuscar extends javax.swing.JPanel {

    /**
     * Creates new form CompraInsumosBuscar
     */
    public AplicacaoInsumoBuscar(SegundaTela segundaTela) {
        initComponents();
        this.segundaTela = segundaTela;
        inicializar();
    }

    public void inicializar() {
        controle = new Controle_aplicacao();
        aplicacaoInsumo = new org.entidade.craof.AplicacaoInsumo();
        listaAplicacaoInsumo = new ArrayList();
        try {
            listaAplicacaoInsumo = controle.obterTodosRelatorio();
            System.out.println(listaAplicacaoInsumo.size());
            DefaultTableModel model = (DefaultTableModel) wtbRelatorio.getModel();
            model.getDataVector().removeAllElements();
            for (org.entidade.craof.AplicacaoInsumo aux : listaAplicacaoInsumo) {
                model.addRow(new Object[]{aux.getId_aplicaoInsumo(), aux.getDataAplicacao(), aux.getInsumo().getDescricao(), aux.getQuantidade(), aux.getCultura().getNome(), aux.getFinalidade()});
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
        wlRelatorio = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        wlData = new javax.swing.JLabel();
        wtDataInicial = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");
            wtDataInicial = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }
        wlData1 = new javax.swing.JLabel();
        wtDataFinal = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");
            wtDataFinal = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }
        obterRelatorio = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setToolTipText("wfsedfds");

        wtbRelatorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        wtbRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Data", "Insumo", "Quantidade", "Cultura", "Finalidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(wtbRelatorio);

        wlRelatorio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        wlRelatorio.setText("RELATÓRIO DE APLICAÇÃO DE INSUMO");

        voltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        voltar.setText("VOLTAR");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        wlData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wlData.setText("Data Inicial:");

        wtDataInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        wlData1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wlData1.setText("Data Final: ");

        wtDataFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        obterRelatorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        obterRelatorio.setText("OBTER RELATÓRIO");
        obterRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obterRelatorioActionPerformed(evt);
            }
        });

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
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(voltar)
                .addGap(310, 310, 310))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(149, 149, 149)
                        .addComponent(wlRelatorio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(wlData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                                .addComponent(wlData1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obterRelatorio)))
                        .addGap(4, 4, 4))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(wlRelatorio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wlData)
                    .addComponent(wtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wlData1)
                    .addComponent(wtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obterRelatorio))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(jButton1))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        this.segundaTela.voltar();
    }//GEN-LAST:event_voltarActionPerformed

    private void obterRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obterRelatorioActionPerformed
        try {
            listaAplicacaoInsumo = controle.obterRelatorio(wtDataInicial.getText().toString(), wtDataFinal.getText().toString());
            System.out.println(listaAplicacaoInsumo.size());
            DefaultTableModel model = (DefaultTableModel) wtbRelatorio.getModel();
            model.getDataVector().removeAllElements();
            for (org.entidade.craof.AplicacaoInsumo aux : listaAplicacaoInsumo) {
                model.addRow(new Object[]{aux.getId_aplicaoInsumo(), aux.getDataAplicacao(), aux.getInsumo().getDescricao(), aux.getQuantidade(), aux.getCultura().getNome(), aux.getFinalidade()});
            }
        } catch (ParseException | SQLException ex) {
            Logger.getLogger(ControlePlantioBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_obterRelatorioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrameAuxiliar c = new FrameAuxiliar(this);
        try {
            c.abrirPanel(new AplicacaoInsumo(c), "Inserir Aplicação de Insumo");
            c.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CompraInsumosBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void atualizarTabela(org.entidade.craof.AplicacaoInsumo aplicacao) {
        DefaultTableModel model = (DefaultTableModel) wtbRelatorio.getModel();
        model.getDataVector().removeAllElements();
        listaAplicacaoInsumo.add(aplicacao);
        for (org.entidade.craof.AplicacaoInsumo aux : listaAplicacaoInsumo) {
            model.addRow(new Object[]{aux.getId_aplicaoInsumo(), aux.getDataAplicacao(), aux.getInsumo().getDescricao(), aux.getQuantidade(), aux.getCultura().getNome(), aux.getFinalidade()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton obterRelatorio;
    private javax.swing.JButton voltar;
    private javax.swing.JLabel wlData;
    private javax.swing.JLabel wlData1;
    private javax.swing.JLabel wlRelatorio;
    private javax.swing.JTextField wtDataFinal;
    private javax.swing.JTextField wtDataInicial;
    private javax.swing.JTable wtbRelatorio;
    // End of variables declaration//GEN-END:variables
    SegundaTela segundaTela;
    private Controle_aplicacao controle;
    private org.entidade.craof.AplicacaoInsumo aplicacaoInsumo;
    private ArrayList<org.entidade.craof.AplicacaoInsumo> listaAplicacaoInsumo;
}
