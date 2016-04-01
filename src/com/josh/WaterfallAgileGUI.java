package com.josh;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by ec0662sr on 3/31/2016.
 */
public class WaterfallAgileGUI extends JFrame {
    private JTextField projectNameTextField;
    private JCheckBox check20ProgrammersCheckBox;
    private JCheckBox checkStrictDeadlineslCheckBox;
    private JCheckBox checkOtherDutiesCheckBox;
    private JCheckBox checkDifferentLocationsCheckBox;
    private JCheckBox checkStringentQualityCheckBox;
    private JCheckBox checkEarlyAccessCheckBox;
    private JButton recommendButton;
    private JPanel rootPanel;
    private JLabel recommendationLabel;
    private JLabel projectNameLabel;
    private boolean check20Programmers;
    private boolean checkStrictDealines;
    private boolean checkOtherDuties;
    private boolean checkDifferentLocations;
    private boolean checkStringentQuality;
    private boolean checkEarlyAccess;
    //private String projectTextBox;
    int counter;


    public WaterfallAgileGUI() {

        super("Waterfall or Agile");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


        check20ProgrammersCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                check20Programmers = check20ProgrammersCheckBox.isSelected();
            }
        });
        checkStrictDeadlineslCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                checkStrictDealines = checkStrictDeadlineslCheckBox.isSelected();
            }
        });
        checkOtherDutiesCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                checkOtherDuties = checkOtherDutiesCheckBox.isSelected();
            }
        });
        checkDifferentLocationsCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                checkDifferentLocations = checkDifferentLocationsCheckBox.isSelected();
            }
        });
        checkStringentQualityCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                checkStringentQuality = checkStringentQualityCheckBox.isSelected();
            }
        });
        checkEarlyAccessCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                checkEarlyAccess = checkEarlyAccessCheckBox.isSelected();
            }
        });
        recommendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String projectTextBox = projectNameTextField.getText();

                if (check20Programmers == true) {
                    counter++;
                }
                if (checkStrictDealines == true) {
                    counter++;
                }
                if (checkOtherDuties == true) {
                    counter++;
                }
                if (checkDifferentLocations == true) {
                    counter++;
                }
                if (checkStringentQuality == true) {
                    counter++;
                }
                if (checkEarlyAccess == true) {
                    counter++;
                }

                String surveyResult = agileOrWaterfall(counter, projectTextBox);
                recommendationLabel.setText(surveyResult);

            }
        });

    }

    private static String agileOrWaterfall(int counter, String projectTextBox) {

        if (counter >= 4) {
            String surveyResult = ("I think you should use the Waterfall method for the " + projectTextBox);
            return surveyResult;
        } else {
            String surveyResult = ("I think you should use the Agile method for the " + projectTextBox);
            return surveyResult;
        }

    }
}

