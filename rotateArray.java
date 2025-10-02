import java.util.Arrays;

class rotateArray {
   public rotateArray() {
   }

   public static void OptimalRot(int[] var0, int var1) {
      int var2 = var0.length;
      var1 %= var2;
      rotate(var0, 0, var2 - 1);
      rotate(var0, 0, var1 - 1);
      rotate(var0, var1, var2 - 1);
   }

   public static void rotate(int[] var0, int var1, int var2) {
      while(var1 < var2) {
         int var3 = var0[var1];
         var0[var1] = var0[var2];
         var0[var2] = var3;
         ++var1;
         --var2;
      }

   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{1, 2, 3, 4, 5, 6, 7};
      OptimalRot(var1, 3);
      System.out.println(Arrays.toString(var1));
   }
}
