import javax.microedition.lcdui.Graphics;

public final class v extends q {
   private static Object[][] bm = new Object[100][];
   int aR;
   int aS = 0;
   private boolean bn;
   byte aT;
   byte aU;
   r[] aV;
   int aW;
   int aX;
   private int bo;
   int aY;
   int aZ;
   int ba;
   private boolean bp;
   private int bq;
   private d br;
   boolean bb;
   boolean bc;
   private int bs;
   boolean bd;
   d be;
   d bf = null;
   private d[] bt;
   int bg = 0;
   w bh;
   private static int bu = 0;
   boolean bi = false;
   private int bv = -1;
   private int bw = -1;
   int bj = 0;
   private static int[] bx = new int[]{16777215, 16704427, 16636301, 16633455, 16631379, 16563254, 16563254, 16563254, 16631379, 16633455, 16636301, 16704427};
   private byte by = 0;
   private static byte[] bz = new byte[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
   public byte bk = 0;
   private static int[][] bA = new int[][]{{283, 70}, {90, 70}, {635, 70}, {460, 70}};
   static d[] bl = new d[100];
   private static p[] bB = new p[100];
   private static d[] bC = new d[100];
   private static int[] bD = new int[100];
   private static int[] bE = new int[100];
   private static int[] bF = new int[100];
   private static int[] bG = new int[100];
   private static int[] bH = new int[100];
   private static byte[] bI = new byte[100];
   private static long[] bJ = new long[100];
   private static byte[] bK = new byte[100];
   private static int[] bL = new int[100];
   private static int[] bM = new int[100];
   private static int[] bN = new int[100];

   final void k() {
      switch (super.aP) {
         case 2:
            if (this.A()) {
            }
            break;
         case 3:
            boolean var13 = false;
            this.n(35, 0);
            break;
         case 4:
            if (this.bp) {
               if (t.o) {
                  this.br.g = 50;
               } else {
                  this.br.g = 100;
               }

               this.br.c(t.aq);
               this.b(this.br, super.av, super.aw);
            }

            this.aA();
            if (super.au == 2) {
               if (this.aD() && t.ab.e[14] >= 86400000) {
                  this.n(37, 100);
               } else {
                  int var5;
                  int var12 = var5 = t.o(3)[super.ar][35 + this.aT - 1];
                  int var18 = t.o(3)[super.ar][52];
                  var5 = var5 * var18 / 100;
                  if (t.F() && t.i == 5 && super.au == 2 && this.ap() >= var5) {
                     if (this.ap() >= var12) {
                        this.n(13, 100);
                     } else {
                        this.n(13, 0);
                     }
                  }
               }
            } else if (super.au == 7) {
               t.n();
            }

            if (this.aC() && super.aI == 2) {
               super.aI = 1;
            }
         case 5:
         case 6:
         case 8:
         case 9:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 20:
         default:
            break;
         case 7:
            if (this.bp) {
               if (t.o) {
                  this.br.g = 50;
               } else {
                  this.br.g = 100;
               }

               this.br.c(t.aq);
               this.b(this.br, super.av, super.aw);
            }

            if (super.au == 2) {
               if (this.aD() && t.ab.e[14] >= 86400000) {
                  this.n(37, 100);
               } else {
                  int var1;
                  int var11 = var1 = t.o(3)[super.ar][35 + this.aT - 1];
                  int var3 = t.o(3)[super.ar][52];
                  var1 = var1 * var3 / 100;
                  if (t.F() && t.i == 5 && super.au == 2 && this.ap() >= var1) {
                     if (this.ap() >= var11) {
                        this.n(13, 100);
                     } else {
                        this.n(13, 0);
                     }
                  }
               }
            }

            this.A();
            this.aA();
            break;
         case 10:
            this.A();
            this.aA();
            break;
         case 11:
            this.aA();
            boolean var10 = false;
            this.n(19, 0);
            break;
         case 19:
         case 23:
            this.A();
            this.aA();
            break;
         case 21:
            if (t.z == 0) {
               boolean var9 = false;
               this.n(35, 0);
            }
            break;
         case 22:
            boolean var2 = false;
            this.n(35, 0);
      }

      if (this.aW > 0) {
         for (int var7 = 0; var7 < this.aX; var7++) {
            if (this.aV[var7] != null) {
               this.aV[var7].k();
            }
         }

         if (super.au == 2) {
            this.ap();
         }
      }

      if (this.be != null) {
         this.be.c(t.aq);
      }

      v var8 = this;
      if (super.au == 2 && var8.aP == 4 || var8.au == 3 && var8.aP == 23 || var8.au == 10) {
         int[] var14 = var8.az.g(var8.ap);
         boolean var19 = false;
         v var20 = var8;
         if (2 != var20.au || 5 != var20.ar) {
            if (var8.au == 3) {
               if (var8.bt[0] == null) {
                  var8.bt[0] = new d();
                  var8.bt[0].a(t.j[3][54]);
                  var8.bt[0].a(0, -1);
                  var8.a(var8.bt[0], var8.av + var14[8], var8.aw + var14[9]);
               } else {
                  var8.a(var8.bt[0], var8.av + var14[8], var8.aw + var14[9]);
               }
            } else if (var8.au == 10) {
               if (var8.bt[0] == null) {
                  if (var8.T() && bu < 5) {
                     bu++;
                     var8.bt[0] = new d();
                     var8.bt[0].a(t.j[3][8]);
                     var8.bt[0].a(2, -1);
                     int var15 = var8.bt[0].d();
                     int var16 = t.n(0, var15);
                     var8.bt[0].b(var16);
                     var8.a(var8.bt[0], var8.av, var8.aw);
                  }
               } else {
                  var8.a(var8.bt[0], var8.av, var8.aw);
                  if (!var8.T()) {
                     var8.bt[0] = null;
                     bu--;
                  }
               }
            }
         }

         if (var8.bt != null) {
            for (int var17 = 0; var17 < var8.bt.length; var17++) {
               if (var8.bt[var17] != null) {
                  if (t.o) {
                     var8.bt[var17].g = 50;
                  } else {
                     var8.bt[var17].g = 100;
                  }

                  var8.bt[var17].c(t.aq);
               }
            }
         }
      }

      if (super.ay != null) {
         super.ay.c(t.aq);
      }

      if (this.bf != null) {
         this.bf.c(t.aq);
      }
   }

   public final void d(byte var1) {
      super.aQ = super.aP;
      super.aP = var1;
      switch (super.aP) {
         case 1:
            this.e((byte)4);
            t.l |= 1;
            break;
         case 2:
            if (t.z == super.at) {
               q.c(super.av, super.aw, 2, super.as, this.aR);
            }

            this.e((byte)3);
            this.c((byte)3);
            this.bg = Math.abs(this.aR - 4);
            t.l |= 1;
            break;
         case 3:
            if (t.i == 5) {
               t.a(70);
            }

            if (q.an == this) {
               q.i();
            }

            if (t.z == super.at) {
               q.c(super.av, super.aw, 2, super.as, this.aR);
               t.l |= 1;
            }

            this.e((byte)3);
            this.bg = Math.abs(this.aR - 4);
            break;
         case 4:
            if (t.z == super.at) {
               q.c(super.av, super.aw, this.ah(), super.as, this.aR);
            }

            if (super.au == 4 && t.z == 0) {
               t.l(23, 0);
            }
            break;
         case 5:
            this.e((byte)4);
            break;
         case 6:
            this.d((byte)7);
            break;
         case 7:
            this.c((byte)8);
            break;
         case 8:
            if (super.au == 2) {
               for (int var5 = 0; var5 < this.aX; var5++) {
                  if (this.aV[var5] != null) {
                     this.aV[var5].aY = false;
                  }
               }
            }

            if (q.an == this) {
               q.i();
            }

            v var6 = this;
            if (this.bn && var6.aT < var6.aU) {
               label173: {
                  v var8 = var6;
                  switch (var6.au) {
                     case 1:
                     case 2:
                        var8.aT++;
                        var8.aX++;
                        var8.ap++;
                        var8.bw++;
                        if (var8.bf != null) {
                           var8.bf.a(var8.bf.e + 1);
                        }

                        var8.Y();
                        int var11 = 0;

                        while (true) {
                           if (var11 >= var8.aV.length) {
                              break label173;
                           }

                           if (var8.aV[var11] != null) {
                              var8.aV[var11].e(var8);
                           }

                           var11++;
                        }
                     case 3:
                        var8.aT++;
                        var8.ap++;
                        break;
                     case 4:
                        var8.aT++;
                        var8.ap++;
                        if (var8.bf != null) {
                           var8.bf.a(var8.bf.e + 1);
                        }
                        break;
                     default:
                        break label173;
                  }

                  var8.Y();
               }

               t.e(q.b(var6.au), var6.ar);
               if (var6.aT == var6.aU) {
                  var6.bn = false;
               }
            }

            this.d((byte)4);
            t.l(24, 0);
            t.b(34, super.au, this.aT, super.ar);
            t.l |= 1;
            v var7 = this;
            int var9 = -1;
            int[] var12 = q.a(var7.au, var7.ar);
            switch (var7.au) {
               case 0:
                  var9 = 17;
                  break;
               case 1:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
                  var9 = 33 + (var7.aT - 2);
                  break;
               case 2:
                  var9 = 32 + (var7.aT - 2);
                  break;
               case 8:
                  var9 = 14;
               case 9:
               default:
                  break;
               case 10:
                  var9 = 5;
            }

            a(1, var12[var9], this, this.aR * 48, -48);
            break;
         case 9:
            this.d((byte)10);
            break;
         case 10:
            this.c((byte)11);
            break;
         case 11:
            if (t.i == 5) {
               t.a(70);
            }

            if (q.an == this && t.F()) {
               t.v();
               q.i();
            }
            break;
         case 12:
            if (q.an == this) {
               t.I();
            }

            if (t.r) {
               a(2, this.r(2), this, this.aR * 48, -48);
               a(1, this.r(5), this, this.aR * 48, -48);
               t.b(31, this.aZ, -1, -1);
               this.d((byte)4);
            } else {
               this.d((byte)4);
            }
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         default:
            break;
         case 18:
            this.d((byte)19);
            break;
         case 19:
            this.c((byte)21);
            break;
         case 20:
            t.a(68);
            q.b(super.av, super.aw, this.aR);
            t.h();
            if (this.bt[0] != null && super.au == 10) {
               this.bt[0] = null;
               bu--;
            }

            if (q.an == this && q.an.au == 10) {
               t.v();
            }

            a(1, ((int[][])t.T[1])[super.ar][5], this, this.aR * 48, -48);
            this.ag();
            t.ab.a(this.bh.e[0], 4);
            q.a(this, t.z);
            t.l(45, 0);
            t.l(46, 0);
            t.l(47, 0);
            t.b(35, -1, -1, -1);
            if (q.an == this) {
               q.i();
            }

            t.l |= 1;
            break;
         case 21:
            if (q.an == this) {
               q.i();
            }
            break;
         case 22:
            if (q.an == this) {
               q.i();
            }
            break;
         case 23:
            if (this.aV[0] != null && this.aV[1] != null) {
               this.ba = this.aV[0].a(this.aV[1]);
               this.ba = r.o(this.ba);
               this.c((byte)22);
            }
            break;
         case 24:
            if (t.z == 0) {
               t.b(26, this.ba, this.aV[0].ar, this.aV[1].ar);
               r var4;
               if (q.f(1).ak()) {
                  this.aV[0].d((byte)4);
                  this.aV[1].d((byte)4);
                  this.d((byte)4);
                  this.as();
                  int var10000 = t.z;
                  int var10001 = this.ba;
                  v var3 = q.f(1);
                  var4 = q.a(var10000, var10001, var3, (byte)13, (byte)1, true);
               } else {
                  this.aV[0].d((byte)4);
                  this.aV[1].d((byte)4);
                  this.d((byte)25);
                  this.as();
                  v var10 = this;
                  int var2 = this.ba;
                  var4 = q.a(t.z, this.ba, var10, (byte)26, (byte)1, true);
               }

               var4.bg.e[16] = 1;
               if (var4.bm[42] != 15) {
                  t.l(12, var4.bm[42]);
               }

               if (var4.bm[43] != 15) {
                  t.l(12, var4.bm[43]);
               }

               if (var4.bm[44] != 15) {
                  t.l(12, var4.bm[44]);
               }

               t.l(13, 0);
            } else {
               t.b(41, t.c(t.z), this.aV[0].ar, this.aV[1].ar);
               t.b(41, t.c(t.z), this.aV[1].ar, this.aV[0].ar);
               this.aV[0].d((byte)4);
               this.aV[1].d((byte)4);
               this.as();
               this.d((byte)4);
               a(0, an(), this, this.aR * 48, -48);
               t.A();
               t.l |= 1;
            }

            if (q.an == this) {
               q.i();
            }
      }

      if (super.au == 10) {
         this.aw();
      } else {
         this.ax();
      }

      t.j();
      t.i();
   }

   final void M() {
      if (t.z == super.at) {
         switch (super.aP) {
            case 2:
               t.Y = true;
               return;
            case 3:
               if (this.be != null) {
                  this.aa();
                  t.Y = true;
                  if (!this.bd) {
                     this.bd = true;
                     return;
                  }
               }
               break;
            case 4:
               if (super.aI == 4) {
                  this.R();
                  return;
               }

               if (super.ay != null) {
                  q.a(super.ay);
                  this.a(super.ay, super.av, super.aw);
                  super.ay.g();
                  return;
               }
            case 5:
            case 6:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            default:
               break;
            case 7:
               q.a(super.az, super.ap, super.av, super.aw);
               if (this.bf != null) {
                  this.ab();
               }

               if (super.aI == 5) {
                  v var1 = this;
                  if ((t.E = t.E + t.F) >= t.G || t.E <= 0) {
                     t.F = -t.F;
                  }

                  if (t.E >= t.G) {
                     t.E = t.G - 1;
                  }

                  if (t.E <= 0) {
                     t.E = 1;
                  }

                  t.D = (t.D = (t.E = t.E % t.G) << 24) | 16777215;
                  t.H(19);
                  t.e(19, 1, 1);
                  t.e(19, 0, t.D);
                  q.a(var1.az, var1.ap, var1.av, var1.aw);
                  if (var1.bf != null) {
                     q.a(var1.bf);
                     var1.a(var1.bf, var1.av, var1.aw);
                     var1.bf.g();
                  }

                  t.a(19, false);
               }

               this.ac();
               this.a(super.av, super.aw, this.aR);
               if (this.bp) {
                  this.br.g();
               }

               if (this.be != null) {
                  this.aa();
                  if (!this.bd) {
                     this.bd = true;
                     return;
                  }
               }
               break;
            case 10:
               q.a(super.az, super.ap, super.av, super.aw);
               this.a(super.av, super.aw, this.aR);
               break;
            case 11:
               q.a(super.az, super.ap, super.av, super.aw);
               if (this.bp) {
                  this.br.g();
               }

               if (this.be != null) {
                  this.aa();
                  if (!this.bd) {
                     this.bd = true;
                     return;
                  }
               }
               break;
            case 19:
               q.a(super.az, super.ap, super.av, super.aw);
               this.a(super.av, super.aw, this.aR);
               return;
            case 21:
               q.a(super.az, super.ap, super.av, super.aw);
               if (this.be != null) {
                  this.aa();
                  if (!this.bd) {
                     this.bd = true;
                     return;
                  }
               }
               break;
            case 22:
               q.a(super.az, super.ap, super.av, super.aw);
               if (this.be != null) {
                  this.aa();
                  if (!this.bd) {
                     this.bd = true;
                     return;
                  }
               }
               break;
            case 23:
               q.a(super.az, super.ap, super.av, super.aw);
               this.a(super.av, super.aw, this.aR);
               return;
         }
      }
   }

   final void P() {
      boolean var1 = t.ab() == 3;
      if (t.z == super.at) {
         switch (super.aP) {
            case 1:
               this.R();
               break;
            case 2:
               this.a(super.av, super.aw, this.aR);
            case 3:
            case 6:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            default:
               break;
            case 4:
            case 11:
               if (this.bp) {
                  this.br.g();
               }

               if (this.be != null) {
                  this.aa();
                  if (!this.bd) {
                     this.bd = true;
                  }
               }
               break;
            case 5:
               this.R();
               break;
            case 7:
               this.a(super.av, super.aw, this.aR);
               if (this.bp) {
                  this.br.g();
               }

               if (this.be != null) {
                  this.aa();
                  if (!this.bd) {
                     this.bd = true;
                  }
               }
               break;
            case 10:
               this.a(super.av, super.aw, this.aR);
               break;
            case 19:
               this.a(super.av, super.aw, this.aR);
               break;
            case 23:
               this.a(super.av, super.aw, this.aR);
         }

         if (!var1) {
            v var3 = this;
            if ((super.au != 2 || var3.aP != 4) && (var3.au != 3 || var3.aP != 23)) {
               return;
            }

            if (var3.bt != null) {
               for (int var2 = 0; var2 < var3.bt.length; var2++) {
                  if (var3.bt[var2] != null) {
                     var3.bt[var2].g();
                  }
               }
            }
         }
      }
   }

   public final void aa() {
      d var1 = null;
      this.be.g = 100;
      if (!t.I) {
         int var10001 = this.be.a * t.S / 100;
         int var3 = this.be.b * t.S / 100;
         int var2 = var10001;
         var1 = this.be;
         this.be.a = var2;
         var1.b = var3;
      }

      this.be.g();
      int var5 = t.S;
      this.be.g = t.S;
   }

   public final void ab() {
      q.a(this.bf);
      this.a(this.bf, super.av, super.aw);
      this.bf.g();
   }

   public final void ac() {
      if (super.aI != 4) {
         for (int var1 = 0; var1 < this.aX; var1++) {
            if (this.aV[var1] != null) {
               this.aV[var1].M();
            } else {
               int var3 = var1;
               v var2 = this;
               if ((this.aY >> var3 & 1) > 0) {
                  int[] var4;
                  int var5 = (var4 = var2.az.g(var2.ap))[0 + (var3 << 2)];
                  var3 = var4[0 + (var3 << 2) + 1];
                  q.a(t.j[3][39], 0, var2.av + var5, var2.aw + var3);
               }
            }
         }
      }
   }

   private void aA() {
      if (super.aI == 5) {
         this.bk++;
         if (this.bk >= bz[this.by]) {
            this.bk = 0;
            if (super.aI == 5) {
               this.k(-1);
               return;
            }

            this.k(0);
         }
      }
   }

   private short[][] aB() {
      int var1 = 0 + this.aR * 48;
      int var2 = 0 - this.aR * 24;
      int var3 = 0 + this.aR * 96;
      int var4 = 0 + this.aR * 24;
      short[][] var5;
      (var5 = new short[4][4])[0][0] = 0;
      var5[0][1] = 0;
      var5[0][2] = (short)var1;
      var5[0][3] = (short)var2;
      var5[1][0] = (short)var1;
      var5[1][1] = (short)var2;
      var5[1][2] = (short)var3;
      var5[1][3] = 0;
      var5[2][0] = (short)var3;
      var5[2][1] = 0;
      var5[2][2] = (short)var1;
      var5[2][3] = (short)var4;
      var5[3][0] = (short)var1;
      var5[3][1] = (short)var4;
      var5[3][2] = 0;
      var5[3][3] = 0;
      return var5;
   }

   public final void k(int var1) {
      if (var1 == 0) {
         this.by = 0;
      } else if (var1 == -1) {
         this.by++;
         if (this.by >= bx.length) {
            this.by = 0;
         }
      }
   }

   public final void a(boolean var1, int var2) {
      this.bp = var1;
      this.bq = var2;
      if (this.bp) {
         this.br = new d();
         this.br.a(t.j[1][23]);
         this.br.a(0, -1);
         this.b(this.br, super.av, super.aw);
      } else {
         this.br = null;
      }
   }

   final void G() {
      super.G();
      if (super.ao != -1) {
         if (bm[super.ao] == null) {
            bm[super.ao] = new Object[t.j[3][super.ao].d()];
         }

         if (super.ap != -1) {
            if (bm[super.ao][super.ap] == null) {
               if (super.au == 6) {
                  bm[super.ao][super.ap] = this.aB();
                  return;
               }

               if (super.au != 1 && super.au != 2) {
                  bm[super.ao][super.ap] = this.aB();
                  return;
               }

               bm[super.ao][super.ap - (this.aT - 1)] = this.aB();
               bm[super.ao][super.ap - (this.aT - 1) + 1] = this.aB();
               bm[super.ao][super.ap - (this.aT - 1) + 2] = this.aB();
               return;
            }
         } else if (super.aq != -1 && (super.au == 5 || super.au == 7)) {
            bm[super.ao][0] = this.aB();
         }
      }
   }

   private void b(d var1, int var2, int var3) {
      int var4 = this.aR;
      int var5 = this.aR * 48;
      var4 = -(var4 * 24 - 24);
      this.a(var1, var2 + var5, var3 + var4);
   }

   private void a(int[] var1, int var2, byte var3, byte var4) {
      this.a(var1, var2, (byte)10, var4, (byte)1);
   }

   public final void a(int[] var1, int var2, byte var3, byte var4, byte var5) {
      super.at = var2;
      super.au = var3;
      super.ar = var4;
      switch (var3) {
         case 1:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 14:
         case 16:
            this.aT = var5;
            super.ao = var1[1];
            super.ap = var1[2] + (this.aT - 1);
            this.aS = var1[3];
            super.aq = var1[7];
            this.aR = var1[15];
            this.bn = var1[13] == 1;
            if (this.bn) {
               this.aU = (byte)(var1[14] + 1);
            }

            if (1 == var3) {
               this.aW = 0;
               this.aX = this.aT;
               this.bo = this.aU;
            }

            if (3 == var3) {
               this.aW = 0;
               this.bo = this.aX = 2;
               this.bt = new d[1];
            }

            if (var1[3] >= 0) {
               this.bv = var1[3];
               this.bw = var1[4] + (this.aT - 1);
            }

            if (var1[5] >= 0) {
               this.bf = new d();
               var2 = var1[5];
               int var7 = var1[6] + (this.aT - 1);
               this.bf.a(t.j[3][var2]);
               this.bf.a(var7);
            }
            break;
         case 2:
            this.aT = var5;
            super.ao = var1[1];
            super.ap = var1[2] + (this.aT - 1);
            this.aS = var1[3];
            this.aR = var1[15];
            this.bn = var1[13] == 1;
            if (this.bn) {
               this.aU = (byte)(var1[14] + 1);
            } else {
               this.aU = 1;
            }

            this.bt = new d[this.aU];
            this.aW = 0;
            this.aX = this.aT;
            this.bo = this.aU;
            if (super.ar == 6) {
               this.bo = 2;
               this.aX = 2;
               this.aT = 1;
            }

            if (var1[3] >= 0) {
               this.bv = var1[3];
               this.bw = var1[4] + (this.aT - 1);
            }

            if (var1[5] >= 0) {
               this.bf = new d();
               var2 = var1[5];
               int var6 = var1[6] + (this.aT - 1);
               this.bf.a(t.j[3][var2]);
               this.bf.a(var6);
            }
            break;
         case 8:
            super.ao = var1[1];
            super.ap = var1[2];
            this.aS = var1[3];
            if (super.ar == 0) {
               super.ap = t.n(super.ap, super.ap + 2);
            }

            this.aR = var1[16];
         case 9:
         case 11:
         case 12:
         case 13:
         case 15:
         default:
            break;
         case 10:
            this.aX = this.bo = 1;
            this.aR = var1[7];
            this.aT = var5;
            this.bn = false;
            this.aU = 1;
            this.bt = new d[this.aU];
      }

      if (this.bo != 0) {
         this.aV = new r[this.bo];
      }

      this.e((byte)2);
   }

   public final byte X() {
      return 2;
   }

   public final void a(int[] var1, int var2, int var3, byte var4, int var5, int var6) {
      this.a(var1, var2, (byte)10, var4);
      int var7 = q.d(var5 + 48, var6);
      var3 = q.e(var5 + 48, var6);
      this.b(var7, var3);
      super.aP = 4;
      this.bh = t.a(var2, var4, 1, (int)super.aB / 1000, (int)(super.aA / 1000L), (int)super.aC / 1000, super.aD, super.aE, super.aF ? 1 : 0, var5, var6);
   }

   public final void a(int[] var1, int var2, w var3) {
      this.a(var1, var2, (byte)10, (byte)var3.e[1]);
      int var4 = q.d(var3.e[9] + 48, var3.e[10]);
      var2 = q.e(var3.e[9] + 48, var3.e[10]);
      this.b(var4, var2);
      super.aB = var3.e[3] * 1000;
      super.aA = t.g - (t.k - t.h) + var3.e[4] * 1000;
      super.aC = var3.e[5] * 1000;
      super.aD = (byte)var3.e[6];
      super.aE = (byte)var3.e[7];
      super.aF = var3.e[8] == 1;
      super.al = super.aC;
      super.aP = (byte)var3.e[2];
      this.bh = var3;
   }

   private boolean aC() {
      return super.au == 8 && (super.ar == 0 || super.ar == 17 || super.ar == 18);
   }

   public final boolean k(int var1, int var2) {
      if (this.bb) {
         return false;
      }

      int var3 = t.m;
      int var4 = t.n;
      if (t.o) {
         var3 <<= 1;
         var4 <<= 1;
      }

      int var5 = q.f(super.av, super.aw);
      int var6 = q.g(super.av, super.aw);
      int var7 = q.f(var1 + var3, var2 + var4);
      var1 = q.g(var1 + var3, var2 + var4);
      var2 = this.aR - 1;
      var3 = var5;
      var4 = var6 - var2;
      return var7 >= var3 && var7 <= var3 + var2 && var1 >= var4 && var1 <= var4 + var2;
   }

   public final boolean l(int var1, int var2) {
      if (this.bb) {
         return false;
      }

      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      if (this.bd && this.be != null) {
         if (t.o) {
            var1 /= 2;
            var2 /= 2;
         }

         if (this.bd) {
            var5 = this.be.b();
            int var6 = this.be.e;
            var4 = this.be.f;
            var3 = this.be.d.c(var6, var4);
            var4 = this.be.d.d(var6, var4);
         }

         int[] var16 = new int[4];
         int var9 = this.be.b;
         int var8 = this.be.a;
         int var7 = var5;
         this.be.d.a(var16, var7, var8, var9);
         var16[0] += var3;
         var16[1] += var4;
         var16[2] += var3;
         var16[3] += var4;
         int var10002 = var16[0];
         int var10003 = var16[1];
         int var10004 = var16[2];
         int var17 = var16[3];
         var5 = var10004;
         var4 = var10003;
         var3 = var10002;
         var2 = var2;
         var1 = var1;
         if (var1 < var3) {
            return false;
         } else if (var1 > var5) {
            return false;
         } else {
            return var2 < var4 ? false : var2 <= var17;
         }
      } else {
         return false;
      }
   }

   public final boolean m(int var1, int var2) {
      if (this.bb) {
         return false;
      }

      int var3 = 0;
      if (t.o) {
         var1 /= 2;
         var2 /= 2;
      }

      int var4;
      int var5;
      if (t.o) {
         var4 = super.av / 2 - t.m;
         var5 = super.aw / 2 - t.n;
      } else {
         var4 = super.av - t.m;
         var5 = super.aw - t.n;
      }

      int[] var6 = new int[4];
      if (super.az == null) {
         super.az = null;
      }

      if (super.ap != -1) {
         var3 = super.az.h(super.ap);
      }

      for (int var7 = 0; var7 < var3; var7++) {
         super.az.a(super.ap, var7, var6);
         if (t.o) {
            var6[0] /= 2;
            var6[1] /= 2;
            var6[2] /= 2;
            var6[3] /= 2;
         }

         int var10002 = var4 + var6[0];
         int var10003 = var5 + var6[1];
         int var10004 = var6[2];
         int var13 = var6[3];
         int var12 = var10004;
         int var11 = var10003;
         int var10 = var10002;
         int var9 = var2;
         int var8 = var1;
         if (var1 < var10 ? false : (var8 > var10 + var12 ? false : (var9 < var11 ? false : var9 <= var11 + var13))) {
            return true;
         }
      }

      return false;
   }

   public final boolean ad() {
      if (t.z == 0) {
         for (int var1 = 0; var1 < this.aV.length; var1++) {
            if (this.aV[var1] != null && this.aV[var1].ar != 49) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean aD() {
      if (t.z == 0) {
         for (int var1 = 0; var1 < this.aV.length; var1++) {
            if (this.aV[var1] != null && this.aV[var1].ar == 49) {
               return true;
            }
         }
      }

      return false;
   }

   public final void ae() {
      if (super.au != 16) {
         q.b(this);
         label130:
         switch (super.au) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 14:
            case 17:
               switch (super.aP) {
                  case 2:
                     q.a(this);
                     break label130;
                  case 4:
                     q.a(this);
                     q.K();
                     break label130;
                  case 7:
                     q.a(this);
                     break label130;
                  case 10:
                     q.a(this);
                     break label130;
                  case 11:
                     t.a(32);
                     this.af();
                     this.d((byte)12);
                     break label130;
                  case 23:
                     q.a(this);
                  default:
                     break label130;
               }
            case 2:
               switch (super.aP) {
                  case 2:
                     q.a(this);
                     break label130;
                  case 4:
                  case 7:
                     if (this.bp) {
                        if (this.bq == 0) {
                           if (t.R != -1) {
                              t.a(34);
                              r var1;
                              (var1 = q.f(1).aV[t.R]).d((byte)4);
                              this.a(var1);
                              var1.e(this);
                              var1.ah();
                              var1.aA = t.g;
                              q.f(1).p(t.R);
                              q.a(var1, false, true);
                              t.R = -1;
                              q.i();
                              a(1, var1.F(), this, this.aR * 48, -48);
                              boolean var2 = false;

                              int var3;
                              for (var3 = 0; var3 < t.ai.length && t.ai[var3] != null; var3++) {
                                 if (t.ai[var3].bc == var1.bc) {
                                    var2 = true;
                                 }
                              }

                              if (!var2) {
                                 t.ai[var3] = var1;
                                 t.m();
                              }

                              t.b(var1.ar);
                              t.l(0, 0);
                              t.l(1, 0);
                              t.l(2, 0);
                              t.l(3, 0);
                              t.l(7, 0);
                              t.l(5, 0);
                              t.l(6, 0);
                              t.l(4, 0);
                              t.l(8, 0);
                              t.l(9, 0);
                              t.l(10, 0);
                              t.l(11, 0);
                              t.b(24, var1.ar, -1, -1);
                           }
                        } else if (this.bq == 1) {
                           t.Q.ag().p(t.R);
                           this.a(t.Q);
                           t.Q.e(this);
                           q.a(t.Q, false, true);
                           t.R = -1;
                           q.i();
                        }
                     } else {
                        q.K();
                        if (t.Q != null) {
                           q.a(t.Q, false, true);
                           t.R = -1;
                        }

                        if (this.bd) {
                           int var4;
                           if ((var4 = r.aa()) > 0 && t.ab.e[14] >= 86400000) {
                              int var5 = t.ab.e[14] / 86400000;
                              int var6 = var4 * 10 * var5;
                              a(3, var6, this, this.aR * 48, -48);
                              if (t.ab.e[14] >= 86400000) {
                                 t.ab.e[14] = t.ab.e[14] - var5 * 86400 * 1000;
                              }

                              r.ab();
                           } else {
                              t.b(36, this.ap(), super.ar, -1);
                              this.aq();
                           }

                           this.af();
                        } else {
                           q.a(this, true);
                        }
                     }
                  default:
                     break label130;
               }
            case 3:
               switch (super.aP) {
                  case 2:
                     q.a(this);
                     break label130;
                  case 4:
                     if (this.bp) {
                        if (this.bq == 2) {
                           t.Q.ag().p(t.R);
                           t.Q.ag().q(t.R);
                           this.a(t.Q);
                           t.Q.e(this);
                           q.a(false);
                           t.R = -1;
                           q.i();
                        }
                     } else {
                        q.a(this);
                        if (t.R != -1 && t.Q != null) {
                           q.a(t.Q, false, true);
                           t.R = -1;
                        }
                     }
                     break label130;
                  case 22:
                     t.a(70);
                     this.af();
                     this.d((byte)24);
                     break label130;
                  case 23:
                     q.a(this);
                     break label130;
                  case 25:
                     q.a(this);
                  default:
                     break label130;
               }
            case 7:
               switch (super.aP) {
                  case 2:
                     q.a(this);
                     break label130;
                  case 4:
                     q.a(this);
                     q.K();
                     if (t.ab.e[15] == 0 && t.z == 0) {
                        t.ab.e[15] = 86400000;
                        a(2, 5000, this, this.aR * 48, -48);
                        this.af();
                     }
                     break label130;
                  case 7:
                     q.a(this);
                     break label130;
                  case 10:
                     q.a(this);
                     break label130;
                  case 11:
                     t.a(60);
                     this.af();
                     this.d((byte)12);
                     break label130;
                  case 23:
                     q.a(this);
                  default:
                     break label130;
               }
            case 8:
               if (t.z == 0) {
                  if (q.j(q.i(super.av, super.aw)) != 1) {
                     q.a(this);
                  } else {
                     q.i();
                  }
               } else {
                  q.i();
               }
            case 9:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            default:
               break;
            case 10:
               if (t.z == 0) {
                  if (super.aP == 21) {
                     this.af();
                     this.d((byte)20);
                  } else if (!this.bb) {
                     q.a(this);
                  }
               } else {
                  q.i();
               }
         }

         if (super.aP == 3) {
            this.e((byte)2);
            t.a(36);
            a(1, this.F(), this, this.aR * 48, -48);
            t.b(33, super.au, super.ar, -1);
            if (t.F()) {
               q.a(this);
            }

            this.af();
            this.d((byte)4);
            t.y = true;
         }
      }
   }

   public final void af() {
      this.be = null;
      this.bd = false;
   }

   public final void l(int var1) {
      this.n(19, 0);
   }

   private void n(int var1, int var2) {
      int[] var3 = super.az.g(super.ap);
      if (!this.bd) {
         this.be = new d();
         this.be.a(t.j[3][43]);
         this.be.a(var1, 1);
         if (var2 >= 100) {
            this.be.h = 2;
         } else {
            this.be.h = 0;
         }

         this.a(this.be, super.av + var3[var3.length - 2], super.aw + var3[var3.length - 1]);
      } else {
         if (this.bd) {
            if (var2 >= 100) {
               this.be.h = 2;
            } else {
               this.be.h = 0;
            }

            if (t.o) {
               this.be.g = 50;
            } else {
               this.be.g = 100;
            }

            if (this.be.f()) {
               this.be.a(var1 + 1, -1);
            }

            this.a(this.be, super.av + var3[var3.length - 2], super.aw + var3[var3.length - 1]);
         }
      }
   }

   final int D() {
      return t.a(q.b(super.au), super.ar, this.aT);
   }

   public final void m(int var1) {
      if (this.B()) {
         t.g(this.D());
      } else {
         t.h(this.D());
      }

      q.b(super.av, super.aw, this.aR);
      this.ag();
   }

   public final void n(int var1) {
      this.aZ = var1;
      this.d((byte)9);
   }

   final void ag() {
      v var1 = this;
      if (t.o) {
         d.a(d.k[0][13], d.h(0), t.R() << 1, t.S() << 1);
      } else {
         d.a(d.k[0][13], d.h(0), t.R() + 96, t.S() + 48);
      }

      var1.Y();
      q.aO = true;
      if (var1.ay == null) {
         ;
      }

      var1.be = null;
      var1.ay = null;
      var1.az = null;
   }

   public final int ah() {
      switch (super.aP) {
         case 1:
            break;
         case 2:
            this.bs = 2;
            break;
         case 3:
         default:
            return -1;
         case 4:
            switch (super.au) {
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 14:
               case 16:
               case 17:
                  this.bs = 5;
                  return this.bs;
               case 8:
                  this.bs = this.aC() ? 7 : 6;
                  return this.bs;
               case 9:
               case 11:
               case 12:
               case 13:
               case 15:
               default:
                  return this.bs;
               case 10:
                  this.bs = 4;
                  return this.bs;
            }
         case 5:
            this.bs = 3;
      }

      return this.bs;
   }

   public final r o(int var1) {
      return var1 < this.aX && var1 >= 0 ? this.aV[var1] : null;
   }

   public final void a(r var1) {
      if (this.aW < this.aX) {
         for (int var2 = 0; var2 < this.aX; var2++) {
            if (this.aV[var2] == null && (this.aY >> var2 & 1) == 0) {
               var1.aS = (byte)var2;
               this.aV[var2] = var1;
               this.aW++;
               return;
            }
         }
      }
   }

   public final int ai() {
      return this.aX;
   }

   public final void p(int var1) {
      if (var1 < this.aX && var1 >= 0) {
         this.aV[var1] = null;
         this.aW--;
      }
   }

   public final void q(int var1) {
      if (var1 < this.aX && var1 >= 0) {
         this.aY |= 1 << var1;
      }
   }

   public final void aj() {
      for (int var1 = 0; var1 < this.aX; var1++) {
         if ((this.aY >> var1 & 1) > 0) {
            this.aY &= ~(1 << var1);
            return;
         }
      }
   }

   public final boolean ak() {
      if (super.au != 2 && super.au != 1 && super.au != 3) {
         return false;
      }

      if (this.aW < this.aX) {
         int var1 = 0;

         for (int var2 = 0; var2 < this.aX; var2++) {
            if ((this.aY >> var2 & 1) > 0) {
               var1++;
            }
         }

         return this.aW + var1 < this.aX;
      } else {
         return false;
      }
   }

   public final boolean al() {
      return this.aW > 0;
   }

   public final boolean am() {
      return super.au != 4 || super.aP == 7 ? false : super.aP != 9 && super.aP != 10 && super.aP != 11 && super.aP != 12;
   }

   static int an() {
      int[][] var0 = t.o(36);

      for (int var1 = 0; var1 < var0.length; var1++) {
         if (var0[var1][0] == t.ab.e[7]) {
            return var0[var1][1];
         }
      }

      return 0;
   }

   public final int ao() {
      return ((int[][])t.T[3])[super.ar][35 + this.aT - 1];
   }

   public final int ap() {
      int var1;
      if ((var1 = this.bj) >= this.ao()) {
         var1 = this.ao();

         for (int var2 = 0; var2 < this.aX; var2++) {
            if (this.aV[var2] != null) {
               this.aV[var2].aY = true;
            }
         }
      }

      return var1;
   }

   public final void aq() {
      int var1 = this.ap();
      a(0, var1, this, this.aR * 48, -48);
      v var3 = this;

      for (int var2 = 0; var2 < var3.aX; var2++) {
         if (var3.aV[var2] != null) {
            var3.aV[var2].aT = 0;
         }
      }

      var3.bj = 0;

      for (int var4 = 0; var4 < var3.aX; var4++) {
         if (var3.aV[var4] != null && !var3.aV[var4].al()) {
            var3.aV[var4].aY = false;
         }
      }
   }

   public static void a(int var0, int var1, int var2, int var3) {
      t.a(32);
      switch (var0) {
         case 0:
            t.d(var0, var2, var3);
            t.g(var1);
            break;
         case 1:
            t.d(var0, var2, var3);
            t.k(var1);
            break;
         case 2:
            t.d(var0, var2, var3);
            t.i(var1);
            break;
         case 3:
            t.d(var0, var2, var3);
            t.h(var1);
      }

      t.b(21, var0, -1, -1);
   }

   public static void a(int var0, int var1, q var2, int var3, int var4) {
      t.a(32);
      switch (var0) {
         case 0:
            t.a(var2, var0, var3, var4);
            t.g(var1);
            break;
         case 1:
            t.a(var2, var0, var3, var4);
            t.k(var1);
            break;
         case 2:
            t.a(var2, var0, var3, var4);
            t.i(var1);
            break;
         case 3:
            t.a(var2, var0, var3, var4);
            t.h(var1);
      }

      t.b(21, var0, -1, -1);
   }

   public final int r(int var1) {
      return ((int[][])t.T[13])[this.aZ][var1];
   }

   public final void ar() {
      this.d((byte)18);
   }

   public final void a(r var1, r var2) {
      if (var1 != null && var2 != null) {
         var1.d((byte)17);
         var2.d((byte)17);
         this.d((byte)23);
      }
   }

   public final void b(r var1, r var2) {
      if (var1 != null && var2 != null) {
         var1.d((byte)17);
         var2.d((byte)17);
         this.d((byte)24);
      }
   }

   public final void as() {
      for (int var1 = 0; var1 < this.aX; var1++) {
         if (this.aV[var1] != null) {
            this.aV[var1].aY = false;
         }
      }

      if (this.aV[0] != null) {
         r var2;
         (var2 = this.aV[0]).ag().p(0);
         var2.af().aj();
         var2.af().a(var2);
         var2.e(var2.af());
      }

      if (this.aV[1] != null) {
         r var3;
         (var3 = this.aV[1]).ag().p(1);
         var3.af().aj();
         var3.af().a(var3);
         var3.e(var3.af());
      }
   }

   public final boolean at() {
      return this.bn ? this.aT < this.aU : false;
   }

   static void a(q var0) {
      if (var0 != null) {
         t.a(32);
         a var1;
         if ((var1 = t.j[1][23]) != null) {
            int var2 = -1;

            for (int var3 = 0; var3 < bC.length; var3++) {
               if (bC[var3] == null) {
                  var2 = var3;
                  bC[var3] = new d();
                  bC[var3].a(var1);
                  break;
               }
            }

            if (var2 >= 0) {
               t.d(var2);
            }

            bl[var2] = new d();
            bl[var2].a(t.j[3][0]);
            bl[var2].a(0, 1);
            bB[var2] = p.a(40, 2000, 200, 0, 0, 1, 1, -100, 100, -100, 100, 0, 0, 200, 200, 1, 0, 0, 0, 0, 0);
            bC[var2].a(2, 1);
            int var5 = bC[var2].d.a(bC[var2].e);
            int var4 = bC[var2].d.d(bC[var2].e, var5 - 1);
            a(var2, var0.av, var0.aw - var4, 1, true);
            bD[var2] = 5;
            bK[var2] = 0;
            bI[var2] = 0;
            bL[var2] = 0;
         }
      }
   }

   private static void a(int var0, int var1, int var2, int var3, boolean var4) {
      var3 = var3;
      var2 = var2;
      var1 = var1;
      var0 = var0;
      if (var4) {
         var3 *= 48;
         bE[var0] = var1 + var3;
         bF[var0] = var2;
         c(bC[var0], bE[var0], bF[var0]);
         c(bl[var0], bE[var0], bF[var0]);
         var1 = t.n(-3, 3);
         bG[var0] = var1;
      } else {
         if (!bC[var0].f()) {
            bE[var0] = bE[var0] + bG[var0];
         }

         c(bC[var0], bE[var0], bF[var0]);
         c(bl[var0], bE[var0], bF[var0]);
      }
   }

   private static void c(d var0, int var1, int var2) {
      if (var0 != null) {
         if (t.o) {
            var1 = (var1 >> 1) - t.m;
            var2 = (var2 >> 1) - t.n;
         } else {
            var1 -= t.m;
            var2 -= t.n;
         }

         var1 = var1;
         d var3 = var0;
         var0.a = var1;
         var3.b = var2;
      }
   }

   private static int[] s(int var0) {
      int var1 = bC[var0].d.c(bC[var0].e, bC[var0].f);
      int var2 = bC[var0].d.d(bC[var0].e, bC[var0].f);
      int var3 = bC[var0].d.b(bC[var0].b());
      int var4 = bC[var0].d.c(bC[var0].b());
      var3 <<= 1;
      var4 <<= 1;
      if (t.o) {
         var1 >>= 1;
         var2 >>= 1;
         var3 >>= 1;
         var4 >>= 1;
      }

      int[] var5;
      (var5 = new int[4])[0] = bC[var0].a + var1 - (var3 >> 1);
      var5[1] = bC[var0].b + var2 - (var4 >> 1);
      var5[2] = var3;
      var5[3] = var4;
      return var5;
   }

   private static void t(int var0) {
      bC[var0].d.d(bC[var0].e, bC[var0].f);
      int var1 = bC[var0].a;
      int var2 = bC[var0].b;
      bE[var0] = var1;
      bF[var0] = var2;
      bL[var0] = 0;
      bM[var0] = bE[var0];
      bN[var0] = bF[var0];
   }

   static boolean au() {
      if (bC == null) {
         return false;
      }

      int var0 = t.l();

      for (int var2 = 0; var2 < var0; var2++) {
         int var1;
         if ((var1 = t.e(var2)) >= 0) {
            if (bB[var1] != null && bI[var1] == 2) {
               bB[var1].a(t.aq);
               p var3;
               if ((var3 = bB[var1]).a <= 0) {
                  bB[var1] = null;
               }
            }

            if (bC[var1] != null) {
               switch (bI[var1]) {
                  case 0:
                  default:
                     break;
                  case 1:
                     int[] var11;
                     if ((var11 = s(var1)) != null && t.a(t.q(), t.r(), var11)) {
                        t.a(31);
                        bI[var1] = 2;
                        t(var1);
                        if (bl[var1] != null) {
                           bl[var1].a(0, 1);
                        }

                        if (bl[var1] != null) {
                           d var10000 = bl[var1];
                           int var10001 = t.q();
                           int var12 = t.r();
                           var2 = var10001;
                           d var8 = var10000;
                           var10000.a = var2;
                           var8.b = var12;
                        }

                        bB[var1].a();
                        return true;
                     }

                     if (System.currentTimeMillis() - bJ[var1] > 400L && t.F()) {
                        t.a(31);
                        bI[var1] = 2;
                        t(var1);
                        bL[var1] = 0;
                        bB[var1].a();
                     }
                     break;
                  case 2:
                     bL[var1] = bL[var1] + t.aq;
                     int var10 = bM[var1];
                     int var4 = bN[var1];
                     int var5 = bA[bK[var1]][0];
                     int var6 = bA[bK[var1]][1] - 120;
                     int var7 = var5;
                     if (var5 - var10 >= 0) {
                        var7 += 200;
                     } else {
                        var7 -= 200;
                     }

                     t.a(var10, var4, var7, var4, var5, var6, (bL[var1] << 8) / 600);
                     bE[var1] = t.at;
                     bF[var1] = t.au;
                     break;
                  case 3:
                     bL[var1]++;
                     if (bL[var1] > 6) {
                        bI[var1] = 4;
                     }
                     break;
                  case 4:
                     if (bK[var1] == 0) {
                        t.g(bD[var1]);
                     } else if (bK[var1] == 1) {
                        t.k(bD[var1]);
                     } else if (bK[var1] == 2) {
                        t.i(bD[var1]);
                     } else if (bK[var1] == 3) {
                        t.h(bD[var1]);
                     }

                     t.f(var1);
                     t.b(21, bK[var1], -1, -1);
                     bC[var1] = null;
                     bK[var1] = -1;
                     bD[var1] = -1;
                     bE[var1] = -1;
                     bF[var1] = -1;
                     bG[var1] = -1;
                     bH[var1] = -1;
                     bI[var1] = -1;
                     bJ[var1] = -1L;
                     bL[var1] = 0;
               }
            } else {
               t.f(var1);
            }
         }
      }

      return false;
   }

   static void av() {
      if (bC != null) {
         int var0 = t.l();

         for (int var2 = 0; var2 < var0; var2++) {
            int var1 = t.e(var2);
            if (bC[var1] != null) {
               q.a(bC[var1]);
               bC[var1].c(t.aq);
               if (bl[var1] != null) {
                  bl[var1].c(t.aq);
               }

               switch (bI[var1]) {
                  case 0:
                     if (bC[var1].f()) {
                        bI[var1] = 1;
                        bJ[var1] = System.currentTimeMillis();
                        t.b(22, -1, -1, -1);
                     }

                     a(var1, -1, -1, -1, false);
                     bC[var1].g();
                     if (bl[var1] != null) {
                        bl[var1].g();
                     }
                     break;
                  case 1:
                     a(var1, -1, -1, -1, false);
                     bC[var1].g();
                     if (!t.F()) {
                        int[] var7 = s(var1);
                        int var18 = var7[0] + var7[2] / 2;
                        int var13 = var7[1];
                        int var10 = var18;
                        d var8 = t.ae;
                        t.ae.a = var10;
                        var8.b = var13;
                        t.ae.g();
                     }

                     if (bl[var1] != null) {
                        bl[var1].g();
                     }
                     break;
                  case 2:
                     bC[var1].d.d(bC[var1].e, bC[var1].f);
                     d var10000 = bC[var1];
                     int var10001 = bE[var1];
                     int var5 = bF[var1];
                     int var4 = var10001;
                     d var3 = var10000;
                     var10000.a = var4;
                     var3.b = var5;
                     if (bB[var1] != null) {
                        p var15 = bB[var1];
                        var10001 = bE[var1];
                        var5 = bF[var1] + 120;
                        var4 = var10001;
                        p var6 = var15;
                        var15.b[0] = var4;
                        var6.b[1] = var5;
                     }

                     if (bL[var1] > 600) {
                        bI[var1] = 4;
                     } else {
                        bC[var1].g();
                     }

                     if (bl[var1] != null) {
                        bl[var1].g();
                     }
                     break;
                  case 3:
                     if (bL[var1] % 2 == 0) {
                        bC[var1].g();
                     }
                  case 4:
               }
            }

            if (bB[var1] != null && bI[var1] == 2) {
               p var16 = bB[var1];
               a var14 = t.j[3][0];
               Graphics var11 = t.am;
               var16.a(var11, var14, 1, 0, 0, false, c.c, (byte)0);
            }
         }
      }
   }

   public final void aw() {
      if (this.bh != null && t.i != 3) {
         this.bh.e[2] = super.aP;
         this.bh.e[3] = (int)super.aB / 1000;
         this.bh.e[4] = (int)((super.aA - t.g) / 1000L);
         this.bh.e[5] = (int)(super.aC / 1000L);
         this.bh.e[6] = super.aD;
         this.bh.e[7] = super.aE;
         this.bh.e[8] = super.aF ? 1 : 0;
         this.bh.e[9] = super.av;
         this.bh.e[10] = super.aw;
         this.bh.e[11] = q.f(super.av + 48, super.aw);
         this.bh.e[12] = q.g(super.av, super.aw + 24);
      }
   }

   public final void ax() {
      if (this.bh != null && t.i != 3) {
         this.bh.e[3] = super.aP;
         this.bh.e[4] = (int)super.aB / 1000;
         this.bh.e[5] = (int)((super.aA - t.g) / 1000L);
         this.bh.e[6] = (int)(super.aC / 1000L);
         this.bh.e[7] = super.aD;
         this.bh.e[8] = super.aE;
         this.bh.e[9] = super.aF ? 1 : 0;
         this.bh.e[10] = this.aT;
         this.bh.e[11] = super.av;
         this.bh.e[12] = super.aw;
         this.bh.e[20] = q.f(super.av + 48, super.aw);
         this.bh.e[21] = q.g(super.av, super.aw + 24);
         this.bh.e[18] = this.bj;
         this.bh.e[17] = this.aY;
         if (super.au == 3) {
            this.bh.e[19] = this.ba;
         } else if (super.au == 4) {
            this.bh.e[19] = this.aZ;
         }

         if (this.aV != null && this.aV.length > 0 && this.aV[0] != null) {
            this.bh.e[13] = this.aV[0].bg.e[0];
            if (this.bh.e[0] == 15) {
            }
         } else {
            this.bh.e[13] = -1;
         }

         if (this.aV != null && this.aV.length >= 2 && this.aV[1] != null) {
            this.bh.e[14] = this.aV[1].bg.e[0];
         } else {
            this.bh.e[14] = -1;
         }

         if (this.aV != null && this.aV.length >= 3 && this.aV[2] != null) {
            this.bh.e[15] = this.aV[2].bg.e[0];
         } else {
            this.bh.e[15] = -1;
         }

         this.bh.e[16] = this.aW;
      }
   }

   public final void V() {
      q.a(super.az, super.ap, super.av, super.aw, this.aS);
      if (this.bv >= 0) {
         q.a(t.j[3][this.bv], this.bw, super.av, super.aw, 0);
      }
   }

   public final void Z() {
      if (super.ay == null) {
         q.a(super.az, super.ap, super.av, super.aw, 0, true, this.aS);
         if (this.bv >= 0) {
            q.a(t.j[3][this.bv], this.bw, super.av, super.aw);
            return;
         }
      } else {
         super.ay.g();
      }
   }

   public final void ay() {
      t.l(super.ar);
   }

   static void az() {
      t.E = 50;
   }
}
