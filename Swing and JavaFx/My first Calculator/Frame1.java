import java.awt.*;
class Calculator extends Frame {
   Label lbl_fn, lbl_sn, lbl_res;
   TextField txt_fn, txt_sn, txt_res;
   Button btn_add;
   public Calculator(){
      lbl_fn = new Label("FN:");
      lbl_sn = new Label("SN:");
      lbl_res = new Label("RES:");

      txt_fn = new TextField();
      txt_sn = new TextField();
      txt_res = new TextField();

      btn_add = new Button("ADD");

      setTitle("My First Calculator");
      setSize(200,300);
      setLayout(null);
      lbl_fn.setBounds(10,50,50,20);
      add(lbl_fn);
      txt_fn.setBounds(60,50,100,20);
      add(txt_fn);
      lbl_sn.setBounds(10,80,50,20);
      add(lbl_sn);
      txt_sn.setBounds(60,80,100,20);
      add(txt_sn);
      lbl_res.setBounds(10,110,50,20);
      add(lbl_res);
      txt_res.setBounds(60,110,100,20);
      add(txt_res);
      btn_add.setBounds(10,140,160,20);
      add(btn_add);
      setVisible(true);
   }
}
class Frame1{
  public static void main(String[] args){
     new Calculator();
  }
}