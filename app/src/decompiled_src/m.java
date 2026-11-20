import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import java.util.Timer;
import java.util.Vector;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.wireless.messaging.MessageConnection;

public final class m {
   private static MIDlet h = null;
   static int a = -1;
   static String b = "";
   static int c = -1;
   private static String i = "";
   private static long j = -1L;
   private static long k = -1L;
   private static String l = "PaySMS.IAP.Version:1.1.9";
   private static f m;
   private static int n;
   private static boolean o = false;
   private static String[][] p = null;
   private static boolean q = false;
   private static Vector[] r = null;
   private static String[][] s = null;
   private static String[][] t = null;
   private static int[] u = null;
   private static String[][] v = null;
   private static Hashtable w = null;
   private static int x = -1;
   private static Vector y = null;
   private static int z = -1;
   private static String[] A = null;
   private static int B = -1;
   private static String[][] C = null;
   private static String[] D = null;
   private static String E = null;
   private static String F = null;
   private static String G = null;
   private static String H = null;
   private static String I = null;
   private static String J = null;
   private static String K = null;
   private static String L = "";
   private static String M = "";
   private static int N = -1;
   private static String O = "0";
   private static long P = 0L;
   private static long Q = 1L;
   public static final String[] d = new String[]{
      "rmsSMS",
      "Cm1zY2",
      "rmsPackageId",
      "rmsAvailableProfiles",
      "rmsRedeemUnlocked",
      "rmsItemType",
      "rmsUnlocked",
      "rmsMoneySpent",
      "rmsCurrentRegion",
      "rmsCurrentCarrier",
      "Cm1zY1",
      "rmsSMSCnt",
      "rmsLastBillingType",
      "rmsLastAmount"
   };
   private static boolean R = false;
   private static boolean S = false;
   private static boolean T = false;
   private static boolean U = false;
   private static boolean V = false;
   private static boolean W = false;
   private static String X = "";
   private static String Y = "";
   private static String Z = "";
   private static String aa = "";
   private static String ab = "";
   private static String ac = "";
   private static String ad = "";
   private static String ae = "/IAP_profiles";
   private static String af = "/IAP_texts";
   private static String ag = "/IAP_SpecialFlowTexts";
   private static Timer ah = null;
   public static MessageConnection e = null;
   public static boolean f = false;
   public static boolean g = false;
   private static int ai = 0;
   private static int aj = 0;
   private static String ak = "933";
   private static String al = "5023";
   private static String am = "5025";
   private static String an = "";
   private static String ao = "";
   private static String[] ap = new String[]{"Cash", "Coin"};
   private static Vector aq = null;
   private static Vector ar = null;
   private static Vector as = null;
   private static String[] at = null;
   private static boolean au = false;
   private static boolean av = false;
   private static int[] aw = new int[]{100, 110, 120, 130, 140, 150};
   private static int[] ax = new int[]{199, 399, 999, 1999, 2999, 3999};
   private static int ay = 4;
   private static char az = '.';

   private static String a(String var0, int var1) {
      int var2 = 0;
      int var3 = var1;
      int var4 = var0.indexOf(124, 1);

      while (var1 > 0) {
         if (var2 == -1) {
            return null;
         }

         var2 = var4;
         var4 = var0.indexOf(124, var2 + 1);
         var1--;
      }

      if (var2 == -1) {
         return null;
      }

      if (var4 == -1) {
         var4 = var0.length();
      }

      if (var3 > 0) {
         var2++;
      }

      if (var2 == var4) {
         return "";
      }

      if (var2 > var4) {
         return null;
      }

      try {
         char[] var6 = new char[var4 - var2];
         var0.getChars(var2, var4, var6, 0);
         return new String(var6);
      } catch (IndexOutOfBoundsException var5) {
         return null;
      }
   }

   public static void a(String var0, long var1, long var3) {
      i = var0;
      j = var1;
      k = 0L;
      MIDlet var5 = t.ap;
      h = t.ap;
      aj = 0;
      if (y == null) {
         y = new Vector();
      }

      if (t == null) {
         t = H();
      }

      if (w == null) {
         w = F();
      }

      C = K();
      T = L();
      V = M();
      if ((M = N()).equals("")) {
         M = Q();
         a(d[1], M);
      }

      Q = O();
      o = true;
      if (l != null) {
         l = l + "";
      }

      if (!P() && I() == 0 && q && E()) {
         D();
      }

      G();
   }

   private static boolean A() {
      if (m.a()) {
         return false;
      }

      if (m.b) {
         return true;
      }

      String var0 = null;
      if (m.a != null && m.a != "") {
         var0 = a(m.a, 0);

         try {
            if (var0.equals("FAILURE")) {
               n = Integer.parseInt(a(m.a, 1));
               return true;
            }
         } catch (NumberFormatException var2) {
            n = 40;
            if ((var0 = a(m.a, 1)).indexOf("PB") != -1) {
               try {
                  n = Integer.parseInt(var0.substring(2, var0.length()));
               } catch (NumberFormatException var1) {
               }
            }

            return true;
         }

         if (var0.equals("SUCCESS")) {
            M = a(m.a, 2);
            n = 0;
            return true;
         }
      }

      n = 40;
      return true;
   }

   public static boolean a() {
      ay = 6;
      v = new String[17][];
      u = new int[ay + 1];
      String var0;
      boolean var4;
      if ((var0 = k(d[6])) != null && !var0.equals("1") && var0.equals("0")) {
         var4 = false;
         aj = -10;
         Object var1 = null;
      } else {
         h = t.ap;
         String[] var12 = null;
         if ((X = g("IAP-OverrideFromJad")).equals("1")) {
            if ((ad = g("IAP-BillingType").toUpperCase()).equals("HTTP")) {
               if ((ac = g("IAP-BillingURL")).equals("")) {
                  X = "0";
               }
            } else if (!ad.equals("SMS")) {
               X = "0";
            }
         }

         var0 = g("IAP-Version");
         l.substring(l.lastIndexOf(58) + 1).equals(var0);
         boolean var10000;
         if ((I = g("IAP-GameCodeIGP")).length() == 0) {
            var10000 = false;
         } else {
            if ((J = g("IAP-PhoneModel")).length() == 0) {
               J = "5477";
            }

            if ((an = g("IAP-Test")).length() == 0) {
               an = "0";
            }

            if (I() != 0) {
               if (I() == 1) {
                  ao = ak;
               } else if (I() == 2) {
                  ao = al;
               } else {
                  an = "0";
                  ao = "";
               }
            }

            new StringBuffer().append("PaySMS.parseJadFields:iapTestField: ").append(an).append(" useTestProfile: ").append(ao).toString();
            E = g("IAP-DebugNumber");
            if ((var0 = System.getProperty("wireless.messaging.sms.smsc")) != null && var0.length() > 0) {
               G = var0;
            }

            var0 = g("IAP-DebugSMSCenter");
            F = g("IAP-DebugMNC");
            if (!var0.equals("")) {
               G = var0;
            }

            if (!F.equals("")) {
               H = F;
            }

            K = g("Download-Code");
            if (g("IAP-EnableCreditCard").equals("1")) {
               au = true;
            }

            aq = new Vector();
            ar = new Vector();
            as = new Vector();

            for (int var8 = 0; var8 < ap.length; var8++) {
               for (int var13 = 1; var13 <= ay; var13++) {
                  String var2;
                  if ((var2 = g("IAP-ContentID-" + ap[var8] + "-" + var13)) != null && !var2.equals("")) {
                     aq.addElement(var2);
                  }
               }
            }

            new StringBuffer().append("PaySMS.parseJadFields: ValidContentIDs: ").append(aq).toString();
            var12 = null;

            for (int var9 = 0; var9 < aq.size(); var9++) {
               var12 = (String)aq.elementAt(var9);
               boolean var17 = false;

               for (int var3 = var9 + 1; var3 < aq.size(); var3++) {
                  if (aq.elementAt(var3).equals(var12)) {
                     var17 = true;
                     aq.removeElementAt(var3);
                     var3--;
                  }
               }

               if (var17) {
                  aq.removeElementAt(var9);
                  var9--;
               }
            }

            if (aq.size() == 0) {
               var10000 = false;
            } else {
               new StringBuffer().append("PaySMS.parseJadFields: ValidContentIDs: ").append(aq).toString();
               if ((var0 = g("IAP-Profiles")).equals("")) {
                  var10000 = false;
               } else {
                  if (var0.length() > 0 && var0.charAt(var0.length() - 1) != ';') {
                     var0 = var0 + ";";
                  }

                  if ((var12 = i(var0)) == null) {
                     var10000 = false;
                  } else if (!a(var12, j(ae))) {
                     var10000 = au;
                  } else {
                     q = true;
                     var10000 = true;
                  }
               }
            }
         }

         boolean var11 = var10000;
         new StringBuffer().append("PaySMS.checkAvailable:parseJadFields: ").append(var11 ? "true" : "false").toString();
         if (var11 && B()) {
            var4 = true;
         } else {
            var4 = false;
         }
      }

      return var4;
   }

   private static boolean B() {
      boolean var0;
      if (I() != 0) {
         var0 = true;
      } else if (!au || p != null && p.length != 0) {
         if (p.length == 1) {
            var0 = true;
         } else if (p.length > 1) {
            String var1 = p[0][2];
            String var2 = p[0][3];
            var0 = true;

            for (int var3 = 1; var3 < p.length; var3++) {
               String var4 = p[var3][2];
               String var5 = p[var3][3];
               if (!var1.equals(var4) || !var2.equals(var5)) {
                  var0 = false;
                  break;
               }
            }
         } else {
            var0 = false;
         }
      } else {
         var0 = true;
      }

      new StringBuffer().append("PaySMS.checkAvailable:validProfiles: ").append(var0 ? "true" : "false").toString();
      return var0;
   }

   public static boolean b() {
      T = L();
      V = M();
      return T || V;
   }

   public static void a(int var0, String var1, long var2) {
      new StringBuffer()
         .append("PaySMS.sendRequest: start (PricePoint:")
         .append(var0)
         .append(") (Item Type: ")
         .append(var1)
         .append(") (overwriteVirtualCurrency: ")
         .append(0L)
         .append(")")
         .toString();
      c = var0;
      a = e(var0, var1);
      b = var1;
      boolean var4 = false;
      String var5 = "";
      if (X.equals("1")) {
         var5 = ad;
      } else {
         if (I() != 0) {
            p = s;
            if (I() == 1) {
               var5 = "SMS";
            } else if (I() == 2) {
               var5 = "HTTP";
            }

            for (int var23 = 0; var23 < p.length; var23++) {
               if (p[var23][0].equals(ao)) {
                  N = var23;
                  var4 = true;
                  break;
               }
            }
         } else {
            new StringBuffer().append("PaySMS.sendRequest: currentValidProfiles: ").append(y == null ? "null" : "Size: " + y.size()).toString();
            if (y != null && y.size() != 0) {
               N = 0;

               for (int var6 = 0; var6 < y.size(); var6++) {
                  int var7 = (Integer)y.elementAt(var6);

                  try {
                     if (Integer.parseInt(p[var7][14]) == var0) {
                        N = var7;
                        var4 = true;
                        var5 = p[N][6];
                        break;
                     }
                  } catch (Exception var9) {
                     N = 0;
                  }
               }
            } else {
               N = -1;
            }
         }

         new StringBuffer().append("PaySMS.sendRequest: currentProfile: ").append(N).toString();
         if (var4 && N != -1) {
            new StringBuffer()
               .append("PaySMS.sendRequest: Id: ")
               .append(p[N][0])
               .append(" Billing: ")
               .append(p[N][6])
               .append(" Region: ")
               .append(p[N][2])
               .append(" Carrier: ")
               .append(p[N][3])
               .append(" Pricepoint: ")
               .append(p[N][14])
               .toString();
         }
      }

      if (o) {
         new StringBuffer().append("creditCardEnabled: ").append(au).toString();
         if (0L > 0L) {
            P = 0L;
         } else {
            P = a(var0, var1);
         }

         if (var4 && var5.equals("SMS")) {
            R = true;
            T = false;
            a(d[0], "0");
            L = "";
            if (X.equals("1")) {
               aa = g("IAP-Alias-PP" + c);
            } else {
               aa = "";
            }

            if (!aa.equals("")) {
               d(aa);
            } else if (N != -1 && !p[N][10].equals("")) {
               d(p[N][10]);
            }

            if (p[N][12].equals("7")) {
               d("UNLOCK");
            } else {
               d("INAPP");
            }

            d("V016");
            d(I);
            d(M);
            d(J);
            if (X.equals("1")) {
               Z = g("IAP-ProfileID-PP" + c);
            } else {
               Z = "";
            }

            if (!Z.equals("")) {
               d(Z);
            } else {
               if (N == -1) {
                  aj = 7;
                  return;
               }

               d(p[N][0]);
            }

            if (!i.equals("")) {
               d(i);
            } else {
               d("EN");
            }

            if (p[N][12].equals("7")) {
               d("7");
            } else {
               d("1");
            }

            String var16;
            if (!(var16 = g("IAP-ContentID-" + b + "-" + c)).equals("")) {
               d(var16);
               d(K);
               d(O);
               d(P + "");
               d("ct" + Q);
               L.trim();
               new StringBuffer().append("PaySMS.sendSMS: smsContent: ").append(L).toString();
               U = true;
               new n().start();
            } else {
               new StringBuffer()
                  .append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-")
                  .append(b)
                  .append("-")
                  .append(c)
                  .append(" missing in JAD")
                  .toString();
               aj = -2;
            }
         } else if (var4 && var5.equals("HTTP")) {
            m = new f(false);
            String var10;
            if (X.equals("1")) {
               var10 = ac;
               var1 = Z = g("IAP-ProfileID-PP" + c);
            } else {
               if (N == -1) {
                  aj = 7;
                  return;
               }

               var10 = p[N][11];
               var1 = p[N][0];
            }

            if (!var10.equals("") && !var1.equals("")) {
               new StringBuffer().append("PaySMS.sendHTTP: URL = ").append(var10).toString();
               if (!var10.startsWith("http://")) {
                  var10 = "http://" + var10;
               }

               if (!var10.endsWith("?")) {
                  var10 = var10 + "?";
               }

               String var19;
               if ((var19 = g("IAP-ContentID-" + b + "-" + c)).equals("")) {
                  new StringBuffer()
                     .append("PaySMS.sendHTTP:Error: Wrong Item. IAP-ContentID-")
                     .append(b)
                     .append("-")
                     .append(c)
                     .append(" missing in JAD")
                     .toString();
                  aj = -2;
               } else {
                  String var24 = J;
                  var5 = K;
                  String var21 = M;
                  String var3 = I;
                  String var20 = var1;
                  var1 = var19;
                  String var11 = var10;
                  m.b();
                  String var25 = "%7C";
                  String var8 = var11;
                  String var12 = "b=contentpurchase" + var25 + var3 + var25;
                  String var13 = var12 + var1 + var25 + var20 + var25;
                  String var14 = var13 + var21;
                  if (!var5.equals("")) {
                     var14 = var14 + "&d=" + var5;
                  }

                  String var15 = var14 + "&phoneId=" + var24;
                  n = -100;
                  m.a(var8, var15, 0);
                  a(d[1], M);
                  a(d[2], String.valueOf(a));
                  a(d[5], b);
                  a(d[12], "http_2d");
                  a(d[13], P + "");
                  if (!X.equals("1")) {
                     b(y);
                  }

                  ai = 1;
               }
            } else {
               aj = 4;
            }
         } else if (au && N == -1) {
            c(var0, var1);
         } else if (au) {
            c(var0, var1);
         } else {
            aj = -2;
         }
      }
   }

   public static void c() {
      V = true;
      a(d[4], "1");
      int var0 = f();
      String var1 = h();
      a(b(var0, var1), var1, 0L);
   }

   public static int d() {
      T = L();
      V = M();
      if (W) {
         W = false;
         return 7;
      }

      if (!o) {
         return 0;
      }

      if (T) {
         return 2;
      }

      if (U) {
         return 1;
      }

      if (!R && !V) {
         if (ai == 1) {
            if (A()) {
               ai = 0;
               int var0;
               if ((var0 = m.a() ? -1 : (m.b ? -2 : n)) == 0) {
                  if (a(Integer.parseInt(M))) {
                     aj = 0;
                     C();
                     return 7;
                  } else {
                     aj = 1;
                     C();
                     return 3;
                  }
               } else if (var0 == -2) {
                  aj = -1;
                  C();
                  return 3;
               } else {
                  aj = var0;
                  C();
                  return 3;
               }
            } else {
               return 1;
            }
         } else {
            if (!X.equals("1") && I() == 0) {
               if (aj != 0) {
                  return 3;
               }

               if ((y == null || y.size() <= 0) && (!au || q)) {
                  if (B < 0) {
                     aj = -3;
                     return 3;
                  }

                  if (y.size() <= 0) {
                     aj = -3;
                     return 3;
                  }
               }
            }

            return 6;
         }
      } else if (V) {
         R = false;
         T = true;
         a(d[0], "1");
         return 8;
      } else {
         C();
         return 3;
      }
   }

   public static int e() {
      return aj;
   }

   public static int f() {
      String var0;
      if ((var0 = k(d[2])) != null && var0.length() != 0) {
         try {
            var2 = Integer.parseInt(var0);
         } catch (Exception var1) {
            var2 = -1;
         }

         return var2;
      } else {
         return -1;
      }
   }

   public static boolean a(int var0) {
      boolean var1 = false;
      if ((M = N()) != null && M.length() > 0) {
         String var2 = String.valueOf(var0);
         int var4 = Integer.parseInt(M) ^ 53412;
         var1 = var2.equals(String.valueOf(var4));
      }

      new StringBuffer().append("PaySMS.verifyRequest: inputCode: ").append(var0).append(" ").append(var1 ? "Unlocked" : "Still Locked").toString();
      if (var1) {
         try {
            String var12 = k(d[7]);
            String var17 = "0";
            if (var12 != null && !var12.equals("")) {
               var17 = var12.substring(0, var12.indexOf(95));
            }

            var0 = f();
            String var3 = h();
            var0 = b(var0, var3);
            var3 = a(0, var0);
            String var15 = a(9, var0);
            String var21 = var15;
            var17 = var17.replace(',', '.');
            var21 = var21.replace(',', '.');
            long var5 = m(var17);
            long var7 = m(var21);
            String var10 = var21;
            char var16 = var17.indexOf(az) == -1 && var10.indexOf(az) == -1 ? ' ' : az;
            long var9 = var5 + var7;
            var17 = var16 == ' ' ? var9 / 100000L + "" : "" + var9 / 100000L + var16 + var9 % 100000L;
            new StringBuffer().append("totalMoneySpent : ").append(var17).append("  profileID: ").append(var3).toString();
            a(d[7], var17 + "_" + var3);
         } catch (Exception var11) {
            new StringBuffer().append("Exception : ").append(var11).toString();
         }

         aj = 0;
         if (!h(f()).equals("http_2d")) {
            W = true;
         }

         C();
      }

      return var1;
   }

   private static void C() {
      U = false;
      R = false;
      o = false;
      a(d[1], "");
      T = false;
      a(d[0], "0");
      V = false;
      a(d[4], "0");
      av = false;
   }

   public static void g() {
      S = true;
      x = -1;
      B = -1;
      y = null;
      W = false;
      a(d[2], "");
      a(d[5], "");
      a(d[13], "");
      a(d[3], "");
      a(d[8], "");
      a(d[9], "");
      H = null;
      C();
   }

   private static boolean D() {
      if (y == null) {
         y = new Vector();
      }

      if (y.size() == 1) {
         Integer var10000 = (Integer)y.elementAt(0);
         Object var12 = null;
         N = var10000;
         new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, detected profile: ").append(N).toString();
         return true;
      }

      z = -1;
      N = -1;
      y.removeAllElements();
      String[][] var0;
      A = new String[(var0 = e(C[B][0])).length];
      String[] var1 = new String[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         A[var2] = var0[var2][0];
         var1[var2] = var0[var2][1];
      }

      A = a(A);
      var1 = a(var1);
      new StringBuffer().append("PaySMS.detectCarrier: currentIDS ").append(var1.length).append(", currentCarriers = ").append(A.length).toString();
      if (var1.length == 1) {
         z = 0;
         int var17 = 0;

         while (var17 < p.length && !p[var17][0].equals(var1[0])) {
            var17++;
         }

         boolean var10 = false;
         if (p[var17][1].toLowerCase().indexOf("open market") != -1) {
            boolean var11 = !S;
            new StringBuffer().append("PaySMS.detectCarrier:currentIDS.length == 1 isOpenMarket").append(var11).toString();
         }

         if (p[var17][0].equals(var1[0])) {
            y.addElement(new Integer(var17));
         }

         new StringBuffer()
            .append("PaySMS.detectCarrier: Carrier selection skipped, only one profile. currentValidProfiles.size() ")
            .append(y.size())
            .toString();
         return true;
      } else if (A.length == 1) {
         z = 0;
         new StringBuffer().append("PaySMS.detectCarrier: Carrier selection skipped, only one carrier: ").append(A[z]).toString();

         for (int var16 = 0; var16 < p.length; var16++) {
            if (p[var16][2].indexOf(C[B][0]) != -1) {
               for (int var9 = 0; var9 < r[var16].size(); var9++) {
                  if (((String)r[var16].elementAt(var9)).indexOf(A[z]) != -1) {
                     y.addElement(new Integer(var16));
                  }
               }
            }
         }

         new StringBuffer().append("PaySMS.detectCarrier: currentValidProfiles.size =  ").append(y.size()).toString();
         return true;
      } else {
         if (A.length > 0) {
            String[][] var15 = new String[var1.length][2];
            boolean var5 = !S;

            for (int var3 = 0; var3 < var1.length; var3++) {
               new StringBuffer().append("PaySMS.detectCarrier: currentIDS[").append(var3).append("]= ").append(var1[var3]).toString();

               for (int var4 = 0; var4 < p.length; var4++) {
                  if (p[var4][0].equals(var1[var3])) {
                     var15[var3][0] = p[var4][3];
                     var15[var3][1] = "" + var4;
                     new StringBuffer().append("PaySMS.detectCarrier: is Openmarket???? ").append(p[var4][1]).toString();
                     if (p[var4][1].toLowerCase().indexOf("open market") == -1) {
                        var5 = false;
                     }
                     break;
                  }
               }
            }

            boolean var18 = true;

            for (int var19 = 1; var19 < var15.length; var19++) {
               if (!var15[var19][0].equals(var15[var19 - 1][0])) {
                  var18 = false;
                  new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles[i] ").append(var15[var19][0]).toString();
                  new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles[i-1] ").append(var15[var19 - 1][0]).toString();
               }
            }

            new StringBuffer().append("PaySMS.detectCarrier: multiCarrierProfiles: ").append(var18).append(", isOpenMarket: ").append(var5).toString();
            if (var18) {
               for (int var21 = 0; var21 < var1.length; var21++) {
                  for (int var8 = 0; var8 < p.length; var8++) {
                     if (p[var8][0].equals(var1[var21])) {
                        y.addElement(new Integer(var8));
                        break;
                     }
                  }
               }

               new StringBuffer()
                  .append("PaySMS.detectCarrier: Dont auto skip carrier selection(except OpenMarket). currentValidProfiles.size() ")
                  .append(y.size())
                  .toString();
               new StringBuffer().append("PaySMS.detectCarrier: More than one carrier, but multicarrier profiles: ").append(var15[0][0]).toString();
               return true;
            }

            int var20 = A.length;

            for (int var6 = 0; var6 < var20; var6++) {
               A[var6] = A[var6].trim();
            }

            int[] var7 = new int[var20];

            for (int var14 = 0; var14 < var20; var14++) {
               var7[var14] = var14;
               new StringBuffer().append("PaySMS.detectCarrier: carrierNames[").append(var14).append("]: ").append(A[var14]).toString();
            }
         }

         return false;
      }
   }

   private static boolean E() {
      if (x != -1) {
         B = x;
         return true;
      }

      B = -1;
      N = -1;
      y = null;
      D = new String[C.length];

      for (int var0 = 0; var0 < D.length; var0++) {
         D[var0] = C[var0][0];
      }

      if (D.length != 1 || G != null && x != -1) {
         if (G != null && x != -1) {
            B = x;
            new StringBuffer().append("PaySMS.detectRegion: Region selection skipped, region auto-detected: ").append(x).toString();
            return true;
         }

         int var4 = D.length;

         for (int var1 = 0; var1 < var4 - 1; var1++) {
            for (int var2 = var1 + 1; var2 < var4; var2++) {
               if (D[var1].compareTo(D[var2]) > 0) {
                  String var3 = D[var1];
                  D[var1] = D[var2];
                  D[var2] = var3;
               }
            }
         }

         return false;
      } else {
         B = 0;
         x = 0;
         new StringBuffer().append("PaySMS.detectRegion: Region selection skipped, only one region: ").append(D[B]).toString();
         return true;
      }
   }

   private static void c(int var0, String var1) {
      new StringBuffer().append("PaySMS.sendRequest CREDIT CARD: Pricepoint:").append(var0).append(" Type:").append(var1).toString();
      String var2 = at[11];
      String var3;
      if ((var3 = g("IAP-ContentID-" + var1 + "-" + var0)).equals("")) {
         new StringBuffer().append("PaySMS.sendCCARD: Wrong Item. IAP-ContentID-").append(var1).append("-").append(var0).append(" missing in JAD").toString();
         aj = -2;
      } else {
         new StringBuffer().append("PaySMS.sendCCARD, unlockCode: ").append(M).toString();
         var1 = "";
         var1 = var1 + "?igpcode=" + I;
         var1 = var1 + "&content_id=" + var3;
         var1 = var1 + "&tier=" + var0;
         String var4 = var3 + "gameloft|0Ft$23#?a" + var0;
         var1 = var1 + "&stamp=" + b.a(t.b(t.a(M.getBytes(), var4)));
         var1 = var1 + "&d=" + K;
         String var5 = var2 + var1;
         new StringBuffer().append("PaySMS.sendRequest CREDIT CARD: ").append(var5).toString();
         a(d[12], "cc_2d");
         a(d[0], "1");
         a(d[1], M);
         a(d[2], String.valueOf(a));
         a(d[5], b);
         a(d[13], P + "");
         String var6;
         if ((var6 = var5) != null) {
            t.a(var6);
         }
      }
   }

   private static void d(String var0) {
      if (var0 != null) {
         L = L + var0 + " ";
      }
   }

   private static String[][] e(String var0) {
      Vector var2 = new Vector();

      for (int var3 = 0; var3 < p.length; var3++) {
         if (p[var3][2].indexOf(var0) != -1) {
            for (int var4 = 0; var4 < r[var3].size(); var4++) {
               String var5 = (String)r[var3].elementAt(var4);
               String var6 = p[var3][0];
               if (var5 != null) {
                  int var1;
                  if ((var1 = var5.indexOf(40)) == -1) {
                     var1 = var5.length();
                  }

                  new StringBuffer().append("PaySMS.getProfilesCarrierAndIds: regionName = ").append(var0).append(", carrierName = ").append(var5).toString();
                  if ((H == null || c(var5, H)) && !var2.contains(var5.substring(0, var1))) {
                     var2.addElement(new String[]{var5.substring(0, var1), var6});
                     new StringBuffer().append("PaySMS.getProfilesCarrierAndIds: carrierName = ").append(var5.substring(0, var1)).toString();
                     if (H != null) {
                        a(d[9], new String(var5.substring(0, var1)));
                     }
                  }
               }
            }
         }
      }

      String[][] var7 = new String[var2.size()][2];
      var2.copyInto(var7);
      return var7;
   }

   public static String b(int var0) {
      return g(var0);
   }

   private static String g(int var0) {
      new StringBuffer().append("PaySMS.getPrice: begin (").append(var0).append(")").toString();
      if (X.equals("1")) {
         return (ab = g("IAP-Price-PP" + var0)).equals("") ? null : ab;
      }

      new StringBuffer().append("PaySMS.getPrice: currentValidProfiles: ").append(y == null ? "NULL" : "Size: " + y.size()).toString();
      if (y == null) {
         return au ? " " : null;
      }

      int var1 = -1;
      if (I() == 0) {
         for (int var2 = 0; var2 < y.size(); var2++) {
            int var3 = (Integer)y.elementAt(var2);

            try {
               if (Integer.parseInt(p[var3][14]) == var0) {
                  var1 = var3;
                  break;
               }
            } catch (Exception var4) {
            }
         }
      } else {
         for (int var5 = 0; var5 < s.length; var5++) {
            if (s[var5][0].equals(ao)) {
               return s[var5][9];
            }
         }
      }

      new StringBuffer().append("PaySMS.getPrice: profileIndex: ").append(var1).toString();
      if (var1 == -1) {
         return au ? " " : null;
      } else {
         return p[var1][4];
      }
   }

   public static long a(int var0, String var1) {
      new StringBuffer().append("PaySMS.getVirtualCurrency: begin pricepoint: ").append(var0).append(", itemType: ").append(var1).toString();
      long var2 = 0L;
      long var6 = 0L;
      if (var1.equals("Cash")) {
         var6 = j;
      } else if (var1.equals("Coin")) {
         var6 = k;
      }

      if (I() == 0 && y != null && y.size() > 0) {
         for (int var10 = 0; var10 < y.size(); var10++) {
            int var13 = (Integer)y.elementAt(var10);

            try {
               if (Integer.parseInt(p[var13][14]) == var0) {
                  var2 = var6 * Long.parseLong(p[var13][16]) / 10000000L;
                  long var14 = var6 * Long.parseLong(p[var13][16]) % 10000000L;
                  var2 += var14 / 5000000L;
                  break;
               }
            } catch (Exception var8) {
            }
         }
      } else {
         var2 = var6 * ax[var0 - 1] * aw[var0 - 1] / (ax[0] * 100);
         long var4 = var6 * ax[var0 - 1] * aw[var0 - 1] % (ax[0] * 100);
         var2 += var4 / (ax[0] * 100 >> 1);
      }

      int var11 = ("" + var2).length();
      byte var15 = 1;
      if (var11 == 2) {
         var15 = 2;
      } else if (var11 > 2) {
         var15 = 5;

         for (int var9 = 0; var9 < var11 - 3; var9++) {
            var15 *= 10;
         }
      }

      new StringBuffer().append("currency:\t").append(var2).append("\tRound Up:\t").append(var15).toString();
      if (var2 % var15 != 0L) {
         var2 = (var2 / var15 + 1L) * var15;
      }

      new StringBuffer().append("Rounded currency:\t").append(var2).toString();
      return var2;
   }

   private static String a(int var0, int var1) {
      if (I() == 0) {
         for (int var2 = 0; var2 < y.size(); var2++) {
            int var3 = (Integer)y.elementAt(var2);
            if (p[var3][14].equals(String.valueOf(var1))) {
               return p[var3][var0];
            }
         }
      } else {
         for (int var4 = 0; var4 < s.length; var4++) {
            if (s[var4][0].equals(ao)) {
               return s[var4][var0];
            }
         }
      }

      return "";
   }

   public static String c(int var0) {
      return h(var0);
   }

   private static String h(int var0) {
      if (I() != 0) {
         if (I() == 1) {
            return "sms_2d";
         }

         if (I() == 2) {
            return "http_2d";
         }

         if (I() == 3) {
            return "cc_2d";
         }
      }

      new StringBuffer().append("PaySMS.GetBillingType: currentValidProfiles: ").append(y == null ? "NULL" : "Size: " + y.size()).toString();
      if (y == null) {
         return "cc_2d";
      }

      int var1 = 0;
      boolean var2 = false;

      for (int var3 = 0; var3 < y.size(); var3++) {
         int var4 = (Integer)y.elementAt(var3);

         try {
            if (Integer.parseInt(p[var4][14]) == var0) {
               var1 = var4;
               var2 = true;
               break;
            }
         } catch (Exception var5) {
         }
      }

      if (!var2) {
         return "cc_2d";
      } else if (p[var1][6].equals("SMS")) {
         return "sms_2d";
      } else {
         return p[var1][6].equals("HTTP") ? "http_2d" : null;
      }
   }

   public static String d(int var0) {
      return i(var0);
   }

   private static String i(int var0) {
      new StringBuffer().append("PaySMS.GetTermsAndConditions: begin (").append(var0).append(")").toString();
      new StringBuffer().append("PaySMS.GetTermsAndConditions: currentValidProfiles: ").append(y == null ? "NULL" : "Size: " + y.size()).toString();
      if (y == null) {
         return " ";
      }

      String var1 = null;
      String var2 = null;
      if (I() == 0) {
         for (int var3 = 0; var3 < y.size(); var3++) {
            int var4 = (Integer)y.elementAt(var3);

            try {
               if (Integer.parseInt(p[var4][14]) == var0) {
                  var1 = p[var4][13];
                  var2 = p[var4][15];
                  break;
               }
            } catch (Exception var5) {
            }
         }
      } else {
         for (int var6 = 0; var6 < s.length; var6++) {
            if (s[var6][0].equals(ao)) {
               var1 = s[var6][13];
               break;
            }
         }
      }

      new StringBuffer().append("PaySMS.GetTermsAndConditions: tncID = '").append(var1).append("'").toString();
      String var7 = f(var1);
      new StringBuffer().append("PaySMS.GetTermsAndConditions: tnc = '").append(var7).append("'").toString();
      new StringBuffer().append("PaySMS.GetTermsAndConditions: supportNumber = '").append(var2).append("'").toString();
      var7 = b(var7, var2);
      new StringBuffer().append("PaySMS.GetTermsAndConditions: tnc without phone number = '").append(var7).append("'").toString();
      return var7;
   }

   private static String[] d(int var0, String var1) {
      String var2 = var0 + "_" + var1.toUpperCase();
      String var3 = null;
      if (w == null) {
         return null;
      }

      if (var2 != null) {
         var3 = (String)w.get(var2);
      }

      if (var3 == null) {
         new StringBuffer().append("***[PaySMS.getCurrentSPTexts]*** do not support ").append(var1).append(". Try with LANG EN").toString();
         if ((var3 = (String)w.get(var0 + "_" + "EN")) == null) {
            return null;
         }
      }

      var0 = var3.indexOf(59);
      Vector var6 = new Vector();

      while (var0 != -1) {
         new StringBuffer().append("listID = ").append(var3).toString();
         if ((var2 = var3.substring(0, var0)) != null) {
            var6.addElement((String)w.get(var2));
         }

         if ((var3 = var3.substring(var0 + 1)) != null) {
            var0 = var3.indexOf(59);
         }
      }

      String[] var8 = new String[var6.size()];
      var6.copyInto(var8);

      for (int var5 = 0; var5 < var8.length; var5++) {
         new StringBuffer().append("getCurrentSPTexts curText[ ").append(var5).append("] =").append(var8[var5]).toString();
      }

      return var8;
   }

   private static Hashtable F() {
      String[] var0;
      if ((var0 = j(ag)) == null) {
         return null;
      }

      Hashtable var1 = new Hashtable();

      for (int var2 = 0; var2 < var0.length; var2++) {
         int var3;
         if ((var3 = var0[var2].indexOf(59)) != -1) {
            var1.put(new String(var0[var2].substring(0, var3)), new String(var0[var2].substring(var3 + 1)));
            new StringBuffer()
               .append("PaySMS.loadSpecialFlowTextFile: ID: ")
               .append(var0[var2].substring(0, var3))
               .append(" TEXT: ")
               .append(var0[var2].substring(var3 + 1))
               .toString();
         }
      }

      return var1;
   }

   public static int a(String var0) {
      if (var0.equals("Cash")) {
         return ar.size();
      } else {
         return var0.equals("Coin") ? as.size() : -1;
      }
   }

   private static void G() {
      ar.removeAllElements();
      as.removeAllElements();
      if (I() == 0 && y != null && y.size() > 0) {
         new StringBuffer().append("PaySMS.parseValidItems: IAP_TEST_FIELD_NONE ").append(y.size()).toString();

         for (int var4 = 0; var4 < y.size(); var4++) {
            int var1 = (Integer)y.elementAt(var4);
            int var2 = Integer.parseInt(p[var1][14]);
            u[var2] = Integer.parseInt(p[var1][8]);
            if (f(var2, "Cash")) {
               ar.addElement(new Integer(var2));
            }

            if (f(var2, "Coin")) {
               as.addElement(new Integer(var2));
            }
         }
      } else if (au || I() != 0) {
         new StringBuffer().append("PaySMS.parseValidItems: IAP_TEST_FIELD or CC. creditCardEnabled = ").append(au).toString();

         for (int var0 = 1; var0 <= ay; var0++) {
            if (f(var0, "Cash")) {
               ar.addElement(new Integer(var0));
            }

            if (f(var0, "Coin")) {
               as.addElement(new Integer(var0));
            }

            if (au) {
               u[var0] = 0;
            } else {
               u[var0] = 8;
            }
         }
      }

      for (int var5 = 0; var5 < ar.size() - 1; var5++) {
         for (int var8 = var5 + 1; var8 < ar.size(); var8++) {
            int var11 = (Integer)ar.elementAt(var5);
            int var3 = (Integer)ar.elementAt(var8);
            if (var11 > var3) {
               ar.setElementAt(new Integer(var3), var5);
               ar.setElementAt(new Integer(var11), var8);
            }
         }
      }

      for (int var6 = 0; var6 < as.size() - 1; var6++) {
         for (int var9 = var6 + 1; var9 < as.size(); var9++) {
            int var12 = (Integer)as.elementAt(var6);
            int var13 = (Integer)as.elementAt(var9);
            if (var12 > var13) {
               as.setElementAt(new Integer(var13), var6);
               as.setElementAt(new Integer(var12), var9);
            }
         }
      }

      new StringBuffer().append("PaySMS.parseValidItems: number of cash: ").append(ar.size()).toString();
      new StringBuffer().append("PaySMS.parseValidItems: number of coin: ").append(as.size()).toString();

      for (int var7 = 1; var7 < u.length; var7++) {
         int var10 = u[var7];
         new StringBuffer().append("PaySMS.parseValidItems: flow ").append(var10).append(", unlockLanguage ").append(i).toString();
         if (v[var10] == null) {
            v[var10] = d(var10, i);
         }
      }
   }

   public static int b(int var0, String var1) {
      new StringBuffer().append("PaySMS.getPricePoint: itemIndex").append(var0).append(", itemType ").append(var1).toString();
      if (var1.equals("Cash") && var0 <= ar.size()) {
         return (Integer)ar.elementAt(var0);
      } else {
         return var1.equals("Coin") && var0 <= as.size() ? (Integer)as.elementAt(var0) : -1;
      }
   }

   private static int e(int var0, String var1) {
      int var2 = -1;
      if (var1.equals("Cash")) {
         for (int var3 = 0; var3 < ar.size(); var3++) {
            if ((Integer)ar.elementAt(var3) == var0) {
               var2 = var3;
               break;
            }
         }
      } else if (var1.equals("Coin")) {
         for (int var4 = 0; var4 < as.size(); var4++) {
            if ((Integer)as.elementAt(var4) == var0) {
               var2 = var4;
               break;
            }
         }
      }

      return var2;
   }

   private static boolean f(int var0, String var1) {
      String var2 = g("IAP-ContentID-" + var1 + "-" + var0);
      boolean var3 = false;
      if (aq.contains(var2)) {
         var3 = true;
      }

      new StringBuffer()
         .append("PaySMS.isValidContentID: IAP-ContentID-")
         .append(var1)
         .append("-")
         .append(var0)
         .append(": ")
         .append(var2)
         .append(var3 ? " - Valid" : " - Invalid")
         .toString();
      return var3;
   }

   private static String f(String var0) {
      new StringBuffer().append("PaySMS.retrieveTermsAndConditions: id = '").append(var0).append("'").toString();
      if (var0 != null && var0.length() != 0) {
         for (int var1 = 0; var1 < t.length; var1++) {
            new StringBuffer()
               .append("PaySMS.retrieveTermsAndConditions: profilesTexts[")
               .append(var1)
               .append("][TEXT_PROFILE_ID] = '")
               .append(t[var1][0])
               .append("'")
               .toString();
            if (d(t[var1][0], var0)) {
               return t[var1][1];
            }
         }

         return "";
      } else {
         return "";
      }
   }

   private static String b(String var0, String var1) {
      if (var0 != null && !var0.equals("")) {
         try {
            int var2 = var0.indexOf("<phone>");
            int var3 = var0.indexOf("</phone>", var2 + "<phone>".length());
            String var4 = var0.substring(0, var2);
            String var8 = var0.substring(var2 + "<phone>".length(), var3);
            String var11 = var0.substring(var3 + "</phone>".length(), var0.length());
            String var9;
            if (var1 != null && !var1.equals("")) {
               int var5 = var8.indexOf("<support_number>");
               int var6 = "<support_number>".length();
               String var10 = var8.substring(0, var5) + var1 + var8.substring(var5 + var6, var8.length());
               var9 = var4 + var10 + var11;
            } else {
               var9 = var4 + var11;
            }

            return var9;
         } catch (Exception var7) {
            return var0;
         }
      } else {
         return null;
      }
   }

   private static String[][] H() {
      String[] var0;
      if ((var0 = j(af)) == null) {
         return null;
      }

      String[][] var1 = new String[var0.length][2];

      for (int var2 = 0; var2 < var0.length; var2++) {
         int var3;
         if ((var3 = var0[var2].indexOf(59)) != -1) {
            var1[var2][0] = var0[var2].substring(0, var3);
            var1[var2][1] = var0[var2].substring(var3 + 1, var0[var2].length());
         }
      }

      for (int var4 = 0; var4 < var1.length; var4++) {
         new StringBuffer().append("PaySMS.loadSpecificTextsFile: ID: ").append(var1[var4][0]).append(" TEXT: ").append(var1[var4][1]).toString();
      }

      return var1;
   }

   private static String g(String var0) {
      if ((var0 = h.getAppProperty(var0)) == null) {
         var0 = "";
      }

      return var0;
   }

   private static int I() {
      if (an.equals("0")) {
         return 0;
      } else if (an.equals("1")) {
         return 1;
      } else {
         return an.equals("2") ? 2 : 0;
      }
   }

   private static boolean a(String[] var0, String[] var1) {
      int var10 = null;
      if (var1 == null) {
         aj = 8;
         return false;
      }

      for (int var2 = 0; var2 < var1.length; var2++) {
         new StringBuffer().append("PaySMS.loadProfileConfiguration: profilesArgs[").append(var2).append("]: ").append(var1[var2]).toString();
      }

      String[] var16 = var0;
      int var3 = 0;
      int[] var4 = new int[var1.length];
      String[][] var5 = new String[var1.length][17];
      int var6 = 0;
      int[] var7 = new int[var1.length];

      for (int var8 = 0; var8 < var1.length; var8++) {
         int var12 = 0;

         for (int var9 = 0; var9 < 16; var9++) {
            var10 = var1[var8].indexOf(";", var12);
            String var13 = var1[var8].substring(var12, var10);
            var5[var8][var9] = var13;
            var12 = var10 + 1;
         }

         if (h(var5[var8][0])) {
            var7[var6++] = var8;
         }

         String var10000 = var5[var8][6];
         var10 = null;
         if (var10000.equals("CC")) {
            at = var5[var8];
         }

         for (int var20 = 0; var20 < var16.length; var20++) {
            String var14;
            if ((var14 = var16[var20]) != null && var14.length() != 0 && var5[var8][0].equals(var14)) {
               if (!h(var5[var8][0]) && !var5[var8][6].equals("CC")) {
                  var4[var3++] = var8;
                  var16[var20] = null;
               }
               break;
            }
         }
      }

      if (var6 != 0) {
         s = new String[var6][];

         for (int var17 = 0; var17 < s.length; var17++) {
            s[var17] = var5[var7[var17]];
         }
      }

      if (var3 == 0) {
         return false;
      }

      p = new String[var3][];

      for (int var18 = 0; var18 < p.length; var18++) {
         p[var18] = var5[var4[var18]];
      }

      try {
         for (int var19 = 0; var19 < var3; var19++) {
            String var21 = p[var19][9];
            String var24 = p[var19][7];
            int var15 = Integer.parseInt(p[var19][14]);
            if (var24 != null) {
               p[var19][16] = "" + m(var21) * (100 + Integer.parseInt(p[var19][5])) * 100000L / m(var24);
               new StringBuffer().append("bonus    ").append(100 + Integer.parseInt(p[var19][5])).append(", tier ").append(var15).toString();
            }

            new StringBuffer()
               .append("profile Id :\t")
               .append(p[var19][0])
               .append("\tTier:\t")
               .append(var15)
               .append("\tRatios :\t")
               .append(p[var19][16])
               .toString();
         }
      } catch (Exception var11) {
      }

      J();
      return true;
   }

   private static void J() {
      int var0 = p.length;
      if (at != null) {
         var0++;
      }

      r = new Vector[var0];

      for (int var4 = 0; var4 < p.length; var4++) {
         r[var4] = new Vector();
         String var1 = p[var4][3];
         new StringBuffer().append("PaySMS.parseMultipleCarriers: Carriers - Profile: ").append(p[var4][0]).toString();
         int var2 = 0;
         int var3;
         if ((var3 = var1.indexOf("¬", 0)) == -1) {
            r[var4].addElement(var1);
            new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var1).toString();
         } else {
            while (var3 != -1) {
               r[var4].addElement(var1.substring(var2, var3));
               new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var1.substring(var2, var3)).toString();
               var2 = var3 + 1;
               var3 = var1.indexOf("¬", var2);
            }

            r[var4].addElement(var1.substring(var2, var1.length()));
            new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var1.substring(var2, var1.length())).toString();
         }

         new StringBuffer().append("\tSize: ").append(r[var4].size()).toString();
      }

      if (at != null) {
         r[p.length] = new Vector();
         String var5 = at[3];
         new StringBuffer().append("PaySMS.parseMultipleCarriers: Carriers - Profile: ").append(at[0]).toString();
         int var6 = 0;
         int var7;
         if ((var7 = var5.indexOf("¬", 0)) == -1) {
            r[p.length].addElement(var5);
            new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var5).toString();
         } else {
            while (var7 != -1) {
               r[p.length].addElement(var5.substring(var6, var7));
               new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var5.substring(var6, var7)).toString();
               var6 = var7 + 1;
               var7 = var5.indexOf("¬", var6);
            }

            r[p.length].addElement(var5.substring(var6, var5.length()));
            new StringBuffer().append("PaySMS.parseMultipleCarriers: \t\t").append(var5.substring(var6, var5.length())).toString();
         }

         new StringBuffer().append("\tSize: ").append(r[p.length].size()).toString();
      }
   }

   private static boolean h(String var0) {
      return var0.equals(ak) || var0.equals(al) || var0.equals(am);
   }

   private static String[] i(String var0) {
      if (var0 == null) {
         return null;
      }

      Vector var1 = new Vector();
      int var2 = 0;

      while (var2 < var0.length()) {
         int var3;
         if ((var3 = var0.indexOf(59, var2)) != -1) {
            var1.addElement(var0.substring(var2, var3));
            var2 = var3 + 1;
         } else {
            var2 = var0.length();
         }
      }

      String[] var4 = new String[var1.size()];
      var1.copyInto(var4);
      return var4;
   }

   private static String[] j(String var0) {
      InputStream var1 = javax.microedition.lcdui.ResourceLoader.open(var0);
      String var2 = null;

      try {
         ByteArrayOutputStream var8 = new ByteArrayOutputStream(2048);
         byte[] var3 = new byte[256];

         int var4;
         while ((var4 = var1.read(var3)) != -1) {
            var8.write(var3, 0, var4);
         }

         var1.close();
         var3 = var8.toByteArray();
         var8.close();
         var2 = new String(var3, 0, var3.length, "UTF-8");
      } catch (Exception var5) {
         new StringBuffer().append("PaySMS.readFile: ").append(var0).append(" Exception: ").append(var5.toString()).toString();
         return null;
      }

      int var11 = 0;
      Vector var6 = new Vector();

      int var12;
      do {
         if ((var12 = var2.indexOf(10, var11)) != -1) {
            var6.addElement(var2.substring(var11, var12));
            var11 = var12 + 1;
         }
      } while (var12 != -1);

      String[] var7 = new String[var6.size()];
      var6.copyInto(var7);
      return var7;
   }

   private static String[][] K() {
      if (q && I() == 0) {
         Vector var0 = new Vector();

         for (int var1 = 0; var1 < p.length; var1++) {
            String var2 = p[var1][2];
            boolean var3 = false;

            for (int var4 = 0; !var3 && var4 < var0.size(); var4++) {
               if (d(var2, (String)var0.elementAt(var4))) {
                  var3 = true;
               }
            }

            if (!var3) {
               var2 = p[var1][2];
               var0.addElement(var2);
            }
         }

         if (at != null && au && var0.size() > 1) {
            var0.addElement("Other");
         }

         String[] var10 = new String[var0.size()];
         var0.copyInto(var10);
         var0.removeAllElements();
         var0 = new Vector();
         String[][] var12 = new String[var10.length][2];
         int var13 = 0;
         int var14 = 0;

         for (int var5 = 0; var5 < var10.length; var5++) {
            String var6;
            int var7;
            if ((var7 = (var6 = var10[var5]).indexOf(40)) != -1) {
               var12[var5][0] = var6.substring(0, var7);
               int var8 = var6.indexOf(58, ++var7);
               var6.lastIndexOf(58);
               k(d[8]);
               if (var8 != -1) {
                  var12[var5][1] = var6.substring(var7, var8);
                  if (G != null && G.startsWith(var12[var5][1], 1) && var13 <= var8 - var7) {
                     var13 = var8 - var7;
                     x = var5;
                     new StringBuffer().append("currentAutoDetectedRegion ").append(x).toString();
                     String[] var15;
                     (var15 = new String[2])[0] = var12[var5][0];
                     var15[1] = var12[var5][1];
                     var0.addElement(var15);
                     var14++;
                  }
               }
            } else {
               var12[var5][0] = var6;
               var12[var5][1] = "";
            }

            new StringBuffer()
               .append("PaySMS.getProfilesRegions:          regionsConfig[")
               .append(var5)
               .append("][REGION_NAME]: ")
               .append(var12[var5][0])
               .toString();
            new StringBuffer()
               .append("PaySMS.getProfilesRegions:          regionsConfig[")
               .append(var5)
               .append("][REGION_CODE]: ")
               .append(var12[var5][1])
               .toString();
         }

         if (var14 > 1) {
            x = -1;
            var12 = new String[var0.size()][2];
            var0.copyInto(var12);
         }

         new StringBuffer().append("PaySMS.getProfilesRegions: Auto-detected: ").append(x == -1 ? "NONE" : var12[x][0]).toString();
         return var12;
      } else {
         return null;
      }
   }

   private static String k(String var0) {
      RecordStore var1 = null;
      String var2 = null;

      try {
         byte[] var3;
         if ((var1 = RecordStore.openRecordStore(var0, true)).getNumRecords() > 0 && (var3 = var1.getRecord(1)) != null) {
            var2 = new String(var3);
         }
      } catch (Exception var5) {
         new StringBuffer().append("PaySMS.rmsLoad: Exception: ").append(var0).append(" ").append(var5.toString()).toString();
      }

      try {
         var1.closeRecordStore();
      } catch (Exception var4) {
         new StringBuffer().append("PaySMS.rmsLoad: Exception: ").append(var0).append(" ").append(var4.toString()).toString();
      }

      return var2;
   }

   public static void a(String var0, String var1) {
      RecordStore var2 = null;

      try {
         var2 = RecordStore.openRecordStore(var0, true);
         byte[] var5 = var1.getBytes();
         if (var2.getNumRecords() > 0) {
            var2.setRecord(1, var5, 0, var5.length);
         } else {
            var2.addRecord(var5, 0, var5.length);
         }
      } catch (Exception var3) {
         new StringBuffer().append("PaySMS.rmsSave: Exception: ").append(var3.toString()).toString();
      }

      if (var2 != null) {
         try {
            var2.closeRecordStore();
            return;
         } catch (Exception var4) {
            new StringBuffer().append("PaySMS.rmsSave: Exception: ").append(var4.toString()).toString();
         }
      }
   }

   private static boolean L() {
      String var0;
      return (var0 = k(d[0])) != null && var0.equals("1");
   }

   private static boolean M() {
      String var0;
      return (var0 = k(d[4])) != null && var0.equals("1");
   }

   private static String N() {
      String var0;
      return (var0 = k(d[1])) != null ? var0 : "";
   }

   private static long O() {
      try {
         String var0;
         if ((var0 = k(d[11])) != null) {
            return Long.parseLong(var0);
         }
      } catch (Exception var1) {
      }

      return 1L;
   }

   public static String h() {
      String var0;
      return (var0 = k(d[5])) != null ? var0 : "";
   }

   public static long i() {
      try {
         String var0;
         if ((var0 = k(d[13])) != null) {
            return Long.parseLong(var0);
         }
      } catch (Exception var1) {
      }

      return 0L;
   }

   private static boolean P() {
      String var0;
      if ((var0 = k(d[3])) != null && var0.length() != 0) {
         Vector var1 = new Vector();
         int var2 = 0;

         for (int var3 = var0.indexOf(";"); var3 != -1; var3 = var0.indexOf(";", var2)) {
            String var4 = var0.substring(var2, var3);
            var1.addElement(new Integer(Integer.parseInt(var4)));
            var2 = var3 + 1;
         }

         y = var1;
         return true;
      } else {
         return false;
      }
   }

   private static void b(Vector var0) {
      Object var1 = "";

      for (int var2 = 0; var2 < var0.size(); var2++) {
         var1 = var1 + var0.elementAt(var2) + ";";
      }

      new StringBuffer().append("PaySMS.storeProfileID: ").append((String)var1).toString();
      a(d[3], String.valueOf(var1));
   }

   private static String Q() {
      int var0 = Math.abs(new Random().nextInt() % 9999);

      while (var0 < 1000) {
         if (var0 < 1000) {
            var0 += 1000;
         }
      }

      return String.valueOf(var0);
   }

   private static boolean l(String var0) {
      return var0 == null || var0.length() == 0 || var0.equals("null");
   }

   private static boolean c(String var0, String var1) {
      if (!l(var0) && !l(var1)) {
         int var2 = var1.length();

         for (int var3 = 0; var3 <= var0.length() - var2; var3++) {
            if (d(var0.substring(var3, var3 + var2), var1)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static String[] a(String[] var0) {
      Vector var1 = new Vector();

      for (int var2 = 0; var2 < var0.length; var2++) {
         boolean var3 = false;

         for (int var4 = 0; var4 < var2; var4++) {
            if (var0[var2].equals(var0[var4])) {
               var3 = true;
               break;
            }
         }

         if (!var3) {
            var1.addElement(var0[var2]);
         }
      }

      String[] var5 = new String[var1.size()];
      var1.copyInto(var5);
      return var5;
   }

   public static int j() {
      if (y == null || y.size() <= 0) {
         return 0;
      }

      if (I() != 0) {
         return 8;
      }

      try {
         int var0 = (Integer)y.elementAt(0);
         String var1 = p[var0][0];
         String var2 = p[var0][1];
         new StringBuffer().append("profileID : ").append(var1).toString();
         if ((var1 = p[var0][2]) == null) {
            return 8;
         }

         var1 = var1.substring(var1.indexOf(40) + 1, var1.lastIndexOf(58)).trim();
         new StringBuffer().append("PaySMS. Country code ").append(var1).toString();
         if (var2.indexOf("Open Market") != -1) {
            if (var1.equals("90:TR")) {
               return 3;
            }

            if (var1.equals("33:FR")) {
               return 6;
            }
         }

         if (var1.equals("62:ID") && var2.indexOf("Indonesia Telkomsel") != -1) {
            return 11;
         }

         if (var1.equals("61:AU") && var2.indexOf("Australia VODAFONE") != -1) {
            return 16;
         }

         if (p[var0][6].equals("SMS")) {
            if (var1.equals("49:DE")) {
               return 2;
            }

            if (var1.equals("45:DK")) {
               return 4;
            }

            if (var1.equals("43:AT")) {
               return 5;
            }

            if (var1.equals("91:IN")) {
               return 7;
            }

            if (var1.equals("34:ES")) {
               return 0;
            }

            if (var1.equals("44:GB") || var1.equals("353:IE")) {
               return 10;
            }

            if (var1.equals("58:VE")) {
               return 12;
            }
         }

         if (var1.equals("34:ES") && p[var0][6].equals("HTTP")) {
            if (var2.indexOf("Movistar SP") != -1) {
               return 13;
            }

            return 9;
         }
      } catch (Exception var3) {
         new StringBuffer().append("PaySMS. GetSpecialFlow,  Exception: ").append(var3).toString();
      }

      return 8;
   }

   public static int e(int var0) {
      if (j() == 6) {
         if (y == null) {
            return 0;
         }

         for (int var1 = 0; var1 < y.size(); var1++) {
            int var2 = (Integer)y.elementAt(var1);

            try {
               if (Integer.parseInt(p[var2][14]) == var0) {
                  long var3 = m(p[var2][9]);
                  new StringBuffer().append("Fixed price : ").append(p[var2][9]).toString();
                  if (var3 > 500000L) {
                     new StringBuffer().append("Found Price greater than 5 Euros : ").append(p[var2][9]).toString();
                     return 1;
                  }
                  break;
               }
            } catch (Exception var5) {
            }
         }
      }

      return 0;
   }

   public static String k() {
      try {
         String var0;
         if ((var0 = t.ap.getAppProperty("URL-SUPPORT")) == null) {
            return null;
         } else {
            String var1;
            if ((var1 = k(d[7])) != null && !var1.equals("")) {
               String var2 = var1.substring(0, var1.indexOf(95));
               var1 = var1.substring(var1.indexOf(95) + 1);
               byte[] var5 = t.a(var2.getBytes(), "a8bc1a23a89");
               return var0 + "&extra_1=" + t.a(var5) + "&extra_2=" + var1;
            } else {
               return var0;
            }
         }
      } catch (Exception var3) {
         return null;
      }
   }

   private static long m(String var0) {
      int var1;
      if ((var1 = (var0 = var0.replace(',', '.')).indexOf(az)) == -1) {
         return n(var0) * 100000L;
      }

      long var2 = n(var0.substring(0, var1)) * 100000L;
      var0 = var0.substring(var1 + 1);

      while (var0.length() < "100000".length() - 1) {
         var0 = var0 + "0";
      }

      return var2 + n(var0);
   }

   private static int n(String var0) {
      try {
         return Integer.parseInt(var0);
      } catch (Exception var1) {
         return -1;
      }
   }

   private static boolean d(String var0, String var1) {
      if (var0 != null && var1 != null) {
         return var0.toUpperCase().equals(var1.toUpperCase());
      }

      new StringBuffer().append("PaySMS.equalsIgnoreCase: s1 = '").append(var0).append("', s2 = '").append(var1).append("'").toString();
      return false;
   }

   public static void l() {
   }

   public static void m() {
   }

   static String n() {
      return E;
   }

   static String o() {
      return X;
   }

   static String b(String var0) {
      Y = var0;
      return var0;
   }

   static String c(String var0) {
      return g(var0);
   }

   static String p() {
      return Y;
   }

   static int q() {
      return N;
   }

   static String[][] r() {
      return p;
   }

   static boolean a(boolean var0) {
      T = var0;
      return var0;
   }

   static boolean s() {
      U = false;
      return false;
   }

   static int f(int var0) {
      aj = var0;
      return var0;
   }

   static String t() {
      return L;
   }

   static Timer a(Timer var0) {
      ah = var0;
      return var0;
   }

   static Timer u() {
      return ah;
   }

   static String v() {
      return M;
   }

   static long w() {
      return Q++;
   }

   static long x() {
      return Q;
   }

   static long y() {
      return P;
   }

   static Vector z() {
      return y;
   }

   static void a(Vector var0) {
      b(var0);
   }

   static {
      String[] var10000 = new String[]{"2124", "2126", "2128", "2130", "3501", "3503", "3505", "3507", "3509", "3511"};
      var10000 = new String[]{"1152", "1154", "1049", "1156", "2741", "2743", "2745", "2878"};
      var10000 = new String[]{"1104", "1106", "1108", "1110"};
      var10000 = new String[]{"5133", "5031", "5033", "5135", "5229", "5231"};
      int[] var3 = new int[]{25, 50, 100, 150};
   }
}
