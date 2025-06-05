import java.awt.*;

class Demo extends Frame {
    Button btn_OK;
    MenuBar mb;
    Menu mFile, mFont, mColor;
    MenuItem miNew, miClose;
    MenuItem miFont1, miFont2, miFont3;
    MenuItem miRed, miGreen;
    Panel pTop, pMiddle, upper, pBottom, pGender, pMarital;
    Label lbl_maritalstatus, lbl_name, lbl_lastname, lbl_Gender, lblcomment, lblhobby;
    Choice ch;
    TextField txtname, txtln;
    TextArea txtcom;
    Font fon = new Font("Arial", Font.BOLD, 11);
    Font fon1 = new Font("Arial", Font.ITALIC, 11);
    Font fon0 = new Font("Arial", Font.PLAIN, 11);

    public Demo() {
        super("This is my first Frame");
        setSize(700, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        setBackground(Color.RED);
        setLayout(null);
        setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Menu setup
        mb = new MenuBar();
        setMenuBar(mb);

        mFile = new Menu("File");
        mFont = new Menu("Font");
        mColor = new Menu("Color");

        mb.add(mFile);
        mb.add(mFont);
        mb.add(mColor);

        miNew = new MenuItem("New");
        miClose = new MenuItem("Close");

        mFile.add(miNew);
        mFile.addSeparator();
        mFile.add(miClose);

        miFont1 = new MenuItem("Arial-Bold");
        miFont2 = new MenuItem("Arial-Italic");
        miFont3 = new MenuItem("Arial-Normal");

        mFont.add(miFont1);
        mFont.addSeparator();
        mFont.add(miFont2);
        mFont.addSeparator();
        mFont.add(miFont3);

        miRed = new MenuItem("Red");
        miGreen = new MenuItem("Green");

        mColor.add(miRed);
        mColor.addSeparator();
        mColor.add(miGreen);

        // Panel Setup
        pTop = new Panel();
        pTop.setLayout(null);
        pTop.setBounds(10, 50, 680, 290);
        pTop.setBackground(Color.GREEN);

        // Top Section
        upper = new Panel(null);
        upper.setBackground(Color.WHITE);
        upper.setBounds(5, 5, 670, 60);

        ch = new Choice();
        ch.setBounds(10, 10, 100, 20);
        ch.add("Choose");
        ch.add("Mr");
        ch.add("Miss");
        ch.add("Mrs");

        lbl_name = new Label("First Name");
        lbl_name.setFont(fon);
        lbl_name.setBounds(120, 10, 70, 20);

        txtname = new TextField();
        txtname.setBounds(200, 10, 150, 20);

        lbl_lastname = new Label("Last Name");
        lbl_lastname.setFont(fon);
        lbl_lastname.setBounds(360, 10, 70, 20);

        txtln = new TextField();
        txtln.setBounds(440, 10, 150, 20);

        upper.add(ch);
        upper.add(lbl_name);
        upper.add(txtname);
        upper.add(lbl_lastname);
        upper.add(txtln);

        pTop.add(upper);

        // Gender panel
        pGender = new Panel();
        pGender.setBounds(5, 70, 670, 30);
        pGender.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        pGender.setBackground(Color.WHITE);

        lbl_Gender = new Label("Gender");
        pGender.add(lbl_Gender);

        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox cbMale = new Checkbox("Male", genderGroup, false);
        Checkbox cbFemale = new Checkbox("Female", genderGroup, false);

        pGender.add(cbMale);
        pGender.add(cbFemale);

        pTop.add(pGender);

        // Marital Status
        pMarital = new Panel();
        pMarital.setBounds(5, 105, 670, 30);
        pMarital.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        pMarital.setBackground(Color.WHITE);

        lbl_maritalstatus = new Label("Marital Status");
        pMarital.add(lbl_maritalstatus);

        CheckboxGroup maritalGroup = new CheckboxGroup();
        Checkbox cbMarried = new Checkbox("Married", maritalGroup, false);
        Checkbox cbUnmarried = new Checkbox("Unmarried", maritalGroup, false);

        pMarital.add(cbMarried);
        pMarital.add(cbUnmarried);

        pTop.add(pMarital);

        // Hobbies
        pMiddle = new Panel();
        pMiddle.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        pMiddle.setBounds(5, 140, 670, 30);
        pMiddle.setBackground(Color.RED);

        lblhobby = new Label("Hobbies");
        lblhobby.setForeground(Color.WHITE);
        pMiddle.add(lblhobby);

        Checkbox cbSinging = new Checkbox("Singing");
        Checkbox cbDancing = new Checkbox("Dancing");
        Checkbox cbStudying = new Checkbox("Studying");
        Checkbox cbEating = new Checkbox("Eating");

        pMiddle.add(cbSinging);
        pMiddle.add(cbDancing);
        pMiddle.add(cbStudying);
        pMiddle.add(cbEating);

        pTop.add(pMiddle);

        // Comment box
        pBottom = new Panel();
        pBottom.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        pBottom.setBounds(5, 175, 670, 100);
        pBottom.setBackground(Color.WHITE);

        lblcomment = new Label("Comment");
        pBottom.add(lblcomment);

        txtcom = new TextArea(4, 80);
        pBottom.add(txtcom);

        pTop.add(pBottom);

        // OK button
        btn_OK = new Button("OK");
        btn_OK.setBounds(300, 280, 50, 25);
        pTop.add(btn_OK);

        add(pTop);
        setVisible(true);
    }

    public static void main(String[] str) {
        new Demo();
    }
}