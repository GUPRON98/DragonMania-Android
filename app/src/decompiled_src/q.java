import javax.microedition.lcdui.Graphics;

public class q implements h, i {
   static short[] c;
   static short[] d;
   static short[] e;
   static short[] f;
   static short[] g;
   static short[] h;
   static short[] i;
   static short[] j;
   static short[] k;
   static short[] l;
   static short[] m;
   static short[] n;
   static short[] o;
   static short[] p;
   static short[] q;
   static short[] r;
   static short[] s;
   static short[] t;
   static short[] u;
   static short[] v;
   static short[] w;
   static short[] x;
   static short[] y;
   static short[] z;
   static short[] A;
   static short[] B;
   static short[] C;
   static short[] D;
   static short[] E;
   static short[] F;
   static short[] G;
   static short[] H;
   static short[] I;
   static short[] J;
   static short[] K;
   static short[] L;
   static short[] M;
   static short[] N;
   static short[] O;
   static short[] P;
   static short[] Q;
   static short[] R;
   static short[] S;
   static short[] T;
   static short[] U;
   static short[] V;
   static short[] W;
   static short[] X;
   static short[] Y;
   static short[] Z;
   static short[] aa;
   static short[] ab;
   private static int aR = -1;
   private static int aS = -1;
   private static short aT = -1;
   private static short aU = -1;
   private static byte[] aV;
   public static q[] ac;
   public static q[] ad;
   public static int ae = 0;
   public static q[][][] af = new q[12][8][];
   private static int[][] aW = new int[12][8];
   public r ag;
   private static boolean aX = true;
   private static boolean aY = false;
   private static boolean aZ;
   public static v ah;
   public static v ai;
   public static boolean aj;
   private static int ba;
   private static int bb;
   private static int bc;
   public static d ak;
   long al = 0L;
   static byte am = 0;
   private static int bd = 1;
   private static int be = 1;
   private static int bf = 2;
   private static int bg = be | bf;
   public static v an;
   private static boolean bh = false;
   private byte bi = 0;
   private int bj = 10000;
   private int bk = 120000;
   private static boolean bl = false;
   private int bm = 30000;
   private static int bn = 0;
   private static boolean bo;
   private static int bp;
   private static int bq;
   private static int br;
   private static int bs;
   private static int bt;
   private static int bu;
   private static int bv;
   private static int bw;
   private static int bx;
   private static int by;
   private static int bz;
   private static int bA;
   private static long bB;
   private static int[] bC = new int[1];
   private static int[] bD = new int[1];
   private static int bE;
   private static int bF;
   private static int bG;
   private static int bH;
   private static int bI = 0;
   private static int bJ = 50;
   private static int bK = 4;
   private static int bL = 18;
   private static int bM;
   private static int bN;
   private static int bO = 400;
   private static byte bP = 3;
   private static int bQ = 0;
   private static int bR = 0;
   private static int bS = -1;
   private static int bT = -1;
   private static int bU = -1;
   private static int bV = -1;
   int ao = -1;
   int ap = -1;
   int aq = -1;
   byte ar;
   private int bW = -1;
   private int bX;
   int as;
   int at;
   byte au;
   private int bY;
   private int bZ;
   int av;
   int aw;
   int ax;
   private int ca;
   private int cb;
   private int cc;
   private int[] cd;
   d ay;
   a az;
   long aA;
   long aB;
   long aC;
   byte aD;
   byte aE;
   boolean aF;
   int aG = 0;
   int[] aH = new int[4];
   protected byte aI;
   boolean aJ;
   boolean aK;
   public static boolean aL = false;
   public static int aM = 0;
   public static int aN = 0;
   private int ce;
   private int cf;
   private int cg;
   private int ch;
   private int ci;
   private int cj;
   private int ck;
   private int cl;
   static boolean aO = false;
   private static int cm;
   private static int cn;
   byte aP;
   byte aQ;

   public static q a(int var0, int var1, q var2) {
      if (var2 == null) {
         return null;
      }

      var2.av = var0;
      var2.aw = var1;
      var2.ax = 0;
      var2.cd = new int[6];
      var2.cd[1] = 0;
      var2.cd[2] = 1;
      var2.cd[3] = 2;
      var2.cd[4] = 2;
      var2.ay = new d();
      var2.bY = 0;
      var2.bZ = 0;
      var2.ca = var2.av;
      var2.cb = var2.aw;
      var2.ca = var2.ca;
      var2.cb = var2.cb;
      return var2;
   }

   public static q a(int var0, int var1, int var2, boolean var3) {
      q var4;
      (var4 = new q()).bW = 4;
      var4.au = 12;
      b(var4, t.z);
      var4.av = var0;
      var4.aw = var1;
      var4.cc = 0;
      var4.cd = new int[12];
      var4.cd[1] = 0;
      var4.cd[0] = var2;
      var4.cd[3] = 1;
      var4.cd[4] = -1;
      var4.cd[7] = 1;
      var4.cd[8] = var3 ? 1 : 0;
      if (var4.cd[3] > 0) {
         var4.ay = new d(t.j[3][var2], var4.av, var4.aw);
         var4.ay.a(0, 1);
      }

      var4.ca = var4.av;
      var4.cb = var4.aw;
      return var4;
   }

   final void a() {
      if (this.ay != null) {
         this.ay.c(t.aq);
      }

      if (this.cd[3] > 0 && this.cd[7] > 0) {
         if (this.ay.f()) {
            a(this, t.z);
            if (t.al != null) {
               t.al = null;
            }
         }
      } else if (this.cd[4] > 0) {
         this.cc = this.cc + t.aq;
         if (this.cc > this.cd[4]) {
            a(this, t.z);
            if (t.al != null) {
               t.al = null;
            }
         }
      }

      if (this.cd[8] != 0) {
         this.c();
      }

      if (this.cd[3] > 0) {
         int var3 = this.cb;
         int var2 = this.ca;
         d var1 = this.ay;
         this.ay.a = var2;
         var1.b = var3;
      }
   }

   final void b() {
      if (this.cd[3] > 0) {
         int var4 = this.ca;
         int var2 = this.cb;
         if (this.cd[8] > 0) {
            var4 = var4 * t.S / 100;
            var2 = var2 * t.S / 100;
         }

         int var3 = var2;
         var2 = var4;
         d var5 = this.ay;
         this.ay.a = var2;
         var5.b = var3;
         this.ay.g();
      } else {
         a var1;
         if (this.cd[5] > 0) {
            var1 = t.j[1][this.cd[0]];
         } else {
            var1 = t.j[3][this.cd[0]];
         }

         var1.a(t.am, this.cd[1], this.ca, this.cb, 0);
      }
   }

   final void c() {
      this.ca = this.av - d.k[0][13];
      this.cb = this.aw - d.h(0);
   }

   public static void a(int var0) {
      aV = t.B(var0);
      int var26 = 0;
      int var8 = 0;
      var26++;
      aR = aV[0];
      aS = 0;
      aT = 0;
      aU = 0;
      if (var0 == 0) {
         c = new short[aR * 5];
      }

      if (var0 == 2) {
         k = new short[aR * 5];
      }

      if (var0 == 1) {
         g = new short[aR * 5];
      }

      if (var0 == 7) {
         E = new short[aR * 5];
      }

      if (var0 == 3) {
         o = new short[aR * 5];
      }

      if (var0 == 4) {
         s = new short[aR * 5];
      }

      if (var0 == 5) {
         w = new short[aR * 5];
      }

      if (var0 == 6) {
         A = new short[aR * 5];
      }

      if (var0 == 8) {
         I = new short[aR * 5];
      }

      if (var0 == 9) {
         M = new short[aR * 5];
      }

      if (var0 == 10) {
         Q = new short[aR * 5];
      }

      if (var0 == 11) {
         U = new short[aR * 5];
      }

      if (var0 == 12) {
         Y = new short[aR * 5];
      }

      for (int var2 = 0; var2 < aR; var2++) {
         if (var0 == 2) {
            var8 = var2 * 5;
            k[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            k[var8 + 1] = aV[var26++];
            k[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            k[var8 + 4] = (short)aS;
         }

         if (var0 == 0) {
            var8 = var2 * 5;
            c[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            c[var8 + 1] = aV[var26++];
            c[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            c[var8 + 4] = (short)aS;
         }

         if (var0 == 1) {
            var8 = var2 * 5;
            g[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            g[var8 + 1] = aV[var26++];
            g[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            g[var8 + 4] = (short)aS;
         }

         if (var0 == 3) {
            var8 = var2 * 5;
            o[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            o[var8 + 1] = aV[var26++];
            o[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            o[var8 + 4] = (short)aS;
         }

         if (var0 == 4) {
            var8 = var2 * 5;
            s[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            s[var8 + 1] = aV[var26++];
            s[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            s[var8 + 4] = (short)aS;
         }

         if (var0 == 5) {
            var8 = var2 * 5;
            w[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            w[var8 + 1] = aV[var26++];
            w[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            w[var8 + 4] = (short)aS;
         }

         if (var0 == 6) {
            var8 = var2 * 5;
            A[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            A[var8 + 1] = aV[var26++];
            A[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            A[var8 + 4] = (short)aS;
         }

         if (var0 == 7) {
            var8 = var2 * 5;
            E[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            E[var8 + 1] = aV[var26++];
            E[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            E[var8 + 4] = (short)aS;
         }

         if (var0 == 8) {
            var8 = var2 * 5;
            I[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            I[var8 + 1] = aV[var26++];
            I[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            I[var8 + 4] = (short)aS;
         }

         if (var0 == 9) {
            var8 = var2 * 5;
            M[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            M[var8 + 1] = aV[var26++];
            M[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            M[var8 + 4] = (short)aS;
         }

         if (var0 == 10) {
            var8 = var2 * 5;
            Q[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            Q[var8 + 1] = aV[var26++];
            Q[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            Q[var8 + 4] = (short)aS;
         }

         if (var0 == 11) {
            var8 = var2 * 5;
            U[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            U[var8 + 1] = aV[var26++];
            U[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            U[var8 + 4] = (short)aS;
         }

         if (var0 == 12) {
            var8 = var2 * 5;
            Y[var8] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            var26 += 2;
            Y[var8 + 1] = aV[var26++];
            Y[var8 + 2] = (short)((aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8));
            Y[var8 + 4] = (short)aS;
         }

         var26 += 2;
         int var6 = 0;
         short[] var9 = null;
         if (var0 == 2) {
            var9 = new short[k.length];
            System.arraycopy(k, 0, var9, 0, k.length);
         }

         if (var0 == 0) {
            var9 = new short[c.length];
            System.arraycopy(c, 0, var9, 0, c.length);
         }

         if (var0 == 1) {
            var9 = new short[g.length];
            System.arraycopy(g, 0, var9, 0, g.length);
         }

         if (var0 == 3) {
            var9 = new short[o.length];
            System.arraycopy(o, 0, var9, 0, o.length);
         }

         if (var0 == 4) {
            var9 = new short[s.length];
            System.arraycopy(s, 0, var9, 0, s.length);
         }

         if (var0 == 5) {
            var9 = new short[w.length];
            System.arraycopy(w, 0, var9, 0, w.length);
         }

         if (var0 == 6) {
            var9 = new short[A.length];
            System.arraycopy(A, 0, var9, 0, A.length);
         }

         if (var0 == 7) {
            var9 = new short[E.length];
            System.arraycopy(E, 0, var9, 0, E.length);
         }

         if (var0 == 8) {
            var9 = new short[I.length];
            System.arraycopy(I, 0, var9, 0, I.length);
         }

         if (var0 == 9) {
            var9 = new short[M.length];
            System.arraycopy(M, 0, var9, 0, M.length);
         }

         if (var0 == 10) {
            var9 = new short[Q.length];
            System.arraycopy(Q, 0, var9, 0, Q.length);
         }

         if (var0 == 11) {
            var9 = new short[U.length];
            System.arraycopy(U, 0, var9, 0, U.length);
         }

         if (var0 == 12) {
            var9 = new short[Y.length];
            System.arraycopy(Y, 0, var9, 0, Y.length);
         }

         for (int var3 = 0; var3 < var9[var8 + 1]; var3++) {
            int var10;
            if (aV[var26++] == 3) {
               aS++;
               var26 += 3;
               var10 = (aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8);
               aT = (short)(aT + var10);
               var26 += 2;
            } else {
               var10 = 0;
            }

            if (var10 != 0) {
               for (int var4 = 0; var4 < var10; var4++) {
                  int var7;
                  if ((var7 = (aV[var26] & 255) + ((aV[var26 + 1] & 255) << 8)) > var6) {
                     var6 = var7;
                  }

                  var26 += 2;
                  byte var27 = aV[var26++];

                  for (int var5 = 0; var5 < var27; var5++) {
                     switch (aV[var26++]) {
                        case 61:
                           var26 += 4;
                           break;
                        case 62:
                           var26++;
                           break;
                        case 63:
                           var26 += 4;
                           break;
                        case 64:
                           var26 += 4;
                           break;
                        case 65:
                           aU++;
                           continue;
                        case 66:
                           aU++;
                           continue;
                        case 67:
                           aU++;
                           continue;
                        case 68:
                           aU++;
                           break;
                        case 105:
                           var26++;
                           break;
                        case 106:
                           var26 += 4;
                        case 107:
                           break;
                        default:
                           continue;
                     }

                     aU++;
                  }
               }
            }
         }

         if (var0 == 2) {
            k[var8 + 3] = (short)var6;
         }

         if (var0 == 0) {
            c[var8 + 3] = (short)var6;
         }

         if (var0 == 1) {
            g[var8 + 3] = (short)var6;
         }

         if (var0 == 3) {
            o[var8 + 3] = (short)var6;
         }

         if (var0 == 4) {
            s[var8 + 3] = (short)var6;
         }

         if (var0 == 5) {
            w[var8 + 3] = (short)var6;
         }

         if (var0 == 6) {
            A[var8 + 3] = (short)var6;
         }

         if (var0 == 7) {
            E[var8 + 3] = (short)var6;
         }

         if (var0 == 8) {
            I[var8 + 3] = (short)var6;
         }

         if (var0 == 9) {
            M[var8 + 3] = (short)var6;
         }

         if (var0 == 10) {
            Q[var8 + 3] = (short)var6;
         }

         if (var0 == 11) {
            U[var8 + 3] = (short)var6;
         }

         if (var0 == 12) {
            Y[var8 + 3] = (short)var6;
         }
      }

      if (var0 == 2) {
         l = new short[aS * 5];
         m = new short[aT * 3];
         n = new short[aU * 5];
      }

      if (var0 == 0) {
         d = new short[aS * 5];
         e = new short[aT * 3];
         f = new short[aU * 5];
      }

      if (var0 == 1) {
         h = new short[aS * 5];
         i = new short[aT * 3];
         j = new short[aU * 5];
      }

      if (var0 == 3) {
         p = new short[aS * 5];
         q = new short[aT * 3];
         r = new short[aU * 5];
      }

      if (var0 == 4) {
         t = new short[aS * 5];
         u = new short[aT * 3];
         v = new short[aU * 5];
      }

      if (var0 == 5) {
         x = new short[aS * 5];
         y = new short[aT * 3];
         z = new short[aU * 5];
      }

      if (var0 == 6) {
         B = new short[aS * 5];
         C = new short[aT * 3];
         D = new short[aU * 5];
      }

      if (var0 == 7) {
         F = new short[aS * 5];
         G = new short[aT * 3];
         H = new short[aU * 5 + 5];
      }

      if (var0 == 8) {
         J = new short[aS * 5];
         K = new short[aT * 3];
         L = new short[aU * 5];
      }

      if (var0 == 9) {
         N = new short[aS * 5];
         O = new short[aT * 3];
         P = new short[aU * 5];
      }

      if (var0 == 10) {
         R = new short[aS * 5];
         S = new short[aT * 3];
         T = new short[aU * 5];
      }

      if (var0 == 11) {
         V = new short[aS * 5];
         W = new short[aT * 3];
         X = new short[aU * 5];
      }

      if (var0 == 12) {
         Z = new short[aS * 5];
         aa = new short[aT * 3];
         ab = new short[aU * 5];
      }
   }

   public static void b(int var0) {
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var4 = 0;
      byte var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var3 = 0;
      int var13 = 0;
      int var14 = 0;
      var5++;

      for (int var1 = 0; var1 < aR; var1++) {
         var12 = var1 * 5;
         var5 += 5;
         int var15 = var10;
         short[] var16 = null;
         if (var0 == 2) {
            var16 = new short[k.length];
            System.arraycopy(k, 0, var16, 0, k.length);
         }

         if (var0 == 0) {
            var16 = new short[c.length];
            System.arraycopy(c, 0, var16, 0, c.length);
         }

         if (var0 == 1) {
            var16 = new short[g.length];
            System.arraycopy(g, 0, var16, 0, g.length);
         }

         if (var0 == 3) {
            var16 = new short[o.length];
            System.arraycopy(o, 0, var16, 0, o.length);
         }

         if (var0 == 4) {
            var16 = new short[s.length];
            System.arraycopy(s, 0, var16, 0, s.length);
         }

         if (var0 == 5) {
            var16 = new short[w.length];
            System.arraycopy(w, 0, var16, 0, w.length);
         }

         if (var0 == 6) {
            var16 = new short[A.length];
            System.arraycopy(A, 0, var16, 0, A.length);
         }

         if (var0 == 7) {
            var16 = new short[E.length];
            System.arraycopy(E, 0, var16, 0, E.length);
         }

         if (var0 == 8) {
            var16 = new short[I.length];
            System.arraycopy(I, 0, var16, 0, I.length);
         }

         if (var0 == 9) {
            var16 = new short[M.length];
            System.arraycopy(M, 0, var16, 0, M.length);
         }

         if (var0 == 10) {
            var16 = new short[Q.length];
            System.arraycopy(Q, 0, var16, 0, Q.length);
         }

         if (var0 == 11) {
            var16 = new short[U.length];
            System.arraycopy(U, 0, var16, 0, U.length);
         }

         if (var0 == 12) {
            var16 = new short[Y.length];
            System.arraycopy(Y, 0, var16, 0, Y.length);
         }

         for (int var2 = var15; var2 < var15 + var16[var12 + 1]; var2++) {
            var6 = -1;
            var7 = -1;
            int var17;
            switch (var17 = aV[var5++]) {
               case 3:
                  if (var0 == 2) {
                     var3 = var10 * 5;
                     l[var3] = (short)var17;
                     l[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     l[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     l[var3 + 3] = (short)var4;
                     var17 = var4;
                     l[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 0) {
                     var3 = var10 * 5;
                     d[var3] = (short)var17;
                     d[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     d[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     d[var3 + 3] = (short)var4;
                     var17 = var4;
                     d[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 1) {
                     var3 = var10 * 5;
                     h[var3] = (short)var17;
                     h[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     h[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     h[var3 + 3] = (short)var4;
                     var17 = var4;
                     h[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 3) {
                     var3 = var10 * 5;
                     p[var3] = (short)var17;
                     p[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     p[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     p[var3 + 3] = (short)var4;
                     var17 = var4;
                     p[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 4) {
                     var3 = var10 * 5;
                     t[var3] = (short)var17;
                     t[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     t[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     t[var3 + 3] = (short)var4;
                     var17 = var4;
                     t[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 5) {
                     var3 = var10 * 5;
                     x[var3] = (short)var17;
                     x[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     x[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     x[var3 + 3] = (short)var4;
                     var17 = var4;
                     x[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 6) {
                     var3 = var10 * 5;
                     B[var3] = (short)var17;
                     B[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     B[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     B[var3 + 3] = (short)var4;
                     var17 = var4;
                     B[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 7) {
                     var3 = var10 * 5;
                     F[var3] = (short)var17;
                     F[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     F[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     F[var3 + 3] = (short)var4;
                     var17 = var4;
                     F[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 8) {
                     var3 = var10 * 5;
                     J[var3] = (short)var17;
                     J[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     J[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     J[var3 + 3] = (short)var4;
                     var17 = var4;
                     J[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 9) {
                     var3 = var10 * 5;
                     N[var3] = (short)var17;
                     N[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     N[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     N[var3 + 3] = (short)var4;
                     var17 = var4;
                     N[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 10) {
                     var3 = var10 * 5;
                     R[var3] = (short)var17;
                     R[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     R[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     R[var3 + 3] = (short)var4;
                     var17 = var4;
                     R[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 11) {
                     var3 = var10 * 5;
                     V[var3] = (short)var17;
                     V[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     V[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     V[var3 + 3] = (short)var4;
                     var17 = var4;
                     V[var3 + 4] = (short)var11;
                     var10++;
                  }

                  if (var0 == 12) {
                     var3 = var10 * 5;
                     Z[var3] = (short)var17;
                     Z[var3 + 1] = (short)(aV[var5++] & 0xFF);
                     Z[var3 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                     var5 += 2;
                     var4 = (aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8);
                     var5 += 2;
                     Z[var3 + 3] = (short)var4;
                     var17 = var4;
                     Z[var3 + 4] = (short)var11;
                     var10++;
                  }
                  break;
               default:
                  var17 = 0;
            }

            if (var17 != 0) {
               int var18 = var11;

               for (int var34 = var11; var34 < var18 + var17; var34++) {
                  var13 = var11 * 3;
                  short var48 = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                  var5 += 2;
                  if (var0 == 2) {
                     m[var13] = (short)var48;
                     var8 = aV[var5++];
                     m[var13 + 2] = (short)var9;
                     m[var13 + 1] = var8;
                  }

                  if (var0 == 0) {
                     e[var13] = (short)var48;
                     var8 = aV[var5++];
                     e[var13 + 2] = (short)var9;
                     e[var13 + 1] = var8;
                  }

                  if (var0 == 1) {
                     i[var13] = (short)var48;
                     var8 = aV[var5++];
                     i[var13 + 2] = (short)var9;
                     i[var13 + 1] = var8;
                  }

                  if (var0 == 3) {
                     q[var13] = (short)var48;
                     var8 = aV[var5++];
                     q[var13 + 2] = (short)var9;
                     q[var13 + 1] = var8;
                  }

                  if (var0 == 4) {
                     u[var13] = (short)var48;
                     var8 = aV[var5++];
                     u[var13 + 2] = (short)var9;
                     u[var13 + 1] = var8;
                  }

                  if (var0 == 5) {
                     y[var13] = (short)var48;
                     var8 = aV[var5++];
                     y[var13 + 2] = (short)var9;
                     y[var13 + 1] = var8;
                  }

                  if (var0 == 6) {
                     C[var13] = (short)var48;
                     var8 = aV[var5++];
                     C[var13 + 2] = (short)var9;
                     C[var13 + 1] = var8;
                  }

                  if (var0 == 7) {
                     G[var13] = (short)var48;
                     var8 = aV[var5++];
                     G[var13 + 2] = (short)var9;
                     G[var13 + 1] = var8;
                  }

                  if (var0 == 8) {
                     K[var13] = (short)var48;
                     var8 = aV[var5++];
                     K[var13 + 2] = (short)var9;
                     K[var13 + 1] = var8;
                  }

                  if (var0 == 9) {
                     O[var13] = (short)var48;
                     var8 = aV[var5++];
                     O[var13 + 2] = (short)var9;
                     O[var13 + 1] = var8;
                  }

                  if (var0 == 10) {
                     S[var13] = (short)var48;
                     var8 = aV[var5++];
                     S[var13 + 2] = (short)var9;
                     S[var13 + 1] = var8;
                  }

                  if (var0 == 11) {
                     W[var13] = (short)var48;
                     var8 = aV[var5++];
                     W[var13 + 2] = (short)var9;
                     W[var13 + 1] = var8;
                  }

                  if (var0 == 12) {
                     aa[var13] = (short)var48;
                     var8 = aV[var5++];
                     aa[var13 + 2] = (short)var9;
                     aa[var13 + 1] = var8;
                  }

                  int var19 = var9;

                  for (int var49 = var9; var49 < var19 + var8; var49++) {
                     var14 = var9 * 5;
                     byte var20 = aV[var5++];
                     if (var0 == 2) {
                        n[var14 + 1] = 0;
                     }

                     if (var0 == 0) {
                        f[var14 + 1] = 0;
                     }

                     switch (var20) {
                        case 61:
                           if (var0 == 2) {
                              n[var14] = var20;
                              n[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              n[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              n[var14 + 3] = 0;
                              n[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = m[var13] - m[var6 * 3] << 8;
                                 n[var7 * 5 + 3] = (short)t.p(n[var14 + 1] - n[var7 * 5 + 1] << 8, var6);
                                 n[var7 * 5 + 4] = (short)t.p(n[var14 + 2] - n[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 0) {
                              f[var14] = var20;
                              f[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              f[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              f[var14 + 3] = 0;
                              f[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = e[var13] - e[var6 * 3] << 8;
                                 f[var7 * 5 + 3] = (short)t.p(f[var14 + 1] - f[var7 * 5 + 1] << 8, var6);
                                 f[var7 * 5 + 4] = (short)t.p(f[var14 + 2] - f[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 1) {
                              j[var14] = var20;
                              j[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              j[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              j[var14 + 3] = 0;
                              j[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = i[var13] - i[var6 * 3] << 8;
                                 j[var7 * 5 + 3] = (short)t.p(j[var14 + 1] - j[var7 * 5 + 1] << 8, var6);
                                 j[var7 * 5 + 4] = (short)t.p(j[var14 + 2] - j[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 3) {
                              r[var14] = var20;
                              r[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              r[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              r[var14 + 3] = 0;
                              r[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = q[var13] - q[var6 * 3] << 8;
                                 r[var7 * 5 + 3] = (short)t.p(r[var14 + 1] - r[var7 * 5 + 1] << 8, var6);
                                 r[var7 * 5 + 4] = (short)t.p(r[var14 + 2] - r[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 4) {
                              v[var14] = var20;
                              v[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              v[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              v[var14 + 3] = 0;
                              v[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = u[var13] - u[var6 * 3] << 8;
                                 v[var7 * 5 + 3] = (short)t.p(v[var14 + 1] - v[var7 * 5 + 1] << 8, var6);
                                 v[var7 * 5 + 4] = (short)t.p(v[var14 + 2] - v[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 5) {
                              z[var14] = var20;
                              z[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              z[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              z[var14 + 3] = 0;
                              z[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = y[var13] - y[var6 * 3] << 8;
                                 z[var7 * 5 + 3] = (short)t.p(z[var14 + 1] - z[var7 * 5 + 1] << 8, var6);
                                 z[var7 * 5 + 4] = (short)t.p(z[var14 + 2] - z[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 6) {
                              D[var14] = var20;
                              D[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              D[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              D[var14 + 3] = 0;
                              D[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = C[var13] - C[var6 * 3] << 8;
                                 D[var7 * 5 + 3] = (short)t.p(D[var14 + 1] - D[var7 * 5 + 1] << 8, var6);
                                 D[var7 * 5 + 4] = (short)t.p(D[var14 + 2] - D[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 7) {
                              H[var14] = var20;
                              H[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              H[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              H[var14 + 3] = 0;
                              H[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = G[var13] - G[var6 * 3] << 8;
                                 H[var7 * 5 + 3] = (short)t.p(H[var14 + 1] - H[var7 * 5 + 1] << 8, var6);
                                 H[var7 * 5 + 4] = (short)t.p(H[var14 + 2] - H[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 8) {
                              L[var14] = var20;
                              L[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              L[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              L[var14 + 3] = 0;
                              L[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = K[var13] - K[var6 * 3] << 8;
                                 L[var7 * 5 + 3] = (short)t.p(L[var14 + 1] - L[var7 * 5 + 1] << 8, var6);
                                 L[var7 * 5 + 4] = (short)t.p(L[var14 + 2] - L[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 9) {
                              P[var14] = var20;
                              P[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              P[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              P[var14 + 3] = 0;
                              P[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = O[var13] - O[var6 * 3] << 8;
                                 P[var7 * 5 + 3] = (short)t.p(P[var14 + 1] - P[var7 * 5 + 1] << 8, var6);
                                 P[var7 * 5 + 4] = (short)t.p(P[var14 + 2] - P[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 10) {
                              T[var14] = var20;
                              T[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              T[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              T[var14 + 3] = 0;
                              T[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = S[var13] - S[var6 * 3] << 8;
                                 T[var7 * 5 + 3] = (short)t.p(T[var14 + 1] - T[var7 * 5 + 1] << 8, var6);
                                 T[var7 * 5 + 4] = (short)t.p(T[var14 + 2] - T[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 11) {
                              X[var14] = var20;
                              X[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              X[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              X[var14 + 3] = 0;
                              X[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = W[var13] - W[var6 * 3] << 8;
                                 X[var7 * 5 + 3] = (short)t.p(X[var14 + 1] - X[var7 * 5 + 1] << 8, var6);
                                 X[var7 * 5 + 4] = (short)t.p(X[var14 + 2] - X[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }

                           if (var0 == 12) {
                              ab[var14] = var20;
                              ab[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              ab[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              ab[var14 + 3] = 0;
                              ab[var14 + 4] = 0;
                              if (var6 != -1) {
                                 var6 = aa[var13] - aa[var6 * 3] << 8;
                                 ab[var7 * 5 + 3] = (short)t.p(ab[var14 + 1] - ab[var7 * 5 + 1] << 8, var6);
                                 ab[var7 * 5 + 4] = (short)t.p(ab[var14 + 2] - ab[var7 * 5 + 2] << 8, var6);
                              }

                              var6 = var11;
                              var7 = var9;
                           }
                           break;
                        case 62:
                           if (var0 == 2) {
                              n[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 0) {
                              f[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 1) {
                              j[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 3) {
                              r[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 4) {
                              v[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 5) {
                              z[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 6) {
                              D[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 7) {
                              H[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 8) {
                              L[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 9) {
                              P[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 10) {
                              T[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 11) {
                              X[var14 + 1] = aV[var5++];
                           }

                           if (var0 == 12) {
                              ab[var14 + 1] = aV[var5++];
                           }
                           break;
                        case 63:
                           if (var0 == 2) {
                              n[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 0) {
                              f[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 1) {
                              j[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 3) {
                              r[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 4) {
                              v[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 5) {
                              z[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 6) {
                              D[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 7) {
                              H[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 8) {
                              L[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 9) {
                              P[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 10) {
                              T[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 11) {
                              X[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 12) {
                              ab[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           var5 += 4;
                           break;
                        case 64:
                           if (var0 == 2) {
                              n[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 0) {
                              f[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 1) {
                              j[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 3) {
                              r[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 4) {
                              v[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 5) {
                              z[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 6) {
                              D[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 7) {
                              H[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 8) {
                              L[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 9) {
                              P[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 10) {
                              T[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 11) {
                              X[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           if (var0 == 12) {
                              ab[var14 + 1] = (short)(aV[var5] & 0xFF | (aV[var5 + 1] & 255) << 8 | (aV[var5 + 2] & 255) >> 5 | (aV[var5 + 3] & 255) << 24);
                           }

                           var5 += 4;
                           break;
                        case 105:
                           if (var0 == 2) {
                              n[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 0) {
                              f[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 1) {
                              j[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 3) {
                              r[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 4) {
                              v[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 5) {
                              z[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 6) {
                              D[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 7) {
                              H[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 8) {
                              L[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 9) {
                              P[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 10) {
                              T[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 11) {
                              X[var14 + 1] = (byte)aV[var5++];
                           }

                           if (var0 == 12) {
                              ab[var14 + 1] = (byte)aV[var5++];
                           }
                           break;
                        case 106:
                           if (var0 == 2) {
                              n[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              n[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                           }

                           if (var0 == 0) {
                              f[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              f[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                           }

                           if (var0 == 1) {
                              j[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              j[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                           }

                           if (var0 == 3) {
                              r[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              r[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                           }

                           if (var0 == 4) {
                              v[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              v[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                           }

                           if (var0 == 5) {
                              z[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              z[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                           }

                           if (var0 == 6) {
                              D[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              D[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                           }

                           if (var0 == 7) {
                              H[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              H[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                           }

                           if (var0 == 8) {
                              L[var14 + 1] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                              L[var14 + 2] = (short)((aV[var5] & 255) + ((aV[var5 + 1] & 255) << 8));
                              var5 += 2;
                           }
                     }

                     if (var0 == 2) {
                        n[var14] = var20;
                     }

                     if (var0 == 0) {
                        f[var14] = var20;
                     }

                     if (var0 == 1) {
                        j[var14] = var20;
                     }

                     if (var0 == 3) {
                        r[var14] = var20;
                     }

                     if (var0 == 4) {
                        v[var14] = var20;
                     }

                     if (var0 == 5) {
                        z[var14] = var20;
                     }

                     if (var0 == 6) {
                        D[var14] = var20;
                     }

                     if (var0 == 7) {
                        H[var14] = var20;
                     }

                     if (var0 == 8) {
                        L[var14] = var20;
                     }

                     if (var0 == 9) {
                        P[var14] = var20;
                     }

                     if (var0 == 10) {
                        T[var14] = var20;
                     }

                     if (var0 == 11) {
                        X[var14] = var20;
                     }

                     if (var0 == 12) {
                        ab[var14] = var20;
                     }

                     var9++;
                  }

                  var11++;
               }
            }
         }
      }

      aV = null;
   }

   public static void a(int[][] var0, int var1, int var2) {
      int var4 = var1 * 5 + 4;
      var0[0][0] = 0;
      var0[0][1] = var1;
      int var5 = 0;
      if (var2 == 2) {
         for (int var3 = 1; var3 < k[var1 * 5 + 1] + 1; var3++) {
            var0[var3][0] = 0;
            var0[var3][1] = 0;
            var5 = (k[var4] + (var3 - 1)) * 5;
            var0[var3][2] = l[var5 + 2];
            if (l[var5 + 3] == 0) {
               var0[var3][3] = -1;
            } else {
               var0[var3][3] = 0;
            }

            var0[var3][6] = 0;
         }
      }

      if (var2 == 0) {
         for (int var6 = 1; var6 < c[var1 * 5 + 1] + 1; var6++) {
            var0[var6][0] = 0;
            var0[var6][1] = 0;
            var5 = (c[var4] + (var6 - 1)) * 5;
            var0[var6][2] = d[var5 + 2];
            if (d[var5 + 3] == 0) {
               var0[var6][3] = -1;
            } else {
               var0[var6][3] = 0;
            }

            var0[var6][6] = 0;
         }
      }

      if (var2 == 1) {
         for (int var7 = 1; var7 < g[var1 * 5 + 1] + 1; var7++) {
            var0[var7][0] = 0;
            var0[var7][1] = 0;
            var5 = (g[var4] + (var7 - 1)) * 5;
            var0[var7][2] = h[var5 + 2];
            if (h[var5 + 3] == 0) {
               var0[var7][3] = -1;
            } else {
               var0[var7][3] = 0;
            }

            var0[var7][6] = 0;
         }
      }

      if (var2 == 3) {
         for (int var8 = 1; var8 < o[var1 * 5 + 1] + 1; var8++) {
            var0[var8][0] = 0;
            var0[var8][1] = 0;
            var5 = (o[var4] + (var8 - 1)) * 5;
            var0[var8][2] = p[var5 + 2];
            if (p[var5 + 3] == 0) {
               var0[var8][3] = -1;
            } else {
               var0[var8][3] = 0;
            }

            var0[var8][6] = 0;
         }
      }

      if (var2 == 4) {
         for (int var9 = 1; var9 < s[var1 * 5 + 1] + 1; var9++) {
            var0[var9][0] = 0;
            var0[var9][1] = 0;
            var5 = (s[var4] + (var9 - 1)) * 5;
            var0[var9][2] = t[var5 + 2];
            if (t[var5 + 3] == 0) {
               var0[var9][3] = -1;
            } else {
               var0[var9][3] = 0;
            }

            var0[var9][6] = 0;
         }
      }

      if (var2 == 5) {
         for (int var10 = 1; var10 < w[var1 * 5 + 1] + 1; var10++) {
            var0[var10][0] = 0;
            var0[var10][1] = 0;
            var5 = (w[var4] + (var10 - 1)) * 5;
            var0[var10][2] = x[var5 + 2];
            if (x[var5 + 3] == 0) {
               var0[var10][3] = -1;
            } else {
               var0[var10][3] = 0;
            }

            var0[var10][6] = 0;
         }
      }

      if (var2 == 6) {
         for (int var11 = 1; var11 < A[var1 * 5 + 1] + 1; var11++) {
            var0[var11][0] = 0;
            var0[var11][1] = 0;
            var5 = (A[var4] + (var11 - 1)) * 5;
            var0[var11][2] = B[var5 + 2];
            if (B[var5 + 3] == 0) {
               var0[var11][3] = -1;
            } else {
               var0[var11][3] = 0;
            }

            var0[var11][6] = 0;
         }
      }

      if (var2 == 7) {
         for (int var12 = 1; var12 < E[var1 * 5 + 1] + 1; var12++) {
            var0[var12][0] = 0;
            var0[var12][1] = 0;
            var5 = (E[var4] + (var12 - 1)) * 5;
            var0[var12][2] = F[var5 + 2];
            if (F[var5 + 3] == 0) {
               var0[var12][3] = -1;
            } else {
               var0[var12][3] = 0;
            }

            var0[var12][6] = 0;
         }
      }

      if (var2 == 8) {
         for (int var13 = 1; var13 < I[var1 * 5 + 1] + 1; var13++) {
            var0[var13][0] = 0;
            var0[var13][1] = 0;
            var5 = (I[var4] + (var13 - 1)) * 5;
            var0[var13][2] = J[var5 + 2];
            if (J[var5 + 3] == 0) {
               var0[var13][3] = -1;
            } else {
               var0[var13][3] = 0;
            }

            var0[var13][6] = 0;
         }
      }

      if (var2 == 9) {
         for (int var14 = 1; var14 < M[var1 * 5 + 1] + 1; var14++) {
            var0[var14][0] = 0;
            var0[var14][1] = 0;
            var5 = (M[var4] + (var14 - 1)) * 5;
            var0[var14][2] = N[var5 + 2];
            if (N[var5 + 3] == 0) {
               var0[var14][3] = -1;
            } else {
               var0[var14][3] = 0;
            }

            var0[var14][6] = 0;
         }
      }

      if (var2 == 10) {
         for (int var15 = 1; var15 < Q[var1 * 5 + 1] + 1; var15++) {
            var0[var15][0] = 0;
            var0[var15][1] = 0;
            var5 = (Q[var4] + (var15 - 1)) * 5;
            var0[var15][2] = R[var5 + 2];
            if (R[var5 + 3] == 0) {
               var0[var15][3] = -1;
            } else {
               var0[var15][3] = 0;
            }

            var0[var15][6] = 0;
         }
      }

      if (var2 == 11) {
         for (int var16 = 1; var16 < U[var1 * 5 + 1] + 1; var16++) {
            var0[var16][0] = 0;
            var0[var16][1] = 0;
            var5 = (U[var4] + (var16 - 1)) * 5;
            var0[var16][2] = V[var5 + 2];
            if (V[var5 + 3] == 0) {
               var0[var16][3] = -1;
            } else {
               var0[var16][3] = 0;
            }

            var0[var16][6] = 0;
         }
      }

      if (var2 == 12) {
         for (int var17 = 1; var17 < Y[var1 * 5 + 1] + 1; var17++) {
            var0[var17][0] = 0;
            var0[var17][1] = 0;
            var5 = (Y[var4] + (var17 - 1)) * 5;
            var0[var17][2] = Z[var5 + 2];
            if (Z[var5 + 3] == 0) {
               var0[var17][3] = -1;
            } else {
               var0[var17][3] = 0;
            }

            var0[var17][6] = 0;
         }
      }
   }

   public static int c(int var0) {
      switch (var0) {
         case 2:
            return c(0, 1, 3);
         case 3:
            return c(0, 1, 6);
         case 4:
            return c(0, 1, 5);
         case 5:
            return c(0, 1, 7);
         default:
            return 10000;
      }
   }

   private static int c(int var0, int var1, int var2) {
      var0 = 0;
      var1 = af[0][1].length;

      for (int var3 = 0; var3 < var1; var3++) {
         if (af[0][1][var3] != null) {
            if (af[0][1][var3].au == var2) {
               var0++;
            }

            if (var2 == 2 && af[0][1][var3].ar == 6 && var0 > 0) {
               var0--;
            }
         }
      }

      return var0;
   }

   public static void d() {
      int var0 = af[0][1].length;

      for (int var1 = 0; var1 < var0; var1++) {
         if (af[0][1][var1] != null && af[0][1][var1].aP == 1) {
            t.ab.a(((v)af[0][1][var1]).bh.e[0], 3);
         }
      }
   }

   public static void e() {
      int var0 = af[0][1].length;

      for (int var1 = 0; var1 < var0; var1++) {
         if (af[0][1][var1] != null) {
            if (af[0][1][var1].aP == 5) {
               af[0][1][var1].d((byte)4);
               af[0][1][var1].e(af[0][1][var1].X());

               for (int var2 = 0; var2 < ((v)af[0][1][var1]).aX; var2++) {
                  if (((v)af[0][1][var1]).aV[var2] != null) {
                     ((v)af[0][1][var1]).aV[var2].ae();
                  }
               }
            } else if (af[0][1][var1].aP == 1) {
               t.ab.a(((v)af[0][1][var1]).bh.e[0], 3);
               a(af[0][1][var1], t.z);
            }
         }
      }
   }

   public static int f() {
      return c(0, 1, 2);
   }

   public static int g() {
      return c(0, 1, 4);
   }

   public static void a(v var0) {
      a(var0, false);
   }

   public static void a(v var0, boolean var1) {
      v.az();
      if (var1) {
         t.a(29);
         var0.ay();
      } else if (var0.au == 10) {
         t.a(89);
      } else {
         t.a(29);
      }

      if (var0 != null) {
         if (an != null && !an.equals(var0)) {
            an.W();
            if (an.equals(f(1))) {
               aa();
            }
         }

         a(false);
         an = var0;
         var0.e((byte)5);
         t.L = true;
      }
   }

   public static void h() {
      i();
   }

   public static void i() {
      if (an != null) {
         an.W();
         if (an.equals(f(1))) {
            aa();
         }

         if (an.au == 2) {
            for (int var0 = 0; var0 < an.aV.length; var0++) {
               if (an.aV[var0] != null) {
                  a(an.aV[var0], false, true);
               }
            }
         }

         if (an.au == 10) {
            t.a(90);
         } else if (t.ab.e[2] == t.ab.e[1]) {
            t.a(88);
         }

         an = null;
         a(false);
      } else {
         aa();
      }
   }

   private static void aa() {
      v var0 = f(1);

      for (int var1 = 0; var1 < var0.aV.length; var1++) {
         if (var0.aV[var1] != null) {
            a(var0.aV[var1], false, true);
         }
      }
   }

   public static void a(byte var0) {
      am = var0;
      switch (var0) {
         case 0:
            t.a(68, true, true);
            t.a(6, 0, t.F());
            t.a(6, 3, t.F());
            ah = null;
            t.M = true;
            return;
         case 1:
            return;
         case 2:
            t.M = false;
      }
   }

   static void j() {
      if (ah != null) {
         ;
      }

      int var0;
      if ((var0 = ae + 5) > ac.length) {
         var0 = ac.length;
      }

      for (int var1 = 0; var1 < var0; var1++) {
         if (ac[var1] != null && ac[var1].au != 0) {
            ac[var1].k();
         }
      }
   }

   void k() {
      if (this.au == 11 && this.at == t.z) {
         q var12 = this;
         this.av = this.av + var12.ck;
         var12.aw = var12.aw + var12.cl;
         if (var12.cj == 0) {
            return;
         }

         if (var12.av < 0 || var12.av > t.p || var12.aw < 0 || var12.aw > t.q) {
            var12.cj = 0;
            a(var12);
            return;
         }

         var12.ay.c(t.aq);
         int var38 = var12.aw;
         int var31 = var12.av;
         d var24 = var12.ay;
         a(var24, var31, var38, false);
         var12.bj = var12.bj - t.aq;
         if (var12.bj <= 0) {
            a(var12);
         }

         q var18 = var12;
         byte var25;
         if (var12.cj == 1) {
            var25 = 0;
         } else if (var18.cj == 2) {
            var25 = 2;
         } else if (var18.cj == 4) {
            var25 = 1;
         } else {
            var25 = 3;
         }

         int var41 = i(p(var31 = i(var18.av, var18.aw), var25));
         int var45 = 0;
         if (var41 != -1) {
            int var48 = var41 & 0xFF;
            int var53 = var41 >> 16 & 65535;
            if (var48 == 1 && var53 == 254) {
               var45 = 1;
            }
         }

         if (var45) {
            return;
         }

         int var49;
         if ((var49 = d(0, var18.av, var18.aw)) == 7 && var18.av % 48 == 0 && var18.aw % 24 == 0) {
            byte var14;
            if (var18.cj == 1) {
               var14 = 3;
            } else if (var18.cj == 2) {
               var14 = 1;
            } else if (var18.cj == 4) {
               var14 = 4;
            } else {
               var14 = 2;
            }

            if ((var49 = d(var14, var18.av, var18.aw)) == 7) {
               if (var49 == 7) {
                  switch (var18.cj) {
                     case 1:
                     case 4:
                        var41 = d(1, var18.av, var18.aw);
                        var45 = d(2, var18.av, var18.aw);
                        int var56;
                        if ((var56 = t.n(0, 100)) <= 50 && (var41 == 7 || var41 == 254)) {
                           var18.l(2);
                           return;
                        }

                        if (var56 > 50 && var56 <= 100 && (var45 == 7 || var45 == 254)) {
                           var18.l(3);
                           return;
                        }
                        break;
                     case 2:
                     case 3:
                        var38 = d(3, var18.av, var18.aw);
                        int var16 = d(4, var18.av, var18.aw);
                        int var55;
                        if ((var55 = t.n(0, 100)) <= 50 && (var38 == 7 || var38 == 254)) {
                           var18.l(1);
                           return;
                        }

                        if (var55 > 50 && var55 <= 100 && (var16 == 7 || var16 == 254)) {
                           var18.l(4);
                        }
                  }
               }

               return;
            }

            var41 = t.n(0, 4);

            for (int var46 = 0; var46 < 4; var46++) {
               var38 = (var46 + var41) % 4 + 1;
               byte var15 = 0;
               switch (var38) {
                  case 1:
                     var15 = 3;
                     var25 = 0;
                     break;
                  case 2:
                     var15 = 1;
                     var25 = 2;
                     break;
                  case 3:
                     var15 = 2;
                     var25 = 3;
                     break;
                  case 4:
                     var15 = 4;
                     var25 = 1;
               }

               var49 = d(var15, var18.av, var18.aw);
               i(p(var31, var25));
               if (var49 == 7) {
                  var18.l(var38);
                  return;
               }
            }

            return;
         }

         if (var49 != 7 && var18.av % 48 == 0 && var18.aw % 24 == 0) {
            for (int var54 = 0; var54 < 4; var54++) {
               int var13 = var54;
               byte var42 = 0;
               switch (var13) {
                  case 0:
                     var42 = 3;
                     var25 = 0;
                     break;
                  case 1:
                     var42 = 1;
                     var25 = 2;
                     break;
                  case 2:
                     var42 = 2;
                     var25 = 3;
                     break;
                  case 3:
                     var42 = 4;
                     var25 = 1;
               }

               var49 = d(var42, var18.av, var18.aw);
               i(p(var31, var25));
               if (var49 == 7) {
                  var18.l(var13 + 1);
                  return;
               }
            }

            a(var18);
         }

         return;
      } else {
         if (this.au == 12) {
            this.a();
            return;
         }

         if (this.au == 13 && this.at == t.z) {
            q var11 = this;
            this.av = this.av + var11.ck;
            var11.aw = var11.aw + var11.cl;
            if (var11.cj != 0) {
               if (var11.av < 0 || var11.av > t.p || var11.aw < 0 || var11.aw > t.q) {
                  var11.cj = 0;
                  b(var11);
                  return;
               }

               var11.ay.c(t.aq);
               int var35 = var11.aw;
               int var28 = var11.av;
               d var21 = var11.ay;
               a(var21, var28, var35, false);
               var11.bk = var11.bk - t.aq;
               if (var11.bk <= 0 && !t.z() && !t.w()) {
                  b(var11);
               }

               q var17 = var11;
               byte var22;
               byte var29;
               if (var11.cj == 1) {
                  var29 = 3;
                  var22 = 0;
               } else if (var17.cj == 2) {
                  var29 = 1;
                  var22 = 2;
               } else if (var17.cj == 4) {
                  var29 = 4;
                  var22 = 1;
               } else {
                  var29 = 2;
                  var22 = 3;
               }

               if ((var35 = d(var29, var17.av, var17.aw)) != 7
                  && (var35 == 4 || var35 == 6 || var35 == 5 || !c(var17, var22))
                  && var17.av % 48 == 0
                  && var17.aw % 24 == 0) {
                  int var6 = t.n(0, 4);
                  boolean var7 = false;

                  for (int var8 = 0; var8 < 4; var8++) {
                     int var9 = (var8 + var6) % 4 + 1;
                     var29 = 0;
                     byte var23 = 0;
                     switch (var9) {
                        case 1:
                           var29 = 3;
                           var23 = 0;
                           break;
                        case 2:
                           var29 = 1;
                           var23 = 2;
                           break;
                        case 3:
                           var29 = 2;
                           var23 = 3;
                           break;
                        case 4:
                           var29 = 4;
                           var23 = 1;
                     }

                     if ((var35 = d(var29, var17.av, var17.aw)) != 4 && var35 != 6 && var35 != 5 && c(var17, var23)) {
                        var17.l(var9);
                        var7 = true;
                        break;
                     }
                  }

                  if (!var7) {
                     b(var17);
                  }
               }

               var11.S();
            }

            return;
         }

         if (this.au == 15 && this.at == t.z) {
            q var10 = this;
            if (this.aq == 0) {
               var10.ck = 7;
            } else if (var10.aq == 1) {
               var10.ck = -7;
            }

            if ((bn = bn + t.aq / 4) >= 360) {
               bn = 0;
            }

            var10.cl = t.y(t.z((bn << 8) / 360) * 9);
            var10.av = var10.av + var10.ck;
            var10.aw = var10.aw + var10.cl;
            if (var10.cj != 0) {
               if (var10.av < 0 || var10.av > t.p || var10.aw < 0 || var10.aw > t.q) {
                  var10.cj = 0;
                  c(var10);
                  return;
               }

               var10.ay.c(t.aq);
               int var34 = var10.aw;
               int var27 = var10.av;
               d var20 = var10.ay;
               a(var20, var27, var34, false);
               var10.bm = var10.bm - t.aq;
               if (var10.bm <= 0) {
                  c(var10);
               }
            }

            return;
         }

         if (this.au == 17 && this.at == t.z) {
            q var1 = this;
            int var2 = this.cg - var1.cf;
            int var3 = var1.ch - var1.ce;
            int var4 = (var2 * var2 + var3 * var3) / 6;
            var1.ci = var1.ci + t.aq;
            if (var1.ci > var4) {
               var1.ci = 0;
            }

            int[] var5 = new int[2];
            t.a(var1.cg, var1.ch, var1.cf, var1.ce, (var1.ci << 8) / var4, var5);
            var1.ay.b(8 * var1.ci / var4);
            int var10002 = var5[0];
            int var33 = var5[1];
            var4 = var10002;
            d var19 = var1.ay;
            a(var19, var4, var33, false);
         }
      }
   }

   static void l() {
      if (aX) {
         if (v.au()) {
            aY = false;
         } else {
            if (t.s()) {
               aY = true;
               a(t.q(), t.r());
            }

            if (t.t() && aY) {
               int var10000 = t.q();
               int var1 = t.r();
               int var0 = var10000;
               if (var10000 < bp) {
                  bp = var0;
               }

               if (var0 > bq) {
                  bq = var0;
               }

               if (var0 < br) {
                  br = var1;
               }

               if (var0 > bs) {
                  bs = var1;
               }

               if (bq - bp >= 15) {
                  bo = true;
               }

               if (bs - br >= 15) {
                  bo = true;
               }

               if (bo) {
                  t.H = -1;
               }

               int var2 = t.m;
               int var3 = t.n;
               if (t.o) {
                  var0 <<= 1;
                  var1 <<= 1;
                  var2 <<= 1;
                  var3 <<= 1;
               }

               if (t.S == 50) {
                  var0 >>= 1;
                  var1 >>= 1;
               }

               k(var0, var1);
               var2 = var0 + var2;
               var3 = var1 + var3;
               switch (am) {
                  case 0:
                     int var24 = t.ae() - t.ac();
                     int var27 = t.af() - t.ad();
                     if (!t.o) {
                        t.a(var24, var27);
                     } else {
                        t.a(var24 + (var24 >> 2), var27 + (var27 >> 2));
                     }
                     break;
                  case 1:
                     if (aZ) {
                        if (ab()) {
                           b(ah, var2, var3);
                        }
                     } else {
                        l(var0, var1);
                        int var23 = t.ae() - t.ac();
                        int var26 = t.af() - t.ad();
                        if (!t.o) {
                           t.a(var23, var26);
                        } else {
                           t.a(var23 + (var23 >> 2), var26 + (var26 >> 2));
                        }
                     }
                     break;
                  case 2:
                     if (aZ) {
                        if (ab()) {
                           a(ah, var2, var3);
                        }
                     } else {
                        l(var0, var1);
                        int var4 = t.ae() - t.ac();
                        int var5 = t.af() - t.ad();
                        if (!t.o) {
                           t.a(var4, var5);
                        } else {
                           t.a(var4 + (var4 >> 2), var5 + (var5 >> 2));
                        }
                     }
               }
            }

            if (t.u() && aY) {
               aY = false;
               int var29 = t.q();
               int var10 = t.r();
               int var6 = var29;
               if (bh) {
                  bh = false;
                  return;
               }

               if (bl) {
                  bl = false;
                  return;
               }

               t.H = -1;
               if (!t.w() || am == 2) {
                  int var15 = t.m;
                  int var20 = t.n;
                  if (t.o) {
                     var6 <<= 1;
                     var10 <<= 1;
                     var15 <<= 1;
                     var20 <<= 1;
                  }

                  var6 = var6 * 100 / t.S;
                  var10 = var10 * 100 / t.S;
                  k(var6, var10);
                  int var25 = var6 + var15;
                  int var28 = var10 + var20;
                  switch (am) {
                     case 0:
                        v var8 = m(var6, var10);
                        if (t.K >= 0 && var8 != null) {
                           if (var8.au != t.K || t.af != null && t.af != var8 || bo) {
                              return;
                           }

                           t.K = -1;
                           t.b(23, -1, -1, -1);
                        }

                        o(t.o(), t.p());
                        if (bo) {
                           return;
                        }

                        if (var8 == null && t.K < 0) {
                           t.R = -1;
                           boolean var9 = false;
                           if ((var10 = j(var25, var28)) != -1) {
                              var15 = var10 & 0xFF;
                              var10 = var10 >> 16 & 65535;
                              if (var15 == 1 && var10 != 253 && var10 != 254) {
                                 t.a(60);
                                 var9 = true;
                                 t.a((byte)var10, var25, var28);
                              }
                           }

                           if (!var9) {
                              i();
                           }

                           return;
                        }

                        if (var8 == null && t.K >= 0) {
                           return;
                        }

                        var8.ae();
                        break;
                     case 1:
                        if (!aZ) {
                           o(t.o(), t.p());
                        }

                        if (bo) {
                           return;
                        }

                        var15 = d(var6, var10);
                        var20 = e(var6, var10);
                        if (ah != null && var15 == bt && var20 == bu) {
                           b(ah, var25, var28);
                        }
                        break;
                     case 2:
                        var15 = d(var6, var10);
                        var20 = e(var6, var10);
                        if (ah != null && var15 == bt && var20 == bu) {
                           a(ah, var25, var28);
                        }

                        if (!aZ) {
                           o(t.o(), t.p());
                           if (bo) {
                              return;
                           }
                        }
                  }

                  aZ = false;
               }
            }
         }
      }
   }

   static boolean m() {
      return v.au();
   }

   static void n() {
      v.av();
   }

   public static void o() {
      t.a(28);
      if (ah != null) {
         if (ah.au == 8) {
            ah.e(ah.X());
            v.a(1, ah.F(), ah, ah.aR * 48, -48);
            t.b(33, ah.au, ah.ar, -1);
            ah.d((byte)4);
         } else {
            ah.d((byte)2);
         }

         switch (ah.au) {
            case 2:
               t.b(3, ah.ar, 16);
               new StringBuffer().append("").append(t.b(3, ah.ar, 17)).toString();
               break;
            case 8:
               t.b(5, ah.ar, 8);
               new StringBuffer().append("").append(t.b(5, ah.ar, 9)).toString();
               break;
            default:
               t.b(4, ah.ar, 16);
               new StringBuffer().append("").append(t.b(4, ah.ar, 17)).toString();
         }

         if (ah.au == 1) {
            ;
         }

         t.b(10, ah.au, ah.ar, -1);
         ai = ah;
         ah = null;
         a((byte)0);
         ae();
      }
   }

   public static void p() {
      if (ah != null) {
         byte var0;
         switch (ah.au) {
            case 2:
               var0 = 1;
               break;
            case 8:
               var0 = 2;
               break;
            default:
               var0 = 3;
         }

         v var1 = ah;
         if (t.a(t.d(b(ah.au), var1.ar), ah.C())) {
            t.k(var0, ah.ar);
            t.l(48, 0);
            v var2 = ah;
            if (ah != null) {
               if (var2.au == 1 || var2.au == 2 || var2.au == 3 || var2.au == 4 || var2.au == 6 || var2.au == 5 || var2.au == 7) {
                  t.l(19, 0);
               } else if (var2.au == 8) {
                  t.l(25, 0);
                  t.l(26, 0);
               }
            }

            o();
         }
      }
   }

   public static void q() {
      if (ah != null) {
         ah.ag();
         byte var0;
         if (ah.au == 10) {
            var0 = 4;
         } else {
            var0 = 3;
         }

         t.ab.a(ah.bh.e[0], var0);
         a(ah, t.z);
         ah = null;
         a((byte)0);
         ae();
      }
   }

   public static void r() {
      if (ah != null) {
         ah.d(ah.aQ);
         c(ah.av, ah.aw, ah.ah(), ah.as, ah.aR);
         ah.e(ah.X());

         for (int var0 = 0; var0 < ah.aX; var0++) {
            if (ah.aV[var0] != null) {
               ah.aV[var0].ae();
            }
         }

         ah = null;
         i();
         a((byte)0);
         ae();
         t.l |= 1;
      }
   }

   public static void s() {
      if (ah == null) {
         a((byte)0);
      } else {
         ah.av = bz;
         ah.aw = bA;
         ah.d(ah.aQ);
         c(ah.av, ah.aw, ah.ah(), ah.as, ah.aR);
         ah.e(ah.X());

         for (int var0 = 0; var0 < ah.aX; var0++) {
            if (ah.aV[var0] != null) {
               ah.aV[var0].ae();
            }
         }

         ah = null;
         i();
         a((byte)0);
         ae();
      }
   }

   private static void k(int var0, int var1) {
      bv = bx;
      bw = by;
      bx = f(var0 + t.m, var1 + t.m);
      by = g(var0 + t.m, var1 + t.m);
   }

   private static boolean ab() {
      return bv != bx ? true : bw != by;
   }

   private static void l(int var0, int var1) {
      if (bB + 50L < t.f) {
         bB = t.f;
         bC[0] = var0;
         bD[0] = var1;
      }
   }

   private static boolean a(q var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.ay.d.c(var0.ay.e, 0);
      int var6 = var0.ay.d.d(var0.ay.e, 0);
      var3 = var0.ay.d.b(0) * var3;
      var4 = var0.ay.d.c(0) * var4;
      if (t.o) {
         var5 >>= 1;
         var6 >>= 1;
         var3 >>= 1;
         var4 >>= 1;
      }

      int[] var7;
      (var7 = new int[4])[0] = var0.ay.a + var5 - (var3 >> 1);
      var7[1] = var0.ay.b + var6 - (var4 >> 1);
      var7[2] = var3;
      var7[3] = var4;
      return t.b(var1, var2, var7);
   }

   private static v m(int var0, int var1) {
      if (bh) {
         bh = false;
         return null;
      }

      if (bl) {
         bl = false;
         return null;
      }

      v var2 = null;

      for (int var3 = t.U - 1; var3 >= 0; var3--) {
         if (t.W[var3] != null
            && (var2 = t.W[var3]).au != 0
            && var2.au != 11
            && var2.au != 15
            && var2.au != 13
            && var2.au != 17
            && (var2.l(var0, var1) || var2.m(var0, var1) || var2.k(var0, var1))) {
            return var2;
         }
      }

      for (int var6 = 0; var6 < t.V; var6++) {
         if (t.X[var6] != null && ((var2 = t.X[var6]).m(var0, var1) || var2.k(var0, var1))) {
            return var2;
         }
      }

      return null;
   }

   private static int d(int var0, int var1, int var2) {
      if ((var1 = i(var1, var2)) < 0) {
         return -1;
      }

      switch (var0) {
         case 0:
            return j(p(var1, 16));
         case 1:
            return j(p(var1, 2));
         case 2:
            return j(p(var1, 3));
         case 3:
            return j(p(var1, 0));
         case 4:
            return j(p(var1, 1));
         default:
            return -1;
      }
   }

   static void d(int var0) {
      n(1, var0);
      n(2, var0);
   }

   private static void n(int var0, int var1) {
      for (int var2 = 0; var2 < af[var1][var0].length; var2++) {
         v var3;
         if ((var3 = (v)af[var1][var0][var2]) != null) {
            int var4;
            if ((var4 = i(var3.av, var3.aw)) < 0) {
               var3.bb = true;
               var3.bc = true;
            } else {
               var3.bc = false;
               int var6;
               int var5 = (var6 = i(var4)) & 0xFF;
               var4 = var6 >> 16 & 65535;
               if (var5 == 1) {
                  if (var4 == 253) {
                     var3.bc = true;
                  }

                  var3.bb = true;
                  if (var0 == 2) {
                  }
               } else {
                  var3.bb = false;
                  if (var3.aP == 2) {
                     c(var3.av, var3.aw, 2, var3.as, var3.aR);
                  } else if (var3.aP == 4) {
                     c(var3.av, var3.aw, var3.ah(), var3.as, var3.aR);
                  }
               }
            }
         }
      }
   }

   static void a(int var0, int var1) {
      int var2 = t.m;
      int var3 = t.n;
      int var4 = var0;
      int var5 = var1;
      bo = false;
      bp = var0;
      bq = var0;
      br = var1;
      bs = var1;
      if (t.o) {
         var0 <<= 1;
         var1 <<= 1;
         var2 <<= 1;
         var3 <<= 1;
      }

      var0 = var0 * 100 / t.S;
      var1 = var1 * 100 / t.S;
      k(var0, var1);
      bB = 0L;

      for (int var8 = 0; var8 <= 0; var8++) {
         bC[0] = -1;
         bD[0] = -1;
      }

      l(var0, var1);
      bt = d(var0, var1);
      bu = e(var0, var1);
      var2 = var0 + var2;
      var3 = var1 + var3;
      switch (am) {
         case 0:
            q var6 = null;

            for (int var7 = t.U - 1; var7 >= 0; var7--) {
               var6 = t.W[var7];
               if (t.W[var7] != null) {
                  if (((q)var6).au == 11) {
                     q var10000 = var6 = t.W[var7];
                     int var10 = var1;
                     int var9 = var0;
                     q var27 = var10000;
                     int var11 = var10000.ay.d.c(var27.ay.e, var27.ay.d());
                     int var12 = var27.ay.d.d(var27.ay.e, var27.ay.d());
                     int var13 = var27.ay.d.b(var27.ay.d());
                     int var14 = var27.ay.d.c(var27.ay.d());
                     if (t.o) {
                        var11 >>= 1;
                        var12 >>= 1;
                        var13 >>= 1;
                        var14 >>= 1;
                     }

                     int[] var15;
                     (var15 = new int[4])[0] = var27.ay.a + var11 - (var13 >> 1);
                     var15[1] = var27.ay.b + var12 - (var14 >> 1);
                     var15[2] = var13;
                     var15[3] = var14;
                     if (t.b(var9, var10, var15)) {
                        var27 = var6;
                        v.a(var6);
                        var27.bi++;
                        t.aj++;
                        t.l(29, 0);
                        t.l(30, 0);
                        if (var27.bi >= 4) {
                           a(var27);
                        }

                        bh = true;
                        return;
                     }
                  } else if (((q)var6).au == 15 && !t.z() && a(var6 = t.W[var7], var4, var5, 2, 3)) {
                     i();
                     if (a(var6, var4, var5, 1, 1) && !bl) {
                        bl = true;
                        q var29 = var6;
                        int var31 = t.o(0)[t.ab.e[7] - 1][3];
                        v.a(0, var31, var29, 0, 0);
                        var29.bi++;
                        t.ak = 0;
                        t.aj++;
                        t.b(38, var29.bi, -1, -1);
                        t.l(29, 0);
                        t.l(30, 0);
                        if (var29.bi >= 4) {
                           c(var29);
                        }

                        return;
                     }
                  }
               }
            }

            int var26;
            if ((var26 = j(var2, var3)) != -1 && !bl) {
               var2 = var26 & 0xFF;
               var3 = var26 >> 16 & 65535;
               if (var2 == 1) {
                  t.H = (byte)var3;
               }
            }
            break;
         case 1:
            bt = d(var0, var1);
            bu = e(var0, var1);
            if (ah == null) {
               v var19;
               if (an != null) {
                  var19 = an;
               } else {
                  var19 = m(var0, var1);
               }

               if (var19 != null) {
                  ah = var19;
                  e(var19.av, ah.aw, ah.aR);
                  ah.d((byte)5);
                  bz = ah.av;
                  bA = ah.aw;
                  aj = false;
                  b(ah.av, ah.aw, ah.aR);
                  e(ah.av, ah.aw, ah.aR);
                  d(ah);
               }
            }
            break;
         case 2:
            bt = d(var0, var1);
            bu = e(var0, var1);
      }

      v var33 = ah;
      int var32 = var1;
      int var30 = var0;
      if (var33 != null && (var33.l(var30, var32) || var33.m(var30, var32) || var33.k(var30, var32))) {
         aZ = true;
      } else {
         aZ = false;
      }
   }

   static void t() {
      switch (am) {
         case 1:
            if (ah != null) {
               e(ah);
            }

            if (ah != null && aZ) {
               ac();
            }
            break;
         case 2:
            if (ah != null) {
               e(ah);
            }

            if (ah != null && aZ) {
               ac();
            }
      }

      if (bE != 0) {
         if (bE > 0) {
            if ((bE = bE - bG * t.aq / 100) <= 0) {
               bE = 0;
            }
         } else if ((bE = bE + bG * t.aq / 100) >= 0) {
            bE = 0;
         }
      }

      if (bF != 0) {
         if (bF > 0) {
            if ((bF = bF - bH * t.aq / 100) <= 0) {
               bF = 0;
            }
         } else if ((bF = bF + bH * t.aq / 100) >= 0) {
            bF = 0;
         }
      }

      if ((bI = bI + t.aq) > bJ) {
         if (bE != 0) {
            bG <<= 1;
         }

         if (bF != 0) {
            bH <<= 1;
         }

         bI = 0;
      }

      t.a(bE, bF);
   }

   private static void o(int var0, int var1) {
      bI = 0;
      bE = 0;
      bF = 0;
      bG = 0;
      bH = 0;
      int var3 = bK;
      int var4 = bL;
      int var2;
      if ((var2 = t.A(var0 * var0 + var1 * var1)) != 0 && var2 > var4) {
         bG = var3 * var0 / var2;
         bH = var3 * var1 / var2;
         bE = -(var4 * var0) / var2;
         bF = -(var4 * var1) / var2;
      }

      if (bG < 0) {
         bG = -bG;
      }

      if (bH < 0) {
         bH = -bH;
      }

      if (bG == 0) {
         bG = 100;
      }

      if (bH == 0) {
         bH = 100;
      }

      bI = 0;
   }

   private static void ac() {
      int var0 = 80000 / t.S;
      int var1 = 48000 / t.S;
      if (t.o) {
         var0 <<= 1;
         var1 <<= 1;
      }

      int var2 = ah.aR;
      int var3 = ah.aR * 48;
      var2 *= 24;
      int var4 = var3 << 1;
      var4 = ah.av + (var4 >> 1);
      int var5 = ah.aw;
      int var6 = t.m;
      int var7 = t.n;
      if (t.o) {
         var6 <<= 1;
         var7 <<= 1;
      }

      var4 -= var6;
      var5 -= var7;
      if (var4 < var3) {
         bM = 1;
      } else if (var4 > var0 - var3) {
         bM = 2;
      } else {
         bM = 0;
      }

      if (var5 < var2) {
         bN = 4;
      } else if (var5 > var1 - var2) {
         bN = 8;
      } else {
         bN = 0;
      }

      switch (bM) {
         case 1:
            o(20, 0);
            break;
         case 2:
            o(-20, 0);
      }

      switch (bN) {
         case 4:
            o(0, 20);
            return;
         case 8:
            o(0, -20);
      }
   }

   public static void b(v var0) {
      if (var0 != null) {
         bS = t.m;
         bT = t.n;
         int var1 = 80000 / t.S;
         int var2 = 48000 / t.S;
         if (!t.o) {
            bU = var0.av - (var1 >> 1) + var0.aR * 48;
            bV = var0.aw - (var2 >> 1);
         } else {
            bU = (var0.av >> 1) - (var1 >> 1) + (var0.aR * 48 >> 1);
            bV = (var0.aw >> 1) - (var2 >> 1);
         }

         byte var3 = 80;
         if (t.o) {
            var3 = 40;
         }

         if (Math.abs(bS - bU) > var3 || Math.abs(bT - bV) > var3) {
            f((byte)0);
         }
      }
   }

   public static void u() {
      switch (bP) {
         case 0:
            return;
         case 1:
            if (bQ < bO) {
               bR = bR + bQ;
               bQ = bQ + (t.aq > 100 ? 100 : t.aq);
               if (bS < bU && t.at < bU && bQ >= bO) {
                  bQ = bR;
                  return;
               } else if (bU > bU && t.at > bU && bQ >= bO) {
                  bQ = bR;
                  return;
               } else {
                  t.a(bS, bT, bU, bV, bU, bV, (bQ << 8) / bO);
                  if (bS < bU && t.at >= bU) {
                     bQ = bO;
                     return;
                  } else {
                     if (bS > bU && t.at <= bU) {
                        bQ = bO;
                        return;
                     }

                     t.f(t.at, t.au);
                     return;
                  }
               }
            } else {
               f((byte)3);
            }
         case 2:
         case 3:
      }
   }

   private static void f(byte var0) {
      while (true) {
         bP = var0;
         switch (var0) {
            case 0:
               bQ = 0;
               bO = t.a(bS, bT, bU, bV) * 1000 / t.R();
               var0 = 1;
               break;
            case 1:
               return;
            case 3:
               bS = -1;
               bT = -1;
               bU = -1;
               bV = -1;
            case 2:
            default:
               return;
         }
      }
   }

   public static void c(v var0) {
      if (var0 != null) {
         int var1 = 80000 / t.S;
         int var2 = 48000 / t.S;
         int var3;
         if (t.o) {
            var1 = (var0.av >> 1) - (var1 >> 1) + var0.aR * 24;
            var3 = (var0.aw >> 1) - (var2 >> 1);
         } else {
            var1 = var0.av - (var1 >> 1) + var0.aR * 48;
            var3 = var0.aw - (var2 >> 1);
         }

         t.f(var1, var3);
      }
   }

   private static void k(int var0) {
      int var3 = var0;
      int var2 = ba;
      var0 = bc;
      int var1 = bb;
      if (var3 != 0) {
         ;
      }

      var2 = var2 + 21 - 1;
      if (t.o) {
         var1 = (var1 >> 1) - t.m;
         var0 = (var0 >> 1) - t.n;
         if (ak != null) {
            ak.g = 50;
         }
      } else {
         var1 -= t.m;
         var0 -= t.n;
         if (ak != null) {
            ak.g = 100;
         }
      }

      if (ak == null) {
         (ak = new d()).a(t.j[3][43]);
         ak.a(var2, -1);
      }

      if (ak.e != var2) {
         ak.a(var2, -1);
      }

      ak.c(t.aq);
      var2 = var0;
      var0 = var1;
      d var8 = ak;
      ak.a = var0;
      var8.b = var2;
      ak.g();
   }

   static void e(int var0) {
      if (af[var0][0] == null) {
         af[var0][0] = new q[h.a[0]];
      } else {
         a(af[var0][0]);
      }

      if (af[var0][1] == null) {
         af[var0][1] = new q[h.a[1]];
      } else {
         a(af[var0][1]);
      }

      if (af[var0][2] == null) {
         af[var0][2] = new q[h.a[2]];
      } else {
         a(af[var0][2]);
      }

      if (af[var0][3] == null) {
         af[var0][3] = new q[h.a[3]];
      } else {
         a(af[var0][3]);
      }

      if (af[var0][7] == null) {
         af[var0][7] = new q[h.a[7]];
      } else {
         a(af[var0][7]);
      }

      if (af[var0][4] == null) {
         af[var0][4] = new q[h.a[4]];
      } else {
         a(af[var0][4]);
      }

      if (af[var0][5] == null) {
         af[var0][5] = new q[h.a[5]];
      } else {
         a(af[var0][5]);
      }

      if (af[var0][6] == null) {
         af[var0][6] = new q[h.a[6]];
      } else {
         a(af[var0][6]);
      }

      if (ad == null) {
         ad = new q[h.a[0] + h.a[1] + h.a[2] + h.a[3] + h.a[4] + h.a[5] + h.a[6] + h.a[7]];
      }

      if (ac == null) {
         ac = new q[h.a[0] + h.a[1] + h.a[2] + h.a[3] + h.a[4] + h.a[5] + h.a[6] + h.a[7]];
      } else {
         v();
      }
   }

   static void v() {
      for (int var0 = 0; var0 < ac.length; var0++) {
         ac[var0] = null;
      }
   }

   static void a(q[] var0) {
      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = null;
      }
   }

   static void w() {
      for (int var0 = 0; var0 < ad.length; var0++) {
         if (ad[var0] != null) {
            b(ad[var0], t.z);
         }
      }
   }

   static void x() {
      int var0;
      if ((var0 = ae + 5) > ac.length) {
         var0 = ac.length;
      }

      for (int var1 = 0; var1 < var0; var1++) {
         ad[var1] = ac[var1];
      }
   }

   static int b(byte var0) {
      byte var1 = -1;
      switch (var0) {
         case 0:
            var1 = 2;
            break;
         case 1:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 14:
         case 16:
            var1 = 4;
            break;
         case 2:
            var1 = 3;
            break;
         case 8:
            var1 = 5;
         case 9:
         case 11:
         case 12:
         case 13:
         case 15:
         default:
            break;
         case 10:
            var1 = 1;
      }

      return var1;
   }

   static int[] a(byte var0, byte var1) {
      return ((int[][])t.T[b(var0)])[var1];
   }

   static int b(byte var0, byte var1) {
      return ((int[][])t.T[b((byte)0)])[var0][var1];
   }

   static void y() {
      String var0 = t.u(279);
      t.ad[0] = t.a(50L, t.e, " ");
      var0 = t.a(var0, t.ad, '#');
      t.a(2, var0, 38);
   }

   final void c(byte var1) {
      this.aA = t.g;
      this.aB = 0L;
      this.aC = this.ad();
      this.aD = var1;
      this.aE = 99;
   }

   final void z() {
      this.aA = t.g - this.aC;
   }

   final boolean A() {
      this.aB = t.g - this.aA;
      if (this.aB > this.aC && t.J) {
         if (this.aD != -1) {
            this.d(this.aD);
         }

         if (this.aE != 99) {
            this.e(this.aE);
            if (an != null && an.equals(this)) {
               a((v)this, false);
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private int ad() {
      this.al = 0L;
      label42:
      switch (this.aP) {
         case 2:
            switch (this.au) {
               case 1:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
                  this.al = a(this.au, this.ar)[24];
                  break label42;
               case 2:
                  if (t.F()) {
                     this.al = a(this.au, this.ar)[24];
                  } else {
                     this.al = a(this.au, this.ar)[24];
                  }
               default:
                  break label42;
            }
         case 7:
            switch (this.au) {
               case 1:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
                  this.al = a(this.au, this.ar)[30 + (((v)this).aT - 1)];
                  break label42;
               case 2:
                  this.al = a(this.au, this.ar)[29 + (((v)this).aT - 1)];
               default:
                  break label42;
            }
         case 10:
            this.al = ((int[][])t.T[13])[((v)this).aZ][3];
            break;
         case 14:
            switch (this.au) {
               case 0:
                  this.al = a(this.au, this.ar)[16];
               default:
                  break label42;
            }
         case 19:
            if (this.au == 10) {
               this.al = a((byte)10, this.ar)[4];
            }
            break;
         case 23:
            this.al = a((byte)0, (byte)((v)this).ba)[16];
      }

      if (t.P) {
         this.al = 1L;
      }

      this.al *= 1000L;
      long var1;
      if ((var1 = this.al / 3600000L) > 0L) {
         this.al = var1 * 3600000L;
         return (int)this.al;
      } else if ((var1 = this.al / 60000L) > 0L) {
         this.al = var1 * 60000L;
         return (int)this.al;
      } else {
         return (int)this.al;
      }
   }

   final boolean B() {
      return t.b(b(this.au), this.ar);
   }

   final int C() {
      return t.c(b(this.au), this.ar);
   }

   int D() {
      return t.a(b(this.au), this.ar, 1);
   }

   static int E() {
      long var0;
      if (t.F()) {
         if (an.au == 1 && t.R != -1) {
            var0 = an.aV[t.R].al - (t.g - an.aV[t.R].aA);
         } else {
            var0 = an.al - (t.g - an.aA);
         }
      } else {
         var0 = an.al;
      }

      int var5;
      if ((var5 = (int)(var0 / 1000L) / 60) <= 0) {
         var5 = 1;
      }

      int var1 = -1;
      int var2;
      if (var5 >= t.b(32, 53, 4)) {
         var1 = 52;
         var2 = 53;
      } else {
         for (var2 = 1; var2 <= 53; var2++) {
            if (var5 <= t.b(32, var2, 4)) {
               var1 = var2 - 1;
               break;
            }
         }
      }

      int var3 = t.b(32, var1, 4);
      int var4 = t.b(32, var2, 4);
      var1 = t.b(32, var1, 5);
      var2 = t.b(32, var2, 5);
      return t.a(var5, var3, var4, var1, var2);
   }

   final int F() {
      byte var1 = -1;
      int[] var2 = a(this.au, this.ar);
      switch (this.au) {
         case 0:
            var1 = 17;
            break;
         case 1:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
            var1 = 25;
            break;
         case 2:
            var1 = 25;
            break;
         case 8:
            var1 = 14;
         case 9:
         default:
            break;
         case 10:
            var1 = 5;
      }

      return var2[var1];
   }

   final void a(int var1, int var2, int var3) {
      this.aF = true;
      int var4 = t.m;
      int var5 = t.n;
      var3 *= 48;
      int var6 = -96;
      if (this.au == 0) {
         var6 += 24;
      }

      if (t.o) {
         var1 >>= 1;
         var2 >>= 1;
         var3 >>= 1;
         var6 >>= 1;
      }

      if (this.aB != 0L) {
         long var8 = this.al - (t.g - this.aA);
         long var10 = (this.aC - var8) * 100L;
         long var12 = this.aC;
         int var7 = (int)(var10 / var12);
         if (var8 > this.al) {
            var7 = 0;
         }

         var1 += var3 - var4;
         var2 += var6 - var5;
         a var17;
         var4 = (var17 = t.j[1][18]).b(6);
         var5 = var17.d(6);
         var5 = (var1 + var5) * t.S / 100;
         var4 = var7 * var4 / 100 * t.S / 100;
         var17.a(t.am, 5, var1, var2, 0);
         int var23 = var4;
         var4 = var5;
         var6 = var23;
         t.b(t.am, var4, 0, var6, 960);
         var17.a(t.am, 6, var1, var2, 0);
         t.b(t.am, 0, 0, 1600, 960);
      }
   }

   public void d(byte var1) {
   }

   final void b(int var1, int var2) {
      this.av = var1;
      this.aw = var2;
   }

   void G() {
      if (this.az == null && this.ao != -1) {
         this.az = t.j[3][this.ao];
      }

      if (this.ay == null && this.aq != -1) {
         this.ay = new d();
         this.az = t.j[3][this.ao];
         this.ay.a(this.az);
         this.ay.a(this.aq, -1);
      }
   }

   private static void b(q var0, int var1) {
      int var2 = var0.bW;
      int var3 = -1;
      if (af[var1][var2] != null) {
         for (int var4 = 0; var4 < af[var1][var2].length; var4++) {
            if (af[var1][var2][var4] == null) {
               var3 = var4;
               break;
            }
         }
      }

      af[var1][var2][var3] = var0;
      aW[var1][var2]++;
      if (var2 == 1 && var3 != -1) {
         ((v)var0).as = var3;
      } else {
         var0.as = var3;
      }

      if (ac != null && var1 == t.z) {
         for (int var5 = 0; var5 < ac.length; var5++) {
            if (ac[var5] == null) {
               var3 = var5;
               break;
            }
         }

         var0.bX = var3;
         ac[var3] = var0;
         ae++;
      }
   }

   public static final void a(q var0, int var1) {
      if (var1 == t.z) {
         ac[var0.bX] = null;
         ae--;
      }

      af[var1][var0.bW][var0.as] = null;
      aW[var1][var0.bW]--;
   }

   public static final void c(int var0, int var1) {
      for (int var2 = 0; var2 < af[var0][var1].length; var2++) {
         if (af[var0][var1][var2] != null) {
            if (var0 == t.z) {
               q var3 = af[var0][var1][var2];
               ac[var3.bX] = null;
               ae--;
            }

            af[var0][var1][var2] = null;
            aW[var0][var1]--;
         }
      }
   }

   public static void a(int var0, int var1, int var2, int var3, int var4) {
      q();
      ah = a(var0, (byte)var1, (byte)var2, var3, var4);
      int var5 = 0;
      int var7 = 0;
      var2 = ah.aR;
      if (var3 == -1 && var4 == -1) {
         if (t.o) {
            var5 = 800 + (t.m << 1);
            var7 = 480 + (t.n << 1);
         } else {
            var5 = 400 + t.m;
            var7 = 240 + t.n;
         }

         f(var5, var7, var2);
         ah.av = cm;
         ah.aw = cn;
      }

      f(ah);
      e(ah.av, ah.aw, var2);
      ah.d((byte)1);
      a((byte)2);
      if (ah != null) {
         d(ah);
      }
   }

   private static void d(v var0) {
      int var1 = var0.av;
      int var2 = var0.aw;
      int var3 = var0.aR * 96;
      int var4 = var0.aR * 48;
      if (t.o) {
         var1 >>= 1;
         var2 >>= 1;
         var3 >>= 1;
         var4 >>= 1;
      }

      int var10000 = var1 - t.m + (var3 >> 1);
      var1 = var2 - t.n + (var4 >> 1);
      int var5 = var10000;
      t.x();
      aL = true;
      int var6 = var5 * t.S / 100;
      var1 = var1 * t.S / 100;
      aM = var6;
      aN = var1;
   }

   private static void e(v var0) {
      int var1 = var0.av;
      int var2 = var0.aw;
      int var3 = var0.aR * 96;
      int var4 = var0.aR * 48;
      if (t.o) {
         var1 >>= 1;
         var2 >>= 1;
         var3 >>= 1;
         var4 >>= 1;
      }

      int var10000 = var1 - t.m + (var3 >> 1);
      var1 = var2 - t.n + (var4 >> 1);
      int var5 = var10000 * t.S / 100;
      var1 = var1 * t.S / 100;
      aM = var5;
      aN = var1;
   }

   private static void ae() {
      t.y();
      aL = false;
      aM = 0;
      aN = 0;
      t.G();
   }

   private static void e(int var0, int var1, int var2) {
      bb = var0;
      bc = var1;
      ba = var2;
   }

   public static final v a(int var0, byte var1, byte var2, int var3, int var4) {
      v var5;
      (var5 = a(a(var1, var2), var0, var1, var2, var3, var4, true, (byte)1)).G();
      return var5;
   }

   public static final v a(int var0, byte var1, byte var2, int var3, int var4, byte var5) {
      v var6;
      (var6 = a(a(var1, var2), var0, var1, var2, var3, var4, true, var5)).G();
      return var6;
   }

   private static v a(int[] var0, int var1, byte var2, byte var3, int var4, int var5, boolean var6, byte var7) {
      v var8;
      (var8 = new v()).a(var0, var1, var2, var3, (byte)var7);
      var8.bW = 1;
      int var9 = d(var4 + 48, var5);
      var7 = e(var4 + 48, var5);
      var8.b(var9, var7);
      if (var6) {
         var8.bh = t.a(
            var1, var2, var3, var8.aP, (int)var8.aB / 1000, (int)var8.aA / 1000, (int)var8.aC / 1000, var8.aD, var8.aE, var8.aF ? 1 : 0, var8.aT, var4, var5
         );
      }

      b(var8, var1);
      return var8;
   }

   public static final v a(int var0, w var1) {
      v var3;
      (var3 = a(a((byte)var1.e[1], (byte)var1.e[2]), 0, (byte)var1.e[1], (byte)var1.e[2], var1.e[11], var1.e[12], false, (byte)var1.e[10])).bh = var1;
      var3.d((byte)var1.e[3]);
      var3.aB = var1.e[4] * 1000;
      var3.aA = t.g - (t.k - t.h) + var1.e[5] * 1000;
      var3.aC = var1.e[6] * 1000;
      var3.aD = (byte)var1.e[7];
      var3.aE = (byte)var1.e[8];
      var3.aF = var1.e[9] == 1;
      var3.al = var3.aC;
      var3.aY = var1.e[17];
      var3.bj = var1.e[18];
      if (var3.au == 4) {
         var3.aZ = var1.e[19];
      } else if (var3.au == 3) {
         var3.ba = var1.e[19];
      }

      var3.aW = var1.e[16];
      var3.G();
      if (var1.e[13] != -1) {
         w var2 = t.ab.a(var1.a, var1.e[13], 2);
         r var4 = a(0, var3, var2);
         var3.aV[0] = var4;
         var3.aV[0].aS = 0;
         var3.aV[0].ae();
      }

      if (var1.e[14] != -1) {
         w var5 = t.ab.a(var1.a, var1.e[14], 2);
         r var6 = a(0, var3, var5);
         var3.aV[1] = var6;
         var3.aV[1].aS = 1;
         var3.aV[1].ae();
      }

      if (var1.e[15] != -1) {
         w var7 = t.ab.a(var1.a, var1.e[15], 2);
         r var8 = a(0, var3, var7);
         var3.aV[2] = var8;
         var3.aV[2].aS = 2;
         var3.aV[2].ae();
      }

      return var3;
   }

   public static final r a(int var0, int var1, v var2, byte var3, byte var4, boolean var5) {
      if (var2 == null && (var2 = f(1)) == null) {
         return null;
      }

      if (!var2.ak()) {
         return null;
      }

      r var6;
      (var6 = new r()).a(a((byte)0, (byte)var1), var0, (byte)var1, var3, var4, var5);
      var6.bW = 0;
      var2.a(var6);
      var6.e(var2);
      var6.aX = var0;
      if (var0 == 0) {
         var6.bg = t.a(
            var0,
            var1,
            var3,
            (int)var6.aB / 1000,
            (int)var6.aA / 1000,
            (int)var6.aC / 1000,
            var6.aD,
            var6.aE,
            var6.aF ? 1 : 0,
            var6.aZ,
            var6.ba,
            var6.aT,
            var2.bh.e[0],
            var6.bm[41]
         );
         var6.ad();
         String var7;
         if ((var7 = t.K()) != null) {
            t.a(var6.bg.e[0], var7);
         }
      }

      b(var6, var0);
      return var6;
   }

   public static final r a(int var0, byte var1) {
      r var2;
      (var2 = new r()).a(a((byte)0, (byte)var0), 0, (byte)var0, (byte)4, var1, false);
      var2.bW = 0;
      return var2;
   }

   private static r a(int var0, v var1, w var2) {
      r var3;
      (var3 = new r()).bg = var2;
      var3.a(a((byte)0, (byte)var2.e[1]), var0, var2);
      var3.bW = 0;
      var3.e(var1);
      b(var3, var0);
      return var3;
   }

   public static q b(int var0, int var1, int var2, int var3, int var4) {
      q var5;
      (var5 = new q()).ao = 7;
      var5.au = 17;
      var5.aq = var2;
      var5.cg = var0;
      var5.ch = var1;
      var5.cf = var0 + var3;
      var5.ce = var1 + var4;
      var2 = var5.cg - var5.cf;
      var3 = var5.ch - var5.ce;
      var2 = (var2 * var2 + var3 * var3) / 6;
      var5.ci = t.n(0, var2);
      var5.b(var0, var1);
      var5.G();
      d var8 = var5.ay;
      var5.ay.a = var0;
      var8.b = var1;
      var5.bW = 7;
      var5.e((byte)9);
      b(var5, t.z);
      return var5;
   }

   public static q H() {
      int var0 = -1;
      int var1 = -1;
      q var2;
      (var2 = new q()).aq = 0;
      int var3;
      if ((var3 = t.n(0, 2)) == 0) {
         var2.aq = 0;
         var0 = 0;
         var1 = t.q / 2;
      } else if (var3 == 1) {
         var2.aq = 1;
         var0 = t.p;
         var1 = t.q / 2;
      }

      var0 -= var0 % 48;
      var1 -= var1 % 24;
      var2.au = 15;
      var2.ao = 11;
      var2.b(var0, var1);
      var2.G();
      var2.bW = 6;
      var2.cj = 3;
      var2.e((byte)8);
      var2.at = t.z;
      b(var2, t.z);
      a(var2.av + 48, var2.aw - 24, 40, true);
      return var2;
   }

   public static q a(int var0, int var1, byte var2, int var3) {
      v var4;
      (var4 = new v()).a(a((byte)10, var2), var3, 1, var2, var0, var1);
      v var5 = var4;
      var4.ao = t.b(1, var2, 1);
      var5.ap = t.b(1, var2, 2);
      var5.G();
      var5.bW = 2;
      b(var5, var3);
      return var5;
   }

   public static q b(int var0, w var1) {
      byte var3 = (byte)var1.e[1];
      v var2;
      (var2 = new v()).a(a((byte)10, var3), 0, var1);
      v var4 = var2;
      var2.ao = t.b(1, var3, 1);
      var4.ap = t.b(1, var3, 2);
      var4.G();
      var4.bW = 2;
      b(var4, 0);
      return var4;
   }

   public static q I() {
      int var0 = -1;
      int var1 = -1;
      v var2 = null;

      for (int var3 = 0; var3 < af[t.z][1].length; var3++) {
         if (af[t.z][1][var3] != null && (var2 = af[t.z][1][var3]).au == 16) {
            int[] var4 = var2.az.g(var2.ap);
            var0 = var2.av + var4[var4.length - 2];
            var1 = var2.aw + var4[var4.length - 1];
            var0 -= var0 % 48;
            var1 -= var1 % 24;
         }
      }

      q var10;
      (var10 = new q()).au = 13;
      int var11;
      if ((var11 = t.n(0, 4)) == 0) {
         var10.ao = 36;
      } else if (var11 == 1) {
         var10.ao = 32;
      } else if (var11 == 2) {
         var10.ao = 31;
      } else if (var11 == 3) {
         var10.ao = 30;
      }

      var10.aq = 0;
      var10.b(var0, var1);
      var10.G();
      var10.bW = 5;
      var10.l(3);
      var10.e((byte)7);
      b(var10, t.z);
      var0 = var10.av + 48;
      var1 = var10.aw - 24;
      a(var0, var1, 0, true);
      return var10;
   }

   public static v J() {
      return f(1);
   }

   public static v f(int var0) {
      for (int var1 = 0; var1 < af[t.z][1].length; var1++) {
         if (af[t.z][1][var1] != null && af[t.z][1][var1].au == var0 && ((v)af[t.z][1][var1]).at == t.z) {
            return (v)af[t.z][1][var1];
         }
      }

      return null;
   }

   public static boolean a(r var0, boolean var1) {
      return a(var0, var1, true);
   }

   public static boolean a(r var0, boolean var1, boolean var2) {
      boolean var3 = false;

      for (int var4 = 0; var4 < af[t.z][1].length; var4++) {
         if (af[t.z][1][var4] != null
            && af[t.z][1][var4].au == 2
            && var0.d((v)af[t.z][1][var4])
            && (af[t.z][1][var4].aP == 4 || af[t.z][1][var4].aP == 7)
            && (((v)af[t.z][1][var4]).ak() || !var1)) {
            if (var2) {
               ((v)af[t.z][1][var4]).a(var1, 0);
            } else {
               ((v)af[t.z][1][var4]).a(var1, 1);
            }

            if (var1) {
               var3 = true;
               b((v)af[t.z][1][var4]);
            }
         }
      }

      return var3;
   }

   public static void K() {
      for (int var0 = 0; var0 < af[t.z][1].length; var0++) {
         if ((v)af[t.z][1][var0] != null) {
            ((v)af[t.z][1][var0]).a(false, 0);
         }
      }
   }

   public static boolean L() {
      for (int var0 = 0; var0 < af[t.z][1].length; var0++) {
         if (af[t.z][1][var0] != null && af[t.z][1][var0].au == 3 && af[t.z][1][var0].aP == 4) {
            return true;
         }
      }

      return false;
   }

   public static boolean a(boolean var0) {
      boolean var1 = false;

      for (int var2 = 0; var2 < af[t.z][1].length; var2++) {
         if (af[t.z][1][var2] != null && af[t.z][1][var2].au == 3 && af[t.z][1][var2].aP == 4 && (((v)af[t.z][1][var2]).ak() || !var0)) {
            ((v)af[t.z][1][var2]).a(var0, 2);
            if (var0) {
               var1 = true;
               b((v)af[t.z][1][var2]);
            }
         }
      }

      return var1;
   }

   public static final void a(Graphics var0) {
      label108: {
         int var10000;
         label107: {
            switch (am) {
               case 0:
                  if (ah == null) {
                     break label108;
                  }
                  break;
               case 1:
                  if (ah != null) {
                     k(aj ? bd : 0);
                  }
                  break label108;
               case 2:
                  if (ah != null) {
                     if (aj) {
                        var10000 = bd;
                        break label107;
                     }
                     break;
                  }
               default:
                  break label108;
            }

            var10000 = 0;
         }

         k(var10000);
      }

      t.Z = 0;
      int var1;
      if ((var1 = ae + 5) > ac.length) {
         var1 = ac.length;
      }

      for (int var2 = 0; var2 < var1; var2++) {
         if (ac[var2] != null && ac[var2].au != 0) {
            ac[var2].M();
            if (t.Y) {
               t.aa[t.Z] = ac[var2];
               t.Z++;
            }

            t.Y = false;
         }
      }

      if (t.y) {
         t.y = false;
         t.x = true;
      }

      t.C();
      t.D();
      t.B();
      t.E();
      v.av();
      if (t.N) {
         Graphics var19 = var0;
         byte var17 = 96;
         int var20 = 48;
         if (t.o) {
            var17 = 48;
            var20 = 24;
         }

         int var3 = var17 >> 1;
         int var4 = var20 >> 1;
         var19.setColor(0);
         int var18 = var17 >> 1;
         var20 >>= 1;
         var19.setColor(16711680);
         int var5 = var3 - 5;
         int var6 = t.t - t.n + var4;
         int var7 = t.s - t.m - var3;
         if (t.o) {
            var6 >>= 1;
            var7 >>= 1;
         }

         t.am.setColor(16711680);

         for (int var8 = 0; var8 < t.u; var8++) {
            int var9 = var6 + var8 * var4;
            int var10 = var7 - var8 * var3;

            for (int var11 = 0; var11 < t.u; var11++) {
               if (var10 > -48 && var10 < 800 && var9 > -25 && var9 < 480) {
                  int var10003 = var10 + var18;
                  int var16 = var9 - var20;
                  int var15 = var10003;
                  int var14 = var9;
                  int var13 = var10;
                  int var12 = null;
                  t.a(var19, var13, var14, var15, var16, true);
                  var10003 = var10 + var18;
                  var16 = var9 + var20;
                  var15 = var10003;
                  var14 = var9;
                  t.a(var19, var10, var14, var15, var16, true);
                  int var40 = t.w[var8][var11];
                  var12 = 0;
                  switch (var40 & 0xFF) {
                     case 0:
                        break;
                     case 1:
                        t.am.setColor(0);
                        var40 = var10 + var5;
                        var13 = var9 - 5 - 10;
                        var12 = var40;
                        t.c(t.am, var12, var13, 10, 10);
                        break;
                     case 2:
                        t.am.setColor(16711680);
                        var40 = var10 + var5;
                        var13 = var9 - 5;
                        var12 = var40;
                        t.c(t.am, var12, var13, 10, 10);
                        break;
                     case 3:
                        t.am.setColor(255);
                        var40 = var10 + var5;
                        var13 = var9 - 5;
                        var12 = var40;
                        t.c(t.am, var12, var13, 10, 10);
                        break;
                     case 4:
                        t.am.setColor(16711680);
                        var40 = var10 + var5;
                        var13 = var9 - 5;
                        var12 = var40;
                        t.c(t.am, var12, var13, 10, 10);
                        break;
                     case 5:
                        t.am.setColor(16711935);
                        var40 = var10 + var5;
                        var13 = var9 - 5;
                        var12 = var40;
                        t.c(t.am, var12, var13, 10, 10);
                        break;
                     case 6:
                        t.am.setColor(65535);
                        var40 = var10 + var5;
                        var13 = var9 - 5;
                        var12 = var40;
                        t.c(t.am, var12, var13, 10, 10);
                        break;
                     default:
                        t.am.setColor(8947848);
                        var40 = var10 + var5;
                        var13 = var9 - 5;
                        var12 = var40;
                        t.c(t.am, var12, var13, 10, 10);
                  }

                  t.am.setColor(16777215);
               }

               var9 += var4;
               var10 += var3;
               t.am.setColor(16711680);
            }
         }
      }
   }

   private void l(int var1) {
      if (this.cj != var1) {
         byte var2 = 0;
         byte var3 = 0;
         if (this.au == 13) {
            var2 = 2;
            var3 = 1;
         } else if (this.au == 11) {
            var2 = 4;
            var3 = 2;
         }

         this.cj = var1;
         switch (this.cj) {
            case 1:
               this.ck = var2;
               this.cl = -var3;
               this.ay.a(3, -1);
               return;
            case 2:
               this.ck = -var2;
               this.cl = -var3;
               this.ay.a(2, -1);
               return;
            case 3:
               this.ck = var2;
               this.cl = var3;
               this.ay.a(0, -1);
               return;
            case 4:
               this.ck = -var2;
               this.cl = var3;
               this.ay.a(1, -1);
         }
      }
   }

   private static void a(q var0) {
      t.b(38, var0.bi, -1, -1);
      int var1 = var0.av + 48;
      int var2 = var0.aw - 24;
      a(var1, var2, 40, true);
      a(var0, t.z);
      t.A--;
   }

   private static boolean c(q var0, int var1) {
      int var2;
      if ((var2 = i(p(i(var0.av, var0.aw), var1))) != -1) {
         int var3 = var2 & 0xFF;
         var2 = var2 >> 16 & 65535;
         if (var3 == 1 && var2 == 254) {
            return true;
         }

         if (var3 == 1 && var2 == 253) {
            return false;
         }
      }

      int var6 = q(var0.av, var0.aw);
      boolean var5 = true;
      if (var6 < 0 || var6 >= t.u * t.v) {
         var5 = false;
      } else if (m(p(var6, var1))) {
         var5 = false;
      }

      return var5;
   }

   private static void b(q var0) {
      int var1 = var0.av + 48;
      int var2 = var0.aw - 24;
      a(var1, var2, 40, true);
      a(var0, t.z);
      t.B--;
   }

   private static void c(q var0) {
      int var1 = var0.av + 48;
      int var2 = var0.aw - 24;
      a(var1, var2, 40, true);
      a(var0, t.z);
      if (--t.C <= 0) {
         t.d();
      }
   }

   void M() {
   }

   final void N() {
      a(this.ay);
      this.ay.g();
   }

   final void O() {
      if (this.au == 11) {
         a(this.ay);
         this.ay.g();
         null.c(t.aq);
         int[] var1;
         if ((var1 = this.ay.e()) != null) {
            a(null, this.ay.a + var1[0], this.ay.b + var1[1], true);
            null.g();
         }
      }

      if (this.au == 13) {
         a(this.ay);
         this.ay.g();
      }
   }

   void P() {
      switch (this.au) {
         case 12:
            this.b();
      }
   }

   static void Q() {
      for (int var0 = 0; var0 < af[t.z][4].length; var0++) {
         if (af[t.z][4][var0] != null) {
            af[t.z][4][var0].b();
         }
      }
   }

   final void R() {
      if (t.o) {
         t.H(13);
         t.J(50);
         t.e(13, 2, 150);
      }

      if (t.o) {
         t.a(13, true);
      }

      if (t.o) {
         t.H(13);
         t.J(50);
         t.e(13, 2, 150);
      }

      if (this.ap != -1) {
         if (this instanceof v) {
            v var1 = (v)this;
            a(this.az, this.ap, this.av, this.aw - 8, 0, true, var1.aS);
         } else {
            a(this.az, this.ap, this.av, this.aw - 8);
         }
      } else if (this.aq != -1) {
         int var4 = this.aw - 8;
         int var3 = this.av;
         d var2 = this.ay;
         a(var2, var3, var4, false);
         this.ay.g();
      }

      if (t.o) {
         t.a(13, true);
      }
   }

   protected final void a(d var1, int var2, int var3) {
      a(var1, var2, var3, false);
   }

   private static void a(d var0, int var1, int var2, boolean var3) {
      if (var0 != null) {
         if (t.o) {
            if (!var3) {
               var1 = (var1 >> 1) - t.m;
               var2 = (var2 >> 1) - t.n;
            } else {
               var1 >>= 1;
               var2 >>= 1;
            }
         } else if (!var3) {
            var1 -= t.m;
            var2 -= t.n;
         }

         var1 = var1;
         d var4 = var0;
         var0.a = var1;
         var4.b = var2;
      }
   }

   final void S() {
      this.ax = (this.aw << 10) + this.av;
   }

   final boolean T() {
      q var1 = this;
      var1.U();
      if (var1.aH == null) {
         var1.aG = 0;
      } else if (var1.aH[0] <= 80000 / t.S + 50 && var1.aH[2] >= -50 && var1.aH[1] <= 48000 / t.S + 50 && var1.aH[3] >= -50) {
         var1.aG = 1;
      } else {
         var1.aG = 2;
      }

      return var1.aG == 1;
   }

   static boolean a(int[] var0) {
      if (var0 == null) {
         return false;
      } else if (var0[0] > 80000 / t.S) {
         return false;
      } else if (var0[1] > 48000 / t.S) {
         return false;
      } else if (var0[2] < 0) {
         return false;
      } else {
         return var0[3] < 0 ? false : var0[0] != 0 || var0[1] != 0 || var0[2] != 0 || var0[3] != 0;
      }
   }

   final void U() {
      boolean var1 = false;
      if (this instanceof v && ((v)this).aP == 2) {
         var1 = true;
         this.aJ = false;
      }

      if (this.au == 0) {
         this.aJ = false;
      }

      if (!this.aJ || this.au == 11) {
         if (this.aJ) {
            ;
         }

         if (!this.aJ || this.au == 13) {
            if (this.aJ) {
               ;
            }

            if (!this.aJ || this.au == 15) {
               if (this.aJ) {
                  ;
               }

               if (!var1) {
                  this.aJ = true;
               }

               if (var1) {
                  t.j[3][53].b(this.aH, 0, 0, 0, 0);
               } else if (this.ay == null && this.az != null) {
                  this.az.b(this.aH, this.ap, 0, 0, this.az.c);
               } else if (this.ay != null) {
                  a var5 = this.ay.d;
                  if (this.au != 0) {
                     if (var5 == null) {
                        return;
                     }

                     int var2 = this.ay.e;
                     if (this.ay.e == -1) {
                        var2 = 0;
                     }

                     int var3 = this.ay.f;
                     int var4 = this.ay.c;
                     var5.a(this.aH, var2, var3, 0, 0, var4);
                  } else {
                     ((r)this).b(this.aH);
                     if (t.o) {
                        this.aH[0] = (this.aH[0] - this.av << 1) + t.m;
                        this.aH[1] = (this.aH[1] - this.aw << 1) + t.n;
                        this.aH[2] = (this.aH[2] - this.av << 1) + t.m;
                        this.aH[3] = (this.aH[3] - this.aw << 1) + t.n;
                     } else {
                        this.aH[0] = this.aH[0] - this.av + t.m;
                        this.aH[1] = this.aH[1] - this.aw + t.n;
                        this.aH[2] = this.aH[2] - this.av + t.m;
                        this.aH[3] = this.aH[3] - this.aw + t.n;
                     }
                  }
               }

               if (t.o) {
                  this.aH[0] = (this.aH[0] + this.av >> 1) - t.m;
                  this.aH[1] = (this.aH[1] + this.aw >> 1) - t.n;
                  this.aH[2] = (this.aH[2] + this.av >> 1) - t.m;
                  this.aH[3] = (this.aH[3] + this.aw >> 1) - t.n;
               } else {
                  this.aH[0] = this.aH[0] + this.av - t.m;
                  this.aH[1] = this.aH[1] + this.aw - t.n;
                  this.aH[2] = this.aH[2] + this.av - t.m;
                  this.aH[3] = this.aH[3] + this.aw - t.n;
               }
            }
         }
      }
   }

   public void V() {
      a(this.az, this.ap, this.av, this.aw, 0);
   }

   public final void W() {
      this.e(this.X());
   }

   public byte X() {
      byte var1;
      if (this.ay != null) {
         var1 = 3;
      } else {
         var1 = 2;
      }

      return var1;
   }

   public final void e(byte var1) {
      if (var1 != this.aI) {
         this.Y();
      }

      if (var1 == 5) {
         this.Y();
         ((v)this).bk = 0;
         if (this.aI == 5) {
            ((v)this).k(-1);
         } else {
            ((v)this).k(0);
         }
      }

      this.aI = var1;
   }

   protected static void a(d var0) {
      if (var0 != null) {
         if (t.o) {
            var0.g = 50;
         } else {
            if (var0.h() != -1) {
               var0.g = -1;
            }
         }
      }
   }

   public final void Y() {
      if (this.ay == null) {
         t.a(this.az, this.ap, this.av, this.aw);
      } else {
         t.a(this.ay.d, this.ay.b(), this.av, this.aw);
      }
   }

   public void Z() {
      if (this.ay == null) {
         a(this.az, this.ap, this.av, this.aw);
      } else {
         this.ay.g();
      }
   }

   protected static void a(a var0, int var1, int var2, int var3) {
      a(var0, var1, var2, var3, 0, true, 0);
   }

   protected static void a(a var0, int var1, int var2, int var3, int var4, boolean var5, int var6) {
      a var9;
      if ((var9 = t.a(var0)) != null) {
         t.a(13, true);
         var5 = false;
         var0 = var9;
      }

      if (var0 != null) {
         if (t.o) {
            var2 = (var2 >> 1) - t.m;
            var3 = (var3 >> 1) - t.n;
         } else {
            var2 -= t.m;
            var3 -= t.n;
         }

         var0.m(var6);
         if (var0 == t.j[3][58]) {
            var0.m(var1);
         }

         if (t.o && var5) {
            var0.c(t.am, var1, var2, var3, 0);
         } else {
            var0.a(t.am, var1, var2, var3, 0);
         }
      }
   }

   public static void a(a var0, int var1, int var2, int var3, int var4) {
      boolean var5 = true;
      var4 = var4;
      var3 = var3;
      var2 = var2;
      var1 = var1;
      var0 = var0;
      if (var0 != null) {
         a var6;
         if ((var6 = t.a(var0)) != null) {
            var5 = false;
            var0 = var6;
         }

         var0.m(var4);
         if (t.o && var5) {
            t.H(13);
            t.e(13, 1, 50);
            d.a(var0, var1, var2 >> 1, var3 >> 1, 0, aO);
            t.a(13, false);
            return;
         }

         if (t.o) {
            d.a(var0, var1, var2 >> 1, var3 >> 1, 0, aO);
            return;
         }

         d.a(var0, var1, var2, var3, 0, aO);
      }
   }

   static int g(int var0) {
      int var1 = var0 / t.u;
      var0 %= t.u;
      return t.s + (var0 - var1) * 48 - 48;
   }

   static int h(int var0) {
      int var1 = var0 / t.u;
      var0 %= t.u;
      return t.t + (var0 + var1) * 24 + 24;
   }

   static int d(int var0, int var1) {
      int var2 = f(var0, var1);
      var0 = g(var0, var1);
      return t.s + (var2 - var0) * 48 - 48;
   }

   static int e(int var0, int var1) {
      int var2 = f(var0, var1);
      var0 = g(var0, var1);
      return t.t + (var2 + var0) * 24 + 24;
   }

   static int f(int var0, int var1) {
      var0++;
      var0 = (var0 - t.s) * 24;
      var1 = (var1 - t.t) * 48;
      int var2 = (var0 + var1) / 2304;
      return var0 + var1 < 0 ? var2 - 1 : var2;
   }

   static int g(int var0, int var1) {
      var0++;
      var0 = (var0 - t.s) * 24;
      int var5;
      int var2 = ((var5 = (var1 - t.t) * 48) - var0) / 2304;
      return var5 - var0 < 0 ? var2 - 1 : var2;
   }

   static void c(int var0, int var1, int var2, int var3, int var4) {
      if ((var0 = i(var0, var1)) >= 0) {
         var1 = var3 << 16 | var2;
         switch (var4) {
            case 1:
               h(p(var0, 16), var1);
               return;
            case 2:
               h(p(var0, 16), var1);
               h(p(var0, 0), var1 | 256);
               h(p(var0, 3), var1 | 512);
               h(p(var0, 14), var1 | 1024);
               return;
            case 3:
               h(p(var0, 16), var1);
               h(p(var0, 0), var1 | 256);
               h(p(var0, 3), var1 | 512);
               h(p(var0, 14), var1 | 1024);
               if ((var0 = p(var0, 14)) != -1) {
                  h(p(var0, 12), var1 | 768);
                  h(p(var0, 15), var1 | 1280);
                  h(p(var0, 0), var1 | 1792);
                  h(p(var0, 3), var1 | 2048);
                  h(p(var0, 14), var1 | 2816);
                  return;
               }
               break;
            case 4:
               h(p(var0, 16), var1);
               h(p(var0, 0), var1 | 256);
               h(p(var0, 3), var1 | 512);
               h(p(var0, 14), var1 | 1024);
               h(p(var0, 8), var1 | 1536);
               h(p(var0, 11), var1 | 2304);
               if ((var0 = p(var0, 14)) != -1) {
                  h(p(var0, 12), var1 | 768);
                  h(p(var0, 15), var1 | 1280);
                  h(p(var0, 0), var1 | 1792);
                  h(p(var0, 3), var1 | 2048);
                  h(p(var0, 14), var1 | 2816);
               }

               if ((var0 = p(var0, 14)) != -1) {
                  h(p(var0, 12), var1 | 2560);
                  h(p(var0, 15), var1 | 3072);
                  h(p(var0, 0), var1 | 3328);
                  h(p(var0, 3), var1 | 3584);
                  h(p(var0, 14), var1 | 3840);
               }
         }
      }
   }

   public static void b(int var0, int var1, int var2) {
      if ((var0 = i(var0, var1)) >= 0) {
         switch (var2) {
            case 1:
               h(p(var0, 16), 0);
               return;
            case 2:
               h(p(var0, 16), 0);
               h(p(var0, 0), 0);
               h(p(var0, 3), 0);
               h(p(var0, 14), 0);
               return;
            case 3:
               h(p(var0, 16), 0);
               h(p(var0, 0), 0);
               h(p(var0, 3), 0);
               h(p(var0, 14), 0);
               if ((var0 = p(var0, 14)) != -1) {
                  h(p(var0, 12), 0);
                  h(p(var0, 15), 0);
                  h(p(var0, 0), 0);
                  h(p(var0, 3), 0);
                  h(p(var0, 14), 0);
                  return;
               }
               break;
            case 4:
               h(p(var0, 16), 0);
               h(p(var0, 0), 0);
               h(p(var0, 3), 0);
               h(p(var0, 14), 0);
               h(p(var0, 8), 0);
               h(p(var0, 11), 0);
               if ((var0 = p(var0, 14)) != -1) {
                  h(p(var0, 12), 0);
                  h(p(var0, 15), 0);
                  h(p(var0, 0), 0);
                  h(p(var0, 3), 0);
                  h(p(var0, 14), 0);
               }

               if ((var0 = p(var0, 14)) != -1) {
                  h(p(var0, 12), 0);
                  h(p(var0, 15), 0);
                  h(p(var0, 0), 0);
                  h(p(var0, 3), 0);
                  h(p(var0, 14), 0);
               }
         }
      }
   }

   static boolean h(int var0, int var1) {
      if (var0 < 0) {
         return false;
      }

      t.w[var0 / t.u][var0 % t.u] = var1;
      return true;
   }

   static int i(int var0, int var1) {
      int var2 = f(var0, var1);
      var0 = g(var0, var1);
      if (var2 < 0) {
         return -1;
      } else if (var0 < 0) {
         return -1;
      } else if (var2 >= t.u) {
         return -1;
      } else {
         return var0 >= t.v ? -1 : var0 * t.u + var2;
      }
   }

   private static int p(int var0, int var1) {
      if (var0 < 0) {
         return -1;
      }

      if (var0 >= t.u * t.v) {
         return -1;
      }

      switch (var1) {
         case 0:
            var0 -= t.u;
            break;
         case 1:
            var0 += t.u;
            break;
         case 2:
            if (var0 % t.u <= 0) {
               return -1;
            }

            var0--;
            break;
         case 3:
            if (var0 % t.u >= t.u - 1) {
               return -1;
            }

            var0++;
            break;
         case 4:
            var0 -= t.u << 1;
            break;
         case 5:
            var0 += t.u << 1;
            break;
         case 6:
            if (var0 % t.u <= 1) {
               return -1;
            }

            var0 -= 2;
            break;
         case 7:
            if (var0 % t.u >= t.u - 2) {
               return -1;
            }

            var0 += 2;
            break;
         case 8:
            var0 -= t.u * 3;
            break;
         case 9:
            var0 += t.u * 3;
            break;
         case 10:
            if (var0 % t.u <= 2) {
               return -1;
            }

            var0 -= 3;
            break;
         case 11:
            if (var0 % t.u >= t.u - 3) {
               return -1;
            }

            var0 += 3;
            break;
         case 12:
            if (var0 % t.u == 0 || var0 / t.u == 0) {
               return -1;
            }

            var0 -= t.u + 1;
            break;
         case 13:
            if (var0 % t.u == 0 || var0 / t.u == t.u - 1) {
               return -1;
            }

            var0 += t.u - 1;
            break;
         case 14:
            if (var0 % t.u == t.u - 1 || var0 / t.u == 0) {
               return -1;
            }

            var0 -= t.u - 1;
            break;
         case 15:
            if (var0 % t.u == t.u - 1 || var0 / t.u == t.u - 1) {
               return -1;
            }

            var0 += t.u + 1;
         case 16:
      }

      if (var0 < 0) {
         return -1;
      } else {
         return var0 >= t.u * t.v ? -1 : var0;
      }
   }

   private static int q(int var0, int var1) {
      int var2 = f(var0, var1);
      var0 = g(var0, var1);
      if (var2 < 0) {
         return -1;
      } else if (var0 < 0) {
         return -1;
      } else if (var2 >= t.u) {
         return -1;
      } else {
         return var0 >= t.v ? -1 : var0 * t.u + var2;
      }
   }

   private static boolean f(int var0, int var1, int var2) {
      int var3 = d(var0, var1);
      var0 = e(var0, var1);
      byte var5;
      switch (var2) {
         case 1:
            var5 = 0;
            break;
         case 2:
            var5 = 2;
            break;
         case 3:
            var5 = 4;
            break;
         case 4:
            var5 = 8;
            break;
         default:
            return false;
      }

      cm = var3;
      cn = var0;
      switch (var5) {
         case 0:
         case 1:
         case 3:
         case 5:
         case 6:
         case 7:
         case 9:
         case 10:
         case 11:
         default:
            cm = var3;
            cn = var0;
            break;
         case 2:
            cm -= 48;
            cn -= 24;
            break;
         case 4:
            cm -= 96;
            break;
         case 8:
            cm -= 144;
            cn -= 24;
      }

      return true;
   }

   private static void a(v var0, int var1, int var2) {
      f(var1, var2, var0.aR);
      var0.av = cm;
      var0.aw = cn;
      e(var0.av, var0.aw, var0.aR);
      f(var0);
   }

   private static void f(v var0) {
      aj = r(q(var0.av, var0.aw), var0.aR);
   }

   private static boolean r(int var0, int var1) {
      if (var0 < 0) {
         return true;
      }

      boolean var2 = false;
      if (var0 >= 0 && var0 < t.u * t.v) {
         switch (var1) {
            case 1:
               if (!m(p(var0, 16))) {
                  return var2;
               }

               return true;
            case 2:
               if (m(p(var0, 16)) || m(p(var0, 0)) || m(p(var0, 3)) || m(p(var0, 14))) {
                  var2 = true;
               }

               return var2;
            case 3:
               if (m(p(var0, 16)) || m(p(var0, 0)) || m(p(var0, 3)) || m(p(var0, 14))) {
                  var2 = true;
               }

               if ((var0 = p(var0, 14)) != -1 && (m(p(var0, 12)) || m(p(var0, 15)) || m(p(var0, 0)) || m(p(var0, 3)) || m(p(var0, 14)))) {
                  var2 = true;
               }

               return var2;
            case 4:
               if (m(p(var0, 16)) || m(p(var0, 0)) || m(p(var0, 3)) || m(p(var0, 14)) || m(p(var0, 8)) || m(p(var0, 11))) {
                  var2 = true;
               }

               if ((var0 = p(var0, 14)) != -1 && (m(p(var0, 12)) || m(p(var0, 15)) || m(p(var0, 0)) || m(p(var0, 3)) || m(p(var0, 14)))) {
                  var2 = true;
               }

               if ((var0 = p(var0, 14)) != -1 && (m(p(var0, 12)) || m(p(var0, 15)) || m(p(var0, 0)) || m(p(var0, 3)) || m(p(var0, 14)))) {
                  return var2;
               }

               return var2;
            default:
               return var2;
         }
      } else {
         return true;
      }
   }

   private static void b(v var0, int var1, int var2) {
      f(var1, var2, var0.aR);
      var0.av = cm;
      var0.aw = cn;
      e(var0.av, var0.aw, var0.aR);
      v var3;
      aj = r(q((var3 = var0).av, var3.aw), var3.aR);
   }

   static int j(int var0, int var1) {
      if ((var0 = i(var0, var1)) < 0) {
         return -1;
      }

      int var3;
      return (var3 = t.w[var0 / t.u][var0 % t.u]) == 0 ? -1 : var3;
   }

   static int i(int var0) {
      if (var0 >= 0 && var0 < t.u * t.v) {
         int var1;
         return (var1 = t.w[var0 / t.u][var0 % t.u]) == 0 ? -1 : var1;
      } else {
         return -1;
      }
   }

   static int j(int var0) {
      int var1;
      return (var1 = i(var0)) == -1 ? -1 : var1 & 0xFF;
   }

   private static boolean m(int var0) {
      int var1;
      int var2;
      return (var2 = (var1 = var0) >= 0 && var1 < t.u * t.v ? t.w[var1 / t.u][var1 % t.v] : -1) == -1 ? true : (var2 & 0xFF) != 0;
   }
}
