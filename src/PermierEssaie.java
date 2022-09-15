import javax.swing.*;
import java.awt.event.*;

public class PermierEssaie extends JFrame{
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public PermierEssaie() {
        this.setTitle("curseur");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setResizable(false);
        monMethode();
        setResizable();
        this.setVisible(true);
        this.isResizable();
    }


    private void monMethode() {
        // le curseur numéroté
        JSlider	curseur = new JSlider(JSlider.VERTICAL,0,100,80);
        curseur.setMajorTickSpacing(10);
        curseur.setMinorTickSpacing(2);
        curseur.setPaintTicks(true);
        curseur.setPaintTrack(true);
        curseur.setLabelTable(curseur.createStandardLabels(20,14));
        curseur.setPaintLabels(true);


        this.setContentPane(curseur);

        JFileChooser file = new JFileChooser();

        //file.setDialogTitle("name du fichier");

        //file.setFileSelectionMode(JFileChooser.FILES_ONLY);


        this.setContentPane(file);

    }
    public void dispose() {

    }

    public void setResizable() {
        if(this.isResizable() == false){
            System.out.println("fenetre non dimensionnanble");
        }
        else{
            System.out.println("fenetre dimensionnable");
        }
    }




      /*

       getRootPane().setDefaultButton(buttonOK);
      buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }*/

    public static void main(String[] args) {
        PermierEssaie dialog = new PermierEssaie();
        dialog.pack();
      // dialog.setVisible(true);
        //System.exit(0);
    }
}
