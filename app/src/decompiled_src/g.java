import java.util.TimerTask;

final class g extends TimerTask {
   public final void run() {
      if (!m.g) {
         try {
            m.f = true;
            m.e.close();
            m.m();
            return;
         } catch (Exception var2) {
            new StringBuffer().append("PaySMS.buy: Failed to close connection in timer. Exception: ").append(var2.toString()).toString();
            m.m();
         }
      }
   }
}
