public final class r extends q {
   private v bp;
   v aR;
   byte aS;
   private int bq;
   int aT;
   int aU;
   int aV;
   int aW;
   int aX;
   boolean aY;
   byte aZ;
   int ba;
   int[] bb = new int[2];
   int bc;
   int bd;
   private byte br;
   private byte bs;
   private static int bt = 0;
   public static boolean be = false;
   int bf = 0;
   w bg;
   private d[] bu;
   boolean[] bh;
   int bi;
   int[][] bj;
   int[] bk;
   private int bv;
   private int bw;
   int[] bl = new int[6];
   private int[] bx = new int[4];
   int[] bm;
   boolean bn = false;
   public static short bo = 0;
   private boolean by = true;
   private int bz = 0;
   private static int bA = 3000;
   private boolean bB = false;
   private boolean bC = false;
   private int bD;
   private int bE;
   private int bF;
   private int bG;

   private void ar() {
      try {
         this.au();
      } catch (Exception var1) {
         this.a(this.bl[0], -1, true);
      }
   }

   private void as() {
      this.bl[0] = 1;
      this.bl[1] = 2;
      this.bl[2] = 2;
      this.bl[3] = 3;
      this.bl[4] = 3;
      this.bl[5] = 3;
      this.bm[39] = t.n(3000, 5000);
   }

   final void k(int var1) {
      this.a(var1, 0, true);
   }

   private boolean at() {
      int var1 = this.bj[0][0];
      int var2 = this.bi * 5;
      short var3 = 0;
      if (this.bm[0] == 2) {
         var3 = q.k[var2 + 3];
      }

      if (this.bm[0] == 0) {
         var3 = q.c[var2 + 3];
      }

      if (this.bm[0] == 1) {
         var3 = q.g[var2 + 3];
      }

      if (this.bm[0] == 3) {
         var3 = q.o[var2 + 3];
      }

      if (this.bm[0] == 4) {
         var3 = q.s[var2 + 3];
      }

      if (this.bm[0] == 5) {
         var3 = q.w[var2 + 3];
      }

      if (this.bm[0] == 6) {
         var3 = q.A[var2 + 3];
      }

      if (this.bm[0] == 7) {
         var3 = q.E[var2 + 3];
      }

      if (this.bm[0] == 8) {
         var3 = q.I[var2 + 3];
      }

      if (this.bm[0] == 9) {
         var3 = q.M[var2 + 3];
      }

      if (this.bm[0] == 10) {
         var3 = q.Q[var2 + 3];
      }

      if (this.bm[0] == 11) {
         var3 = q.U[var2 + 3];
      }

      if (this.bm[0] == 12) {
         var3 = q.Y[var2 + 3];
      }

      return var1 >= var3 && this.bw == 0;
   }

   public static int aa() {
      int var0 = 0;
      if (q.ac != null) {
         for (int var1 = 0; var1 < q.ac.length; var1++) {
            if (q.ac[var1] != null && q.ac[var1].au == 0 && q.ac[var1].aP == 4 && ((r)q.ac[var1]).bc == 49 && ((r)q.ac[var1]).aX == 0) {
               var0++;
            }
         }
      }

      return var0;
   }

   public static void ab() {
      if (q.ac != null) {
         for (int var0 = 0; var0 < q.ac.length; var0++) {
            if (q.ac[var0] != null && q.ac[var0].au == 0 && q.ac[var0].aP == 4 && ((r)q.ac[var0]).bc == 49 && ((r)q.ac[var0]).aX == 0) {
               ((r)q.ac[var0]).bp.af();
            }
         }
      }
   }

   public static int[] ac() {
      int var0 = 0;

      for (int var1 = 0; var1 < q.ac.length; var1++) {
         if (q.ac[var1] != null && q.ac[var1].au == 0 && q.ac[var1].aP == 4 && ((r)q.ac[var1]).bm[41] == 1 && ((r)q.ac[var1]).aX == 0) {
            var0++;
         }
      }

      int var4 = 0;
      int[] var2 = new int[var0];

      for (int var3 = 0; var3 < q.ac.length; var3++) {
         if (q.ac[var3] != null && q.ac[var3].au == 0 && q.ac[var3].aP == 4 && ((r)q.ac[var3]).bm[41] == 1 && ((r)q.ac[var3]).aX == 0) {
            var2[var4] = var3;
            var4++;
         }
      }

      a(var2, 0, var0 - 1);
      return var2;
   }

   private static void a(int[] var0, int var1, int var2) {
      while (true) {
         int var3 = var0[var1];
         int var4 = var1;
         int var5 = var2;

         while (var4 < var5) {
            while (((r)q.ac[var0[var4]]).aZ >= ((r)q.ac[var3]).aZ && var4 < var5) {
               var4++;
            }

            while (((r)q.ac[var0[var5]]).aZ < ((r)q.ac[var3]).aZ) {
               var5--;
            }

            if (var4 < var5) {
               int var6 = var0[var4];
               var0[var4] = var0[var5];
               var0[var5] = var6;
            }
         }

         var0[var1] = var0[var5];
         var0[var5] = var3;
         if (var1 < var5 - 1) {
            a(var0, var1, var5 - 1);
         }

         if (var5 + 1 >= var2) {
            return;
         }

         var1 = var5 + 1;
         var0 = var0;
      }
   }

   private int au() {
      boolean var1 = false;

      try {
         if (this.bi == -1) {
            return -1;
         }

         int var3 = this.bi * 5;
         short var4 = 0;
         if (this.bm[0] == 2) {
            var4 = q.k[var3 + 1];
         } else if (this.bm[0] == 0) {
            var4 = q.c[var3 + 1];
         } else if (this.bm[0] == 1) {
            var4 = q.g[var3 + 1];
         } else if (this.bm[0] == 3) {
            var4 = q.o[var3 + 1];
         } else if (this.bm[0] == 4) {
            var4 = q.s[var3 + 1];
         } else if (this.bm[0] == 5) {
            var4 = q.w[var3 + 1];
         } else if (this.bm[0] == 6) {
            var4 = q.A[var3 + 1];
         } else if (this.bm[0] == 7) {
            var4 = q.E[var3 + 1];
         } else if (this.bm[0] == 8) {
            var4 = q.I[var3 + 1];
         } else if (this.bm[0] == 9) {
            var4 = q.M[var3 + 1];
         } else if (this.bm[0] == 10) {
            var4 = q.Q[var3 + 1];
         } else if (this.bm[0] == 11) {
            var4 = q.U[var3 + 1];
         } else if (this.bm[0] == 12) {
            var4 = q.Y[var3 + 1];
         }

         int var5 = this.bj[0][0];

         for (int var14 = 0; var14 < var4; var14++) {
            int[] var6;
            int[] var10000 = var6 = this.bj[var14 + 1];
            int var10002 = var6[4];
            int var7 = var6[0];
            int var2 = 0;
            var10000[4] = var10002 + var7;
            var6[5] += var7 = var6[1];
            var6[7] = t.y(t.o(this.bm[38], this.bm[35] * var6[4]));
            var6[8] = t.y(t.o(this.bm[38], var6[5]));
            var6[11] += var7 = var6[9];
            var6[12] += var7 = var6[10];
            var6[13] = t.y(var6[11]);
            var6[14] = t.y(var6[12]);
            var6[16] += var7 = var6[15];
            var6[17] = t.y(var6[16]);
            var6[19] += var7 = var6[18];
            var6[20] = t.y(var6[19]);
            if (var6[3] != -1) {
               var2 = var3 + 4;
               var7 = 0;
               if (this.bm[0] == 0) {
                  var7 = (q.c[var2] + var14) * 5;
               } else if (this.bm[0] == 1) {
                  var7 = (q.g[var2] + var14) * 5;
               } else if (this.bm[0] == 2) {
                  var7 = (q.k[var2] + var14) * 5;
               } else if (this.bm[0] == 3) {
                  var7 = (q.o[var2] + var14) * 5;
               } else if (this.bm[0] == 4) {
                  var7 = (q.s[var2] + var14) * 5;
               } else if (this.bm[0] == 5) {
                  var7 = (q.w[var2] + var14) * 5;
               } else if (this.bm[0] == 6) {
                  var7 = (q.A[var2] + var14) * 5;
               } else if (this.bm[0] == 7) {
                  var7 = (q.E[var2] + var14) * 5;
               } else if (this.bm[0] == 8) {
                  var7 = (q.I[var2] + var14) * 5;
               } else if (this.bm[0] == 9) {
                  var7 = (q.M[var2] + var14) * 5;
               } else if (this.bm[0] == 10) {
                  var7 = (q.Q[var2] + var14) * 5;
               } else if (this.bm[0] == 11) {
                  var7 = (q.U[var2] + var14) * 5;
               } else if (this.bm[0] == 12) {
                  var7 = (q.Y[var2] + var14) * 5;
               }

               short var16 = 0;
               if (this.bm[0] == 0) {
                  var16 = q.d[var7 + 4];
               } else if (this.bm[0] == 1) {
                  var16 = q.h[var7 + 4];
               } else if (this.bm[0] == 2) {
                  var16 = q.l[var7 + 4];
               } else if (this.bm[0] == 3) {
                  var16 = q.p[var7 + 4];
               } else if (this.bm[0] == 4) {
                  var16 = q.t[var7 + 4];
               } else if (this.bm[0] == 5) {
                  var16 = q.x[var7 + 4];
               } else if (this.bm[0] == 6) {
                  var16 = q.B[var7 + 4];
               } else if (this.bm[0] == 7) {
                  var16 = q.F[var7 + 4];
               } else if (this.bm[0] == 8) {
                  var16 = q.J[var7 + 4];
               } else if (this.bm[0] == 9) {
                  var16 = q.N[var7 + 4];
               } else if (this.bm[0] == 10) {
                  var16 = q.R[var7 + 4];
               } else if (this.bm[0] == 11) {
                  var16 = q.V[var7 + 4];
               } else if (this.bm[0] == 12) {
                  var16 = q.Z[var7 + 4];
               }

               int var8 = (var16 + var6[3]) * 3;
               var16 = 0;
               if (this.bm[0] == 0) {
                  var16 = q.e[var8];
               } else if (this.bm[0] == 1) {
                  var16 = q.i[var8];
               } else if (this.bm[0] == 2) {
                  var16 = q.m[var8];
               } else if (this.bm[0] == 3) {
                  var16 = q.q[var8];
               } else if (this.bm[0] == 4) {
                  var16 = q.u[var8];
               } else if (this.bm[0] == 5) {
                  var16 = q.y[var8];
               } else if (this.bm[0] == 6) {
                  var16 = q.C[var8];
               } else if (this.bm[0] == 7) {
                  var16 = q.G[var8];
               } else if (this.bm[0] == 8) {
                  var16 = q.K[var8];
               } else if (this.bm[0] == 9) {
                  var16 = q.O[var8];
               } else if (this.bm[0] == 10) {
                  var16 = q.S[var8];
               } else if (this.bm[0] == 11) {
                  var16 = q.W[var8];
               } else if (this.bm[0] == 12) {
                  var16 = q.aa[var8];
               }

               if (var5 == var16) {
                  short[] var9 = r(this.bm[0]);

                  for (int var18 = 0; var18 < var9[var8 + 1]; var18++) {
                     int var10 = 0;
                     int var11 = 0;
                     if (this.bm[0] == 0) {
                        var10 = (q.e[var8 + 2] + var18) * 5;
                        var11 = q.f[var10];
                     } else if (this.bm[0] == 1) {
                        var10 = (q.i[var8 + 2] + var18) * 5;
                        var11 = q.j[var10];
                     } else if (this.bm[0] == 2) {
                        var10 = (q.m[var8 + 2] + var18) * 5;
                        var11 = q.n[var10];
                     } else if (this.bm[0] == 3) {
                        var10 = (q.q[var8 + 2] + var18) * 5;
                        var11 = q.r[var10];
                     } else if (this.bm[0] == 4) {
                        var10 = (q.u[var8 + 2] + var18) * 5;
                        var11 = q.v[var10];
                     } else if (this.bm[0] == 5) {
                        var10 = (q.y[var8 + 2] + var18) * 5;
                        var11 = q.z[var10];
                     } else if (this.bm[0] == 6) {
                        var10 = (q.C[var8 + 2] + var18) * 5;
                        var11 = q.D[var10];
                     } else if (this.bm[0] == 7) {
                        var10 = (q.G[var8 + 2] + var18) * 5;
                        var11 = q.H[var10];
                     } else if (this.bm[0] == 8) {
                        var10 = (q.K[var8 + 2] + var18) * 5;
                        var11 = q.L[var10];
                     } else if (this.bm[0] == 9) {
                        var10 = (q.O[var8 + 2] + var18) * 5;
                        var11 = q.P[var10];
                     } else if (this.bm[0] == 10) {
                        var10 = (q.S[var8 + 2] + var18) * 5;
                        var11 = q.T[var10];
                     } else if (this.bm[0] == 11) {
                        var10 = (q.W[var8 + 2] + var18) * 5;
                        var11 = q.X[var10];
                     } else if (this.bm[0] == 12) {
                        var10 = (q.aa[var8 + 2] + var18) * 5;
                        var11 = q.ab[var10];
                     }

                     switch (var11) {
                        case 61:
                           if (this.bm[0] == 0) {
                              var6[7] = t.y(256 * this.bm[35] * q.f[var10 + 1]);
                              var6[8] = t.y(256 * q.f[var10 + 2]);
                              var6[0] = q.f[var10 + 3];
                              var6[1] = q.f[var10 + 4];
                              var6[4] = q.f[var10 + 1] << 8;
                              var6[5] = q.f[var10 + 2] << 8;
                           } else if (this.bm[0] == 1) {
                              var6[7] = t.y(256 * this.bm[35] * q.j[var10 + 1]);
                              var6[8] = t.y(256 * q.j[var10 + 2]);
                              var6[0] = q.j[var10 + 3];
                              var6[1] = q.j[var10 + 4];
                              var6[4] = q.j[var10 + 1] << 8;
                              var6[5] = q.j[var10 + 2] << 8;
                           } else if (this.bm[0] == 2) {
                              var6[7] = t.y(256 * this.bm[35] * q.n[var10 + 1]);
                              var6[8] = t.y(256 * q.n[var10 + 2]);
                              var6[0] = q.n[var10 + 3];
                              var6[1] = q.n[var10 + 4];
                              var6[4] = q.n[var10 + 1] << 8;
                              var6[5] = q.n[var10 + 2] << 8;
                           } else if (this.bm[0] == 3) {
                              var6[7] = t.y(256 * this.bm[35] * q.r[var10 + 1]);
                              var6[8] = t.y(256 * q.r[var10 + 2]);
                              var6[0] = q.r[var10 + 3];
                              var6[1] = q.r[var10 + 4];
                              var6[4] = q.r[var10 + 1] << 8;
                              var6[5] = q.r[var10 + 2] << 8;
                           } else if (this.bm[0] == 4) {
                              var6[7] = t.y(256 * this.bm[35] * q.v[var10 + 1]);
                              var6[8] = t.y(256 * q.v[var10 + 2]);
                              var6[0] = q.v[var10 + 3];
                              var6[1] = q.v[var10 + 4];
                              var6[4] = q.v[var10 + 1] << 8;
                              var6[5] = q.v[var10 + 2] << 8;
                           } else if (this.bm[0] == 5) {
                              var6[7] = t.y(256 * this.bm[35] * q.z[var10 + 1]);
                              var6[8] = t.y(256 * q.z[var10 + 2]);
                              var6[0] = q.z[var10 + 3];
                              var6[1] = q.z[var10 + 4];
                              var6[4] = q.z[var10 + 1] << 8;
                              var6[5] = q.z[var10 + 2] << 8;
                           } else if (this.bm[0] == 6) {
                              var6[7] = t.y(256 * this.bm[35] * q.D[var10 + 1]);
                              var6[8] = t.y(256 * q.D[var10 + 2]);
                              var6[0] = q.D[var10 + 3];
                              var6[1] = q.D[var10 + 4];
                              var6[4] = q.D[var10 + 1] << 8;
                              var6[5] = q.D[var10 + 2] << 8;
                           } else if (this.bm[0] == 7) {
                              var6[7] = t.y(256 * this.bm[35] * q.H[var10 + 1]);
                              var6[8] = t.y(256 * q.H[var10 + 2]);
                              var6[0] = q.H[var10 + 3];
                              var6[1] = q.H[var10 + 4];
                              var6[4] = q.H[var10 + 1] << 8;
                              var6[5] = q.H[var10 + 2] << 8;
                           } else if (this.bm[0] == 8) {
                              var6[7] = t.y(256 * this.bm[35] * q.L[var10 + 1]);
                              var6[8] = t.y(256 * q.L[var10 + 2]);
                              var6[0] = q.L[var10 + 3];
                              var6[1] = q.L[var10 + 4];
                              var6[4] = q.L[var10 + 1] << 8;
                              var6[5] = q.L[var10 + 2] << 8;
                           } else if (this.bm[0] == 9) {
                              var6[7] = t.y(256 * this.bm[35] * q.P[var10 + 1]);
                              var6[8] = t.y(256 * q.P[var10 + 2]);
                              var6[0] = q.P[var10 + 3];
                              var6[1] = q.P[var10 + 4];
                              var6[4] = q.P[var10 + 1] << 8;
                              var6[5] = q.P[var10 + 2] << 8;
                           } else if (this.bm[0] == 10) {
                              var6[7] = t.y(256 * this.bm[35] * q.T[var10 + 1]);
                              var6[8] = t.y(256 * q.T[var10 + 2]);
                              var6[0] = q.T[var10 + 3];
                              var6[1] = q.T[var10 + 4];
                              var6[4] = q.T[var10 + 1] << 8;
                              var6[5] = q.T[var10 + 2] << 8;
                           } else if (this.bm[0] == 11) {
                              var6[7] = t.y(256 * this.bm[35] * q.X[var10 + 1]);
                              var6[8] = t.y(256 * q.X[var10 + 2]);
                              var6[0] = q.X[var10 + 3];
                              var6[1] = q.X[var10 + 4];
                              var6[4] = q.X[var10 + 1] << 8;
                              var6[5] = q.X[var10 + 2] << 8;
                           } else if (this.bm[0] == 12) {
                              var6[7] = t.y(256 * this.bm[35] * q.ab[var10 + 1]);
                              var6[8] = t.y(256 * q.ab[var10 + 2]);
                              var6[0] = q.ab[var10 + 3];
                              var6[1] = q.ab[var10 + 4];
                              var6[4] = q.ab[var10 + 1] << 8;
                              var6[5] = q.ab[var10 + 2] << 8;
                           }
                           break;
                        case 62:
                           if ((var6[6] & 1) == 0) {
                              t.c(this.bm[40], this.l(var14), 9);
                              t.c(this.bm[40], this.l(var14), 8);
                              if (this.bm[0] == 0) {
                                 this.bu[var14].a(255 & q.f[var10 + 1]);
                              } else if (this.bm[0] == 1) {
                                 this.bu[var14].a(255 & q.j[var10 + 1]);
                              } else if (this.bm[0] == 2) {
                                 this.bu[var14].a(255 & q.n[var10 + 1]);
                              } else if (this.bm[0] == 3) {
                                 this.bu[var14].a(255 & q.r[var10 + 1]);
                              } else if (this.bm[0] == 4) {
                                 this.bu[var14].a(255 & q.v[var10 + 1]);
                              } else if (this.bm[0] == 5) {
                                 this.bu[var14].a(255 & q.z[var10 + 1]);
                              } else if (this.bm[0] == 6) {
                                 this.bu[var14].a(255 & q.D[var10 + 1]);
                              } else if (this.bm[0] == 7) {
                                 this.bu[var14].a(255 & q.H[var10 + 1]);
                              } else if (this.bm[0] == 8) {
                                 this.bu[var14].a(255 & q.L[var10 + 1]);
                              } else if (this.bm[0] == 9) {
                                 this.bu[var14].a(255 & q.P[var10 + 1]);
                              } else if (this.bm[0] == 10) {
                                 this.bu[var14].a(255 & q.T[var10 + 1]);
                              } else if (this.bm[0] == 11) {
                                 this.bu[var14].a(255 & q.X[var10 + 1]);
                              } else if (this.bm[0] == 12) {
                                 this.bu[var14].a(255 & q.ab[var10 + 1]);
                              }
                           }
                           break;
                        case 63:
                           if (this.bm[0] == 0) {
                              this.bu[var14].c = this.bu[var14].c | q.f[var10 + 1];
                              if (this.bm[35] == -1 && (q.f[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 1) {
                              this.bu[var14].c = this.bu[var14].c | q.j[var10 + 1];
                              if (this.bm[35] == -1 && (q.j[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 2) {
                              this.bu[var14].c = this.bu[var14].c | q.n[var10 + 1];
                              if (this.bm[35] == -1 && (q.n[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 3) {
                              this.bu[var14].c = this.bu[var14].c | q.r[var10 + 1];
                              if (this.bm[35] == -1 && (q.r[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 4) {
                              this.bu[var14].c = this.bu[var14].c | q.v[var10 + 1];
                              if (this.bm[35] == -1 && (q.v[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 5) {
                              this.bu[var14].c = this.bu[var14].c | q.z[var10 + 1];
                              if (this.bm[35] == -1 && (q.z[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 6) {
                              this.bu[var14].c = this.bu[var14].c | q.D[var10 + 1];
                              if (this.bm[35] == -1 && (q.D[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 7) {
                              this.bu[var14].c = this.bu[var14].c | q.H[var10 + 1];
                              if (this.bm[35] == -1 && (q.H[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 8) {
                              this.bu[var14].c = this.bu[var14].c | q.L[var10 + 1];
                              if (this.bm[35] == -1 && (q.L[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 9) {
                              this.bu[var14].c = this.bu[var14].c | q.P[var10 + 1];
                              if (this.bm[35] == -1 && (q.P[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 10) {
                              this.bu[var14].c = this.bu[var14].c | q.T[var10 + 1];
                              if (this.bm[35] == -1 && (q.T[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 11) {
                              this.bu[var14].c = this.bu[var14].c | q.X[var10 + 1];
                              if (this.bm[35] == -1 && (q.X[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 12) {
                              this.bu[var14].c = this.bu[var14].c | q.ab[var10 + 1];
                              if (this.bm[35] == -1 && (q.ab[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           }
                           break;
                        case 64:
                           if (this.bm[0] == 0) {
                              this.bu[var14].c = this.bu[var14].c & ~q.f[var10 + 1];
                              if (q.f[var10 + 35] == -1 && (q.f[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 1) {
                              this.bu[var14].c = this.bu[var14].c & ~q.j[var10 + 1];
                              if (q.j[var10 + 35] == -1 && (q.j[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 2) {
                              this.bu[var14].c = this.bu[var14].c & ~q.n[var10 + 1];
                              if (q.n[var10 + 35] == -1 && (q.n[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 3) {
                              this.bu[var14].c = this.bu[var14].c & ~q.r[var10 + 1];
                              if (q.r[var10 + 35] == -1 && (q.r[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 4) {
                              this.bu[var14].c = this.bu[var14].c & ~q.v[var10 + 1];
                              if (q.v[var10 + 35] == -1 && (q.v[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 5) {
                              this.bu[var14].c = this.bu[var14].c & ~q.z[var10 + 1];
                              if (q.z[var10 + 35] == -1 && (q.z[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 6) {
                              this.bu[var14].c = this.bu[var14].c & ~q.D[var10 + 1];
                              if (q.D[var10 + 35] == -1 && (q.D[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 7) {
                              this.bu[var14].c = this.bu[var14].c & ~q.H[var10 + 1];
                              if (q.H[var10 + 35] == -1 && (q.H[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 8) {
                              this.bu[var14].c = this.bu[var14].c & ~q.L[var10 + 1];
                              if (q.L[var10 + 35] == -1 && (q.L[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 9) {
                              this.bu[var14].c = this.bu[var14].c & ~q.P[var10 + 1];
                              if (q.P[var10 + 35] == -1 && (q.P[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 10) {
                              this.bu[var14].c = this.bu[var14].c & ~q.T[var10 + 1];
                              if (this.bm[35] == -1 && (q.T[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 11) {
                              this.bu[var14].c = this.bu[var14].c & ~q.X[var10 + 1];
                              if (q.X[var10 + 35] == -1 && (q.X[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           } else if (this.bm[0] == 12) {
                              this.bu[var14].c = this.bu[var14].c & ~q.ab[var10 + 1];
                              if (q.ab[var10 + 35] == -1 && (q.ab[var10 + 1] & 1) != 0) {
                                 this.bu[var14].c ^= 1;
                              }
                           }
                           break;
                        case 65:
                           short[] var48 = null;
                           if (this.bm[0] == 0) {
                              var48 = q.f;
                           }

                           if (this.bm[0] == 1) {
                              var48 = q.j;
                           }

                           if (this.bm[0] == 2) {
                              var48 = q.n;
                           }

                           if (this.bm[0] == 3) {
                              var48 = q.r;
                           }

                           if (this.bm[0] == 4) {
                              var48 = q.v;
                           }

                           if (this.bm[0] == 5) {
                              var48 = q.z;
                           }

                           if (this.bm[0] == 6) {
                              var48 = q.D;
                           }

                           if (this.bm[0] == 7) {
                              var48 = q.H;
                           }

                           if (this.bm[0] == 8) {
                              var48 = q.L;
                           }

                           if (this.bm[0] == 9) {
                              var48 = q.P;
                           }

                           if (this.bm[0] == 10) {
                              var48 = q.T;
                           }

                           if (this.bm[0] == 11) {
                              var48 = q.X;
                           }

                           if (this.bm[0] == 12) {
                              var48 = q.ab;
                           }

                           var6[13] = var48[var10 + 1];
                           var6[14] = var48[var10 + 2];
                           var6[9] = var48[var10 + 3];
                           var6[10] = var48[var10 + 4];
                           var6[11] = var48[var10 + 1] << 8;
                           var6[12] = var48[var10 + 2] << 8;
                           break;
                        case 66:
                           var6[17] = q.n[var10 + 1];
                           var6[15] = q.n[var10 + 2];
                           var6[16] = q.n[var10 + 1] << 8;
                           break;
                        case 67:
                           var6[20] = q.n[var10 + 1];
                           var6[18] = q.n[var10 + 2];
                           var6[19] = q.n[var10 + 1] << 8;
                           break;
                        case 68:
                           short var29;
                           this.bu[var14].h = var29 = q.n[var10 + 1];
                           break;
                        case 105:
                           short[] var32 = null;
                           if (this.bm[0] == 0) {
                              var32 = new short[q.f.length];
                              System.arraycopy(q.f, 0, var32, 0, q.f.length);
                           }

                           if (this.bm[0] == 1) {
                              var32 = new short[q.j.length];
                              System.arraycopy(q.j, 0, var32, 0, q.j.length);
                           }

                           if (this.bm[0] == 2) {
                              var32 = new short[q.n.length];
                              System.arraycopy(q.n, 0, var32, 0, q.n.length);
                           }

                           if (this.bm[0] == 3) {
                              var32 = new short[q.r.length];
                              System.arraycopy(q.r, 0, var32, 0, q.r.length);
                           }

                           if (this.bm[0] == 4) {
                              var32 = new short[q.v.length];
                              System.arraycopy(q.v, 0, var32, 0, q.v.length);
                           }

                           if (this.bm[0] == 5) {
                              var32 = new short[q.z.length];
                              System.arraycopy(q.z, 0, var32, 0, q.z.length);
                           }

                           if (this.bm[0] == 6) {
                              var32 = new short[q.D.length];
                              System.arraycopy(q.D, 0, var32, 0, q.D.length);
                           }

                           if (this.bm[0] == 7) {
                              var32 = new short[q.H.length];
                              System.arraycopy(q.H, 0, var32, 0, q.H.length);
                           }

                           if (this.bm[0] == 8) {
                              var32 = new short[q.L.length];
                              System.arraycopy(q.L, 0, var32, 0, q.L.length);
                           }

                           if (this.bm[0] == 9) {
                              var32 = new short[q.P.length];
                              System.arraycopy(q.P, 0, var32, 0, q.P.length);
                           }

                           if (this.bm[0] == 10) {
                              var32 = new short[q.T.length];
                              System.arraycopy(q.T, 0, var32, 0, q.T.length);
                           }

                           if (this.bm[0] == 11) {
                              var32 = new short[q.X.length];
                              System.arraycopy(q.X, 0, var32, 0, q.X.length);
                           }

                           if (this.bm[0] == 12) {
                              var32 = new short[q.ab.length];
                              System.arraycopy(q.ab, 0, var32, 0, q.ab.length);
                           }

                           if (var32[var10 + 1] != -1) {
                              if (this.bm[0] == 0) {
                                 if (this.bk[q.f[var10 + 1]] != -1) {
                                    d var49 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.f[var10 + 1]]].h;
                                    var49.h = this.bu[this.bk[q.f[var10 + 1]]].h;
                                 }

                                 this.bk[q.f[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 1) {
                                 if (this.bk[q.j[var10 + 1]] != -1) {
                                    d var50 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.j[var10 + 1]]].h;
                                    var50.h = this.bu[this.bk[q.j[var10 + 1]]].h;
                                 }

                                 this.bk[q.j[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 2) {
                                 if (this.bk[q.n[var10 + 1]] != -1) {
                                    d var51 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.n[var10 + 1]]].h;
                                    var51.h = this.bu[this.bk[q.n[var10 + 1]]].h;
                                 }

                                 this.bk[q.n[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 3) {
                                 if (this.bk[q.r[var10 + 1]] != -1) {
                                    d var52 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.r[var10 + 1]]].h;
                                    var52.h = this.bu[this.bk[q.r[var10 + 1]]].h;
                                 }

                                 this.bk[q.r[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 4) {
                                 if (this.bk[q.v[var10 + 1]] != -1) {
                                    d var53 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.v[var10 + 1]]].h;
                                    var53.h = this.bu[this.bk[q.v[var10 + 1]]].h;
                                 }

                                 this.bk[q.v[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 5) {
                                 if (this.bk[q.z[var10 + 1]] != -1) {
                                    d var54 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.z[var10 + 1]]].h;
                                    var54.h = this.bu[this.bk[q.z[var10 + 1]]].h;
                                 }

                                 this.bk[q.z[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 6) {
                                 if (this.bk[q.D[var10 + 1]] != -1) {
                                    d var55 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.D[var10 + 1]]].h;
                                    var55.h = this.bu[this.bk[q.D[var10 + 1]]].h;
                                 }

                                 this.bk[q.D[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 7) {
                                 if (this.bk[q.H[var10 + 1]] != -1) {
                                    d var56 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.H[var10 + 1]]].h;
                                    var56.h = this.bu[this.bk[q.H[var10 + 1]]].h;
                                 }

                                 this.bk[q.H[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 8) {
                                 if (this.bk[q.L[var10 + 1]] != -1) {
                                    d var57 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.L[var10 + 1]]].h;
                                    var57.h = this.bu[this.bk[q.L[var10 + 1]]].h;
                                 }

                                 this.bk[q.L[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 9) {
                                 if (this.bk[q.P[var10 + 1]] != -1) {
                                    d var58 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.P[var10 + 1]]].h;
                                    var58.h = this.bu[this.bk[q.P[var10 + 1]]].h;
                                 }

                                 this.bk[q.P[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 10) {
                                 if (this.bk[q.T[var10 + 1]] != -1) {
                                    d var59 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.T[var10 + 1]]].h;
                                    var59.h = this.bu[this.bk[q.T[var10 + 1]]].h;
                                 }

                                 this.bk[q.T[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 11) {
                                 if (this.bk[q.X[var10 + 1]] != -1) {
                                    d var60 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.X[var10 + 1]]].h;
                                    var60.h = this.bu[this.bk[q.X[var10 + 1]]].h;
                                 }

                                 this.bk[q.X[var10 + 1]] = (byte)var14;
                              } else if (this.bm[0] == 12) {
                                 if (this.bk[q.ab[var10 + 1]] != -1) {
                                    d var61 = this.bu[var14];
                                    var11 = this.bu[this.bk[q.ab[var10 + 1]]].h;
                                    var61.h = this.bu[this.bk[q.ab[var10 + 1]]].h;
                                 }

                                 this.bk[q.ab[var10 + 1]] = (byte)var14;
                              }

                              switch (s(this.bm[0])[var10 + 1]) {
                                 case 0:
                                    var11 = 0 + this.bm[1];
                                    break;
                                 case 1:
                                    var11 = 0 + this.bm[3];
                                    break;
                                 case 2:
                                    var11 = 0 + this.bm[5];
                                    break;
                                 case 3:
                                    var11 = 0 + this.bm[7];
                                    break;
                                 case 4:
                                    var11 = 0 + this.bm[9];
                                    break;
                                 case 5:
                                    var11 = 0 + this.bm[11];
                                    break;
                                 case 6:
                                    var11 = 0 + this.bm[13];
                                    break;
                                 case 7:
                                    var11 = 0 + this.bm[15];
                                    break;
                                 case 8:
                                    var11 = 0 + this.bm[17];
                                    break;
                                 case 9:
                                    var11 = 0 + this.bm[19];
                                    break;
                                 case 10:
                                    var11 = 0 + this.bm[21];
                                    break;
                                 case 11:
                                    var11 = 0 + this.bm[23];
                                    break;
                                 case 12:
                                    var11 = 0 + this.bm[25];
                                    break;
                                 case 13:
                                    var11 = 0 + this.bm[27];
                                    break;
                                 case 14:
                                    var11 = 0 + this.bm[29];
                                    break;
                                 case 15:
                                    var11 = 0 + this.bm[31];
                                    break;
                                 case 16:
                                    var11 = 0 + this.bm[33];
                                    break;
                                 default:
                                    t.P();
                                    var11 = 0;
                              }

                              if (t.j[4][var11] != this.bu[var14].d) {
                                 this.bu[var14].a(t.j[4][var11]);
                                 short[] var12 = s(this.bm[0]);
                                 var11 = t.c(this.bm[40], var12[var10 + 1], 9);
                                 var10 = t.c(this.bm[40], var12[var10 + 1], 8);
                                 var10 = var11 * var10;
                                 this.bu[var14].a(var10);
                              }

                              if (this.bm[35] == -1) {
                                 this.bu[var14].c = 1;
                              } else {
                                 this.bu[var14].c = 0;
                              }
                           }
                           break;
                        case 106:
                           if (this.bm[0] != 0
                              && this.bm[0] != 1
                              && this.bm[0] != 2
                              && this.bm[0] != 3
                              && this.bm[0] != 4
                              && this.bm[0] != 5
                              && this.bm[0] != 6
                              && this.bm[0] != 7
                              && this.bm[0] != 8
                              && this.bm[0] != 9
                              && this.bm[0] != 10
                              && this.bm[0] != 11
                              && this.bm[0] == 12) {
                              ;
                           }
                           break;
                        case 107:
                           var11 = this.l(var14);
                           short var26;
                           this.bu[var14].h = var26 = q.n[(var11 << 1) + 2];
                     }
                  }

                  short[] var30 = t(this.bm[0]);
                  if (var6[3] < var30[var7 + 3] - 1) {
                     var6[3]++;
                  } else {
                     var6[3] = 0;
                  }
               }
            }

            this.bu[var14].c(t.aq);
         }

         if (var5 == 0) {
            this.aw();
         }

         short[] var19 = u(this.bm[0]);
         if (var5 >= var19[var3 + 3]) {
            if (this.bw > 0) {
               this.bw--;
               var5 = 0;
            } else if (this.bw < 0) {
               var5 = 0;
            }
         } else {
            var5++;
         }

         this.bj[0][0] = var5;
         return var5;
      } catch (Exception var13) {
         throw var13;
      }
   }

   public final void b(int[] var1) {
      int[] var2 = new int[4];
      int[] var3 = new int[4];

      try {
         d var4;
         (var4 = this.bu[this.bk[1]]).d.a(var2, var4.e, var4.f, var4.a, var4.b, var4.c);
         if (this.m(0) && this.bh[0]) {
            (var4 = this.bu[this.bk[0]]).d.a(var3, var4.e, var4.f, var4.a, var4.b, 0);
            t.a(var2, var3);
         }

         if (this.m(2) && this.bh[2]) {
            (var4 = this.bu[this.bk[2]]).d.a(var3, var4.e, var4.f, var4.a, var4.b, var4.c);
            t.a(var2, var3);
         }

         if (this.m(10) && this.bh[10]) {
            (var4 = this.bu[this.bk[10]]).d.a(var3, var4.e, var4.f, var4.a, var4.b, var4.c);
            t.a(var2, var3);
         }

         if (this.m(11) && this.bh[11]) {
            (var4 = this.bu[this.bk[11]]).d.a(var3, var4.e, var4.f, var4.a, var4.b, var4.c);
            t.a(var2, var3);
         }

         if (this.m(6) && this.bh[6]) {
            (var4 = this.bu[this.bk[6]]).d.a(var3, var4.e, var4.f, var4.a, var4.b, var4.c);
            t.a(var2, var3);
         }

         if (this.m(7) && this.bh[7]) {
            (var4 = this.bu[this.bk[7]]).d.a(var3, var4.e, var4.f, var4.a, var4.b, var4.c);
            t.a(var2, var3);
         }

         if (this.m(4) && this.bh[4]) {
            (var4 = this.bu[this.bk[4]]).d.a(var3, var4.e, var4.f, var4.a, var4.b, var4.c);
            t.a(var2, var3);
         }

         if (this.m(5) && this.bh[5]) {
            (var4 = this.bu[this.bk[5]]).d.a(var3, var4.e, var4.f, var4.a, var4.b, var4.c);
            t.a(var2, var3);
         }

         var1[0] = var2[0];
         var1[1] = var2[1];
         var1[2] = var2[2];
         var1[3] = var2[3];
      } catch (Exception var5) {
      }
   }

   public final void ad() {
      if (t.i == 5 || t.i == 11) {
         this.U();
         q.a(this.bx);
         if (!q.a(this.bx) && !t.o) {
            return;
         }
      }

      if (bo > 0) {
         bo--;
      } else {
         if (t.O) {
            label137: {
               this.ar();
               r var1 = this;
               switch (super.aP) {
                  case 4:
                     if (t.i != 5 && t.i != 11 || t.v(65)) {
                        if (var1.at()) {
                           var1.a(var1.bl[0], -1, false);
                        }
                        break label137;
                     }
                     break;
                  case 17:
                     if (t.i != 5 && t.i != 11) {
                        if (var1.at()) {
                           var1.a(var1.bl[0], -1, false);
                        }
                        break label137;
                     }
                     break;
                  default:
                     break label137;
               }

               label105:
               if ((var1 = var1).bm[46] != -1) {
                  if (var1.bm[48] == 1) {
                     var1.bm[49] = var1.bm[49] - t.aq;
                     if (var1.bm[49] > 0) {
                        break label105;
                     }
                  } else if (var1.bm[49] != 0) {
                     if (var1.at()) {
                        var1.bm[49]++;
                        if (var1.bm[49] != 0) {
                           var1.a(t.b(37, var1.bm[46], 3 + 2 * var1.bm[47]), 0, true);
                        }
                     }
                     break label105;
                  }

                  r var11;
                  int var33 = (var11 = var1).bm[47];
                  r var13 = var11;
                  if (var33 >= t.b(37, var13.bm[46], 2)) {
                     var11.bm[46] = -1;
                     var11.bm[50] = 6000;
                     var11.a(1, -1, true);
                  } else {
                     var11.bm[47]++;
                     if (var11.ay()) {
                        var11.bm[48] = 1;
                     } else {
                        var11.bm[48] = 0;
                     }

                     var11.bm[49] = var11.az();
                     if (var11.ay()) {
                        var11.a(t.b(37, var11.bm[46], 3 + 2 * var11.bm[47]), -1, true);
                     } else {
                        var11.a(t.b(37, var11.bm[46], 3 + 2 * var11.bm[47]), 0, true);
                     }
                  }
               } else {
                  var1.bm[50] = var1.bm[50] - t.aq;
                  if (var1.bm[50] <= 0) {
                     t.o(37);
                     int[] var10000 = var1.bm;
                     r var2 = var1;
                     int var3 = -1;
                     switch (var2.bm[0]) {
                        case 0:
                           var3 = 9;
                           break;
                        case 1:
                           var3 = 9;
                           break;
                        case 2:
                           var3 = 9;
                           break;
                        case 3:
                           var3 = 9;
                           break;
                        case 4:
                           var3 = 9;
                           break;
                        case 5:
                           var3 = 9;
                           break;
                        case 6:
                           var3 = 9;
                           break;
                        case 7:
                           var3 = 9;
                           break;
                        case 8:
                           var3 = 9;
                           break;
                        case 9:
                           var3 = 9;
                           break;
                        case 10:
                           var3 = 9;
                           break;
                        case 11:
                           var3 = 9;
                           break;
                        case 12:
                           var3 = 9;
                     }

                     var3 = t.n(0, var3 - 1);
                     int[][] var4 = t.o(37);
                     int var5 = 0;

                     int var10002;
                     while (true) {
                        if (var5 >= var4.length) {
                           var10002 = 0;
                           break;
                        }

                        if (var4[var5][1] == var2.bm[0]) {
                           var3--;
                        }

                        if (var3 <= 0) {
                           var10002 = var5;
                           break;
                        }

                        var5++;
                     }

                     var10000[46] = var10002;
                     var1.bm[47] = 0;
                     if (var1.ay()) {
                        var1.bm[48] = 1;
                     } else {
                        var1.bm[48] = 0;
                     }

                     var1.bm[49] = var1.az();
                     if (var1.ay()) {
                        var1.a(t.b(37, var1.bm[46], 3 + 2 * var1.bm[47]), -1, true);
                     } else {
                        var1.a(t.b(37, var1.bm[46], 3 + 2 * var1.bm[47]), 0, true);
                     }
                  }
               }
            }

            if (be) {
               byte var12;
               byte var14;
               byte var16;
               if (t.z == 0) {
                  var12 = 24;
                  var14 = 18;
                  var16 = 8;
               } else {
                  var12 = 42;
                  var14 = 10;
                  var16 = 5;
               }

               t.c(var12, var14, 10, 1);
               short var22 = var14;
               short var20 = var12;
               var20 = t.ag[var20][var22][2];
               short var6 = var14;
               var22 = var12;
               var22 = t.ag[var22][var6][3];
               int var7 = var16;
               var6 = var12;
               var6 = t.ag[var6][var7][2];
               var7 = (byte)var16;
               var16 = var12;
               var16 = t.ag[var16][var7][3];
               int[] var29 = t.Q.bj[t.Q.bk[0] + 1];
               int var8 = t.h(t.Q.bm[40], t.Q.l(t.Q.bk[0]));
               int var9 = t.i(t.Q.bm[40], t.Q.l(t.Q.bk[0]));
               var8 *= t.Q.bm[35];
               var6 = (short)(var6 + var29[7] + var8);
               var16 = (short)(var16 + var29[8] + var9);
               var7 = var6 + (var20 - var6) / 2;
               var8 = var16 + (var22 - var16) / 2;
               if ((bt = bt + t.aq) >= 450) {
                  bt = 0;
                  t.c(var12, var14, 2, 378);
                  t.c(var12, var14, 3, 323);
                  t.c(var12, var14, 10, 0);
                  be = false;
                  t.Q.a(6, 0, true);
                  return;
               }

               t.a(var20, var22, var7, var8, var6, var16, t.p(bt, 450));
               t.c(var12, var14, 2, t.at);
               t.c(var12, var14, 3, t.au);
            }
         }
      }
   }

   private void av() {
      for (int var1 = 0; var1 < this.bv; var1++) {
         this.bu[var1].c ^= 1;
      }

      this.ar();
   }

   public final void b(boolean var1) {
      if (var1) {
         if (this.bm[35] != -1) {
            this.bm[35] = -1;
            this.av();
            return;
         }
      } else if (this.bm[35] != 1) {
         this.bm[35] = 1;
         this.av();
      }
   }

   private void b(int var1, int var2, boolean var3) {
      if (this.m(1) && this.bh[1]) {
         int[] var4 = this.bj[this.bk[1] + 1];
         int var5 = t.h(this.bm[40], this.l(this.bk[1]));
         t.i(this.bm[40], this.l(this.bk[1]));
         var5 *= this.bm[35];
         var1 = var1 + var4[7] + var5;
      }

      if (t.o) {
         q.a(t.j[3][99], t.p(this.bm[40]), var1 + t.q(this.bm[40]), var2 + t.r(this.bm[40]));
      } else if (var3) {
         q.a(t.j[3][38], t.p(this.bm[40]), var1 + t.q(this.bm[40]), var2 + t.r(this.bm[40]));
      } else {
         t.j[3][38].a(t.am, t.p(this.bm[40]), var1 + t.q(this.bm[40]), var2 + t.r(this.bm[40]), 0);
      }
   }

   public final void k(int var1, int var2) {
      if (this.bi != -1) {
         this.b(var1, var2, false);

         for (int var4 = 0; var4 < this.bv; var4++) {
            d var3 = this.bu[var4];
            int[] var5 = this.bj[var4 + 1];
            int var6 = t.h(this.bm[40], this.l(var4));
            int var7 = t.i(this.bm[40], this.l(var4));
            var6 *= this.bm[35];
            int var10001 = var1 + var5[7] + var6;
            var7 = var2 + var5[8] + var7;
            var6 = var10001;
            d var8 = var3;
            var3.a = var6;
            var8.b = var7;
            if ((var3.c & 4) == 0 && this.bh[this.l(var4)]) {
               var3.g = 100;
               var3.g();
            }
         }

         this.b(this.bx);
      }
   }

   public final void a(int var1, int var2, boolean var3) {
      int var4 = this.bm[0];
      if (!t.v(65) && !t.c()) {
         label118:
         switch (var4) {
            case 0:
               if (var1 == 5 && !t.a()) {
                  t.a(39 + t.n(0, 3));
               }
               break;
            case 1:
            case 2:
               switch (var1) {
                  case 2:
                     if (!t.a()) {
                        t.a(41);
                     }
                     break label118;
                  case 5:
                     t.a(39 + t.n(0, 3));
                  default:
                     break label118;
               }
            case 3:
            case 5:
               switch (var1) {
                  case 2:
                     t.a(46);
                     break label118;
                  case 5:
                     if (!t.a()) {
                        t.a(39 + t.n(0, 3));
                     }
                  default:
                     break label118;
               }
            case 4:
            case 6:
               if (var1 == 5 && !t.a()) {
                  t.a(39 + t.n(0, 3));
               }
               break;
            case 7:
               switch (var1) {
                  case 5:
                     if (!t.a()) {
                        t.a(39 + t.n(0, 3));
                     }
                  default:
                     break label118;
               }
            case 8:
               switch (var1) {
                  case 5:
                     t.a(39 + t.n(0, 3));
                  default:
                     break label118;
               }
            default:
               if (var1 == 5 && t.i != 5 && t.i != 11) {
                  t.a(39 + t.n(0, 3));
               }
         }
      }

      this.bw = var2;
      if (this.bi != var1 || var3) {
         this.bi = var1;
         if (this.bi == -1) {
            this.bv = 0;
            return;
         }

         if (this.bm[0] == 0) {
            this.bv = q.c[this.bi * 5 + 1];
         }

         if (this.bm[0] == 1) {
            this.bv = q.g[this.bi * 5 + 1];
         }

         if (this.bm[0] == 2) {
            this.bv = q.k[this.bi * 5 + 1];
         }

         if (this.bm[0] == 3) {
            this.bv = q.o[this.bi * 5 + 1];
         }

         if (this.bm[0] == 4) {
            this.bv = q.s[this.bi * 5 + 1];
         }

         if (this.bm[0] == 5) {
            this.bv = q.w[this.bi * 5 + 1];
         }

         if (this.bm[0] == 6) {
            this.bv = q.A[this.bi * 5 + 1];
         }

         if (this.bm[0] == 7) {
            this.bv = q.E[this.bi * 5 + 1];
         }

         if (this.bm[0] == 8) {
            this.bv = q.I[this.bi * 5 + 1];
         }

         if (this.bm[0] == 9) {
            this.bv = q.M[this.bi * 5 + 1];
         }

         if (this.bm[0] == 10) {
            this.bv = q.Q[this.bi * 5 + 1];
         }

         if (this.bm[0] == 11) {
            this.bv = q.U[this.bi * 5 + 1];
         }

         if (this.bm[0] == 12) {
            this.bv = q.Y[this.bi * 5 + 1];
         }

         for (int var5 = 0; var5 < this.bv; var5++) {
            this.bu[var5].a();
         }

         q.a(this.bj, var1, this.bm[0]);

         for (int var6 = 0; var6 < this.bk.length; var6++) {
            this.bk[var6] = -1;
         }

         this.ar();
      }
   }

   private void aw() {
      this.l(0, 2);
      this.l(1, 4);
      this.l(2, 6);
      this.l(3, 8);
      this.l(4, 10);
      this.l(5, 12);
      this.l(6, 14);
      this.l(7, 16);
      this.l(8, 18);
      this.l(9, 20);
      this.l(10, 22);
      this.l(11, 24);
      this.l(12, 26);
      this.l(13, 28);
      this.l(14, 30);
      this.l(15, 32);
      this.l(16, 34);
   }

   private void l(int var1, int var2) {
      if (this.m(var1)) {
         int var3;
         this.bu[this.bk[var1]].h = var3 = this.bm[var2];
      }
   }

   final int l(int var1) {
      for (int var2 = 0; var2 < this.bk.length; var2++) {
         if (this.bk[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   final boolean m(int var1) {
      return this.bk.length > var1 && this.bk[var1] >= 0;
   }

   public r() {
      this.bb[0] = this.bb[1] = 0;
   }

   final void k() {
      switch (super.aP) {
         case 4:
            if (t.m(super.at) && !this.aY) {
               super.aB = t.g - super.aA;
               int[] var1 = ((int[][])t.T[2])[super.ar];
               int var2 = 21 + (this.aZ - 1);
               int var4 = var1[var2];
               if (super.aB > super.aC && var4 > 0) {
                  int var5 = (int)super.aB / var4;

                  for (int var8 = 0; var8 < var5; var8++) {
                     r var3 = this;
                     if (this.bp != null && var3.bp.au == 2 && (var3.bp.ap() < var3.bp.ao() || var3.bp.ap() == var3.bp.ao() && var3.bp.aP == 23)) {
                        var3.bp.bj = var3.bp.bj + var3.bq;
                        var3.aA = t.g;
                     }
                  }
               }
            } else {
               super.aA = t.g;
            }

            this.ad();
            if (this.bi == 4 && (t.i == 5 || t.i == 11)) {
               r var10 = this;
               int var6;
               if (this.bm[41] == 1) {
                  var6 = ((int[][])t.T[2])[var10.ar][125];
               } else {
                  var6 = ((int[][])t.T[2])[var10.ar][126];
               }

               if (var10.by) {
                  var10.bz = var10.bz + var6 * t.aq / 100;
                  if (var10.bz > bA) {
                     var10.by = false;
                     var10.b(false);
                  }
               } else {
                  var10.bz = var10.bz - var6 * t.aq / 100;
                  if (var10.bz < 0) {
                     var10.by = true;
                     var10.b(true);
                  }
               }

               var6 = var10.bD + var10.bz * (var10.bF - var10.bD) / bA;
               int var9 = var10.bE + var10.bz * (var10.bG - var10.bE) / bA;
               if (var10.bp != null) {
                  var10.b(var10.bp.av + var6, var10.bp.aw + var9);
               }

               return;
            }
            break;
         case 14:
            this.A();
         case 15:
            if (t.o) {
               super.ay.g = 50;
            } else {
               super.ay.g = 100;
            }

            super.ay.c(t.aq);
            return;
         case 17:
            this.ad();
            super.aA = t.g;
            break;
         case 26:
            if (t.o) {
               super.ay.g = 50;
            } else {
               super.ay.g = 100;
            }

            super.ay.c(t.aq);
            return;
      }
   }

   final void M() {
      if (t.O) {
         if (t.z == super.at) {
            switch (super.aP) {
               case 4:
                  r var1 = this;
                  this.c();
                  if (var1.bi != -1) {
                     int var4 = var1.aw;
                     int var3 = var1.av;
                     d var2 = null;
                     var1.b(var3, var4, true);

                     for (int var8 = 0; var8 < var1.bv; var8++) {
                        var2 = var1.bu[var8];
                        int[] var9 = var1.bj[var8 + 1];
                        int var5 = t.h(var1.bm[40], var1.l(var8));
                        int var6 = t.i(var1.bm[40], var1.l(var8));
                        var5 *= var1.bm[35];
                        var1.a(var2, var1.av + var9[7] + var5, var1.aw + var9[8] + var6);
                        if ((var2.c & 4) == 0 && var1.bh[var1.l(var8)]) {
                           if (var9[17] != 0) {
                              t.H(18);
                              var5 = t.o(var9[17], t.p(256, 360));
                              t.e(18, 6, var5);
                           }

                           q.a(var2);
                           var2.g();
                           if (var9[17] != 0) {
                              t.a(18, false);
                           }
                        }
                     }

                     var1.b(var1.bx);
                  }

                  return;
               case 14:
                  this.a(super.ay, super.av, super.aw);
                  super.ay.g();
                  this.a(super.av, super.aw, 0);
                  return;
               case 15:
                  this.a(super.ay, super.av, super.aw);
                  if (super.ay.f()) {
                     super.ay.a(super.aq + 1, 1);
                     t.a(35);
                  }

                  super.ay.g();
                  return;
               case 17:
               default:
                  return;
               case 26:
                  this.a(super.ay, super.av, super.aw);
                  super.ay.g();
            }
         }
      }
   }

   private void p(int var1) {
      int[] var3 = ((int[][])t.T[9])[var1];

      for (int var2 = 0; var2 < 3; var2++) {
         this.bm[var2 + 42] = var3[var2 + 1];
      }
   }

   public final boolean d(v var1) {
      int var2 = 0;
      int var3 = 0;
      int[] var6 = ((int[][])t.T[3])[var1.ar];

      for (int var4 = 0; var4 < 3; var4++) {
         if ((var2 = this.bm[var4 + 42]) != 15) {
            for (int var5 = 0; var5 < 11; var5++) {
               if ((var3 = var6[var5 + 41]) != 15 && var3 == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public final boolean n(int var1) {
      int var2 = 0;
      int var3 = 0;
      int[] var6 = ((int[][])t.T[3])[var1];

      for (int var4 = 0; var4 < 3; var4++) {
         if ((var2 = this.bm[var4 + 42]) != 15) {
            for (int var5 = 0; var5 < 11; var5++) {
               if ((var3 = var6[var5 + 41]) != 15 && var3 == var2) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static boolean a(int[] var0, int var1) {
      for (int var2 = 0; var2 < var0.length; var2++) {
         if (var0[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   private static void b(int[] var0, int var1) {
      for (int var2 = 0; var2 < var0.length; var2++) {
         if (var0[var2] == -1) {
            var0[var2] = var1;
            return;
         }
      }
   }

   private static boolean c(int[] var0, int var1) {
      for (int var2 = 1; var2 < var0.length; var2++) {
         if (var0[var2] == var1 || var0[var2] == 15 && var1 == -1) {
            return true;
         }
      }

      return false;
   }

   public final int a(r var1) {
      this.bB = false;
      this.bC = false;
      int[] var3 = new int[7];
      int[] var4 = new int[3];

      for (int var2 = 0; var2 < var3.length; var2++) {
         var3[var2] = -1;
      }

      for (int var13 = 0; var13 < var4.length; var13++) {
         var4[var13] = -1;
      }

      if (this.bm[42] != 15 && !a(var3, this.bm[42])) {
         b(var3, this.bm[42]);
      }

      if (this.bm[43] != 15 && !a(var3, this.bm[43])) {
         b(var3, this.bm[43]);
      }

      if (this.bm[44] != 15 && !a(var3, this.bm[44])) {
         b(var3, this.bm[44]);
      }

      if (var1.bm[42] != 15 && !a(var3, var1.bm[42])) {
         b(var3, var1.bm[42]);
      }

      if (var1.bm[43] != 15 && !a(var3, var1.bm[43])) {
         b(var3, var1.bm[43]);
      }

      if (var1.bm[44] != 15 && !a(var3, var1.bm[44])) {
         b(var3, var1.bm[44]);
      }

      b(var3, 15);

      for (int var14 = 0; var14 < 3; var14++) {
         int[] var9 = var4;
         int[] var8 = var3;
         int var7 = var14;
         r var6 = this;
         int var5 = 0;
         if (d(var8, 2)) {
            do {
               var5 = var6.b(var7, var8);
            } while (var7 == 0 && var5 == -1);
         } else if (d(var8, 1)) {
            var6.bB = true;

            do {
               var5 = var6.b(var7, var8);
            } while (var7 == 0 && var5 == -1);
         } else {
            var6.bB = true;
            var6.bC = true;

            do {
               var5 = var6.b(var7, var8);
            } while (var7 == 0 && var5 == -1);
         }

         boolean var43;
         if (var5 == -1) {
            for (int var20 = var7; var20 < var9.length; var20++) {
               var9[var20] = 15;
            }

            var43 = true;
         } else {
            int[] var18 = var8;
            int var10 = var5;
            Object var22 = null;
            int[] var12 = new int[a(var10, var18)];
            var7 = 0;

            for (int var30 = 0; var30 < var18.length; var30++) {
               if (q(var18[var30]) == var10) {
                  var12[var7] = var18[var30];
                  var7++;
               }
            }

            int[] var19 = var12;

            do {
               var7 = t.n(0, var19.length);
               var7 = var19[var7];
               b(var9, var7);
               int[] var34 = var9;
               int[][] var11 = (int[][])t.T[9];
               if (var34[0] == -1 || var34[0] != var34[1] && var34[0] != var34[2]) {
                  if (var34[1] == -1 || var34[1] != var34[0] && var34[1] != var34[2]) {
                     if (var34[2] == -1 || var34[2] != var34[0] && var34[2] != var34[1]) {
                        int var40 = 0;

                        while (true) {
                           if (var40 >= var11.length) {
                              var43 = false;
                              break;
                           }

                           if (c(var11[var40], var34[0]) && c(var11[var40], var34[1]) && c(var11[var40], var34[2])) {
                              var43 = true;
                              break;
                           }

                           var40++;
                        }
                     } else {
                        var43 = false;
                     }
                  } else {
                     var43 = false;
                  }
               } else {
                  var43 = false;
               }

               var31 = var43;
               if (!var43) {
                  var10 = var7;
                  var22 = var9;

                  for (int var37 = var9.length - 1; var37 >= 0; var37--) {
                     if (((Object[])var22)[var37] == var10) {
                        ((Object[])var22)[var37] = -1;
                        break;
                     }
                  }

                  var10 = var7;
                  var22 = var19;

                  for (int var38 = 0; var38 < ((Object[])var22).length; var38++) {
                     if (((Object[])var22)[var38] == var10) {
                        ((Object[])var22)[var38] = -1;
                        break;
                     }
                  }

                  var22 = var19;
                  var19 = new int[var19.length - 1];
                  int var39 = 0;

                  for (int var41 = 0; var41 < ((Object[])var22).length; var41++) {
                     if (((Object[])var22)[var41] != -1) {
                        var19[var39] = (int)((Object[])var22)[var41];
                        var39++;
                     }
                  }
               }
            } while (var19.length > 0 && !var31);

            var43 = false;
         }

         if (var43) {
            var14 = 3;
         }
      }

      for (int var15 = 0; var15 < var4.length; var15++) {
         if (var4[var15] == -1) {
            var4[var15] = 15;
         }
      }

      int[][] var16 = (int[][])t.T[9];

      for (int var21 = 0; var21 < var16.length; var21++) {
         if (c(var16[var21], var4[0]) && c(var16[var21], var4[1]) && c(var16[var21], var4[2])) {
            int[] var32 = var4;
            int[] var29 = var3;
            int var33 = 0;

            boolean var44;
            while (true) {
               if (var33 >= var32.length) {
                  var44 = true;
                  break;
               }

               if (!a(var29, var32[var33])) {
                  var44 = false;
                  break;
               }

               var33++;
            }

            if (var44) {
               return t.n(var16[var21][0]);
            }

            return var1.ar;
         }
      }

      return var1.ar;
   }

   private static int a(int var0, int[] var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (var0 == q(var1[var3])) {
            var2++;
         }
      }

      return var2;
   }

   private int b(int var1, int[] var2) {
      int var3 = -1;
      int var4 = 0;
      byte var5 = 0;
      byte var6 = 0;
      byte var7 = 0;
      switch (var1) {
         case 0:
            var4 = 50;
            if (!this.bC) {
               var5 = 40;
            }

            if (!this.bB) {
               var6 = 1;
            }

            var7 = 0;
            var3 = var5 + 50 + var6;
            break;
         case 1:
            var4 = 400;
            if (!this.bC) {
               var5 = 30;
            }

            if (!this.bB) {
               var6 = 1;
            }

            var7 = 100;
            var3 = var5 + 400 + var6 + 100;
            break;
         case 2:
            var4 = 40;
            if (!this.bC) {
               var5 = 10;
            }

            if (!this.bB) {
               var6 = 1;
            }

            var7 = 60;
            var3 = var5 + 40 + var6 + 60;
      }

      int[] var10 = new int[var3];
      int var8 = 0;

      while (var8 < var10.length) {
         for (int var9 = 0; var9 < var4; var9++) {
            var10[var8] = 0;
            var8++;
         }

         if (!this.bC) {
            for (int var13 = 0; var13 < var5; var13++) {
               var10[var8] = 1;
               var8++;
            }
         }

         if (!this.bB) {
            for (int var14 = 0; var14 < var6; var14++) {
               var10[var8] = 2;
               var8++;
            }
         }

         for (int var15 = 0; var15 < var7; var15++) {
            var10[var8] = -1;
            var8++;
         }
      }

      var8 = -1;
      boolean var16 = false;

      while (!var16) {
         var4 = t.n(0, var3);
         if (a(var8 = var10[var4], var2) == 0) {
            var16 = false;
         } else {
            var16 = true;
         }
      }

      return var8;
   }

   private static boolean d(int[] var0, int var1) {
      for (int var2 = 0; var2 < var0.length; var2++) {
         if (q(var0[var2]) == var1) {
            return true;
         }
      }

      return false;
   }

   public static int o(int var0) {
      switch (var0) {
         case 50:
            return 16;
         case 51:
            return 31;
         case 52:
            return 45;
         case 53:
            return 46;
         case 54:
            return 49;
         default:
            return var0;
      }
   }

   private static int q(int var0) {
      int[][] var1 = (int[][])t.T[22];

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2][0] == var0) {
            return var1[var2][1];
         }
      }

      return -1;
   }

   private void f(v var1) {
      int var2 = -1;

      for (int var3 = 0; var3 < var1.ai(); var3++) {
         if (var1.o(var3) != null && var1.o(var3).equals(this)) {
            var2 = var3;
            break;
         }
      }

      int[] var4 = this.bp.az.g(this.bp.ap);
      if (var2 >= 0) {
         this.bD = var4[0 + (var2 << 2)];
         this.bE = var4[0 + (var2 << 2) + 1];
         this.bF = var4[0 + (var2 << 2) + 2];
         this.bG = var4[0 + (var2 << 2) + 3];
      }
   }

   public final void ae() {
      if (this.bp != null) {
         this.f(this.bp);
         this.b(this.bp.av + this.bD, this.bp.aw + this.bE);
      }
   }

   public final void e(v var1) {
      this.aR = this.bp;
      this.bp = var1;
      this.f(this.bp);
      this.b(this.bp.av + this.bD, this.bp.aw + this.bE);
   }

   public final v af() {
      return this.aR;
   }

   public final v ag() {
      return this.bp;
   }

   public final void a(int[] var1, int var2, w var3) {
      super.at = var2;
      super.ao = var1[107];
      super.ap = (byte)var1[5];
      super.aq = 0;
      this.br = (byte)var1[6];
      super.ar = (byte)var3.e[1];
      this.aS = -1;
      this.aZ = (byte)var3.e[12];
      this.ba = var3.e[13];
      this.bs = 80;
      this.bc = var1[0];
      this.G();
      super.ay.h = var2 = var1[108];
      this.d((byte)var3.e[3]);
      this.aT = var3.e[14];
      super.aB = var3.e[6] * 1000;
      super.aA = t.g - (t.k - t.h) + var3.e[7] * 1000;
      super.aC = var3.e[8] * 1000;
      super.aD = (byte)var3.e[9];
      super.aE = (byte)var3.e[10];
      super.aF = var3.e[11] == 1;
      super.al = super.aC;
      if (var3.e[3] == 4 || var3.e[3] == 17) {
         this.ah();
      }

      this.bm = new int[52];
      t.a(this.bm);
      this.p(super.ar);
      this.bm[45] = var3.e[15];
      this.bm[37] = 0;
      this.bm[51] = var1[118];
      this.bi = -1;
      this.bk = new int[17];
      this.bh = new boolean[17];
      this.bu = new d[20];

      for (int var4 = 0; var4 < this.bu.length; var4++) {
         this.bu[var4] = new d();
      }

      this.bm[41] = var3.e[2];
      this.ax();
      this.aw();
      this.b(true);
      this.as();
      this.a(this.bl[0], -1, false);
      this.bm[46] = -1;
      this.bm[50] = 0;
   }

   public final void a(int[] var1, int var2, byte var3, byte var4, byte var5, boolean var6) {
      super.at = var2;
      super.ao = var1[107];
      super.ap = (byte)var1[5];
      super.aq = 0;
      this.br = (byte)var1[6];
      super.ar = (byte)var3;
      this.aS = -1;
      this.aZ = var5;
      this.bs = 80;
      this.bc = var1[0];
      this.G();
      super.ay.h = var3 = var1[108];
      this.d(var4);
      this.bm = new int[52];
      t.a(this.bm);
      this.p(super.ar);
      if (var6) {
         this.bm[45] = t.n(0, t.ac);
      } else {
         this.bm[45] = -1;
      }

      this.bm[37] = 0;
      this.bm[51] = var1[118];
      this.bi = -1;
      this.bk = new int[17];
      this.bh = new boolean[17];
      this.bu = new d[20];

      for (int var7 = 0; var7 < this.bu.length; var7++) {
         this.bu[var7] = new d();
      }

      if (var5 >= 4) {
         this.bm[41] = 1;
      } else {
         this.bm[41] = 0;
      }

      this.ax();
      this.aw();
      this.b(true);
      this.as();
      this.a(this.bl[0], -1, false);
      this.bm[46] = -1;
      this.bm[50] = 0;
   }

   public final void c(boolean var1) {
      if (var1) {
         short var2 = t.ag[24][8][2];
         short var3 = t.ag[24][8][3];
         q.a(var2, var3, 41, false);
      }

      if (this.aZ >= 4) {
         if (this.aZ == 4 && var1) {
            t.a(27);
         }

         this.bm[41] = 1;
         this.ax();
         if (super.ar != 49) {
            t.b(24, 15, false);
         }

         this.a(0, 0, true);
      }
   }

   private void ax() {
      int var1 = q.b(super.ar, (byte)65);
      int var2 = q.b(super.ar, (byte)66);
      if (this.bm[41] != 0) {
         var1 = var2;
      }

      this.bm[40] = var1;
      this.bm[0] = t.s(var1);
      this.bm[38] = t.p(t.t(var1) << 8, 25600);
      int var3 = this.bm[0];
      int[][] var4 = null;
      if (var3 == 2) {
         var4 = new int[q.k[1] + 1][21];
      }

      if (var3 == 0) {
         var4 = new int[q.c[1] + 1][21];
      }

      if (var3 == 1) {
         var4 = new int[q.g[1] + 1][21];
      }

      if (var3 == 3) {
         var4 = new int[q.o[1] + 1][21];
      }

      if (var3 == 4) {
         var4 = new int[q.s[1] + 1][21];
      }

      if (var3 == 5) {
         var4 = new int[q.w[1] + 1][21];
      }

      if (var3 == 6) {
         var4 = new int[q.A[1] + 1][21];
      }

      if (var3 == 7) {
         var4 = new int[q.E[1] + 1][21];
      }

      if (var3 == 8) {
         var4 = new int[q.I[1] + 1][21];
      }

      if (var3 == 9) {
         var4 = new int[q.M[1] + 1][21];
      }

      if (var3 == 10) {
         var4 = new int[q.Q[1] + 1][21];
      }

      if (var3 == 11) {
         var4 = new int[q.U[1] + 1][21];
      }

      if (var3 == 12) {
         var4 = new int[q.Y[1] + 1][21];
      }

      q.a(var4, 0, var3);
      this.bj = var4;
      if ((var2 = t.c(var1, 0, 5)) != -1) {
         this.bm[1] = var2;
         this.bm[2] = t.c(var1, 0, 6);
         this.bh[0] = t.g(var1, 0);
      }

      if ((var2 = t.c(var1, 1, 5)) != -1) {
         this.bm[3] = var2;
         this.bm[4] = t.c(var1, 1, 6);
         this.bh[1] = t.g(var1, 1);
      }

      if ((var2 = t.c(var1, 2, 5)) != -1) {
         this.bm[5] = var2;
         this.bm[6] = t.c(var1, 2, 6);
         this.bh[2] = t.g(var1, 2);
      }

      if ((var2 = t.c(var1, 3, 5)) != -1) {
         this.bm[7] = var2;
         this.bm[8] = t.c(var1, 3, 6);
         this.bh[3] = t.g(var1, 3);
      }

      if ((var2 = t.c(var1, 4, 5)) != -1) {
         this.bm[9] = var2;
         this.bm[10] = t.c(var1, 4, 6);
         this.bh[4] = t.g(var1, 4);
      }

      if ((var2 = t.c(var1, 5, 5)) != -1) {
         this.bm[11] = var2;
         this.bm[12] = t.c(var1, 5, 6);
         this.bh[5] = t.g(var1, 5);
      }

      if ((var2 = t.c(var1, 6, 5)) != -1) {
         this.bm[13] = var2;
         this.bm[14] = t.c(var1, 6, 6);
         this.bh[6] = t.g(var1, 6);
      }

      if ((var2 = t.c(var1, 7, 5)) != -1) {
         this.bm[15] = var2;
         this.bm[16] = t.c(var1, 7, 6);
         this.bh[7] = t.g(var1, 7);
      }

      if ((var2 = t.c(var1, 8, 5)) != -1) {
         this.bm[17] = var2;
         this.bm[18] = t.c(var1, 8, 6);
         this.bh[8] = t.g(var1, 8);
      }

      if ((var2 = t.c(var1, 9, 5)) != -1) {
         this.bm[19] = var2;
         this.bm[20] = t.c(var1, 9, 6);
         this.bh[9] = t.g(var1, 9);
      }

      if ((var2 = t.c(var1, 10, 5)) != -1) {
         this.bm[21] = var2;
         this.bm[22] = t.c(var1, 10, 6);
         this.bh[10] = t.g(var1, 10);
      }

      if ((var2 = t.c(var1, 11, 5)) != -1) {
         this.bm[23] = var2;
         this.bm[24] = t.c(var1, 11, 6);
         this.bh[11] = t.g(var1, 11);
      }

      if ((var2 = t.c(var1, 12, 5)) != -1) {
         this.bm[25] = var2;
         this.bm[26] = t.c(var1, 12, 6);
         this.bh[12] = t.g(var1, 12);
      }

      if ((var2 = t.c(var1, 13, 5)) != -1) {
         this.bm[27] = var2;
         this.bm[28] = t.c(var1, 13, 6);
         this.bh[13] = t.g(var1, 13);
      }

      if ((var2 = t.c(var1, 14, 5)) != -1) {
         this.bm[29] = var2;
         this.bm[30] = t.c(var1, 14, 6);
         this.bh[14] = t.g(var1, 14);
      }

      if ((var2 = t.c(var1, 15, 5)) != -1) {
         this.bm[31] = var2;
         this.bm[32] = t.c(var1, 15, 6);
         this.bh[15] = t.g(var1, 15);
      }

      if ((var2 = t.c(var1, 16, 5)) != -1) {
         this.bm[33] = var2;
         this.bm[34] = t.c(var1, 16, 6);
         this.bh[16] = t.g(var1, 16);
      }
   }

   public final void d(byte var1) {
      super.aQ = super.aP;
      super.aP = var1;
      switch (super.aP) {
         case 4:
            super.az = null;
            super.ao = q.a((byte)0, super.ar)[4];
            super.aq = this.br;
            this.G();
            this.ae();
            break;
         case 13:
            this.d((byte)14);
            break;
         case 14:
            this.c((byte)15);
            break;
         case 15:
            if (t.i == 5) {
               t.a(70);
            }

            super.ay.a(super.aq + 1, 1);
            if (t.w(this.bg.e[0]) != null) {
               t.J();
               t.x(this.bg.e[0]);
            }

            if (q.an != null && q.an.au == 1) {
               t.H();
            }
      }

      t.j();
   }

   public final void ah() {
      int[] var1 = ((int[][])t.T[2])[super.ar];
      int var2 = 21 + (this.aZ - 1);
      int var3 = var1[var2];
      super.aA = t.g - (t.k - t.h) + this.bg.e[7] * 1000;
      super.aB = 0L;
      super.aC = var3;
      if (var3 <= 0) {
         this.bq = 0;
      } else {
         this.bq = 1;
      }
   }

   public final void ai() {
      t.a(38);
      this.bn = true;
      be = true;
   }

   public final int aj() {
      int var1 = t.ah[67 + (this.aZ < 40 ? this.aZ : 40) - 1];
      this.bf = var1 << 2;
      return this.bf;
   }

   public final boolean ak() {
      int var1;
      if (t.j(var1 = t.ah[67 + (this.aZ < 40 ? this.aZ : 40) - 1]) && t.Q.aZ != 40) {
         t.l(14, 0);
         t.b(28, super.ar, -1, -1);
         this.bf = var1 << 2;
         this.bb[0] = this.bb[1];
         if (t.Q.aZ < 40) {
            this.ba += var1;
         } else {
            this.ba = this.bf;
         }

         this.bb[1] = this.ba * 100 / this.bf;
         r var6 = this;
         this.bs++;
         if (var6.bs > 100) {
            var6.bs = 100;
         } else if (var6.bs < 0) {
            var6.bs = 0;
         }

         be = true;

         try {
            if (!d.g(0) || 38 != d.l()) {
               t.a(38);
            }
         } catch (Exception var5) {
         }

         if (t.Q.aZ < 40 && this.ba >= this.bf) {
            if (t.Q.aZ != 39) {
               this.ba = 0;
            }

            r var7 = this;
            this.aZ++;
            var7.ah();
            var7.c(true);
            t.a(24, 4, t.u(103) + t.Q.aZ);
            if (t.ah[0] != 49) {
               int var2 = t.ah[21 + t.Q.aZ - 1];
               var2 = 60000 / var2;
               String var10 = "" + var2 + t.u(298);
               t.a(24, 10, var10);
            } else {
               String var11 = "10 ";
               t.a(24, 10, var11 + t.u(1204));
            }

            if (var7.aZ == 4) {
               t.b(25, var7.ar, -1, -1);
            }

            t.b(29, var7.ar, var7.aZ, -1);

            try {
               if (d.g(0) && 38 == d.l()) {
                  t.e();
               }
            } catch (Exception var4) {
            }

            if (t.b()) {
               t.f();
            }

            t.a(33);
            t.j();
            var7.aq();
            int[] var12 = ((int[][])t.T[2])[var7.ar];
            int var3 = 21 + (var7.aZ - 1);
            int var13 = var12[var3];
            var7.aC = var13;
            if (var13 <= 0) {
               var7.bq = 0;
            } else {
               var7.bq = 1;
            }

            if (t.Q.aZ < 40) {
               var1 = t.ah[67 + (this.aZ < 40 ? this.aZ : 40) - 1];
               t.a(24, 19, "x " + var1);
            } else if (t.Q.aZ == 40) {
               t.c(24, 14, 13, 2);
               t.c(24, 14, false);
               t.a(24, 19, t.u(107));
               t.l(22, 0);
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public final boolean al() {
      return this.bs < 60;
   }

   public final void am() {
      if (this.B()) {
         t.g(this.D());
      } else {
         t.h(this.D());
      }
   }

   private boolean ay() {
      return t.o(37)[this.bm[46]][3 + 2 * this.bm[47] + 1] >= 0;
   }

   private int az() {
      return t.b(37, this.bm[46], 3 + 2 * this.bm[47] + 1);
   }

   public final String an() {
      return t.j(t.o(2)[super.ar][1], 1);
   }

   public final String d(boolean var1) {
      String var2 = null;
      String var3 = t.j(t.o(2)[super.ar][1], 1);
      String var5;
      if (this.bm[45] != -1) {
         var2 = t.j(this.bm[45], 8);
         if (var1) {
            return var2;
         }

         String var4 = t.u(118);
         t.ad[0] = var2;
         var5 = t.a(var4, t.ad, '#');
      } else {
         var5 = t.u(128);
      }

      t.ad[0] = var3;
      return t.a(var5, t.ad, '%');
   }

   public final String ao() {
      String var1 = "";
      if (this.bm[45] != -1) {
         var1 = t.j(this.bm[45], 8);
      }

      String var2 = t.u(123);
      String var3 = t.j(t.o(2)[super.ar][1], 1);
      t.ad[0] = var1;
      var2 = t.a(var2, t.ad, '#');
      t.ad[0] = var3;
      return t.a(var2, t.ad, '%');
   }

   public final String ap() {
      String var1 = "";
      if (this.bm[45] != -1) {
         var1 = t.j(this.bm[45], 8);
      }

      return var1;
   }

   public final void aq() {
      this.bg.e[3] = super.aP;
      this.bg.e[6] = (int)super.aB;
      this.bg.e[7] = (int)((super.aA - t.g) / 1000L);
      this.bg.e[8] = (int)(super.aC / 1000L);
      this.bg.e[9] = super.aD;
      this.bg.e[10] = super.aE;
      this.bg.e[11] = super.aF ? 1 : 0;
      this.bg.e[12] = this.aZ;
      this.bg.e[14] = this.aT;
      this.bg.e[2] = this.bm[41];
      this.bg.e[13] = this.ba;
      this.bg.e[4] = this.bp.bh.e[0];
      this.bg.e[15] = this.bm[45];
      if (this.aR != null) {
         this.bg.e[5] = this.aR.bh.e[0];
      } else {
         this.bg.e[5] = -1;
      }
   }

   private static short[] r(int var0) {
      if (var0 == 0) {
         return q.e;
      } else if (var0 == 1) {
         return q.i;
      } else if (var0 == 2) {
         return q.m;
      } else if (var0 == 3) {
         return q.q;
      } else if (var0 == 4) {
         return q.u;
      } else if (var0 == 5) {
         return q.y;
      } else if (var0 == 6) {
         return q.C;
      } else if (var0 == 7) {
         return q.G;
      } else if (var0 == 8) {
         return q.K;
      } else if (var0 == 9) {
         return q.O;
      } else if (var0 == 10) {
         return q.S;
      } else if (var0 == 11) {
         return q.W;
      } else {
         return var0 == 12 ? q.aa : new short[1];
      }
   }

   private static short[] s(int var0) {
      if (var0 == 0) {
         return q.f;
      } else if (var0 == 1) {
         return q.j;
      } else if (var0 == 2) {
         return q.n;
      } else if (var0 == 3) {
         return q.r;
      } else if (var0 == 4) {
         return q.v;
      } else if (var0 == 5) {
         return q.z;
      } else if (var0 == 6) {
         return q.D;
      } else if (var0 == 7) {
         return q.H;
      } else if (var0 == 8) {
         return q.L;
      } else if (var0 == 9) {
         return q.P;
      } else if (var0 == 10) {
         return q.T;
      } else if (var0 == 11) {
         return q.X;
      } else {
         return var0 == 12 ? q.ab : new short[1];
      }
   }

   private static short[] t(int var0) {
      if (var0 == 0) {
         return q.d;
      } else if (var0 == 1) {
         return q.h;
      } else if (var0 == 2) {
         return q.l;
      } else if (var0 == 3) {
         return q.p;
      } else if (var0 == 4) {
         return q.t;
      } else if (var0 == 5) {
         return q.x;
      } else if (var0 == 6) {
         return q.B;
      } else if (var0 == 7) {
         return q.F;
      } else if (var0 == 8) {
         return q.J;
      } else if (var0 == 9) {
         return q.N;
      } else if (var0 == 10) {
         return q.R;
      } else if (var0 == 11) {
         return q.V;
      } else {
         return var0 == 12 ? q.Z : new short[1];
      }
   }

   private static short[] u(int var0) {
      if (var0 == 0) {
         return q.c;
      } else if (var0 == 1) {
         return q.g;
      } else if (var0 == 2) {
         return q.k;
      } else if (var0 == 3) {
         return q.o;
      } else if (var0 == 4) {
         return q.s;
      } else if (var0 == 5) {
         return q.w;
      } else if (var0 == 6) {
         return q.A;
      } else if (var0 == 7) {
         return q.E;
      } else if (var0 == 8) {
         return q.I;
      } else if (var0 == 9) {
         return q.M;
      } else if (var0 == 10) {
         return q.Q;
      } else if (var0 == 11) {
         return q.U;
      } else {
         return var0 == 12 ? q.Y : new short[1];
      }
   }

   static {
      byte[][] var10000 = new byte[][]{{0, 5, 3, 5}, {3, 1, 1, 1}};
   }
}
