import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    public class okno extends JFrame {
        private int count = 0;

        public JButton button, button1;
        private JTextField fio = new JTextField(20);
        private JLabel metka = new JLabel("Ваше имя?");
        private JLabel metkaDva = new JLabel("");
        private JLabel metkaTri = new JLabel("");
        private boolean state = false;

        void move(){
            if(state) {
                button.setLocation(65, 60);
                button1.setLocation(65, 100);
            }
            else {
                button.setLocation(65, 100);
                button1.setLocation(65, 60);
            }
            state = !state;
        }

        class PushingListener implements ActionListener {
            public void actionPerformed(ActionEvent e){
                Object button = e.getSource();
                move();
                if(button instanceof JButton){
                    count++;
                    //((JButton)button).setText("Нажато " + count + " раз");
                    metkaDva.setText("Спасибо, "+fio.getText()+"!");
                    metkaTri.setText("Нажато " + count + " раз");
                }
            }
        }

        class BAT implements ActionListener {
            public void actionPerformed(ActionEvent e){
                Object button1= e.getSource();
                if (button1 instanceof JButton){
                    setSize(500, 500);
                }
            }
        }

        public okno(String title)
        {
            super(title);
            SozdatxOkno();
        }

        private void SozdatxOkno(){
            button = new JButton(" Нажми меня! ");
            button.setBounds(65,60,150,40);
            button.addActionListener(new PushingListener());
            button1 = new JButton(" Кнопка ");
            button1.setBounds(65,100,150,40);
            button1.addActionListener(new BAT());

            metka.setBounds(15,15,95,30);
            metkaDva.setBounds(15,135,200,30);
            metkaTri.setBounds(15,135,300,55);

            fio.setBounds(120, 15, 100, 30);

            getContentPane().setLayout(null);
            getContentPane().add(button);
            getContentPane().add(button1);
            getContentPane().add(metka);
            getContentPane().add(metkaDva);
            getContentPane().add(metkaTri);
            getContentPane().add(fio);

            setLocationRelativeTo(null);
        }
    }

