import java.util.Timer;
import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class n extends Thread {
   public final void run() {
      m.l();

      try {
         String var1 = "sms://";
         if (!m.n().equals("")) {
            var1 = var1 + m.n();
         } else {
            if (m.o().equals("1")) {
               m.b(m.c("IAP-ShortCode-PP" + m.c));
            } else {
               m.b("");
            }

            if (!m.p().equals("")) {
               var1 = var1 + m.p();
            } else {
               if (m.q() == -1) {
                  m.m();
                  m.a(false);
                  m.a(m.d[0], "0");
                  m.s();
                  m.f(-1);
                  return;
               }

               var1 = var1 + m.r()[m.q()][11];
            }
         }

         new StringBuffer().append("PaySMS.buy: smsAdress: ").append(var1).toString();
         m.l();
         m.e = (MessageConnection)Connector.open(var1);
         new StringBuffer().append("PaySMS.buy: Connection opened - conn: ").append(m.e).toString();
         m.l();
         TextMessage var9 = (TextMessage)m.e.newMessage("text");
         new StringBuffer().append("PaySMS.buy: TextMessage created - msg: ").append(var9).toString();
         m.l();
         var9.setPayloadText(m.t());

         try {
            Thread.sleep(200L);
         } catch (Exception var5) {
            new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(var5.toString()).toString();
            m.m();
         }

         m.a(new Timer());
         m.u().schedule(new g(), 30000L);
         m.e.send(var9);
         m.g = true;
         m.l();
         m.a(true);
         m.a(m.d[0], "1");
         m.a(m.d[1], m.v());
         m.a(m.d[2], String.valueOf(m.a));
         m.a(m.d[5], m.b);
         m.w();
         m.a(m.d[11], "" + m.x());
         m.a(m.d[12], "sms_2d");
         m.a(m.d[13], m.y() + "");
         if (!m.o().equals("1")) {
            m.a(m.z());
         }

         try {
            Thread.sleep(100L);
         } catch (Exception var4) {
            new StringBuffer().append("PaySMS.buy: Exception trying to sleep: ").append(var4.toString()).toString();
            m.m();
         }
      } catch (SecurityException var6) {
         m.a(false);
         m.a(m.d[0], "0");
         m.f(-9);
         new StringBuffer().append("PaySMS.buy: SMS sent failed! Security Exception: ").append(var6.toString()).toString();
         m.m();
      } catch (Throwable var7) {
         m.a(false);
         m.a(m.d[0], "0");
         if (m.f) {
            m.f(-4);
         } else {
            m.f(-1);
         }

         new StringBuffer().append("PaySMS.buy: SMS sent failed! Exception: ").append(var7.toString()).toString();
         m.m();
      }

      try {
         if (m.e != null) {
            m.e.close();
         }

         m.l();
      } catch (Exception var3) {
         new StringBuffer().append("PaySMS.buy: Failed to close connection! Exception: ").append(var3.toString()).toString();
         m.m();
      }

      m.s();
      m.l();
   }
}
