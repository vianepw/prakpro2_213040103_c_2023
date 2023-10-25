/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author VIANE
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Latihan3 extends JFrame {

    private JTextArea outputTextArea;

    public Latihan3() { //konstruktor
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //membuat tampilan keluar
        JLabel headerLabel = new JLabel("Form Biodata", JLabel.CENTER);
        this.add(headerLabel, BorderLayout.PAGE_START);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setSize(300, 300);
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel formPanel = new JPanel(new GridBagLayout());
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        
        //label dan input nama
        JLabel nameLabel = new JLabel("Nama:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(nameLabel, gbc);

        JTextField nameField = new JTextField(5);
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(nameField, gbc);

        
        //label dan input nomor hp
        JLabel phoneLabel = new JLabel("Nomor HP:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(phoneLabel, gbc);

        JTextField phoneField = new JTextField(5);
        gbc.gridx = 0;
        gbc.gridy = 3;
        formPanel.add(phoneField, gbc);

        
        //label dan input jenis kelamin
        JLabel genderLabel = new JLabel("Jenis Kelamin:");
        gbc.gridx = 1;
        gbc.gridy = 0;
        formPanel.add(genderLabel, gbc);

        
        //mengelompokan jenis kelamin
        JRadioButton maleRadioButton = new JRadioButton("Laki-laki");
        gbc.gridx = 1;
        gbc.gridy = 1;
        formPanel.add(maleRadioButton, gbc);

        JRadioButton femaleRadioButton = new JRadioButton("Perempuan");
        gbc.gridx = 1;
        gbc.gridy = 2;
        formPanel.add(femaleRadioButton, gbc);

        
        //kotak check negara asing
        JCheckBox foreignCitizenCheckBox = new JCheckBox("Warga Negara Asing");
        gbc.gridx = 1;
        gbc.gridy = 3;
        formPanel.add(foreignCitizenCheckBox, gbc);

        //tombol simpan untuk hasil
        JButton saveButton = new JButton("Simpan");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(saveButton, gbc);

        mainPanel.add(formPanel, BorderLayout.CENTER);
        add(mainPanel);

        // Membuat JTextArea untuk menampilkan hasil
        outputTextArea = new JTextArea(10, 30);
        outputTextArea.setEditable(false); // Membuatnya tidak dapat diedit
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        formPanel.add(outputTextArea, gbc);

        // Menambahkan ActionListener ke tombol "Simpan"
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logika saat tombol "Simpan" ditekan
                String nama = nameField.getText();
                String nomorHP = phoneField.getText();
                String jenisKelamin = maleRadioButton.isSelected() ? "Laki-laki" : "Perempuan";
                String wnaStatus = foreignCitizenCheckBox.isSelected() ? "Ya" : "Bukan";

                // Menampilkan hasil di JTextArea
                outputTextArea.setText("Nama: " + nama + "\nNomor HP: " + nomorHP + "\nJenis Kelamin: " +
                        jenisKelamin + "\nWNA: " + wnaStatus);
            }
        });

        pack();
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Latihan3 form = new Latihan3();
            form.setVisible(true);
        });
    }
}
    
    
    
    
    