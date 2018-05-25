import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener{

    Board board;

    public Game(){
        JFrame window = new JFrame();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setTitle("Law is a nerd.");
        board = new Board();
        add(board);
        window.setBounds(30, 30, 300, 300);
        window.getContentPane().add(new DrawImage());
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
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            Stats.startPlay();
            Stats.endMenu();
            Stats.endEnd();
            Stats.endPause();
            Stats.endDeath();
        }
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            Stats.startMenu();
            Stats.endPause();
            Stats.endPlay();
            Stats.endEnd();
            Stats.endDeath();
        }
        if(e.getKeyCode() == KeyEvent.VK_P){
            Stats.togglePlay();
            Stats.togglePause();
            Stats.endMenu();
            Stats.endEnd();
            Stats.endDeath();
        }
        if(e.getKeyCode() == KeyEvent.VK_E){
            Stats.endMenu();
            Stats.endPause();
            Stats.endPlay();
            Stats.startEnd();
            Stats.endDeath();
        }
        if(e.getKeyCode() == KeyEvent.VK_D){
            Stats.endPlay();
            Stats.endPause();
            Stats.endEnd();
            Stats.endMenu();
            Stats.startDeath();
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
