package se.sahlgrenska.gui.Journal;

import se.sahlgrenska.gui.util.HelperGUI;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class JournalGUI extends HelperGUI {


    private JPanel MainPanel;
    private JPanel TopPanel;
    private JLabel JournalTitleLabel;
    private JPanel LeftPanel;
    private JPanel DataListPanel;
    private JLabel JournalDataLabel;
    private JLabel DiseaseDataLabel;
    private JPanel ButtonPanel;
    private JButton RaderaButton;
    private JButton ÅngraButton;
    private JButton SparaButton;
    private JButton AvbrytButton;
    private JPanel CommentPanel;
    private JTextArea KommentarTextArea;
    private JLabel KommentarLabel;
    private JPanel InputPanel;
    private JTextField NamnTextField;
    private JTextField PersonNummerTextField;
    private JTextField TelefonNummerTextField;
    private JComboBox SjukdomComboBox;
    private JTextField TillståndTextField;
    private JTextField RumTextField;
    private JTextField LäkareTextField;
    private JLabel NamnLabel;
    private JLabel PersonNummerLabel;
    private JLabel TelefonNummerLabel;
    private JLabel SjukdomLabel;
    private JLabel TillståndLabel;
    private JLabel RumLabel;
    private JLabel LäkareLabel;
    private JList JournalDataList;
    private JList DiseaseDataList;
    private JScrollPane JournalDataScrollPane;
    private JScrollPane DiseaseDataScrollPane;

    public JournalGUI() {
        init(MainPanel, "Create Journal");
    }

}