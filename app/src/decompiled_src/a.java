import javax.microedition.lcdui.Graphics;

public final class a {
   private static char[] k;
   private static boolean l;
   private static boolean m;
   static int[] a;
   private static int[] n;
   private int o;
   private short[] p;
   private short[] q;
   private short[] r;
   private short[] s;
   private short[] t;
   private short[] u;
   private byte[] v;
   private short[] w;
   private short[] x;
   private byte[] y;
   private short[] z;
   private byte[] A;
   private short[] B;
   private short[] C;
   private byte[] D;
   private short[] E;
   private byte[] F;
   private short[] G;
   private short[] H;
   private byte[] I;
   private byte[] J;
   private short[] K;
   private byte[] L;
   private short[] M;
   private byte[] N;
   private short[] O;
   private short[] P;
   private byte[] Q;
   private byte[] R;
   private byte[] S;
   private short[][] T;
   private int U;
   private byte[] V;
   private int[] W;
   private int X;
   private int[][][] Y;
   int b;
   private int[] Z;
   private int aa;
   private boolean ab;
   private boolean ac;
   int c;
   private short ad;
   private int[] ae;
   private int[] af;
   static int d = 800;
   static int e = 480;
   private int[][][] ag;
   private l[][] ah;
   private int ai = 0;
   private static int[] aj = new int[]{0, 2, 1, 3, 5, 7, 4, 6};
   private static int[] ak = new int[]{1, 0, 3, 2, 6, 7, 4, 5};
   private static int[] al = new int[]{2, 3, 0, 1, 5, 4, 7, 6};
   private static int[] am = new int[]{4, 5, 6, 7, 3, 2, 1, 0};
   private byte[] an;
   private byte[] ao;
   private int[] ap;
   private static int aq;
   private static int ar;
   private static int as;
   private static int at;
   static int[] f = new int[4];
   private static char au = '|';
   private int av = -1;
   private l[][] aw;
   private int[][] ax;
   private int ay = -1;
   static int[][] g;
   private static int[] az;
   private static int[] aA;
   static a[][] h;
   private static int aB;
   static int i;
   private static int aC;
   private int aD;
   private int aE;
   private int aF;
   private int aG;
   private int aH;
   private boolean aI = false;
   private boolean aJ = false;
   int[][] j;
   private int aK;
   private int aL = -1;
   private static short[] aM;
   private static int aN = -1;
   private static int aO = -1;
   private static int aP = -1;
   private static int aQ = 0;

   final void a() {
      this.q = null;
      this.p = null;
      this.r = null;
      this.s = null;
      this.E = null;
      this.D = null;
      this.w = null;
      this.v = null;
      this.M = null;
      this.L = null;
      this.J = null;
      this.x = null;
      this.y = null;
      this.z = null;
      this.A = null;
      this.B = null;
      this.C = null;
      this.K = null;
      if (this.T != null) {
         for (int var1 = 0; var1 < this.T.length; var1++) {
            this.T[var1] = null;
         }

         this.T = null;
      }

      if (this.Y != null) {
         for (int var4 = 0; var4 < this.Y.length; var4++) {
            this.Y[var4] = null;
         }

         this.Y = null;
      }

      a var5 = this;
      if ((this.c & 1) != 0) {
         if (var5.ag != null) {
            for (int var2 = 0; var2 < var5.ag.length; var2++) {
               if (var5.ag[var2] != null) {
                  for (int var3 = 0; var3 < var5.ag[var2].length; var3++) {
                     var5.ag[var2][var3] = null;
                  }

                  var5.ag[var2] = null;
               }
            }

            var5.ag = null;
            return;
         }
      } else if (var5.ah != null) {
         for (int var6 = 0; var6 < var5.ah.length; var6++) {
            var5.ah[var6] = null;
         }

         var5.ah = null;
      }
   }

   final void a(byte[] var1) {
      byte[] var2 = var1;
      a var19 = this;
      if (var2 != null) {
         try {
            var19.X = (var2[2] & 255) + ((var2[3] & 255) << 8) + ((var2[4] & 255) << 16) + ((var2[5] & 255) << 24);
            byte[] var5 = var2;
            int var4 = 6;
            a var3 = var19;
            var4++;
            int var10001 = var5[6] & 255;
            var4++;
            var19.o = (short)(var10001 + ((var5[7] & 255) << 8));
            if (var3.o > 0) {
               if ((var3.X & 32) != 0) {
                  var3.p = new short[var3.o];
                  var3.q = new short[var3.o];
               }

               var3.r = new short[var3.o];
               var3.s = new short[var3.o];
               int var6 = 0;
               byte var7 = 0;
               short[][] var8 = null;
               if ((var3.X & 4) != 0) {
                  var3.ao = new byte[var3.o];
               }

               boolean var9 = false;
               boolean var10 = false;
               boolean var11 = false;
               boolean var12 = false;
               boolean var13 = false;

               for (int var15 = 0; var15 < var3.o; var15++) {
                  var12 = false;
                  var13 = false;
                  boolean var14 = false;
                  if ((var5[var4] & 255) == 0) {
                     var4++;
                     var9 = false;
                     var10 = true;
                     var11 = true;
                     if ((var3.X & 4) != 0) {
                        var3.ao[var15] = var5[var4++];
                     }
                  } else if ((var5[var4] & 255) == 255) {
                     var4++;
                     var3.o(var3.o);
                     var3.an[var15] = 1;
                     var9 = true;
                     var10 = false;
                     var11 = true;
                  } else if ((var5[var4] & 255) == 254) {
                     var4++;
                     var3.o(var3.o);
                     var3.an[var15] = 2;
                     var9 = true;
                     var10 = false;
                     var11 = true;
                  } else if ((var5[var4] & 255) == 253) {
                     var4++;
                     var3.o(var3.o);
                     var3.an[var15] = 5;
                     var9 = false;
                     var10 = false;
                     var11 = true;
                  } else if ((var5[var4] & 255) == 252) {
                     var4++;
                     var3.o(var3.o);
                     var3.an[var15] = 3;
                     var9 = true;
                     var10 = false;
                     var11 = true;
                     var12 = true;
                  } else if ((var5[var4] & 255) == 251) {
                     var4++;
                     var3.o(var3.o);
                     var3.an[var15] = 4;
                     var9 = true;
                     var10 = false;
                     var11 = true;
                     var12 = true;
                  } else if ((var5[var4] & 255) == 250) {
                     var4++;
                     var3.o(var3.o);
                     var3.an[var15] = 6;
                     var9 = true;
                     var10 = false;
                     var11 = false;
                     var13 = true;
                  } else if ((var5[var4] & 255) == 249) {
                     var4++;
                     var3.o(var3.o);
                     var3.an[var15] = 7;
                     var9 = true;
                     var10 = false;
                     var11 = false;
                     var13 = true;
                  } else if ((var5[var4] & 255) == 248) {
                     var4++;
                     var3.o(var3.o);
                     var3.an[var15] = 8;
                     var9 = true;
                     var10 = false;
                     var11 = true;
                     var13 = false;
                  } else if ((var5[var4] & 255) == 247) {
                     var4++;
                     var3.o(var3.o);
                     var3.an[var15] = 9;
                     var9 = true;
                     var14 = true;
                     var10 = false;
                     var11 = true;
                     var13 = false;
                  }

                  if (var9) {
                     var3.ap[var15] = (var5[var4++] & 255) + ((var5[var4++] & 255) << 8) + ((var5[var4++] & 255) << 16) + ((var5[var4++] & 255) << 24);
                  }

                  if (var14) {
                     if (var8 == null) {
                        var8 = new short[var3.o][];
                     }

                     short[] var183 = new short[3];
                     int var16 = (var5[var4++] & 255) + ((var5[var4++] & 255) << 8) + ((var5[var4++] & 255) << 16) + ((var5[var4++] & 255) << 24);
                     var183[0] = (short)var16;
                     var183[1] = (short)(var16 >> 16);
                     var183[2] = var5[var4++];
                     var8[var15] = var183;
                     var6++;
                     var7 += 3;
                  }

                  if (var10 && (var3.X & 32) != 0) {
                     var3.p[var15] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var3.q[var15] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                  }

                  if (var11) {
                     if ((var3.X & 16) == 0) {
                        var3.r[var15] = (short)(var5[var4++] & 0xFF);
                        var3.s[var15] = (short)(var5[var4++] & 0xFF);
                     } else {
                        var3.r[var15] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                        var3.s[var15] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     }
                  }

                  if (var12) {
                     if (var8 == null) {
                        var8 = new short[var3.o][];
                     }

                     short[] var184;
                     (var184 = new short[2])[0] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var184[1] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var8[var15] = var184;
                     var6++;
                     var7 += 2;
                  }

                  if (var13) {
                     if (var8 == null) {
                        var8 = new short[var3.o][];
                     }

                     short[] var185;
                     (var185 = new short[4])[0] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var185[1] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var185[2] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var185[3] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var8[var15] = var185;
                     var6++;
                     var7 += 4;
                  }
               }

               if (var6 > 0) {
                  var3.t = new short[var7];
                  var3.u = new short[var6 << 1];
                  int var189 = 0;
                  short var186 = 0;

                  for (short var130 = 0; var130 < var3.o; var130++) {
                     byte var197;
                     if (var3.an[var130] == 3 || var3.an[var130] == 4) {
                        var197 = 2;
                     } else if (var3.an[var130] == 6 || var3.an[var130] == 7) {
                        var197 = 4;
                     } else if (var3.an[var130] == 9) {
                        var197 = 3;
                     } else {
                        var197 = -1;
                     }

                     if (var197 > 0) {
                        var3.u[var189 << 1] = var130;
                        var3.u[(var189 << 1) + 1] = var186;

                        for (int var124 = 0; var124 < var197; var124++) {
                           var3.t[var186] = var8[var130][var124];
                           var186++;
                        }

                        var8[var130] = null;
                        var189++;
                     }
                  }
               }
            }

            int var25 = var4;
            var5 = var2;
            var4 = var25;
            var3 = var19;
            short var131;
            if ((var131 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8))) > 0) {
               if ((var3.X & 1048576) != 0) {
                  var3.E = new short[var131];
               } else {
                  var3.D = new byte[var131];
               }

               var3.G = new short[var131];
               var3.H = new short[var131];
               var3.F = new byte[var131];
               if ((var3.X & 16384) != 0) {
                  var3.I = new byte[var131];
               }

               for (int var150 = 0; var150 < var131; var150++) {
                  if ((var3.X & 1048576) != 0) {
                     var3.E[var150] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                  } else {
                     var3.D[var150] = var5[var4++];
                  }

                  if ((var3.X & 1024) != 0) {
                     var3.G[var150] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var3.H[var150] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                  } else {
                     var3.G[var150] = var5[var4++];
                     var3.H[var150] = var5[var4++];
                  }

                  if ((var3.X & 16384) != 0) {
                     var3.I[var150] = var5[var4++];
                  }

                  var3.F[var150] = var5[var4++];
               }
            }

            int var27 = var4;
            var5 = var2;
            var4 = var27;
            var3 = var19;
            if ((var19.X & 32768) != 0) {
               var131 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
               if ((var3.X & 1024) == 0) {
                  var3.A = new byte[var131 << 2];
                  System.arraycopy(var5, var4, var3.A, 0, var131 << 2);
                  var4 += var131 << 2;
               } else {
                  var3.B = new short[var131 << 2];
                  int var187 = var131 << 2;
                  short[] var179 = var3.B;
                  int var171 = var4;
                  byte[] var165 = var5;

                  for (int var133 = 0; var133 < var187; var133++) {
                     var179[var133] = (short)((var165[var171++] & 255) + ((var165[var171++] & 255) << 8));
                  }

                  var4 = var171;
               }
            }

            if ((var131 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8))) > 0) {
               if ((var3.X & 2048) != 0) {
                  var3.w = new short[var131];
               } else {
                  var3.v = new byte[var131];
               }

               var3.x = new short[var131];
               if ((var3.X & 32768) != 0) {
                  var3.C = new short[var131 + 1];
               }

               short var155 = 0;

               for (int var158 = 0; var158 < var131; var158++) {
                  if ((var3.X & 2048) != 0) {
                     var3.w[var158] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                  } else {
                     var3.v[var158] = var5[var4++];
                  }

                  var3.x[var158] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                  if ((var3.X & 32768) != 0 && (var3.X & 32768) != 0) {
                     var3.C[var158] = var155;
                     var155 = (short)(var155 + var5[var4++]);
                  }
               }

               if ((var3.X & 32768) != 0) {
                  var3.C[var3.C.length - 1] = var155;
               }

               if ((var3.X & 4096) == 0) {
                  int var159 = var131 << 2;
                  if ((var3.X & 1024) == 0) {
                     var3.y = new byte[var159];

                     for (int var161 = 0; var161 < var159; var161++) {
                        var3.y[var161] = var5[var4++];
                     }
                  } else {
                     var3.z = new short[var159];

                     for (int var162 = 0; var162 < var159; var162++) {
                        var3.z[var162] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     }
                  }
               }
            }

            int var29 = var4;
            var5 = var2;
            var4 = var29;
            var3 = var19;
            if ((var131 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8))) > 0) {
               if ((var3.X & 2097152) != 0) {
                  var3.M = new short[var131];
               } else {
                  var3.L = new byte[var131];
               }

               var3.N = new byte[var131];
               if ((var3.X & 262144) != 0) {
                  var3.O = new short[var131];
                  var3.P = new short[var131];
               } else {
                  var3.Q = new byte[var131];
                  var3.R = new byte[var131];
               }

               var3.S = new byte[var131];

               for (int var151 = 0; var151 < var131; var151++) {
                  if ((var3.X & 2097152) != 0) {
                     var3.M[var151] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                  } else {
                     var3.L[var151] = var5[var4++];
                  }

                  var3.N[var151] = var5[var4++];
                  if ((var3.X & 262144) != 0) {
                     var3.O[var151] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     var3.P[var151] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                  } else {
                     var3.Q[var151] = var5[var4++];
                     var3.R[var151] = var5[var4++];
                  }

                  var3.S[var151] = var5[var4++];
               }
            }

            int var31 = var4;
            var5 = var2;
            var4 = var31;
            var3 = var19;
            if ((var131 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8))) > 0) {
               var3.J = new byte[var131];
               var3.K = new short[var131];

               for (int var156 = 0; var156 < var131; var156++) {
                  var3.J[var156] = var5[var4++];
                  var3.K[var156] = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
               }
            }

            int var33 = var4;
            if (var19.o > 0) {
               if ((var19.X & 16777216) != 0) {
                  var5 = var2;
                  var4 = var33;
                  var3 = var19;
                  if ((var19.X & 16777216) != 0 && var4 < var5.length) {
                     short var157 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     byte var160 = 1;
                     if ((var3.X & 1073741824) != 0) {
                        var160 = (byte)var5[var4++];
                     }

                     if (var3.Z == null) {
                        var3.Z = new int[var160];
                     }

                     for (int var166 = 0; var166 < var160; var166++) {
                        int var163 = var5[var4++] & 255;
                        var3.b = var163;
                        int var173;
                        if ((var173 = var5[var4++] & 255) == 0) {
                           var173 = 256;
                        }

                        var3.Z[var166] = var173;
                        int var137 = var160;
                        a var20 = var3;
                        if (var3.Y == null) {
                           var20.Y = new int[var137][24][];
                        }

                        int var174 = var166;
                        var163 = var173;
                        short var152 = var157;
                        byte[] var108 = var5;
                        var137 = var4;
                        a var21 = var3;
                        Object var180 = null;

                        for (int var188 = 0; var188 < var21.b; var188++) {
                           var21.Y[var174][var188] = new int[var163];
                           var180 = var21.Y[var174][var188];
                           if (var152 == -30584) {
                              for (int var195 = 0; var195 < var163; var195++) {
                                 int var205;
                                 if ((
                                       (
                                             var205 = (var108[var137++] & 255)
                                                + ((var108[var137++] & 255) << 8)
                                                + ((var108[var137++] & 255) << 16)
                                                + ((var108[var137++] & 255) << 24)
                                          )
                                          & 0xFF000000
                                    )
                                    != -16777216) {
                                    var21.ab = true;
                                    if ((var205 & 0xFF000000) != 0) {
                                       var21.ac = true;
                                    }
                                 }

                                 ((Object[])var180)[var195] = var205;
                              }
                           } else if (var152 == 17476) {
                              for (int var194 = 0; var194 < var163; var194++) {
                                 short var204;
                                 if (((var204 = (short)((var108[var137++] & 255) + ((var108[var137++] & 255) << 8))) & '\uf000') != 61440) {
                                    var21.ab = true;
                                    if ((var204 & '\uf000') != 0) {
                                       var21.ac = true;
                                    }
                                 }

                                 ((Object[])var180)[var194] = (var204 & '\uf000') << 16
                                    | (var204 & '\uf000') << 12
                                    | (var204 & 3840) << 12
                                    | (var204 & 3840) << 8
                                    | (var204 & 240) << 8
                                    | (var204 & 240) << 4
                                    | (var204 & 15) << 4
                                    | var204 & 15;
                              }
                           } else if (var152 == 21781) {
                              for (int var193 = 0; var193 < var163; var193++) {
                                 int var202 = (short)((var108[var137++] & 255) + ((var108[var137++] & 255) << 8));
                                 int var207 = -16777216;
                                 if ((var202 & 32768) != 32768) {
                                    var207 = 0;
                                    var21.ab = true;
                                 }

                                 if ((var202 = var207 | (var202 & 31744) << 9 | (var202 & 992) << 6 | (var202 & 31) << 3) == 16253176) {
                                    var202 = 16711935;
                                 }

                                 ((Object[])var180)[var193] = var202;
                              }
                           } else if (var152 == 25861) {
                              for (int var192 = 0; var192 < var163; var192++) {
                                 int var200 = (short)((var108[var137++] & 255) + ((var108[var137++] & 255) << 8));
                                 int var206 = -16777216;
                                 if ((var200 & 65535) == 63519) {
                                    var206 = 0;
                                    var21.ab = true;
                                 }

                                 if ((var200 = var206 | (var200 & 63488) << 8 | (var200 & 2016) << 5 | (var200 & 31) << 3) == 16253176) {
                                    var200 = 16711935;
                                 }

                                 ((Object[])var180)[var192] = var200;
                              }
                           } else if (var152 == 12803) {
                              for (int var191 = 0; var191 < var163; var191++) {
                                 int var199 = var108[var137++] & 255;
                                 int var17 = -16777216;
                                 if (var199 == 192) {
                                    var17 = 0;
                                    var21.ab = true;
                                 }

                                 ((Object[])var180)[var191] = var17 | (var199 & 224) << 16 | (var199 & 28) << 11 | (var199 & 3) << 6;
                              }
                           } else if (var152 == -30712) {
                              var21.ac = false;

                              for (int var190 = 0; var190 < var163; var190++) {
                                 int var198;
                                 if ((var198 = (var108[var137++] & 255) + ((var108[var137++] & 255) << 8) + ((var108[var137++] & 255) << 16)) == 16711935) {
                                    var21.ab = true;
                                 } else {
                                    var198 |= -16777216;
                                 }

                                 ((Object[])var180)[var190] = var198;
                              }
                           }
                        }

                        var4 = var137;
                     }

                     var3.ad = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                     if (var3.ad == -22976
                        || var3.ad == -24281
                        || var3.ad == -23978
                        || var3.ad == -24476
                        || var3.ad == -24280
                        || var3.ad == -23198
                        || var3.ad == 933
                        || var3.ad == 1443) {
                        var3.ab = true;
                        var3.ac = true;
                     }

                     if (var3.ad == 25840 || var3.ad == -22976) {
                        if (var3.ae == null) {
                           var3.ae = new int[var160];
                           var3.af = new int[var160];
                        }

                        for (int var167 = 0; var167 < var160; var167++) {
                           int var196 = var167;
                           int var175 = var3.Z[var196] - 1;
                           var3.ae[var167] = 1;

                           for (var3.af[var167] = 0; var175 != 0; var3.af[var167]++) {
                              var175 >>= 1;
                              var3.ae[var167] = var3.ae[var167] << 1;
                           }

                           var3.ae[var167]--;
                        }
                     }

                     if (var3.o > 0) {
                        var3.W = new int[var3.o];
                        int var168 = 0;
                        int var176 = var4;

                        for (int var182 = 0; var182 < var3.o; var182++) {
                           if ((var3.X & 128) != 0) {
                              var131 = (var5[var4++] & 255) + ((var5[var4++] & 255) << 8) + ((var5[var4++] & 255) << 16) + ((var5[var4++] & 255) << 24);
                           } else {
                              var131 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                           }

                           var3.W[var182] = var168;
                           var168 += var131;
                           var4 += var131;
                        }

                        var4 = var176;
                        var3.V = new byte[var168];

                        for (int var169 = 0; var169 < var3.o; var169++) {
                           if ((var3.X & 128) != 0) {
                              var176 = (var5[var4++] & 255) + ((var5[var4++] & 255) << 8) + ((var5[var4++] & 255) << 16) + ((var5[var4++] & 255) << 24);
                           } else {
                              var176 = (short)((var5[var4++] & 255) + ((var5[var4++] & 255) << 8));
                           }

                           boolean var22 = false;
                           var2 = null;
                           System.arraycopy(var5, var4, var3.V, var3.x(var169), var176);
                           var4 += var176;
                        }
                     }
                  }
               }

               var19.U = -1;
               var19.T = new short[16][];
               if ((var19.X & 4096) == 0) {
                  if ((var19.c & 4) != 0) {
                     var19.c &= -5;
                  }
               } else {
                  int var24;
                  if ((var24 = var19.d()) > 0) {
                     int var35 = 0;
                     if ((var19.X & 1024) == 0 && (var19.c & 4) == 0) {
                        var19.y = new byte[var24 << 2];

                        for (int var123 = 0; var123 < var24; var123++) {
                           int var154 = var123;
                           int[] var149 = f;
                           var19.a(f, var154, 0, 0);
                           var19.y[var35++] = (byte)f[0];
                           var19.y[var35++] = (byte)f[1];
                           var19.y[var35++] = (byte)(f[2] - f[0]);
                           var19.y[var35++] = (byte)(f[3] - f[1]);
                        }

                        return;
                     }

                     var19.z = new short[var24 << 2];

                     for (int var122 = 0; var122 < var24; var122++) {
                        int var153 = var122;
                        int[] var148 = f;
                        var19.a(f, var153, 0, 0);
                        var19.z[var35++] = (short)f[0];
                        var19.z[var35++] = (short)f[1];
                        var19.z[var35++] = (short)(f[2] - f[0]);
                        var19.z[var35++] = (short)(f[3] - f[1]);
                     }
                  }
               }
            }
         } catch (Exception var18) {
         }
      }
   }

   private void o(int var1) {
      if (this.an == null) {
         this.an = new byte[var1];

         for (int var2 = 0; var2 < var1; var2++) {
            this.an[var2] = 0;
         }
      }

      if (this.ap == null) {
         this.ap = new int[var1];
      }
   }

   final void b() {
      this.Y = null;
      this.V = null;
      this.W = null;
   }

   final int a(int var1, int var2) {
      return this.N[this.K[var1] + var2] & 0xFF;
   }

   final int b(int var1, int var2) {
      return this.S[this.K[var1] + var2] & 15;
   }

   final int a(int var1) {
      return this.J[var1] & 0xFF;
   }

   private int p(int var1) {
      return (this.X & 2048) != 0 ? this.w[var1] : this.v[var1] & 0xFF;
   }

   private int q(int var1) {
      return this.an != null ? this.an[var1] : 0;
   }

   private int r(int var1) {
      return this.r[var1] & 65535;
   }

   private int s(int var1) {
      return this.s[var1] & 65535;
   }

   private int t(int var1) {
      return (this.X & 262144) != 0 ? this.O[var1] : this.Q[var1];
   }

   final int c(int var1, int var2) {
      var1 = this.K[var1] + var2;
      return this.t(var1);
   }

   private int u(int var1) {
      return (this.X & 262144) != 0 ? this.P[var1] : this.R[var1];
   }

   final int d(int var1, int var2) {
      var1 = this.K[var1] + var2;
      return this.u(var1);
   }

   final int b(int var1) {
      return (this.X & 1024) == 0 && (this.c & 4) == 0 ? this.y[(var1 << 2) + 2] & 0xFF : this.z[(var1 << 2) + 2] & 65535;
   }

   final int c(int var1) {
      return (this.X & 1024) == 0 && (this.c & 4) == 0 ? this.y[(var1 << 2) + 3] & 0xFF : this.z[(var1 << 2) + 3] & 65535;
   }

   final int d(int var1) {
      return (this.X & 1024) == 0 && (this.c & 4) == 0 ? this.y[var1 << 2] : this.z[var1 << 2];
   }

   final int e(int var1) {
      return (this.X & 1024) == 0 && (this.c & 4) == 0 ? this.y[(var1 << 2) + 1] : this.z[(var1 << 2) + 1];
   }

   private int v(int var1) {
      this.w(var1);
      if ((this.X & 1048576) != 0) {
         var1 = this.E[var1];
      } else {
         var1 = this.D[var1] & 255;
      }

      return var1;
   }

   private int j(int var1, int var2) {
      var1 = this.l(var1, var2);
      return this.v(var1);
   }

   private int w(int var1) {
      return this.F[var1] & 0xFF;
   }

   private int k(int var1, int var2) {
      var1 = this.l(var1, var2);
      return this.w(var1);
   }

   private int l(int var1, int var2) {
      return this.x[var1] + var2;
   }

   private int m(int var1, int var2) {
      var2 = this.x[var1] + var2;
      return this.G[var2];
   }

   final int e(int var1, int var2) {
      var2 = this.x[var1] + var2;
      return this.H[var2];
   }

   final int f(int var1, int var2) {
      var1 = this.K[var1] + var2;
      if ((this.X & 2097152) != 0) {
         var1 = this.M[var1];
      } else {
         var1 = this.L[var1] & 255;
      }

      return var1;
   }

   final void a(int[] var1, int var2, int var3, int var4, int var5) {
      aq = Integer.MAX_VALUE;
      ar = Integer.MAX_VALUE;
      as = Integer.MIN_VALUE;
      at = Integer.MIN_VALUE;
      aQ = 1;
      this.a((Graphics)null, var2, var3, var4, var5, 0);
      aQ = 0;
      var1[0] = aq;
      var1[1] = ar;
      var1[2] = as;
      var1[3] = at;
   }

   final void a(int[] var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4, 0, false, true);
   }

   private void a(int[] var1, int var2, int var3, int var4, int var5, boolean var6, boolean var7) {
      if (!var7) {
         var7 = this.d(var2);
         var6 = this.e(var2);
         int var8 = this.b(var2);
         var2 = this.c(var2);
         if ((var5 & 1) != 0) {
            var7 = -var7 - var8;
         }

         if ((var5 & 2) != 0) {
            var6 = -var6 - var2;
         }

         if ((var5 & 4) != 0) {
            var5 = var7;
            var7 = -var6 - var2;
            var6 = var5;
            var5 = var8;
            var8 = var2;
            var2 = var5;
         }

         aq = var3 + var7;
         ar = var4 + var6;
         as = aq + var8;
         at = ar + var2;
      } else {
         aq = Integer.MAX_VALUE;
         ar = Integer.MAX_VALUE;
         as = Integer.MIN_VALUE;
         at = Integer.MIN_VALUE;
         aQ = 1;
         this.a((Graphics)null, var2, var3, var4, var5);
         aQ = 0;
      }

      var1[0] = aq;
      var1[1] = ar;
      var1[2] = as;
      var1[3] = at;
   }

   final void b(int[] var1, int var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, false, false);
   }

   final void a(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      a var7 = this;
      int var12 = this.S[var7.K[var2] + var3] & 15;
      if ((var6 & 1) != 0) {
         var12 = ak[var12 & 7] | var12 & -8;
      }

      if ((var6 & 2) != 0) {
         var12 = al[var12 & 7] | var12 & -8;
      }

      if ((var6 & 4) != 0) {
         var12 = am[var12 & 7] | var12 & -8;
      }

      int var8 = this.f(var2, var3);
      int var9 = this.c(var2, var3);
      var2 = this.d(var2, var3);
      if ((var6 & 1) != 0) {
         var9 = -var9;
      }

      if ((var6 & 2) != 0) {
         var2 = -var2;
      }

      if ((var6 & 4) != 0) {
         var3 = var9;
         var9 = -var2;
         var2 = var3;
      }

      this.a(var1, var8, var4 + var9, var5 + var2, var12, false, false);
   }

   final int c() {
      return this.J == null ? 0 : this.J.length;
   }

   final int d() {
      if ((this.X & 2048) != 0) {
         return this.w == null ? 0 : this.w.length;
      } else {
         return this.v == null ? 0 : this.v.length;
      }
   }

   final int f(int var1) {
      int var2;
      int var3 = var2 = this.p(var1);

      for (int var4 = 0; var4 < var2; var4++) {
         int var5 = this.j(var1, var4);
         if ((this.k(var1, var4) & 16) != 0) {
            var3 = var3 - 1 + this.f(var5);
         }
      }

      return var3;
   }

   private int x(int var1) {
      return this.W != null ? this.W[var1] : -1;
   }

   private int n(int var1, int var2) {
      int var3 = this.p(var1);
      int var4 = 0;

      for (int var6 = 0; var6 < var3; var6++) {
         int var5 = this.j(var1, var6);
         if ((this.k(var1, var6) & 16) == 0 && this.q(var5) == 5 && (var2 == -1 || var2 == var5)) {
            var4++;
         }
      }

      return var4;
   }

   final int[] g(int var1) {
      return this.a(var1, null, 0, -1);
   }

   private int[] a(int var1, int[] var2, int var3, int var4) {
      if ((var3 = this.n(var1, -1)) > 0) {
         byte var10 = 0;
         int var5;
         var2 = new int[var5 = var3 << 1];
         var5 = this.p(var1);

         for (int var6 = 0; var6 < var5; var6++) {
            var3 = this.j(var1, var6);
            if ((this.k(var1, var6) & 16) == 0 && this.q(var3) == 5) {
               var2[var10] = this.m(var1, var6);
               var2[var10 + 1] = this.e(var1, var6);
               var10 += 2;
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   final int[] g(int var1, int var2) {
      int var3 = this.f(var1, var2);
      int[] var4;
      if ((var4 = this.a(var3, null, 0, -1)) != null) {
         var3 = this.n(var3, -1);
         int var5 = this.b(var1, var2);
         int var6 = this.c(var1, var2);
         var1 = this.d(var1, var2);
         byte var9 = 0;

         for (int var7 = 0; var7 < var3; var7++) {
            var4[var9] += var6;
            var4[var9 + 1] = var4[var9 + 1] + var1;
            if ((var5 & 1) != 0) {
               var4[var9] = -var4[var9];
               var4[var9] += var6 << 1;
            }

            if ((var5 & 2) != 0) {
               var4[var9 + 1] = -var4[var9 + 1];
               var4[var9 + 1] = var4[var9 + 1] + (var1 << 1);
            }

            var9 += 2;
         }
      }

      return var4;
   }

   final int h(int var1) {
      return this.C != null ? this.C[var1 + 1] - this.C[var1] : 0;
   }

   final void a(int var1, int var2, int[] var3) {
      if (this.C != null && var3 != null) {
         int var4 = this.C[var1];
         if ((var1 = this.C[var1 + 1] - var4) > 0 && var2 < var1) {
            var4 = var4 + var2 << 2;
            if ((this.X & 1024) != 0) {
               if (this.B != null) {
                  var3[0] = this.B[var4];
                  var3[1] = this.B[var4 + 1];
                  var3[2] = this.B[var4 + 2] & '\uffff';
                  var3[3] = this.B[var4 + 3] & '\uffff';
                  return;
               }
            } else if (this.A != null) {
               var3[0] = this.A[var4];
               var3[1] = this.A[var4 + 1];
               var3[2] = this.A[var4 + 2] & 255;
               var3[3] = this.A[var4 + 3] & 255;
            }

            return;
         }

         var3[0] = 0;
         var3[1] = 0;
         var3[2] = 0;
         var3[3] = 0;
      }
   }

   static int[] a(int[] var0) {
      if (var0 != null && var0 == a) {
         if (var0 != null && var0 == n) {
            return null;
         }

         if (n == null) {
            n = new int[30000];
         }

         return n;
      } else {
         if (a == null) {
            a = new int[30000];
         }

         return a;
      }
   }

   final void e() {
      this.c |= 1;
   }

   public final void f() {
      this.aw = new l[this.b][this.o];
      this.ax = new int[this.b][this.o];
   }

   private boolean m() {
      return this.aw != null;
   }

   private static int a(int[] var0, int var1) {
      return t.a(var0, 0, var0.length, var1);
   }

   private boolean a(int var1, int var2, int var3, int var4) {
      if (this.m()) {
         int var5;
         int[] var6 = t.G(var5 = t.T());
         int var7 = var5;
         var6 = var6;
         a var11 = this;
         if (this.aw != null && var11.aw[var11.aa][var1] != null ? a(var6, var7) == var11.ax[var11.aa][var1] : false) {
            l var8;
            l var10000 = var8 = this.aw[this.aa][var1];
            int var10001 = var10000.a.getWidth();
            int var10002 = var8.a.getHeight();
            int var14 = aj[var4];
            var5 = var10002;
            var4 = var10001;
            l var9 = var10000;
            t.a(t.am, var9, var4, var5, var14, var2, var3, 20, false);
            return true;
         }
      }

      return false;
   }

   private boolean a(int var1, int var2, int var3, int[] var4, int var5) {
      if (this.m() && var4 != null) {
         int var6;
         int[] var7 = t.G(var6 = t.T());
         l var12 = l.a(var4, t.aC, t.aD, true);
         int[] var9 = var7;
         int var8 = var6;
         l var17 = var12;
         var6 = var1;
         a var10 = this;
         this.aw[var10.aa][var6] = var17;
         var10.ax[var10.aa][var6] = a(var9, var8);
         int var10001 = var12.a.getWidth();
         int var10002 = var12.a.getHeight();
         var6 = aj[var5];
         var5 = var10002;
         int var13 = var10001;
         l var11 = var12;
         t.a(t.am, var11, var13, var5, var6, var2, var3, 20, false);
         return true;
      } else {
         return false;
      }
   }

   static void g() {
      g = new int[4][];
      h = new a[4][];
      az = new int[4];
      aA = new int[4];
   }

   static void h(int var0, int var1) {
      aA[var0] = var1;
      g[var0] = new int[var1];
      h[var0] = new a[var1];

      for (int var2 = 0; var2 < g[var0].length; var2++) {
         g[var0][var2] = -1;
      }
   }

   static void i(int var0) {
      g[var0] = null;
      h[var0] = null;
      az[var0] = 0;
      aA[var0] = 0;
   }

   final void j(int var1) {
      this.ay = var1;
      if ((this.c & 1) != 0) {
         if (this.ag == null) {
            this.ag = new int[this.b][][];

            for (int var2 = 0; var2 < this.b; var2++) {
               this.ag[var2] = new int[this.o][];
            }

            return;
         }
      } else if (this.ah == null) {
         this.ah = new l[this.b][];

         for (int var3 = 0; var3 < this.b; var3++) {
            this.ah[var3] = new l[this.o];
         }
      }
   }

   private final void a(int var1, Object var2) {
      Object var3 = var2;
      var2 = var1;
      a var8 = this;
      if (this.ay >= 0) {
         if ((var8.c & 1) != 0) {
            if (var8.ag[var8.aa][var2] != null) {
               return;
            }
         } else if (var8.ah[var8.aa][var2] != null) {
            return;
         }

         int var4 = az[var8.ay];
         int var5;
         int var6 = (var5 = g[var8.ay][var4]) >> 24;
         int var7 = var5 & 16777215;
         a var10;
         if (var5 >= 0 && (var10 = h[var8.ay][var4]) != null) {
            if ((var8.c & 1) != 0) {
               var10.ag[var6][var7] = null;
            } else {
               var10.ah[var6][var7] = null;
            }
         }

         var5 = (var2 & 16777215) + (var8.aa << 24);
         g[var8.ay][var4] = var5;
         h[var8.ay][var4] = var8;
         az[var8.ay] = (az[var8.ay] + 1) % aA[var8.ay];
         if ((var8.c & 1) != 0) {
            if (var8.ag[var8.aa][var2] == null || var8.ag[var8.aa][var2].length != 0) {
               var8.ag[var8.aa][var2] = new int[0];
            }

            System.arraycopy((int[])var3, 0, var8.ag[var8.aa][var2], 0, 0);
            return;
         }

         var8.ah[var8.aa][var2] = (l)var3;
      }
   }

   private int[] y(int var1) {
      a var2 = this;
      if (this.W == null ? false : var2.V != null) {
         var2 = this;
         byte var14 = this.ao == null ? 0 : var2.ao[var1];
         var2 = null;
         byte[] var10002 = this.V;
         int var10003 = this.x(var1);
         int var6 = this.s(var1);
         int var5 = this.r(var1);
         int var4 = var10003;
         byte[] var3 = var10002;
         byte var16 = var14;
         var1 = var6;
         var6 = var5;
         var5 = var4;
         byte[] var24 = var3;
         byte var23 = var16;
         var2 = this;
         int var7 = 0;
         var6 *= var1;
         if (a == null) {
            a = new int[30000];
         }

         int var9 = var2.aa;
         byte var8 = var23;
         a var11 = var2;
         int[] var12;
         boolean var92;
         if ((var12 = var9 >= 0 && var9 < var11.b && var11.Y != null && var9 < var11.Y[var8].length ? var11.Y[var8][var9] : null) == null) {
            var92 = false;
         } else {
            int var54 = 0;
            if (var2.ad != 25840) {
               if (var2.ad == 10225) {
                  while (var7 < var6) {
                     if ((var9 = var24[var5++] & 255) > 127) {
                        int var22 = var24[var5++] & 255;
                        var54 = var12[var22];
                        var9 -= 128;

                        while (var9-- > 0) {
                           a[var7++] = var54;
                        }
                     } else {
                        a[var7++] = var12[var9];
                     }
                  }
               } else if (var2.ad == 22258) {
                  var5--;
                  var7--;
                  var6--;

                  while (var7 < var6) {
                     if ((var9 = var24[++var5]) < 0) {
                        var9 += 128;

                        while (true) {
                           a[++var7] = var12[var24[++var5] & 0xFF];
                           if (--var9 <= 0) {
                              break;
                           }
                        }
                     } else {
                        var54 = var12[var24[++var5] & 0xFF];

                        while (true) {
                           a[++var7] = var54;
                           if (--var9 <= 0) {
                              break;
                           }
                        }
                     }
                  }
               } else if (var2.ad == 5632) {
                  var6 = var6 + ((var6 & 1) == 0 ? 0 : 2) >> 1;

                  while (--var6 >= 0) {
                     byte var65 = var24[var5++];
                     a[var7++] = var12[var65 >> 4 & 15];
                     a[var7++] = var12[var65 & 15];
                  }
               } else if (var2.ad == 1024) {
                  var6 = var6 + ((var6 & 3) == 0 ? 0 : 4) >> 2;

                  while (--var6 >= 0) {
                     byte var66 = var24[var5++];
                     a[var7++] = var12[var66 >> 6 & 3];
                     a[var7++] = var12[var66 >> 4 & 3];
                     a[var7++] = var12[var66 >> 2 & 3];
                     a[var7++] = var12[var66 & 3];
                  }
               } else if (var2.ad == 512) {
                  var6 = var6 + ((var6 & 7) == 0 ? 0 : 8) >> 3;

                  while (--var6 >= 0) {
                     byte var67 = var24[var5++];
                     a[var7++] = var12[var67 >> 7 & 1];
                     a[var7++] = var12[var67 >> 6 & 1];
                     a[var7++] = var12[var67 >> 5 & 1];
                     a[var7++] = var12[var67 >> 4 & 1];
                     a[var7++] = var12[var67 >> 3 & 1];
                     a[var7++] = var12[var67 >> 2 & 1];
                     a[var7++] = var12[var67 >> 1 & 1];
                     a[var7++] = var12[var67 & 1];
                  }
               } else if (var2.ad == 22018) {
                  while (--var6 >= 0) {
                     a[var7++] = var12[var24[var5++] & 0xFF];
                  }
               } else if (var2.ad == -23198) {
                  while (--var6 >= 0) {
                     a[var7++] = (var24[var5++] & 255) << 24 | var12[var24[var5++] & 0xFF] & 16777215;
                  }
               } else if (var2.ad == 933) {
                  while (--var6 >= 0) {
                     a[var7++] = (var24[var5] & 224) << 24 | var12[var24[var5] & 31] & 16777215;
                     var5++;
                  }
               } else if (var2.ad == 1443) {
                  while (--var6 >= 0) {
                     a[var7++] = (var24[var5] & 248) << 24 | var12[var24[var5] & 7] & 16777215;
                     var5++;
                  }
               } else if (var2.ad == -24476) {
                  for (int var68 = 0; var7 < var6; var68++) {
                     switch (var68) {
                        case 0:
                           a[var7] = (var24[var5] & 252) >> 2;
                           var7++;
                           break;
                        case 1:
                           a[var7] = (var24[var5] & 3) << 4;
                           a[var7] = (var24[++var5] & 240) >> 4 | a[var7];
                           var7++;
                           break;
                        case 2:
                           a[var7] = (var24[var5] & 15) << 2;
                           a[var7] = (var24[++var5] & 192) >> 6 | a[var7];
                           var7++;
                           break;
                        case 3:
                           a[var7] = var24[var5] & 63;
                           var7++;
                           var5++;
                           var68 = -1;
                     }
                  }

                  for (int var49 = 0; --var6 >= 0; var49++) {
                     a[var49] = (var24[var5++] & 255) << 24 | var12[a[var49] & 0xFF] & 16777215;
                  }
               } else if (var2.ad == -24280) {
                  for (int var69 = 0; var7 < var6; var69++) {
                     switch (var69) {
                        case 0:
                           a[var7] = (var24[var5] & 254) >> 1;
                           var7++;
                           break;
                        case 1:
                           a[var7] = (var24[var5] & 1) << 6;
                           a[var7] = (var24[++var5] & 252) >> 2 | a[var7];
                           var7++;
                           break;
                        case 2:
                           a[var7] = (var24[var5] & 3) << 5;
                           a[var7] = (var24[++var5] & 248) >> 3 | a[var7];
                           var7++;
                           break;
                        case 3:
                           a[var7] = (var24[var5] & 7) << 4;
                           a[var7] = (var24[++var5] & 240) >> 4 | a[var7];
                           var7++;
                           break;
                        case 4:
                           a[var7] = (var24[var5] & 15) << 3;
                           a[var7] = (var24[++var5] & 224) >> 5 | a[var7];
                           var7++;
                           break;
                        case 5:
                           a[var7] = (var24[var5] & 31) << 2;
                           a[var7] = (var24[++var5] & 192) >> 6 | a[var7];
                           var7++;
                           break;
                        case 6:
                           a[var7] = (var24[var5] & 63) << 1;
                           a[var7] = (var24[++var5] & 128) >> 7 | a[var7];
                           var7++;
                           break;
                        case 7:
                           a[var7] = var24[var5] & 127;
                           var5++;
                           var7++;
                           var69 = -1;
                     }
                  }

                  for (int var50 = 0; --var6 >= 0; var50++) {
                     a[var50] = (var24[var5++] & 255) << 24 | var12[a[var50] & 0xFF] & 16777215;
                  }
               } else if (var2.ad == -22976) {
                  label273:
                  while (true) {
                     if (var7 >= var6) {
                        var7 = 0;

                        while (true) {
                           if (var7 >= var6) {
                              break label273;
                           }

                           if ((var9 = var24[var5++] & 255) == 254) {
                              int var21 = var24[var5++] & 255;
                              var9 = var24[var5++] & 255;

                              while (var21-- > 0) {
                                 a[var7] = var9 << 24 | a[var7] & 16777215;
                                 var7++;
                              }
                           } else {
                              a[var7] = var9 << 24 | a[var7] & 16777215;
                              var7++;
                           }
                        }
                     }

                     var9 = var24[var5++] & 255;
                     var54 = var12[var9 & var2.ae[var23]];
                     var9 >>= var2.af[var23];

                     while (var9-- >= 0) {
                        a[var7++] = var54;
                     }
                  }
               } else if (var2.ad == -24281) {
                  label247:
                  while (true) {
                     if (var7 >= var6) {
                        var7 = 0;

                        while (true) {
                           if (var7 >= var6) {
                              break label247;
                           }

                           if ((var9 = var24[var5++] & 255) == 254) {
                              int var20 = var24[var5++] & 255;
                              var9 = var24[var5++] & 255;

                              while (var20-- > 0) {
                                 a[var7] = var9 << 24 | a[var7] & 16777215;
                                 var7++;
                              }
                           } else {
                              a[var7] = var9 << 24 | a[var7] & 16777215;
                              var7++;
                           }
                        }
                     }

                     if ((var9 = var24[var5++] & 255) > 127) {
                        int var19 = var24[var5++] & 255;
                        var54 = var12[var19];
                        var9 -= 128;

                        while (var9-- > 0) {
                           a[var7++] = var54;
                        }
                     } else {
                        a[var7++] = var12[var9];
                     }
                  }
               } else if (var2.ad == -23978) {
                  while (var7 < var6) {
                     if ((var9 = var24[var5++] & 255) > 127) {
                        var9 -= 128;

                        while (var9-- > 0) {
                           a[var7++] = var12[var24[var5++] & 0xFF];
                        }
                     } else {
                        var54 = var12[var24[var5++] & 0xFF];

                        while (var9-- > 0) {
                           a[var7++] = var54;
                        }
                     }
                  }

                  var7 = 0;

                  while (var7 < var6) {
                     if ((var9 = var24[var5++] & 255) == 254) {
                        int var18 = var24[var5++] & 255;
                        var9 = var24[var5++] & 255;

                        while (var18-- > 0) {
                           a[var7] = var9 << 24 | a[var7] & 16777215;
                           var7++;
                        }
                     } else {
                        a[var7] = var9 << 24 | a[var7] & 16777215;
                        var7++;
                     }
                  }
               }
            } else {
               while (var7 < var6) {
                  var9 = var24[var5++] & 255;
                  var54 = var12[var9 & var2.ae[var23]];
                  var9 >>= var2.af[var23];

                  while (var9-- >= 0) {
                     a[var7++] = var54;
                  }
               }
            }

            var92 = true;
         }

         if (var92) {
            return a;
         }
      }

      return null;
   }

   final void b(int[] var1) {
      this.aK = var1[0];
      this.j = new int[this.aK][];
      int var2 = 1;

      for (int var3 = 0; var3 < this.aK; var3++) {
         this.j[var3] = new int[2];
         this.j[var3][0] = var1[var2++];
         this.j[var3][1] = var1[var2++];
      }

      int var13 = var2;

      while (var13 < var1.length) {
         var2 = var1[var13++];
         int var4;
         int[] var5;
         (var5 = new int[((var4 = var1[var13++]) << 1) + 2])[0] = this.j[var2][0];
         var5[1] = this.j[var2][1];

         for (int var6 = 0; var6 < var4; var6++) {
            var5[(var6 << 1) + 2] = var1[var13++];
            var5[(var6 << 1) + 3] = var1[var13++];
         }

         this.j[var2] = var5;
      }

      a var7 = this;
      this.aH = -var7.e(0, 0);
      var2 = var7.e(0, 1);
      var7.aD = var7.aH + var2;
      a var11 = var7;
      var7.aE = var7.e(0, 2) - var11.e(0, 1);
      a var12 = var7;
      var7.aG = var7.m(var12.k(32), 0);
   }

   final int k(int var1) {
      if (this.j == null) {
         return 0;
      }

      int var2 = var1 % this.aK;
      if (this.j[var2][0] == var1) {
         return this.j[var2][1];
      }

      byte var3 = 2;
      int var4 = this.j[var2].length;

      while (var3 < var4 && this.j[var2][var3] != var1) {
         var3 += 2;
      }

      return var3 >= var4 ? 1 : this.j[var2][var3 + 1];
   }

   final int h() {
      return this.aL >= 0 ? this.aE * this.aL >> 8 : this.aE;
   }

   final int i() {
      return this.aL >= 0 ? this.aD * this.aL >> 8 : this.aD;
   }

   final int j() {
      return this.aL >= 0 ? this.aG * this.aL >> 8 : this.aG;
   }

   private int n() {
      return this.aL >= 0 ? this.aF * this.aL >> 8 : this.aF;
   }

   final void l(int var1) {
      this.aF = var1;
   }

   final int k() {
      return this.aL >= 0 ? this.aD * this.aL >> 8 : this.aD;
   }

   public static final int a(short[] var0, int var1) {
      var1 = (var1 << 2) + 3;
      return var0[var1];
   }

   public static final int b(short[] var0, int var1) {
      var1 = (var1 << 2) + 4;
      return var0[var1];
   }

   final short[] a(String var1, int var2, boolean var3) {
      if (aM == null) {
         aM = new short[2000];
      }

      var3 = var1.length();
      short var4 = 0;
      short var5 = 0;
      short var6 = 1;
      int var9 = this.aD;
      short var10 = 0;
      boolean var11 = this.aJ;
      boolean var12 = false;
      short var13 = 0;
      boolean var14 = this.aJ;

      for (int var15 = 0; var15 < var3; var15++) {
         char var16 = var1.charAt(var15);
         int var7 = this.z(this.k(var16));
         this.k(var16);
         int var8 = this.k();
         if (var9 < var8) {
            var9 = var8;
         }

         if (var16 != ' ' && var16 != au) {
            if (var16 == '\\') {
               if (var1.charAt(++var15) == '^') {
                  var14 = !var14;
               }
            } else if (var16 == '\n') {
               aM[var6++] = var5;
               aM[var6++] = (short)(var15 - var5);
               aM[var6++] = var4;
               aM[var6++] = (short)var9;
               var5 = (short)(var15 + 1);
               var4 = 0;
               var9 = this.aD;
               var12 = false;
            } else {
               if (var16 < ' ') {
                  if (var16 == 1 || var16 != 2) {
                     continue;
                  }

                  var16 = var1.charAt(var15);
               }

               var7 = var16 == ' ' ? this.j() : var7 + this.n();
               if (var14) {
                  var7++;
               }

               var13 += (short)var7;
               if ((var4 += (short)var7) > var2) {
                  boolean var33 = !var12;
                  byte var34 = 0;
                  if (var33) {
                     var4 = (short)(var4 - (short)var7);
                     var10 = 0;
                     var15--;
                     var13 = 0;
                     var34 = 1;
                  } else {
                     var15 = var10;
                     var4 = (short)(var4 - (short)this.j());
                  }

                  var12 = false;
                  aM[var6++] = var5;
                  aM[var6++] = (short)(var15 - var5 + var34);
                  aM[var6++] = (short)(var4 - var13);
                  aM[var6++] = (short)var9;
                  if (var33) {
                     var11 = var14;
                     var13 = 0;
                  }

                  var4 = 0;
                  var5 = (short)(var15 + 1);
                  var9 = this.aD;
                  var14 = var11;
               }
            }
         } else {
            if (var16 == ' ') {
               var4 += (short)this.j();
            }

            var10 = (short)var15;
            var11 = var14;
            var12 = true;
            var13 = 0;
            if (var4 > var2) {
               var12 = false;
               if (var1.charAt(var10) == ' ') {
                  var4 -= (short)this.j();
               }

               var14 = var11;
               aM[var6++] = var5;
               aM[var6++] = (short)(var10 - var5);
               aM[var6++] = var4;
               aM[var6++] = (short)var9;
               var4 = 0;
               var5 += (short)(var10 - var5 + 1);
               var9 = this.aD;
            }
         }
      }

      aM[var6++] = var5;
      aM[var6++] = (short)(var1.length() - var5);
      aM[var6++] = var4;
      aM[var6++] = (short)var9;
      aM[0] = (short)(var6 / 4);
      return aM;
   }

   final void a(Graphics var1, String var2, short[] var3, int var4, int var5, int var6, int var7, int var8) {
      short var9 = var3[0];
      if (var7 == -1) {
         var7 = var9;
      }

      if (var6 + var7 > var9) {
         var7 = var9 - var6;
      }

      int var10 = b(var3, 0);

      for (int var11 = var6 + 1; var11 < var7; var11++) {
         var10 += b(var3, var11) + this.h();
      }

      if ((var8 & 32) != 0) {
         var5 -= var10;
      } else if ((var8 & 2) != 0) {
         var5 -= var10 >> 1;
      }

      aB = this.aa;
      int var17;
      int var12 = (var17 = t.b(var1, true)) + t.d(var1, true);
      var17 -= var10;
      var12 += var10;
      var10 = 0;

      for (int var13 = var6; var13 < var9 && var10 <= var7 - 1; var10++) {
         int var15 = var13;
         short[] var14 = var3;
         var15 = (var15 << 2) + 1;
         int var10000 = aN = var14[var15];
         var15 = var13;
         var14 = var3;
         var15 = (var15 << 2) + 2;
         aO = var10000 + var14[var15];
         if (aN < var2.length() && var2.charAt(aN) == '\n') {
            aN++;
         }

         var5 += var13 == var6 ? b(var3, var13) - this.aD : this.h() + b(var3, var13);
         int var21 = var4;
         var15 = var5;
         if (var5 >= var17) {
            if (var15 > var12) {
               break;
            }

            if ((var8 & 43) != 0) {
               if (this.aL >= 0) {
                  if ((var8 & 8) != 0) {
                     var21 = var4 - (a(var3, var13) * this.aL >> 8);
                  } else if ((var8 & 1) != 0) {
                     var21 = var4 - (a(var3, var13) * this.aL >> 9);
                  }
               } else if ((var8 & 8) != 0) {
                  var21 = var4 - a(var3, var13);
               } else if ((var8 & 1) != 0) {
                  var21 = var4 - (a(var3, var13) >> 1);
               }
            }

            this.a(var1, var2, var21, var15, 0, false);
         }

         var13++;
      }

      aN = -1;
      aO = -1;
      aP = -1;
      this.aa = aB;
   }

   final void a(String var1, char[] var2) {
      if (var1 != null || var2 != null) {
         i = 0;
         aC = this.k();
         int var3 = 0;
         boolean var4 = var1 != null;
         int var5 = aN >= 0 ? aN : 0;
         int var6;
         if (var4) {
            var6 = aO >= 0 ? aO : var1.length();
         } else {
            var6 = aO >= 0 ? aO : var2.length;
         }

         boolean var7 = this.aJ;

         while (var5 < var6) {
            char var8;
            if ((var8 = var4 ? var1.charAt(var5) : var2[var5]) == 92) {
               var5++;
               if ((var4 ? var1.charAt(var5) : var2[var5]) == '^') {
                  var7 = !var7;
               }
            } else {
               label124: {
                  int var10000;
                  if (var8 > 32) {
                     var10000 = this.k(var8);
                  } else {
                     if (var8 == 32 || var8 == au) {
                        if (var8 == 32) {
                           var3 += this.j();
                        }
                        break label124;
                     }

                     if (var8 == 32) {
                        var3 += this.j();
                        break label124;
                     }

                     if (var8 == 10) {
                        if (var3 > i) {
                           i = var3;
                        }

                        var3 = 0;
                        aC = aC + this.h() + this.k();
                        break label124;
                     }

                     if (var8 == 1) {
                        var5++;
                        break label124;
                     }

                     if (var8 != 2) {
                        break label124;
                     }

                     var5++;
                     var10000 = var4 ? var1.charAt(var5) : var2[var5];
                  }

                  var8 = var10000;
                  var3 += this.z(var8) + this.n();
                  Math.abs(0);
                  if (var7) {
                     var3++;
                  }
               }
            }

            var5++;
         }

         if (var3 > i) {
            i = var3;
         }

         if (i > 0) {
            i = i - this.n();
         }
      }
   }

   final void a(Graphics var1, String var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, var5, true);
   }

   private void a(Graphics var1, String var2, int var3, int var4, int var5, boolean var6) {
      boolean var15 = (boolean)var6;
      var6 = var5;
      var5 = var4;
      var4 = var3;
      String var18 = var2;
      int var11 = 0;
      int var10 = 1;
      boolean var9 = var15;
      int var8 = -1;
      int var7 = var6;
      var6 = var5;
      var5 = var4;
      char[] var21 = null;
      String var19 = var18;
      Graphics var17 = var1;
      a var16 = this;
      boolean var12 = var19 != null;
      if (var19 != null || var21 != null) {
         if (!var11) {
            if (var16.aL >= 0) {
               var6 += var16.aH * var16.aL >> 8;
            } else {
               var6 += var16.aH;
            }

            if (var10) {
               var16.a(var19, var21);
            }

            if ((var7 & 43) != 0) {
               if (!var10) {
                  var16.a(var19, var21);
               }

               if ((var7 & 8) != 0) {
                  var5 -= i;
               } else if ((var7 & 1) != 0) {
                  var5 -= i >> 1;
               }

               if ((var7 & 32) != 0) {
                  var6 -= aC;
               } else if ((var7 & 2) != 0) {
                  var6 -= aC >> 1;
               }
            }
         }

         var7 = var5;
         var10 = var6;
         if (var9) {
            aB = var16.aa;
         }

         var11 = aN >= 0 ? aN : 0;
         int var13;
         if (var12) {
            var13 = aO >= 0 ? aO : var19.length();
         } else {
            var13 = aO >= 0 ? aO : var21.length;
         }

         if (aP >= 0 && var13 > aP) {
            var13 = aP;
         }

         if (var13 > var11) {
            if (l) {
               int var14 = var13 - var11 + 4;
               if (k == null) {
                  var6 = var14;
                  k = new char[Math.max(1024, var6)];
               }

               if (k.length < var14) {
                  k = new char[var14];
               }

               if (var21 == null) {
                  var19.getChars(var11, var13, k, 2);
                  var12 = false;
                  var19 = null;
                  var21 = k;
               } else {
                  t.a(var21, var11, k, 2, var13 - var11);
                  var21 = k;
               }

               k[0] = 1;
               k[1] = (char)var16.aa;
               k[var14 - 2] = 1;
               k[var14 - 1] = (char)var16.aa;
               var11 = 0;
               var13 = var14;
               t.a(var21, var14);
            }

            for (; var11 < var13; var11++) {
               char var36;
               if ((var36 = var12 ? var19.charAt(var11) : var21[var11]) == 92) {
                  var11++;
                  char var27;
                  if ((var27 = var12 ? var19.charAt(var11) : var21[var11]) == '_') {
                     var16.aI = !var16.aI;
                  } else if (var27 == '^') {
                     var16.aJ = !var16.aJ;
                  } else {
                     var36 = var27 & 255;
                     if (!m) {
                        var16.m(var36 - 48);
                     }
                  }
               } else if (var36 != au) {
                  int var10000;
                  if (var36 > 32) {
                     var10000 = var16.k(var36);
                  } else {
                     if (var36 == 32) {
                        if (var16.aI) {
                           var8 = var16.k(95);
                           var6 = var7 + (var16.j() - var16.z(var8) >> 1);
                           var16.a(var17, var8, var6, var10, 0);
                        }

                        var7 += var16.j();
                        continue;
                     }

                     if (var36 == 10) {
                        var7 = var5;
                        var10 += var16.h() + var16.k();
                        continue;
                     }

                     if (var36 == 1) {
                        var11++;
                        char var29;
                        if ((var29 = var12 ? var19.charAt(var11) : var21[var11]) < var16.b && !m) {
                           var16.m(var29);
                        }

                        if (var29 == 255 && !m) {
                           var16.aa = aB;
                        }
                        continue;
                     }

                     if (var36 != 2) {
                        continue;
                     }

                     var11++;
                     var10000 = var12 ? var19.charAt(var11) : var21[var11];
                  }

                  var36 = var10000;
                  var16.a(var17, var36, var7, var10, 0);
                  if (var16.aI) {
                     var8 = var16.k(95);
                     var6 = var7 + (var16.z(var36) - var16.z(var8) >> 1);
                     var16.a(var17, var8, var6, var10, 0);
                  }

                  if (var16.aJ) {
                     var16.a(var17, var36, ++var7, var10, 0);
                  }

                  var7 += var16.z(var36) + var16.n();
               }
            }

            if (var9) {
               var16.aa = aB;
            }
         }
      }
   }

   private final int z(int var1) {
      return this.aL >= 0 ? this.m(var1, 0) * this.aL >> 8 : this.m(var1, 0);
   }

   final void m(int var1) {
      int var2 = var1;
      a var3 = this;
      if (var2 < var3.b && var2 >= 0) {
         var3.aa = var2;
      }
   }

   final int l() {
      return this.aa;
   }

   final void n(int var1) {
      int var3 = var1;
      a var2 = this;
      if ((this.c & 1) != 0) {
         if (var2.ag == null) {
            var2.ag = new int[var2.b][][];
         }

         if (var2.ag[var3] == null) {
            var2.ag[var3] = new int[var2.o][];
         }
      } else {
         if (var2.ah == null) {
            var2.ah = new l[var2.b][];
         }

         if (var2.ah[var3] == null) {
            var2.ah[var3] = new l[var2.o];
         }
      }

      if (this.o != 0) {
         var3 = this.o - 1;
         if ((this.X & 16777224) != 0) {
            int var13 = this.aa;
            this.aa = var1;

            for (int var4 = 0; var4 <= var3; var4++) {
               if (this.q(var4) == 0) {
                  int var5 = this.r(var4);
                  int var6 = this.s(var4);
                  int[] var7;
                  if (var5 > 0 && var6 > 0 && (var7 = this.y(var4)) != null) {
                     if ((t.ax & 1046496) != 0) {
                        boolean var8 = this.ab;
                        var7 = t.a(null, var7, 0, 0, var5, var6, 0, var8, this.ac, false);
                        var5 = t.aC;
                        var6 = t.aD;
                     }

                     int var9 = var4;
                     int var18 = var6;
                     int var17 = var5;
                     int[] var16 = var7;
                     a var15 = this;
                     int var10 = var17 * var18;
                     if ((var15.c & 1) != 0) {
                        if (var15.ag[var1][var9] == null || var15.ag[var1][var9].length != var10) {
                           var15.ag[var1][var9] = new int[var10];
                        }

                        System.arraycopy(b(var16, var18, var17, 4), 0, var15.ag[var1][var9], 0, var10);
                     } else {
                        boolean var11 = false;

                        for (int var12 = 0; var12 < var10; var12++) {
                           if ((var16[var12] & 0xFF000000) != -16777216) {
                              var11 = true;
                              break;
                           }
                        }

                        var15.ah[var1][var9] = t.a(b(var16, var18, var17, 4), var18, var17, var11);
                     }
                  }
               }
            }

            this.aa = var13;
         }
      }
   }

   final void i(int var1, int var2) {
      if ((this.c & 1) != 0) {
         if (this.ag != null && var1 < this.ag.length) {
            if (var2 == -1) {
               this.ag[var1] = null;
               return;
            }

            if (this.ag[var1] != null) {
               this.ag[var1][var2] = null;
               return;
            }
         }
      } else if (this.ah != null && var1 < this.ah.length) {
         if (var2 == -1) {
            this.ah[var1] = null;
            return;
         }

         if (this.ah[var1] != null) {
            this.ah[var1][var2] = null;
         }
      }
   }

   final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
      var2 = this.K[var2] + var3;
      if ((this.X & 2097152) != 0) {
         var3 = this.M[var2];
      } else {
         var3 = this.L[var2] & 255;
      }

      int var7 = this.t(var2);
      int var8 = this.u(var2);
      int var9 = this.S[var2] & 15;
      if ((var6 & 1) != 0) {
         var9 = ak[var9 & 7] | var9 & -8;
         var7 = -var7;
      }

      if ((var6 & 2) != 0) {
         var9 = al[var9 & 7] | var9 & -8;
         var8 = -var8;
      }

      if ((var6 & 4) != 0) {
         var9 = am[var9 & 7] | var9 & -8;
         var2 = var7;
         var7 = -var8;
         var8 = var2;
      }

      if (t.I(13) && !t.W()) {
         var2 = t.U();
         var6 = t.V();
         var7 = var2 * var7 / 100;
         var8 = var6 * var8 / 100;
      }

      this.a(var1, var3, var4 + var7, var5 + var8, var9);
   }

   final void a(Graphics var1, int var2, int var3, int var4, int var5) {
      this.b(var1, var2, var3, var4, var5);
   }

   final void b(Graphics var1, int var2, int var3, int var4, int var5) {
      this.ai++;
      int var6;
      if ((var6 = this.p(var2)) > 0) {
         for (int var7 = 0; var7 < var6; var7++) {
            int var12 = 0;
            int var11 = var7;
            Graphics var9 = var1;
            a var8 = this;
            int var10 = this.l(var2, var11);
            var11 = var8.w(var10);
            int var13 = var8.v(var10);
            if ((var8.X & 16384) != 0 && (var8.c & 16) == 0) {
               var8.aa = var8.I[var10] & 255;
            }

            int var14 = var13;
            var12 = 0;
            int var17 = 0;
            if ((var11 & 16) == 0 && var8.U >= 0) {
               var13 = var8.T[var8.U][var13];
            }

            if ((var11 & 16) == 0) {
               var12 = var8.r(var13);
               var17 = var8.s(var13);
            }

            int var18 = var12;
            int var19 = var17;
            int var16 = var10;
            int var15 = 0 + var8.G[var16];
            var16 = var10;
            var16 = 0 + var8.H[var16];
            if ((var11 & 4) != 0) {
               var10 = var12;
               var12 = var17;
               var17 = var10;
            }

            if ((var5 & 1) != 0) {
               var11 = ak[var11 & 7] | var11 & -8;
               var15 = -var15 - var12;
            }

            if ((var5 & 2) != 0) {
               var11 = al[var11 & 7] | var11 & -8;
               var16 = -var16 - var17;
            }

            if ((var5 & 4) != 0) {
               var11 = am[var11 & 7] | var11 & -8;
               var10 = var15;
               var15 = -var16 - var17;
               var16 = var10;
            }

            if (t.I(13) && aQ != 1 && !t.W()) {
               var10 = t.U();
               var12 = t.V();
               if (t.X() % 256 != 0) {
                  t.K(-var15);
                  t.L(-var16);
               }

               var15 = var10 * var15 / 100;
               var16 = var12 * var16 / 100;
            }

            var10 = var3 + var15;
            var12 = var4 + var16;
            if ((var11 & 16) != 0) {
               var8.a(var9, var13, var10, var12, var11 & 15);
            } else {
               var8.a(var9, var14, var10, var12, var11 & 15, var18, var19);
            }
         }
      }

      this.ai--;
   }

   final void c(Graphics var1, int var2, int var3, int var4, int var5) {
      t.H(13);
      t.J(50);
      this.a(var1, var2, var3, var4, var5);
      t.a(13, false);
   }

   private int A(int var1) {
      if (this.u != null) {
         for (byte var2 = 0; var2 < this.u.length; var2 += 2) {
            if (this.u[var2] == var1) {
               return this.u[var2 + 1];
            }
         }
      }

      return -1;
   }

   final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      f[0] = var6;
      f[1] = var7;
      int[] var121 = f;
      var6 = var5;
      var5 = var4;
      var4 = var3;
      var3 = var2;
      Graphics var76 = var1;
      a var68 = this;
      int var8 = var4;
      int var9 = var5;
      int var10 = var6;
      if (var68.U >= 0) {
         var3 = var68.T[var68.U][var3];
      }

      if (t.I(13) && t.W()) {
         int var11 = t.U();
         int var12 = t.V();
         var4 = var4 * var11 / 100;
         var5 = var5 * var12 / 100;
      }

      if (var68.q(var3) == 0) {
         if ((var6 & 1) == 0 || (var6 & 2) == 0) {
            if ((var6 & 1) != 0) {
               var6 = var6 & -2 | 2;
            } else if ((var6 & 2) != 0) {
               var6 = var6 & -3 | 1;
            }
         }

         int var163 = var4;
         int var10000 = e - var5;
         int var169 = var6;
         var5 = var3;
         a var87 = var68;
         int var13 = var68.s[var5];
         if ((var169 & 4) != 0) {
            var13 = var87.r[var5];
         }

         if (var13 < 0) {
            var13 += 255;
         }

         if (t.I(13)) {
            int var14 = t.V();
            var13 = var13 * var14 / 100;
         }

         var4 = var10000 - var13;
         var5 = var163;
      }

      int var164 = var121[0];
      int var170;
      var7 = var170 = var121[1];
      int var173 = var164;
      int var183 = var7;
      int var15 = var173;
      if ((var6 & 4) != 0) {
         int var16 = var7;
         var7 = var173;
         var173 = var16;
      }

      if (var68.q(var3) != 0 && var76 != null) {
         var6 = var10;
         int var82 = var5;
         var2 = var4;
         var183 = var7;
         var173 = var173;
         var170 = var3;
         Graphics var111 = var76;
         a var95 = var68;
         if (t.I(9)) {
            var7 = t.F(var95.ap[var170]);
         } else {
            var7 = var95.ap[var170];
         }

         var111.setColor(var7);
         switch (var95.an[var170]) {
            case 1:
               var173--;
               var183--;
               if (t.I(12)) {
                  var8 = t.ay[12][1];
                  t.a(var111, var2, var82, var173, var183, var7 & 16777215 | var8 << 24);
                  return;
               }

               t.d(var111, var2, var82, var173, var183);
               return;
            case 2:
               if ((var7 & 0xFF000000) != -16777216 && (var7 & 0xFF000000) != 0) {
                  t.E(var7);
                  t.e(var111, var2, var82, var173, var183);
                  return;
               }

               if (t.I(12)) {
                  var8 = t.ay[12][1];
                  t.E(var7 | var8 << 24);
                  t.e(var111, var2, var82, var173, var183);
                  return;
               }

               t.c(var111, var2, var82, var173, var183);
               return;
            case 3:
            case 4:
               if ((var8 = var95.A(var170)) == -1) {
                  return;
               }

               var7 = var95.t[var8];
               var9 = var95.t[var8 + 1];
               if ((var6 & 1) != 0) {
                  var7 = 90 - var7;
               }

               if ((var6 & 2) != 0) {
                  var7 = -var7;
                  var9 = -var9;
               }

               if ((var6 & 4) != 0) {
                  var7 -= 90;
               }

               if (var95.an[var170] != 3) {
                  var4 = var9;
                  int var75 = var7;
                  t.a(var111, var2, var82, var173, var183, var75, var4);
                  return;
               }

               var4 = var9;
               int var74 = var7;
               t.b(var111, var2, var82, var173, var183, var74, var4);
               break;
            case 6:
            case 7:
               if ((var8 = var95.A(var170)) == -1) {
                  return;
               }

               var7 = var95.t[var8];
               var9 = var95.t[var8 + 1];
               var10 = var95.t[var8 + 2];
               var164 = var95.t[var8 + 3];
               var8 = var2;
               var173 = var82;
               if ((var6 & 1) != 0) {
                  var7 = -var7;
                  var10 = -var10;
                  var2 += Math.abs(var7) > Math.abs(var10) ? Math.abs(var7) : Math.abs(var10);
               }

               if ((var6 & 2) != 0) {
                  var9 = -var9;
                  var164 = -var164;
                  var82 += Math.abs(var9) > Math.abs(var164) ? Math.abs(var9) : Math.abs(var164);
               }

               if ((var6 & 4) != 0) {
                  var6 = Math.abs(var9) > Math.abs(var164) ? Math.abs(var9) : Math.abs(var164);
                  int var71 = var82 - var173;
                  var82 = var173 + (var2 - var8);
                  var2 = var8 - var71 + var6;
                  int var72 = var7;
                  var7 = -var9;
                  var9 = var72;
                  int var73 = var10;
                  var10 = -var164;
                  var164 = var73;
               }

               if (var95.an[var170] != 6) {
                  int var231 = var2 + var7;
                  int var10004 = var82 + var9;
                  int var10005 = var2 + var10;
                  var6 = var82 + var164;
                  var5 = var10005;
                  var4 = var10004;
                  var3 = var231;
                  int var80 = var82;
                  t.c(var111, var2, var80, var3, var4, var5, var6);
                  return;
               }

               int var10003 = var2 + var7;
               var8 = var82 + var9;
               var6 = var10003;
               var4 = var82;
               t.a(var111, var2, var4, var6, var8, true);
               int var223 = var2 + var7;
               int var226 = var82 + var9;
               var10003 = var2 + var10;
               var7 = var82 + var164;
               var6 = var10003;
               var4 = var226;
               t.a(var111, var223, var4, var6, var7, true);
               var10003 = var2 + var10;
               var4 = var82 + var164;
               var3 = var10003;
               int var79 = var82;
               t.a(var111, var2, var79, var3, var4, true);
               break;
            case 8:
               var8 = var2;
               var7 = var2 + var173;
               var9 = var82;
               var10 = var82 + var183;
               if ((var6 & 1) != 0) {
                  var8 = var7;
                  var7 = var2;
               }

               if ((var6 & 2) != 0) {
                  var9 = var10;
                  var10 = var82;
               }

               if ((var6 & 4) != 0) {
                  var164 = var8;
                  var8 = var7;
                  var7 = var164;
               }

               var4 = var10;
               var3 = var7;
               var2 = var9;
               t.a(var111, var8, var2, var3, var4, true);
               return;
            case 9:
               if ((var8 = var95.A(var170)) != -1) {
                  var9 = var95.t[var8] & '\uffff' | var95.t[var8 + 1] << 16 & -65536;
                  if (t.I(9)) {
                     var9 = t.F(var9);
                  }

                  short var159 = var95.t[var8 + 2];
                  if ((var6 & 1) != 0 && var159 < 2) {
                     int var69 = var7;
                     var7 = var9;
                     var9 = var69;
                  }

                  if ((var6 & 2) != 0 && var159 > 1) {
                     int var70 = var7;
                     var7 = var9;
                     var9 = var70;
                  }

                  byte var160;
                  if (var159 == 0) {
                     var160 = 4;
                  } else if (var159 == 1) {
                     var160 = 8;
                  } else if (var159 == 2) {
                     var160 = 16;
                  } else {
                     var160 = 32;
                  }

                  if ((var6 & 4) != 0) {
                     if (var160 == 4) {
                        var160 = 16;
                     } else if (var160 == 8) {
                        var160 = 32;
                     } else if (var160 == 16) {
                        var160 = 8;
                     } else if (var160 == 32) {
                        var160 = 4;
                     }
                  }

                  if (var7 >>> 24 != 255 || var9 >>> 24 != 255) {
                     t.b(var111, var2, var82, var173, var183, var7, var9, var160);
                     return;
                  }

                  t.a(var111, var2, var82, var173, var183, var7, var9, var160);
               }
            case 5:
            default:
               return;
         }
      } else {
         if (t.I(13) && t.X() % 360 != 0) {
            int var190 = t.I(13) ? t.X() : t.Y();
            if ((var6 & 4) != 0) {
               var6 &= -5;
               var190 += 64;
            }

            int var17 = var190;
            var17 = t.z(64 - var17);
            int var18 = t.z(var190);
            t.a(var17, var18, var7, var173, f);
            var18 = f[0];
            int var19 = f[1];
            var17 = var7 - t.aa();
            int var20 = t.Z();
            if (t.I(13)) {
               var17 = var17 * t.U() / 100;
               var20 = var20 * t.V() / 100;
               var7 = var7 * t.U() / 100;
               var173 = var173 * t.V() / 100;
               var18 = var18 * t.U() / 100;
               var19 = var19 * t.U() / 100;
            }

            t.a(var190, (var7 >> 1) - var17, (var173 >> 1) - var20, f);
            var4 += f[0] - var18 / 2 + var17;
            var5 += f[1] - var19 / 2 + var20;
         }

         if (aQ == 1) {
            var4 = var8;
            var5 = var9;
            var7 = var164;
            var173 = var170;
            if ((var6 & 4) != 0) {
               int var195 = var7;
               var7 = var173;
               var173 = var195;
            }

            if (var68.q(var3) == 5) {
               var4 -= var7 >> 1;
               var5 -= var173 >> 1;
            }

            if (var4 < aq) {
               aq = var4;
            }

            if (var5 < ar) {
               ar = var5;
            }

            if (var4 + var7 > as) {
               as = var4 + var7;
            }

            if (var5 + var173 > at) {
               at = var5 + var173;
            }

            return;
         }

         if (var7 <= 0 || var173 <= 0) {
            return;
         }

         if (t.a(var76)) {
            boolean var221;
            label424: {
               label500: {
                  int var217 = var7;
                  int var211 = var173;
                  int var206 = var9;
                  int var198 = var8;
                  Graphics var191 = var76;
                  int var21 = t.a(var76, true);
                  int var64 = t.b(var191, true);
                  int var65 = t.c(var191, true);
                  int var192 = t.d(var191, true);
                  if (t.I(13)) {
                     int var66 = t.U();
                     int var67 = t.V();
                     var211 = var211 * var66 / 100;
                     var217 = var217 * var67 / 100;
                  } else if (t.I(15)) {
                     break label500;
                  }

                  if (var198 + var211 < var21 || var206 + var217 < var64 || var198 >= var21 + var65 || var206 >= var64 + var192) {
                     var221 = false;
                     break label424;
                  }
               }

               var221 = true;
            }

            if (!var221) {
               return;
            }
         }

         int[] var193 = null;
         l var199 = null;
         if ((var68.X & 16777224) != 0) {
            if (var68.ah != null && var68.ah[var68.aa] != null) {
               var199 = var68.ah[var68.aa][var3];
            }

            if (var68.ag != null && var68.ag[var68.aa] != null) {
               var193 = var68.ag[var68.aa][var3];
            }

            boolean var207 = var68.ab;
            if ((var68.c & 1) != 0) {
               boolean var212 = true;
               if (var193 == null) {
                  var212 = false;
                  var193 = var68.y(var3);
               }

               if ((t.ax & 1046496) == 0) {
                  if (var193 != null) {
                     boolean var202;
                     if (var202 = !var212) {
                        var6 = var10;
                        var4 = var8;
                        var5 = var9;
                        int var219 = var183;
                        var183 = var15;
                        var15 = var219;
                     }

                     t.a(var76, var193, 0, var183, var4, var5, var183, var15, var207, var6, var202);
                  }

                  return;
               }

               if (!var212) {
                  var6 = am[var10 & 7] | var10 & -8;
                  int var200 = var183;
                  var183 = var15;
                  var15 = var200;
               }

               if (!var68.a(var3, var4, var5, var6)) {
                  boolean var201 = var68.m();
                  var193 = t.a(var76, var193, var4, var5, var183, var15, var201 ? 0 : var6, var207, var68.ac, false);
                  if (!var68.a(var3, var4, var5, var193, var6) && var193 != null) {
                     var207 = t.az;
                     var4 = t.aA;
                     var5 = t.aB;
                     var7 = t.aC;
                     var173 = t.aD;
                     l var218 = t.a(var193, var7, var173, var207);
                     t.a(var76, var218, var4, var5, false);
                     return;
                  }
               }
            } else if (var199 == null) {
               int[] var213 = var193;
               if (var193 == null) {
                  if ((t.ax & 1046496) != 0 && var68.m()) {
                     if (var68.a(var3, var4, var5, var6)) {
                        return;
                     }

                     var213 = var68.y(var3);
                  } else {
                     var213 = var68.y(var3);
                  }
               }

               if (var213 != null) {
                  if ((t.ax & 1046496) == 0) {
                     if (var68.ay < 0) {
                        var6 = var10;
                        var4 = var8;
                        var5 = var9;
                        var8 = var183;
                        var183 = var15;
                        var15 = var8;
                        var164 = var6;
                        boolean var151 = var207;
                        var8 = var15;
                        var7 = var183;
                        var6 = var5;
                        var5 = var4;
                        var4 = var183;
                        var8 = var8;
                        var7 = var7;
                        var4 = var4;
                        t.a(var76, var213, 0, var4, var5, var6, var7, var8, var151, var164, true);
                        return;
                     }

                     if (var68.ah == null) {
                        var68.ah = new l[var68.b][];

                        for (int var137 = 0; var137 < var68.b; var137++) {
                           var68.ah[var137] = new l[var68.o];
                        }
                     }

                     int[] var138 = new int[var7 * var173];
                     var9 = var173;
                     var10 = var7;
                     if ((var6 & 4) != 0) {
                        var9 = var7;
                        var10 = var173;
                     }

                     for (int var165 = 0; var165 < var9; var165++) {
                        for (int var171 = 0; var171 < var10; var171++) {
                           var138[var10 - var171 - 1 + var165 * var10] = var213[var165 + var9 * var171];
                        }
                     }

                     if ((var6 & 4) != 0) {
                        var199 = t.a(var138, var173, var7, var68.ab);
                     } else {
                        var199 = t.a(var138, var7, var173, var68.ab);
                     }

                     var68.a(var3, var199);
                     if (var199 != null) {
                        if (aj[var6 & 7] == 0) {
                           t.a(var76, var199, var4, var5, false);
                           return;
                        }

                        if ((var6 & 4) != 0) {
                           t.a(var76, var199, var173, var7, aj[var6 & 7], var4, var5, 20, false);
                           return;
                        }

                        t.a(var76, var199, var7, var173, aj[var6 & 7], var4, var5, 20, false);
                     }

                     return;
                  }

                  if (!var68.a(var3, var4, var5, var6)) {
                     boolean var136;
                     if (!(var136 = var68.m())) {
                        var6 = am[var10 & 7] | var10 & -8;
                     }

                     var10 = var183;
                     var183 = var15;
                     var15 = var10;
                     var213 = t.a(var76, var213, var4, var5, var183, var15, var136 ? 4 : var6, var207, var68.ac, false);
                     if (!var68.a(var3, var4, var5, var213, var6) && var213 != null) {
                        var207 = t.az;
                        var4 = t.aA;
                        var5 = t.aB;
                        var7 = t.aC;
                        var173 = t.aD;
                        l var157 = t.a(var213, var7, var173, var207);
                        t.a(var76, var157, var4, var5, false);
                        return;
                     }
                  }
               }
            } else if ((t.ax & 1046496) != 0) {
               if (!var68.a(var3, var4, var5, var6)) {
                  boolean var215 = var68.m();
                  int[] var204 = t.a(var76, var199, var4, var5, var183, var15, var215 ? 0 : var6, var207, var68.ac, false);
                  if (!var68.a(var3, var4, var5, var204, var6) && var204 != null) {
                     var207 = t.az;
                     var4 = t.aA;
                     var5 = t.aB;
                     var7 = t.aC;
                     var173 = t.aD;
                     l var220 = t.a(var204, var7, var173, var207);
                     t.a(var76, var220, var4, var5, false);
                     return;
                  }
               }
            } else {
               var7 = var164;
               var173 = var170;
               int var216 = var7;
               var7 = var173;
               var173 = var216;
               var68.a(var3, var199);
               if (var199 != null) {
                  if (aj[var6 & 7] == 0) {
                     t.a(var76, var199, var4, var5, false);
                     return;
                  }

                  t.a(var76, var199, var7, var173, aj[var6 & 7], var4, var5, 20, false);
               }
            }
         }
      }
   }

   static final int[] b(int[] var0, int var1, int var2, int var3) {
      if ((var3 & 7) == 0) {
         return var0;
      }

      int[] var4 = a(var0);
      int var5 = 0;
      int var6 = 0;
      switch (var3 & 7) {
         case 1:
            var5 = var1 * var2;
            var6 = var1 * (var2 - 1);

            for (int var30 = var2; --var30 >= 0; var6 -= var1 << 1) {
               for (int var13 = var1; --var13 >= 0; var4[var5] = var0[var6++]) {
                  var5--;
               }
            }
            break;
         case 2:
            var5 = (var2 - 1) * var1;

            for (int var29 = var2; --var29 >= 0; var6 += var1) {
               System.arraycopy(var0, var6, var4, var5, var1);
               var5 -= var1;
            }
            break;
         case 3:
            var6 = var1 * var2 - 1;

            while (var6 >= 0) {
               var4[var5++] = var0[var6--];
            }
            break;
         case 4:
            var5 = var1 * var2;
            int var28 = var2;

            while (--var28 >= 0) {
               var6 = var28;

               for (int var12 = var1; --var12 >= 0; var6 += var2) {
                  var4[--var5] = var0[var6];
               }
            }
            break;
         case 5:
            var5 = var1 * var2;
            int var27 = var2;

            while (--var27 >= 0) {
               var6 = var2 - 1 - var27;

               for (int var11 = var1; --var11 >= 0; var6 += var2) {
                  var4[--var5] = var0[var6];
               }
            }
            break;
         case 6:
            int var31 = (var5 = var1 * var2) - 1;
            int var26 = var2;

            while (--var26 >= 0) {
               var6 = var31--;

               for (int var10 = var1; --var10 >= 0; var6 -= var2) {
                  var4[--var5] = var0[var6];
               }
            }
            break;
         case 7:
            int var8 = (var5 = var1 * var2) - var2;
            int var7 = var2;

            while (--var7 >= 0) {
               var6 = var8++;

               for (int var9 = var1; --var9 >= 0; var6 -= var2) {
                  var4[--var5] = var0[var6];
               }
            }
      }

      return var4;
   }

   static final int[] c(int[] var0) {
      return a(var0);
   }
}
