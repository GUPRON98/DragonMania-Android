public final class b {
   private static char[] a = new char[]{' ', '{', '}', ':', '*', ',', '|', '"', '+', '-', '/', '$', '='};

   private static String a(char var0) {
      for (int var1 = 0; var1 < a.length; var1++) {
         if (a[var1] == var0) {
            return "%" + Integer.toHexString(var0);
         }
      }

      return String.valueOf(var0);
   }

   public static String a(String var0) {
      StringBuffer var1 = new StringBuffer();

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var2 = var0.charAt(var3);
         var1.append(a(var2));
      }

      return var1.toString();
   }

   static {
      String[] var10000 = new String[]{
         "message", "asset", "auth", "leaderboard", "social", "storage", "lobby", "matchmaker", "gllive", "bridge", "config", "chat", ""
      };
   }
}
