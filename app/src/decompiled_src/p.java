import javax.microedition.lcdui.Graphics;

public final class p {
   private int c;
   int a;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int[] n;
   private int[] o;
   private int[] p;
   private int[] q;
   private int[] r;
   int[] b;
   private int[] s;
   private int t;
   private int u;
   private int v;
   private int w;
   private int x;
   private int[] y;
   private int z;
   private int A;
   private int B;

   public p() {
   }

   private p(int var1) {
      this.c = 0;
      this.a = 0;
      this.d = 0;
      this.e = 0;
      this.f = 0;
      this.g = 0;
      this.h = 0;
      this.i = 0;
      this.j = 0;
      this.k = 0;
      this.l = 0;
      this.m = 0;
      this.b = new int[4];
      this.s = new int[4];
      this.t = 0;
      this.u = 0;
      this.v = 0;
      this.w = 0;
      this.x = 0;
      this.y = new int[4];
      this.z = 0;
      this.A = 0;
      this.B = 1;
      this.m = var1;
      this.n = new int[var1];
      this.o = new int[var1];
      this.p = new int[var1];
      this.q = new int[var1];
      this.r = new int[var1];
      this.c = var1;
   }

   private p(
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20,
      int var21
   ) {
      this(var1);
      var2 = var2;
      this.e = var2;
      var2 = var3;
      this.f = var2;
      int var52 = var7;
      int var49 = var6;
      var3 = var5;
      var2 = var4;
      p var22 = this;
      this.b[0] = var2;
      var22.b[1] = var3;
      var22.b[2] = var49;
      var22.b[3] = var52;
      var3 = var9;
      var2 = var8;
      p var23 = this;
      this.g = var2;
      var23.h = var3;
      var3 = var11;
      var2 = var10;
      p var24 = this;
      this.i = var2;
      var24.j = var3;
      var3 = var13;
      var2 = var12;
      p var25 = this;
      this.w = var2;
      var25.x = var3;
      var3 = var15;
      var2 = var14;
      p var26 = this;
      this.k = var2;
      var26.l = var3;
      var2 = var16;
      this.B = var2 > 0 ? var2 : 1;
      var5 = var20;
      var4 = var19;
      var3 = var18;
      var2 = var17;
      p var27 = this;
      this.s[0] = var2;
      var27.s[1] = var3;
      var27.s[2] = var4;
      var27.s[3] = var5;
      var27.t = ((var2 << 1) + var4 << 8) / 2;
      var27.u = ((var3 << 1) + var5 << 8) / 2;
      var2 = var21;
      this.v = var2;
      boolean var54 = false;
      boolean var51 = false;
      boolean var48 = false;
      boolean var39 = false;
      p var28 = this;
      this.y[0] = 0;
      var28.y[1] = 0;
      var28.y[2] = 0;
      var28.y[3] = 0;
      var39 = false;
      this.z = 0;
      var39 = false;
      this.A = 0;
   }

   public final void a() {
      int var2 = this.c;
      p var1 = this;
      new StringBuffer()
         .append(" param error: _iNumberOfPartcles (")
         .append(var2)
         .append(") should be less or equal than m_emitter_maxParticles (")
         .append(var1.m)
         .append(")")
         .toString();
      t.P();
      var1.c = var2;
      var1.a = var2;
      var1.t = (2 * var1.s[0] + var1.s[2] << 8) / 2;
      var1.u = (2 * var1.s[1] + var1.s[3] << 8) / 2;

      for (int var3 = 0; var3 < var1.c; var3++) {
         var1.p[var3] = t.n(var1.g, var1.h + 1);
         var1.q[var3] = t.n(var1.i, var1.j + 1);
         if (var1.e > 0) {
            var1.r[var3] = -(var3 * var1.e) / var1.c;
         } else {
            var1.r[var3] = 0;
         }
      }
   }

   public final void a(int var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      if (this.v != 0) {
         var2 = this.s[0];
         var3 = this.s[1];
         var4 = var2 + this.s[2] - 1;
         var5 = var3 + this.s[3] - 1;
      }

      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      if (this.z > 0) {
         var6 = this.y[0];
         var7 = this.y[1];
         var8 = var6 + this.y[2] - 1;
         var9 = var7 + this.y[3] - 1;
      }

      this.a = 0;
      this.d = 0;

      for (int var10 = 0; var10 < this.c; var10++) {
         int var12 = var10;
         p var11 = this;
         new StringBuffer()
            .append(" param error _iParticleIdx (")
            .append(var12)
            .append(") should be less than number of particles (")
            .append(var11.c)
            .append(")")
            .toString();
         t.P();
         if (var11.r[var12] < var11.f) {
            this.a++;
            boolean var22 = this.b(var10);
            boolean var24 = this.c(var10);
            if (!var22) {
               this.d++;
            } else {
               int var23 = t.y(this.n[var10]);
               int var13 = t.y(this.o[var10]);
               this.n[var10] = this.n[var10] + (int)(this.p[var10] * var1 / 1000L);
               this.o[var10] = this.o[var10] + (int)(this.q[var10] * var1 / 1000L);
               int var14 = this.n[var10];
               int var15 = this.o[var10];
               int var20 = var15;
               int var19 = var14;
               p var18 = this;
               int var10000;
               if (this.v == 0) {
                  var10000 = 0;
               } else {
                  int var21 = t.y(var18.t - var19);
                  int var17 = t.y(var18.u - var20);
                  var10000 = t.m(var21, var17) << 8;
               }

               int var16 = var10000;
               var20 = var16;
               var19 = var14;
               var18 = this;
               int var32 = this.v == 0 ? 0 : t.p(var18.v * (var18.t - var19), var20);
               var20 = var16;
               var19 = var15;
               var18 = this;
               var16 = this.v == 0 ? 0 : t.p(var18.v * (var18.u - var19), var20);
               var32 = this.w + var32;
               var16 = this.x + var16;
               this.p[var10] = this.p[var10] + (int)(var32 * var1 / 1000L);
               this.q[var10] = this.q[var10] + (int)(var16 * var1 / 1000L);
               if (this.k > 0) {
                  this.p[var10] = this.p[var10] < -this.k ? -this.k : (this.p[var10] > this.k ? this.k : this.p[var10]);
               }

               if (this.l > 0) {
                  this.q[var10] = this.q[var10] < -this.l ? -this.l : (this.q[var10] > this.l ? this.l : this.q[var10]);
               }

               if (this.B > 1) {
                  var16 = this.B - 1;
                  this.p[var10] = this.p[var10] * var16 / this.B;
                  this.q[var10] = this.q[var10] * var16 / this.B;
               }

               var16 = t.y(var14);
               var14 = t.y(var15);
               if (this.v != 0) {
                  var15 = var5;
                  var32 = var4;
                  int var44 = var3;
                  var20 = var2;
                  var19 = var14;
                  int var37 = var16;
                  if (var16 >= var20 && var37 <= var32 && var19 >= var44 && var19 <= var15) {
                     this.r[var10] = this.f;
                  }
               }

               if (this.z > 0) {
                  boolean var27 = false;
                  if (var16 < var6) {
                     var27 = true;
                     if (Math.abs(this.p[var10]) > this.A && var23 != var6) {
                        this.p[var10] = -this.p[var10];
                        var16 = var6;
                     } else {
                        var16 = var6;
                        this.p[var10] = 0;
                     }
                  } else if (var16 > var8) {
                     var27 = true;
                     if (Math.abs(this.p[var10]) > this.A && var23 != var8) {
                        this.p[var10] = -this.p[var10];
                        var16 = var8;
                     } else {
                        var16 = var8;
                        this.p[var10] = 0;
                     }
                  }

                  if (var14 < var7) {
                     var27 = true;
                     if (Math.abs(this.q[var10]) > this.A && var13 != var7) {
                        this.q[var10] = -this.q[var10];
                        var14 = var7;
                     } else {
                        var14 = var7;
                        this.q[var10] = 0;
                     }
                  } else if (var14 > var9) {
                     var27 = true;
                     if (Math.abs(this.q[var10]) > this.A && var13 != var9) {
                        this.q[var10] = -this.q[var10];
                        var14 = var9;
                     } else {
                        var14 = var9;
                        this.q[var10] = 0;
                     }
                  }

                  if (var27) {
                     this.p[var10] = this.p[var10] / this.z;
                     this.q[var10] = this.q[var10] / this.z;
                     this.n[var10] = var16 << 8;
                     this.o[var10] = var14 << 8;
                  }
               }
            }

            this.r[var10] = this.r[var10] + var1;
            if (var24 && !this.c(var10)) {
               this.n[var10] = this.b[0] + t.n(0, this.b[2]) << 8;
               this.o[var10] = this.b[1] + t.n(0, this.b[3]) << 8;
            }
         }
      }
   }

   public final void a(Graphics var1, a var2, int var3, int var4, int var5, boolean var6, byte var7) {
      this.a(var1, var2, var3, var4, var5, var6, c.c, var7);
   }

   public final void a(Graphics var1, a var2, int var3, int var4, int var5, boolean var6, int var7, byte var8) {
      for (int var9 = 0; var9 < this.c; var9++) {
         if (this.b(var9)) {
            int var13 = var9;
            p var12 = this;
            new StringBuffer()
               .append(" param error _iParticleIdx (")
               .append(var13)
               .append(") should be less than number of particles (")
               .append(var12.c)
               .append(")")
               .toString();
            t.P();
            int var10 = t.y(var12.n[var13]) + var4;
            var13 = var9;
            var12 = this;
            new StringBuffer()
               .append(" param error _iParticleIdx (")
               .append(var13)
               .append(") should be less than number of particles (")
               .append(var12.c)
               .append(")")
               .toString();
            t.P();
            int var11 = t.y(var12.o[var13]) + var5;
            var13 = var9;
            var12 = this;
            new StringBuffer()
               .append(" param error _iParticleIdx (")
               .append(var13)
               .append(") should be less than number of particles (")
               .append(var12.c)
               .append(")")
               .toString();
            t.P();
            int var19 = var12.r[var13];
            int var15 = var6 ? 1 : -1;
            var13 = var19;
            a var20 = var2;
            var13 /= var7;
            int var14 = 0;

            for (int var16 = 0; var16 < var20.a(var3); var16++) {
               var14 += var20.a(var3, var16);
            }

            int var10000;
            if (var15 > 0 && var13 / var14 >= var15) {
               var10000 = -1;
            } else {
               int var28 = var13 % var14;
               var13 = -1;

               while ((var28 -= var20.a(var3, ++var13)) >= 0) {
               }

               var10000 = var13;
            }

            int var21 = var10000;
            if (var10000 >= 0) {
               var13 = var2.l();
               if (var8 > 0) {
                  var2.m(var8);
               }

               var2.a(var1, var3, var21, var10, var11, 0);
               var2.m(var13);
            } else {
               this.r[var9] = this.f;
            }
         }
      }
   }

   public final boolean b() {
      return this.a == 0;
   }

   private boolean b(int var1) {
      new StringBuffer()
         .append(" param error _iParticleIdx (")
         .append(var1)
         .append(") should be less than number of particles (")
         .append(this.c)
         .append(")")
         .toString();
      t.P();
      return this.r[var1] > 0 && this.r[var1] < this.f;
   }

   private boolean c(int var1) {
      new StringBuffer()
         .append(" param error _iParticleIdx (")
         .append(var1)
         .append(") should be less than number of particles (")
         .append(this.c)
         .append(")")
         .toString();
      t.P();
      return this.r[var1] <= 0;
   }

   public static p a(
      int var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      int var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16,
      int var17,
      int var18,
      int var19,
      int var20
   ) {
      return new p(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);
   }
}
