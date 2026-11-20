final class u {
   private int d = 0;
   private int[] e = null;
   private int[] f = null;
   private int g = 0;
   private int[] h = null;
   private int[] i = null;
   private boolean j = false;
   private boolean k = false;
   int a = 0;
   private int l = 0;
   private int m = 0;
   private int n = 0;
   private int o = 0;
   private int p = 0;
   private int q = 2;
   private int r = 0;
   private int s = 0;
   private int t = 0;
   public static int b = -1;
   static boolean c = false;

   public u() {
      this.g = 0;
      this.t = 0;
      this.m = 0;
      this.n = 0;
      this.b(0);
   }

   public final void a(int var1) {
      this.t = var1;
   }

   public final int a() {
      return this.d;
   }

   public final void b(int var1) {
      this.d = var1;
      this.h = new int[this.d];
      this.i = new int[this.d];
      this.e = new int[this.d];
      this.f = new int[this.d];
   }

   public final void b() {
      this.g = 1;
   }

   public final void a(boolean var1) {
      this.j = var1;
   }

   public final void b(boolean var1) {
      this.k = var1;
   }

   public final int c() {
      return this.a;
   }

   public final int d() {
      return this.l;
   }

   public final void c(int var1) {
      this.m = var1;
   }

   public final void d(int var1) {
      this.n = var1;
   }

   public final int e() {
      return this.m;
   }

   public final int f() {
      return this.n;
   }

   public final void e(int var1) {
      for (int var2 = 0; var2 < this.d; var2++) {
         int var3 = var2;
         this.e[var3] = var1;
      }
   }

   public final void f(int var1) {
      for (int var2 = 0; var2 < this.d; var2++) {
         int var3 = var2;
         this.f[var3] = var1;
      }
   }

   public final void g(int var1) {
      for (int var2 = 0; var2 < this.d; var2++) {
         int var3 = var2;
         this.h[var3] = var1;
      }
   }

   public final void h(int var1) {
      for (int var2 = 0; var2 < this.d; var2++) {
         int var3 = var2;
         this.i[var3] = var1;
      }
   }

   public final int g() {
      if (this.t == 0) {
         return this.e != null && this.e.length != 0 ? this.e[0] * this.g : 0;
      }

      int var1 = 0;
      int var2 = (this.d + (this.g - 1)) / this.g;

      for (int var3 = 0; var3 < var2; var3++) {
         var1 += this.e[var3];
      }

      if (var1 < this.m) {
         var1 = this.m;
      }

      return var1;
   }

   public final int h() {
      if (this.t != 0) {
         return this.f[0] * this.g;
      }

      int var1 = 0;

      for (int var2 = 0; var2 < this.d; var2 += this.g) {
         var1 += this.f[var2];
      }

      if (var1 < this.n) {
         var1 = this.n;
      }

      return var1;
   }

   public final void i() {
      int var1 = 0;
      int var2 = 0;
      if (this.r != 0) {
         this.r = this.r * (this.q - 1) / this.q;
         var1 = this.r;
      }

      if (this.s != 0) {
         this.s = this.s * (this.q - 1) / this.q;
         var2 = this.s;
      }

      this.b(var1, var2);
      c = this.o != this.a || this.p != this.l;
      this.o = this.a;
      this.p = this.l;
   }

   public final void j() {
      this.r = 0;
      this.s = 0;
      c = false;
   }

   public final void a(int var1, int var2) {
      this.r = var1;
      this.s = var2;
      this.q = 4;
   }

   public final void k() {
      this.a = 0;
      this.l = 0;
      c = false;
      this.r = 0;
      this.s = 0;
   }

   public final void b(int var1, int var2) {
      if (this.f != null && this.f.length != 0 && this.e != null && this.e.length != 0) {
         int var3 = 0;
         int var4 = 0;
         if (!this.j) {
            var3 = var1;
         }

         if (!this.k) {
            var4 = var2;
         }

         this.a += var3;
         this.l += var4;
         if (this.t == 0) {
            var1 = -(this.h() - this.n);
         } else {
            var1 = -this.f[0] * (this.g - 1);
         }

         if (this.l > 0) {
            this.l = 0;
         } else if (this.l < var1) {
            this.l = var1;
         }

         if (this.t == 0) {
            var1 = -this.e[0] * (this.g - 1);
         } else {
            var1 = -(this.g() - this.m);
         }

         if (this.a > 0) {
            this.a = 0;
         } else {
            if (this.a < var1) {
               this.a = var1;
            }
         }
      }
   }

   public final int i(int var1) {
      int var2 = var1;
      u var5 = this;
      int var3 = 0;
      if (var5.t == 0) {
         var2 %= var5.g;
      } else {
         var2 /= var5.g;
      }

      for (int var4 = 0; var4 < var2; var4++) {
         var3 += var5.e[var4];
      }

      return var3 + var5.a;
   }

   public final int j(int var1) {
      return this.a(var1, true);
   }

   public final int a(int var1, boolean var2) {
      int var3 = 0;
      if (this.t == 0) {
         var1 /= this.g;
      } else {
         var1 %= this.g;
      }

      for (int var4 = 0; var4 < var1; var4++) {
         var3 += this.f[var4];
      }

      return var3 + (var2 ? this.l : 0);
   }

   public final int c(int var1, int var2) {
      int var3 = -1;
      var1 -= this.a;
      var2 -= this.l;
      int var4 = 0;
      int var5 = var1;

      for (int var6 = 0; var6 < this.d && var5 >= this.e[var6]; var6++) {
         var5 -= this.e[var6];
         var4++;
      }

      int var11 = 0;
      int var7 = var2;

      for (int var8 = 0; var8 < this.d && var7 >= this.f[var8]; var8++) {
         var7 -= this.f[var8];
         var11++;
      }

      if (this.t == 0) {
         if (var1 > 0 && var4 < this.g && var2 > 0 && var11 < this.d / this.g + 1) {
            int var12;
            if ((var12 = var11 * this.g + var4) >= this.d) {
               var3 = -1;
            } else if (var5 < this.h[var12] && var7 < this.i[var12]) {
               var3 = var12;
            }
         }
      } else if (var1 > 0 && var4 < this.d / this.g + 1 && var2 > 0 && var11 < this.g) {
         int var13;
         if ((var13 = var4 * this.g + var11) >= this.d) {
            var3 = -1;
         } else if (var5 < this.h[var13] && var7 < this.i[var13]) {
            var3 = var13;
         }
      }

      return var3;
   }
}
