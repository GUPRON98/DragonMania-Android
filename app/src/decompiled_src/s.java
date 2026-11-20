final class s {
   public int[] a;
   private int[] m;
   public int[] b;
   public d[] c;
   private int[] n;
   public int[] d;
   private int[] o;
   private int[] p;
   public p[] e;
   private int[] q;
   public int[] f;
   public int[] g;
   public int[] h;
   public int[] i;
   public boolean[] j;
   public byte[] k;
   private int[] r;
   private int[] s;
   private int[] t;
   private int[] u;
   private int[] v;
   private int[] w;
   private int[] x;
   private int[] y;
   public q l;

   public static s a(int var0, int var1, int var2, int var3, int var4) {
      s var5;
      (var5 = new s()).e = new p[var0];
      var5.q = new int[var0];
      var5.f = new int[var0];
      var5.g = new int[var0];
      var5.h = new int[var0];
      var5.i = new int[var0];
      var5.j = new boolean[var0];
      var5.k = new byte[var0];
      var5.r = new int[var0];
      var5.s = new int[var0];

      for (int var6 = 0; var6 < var0; var6++) {
         var5.f[var6] = -1;
      }

      for (int var7 = 0; var7 < var0; var7++) {
         var5.r[var7] = 0;
      }

      for (int var8 = 0; var8 < var0; var8++) {
         var5.s[var8] = 0;
      }

      for (int var9 = 0; var9 < var0; var9++) {
         var5.q[var9] = 0;
      }

      var5.a = new int[var2];
      var5.m = new int[var2];
      var5.b = new int[var2];

      for (int var10 = 0; var10 < var2; var10++) {
         var5.b[var10] = -1;
      }

      for (int var11 = 0; var11 < var2; var11++) {
         var5.m[var11] = 0;
      }

      var5.c = new d[var1];
      var5.n = new int[var1];
      var5.d = new int[var1];
      var5.o = new int[var1];
      var5.p = new int[var1];

      for (int var12 = 0; var12 < var1; var12++) {
         var5.d[var12] = -1;
      }

      for (int var13 = 0; var13 < var1; var13++) {
         var5.n[var13] = 0;
      }

      for (int var14 = 0; var14 < var1; var14++) {
         var5.o[var14] = 0;
      }

      for (int var15 = 0; var15 < var1; var15++) {
         var5.p[var15] = 0;
      }

      var5.t = new int[var3];
      var5.u = new int[var3];
      var5.v = new int[var3];

      for (int var16 = 0; var16 < var3; var16++) {
         var5.u[var16] = -1;
      }

      for (int var17 = 0; var17 < var3; var17++) {
         var5.t[var17] = 0;
      }

      for (int var18 = 0; var18 < var3; var18++) {
         var5.v[var18] = -1;
      }

      var5.w = new int[var4];
      var5.x = new int[var4];
      var5.y = new int[var4];

      for (int var19 = 0; var19 < var4; var19++) {
         var5.w[var19] = -1;
      }

      for (int var20 = 0; var20 < var4; var20++) {
         var5.x[var20] = 0;
      }

      for (int var21 = 0; var21 < var4; var21++) {
         var5.y[var21] = 300;
      }

      var5.l = null;
      return var5;
   }

   public final void a(int var1) {
      this.u[0] = 1000;
      this.v[0] = var1;
   }

   public final void a(int var1, int var2, int var3) {
      this.x[var1] = var2;
      this.y[var1] = var3;
   }

   public final void a(int var1, p var2) {
      this.e[var1] = var2;
   }

   public final void a(int var1, int var2) {
      this.f[var1] = var2;
   }

   public final void b(int var1, int var2) {
      this.g[var1] = var2;
   }

   public final void c(int var1, int var2) {
      this.h[var1] = 0;
   }

   public final void d(int var1, int var2) {
      this.i[var1] = var2;
   }

   public final void a(q var1) {
      this.l = null;
   }

   public final void a(int var1, boolean var2) {
      this.j[var1] = false;
   }

   public final void a(int var1, byte var2) {
      this.k[var1] = var2;
   }

   public final void b(int var1, int var2, int var3) {
      this.r[var1] = var2;
      this.s[var1] = var3;
   }

   public final void e(int var1, int var2) {
      this.a[var1] = var2;
   }

   public final void f(int var1, int var2) {
      this.b[var1] = var2;
   }

   public final void a(int var1, d var2) {
      this.c[var1] = var2;
   }

   public final void g(int var1, int var2) {
      this.d[var1] = var2;
   }

   public final void c(int var1, int var2, int var3) {
      this.o[var1] = var2;
      this.p[var1] = var3;
   }

   public final void a() {
      if (this.e != null) {
         for (int var1 = 0; var1 < this.e.length; var1++) {
            this.e[var1].a();
            this.q[var1] = 0;
         }
      }

      if (this.c != null) {
         for (int var2 = 0; var2 < this.c.length; var2++) {
            this.n[var2] = 0;
            this.c[var2].a(this.c[var2].e, this.c[var2].d.c());
         }
      }

      if (this.a != null) {
         for (int var3 = 0; var3 < this.a.length; var3++) {
            this.m[var3] = 0;
         }
      }

      if (this.v != null) {
         for (int var4 = 0; var4 < this.v.length; var4++) {
            this.t[var4] = 0;
         }
      }

      if (this.y != null) {
         for (int var5 = 0; var5 < this.y.length; var5++) {
            this.w[var5] = 0;
         }
      }
   }

   public final void b() {
      if (this.e != null) {
         for (int var1 = 0; var1 < this.e.length; var1++) {
            if (this.q[var1] > this.f[var1]) {
               if (!this.e[var1].b()) {
                  this.e[var1].a(t.aq);
               }
            } else if (this.f[var1] >= 0) {
               this.q[var1] = this.q[var1] + t.aq;
            }
         }
      }

      if (this.v != null) {
         for (int var5 = 0; var5 < this.v.length; var5++) {
            if (this.u[var5] >= 0) {
               if (this.t[var5] < this.u[var5]) {
                  this.t[var5] = this.t[var5] + t.aq;
               } else {
                  this.u[var5] = -1;
                  t.a(this.v[var5]);
               }
            }
         }
      }

      if (this.y != null) {
         for (int var6 = 0; var6 < this.y.length; var6++) {
            if (this.x[var6] >= 0) {
               if (this.w[var6] < this.x[var6]) {
                  this.w[var6] = this.w[var6] + t.aq;
               } else {
                  this.x[var6] = -1;
                  t.g();
               }
            }
         }
      }

      if (this.a != null) {
         for (int var7 = 0; var7 < this.a.length; var7++) {
            if (this.m[var7] > this.b[var7]) {
               if (this.a[var7] > 0) {
                  this.a[var7] = this.a[var7] - t.aq;
               }
            } else if (this.b[var7] >= 0) {
               this.m[var7] = this.m[var7] + t.aq;
            }
         }
      }

      if (this.c != null) {
         for (int var8 = 0; var8 < this.c.length; var8++) {
            if (this.n[var8] > this.d[var8]) {
               if (this.c[var8] != null && !this.c[var8].f()) {
                  int var2 = this.o[var8];
                  int var3 = this.p[var8];
                  if (this.l != null) {
                     var2 += this.l.av - t.m;
                     var3 += this.l.aw - t.n;
                     var2 = var2 * t.S / 100;
                     var3 = var3 * t.S / 100;
                  }

                  d var10000 = this.c[var8];
                  int var4 = var3;
                  var3 = var2;
                  d var10 = var10000;
                  var10000.a = var3;
                  var10.b = var4;
                  this.c[var8].c(t.aq);
               }
            } else if (this.d[var8] >= 0) {
               this.n[var8] = this.n[var8] + t.aq;
            }
         }
      }
   }

   public final boolean c() {
      boolean var1 = true;
      if (this.e != null) {
         for (int var2 = 0; var2 < this.e.length; var2++) {
            if (var1) {
               p var3;
               var1 = (var3 = this.e[var2]).a == 0;
            }
         }
      }

      if (this.c != null) {
         for (int var4 = 0; var4 < this.c.length; var4++) {
            if (!this.c[var4].f() && var1) {
               var1 = false;
            }
         }
      }

      return var1;
   }

   public final void d() {
      if (this.e != null) {
         for (int var1 = 0; var1 < this.e.length; var1++) {
            if (this.q[var1] > this.f[var1] && !this.e[var1].b()) {
               int var2 = this.r[var1];
               int var3 = this.s[var1];
               boolean var4 = this.j[var1];
               if (this.l != null) {
                  if (!t.o) {
                     var2 += this.l.av - t.m;
                     var3 += this.l.aw - t.n;
                     var2 = var2 * t.S / 100;
                     var3 = var3 * t.S / 100;
                  } else {
                     var2 = (var2 >> 1) + ((this.l.av >> 1) - t.m);
                     var3 += (this.l.aw >> 1) - t.n;
                     var2 = var2 * t.S / 100;
                     var3 = var3 * t.S / 100;
                  }
               }

               if (this.h == null) {
                  this.e[var1].a(t.am, t.j[3][this.g[var1]], this.i[var1], var2, var3, var4, this.k[var1]);
               } else if (this.h[var1] == 0) {
                  this.e[var1].a(t.am, t.j[3][this.g[var1]], this.i[var1], var2, var3, var4, this.k[var1]);
               } else {
                  this.e[var1].a(t.am, t.j[1][this.g[var1]], this.i[var1], var2, var3, var4, this.k[var1]);
               }
            }
         }
      }

      if (this.c != null) {
         for (int var5 = 0; var5 < this.c.length; var5++) {
            if (this.n[var5] > this.d[var5] && !this.c[var5].f()) {
               this.c[var5].g();
            }
         }
      }

      if (this.a != null) {
         for (int var6 = 0; var6 < this.a.length; var6++) {
            if (this.m[var6] > this.b[var6] && this.a[var6] > 0) {
               t.am.setColor(16777215);
               int var10000 = t.R();
               int var12 = t.S();
               int var9 = var10000;
               t.c(t.am, 0, 0, var9, var12);
            }
         }
      }
   }
}
