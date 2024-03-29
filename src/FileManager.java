
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class FileManager extends javax.swing.JFrame {

    public FileManager() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listPopup = new javax.swing.JPopupMenu();
        openMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        renameMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        createFileMenuItem = new javax.swing.JMenuItem();
        createFolderMenuItem = new javax.swing.JMenuItem();
        PFDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        PFTextArea = new javax.swing.JTextArea();
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
        PFButton = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        aboutMenu = new javax.swing.JMenu();
        aboutItem = new javax.swing.JMenuItem();
        helpItem = new javax.swing.JMenuItem();
        optionMenu = new javax.swing.JMenu();
        calculatorItem = new javax.swing.JMenuItem();
        terminalItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();

        openMenuItem.setText("Открыть");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        listPopup.add(openMenuItem);

        copyMenuItem.setText("Копировать");
        copyMenuItem.setToolTipText("");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        listPopup.add(copyMenuItem);

        pasteMenuItem.setText("Втавить");
        pasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteMenuItemActionPerformed(evt);
            }
        });
        listPopup.add(pasteMenuItem);

        renameMenuItem.setText("Переименовать");
        renameMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                renameMenuItemActionPerformed(evt);
            }
        });
        listPopup.add(renameMenuItem);

        deleteMenuItem.setText("Удалить");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        listPopup.add(deleteMenuItem);

        createFileMenuItem.setText("Создать файл");
        createFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFileMenuItemActionPerformed(evt);
            }
        });
        listPopup.add(createFileMenuItem);

        createFolderMenuItem.setText("Создать папку");
        createFolderMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createFolderMenuItemActionPerformed(evt);
            }
        });
        listPopup.add(createFolderMenuItem);

        PFDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        PFDialog.setTitle("Количество страничных ошибок");
        PFDialog.setLocation(new java.awt.Point(750, 500));
        PFDialog.setSize(new java.awt.Dimension(400, 300));
        PFDialog.setType(java.awt.Window.Type.UTILITY);

        PFTextArea.setColumns(20);
        PFTextArea.setRows(5);
        jScrollPane1.setViewportView(PFTextArea);

        javax.swing.GroupLayout PFDialogLayout = new javax.swing.GroupLayout(PFDialog.getContentPane());
        PFDialog.getContentPane().setLayout(PFDialogLayout);
        PFDialogLayout.setHorizontalGroup(
            PFDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(PFDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PFDialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PFDialogLayout.setVerticalGroup(
            PFDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(PFDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PFDialogLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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

        pathField.setText("root");
        pathField.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                pathFieldAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
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
        protokolField.setEnabled(false);

        openProtokolButton.setText("Открыть");
        openProtokolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProtokolButtonActionPerformed(evt);
            }
        });

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
        filesList.setComponentPopupMenu(listPopup);
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

        PFButton.setText("Количество страничных ошибок");
        PFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFButtonActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PFButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
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
                .addGap(18, 18, 18)
                .addComponent(PFButton)
                .addContainerGap(44, Short.MAX_VALUE))
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
                .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("frame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemActionPerformed
        JDialog dialog = new JDialog(this);
        dialog.setTitle("О программе");
        JTextArea area = new JTextArea("Файловый менеджер (англ. file manager) — компьютерная программа,\n"
                + " предоставляющая интерфейс пользователя для работы\n с файловой системой и файлами.");
        dialog.add(area);
        dialog.setLocation(720, 240);
        dialog.setSize(new Dimension(480, 200));
        area.enable(false);
        dialog.setVisible(true);
    }//GEN-LAST:event_aboutItemActionPerformed

    private void helpItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpItemActionPerformed
        JDialog dialog = new JDialog(this);
        dialog.setTitle("О программе");
        JTextArea area = new JTextArea("Переход по файла осуществляется по двойному щелчку на списке\n"
                + " файлов или же абсолютного пути файла.\n\n\n\nКнопка<Открыть> открывает указонный файл.\n\n\n\n"
                + "По щелчку правой кнопки мыши на файлах \nоткрывается контекстное меню: \n\n\n\n"
                + "<Открыть> открывает указонный файл\n\n\n\n"
                + "<Копировать> копирует указонный файл\n\n\n\n"
                + "<Переименовать> переименуюет указонный файл\n\n\n\n"
                + "<Вставляет> вставляет скопориванный файл\n\n\n\n"
                + "<Удалить> удаляет указонный файл\n\n\n\n"
                + "<Сздать файл/каталог> создаёт файл в указонной или текущей \nдиректории");
        dialog.add(area);
        dialog.setLocation(720, 240);
        dialog.setSize(new Dimension(480, 600));
        area.enable(false);
        dialog.setVisible(true);
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
            Runtime.getRuntime().exec("mate-terminal");
            printToInfoFile("mate-terminal");
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
        if (pathField.getText().equals("/root")) {
            currentFile = new File("/home/user/NetBeansProjects/FileManager/root/");
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
            showErrorMessage("Такого файла или каталога не существует.", "Error");
            pathField.setText("root/");
        }
    }//GEN-LAST:event_pathFieldActionPerformed

    private void openInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openInfoButtonActionPerformed

        if (infoField.getText().length() > 255) {
            showErrorMessage("Вы ввели слишком длинное имя.", "Error");
            return;
        }
        File newFile = new File(infoFile.getParent() + "/info/" + infoField.getText());
        try {
            boolean created = newFile.createNewFile();
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
        if (!currentFile.getPath().equals("root")) {
            pathField.setText(currentFile.getParentFile().getPath());
            pathFieldActionPerformed(evt);
        }
    }//GEN-LAST:event_backButtonActionPerformed

    private void filesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filesListMouseClicked
        if ((evt.getClickCount() == 2)) {
            if (!(currentFile.getPath() + "/" + filesList.getSelectedValue()).equals(null) && currentFile.list().length != 0) {
                pathField.setText(currentFile.getPath() + "/" + filesList.getSelectedValue());
                ActionEvent ae = new ActionEvent(evt, WIDTH, "");
                pathFieldActionPerformed(ae);
            }
        }
    }//GEN-LAST:event_filesListMouseClicked

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        pathField.setText(currentFile.getPath() + "/" + filesList.getSelectedValue());
        ActionEvent ae = new ActionEvent(evt, WIDTH, "");
        pathFieldActionPerformed(ae);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        if (filesList.getSelectedValue() == null) {
            showErrorMessage("Выберете файл для копирования.", "Message");
        } else {
            copyFilePath = currentFile.getPath() + "/" + filesList.getSelectedValue();
            copyFile = new File(currentFile.getPath() + "/" + filesList.getSelectedValue());
        }
    }//GEN-LAST:event_copyMenuItemActionPerformed

    private void pasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteMenuItemActionPerformed
        if (pathField.getText().indexOf("System") != -1) {
            showErrorMessage("Попытка изменить файлы системы.", "Error");
        } else {
            try {
                if (!filesList.getValueIsAdjusting()) {
                    File newFile = new File(pathField.getText() + "/" + copyFile.getName());
                    File[] filesInDir = currentFile.listFiles();
                    for (File filesInDir1 : filesInDir) {
                        if (filesInDir1.getName().equals(copyFile.getName())) {
                            showErrorMessage("Файл с таким именем уже существует.", "Error");
                        }
                    }
                    try {
                        Files.copy(copyFile.toPath(), newFile.toPath());
                    } catch (IOException ex) {
                        Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        newFile.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    File newFile = new File(pathField.getText() + "/" + filesList.getSelectedValue() + "/" + copyFile.getName());;
                    File[] filesInDir = currentFile.listFiles();
                    for (File filesInDir1 : filesInDir) {
                        if (filesInDir1.getName().equals(copyFile.getName())) {
                            showErrorMessage("Файл с таким именем уже существует.", "Error");
                        }
                    }
                    try {
                        Files.copy(copyFile.toPath(), newFile.toPath());
                    } catch (IOException ex) {
                        Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        newFile.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                ActionEvent ae = new ActionEvent(evt, WIDTH, "");
                pathFieldActionPerformed(ae);
            } catch (Exception e) {
                showErrorMessage("Выберете файл для копирования.", "Message");
            }
        }
    }//GEN-LAST:event_pasteMenuItemActionPerformed

    private void renameMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_renameMenuItemActionPerformed
        if (pathField.getText().indexOf("System") != -1) {
            showErrorMessage("Попытка изменить файлы системы.", "Error");
        } else {
            if (filesList.getSelectedValue() != null) {
                System.out.println(filesList.getSelectedValue());
                String newName = JOptionPane.showInputDialog(workPanel, "Введите новое имя.");
                if (newName.length() > 255) {
                    showErrorMessage("Вы ввели слышком длинное имя.", "Error");
                }
                File[] filesInDir = currentFile.listFiles();
                for (File filesInDir1 : filesInDir) {
                    if (filesInDir1.getName().equals(newName)) {
                        showErrorMessage("Файл с таким именем уже существует.", "Error");
                    }
                }
                if (newName == null) {
                    return;
                }
                if (newName.equals("")) {
                    showErrorMessage("Вы не ввели имя.", "Error");
                } else {
                    new File(pathField.getText() + "/" + filesList.getSelectedValue()).renameTo(new File(pathField.getText() + "/" + newName));
                    ActionEvent ae = new ActionEvent(evt, WIDTH, "");
                    pathFieldActionPerformed(ae);
                }
            } else {
                showErrorMessage("Выберете файл, который хотите переименовать.", "Error");
            }
        }
    }//GEN-LAST:event_renameMenuItemActionPerformed

    private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuItemActionPerformed
        if (pathField.getText().indexOf("System") != -1) {
            showErrorMessage("Попытка изменить файлы системы.", "Error");
        } else {
            if (filesList.getSelectedValue() != null) {
                if (filesList.getSelectedValue() != "System") {
                    File deletedFile = new File(pathField.getText() + "/" + filesList.getSelectedValue());
                    deleteFolder(deletedFile);
                    ActionEvent ae = new ActionEvent(evt, WIDTH, "");
                    pathFieldActionPerformed(ae);
                } else {
                    showErrorMessage("Попытка изменить файлы системы.", "Error");
                }

            } else {
                showErrorMessage("Выберете файл, который хотите удалить.", "Error");
            }

        }    }//GEN-LAST:event_deleteMenuItemActionPerformed

    private void createFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFileMenuItemActionPerformed
        if (pathField.getText().indexOf("System") != -1) {
            showErrorMessage("Попытка изменить файлы системы.", "Error");

        } else {
            String newName = JOptionPane.showInputDialog(workPanel, "Введите новое имя");
            if (newName.length() > 255) {
                showErrorMessage("Вы ввели слышком длинное имя.", "Error");
            }
            if (newName.equals("")) {
                showErrorMessage("Вы не ввели имя.", "Error");
            } else {
                File[] filesInDir = currentFile.listFiles();
                for (File filesInDir1 : filesInDir) {
                    if (filesInDir1.getName().equals(newName)) {
                        showErrorMessage("Файл с таким именем уже существует.", "Error");
                    }
                }
                File newFile = new File(pathField.getText() + "/" + newName);
                try {
                    newFile.createNewFile();
                    printToProtFile(newFile);

                } catch (IOException ex) {
                    Logger.getLogger(FileManager.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                ActionEvent ae = new ActionEvent(evt, WIDTH, "");
                pathFieldActionPerformed(ae);
            }
        }
    }//GEN-LAST:event_createFileMenuItemActionPerformed

    private void createFolderMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createFolderMenuItemActionPerformed
        if (pathField.getText().indexOf("System") != -1) {
            showErrorMessage("Попытка изменить файлы системы.", "Error");
        } else {

            String newName = JOptionPane.showInputDialog(workPanel, "Введите новое имя.");
            if (newName.length() > 255) {
                showErrorMessage("Вы ввели слышком длинное имя.", "Error");
            }

            if (newName.equals(null)) {
                return;
            }
            if (newName.equals("")) {
                showErrorMessage("Вы не ввели имя.", "Error");
            } else {
                File[] filesInDir = currentFile.listFiles();
                for (File filesInDir1 : filesInDir) {
                    if (filesInDir1.getName().equals(newName)) {
                        showErrorMessage("Файл с таким именем уже существует.", "Error");
                    }
                }
                try {
                    File newDir = new File(pathField.getText() + "/" + newName);

                    newDir.mkdir();
                    printToProtFile(newDir);

                } catch (IOException ex) {
                    Logger.getLogger(FileManager.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                ActionEvent ae = new ActionEvent(evt, WIDTH, "");
                pathFieldActionPerformed(ae);
            }
        }    }//GEN-LAST:event_createFolderMenuItemActionPerformed

    private void PFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PFButtonActionPerformed
        PFDialog.setVisible(true);
    }//GEN-LAST:event_PFButtonActionPerformed

    private void openProtokolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProtokolButtonActionPerformed
        if (desktop.isSupported(Desktop.Action.OPEN)) {
            try {
                desktop.open(protokolFile);

            } catch (IOException ex) {
                Logger.getLogger(FileManager.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_openProtokolButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileManager.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FileManager().setVisible(true);
            }
        });
        MyThread myThread = new MyThread();
        myThread.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton PFButton;
    private javax.swing.JDialog PFDialog;
    public static javax.swing.JTextArea PFTextArea;
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JButton backButton;
    private javax.swing.JMenuItem calculatorItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem createFileMenuItem;
    private javax.swing.JMenuItem createFolderMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JLabel filesLabel;
    private javax.swing.JList<String> filesList;
    private javax.swing.JScrollPane filesScrollPane;
    private javax.swing.JMenuItem helpItem;
    private javax.swing.JTextField infoField;
    private javax.swing.JLabel infoFileLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu listPopup;
    private javax.swing.JButton openInfoButton;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JButton openProtokolButton;
    private javax.swing.JMenu optionMenu;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JTextField pathField;
    private javax.swing.JLabel pathLabel;
    private javax.swing.JTextField protokolField;
    private javax.swing.JLabel protokolLabel;
    private javax.swing.JMenuItem renameMenuItem;
    private javax.swing.JMenuItem terminalItem;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
    private File currentFile;
    private String[] files;
    private Desktop desktop = Desktop.getDesktop();
    private File infoFile = new File("/home/user/NetBeansProjects/FileManager/sourcefiles/newfile.txt");
    private File protokolFile = new File("/home/user/NetBeansProjects/FileManager/sourcefiles/protokol/protokol.txt");
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private String copyFilePath;
    private File copyFile;

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
                "Error",
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

    private void printToProtFile(File file) throws IOException {
        fileWriter = new FileWriter(protokolFile, true);
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.append("Имя файла: " + file.getName() + " Время создания: " + LocalDateTime.now() + " Местонахождения: " + file.getPath());
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    private void copy(String sourcePath, String destinationPath) throws IOException {
        Files.copy(Paths.get(sourcePath), new FileOutputStream(destinationPath));
    }

    private static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();

    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                String output = "";
                try {
                    String line;
                    Process p = Runtime.getRuntime().exec(" ps -o min_flt,maj_flt 1");
                    BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                    while ((line = input.readLine()) != null) {
                        output += line;
                    }
                    input.close();

                    String[] string = output.replaceAll("[\\s]{2,}", " ").split(" ");
                    FileManager.PFTextArea.setText(string[1] + " " + string[3] + "\n" + string[2] + " " + string[4]);

                } catch (Exception err) {
                    err.printStackTrace();
                }
                sleep(5);
            }
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
