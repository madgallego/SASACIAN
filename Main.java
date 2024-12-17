import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main (String [] args){
SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        try {
                            UIManager.setLookAndFeel(info.getClassName());
                        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                                 | UnsupportedLookAndFeelException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                }

                new ReceiptUI();
            }
        });
    }
}
