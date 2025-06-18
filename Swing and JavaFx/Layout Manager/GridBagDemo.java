import java.awt.*;

class MyFrame extends Frame {
    GridBagLayout glayout;
    GridBagConstraints cons;
    Button btn_add;
    Label lbl_fn, lbl_sn, lbl_res;
    TextField txt_fn, txt_sn, txt_res;

    public MyFrame() {
        glayout = new GridBagLayout();
        cons = new GridBagConstraints();

        lbl_fn = new Label("FN:");
        lbl_sn = new Label("SN:");
        lbl_res = new Label("RES:");

        txt_fn = new TextField(20);
        txt_sn = new TextField(20);
        txt_res = new TextField(20);
        btn_add = new Button("ADD");

        setSize(400, 200);
        setLayout(glayout);

        cons.insets = new Insets(5, 5, 5, 5); // Add spacing between components

        // Row 0: FN
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.NONE;
        add(lbl_fn, cons);

        cons.gridx = 1;
        cons.gridy = 0;
        cons.gridwidth = 2;
        cons.fill = GridBagConstraints.HORIZONTAL;
        add(txt_fn, cons);

        // Row 1: SN
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.NONE;
        add(lbl_sn, cons);

        cons.gridx = 1;
        cons.gridy = 1;
        cons.gridwidth = 2;
        cons.fill = GridBagConstraints.HORIZONTAL;
        add(txt_sn, cons);

        // Row 2: RES
        cons.gridx = 0;
        cons.gridy = 2;
        cons.gridwidth = 1;
        cons.fill = GridBagConstraints.NONE;
        add(lbl_res, cons);

        cons.gridx = 1;
        cons.gridy = 2;
        cons.gridwidth = 2;
        cons.fill = GridBagConstraints.HORIZONTAL;
        add(txt_res, cons);

        // Row 3: ADD Button
        cons.gridx = 0;
        cons.gridy = 3;
        cons.gridwidth = 3;
        cons.fill = GridBagConstraints.HORIZONTAL;
        add(btn_add, cons);

        // Handle close window event
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }
}

public class GridBagDemo {
    public static void main(String[] args) {
        new MyFrame();
    }
}
