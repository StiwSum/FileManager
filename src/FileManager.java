/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class FileManager extends javax.swing.JFrame {

    /**
     * Creates new form FileManager
     */
    public FileManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        workPanel = new javax.swing.JPanel();
        pathField = new javax.swing.JTextField();
        pathLabel = new javax.swing.JLabel();
        infoFileLabel = new javax.swing.JLabel();
        infoField = new javax.swing.JTextField();
        protokolLabel = new javax.swing.JLabel();
        protokolField = new javax.swing.JTextField();
        openProtokolButton = new javax.swing.JButton();
        openInfoButton = new javax.swing.JButton();
        filesScrollPane = new javax.swing.JScrollPane();
        filesList = new javax.swing.JList<>();
        filesLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        aboutMenu = new javax.swing.JMenu();
        aboutItem = new javax.swing.JMenuItem();
        helpItem = new javax.swing.JMenuItem();
        optionMenu = new javax.swing.JMenu();
        calculatorItem = new javax.swing.JMenuItem();
        terminalItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("File-Manager-2.0");
        setAutoRequestFocus(false);
        setLocation(new java.awt.Point(720, 240));
        setPreferredSize(new java.awt.Dimension(480, 660));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        workPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        workPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        workPanel.setDoubleBuffered(false);
        workPanel.setPreferredSize(new java.awt.Dimension(480, 660));

        pathField.setText("Default");
        pathField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pathFieldAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        pathField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathFieldActionPerformed(evt);
            }
        });

        pathLabel.setText("Путь:");

        infoFileLabel.setText("Файл перемещений:");

        infoField.setText("info.txt");

        protokolLabel.setText("Файл фоктов созданий:");

        protokolField.setText("protokol.txt");

        openProtokolButton.setText("Открыть");

        openInfoButton.setText("Открыть");
        openInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openInfoButtonActionPerformed(evt);
            }
        });

        filesList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "System", "home dir", "Desctop"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        filesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filesListMouseClicked(evt);
            }
        });
        filesScrollPane.setViewportView(filesList);

        filesLabel.setText("Файлы");

        backButton.setText("<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(filesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, workPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(workPanelLayout.createSequentialGroup()
                                .addComponent(pathLabel)
                                .addGap(18, 18, 18)
                                .addComponent(pathField))
                            .addGroup(workPanelLayout.createSequentialGroup()
                                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(protokolLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(infoFileLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(infoField)
                                    .addComponent(protokolField, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(openProtokolButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(openInfoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(workPanelLayout.createSequentialGroup()
                                .addComponent(filesLabel)
                                .addGap(18, 18, 18)
                                .addComponent(backButton)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathField)
                    .addComponent(pathLabel))
                .addGap(18, 18, 18)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoFileLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoField)
                    .addComponent(openInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(protokolLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(protokolField)
                    .addComponent(openProtokolButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filesLabel)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        aboutMenu.setText("О программе");

        aboutItem.setText("О программе");
        aboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutItemActionPerformed(evt);
            }
        });
        aboutMenu.add(aboutItem);

        helpItem.setText("Помощь");
        helpItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpItemActionPerformed(evt);
            }
        });
        aboutMenu.add(helpItem);

        MenuBar.add(aboutMenu);

        optionMenu.setText("Опции");

        calculatorItem.setText("Калькулятор");
        calculatorItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorItemActionPerformed(evt);
            }
        });
        optionMenu.add(calculatorItem);

        terminalItem.setText("Терминал");
        terminalItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminalItemActionPerformed(evt);
            }
        });
        optionMenu.add(terminalItem);

        exitItem.setText("Выход");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        optionMenu.add(exitItem);

        MenuBar.add(optionMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("frame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemActionPerformed
        JOptionPane.showMessageDialog(workPanel, "Файловый Менеджер - приложения для работы с файлами");
    }//GEN-LAST:event_aboutItemActionPerformed

    private void helpItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpItemActionPerformed
        JOptionPane.showMessageDialog(workPanel, "");
    }//GEN-LAST:event_helpItemActionPerformed

    private void calculatorItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorItemActionPerformed
        try {
            Runtime.getRuntime().exec("gnome-calculator");
            printToInfoFile("gnome-calculator");
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_calculatorItemActionPerformed

    private void terminalItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminalItemActionPerformed
        try {
            Runtime.getRuntime().exec("gnome-terminal");
            printToInfoFile("gnome-terminal");
        } catch (IOException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_terminalItemActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        File folder = new File("/home/user/NetBeansProjects/File-Manager-2.0/sourcefiles/info");
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                f.delete();
            }
        }

        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void pathFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathFieldActionPerformed
        if (pathField.getText().equals("Default")) {
            currentFile = new File("/home/user/NetBeansProjects/File-Manager-2.0/Default");
        } else {
            currentFile = new File(pathField.getText());
        }

        if (currentFile.exists()) {
            if (currentFile.isDirectory()) {
                files = currentFile.list();
                filesList.setListData(files);
            } else {
                try {
                    if (desktop.isSupported(Desktop.Action.OPEN)) {
                        printToInfoFile(currentFile.getName());
                        desktop.open(currentFile);
                        pathField.setText(currentFile.getParentFile().getPath());
                        pathFieldActionPerformed(evt);
                    }
                } catch (Throwable ex) {
                    showThrowable(ex);
                    pathField.setText(currentFile.getParentFile().getPath());
                    pathFieldActionPerformed(evt);
                }
                workPanel.repaint();
            }
        } else {
            showErrorMessage("Такого файла или каталога не существует.", "Message");
        }
    }//GEN-LAST:event_pathFieldActionPerformed

    private void openInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInfoButtonActionPerformed

        File newFile = new File(infoFile.getParent() + "/info/" + infoField.getText());
        try {
            boolean created = newFile.createNewFile();
            if (created) {
                System.out.println("File has been created");
            }
        } catch (IOException ex) {

        }
        if (newFile.exists()) {
            try {
                copy(infoFile.getPath(), newFile.getPath());
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (desktop.isSupported(Desktop.Action.OPEN)) {
                    desktop.open(newFile);
                }
            } catch (Throwable ex) {
                showThrowable(ex);
            }
        }
    }//GEN-LAST:event_openInfoButtonActionPerformed

    private void pathFieldAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_pathFieldAncestorAdded
        ActionEvent ae = new ActionEvent(evt, WIDTH, "");
        pathFieldActionPerformed(ae);
    }//GEN-LAST:event_pathFieldAncestorAdded

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        if (!currentFile.getPath().equals("/")) {
            pathField.setText(currentFile.getParentFile().getPath());
            pathFieldActionPerformed(evt);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void filesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filesListMouseClicked
        if (!(currentFile.getPath() + "/" + filesList.getSelectedValue()).equals(null) && currentFile.list().length != 0 ) {
            pathField.setText(currentFile.getPath() + "/" + filesList.getSelectedValue());
            ActionEvent ae = new ActionEvent(evt, WIDTH, "");
            pathFieldActionPerformed(ae);
        }
    }//GEN-LAST:event_filesListMouseClicked

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
            java.util.logging.Logger.getLogger(FileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JButton backButton;
    private javax.swing.JMenuItem calculatorItem;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JLabel filesLabel;
    private javax.swing.JList<String> filesList;
    private javax.swing.JScrollPane filesScrollPane;
    private javax.swing.JMenuItem helpItem;
    private javax.swing.JTextField infoField;
    private javax.swing.JLabel infoFileLabel;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton openInfoButton;
    private javax.swing.JButton openProtokolButton;
    private javax.swing.JMenu optionMenu;
    private javax.swing.JTextField pathField;
    private javax.swing.JLabel pathLabel;
    private javax.swing.JTextField protokolField;
    private javax.swing.JLabel protokolLabel;
    private javax.swing.JMenuItem terminalItem;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
    private File currentFile;
    private String[] files;
    private Desktop desktop = Desktop.getDesktop();
    private File infoFile = new File("/home/user/NetBeansProjects/File-Manager-2.0/sourcefiles/newfile.txt");
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;

    private void showErrorMessage(String errorMessage, String errorTitle) {
        JOptionPane.showMessageDialog(
                workPanel,
                errorMessage,
                errorTitle,
                JOptionPane.ERROR_MESSAGE
        );
    }

    private void showThrowable(Throwable t) {
        t.printStackTrace();
        JOptionPane.showMessageDialog(
                workPanel,
                t.toString() + "\nНе указано приложение по умолчанию для файла.",
                t.getMessage(),
                JOptionPane.ERROR_MESSAGE
        );
        workPanel.repaint();
    }

    private void printToInfoFile(String string) throws IOException {
        fileWriter = new FileWriter(infoFile, true);
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.append("Имя процесса: " + string + " Время запуска: " + LocalDateTime.now());
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public void copy(String sourcePath, String destinationPath) throws IOException {
        Files.copy(Paths.get(sourcePath), new FileOutputStream(destinationPath));
    }
}