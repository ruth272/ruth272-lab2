import java.util.Random;

public class TypeB extends Thing {
   public TypeB(int row, int col, char lab) {         //initializes row, col, and lab with different names
      super(row, col, lab);
   }

   public void maybeTurn(Random row) {         //decides wether to turn
      int col = row.nextInt(3);         //generates a random number between 0 to 2
      if (col == 1 || col == 2) {             //turns left if true
         this.leftTurn();
      }

   }
}
