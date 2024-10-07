import java.util .*;
public class TypeA extends Thing {
    public TypeA (int row, int col, char lab) {     //initializes obects with these values
        super(row, col, lab);
    }
    public void maybeTurn(Random rand) {    //decides which way to turn, or to turn at all
        int i = rand.nextInt(3);      //random number between 0-2 is generated
        if (i == 1) {                       //turns right if the number is 1
            this.rightTurn();
          }
    
          if (i == 2) {                     //turns left if it is 2
            this.leftTurn();
          }
        }
}

