import java.io.InputStream;
import java.util.Hashtable;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public final class j implements Runnable, CommandListener {
   private static String a = "2.3";
   private static String b = "IGP-Signature=" + a;
   private static String c = "";
   private static String d;
   private static Font e;
   private static String f = "URL";
   private static int g = 2;
   private static boolean[] h = new boolean[1];
   private static int[] i = new int[1];
   private static int j;
   private static int k = -1;
   private static int l = 8;
   private static int m;
   private static int n;
   private static int o;
   private static int p;
   private static int q;
   private static int r;
   private static int s;
   private static int t;
   private static int u;
   private static int v;
   private static int w;
   private static int x;
   private static int y;
   private static int z;
   private static int A;
   private static int B;
   private static int C;
   private static String D = "ZVIP";
   private static String E = "SCFR";
   private static String F = "GMCL";
   private static String G = "CCTL";
   private static String H = "TITLE-FREEMIUM";
   private static String I = "TITLE-GLCLUB";
   private static String J = "URL-OPERATOR";
   private static int K = 1;
   private static int L = 4;
   private static int M = 8;
   private static int N = 9;
   private static int O = 10;
   private static int P = 11;
   private static int Q = 12;
   private static int R = 13;
   private static int S = 14;
   private static int T = 1;
   private static int U = 2;
   private static int V = 3;
   private static int W = 4;
   private static int X = 5;
   private static int Y = 6;
   private static int Z = 7;
   private static int aa = 8;
   private static int ab = 9;
   private static int ac = 10;
   private static int ad = 11;
   private static int ae = 12;
   private static int af = 13;
   private static int ag = 14;
   private static int ah = 15;
   private static int ai = 16;
   private static int aj = 17;
   private static int ak = 18;
   private static int al = 19;
   private static int am = 20;
   private static int an = 21;
   private static int ao = 22;
   private static int ap = 24;
   private static int aq = 25;
   private static int ar;
   private static int[] as;
   private static int at;
   private static int au;
   private static int av;
   private static int aw;
   private static int ax;
   private static int ay;
   private static String az = "IGP-CATEGORIES";
   private static String aA = "IGP-PROMOS";
   private static String aB = "IGP-FREEMIUM";
   private static String aC = "URL-TEMPLATE-GAME";
   private static String aD = "more_games_url";
   private static String aE = "more_games_status";
   private static String aF = null;
   private static String aG = null;
   private static String aH = "on";
   private static String aI = "XXXX";
   private static String aJ = "&ctg=" + aI;
   private static String aK = "&ctg=";
   private static String aL = "&lg=";
   private static String aM = "SC";
   private static String aN = "ingameads.gameloft.com/redir";
   private static String aO = ";";
   private static String aP;
   private static boolean aQ;
   private static boolean aR;
   private static String aS;
   private static boolean aT = false;
   private static String[] aU = new String[0];
   private static int aV;
   private static String[] aW;
   private static short[] aX;
   private static String[] aY;
   private static String[] aZ;
   private static int ba;
   private static boolean bb;
   private static boolean bc;
   private static int[][] bd;
   private static boolean be = false;
   private static MIDlet bf;
   private static Canvas bg;
   private static boolean bh = false;
   private static CommandListener bi = null;
   private static j bj = null;
   private static boolean bk = false;
   private static String bl = null;
   private static boolean bm = false;
   private static boolean bn = false;
   private static int bo;
   private static int bp;
   private static int bq;
   private static int br;
   private static int bs;
   private static int bt;
   private static a[] bu;
   private static a bv;
   private static a bw;
   private static int[] bx = new int[2];
   private static String[] by;
   private static int[] bz;
   private static boolean[] bA;
   private static int bB = 0;
   private static int bC = 0;
   private static int bD;
   private static int bE;
   private static String bF;
   private static String bG;
   private static String bH;
   private static String bI = "";
   private static String bJ;
   private static String bK;
   private static boolean bL = false;
   private static int bM;
   private static int bN;
   private static int bO;
   private static int bP;
   private static int bQ = 0;
   private static boolean bR = false;
   private static boolean bS = false;
   private static boolean bT = false;
   private static boolean bU = false;
   private static boolean bV = false;
   private static int bW = -1;
   private static int bX = -1;
   private static boolean bY = false;
   private static boolean[] bZ;

   private static boolean d() {
      e();

      try {
         InputStream var0;
         as = new int[ar = (ar = (var0 = c("/dataIGP")).read() & 0xFF) + ((var0.read() & 0xFF) << 8)];

         for (int var1 = 0; var1 < ar; var1++) {
            as[var1] = var0.read() & 0xFF;
            as[var1] = as[var1] + ((var0.read() & 0xFF) << 8);
            as[var1] = as[var1] + ((var0.read() & 0xFF) << 16);
            as[var1] = as[var1] + ((var0.read() & 0xFF) << 24);
         }

         var0.close();
         return true;
      } catch (Exception var2) {
         return false;
      }
   }

   private static void e() {
      as = null;
      ar = 0;
      System.gc();
   }

   private static byte[] b(int var0) {
      if (var0 >= 0 && var0 < ar - 1) {
         int var1;
         if ((var1 = as[var0 + 1] - as[var0]) == 0) {
            return null;
         }

         byte[] var2 = null;

         try {
            InputStream var3;
            (var3 = c("/dataIGP")).skip(2 + 4 * ar + as[var0]);
            var0 = (var2 = new byte[var1]).length;

            while (var0 > 0) {
               var0 -= var3.read(var2);
            }

            var3.close();
         } catch (Exception var4) {
         }

         return var2;
      } else {
         return null;
      }
   }

   private static int a(byte[] var0) {
      return (var0[at++] & 0xFF) + ((var0[at++] & 0xFF) << 8);
   }

   private static String c(int var0) {
      return "" + aW[var0];
   }

   private static void a(String var0, Graphics var1, int var2, int var3, int var4, int var5) {
      b(var0, var1, var2, var3, var4, var5, false);
   }

   private static void a(String var0, Graphics var1, int var2, int var3, int var4, int var5, boolean var6) {
      b(var0, var1, var2, var3, var4, 3, true);
   }

   private static void b(String var0, Graphics var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (var6) {
         if (aw == 0) {
            bv.m(av);
            short[] var11 = bv.a(var0, var2, false);
            short[] var8 = var11;
            String var12 = var0;
            bv.a(var1, var12, var8, var3, var4, 0, 10, var5);
         } else {
            bw.m(av);
            short[] var9 = bw.a(var0, var2, false);
            short[] var7 = var9;
            String var10 = var0;
            bw.a(var1, var10, var7, var3, var4, 0, 10, var5);
         }
      } else if (aw == 0) {
         bv.m(av);
         bv.a(var1, var0, var3, var4, var5);
      } else {
         bw.m(av);
         bw.a(var1, var0, var3, var4, var5);
      }
   }

   public static void a(MIDlet var0, Canvas var1) {
      var0 = var0;
      new StringBuffer()
         .append("initialize(midlet = ")
         .append(var0)
         .append(", game = ")
         .append(var1)
         .append(", screenWidth = ")
         .append(800)
         .append(", screenHeight = ")
         .append(480)
         .append(", cmdListener = ")
         .append((Object)null)
         .append(")")
         .toString();
      bZ = new boolean[S];

      for (int var2 = 0; var2 < S; var2++) {
         bZ[var2] = true;
      }

      bM = 480;
      bN = 800;
      bO = bM >> 1;
      bP = bN >> 1;
      if (2 > bM) {
         g = 2;
      }

      if (bf == null) {
         if (var1 != null) {
            bf = var0;
            bg = var1;
            f();
            String var4 = b;
            new StringBuffer().append(var4).append("").toString();
            if ((bn = g()) && bL) {
               bn = false;
            }

            aN = null;
            aP = null;
            aC = null;
            az = null;
            H = null;
            I = null;
            J = null;
            f = null;
            aI = null;
            aJ = null;
            aM = null;
            aK = null;
            aO = null;
            aA = null;
            System.gc();
         }
      }
   }

   private static boolean a(String var0, int var1) {
      String var2;
      return var0 == null
         ? false
         : (var2 = var0.trim()).length() != 0
            && var2.toUpperCase().compareTo("DEL") != 0
            && var2.toUpperCase().compareTo("NO") != 0
            && var2.toUpperCase().compareTo("0") != 0;
   }

   private static String a(String var0, String var1, String var2) {
      String var3 = "";

      try {
         if (var2 != null && var0 != null && var1 != null) {
            int var4 = var0.indexOf(var1 + "=");
            var2 = var2.trim();
            if (var4 >= 0 && var2.length() > 0) {
               var4 += var1.length() + 1;
               int var8;
               if ((var8 = var0.indexOf(aO, var4)) < 0) {
                  var8 = var0.length();
               }

               if ((var3 = var0.substring(var4, var8).trim()).length() == 0 || var3.compareTo("0") == 0 || var3.toUpperCase().compareTo("NO") == 0) {
                  var3 = "";
               } else if (var3.toUpperCase().compareTo("DEL") != 0 && var1.compareTo("OP") != 0) {
                  int var6;
                  if ((var6 = var2.indexOf(aI)) >= 0) {
                     var3 = var2.substring(0, var6) + var3 + var2.substring(var6 + aI.length());
                  } else {
                     var3 = var2;
                  }
               }
            }
         }
      } catch (Exception var5) {
         var3 = "";
      }

      return var3;
   }

   private static void a(int var0, String var1, String var2, String var3, int var4) {
      try {
         String var5 = null;
         String var6 = "";
         if (aR) {
            var5 = a(bf.getAppProperty(var2), var1, var3);
            if (var1.equals(E)) {
               var2 = aB;
               var6 = a(bf.getAppProperty(var2), aY[var0 - aZ.length], var3);
            }
         } else if (var1.equals(G)) {
            var5 = bI;
         } else {
            var2 = f + "-" + var1;
            var5 = bf.getAppProperty(var2);
         }

         if (var1.equals(E)) {
            if (aR) {
               int var10;
               if ((var10 = var5.indexOf(E)) >= 0) {
                  var5 = var5.substring(0, var10) + aY[var0 - aZ.length] + var5.substring(var10 + aY[var0 - aZ.length].length());
               }
            } else {
               var2 = f + "-" + E + "-" + aY[var0 - aZ.length];
               var5 = bf.getAppProperty(var2);
               var2 = f + "-" + E + "-" + aY[var0 - aZ.length];
               var6 = bf.getAppProperty(var2);
            }
         }

         boolean var13 = a(var5, 7);
         boolean var14 = true;
         if (var1.equals(E)) {
            var14 = a(var6, 7);
         }

         if (var13 && var14 && (var5.toUpperCase().compareTo("NO") != 0 || var5.toUpperCase().compareTo("0") != 0)) {
            bA[var0] = true;
            by[var0] = var5;
            if (bA[var0]) {
               bz[var0] = var4;
               switch (var4) {
                  case 4:
                     bB++;
                     if (aQ) {
                        by[var0] = by[var0] + aK + aM + (bB < 10 ? "0" : "") + bB;
                        return;
                     }
                  case 5:
                  default:
                     break;
                  case 6:
                     bC++;
                     if (aQ) {
                        by[var0] = by[var0] + aK + E;
                        return;
                     }
                     break;
                  case 7:
                     if (aQ) {
                        by[var0] = by[var0] + aK + F;
                        return;
                     }
                     break;
                  case 8:
                     if (aQ) {
                        by[var0] = by[var0] + aK + G;
                     }
               }
            }
         }
      } catch (Exception var7) {
      }
   }

   private static String[] b(byte[] var0) {
      String[] var1 = new String[a(var0)];

      for (int var2 = 0; var2 < var1.length; var2++) {
         int var3 = a(var0);
         var1[var2] = new String(var0, at, var3);
         at += var3;
      }

      return var1;
   }

   private static void f() {
      try {
         boolean var10000 = d();
         boolean var0 = false;
         if (!var10000) {
            var0 = null;
            bm = false;
            return;
         }

         byte[] var6;
         a(var6 = b(0));
         int var1 = a(var6);
         new String(var6, at, var1);
         at += var1;
         var1 = a(var6);
         aS = new String(var6, at, var1);
         at += var1;
         var1 = a(var6);
         at += var1;
         var1 = a(var6);
         at += var1;
         var1 = a(var6);
         at += var1;
         aT = a(var6) == 1;
         a(var6);
         a(var6);
         aU = b(var6);
         aZ = b(var6);
         aY = b(var6);
         b(var6);

         for (int var28 = 0; var28 < h.length; var28++) {
            h[var28] = a(var6) == 1;
         }

         try {
            var1 = a(var6);
            c = new String(var6, at, var1);
            new StringBuffer().append("IGP dataIGP version: ").append(c).toString();
            c.equals(a + "z");
            if (!c.startsWith(a)) {
               new StringBuffer().append("Invalid dataIGP file, dataIGP file IGP Version : ").append(c).toString();
               new StringBuffer().append("IGP Class version : ").append(a).toString();
            }
         } catch (Exception var4) {
            bm = false;
         }

         e();
      } catch (Exception var5) {
         bm = false;
         return;
      }

      String[] var30 = aY;
      String[] var7 = aZ;
      int var31 = aZ.length - 1 > 0 ? var7.length - 1 : 0;
      boolean var8 = false;
      int var9 = var31 + (var30.length - 1 > 0 ? var30.length - 1 : 0);
      t = (
            C = (
                  B = (
                        A = (
                              z = (
                                    y = (x = (w = (v = (s = (r = (q = (p = (u = ++var9 + 1) + 1 + 1 + 1 + 1 + 1) + 1) + 1) + 1) + 1 + 1 + 1) + 1) + 1)
                                       + 1
                                       + 1
                                       + 1
                                 )
                                 + 1
                           )
                           + 1
                     )
                     + 1
               )
               + 1
         )
         + 1;
      aV = aZ.length + aY.length + 1 + 1;

      for (int var11 = 0; var11 < h.length; var11++) {
         if (h[var11]) {
            i[var11] = ++l;
         } else {
            i[var11] = --k;
         }
      }

      j = ++l;
      by = new String[aV];
      bA = new boolean[aV];
      bz = new int[aV];

      for (int var12 = 0; var12 < bA.length; var12++) {
         bA[var12] = false;
      }

      o = (n = (m = aZ.length) + aY.length) + 1;
      String var13 = aD;
      aF = bf.getAppProperty(var13);
      String var14 = aE;
      aG = bf.getAppProperty(var14);
      if (aF != null && aG.toLowerCase().equals(aH.toLowerCase())) {
         bK = aF;
         bL = true;
         bm = true;
      } else {
         try {
            String var15 = aC;
            if ((aP = bf.getAppProperty(var15)) != null) {
               aP = aP.trim();
               aR = true;
               if (aP.indexOf(aN) != -1) {
                  aQ = true;
               }
            }
         } catch (Exception var3) {
         }

         for (int var16 = 0; var16 < aZ.length; var16++) {
            a(var16, aZ[var16], aA, aP, 4);
         }

         for (int var17 = 0; var17 < aY.length; var17++) {
            a(m + var17, E, az, aP, 6);
         }

         var7 = null;

         try {
            String var19 = J;
            String var20;
            if (a(var20 = bf.getAppProperty(var19).trim(), 7)) {
               bI = var20;
            }
         } catch (Exception var2) {
         }

         a(n, F, az, aP, 7);
         a(o, G, az, aP, 8);
         String var21 = H;
         bF = b(bf.getAppProperty(var21));
         String var22 = I;
         bG = b(bf.getAppProperty(var22));
         bx = i();
         if (j() > 0) {
            bm = true;
         }

         new StringBuffer().append("isAvailable = ").append(bm).toString();
      }
   }

   private static String b(String var0) {
      if (var0 == null) {
         return "0";
      }

      String var1 = "";
      var0 = var0.toUpperCase();
      boolean var2 = false;
      int var3 = bN;
      int var4 = bM;
      if (var3 >= var4 && var3 == 320) {
         var2 = true;
      }

      char[] var6 = var0.toCharArray();

      for (int var7 = 0; var7 < var6.length; var7++) {
         char var8 = var6[var7];
         if (!var2 || var8 != '\n') {
            var1 = var1 + var8;
         }
      }

      return var1;
   }

   public static boolean a() {
      return bm;
   }

   public static void a(String var0) {
      new StringBuffer().append("enterIGP(loadingMsg = ").append(var0).append(", appLanguage = ").append(0).append(" (").append(aU[0]).append(")").toString();
      bo = 0;
      if (bL) {
         h();
         bk = true;
         bl = bK;
      } else {
         l();
         bY = false;
         if (0 < aU.length) {
            boolean var10000 = false;
            int var10001 = aU.length;
            bE = 0;
            bH = var0;
            bs = -1;
            bo = 0;
            br = -1;
            bq = 0;
            bk = true;
            e = Font.getFont(0, 0, 8);
            h();
         }

         bt = 4 + aV;
         bq = k();
      }

      RecordStore var4 = null;

      try {
         var4 = RecordStore.openRecordStore("igp19", false);
      } catch (Exception var3) {
         try {
            var4 = RecordStore.openRecordStore("igp19", true);
         } catch (Exception var2) {
         }
      }

      try {
         if (var4 != null) {
            var4.closeRecordStore();
         }
      } catch (Exception var1) {
      }
   }

   public static void b() {
      bY = true;
      if (bn) {
         bo = 7;
         h();
         bk = true;
         bl = bJ;
      }
   }

   public static boolean c() {
      return bn;
   }

   private static boolean g() {
      int var0 = 0;

      for (int var1 = 0; var1 < aU.length; var1++) {
         if (aU[var1].equals("SP")) {
            var0 = 1;
         }
      }

      if (!var0) {
         return false;
      }

      try {
         String var4 = az;
         String var8;
         if ((var8 = bf.getAppProperty(var4)) == null || var8.indexOf(D) == -1) {
            String var5 = f + "-" + D;
            return (bJ = bf.getAppProperty(var5)) != null;
         }

         int var2;
         if ((var2 = (var0 = var8.indexOf(D) + D.length() + 1) + D.length()) >= var8.length()) {
            return false;
         }

         if (!var8.substring(var0, var2).equals(D)) {
            return false;
         }

         bJ = bI;
         if (aQ) {
            if ((var0 = (bJ = bJ + aJ).indexOf(aI)) >= 0) {
               bJ = bJ.substring(0, var0) + D + bJ.substring(var0 + aI.length());
            }

            if (bJ.length() == 0) {
               return false;
            }
         }

         return true;
      } catch (Exception var3) {
         return false;
      }
   }

   private static void h() {
      if (bj == null) {
         bj = new j();
      }

      new Thread(bj).start();
   }

   private static int[] i() {
      int[] var0;
      (var0 = new int[2])[0] = 0;
      var0[1] = 0;

      for (int var1 = 0; var1 < bA.length; var1++) {
         if (bA[var1]) {
            if (var1 < m) {
               var0[0]++;
            } else {
               var0[1]++;
            }
         }
      }

      return var0;
   }

   private static int j() {
      int var0 = 0;

      for (int var1 = 0; var1 < bA.length; var1++) {
         if (bA[var1]) {
            var0++;
         }
      }

      return var0;
   }

   private static int k() {
      for (int var0 = 0; var0 < bA.length; var0++) {
         if (bA[var0]) {
            return var0;
         }
      }

      return -1;
   }

   private static void d(int var0) {
      try {
         at = 0;
         switch (var0) {
            case -1:
               bu = new a[S];
               return;
            case 0:
               return;
            case 1:
               d();
               byte[] var1;
               a(var1 = b(var0));
               aW = new String[var0 = a(var1)];
               byte[] var2 = new byte[var0];
               System.arraycopy(var1, at, var2, 0, var0);
               at += var0;
               a(var1);
               int var3;
               aX = new short[var3 = var1[at++] & 0xFF | (var1[at++] & 255) << 8];

               for (int var12 = 0; var12 < var3 - 1; var12++) {
                  aX[var12] = (short)((var1[at++] & 255) + ((var1[at++] & 255) << 8));
               }

               aX[var3 - 1] = (short)var0;

               for (int var13 = 0; var13 < var3; var13++) {
                  var0 = var13 == 0 ? 0 : aX[var13 - 1] & 65535;
                  int var9;
                  if ((var9 = (aX[var13] & '\uffff') - var0) != 0) {
                     try {
                        aW[var13] = new String(var2, var0, var9, "UTF-8");
                     } catch (Exception var5) {
                     }
                  }
               }

               return;
            case 2:
               t.b("/1");
               bv = a(O, 3, false);
               int[] var10 = (int[])t.C(Q);
               bv.b(var10);
               au = bv.i();
               bw = a(P, 3, false);
               var10 = (int[])t.C(R);
               bw.b(var10);
               if (bN > 160 && bN > 220) {
                  if (bN <= 240) {
                     if (bM == 400) {
                        bw.l(0);
                     }
                  } else if (bN <= 320) {
                     bv.l(-1);
                     if (bM == 240 || aT) {
                        bv.l(0);
                     }
                  } else if (bN <= 480) {
                     bw.l(-1);
                  }
               }

               t.Q();
               return;
            case 3:
               t.b("/1");

               for (int var4 = 0; var4 < S; var4++) {
                  if (var4 != O && var4 != Q && var4 != P && var4 != R) {
                     bu[var4] = a(var4, 1, true);
                  }
               }

               t.Q();
               return;
            case 4:
               return;
            case 5:
               return;
            case 6:
               return;
            case 7:
               return;
            case 8:
               return;
         }
      } catch (Exception var6) {
      }
   }

   private static void b(boolean var0) {
      for (int var1 = 0; var1 < S; var1++) {
         if (bu[var1] != null && var1 != O && var1 != Q && var1 != P && var1 != R && var1 != 0) {
            bu[var1].a();
            bu[var1] = null;
         }
      }

      if (var0) {
         e();
         t.Q();
         aX = null;
         aW = null;
         bH = null;

         for (int var2 = 0; var2 < S; var2++) {
            if (bu[var2] != null) {
               bu[var2].a();
               bu[var2] = null;
            }
         }

         bu = null;
         bv.a();
         bv = null;
         bw.a();
         bw = null;
      }

      System.gc();
   }

   public static void a(boolean var0) {
      if (!var0) {
         if (bo == 5) {
            bo = br;
            bs = -1;
         }
      } else {
         if (bo == 0 || bo == 2) {
            br = bo;
            bo = 5;
         }

         l();
      }
   }

   public static boolean a(int var0) {
      if (bL) {
         return true;
      }

      if (bY) {
         return !bn ? true : bo == 4;
      }

      if (!bm) {
         return true;
      }

      if (bR) {
         bR = false;
      } else {
         bp = var0;
      }

      switch (bo) {
         case 0:
            if (bs < bt) {
               d(bs);
            } else {
               bo = 1;
               m();
               var0 = bN;
               int var23 = bM;
               bd = new int[aq][];

               for (int var2 = 0; var2 < aq; var2++) {
                  bd[var2] = new int[2];
                  bd[var2][0] = 0;
                  bd[var2][1] = 0;
               }

               int var24 = d(0, 0);
               int var3 = e(0, 0);
               int var4 = d(K, 0);
               int var5 = e(K, 0);
               int var6 = e(0, 9);
               int var7 = d(0, 10);
               int var8 = e(0, 10);
               if (g(var0, var23)) {
                  var7 = d(0, 35);
                  var8 = e(0, 35);
               }

               int var9 = e(0, 15);
               int var10 = e(0, 29);
               bv.a(c(C), null);
               a var10000 = bv;
               String var10001 = c(C);
               int var13 = var0 - var24;
               short[] var11 = var10000.a(var10001, var13, false);
               ay = a.i;
               int var25 = ax = a.b(var11, 0);
               if (var3 > ax) {
                  var25 = var3;
               }

               if (var8 > var25) {
                  var25 = var8;
               }

               int var12 = au;
               int var26 = au + var6 + var5 + var25;
               int var27 = var23 - var26 - 3 - var9 >> 2;
               byte var28 = -3;
               if (var23 <= 160) {
                  var28 = 2;
               } else if (var23 <= 220) {
                  var28 = 1;
               } else if (var23 <= 240) {
                  var28 = 0;
               } else if (var23 <= 320) {
                  var28 = 0;
                  if (var0 == 240) {
                     var28 = 1;
                  }
               } else if (var23 <= 360) {
                  var28 = 3;
               } else if (var23 <= 432) {
                  var28 = 1;
               } else if (var23 <= 480) {
                  var28 = 6;
                  if (var0 == 360) {
                     var28 = 0;
                  }
               } else if (var23 <= 640) {
                  var28 = 0;
               } else if (var23 <= 800) {
                  var28 = 3;
               }

               int var14 = d(0, 15);
               int var15 = d(0, 17);
               if (g(var0, var23)) {
                  var14 = d(0, 31);
                  var15 = d(0, 33);
               }

               bd[U][0] = var0 - var14 >> 2;
               bd[U][1] = 3;
               bd[V][0] = (var0 - var15 >> 2) * 3;
               bd[V][1] = bd[U][1];
               var14 = bu[0].f(15);
               var15 = bu[0].e(15, var14 - 1);
               bd[W][0] = var0 >> 2;
               bd[W][1] = bd[U][1] + (var15 >> 1) + var28;
               bd[X][0] = (var0 >> 1) + (var0 >> 2);
               bd[X][1] = bd[W][1];
               bd[0][0] = var0 >> 1;
               bd[0][1] = var27 + (var12 >> 1) + var28 + -2;
               bd[0][1] = bd[0][1] + bd[U][1] + var9;
               bd[Y][0] = 0;
               bd[Y][1] = bd[0][1] + var27 + (var12 >> 1) - var28 - -2;
               bd[T][0] = var0 >> 1;
               bd[T][1] = bd[Y][1] + (var6 >> 1) + var28 + -2;
               var14 = d(0, 2);
               var15 = e(0, 2);
               bd[af][0] = 5;
               bd[af][1] = bd[Y][1] + (var6 >> 1) - (var15 >> 1);
               bd[ag][0] = var0 - 5 - var14;
               bd[ag][1] = bd[af][1];
               bd[ad][0] = g;
               bd[ad][1] = var23 - 2 - var3;
               bd[ap][0] = var0 - g - var24;
               bd[ap][1] = var23 - 2 - var3;
               var15 = var0 - bd[ad][0] - var24 - (var7 << 1);
               bd[ai][0] = var15 / 3 + var24 + bd[ad][0];
               bd[ai][1] = var23 - 2 - var8;
               bd[ak][0] = bd[ai][0] + (var7 >> 1) + var7 % 2;
               bd[ak][1] = bd[ai][1] + (var8 >> 1) + var28;
               bd[ah][0] = bd[ai][0] + var7 + var15 / 3;
               bd[ah][1] = bd[ai][1];
               bd[al][0] = bd[ah][0] + (var7 >> 1) + var7 % 2;
               bd[al][1] = bd[ah][1] + (var8 >> 1) + var28;
               bd[aj][0] = (var0 >> 1) - (var7 >> 1);
               bd[aj][1] = bd[ai][1];
               bd[am][0] = bd[aj][0] + (var7 >> 1) + var7 % 2;
               bd[am][1] = bd[aj][1] + (var8 >> 1) + var28;
               bd[Z][0] = (var0 >> 1) - (var4 >> 1);
               bd[Z][1] = bd[Y][1] + var6 + var27;
               bd[an][0] = var0 - var24 >> 1;
               bd[an][1] = bd[Z][1] + var5 + (var23 - bd[Z][1] - var5 >> 1);
               bd[an][0] = var24 + bd[an][0];
               bd[an][0] = bd[aj][0] + var7 + (var0 - var7 >> 2);
               if (var23 > var0) {
                  bd[an][1] = bd[Z][1] + var5 + (bd[aj][1] - (bd[Z][1] + var5) >> 1);
                  bd[an][0] = var0 >> 1;
               }

               bd[aa][0] = var0 >> 1;
               bd[aa][1] = bd[Z][1] + (var5 << 1) / 3;
               bd[ab][0] = 5;
               bd[ab][1] = bd[Z][1] + (var5 >> 1) - (e(0, 6) >> 1);
               bd[ac][0] = var0 - d(0, 4) - 5;
               bd[ac][1] = bd[ab][1];
               var14 = d(0, 8);
               var15 = e(0, 8);
               if (var0 == 360 && var23 == 480) {
                  var14 = d(0, 39);
                  var15 = e(0, 39);
               }

               bd[ae][0] = bd[Z][0] + var4 - var14;
               bd[ae][1] = bd[Z][1] + var5 - var15;
               bd[ao][0] = 0;
               bd[ao][1] = bd[0][1] - (var10 >> 1);
               var0 = bu[0].f(15);
               var0 = bu[0].e(15, var0 - 1);
               bd[ao][1] = bd[U][1] + (var0 >> 1) - (var10 >> 1);
            }

            bs++;
            break;
         case 1:
            label235: {
               switch (bp) {
                  case 21:
                  case 22:
                  case 30:
                  case 31:
                  case 32:
                  default:
                     return false;
                  case 23:
                     byte var19 = 0;
                     if (bq >= m) {
                        var19 = 1;
                     }

                     if (bx[var19] <= 1) {
                        return false;
                     }

                     if (bq == 0) {
                        bq = m - 1;
                     } else if (bq == m) {
                        bq = aV - 1;
                     } else {
                        bq--;
                     }

                     while (!bA[bq]) {
                        if (bq == 0) {
                           bq = m - 1;
                        } else if (bq == m) {
                           bq = aV - 1;
                        } else {
                           bq--;
                        }
                     }

                     bb = true;
                     break label235;
                  case 24:
                     byte var18 = 0;
                     if (bq >= m) {
                        var18 = 1;
                     }

                     if (bx[var18] > 1) {
                        if (!bb) {
                           if (bq == m - 1) {
                              bq = 0;
                           } else if (bq == aV - 1) {
                              bq = m;
                           } else {
                              bq++;
                           }

                           while (!bA[bq]) {
                              if (bq == m - 1) {
                                 bq = 0;
                              } else if (bq == aV - 1) {
                                 bq = m;
                              } else {
                                 bq++;
                              }
                           }

                           bc = true;
                        }

                        m();
                     }

                     return false;
                  case 25:
                  case 27:
                     bo = 6;
                     return false;
                  case 26:
                     bo = 4;
                     return false;
                  case 28:
                     label212:
                     while (true) {
                        for (bq = 0; !bA[bq]; bq++) {
                           if (bq == m - 1) {
                              continue label212;
                           }
                        }

                        m();
                        return false;
                     }
                  case 29:
               }

               label234:
               while (true) {
                  bq = m;

                  while (true) {
                     if (bA[bq]) {
                        break label234;
                     }

                     if (bq == aV - 1) {
                        break;
                     }

                     bq++;
                  }
               }
            }

            m();
            break;
         case 2:
            b(false);
            var0 = bq;
            d(bs = bz[var0] == 4 ? bz[var0] : (bz[var0] == 6 ? 6 : (bz[var0] == 7 ? 7 : (bz[var0] == 8 ? 8 : -1))));
            bo = 1;
            break;
         case 3:
            switch (bp) {
               case 25:
               case 30:
                  bl = null;
                  return false;
               case 26:
                  bo = 1;
                  return false;
               default:
                  return false;
            }
         case 4:
            b(true);
            bk = false;
            return true;
         case 5:
         default:
            break;
         case 6:
            String var16;
            if (be) {
               var16 = by[o];
            } else {
               var16 = by[bq];
            }

            if (var16 != null && var16.length() > 0) {
               if (aQ) {
                  int var1;
                  if ((var1 = var16.indexOf(aL)) == -1) {
                     var16 = var16 + aL + aU[0];
                  } else {
                     var16 = var16.substring(0, var1) + aL + aU[0] + var16.substring(var1 + aL.length() + 2);
                  }
               }

               bl = var16;
            }
      }

      return false;
   }

   private static int d(int var0, int var1) {
      return bu != null && bu[var0] != null ? bu[var0].b(var1) : 0;
   }

   private static int e(int var0, int var1) {
      return bu != null && bu[var0] != null ? bu[var0].c(var1) : 0;
   }

   public static void a(int var0, int var1) {
      if (bo != 0) {
         int var2 = f(var0, var1);
         int var3 = bN;
         int var4 = bM;
         int var6 = var0;
         var0 = var1;
         var1 = var6;
         var1 = var4 - var1;
         int var5 = e(0, 10);
         if (g(var3, var4)) {
            var5 = e(0, 35);
         }

         var6 = e(0, 15);
         int var7 = d(0, 6);
         int var8 = e(0, 6);
         if (Math.abs(bW - var0) > var3 * 10 / 100
            && var1 < var4 - var5
            && var1 > var6
            && (bW >= var7 || bX <= bd[ab][1] || bX >= bd[ab][1] + var8)
            && (bW <= var3 - var7 || bX <= bd[ac][1] || bX >= bd[ac][1] + var8)
            && bX >= var6
            && bX <= var4 - var5) {
            if (bW - var0 < 0) {
               var2 = 23;
               bT = true;
            } else {
               var2 = 24;
               bT = true;
            }
         }

         if (var2 != 0) {
            bp = var2;
            bR = true;
            if (bU && by[o] != null) {
               be = true;
            }
         }

         bQ = 0;
         bS = false;
         bU = false;
         bV = false;
         bW = -1;
         bX = -1;
      }
   }

   public static void b(int var0, int var1) {
      if (bo != 0) {
         int var2;
         if ((var2 = f(var0, var1)) != 0) {
            bQ = var2;
         }

         var2 = bM;
         int var3 = var0;
         var0 = var1;
         var1 = var3;
         var1 = var2 - var1;
         if (bW == -1 || bX == -1) {
            bW = var0;
            bX = var1;
         }
      }
   }

   public static void c(int var0, int var1) {
      if (bo != 0) {
         bp = 0;
         bQ = 0;
         bS = false;
         bU = false;
         bV = false;
         b(var0, var1);
      }
   }

   private static int f(int var0, int var1) {
      int var2 = bN;
      int var3 = bM;
      int var4 = var0;
      var0 = var1;
      var1 = var4;
      var1 = var3 - var1;
      if (var0 < 0 || var1 < 0) {
         return 0;
      }

      if (bo != 0 && bk) {
         if (var1 > bd[U][1] && var1 < bd[U][1] + e(0, 15)) {
            if (var0 < var2 >> 1) {
               if (bq > aZ.length - 1) {
                  return 28;
               }
            } else if (bq < aZ.length) {
               return 29;
            }
         }

         var4 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4) + 1;
         if (var0 > bd[ab][0] + var4 && var0 < bd[ab][0] + d(0, 6) + var4 && var1 > bd[ab][1] && var1 < bd[ab][1] + e(0, 6)) {
            return 23;
         }

         if (var0 > bd[ac][0] - var4 && var0 < bd[ac][0] + d(0, 4) - var4 && var1 > bd[ac][1] && var1 < bd[ac][1] + e(0, 4)) {
            return 24;
         }

         var4 = d(0, 10);
         int var5 = e(0, 10);
         if (g(var2, var3)) {
            var4 = d(0, 35);
            var5 = e(0, 35);
         }

         if (bz[bq] != 6 && bz[bq] != 7 && bz[bq] != 8) {
            if (var0 > bd[ai][0] && var0 < bd[ai][0] + var4 && var1 > bd[ai][1] && var1 < bd[ai][1] + var5) {
               bU = true;
               return 25;
            }

            if (var0 > bd[ah][0] && var0 < bd[ah][0] + var4 && var1 > bd[ah][1] && var1 < bd[ah][1] + var5) {
               bS = true;
               return 25;
            }
         } else if (var0 > bd[aj][0] && var0 < bd[aj][0] + var4 && var1 > bd[aj][1] && var1 < bd[aj][1] + var5) {
            bS = true;
            return 25;
         }

         if (var0 > bd[ad][0] && var0 < bd[ad][0] + d(0, 0) && var1 > bd[ad][1] && var1 < bd[ad][1] + e(0, 0)) {
            bV = true;
            return 26;
         } else {
            var2 = d(K, 0);
            var3 = e(K, 0);
            return var0 > bd[Z][0] && var0 < bd[Z][0] + var2 && var1 > bd[Z][1] && var1 < bd[Z][1] + var3 ? 25 : 0;
         }
      } else {
         return 0;
      }
   }

   private static void l() {
      bp = 0;
      bQ = 0;
      bR = true;
      bS = false;
      bU = false;
      bV = false;
      ba = 0;
      bb = false;
      bc = false;
      bW = -1;
      bX = -1;
   }

   private static void m() {
      bD = bq;
      if (bz[bq] != 4 && bz[bq] != 6 && bz[bq] != 7) {
      }

      if (bz[bq] == 8) {
         ;
      }
   }

   public static void a(Graphics var0) {
      if (!bL) {
         if (bm || bY) {
            if (!bY) {
               Graphics var1 = var0;
               a(var0, bM, bN);
               switch (bo) {
                  case 0:
                     var1.setColor(0);
                     int var23 = bM;
                     int var18 = bN;
                     t.c(var1, 0, 0, var18, var23);
                     int var35 = bN * 3 / 4;
                     int var30 = bt;
                     int var27 = bs;
                     var23 = var35;
                     var18 = bO;
                     Graphics var15 = var1;
                     if (var27 > var30) {
                        var27 = var30;
                     }

                     int var7 = (bN - var23) / 2;
                     var27 = (var23 - 2 - 2) * var27 / var30 + 1;
                     a(var15, bM, bN);
                     var15.setColor(16777215);
                     t.c(var15, var7, var18, var23, 6);
                     var15.setColor(0);
                     int var33 = var7 + 1 + 1;
                     var35 = var18 + 1 + 1;
                     int var32 = var23 - 2 - 1;
                     var30 = var35;
                     t.c(var15, var33, var30, var32, 3);
                     var15.setColor(16711680);
                     var33 = var7 + 1 + 1;
                     var23 = var27;
                     t.c(var15, var33, var30, var23, 3);
                     if (bH != null && !bH.trim().equals("")) {
                        Image var16;
                        Graphics var20;
                        (var20 = (var16 = Image.createImage(bN, 30)).getGraphics()).setColor(0);
                        var27 = bN;
                        t.c(var20, 0, 0, 30, var27);
                        var20.setColor(16777215);
                        t.b(var20);
                        Font var21 = e;
                        t.am.setFont(var21);
                        t.a(bH, bP, 25, 33);
                        t.b(var0);
                        var1.drawRegion(var16, 0, 0, bM, 30, 5, bO + 5 + 30, 0, 0);
                        return;
                     }
                     break;
                  case 1:
                     b(var1);
                     if (System.currentTimeMillis() % 1000L <= 500L && (bQ != 27 || bS)) {
                        break;
                     }

                     if (bq != o) {
                        boolean var13 = false;
                        Object var14 = null;
                        return;
                     }

                     boolean var11 = false;
                     Object var12 = null;
                     return;
                  case 2:
                     return;
                  case 3:
                     b(var1);
                     int var2 = bM;
                     int var3 = bN;
                     int var9 = var2 * 40 / 100;
                     int var5 = d(0, 0) - 5;
                     a(var1, var9 - 1, var3, var2 - (var9 - 1 << 1), -1);
                     a(var1, var9, var3, var2 - (var9 << 1), -220209185);
                     Object var10 = null;
                     var1.setColor(16777215);
                     int var10001 = var2 - (var5 + 1);
                     int var8 = var5 + 1;
                     int var6 = var10001;
                     t.c(var1, 0, var6, var3, var8);
                     var1.setColor(-220209185);
                     int var4 = var2 - var5;
                     t.c(var1, 0, var4, var3, var5);
                     av = 1;
                     int var10002 = var3 >> 1;
                     var5 = var2 >> 1;
                     var4 = var10002;
                     Graphics var17 = var1;
                     a(c(t), var17, bM, var4, var5, 3, true);
                     c(var1);
                  case 4:
                  default:
                     break;
                  case 5:
                     return;
               }
            }
         }
      }
   }

   private static void a(Graphics var0, int var1, int var2, int var3, int var4) {
      int[] var5 = new int[var2 * var3];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = var4;
      }

      var0.drawRGB(var5, 0, var2, 0, var1, var2, var3, true);
   }

   private static void b(Graphics var0) {
      int var1 = bN;
      int var2 = bM;
      if (bq == o) {
         e(N, 0);
         e(K, 0);
      }

      var0.setColor(16777215);
      if (h[0]) {
         var0.setColor(0);
      }

      var0.setColor(16777215);
      t.c(var0, 0, 0, var1, var2);
      int var3 = bd[0][0];
      int var4 = bd[0][1];
      int var5 = bd[T][0];
      int var6 = bd[T][1];
      int var7 = bd[Z][0];
      int var8 = bd[Z][1];
      int var9 = bd[ae][0];
      int var10 = bd[ae][1];
      int var11 = bd[Y][0];
      int var12 = bd[Y][1];
      int var13 = bd[af][0];
      int var14 = bd[af][1];
      int var15 = bd[ag][0];
      int var16 = bd[ag][1];
      int var17 = bd[an][0];
      int var18 = bd[an][1];
      int var19 = bd[ao][1];
      b(var0, 0, 9, var11, var12);
      av = 1;
      aw = 0;
      if (bz[bq] == 6) {
         if (!bF.equals("0")) {
            a(bF, var0, var1, var3, var4, 3);
         }

         a(c(bD), var0, var1, var5, var6, 3);
         b(var0, L + (bq - m), 0, var7, var8);
         int var29 = 8;
         if (var1 == 360 && var2 == 480) {
            var29 = 39;
         }

         b(var0, 0, var29, var9, var10);
         if (aS == null || !aS.equals("TMUS")) {
            var4 = aw;
            aw = 1;
            var29 = d(0, 10);
            if (g(var1, var2)) {
               var29 = d(0, 35);
            }

            var5 = var1 - g - var29 >> 1;
            if (var2 > var1) {
               var5 = var1;
            }

            a(c(C), var0, var5, var17, var18, 3, true);
            aw = var4;
         }
      } else if (bz[bq] == 7) {
         if (!bG.equals("0")) {
            a(bG, var0, var1, var3, var4, 3);
         }

         a(c(w), var0, var1, var5, var6, 3);
         b(var0, M, 0, var7, var8);
      } else if (bz[bq] == 8) {
         a(c(x), var0, var1, var3, var4, 3);
         a(c(u), var0, var1 * 3 / 4, var5, var6, 3);
         b(var0, N, 0, var7, var8);
      } else {
         av = 1;
         a(c(v), var0, var1, var3, var4, 3);
         a(c(bD), var0, var1 * 3 / 4, var5, var6, 3);
         b(var0, K + bq, 0, var7, var8);
      }

      int var31 = 0;
      if (bq >= m) {
         var31 = 1;
      }

      boolean var37 = false;
      if (bx[var31] > 1) {
         var37 = true;
      }

      if (var37) {
         b(var0, 0, 2, var13, var14);
         b(var0, 0, 3, var15, var16);
      }

      var31 = bd[U][0];
      var5 = bd[U][1];
      var6 = bd[V][0];
      var7 = bd[V][1];
      var8 = bd[ai][0];
      var9 = bd[ai][1];
      var10 = bd[ah][0];
      var11 = bd[ah][1];
      var12 = bd[aj][0];
      var13 = bd[aj][1];
      var14 = bd[W][0];
      var15 = bd[W][1];
      var16 = bd[X][0];
      var17 = bd[X][1];
      var18 = bd[ak][0];
      int var20 = bd[ak][1];
      int var21 = bd[al][0];
      int var22 = bd[al][1];
      int var23 = bd[am][0];
      int var24 = bd[am][1];
      if (bz[bq] != 6 && bz[bq] != 7 && bz[bq] != 8) {
         byte var75 = 17;
         byte var76 = 16;
         if (g(var1, var2)) {
            var75 = 33;
            var76 = 32;
         }

         b(var0, 0, var75, var6, var7);
         b(var0, 0, var76, var31, var5);
         byte var77 = 13;
         byte var78 = 10;
         if (g(var1, var2)) {
            var77 = 37;
            var78 = 35;
         }

         if (bS) {
            var77 = 11;
            if (g(var1, var2)) {
               var77 = 36;
            }
         }

         if (bU) {
            var78 = 11;
            if (g(var1, var2)) {
               var78 = 36;
            }
         }

         b(var0, 0, var78, var8, var9);
         b(var0, 0, var77, var10, var11);
         av = 0;
         if (bU) {
            av = 1;
         }

         a(c(A), var0, var1, var18, var20 - 2, 3);
         var8 = d(0, 19);
         var31 = d(0, 10);
         var5 = e(0, 10);
         if (g(var1, var2)) {
            var31 = d(0, 35);
            var5 = e(0, 35);
         }

         a var79 = bv;
         String var80 = c(B);
         var9 = var31 - var8 - 4;
         short[] var46;
         ay = a.a(var46 = var79.a(var80, var9, false), 0);
         if (var46[0] > 1) {
            ay = var31 - var8 - 8;
         }

         var7 = ay + var8 + 4;
         int var53;
         var7 = (var53 = var31 - var7) < 0 ? 0 : var53 >> 1;
         b(var0, 0, 19, var21 - (var31 >> 1) + var7, var11 + (var5 >> 1) - (e(0, 19) >> 1));
         av = 0;
         if (bS) {
            av = 1;
         }

         if (var46[0] <= 1) {
            a(c(B), var0, var1, var21 - (var31 >> 1) + var7 + var8 + 2, var22 - 2, 6);
         } else {
            byte var55 = -4;
            if (var1 == 320 || var2 == 320) {
               var55 = 4;
            }

            a(c(B), var0, var31 - var8 + var55, var21 + (var8 >> 1), var22 - 2, 3, true);
         }

         av = 0;
      } else {
         int var25 = d(0, 19);
         int var26 = d(0, 10);
         int var27 = e(0, 10);
         if (g(var1, var2)) {
            var26 = d(0, 35);
            var27 = e(0, 35);
         }

         byte var28 = 15;
         byte var58 = 18;
         if (g(var1, var2)) {
            var28 = 31;
            var58 = 34;
         }

         b(var0, 0, var28, var31, var5);
         b(var0, 0, var58, var6, var7);
         byte var33 = 13;
         if (g(var1, var2)) {
            var33 = 37;
         }

         if (bS) {
            var33 = 11;
            if (g(var1, var2)) {
               var33 = 36;
            }
         }

         b(var0, 0, var33, var12, var13);
         av = 0;
         if (bS) {
            av = 1;
         }

         a var10000 = bv;
         String var10001 = c(B);
         var6 = var26 - var25 - 4;
         short[] var40;
         ay = a.a(var40 = var10000.a(var10001, var6, false), 0);
         if (var40[0] > 1) {
            ay = var26 - var25 - 8;
         }

         var6 = ay + var25 + 4;
         var7 = (var7 = var26 - var6) < 0 ? 0 : var7 >> 1;
         b(var0, 0, 19, var23 - (var26 >> 1) + var7, var13 + (var27 >> 1) - (e(0, 19) >> 1));
         if (var40[0] > 1) {
            byte var51 = -4;
            if (var1 == 320 || var2 == 320) {
               var51 = 4;
            }

            a(c(B), var0, var26 - var25 + var51, var23 + (var25 >> 1), var24 - 2, 3, true);
         } else {
            a(c(B), var0, var1, var23 - (var26 >> 1) + var7 + var25 + 2, var24 - 2, 6);
         }
      }

      av = 0;
      a(c(y), var0, var1, var14, var15, 3);
      a(c(z), var0, var1, var16, var17, 3);
      ay = a.a(bv.a(c(z), var1, false), 0);
      b(var0, 0, 29, var16 + (ay >> 1) + 3, var19);
      if (var37) {
         var31 = Math.abs((int)(System.currentTimeMillis() / 80L % 8L) - 4);
         byte var42 = 6;
         byte var47 = 4;
         var7 = var31 + 1;
         var8 = bd[ab][0];
         var9 = bd[ab][1];
         var10 = bd[ac][0];
         var11 = bd[ac][1];
         if (bb || bQ == 23) {
            if (!bT) {
               var42 = 7;
            }

            ba++;
         }

         if (bc || bQ == 24) {
            if (!bT) {
               var47 = 5;
            }

            ba++;
         }

         b(var0, 0, var42, var8 + var7, var9);
         b(var0, 0, var47, var10 - var7, var11);
         if (ba > 4) {
            bb = false;
            bc = false;
            ba = 0;
            bT = false;
         }
      }

      c(var0);
   }

   private static void c(Graphics var0) {
      int var1 = bd[ad][0];
      int var2 = bd[ad][1];
      byte var3 = 0;
      if (bV) {
         var3 = 1;
      }

      b(var0, 0, var3, var1, var2);
   }

   private static void b(Graphics var0, int var1, int var2, int var3, int var4) {
      bu[var1].a(var0, var2, var3, var4, 0);
   }

   private static void a(Graphics var0, int var1, int var2) {
      int var3 = Math.max(0, 0);
      int var4 = Math.max(0, 0);
      var1 = Math.min(var1, bM);
      var2 = Math.min(var2, bN);
      t.b(var0, var3, var4, var2, var1);
   }

   public final void run() {
      new StringBuffer().append("Thread.activeCount() = ").append(Thread.activeCount()).toString();

      while (bk) {
         try {
            if (bl != null) {
               if ((d = bl) != null && d.length() > 0) {
                  be = false;
                  String var1 = d;
                  d = null;
                  new StringBuffer().append("urlPlatformRequest = ").append(var1).toString();

                  try {
                     bf.platformRequest(var1);
                     Thread.sleep(200L);
                  } catch (Exception var2) {
                  }

                  if (!bY) {
                     bo = 1;
                  } else {
                     bo = 4;
                  }
               }

               bl = null;
               if (bY) {
                  bk = false;
               }
            }

            Thread.sleep(1000L);
         } catch (Exception var3) {
         }
      }
   }

   public final void commandAction(Command var1, Displayable var2) {
   }

   private static InputStream c(String var0) {
      return javax.microedition.lcdui.ResourceLoader.open(var0);
   }

   private static a a(int var0, int var1, boolean var2) {
      boolean var3 = true;
      var1 = var1;
      var0 = var0;
      a var4;
      (var4 = new a()).a(t.B(var0));
      if (!bZ[var0]) {
         var3 = false;
         var2 = false;
      }

      for (int var6 = 0; var1 >> var6 != 0; var6++) {
         if ((var1 >> var6 & 1) != 0 && var3) {
            var4.n(var6);
         }
      }

      if (var3 && var2) {
         var4.b();
      }

      return var4;
   }

   private static boolean g(int var0, int var1) {
      return var0 == 240 && (var1 == 320 || var1 == 400 || var1 == 432) || var0 == 360 && (var1 == 640 || var1 == 480);
   }

   static {
      new Hashtable();
   }
}
