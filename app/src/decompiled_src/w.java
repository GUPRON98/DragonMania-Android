final class w {
   w a;
   w[] b;
   int c;
   int d;
   int[] e;

   public static byte[] a(w var0) {
      return var0.a(var0, null);
   }

   public static w a(byte[] var0) {
      w var1 = new w();
      int[] var2;
      (var2 = new int[1])[0] = 0;
      return var1.a(var0, var2);
   }

   private w a(byte[] var1, int[] var2) {
      new w();
      w var3 = b(var1, var2);
      int var10002 = var2[0];
      int[] var5 = var2;
      byte[] var4 = var1;
      int var6 = t.c(var4, 5 + var5[0]);
      var2[0] = var10002 + 9 + (var6 << 2);

      for (int var7 = 0; var7 < var3.c; var7++) {
         var3.b(this.a(var1, var2));
      }

      return var3;
   }

   private byte[] a(w var1, byte[] var2) {
      w var3 = var1;
      int var4 = 2 + var3.e.length;
      byte[] var10;
      t.a(var10 = new byte[1 + (var4 << 2)], 0, (byte)var3.d);
      t.a(var10, 1, var3.c);
      t.a(var10, 5, var3.e.length);

      for (int var5 = 0; var5 < var3.e.length; var5++) {
         t.a(var10, 9 + (var5 << 2), var3.e[var5]);
      }

      byte[] var9 = var10;
      byte[] var11;
      if (var2 != null) {
         var11 = new byte[var9.length + var2.length];
      } else {
         var11 = new byte[var9.length];
      }

      if (var2 != null) {
         try {
            t.a(var2, 0, var11, 0, var2.length);
         } catch (Exception var7) {
         }
      }

      try {
         if (var2 != null) {
            t.a(var9, 0, var11, var2.length, var9.length);
         } else {
            t.a(var9, 0, var11, 0, var9.length);
         }
      } catch (Exception var6) {
      }

      for (int var8 = 0; var8 < var1.c; var8++) {
         if (var1.b[var8] != null) {
            var11 = this.a(var1.b[var8], var11);
         }
      }

      return var11;
   }

   private static w b(byte[] var0, int[] var1) {
      byte var3 = t.a(var0, var1[0]);
      int var4 = t.c(var0, var1[0] + 1);
      int var5;
      int[] var2 = new int[var5 = t.c(var0, var1[0] + 5)];

      for (int var6 = 0; var6 < var2.length; var6++) {
         var2[var6] = t.c(var0, var1[0] + 9 + (var6 << 2));
      }

      w var8;
      (var8 = new w()).d = var3;
      var8.c = var4;
      var8.e = new int[var5];
      var8.b = new w[var4];

      for (int var9 = 0; var9 < var8.c; var9++) {
         var8.b[var9] = null;
      }

      try {
         t.a(var2, 0, var8.e, 0, var2.length);
      } catch (Exception var7) {
      }

      return var8;
   }

   public final w a(w var1, int var2, int var3) {
      if (var1.e[0] == var2 && var1.d == var3) {
         return var1;
      }

      for (int var4 = 0; var4 < var1.c; var4++) {
         w var5;
         if (var1.b[var4] != null && (var5 = this.a(var1.b[var4], var2, var3)) != null && var5.e[0] == var2 && var5.d == var3) {
            return var5;
         }
      }

      return null;
   }

   public static int a(w var0, int var1) {
      int[] var2;
      (var2 = new int[1])[0] = 0;
      var0.a(var0, var1, var2);
      return var2[0];
   }

   private void a(w var1, int var2, int[] var3) {
      if (var1.d == var2 && var3[0] <= var1.e[0]) {
         var3[0] = var1.e[0];
      }

      for (int var4 = 0; var4 < var1.c; var4++) {
         if (var1.b[var4] != null) {
            this.a(var1.b[var4], var2, var3);
         }
      }
   }

   public final boolean a(int var1, int var2) {
      boolean var4 = false;

      int var3;
      for (var3 = 0; var3 < this.c && !var4; var3++) {
         if (this.b[var3].e[0] == var1 && this.b[var3].d == var2) {
            this.b[var3] = null;
            var4 = true;
         }
      }

      var3--;
      if (var4) {
         this.c--;
         w[] var7 = new w[this.c];
         if (var3 != 0) {
            try {
               t.a(this.b, 0, var7, 0, var3);
            } catch (Exception var6) {
            }
         }

         if (var3 != this.c) {
            try {
               t.a(this.b, var3 + 1, var7, var3, this.c - var3);
            } catch (Exception var5) {
            }
         }

         this.b = var7;
      }

      return var4;
   }

   public final void b(w var1) {
      var1.a = this;
      if (this.c == 0) {
         this.c = 1;
         this.b = new w[this.c];
         this.b[0] = null;
      }

      for (int var2 = 0; var2 < this.c; var2++) {
         if (this.b[var2] == null) {
            this.b[var2] = var1;
            return;
         }
      }

      w[] var4 = new w[this.c + 1];

      try {
         t.a(this.b, 0, var4, 0, this.c);
      } catch (Exception var3) {
      }

      this.b = var4;
      this.b[this.c] = var1;
      this.c++;
   }
}
