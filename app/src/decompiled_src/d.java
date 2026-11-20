import java.io.ByteArrayInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;

final class d implements Runnable {
   int a;
   int b;
   int c;
   a d;
   int e;
   int f;
   private int n;
   private int o;
   private int p;
   private boolean q;
   private int r;
   int g;
   private static int s = 66;
   int h;
   private static int t;
   private static boolean u;
   private static byte[][] v;
   private static int[] w;
   private static Player[] x;
   private static int[] y;
   private static int[] z;
   private static int[] A;
   private static int[] B;
   private static int[] C;
   private static int[] D;
   private static int[] E;
   static int[] i;
   private static int[] F;
   static boolean j;
   private static boolean G = false;
   private static int H = 4;
   private static int[] I;
   static int[][] k;
   private static byte[][][] J;
   static l[][] l;
   static Graphics[][] m;
   private static int[][][] K;
   private static int L;
   private static a[] M;
   private static int N = 100;

   d() {
      this.a();
   }

   d(a var1, int var2, int var3) {
      this.a();
      this.a = var2;
      this.b = var3;
      this.a(var1);
   }

   final void a() {
      this.a = 0;
      this.b = 0;
      this.e = -1;
      this.f = 0;
      this.d = null;
      this.c = 0;
      this.n = 0;
      this.p = 1;
      this.h = -1;
      this.q = true;
      this.g = -1;
      this.r = -1;
   }

   final void a(a var1) {
      this.d = var1;
      if (var1 != null) {
         this.a(-1, -1);
      } else {
         this.e = -1;
      }
   }

   final void a(int var1) {
      this.a(var1, -1);
   }

   final void a(int var1, int var2) {
      int var3 = var2;
      var2 = var1;
      d var4 = this;
      if (this.d == null) {
         t.P();
      }

      if (var2 >= var4.d.c()) {
         t.P();
      }

      if (var3 == 0) {
         t.P();
      }

      if (var4.q || var2 != var4.e) {
         var4.e = var2;
         var4.o = s;
         var4.b(0);
         var4.p = var3 - 1;
         var4.q = false;
      }
   }

   final int b(int var1) {
      if (this.e < 0) {
         return -1;
      }

      int var2 = this.d();
      var1 %= var2;
      this.f = var1;
      this.n = 0;
      return var1;
   }

   final int b() {
      return this.d != null && this.e != -1 ? this.d.f(this.e, this.f) : -1;
   }

   final void c() {
      this.c = 1;
   }

   final int d() {
      d var1 = this;
      if (this.d == null) {
         t.P();
      }

      return var1.e >= 0 ? var1.d.a(var1.e) : -1;
   }

   private int p() {
      return this.e >= 0 ? this.d.a(this.e, this.f) * this.o : 0;
   }

   final int[] e() {
      return this.d.g(this.e, this.f);
   }

   final boolean f() {
      if (this.e < 0) {
         return true;
      } else {
         return this.p < 0 ? false : this.q;
      }
   }

   final void g() {
      if (this.e >= 0) {
         boolean var1 = false;
         if (this.g != -1 && this.g != 100 && !t.I(13)) {
            var1 = true;
            t.H(13);
            t.J(this.g);
            if (this.r != -1) {
               t.e(13, 2, this.r);
            }
         } else if (this.r != -1 && !t.I(12)) {
            var1 = true;
            t.H(12);
            t.e(12, 1, this.r);
         }

         if (this.h != -1) {
            int var2 = this.d.l();
            this.d.m(this.h);
            this.d.a(t.am, this.e, this.f, this.a, this.b, this.c);
            this.d.m(var2);
         } else {
            this.d.a(t.am, this.e, this.f, this.a, this.b, this.c);
         }

         if (var1) {
            t.ax &= -1046497;
         }
      }
   }

   final void c(int var1) {
      if (!this.q && this.e >= 0) {
         int var2;
         if ((var2 = this.p()) != 0) {
            while (this.n >= var2) {
               this.n -= var2;
               if (this.f < this.d.a(this.e) - 1) {
                  this.f++;
               } else {
                  if (this.p == 0) {
                     this.q = true;
                     break;
                  }

                  if (this.p > 0) {
                     this.p--;
                  }

                  this.f = 0;
               }

               if ((var2 = this.p()) == 0) {
                  break;
               }
            }

            this.n += var1;
         }
      }
   }

   final int h() {
      return this.g;
   }

   private static final int i(int var0) {
      while (var0 >= 10) {
         var0 -= 10;
      }

      while (var0 < 0) {
         var0 += 10;
      }

      return var0;
   }

   private static final int e(int var0, int var1) {
      return var0 * 10 * 5 + var1 * 5;
   }

   private static void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      var5 = var5;
      var4 = var4;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      var0 = var0;
      if (u) {
         int var6 = E[var0];
         int var7 = i[var0];
         var6 = i(var6 + var7);

         for (int var9 = 0; var9 < var7; var9++) {
            int var8 = i(var6 - var9 - 1);
            var8 = e(var0, var8);
            if (D[var8] == var1 && (var1 != 3 && var1 != 1 || D[var8 + 2] >= var3)) {
               D[var8] = 0;
            }
         }

         int var18 = e(var0, var6);
         D[var18] = var1;
         D[var18 + 1] = var2;
         D[var18 + 2] = var3;
         D[var18 + 3] = var4;
         D[var18 + 4] = var5;
         i[var0]++;
      }
   }

   private static void a(int var0, int[] var1) {
      var1[5] = i[0];
      if (i[0] > 0) {
         var0 = e(0, E[0]);
         System.arraycopy(D, var0, var1, 0, 5);
         E[0] = i(E[0] + 1);
         i[0]--;
      }
   }

   static void i() {
      x = new Player[1];
      y = new int[1];
      z = new int[1];
      A = new int[1];
      B = new int[1];
      C = new int[1];
      D = new int[50];
      E = new int[1];
      i = new int[1];
      F = new int[6];

      for (int var0 = 0; var0 <= 0; var0++) {
         y[0] = -1;
         E[0] = 0;
         i[0] = 0;
      }

      t = 183;
      v = new byte[183][];
      w = new int[t];
      u = true;
   }

   static void a(String var0, int var1) {
      if (u) {
         if (var1 >= 0) {
            t.b(var0);
            byte[] var10000 = t.B(var1);
            int var2 = var1;
            var1 = t.aw;
            byte[] var3 = var10000;
            if (u) {
               if (var3 == null || var3.length <= 0) {
                  return;
               }

               v[var2] = var3;
               w[var2] = var1;
            }
         }
      }
   }

   static boolean d(int var0) {
      return v != null && var0 < v.length && v[var0] != null;
   }

   static void a(int var0, int var1, int var2) {
      if (var0 >= 0 && var1 != 0) {
         a(0, 3, var0, var2, var1, 1);
      }
   }

   static final void e(int var0) {
      a(0, 4, -1, -1, -1, -1);
   }

   private static void b(int var0, int var1, int var2) {
      if (A[0] != 2 || z[0] >= var2) {
         if (y[0] != var1 || A[0] == 0) {
            var2 = y[0];
            j(0);
            if (x[0] == null) {
               if (v[var1] == null) {
                  return;
               }

               x[0] = Manager.createPlayer(new ByteArrayInputStream(v[var1]), t.D(w[var1]));
            }

            if (x[0] != null) {
               x[0].realize();
               x[0].prefetch();
               A[0] = 1;
               y[0] = var1;
               if (var2 >= 0) {
                  ;
               }
            }
         }
      }
   }

   static final void f(int var0) {
      var0 = -1;

      for (byte var1 = 0; var1 < D.length; var1 += 5) {
         if (D[var1] != 0 && D[var1 + 1] == 63) {
            var0 = var1 / 50;
         }
      }

      if ((var0 = var0) != -1) {
         try {
            if (u && x[var0] != null) {
               try {
                  ;
               } catch (Exception var2) {
               }
            }
         } catch (Exception var3) {
         }
      }
   }

   static void j() {
      if (u) {
         for (int var0 = 0; var0 <= 0; var0++) {
            int[] var2 = F;
            int var1 = 0;
            a(0, var2);
            if (F[5] > 0) {
               if (A[0] == 2) {
                  try {
                     var1 = g(0);
                  } catch (Exception var6) {
                     var1 = (boolean)0;
                  }

                  if (!var1) {
                     A[0] = 1;
                  }
               }

               while (F[5] > 0) {
                  try {
                     switch (F[0]) {
                        case 1:
                           b(0, F[1], F[2]);
                           break;
                        case 2:
                           j(0);
                           break;
                        case 3:
                           int var10000 = F[1];
                           int var10001 = F[2];
                           int var10002 = F[4];
                           int var4 = F[3];
                           int var3 = var10002;
                           var1 = var10001;
                           int var9 = var10000;
                           if (!t.an) {
                              b(0, var9, var1);
                              if (!t.an && A[0] == 1 && x[0] != null) {
                                 if (var3 == 0) {
                                    x[0].setLoopCount(-1);
                                 } else {
                                    x[0].setLoopCount(var3);
                                 }

                                 x[0].setMediaTime(0L);
                                 x[0].start();
                                 A[0] = 2;
                                 B[0] = var4;
                                 C[0] = var3;
                                 z[0] = var1;
                                 y[0] = var9;
                              }
                           }
                           break;
                        case 4:
                           if (x[0] != null) {
                              x[0].stop();
                              A[0] = 1;
                           }
                           break;
                        case 5:
                           if (A[0] == 2 && x[0] != null) {
                              x[0].stop();
                              A[0] = 3;
                           }
                           break;
                        case 6:
                           if (A[0] == 3 && x[0] != null) {
                              x[0].start();
                              A[0] = 2;
                           }
                     }
                  } catch (Exception var5) {
                  }

                  var2 = F;
                  a(0, F);
               }
            }
         }
      }
   }

   public final void run() {
   }

   protected static boolean g(int var0) {
      if (!u) {
         return false;
      }

      if (x[0] == null) {
         return false;
      }

      boolean var1 = true;
      if (x[0].getState() != 400) {
         var1 = false;
      }

      return var1;
   }

   private static void j(int var0) {
      if (u) {
         if (x[var0] != null) {
            x[var0].stop();
            x[var0].deallocate();
            x[var0].close();
            x[var0] = null;
         }

         A[var0] = 0;
         y[var0] = -1;
      }
   }

   static void k() {
      for (int var0 = 0; var0 <= 0; var0++) {
         e(0);
      }

      j();
   }

   static int l() {
      if (!u) {
         return -1;
      } else {
         return y != null ? y[0] : -1;
      }
   }

   static final int b(int var0, int var1) {
      return D[e(var0, E[var0]) + var1];
   }

   static void m() {
      try {
         k();
      } catch (Exception var0) {
      }
   }

   static void c(int var0, int var1) {
      I = new int[8];
      k = new int[H][20];
      l = new l[H][1];
      m = new Graphics[H][1];
      J = new byte[H][2][];
      M = new a[H];
      I[2] = var0;
      I[4] = 0;
      I[5] = var1;
      I[7] = 0;
      K = new int[H][200][4];
      I[0] = 800;
      I[1] = 480;
      G = true;
   }

   private static boolean f(int var0, int var1) {
      return (k[var0][15] & var1) != 0;
   }

   private static void a(int var0, int var1, boolean var2) {
      if (var2) {
         k[0][15] = k[0][15] | var1;
      } else {
         k[0][15] = k[0][15] & ~var1;
      }
   }

   static void a(byte[] var0, byte[] var1, byte[] var2, a var3, int var4) {
      var3 = var3;
      var2 = var2;
      var1 = var1;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      var0 = var0;
      if (G) {
         a(0, false);
         k[0][18] = 0;
         k[0][19] = 0;
         k[0][18] = I[0];
         k[0][19] = I[1];
         J[0][0] = var1;
         J[0][1] = var2;
         k[0][2] = t.b(var0, 0);
         k[0][3] = t.b(var0, 2);
         k[0][5] = k[0][2] * I[2];
         k[0][6] = k[0][3] * I[5];
         M[0] = var3;
         boolean var12 = false;
         boolean var18 = false;
         int var13 = k[0][18];
         int var19 = k[0][19];
         int var22 = var13 % I[2];
         int var7 = 1 + (var22 != 0 ? 1 : 0);
         k[0][7] = var13 - var22 + var7 * I[2];
         int var14 = var19 % I[5];
         int var23 = 1 + (var14 != 0 ? 1 : 0);
         k[0][8] = var19 - var14 + var23 * I[5];
         if (l[0][0] == null || l[0][0].a.getWidth() != k[0][8] || l[0][0].a.getHeight() != k[0][7]) {
            boolean var8 = false;

            try {
               l[] var10000 = l[0];
               int var10002 = k[0][8];
               int var15 = k[0][7];
               int var9 = var10002;
               var10000[0] = new l(Image.createImage(var9, var15));
               m[0][0] = l[0][0].a.getGraphics();
            } catch (Exception var5) {
            }
         }

         a(0, 64, true);
         a(0, 4, true);
         if (f(0, 64)) {
            a(0, 128, true);
         }

         k[0][9] = -1;
         k[0][10] = -1;
         k[0][11] = -1;
         k[0][12] = -1;
         k[0][0] = 1;
         k[0][1] = 1;
         k[0][13] = 0;
         k[0][14] = 0;
         k[0][16] = 0;
         k[0][17] = 0;
         a(0, 1, true);
         a(0, 16, false);
         a(0, 2, var4 == 1);
         a(0, 32, var4 == 0);
         a(0, 8, false);
      }
   }

   static void n() {
      a(0, true);
   }

   private static void a(int var0, boolean var1) {
      if (G) {
         k[0] = new int[20];
         if (var1) {
            l[0] = new l[1];
            m[0] = new Graphics[1];
         }

         J[0] = new byte[2][];
         M[0] = null;
      }
   }

   static void a(Graphics var0, int var1, int var2, int var3) {
      if (G) {
         if (var3 == -1) {
            for (int var26 = 0; var26 < H; var26++) {
               a(var0, var1, var2, var26);
            }
         } else {
            int var4 = k[var3][18] * 100 / N;
            int var5 = k[var3][19] * 100 / N;
            if (var4 == 0) {
               k[var3][18] = I[0];
               var4 = k[var3][18];
            }

            if (var5 == 0) {
               k[var3][19] = I[1];
               var4 = k[var3][18];
            }

            int[] var6;
            if ((var6 = k[var3])[0] == 1 && var6[1] == 1) {
               int var7 = var6[13] + var6[16];
               int var8 = var6[14] + var6[17];
               if (!f(var3, 4)) {
                  if (var0 != null) {
                     int var48 = var7;
                     int var51 = var8;
                     if (var48 < 0) {
                        var48 -= I[2];
                     }

                     if (var51 < 0) {
                        var51 -= I[5];
                     }

                     int var33 = var48 / I[2];
                     int var34 = var51 / I[5];
                     int var35;
                     if ((var35 = var4 / I[2]) * I[2] < var4) {
                        var35++;
                     }

                     int var36;
                     if ((var36 = var5 / I[5]) * I[5] < var5) {
                        var36++;
                     }

                     int var41 = var33 * I[2] - var7;
                     int var45 = var34 * I[5] - var8;
                     a(var0, var3, var33, var34, var35, var36, var41 + var1, var45 + var2);
                  }
               } else {
                  int var9 = 0;
                  int var10 = 0;
                  int var11 = 0;
                  int var12 = 0;
                  if (t.a(var0)) {
                     var9 = t.a(var0, true);
                     var10 = t.b(var0, true);
                     var11 = t.c(var0, true);
                     var12 = t.d(var0, true);
                  }

                  if (f(var3, 128)) {
                     L = 0;
                  }

                  int var17 = var7;
                  int var18 = var8;
                  if (var17 < 0) {
                     var17 -= I[2];
                  }

                  if (var18 < 0) {
                     var18 -= I[5];
                  }

                  int var13 = var17 / I[2];
                  int var14 = var18 / I[5];
                  int var15 = var13 + var6[7] / I[2] - 1;
                  int var16 = var14 + var6[8] / I[5] - 1;
                  int var19 = 0;
                  int var20 = 0;
                  if (var6[10] != var14 || var6[12] != var16) {
                     if (var6[10] >= var14 && var6[12] >= var16) {
                        if (var6[10] > var16) {
                           var19 = var14;
                           var20 = var16;
                        } else {
                           var19 = var14;
                           var20 = var6[10] - 1;
                        }
                     } else if (var6[12] < var14) {
                        var19 = var14;
                        var20 = var16;
                     } else {
                        var19 = var6[12] + 1;
                        var20 = var16;
                     }
                  }

                  if (var6[9] != var13 || var6[11] != var15) {
                     if (var6[9] >= var13 && var6[11] >= var15) {
                        if (var6[9] > var15) {
                           var17 = var13;
                           var18 = var15;
                        } else {
                           var17 = var13;
                           var18 = var6[9] - 1;
                        }
                     } else if (var6[11] < var13) {
                        var17 = var13;
                        var18 = var15;
                     } else {
                        var17 = var6[11] + 1;
                        var18 = var15;
                     }

                     int var21 = var16 - var14;
                     int var22 = var14;
                     if (var6[10] != var14 || var6[12] != var16) {
                        if (var6[10] >= var14 && var6[12] >= var16) {
                           var21 -= var20 - var19 + 1;
                           var22 += var20 - var19 + 1;
                        } else {
                           var21 -= var20 - var19 + 1;
                        }
                     }

                     if (var21 >= 0) {
                        a(m[var3][0], var3, var17, var22, var18 - var17, var21, 0, 0);
                     }

                     var6[9] = var13;
                     var6[11] = var15;
                  }

                  if (var6[10] != var14 || var6[12] != var16) {
                     a(m[var3][0], var3, var13, var19, var15 - var13, var20 - var19, 0, 0);
                     var6[10] = var14;
                     var6[12] = var16;
                  }

                  if (var0 != null) {
                     if (!f(var3, 273)) {
                        if (var7 < 0) {
                           var1 -= var7;
                           var7 = 0;
                        } else if (var7 > var6[5] - var4) {
                           var1 -= var7 - (var6[5] - var4);
                           var7 = var6[5] - var4;
                        }
                     } else {
                        while (var7 < 0) {
                           var7 += var6[7];
                        }
                     }

                     if (!f(var3, 290)) {
                        if (var8 < 0) {
                           var2 -= var8;
                           var8 = 0;
                        } else if (var8 > var6[6] - var5) {
                           var2 -= var8 - (var6[6] - var5);
                           var8 = var6[6] - var5;
                        }
                     } else {
                        while (var8 < 0) {
                           var8 += var6[8];
                        }
                     }

                     var13 = var7 % var6[7];
                     var14 = var8 % var6[8];
                     var15 = (var7 + var4) % var6[7];
                     var16 = (var8 + var5) % var6[8];
                     var18 = var12;
                     var17 = var11;
                     var8 = var10;
                     t.b(var0, var9, var8, var17, var18);
                     if (var15 > var13) {
                        if (var16 > var14) {
                           a(var0, var3, var13, var14, var4, var5, var1, var2, var9, var10, var11, var12);
                        } else {
                           a(var0, var3, var13, var14, var4, var5 - var16, var1, var2, var9, var10, var11, var12);
                           var15 = var12;
                           var14 = var11;
                           var8 = var10;
                           t.b(var0, var9, var8, var14, var15);
                           a(var0, var3, var13, 0, var4, var16, var1, var5 - var16 + var2, var9, var10, var11, var12);
                        }
                     } else if (var16 > var14) {
                        a(var0, var3, var13, var14, var4 - var15, var5, var1, var2, var9, var10, var11, var12);
                        var16 = var12;
                        var13 = var11;
                        var8 = var10;
                        t.b(var0, var9, var8, var13, var16);
                        a(var0, var3, 0, var14, var15, var5, var4 - var15 + var1, var2, var9, var10, var11, var12);
                     } else {
                        a(var0, var3, var13, var14, var4 - var15, var5 - var16, var1, var2, var9, var10, var11, var12);
                        var18 = var12;
                        var17 = var11;
                        var8 = var10;
                        t.b(var0, var9, var8, var17, var18);
                        a(var0, var3, var13, 0, var4 - var15, var16, var1, var5 - var16 + var2, var9, var10, var11, var12);
                        var17 = var12;
                        var13 = var11;
                        var8 = var10;
                        t.b(var0, var9, var8, var13, var17);
                        a(var0, var3, 0, var14, var15, var5 - var16, var4 - var15 + var1, var2, var9, var10, var11, var12);
                        var14 = var12;
                        var13 = var11;
                        var8 = var10;
                        t.b(var0, var9, var8, var13, var14);
                        a(var0, var3, 0, 0, var15, var16, var4 - var15 + var1, var5 - var16 + var2, var9, var10, var11, var12);
                     }

                     var4 = var12;
                     var3 = var11;
                     var2 = var10;
                     t.b(var0, var9, var2, var3, var4);
                  }
               }
            }
         }
      }
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      if (var6 <= var8 + var10 && var7 <= var9 + var11 && var6 + var4 >= var8 && var7 + var5 >= var9) {
         t.a(var0, var6, var7, var4, var5);
         t.a(var0, l[var1][0], var3 - var7 + a.e - k[var1][8], var6 - var2, false);
      }
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = f(var1, 4);
      int var9 = f(var1, 1);
      int var10 = f(var1, 2);
      int var11 = k[var1][2];
      int var12 = k[var1][3];
      int var13 = I[2];
      int var14 = I[5];
      int var15 = var11 * var12;
      if (var8) {
         int var10000 = k[var1][7];
         int var17 = k[var1][8];
         a.d = var10000;
         a.e = var17;
      }

      if (var8) {
         var6 += var2 * I[2] % k[var1][7];
         var7 += var3 * I[5] % k[var1][8];
         if (var6 < 0) {
            var6 += k[var1][7];
         }

         if (var7 < 0) {
            var7 += k[var1][8];
         }
      }

      if (!var9) {
         if (!f(var1, 16)) {
            if (var2 < 0) {
               var6 -= var2 * var13;
               var4 += var2;
               var2 = 0;
               if (var8 && var6 >= k[var1][7]) {
                  var6 = 0;
               }
            }

            if (var2 + var4 >= var11) {
               var4 = var11 - var2 - 1;
            }

            if (var4 < 0) {
               int var52 = t.R();
               var1 = t.S();
               a.d = var52;
               a.e = var1;
               return;
            }
         }
      } else {
         while (var2 < 0) {
            var2 += var11;
         }

         while (var2 >= var11) {
            var2 -= var11;
         }
      }

      if (!var10) {
         if (!f(var1, 32)) {
            if (var3 < 0) {
               var7 -= var3 * var14;
               var5 += var3;
               var3 = 0;
               if (var8 && var7 >= k[var1][8]) {
                  var7 = 0;
               }
            }

            if (var3 + var5 >= var12) {
               var5 = var12 - var3 - 1;
            }

            if (var5 < 0) {
               int var51 = t.R();
               var1 = t.S();
               a.d = var51;
               a.e = var1;
               return;
            }
         }
      } else {
         while (var3 < 0) {
            var3 += var12;
         }

         while (var3 >= var12) {
            var3 -= var12;
         }
      }

      int var16 = var6;
      int var41 = var7;

      while (var5-- >= 0) {
         var16 = var6;
         int var18 = var4;
         int var19 = var2;

         while (var18-- >= 0) {
            int var20;
            if ((var20 = var19 + var3 * var11) < var15) {
               int var24 = var20;
               int var23 = 0;
               int var22 = 0;
               int var21;
               if ((var21 = a(var1, 0, var24, false)) != 255) {
                  if (J[var1][1] == null) {
                     var20 = 0;
                  } else {
                     var24 = var20;
                     var20 = a(var1, 1, var24, false);
                  }

                  if (N != 100) {
                     t.H(13);
                     t.e(13, 1, N);
                     t.a(true);
                  }

                  if (M[var1].d() == 0) {
                     M[var1].a(var0, var21, var16, var41, var20, I[2], I[5]);
                  } else {
                     var22 = var16;
                     var23 = var41;
                     if ((var20 & 1) != 0) {
                        var22 += var13;
                     }

                     if ((var20 & 2) != 0) {
                        var23 += var14;
                     }

                     if ((var20 & 4) != 0) {
                        if ((var20 & 1) != 0) {
                           var22 -= var14;
                        } else {
                           var22 += var14;
                        }
                     }

                     M[var1].a(var0, var21, var22, var23, var20);
                  }

                  if (N != 100) {
                     t.a(false);
                     t.a(13, false);
                  }
               }
            }

            var16 += var13;
            if (++var19 >= var11) {
               if (!var9) {
                  break;
               }

               var19 = 0;
            }

            if (var8 && var16 >= k[var1][7]) {
               var16 = 0;
            }
         }

         var41 += var14;
         if (++var3 >= var12) {
            if (!var10) {
               break;
            }

            var3 = 0;
         }

         if (var8 && var41 >= k[var1][8]) {
            var41 = 0;
         }
      }

      if (f(var1, 128)) {
         int var44;
         int var46;
         if (var16 > var6) {
            var44 = var16;
            var46 = 0;
         } else {
            var44 = k[var1][7];
            var46 = var16;
         }

         int var25;
         if (var41 > var7) {
            var25 = var41;
            var2 = 0;
         } else {
            var25 = k[var1][8];
            var2 = var41;
         }

         for (int var30 = 0; var30 < 4; var30++) {
            if ((var30 != 1 && var30 != 3 || var46 != 0) && (var30 != 2 && var30 != 3 || var2 != 0)) {
               var4 = var30 != 0 && var30 != 2 ? 0 : var6;
               var5 = var30 != 0 && var30 != 1 ? 0 : var7;
               var8 = var30 != 0 && var30 != 2 ? var46 : var44 - var6;
               var9 = var30 != 0 && var30 != 1 ? var2 : var25 - var7;
               var10 = var9;
               var9 = var8;
               var8 = var5;
               var5 = var4;
               var4 = var1;
               int[] var33;
               (var33 = K[var4][L])[0] = var5;
               var33[1] = var8;
               var33[2] = var9;
               var33[3] = var10;
               L++;
            }
         }
      }

      int var50 = t.R();
      var1 = t.S();
      a.d = var50;
      a.e = var1;
   }

   private static final int g(int var0, int var1) {
      return f(var0, 8) ? k[var0][6] - I[1] - var1 : var1;
   }

   static final void d(int var0, int var1) {
      k[0][13] = var0;
      k[0][14] = g(0, var1);
      if (f(0, 16)) {
         if (k[0][13] < 0) {
            k[0][13] = 0;
         } else if (k[0][13] + I[0] >= k[0][5]) {
            k[0][13] = k[0][5] - I[0] - 1;
         }
      }

      if (f(0, 32)) {
         if (k[0][14] < 0) {
            k[0][14] = 0;
            return;
         }

         if (k[0][14] + I[1] >= k[0][6]) {
            k[0][14] = k[0][6] - I[1] - 1;
         }
      }
   }

   static final int h(int var0) {
      return f(0, 8) ? k[0][6] - I[1] - k[0][14] : k[0][14];
   }

   static void o() {
      if (G) {
         k[0][9] = -1;
         k[0][10] = -1;
         k[0][11] = -1;
         k[0][12] = -1;
      }
   }

   static final void a(a var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (N != 100) {
         t.H(13);
         t.e(13, 1, N);
         t.a(true);
      }

      if (f(0, 4)) {
         boolean var6 = (boolean)var5;
         var5 = 0;
         boolean var39 = false;
         boolean var40 = false;
         var4 = var3;
         var3 = var2;
         var2 = var1;
         a var45 = var0;
         boolean var41 = false;
         boolean var62 = var6;
         byte var42 = var5;
         int var54 = var4;
         int var49 = var3;
         var4 = var2;
         a var46 = var45;
         if (f(0, 4) && (L != 0 || var62)) {
            int[] var63 = k[0];
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            var7 = var46.d(var4);
            var8 = var46.e(var4);
            var9 = var46.b(var4);
            var10 = var46.c(var4);
            if (t.I(13)) {
               int var11 = t.ay[13][1];
               var7 = var7 * var11 / 100;
               var8 = var8 * var11 / 100;
               var9 = var9 * var11 / 100;
               var10 = var10 * var11 / 100;
            }

            if ((var42 & 1) != 0) {
               var7 = -var7 - var9;
            }

            if ((var42 & 2) != 0) {
               var8 = -var8 - var10;
            }

            if ((var42 & 4) != 0) {
               int var70 = var7;
               var7 = -var8 - var10;
               var8 = var70;
               int var12 = var9;
               var9 = var10;
               var10 = var12;
            }

            var3 = g(0, var54);
            int var71 = var63[13];
            int var74 = var63[14];
            int var13 = I[2];
            int var14 = I[5];
            int var15 = var71 % var13;
            int var16 = var74 % var14;
            if (var15 < 0) {
               var15 += var13;
            }

            if (var16 < 0) {
               var16 += var14;
            }

            var71 -= var15;
            var74 -= var16;
            var2 = var49 - var71;
            var3 -= var74;
            if (f(0, 273) && var71 < 0) {
               var71 = var63[7] + var71 % var63[7];
            }

            if (f(0, 290) && var74 < 0) {
               var74 = var63[8] + var74 % var63[8];
            }

            var71 %= var63[7];
            var74 %= var63[8];
            var13 = var63[7] - var71;
            var14 = var63[8] - var74;
            Graphics var79 = m[0][0];
            int var10000 = k[0][7];
            var16 = k[0][8];
            a.d = var10000;
            a.e = var16;
            var16 = t.a(var79, true);
            int var17 = t.b(var79, true);
            int var18 = t.c(var79, true);
            int var19 = t.d(var79, true);
            int var20 = 1;
            if (!var62) {
               var20 = L;
            }

            int var21 = var63[7];
            int var22 = var63[8];
            int var23 = a.d;
            int var24 = a.e;
            int var25 = var22;
            a.d = var21;
            a.e = var25;
            var25 = var20;
            var2 += var7;
            var3 += var8;
            var9 = var2 + var9;
            var10 = var3 + var10;

            for (int var34 = 0; var34 <= 0; var34++) {
               int var26 = var2;
               int var27 = var3;
               int var28 = var9;
               int var29 = var10;

               for (int var35 = 0; var35 <= 0; var35++) {
                  int var30 = var26;
                  int var31 = var27;
                  int var32 = var28;
                  int var33 = var29;
                  if (var30 <= var21 && var33 >= 0 && var32 >= 0 && var31 <= var22) {
                     var20 = var25;

                     while (--var20 >= 0) {
                        int[] var36 = null;
                        if (!var62) {
                           int var37 = (var36 = K[0][var20])[0] - var71;
                           if (var36[0] < var71) {
                              var37 += var63[7];
                           }

                           int var38 = var37 + var36[2];
                           if (var30 >= var38 || var32 < var37) {
                              continue;
                           }

                           var37 = var36[1] - var74;
                           if (var36[1] < var74) {
                              var37 += var63[8];
                           }

                           var38 = var37 + var36[3];
                           if (var31 >= var38 || var33 < var37) {
                              continue;
                           }
                        }

                        if (var30 < var13) {
                           if (var31 < var14) {
                              a(
                                 var79,
                                 var46,
                                 var4,
                                 var42,
                                 var71,
                                 var74,
                                 var13,
                                 var14,
                                 var71 + var30 - var7,
                                 var74 + var31 - var8,
                                 0,
                                 0,
                                 0,
                                 var16,
                                 var17,
                                 var18,
                                 var19,
                                 var36,
                                 var62
                              );
                           }

                           if (var33 >= var14 && var74 != 0) {
                              a(
                                 var79,
                                 var46,
                                 var4,
                                 var42,
                                 var71,
                                 0,
                                 var13,
                                 var74,
                                 var71 + var30 - var7,
                                 var31 - var8 - var14,
                                 0,
                                 0,
                                 0,
                                 var16,
                                 var17,
                                 var18,
                                 var19,
                                 var36,
                                 var62
                              );
                           }
                        }

                        if (var32 >= var13 && var71 != 0) {
                           if (var31 < var14) {
                              a(
                                 var79,
                                 var46,
                                 var4,
                                 var42,
                                 0,
                                 var74,
                                 var71,
                                 var14,
                                 var30 - var7 - var13,
                                 var74 + var31 - var8,
                                 0,
                                 0,
                                 0,
                                 var16,
                                 var17,
                                 var18,
                                 var19,
                                 var36,
                                 var62
                              );
                           }

                           if (var33 >= var14 && var74 != 0) {
                              a(
                                 var79,
                                 var46,
                                 var4,
                                 var42,
                                 0,
                                 0,
                                 var71,
                                 var74,
                                 var30 - var7 - var13,
                                 var31 - var8 - var14,
                                 0,
                                 0,
                                 0,
                                 var16,
                                 var17,
                                 var18,
                                 var19,
                                 var36,
                                 var62
                              );
                           }
                        }
                     }
                  }
               }
            }

            var3 = var19;
            var2 = var18;
            var1 = var17;
            t.b(var79, var16, var1, var2, var3);
            int var43 = var24;
            a.d = var23;
            a.e = var43;
            var10000 = t.R();
            int var44 = t.S();
            a.d = var10000;
            a.e = var44;
         }
      } else {
         var0.a(t.am, var1, var2 - k[0][13], var3 - h(0), 0);
      }

      if (N != 100) {
         t.a(false);
         t.a(13, false);
      }
   }

   private static void a(
      Graphics var0,
      Object var1,
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
      int[] var17,
      boolean var18
   ) {
      t.b(var0, var13, var14, var15, var16);
      t.a(var0, var4, var5, var6, var7);
      if (!var18) {
         int var10001 = var17[0];
         int var10002 = var17[1];
         int var10003 = var17[2];
         var13 = var17[3];
         var7 = var10003;
         var6 = var10002;
         t.a(var0, var10001, var6, var7, var13);
      }

      ((a)var1).b(var0, var2, var8, var9, var3);
   }

   static void a(int var0, int var1, int var2, int var3) {
      if (f(0, 4)) {
         int[] var4;
         int var5 = (var4 = k[0])[9] * I[2];
         int var6 = var4[10] * I[5];
         int var7 = var5 + var4[7];
         int var8 = var6 + var4[8];
         int var9 = var0 + var2;
         if (var1 + var3 > var6 && var8 > var1 && var9 > var5 && var7 > var0) {
            var5 = var0;
            var6 = var1;
            if (var0 < 0) {
               var5 = var0 - I[2];
            }

            if (var1 < 0) {
               var6 = var1 - I[5];
            }

            var0 = var5 / I[2];
            var1 = var6 / I[5];
            var2 = (var5 + var2 - 1) / I[2];
            var3 = (var6 + var3 - 1) / I[5];
            if (var0 < var4[9]) {
               var0 = var4[9];
            }

            if (var1 < var4[10]) {
               var1 = var4[10];
            }

            if (var2 > var4[11]) {
               var2 = var4[11];
            }

            if (var3 > var4[12]) {
               var3 = var4[12];
            }

            var5 = var2 - var0;
            var6 = var3 - var1;
            a(m[0][0], 0, var0, var1, var5, var6, 0, 0);
         }
      }
   }

   private static int a(int var0, int var1, int var2, boolean var3) {
      return J[var0][var1][var2] & 0xFF;
   }
}
