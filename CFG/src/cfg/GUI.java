/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author redes
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    
    private CFGrammar cfg = null;
    private LL1Algorithm ll1 = null;
    private ArrayList<String> ge = null;
    private ArrayList<String> words = null;
    private int idx = 0;
    
    public GUI() {
        initComponents();
        this.setTitle("ASD y LL(1)");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        routeLabel = new javax.swing.JLabel();
        routeTF = new javax.swing.JTextField();
        loadBT = new javax.swing.JButton();
        searchBT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ll1JTable = new javax.swing.JTable();
        recogLabel = new javax.swing.JLabel();
        wordTF = new javax.swing.JTextField();
        recogBT = new javax.swing.JButton();
        TabbedPane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        ogJTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        svJTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        primeroJTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        sgtJTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaMJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        estadoLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nextStringBT = new javax.swing.JButton();
        jLabelN = new javax.swing.JLabel();
        cadenaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        routeLabel.setText("Ruta de archivo de la gramatica:");

        loadBT.setText("Realizar calculos");
        loadBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadBTActionPerformed(evt);
            }
        });

        searchBT.setText("Buscar");
        searchBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTActionPerformed(evt);
            }
        });

        ll1JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pila", "Entrada", "Produccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ll1JTable);

        recogLabel.setText("Ruta de archivo de las cadenas:");

        recogBT.setText("Buscar");
        recogBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recogBTActionPerformed(evt);
            }
        });

        ogJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No terminal", "Produccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ogJTable);

        TabbedPane.addTab("Original", jScrollPane2);

        svJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Terminal", "Produccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(svJTable);

        TabbedPane.addTab("Sin Vicios", jScrollPane3);

        primeroJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Terminal", "Conjunto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(primeroJTable);

        TabbedPane.addTab("Primero", jScrollPane4);

        sgtJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No Terminal", "Conjunto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(sgtJTable);

        TabbedPane.addTab("Siguiente", jScrollPane5);

        tablaMJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tablaMJTable);

        TabbedPane.addTab("Tabla M", jScrollPane6);

        jLabel1.setText("Estado de la gramatica:");

        estadoLabel.setText("Archivo de gramatica no detectado!");

        jLabel2.setText("Nota: NT significa No Terminal");

        jLabel3.setText("Analisis Sintatico Predictivo (LL(1))");

        nextStringBT.setText("Primera cadena");
        nextStringBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextStringBTActionPerformed(evt);
            }
        });

        jLabelN.setText("Cadena a analizar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estadoLabel))
                    .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(loadBT)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(routeLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(routeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchBT))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(recogLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(recogBT))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabelN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cadenaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nextStringBT, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(routeLabel)
                    .addComponent(routeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBT)
                    .addComponent(recogLabel)
                    .addComponent(wordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recogBT))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(estadoLabel))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(loadBT)
                                .addGap(63, 63, 63)))
                        .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cadenaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nextStringBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readFile(File file, boolean isGrammarFile){
        if(isGrammarFile){
            ge = new ArrayList<>();
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while((line = br.readLine()) != null){
                    ge.add(line);
                }
                br.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al abrir el archivo!");
            }
        } else {
            words = new ArrayList<>();
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while((line = br.readLine()) != null){
                    words.add(line);
                }
                br.close();
            } catch (Exception e) {
            }
        }
    }
    
    private void setTablesValues(){
        DefaultTableModel tableModel = (DefaultTableModel)ogJTable.getModel();
        for(String equation : ge){
            String splittedEq[] = equation.split("->");
            String nonTerminal = splittedEq[0];
            String production = splittedEq[1];
            tableModel.addRow(new Object[]{nonTerminal, production});
        }
        tableModel = (DefaultTableModel)svJTable.getModel();
        for(Map.Entry<String, Set<String>> entry : cfg.getNormalizedGE().entrySet()){
            String nonTerminal = entry.getKey();
            Set<String> productions = entry.getValue();
            for(String production : productions){
                tableModel.addRow(new Object[]{nonTerminal, production});
            }
        }
        tableModel = (DefaultTableModel)primeroJTable.getModel();
        for(Map.Entry<String, Set<String>> entry : cfg.getFirst().entrySet()){
            tableModel.addRow(new Object[]{entry.getKey(), entry.getValue().toString()});
        }
        tableModel = (DefaultTableModel)sgtJTable.getModel();
        for(Map.Entry<String, Set<String>> entry : cfg.getFollow().entrySet()){
            tableModel.addRow(new Object[]{entry.getKey(), entry.getValue().toString()});
        }
        tableModel = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        tableModel.addColumn("NonT/T");
        for(String terminal : cfg.getTerminals()){
            tableModel.addColumn(terminal);
        }
        tableModel.addColumn("$");
        for(Map.Entry<String, HashMap<String, String>> entry : ll1.getmTable().entrySet()){
            String nonTerminal = entry.getKey();
            ArrayList<Object> row = new ArrayList<>();
            row.add(nonTerminal);
            for(String terminal : cfg.getTerminals()){
                String production = entry.getValue().get(terminal);
                if(production != null) production = nonTerminal + "->" + production;
                row.add(production);
            }
            row.add(entry.getValue().get("$"));
            tableModel.addRow(row.toArray());
        }
        tablaMJTable.setModel(tableModel);
    }
    
    private void resetValues(){
        idx = 0;
        nextStringBT.setVisible(true);
        routeTF.setText("");
        cadenaLabel.setText("");
        nextStringBT.setText("Primera cadena");
        wordTF.setText("");
        cfg = null;
        ll1 = null;
        estadoLabel.setText("Archivo de gramatica no detectado!");
        DefaultTableModel tableModel = (DefaultTableModel)primeroJTable.getModel();
        tableModel.setRowCount(0);
        tableModel = (DefaultTableModel)sgtJTable.getModel();
        tableModel.setRowCount(0);
        tableModel = (DefaultTableModel)ogJTable.getModel();
        tableModel.setRowCount(0);
        tableModel = (DefaultTableModel)svJTable.getModel();
        tableModel.setRowCount(0);
        tableModel = (DefaultTableModel)tablaMJTable.getModel();
        tableModel.setRowCount(0);
        tableModel = (DefaultTableModel)ll1JTable.getModel();
        tableModel.setRowCount(0);
    }
    
    private void searchBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTActionPerformed
        resetValues();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("TEXT FILES", "txt", "text"));
        int selectedOp = fileChooser.showOpenDialog(this);
        if(selectedOp == JFileChooser.APPROVE_OPTION){
            File grammarTxt = fileChooser.getSelectedFile();
            readFile(grammarTxt, true);
            routeTF.setText(grammarTxt.getPath());
            estadoLabel.setText("Gramatica cargada!");
        }
    }//GEN-LAST:event_searchBTActionPerformed

    private void loadBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadBTActionPerformed
        try {
            if(!routeTF.getText().isEmpty()){
                cfg = new CFGrammar(ge);
                cfg.computeSets();
                ll1 = new LL1Algorithm(cfg);
                ll1.computeMTable();
                setTablesValues();
            }
        } catch (Exception e) {
            estadoLabel.setText("Error al cargar gramatica.");
        }
    }//GEN-LAST:event_loadBTActionPerformed

    private void recogBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recogBTActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("TEXT FILES", "txt", "text"));
        int selectedOp = fileChooser.showOpenDialog(this);
        if(selectedOp == JFileChooser.APPROVE_OPTION){
            File grammarTxt = fileChooser.getSelectedFile();
            readFile(grammarTxt, false);
            wordTF.setText(grammarTxt.getPath());
            JOptionPane.showMessageDialog(null, "Archivo cargado exitosamente!");
            nextStringBT.setText("Primera cadena");
            nextStringBT.setVisible(true);
            DefaultTableModel tableModel = (DefaultTableModel)ll1JTable.getModel();
            tableModel.setRowCount(0);
            idx = 0;
        }
    }//GEN-LAST:event_recogBTActionPerformed

    private void nextStringBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextStringBTActionPerformed
        if(!wordTF.getText().isEmpty()){
            DefaultTableModel tableModel = (DefaultTableModel)ll1JTable.getModel();
            tableModel.setRowCount(0);
            if(idx < words.size()){
                String word = words.get(idx);
                cadenaLabel.setText(word);
                if(ll1.acceptedWord(word)){
                    JOptionPane.showMessageDialog(null, "Cadena reconocida!");
                    ArrayList<Object[]> logs = ll1.getLogs();
                    for(Object[] row : logs){
                        tableModel.addRow(row);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cadena no reconocida.");
                }
                idx++;
            }
            if(idx < words.size() - 1) nextStringBT.setText("Siguiente cadena");
            else if(idx == words.size() - 1) nextStringBT.setText("Ultima cadena");
            else {
                JOptionPane.showMessageDialog(null, "Ya no hay cadenas para analizar.");
                nextStringBT.setVisible(false);
            }
        }
    }//GEN-LAST:event_nextStringBTActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JLabel cadenaLabel;
    private javax.swing.JLabel estadoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable ll1JTable;
    private javax.swing.JButton loadBT;
    private javax.swing.JButton nextStringBT;
    private javax.swing.JTable ogJTable;
    private javax.swing.JTable primeroJTable;
    private javax.swing.JButton recogBT;
    private javax.swing.JLabel recogLabel;
    private javax.swing.JLabel routeLabel;
    private javax.swing.JTextField routeTF;
    private javax.swing.JButton searchBT;
    private javax.swing.JTable sgtJTable;
    private javax.swing.JTable svJTable;
    private javax.swing.JTable tablaMJTable;
    private javax.swing.JTextField wordTF;
    // End of variables declaration//GEN-END:variables
}
