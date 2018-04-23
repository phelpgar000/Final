import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener{

    Board board;

    public Game(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setTitle("Law is a nerd.");
        board = new Board();
        add(board);
        addKeyListener(this);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){

        Game game = new Game();
        game.board.setup();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            Stats.rightYes();
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            Stats.leftYes();
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            Stats.upYes();
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            Stats.downYes();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            Stats.rightNo();
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            Stats.leftNo();
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            Stats.upNo();
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            Stats.downNo();
        }
    }
}
