import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener,KeyListener{
    String s= "";
    Boolean opCond=true;
    Calculator()
    {
    Frame f= new Frame("Calculator");
    TextField t1=new TextField("");
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,bs,bm,bd,br,bc,bdc,bpl,bpr;
    
    b0= new Button("0");                                                           
    b1= new Button("1");                                                      
    b2= new Button("2");
    b3= new Button("3");
    b4= new Button("4");
    b5= new Button("5");
    b6= new Button("6");
    b7= new Button("7");
    b8= new Button("8");
    b9= new Button("9");
    bp= new Button("+");
    bs= new Button("-");
    bm= new Button("x");
    bd= new Button("/");
    br= new Button("=");
    bc= new Button("CE");
    bdc= new Button(".");
    bpl= new Button("(");
    bpr= new Button(")");
    
    t1.setBounds(30, 50 , 210, 30);
    
    b1.setBounds(30,100,45,35);
    b2.setBounds(85,100,45,35);
    b3.setBounds(140,100,45,35);
    bp.setBounds(195,100,45,35);
    b4.setBounds(30,145,45,35);
    b5.setBounds(85,145,45,35);
    b6.setBounds(140,145,45,35);
    bs.setBounds(195,145,45,35);
    b7.setBounds(30,190,45,35);
    b8.setBounds(85,190,45,35);
    b9.setBounds(140,190,45,35);    
    bm.setBounds(195,190,45,35);
    b0.setBounds(30,235,100,35);
    bdc.setBounds(140,235,45,35);
    bd.setBounds(195,235,45,35);
    br.setBounds(195,280,45,35);
    bc.setBounds(140,280,45,35);
    bpl.setBounds(30,280,45,35);
    bpr.setBounds(85,280,45,35);
    
    b0.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e)
    {
    s=s+"0";
    t1.setText(s);
    opCond=false;
    }
    });
    b1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    s=s+"1";
    t1.setText(s);
    opCond=false;
    }
    });
    b2.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    s=s+"2";
    t1.setText(s);
    opCond=false;
    }
    });
    b3.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    s=s+"3";
    t1.setText(s);
    opCond=false;
    }
    });
    b4.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    s=s+"4";
    t1.setText(s);
    opCond=false;
    }
    });
    b5.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    s=s+"5";
    t1.setText(s);
    opCond=false;
    }
    });
    b6.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    s=s+"6";
    t1.setText(s);;
    opCond=false;
    }
    });
    b7.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    s=s+"7";
    t1.setText(s);
    opCond=false;
    }
    });
    b8.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        
        s=s+"8";
    t1.setText(s);
    opCond=false;
    }
    });
    b9.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    s=s+"9";
    t1.setText(s);
    opCond=false;
    }
    });
    bp.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == bp)
        { 
            if(!opCond)
            {
                s=s+" + ";
        t1.setText(s);
        opCond = true;
            }
        }
        
  
    
    }
    });
    bs.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
   if(e.getSource() == bs)
        { 
            if(!opCond)
            {
                s=s+" - ";
        t1.setText(s);
        opCond = true;
            }
        }
    }
    });
    bm.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    if(e.getSource() == bm)
        { 
            if(!opCond)
            {
                s=s+" * ";
        t1.setText(s);
        opCond = true;
            }
        }
    }
    });
    bd.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    if(e.getSource() == bd)
        { 
            if(!opCond)
            {
                s=s+" / ";
        t1.setText(s);
        opCond = true;
            }
        }
    }
    });
    bdc.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    if(e.getSource() == bp)
        { 
            if(!opCond)
            {
                s=s+" + ";
        t1.setText(s);
        opCond = true;
            }
        }
    }
    });
    
    br.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    s=t1.getText();
    t1.setText(""+EvaluateString.evaluate(s.trim()));
    }});
   
    bc.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    s="";
    t1.setText(s);
    }
    });
    
    bpl.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    if(e.getSource() == bp)
        { 
            if(!opCond)
            {
                s=s+" ( ";
        t1.setText(s);
        opCond = true;
            }
        }
    }
    });
    
    bpr.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
   if(e.getSource() == bp)
        { 
            if(!opCond)
            {
                s=s+" ) ";
        t1.setText(s);
        opCond = true;
            }
        }
    }
    });
    
    t1.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent e) {
             
             if ((e.getKeyChar() >= '0' && e.getKeyChar() <= '9') || e.getKeyChar() == 32 || e.getKeyChar() == 8  )  {
               t1.setEditable(true);
               opCond=false;
               
            } else if(e.getKeyChar() <= 47 && e.getKeyChar() >=42 )
            {  
                if(!opCond)
                {
        t1.setEditable(true);            
        opCond = true;
        
            }
                else{
                t1.setEditable(false);           
                }
               
               
            }        
            
             else {
               t1.setEditable(false);  
        }
             if (e.getKeyCode()==KeyEvent.VK_ENTER) {
                 s=t1.getText();
                 t1.setText(""+EvaluateString.evaluate(s.trim()));
            }
         }
      });
    
    f.addKeyListener(this);
    
    f.add(t1);
    f.add(b0);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(bp);
    f.add(bs);
    f.add(bm);
    f.add(bd);
    f.add(br);
    f.add(bc);
    f.add(bdc);
    f.add(bpl);
    f.add(bpr);
    
    f.setLayout(null);
    f.setSize(270,400); 
    f.setVisible(true);
    f.setBackground(Color.darkGray);
    f.addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent we){
    System.exit(0);
    }
    });
}

    public static void main(String[] args){
    Calculator c= new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}

