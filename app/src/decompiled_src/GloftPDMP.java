import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public final class GloftPDMP extends MIDlet {
   public static t a;
   public static GloftPDMP b;

   public GloftPDMP() {
      b = this;
   }

   public final void startApp() {
      if (a == null) {
         (a = new t(this, Display.getDisplay(this))).L();
      }

      a.N();
   }

   public final void pauseApp() {
      t.M();
   }

   public final void destroyApp(boolean var1) {
      if (a != null) {
         t.k();
         t.ao = -1;
      }

      this.notifyDestroyed();
   }
}
