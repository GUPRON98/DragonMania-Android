import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public final class f implements Runnable {
   private boolean c;
   private Thread d;
   private String e;
   private String f;
   private HttpConnection g;
   private InputStream h;
   private OutputStream i;
   public String a;
   private byte[] j;
   private int k;
   private boolean l;
   private boolean m;
   private boolean n;
   public boolean b;
   private int o;
   private String p;
   private String q;

   public f() {
      this(true);
   }

   public f(boolean var1) {
      this.c = var1;
      String var2 = "application/x-www-form-urlencoded";
      this.q = "application/x-www-form-urlencoded";
      this.p = "" + this.hashCode();
   }

   public final boolean a() {
      return this.l;
   }

   public final synchronized void b() {
      if (!this.n) {
         this.n = true;
         if (this.g != null) {
            if (this.h != null) {
               try {
                  synchronized (this.g) {
                     this.h.close();
                  }
               } catch (Exception var8) {
               }
            }

            if (this.g != null) {
               try {
                  synchronized (this.g) {
                     this.g.close();
                  }
               } catch (Exception var6) {
               }
            }

            if (this.i != null) {
               try {
                  synchronized (this.i) {
                     this.i.close();
                  }
               } catch (Exception var4) {
               }
            }

            this.i = null;
         }

         this.h = null;
         this.g = null;
         this.l = false;
         this.d = null;
         System.gc();
      }
   }

   public final void a(String var1, String var2, int var3) {
      this.k = var3;
      System.gc();
      System.currentTimeMillis();
      f var4 = this;

      while (var4.l) {
         try {
            synchronized (var4) {
               var4.wait(50L);
            }
         } catch (Exception var8) {
         }
      }

      var4 = this;
      this.b();
      var4.b = false;
      var4.a = null;
      var4.j = null;
      this.l = true;
      this.n = false;
      if (var3 == 1) {
         this.e = var1;
         this.f = var2;
      } else if (var2 != null && !"".equals(var2)) {
         if (!var2.startsWith("?") && !var1.endsWith("?")) {
            var2 = "?" + var2;
         }

         this.e = var1 + var2;
      } else {
         this.e = var1;
      }

      this.b = false;
      this.d = new Thread(this);
      this.d.start();
   }

   public final void run() {
      if (this.e == null) {
         this.b();
         this.b = true;
         this.l = false;
      } else if (this.k == 1 && this.f == null) {
         this.b();
         this.b = true;
         this.l = false;
      } else {
         try {
            this.b = false;
            if (this.n) {
               this.l = false;
            } else {
               this.g = (HttpConnection)Connector.open(this.e, 3);
               if (this.k == 1) {
                  this.g.setRequestMethod("POST");
               } else if (this.k == 0) {
                  this.g.setRequestMethod("GET");
               }

               this.g.setRequestProperty("Connection", "close");
               if (this.k == 1) {
                  this.g.setRequestProperty("Content-Type", this.q);
                  String var1;
                  if (this.c) {
                     var1 = "b=" + this.f;
                  } else {
                     var1 = this.f;
                  }

                  this.g.setRequestProperty("Content-Length", String.valueOf(var1.length()));
                  this.i = this.g.openOutputStream();
                  this.i.write(var1.getBytes(), 0, var1.length());
                  this.i.flush();
               }

               this.o = this.g.getResponseCode();
               this.g.getResponseMessage();
               this.g.getDate();
               if (this.o == 302) {
                  this.l = false;
                  this.m = true;
                  String var12 = this.g.getHeaderField("Location");
                  this.a(var12, this.f, this.k);
               } else if (this.o != 200 && this.o != 202) {
                  this.b();
                  this.b = true;
                  this.l = false;
               } else if (this.n) {
                  this.l = false;
               } else {
                  synchronized (this.g) {
                     this.h = this.g.openInputStream();
                  }

                  Thread.yield();
                  ByteArrayOutputStream var11 = new ByteArrayOutputStream();
                  byte[] var2 = new byte[256];
                  int var3 = 0;

                  while (var3 != -1) {
                     if (this.n) {
                        this.l = false;
                        return;
                     }

                     if ((var3 = this.h.read(var2, 0, 256)) == -1) {
                        break;
                     }

                     var11.write(var2, 0, var3);
                  }

                  this.j = var11.toByteArray();
                  this.a = new String(this.j, "UTF-8");
                  return;
               }
            }
         } catch (Exception var8) {
            this.b = true;
            this.l = false;
         } finally {
            if (!this.m) {
               this.b();
            }

            this.m = false;
         }
      }
   }

   public final String toString() {
      return this.p + ": " + this.e;
   }
}
