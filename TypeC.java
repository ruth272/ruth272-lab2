import java.util.Random;

public class TypeC extends Thing {
    public TypeC (int row, int col, char lab) {     //initializes obects with these values
        super(row, col, lab);
    }

    public void maybeTurn(Random rand) {    //decides which way to turn, or to turn at all
        int i = rand.nextInt(4);      //random number between 0-3 is generated
        if (i == 1 || i == 2) {                       //turns right if the number is 1 or 2
            this.rightTurn();
          }
    
          if (i == 3) {                     //turns left if it is 3
            this.leftTurn();
          }
        }
}
