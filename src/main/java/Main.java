import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("20");
        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        String show = JOptionPane.showInputDialog("");
        input = Integer.parseInt(show);
        while(input != answer){
            if(input > answer){
                show = JOptionPane.showInputDialog("too big guess again");
                input = Integer.parseInt(show);
            }else if(input < answer){
                show = JOptionPane.showInputDialog("too small guess agian");
                input = Integer.parseInt(show);
            }
        }System.out.print("you are right!");
    }
}