

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import net.java.dev.designgridlayout.DesignGridLayout;

public class iteration {
    DesignGridLayout field_panel_layout,answer_panel_layout;
    JPanel field_panel,answer_panel;
    JButton calculate,cancel,pdf_button;
    JScrollPane scrollPane;
    String  text,get_p_value,get_u_value,get_h_value,get_k_value,get_x_value,get_g_value,get_l_value,get_v_value,get_t_value,get_m1,get_m2,
   get_m3,get_m4,get_m5,get_m6, border_text,get_ds_value,get_d50_value;
    JTextField text_file,p_value,u_value,h_value,k_value,x_value,g_value,l_value,t_value,v_value,
    m4_value,m1_value,m2_value,m3_value,m5_value,m6_value,ds_value,d50_value;
    TitledBorder titled_border;
    JFrame frame;
    JTextArea textarea;
     String desktop_path= System.getProperty("user.home") + "/Desktop";
     boolean velocity = true;


    JLabel text_label,p_label,u_label,h_label,k_label,x_label,g_label,l_label,v_label,t_label,m1_label,m2_label,m3_label,m4_label,m5_label,m6_label,invalid;
    static double random;
    static double f2447=0;
      static double  f2446 = 0;
   static double [] range = {-2.5,-2.4,-2.3,-2.2,-2.1,-2.0,2.1,2.2,2.3,2.4,2.5};
   static int randomInt;
   double p, u, h, k, x, w1, i,v, l,m1,m2,m3,m4,m5,m6,ds,d50,g;
    static double c,e,w,n,s,a,b,z,t;

  // static double t=1.2;
   public static int randInt(int min, int max) {
    // Usually this can be a field rather than a method variable
    Random rand = new Random();
     int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
              String answers;

   private static String data;
    double [] f_values = getArray();
       double doubleResult=0;
Calculate calc = new Calculate();

   protected class Calculate implements ActionListener{
    public void actionPerformed(ActionEvent ae){
         //    double c,e,w,n,s,a,b;

    get_p_value=p_value.getText();
    get_u_value=u_value.getText();
    get_h_value=h_value.getText();
    get_g_value=g_value.getText();
    get_k_value=k_value.getText();
    get_x_value=x_value.getText();
    get_l_value=l_value.getText();
    get_v_value=v_value.getText();
    get_t_value=t_value.getText();
    text = text_file.getText();

    get_ds_value=ds_value.getText();
    get_d50_value=d50_value.getText();

    get_m1=m1_value.getText();
    get_m2=m2_value.getText();
    get_m3=m3_value.getText();
    get_m4=m4_value.getText();
     get_m5=m5_value.getText();
    get_m6=m6_value.getText();

    if((!get_p_value.equalsIgnoreCase(""))&&
        (!get_u_value.equalsIgnoreCase(""))&&
        (!get_h_value.equalsIgnoreCase(""))&&
        (!get_k_value.equalsIgnoreCase(""))&&
        (!get_l_value.equalsIgnoreCase(""))&&
        (!get_x_value.equalsIgnoreCase(""))&&
        (!get_g_value.equalsIgnoreCase(""))&&
        (!get_l_value.equalsIgnoreCase(""))&&
        (!get_v_value.equalsIgnoreCase(""))&&
        (!text.equalsIgnoreCase(""))&&
        (!get_t_value.equalsIgnoreCase(""))
         )
    {
        p = Double.parseDouble(get_p_value);
        u = Double.parseDouble(get_u_value);
        h = Double.parseDouble(get_h_value);
        k = Double.parseDouble(get_k_value);
        x=  Double.parseDouble(get_x_value);
        l = Double.parseDouble(get_l_value);
        v = Double.parseDouble(get_v_value);
        t = Double.parseDouble(get_t_value);
        g = Double.parseDouble(get_g_value);
        m1 = Double.parseDouble(get_m1);
        m2 = Double.parseDouble(get_m2);
        m3 = Double.parseDouble(get_m3);
        m4 = Double.parseDouble(get_m4);
        m5 = Double.parseDouble(get_m5);
        m6 = Double.parseDouble(get_m6);
        ds = Double.parseDouble(get_ds_value);
       d50 = Double.parseDouble(get_d50_value);
                w1=(-u) +(-v);

       // f2447=getvalue(randomValue());
       if (velocity == true){
         c = ((2*p/Math.pow (h, 2)) + (2*p)/ (Math.pow (k, 2)) + (2*p/ (Math.pow(l,2))));
         e = ((u/ (2*h)) + (p)/ (Math.pow (h, 2)) - (0.2*(Math.pow(u, 2))/4) + (9.81*(Math.sin(x))/2))*g;
	 w = (((-u)/ (2*h)) + (p)/ (Math.pow(h, 2))- ((0.2*(Math.pow(u, 2)))/4) + ((9.81*(Math.sin(x)))/2))*g ;
	 n =(((v)/ (2*k)-(p)/ (Math.pow(k,2))))*g;
	 s =(((-v)/ (2*k))-(p)/ (Math.pow(k,2)))*g;
	 a = (((w1)/ (2*l))-(p)/ (Math. pow(l,2)))*g;
         b = (((-w1)/ (2*l))-(p)/ (Math.pow(l,2)))*g;
        }
 else if (velocity == false){

         c = 0.9*ds/(Math.pow (h, 2))+0.9*ds/(Math.pow (k,2)) + 0.42* ds/(Math.pow (l,2));
         e =  u/(2*h) - (0.45*ds)/(Math.pow (h,2));
 	 w = -u/(2*h)-(0.45*ds)/(Math.pow(h,2));
	 n = v/(2*k) + (0.45*ds)/(2*(Math.pow(k,2)));
	 s = -v/(2*k) + (0.45*ds)/(2*(Math.pow(k,2)));
	 a = w1/(2*l)-(0.21*ds)/(Math.pow(l,2))-((Math.sqrt((4*9.81*(1-0.5)*d50)/( 3*0.34)))/(2*l));
         b = -w1/(2*l) -(0.21*ds)/(Math.pow(l,2))+((Math.sqrt((4*9.81*(1-0.5)*d50)/( 3*0.34)))/(2*l));

 }
        field_panel.setVisible(false);
        frame.remove(field_panel);

                try {
                    set_answer_panel().setVisible(true);
                } catch (ScriptException ex) {
                    ex.printStackTrace();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                try {
                    frame.add(set_answer_panel(), BorderLayout.CENTER);
                } catch (ScriptException ex) {
                    ex.printStackTrace();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
/*System.out.println("Calculation loading");
System.out.printf("%f",c);
System.out.printf("%f",e);
System.out.printf("%f",w);
System.out.printf("%f",n);
System.out.printf("%f",s);
System.out.printf("%f",a);
System.out.printf("%f",b);*/

    }
 else{
   // System.out.println("invalid inputs");
    invalid.setText("INVALID INPUT");
 }
       }
   }

    private TitledBorder setTitledBorder(String title){
LineBorder lineborder=new LineBorder(Color.WHITE);
titled_border=new TitledBorder(lineborder);
  titled_border.setTitle(title);
    titled_border.setTitleColor(Color.white);
    //titled_border.setTitleFont();
    return titled_border;
    }
    
     CloseWindow closewindow=new CloseWindow();


    protected class CloseWindow extends WindowAdapter{
    public void windowClosing(WindowEvent e){
int confirm=JOptionPane.showConfirmDialog(frame,"<html><u><font color='white'>Sure To Exit?<font></u></html>"
        ,"Confirm Exit",JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
        frame.dispose();
     }
    }
    }

    private JButton set_pdf_button(){
    pdf_button = new JButton("BACK");
     pdf_button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionevent)
            {
                scrollPane.setVisible(false);
              field_panel.setVisible(true);
    frame.add(field_panel,BorderLayout.CENTER);
            }
        });
    return pdf_button;
    }

    private JScrollPane set_answer_panel() throws ScriptException, FileNotFoundException{
answer_panel=new JPanel();
answer_panel.setBorder(setTitledBorder("<html><i><b>COEFFICIENTS</b></i></html>"));
answer_panel.setBackground(Color.green);
 scrollPane = new JScrollPane(answer_panel,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

answer_panel_layout=new DesignGridLayout(answer_panel);
  Scanner fScn = new Scanner(new File(desktop_path + "\\" +text+".txt"));
ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            engine.put("t",t);
            engine.put("n",n);
            engine.put("a",a);
            engine.put("e",e);
            engine.put("c",c);
            engine.put("w",w);
            engine.put("s",s);
            engine.put("b",b);
             engine.put("m1",m1);
             engine.put("m2",m2);
             engine.put("m3",m3);
             engine.put("m4",m4);
             engine.put("m5",m5);
             engine.put("m6",m6);

                  for (int i=0; i<f_values.length; i++){
                        engine.put("f"+i,f_values[i]);
                  }


            double eqn=(w*3.928571 - e*t - n*t - a*t)/(c);
            //System.out.printf("f3 = %f\n",eqn);
            int i=1;
             Date dNow = new Date( );
           SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a");

     // System.out.println("Current Date: " + ft.format(dNow));
                   answer_panel_layout.row().grid(new JLabel("Time :")).add(new JLabel( ft.format(dNow)));
            
             PrintWriter writer = new PrintWriter(desktop_path + "\\values.txt");
            // PrintWriter writer = new PrintWriter("C:\\Users\\CHRISGEEK\\Documents\\test.txt");
int counter=1;
        while( fScn.hasNextLine() ){
           data = fScn.nextLine();
      //System.out.println(engine.eval(data));
 //       System.out.print(data + "\n");
             answers = engine.eval(data).toString();
            doubleResult = Double.parseDouble(answers);
            //System.out.printf("%f\n",doubleResult);
            writer.println("f"+ String.valueOf(counter++) + " ="+doubleResult);
            answer_panel_layout.row().grid(new JLabel("f"+ String.valueOf(i++) + " =")).add(new JLabel(String.valueOf(doubleResult)));

            
            //System.out.printf("f1 = %f\n",f1);
}
            answer_panel_layout.row().center().add(set_pdf_button());
        fScn.close();
            writer.close();
        System.out.printf("%f\n",f3);

double final_result = Double.parseDouble(answers);
        return scrollPane;
    }
private JPanel set_field_panel(){
    calculate=new JButton("CALCULATE");
   calculate.addActionListener(calc);
    cancel=new JButton("CANCEL");
p_value=new JTextField();
u_value=new JTextField();
h_value=new JTextField();
k_value=new JTextField();
x_value=new JTextField();
g_value=new JTextField();
l_value=new JTextField();
v_value=new JTextField();
t_value=new JTextField();
ds_value=new JTextField("ds value");
d50_value=new JTextField("d50 value");
text_file=new JTextField("Enter equation file");
m1_value=new JTextField("m1 value");
m2_value=new JTextField("m2 value");
m3_value=new JTextField("m3 value");
m4_value=new JTextField("m4 value");
m5_value=new JTextField("m5 value");
m6_value=new JTextField("m6 value");
p_label=new JLabel("p value");
u_label=new JLabel("u value");
h_label=new JLabel("h value");
k_label=new JLabel("k value");
x_label=new JLabel("x value");
g_label=new JLabel("g value");
l_label=new JLabel("l value");
v_label=new JLabel("v value");
m1_label=new JLabel("m1 value");
m2_label=new JLabel("m2 value");
m3_label=new JLabel("m3 value");
m4_label=new JLabel("m4 value");
m5_label=new JLabel("m5 value");
m6_label=new JLabel("m6 value");

invalid=new JLabel();
text_label= new JLabel("Text File");
textarea=new JTextArea(10,50);
textarea.setText("Enter Equations");
textarea.setToolTipText("equations go here");
t_label=new JLabel("t value");
field_panel=new JPanel();
border_text = "<html><i><b>VELOCITY EQUATION</b></i></html>";

field_panel.setBorder(setTitledBorder(border_text));
field_panel.setBackground(Color.green);
field_panel_layout=new DesignGridLayout(field_panel);
field_panel_layout.row().center().add(invalid);
field_panel_layout.row().grid(p_label).add(p_value).add(m1_value);
field_panel_layout.row().grid(u_label).add(u_value).add(m2_value);
field_panel_layout.row().grid(h_label).add(h_value).add(m3_value);
field_panel_layout.row().grid(k_label).add(k_value).add(m4_value);
field_panel_layout.row().grid(x_label).add(x_value).add(m5_value);
field_panel_layout.row().grid(l_label).add(l_value).add(m6_value);
field_panel_layout.row().grid(v_label).add(v_value).add(ds_value);
field_panel_layout.row().grid(g_label).add(g_value).add(d50_value);
field_panel_layout.row().grid(t_label).add(t_value);
field_panel_layout.row().grid(text_label).add(text_file);
field_panel_layout.row().right().add(cancel).add(calculate);
return field_panel;
    }
public JPanel get_field_panel (){
return set_field_panel();
}
       public static double getvalue(){
        return f2447=range[randInt(0,10)];
       }
//dummy f0
static	double	f0	=	0	;

//astatic	double	f1	=	t	;
static	double	f2	=	t	;
static	double	f3	=	t	;
static	double	f4	=	t	;
static	double	f5	=	t	;
static	double	f6	=	t	;
static	double	f7	=	t	;
static	double	f8	=	t	;
static	double	f9	=	t	;
static	double	f10	=	t	;
static	double	f11	=	t	;
static	double	f12	=	t	;
static	double	f13	=	t	;
static	double	f14	=	t	;
static	double	f15	=	t	;
static	double	f16	=	t	;
static	double	f17	=	t	;
static	double	f18	=	t	;
static	double	f19	=	t	;
static	double	f20	=	t	;
static	double	f21	=	t	;
static	double	f22	=	t	;
static	double	f23	=	t	;
static	double	f24	=	t	;
static	double	f25	=	t	;
static	double	f26	=	t	;
static	double	f27	=	t	;
static	double	f28	=	t	;
static	double	f29	=	t	;
static	double	f30	=	t	;
static	double	f31	=	t	;
static	double	f32	=	t	;
static	double	f33	=	t	;
static	double	f34	=	t	;
static	double	f35	=	t	;
static	double	f36	=	t	;
static	double	f37	=	t	;
static	double	f38	=	t	;
static	double	f39	=	t	;
static	double	f40	=	t	;
static	double	f41	=	t	;
static	double	f42	=	t	;
static	double	f43	=	t	;
static	double	f44	=	t	;
static	double	f45	=	t	;
static	double	f46	=	t	;
static	double	f47	=	t	;
static	double	f48	=	t	;
static	double	f49	=	t	;
static	double	f50	=	t	;
static	double	f51	=	t	;
static	double	f52	=	t	;
static	double	f53	=	t	;
static	double	f54	=	t	;
static	double	f55	=	t	;
static	double	f56	=	t	;
static	double	f57	=	t	;
static	double	f58	=	t	;
static	double	f59	=	t	;
static	double	f60	=	t	;
static	double	f61	=	t	;
static	double	f62	=	t	;
static	double	f63	=	t	;
static	double	f64	=	t	;
static	double	f65	=	t	;
static	double	f66	=	t	;
static	double	f67	=	t	;
static	double	f68	=	t	;
static	double	f69	=	t	;
static	double	f70	=	t	;
static	double	f71	=	t	;
static	double	f72	=	t	;
static	double	f73	=	t	;
static	double	f74	=	t	;
static	double	f75	=	t	;
static	double	f76	=	t	;
static	double	f77	=	t	;
static	double	f78	=	t	;
static	double	f79	=	t	;
static	double	f80	=	t	;
static	double	f81	=	t	;
static	double	f82	=	t	;
static	double	f83	=	t	;
static	double	f84	=	t	;
static	double	f85	=	t	;
static	double	f86	=	t	;
static	double	f87	=	t	;
static	double	f88	=	t	;
static	double	f89	=	t	;
static	double	f90	=	t	;
static	double	f91	=	t	;
static	double	f92	=	t	;
static	double	f93	=	t	;
static	double	f94	=	t	;
static	double	f95	=	t	;
static	double	f96	=	t	;
static	double	f97	=	t	;
static	double	f98	=	t	;
static	double	f99	=	t	;
static	double	f100	=	t	;
static	double	f101	=	t	;
static	double	f102	=	t	;
static	double	f103	=	t	;
static	double	f104	=	t	;
static	double	f105	=	t	;
static	double	f106	=	t	;
static	double	f107	=	t	;
static	double	f108	=	t	;
static	double	f109	=	t	;
static	double	f110	=	t	;
static	double	f111	=	t	;
static	double	f112	=	t	;
static	double	f113	=	t	;
static	double	f114	=	t	;
static	double	f115	=	t	;
static	double	f116	=	t	;
static	double	f117	=	t	;
static	double	f118	=	t	;
static	double	f119	=	t	;
static	double	f120	=	t	;
static	double	f121	=	t	;
static	double	f122	=	t	;
static	double	f123	=	t	;
static	double	f124	=	t	;
static	double	f125	=	t	;
static	double	f126	=	t	;
static	double	f127	=	t	;
static	double	f128	=	t	;
static	double	f129	=	t	;
static	double	f130	=	t	;
static	double	f131	=	t	;
static	double	f132	=	t	;
static	double	f133	=	t	;
static	double	f134	=	t	;
static	double	f135	=	t	;
static	double	f136	=	t	;
static	double	f137	=	t	;
static	double	f138	=	t	;
static	double	f139	=	t	;
static	double	f140	=	t	;
static	double	f141	=	t	;
static	double	f142	=	t	;
static	double	f143	=	t	;
static	double	f144	=	t	;
static	double	f145	=	t	;
static	double	f146	=	t	;
static	double	f147	=	t	;
static	double	f148	=	t	;
static	double	f149	=	t	;
static	double	f150	=	t	;
static	double	f151	=	t	;
static	double	f152	=	t	;
static	double	f153	=	t	;
static	double	f154	=	t	;
static	double	f155	=	t	;
static	double	f156	=	t	;
static	double	f157	=	t	;
static	double	f158	=	t	;
static	double	f159	=	t	;
static	double	f160	=	t	;
static	double	f161	=	t	;
static	double	f162	=	t	;
static	double	f163	=	t	;
static	double	f164	=	t	;
static	double	f165	=	t	;
static	double	f166	=	t	;
static	double	f167	=	t	;
static	double	f168	=	t	;
static	double	f169	=	t	;
static	double	f170	=	t	;
static	double	f171	=	t	;
static	double	f172	=	t	;
static	double	f173	=	t	;
static	double	f174	=	t	;
static	double	f175	=	t	;
static	double	f176	=	t	;
static	double	f177	=	t	;
static	double	f178	=	t	;
static	double	f179	=	t	;
static	double	f180	=	t	;
static	double	f181	=	t	;
static	double	f182	=	t	;
static	double	f183	=	t	;
static	double	f184	=	t	;
static	double	f185	=	t	;
static	double	f186	=	t	;
static	double	f187	=	t	;
static	double	f188	=	t	;
static	double	f189	=	t	;
static	double	f190	=	t	;
static	double	f191	=	t	;
static	double	f192	=	t	;
static	double	f193	=	t	;
static	double	f194	=	t	;
static	double	f195	=	t	;
static	double	f196	=	t	;
static	double	f197	=	t	;
static	double	f198	=	t	;
static	double	f199	=	t	;
static	double	f200	=	t	;
static	double	f201	=	t	;
static	double	f202	=	t	;
static	double	f203	=	t	;
static	double	f204	=	t	;
static	double	f205	=	t	;
static	double	f206	=	t	;
static	double	f207	=	t	;
static	double	f208	=	t	;
static	double	f209	=	t	;
static	double	f210	=	t	;
static	double	f211	=	t	;
static	double	f212	=	t	;
static	double	f213	=	t	;
static	double	f214	=	t	;
static	double	f215	=	t	;
static	double	f216	=	t	;
static	double	f217	=	t	;
static	double	f218	=	t	;
static	double	f219	=	t	;
static	double	f220	=	t	;
static	double	f221	=	t	;
static	double	f222	=	t	;
static	double	f223	=	t	;
static	double	f224	=	t	;
static	double	f225	=	t	;
static	double	f226	=	t	;
static	double	f227	=	t	;
static	double	f228	=	t	;
static	double	f229	=	t	;
static	double	f230	=	t	;
static	double	f231	=	t	;
static	double	f232	=	t	;
static	double	f233	=	t	;
static	double	f234	=	t	;
static	double	f235	=	t	;
static	double	f236	=	t	;
static	double	f237	=	t	;
static	double	f238	=	t	;
static	double	f239	=	t	;
static	double	f240	=	t	;
static	double	f241	=	t	;
static	double	f242	=	t	;
static	double	f243	=	t	;
static	double	f244	=	t	;
static	double	f245	=	t	;
static	double	f246	=	t	;
static	double	f247	=	t	;
static	double	f248	=	t	;
static	double	f249	=	t	;
static	double	f250	=	t	;
static	double	f251	=	t	;
static	double	f252	=	t	;
static	double	f253	=	t	;
static	double	f254	=	t	;
static	double	f255	=	t	;
static	double	f256	=	t	;
static	double	f257	=	t	;
static	double	f258	=	t	;
static	double	f259	=	t	;
static	double	f260	=	t	;
static	double	f261	=	t	;
static	double	f262	=	t	;
static	double	f263	=	t	;
static	double	f264	=	t	;
static	double	f265	=	t	;
static	double	f266	=	t	;
static	double	f267	=	t	;
static	double	f268	=	t	;
static	double	f269	=	t	;
static	double	f270	=	t	;
static	double	f271	=	t	;
static	double	f272	=	t	;
static	double	f273	=	t	;
static	double	f274	=	t	;
static	double	f275	=	t	;
static	double	f276	=	t	;
static	double	f277	=	t	;
static	double	f278	=	t	;
static	double	f279	=	t	;
static	double	f280	=	t	;
static	double	f281	=	t	;
static	double	f282	=	t	;
static	double	f283	=	t	;
static	double	f284	=	t	;
static	double	f285	=	t	;
static	double	f286	=	t	;
static	double	f287	=	t	;
static	double	f288	=	t	;
static	double	f289	=	t	;
static	double	f290	=	t	;
static	double	f291	=	t	;
static	double	f292	=	t	;
static	double	f293	=	t	;
static	double	f294	=	t	;
static	double	f295	=	t	;
static	double	f296	=	t	;
static	double	f297	=	t	;
static	double	f298	=	t	;
static	double	f299	=	t	;
static	double	f300	=	t	;
static	double	f301	=	t	;
static	double	f302	=	t	;
static	double	f303	=	t	;
static	double	f304	=	t	;
static	double	f305	=	t	;
static	double	f306	=	t	;
static	double	f307	=	t	;
static	double	f308	=	t	;
static	double	f309	=	t	;
static	double	f310	=	t	;
static	double	f311	=	t	;
static	double	f312	=	t	;
static	double	f313	=	t	;
static	double	f314	=	t	;
static	double	f315	=	t	;
static	double	f316	=	t	;
static	double	f317	=	t	;
static	double	f318	=	t	;
static	double	f319	=	t	;
static	double	f320	=	t	;
static	double	f321	=	t	;
static	double	f322	=	t	;
static	double	f323	=	t	;
static	double	f324	=	t	;
static	double	f325	=	t	;
static	double	f326	=	t	;
static	double	f327	=	t	;
static	double	f328	=	t	;
static	double	f329	=	t	;
static	double	f330	=	t	;
static	double	f331	=	t	;
static	double	f332	=	t	;
static	double	f333	=	t	;
static	double	f334	=	t	;
static	double	f335	=	t	;
static	double	f336	=	t	;
static	double	f337	=	t	;
static	double	f338	=	t	;
static	double	f339	=	t	;
static	double	f340	=	t	;
static	double	f341	=	t	;
static	double	f342	=	t	;
static	double	f343	=	t	;
static	double	f344	=	t	;
static	double	f345	=	t	;
static	double	f346	=	t	;
static	double	f347	=	t	;
static	double	f348	=	t	;
static	double	f349	=	t	;
static	double	f350	=	t	;
static	double	f351	=	t	;
static	double	f352	=	t	;
static	double	f353	=	t	;
static	double	f354	=	t	;
static	double	f355	=	t	;
static	double	f356	=	t	;
static	double	f357	=	t	;
static	double	f358	=	t	;
static	double	f359	=	t	;
static	double	f360	=	t	;
static	double	f361	=	t	;
static	double	f362	=	t	;
static	double	f363	=	t	;
static	double	f364	=	t	;
static	double	f365	=	t	;
static	double	f366	=	t	;
static	double	f367	=	t	;
static	double	f368	=	t	;
static	double	f369	=	t	;
static	double	f370	=	t	;
static	double	f371	=	t	;
static	double	f372	=	t	;
static	double	f373	=	t	;
static	double	f374	=	t	;
static	double	f375	=	t	;
static	double	f376	=	t	;
static	double	f377	=	t	;
static	double	f378	=	t	;
static	double	f379	=	t	;
static	double	f380	=	t	;
static	double	f381	=	t	;
static	double	f382	=	t	;
static	double	f383	=	t	;
static	double	f384	=	t	;
static	double	f385	=	t	;
static	double	f386	=	t	;
static	double	f387	=	t	;
static	double	f388	=	t	;
static	double	f389	=	t	;
static	double	f390	=	t	;
static	double	f391	=	t	;
static	double	f392	=	t	;
static	double	f393	=	t	;
static	double	f394	=	t	;
static	double	f395	=	t	;
static	double	f396	=	t	;
static	double	f397	=	t	;
static	double	f398	=	t	;
static	double	f399	=	t	;
static	double	f400	=	t	;
static	double	f401	=	t	;
static	double	f402	=	t	;
static	double	f403	=	t	;
static	double	f404	=	t	;
static	double	f405	=	t	;
static	double	f406	=	t	;
static	double	f407	=	t	;
static	double	f408	=	t	;
static	double	f409	=	t	;
static	double	f410	=	t	;
static	double	f411	=	t	;
static	double	f412	=	t	;
static	double	f413	=	t	;
static	double	f414	=	t	;
static	double	f415	=	t	;
static	double	f416	=	t	;
static	double	f417	=	t	;
static	double	f418	=	t	;
static	double	f419	=	t	;
static	double	f420	=	t	;
static	double	f421	=	t	;
static	double	f422	=	t	;
static	double	f423	=	t	;
static	double	f424	=	t	;
static	double	f425	=	t	;
static	double	f426	=	t	;
static	double	f427	=	t	;
static	double	f428	=	t	;
static	double	f429	=	t	;
static	double	f430	=	t	;
static	double	f431	=	t	;
static	double	f432	=	t	;
static	double	f433	=	t	;
static	double	f434	=	t	;
static	double	f435	=	t	;
static	double	f436	=	t	;
static	double	f437	=	t	;
static	double	f438	=	t	;
static	double	f439	=	t	;
static	double	f440	=	t	;
static	double	f441	=	t	;
static	double	f442	=	t	;
static	double	f443	=	t	;
static	double	f444	=	t	;
static	double	f445	=	t	;
static	double	f446	=	t	;
static	double	f447	=	t	;
static	double	f448	=	t	;
static	double	f449	=	t	;
static	double	f450	=	t	;
static	double	f451	=	t	;
static	double	f452	=	t	;
static	double	f453	=	t	;
static	double	f454	=	t	;
static	double	f455	=	t	;
static	double	f456	=	t	;
static	double	f457	=	t	;
static	double	f458	=	t	;
static	double	f459	=	t	;
static	double	f460	=	t	;
static	double	f461	=	t	;
static	double	f462	=	t	;
static	double	f463	=	t	;
static	double	f464	=	t	;
static	double	f465	=	t	;
static	double	f466	=	t	;
static	double	f467	=	t	;
static	double	f468	=	t	;
static	double	f469	=	t	;
static	double	f470	=	t	;
static	double	f471	=	t	;
static	double	f472	=	t	;
static	double	f473	=	t	;
static	double	f474	=	t	;
static	double	f475	=	t	;
static	double	f476	=	t	;
static	double	f477	=	t	;
static	double	f478	=	t	;
static	double	f479	=	t	;
static	double	f480	=	t	;
static	double	f481	=	t	;
static	double	f482	=	t	;
static	double	f483	=	t	;
static	double	f484	=	t	;
static	double	f485	=	t	;
static	double	f486	=	t	;
static	double	f487	=	t	;
static	double	f488	=	t	;
static	double	f489	=	t	;
static	double	f490	=	t	;
static	double	f491	=	t	;
static	double	f492	=	t	;
static	double	f493	=	t	;
static	double	f494	=	t	;
static	double	f495	=	t	;
static	double	f496	=	t	;
static	double	f497	=	t	;
static	double	f498	=	t	;
static	double	f499	=	t	;
static	double	f500	=	t	;
static	double	f501	=	t	;
static	double	f502	=	t	;
static	double	f503	=	t	;
static	double	f504	=	t	;
static	double	f505	=	t	;
static	double	f506	=	t	;
static	double	f507	=	t	;
static	double	f508	=	t	;
static	double	f509	=	t	;
static	double	f510	=	t	;
static	double	f511	=	t	;
static	double	f512	=	t	;
static	double	f513	=	t	;
static	double	f514	=	t	;
static	double	f515	=	t	;
static	double	f516	=	t	;
static	double	f517	=	t	;
static	double	f518	=	t	;
static	double	f519	=	t	;
static	double	f520	=	t	;
static	double	f521	=	t	;
static	double	f522	=	t	;
static	double	f523	=	t	;
static	double	f524	=	t	;
static	double	f525	=	t	;
static	double	f526	=	t	;
static	double	f527	=	t	;
static	double	f528	=	t	;
static	double	f529	=	t	;
static	double	f530	=	t	;
static	double	f531	=	t	;
static	double	f532	=	t	;
static	double	f533	=	t	;
static	double	f534	=	t	;
static	double	f535	=	t	;
static	double	f536	=	t	;
static	double	f537	=	t	;
static	double	f538	=	t	;
static	double	f539	=	t	;
static	double	f540	=	t	;
static	double	f541	=	t	;
static	double	f542	=	t	;
static	double	f543	=	t	;
static	double	f544	=	t	;
static	double	f545	=	t	;
static	double	f546	=	t	;
static	double	f547	=	t	;
static	double	f548	=	t	;
static	double	f549	=	t	;
static	double	f550	=	t	;
static	double	f551	=	t	;
static	double	f552	=	t	;
static	double	f553	=	t	;
static	double	f554	=	t	;
static	double	f555	=	t	;
static	double	f556	=	t	;
static	double	f557	=	t	;
static	double	f558	=	t	;
static	double	f559	=	t	;
static	double	f560	=	t	;
static	double	f561	=	t	;
static	double	f562	=	t	;
static	double	f563	=	t	;
static	double	f564	=	t	;
static	double	f565	=	t	;
static	double	f566	=	t	;
static	double	f567	=	t	;
static	double	f568	=	t	;
static	double	f569	=	t	;
static	double	f570	=	t	;
static	double	f571	=	t	;
static	double	f572	=	t	;
static	double	f573	=	t	;
static	double	f574	=	t	;
static	double	f575	=	t	;
static	double	f576	=	t	;
static	double	f577	=	t	;
static	double	f578	=	t	;
static	double	f579	=	t	;
static	double	f580	=	t	;
static	double	f581	=	t	;
static	double	f582	=	t	;
static	double	f583	=	t	;
static	double	f584	=	t	;
static	double	f585	=	t	;
static	double	f586	=	t	;
static	double	f587	=	t	;
static	double	f588	=	t	;
static	double	f589	=	t	;
static	double	f590	=	t	;
static	double	f591	=	t	;
static	double	f592	=	t	;
static	double	f593	=	t	;
static	double	f594	=	t	;
static	double	f595	=	t	;
static	double	f596	=	t	;
static	double	f597	=	t	;
static	double	f598	=	t	;
static	double	f599	=	t	;
static	double	f600	=	t	;
static	double	f601	=	t	;
static	double	f602	=	t	;
static	double	f603	=	t	;
static	double	f604	=	t	;
static	double	f605	=	t	;
static	double	f606	=	t	;
static	double	f607	=	t	;
static	double	f608	=	t	;
static	double	f609	=	t	;
static	double	f610	=	t	;
static	double	f611	=	t	;
static	double	f612	=	t	;
static	double	f613	=	t	;
static	double	f614	=	t	;
static	double	f615	=	t	;
static	double	f616	=	t	;
static	double	f617	=	t	;
static	double	f618	=	t	;
static	double	f619	=	t	;
static	double	f620	=	t	;
static	double	f621	=	t	;
static	double	f622	=	t	;
static	double	f623	=	t	;
static	double	f624	=	t	;
static	double	f625	=	t	;
static	double	f626	=	t	;
static	double	f627	=	t	;
static	double	f628	=	t	;
static	double	f629	=	t	;
static	double	f630	=	t	;
static	double	f631	=	t	;
static	double	f632	=	t	;
static	double	f633	=	t	;
static	double	f634	=	t	;
static	double	f635	=	t	;
static	double	f636	=	t	;
static	double	f637	=	t	;
static	double	f638	=	t	;
static	double	f639	=	t	;
static	double	f640	=	t	;
static	double	f641	=	t	;
static	double	f642	=	t	;
static	double	f643	=	t	;
static	double	f644	=	t	;
static	double	f645	=	t	;
static	double	f646	=	t	;
static	double	f647	=	t	;
static	double	f648	=	t	;
static	double	f649	=	t	;
static	double	f650	=	t	;
static	double	f651	=	t	;
static	double	f652	=	t	;
static	double	f653	=	t	;
static	double	f654	=	t	;
static	double	f655	=	t	;
static	double	f656	=	t	;
static	double	f657	=	t	;
static	double	f658	=	t	;
static	double	f659	=	t	;
static	double	f660	=	t	;
static	double	f661	=	t	;
static	double	f662	=	t	;
static	double	f663	=	t	;
static	double	f664	=	t	;
static	double	f665	=	t	;
static	double	f666	=	t	;
static	double	f667	=	t	;
static	double	f668	=	t	;
static	double	f669	=	t	;
static	double	f670	=	t	;
static	double	f671	=	t	;
static	double	f672	=	t	;
static	double	f673	=	t	;
static	double	f674	=	t	;
static	double	f675	=	t	;
static	double	f676	=	t	;
static	double	f677	=	t	;
static	double	f678	=	t	;
static	double	f679	=	t	;
static	double	f680	=	t	;
static	double	f681	=	t	;
static	double	f682	=	t	;
static	double	f683	=	t	;
static	double	f684	=	t	;
static	double	f685	=	t	;
static	double	f686	=	t	;
static	double	f687	=	t	;
static	double	f688	=	t	;
static	double	f689	=	t	;
static	double	f690	=	t	;
static	double	f691	=	t	;
static	double	f692	=	t	;
static	double	f693	=	t	;
static	double	f694	=	t	;
static	double	f695	=	t	;
static	double	f696	=	t	;
static	double	f697	=	t	;
static	double	f698	=	t	;
static	double	f699	=	t	;
static	double	f700	=	t	;
static	double	f701	=	t	;
static	double	f702	=	t	;
static	double	f703	=	t	;
static	double	f704	=	t	;
static	double	f705	=	t	;
static	double	f706	=	t	;
static	double	f707	=	t	;
static	double	f708	=	t	;
static	double	f709	=	t	;
static	double	f710	=	t	;
static	double	f711	=	t	;
static	double	f712	=	t	;
static	double	f713	=	t	;
static	double	f714	=	t	;
static	double	f715	=	t	;
static	double	f716	=	t	;
static	double	f717	=	t	;
static	double	f718	=	t	;
static	double	f719	=	t	;
static	double	f720	=	t	;
static	double	f721	=	t	;
static	double	f722	=	t	;
static	double	f723	=	t	;
static	double	f724	=	t	;
static	double	f725	=	t	;
static	double	f726	=	t	;
static	double	f727	=	t	;
static	double	f728	=	t	;
static	double	f729	=	t	;
static	double	f730	=	t	;
static	double	f731	=	t	;
static	double	f732	=	t	;
static	double	f733	=	t	;
static	double	f734	=	t	;
static	double	f735	=	t	;
static	double	f736	=	t	;
static	double	f737	=	t	;
static	double	f738	=	t	;
static	double	f739	=	t	;
static	double	f740	=	t	;
static	double	f741	=	t	;
static	double	f742	=	t	;
static	double	f743	=	t	;
static	double	f744	=	t	;
static	double	f745	=	t	;
static	double	f746	=	t	;
static	double	f747	=	t	;
static	double	f748	=	t	;
static	double	f749	=	t	;
static	double	f750	=	t	;
static	double	f751	=	t	;
static	double	f752	=	t	;
static	double	f753	=	t	;
static	double	f754	=	t	;
static	double	f755	=	t	;
static	double	f756	=	t	;
static	double	f757	=	t	;
static	double	f758	=	t	;
static	double	f759	=	t	;
static	double	f760	=	t	;
static	double	f761	=	t	;
static	double	f762	=	t	;
static	double	f763	=	t	;
static	double	f764	=	t	;
static	double	f765	=	t	;
static	double	f766	=	t	;
static	double	f767	=	t	;
static	double	f768	=	t	;
static	double	f769	=	t	;
static	double	f770	=	t	;
static	double	f771	=	t	;
static	double	f772	=	t	;
static	double	f773	=	t	;
static	double	f774	=	t	;
static	double	f775	=	t	;
static	double	f776	=	t	;
static	double	f777	=	t	;
static	double	f778	=	t	;
static	double	f779	=	t	;
static	double	f780	=	t	;
static	double	f781	=	t	;
static	double	f782	=	t	;
static	double	f783	=	t	;
static	double	f784	=	t	;
static	double	f785	=	t	;
static	double	f786	=	t	;
static	double	f787	=	t	;
static	double	f788	=	t	;
static	double	f789	=	t	;
static	double	f790	=	t	;
static	double	f791	=	t	;
static	double	f792	=	t	;
static	double	f793	=	t	;
static	double	f794	=	t	;
static	double	f795	=	t	;
static	double	f796	=	t	;
static	double	f797	=	t	;
static	double	f798	=	t	;
static	double	f799	=	t	;
static	double	f800	=	t	;
static	double	f801	=	t	;
static	double	f802	=	t	;
static	double	f803	=	t	;
static	double	f804	=	t	;
static	double	f805	=	t	;
static	double	f806	=	t	;
static	double	f807	=	t	;
static	double	f808	=	t	;
static	double	f809	=	t	;
static	double	f810	=	t	;
static	double	f811	=	t	;
static	double	f812	=	t	;
static	double	f813	=	t	;
static	double	f814	=	t	;
static	double	f815	=	t	;
static	double	f816	=	t	;
static	double	f817	=	t	;
static	double	f818	=	t	;
static	double	f819	=	t	;
static	double	f820	=	t	;
static	double	f821	=	t	;
static	double	f822	=	t	;
static	double	f823	=	t	;
static	double	f824	=	t	;
static	double	f825	=	t	;
static	double	f826	=	t	;
static	double	f827	=	t	;
static	double	f828	=	t	;
static	double	f829	=	t	;
static	double	f830	=	t	;
static	double	f831	=	t	;
static	double	f832	=	t	;
static	double	f833	=	t	;
static	double	f834	=	t	;
static	double	f835	=	t	;
static	double	f836	=	t	;
static	double	f837	=	t	;
static	double	f838	=	t	;
static	double	f839	=	t	;
static	double	f840	=	t	;
static	double	f841	=	t	;
static	double	f842	=	t	;
static	double	f843	=	t	;
static	double	f844	=	t	;
static	double	f845	=	t	;
static	double	f846	=	t	;
static	double	f847	=	t	;
static	double	f848	=	t	;
static	double	f849	=	t	;
static	double	f850	=	t	;
static	double	f851	=	t	;
static	double	f852	=	t	;
static	double	f853	=	t	;
static	double	f854	=	t	;
static	double	f855	=	t	;
static	double	f856	=	t	;
static	double	f857	=	t	;
static	double	f858	=	t	;
static	double	f859	=	t	;
static	double	f860	=	t	;
static	double	f861	=	t	;
static	double	f862	=	t	;
static	double	f863	=	t	;
static	double	f864	=	t	;
static	double	f865	=	t	;
static	double	f866	=	t	;
static	double	f867	=	t	;
static	double	f868	=	t	;
static	double	f869	=	t	;
static	double	f870	=	t	;
static	double	f871	=	t	;
static	double	f872	=	t	;
static	double	f873	=	t	;
static	double	f874	=	t	;
static	double	f875	=	t	;
static	double	f876	=	t	;
static	double	f877	=	t	;
static	double	f878	=	t	;
static	double	f879	=	t	;
static	double	f880	=	t	;
static	double	f881	=	t	;
static	double	f882	=	t	;
static	double	f883	=	t	;
static	double	f884	=	t	;
static	double	f885	=	t	;
static	double	f886	=	t	;
static	double	f887	=	t	;
static	double	f888	=	t	;
static	double	f889	=	t	;
static	double	f890	=	t	;
static	double	f891	=	t	;
static	double	f892	=	t	;
static	double	f893	=	t	;
static	double	f894	=	t	;
static	double	f895	=	t	;
static	double	f896	=	t	;
static	double	f897	=	t	;
static	double	f898	=	t	;
static	double	f899	=	t	;
static	double	f900	=	t	;
static	double	f901	=	t	;
static	double	f902	=	t	;
static	double	f903	=	t	;
static	double	f904	=	t	;
static	double	f905	=	t	;
static	double	f906	=	t	;
static	double	f907	=	t	;
static	double	f908	=	t	;
static	double	f909	=	t	;
static	double	f910	=	t	;
static	double	f911	=	t	;
static	double	f912	=	t	;
static	double	f913	=	t	;
static	double	f914	=	t	;
static	double	f915	=	t	;
static	double	f916	=	t	;
static	double	f917	=	t	;
static	double	f918	=	t	;
static	double	f919	=	t	;
static	double	f920	=	t	;
static	double	f921	=	t	;
static	double	f922	=	t	;
static	double	f923	=	t	;
static	double	f924	=	t	;
static	double	f925	=	t	;
static	double	f926	=	t	;
static	double	f927	=	t	;
static	double	f928	=	t	;
static	double	f929	=	t	;
static	double	f930	=	t	;
static	double	f931	=	t	;
static	double	f932	=	t	;
static	double	f933	=	t	;
static	double	f934	=	t	;
static	double	f935	=	t	;
static	double	f936	=	t	;
static	double	f937	=	t	;
static	double	f938	=	t	;
static	double	f939	=	t	;
static	double	f940	=	t	;
static	double	f941	=	t	;
static	double	f942	=	t	;
static	double	f943	=	t	;
static	double	f944	=	t	;
static	double	f945	=	t	;
static	double	f946	=	t	;
static	double	f947	=	t	;
static	double	f948	=	t	;
static	double	f949	=	t	;
static	double	f950	=	t	;
static	double	f951	=	t	;
static	double	f952	=	t	;
static	double	f953	=	t	;
static	double	f954	=	t	;
static	double	f955	=	t	;
static	double	f956	=	t	;
static	double	f957	=	t	;
static	double	f958	=	t	;
static	double	f959	=	t	;
static	double	f960	=	t	;
static	double	f961	=	t	;
static	double	f962	=	t	;
static	double	f963	=	t	;
static	double	f964	=	t	;
static	double	f965	=	t	;
static	double	f966	=	t	;
static	double	f967	=	t	;
static	double	f968	=	t	;
static	double	f969	=	t	;
static	double	f970	=	t	;
static	double	f971	=	t	;
static	double	f972	=	t	;
static	double	f973	=	t	;
static	double	f974	=	t	;
static	double	f975	=	t	;
static	double	f976	=	t	;
static	double	f977	=	t	;
static	double	f978	=	t	;
static	double	f979	=	t	;
static	double	f980	=	t	;
static	double	f981	=	t	;
static	double	f982	=	t	;
static	double	f983	=	t	;
static	double	f984	=	t	;
static	double	f985	=	t	;
static	double	f986	=	t	;
static	double	f987	=	t	;
static	double	f988	=	t	;
static	double	f989	=	t	;
static	double	f990	=	t	;
static	double	f991	=	t	;
static	double	f992	=	t	;
static	double	f993	=	t	;
static	double	f994	=	t	;
static	double	f995	=	t	;
static	double	f996	=	t	;
static	double	f997	=	t	;
static	double	f998	=	t	;
static	double	f999	=	t	;
static	double	f1000	=	t	;
static	double	f1001	=	t	;
static	double	f1002	=	t	;
static	double	f1003	=	t	;
static	double	f1004	=	t	;
static	double	f1005	=	t	;
static	double	f1006	=	t	;
static	double	f1007	=	t	;
static	double	f1008	=	t	;
static	double	f1009	=	t	;
static	double	f1010	=	t	;
static	double	f1011	=	t	;
static	double	f1012	=	t	;
static	double	f1013	=	t	;
static	double	f1014	=	t	;
static	double	f1015	=	t	;
static	double	f1016	=	t	;
static	double	f1017	=	t	;
static	double	f1018	=	t	;
static	double	f1019	=	t	;
static	double	f1020	=	t	;
static	double	f1021	=	t	;
static	double	f1022	=	t	;
static	double	f1023	=	t	;
static	double	f1024	=	t	;
static	double	f1025	=	t	;
static	double	f1026	=	t	;
static	double	f1027	=	t	;
static	double	f1028	=	t	;
static	double	f1029	=	t	;
static	double	f1030	=	t	;
static	double	f1031	=	t	;
static	double	f1032	=	t	;
static	double	f1033	=	t	;
static	double	f1034	=	t	;
static	double	f1035	=	t	;
static	double	f1036	=	t	;
static	double	f1037	=	t	;
static	double	f1038	=	t	;
static	double	f1039	=	t	;
static	double	f1040	=	t	;
static	double	f1041	=	t	;
static	double	f1042	=	t	;
static double f1043 = t;
    static double f1044 = t;
    static double f1045 = t;
    static double f1046 = t;
    static double f1047 = t;
    static double f1048 = t;
    static double f1049 = t;
    static double f1050 = t;
    static double f1051 = t;
    static double f1052 = t;
    static double f1053 = t;
    static double f1054 = t;
    static double f1055 = t;
    static double f1056 = t;
    static double f1057 = t;
    static double f1058 = t;
    static double f1059 = t;
    static double f1060 = t;
    static double f1061 = t;
    static double f1062 = t;
    static double f1063 = t;
    static double f1064 = t;
    static double f1065 = t;
    static double f1066 = t;
    static double f1067 = t;
    static double f1068 = t;
    static double f1069 = t;
    static double f1070 = t;
    static double f1071 = t;
    static double f1072 = t;
    static double f1073 = t;
    static double f1074 = t;
    static double f1075 = t;
    static double f1076 = t;
    static double f1077 = t;
    static double f1078 = t;
    static double f1079 = t;
    static double f1080 = t;
    static double f1081 = t;
    static double f1082 = t;
    static double f1083 = t;
    static double f1084 = t;
    static double f1085 = t;
    static double f1086 = t;
    static double f1087 = t;
    static double f1088 = t;
    static double f1089 = t;
    static double f1090 = t;
    static double f1091 = t;
    static double f1092 = t;
    static double f1093 = t;
    static double f1094 = t;
    static double f1095 = t;
    static double f1096 = t;
    static double f1097 = t;
    static double f1098 = t;
    static double f1099 = t;
    static double f1100 = t;
    static double f1101 = t;
    static double f1102 = t;
    static double f1103 = t;
    static double f1104 = t;
    static double f1105 = t;
    static double f1106 = t;
    static double f1107 = t;
    static double f1108 = t;
    static double f1109 = t;
    static double f1110 = t;
    static double f1111 = t;
    static double f1112 = t;
    static double f1113 = t;
    static double f1114 = t;
    static double f1115 = t;
    static double f1116 = t;
    static double f1117 = t;
    static double f1118 = t;
    static double f1119 = t;
    static double f1120 = t;
    static double f1121 = t;
    static double f1122 = t;
    static double f1123 = t;
    static double f1124 = t;
    static double f1125 = t;
    static double f1126 = t;
    static double f1127 = t;
    static double f1128 = t;
    static double f1129 = t;
    static double f1130 = t;
    static double f1131 = t;
    static double f1132 = t;
    static double f1133 = t;
    static double f1134 = t;
    static double f1135 = t;
    static double f1136 = t;
    static double f1137 = t;
    static double f1138 = t;
    static double f1139 = t;
    static double f1140 = t;
    static double f1141 = t;
    static double f1142 = t;
    static double f1143 = t;
    static double f1144 = t;
    static double f1145 = t;
    static double f1146 = t;
    static double f1147 = t;
    static double f1148 = t;
    static double f1149 = t;
    static double f1150 = t;
    static double f1151 = t;
    static double f1152 = t;
    static double f1153 = t;
    static double f1154 = t;
    static double f1155 = t;
    static double f1156 = t;
    static double f1157 = t;
    static double f1158 = t;
    static double f1159 = t;
    static double f1160 = t;
    static double f1161 = t;
    static double f1162 = t;
    static double f1163 = t;
    static double f1164 = t;
    static double f1165 = t;
    static double f1166 = t;
    static double f1167 = t;
    static double f1168 = t;
    static double f1169 = t;
    static double f1170 = t;
    static double f1171 = t;
    static double f1172 = t;
    static double f1173 = t;
    static double f1174 = t;
    static double f1175 = t;
    static double f1176 = t;
    static double f1177 = t;
    static double f1178 = t;
    static double f1179 = t;
    static double f1180 = t;
    static double f1181 = t;
    static double f1182 = t;
    static double f1183 = t;
    static double f1184 = t;
    static double f1185 = t;
    static double f1186 = t;
    static double f1187 = t;
    static double f1188 = t;
    static double f1189 = t;
    static double f1190 = t;
    static double f1191 = t;
    static double f1192 = t;
    static double f1193 = t;
    static double f1194 = t;
    static double f1195 = t;
    static double f1196 = t;
    static double f1197 = t;
    static double f1198 = t;
    static double f1199 = t;
    static double f1200 = t;
    static double f1201 = t;
    static double f1202 = t;
    static double f1203 = t;
    static double f1204 = t;
    static double f1205 = t;
    static double f1206 = t;
    static double f1207 = t;
    static double f1208 = t;
    static double f1209 = t;
    static double f1210 = t;
    static double f1211 = t;
    static double f1212 = t;
    static double f1213 = t;
    static double f1214 = t;
    static double f1215 = t;
    static double f1216 = t;
    static double f1217 = t;
    static double f1218 = t;
    static double f1219 = t;
    static double f1220 = t;
    static double f1221 = t;
    static double f1222 = t;
    static double f1223 = t;
    static double f1224 = t;
    static double f1225 = t;
    static double f1226 = t;
    static double f1227 = t;
    static double f1228 = t;
    static double f1229 = t;
    static double f1230 = t;
    static double f1231 = t;
    static double f1232 = t;
    static double f1233 = t;
    static double f1234 = t;
    static double f1235 = t;
    static double f1236 = t;
    static double f1237 = t;
    static double f1238 = t;
    static double f1239 = t;
    static double f1240 = t;
    static double f1241 = t;
    static double f1242 = t;
    static double f1243 = t;
    static double f1244 = t;
    static double f1245 = t;
    static double f1246 = t;
    static double f1247 = t;
    static double f1248 = t;
    static double f1249 = t;
    static double f1250 = t;
    static double f1251 = t;
    static double f1252 = t;
    static double f1253 = t;
    static double f1254 = t;
    static double f1255 = t;
    static double f1256 = t;
    static double f1257 = t;
    static double f1258 = t;
    static double f1259 = t;
    static double f1260 = t;
    static double f1261 = t;
    static double f1262 = t;
    static double f1263 = t;
    static double f1264 = t;
    static double f1265 = t;
    static double f1266 = t;
    static double f1267 = t;
    static double f1268 = t;
    static double f1269 = t;
    static double f1270 = t;
    static double f1271 = t;
    static double f1272 = t;
    static double f1273 = t;
    static double f1274 = t;
    static double f1275 = t;
    static double f1276 = t;
    static double f1277 = t;
    static double f1278 = t;
    static double f1279 = t;
    static double f1280 = t;
    static double f1281 = t;
    static double f1282 = t;
    static double f1283 = t;
    static double f1284 = t;
    static double f1285 = t;
    static double f1286 = t;
    static double f1287 = t;
    static double f1288 = t;
    static double f1289 = t;
    static double f1290 = t;
    static double f1291 = t;
    static double f1292 = t;
    static double f1293 = t;
    static double f1294 = t;
    static double f1295 = t;
    static double f1296 = t;
    static double f1297 = t;
    static double f1298 = t;
    static double f1299 = t;
    static double f1300 = t;
    static double f1301 = t;
    static double f1302 = t;
    static double f1303 = t;
    static double f1304 = t;
    static double f1305 = t;
    static double f1306 = t;
    static double f1307 = t;
    static double f1308 = t;
    static double f1309 = t;
    static double f1310 = t;
    static double f1311 = t;
    static double f1312 = t;
    static double f1313 = t;
    static double f1314 = t;
    static double f1315 = t;
    static double f1316 = t;
    static double f1317 = t;
    static double f1318 = t;
    static double f1319 = t;
    static double f1320 = t;
    static double f1321 = t;
    static double f1322 = t;
    static double f1323 = t;
    static double f1324 = t;
    static double f1325 = t;
    static double f1326 = t;
    static double f1327 = t;
    static double f1328 = t;
    static double f1329 = t;
    static double f1330 = t;
    static double f1331 = t;
    static double f1332 = t;
    static double f1333 = t;
    static double f1334 = t;
    static double f1335 = t;
    static double f1336 = t;
    static double f1337 = t;
    static double f1338 = t;
    static double f1339 = t;
    static double f1340 = t;
    static double f1341 = t;
    static double f1342 = t;
    static double f1343 = t;
    static double f1344 = t;
    static double f1345 = t;
    static double f1346 = t;
    static double f1347 = t;
    static double f1348 = t;
    static double f1349 = t;
    static double f1350 = t;
    static double f1351 = t;
    static double f1352 = t;
    static double f1353 = t;
    static double f1354 = t;
    static double f1355 = t;
    static double f1356 = t;
    static double f1357 = t;
    static double f1358 = t;
    static double f1359 = t;
    static double f1360 = t;
    static double f1361 = t;
    static double f1362 = t;
    static double f1363 = t;
    static double f1364 = t;
    static double f1365 = t;
    static double f1366 = t;
    static double f1367 = t;
    static double f1368 = t;
    static double f1369 = t;
    static double f1370 = t;
    static double f1371 = t;
    static double f1372 = t;
    static double f1373 = t;
    static double f1374 = t;
    static double f1375 = t;
    static double f1376 = t;
    static double f1377 = t;
    static double f1378 = t;
    static double f1379 = t;
    static double f1380 = t;
    static double f1381 = t;
    static double f1382 = t;
    static double f1383 = t;
    static double f1384 = t;
    static double f1385 = t;
    static double f1386 = t;
    static double f1387 = t;
    static double f1388 = t;
    static double f1389 = t;
    static double f1390 = t;
    static double f1391 = t;
    static double f1392 = t;
    static double f1393 = t;
    static double f1394 = t;
    static double f1395 = t;
    static double f1396 = t;
    static double f1397 = t;
    static double f1398 = t;
    static double f1399 = t;
    static double f1400 = t;
    static double f1401 = t;
    static double f1402 = t;
    static double f1403 = t;
    static double f1404 = t;
    static double f1405 = t;
    static double f1406 = t;
    static double f1407 = t;
    static double f1408 = t;
    static double f1409 = t;
    static double f1410 = t;
    static double f1411 = t;
    static double f1412 = t;
    static double f1413 = t;
    static double f1414 = t;
    static double f1415 = t;
    static double f1416 = t;
    static double f1417 = t;
    static double f1418 = t;
    static double f1419 = t;
    static double f1420 = t;
    static double f1421 = t;
    static double f1422 = t;
    static double f1423 = t;
    static double f1424 = t;
    static double f1425 = t;
    static double f1426 = t;
    static double f1427 = t;
    static double f1428 = t;
    static double f1429 = t;
    static double f1430 = t;
    static double f1431 = t;
    static double f1432 = t;
    static double f1433 = t;
    static double f1434 = t;
    static double f1435 = t;
    static double f1436 = t;
    static double f1437 = t;
    static double f1438 = t;
    static double f1439 = t;
    static double f1440 = t;
    static double f1441 = t;
    static double f1442 = t;
    static double f1443 = t;
    static double f1444 = t;
    static double f1445 = t;
    static double f1446 = t;
    static double f1447 = t;
    static double f1448 = t;
    static double f1449 = t;
    static double f1450 = t;
    static double f1451 = t;
    static double f1452 = t;
    static double f1453 = t;
    static double f1454 = t;
    static double f1455 = t;
    static double f1456 = t;
    static double f1457 = t;
    static double f1458 = t;
    static double f1459 = t;
    static double f1460 = t;
    static double f1461 = t;
    static double f1462 = t;
    static double f1463 = t;
    static double f1464 = t;
    static double f1465 = t;
    static double f1466 = t;
    static double f1467 = t;
    static double f1468 = t;
    static double f1469 = t;
    static double f1470 = t;
    static double f1471 = t;
    static double f1472 = t;
    static double f1473 = t;
    static double f1474 = t;
    static double f1475 = t;
    static double f1476 = t;
    static double f1477 = t;
    static double f1478 = t;
    static double f1479 = t;
    static double f1480 = t;
    static double f1481 = t;
    static double f1482 = t;
    static double f1483 = t;
    static double f1484 = t;
    static double f1485 = t;
    static double f1486 = t;
    static double f1487 = t;
    static double f1488 = t;
    static double f1489 = t;
    static double f1490 = t;
    static double f1491 = t;
    static double f1492 = t;
    static double f1493 = t;
    static double f1494 = t;
    static double f1495 = t;
    static double f1496 = t;
    static double f1497 = t;
    static double f1498 = t;
    static double f1499 = t;
    static double f1500 = t;
    static double f1501 = t;
    static double f1502 = t;
    static double f1503 = t;
    static double f1504 = t;
    static double f1505 = t;
    static double f1506 = t;
    static double f1507 = t;
    static double f1508 = t;
    static double f1509 = t;
    static double f1510 = t;
    static double f1511 = t;
    static double f1512 = t;
    static double f1513 = t;
    static double f1514 = t;
    static double f1515 = t;
    static double f1516 = t;
    static double f1517 = t;
    static double f1518 = t;
    static double f1519 = t;
    static double f1520 = t;
    static double f1521 = t;
    static double f1522 = t;
    static double f1523 = t;
    static double f1524 = t;
    static double f1525 = t;
    static double f1526 = t;
    static double f1527 = t;
    static double f1528 = t;
    static double f1529 = t;
    static double f1530 = t;
    static double f1531 = t;
    static double f1532 = t;
    static double f1533 = t;
    static double f1534 = t;
    static double f1535 = t;
    static double f1536 = t;
    static double f1537 = t;
    static double f1538 = t;
    static double f1539 = t;
    static double f1540 = t;
    static double f1541 = t;
    static double f1542 = t;
    static double f1543 = t;
    static double f1544 = t;
    static double f1545 = t;
    static double f1546 = t;
    static double f1547 = t;
    static double f1548 = t;
    static double f1549 = t;
    static double f1550 = t;
    static double f1551 = t;
    static double f1552 = t;
    static double f1553 = t;
    static double f1554 = t;
    static double f1555 = t;
    static double f1556 = t;
    static double f1557 = t;
    static double f1558 = t;
    static double f1559 = t;
    static double f1560 = t;
    static double f1561 = t;
    static double f1562 = t;
    static double f1563 = t;
    static double f1564 = t;
    static double f1565 = t;
    static double f1566 = t;
    static double f1567 = t;
    static double f1568 = t;
    static double f1569 = t;
    static double f1570 = t;
    static double f1571 = t;
    static double f1572 = t;
    static double f1573 = t;
    static double f1574 = t;
    static double f1575 = t;
    static double f1576 = t;
    static double f1577 = t;
    static double f1578 = t;
    static double f1579 = t;
    static double f1580 = t;
    static double f1581 = t;
    static double f1582 = t;
    static double f1583 = t;
    static double f1584 = t;
    static double f1585 = t;
    static double f1586 = t;
    static double f1587 = t;
    static double f1588 = t;
    static double f1589 = t;
    static double f1590 = t;
    static double f1591 = t;
    static double f1592 = t;
    static double f1593 = t;
    static double f1594 = t;
    static double f1595 = t;
    static double f1596 = t;
    static double f1597 = t;
    static double f1598 = t;
    static double f1599 = t;
    static double f1600 = t;
    static double f1601 = t;
    static double f1602 = t;
    static double f1603 = t;
    static double f1604 = t;
    static double f1605 = t;
    static double f1606 = t;
    static double f1607 = t;
    static double f1608 = t;
    static double f1609 = t;
    static double f1610 = t;
    static double f1611 = t;
    static double f1612 = t;
    static double f1613 = t;
    static double f1614 = t;
    static double f1615 = t;
    static double f1616 = t;
    static double f1617 = t;
    static double f1618 = t;
    static double f1619 = t;
    static double f1620 = t;
    static double f1621 = t;
    static double f1622 = t;
    static double f1623 = t;
    static double f1624 = t;
    static double f1625 = t;
    static double f1626 = t;
    static double f1627 = t;
    static double f1628 = t;
    static double f1629 = t;
    static double f1630 = t;
    static double f1631 = t;
    static double f1632 = t;
    static double f1633 = t;
    static double f1634 = t;
    static double f1635 = t;
    static double f1636 = t;
    static double f1637 = t;
    static double f1638 = t;
    static double f1639 = t;
    static double f1640 = t;
    static double f1641 = t;
    static double f1642 = t;
    static double f1643 = t;
    static double f1644 = t;
    static double f1645 = t;
    static double f1646 = t;
    static double f1647 = t;
    static double f1648 = t;
    static double f1649 = t;
    static double f1650 = t;
    static double f1651 = t;
    static double f1652 = t;
    static double f1653 = t;
    static double f1654 = t;
    static double f1655 = t;
    static double f1656 = t;
    static double f1657 = t;
    static double f1658 = t;
    static double f1659 = t;
    static double f1660 = t;
    static double f1661 = t;
    static double f1662 = t;
    static double f1663 = t;
    static double f1664 = t;
    static double f1665 = t;
    static double f1666 = t;
    static double f1667 = t;
    static double f1668 = t;
    static double f1669 = t;
    static double f1670 = t;
    static double f1671 = t;
    static double f1672 = t;
    static double f1673 = t;
    static double f1674 = t;
    static double f1675 = t;
    static double f1676 = t;
    static double f1677 = t;
    static double f1678 = t;
    static double f1679 = t;
    static double f1680 = t;
    static double f1681 = t;
    static double f1682 = t;
    static double f1683 = t;
    static double f1684 = t;
    static double f1685 = t;
    static double f1686 = t;
    static double f1687 = t;
    static double f1688 = t;
    static double f1689 = t;
    static double f1690 = t;
    static double f1691 = t;
    static double f1692 = t;
    static double f1693 = t;
    static double f1694 = t;
    static double f1695 = t;
    static double f1696 = t;
    static double f1697 = t;
    static double f1698 = t;
    static double f1699 = t;
    static double f1700 = t;
    static double f1701 = t;
    static double f1702 = t;
    static double f1703 = t;
    static double f1704 = t;
    static double f1705 = t;
    static double f1706 = t;
    static double f1707 = t;
    static double f1708 = t;
    static double f1709 = t;
    static double f1710 = t;
    static double f1711 = t;
    static double f1712 = t;
    static double f1713 = t;
    static double f1714 = t;
    static double f1715 = t;
    static double f1716 = t;
    static double f1717 = t;
    static double f1718 = t;
    static double f1719 = t;
    static double f1720 = t;
    static double f1721 = t;
    static double f1722 = t;
    static double f1723 = t;
    static double f1724 = t;
    static double f1725 = t;
    static double f1726 = t;
    static double f1727 = t;
    static double f1728 = t;
    static double f1729 = t;
    static double f1730 = t;
    static double f1731 = t;
    static double f1732 = t;
    static double f1733 = t;
    static double f1734 = t;
    static double f1735 = t;
    static double f1736 = t;
    static double f1737 = t;
    static double f1738 = t;
    static double f1739 = t;
    static double f1740 = t;
    static double f1741 = t;
    static double f1742 = t;
    static double f1743 = t;
    static double f1744 = t;
    static double f1745 = t;
    static double f1746 = t;
    static double f1747 = t;
    static double f1748 = t;
    static double f1749 = t;
    static double f1750 = t;
    static double f1751 = t;
    static double f1752 = t;
    static double f1753 = t;
    static double f1754 = t;
    static double f1755 = t;
    static double f1756 = t;
    static double f1757 = t;
    static double f1758 = t;
    static double f1759 = t;
    static double f1760 = t;
    static double f1761 = t;
    static double f1762 = t;
    static double f1763 = t;
    static double f1764 = t;
    static double f1765 = t;
    static double f1766 = t;
    static double f1767 = t;
    static double f1768 = t;
    static double f1769 = t;
    static double f1770 = t;
    static double f1771 = t;
    static double f1772 = t;
    static double f1773 = t;
    static double f1774 = t;
    static double f1775 = t;
    static double f1776 = t;
    static double f1777 = t;
    static double f1778 = t;
    static double f1779 = t;
    static double f1780 = t;
    static double f1781 = t;
    static double f1782 = t;
    static double f1783 = t;
    static double f1784 = t;
    static double f1785 = t;
    static double f1786 = t;
    static double f1787 = t;
    static double f1788 = t;
    static double f1789 = t;
    static double f1790 = t;
    static double f1791 = t;
    static double f1792 = t;
    static double f1793 = t;
    static double f1794 = t;
    static double f1795 = t;
    static double f1796 = t;
    static double f1797 = t;
    static double f1798 = t;
    static double f1799 = t;
    static double f1800 = t;
    static double f1801 = t;
    static double f1802 = t;
    static double f1803 = t;
    static double f1804 = t;
    static double f1805 = t;
    static double f1806 = t;
    static double f1807 = t;
    static double f1808 = t;
    static double f1809 = t;
    static double f1810 = t;
    static double f1811 = t;
    static double f1812 = t;
    static double f1813 = t;
    static double f1814 = t;
    static double f1815 = t;
    static double f1816 = t;
    static double f1817 = t;
    static double f1818 = t;
    static double f1819 = t;
    static double f1820 = t;
    static double f1821 = t;
    static double f1822 = t;
    static double f1823 = t;
    static double f1824 = t;
    static double f1825 = t;
    static double f1826 = t;
    static double f1827 = t;
    static double f1828 = t;
    static double f1829 = t;
    static double f1830 = t;
    static double f1831 = t;
    static double f1832 = t;
    static double f1833 = t;
    static double f1834 = t;
    static double f1835 = t;
    static double f1836 = t;
    static double f1837 = t;
    static double f1838 = t;
    static double f1839 = t;
    static double f1840 = t;
    static double f1841 = t;
    static double f1842 = t;
    static double f1843 = t;
    static double f1844 = t;
    static double f1845 = t;
    static double f1846 = t;
    static double f1847 = t;
    static double f1848 = t;
    static double f1849 = t;
    static double f1850 = t;
    static double f1851 = t;
    static double f1852 = t;
    static double f1853 = t;
    static double f1854 = t;
    static double f1855 = t;
    static double f1856 = t;
    static double f1857 = t;
    static double f1858 = t;
    static double f1859 = t;
    static double f1860 = t;
    static double f1861 = t;
    static double f1862 = t;
    static double f1863 = t;
    static double f1864 = t;
    static double f1865 = t;
    static double f1866 = t;
    static double f1867 = t;
    static double f1868 = t;
    static double f1869 = t;
    static double f1870 = t;
    static double f1871 = t;
    static double f1872 = t;
    static double f1873 = t;
    static double f1874 = t;
    static double f1875 = t;
    static double f1876 = t;
    static double f1877 = t;
    static double f1878 = t;
    static double f1879 = t;
    static double f1880 = t;
    static double f1881 = t;
    static double f1882 = t;
    static double f1883 = t;
    static double f1884 = t;
    static double f1885 = t;
    static double f1886 = t;
    static double f1887 = t;
    static double f1888 = t;
    static double f1889 = t;
    static double f1890 = t;
    static double f1891 = t;
    static double f1892 = t;
    static double f1893 = t;
    static double f1894 = t;
    static double f1895 = t;
    static double f1896 = t;
    static double f1897 = t;
    static double f1898 = t;
    static double f1899 = t;
    static double f1900 = t;
    static double f1901 = t;
    static double f1902 = t;
    static double f1903 = t;
    static double f1904 = t;
    static double f1905 = t;
    static double f1906 = t;
    static double f1907 = t;
    static double f1908 = t;
    static double f1909 = t;
    static double f1910 = t;
    static double f1911 = t;
    static double f1912 = t;
    static double f1913 = t;
    static double f1914 = t;
    static double f1915 = t;
    static double f1916 = t;
    static double f1917 = t;
    static double f1918 = t;
    static double f1919 = t;
    static double f1920 = t;
    static double f1921 = t;
    static double f1922 = t;
    static double f1923 = t;
    static double f1924 = t;
    static double f1925 = t;
    static double f1926 = t;
    static double f1927 = t;
    static double f1928 = t;
    static double f1929 = t;
    static double f1930 = t;
    static double f1931 = t;
    static double f1932 = t;
    static double f1933 = t;
    static double f1934 = t;
    static double f1935 = t;
    static double f1936 = t;
    static double f1937 = t;
    static double f1938 = t;
    static double f1939 = t;
    static double f1940 = t;
    static double f1941 = t;
    static double f1942 = t;
    static double f1943 = t;
    static double f1944 = t;
    static double f1945 = t;
    static double f1946 = t;
    static double f1947 = t;
    static double f1948 = t;
    static double f1949 = t;
    static double f1950 = t;
    static double f1951 = t;
    static double f1952 = t;
    static double f1953 = t;
    static double f1954 = t;
    static double f1955 = t;
    static double f1956 = t;
    static double f1957 = t;
    static double f1958 = t;
    static double f1959 = t;
    static double f1960 = t;
    static double f1961 = t;
    static double f1962 = t;
    static double f1963 = t;
    static double f1964 = t;
    static double f1965 = t;
    static double f1966 = t;
    static double f1967 = t;
    static double f1968 = t;
    static double f1969 = t;
    static double f1970 = t;
    static double f1971 = t;
    static double f1972 = t;
    static double f1973 = t;
    static double f1974 = t;
    static double f1975 = t;
    static double f1976 = t;
    static double f1977 = t;
    static double f1978 = t;
    static double f1979 = t;
    static double f1980 = t;
    static double f1981 = t;
    static double f1982 = t;
    static double f1983 = t;
    static double f1984 = t;
    static double f1985 = t;
    static double f1986 = t;
    static double f1987 = t;
    static double f1988 = t;
    static double f1989 = t;
    static double f1990 = t;
    static double f1991 = t;
    static double f1992 = t;
    static double f1993 = t;
    static double f1994 = t;
    static double f1995 = t;
    static double f1996 = t;
    static double f1997 = t;
    static double f1998 = t;
    static double f1999 = t;
    static double f2000 = t;
    static double f2001 = t;
    static double f2002 = t;
    static double f2003 = t;
    static double f2004 = t;
    static double f2005 = t;
    static double f2006 = t;
    static double f2007 = t;
    static double f2008 = t;
    static double f2009 = t;
    static double f2010 = t;
    static double f2011 = t;
    static double f2012 = t;
    static double f2013 = t;
    static double f2014 = t;
    static double f2015 = t;
    static double f2016 = t;
    static double f2017 = t;
    static double f2018 = t;
    static double f2019 = t;
    static double f2020 = t;
    static double f2021 = t;
    static double f2022 = t;
    static double f2023 = t;
    static double f2024 = t;
    static double f2025 = t;
    static double f2026 = t;
    static double f2027 = t;
    static double f2028 = t;
    static double f2029 = t;
    static double f2030 = t;
    static double f2031 = t;
    static double f2032 = t;
    static double f2033 = t;
    static double f2034 = t;
    static double f2035 = t;
    static double f2036 = t;
    static double f2037 = t;
    static double f2038 = t;
    static double f2039 = t;
    static double f2040 = t;
    static double f2041 = t;
    static double f2042 = t;
    static double f2043 = t;
    static double f2044 = t;
    static double f2045 = t;
    static double f2046 = t;
    static double f2047 = t;
    static double f2048 = t;
    static double f2049 = t;
    static double f2050 = t;
    static double f2051 = t;
    static double f2052 = t;
    static double f2053 = t;
    static double f2054 = t;
    static double f2055 = t;
    static double f2056 = t;
    static double f2057 = t;
    static double f2058 = t;
    static double f2059 = t;
    static double f2060 = t;
    static double f2061 = t;
    static double f2062 = t;
    static double f2063 = t;
    static double f2064 = t;
    static double f2065 = t;
    static double f2066 = t;
    static double f2067 = t;
    static double f2068 = t;
    static double f2069 = t;
    static double f2070 = t;
    static double f2071 = t;
    static double f2072 = t;
    static double f2073 = t;
    static double f2074 = t;
    static double f2075 = t;
    static double f2076 = t;
    static double f2077 = t;
    static double f2078 = t;
    static double f2079 = t;
    static double f2080 = t;
    static double f2081 = t;
    static double f2082 = t;
    static double f2083 = t;
    static double f2084 = t;
    static double f2085 = t;
    static double f2086 = t;
    static double f2087 = t;
    static double f2088 = t;
    static double f2089 = t;
    static double f2090 = t;
    static double f2091 = t;
    static double f2092 = t;
    static double f2093 = t;
    static double f2094 = t;
    static double f2095 = t;
    static double f2096 = t;
    static double f2097 = t;
    static double f2098 = t;
    static double f2099 = t;
    static double f2100 = t;
    static double f2101 = t;
    static double f2102 = t;
    static double f2103 = t;
    static double f2104 = t;
    static double f2105 = t;
    static double f2106 = t;
    static double f2107 = t;
    static double f2108 = t;
    static double f2109 = t;
    static double f2110 = t;
    static double f2111 = t;
    static double f2112 = t;
    static double f2113 = t;
    static double f2114 = t;
    static double f2115 = t;
    static double f2116 = t;
    static double f2117 = t;
    static double f2118 = t;
    static double f2119 = t;
    static double f2120 = t;
    static double f2121 = t;
    static double f2122 = t;
    static double f2123 = t;
    static double f2124 = t;
    static double f2125 = t;
    static double f2126 = t;
    static double f2127 = t;
    static double f2128 = t;
    static double f2129 = t;
    static double f2130 = t;
    static double f2131 = t;
    static double f2132 = t;
    static double f2133 = t;
    static double f2134 = t;
    static double f2135 = t;
    static double f2136 = t;
    static double f2137 = t;
    static double f2138 = t;
    static double f2139 = t;
    static double f2140 = t;
    static double f2141 = t;
    static double f2142 = t;
    static double f2143 = t;
    static double f2144 = t;
    static double f2145 = t;
    static double f2146 = t;
    static double f2147 = t;
    static double f2148 = t;
    static double f2149 = t;
    static double f2150 = t;
    static double f2151 = t;
    static double f2152 = t;
    static double f2153 = t;
    static double f2154 = t;
    static double f2155 = t;
    static double f2156 = t;
    static double f2157 = t;
    static double f2158 = t;
    static double f2159 = t;
    static double f2160 = t;
    static double f2161 = t;
    static double f2162 = t;
    static double f2163 = t;
    static double f2164 = t;
    static double f2165 = t;
    static double f2166 = t;
    static double f2167 = t;
    static double f2168 = t;
    static double f2169 = t;
    static double f2170 = t;
    static double f2171 = t;
    static double f2172 = t;
    static double f2173 = t;
    static double f2174 = t;
    static double f2175 = t;
    static double f2176 = t;
    static double f2177 = t;
    static double f2178 = t;
    static double f2179 = t;
    static double f2180 = t;
    static double f2181 = t;
    static double f2182 = t;
    static double f2183 = t;
    static double f2184 = t;
    static double f2185 = t;
    static double f2186 = t;
    static double f2187 = t;
    static double f2188 = t;
    static double f2189 = t;
    static double f2190 = t;
    static double f2191 = t;
    static double f2192 = t;
    static double f2193 = t;
    static double f2194 = t;
    static double f2195 = t;
    static double f2196 = t;
    static double f2197 = t;
    static double f2198 = t;
    static double f2199 = t;
    static double f2200 = t;
    static double f2201 = t;
    static double f2202 = t;
    static double f2203 = t;
    static double f2204 = t;
    static double f2205 = t;
    static double f2206 = t;
    static double f2207 = t;
    static double f2208 = t;
    static double f2209 = t;
    static double f2210 = t;
    static double f2211 = t;
    static double f2212 = t;
    static double f2213 = t;
    static double f2214 = t;
    static double f2215 = t;
    static double f2216 = t;
    static double f2217 = t;
    static double f2218 = t;
    static double f2219 = t;
    static double f2220 = t;
    static double f2221 = t;
    static double f2222 = t;
    static double f2223 = t;
    static double f2224 = t;
    static double f2225 = t;
    static double f2226 = t;
    static double f2227 = t;
    static double f2228 = t;
    static double f2229 = t;
    static double f2230 = t;
    static double f2231 = t;
    static double f2232 = t;
    static double f2233 = t;
    static double f2234 = t;
    static double f2235 = t;
    static double f2236 = t;
    static double f2237 = t;
    static double f2238 = t;
    static double f2239 = t;
    static double f2240 = t;
    static double f2241 = t;
    static double f2242 = t;
    static double f2243 = t;
    static double f2244 = t;
    static double f2245 = t;
    static double f2246 = t;
    static double f2247 = t;
    static double f2248 = t;
    static double f2249 = t;
    static double f2250 = t;
    static double f2251 = t;
    static double f2252 = t;
    static double f2253 = t;
    static double f2254 = t;
    static double f2255 = t;
    static double f2256 = t;
    static double f2257 = t;
    static double f2258 = t;
    static double f2259 = t;
    static double f2260 = t;
    static double f2261 = t;
    static double f2262 = t;
    static double f2263 = t;
    static double f2264 = t;
    static double f2265 = t;
    static double f2266 = t;
    static double f2267 = t;
    static double f2268 = t;
    static double f2269 = t;
    static double f2270 = t;
    static double f2271 = t;
    static double f2272 = t;
    static double f2273 = t;
    static double f2274 = t;
    static double f2275 = t;
    static double f2276 = t;
    static double f2277 = t;
    static double f2278 = t;
    static double f2279 = t;
    static double f2280 = t;
    static double f2281 = t;
    static double f2282 = t;
    static double f2283 = t;
    static double f2284 = t;
    static double f2285 = t;
    static double f2286 = t;
    static double f2287 = t;
    static double f2288 = t;
    static double f2289 = t;
    static double f2290 = t;
    static double f2291 = t;
    static double f2292 = t;
    static double f2293 = t;
    static double f2294 = t;
    static double f2295 = t;
    static double f2296 = t;
    static double f2297 = t;
    static double f2298 = t;
    static double f2299 = t;
    static double f2300 = t;
    static double f2301 = t;
    static double f2302 = t;
    static double f2303 = t;
    static double f2304 = t;
    static double f2305 = t;
    static double f2306 = t;
    static double f2307 = t;
    static double f2308 = t;
    static double f2309 = t;
    static double f2310 = t;
    static double f2311 = t;
    static double f2312 = t;
    static double f2313 = t;
    static double f2314 = t;
    static double f2315 = t;
    static double f2316 = t;
    static double f2317 = t;
    static double f2318 = t;
    static double f2319 = t;
    static double f2320 = t;
    static double f2321 = t;
    static double f2322 = t;
    static double f2323 = t;
    static double f2324 = t;
    static double f2325 = t;
    static double f2326 = t;
    static double f2327 = t;
    static double f2328 = t;
    static double f2329 = t;
    static double f2330 = t;
    static double f2331 = t;
    static double f2332 = t;
    static double f2333 = t;
    static double f2334 = t;
    static double f2335 = t;
    static double f2336 = t;
    static double f2337 = t;
    static double f2338 = t;
    static double f2339 = t;
    static double f2340 = t;
    static double f2341 = t;
    static double f2342 = t;
    static double f2343 = t;
    static double f2344 = t;
    static double f2345 = t;
    static double f2346 = t;
    static double f2347 = t;
    static double f2348 = t;
    static double f2349 = t;
    static double f2350 = t;
    static double f2351 = t;
    static double f2352 = t;
    static double f2353 = t;
    static double f2354 = t;
    static double f2355 = t;
    static double f2356 = t;
    static double f2357 = t;
    static double f2358 = t;
    static double f2359 = t;
    static double f2360 = t;
    static double f2361 = t;
    static double f2362 = t;
    static double f2363 = t;
    static double f2364 = t;
    static double f2365 = t;
    static double f2366 = t;
    static double f2367 = t;
    static double f2368 = t;
    static double f2369 = t;
    static double f2370 = t;
    static double f2371 = t;
    static double f2372 = t;
    static double f2373 = t;
    static double f2374 = t;
    static double f2375 = t;
    static double f2376 = t;
    static double f2377 = t;
    static double f2378 = t;
    static double f2379 = t;
    static double f2380 = t;
    static double f2381 = t;
    static double f2382 = t;
    static double f2383 = t;
    static double f2384 = t;
    static double f2385 = t;
    static double f2386 = t;
    static double f2387 = t;
    static double f2388 = t;
    static double f2389 = t;
    static double f2390 = t;
    static double f2391 = t;
    static double f2392 = t;
    static double f2393 = t;
    static double f2394 = t;
    static double f2395 = t;
    static double f2396 = t;
    static double f2397 = t;
    static double f2398 = t;
    static double f2399 = t;
    static double f2400 = t;
    static double f2401 = t;
    static double f2402 = t;
    static double f2403 = t;
    static double f2404 = t;
    static double f2405 = t;
    static double f2406 = t;
    static double f2407 = t;
    static double f2408 = t;
    static double f2409 = t;
    static double f2410 = t;
    static double f2411 = t;
    static double f2412 = t;
    static double f2413 = t;
    static double f2414 = t;
    static double f2415 = t;
    static double f2416 = t;
    static double f2417 = t;
    static double f2418 = t;
    static double f2419 = t;
    static double f2420 = t;
    static double f2421 = t;
    static double f2422 = t;
    static double f2423 = t;
    static double f2424 = t;
    static double f2425 = t;
    static double f2426 = t;
    static double f2427 = t;
    static double f2428 = t;
    static double f2429 = t;
    static double f2430 = t;
    static double f2431 = t;
    static double f2432 = t;
    static double f2433 = t;
    static double f2434 = t;
    static double f2435 = t;
    static double f2436 = t;
    static double f2437 = t;
    static double f2438 = t;
    static double f2439 = t;
    static double f2440 = t;
    static double f2441 = t;
    static double f2442 = t;
    static double f2443 = t;
    static double f2444 = t;
    static double f2445 = t;

//static	double	f2446	=	0;
static	double	f1	=	0	;

class HomeActionListener implements ActionListener {
    public void actionPerformed(ActionEvent ae){
            try {
                set_answer_panel().setVisible(false);
            } catch (ScriptException ex) {
                ex.printStackTrace();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
 field_panel.setVisible(true);

    }

}

class MenuActionListener implements ActionListener {
  public void actionPerformed(ActionEvent pe) {
      velocity = false;
         c = 0.9*ds/(Math.pow (h, 2))+0.9*ds/(Math.pow (k,2)) + 0.42* ds/(Math.pow (l,2));
         e =  u/(2*h) - (0.45*ds)/(Math.pow (h,2));
 	 w = -u/(2*h)-(0.45*ds)/(Math.pow(h,2));
	 n = v/(2*k) + (0.45*ds)/(2*(Math.pow(k,2)));
	 s = -v/(2*k) + (0.45*ds)/(2*(Math.pow(k,2)));
	 a = w1/(2*l)-(0.21*ds)/(Math.pow(l,2))-((Math.sqrt((4*9.81*(1-0.5)*d50)/( 3*0.34)))/(2*l));
         b = -w1/(2*l) -(0.21*ds)/(Math.pow(l,2))+((Math.sqrt((4*9.81*(1-0.5)*d50)/( 3*0.34)))/(2*l));
 border_text ="<html><i><b>SEDIMENT EQUATION</b></i></html>";
    //System.out.println("Selected: " + pe.getActionCommand());
field_panel.setBorder(setTitledBorder(border_text));
    //System.out.println(border_text);

  }
}


class VelocityActionListener implements ActionListener {
    public void actionPerformed(ActionEvent pe){
        velocity = true;
         border_text ="<html><i><b>VELOCITY EQUATION</b></i></html>";
    //System.out.println("Selected: " + pe.getActionCommand());
          m5_value.setText("m5 value");
           m6_value.setText("m6 value");
        field_panel.setBorder(setTitledBorder(border_text));

    }
}
 JMenu fileMenu,homeMenu;
 public void set_frame(){
 JMenuBar menuBar = new JMenuBar();
 fileMenu = new JMenu("Change Equation");
 homeMenu = new JMenu("HOME");
    fileMenu.setMnemonic(KeyEvent.VK_F);
    fileMenu.setBorderPainted(true);
    fileMenu.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
     homeMenu.setMnemonic(KeyEvent.VK_H);
    homeMenu.setBorderPainted(true);
    homeMenu.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    menuBar.add(fileMenu);
    menuBar.add(homeMenu);

    // File->New, N - Mnemonic
    JMenuItem sediment = new JMenuItem("Sediment Eqn", KeyEvent.VK_P);
        JMenuItem velocity = new JMenuItem("Velocity Eqn", KeyEvent.VK_H);
    fileMenu.add(sediment);
    fileMenu.add(velocity);
    velocity.addActionListener(new VelocityActionListener());
    sediment.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    sediment.setBorderPainted(true);
    sediment.setForeground(Color.black);
    sediment.setOpaque(true);
    sediment.addActionListener(new MenuActionListener());
    homeMenu.addActionListener(new HomeActionListener());
    frame=new JFrame("Simultaneous Equation");
    frame.add(set_field_panel(),BorderLayout.CENTER);
    frame.addWindowListener(closewindow);
    //frame.setResizable(false);
    menuBar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
     frame.setJMenuBar(menuBar);
    frame.setVisible(true);
    frame.getContentPane().setBackground(Color.white);
    frame.setSize(450,510);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);

   }

   public double[] getArray(){

 double array_value[]={f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18,f19,f20,f21,f22,f23,f24,f25,f26,f27,f28,f29,f30,f31,f32,f33,f34,f35,f36,f37,f38,f39,f40,f41,f42,f43,f44,f45,f46,f47,f48,f49,f50,f51,f52,f53,f54,f55,f56,f57,f58,f59,f60,f61,f62,f63,f64,f65,f66,f67,f68,f69,f70,f71,f72,
f73,f74,f75,f76,f77,f78,f79,f80,f81,f82,f83,f84,f85,f86,f87,f88,f89,f90,f91,f92,f93,f94,f95,f96,f97,f98,f99,f100,f101,f102,f103,f104,f105,f106,f107,f108,f109,
f110,f111,f112,f113,f114,f115,f116,f117,f118,f119,f120,f121,f122,f123,f124,f125,f126,f127,f128,f129,f130,f131,f132,f133,f134,f135,f136,f137,f138,f139,f140,f141,
f142,f143,f144,f145,f146,f147,f148,f149,f150,f151,f152,f153,f154,f155,f156,f157,f158,f159,f160,f161,f162,f163,f164,f165,f166,f167,f168,f169,f170,f171,f172,f173,
f174,f175,f176,f177,f178,f179,f180,f181,f182,f183,f184,f185,f186,f187,f188,f189,f190,f191,f192,f193,f194,f195,f196,f197,f198,f199,f200,f201,f202,f203,f204,
f205,f206,f207,f208,f209,f210,f211,f212,f213,f214,f215,f216,f217,f218,f219,f220,f221,f222,f223,f224,f225,f226,f227,f228,f229,f230,f231,f232,f233,f234,f235,
f236,f237,f238,f239,f240,f241,f242,f243,f244,f245,f246,f247,f248,f249,f250,f251,f252,f253,f254,f255,f256,f257,f258,f259,f260,f261,f262,f263,f264,f265,f266,
f267,f268,f269,f270,f271,f272,f273,f274,f275,f276,f277,f278,f279,f280,f281,f282,f283,f284,f285,f286,f287,f288,f289,f290,f291,f292,f293,f294,f295,f296,f297,
f298,f299,f300,f301,f302,f303,f304,f305,f306,f307,f308,f309,f310,f311,f312,f313,f314,f315,f316,f317,f318,f319,f320,f321,f322,f323,f324,f325,f326,f327,f328,
f329,f330,f331,f332,f333,f334,f335,f336,f337,f338,f339,f340,f341,f342,f343,f344,f345,f346,f347,f348,f349,f350,f351,f352,f353,f354,f355,f356,f357,f358,f359,
f360,f361,f362,f363,f364,f365,f366,f367,f368,f369,f370,f371,f372,f373,f374,f375,f376,f377,f378,f379,f380,f381,f382,f383,f384,f385,f386,f387,f388,f389,f390,
f391,f392,f393,f394,f395,f396,f397,f398,f399,f400,f401,f402,f403,f404,f405,f406,f407,f408,f409,f410,f411,f412,f413,f414,f415,f416,f417,f418,f419,f420,f421,
f422,f423,f424,f425,f426,f427,f428,f429,f430,f431,f432,f433,f434,f435,f436,f437,f438,f439,f440,f441,f442,f443,f444,f445,f446,f447,f448,f449,f450,f451,f452,f453,f454,f455,
f456,f457,f458,f459,f460,f461,f462,f463,f464,f465,f466,f467,f468,f469,f470,f471,f472,f473,f474,f475,f476,f477,f478,f479,f480,f481,f482,f483,f484,f485,f486,f487,f488,f489,f490,
f491,f492,f493,f494,f495,f496,f497,f498,f499,f500,f501,f502,f503,f504,f505,f506,f507,f508,f509,f510,f511,f512,f513,f514,f515,f516,f517,f518,f519,f520,f521,
f522,f523,f524,f525,f526,f527,f528,f529,f530,f531,f532,f533,f534,f535,f536,f537,f538,f539,f540,f541,f542,f543,f544,f545,f546,f547,f548,f549,f550,f551,f552,
f553,f554,f555,f556,f557,f558,f559,f560,f561,f562,f563,f564,f565,f566,f567,f568,f569,f570,f571,f572,f573,f574,f575,f576,f577,f578,f579,f580,f581,f582,f583,
f584,f585,f586,f587,f588,f589,f590,f591,f592,f593,f594,f595,f596,f597,f598,f599,f600,f601,f602,f603,f604,f605,f606,f607,f608,f609,f610,f611,f612,f613,f614,
f615,f616,f617,f618,f619,f620,f621,f622,f623,f624,f625,f626,f627,f628,f629,f630,f631,f632,f633,f634,f635,f636,f637,f638,f639,f640,f641,f642,f643,f644,f645,
f646	,
f647	,
f648	,
f649	,
f650	,
f651	,
f652	,
f653	,
f654	,
f655	,
f656	,
f657	,
f658	,
f659	,
f660	,
f661	,
f662	,
f663	,
f664	,
f665	,
f666	,
f667	,
f668	,
f669	,
f670	,
f671	,
f672	,
f673	,
f674	,
f675	,
f676	,
f677	,
f678	,
f679	,
f680	,
f681	,
f682	,
f683	,
f684	,
f685	,
f686	,
f687	,
f688	,
f689	,
f690	,
f691	,
f692	,
f693	,
f694	,
f695	,
f696	,
f697	,
f698	,
f699	,
f700	,
f701	,
f702	,
f703	,
f704	,
f705	,
f706	,
f707	,
f708	,
f709	,
f710	,
f711	,
f712	,
f713	,
f714	,
f715	,
f716	,
f717	,
f718	,
f719	,
f720	,
f721	,
f722	,
f723	,
f724	,
f725	,
f726	,
f727	,
f728	,
f729	,
f730	,
f731	,
f732	,
f733	,
f734	,
f735	,
f736	,
f737	,
f738	,
f739	,
f740	,
f741	,
f742	,
f743	,
f744	,
f745	,
f746	,
f747	,
f748	,
f749	,
f750	,
f751	,
f752	,
f753	,
f754	,
f755	,
f756	,
f757	,
f758	,
f759	,
f760	,
f761	,
f762	,
f763	,
f764	,
f765	,
f766	,
f767	,
f768	,
f769	,
f770	,
f771	,
f772	,
f773	,
f774	,
f775	,
f776	,
f777	,
f778	,
f779	,
f780	,
f781	,
f782	,
f783	,
f784	,
f785	,
f786	,
f787	,
f788	,
f789	,
f790	,
f791	,
f792	,
f793	,
f794	,
f795	,
f796	,
f797	,
f798	,
f799	,
f800	,
f801	,
f802	,
f803	,
f804	,
f805	,
f806	,
f807	,
f808	,
f809	,
f810	,
f811	,
f812	,
f813	,
f814	,
f815	,
f816	,
f817	,
f818	,
f819	,
f820	,
f821	,
f822	,
f823	,
f824	,
f825	,
f826	,
f827	,
f828	,
f829	,
f830	,
f831	,
f832	,
f833	,
f834	,
f835	,
f836	,
f837	,
f838	,
f839	,
f840	,
f841	,
f842	,
f843	,
f844	,
f845	,
f846	,
f847	,
f848	,
f849	,
f850	,
f851	,
f852	,
f853	,
f854	,
f855	,
f856	,
f857	,
f858	,
f859	,
f860	,
f861	,
f862	,
f863	,
f864	,
f865	,
f866	,
f867	,
f868	,
f869	,
f870	,
f871	,
f872	,
f873	,
f874	,
f875	,
f876	,
f877	,
f878	,
f879	,
f880	,
f881	,
f882	,
f883	,
f884	,
f885	,
f886	,
f887	,
f888	,
f889	,
f890	,
f891	,
f892	,
f893	,
f894	,
f895	,
f896	,
f897	,
f898	,
f899	,
f900	,
f901	,
f902	,
f903	,
f904	,
f905	,
f906	,
f907	,
f908	,
f909	,
f910	,
f911	,
f912	,
f913	,
f914	,
f915	,
f916	,
f917	,
f918	,
f919	,
f920	,
f921	,
f922	,
f923	,
f924	,
f925	,
f926	,
f927	,
f928	,
f929	,
f930	,
f931	,
f932	,
f933	,
f934	,
f935	,
f936	,
f937	,
f938	,
f939	,
f940	,
f941	,
f942	,
f943	,
f944	,
f945	,
f946	,
f947	,
f948	,
f949	,
f950	,
f951	,
f952	,
f953	,
f954	,
f955	,
f956	,
f957	,
f958	,
f959	,
f960	,
f961	,
f962	,
f963	,
f964	,
f965	,
f966	,
f967	,
f968	,
f969	,
f970	,
f971	,
f972	,
f973	,
f974	,
f975	,
f976	,
f977	,
f978	,
f979	,
f980	,
f981	,
f982	,
f983	,
f984	,
f985	,
f986	,
f987	,
f988	,
f989	,
f990	,
f991	,
f992	,
f993	,
f994	,
f995	,
f996	,
f997	,
f998	,
f999	,
f1000	,
f1001	,
f1002	,
f1003	,
f1004	,
f1005	,
f1006	,
f1007	,
f1008	,
f1009	,
f1010	,
f1011	,
f1012	,
f1013	,
f1014	,
f1015	,
f1016	,
f1017	,
f1018	,
f1019	,
f1020	,
f1021	,
f1022	,
f1023	,
f1024	,
f1025	,
f1026	,
f1027	,
f1028	,
f1029	,
f1030	,
f1031	,
f1032	,
f1033	,
f1034	,
f1035	,
f1036	,
f1037	,
f1038	,
f1039	,
f1040	,
f1041	,
f1042	,
f1043	,
f1044	,
f1045	,
f1046	,
f1047	,
f1048	,
f1049	,
f1050	,
f1051	,
f1052	,
f1053	,
f1054	,
f1055	,
f1056	,
f1057	,
f1058	,
f1059	,
f1060	,
f1061	,
f1062	,
f1063	,
f1064	,
f1065	,
f1066	,
f1067	,
f1068	,
f1069	,
f1070	,
f1071	,
f1072	,
f1073	,
f1074	,
f1075	,
f1076	,
f1077	,
f1078	,
f1079	,
f1080	,
f1081	,
f1082	,
f1083	,
f1084	,
f1085	,
f1086	,
f1087	,
f1088	,
f1089	,
f1090	,
f1091	,
f1092	,
f1093	,
f1094	,
f1095	,
f1096	,
f1097	,
f1098	,
f1099	,
f1100	,
f1101	,
f1102	,
f1103	,
f1104	,
f1105	,
f1106	,
f1107	,
f1108	,
f1109	,
f1110	,
f1111	,
f1112	,
f1113	,
f1114	,
f1115	,
f1116	,
f1117	,
f1118	,
f1119	,
f1120	,
f1121	,
f1122	,
f1123	,
f1124	,
f1125	,
f1126	,
f1127	,
f1128	,
f1129	,
f1130	,
f1131	,
f1132	,
f1133	,
f1134	,
f1135	,
f1136	,
f1137	,
f1138	,
f1139	,
f1140	,
f1141	,
f1142	,
f1143	,
f1144	,
f1145	,
f1146	,
f1147	,
f1148	,
f1149	,
f1150	,
f1151	,
f1152	,
f1153	,
f1154	,
f1155	,
f1156	,
f1157	,
f1158	,
f1159	,
f1160	,
f1161	,
f1162	,
f1163	,
f1164	,
f1165	,
f1166	,
f1167	,
f1168	,
f1169	,
f1170	,
f1171	,
f1172	,
f1173	,
f1174	,
f1175	,
f1176	,
f1177	,
f1178	,
f1179	,
f1180	,
f1181	,
f1182	,
f1183	,
f1184	,
f1185	,
f1186	,
f1187	,
f1188	,
f1189	,
f1190	,
f1191	,
f1192	,
f1193	,
f1194	,
f1195	,
f1196	,
f1197	,
f1198	,
f1199	,
f1200	,
f1201	,
f1202	,
f1203	,
f1204	,
f1205	,
f1206	,
f1207	,
f1208	,
f1209	,
f1210	,
f1211	,
f1212	,
f1213	,
f1214	,
f1215	,
f1216	,
f1217	,
f1218	,
f1219	,
f1220	,
f1221	,
f1222	,
f1223	,
f1224	,
f1225	,
f1226	,
f1227	,
f1228	,
f1229	,
f1230	,
f1231	,
f1232	,
f1233	,
f1234	,
f1235	,
f1236	,
f1237	,
f1238	,
f1239	,
f1240	,
f1241	,
f1242	,
f1243	,
f1244	,
f1245	,
f1246	,
f1247	,
f1248	,
f1249	,
f1250	,
f1251	,
f1252	,
f1253	,
f1254	,
f1255	,
f1256	,
f1257	,
f1258	,
f1259	,
f1260	,
f1261	,
f1262	,
f1263	,
f1264	,
f1265	,
f1266	,
f1267	,
f1268	,
f1269	,
f1270	,
f1271	,
f1272	,
f1273	,
f1274	,
f1275	,
f1276	,
f1277	,
f1278	,
f1279	,
f1280	,
f1281	,
f1282	,
f1283	,
f1284	,
f1285	,
f1286	,
f1287	,
f1288	,
f1289	,
f1290	,
f1291	,
f1292	,
f1293	,
f1294	,
f1295	,
f1296	,
f1297	,
f1298	,
f1299	,
f1300	,
f1301	,
f1302	,
f1303	,
f1304	,
f1305	,
f1306	,
f1307	,
f1308	,
f1309	,
f1310	,
f1311	,
f1312	,
f1313	,
f1314	,
f1315	,
f1316	,
f1317	,
f1318	,
f1319	,
f1320	,
f1321	,
f1322	,
f1323	,
f1324	,
f1325	,
f1326	,
f1327	,
f1328	,
f1329	,
f1330	,
f1331	,
f1332	,
f1333	,
f1334	,
f1335	,
f1336	,
f1337	,
f1338	,
f1339	,
f1340	,
f1341	,
f1342	,
f1343	,
f1344	,
f1345	,
f1346	,
f1347	,
f1348	,
f1349	,
f1350	,
f1351	,
f1352	,
f1353	,
f1354	,
f1355	,
f1356	,
f1357	,
f1358	,
f1359	,
f1360	,
f1361	,
f1362	,
f1363	,
f1364	,
f1365	,
f1366	,
f1367	,
f1368	,
f1369	,
f1370	,
f1371	,
f1372	,
f1373	,
f1374	,
f1375	,
f1376	,
f1377	,
f1378	,
f1379	,
f1380	,
f1381	,
f1382	,
f1383	,
f1384	,
f1385	,
f1386	,
f1387	,
f1388	,
f1389	,
f1390	,
f1391	,
f1392	,
f1393	,
f1394	,
f1395	,
f1396	,
f1397	,
f1398	,
f1399	,
f1400	,
f1401	,
f1402	,
f1403	,
f1404	,
f1405	,
f1406	,
f1407	,
f1408	,
f1409	,
f1410	,
f1411	,
f1412	,
f1413	,
f1414	,
f1415	,
f1416	,
f1417	,
f1418	,
f1419	,
f1420	,
f1421	,
f1422	,
f1423	,
f1424	,
f1425	,
f1426	,
f1427	,
f1428	,
f1429	,
f1430	,
f1431	,
f1432	,
f1433	,
f1434	,
f1435	,
f1436	,
f1437	,
f1438	,
f1439	,
f1440	,
f1441	,
f1442	,
f1443	,
f1444	,
f1445	,
f1446	,
f1447	,
f1448	,
f1449	,
f1450	,
f1451	,
f1452	,
f1453	,
f1454	,
f1455	,
f1456	,
f1457	,
f1458	,
f1459	,
f1460	,
f1461	,
f1462	,
f1463	,
f1464	,
f1465	,
f1466	,
f1467	,
f1468	,
f1469	,
f1470	,
f1471	,
f1472	,
f1473	,
f1474	,
f1475	,
f1476	,
f1477	,
f1478	,
f1479	,
f1480	,
f1481	,
f1482	,
f1483	,
f1484	,
f1485	,
f1486	,
f1487	,
f1488	,
f1489	,
f1490	,
f1491	,
f1492	,
f1493	,
f1494	,
f1495	,
f1496	,
f1497	,
f1498	,
f1499	,
f1500	,
f1501	,
f1502	,
f1503	,
f1504	,
f1505	,
f1506	,
f1507	,
f1508	,
f1509	,
f1510	,
f1511	,
f1512	,
f1513	,
f1514	,
f1515	,
f1516	,
f1517	,
f1518	,
f1519	,
f1520	,
f1521	,
f1522	,
f1523	,
f1524	,
f1525	,
f1526	,
f1527	,
f1528	,
f1529	,
f1530	,
f1531	,
f1532	,
f1533	,
f1534	,
f1535	,
f1536	,
f1537	,
f1538	,
f1539	,
f1540	,
f1541	,
f1542	,
f1543	,
f1544	,
f1545	,
f1546	,
f1547	,
f1548	,
f1549	,
f1550	,
f1551	,
f1552	,
f1553	,
f1554	,
f1555	,
f1556	,
f1557	,
f1558	,
f1559	,
f1560	,
f1561	,
f1562	,
f1563	,
f1564	,
f1565	,
f1566	,
f1567	,
f1568	,
f1569	,
f1570	,
f1571	,
f1572	,
f1573	,
f1574	,
f1575	,
f1576	,
f1577	,
f1578	,
f1579	,
f1580	,
f1581	,
f1582	,
f1583	,
f1584	,
f1585	,
f1586	,
f1587	,
f1588	,
f1589	,
f1590	,
f1591	,
f1592	,
f1593	,
f1594	,
f1595	,
f1596	,
f1597	,
f1598	,
f1599	,
f1600	,
f1601	,
f1602	,
f1603	,
f1604	,
f1605	,
f1606	,
f1607	,
f1608	,
f1609	,
f1610	,
f1611	,
f1612	,
f1613	,
f1614	,
f1615	,
f1616	,
f1617	,
f1618	,
f1619	,
f1620	,
f1621	,
f1622	,
f1623	,
f1624	,
f1625	,
f1626	,
f1627	,
f1628	,
f1629	,
f1630	,
f1631	,
f1632	,
f1633	,
f1634	,
f1635	,
f1636	,
f1637	,
f1638	,
f1639	,
f1640	,
f1641	,
f1642	,
f1643	,
f1644	,
f1645	,
f1646	,
f1647	,
f1648	,
f1649	,
f1650	,
f1651	,
f1652	,
f1653	,
f1654	,
f1655	,
f1656	,
f1657	,
f1658	,
f1659	,
f1660	,
f1661	,
f1662	,
f1663	,
f1664	,
f1665	,
f1666	,
f1667	,
f1668	,
f1669	,
f1670	,
f1671	,
f1672	,
f1673	,
f1674	,
f1675	,
f1676	,
f1677	,
f1678	,
f1679	,
f1680	,
f1681	,
f1682	,
f1683	,
f1684	,
f1685	,
f1686	,
f1687	,
f1688	,
f1689	,
f1690	,
f1691	,
f1692	,
f1693	,
f1694	,
f1695	,
f1696	,
f1697	,
f1698	,
f1699	,
f1700	,
f1701	,
f1702	,
f1703	,
f1704	,
f1705	,
f1706	,
f1707	,
f1708	,
f1709	,
f1710	,
f1711	,
f1712	,
f1713	,
f1714	,
f1715	,
f1716	,
f1717	,
f1718	,
f1719	,
f1720	,
f1721	,
f1722	,
f1723	,
f1724	,
f1725	,
f1726	,
f1727	,
f1728	,
f1729	,
f1730	,
f1731	,
f1732	,
f1733	,
f1734	,
f1735	,
f1736	,
f1737	,
f1738	,
f1739	,
f1740	,
f1741	,
f1742	,
f1743	,
f1744	,
f1745	,
f1746	,
f1747	,
f1748	,
f1749	,
f1750	,
f1751	,
f1752	,
f1753	,
f1754	,
f1755	,
f1756	,
f1757	,
f1758	,
f1759	,
f1760	,
f1761	,
f1762	,
f1763	,
f1764	,
f1765	,
f1766	,
f1767	,
f1768	,
f1769	,
f1770	,
f1771	,
f1772	,
f1773	,
f1774	,
f1775	,
f1776	,
f1777	,
f1778	,
f1779	,
f1780	,
f1781	,
f1782	,
f1783	,
f1784	,
f1785	,
f1786	,
f1787	,
f1788	,
f1789	,
f1790	,
f1791	,
f1792	,
f1793	,
f1794	,
f1795	,
f1796	,
f1797	,
f1798	,
f1799	,
f1800	,
f1801	,
f1802	,
f1803	,
f1804	,
f1805	,
f1806	,
f1807	,
f1808	,
f1809	,
f1810	,
f1811	,
f1812	,
f1813	,
f1814	,
f1815	,
f1816	,
f1817	,
f1818	,
f1819	,
f1820	,
f1821	,
f1822	,
f1823	,
f1824	,
f1825	,
f1826	,
f1827	,
f1828	,
f1829	,
f1830	,
f1831	,
f1832	,
f1833	,
f1834	,
f1835	,
f1836	,
f1837	,
f1838	,
f1839	,
f1840	,
f1841	,
f1842	,
f1843	,
f1844	,
f1845	,
f1846	,
f1847	,
f1848	,
f1849	,
f1850	,
f1851	,
f1852	,
f1853	,
f1854	,
f1855	,
f1856	,
f1857	,
f1858	,
f1859	,
f1860	,
f1861	,
f1862	,
f1863	,
f1864	,
f1865	,
f1866	,
f1867	,
f1868	,
f1869	,
f1870	,
f1871	,
f1872	,
f1873	,
f1874	,
f1875	,
f1876	,
f1877	,
f1878	,
f1879	,
f1880	,
f1881	,
f1882	,
f1883	,
f1884	,
f1885	,
f1886	,
f1887	,
f1888	,
f1889	,
f1890	,
f1891	,
f1892	,
f1893	,
f1894	,
f1895	,
f1896	,
f1897	,
f1898	,
f1899	,
f1900	,
f1901	,
f1902	,
f1903	,
f1904	,
f1905	,
f1906	,
f1907	,
f1908	,
f1909	,
f1910	,
f1911	,
f1912	,
f1913	,
f1914	,
f1915	,
f1916	,
f1917	,
f1918	,
f1919	,
f1920	,
f1921	,
f1922	,
f1923	,
f1924	,
f1925	,
f1926	,
f1927	,
f1928	,
f1929	,
f1930	,
f1931	,
f1932	,
f1933	,
f1934	,
f1935	,
f1936	,
f1937	,
f1938	,
f1939	,
f1940	,
f1941	,
f1942	,
f1943	,
f1944	,
f1945	,
f1946	,
f1947	,
f1948	,
f1949	,
f1950	,
f1951	,
f1952	,
f1953	,
f1954	,
f1955	,
f1956	,
f1957	,
f1958	,
f1959	,
f1960	,
f1961	,
f1962	,
f1963	,
f1964	,
f1965	,
f1966	,
f1967	,
f1968	,
f1969	,
f1970	,
f1971	,
f1972	,
f1973	,
f1974	,
f1975	,
f1976	,
f1977	,
f1978	,
f1979	,
f1980	,
f1981	,
f1982	,
f1983	,
f1984	,
f1985	,
f1986	,
f1987	,
f1988	,
f1989	,
f1990	,
f1991	,
f1992	,
f1993	,
f1994	,
f1995	,
f1996	,
f1997	,
f1998	,
f1999	,
f2000	,
f2001	,
f2002	,
f2003	,
f2004	,
f2005	,
f2006	,
f2007	,
f2008	,
f2009	,
f2010	,
f2011	,
f2012	,
f2013	,
f2014	,
f2015	,
f2016	,
f2017	,
f2018	,
f2019	,
f2020	,
f2021	,
f2022	,
f2023	,
f2024	,
f2025	,
f2026	,
f2027	,
f2028	,
f2029	,
f2030	,
f2031	,
f2032	,
f2033	,
f2034	,
f2035	,
f2036	,
f2037	,
f2038	,
f2039	,
f2040	,
f2041	,
f2042	,
f2043	,
f2044	,
f2045	,
f2046	,
f2047	,
f2048	,
f2049	,
f2050	,
f2051	,
f2052	,
f2053	,
f2054	,
f2055	,
f2056	,
f2057	,
f2058	,
f2059	,
f2060	,
f2061	,
f2062	,
f2063	,
f2064	,
f2065	,
f2066	,
f2067	,
f2068	,
f2069	,
f2070	,
f2071	,
f2072	,
f2073	,
f2074	,
f2075	,
f2076	,
f2077	,
f2078	,
f2079	,
f2080	,
f2081	,
f2082	,
f2083	,
f2084	,
f2085	,
f2086	,
f2087	,
f2088	,
f2089	,
f2090	,
f2091	,
f2092	,
f2093	,
f2094	,
f2095	,
f2096	,
f2097	,
f2098	,
f2099	,
f2100	,
f2101	,
f2102	,
f2103	,
f2104	,
f2105	,
f2106	,
f2107	,
f2108	,
f2109	,
f2110	,
f2111	,
f2112	,
f2113	,
f2114	,
f2115	,
f2116	,
f2117	,
f2118	,
f2119	,
f2120	,
f2121	,
f2122	,
f2123	,
f2124	,
f2125	,
f2126	,
f2127	,
f2128	,
f2129	,
f2130	,
f2131	,
f2132	,
f2133	,
f2134	,
f2135	,
f2136	,
f2137	,
f2138	,
f2139	,
f2140	,
f2141	,
f2142	,
f2143	,
f2144	,
f2145	,
f2146	,
f2147	,
f2148	,
f2149	,
f2150	,
f2151	,
f2152	,
f2153	,
f2154	,
f2155	,
f2156	,
f2157	,
f2158	,
f2159	,
f2160	,
f2161	,
f2162	,
f2163	,
f2164	,
f2165	,
f2166	,
f2167	,
f2168	,
f2169	,
f2170	,
f2171	,
f2172	,
f2173	,
f2174	,
f2175	,
f2176	,
f2177	,
f2178	,
f2179	,
f2180	,
f2181	,
f2182	,
f2183	,
f2184	,
f2185	,
f2186	,
f2187	,
f2188	,
f2189	,
f2190	,
f2191	,
f2192	,
f2193	,
f2194	,
f2195	,
f2196	,
f2197	,
f2198	,
f2199	,
f2200	,
f2201	,
f2202	,
f2203	,
f2204	,
f2205	,
f2206	,
f2207	,
f2208	,
f2209	,
f2210	,
f2211	,
f2212	,
f2213	,
f2214	,
f2215	,
f2216	,
f2217	,
f2218	,
f2219	,
f2220	,
f2221	,
f2222	,
f2223	,
f2224	,
f2225	,
f2226	,
f2227	,
f2228	,
f2229	,
f2230	,
f2231	,
f2232	,
f2233	,
f2234	,
f2235	,
f2236	,
f2237	,
f2238	,
f2239	,
f2240	,
f2241	,
f2242	,
f2243	,
f2244	,
f2245	,
f2246	,
f2247	,
f2248	,
f2249	,
f2250	,
f2251	,
f2252	,
f2253	,
f2254	,
f2255	,
f2256	,
f2257	,
f2258	,
f2259	,
f2260	,
f2261	,
f2262	,
f2263	,
f2264	,
f2265	,
f2266	,
f2267	,
f2268	,
f2269	,
f2270	,
f2271	,
f2272	,
f2273	,
f2274	,
f2275	,
f2276	,
f2277	,
f2278	,
f2279	,
f2280	,
f2281	,
f2282	,
f2283	,
f2284	,
f2285	,
f2286	,
f2287	,
f2288	,
f2289	,
f2290	,
f2291	,
f2292	,
f2293	,
f2294	,
f2295	,
f2296	,
f2297	,
f2298	,
f2299	,
f2300	,
f2301	,
f2302	,
f2303	,
f2304	,
f2305	,
f2306	,
f2307	,
f2308	,
f2309	,
f2310	,
f2311	,
f2312	,
f2313	,
f2314	,
f2315	,
f2316	,
f2317	,
f2318	,
f2319	,
f2320	,
f2321	,
f2322	,
f2323	,
f2324	,
f2325	,
f2326	,
f2327	,
f2328	,
f2329	,
f2330	,
f2331	,
f2332	,
f2333	,
f2334	,
f2335	,
f2336	,
f2337	,
f2338	,
f2339	,
f2340	,
f2341	,
f2342	,
f2343	,
f2344	,
f2345	,
f2346	,
f2347	,
f2348	,
f2349	,
f2350	,
f2351	,
f2352	,
f2353	,
f2354	,
f2355	,
f2356	,
f2357	,
f2358	,
f2359	,
f2360	,
f2361	,
f2362	,
f2363	,
f2364	,
f2365	,
f2366	,
f2367	,
f2368	,
f2369	,
f2370	,
f2371	,
f2372	,
f2373	,
f2374	,
f2375	,
f2376	,
f2377	,
f2378	,
f2379	,
f2380	,
f2381	,
f2382	,
f2383	,
f2384	,
f2385	,
f2386	,
f2387	,
f2388	,
f2389	,
f2390	,
f2391	,
f2392	,
f2393	,
f2394	,
f2395	,
f2396	,
f2397	,
f2398	,
f2399	,
f2400	,
f2401	,
f2402	,
f2403	,
f2404	,
f2405	,
f2406	,
f2407	,
f2408	,
f2409	,
f2410	,
f2411	,
f2412	,
f2413	,
f2414	,
f2415	,
f2416	,
f2417	,
f2418	,
f2419	,
f2420	,
f2421	,
f2422	,
f2423	,
f2424	,
f2425	,
f2426	,
f2427	,
f2428	,
f2429	,
f2430	, f2431	, f2432	,f2433	,f2434	,
f2435	,
f2436	, f2437	,
f2438	,
f2439	,
f2440	,
f2441	,
f2442	,
f2443	,
f2444	,
f2445	,
f2446	,
 f2447
};
       return array_value;
   }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        iteration cse=new iteration();
         iteration.getvalue();
        cse.set_frame();


//         int randomValue = iteration.randomValue();
       // cse.getValues();



 System.out.print(f2447);

    }


}
