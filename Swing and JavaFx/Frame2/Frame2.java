import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame {
    MenuBar mbr;
    Menu m_file, m_color;
    MenuItem mi_red, mi_new, mi_close, mi_blue;
    Checkbox cb_study, cb_eat, cb_dance;
    Checkbox cb_male, cb_female;
    CheckboxGroup cbg_gender;
    Choice ch_semester;

    public MyFrame() {
        setSize(300, 400);
        setTitle("My Frame");
        setLayout(new FlowLayout());

        mbr = new MenuBar();

        // Create Menus
        m_color = new Menu("Color");
        m_file = new Menu("File");

        // Create MenuItems
        mi_new = new MenuItem("New");
        mi_close = new MenuItem("Close");
        mi_red = new MenuItem("Red");
        mi_blue = new MenuItem("Blue");

        // Add MenuItems to Menus
        m_color.add(mi_red);
        m_color.add(mi_blue);
        m_file.add(mi_new);
        m_file.add(mi_close);

        // Add Menus to MenuBar
        mbr.add(m_file);
        mbr.add(m_color);
        setMenuBar(mbr);

        // Create Checkboxes
        cb_eat = new Checkbox("Eating", true);
        cb_dance = new Checkbox("Dancing");
        cb_study = new Checkbox("Studying");

        // Add Checkboxes
        add(cb_eat);
        add(cb_dance);
        add(cb_study);

        // Radio buttons using CheckboxGroup
        cbg_gender = new CheckboxGroup();
        cb_male = new Checkbox("Male", false, cbg_gender);
        cb_female = new Checkbox("Female", false, cbg_gender);

        add(cb_male);
        add(cb_female);

        // Choice box (dropdown)
        ch_semester = new Choice();
        ch_semester.add("Select Semester");
        ch_semester.add("I");
        ch_semester.add("II");
        ch_semester.add("III");
        ch_semester.add("IV");
        ch_semester.add("V");
        ch_semester.add("VI");
        ch_semester.add("VII");
        ch_semester.add("VIII");

        add(ch_semester);

        setVisible(true);

        // 🚨 Important: Handle window close
        addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e) {
                System.exit(0);
           }
        });
    }
}

public class Frame2 {
    public static void main(String[] args) {
        new MyFrame();
    }
}
