package se.sahlgrenska.gui.Booking;

import se.sahlgrenska.gui.util.HelperGUI;
import se.sahlgrenska.main.Driver;
import se.sahlgrenska.sjukhus.Booking;
import se.sahlgrenska.sjukhus.person.employee.Accessibility;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BookingGUI extends HelperGUI {

    private JPanel mainPanel;
    private JPanel bannerPanel;
    private JPanel bookingPanel;
    private JLabel userLbl;
    private JLabel titleLbl;
    private JLabel userOutLbl;
    private JLabel dateOutLbl;
    private JPanel menuPanel;
    private JPanel rightPanel;
    private JPanel leftPanel;
    private JPanel bottomPanel;
    private JTextArea noteTxtArea;
    private JLabel noteLbl;
    private JPanel noteTxtAreaPanel;
    private JPanel bookingBtnPanel;
    private JButton cancelBtn;
    private JButton createBtn;
    private JTextField patPersNrTxtField;
    private JLabel persLbl;
    private JPanel persNrFieldPanel;
    private JTextField bookingDateTxtField;
    private JLabel bookingDateLbl;
    private JPanel bookingFieldPanel;
    private JComboBox bookingDurationComboBox;
    private JPanel bookingDurationFieldPanel;
    private JLabel bookingDurationLbl;
    private JList participationList;
    private JButton addPartBtn;
    private JButton removePartBtn;
    private JLabel participationListLbl;
    private JPanel participationPanel;
    private JPanel bookingLocationPanel;
    private JPanel wardPanel;
    private JPanel roomPanel;
    private JComboBox wardComboBox;
    private JComboBox roomComboBox;
    private JLabel wardLbl;
    private JLabel roomLbl;
    private JPanel neededItemsPanel;
    private JTable itemsTable;
    private JButton addItemsBtn;
    private JButton removeItemsBtn;
    private JPanel titlePanel;
    private LocalDateTime date;


    private Booking booking;
    private int minWindowSize = 600;
    private int maxWindowSize = 700;




    public BookingGUI() {
        init(mainPanel, "Skapa bokning", new Dimension(minWindowSize, maxWindowSize), Accessibility.RECEPTIONIST);
      //  this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      //this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Använder denna sålänge för smidigare under testning men ska vara dispose egentligen
     //   setResizable(false);
        formatDate();

        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Driver.getMainMenu().setVisible(true);
            }
        });

    }


    public String getColumnName(String[] colNames,int index) {
        return colNames[index];
    }


    private void formatDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        dateOutLbl.setText(dtf.format(LocalDateTime.now()));
      //  mainPanel.setBorder(new EmptyBorder(100, 100, 100, 100));

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        String [] columns = {"Item name","Quantity"};
        String [][] data = {{"Defibrilator","5"},{"MRI","2"},{"Panodil", "10"}};
        itemsTable = new JTable(data,columns);

    }
}
