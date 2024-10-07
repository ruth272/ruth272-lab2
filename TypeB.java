import java.util.Random;

public class TypeB extends Thing {
   public TypeB(int var1, int var2, char var3) {
      super(var1, var2, var3);
   }

   public void maybeTurn(Random var1) {
      int var2 = var1.nextInt(3);
      if (var2 == 1 && var2 == 2) {
         this.leftTurn();
      }

   }
}
