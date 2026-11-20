import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.Random;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public final class t extends Canvas implements i, Runnable {
   private static int[] aE;
   public static int e = (aE = new int[]{0})[0];
   private static boolean aF;
   private static boolean aG;
   private static int aH;
   private static int aI;
   private static long aJ;
   public static long f;
   public static long g;
   private static long aK = 0L;
   public static long h;
   private static long aL;
   private static int aM;
   public static int i;
   private static int aN;
   private static boolean aO;
   private static boolean aP;
   private static int aQ;
   private static int aR;
   public static a[][] j;
   private static l[] aS = new l[100];
   private static short aT = -1;
   private static short aU = -1;
   private static short[][] aV = new short[400][4];
   private static boolean aW;
   private static boolean aX;
   private static boolean aY = false;
   private static long aZ = -1L;
   private static int ba = Integer.MAX_VALUE;
   private static int bb = 0;
   private static int bc = 0;
   private static int bd = 0;
   private static int be = 0;
   private static int bf = 0;
   private static int bg = 0;
   private static int bh = 0;
   private static int bi = 0;
   private static int bj = 0;
   private static int bk = 0;
   private static int bl = 0;
   private static int bm = 0;
   private static long bn = 0L;
   static long k = 0L;
   public static int l = 0;
   static int m = 0;
   static int n = 0;
   private static int[] bo = new int[12];
   private static int[] bp = new int[12];
   private static int bq = -1;
   private static int br = -1;
   static boolean o = false;
   static int p;
   static int q;
   private static int bs;
   private static int bt;
   private static byte[] bu;
   private static byte[] bv;
   private static byte[] bw;
   static boolean r = true;
   static int s;
   static int t;
   static int u;
   static int v;
   static int[][] w;
   static boolean x;
   static boolean y;
   private static byte[] bx = new byte[]{7, 23, 8, 1, 3, 1, 4, 9};
   private static byte by;
   private static int bz = -1;
   private static int bA;
   private static int bB;
   private static boolean bC;
   private static boolean bD;
   private static boolean bE;
   private static boolean bF = false;
   private static short[][] bG = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
   private static int bH;
   public static int z;
   private static short[] bI = new short[12];
   public static int A = 0;
   private static int bJ = -1;
   private static int bK = -1;
   public static int B = 0;
   private static int bL = -1;
   private static int bM = -1;
   public static int C = 0;
   private static int bN = 0;
   public static int D = 1157627903;
   public static int E = 0;
   public static int F = 3;
   public static int G = 70;
   private static int bO = 16;
   private static boolean bP;
   private static boolean bQ;
   private static boolean bR;
   private static boolean bS;
   private static boolean bT;
   private static boolean bU;
   private static long bV;
   private static long bW = 0L;
   private static long bX = 0L;
   private static int[] bY = new int[100];
   private static int bZ;
   private static v ca = null;
   private static d cb = null;
   private static int[] cc = null;
   private static int cd = 0;
   public static byte H = -1;
   private static boolean ce = true;
   public static boolean I;
   private static int cf = 0;
   private static int cg = 0;
   private static int ch = 0;
   private static int ci = 0;
   private static int cj = 0;
   public static boolean J = true;
   public static int K = -1;
   private static int ck = 1;
   private static int cl = 2;
   private static int cm = 4;
   private static long cn = 0L;
   private static int co;
   private static int cp;
   private static int cq;
   private static int cr;
   private static int cs;
   private static int ct;
   private static int cu;
   private static int cv;
   private static int cw;
   private static int cx;
   private static int cy;
   private static int cz;
   private static int cA;
   private static int cB;
   private static int cC;
   private static int cD;
   private static int cE;
   private static int[] cF = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
   public static boolean L = false;
   public static boolean M = true;
   private static int cG = 0;
   private static boolean cH = false;
   private static int[] cI = new int[5];
   private static int cJ = 0;
   private static int[] cK;
   public static boolean N;
   public static boolean O = true;
   private static boolean cL = true;
   private static boolean cM = true;
   private static boolean cN = true;
   private static String cO = "";
   public static boolean P;
   static r Q;
   static int R = -1;
   private static byte[] cP = new byte[]{1, 4, 3, 6, 5, 7};
   static int S = 100;
   private static int cQ = 50;
   private static int cR = 120;
   private static int[] cS = new int[1];
   private static int[] cT = new int[1];
   private static int[] cU = new int[1];
   private static int cV = 0;
   private static int cW = 250;
   private static boolean cX = false;
   private static boolean cY = false;
   private static boolean cZ = false;
   private static int da = -1;
   private static String db = null;
   private static int dc;
   private static boolean dd;
   private static boolean de;
   private static boolean df;
   private static boolean dg;
   private static long dh;
   private static int di = -1;
   private static int dj = 0;
   private static int dk = -1;
   private static boolean dl = true;
   private static int dm = -1;
   private static int[] dn = new int[300];
   private static int[] do_array = new int[300];
   private static int[] dp = new int[300];
   private static int[] dq = new int[300];
   public static Object[] T = new Object[39];
   private static int[] dr = new int[39];
   private static int[] ds = new int[39];
   private static int dt;
   static int U = 0;
   static int V = 0;
   private static int du = 0;
   static q[] W = new q[400];
   static q[] X = new q[400];
   private static q[] dv = new q[400];
   private static int[] dw = new int[4];
   private static byte dx = 1;
   private static byte dy = 2;
   private static byte dz = 4;
   private static byte dA = 8;
   private static byte[] dB;
   static boolean Y;
   static int Z = 0;
   static q[] aa = new q[40];
   private static short[][][] dC;
   private static short[][][] dD;
   private static short[][] dE;
   static w ab;
   private static w dF;
   public static int ac = 0;
   private static int dG = 0;
   private static String dH = "";
   static String[] ad = new String[]{"", "", "", "", "", "", "", "", "", "", ""};
   private static int dI = 1000;
   private static int dJ = 0;
   private static int[] dK = new int[5];
   private static int[] dL = new int[5];
   private static int dM;
   private static int dN = 0;
   private static int dO = -1;
   private static int dP;
   private static int[][] dQ;
   private static int[][][] dR;
   private static int[][][] dS;
   private static int[][][] dT;
   private static int[] dU = new int[6];
   private static int dV = 0;
   private static boolean dW = false;
   private static int dX = -1;
   private static int[] dY = new int[5];
   private static int[][][][] dZ;
   private static boolean ea = false;
   static d ae = null;
   private static boolean eb = false;
   static q af = null;
   private static int ec = 0;
   private static int ed = 0;
   private static boolean ee = false;
   private static int ef = 0;
   private static int eg = 0;
   private static int eh = 0;
   private static boolean ei = false;
   private static boolean ej = false;
   static short[][][] ag = null;
   private static short[][][] ek = null;
   private static int[] el = null;
   private static short[][] em = null;
   private static String[][] en = null;
   private static boolean[] eo = null;
   private static int ep = -1;
   private static int eq = -1;
   private static a[] er = null;
   private static int es = 66;
   private static int[] et = new int[4];
   private static int[] eu = new int[4];
   private static int[][] ev = new int[][]{{20, 4}, {23, 5}, {84, 3}, {77, 6}, {36, 3}, {83, 3}, {82, 5}, {48, 5}};
   private static int ew = 0;
   private static int[] ex = new int[4];
   private static String ey;
   private static int ez = 0;
   private static int eA;
   private static boolean eB = false;
   private static int[] eC = new int[10];
   private static int[] eD = new int[10];
   private static String[] eE = new String[10];
   private static int[] eF = new int[10];
   private static int[] eG = new int[10];
   private static int[] eH = new int[10];
   private static int eI = 0;
   private static int eJ = 1000;
   private static boolean eK = false;
   private static int eL = 0;
   private static int eM = 0;
   private static int eN = 0;
   private static boolean eO;
   private static boolean eP = false;
   private static boolean eQ = false;
   private static int eR = 0;
   private static int[] eS = new int[]{4, 1, 1, 1, 1};
   private static int eT = -1;
   private static int eU = -1;
   private static int[][] eV;
   private static int[][] eW;
   private static int[][] eX;
   private static int[][] eY;
   private static byte[][] eZ;
   private static int fa = 0;
   private static u fb = new u();
   private static int[] fc = new int[4];
   private static int fd;
   private static int fe;
   private static int ff = 0;
   private static int[] fg;
   private static int[] fh;
   private static boolean fi = false;
   private static byte fj = 0;
   private static int fk = 0;
   private static int fl = 0;
   private static int fm = 0;
   private static int fn = 0;
   private static byte fo = 3;
   private static int fp = 0;
   private static int fq = 0;
   private static int fr = -1;
   private static boolean fs = true;
   private static boolean ft = false;
   private static boolean fu = false;
   private static boolean fv = false;
   private static boolean fw = false;
   private static boolean fx = false;
   private static boolean fy = false;
   private static boolean fz = false;
   private static int fA = 0;
   static int[] ah;
   private static int[][] fB;
   private static int[][] fC;
   private static int fD;
   private static int[][] fE;
   private static boolean fF = false;
   private static short fG = 3000;
   private static int[][] fH;
   private static u fI = new u();
   private static int[] fJ = new int[4];
   private static int fK;
   private static int fL;
   private static int fM = 0;
   private static byte[] fN;
   private static short[] fO;
   private static boolean fP = false;
   private static boolean fQ = true;
   private static u fR = new u();
   private static int[] fS = new int[4];
   private static int fT;
   private static int fU;
   private static int fV = 0;
   private static u fW = new u();
   private static int[] fX = new int[4];
   private static int fY;
   private static int fZ;
   private static int ga = 0;
   private static int gb = 0;
   private static boolean gc;
   private static int[] gd;
   private static int ge = 0;
   private static int gf = 0;
   private static int gg = 0;
   private static int gh = 0;
   private static boolean gi = false;
   private static int gj = -1;
   private static int gk = -1;
   private static int[][] gl;
   private static int[][] gm;
   private static boolean gn;
   private static boolean go = false;
   private static byte[] gp;
   private static int[] gq = new int[350];
   public static r[] ai = new r[50];
   private static boolean gr;
   private static boolean gs;
   private static boolean gt;
   private static boolean gu;
   private static boolean gv;
   private static boolean gw;
   private static boolean gx;
   private static boolean gy;
   private static boolean gz;
   private static boolean gA;
   private static boolean gB;
   private static boolean gC;
   private static boolean gD;
   private static boolean gE;
   private static boolean gF;
   private static boolean gG;
   private static u gH = new u();
   private static int[] gI = new int[4];
   private static int gJ;
   private static int gK;
   private static int gL = 0;
   private static int[][] gM;
   private static u gN = new u();
   private static int[] gO = new int[4];
   private static int gP;
   private static int gQ;
   private static int gR = 0;
   private static int[][] gS;
   private static int[][] gT;
   private static int gU = 0;
   private static int gV = -1;
   private static byte gW;
   private static int gX = -1;
   private static int gY = -1;
   private static boolean gZ = false;
   private static String ha = null;
   private static boolean hb = false;
   private static int[] hc = new int[]{46, 48};
   private static int[] hd = new int[]{7238, 7213};
   private static int[] he = new int[]{23, 49, 23, 50, 23, 51, 23, 52, 23, 68, 21, 12};
   private static int[] hf = new int[]{23, 46, 23, 69, 23, 33, 23, 70, 23, 34, 21, 11};
   private static int[][] hg = new int[][]{hf, he};
   private static int[] hh = new int[]{7232, 7233, 7234, 7235, 7236, 7237};
   private static int[] hi = new int[]{7207, 7208, 7209, 7210, 7211, 7212};
   private static int[][] hj = new int[][]{hh, hi};
   private static boolean hk = false;
   private static int hl;
   private static int hm = -1;
   private static boolean hn = false;
   private static int ho = 0;
   private static int[] hp = new int[5];
   private static boolean hq = true;
   private static String hr = "";
   private static int[][] hs;
   private static int ht = 0;
   private static int hu = 0;
   private static int hv = 0;
   private static int hw = 0;
   private static int hx = 0;
   private static int hy = 0;
   private static int hz = 0;
   private static int hA = 0;
   private static int hB = 0;
   private static int hC = 0;
   private static String hD;
   private static boolean hE = false;
   private static u hF = new u();
   private static int[] hG = new int[4];
   private static int hH;
   private static int hI;
   private static int hJ = 0;
   private static int hK = -1;
   private static boolean hL = false;
   private static String hM = "";
   private static int hN = -1;
   private static boolean hO = false;
   private static int hP = 0;
   private static boolean hQ;
   private static int hR = -1;
   private static w[] hS = new w[]{null, null};
   private static boolean hT = false;
   private static boolean hU = false;
   private static u hV = new u();
   private static int[] hW = new int[4];
   private static int hX;
   private static int hY;
   private static int hZ = 0;
   private static w[] ia;
   private static int[] ib;
   private static int ic = 0;
   private static int id = -1;
   private static int ie = -1;
   private static int if_val = -1;
   private static int ig = -1;
   private static int ih = -1;
   private static int ii = -1;
   private static int ij = -1;
   private static int ik = -1;
   private static int il = -1;
   private static int im = -1;
   private static int in = -1;
   private static int io = -1;
   private static int ip = -1;
   private static int iq = -1;
   private static int ir = -1;
   private static int is = -1;
   private static int[][] it = new int[][]{{9, 9}, {29, 20}, {46, 30}};
   private static boolean iu = false;
   private static int iv = -1;
   private static String iw = "";
   private static String ix = "";
   private static boolean iy;
   private static byte[] iz = null;
   private static String[] iA = null;
   private static byte[] iB = null;
   private static byte[] iC = null;
   private static byte[] iD = null;
   private static int[] iE = null;
   private static byte[] iF = new byte[3];
   private static String[] iG = new String[3];
   private static u iH = new u();
   private static int[] iI = new int[4];
   private static int iJ;
   private static int iK;
   private static int iL = 0;
   private static boolean iM = false;
   private static boolean iN = false;
   private static String iO = "";
   private static u iP = new u();
   private static int[] iQ = new int[4];
   private static int iR = 0;
   private static int iS = -1;
   private static int iT = -1;
   private static boolean iU = false;
   private static int iV = -1;
   private static int[] iW;
   private static int iX = (
      iW = new int[]{
         91,
         62,
         63,
         10,
         90,
         9,
         11,
         7,
         15,
         8,
         92,
         54,
         55,
         71,
         56,
         60,
         53,
         86,
         69,
         97,
         30,
         49,
         2,
         67,
         68,
         50,
         94,
         57,
         1,
         12,
         88,
         23,
         20,
         52,
         22,
         46,
         84,
         21,
         36,
         83,
         82,
         48,
         37,
         47,
         17,
         79,
         78,
         95,
         80,
         61,
         64,
         29,
         74,
         73,
         72,
         65,
         42,
         31,
         93,
         45,
         89,
         18,
         34,
         14,
         3,
         24,
         43,
         77,
         6,
         76,
         5,
         40,
         19,
         4,
         28,
         41,
         13,
         66,
         87,
         96
      }
   ).length;
   private static boolean[] iY = null;
   private static boolean[] iZ = null;
   private static boolean[] ja = null;
   private static int[] jb = null;
   private static int[][] jc = null;
   private static int[] jd = null;
   private static int[] je = null;
   private static int[][] jf;
   private static String[] jg;
   private static String[] jh;
   private static String[] ji;
   private static String jj = null;
   private static String jk = null;
   private static String jl = null;
   private static int jm = -1;
   private static int jn = -1;
   private static int jo;
   private static int jp;
   private static int jq = -1;
   private static int jr = -1;
   private static int js = 0;
   private static q jt = null;
   private static int ju = -1;
   private static int[] jv = new int[30];
   private static int jw = 0;
   private static int jx = 0;
   private static int jy = 0;
   private static int jz = 0;
   private static int jA = 0;
   private static int jB = 0;
   private static int jC = 0;
   private static int jD = 0;
   private static int jE = 0;
   private static int jF = 0;
   private static int jG = 0;
   private static int jH = 0;
   private static int jI = 0;
   private static int jJ = 0;
   static int aj = 0;
   private static int jK = 0;
   private static int jL = 0;
   private static int jM = 0;
   private static int jN = 0;
   private static int jO = 0;
   private static int jP = 0;
   private static int jQ = 0;
   private static int jR = 1;
   private static int jS = 0;
   private static boolean jT = true;
   private static int jU = 0;
   private static boolean jV = false;
   private static boolean jW = false;
   private static d jX;
   private static int jY = 0;
   private static int jZ;
   private static long ka = 0L;
   private static long kb;
   private static long kc;
   private static long kd;
   private static long ke;
   private static long kf;
   public static int ak = -1;
   private static boolean kg = false;
   private static boolean kh = false;
   private static int ki = 0;
   private static boolean kj;
   private static boolean kk = false;
   private static int kl = 5;
   private static boolean km = false;
   private static int kn = 0;
   private static int ko = 0;
   private static int[] kp = new int[4];
   private static boolean kq = false;
   private static int kr = 0;
   private static q ks;
   private static q[] kt;
   private static q ku;
   public static q al;
   private static int kv = 0;
   private static int kw = 0;
   private static int kx = 0;
   private static int ky = 0;
   private static long kz;
   private static int[] kA;
   private static int[] kB = new int[]{-1, -1};
   private static String[] kC = new String[]{"", ""};
   private static int kD;
   private static int[] kE;
   private static boolean kF;
   private static boolean kG;
   private static boolean kH;
   private static boolean kI;
   private static boolean kJ;
   private static int[] kK;
   private static int kL;
   private static int kM;
   private static r[] kN;
   private static r[] kO;
   private static int[] kP;
   private static int[] kQ;
   private static int[][] kR;
   private static int[][] kS;
   private static int kT = -1;
   private static int kU = 0;
   private static int kV = 0;
   private static boolean kW;
   private static d kX;
   private static d kY;
   private static int kZ = 0;
   private static int la = 0;
   private static int lb = 0;
   private static int[] lc;
   private static int ld = 0;
   private static boolean le = false;
   private static int lf;
   private static int lg;
   private static int lh;
   private static boolean li = false;
   private static boolean lj = false;
   private static boolean lk = false;
   private static int ll = 0;
   private static int lm;
   private static int ln = 0;
   private static int lo = 0;
   private static int lp = 0;
   private static boolean lq = true;
   private static boolean lr = true;
   private static int ls = -1;
   private static int lt = 0;
   private static int lu = 0;
   private static int lv = 0;
   private static int lw = 0;
   private static boolean lx;
   private static int ly;
   private static int lz = 7;
   private static s[] lA = new s[15];
   private static s lB = null;
   private static int lC = -1;
   private static boolean lD = false;
   private static boolean lE;
   private static int lF = 0;
   private static boolean lG = true;
   private static boolean lH = false;
   private static boolean lI = true;
   private static boolean lJ = true;
   private static int lK = 1200000;
   private static int lL = 1200000;
   private static int lM = 1200000;
   private static int lN = 1200000;
   private static int lO = 1200000;
   private static int lP = 1200000;
   private static int lQ = 4;
   private static String[][] lR = null;
   private static boolean lS = false;
   private static int lT = 4;
   private static int lU = 4;
   private static boolean lV = false;
   private static String[][] lW = null;
   private static String lX = "0";
   private static String lY = "0";
   private static String lZ = "0";
   private static String ma = "0";
   private static int mb = 0;
   private static int mc = 0;
   private static boolean md = false;
   private static long me;
   private static boolean mf = false;
   private static boolean mg = false;
   private static int mh = 6;
   private static long[][] mi;
   private static boolean mj = false;
   private static s[] mk = new s[10];
   private static int ml = 0;
   private static int mm;
   private static long mn;
   private static int mo;
   private static int mp;
   private static int mq;
   private static int mr;
   private static long ms;
   private static int[] mt = new int[3];
   private static int[] mu = new int[3];
   private static int[] mv = new int[3];
   private static int[] mw = new int[50];
   private static int[] mx = new int[50];
   private static int my = 0;
   private static int[] mz = new int[50];
   private static int mA = 0;
   private static int[] mB = new int[]{10, 16, 24, 36, 54, 82, 124, 188, 285, 433, 658, 1000};
   private static int mC = 0;
   private static int[][] mD = new int[][]{
      {4, 0},
      {4, 1},
      {4, 2},
      {4, 3},
      {4, 4},
      {4, 5},
      {4, 6},
      {4, 7},
      {4, 8},
      {4, 9},
      {4, 10},
      {4, 11},
      {4, 12},
      {4, 13},
      {4, 14},
      {4, 15},
      {4, 16},
      {4, 17},
      {4, 18},
      {4, 19},
      {4, 20},
      {4, 21},
      {4, 22},
      {4, 23},
      {4, 24},
      {4, 25},
      {4, 26},
      {4, 27},
      {4, 28},
      {4, 29},
      {4, 30},
      {4, 31},
      {4, 32},
      {4, 33},
      {4, 34},
      {4, 35},
      {4, 36},
      {4, 37},
      {4, 38},
      {4, 39},
      {4, 40},
      {4, 41},
      {4, 42},
      {4, 43},
      {4, 44},
      {4, 45},
      {4, 46},
      {4, 47},
      {4, 48},
      {4, 49},
      {4, 50},
      {4, 51},
      {4, 52},
      {4, 53},
      {4, 54},
      {4, 55},
      {4, 56},
      {4, 57},
      {4, 58},
      {4, 59},
      {4, 60},
      {4, 61},
      {4, 62},
      {4, 63},
      {4, 64},
      {4, 65},
      {4, 66},
      {4, 67},
      {4, 68},
      {4, 69},
      {4, 70},
      {4, 71},
      {4, 72},
      {4, 73},
      {4, 74},
      {4, 75},
      {4, 76},
      {4, 77},
      {4, 78},
      {4, 79},
      {4, 80},
      {4, 81},
      {4, 82},
      {4, 83},
      {4, 84},
      {4, 85},
      {4, 86},
      {4, 87},
      {4, 88},
      {4, 89},
      {4, 90},
      {4, 91},
      {4, 92},
      {4, 93},
      {4, 94},
      {4, 95},
      {4, 96},
      {4, 97},
      {4, 98},
      {4, 99},
      {4, 100},
      {4, 101},
      {4, 102},
      {4, 103},
      {4, 104},
      {4, 105},
      {4, 106},
      {4, 107},
      {4, 108},
      {4, 109},
      {4, 110},
      {4, 111},
      {4, 112},
      {4, 113},
      {4, 114},
      {4, 115},
      {4, 116},
      {4, 117},
      {4, 118},
      {4, 119},
      {4, 120},
      {4, 121},
      {4, 122},
      {4, 123},
      {4, 124},
      {4, 125},
      {4, 126},
      {4, 127},
      {4, 128},
      {4, 129},
      {4, 130},
      {4, 131},
      {4, 132},
      {4, 133},
      {4, 134},
      {4, 135},
      {4, 136},
      {4, 137},
      {4, 138},
      {4, 139},
      {4, 140},
      {4, 141},
      {4, 142},
      {4, 143},
      {4, 144},
      {4, 145},
      {4, 146},
      {4, 147},
      {4, 148},
      {4, 149},
      {4, 150},
      {4, 151},
      {4, 152},
      {4, 153},
      {4, 154},
      {4, 155},
      {4, 156},
      {4, 157},
      {4, 158},
      {4, 159},
      {4, 160},
      {4, 161},
      {4, 162},
      {4, 163},
      {4, 164},
      {4, 165},
      {4, 166},
      {4, 167},
      {4, 168},
      {4, 169},
      {4, 170},
      {4, 171},
      {4, 172},
      {4, 173},
      {4, 174},
      {4, 175},
      {4, 176},
      {4, 177},
      {4, 178},
      {4, 179},
      {4, 180},
      {4, 181},
      {4, 182},
      {4, 183},
      {4, 184},
      {4, 185},
      {4, 186},
      {4, 187},
      {4, 188},
      {4, 189},
      {4, 190},
      {4, 191},
      {4, 192},
      {4, 193},
      {4, 194},
      {4, 195},
      {4, 196},
      {4, 197},
      {4, 198},
      {4, 199},
      {4, 200},
      {4, 201},
      {4, 202},
      {4, 203},
      {4, 204},
      {4, 205},
      {4, 206},
      {4, 207},
      {4, 208},
      {4, 209},
      {4, 210},
      {4, 211},
      {4, 212},
      {4, 213},
      {4, 214},
      {4, 215},
      {4, 216},
      {4, 217},
      {4, 218},
      {4, 219},
      {4, 220},
      {3, 11}
   };
   private static int[][] mE = new int[][]{
      {3, 35, 63},
      {3, 45, 64},
      {3, 46, 65},
      {3, 47, 66},
      {3, 44, 67},
      {3, 29, 68},
      {3, 9, 69},
      {3, 50, 70},
      {3, 51, 71},
      {3, 37, 72},
      {3, 52, 73},
      {3, 48, 74},
      {3, 49, 75},
      {3, 22, 76},
      {3, 21, 77},
      {3, 20, 78},
      {3, 19, 98},
      {3, 18, 79},
      {3, 17, 80},
      {3, 16, 81},
      {3, 15, 82},
      {3, 28, 84},
      {3, 33, 83},
      {3, 55, 85},
      {3, 56, 86},
      {3, 57, 87},
      {3, 58, 88},
      {3, 59, 89},
      {3, 60, 90},
      {3, 61, 91},
      {3, 62, 94},
      {3, 42, 95},
      {3, 14, 92},
      {3, 13, 96},
      {3, 12, 97},
      {3, 10, 93}
   };
   public static Graphics am = null;
   private static Graphics mF = null;
   static boolean an;
   static int ao;
   private static long mG;
   private static long mH;
   private static boolean mI;
   private static int mJ = 800;
   private static int mK = 480;
   private static Display mL;
   private static boolean mM;
   static MIDlet ap;
   private static int mN = 66;
   private long mO;
   static int aq;
   private static long mP;
   private static int mQ;
   private static int mR;
   static t ar;
   static boolean as = false;
   private static String mS = null;
   private static byte[] mT;
   private static byte[] mU;
   private static int mV;
   private static Hashtable mW;
   private static Hashtable mX;
   private static int mY = 25;
   private static Random mZ;
   static int at;
   static int au;
   private static int[] na;
   private static int[] nb;
   static final int av = 64;
   private static int nc = 128;
   private static int nd = 192;
   private static int ne = 256;
   private static String nf;
   private static InputStream ng;
   private static int nh;
   private static byte[] ni;
   private static int nj;
   private static int nk;
   private static short nl;
   private static int[] nm;
   private static short nn;
   private static short[] no;
   private static int np;
   static int aw;
   private static byte[] nq;
   private static byte[][] nr;
   private static long ns;
   private static int nt = 0;
   private static InputStream nu;
   private static int nv = 0;
   private static char[] nw = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   private static int[] nx;
   private static boolean ny;
   private static String nz = "UTF-8";
   private static int[] nA;
   private static byte[][] nB;
   private static int[] nC;
   private static int[][] nD;
   private static String[][] nE;
   private static RecordStore nF;
   private static int nG;
   private static int[] nH;
   private static int[][] nI;
   private static l[] nJ;
   static int ax = 0;
   static int[][] ay = null;
   static boolean az;
   private static int nK;
   private static int nL;
   static int aA;
   static int aB;
   static int aC;
   static int aD;
   private static int nM = 0;
   private static int nN;
   private static int nO;
   private static int nP;
   private static int nQ;
   private static int nR;
   private static int nS;
   private static int nT;
   private static int nU;
   private static boolean nV;
   private static boolean nW;
   private static boolean nX;
   private static final char[] nY = new char[]{
      'A',
      'B',
      'C',
      'D',
      'E',
      'F',
      'G',
      'H',
      'I',
      'J',
      'K',
      'L',
      'M',
      'N',
      'O',
      'P',
      'Q',
      'R',
      'S',
      'T',
      'U',
      'V',
      'W',
      'X',
      'Y',
      'Z',
      'a',
      'b',
      'c',
      'd',
      'e',
      'f',
      'g',
      'h',
      'i',
      'j',
      'k',
      'l',
      'm',
      'n',
      'o',
      'p',
      'q',
      'r',
      's',
      't',
      'u',
      'v',
      'w',
      'x',
      'y',
      'z',
      '0',
      '1',
      '2',
      '3',
      '4',
      '5',
      '6',
      '7',
      '8',
      '9',
      '+',
      '/'
   };
   private static int[] nZ;
   private static long oa = 0L;
   private static int ob = 1;
   private static int oc = 2;
   private static int[][] od;
   private static final char[][] oe = new char[][]{
      {'\u0003', 'ﺀ'},
      {'\u0001', 'ﺁ'},
      {'\u0001', 'ﺃ'},
      {'\u0001', 'ﺅ'},
      {'\u0001', 'ﺇ'},
      {'\u0002', 'ﺉ'},
      {'\u0001', 'ﺍ'},
      {'\u0002', 'ﺏ'},
      {'\u0001', 'ﺓ'},
      {'\u0002', 'ﺕ'},
      {'\u0002', 'ﺙ'},
      {'\u0002', 'ﺝ'},
      {'\u0002', 'ﺡ'},
      {'\u0002', 'ﺥ'},
      {'\u0001', 'ﺩ'},
      {'\u0001', 'ﺫ'},
      {'\u0001', 'ﺭ'},
      {'\u0001', 'ﺯ'},
      {'\u0002', 'ﺱ'},
      {'\u0002', 'ﺵ'},
      {'\u0002', 'ﺹ'},
      {'\u0002', 'ﺽ'},
      {'\u0002', 'ﻁ'},
      {'\u0002', 'ﻅ'},
      {'\u0002', 'ﻉ'},
      {'\u0002', 'ﻍ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0004', '\u0000'},
      {'\u0002', 'ﻑ'},
      {'\u0002', 'ﻕ'},
      {'\u0002', 'ﻙ'},
      {'\u0002', 'ﻝ'},
      {'\u0002', 'ﻡ'},
      {'\u0002', 'ﻥ'},
      {'\u0002', 'ﻩ'},
      {'\u0001', 'ﻭ'},
      {'\u0001', 'ﻯ'},
      {'\u0002', 'ﻱ'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0005', '\u0000'},
      {'\u0001', 'ﭐ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﭦ'},
      {'\u0002', 'ﭞ'},
      {'\u0002', 'ﭒ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﭖ'},
      {'\u0002', 'ﭢ'},
      {'\u0002', 'ﭚ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﭶ'},
      {'\u0002', 'ﭲ'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﭺ'},
      {'\u0002', 'ﭾ'},
      {'\u0001', 'ﮈ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0001', 'ﮄ'},
      {'\u0001', 'ﮂ'},
      {'\u0001', 'ﮆ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0001', 'ﮌ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0001', 'ﮊ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﭪ'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﭮ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﮎ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﯓ'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﮒ'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﮚ'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﮖ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0001', 'ﮞ'},
      {'\u0002', 'ﮠ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0002', 'ﮪ'},
      {'\u0003', '\u0000'},
      {'\u0001', 'ﮤ'},
      {'\u0002', 'ﮦ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0001', 'ﯠ'},
      {'\u0001', 'ﯙ'},
      {'\u0001', 'ﯗ'},
      {'\u0001', 'ﯛ'},
      {'\u0001', 'ﯢ'},
      {'\u0003', '\u0000'},
      {'\u0001', 'ﯞ'},
      {'\u0002', 'ﯼ'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0003', '\u0000'},
      {'\u0001', 'ﮮ'}
   };
   private static final int of = 1569 + oe.length - 1;

   t(Object var1, Object var2) {
      super();
      ar = this;
      ao = -1;
      mM = true;
      ap = (MIDlet)var1;
      mL = (Display)var2;
      this.ea();
      mX = new Hashtable();
      (mW = new Hashtable()).put(new Integer(48), new Integer(6));
      mW.put(new Integer(49), new Integer(7));
      mW.put(new Integer(50), new Integer(1));
      mW.put(new Integer(51), new Integer(9));
      mW.put(new Integer(52), new Integer(3));
      mW.put(new Integer(53), new Integer(5));
      mW.put(new Integer(54), new Integer(4));
      mW.put(new Integer(55), new Integer(13));
      mW.put(new Integer(56), new Integer(2));
      mW.put(new Integer(57), new Integer(15));
      mW.put(new Integer(35), new Integer(17));
      mW.put(new Integer(42), new Integer(16));
      mW.put(new Integer(-6), new Integer(18));
      mW.put(new Integer(-7), new Integer(19));
      mW.put(new Integer(-8), new Integer(24));
      mX.put(new Integer(-5), new Integer(5));
      mX.put(new Integer(-1), new Integer(1));
      mX.put(new Integer(-2), new Integer(2));
      mX.put(new Integer(-3), new Integer(3));
      mX.put(new Integer(-4), new Integer(4));
      mP = System.currentTimeMillis();
      this.mO = mP;
      i = 0;
      aM = -1;
      aN = -1;
      aO = false;
      aP = true;
      aQ = 0;
      aR = 0;
      f = System.currentTimeMillis();
      g = 0L;
      h = 0L;
      aL = 0L;
   }

   public final void hideNotify() {
      M();
      aT();
      bP();
      kc = 0L;
      kb = 0L;
      kf = 0L;
      ke = 0L;

      try {
         if (F()) {
            b(false);
         }
      } catch (Exception var1) {
      }

      this.N(5);
   }

   public final void showNotify() {
      this.N();
      aT();
      bP();
      this.N(2);
      this.N(4);
   }

   private static void M(int var0) {
      aN = var0;
      aO = true;
   }

   private void N(int var1) {
      try {
         if (var1 == 0 && (i == 0 || i == 3 || i == 4 || i == 10 || i == 8 || i == 9) && O(d.l())) {
            boolean var4 = false;
            d.e(0);
         }

         switch (i) {
            case 0:
               if ((var1 = var1) == 0) {
                  nz = "UTF-8";
                  (j = new a[5][])[0] = new a[8];
                  j[1] = new a[65];
                  j[2] = new a[2];
                  j[3] = new a[100];
                  j[4] = new a[242];
                  ei();
                  a.g();
                  a.h(0, 100);
                  a.h(1, 100);
                  a.h(2, 250);
                  a.h(3, 600);
                  ah();
                  j.a(GloftPDMP.b, GloftPDMP.a);
                  aF = false;
                  ei();
                  String var78;
                  if ((var78 = ap.getAppProperty("URL-SUPPORT")) != null && !(var78 = var78.trim()).equals("0") && !var78.equals("")) {
                     jV = true;
                  }
               }

               if (var1 == 1) {
                  by = 0;
                  bz = 1;
                  M(3);
               }

               if (var1 == 4) {
                  aF = false;
               }

               if (var1 == 5) {
                  aF = true;
               }

               return;
            case 1:
               if ((var1 = var1) == 0) {
                  q(1, 0);
                  q(1, 1);
                  q(1, 21);
                  q(1, 23);
                  aX = true;
                  aW = true;
               }

               if (var1 == 1 && aR > 2500) {
                  by = 1;
                  bz = 5;
                  jW = true;
                  M(3);
               }

               if (var1 == 2) {
                  am.setColor(0);
                  int var93 = c.b;
                  int var90 = c.a;
                  c(am, 0, 0, var90, var93);
                  j[1][0].a(am, 0, 0, 0, 0);
               }

               if (var1 == 3) {
                  r(1, 0);
               }

               if (var1 == 4) {
                  aF = false;
               }

               if (var1 == 5) {
                  aF = true;
               }

               return;
            case 2:
            case 7:
            case 12:
            case 16:
            case 17:
            default:
               new StringBuffer().append("State [").append(i).append("] is undefined. Message sent was: ").append(var1).toString();
               Object var77 = null;
               return;
            case 3:
               int var41 = var1;
               t var27 = this;
               if (var41 == 0) {
                  jX = null;
                  if (j[1][23] != null) {
                     (jX = new d()).a(j[1][23]);
                     jX.a(1, -1);
                     d var85 = jX;
                     jX.a = 107;
                     var85.b = 440;
                  }

                  if (by >= 0 && by < 8) {
                     bD = false;
                     bC = true;
                     bA = 0;
                     bB = bx[by];
                     jY = 0;
                  }

                  q(1, 1);
                  if (er != null) {
                     f(1, 3, true);
                  }
               }

               if (var41 == 1) {
                  if (dc()) {
                     aV();
                     cT();
                  }

                  if (by != -1) {
                     new Date().getTime();
                     R(bA);
                     new Date().getTime();
                     if (++bA >= bB) {
                        bD = true;
                     }
                  }

                  cZ();
                  if (jY > 0) {
                     jY = jY - aq;
                     f(1, 4, (System.currentTimeMillis() & 512L) != 0L);
                  }

                  if (bC && bD) {
                     if (bz != 4 && bz != 1 && bz != 9) {
                        if (!v(28)) {
                           boolean var74 = false;
                           b(28, true, false);
                        }

                        o(1, 2, 100);
                        if (bz != -1) {
                           f(1, 3, false);
                           aI();
                        }
                     } else if (bz != -1) {
                        aI();
                     }

                     if (q.ac != null) {
                        q.ae = 0;

                        for (int var75 = 0; var75 < q.ac.length && q.ac[var75] != null; var75++) {
                           q.ae++;
                        }
                     }
                  }
               }

               if (var41 == 2) {
                  if (bz == 1) {
                     j[1][0].a(am, 0, 0, 0, 0);
                  } else {
                     if (er != null) {
                        av(1);
                        int var76 = bA * 100 / bB;
                        o(1, 2, var76);
                        i(1, 0, 0);
                        cV();
                     } else if (bz != -1) {
                        int var92 = c.b;
                        int var89 = c.a;
                        c(am, 0, 0, var89, var92);
                        j[1][1].a(am, 0, 0, 0, 0);
                     }

                     if (jX != null) {
                        jX.g();
                     }
                  }
               }

               if (var41 == 3) {
                  d.k();
                  by = -1;
                  r(1, 0);
                  r(1, 1);
               }

               if (var41 == 4) {
                  aF = false;
                  var27.N(2);
               }

               if (var41 == 5) {
                  aF = true;
               }

               return;
            case 4:
               if ((var1 = var1) == 0) {
                  boolean var72 = false;
                  b(28, true, false);
               }

               if (var1 == 1) {
                  o(1, 2, 100);
                  f(1, 3, (System.currentTimeMillis() & 512L) != 0L);
                  f(1, 3, false);
                  by = 1;
                  M(3);
               }

               if (var1 == 2) {
                  cV();
               }

               if (var1 == 3) {
                  boolean var73 = false;
                  b(64, false, false);
               }

               if (var1 == 4) {
                  aF = false;
               }

               if (var1 == 5) {
                  aF = true;
               }

               return;
            case 5:
               if ((var1 = var1) == 0) {
                  r(1, 0);
                  r(1, 1);
                  if (lS) {
                     lS = false;
                     d(0, u(351));
                  }

                  boolean var69 = false;
                  b(64, true, false);
                  b(22, true, false);
                  b(79, false, false);
                  if (aM == 15) {
                     b(67, true, false);
                     b(67, true, false);
                     b(22, true, false);
                  }

                  if (M && q.am == 0) {
                     boolean var38 = false;
                     b(68, true, true);
                  }

                  M = true;
                  l(44, 0);
                  l(43, 0);
                  bL();
                  b(13, -1, -1, -1);
                  kc = 0L;
                  if (aM == 6) {
                     kc = -1L;
                  }

                  kb = 0L;
                  kf = -1L;
                  ke = 0L;
                  cf = 0;
                  ce = true;
                  if (aM == 6 || aM == 10 || aM == 15) {
                     aH();
                  }

                  if (!F() || bF) {
                     ab.e[37] = dg();
                     ab.e[38] = dh();
                     ab.e[39] = di();
                  }

                  if (F()) {
                     b(69, true, false);
                  }

                  if (!F() && aM == 16) {
                     aZ(13352, 13336);
                  }

                  jZ = 1;
                  bV = 0L;
                  bW = 0L;
                  bX = 0L;
               }

               if (var1 == 1) {
                  kd = kd + aq;
                  if (mI) {
                     if (ka != 0L) {
                        g = g + (System.currentTimeMillis() - ka);
                     }

                     bP();
                     if (!v(25) && !v(41) && !v(8)) {
                        s(false);
                     }
                  }

                  ka = mH;
                  if (!kg && !iu && !v(27) && !v(25) && !v(23)) {
                     dj();
                     dk();
                  }

                  aS();
                  ce = true;
                  aN();
                  if (iy) {
                     iy = false;
                     s(false);
                  }
               }

               if (var1 == 2) {
                  String var39 = "RENDER";
                  if (!bP) {
                     if (ce && bQ) {
                        aM();
                     } else {
                        d.a(am, 0, 0, 0);
                     }
                  }

                  if (!z() && aO() && !kg && !v(73) && C > 0) {
                     if (cb == null) {
                        (cb = new d()).a(j[1][54]);
                        cb.a(0, -1);
                        d var88 = cb;
                        cb.a = 80;
                        var88.b = 120;
                     }

                     cb.c(aq);
                     cb.g();
                  }

                  cV();
                  boolean var70 = false;
                  if (nO != 3 && bU) {
                     q.Q();
                     bN();
                  }

                  var39 = "RENDER";
                  if (jW && F()) {
                     jW = false;
                     if (m.b()) {
                        a("Cash", true, 1);
                     }
                  }
               }

               if (var1 == 3) {
                  boolean var71 = false;
                  b(64, false, false);
                  b(68, false, false);
                  b(70, false, false);
                  b(73, false, false);
                  dx();
               }

               if (var1 == 4) {
                  aF = false;
                  if (!v(25) && !v(41) && !v(8)) {
                     s(false);
                  }
               }

               if (var1 == 5) {
                  aF = true;
               }

               return;
            case 6:
               if ((var1 = var1) == 0) {
                  bb();
                  Date var36;
                  long var66 = (var36 = new Date()).getTime();
                  int var51 = a(var36);
                  long var97;
                  long var101 = (var97 = var66 / 1000L / 60L) - ms;
                  if (var51 == mm && var101 > 2880L || var101 > 10080L) {
                     mr = var51;
                     ms = var97;
                     dW();
                     dX();
                  }

                  long var98;
                  var101 = (var98 = var97) - mn;
                  if (var51 != mm || var101 > 2880L) {
                     ml++;
                     mm = var51;
                     mn = var98;
                     mo = 0;
                     if (!dU()) {
                        dV();
                     }

                     int var37 = n(0, my);
                     mw[mx[var37]] = 0;
                     mp = mx[var37];
                     mq = bB(ml);
                     dX();
                  }

                  if (mC > 0) {
                     mC = 0;
                     dY();
                  }

                  cQ();
                  cS();
                  aT();
                  boolean var67 = false;
                  b(22, true, false);
                  b(64, true, false);
                  b(76, true, false);
                  kk = true;
                  kl = 5;
                  kq = true;
                  lq = true;
                  bL();
                  b(13, -1, -1, -1);
                  if (aM == 5) {
                     a(60);
                  }
               }

               if (var1 == 1) {
                  aV();
                  if (mI) {
                     s(false);
                     bP();
                     kk = true;
                  }

                  boolean var68 = false;
                  if (nO == 1 || nO == 2) {
                     kk = true;
                     if (!F()) {
                        kq = true;
                     }

                     kl = 5;
                  } else if (nO == 3) {
                     if (!F()) {
                        kq = true;
                     }

                     kk = true;
                  }

                  if (cZ) {
                     kk = true;
                     kq = true;
                     lq = true;
                  }

                  if (!kg && !iu) {
                     dk();
                  }

                  cT();
                  cU();
                  bH();
                  bM();
               }

               if (var1 == 2) {
                  if (!kk) {
                     if (!v(25) && !v(21) && !v(24) && !v(3) && !v(5) && !v(20)) {
                        if (eT == 4) {
                           k(10, 160, 190, 50);
                           h(3, 1, false);
                           cV();
                           h(3, 1, true);
                           bQ();
                        }

                        fc[0] = 0;
                        fc[1] = 0;
                        fc[2] = 0;
                        fc[3] = 0;
                        k(110, 57, 700, 41);
                        h(3, 1, false);
                        cV();
                        h(3, 1, true);
                        bQ();
                        if (eT == 0) {
                           k(110, 164, 700, 41);
                           h(3, 1, false);
                           cV();
                           h(3, 1, true);
                           bQ();
                           fc[0] = 0;
                           fc[1] = 383;
                           fc[2] = 800;
                           fc[3] = 58;
                           h(3, 1, false);
                           cV();
                           h(3, 1, true);
                           bQ();
                        }

                        fc[0] = ag[13][9][2];
                        fc[1] = ag[13][9][3];
                        fc[2] = ag[13][9][5];
                        fc[3] = ag[13][9][6];
                     }
                  } else {
                     if (km && !lq) {
                        k(fc[0], fc[1], fc[2], fc[3]);
                        h(3, 1, false);
                     } else {
                        h(3, 1, true);
                     }

                     if (!F()) {
                        if (!kq) {
                           k(kp[0], kp[1], kp[2], kp[3]);
                           fc[0] = kp[0];
                           fc[1] = kp[1];
                           fc[2] = kp[2];
                           fc[3] = kp[3];
                        } else {
                           k(0, 0, 800, 480);
                        }
                     }

                     cV();
                     bQ();
                     if (!kq) {
                        fc[0] = ag[13][9][2];
                        fc[1] = ag[13][9][3];
                        fc[2] = ag[13][9][5];
                        fc[3] = ag[13][9][6];
                     }

                     if (kl > 0) {
                        kl--;
                     } else {
                        if (!v(24)) {
                           kk = false;
                        }

                        kq = false;
                     }

                     km = false;
                  }

                  bN();
               }

               if (var1 == 3) {
                  eR = 0;
                  bZ();
               }

               if (var1 == 4) {
                  aF = false;
                  kk = true;
                  if (!F()) {
                     kq = true;
                  }

                  s(false);
               }

               if (var1 == 5) {
                  aF = true;
               }

               return;
            case 8:
               if ((var1 = var1) == 0) {
                  boolean var65 = false;
                  b(38, true, false);
               }

               if (var1 == 1) {
                  aV();
                  cT();
                  cU();
               }

               if (var1 == 2) {
                  cV();
               }

               if (var1 == 4) {
                  s(false);
               }

               return;
            case 9:
               if (mI) {
                  var1 = 4;
               }

               if (var1 == 0) {
                  if (iy) {
                     iy = false;
                     r(false);
                  }

                  if (!dF()) {
                     mg = true;
                  }

                  if (kj) {
                     kj = false;
                     aF = true;
                     boolean var60 = false;
                     b(42, true, false);
                  } else {
                     if (dF()) {
                        aY();
                     }

                     dm();
                     b(13, -1, -1, -1);
                  }

                  lq = true;
                  lr = true;
               }

               if (var1 == 1) {
                  aV();
                  if (!lD && !kj) {
                     dt();
                     a();
                  }

                  cT();
                  cU();
                  bH();
                  bM();
               }

               if (var1 == 2) {
                  if (!kj) {
                     short var31 = 0;
                     if (lr) {
                        am = d.m[0][0];
                        j[1][3].a(am, 0, lm, -1, 0);
                        int var61 = j[1][3].b(0);
                        j[1][3].a(am, 0, lm - var61, -1, 0);
                        i(21, 0, 0);
                        am = null;
                        b((Graphics)null);
                        lr = false;
                     }

                     if (lE && !dF()) {
                        j[1][3].a(am, 0, lm, -1, 0);
                        int var62 = j[1][3].b(0);
                        j[1][3].a(am, 0, lm - var62, -1, 0);
                        i(21, 0, 0);
                     } else {
                        a(am, d.l[0][0], 0, 0, false);
                     }

                     if (!lE) {
                        var31 = (byte)0;
                        if (ln == 1 && lp < 0) {
                           if ((System.currentTimeMillis() & 64L) != 0L) {
                              var31 = (byte)10;
                           } else {
                              var31 = (byte)-10;
                           }
                        }

                        if (kF) {
                           int var86 = ks.aw;
                           int var44 = ks.av;
                           d var82 = kY;
                           kY.a = var44;
                           var82.b = var86;
                           kY.g();
                        }

                        ks.ag.k(ks.av - var31, ks.aw - var31);
                     }

                     if (kX != null) {
                        kX.g();
                     }

                     var31 = (byte)0;
                     if (ln == 2 && lp < 0) {
                        if ((System.currentTimeMillis() & 64L) != 0L) {
                           var31 = (byte)10;
                        } else {
                           var31 = (byte)-10;
                        }
                     }

                     if (!kF) {
                        int var9 = ku.aw;
                        int var6 = ku.av;
                        d var8 = kY;
                        kY.a = var6;
                        var8.b = var9;
                        kY.g();
                     }

                     ku.ag.k(ku.av + var31, ku.aw + var31);
                     if (al != null) {
                        al.b();
                     }

                     if (lj) {
                        short var13 = ag[37][63][5];
                        short var14 = ag[37][63][6];
                        short var15 = ag[37][63][2];
                        var31 = ag[37][63][3];
                        am.setColor(-65536);
                        short var91 = var13;
                        short var87 = var15;
                        c(am, var15, var31, var13, var14);
                        int var45 = b(2, ks.ag.ar, 114);
                        int var63 = b(2, ks.ag.ar, 113);
                        int var83 = b(2, ks.ag.ar, 116);
                        int var84 = b(2, ks.ag.ar, 115);
                        var45 = var45 * var14 / 100;
                        int var12 = var63 * var14 / 100 - var45;
                        am.setColor(-870400);
                        int var10002 = var31 + var14 - (var45 + var12);
                        short var94 = var13;
                        var45 = var10002;
                        short var64 = var15;
                        c(am, var87, var45, var91, var12);
                        var45 = var83 * var14 / 100;
                        var12 = var84 * var14 / 100 - var45;
                        am.setColor(-16743936);
                        var45 = var31 + var14 - (var45 + var12);
                        var31 = null;
                        c(am, var64, var45, var94, var12);
                     }

                     cV();
                     if (li && !v(9)) {
                        short var50 = ag[37][63][2];
                        short var96 = ag[37][63][3];
                        short var99 = ag[37][63][6];
                        if (!lk || (System.currentTimeMillis() & 512L) != 0L) {
                           int var100 = lf * var99 / 100;
                           if (lf <= 100) {
                              j[1][5].a(am, 36, var50 - 4, var96 + var99 - var100, 0);
                           }
                        }
                     }

                     q.n();
                     dQ();
                     dy();
                     bN();
                  } else {
                     cV();
                  }
               }

               if (var1 == 3) {
                  q.af[z][4] = new q[h.a[4]];
                  aF = false;
               }

               if (var1 == 4 && !dE() && !v(41) && !v(40) && !v(39)) {
                  r(false);
               }

               return;
            case 10:
               if ((var1 = var1) == 0 && !lD) {
                  switch (lC) {
                     case 2:
                        if (kT == 2) {
                           M(15);
                        } else {
                           M(8);
                        }
                  }
               }

               if (var1 == 1) {
                  aV();
                  cT();
                  cU();
                  cZ();
                  if (!lD) {
                     ;
                  }
               }

               if (var1 == 2 && lD) {
                  cV();
               }

               if (var1 == 3) {
                  M = true;
                  switch (lC) {
                     case 0:
                        b(43, 0, -1, -1);
                        break;
                     case 1:
                        b(42, -1, -1, -1);
                  }
               }

               if (var1 == 4) {
                  aF = false;
               }

               if (var1 == 5) {
                  aF = true;
               }

               return;
            case 11:
               if ((var1 = var1) == 0) {
                  boolean var57 = false;
                  b(22, true, false);
                  b(64, true, false);
                  if (M) {
                     boolean var2 = false;
                     b(68, true, true);
                  }

                  M = true;
                  b(13, -1, -1, -1);
                  if ((var57 = b(39, c(z), -1, -1)) && !dE()) {
                     var57 = false;
                  }

                  kc = 0L;
                  if (aM == 6) {
                     kc = -1L;
                  }

                  kb = 0L;
                  kf = 0L;
                  ke = 0L;
                  if (z != 11 && !dE() && !var57) {
                     int var81 = n(0, 5);
                     int var43 = 3072 + 5 * c(z) + var81;
                     b(1, u(var43), 53);
                     fs = false;
                     String var30 = u(var43);
                     a(8, 2, var30, false);
                  }

                  cf = 0;
                  ce = true;
                  m(hD);
                  cV = n(hD);
                  if (dG()) {
                     b(69, false, false);
                  } else {
                     b(69, true, false);
                  }

                  if (iy) {
                     s(false);
                  }

                  jZ = 1;
                  bV = 0L;
                  bW = 0L;
                  bX = 0L;
               }

               if (var1 == 1) {
                  kd = kd + aq;
                  if (mI && !v(25)) {
                     s(false);
                  }

                  if (!kg && !v(27) && !v(25) && !v(23)) {
                     dj();
                     dk();
                  }

                  aS();
                  ce = true;
                  aN();
                  aC();
                  ce = true;
               }

               if (var1 == 2) {
                  if (ce) {
                     aM();
                  }

                  if (z != 0) {
                     cV();
                  }

                  q.Q();
                  bN();
               }

               if (var1 == 3) {
                  boolean var59 = false;
                  b(64, false, false);
                  b(68, false, false);
                  b(70, false, false);
                  b(73, false, false);
                  iy = false;
               }

               if (var1 == 4) {
                  aF = false;
                  if (!v(25)) {
                     s(false);
                  }
               }

               if (var1 == 5) {
                  aF = true;
               }

               return;
            case 13:
               if ((var1 = var1) == 0) {
                  r(2, 0);
                  r(2, 1);
                  d.n();
                  if (aM == 11) {
                     iy = true;
                  } else {
                     bA();
                     ay();
                  }

                  j.a(u(4));
               }

               if (var1 == 1) {
                  boolean var56 = false;
                  int var5 = nP;
                  int var3 = nQ;
                  int var7 = var5;
                  var5 = mK - var3;
                  var3 = var7;
                  if (nO == 1) {
                     j.b(var5, var3);
                  } else if (nO == 2) {
                     j.a(var5, var3);
                  } else if (nO == 3) {
                     j.c(var5, var3);
                  }

                  if (j.a(0)) {
                     eK = false;
                     iy = true;
                     if (aM == 11) {
                        bz = 11;
                        dz();
                     } else {
                        by = 1;
                        if (aM == 9) {
                           bz = 9;
                        } else {
                           bz = 5;
                        }

                        M(3);
                     }
                  }
               }

               if (var1 == 2) {
                  j.a(am);
               }

               if (var1 == 4) {
                  aF = false;
                  j.a(false);
               }

               if (var1 == 5) {
                  aF = true;
                  j.a(true);
               }

               return;
            case 14:
               if ((var1 = var1) == 0) {
                  cQ();
                  cS();
                  aT();
                  boolean var54 = false;
                  b(64, true, false);
                  dC();
                  hD = "facebook:0";
                  b(51, true, false);
                  bf();
                  bc();
                  b(13, -1, -1, -1);
               }

               if (var1 == 1) {
                  aV();
                  cT();
                  cU();
                  switch (lQ) {
                     case 8:
                        boolean var55 = false;
                        b(48, true, false);
                     case 6:
                     case 7:
                     case 9:
                     case 10:
                     case 11:
                     case 12:
                     case 13:
                     case 14:
                     case 15:
                     case 16:
                     case 17:
                     case 18:
                     default:
                        bH();
                        bM();
                        aC();
                  }
               }

               if (var1 == 2) {
                  cV();
                  bN();
               }

               if (var1 == 3) {
                  bg();
                  bd();
               }

               if (var1 == 4) {
                  aF = false;
               }

               if (var1 == 5) {
                  aF = true;
               }

               return;
            case 15:
               if ((var1 = var1) == 0) {
                  cQ();
                  cS();
                  aT();
                  boolean var53 = false;
                  b(64, true, false);
                  b(36, true, false);
                  bf();
                  bc();
                  b(13, -1, -1, -1);
               }

               if (var1 == 1) {
                  aV();
                  cT();
                  cU();
                  aC();
                  bH();
               }

               if (var1 == 2) {
                  cV();
                  bN();
               }

               if (var1 == 3) {
                  bg();
                  bd();
               }

               if (var1 == 4) {
                  aF = false;
                  s(false);
               }

               if (var1 == 5) {
                  aF = true;
               }

               return;
            case 18:
               if ((var1 = var1) == 0) {
                  boolean var52 = false;
                  b(27, true, false);
               }

               if (var1 == 1) {
                  aV();
                  cT();
                  cU();
               }

               if (var1 == 2) {
                  cV();
               }
         }
      } catch (Exception var16) {
      }
   }

   private static void ag() {
      for (int var0 = 0; var0 < 4; var0++) {
         a.i(var0);
      }
   }

   private static void ah() {
      aT = 0;
      aU = 0;
   }

   private static void a(byte var0, int var1) {
      for (int var2 = aT; var2 < aU; var2++) {
         if (aV[var2][0] == var0 && aV[var2][1] == var1) {
            return;
         }
      }

      aU++;
      aV[aU - 1][0] = var0;
      aV[aU - 1][1] = (short)var1;
      aV[aU - 1][2] = a(var0, (short)var1);
      aV[aU - 1][3] = -1;
   }

   private static void ai() {
      for (int var0 = aT; var0 < aU; var0++) {
         if (jX != null) {
            jX.c(aq);
         }

         int var1 = var0;
         f(aV[var1][0], aV[var1][1], aV[var1][2]);
         if (++aT == aU) {
            ah();
         }
      }
   }

   private static byte a(byte var0, short var1) {
      byte var2 = 3;
      if (a(k.b[var0], var1)) {
         var2 = 0;
      } else if (a(k.c[var0], var1)) {
         var2 = 1;
      } else if (a(k.d[var0], var1)) {
         var2 = 2;
      }

      return var2;
   }

   private static void q(int var0, int var1) {
      f(var0, var1, a((byte)var0, (short)var1));
   }

   private static boolean f(int var0, int var1, int var2) {
      if (!k.c_[var0].equals(nf)) {
         v(true);
         b(k.c_[var0]);
      }

      if (j[var0][var1] != null) {
         return true;
      }

      a var3;
      (var3 = new a()).a(B(var1));
      int var4 = var3.b;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      var4--;
      int var9 = 0;

      boolean var10000;
      while (true) {
         if (var9 >= mD.length) {
            var10000 = false;
            break;
         }

         if (mD[var9][0] == var0 && mD[var9][1] == var1) {
            var10000 = true;
            break;
         }

         var9++;
      }

      if (var10000) {
         var3.f();
      }

      if (var2 == 1) {
         var5 = true;
         var6 = true;
      }

      if (var2 == 3) {
         var6 = true;
         var8 = true;
      }

      if (var2 == 2) {
         var7 = true;
      }

      if (var6 && var8 && var0 == 3) {
         var8 = false;
      }

      if (var5) {
         var3.e();
      }

      for (int var10 = 0; var10 <= var4; var10++) {
         if (var6) {
            var3.n(var10);
         }
      }

      if (var7) {
         if (var0 == 0) {
            var3.j(0);
         } else if (var0 == 1) {
            var3.j(1);
         } else if (var0 == 4) {
            var3.j(3);
         } else {
            var3.j(2);
         }
      }

      if (var6 && var8) {
         var3.b();
      }

      j[var0][var1] = var3;
      return true;
   }

   private static void r(int var0, int var1) {
      if (j[var0][var1] != null) {
         j[var0][var1].a();
         j[var0][var1] = null;
      }
   }

   private static void aj() {
      for (int var0 = 0; var0 < 4; var0++) {
         for (int var1 = 0; var1 < a.g[var0].length; var1++) {
            int var2 = a.g[var0][var1];
            a.g[var0][var1] = -1;
            if (a.h[var0][var1] != null) {
               a.h[var0][var1].i(var2 >> 10, var2 & 1023);
               a.h[var0][var1] = null;
            }
         }
      }
   }

   private static boolean ak() {
      try {
         return d.g(0) && 26 == d.l();
      } catch (Exception var0) {
         return false;
      }
   }

   public static boolean a() {
      try {
         return d.g(0);
      } catch (Exception var0) {
         return false;
      }
   }

   private static boolean O(int var0) {
      return var0 == 23
         || var0 == 2
         || var0 == 3
         || var0 == 4
         || var0 == 5
         || var0 == 6
         || var0 == 7
         || var0 == 8
         || var0 == 9
         || var0 == 10
         || var0 == 11
         || var0 == 12
         || var0 == 13
         || var0 == 14
         || var0 == 15
         || var0 == 16
         || var0 == 17
         || var0 == 18
         || var0 == 19
         || var0 == 20
         || var0 == 21
         || var0 == 22
         || var0 == 26
         || var0 == 24
         || var0 == 25
         || var0 == 1;
   }

   public static void a(int var0) {
      if (var0 >= 0 && var0 < 183) {
         if (aX || !O(var0)) {
            if (!aW) {
               boolean var1 = false;
               if (!O(var0)) {
                  return;
               }
            }

            new StringBuffer().append("Channel selected: ").append(0).toString();
            Object var3 = null;

            try {
               label64:
               if (d.g(0)) {
                  if (var0 != d.l()) {
                     var3 = var0;
                     var3 += 92;
                     if (var3 != d.l()) {
                        break label64;
                     }
                  }

                  return;
               }

               if (d.g(0) && aZ == d.l() && Q(var0) >= Q((int)aZ)) {
                  return;
               }
            } catch (Exception var2) {
            }

            if (var0 == aZ) {
               var3 = false;
               if (var0 >= 24 && var0 <= 90) {
                  var3 = var0;
                  var3 += 92;
                  var0 = (int)var3;
               }
            }

            aZ = var0;
            d.a(var0, O(var0) ? ab.e[42] : ab.e[41], Q(var0));
         }
      }
   }

   private static boolean P(int var0) {
      for (int var1 = 0; var1 <= 0; var1++) {
         if (a() && d.l() == var0) {
            return true;
         }
      }

      return false;
   }

   public static boolean b() {
      for (int var0 = 0; var0 <= 0; var0++) {
         if (a() && O(d.l())) {
            return true;
         }
      }

      return false;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public static boolean c() {
      int var0;
      try {
         var0 = 0;
      } catch (IndexOutOfBoundsException var4) {
         return false;
      }

      while (true) {
         int var1;
         try {
            if (var0 > 0) {
               break;
            }

            var1 = 0;
         } catch (IndexOutOfBoundsException var3) {
            break;
         }

         while (true) {
            label34: {
               try {
                  int var2 = var0;
                  if (var1 < d.i[var2]) {
                     if (32 != d.b(var0, 5 * var1 + 1)) {
                        break label34;
                     }

                     return true;
                  }
               } catch (IndexOutOfBoundsException var5) {
                  return false;
               }

               var0++;
               break;
            }

            var1++;
         }
      }

      return false;
   }

   public static void d() {
      for (int var0 = 0; var0 <= 0; var0++) {
         if (a() && d.l() == 25) {
            d.e(0);
         }
      }
   }

   private static void al() {
      try {
         if (d.g(0) && O(d.l())) {
            d.k();
         }
      } catch (Exception var0) {
      }
   }

   public static void e() {
      d.e(0);
   }

   public static void f() {
      d.k();
   }

   public static void g() {
      if (aY) {
         ef();
      }
   }

   private static int Q(int var0) {
      switch (var0) {
         case -1:
            return ba;
         case 0:
            return 1;
         case 1:
            return 1;
         case 2:
            return 1;
         case 3:
            return 1;
         case 4:
            return 1;
         case 5:
            return 1;
         case 6:
            return 1;
         case 7:
            return 1;
         case 8:
            return 1;
         case 9:
            return 1;
         case 10:
            return 1;
         case 11:
            return 1;
         case 12:
            return 1;
         case 13:
            return 1;
         case 14:
            return 1;
         case 15:
            return 1;
         case 16:
            return 1;
         case 17:
            return 1;
         case 18:
            return 1;
         case 19:
            return 1;
         case 20:
            return 1;
         case 21:
            return 1;
         case 22:
            return 1;
         case 23:
            return 1;
         case 24:
            return ba;
         case 25:
            return 1;
         case 26:
            return 1;
         case 27:
            return 1;
         case 28:
            return 4;
         case 29:
            return 5;
         case 30:
            return 3;
         case 31:
            return ba;
         case 32:
            return 5;
         case 33:
            return 1;
         case 34:
            return 4;
         case 35:
            return ba;
         case 36:
            return 4;
         case 37:
            return ba;
         case 38:
            return 3;
         case 39:
            return 5;
         case 40:
            return 5;
         case 41:
            return 5;
         case 42:
            return ba;
         case 43:
            return ba;
         case 44:
            return ba;
         case 45:
            return ba;
         case 46:
            return ba;
         case 47:
            return ba;
         case 48:
            return ba;
         case 49:
            return ba;
         case 50:
            return ba;
         case 51:
            return 4;
         case 52:
            return ba;
         case 53:
            return ba;
         case 54:
            return ba;
         case 55:
            return ba;
         case 56:
            return ba;
         case 57:
            return ba;
         case 58:
            return ba;
         case 59:
            return 3;
         case 60:
            return 4;
         case 61:
            return 4;
         case 62:
            return 4;
         case 63:
            return 5;
         case 64:
            return ba;
         case 65:
            return ba;
         case 66:
            return ba;
         case 67:
            return ba;
         case 68:
            return 4;
         case 69:
            return 3;
         case 70:
            return ba;
         case 71:
            return ba;
         case 72:
            return 3;
         case 73:
            return 4;
         case 74:
            return 4;
         case 75:
            return 4;
         case 76:
            return 4;
         case 77:
            return 3;
         case 78:
            return 5;
         case 79:
            return 5;
         case 80:
            return 5;
         case 81:
            return 3;
         case 82:
            return 3;
         case 83:
            return 3;
         case 84:
            return 3;
         case 85:
            return 3;
         case 86:
            return 3;
         case 87:
            return 3;
         case 88:
            return 5;
         case 89:
            return 4;
         case 90:
            return 4;
         case 91:
            return ba;
         case 92:
            return 1;
         case 93:
            return 1;
         case 94:
            return 1;
         case 95:
            return 1;
         case 96:
            return 1;
         case 97:
            return 1;
         case 98:
            return 1;
         case 99:
            return 1;
         case 100:
            return 1;
         case 101:
            return 1;
         case 102:
            return 1;
         case 103:
            return 1;
         case 104:
            return 1;
         case 105:
            return 1;
         case 106:
            return 1;
         case 107:
            return 1;
         case 108:
            return 1;
         case 109:
            return 1;
         case 110:
            return 1;
         case 111:
            return 1;
         case 112:
            return 1;
         case 113:
            return 1;
         case 114:
            return 1;
         case 115:
            return 1;
         case 116:
            return ba;
         case 117:
            return 1;
         case 118:
            return 1;
         case 119:
            return 1;
         case 120:
            return 4;
         case 121:
            return 5;
         case 122:
            return 3;
         case 123:
            return ba;
         case 124:
            return 5;
         case 125:
            return 1;
         case 126:
            return 4;
         case 127:
            return ba;
         case 128:
            return 4;
         case 129:
            return ba;
         case 130:
            return 3;
         case 131:
            return 5;
         case 132:
            return 5;
         case 133:
            return 5;
         case 134:
            return ba;
         case 135:
            return ba;
         case 136:
            return ba;
         case 137:
            return ba;
         case 138:
            return ba;
         case 139:
            return ba;
         case 140:
            return ba;
         case 141:
            return ba;
         case 142:
            return ba;
         case 143:
            return 4;
         case 144:
            return ba;
         case 145:
            return ba;
         case 146:
            return ba;
         case 147:
            return ba;
         case 148:
            return ba;
         case 149:
            return ba;
         case 150:
            return ba;
         case 151:
            return 3;
         case 152:
            return 4;
         case 153:
            return 4;
         case 154:
            return 4;
         case 155:
            return 5;
         case 156:
            return ba;
         case 157:
            return ba;
         case 158:
            return ba;
         case 159:
            return ba;
         case 160:
            return 4;
         case 161:
            return 3;
         case 162:
            return ba;
         case 163:
            return ba;
         case 164:
            return 3;
         case 165:
            return 4;
         case 166:
            return 4;
         case 167:
            return 4;
         case 168:
            return 4;
         case 169:
            return 3;
         case 170:
            return 5;
         case 171:
            return 5;
         case 172:
            return 5;
         case 173:
            return 3;
         case 174:
            return 3;
         case 175:
            return 3;
         case 176:
            return 3;
         case 177:
            return 3;
         case 178:
            return 3;
         case 179:
            return 3;
         case 180:
            return 5;
         case 181:
            return 4;
         case 182:
            return 4;
         default:
            return ba;
      }
   }

   private static void am() {
      String var0 = "SOCIAL";
      byte[] var1;
      a(var1 = new byte[17], 0, (byte)cV);
      a(var1, 1, bl);
      a(var1, 5, bm);
      Date var2 = new Date();
      a(var1, 9, var2.getTime());

      try {
         a(var0, var1);
      } catch (Exception var3) {
      }
   }

   private static void an() {
      byte[] var0 = new byte[15];
      int var1 = ao();
      a(var0, 0, var1);
      var0[7] = (byte)(aY ? 1 : 0);
      var0[8] = (byte)(md ? 1 : 0);
      var0[10] = (byte)z;
      var0[13] = (byte)bj;
      var0[14] = (byte)bk;

      try {
         a("RMSHeader", var0);
      } catch (RecordStoreException var2) {
      }

      ay();
      az();
   }

   private static int ao() {
      String var0 = GloftPDMP.b.getAppProperty("MIDlet-Version");
      int[] var1 = new int[3];
      int var2 = 0;

      for (int var3 = 0; var3 < var0.length(); var3++) {
         char var4;
         if ((var4 = var0.charAt(var3)) >= '0' && var4 <= '9') {
            var1[var2] = var1[var2] * 10 + (var4 - '0');
         } else if (var4 == '.') {
            var2++;
         }
      }

      return 0 | var1[0] << 8 | var1[1] << 16 | var1[2] << 24;
   }

   private static void a(long var0, long var2) {
      g += var0 - var2;
      if (var0 - var2 > 2147000000L) {
         ab.e[12] = 0;
         ab.e[13] = 0;
         ab.e[14] = 0;
         ab.e[15] = 0;
         ab.e[19] = 0;
         if (mi != null) {
            dL();
            return;
         }
      } else {
         ab.e[12] = (int)(ab.e[12] - (var0 - var2));
         ab.e[14] = (int)(ab.e[14] + (var0 - var2));
         ab.e[15] = (int)(ab.e[15] - (var0 - var2));
         ab.e[13] = (int)(ab.e[13] - (var0 - var2));
         ab.e[19] = (int)(ab.e[19] - (var0 - var2));
      }
   }

   private static void ap() {
      byte[] var4;
      if ((var4 = s("Tree")) != null) {
         g = (ab = w.a(var4)).e[11] * 1000;
      }

      byte[] var0;
      if ((var0 = s("RealTime")) != null && !bF) {
         Date var1;
         long var41 = (var1 = new Date()).getTime();
         h = e(var0, 0);
         aL = var41;
         if (!aG) {
            long var8;
            long var10 = (var8 = e(var0, 8) / 1000L) / 60L;
            if (var8 > 1L) {
               var10++;
            }

            int var14 = ab.e[33];
            int var25 = a(var1);
            int var15 = var14;
            long var12 = var10;
            mj = false;
            if (!F()) {
               Date var10000 = new Date();
               Object var16 = null;
               var16 = a(var10000);
               ab.e[33] = (int)var16;
               j();
               ax();
            } else if (var15 + 1 == var25 && var12 < 2880L) {
               mj = true;
               if (ab.e[32] >= 5) {
                  ab.e[32] = 0;
               }
            } else if (var15 == var25 && var12 < 1440L) {
               mj = false;
            } else {
               ab.e[32] = 0;
               mj = true;
            }

            ab.e[17]--;
         } else {
            ax();
         }
      } else {
         long var6;
         h = var6 = new Date().getTime();
         aL = var6;
         ax();
      }

      if ((var4 = s("TreeQuest")) != null) {
         dF = w.a(var4);
      }

      av();
      byte[] var5;
      if ((var5 = s("ACHIEVEMENTS")) != null) {
         c(var5);
      }

      ar();
      at();
      aE();
      byte[] var3;
      if ((var3 = s("SOCIAL")) != null) {
         cV = var3[0];
         bl = c(var3, 1);
         bm = c(var3, 5);
         bn = e(var3, 9);
         Date var34 = new Date();
         if (bl > 0) {
            bl = (int)(bl - (var34.getTime() - bn));
         }

         if (bm > 0) {
            bm = (int)(bm - (var34.getTime() - bn));
         }
      }

      var4 = s("PN_TOKENS");
      boolean var18 = false;
      if (var4 != null && F() && !bF) {
         int var19;
         byte[] var26 = new byte[var19 = c(var4, 0)];
         b(var4, 4, var26);
         lX = new String(var26);
         int var35 = var19 + 4;
         int var20 = c(var4, var35);
         int var36 = var35 + 4;
         var26 = new byte[var20];
         b(var4, var36, var26);
         lY = new String(var26);
         int var37 = var36 + var20;
         int var21 = c(var4, var37);
         int var38 = var37 + 4;
         var26 = new byte[var21];
         b(var4, var38, var26);
         lZ = new String(var26);
         int var39 = var38 + var21;
         int var22 = c(var4, var39);
         int var40 = var39 + 4;
         var26 = new byte[var22];
         b(var4, var40, var26);
         ma = new String(var26);
      } else {
         lX = "0";
         lY = "0";
         lZ = "0";
         ma = "0";
      }

      dJ();
      dZ();
      Date var45 = new Date();
      Calendar var23 = null;
      long var46 = k = var45.getTime();
      long var33 = h;
      long var2 = var46;
      var23 = Calendar.getInstance();
      Calendar var30 = Calendar.getInstance();
      Date var42 = new Date(var2);
      Date var7 = new Date(var33);
      var23.setTime(var42);
      var30.setTime(var7);
      new StringBuffer().append("-------------------- _currentDate = ").append(var2).toString();
      new StringBuffer().append("-------------------- _lastDate = ").append(var33).toString();
      new StringBuffer().append("-------------------- calLastDay.get(java.util.Calendar.DAY_OF_WEEK) + 1 = ").append(var30.get(7) + 1).toString();
      new StringBuffer().append("-------------------- calToday.get(java.util.Calendar.DAY_OF_WEEK) = ").append(var23.get(7)).toString();
      long var43 = var33 / 86400000L;
      long var44;
      if ((var44 = var2 / 86400000L) == var43 + 1L) {
         jR++;
      } else if (var44 != var43) {
         jR = 1;
      }

      a(k, h);
   }

   private static void aq() {
      aX = true;
      aW = true;
      aY = false;
      (ab = new w()).d = 0;
      ab.e = new int[44];
      ab.e[0] = w.a(ab, 0) + 1;
      ab.e[1] = ab.e[2] = 100000;
      ab.e[3] = ab.e[4] = 10000;
      ab.e[5] = ab.e[6] = 10000;
      ab.e[8] = ab.e[9] = 0;
      ab.e[7] = 1;
      ab.e[11] = (int)(g / 1000L);
      ab.e[10] = 0;
      ab.e[20] = -1;
      ab.e[26] = 0;
      ab.e[27] = 0;
      ab.e[28] = 0;
      ab.e[29] = 0;
      ab.e[30] = 0;
      Date var0 = new Date();
      ab.e[33] = a(var0);
      ab.e[41] = 100;
      ab.e[42] = 100;
      ab.c = 0;
      cj = 0;
      j();
      (dF = new w()).d = 5;
      dF.e = new int[837];
      dF.c = 0;
      az();
      z = 0;
   }

   static void b(int var0) {
      gp[var0] = 1;
      bf++;
   }

   private static void ar() {
      byte[] var0 = s("DRAGONENCYCLOPEDIA");
      int var1 = 0;
      if (var0 != null && F() && !bF) {
         boolean var3 = false;
         gp = new byte[var0[0]];

         for (int var2 = 0; var2 < gp.length; var2++) {
            gp[var2] = var0[++var1];
         }
      } else {
         gp = new byte[50];

         for (int var4 = 0; var4 < gp.length; var4++) {
            gp[var4] = 0;
         }
      }
   }

   private static void as() {
      bi++;
   }

   private static void at() {
      byte[] var0 = s("INBOXMSG");
      int var1 = 0;
      if (var0 != null && F() && !bF) {
         int var2;
         if ((var2 = c(var0, 0)) == 0) {
            lR = null;
         } else {
            lR = new String[var2][];
            var1 += 4;

            for (int var20 = 0; var20 < lR.length; var20++) {
               lR[var20] = new String[7];
               int var3 = var0[var1];
               byte[] var4;
               (var4 = new byte[1])[0] = (byte)var3;
               lR[var20][0] = new String(var4);
               var3 = c(var0, ++var1);
               var1 += 4;
               var4 = new byte[var3];
               b(var0, var1, var4);
               lR[var20][1] = new String(var4);
               var1 += var3;
               var3 = c(var0, var1);
               var1 += 4;
               var4 = new byte[var3];
               b(var0, var1, var4);

               try {
                  lR[var20][2] = new String(var4, "UTF-8");
               } catch (Exception var6) {
                  lR[var20][2] = "";
               }

               var1 += var3;
               var3 = c(var0, var1);
               var1 += 4;
               var4 = new byte[var3];
               b(var0, var1, var4);
               lR[var20][3] = new String(var4);
               var1 += var3;
               var3 = c(var0, var1);
               var1 += 4;
               var4 = new byte[var3];
               b(var0, var1, var4);
               lR[var20][4] = new String(var4);
               var1 += var3;
               var3 = c(var0, var1);
               var1 += 4;
               var4 = new byte[var3];
               b(var0, var1, var4);

               try {
                  lR[var20][5] = new String(var4, "UTF-8");
               } catch (Exception var5) {
                  lR[var20][5] = "";
               }

               var1 += var3;
               var3 = c(var0, var1);
               var1 += 4;
               var4 = new byte[var3];
               b(var0, var1, var4);
               lR[var20][6] = new String(var4);
               var1 += var3;
            }
         }
      } else {
         lR = null;
      }
   }

   private static void au() {
      byte[] var0 = s("TERRAIN");
      int var1 = 0;
      if (var0 != null && !bF && F()) {
         w = new int[c(var0, 0)][];

         for (int var2 = 0; var2 < w.length; var2++) {
            var1 += 4;
            int var3 = c(var0, var1);
            w[var2] = new int[var3];

            for (int var7 = 0; var7 < w[var2].length; var7++) {
               var1 += 4;
               w[var2][var7] = c(var0, var1);
            }
         }

         var1 += 4;
         cd = c(var0, var1);
         var1 += 4;
         cc = new int[c(var0, var1)];

         for (int var6 = 0; var6 < cc.length; var6++) {
            var1 += 4;
            cc[var6] = c(var0, var1);
         }
      }

      by();
      d.o();
   }

   static void h() {
      if (z == 0) {
         String var0 = "TERRAIN";
         int var1 = 1;

         for (int var2 = 0; var2 < w.length; var2++) {
            var1 += w[var2].length;

            for (int var3 = 0; var3 < w[var2].length; var3++) {
               var1++;
            }
         }

         var1++;
         byte[] var8 = new byte[++var1 + cc.length << 2];
         int var9 = 0;
         a(var8, 0, w.length);

         for (int var12 = 0; var12 < w.length; var12++) {
            var9 += 4;
            a(var8, var9, w[var12].length);

            for (int var4 = 0; var4 < w[var12].length; var4++) {
               var9 += 4;
               a(var8, var9, w[var12][var4]);
            }
         }

         var9 += 4;
         a(var8, var9, cd);
         var9 += 4;
         a(var8, var9, cc.length);

         for (int var13 = 0; var13 < cc.length; var13++) {
            var9 += 4;
            a(var8, var9, cc[var13]);
         }

         try {
            a(var0, var8);
            return;
         } catch (RecordStoreException var5) {
         }
      }
   }

   public static void i() {
      bg++;
   }

   private static void av() {
      byte[] var0 = s("SHOPACHIEVEMENT");
      int var1 = 0;
      if (var0 != null && F() && !bF) {
         boolean var4 = false;
         eZ = new byte[var0[0]][];

         for (int var2 = 0; var2 < eZ.length; var2++) {
            eZ[var2] = new byte[var0[++var1]];

            for (int var3 = 0; var3 < eZ[var2].length; var3++) {
               eZ[var2][var3] = var0[++var1];
            }
         }
      } else {
         (eZ = new byte[4][])[0] = new byte[50];
         eZ[1] = new byte[7];
         eZ[2] = new byte[17];
         eZ[3] = new byte[6];

         for (int var5 = 0; var5 < eZ.length; var5++) {
            for (int var6 = 0; var6 < eZ[var5].length; var6++) {
               eZ[var5][var6] = 0;
            }
         }
      }
   }

   private static void aw() {
      be++;
   }

   private static void ax() {
      String var0 = "RealTime";
      byte[] var1 = new byte[24];
      long var2 = new Date().getTime();
      a(var1, 0, var2);
      a(var1, 8, var2 - aL);

      try {
         a(var0, var1);
      } catch (RecordStoreException var4) {
      }
   }

   private static void ay() {
      String var0 = "Tree";
      ab.e[11] = (int)(g / 1000L);
      byte[] var1 = w.a(ab);

      try {
         a(var0, var1);
      } catch (RecordStoreException var2) {
      }

      ax();
   }

   private static void az() {
      String var0 = "TreeQuest";
      byte[] var1 = w.a(dF);

      try {
         a(var0, var1);
      } catch (RecordStoreException var2) {
      }
   }

   public static void j() {
      bb++;
   }

   private static void aA() {
      bd++;
   }

   public static void k() {
      b(true);
   }

   private static void b(boolean var0) {
      l = 16777215;
      an();
      if (q.am == 1 && var0) {
         q.s();
      } else if (q.am == 2 && var0) {
         q.q();
      }

      bA();
      ay();
      az();
      int var10000 = 92 + (jv.length << 2);
      boolean var4 = false;
      byte[] var2;
      int var3 = a(var2 = new byte[var10000], 0, jx);
      var3 = a(var2, var3, jy);
      var3 = a(var2, var3, jz);
      var3 = a(var2, var3, jA);
      var3 = a(var2, var3, jB);
      var3 = a(var2, var3, jC);
      var3 = a(var2, var3, jD);
      var3 = a(var2, var3, jE);
      var3 = a(var2, var3, jF);
      var3 = a(var2, var3, jG);
      var3 = a(var2, var3, jH);
      var3 = a(var2, var3, jI);
      var3 = a(var2, var3, jJ);
      var3 = a(var2, var3, aj);
      var3 = a(var2, var3, jK);
      var3 = a(var2, var3, jL);
      var3 = a(var2, var3, jM);
      var3 = a(var2, var3, jN);
      var3 = a(var2, var3, jO);
      var3 = a(var2, var3, jP);
      var3 = a(var2, var3, jQ);
      var3 = a(var2, var3, jR);
      var3 = a(var2, var3, jS);

      for (int var5 = 0; var5 < jv.length; var5++) {
         var3 = a(var2, var3, jv[var5]);
      }

      byte[] var16 = var2;
      String var1 = "ACHIEVEMENTS";

      try {
         a(var1, var16);
      } catch (RecordStoreException var15) {
      }

      String var17 = "SHOPACHIEVEMENT";
      int var28 = 1;

      for (int var70 = 0; var70 < eZ.length; var70++) {
         var28 += eZ[var70].length;

         for (int var93 = 0; var93 < eZ[var70].length; var93++) {
            var28++;
         }
      }

      byte[] var22 = new byte[var28];
      var3 = 0;
      a(var22, 0, (byte)eZ.length);

      for (int var94 = 0; var94 < eZ.length; var94++) {
         a(var22, ++var3, (byte)eZ[var94].length);

         for (int var101 = 0; var101 < eZ[var94].length; var101++) {
            a(var22, ++var3, eZ[var94][var101]);
         }
      }

      try {
         a(var17, var22);
      } catch (RecordStoreException var14) {
      }

      String var18 = "DRAGONENCYCLOPEDIA";
      int var29 = 1;

      for (int var72 = 0; var72 < gp.length; var72++) {
         var29++;
      }

      byte[] var23 = new byte[var29];
      var3 = 0;
      a(var23, 0, (byte)gp.length);

      for (int var95 = 0; var95 < gp.length; var95++) {
         a(var23, ++var3, gp[var95]);
      }

      try {
         a(var18, var23);
      } catch (RecordStoreException var13) {
      }

      h();
      String var19 = "INBOXMSG";
      byte[] var24;
      if (lR == null) {
         a(var24 = new byte[4], 0, 0);
      } else {
         int var30 = 4;

         for (int var74 = 0; var74 < lR.length; var74++) {
            int var32 = ++var30 + 4;
            int var33 = var32 + lR[var74][1].length();
            int var34 = var33 + 4;

            try {
               byte[] var96 = lR[var74][2].getBytes("UTF-8");
               var34 += var96.length;
            } catch (Exception var12) {
               var34++;
            }

            int var35 = var34 + 4;
            int var36 = var35 + lR[var74][3].length();
            int var37 = var36 + 4;
            int var38 = var37 + lR[var74][4].length();
            int var39 = var38 + 4;

            try {
               byte[] var97 = lR[var74][5].getBytes("UTF-8");
               var39 += var97.length;
            } catch (Exception var11) {
               var39++;
            }

            int var40 = var39 + 4;
            var30 = var40 + lR[var74][6].length();
         }

         var24 = new byte[var30];
         int var75 = 0;
         a(var24, 0, lR.length);
         var75 += 4;

         for (int var98 = 0; var98 < lR.length; var98++) {
            a(var24, var75, (byte)lR[var98][0].charAt(0));
            a(var24, ++var75, lR[var98][1].length());
            var75 += 4;
            a(var24, var75, lR[var98][1].getBytes());
            var75 += lR[var98][1].length();
            a(var24, var75, lR[var98][2].length());
            var75 += 4;
            a(var24, var75, lR[var98][2].getBytes());
            var75 += lR[var98][2].length();

            try {
               lR[var98][2].getBytes("UTF-8");
            } catch (Exception var10) {
               byte[] var102 = new byte[]{32};
            }

            a(var24, var75, lR[var98][3].length());
            var75 += 4;
            a(var24, var75, lR[var98][3].getBytes());
            var75 += lR[var98][3].length();
            a(var24, var75, lR[var98][4].length());
            var75 += 4;
            a(var24, var75, lR[var98][4].getBytes());
            var75 += lR[var98][4].length();

            try {
               lR[var98][5].getBytes("UTF-8");
            } catch (Exception var9) {
               byte[] var103 = new byte[]{32};
            }

            a(var24, var75, lR[var98][5].length());
            var75 += 4;
            a(var24, var75, lR[var98][5].getBytes());
            var75 += lR[var98][5].length();
            a(var24, var75, lR[var98][6].length());
            var75 += 4;
            a(var24, var75, lR[var98][6].getBytes());
            var75 += lR[var98][6].length();
         }
      }

      try {
         a(var19, var24);
      } catch (RecordStoreException var8) {
      }

      aD();
      String var20 = "PN_TOKENS";
      byte[] var25;
      a(var25 = new byte[16 + lX.length() + lY.length() + lZ.length() + ma.length()], 0, lX.length());
      a(var25, 4, lX.getBytes());
      int var41 = 4 + lX.length();
      a(var25, var41, lY.length());
      int var42 = var41 + 4;
      a(var25, var42, lY.getBytes());
      int var43 = var42 + lY.length();
      a(var25, var43, lZ.length());
      int var44 = var43 + 4;
      a(var25, var44, lZ.getBytes());
      int var45 = var44 + lZ.length();
      a(var25, var45, ma.length());
      int var46 = var45 + 4;
      a(var25, var46, ma.getBytes());
      ma.length();

      try {
         a(var20, var25);
      } catch (RecordStoreException var7) {
      }

      String var21 = "PN_DRAGONTOKENS";
      int var26 = 4;
      if (lW == null) {
         a(var2 = new byte[4], 0, 0);
      } else {
         int var89 = 0;

         for (int var99 = 0; var99 < lW.length; var99++) {
            int var27 = var26 + 4;
            var26 = var27 + 4;
            if (lW[var99][1] != null) {
               var26 += lW[var99][1].length();
            }
         }

         a(var2 = new byte[var26], 0, lW.length);
         var89 += 4;

         for (int var100 = 0; var100 < lW.length; var100++) {
            a(var2, var89, Integer.parseInt(lW[var100][0]));
            var89 += 4;
            if (lW[var100][1] != null) {
               a(var2, var89, lW[var100][1].length());
               var89 += 4;
               a(var2, var89, lW[var100][1].getBytes());
               var89 += lW[var100][1].length();
            } else {
               a(var2, var89, 0);
               var89 += 4;
            }
         }
      }

      try {
         a(var21, var2);
      } catch (RecordStoreException var6) {
      }

      dY();
      bZ();
      am();
   }

   private static void c(byte[] var0) {
      int var1 = 0;
      if (var0 != null && F() && !bF) {
         jx = c(var0, 0);
         var1 += 4;
         jy = c(var0, 4);
         var1 += 4;
         jz = c(var0, 8);
         var1 += 4;
         jA = c(var0, 12);
         var1 += 4;
         jB = c(var0, 16);
         var1 += 4;
         jC = c(var0, 20);
         var1 += 4;
         jD = c(var0, 24);
         var1 += 4;
         jE = c(var0, 28);
         var1 += 4;
         jF = c(var0, 32);
         var1 += 4;
         jG = c(var0, 36);
         var1 += 4;
         jH = c(var0, 40);
         var1 += 4;
         jI = c(var0, 44);
         var1 += 4;
         jJ = c(var0, 48);
         var1 += 4;
         aj = c(var0, 52);
         var1 += 4;
         jK = c(var0, 56);
         var1 += 4;
         jL = c(var0, 60);
         var1 += 4;
         jM = c(var0, 64);
         var1 += 4;
         jN = c(var0, 68);
         var1 += 4;
         jO = c(var0, 72);
         var1 += 4;
         jP = c(var0, 76);
         var1 += 4;
         jQ = c(var0, 80);
         var1 += 4;
         jR = c(var0, 84);
         var1 += 4;
         jS = c(var0, 88);
         var1 += 4;

         for (int var2 = 0; var2 < jv.length; var2++) {
            jv[var2] = c(var0, var1);
            var1 += 4;
         }
      } else {
         jx = 0;
         jy = 0;
         jz = 0;
         jA = 0;
         jB = 0;
         jC = 0;
         jD = 0;
         jE = 0;
         jF = 0;
         jG = 0;
         jH = 0;
         jI = 0;
         jJ = 0;
         aj = 0;
         jK = 0;
         jL = 0;
         jM = 0;
         jN = 0;
         jO = 0;
         jP = 0;
         jQ = 0;
         jR = 1;
         jS = 0;
         jw = 0;

         for (int var3 = 0; var3 < jv.length; var3++) {
            jv[var3] = -1;
         }

         de();
      }
   }

   private static void aB() {
      bh++;
   }

   private static void aC() {
      if (bh > 0) {
         bh = 0;
         aD();
      }
   }

   private static void aD() {
      String var0 = "CREDENTIALTIMES";
      byte[] var1;
      if (mi == null) {
         a(var1 = new byte[4], 0, 0);
      } else {
         int var6 = 4;

         for (int var2 = 0; var2 < mi.length; var2++) {
            int var7 = var6 + 4;
            var6 = var7 + 8 * mi[var2].length;
         }

         var1 = new byte[var6];
         int var8 = 0;
         a(var1, 0, mi.length);
         var8 += 4;

         for (int var3 = 0; var3 < mi.length; var3++) {
            a(var1, var8, mi[var3].length);
            var8 += 4;

            for (int var4 = 0; var4 < mi[var3].length; var4++) {
               a(var1, var8, mi[var3][var4]);
               var8 += 8;
            }
         }
      }

      try {
         a(var0, var1);
      } catch (RecordStoreException var5) {
      }
   }

   private static void aE() {
      byte[] var0;
      if ((var0 = s("CREDENTIALTIMES")) != null) {
         int var2 = 0;
         long[][] var1;
         if (var0 != null && F() && !bF) {
            int var6;
            if ((var6 = c(var0, 0)) == 0) {
               var1 = null;
            } else {
               var1 = new long[var6][];
               var2 += 4;

               for (int var3 = 0; var3 < var1.length; var3++) {
                  var1[var3] = new long[c(var0, var2)];
                  var2 += 4;

                  for (int var4 = 0; var4 < var1[var3].length; var4++) {
                     var1[var3][var4] = e(var0, var2);
                     var2 += 8;
                  }
               }
            }
         } else {
            var1 = null;
         }

         mi = var1;
         long var8 = new Date().getTime();
         if (mi != null) {
            for (int var5 = 0; var5 < mi.length; var5++) {
               mi[var5][1] = mi[var5][1] - (var8 - h);
               mi[var5][2] = mi[var5][2] - (var8 - h);
               mi[var5][3] = mi[var5][3] - (var8 - h);
               mi[var5][4] = mi[var5][4] - (var8 - h);
            }
         }
      }
   }

   private static void aF() {
      d.c(96, 48);
      switch (z) {
         case 0:
         case 11:
            bu = B(0);
            bv = B(1);
            bw = B(2);
            d.a(bv, bu, bw, j[2][0], 1);
            break;
         case 1:
            bu = B(3);
            bv = B(4);
            bw = B(5);
            d.a(bv, bu, bw, j[2][0], 1);
            break;
         case 2:
            bu = B(6);
            bv = B(8);
            bw = B(7);
            d.a(bv, bu, bw, j[2][0], 1);
            break;
         case 3:
            bu = B(9);
            bv = B(11);
            bw = B(10);
            d.a(bv, bu, bw, j[2][0], 1);
            break;
         case 4:
            bu = B(12);
            bv = B(14);
            bw = B(13);
            d.a(bv, bu, bw, j[2][0], 1);
            break;
         case 5:
            bu = B(15);
            bv = B(17);
            bw = B(16);
            d.a(bv, bu, bw, j[2][0], 1);
            break;
         case 6:
            bu = B(18);
            bv = B(20);
            bw = B(19);
            d.a(bv, bu, bw, j[2][0], 1);
            break;
         case 7:
            bu = B(21);
            bv = B(23);
            bw = B(22);
            d.a(bv, bu, bw, j[2][0], 1);
            break;
         case 8:
            bu = B(24);
            bv = B(26);
            bw = B(25);
            d.a(bv, bu, bw, j[2][0], 1);
            break;
         case 9:
            bu = B(27);
            bv = B(29);
            bw = B(28);
            d.a(bv, bu, bw, j[2][0], 1);
            break;
         case 10:
            bu = B(30);
            bv = B(32);
            bw = B(31);
            d.a(bv, bu, bw, j[2][0], 1);
      }

      p = d.k[0][5];
      q = d.k[0][6];
      bs = d.k[0][2];
      bt = d.k[0][3];
      v = u = bs;
      w = new int[u][v];
      s = u * 48;
      t = 576;
      new StringBuffer().append("Load MAP width:").append(p).append(",height:").append(q).toString();
      if (z == 0 || z == 11) {
         bx();
      }
   }

   private static void aG() {
      q(2, 0);
      q(2, 1);
   }

   private static void aH() {
      if (i != 10 && i != 15) {
         if (o) {
            d.a(d.k[0][13], d.h(0), mJ + 96 << 1, mK + 48 << 1);
         } else {
            d.a(d.k[0][13], d.h(0), mJ + 96, mK + 48);
         }

         bw();
         bz();
      }
   }

   private static boolean a(short var0) {
      return a(bG[3], var0);
   }

   private static void aI() {
      if (bz != -1) {
         M(bz);
         bC = false;
         bz = -1;
      }
   }

   private static void R(int var0) {
      if (jX != null) {
         jX.c(aq);
      }

      if (by == 1) {
         switch (var0) {
            case 0:
               a[] var169 = j[1];
               Object var46 = null;
               er = var169;
               ag = new short[99][][];
               ek = new short[99][][];
               el = new int[99];
               em = new short[99][];
               en = new String[99][];
               eo = new boolean[99];

               for (int var63 = 0; var63 < 99; var63++) {
                  ag[var63] = null;
                  ek[var63] = null;
                  el[var63] = mR - 1;
                  em[var63] = null;
                  en[var63] = null;
                  eo[var63] = false;
               }

               b("/5");

               for (int var47 = 0; var47 < 99; var47++) {
                  int var64 = var47;
                  byte[] var74 = B(var47);
                  int var82 = 0;
                  int var126 = 0;

                  while (var82 < var74.length) {
                     var126++;
                     var82 += 8;
                     var82 += b(var74, var82) + 1 << 1;
                  }

                  byte var84 = 0;
                  ag[var64] = new short[var126][];
                  ek[var64] = new short[var126][];
                  em[var64] = new short[var126];
                  en[var64] = new String[var126];

                  for (int var131 = 0; var131 < var126; var131++) {
                     int var140 = 5 + b(var74, var84 + 8);
                     ek[var64][var131] = new short[var140];
                     ag[var64][var131] = new short[var140];
                     en[var64][var131] = null;
                     short[] var148 = ek[var64][var131];

                     for (int var154 = 0; var154 < var140; var154++) {
                        var148[var154] = b(var74, var84);
                        var84 += 2;
                     }

                     if (var148[0] == 404) {
                        eo[var64] = true;
                     }
                  }

                  d(var64, false);
                  au(var64);
               }

               v(true);

               for (int var48 = 0; var48 < 65; var48++) {
                  a((byte)1, var48);
               }

               ai();
               b("/17");
               dD = new short[220][][];
               dE = new short[55][];

               for (int var49 = 0; var49 < 55; var49++) {
                  dE[var49] = new short[4];
               }

               for (int var50 = 0; var50 < 55; var50++) {
                  int var65 = var50;
                  byte[] var75 = B(var50);
                  int var132 = 0;
                  int var85 = 6;

                  for (int var149 = 0; var149 < 4; var149++) {
                     var132 = 0;

                     for (var85 += 5; var85 < var75.length && var75[var85] != 1; var132++) {
                        var85 += 10;
                     }

                     dD[(var65 << 2) + var149] = new short[var132][];

                     for (int var155 = 0; var155 < var132; var155++) {
                        dD[(var65 << 2) + var149][var155] = new short[5];
                     }
                  }

                  var85 = 0;
                  var85 = ++var85 + 2;
                  short var156 = 0;
                  var85 += 2;
                  var85++;

                  for (int var141 = 0; var141 < 4; var141++) {
                     var132 = 0;
                     var85 = ++var85 + 2;
                     var85 += 2;

                     for (dE[var65][var141] = (short)((var65 << 2) + var141); var85 < var75.length && var75[var85] != 1; var132++) {
                        short var150 = b(var75, ++var85);
                        int var94 = var85 + 2;
                        var156 = b(var75, var94);
                        int var95 = var94 + 2;
                        short var159 = b(var75, var95);
                        int var96 = var95 + 2;
                        short var127 = b(var75, var96);
                        var85 = var96 + 2;
                        short var162 = var75[var85];
                        var85++;
                        dD[(var65 << 2) + var141][var132][0] = var159;
                        dD[(var65 << 2) + var141][var132][1] = var127;
                        dD[(var65 << 2) + var141][var132][2] = var162;
                        dD[(var65 << 2) + var141][var132][3] = var150;
                        dD[(var65 << 2) + var141][var132][4] = var156;
                     }
                  }
               }

               v(true);
               return;
            case 1:
               bi();
               return;
            case 2:
               ap();
               return;
            case 3:
               boolean var62 = false;
               Object var45 = null;
               b("/2");
               na = (int[])C(1);
               nb = (int[])C(0);
               v(true);
               return;
            case 4:
               String var43 = "/0";
               if (nr == null) {
                  InputStream var60 = ng;
                  ng = p(var43);
                  int var72;
                  nr = new byte[var72 = ed()][];

                  for (int var81 = 0; var81 < var72; var81++) {
                     int var125 = ed();
                     nr[var81] = new byte[var125];
                     d(nr[var81], var125);
                  }

                  try {
                     ng.close();
                  } catch (Exception var14) {
                  }

                  ng = var60;
               }

               d.i();
               boolean var61 = false;
               boolean var44 = false;

               for (int var73 = 0; var73 <= 182; var73++) {
                  if (!d.d(var73)) {
                     boolean var168;
                     switch (var73) {
                        case 80:
                           var168 = true;
                           break;
                        default:
                           var168 = false;
                     }

                     if (var168) {
                        d.j = true;
                     } else {
                        d.j = false;
                     }

                     int var139 = var73;
                     Object var130 = null;
                     d.a("/4", var139);
                  }
               }

               if (!P(23)) {
                  a(23);
                  return;
               }
               break;
            case 5:
               for (int var42 = 0; var42 < 39; var42++) {
                  int var58 = var42;
                  String var79 = nf;
                  if (nf == null || !var79.equals("/11")) {
                     v(true);
                     b("/11");
                  }

                  byte[] var70 = B(var58);
                  dt = 0;
                  int var120 = 4;
                  dr[var58] = b(var70, 4);
                  var120 += 2;
                  ds[var58] = b(var70, 6);
                  var120 += 2;
                  int[][] var129 = new int[ds[var58]][dr[var58]];
                  if (ds[var58] > 0) {
                     byte[] var138 = new byte[dr[var58]];

                     for (int var152 = 0; var152 < dr[var58]; var152++) {
                        var138[var152] = var70[var120];
                        var120++;
                     }

                     int var146 = (char)var70[var120];
                     var120++;
                     if (var146 == 72) {
                        for (int var153 = 0; var153 < ds[var58]; var153++) {
                           for (int var158 = 0; var158 < dr[var58]; var158++) {
                              int[] var166 = var129[var153];
                              int var10002 = var138[var158];
                              var146 = var120;
                              byte[] var161 = var70;
                              switch (var10002) {
                                 case 1:
                                    dt = 1;
                                    var10002 = var161[var146];
                                    break;
                                 case 2:
                                    dt = 2;
                                    var10002 = b(var161, var146);
                                    break;
                                 case 4:
                                    dt = 4;
                                    var10002 = c(var161, var146);
                                    break;
                                 case 8:
                                    dt = 1;
                                    var10002 = (char)var161[var146];
                                    break;
                                 case 16:
                                    dt = 2;
                                    var10002 = b(var161, var146);
                                    break;
                                 case 32:
                                    dt = 4;
                                    var10002 = c(var161, var146);
                                    break;
                                 default:
                                    var10002 = -1;
                              }

                              var166[var158] = var10002;
                              var120 += dt;
                           }
                        }
                     }
                  }

                  T[var58] = var129;
               }

               eV = o(2);
               eW = o(3);
               eX = o(5);
               eY = o(4);
               Object var59 = null;
               byte[] var71 = s("Shop_UnlockNew");
               int var80 = 0;
               boolean var167;
               if (var71 != null && F() && !bF) {
                  for (int var124 = 0; var124 < eV.length; var124++) {
                     eV[var124][19] = var71[var80];
                     var80++;
                  }

                  var167 = true;
               } else {
                  var167 = false;
               }

               if (!var167) {
                  bZ();
               }

               cp();
               return;
            case 6:
               b("/15");
               dC = new short[105][][];

               for (int var41 = 0; var41 < 105; var41++) {
                  int var57 = var41;
                  byte[] var69 = B(var41);
                  int var76 = 0;
                  int var119 = 0;

                  while (var76 < var69.length) {
                     var119++;
                     var76 += 8;
                     var76 += b(var69, var76) + 1 << 1;
                  }

                  byte var78 = 0;
                  dC[var57] = new short[var119][];

                  for (int var128 = 0; var128 < var119; var128++) {
                     int var137 = 5 + b(var69, var78 + 8);
                     dC[var57][var128] = new short[var137];
                     short[] var145 = dC[var57][var128];

                     for (int var151 = 0; var151 < var137; var151++) {
                        var145[var151] = b(var69, var78);
                        var78 += 2;
                     }
                  }
               }

               v(true);
               b("/14");
               q.a(0);
               q.b(0);
               q.a(1);
               q.b(1);
               q.a(2);
               q.b(2);
               q.a(3);
               q.b(3);
               q.a(4);
               q.b(4);
               q.a(5);
               q.b(5);
               q.a(6);
               q.b(6);
               q.a(7);
               q.b(7);
               q.a(8);
               q.b(8);
               q.a(9);
               q.b(9);
               q.a(10);
               q.b(10);
               q.a(11);
               q.b(11);
               q.a(12);
               q.b(12);
               v(true);
               return;
            case 7:
               bG();
               if (!F()) {
                  aq();
                  aq(0);
               }

               bH = ((int[][])T[0])[ab.e[7] - 1][0];
               return;
            case 8:
               bL = n(300000, 420000);
               bM = -1;
               aX();
               ba();
               dR();
               return;
            case 9:
               byte[] var40 = new byte[131072];

               try {
                  a("checkSpace", var40);
               } catch (RecordStoreException var13) {
               }

               try {
                  u("checkSpace");
                  return;
               } catch (RecordStoreNotFoundException var12) {
                  return;
               }
            case 10:
               aG();
               return;
            case 11:
               b("/8");
               aF();
               v(true);
               return;
            case 12:
               System.gc();

               for (int var39 = 0; var39 < 50; var39++) {
                  if (!a((short)var39)) {
                     a((byte)3, var39);
                  }
               }

               ai();
               System.gc();
               return;
            case 13:
               System.gc();

               for (int var38 = 50; var38 < 100; var38++) {
                  if (!a((short)var38)) {
                     a((byte)3, var38);
                  }
               }

               ai();
               System.gc();
               return;
            case 14:
               System.gc();
               b("/13");

               for (int var37 = 0; var37 < 60; var37++) {
                  if (jX != null) {
                     jX.c(aq);
                  }

                  q(4, var37);
               }

               v(true);
               System.gc();
               return;
            case 15:
               System.gc();
               b("/13");

               for (int var36 = 60; var36 < 121; var36++) {
                  if (jX != null) {
                     jX.c(aq);
                  }

                  q(4, var36);
               }

               v(true);
               System.gc();
               return;
            case 16:
               System.gc();
               b("/13");

               for (int var35 = 121; var35 < 181; var35++) {
                  if (jX != null) {
                     jX.c(aq);
                  }

                  q(4, var35);
               }

               v(true);
               System.gc();
               return;
            case 17:
               System.gc();
               b("/13");

               for (int var34 = 181; var34 < 242; var34++) {
                  if (jX != null) {
                     jX.c(aq);
                  }

                  q(4, var34);
               }

               v(true);
               System.gc();
               return;
            case 18:
               q.e(0);
               b("/7");
               if (!F()) {
                  T(0);
               } else {
                  w var68 = ab;
                  int var54 = 0;
                  int var27 = 0;
                  byte[] var3 = B(0);
                  int var4 = 0;
                  bI[0] = 0;

                  while (var4 < var3.length) {
                     int var5 = var3[var4] & 255;
                     var4 = ++var4 + 2;
                     short var8 = b(var3, var4);
                     var4 += 2;
                     short var9 = b(var3, var4);
                     var4 += 2;
                     switch (var5) {
                        case 10:
                           for (int var160 = 0; var160 < 2; var160++) {
                              var4++;
                           }

                           bI[0]++;
                           continue;
                        case 11:
                           var4++;
                           var4++;
                           break;
                        case 12:
                           var4++;
                           var4++;
                           var4++;
                           break;
                        case 13:
                           var4++;
                           var4++;
                           var4++;
                           break;
                        case 14:
                           var4++;
                           var4++;
                           bo[0] = var8;
                           bp[0] = var9;
                           m = bo[0];
                           n = bp[0];
                           d.d(m, n);
                           continue;
                        case 15:
                           var4++;
                           var4++;
                           var4++;
                           break;
                        case 16:
                           int var10 = var3[var4] + 1;
                           int var142 = q.d(var8 + 48, var9);
                           int var135 = q.e(var8 + 48, var9);
                           byte var163 = var3[++var4];
                           var27 = (boolean)0;
                           if (var163 == 1) {
                              q.c(var142, var135, 1, 254, var10);
                           } else {
                              q.c(var142, var135, 1, 253, var10);
                           }
                           break;
                        case 17:
                           var4++;
                           var4++;
                           var4++;
                           break;
                        case 18:
                           var4++;
                           var4++;
                           var4++;
                           break;
                        case 19:
                           var4++;
                           var4++;
                           var4++;
                           break;
                        case 20:
                           var4++;
                           break;
                        case 21:
                        case 22:
                        default:
                           continue;
                        case 23:
                           var4++;
                           break;
                        case 24:
                           byte var7 = var3[++var4];
                           short var6 = b(var3, ++var4);
                           var4 += 2;
                           var27 = b(var3, var4);
                           var4 += 2;
                           q var10000 = q.b(var8, var9, var7, var6, var27);
                           var27 = null;
                           var10000.d((byte)4);
                           continue;
                     }

                     var4++;
                  }

                  for (int var143 = 0; var143 < var68.c; var143++) {
                     switch (var68.b[var143].d) {
                        case 2:
                        default:
                           break;
                        case 3:
                           q.a(0, var68.b[var143]);
                           break;
                        case 4:
                           q.b(0, var68.b[var143]);
                     }
                  }

                  for (int var144 = 0; var144 < var68.c; var144++) {
                     switch (var68.b[var144].d) {
                        case 2:
                           if (var68.b[var144].e[5] != -1) {
                              var27 = var68.b[var144].e[5];
                              var54 = 0;

                              v var164;
                              while (true) {
                                 if (var54 >= q.af[z][1].length) {
                                    var164 = null;
                                    break;
                                 }

                                 if (q.af[z][1][var54] != null && ((v)q.af[z][1][var54]).bh != null && ((v)q.af[z][1][var54]).bh.e[0] == var27) {
                                    var164 = (v)q.af[z][1][var54];
                                    break;
                                 }

                                 var54++;
                              }

                              v var136 = var164;
                              var27 = var68.b[var144].e[0];
                              var54 = 0;

                              while (true) {
                                 if (var54 >= q.af[z][0].length) {
                                    var165 = null;
                                    break;
                                 }

                                 if (q.af[z][0][var54] != null && ((r)q.af[z][0][var54]).bg != null && ((r)q.af[z][0][var54]).bg.e[0] == var27) {
                                    var165 = (r)q.af[z][0][var54];
                                    break;
                                 }

                                 var54++;
                              }

                              var27 = null;
                              var165.aR = var136;
                           }
                     }
                  }
               }

               v(true);
               return;
            case 19:
               au();
               q.d(0);
               return;
            case 20:
               bA = --bA + 1;
               me = System.currentTimeMillis() - 1800000L;
               mf = true;
               return;
            case 21:
               if (bE) {
                  if (!dc()) {
                     a(3, u(314), 45);
                  }

                  bA--;
                  return;
               }
               break;
            case 22:
               q.d();
               q.e();
         }
      } else if (by == 0) {
         switch (var0) {
            case 0:
               q(1, 0);
               q(1, 1);
               q(1, 21);
               q(1, 23);
               return;
            case 1:
               byte[] var26 = new byte[131072];

               try {
                  a("checkSpace", var26);
               } catch (RecordStoreException var16) {
                  bE = true;
               }

               try {
                  u("checkSpace");
                  return;
               } catch (RecordStoreNotFoundException var15) {
                  return;
               }
            case 2:
               byte[] var25 = s("RMSHeader");
               int var67 = 0;
               if (var25 != null) {
                  var67 = c(var25, 0);
               }

               if (var25 != null && var25.length >= 15 && var67 == ao()) {
                  e = aE[0];
                  aY = var25[7] == 1;
                  md = var25[8] == 1;
                  z = 0;
                  bj = var25[13];
                  bk = var25[14];
                  return;
               }

               aG = true;
               e = aE[0];
               aq();
               an();
               return;
            case 3:
               b("/3");
               q(0, 6);
               if (e != 17 && e != 7 && e != 9 && e != 16 && e != 15) {
                  q(0, 0);
                  q(0, 1);
                  q(0, 2);
               }

               v(true);
               return;
            case 4:
               b("/3");
               int[] var23 = (int[])C(7);
               j[0][6].b(var23);
               if (e != 17 && e != 7 && e != 9 && e != 16 && e != 15) {
                  int[] var53 = (int[])C(3);
                  int[] var66 = (int[])C(4);
                  int[] var24 = (int[])C(5);
                  j[0][0].b(var53);
                  j[0][1].b(var66);
                  j[0][2].b(var24);
               }

               v(true);
            default:
               return;
            case 5:
               A(e, 0);
               A(e, 1);
               A(e, 2);
               A(e, 3);
               A(e, 5);
               A(e, 4);
               A(e, 6);
               A(e, 7);
               A(e, 8);
               A(e, 9);
               A(e, 10);
               A(e, 11);
               A(e, 12);
               A(e, 13);
               bE();
               return;
            case 6:
         }
      } else if (by == 2) {
         switch (var0) {
            case 0:
               if (aM == 13) {
                  aG();
                  return;
               }
            case 1:
            case 3:
            case 4:
            case 5:
            default:
               break;
            case 2:
               b("/8");
               aF();
               v(true);
               aj();
               return;
            case 6:
               if (z != 0) {
                  b("/7");
                  if (z != 11) {
                     q.e(z);
                     T(z);
                  }

                  v(true);
               }
               break;
            case 7:
               if (z == 0) {
                  au();
                  q.d(0);
               } else if (z == 11) {
                  q.d(11);
               } else {
                  q.d(3);
               }

               m = bo[z];
               n = bp[z];
               d.d(m, n);
               return;
         }
      } else if (by == 3) {
         switch (var0) {
            case 0:
               ag();
         }
      } else if (by == 4) {
         switch (var0) {
            case 0:
               r(2, 0);
               r(2, 1);
               return;
            case 1:
               return;
            case 2:
               for (int var22 = 0; var22 < bG.length; var22++) {
                  for (int var52 = 0; var52 < bG[var22].length; var52++) {
                     q(var22, bG[var22][var52]);
                  }
               }
         }
      } else if (by == 5) {
         switch (var0) {
            case 0:
               ag();
         }
      } else if (by != 7) {
         if (by == 6) {
            switch (var0) {
               case 0:
                  int var51 = mK;
                  var0 = mJ;
                  b(am, 0, 0, var0, var51);
                  f(1, 3, false);
                  b("/3");
                  if (e != 17 && e != 7 && e != 9 && e != 16 && e != 15) {
                     q(0, 0);
                     q(0, 1);
                     q(0, 2);
                  }

                  v(true);
                  return;
               case 1:
                  b("/3");
                  if (e != 17 && e != 7 && e != 9 && e != 16 && e != 15) {
                     int[] var20 = (int[])C(3);
                     int[] var1 = (int[])C(4);
                     int[] var2 = (int[])C(5);
                     j[0][0].b(var20);
                     j[0][1].b(var1);
                     j[0][2].b(var2);
                  }

                  v(true);
                  return;
               case 2:
                  A(e, 0);
                  A(e, 1);
                  A(e, 2);
                  A(e, 3);
                  A(e, 5);
                  A(e, 4);
                  A(e, 6);
                  A(e, 7);
                  A(e, 8);
                  A(e, 9);
                  A(e, 10);
                  A(e, 11);
                  A(e, 12);
                  A(e, 13);
                  bE();
                  return;
               case 3:
                  if (bj()) {
                     Object var19 = null;
                  }
            }
         }
      } else {
         switch (var0) {
            case 0:
               if (!P(23) && aX) {
                  a(23);
               }

               d(false);
               if (q.am == 1) {
                  q.s();
               } else if (q.am == 2) {
                  q.q();
               }

               q.i();
               q.v();
               z = 0;
               var0 = 0;

               for (; var0 < q.af.length; var0++) {
                  if (q.af[var0][0] != null) {
                     q.a(q.af[var0][0]);
                  }

                  if (q.af[var0][0] != null) {
                     q.a(q.af[var0][1]);
                  }

                  if (q.af[var0][0] != null) {
                     q.a(q.af[var0][2]);
                  }

                  if (q.af[var0][0] != null) {
                     q.a(q.af[var0][3]);
                  }

                  if (q.af[var0][0] != null) {
                     q.a(q.af[var0][7]);
                  }

                  if (q.af[var0][0] != null) {
                     q.a(q.af[var0][4]);
                  }

                  if (q.af[var0][0] != null) {
                     q.a(q.af[var0][6]);
                  }
               }

               for (int var18 = 0; var18 < W.length; var18++) {
                  W[var18] = null;
               }

               S = 100;
               q.ad = null;
               q.ac = null;
               r = true;
               cd = 0;
               kg = false;
               ch = 0;
               ci = 0;
               bH = ((int[][])T[0])[0][0];
               bm = 0;
               am();
               return;
            case 1:
               b("/8");
               aF();
               v(true);
               return;
            case 2:
               bF = true;
               bi();
               return;
            case 3:
               ap();
               return;
            case 4:
               aq();
               bG();
               aq(0);
               return;
            case 5:
               aX();
               ba();
               dR();
               return;
            case 6:
               b("/7");
               q.e(z);
               T(z);
               v(true);
               return;
            case 7:
               au();
               q.d(0);
               return;
            case 8:
               b(true);
               bF = false;
         }
      }
   }

   public static int c(int var0) {
      switch (var0) {
         case 0:
            return -1;
         case 1:
         case 2:
         case 3:
            return 0;
         case 4:
         case 5:
         case 6:
            return 1;
         case 7:
         case 8:
         case 9:
            return 2;
         case 10:
         default:
            return -1;
         case 11:
            return -2;
      }
   }

   static int l() {
      return bZ;
   }

   static void d(int var0) {
      if (bZ < 100) {
         bY[bZ++] = var0;
      }
   }

   static int e(int var0) {
      return bY[var0];
   }

   static void f(int var0) {
      int var1 = 0;

      int var10000;
      while (true) {
         if (var1 >= bZ) {
            var10000 = -1;
            break;
         }

         if (bY[var1] == var0) {
            var10000 = var1;
            break;
         }

         var1++;
      }

      var0 = var10000;
      if (var10000 >= 0) {
         if (bZ == 1) {
            bY[0] = -1;
            bZ = 0;
            return;
         }

         while (var0 < bZ - 1) {
            bY[var0] = bY[var0 + 1];
            var0++;
         }

         bY[bZ] = -1;
         bZ--;
      }
   }

   public static void g(int var0) {
      ab.e[2] = ab.e[1];
      int var1 = ab.e[1] + var0;
      ab.e[1] = var1;
      l(20, var0);
      f(16, var0, -1, -1);
      j();
   }

   public static int a(int var0, int var1, int var2, int var3, int var4) {
      var0 = (var0 - var1) * (var4 - var3);
      var1 = var2 - var1;
      return y(p(var0 << 8, var1 << 8)) + var3;
   }

   private static boolean b(boolean var0, int var1) {
      return a(false, var1, false);
   }

   private static boolean a(boolean var0, int var1, boolean var2) {
      if (var0) {
         if ((var0 = ab.e[1]) < var1) {
            if (bj() && !var2) {
               var0 = var1 - var0;
               var1 = -1;
               if (var0 >= b(32, 447, 0)) {
                  var1 = 446;
                  var2 = 447;
               } else {
                  for (var2 = 1; var2 <= 447; var2++) {
                     if (var0 <= b(32, var2, 0)) {
                        var1 = var2 - 1;
                        break;
                     }
                  }
               }

               int var3 = b(32, var1, 0);
               int var4 = b(32, var2, 0);
               var1 = b(32, var1, 1);
               var2 = b(32, var2, 1);
               bN = a(var0, var3, var4, var1, var2);
               ad[0] = "" + bN;
               a(62);
               String var8 = a(u(203), ad, '%');
               a(2, var8, 26);
            } else {
               var0 = var1 - var0;
               String var11 = u(7176);
               ad[0] = "" + var0;
               String var12 = a(var11, ad, '#');
               a(63);
               d(3, var12);
            }

            return false;
         }
      } else if ((var0 = ab.e[3]) < var1) {
         var0 = var1 - var0;
         a(62);
         String var15 = u(7177);
         ad[0] = "" + var0;
         String var16 = a(var15, ad, '#');
         a(2, var16, 2);
         return false;
      }

      return true;
   }

   public static boolean a(boolean var0, int var1) {
      return a(var0, var1, false, true);
   }

   private static boolean a(boolean var0, int var1, boolean var2, boolean var3) {
      if (!a(var0, var1, var2)) {
         return false;
      }

      if (var0) {
         S(var1);
      } else {
         b(var1, var3);
      }

      return true;
   }

   private static int aJ() {
      int var0 = ab.e[7];
      return ((int[][])T[0])[var0 - 1][1];
   }

   private static int aK() {
      int var0 = ab.e[7];
      return ((int[][])T[0])[var0 - 1][2];
   }

   private static void S(int var0) {
      a(30);
      ab.e[2] = ab.e[1];
      int var1 = ab.e[1];
      ab.e[1] = var1;
      l(21, var0);
      f(17, var0, -1, -1);
      j();
   }

   public static void h(int var0) {
      ab.e[4] = ab.e[3];
      var0 = ab.e[3] + var0;
      ab.e[3] = var0;
      j();
   }

   private static void b(int var0, boolean var1) {
      if (var1) {
         a(72);
      }

      ab.e[4] = ab.e[3];
      var1 = ab.e[3];
      ab.e[3] = var1;
      j();
   }

   public static void i(int var0) {
      ab.e[6] = ab.e[5];
      var0 = ab.e[5] + var0;
      ab.e[5] = var0;
      j();
   }

   public static boolean j(int var0) {
      int var10000 = ab.e[5];
      int var1 = 0;
      if (var10000 >= var0) {
         ab.e[6] = ab.e[5];
         var1 = ab.e[5];
         ab.e[5] = var1;
         j();
         return true;
      }

      a(61);
      if (!bj()) {
         d(3, u(7199));
      } else {
         var1 = var0 - ab.e[5];
         var0 = -1;
         int var2;
         if (var1 >= b(32, 242, 2)) {
            var0 = 241;
            var2 = 242;
         } else {
            for (var2 = 1; var2 <= 242; var2++) {
               if (var1 <= b(32, var2, 2)) {
                  var0 = var2 - 1;
                  break;
               }
            }
         }

         int var3 = b(32, var0, 2);
         int var4 = b(32, var2, 2);
         var0 = b(32, var0, 3);
         var2 = b(32, var2, 3);
         jt = Q;
         bN = a(var1, var3, var4, var0, var2);
         ad[0] = "" + bN;
         String var7 = a(u(204), ad, '%');
         a(2, var7, 27);
      }

      return false;
   }

   public static void k(int var0) {
      if (ab.e[7] < 40) {
         ab.e[9] = ab.e[8];
         var0 = ab.e[8] + var0;
         ab.e[8] = var0;
         az(bH);
         j();
      }
   }

   private static void aL() {
      bH = ((int[][])T[0])[ab.e[7] - 1][0];
      ab.e[9] = ab.e[9] - bH;
      ab.e[8] = ab.e[9];
      ab.e[7]++;
      bH = ((int[][])T[0])[ab.e[7] - 1][0];
      b(31, true, false);
      l(15, ab.e[7]);
      l(16, ab.e[7]);
      D(16, ab.e[7]);
      j();
   }

   private static void T(int var0) {
      byte[] var1 = B(var0);
      int var2 = 0;
      bI[var0] = 0;
      int[] var6 = new int[u * v];
      int var7 = 0;

      while (var2 < var1.length) {
         int var3 = var1[var2] & 255;
         var2 = ++var2 + 2;
         short var4 = b(var1, var2);
         var2 += 2;
         int var5 = b(var1, var2);
         var2 += 2;
         switch (var3) {
            case 10:
               byte var60 = var1[var2];
               byte var158 = var1[++var2];
               var2++;
               byte var193 = (byte)(var60 - 23);
               ((v)q.a(var4, var5, var193, var0)).aS = var158;
               bI[var0]++;
               break;
            case 11:
               var2++;
               byte var192 = var1[++var2];
               var2++;
               q.a(var0, (byte)8, var192, var4, var5).d((byte)4);
               break;
            case 12:
               byte var59 = var1[var2];
               byte var156 = var1[++var2];
               var2++;
               var2++;
               var2++;
               byte var197 = (byte)(var59 - 12);
               var156++;
               new StringBuffer().append("aaaaaaaaaaaaaaaaaaaaa: ").append(var59).append(":").append(12).toString();
               (ca = q.a(var0, (byte)2, var197, var4, var5, var156)).d((byte)4);
               break;
            case 13:
               byte var155 = var1[++var2];
               var2++;
               var2++;
               var2++;
               byte var196 = (byte)(var155 - 2);
               q.a(var0, (byte)1, (byte)0, var4, var5, var196).d((byte)4);
               break;
            case 14:
               var2++;
               var2++;
               bo[var0] = var4;
               bp[var0] = var5;
               m = bo[var0];
               n = bp[var0];
               d.d(m, n);
               break;
            case 15:
               var2++;
               var2++;
               var2++;
               var2++;
               q.a(var0, (byte)4, (byte)1, var4, var5).d((byte)4);
               break;
            case 16:
               var3 = var1[var2] + 1;
               int var154 = q.d(var4 + 48, var5);
               int var191 = q.e(var4 + 48, var5);
               if (var1[++var2] == 1) {
                  q.c(var154, var191, 1, 254, var3);
               } else {
                  q.c(var154, var191, 1, 253, var3);
               }

               var2++;
               break;
            case 17:
               byte var153 = var1[++var2];
               var2++;
               var2++;
               var2++;
               byte var195 = (byte)(var153 - 2);
               q.a(var0, (byte)3, (byte)2, var4, var5, var195).d((byte)4);
               break;
            case 18:
               var2++;
               var2++;
               var2++;
               var2++;
               q.a(var0, (byte)5, (byte)4, var4, var5).d((byte)4);
               break;
            case 19:
               var2++;
               var2++;
               var2++;
               var2++;
               q.a(var0, (byte)7, (byte)5, var4, var5).d((byte)4);
               break;
            case 20:
               var2++;
               var2++;
               byte var190 = var1[++var2];
               byte var57 = var1[++var2];
               byte var194 = var1[++var2];
               var2++;
               q.a(var0, var57, ca, var194, var190, false);
               break;
            case 21:
               int var150 = var1[++var2];
               int var159 = var1[++var2];
               var2++;
               var3 = q.d(var4 + 48, var5);
               int var10 = q.e(var4 + 48, var5);
               q.c(var3, var10, 1, var159, ++var150);
               int[] var152 = var6;
               var7 = var7;
               int var63 = var150;
               short var62 = (short)var5;
               int var52 = var4;
               var52 += 48;
               switch (var63) {
                  case 1:
                     var5 = q.d(var52, var62);
                     var159 = q.e(var52, var62);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     continue;
                  case 2:
                     var5 = q.d(var52, var62);
                     var159 = q.e(var52, var62);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 48, var62 - 24);
                     var159 = q.e(var52 + 48, var62 - 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 48, var62 + 24);
                     var159 = q.e(var52 + 48, var62 + 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 96, var62);
                     var159 = q.e(var52 + 96, var62);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     continue;
                  case 3:
                     var5 = q.d(var52, var62);
                     var159 = q.e(var52, var62);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 48, var62 - 24);
                     var159 = q.e(var52 + 48, var62 - 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 48, var62 + 24);
                     var159 = q.e(var52 + 48, var62 + 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 96, var62);
                     var159 = q.e(var52 + 96, var62);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var52 += 96;
                     var5 = q.d(var52 + 48, var62 - 24);
                     var159 = q.e(var52 + 48, var62 - 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 48, var62 + 24);
                     var159 = q.e(var52 + 48, var62 + 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 96, var62);
                     var159 = q.e(var52 + 96, var62);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52, var62 - 48);
                     var159 = q.e(var52, var62 - 48);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52, var62 + 48);
                     var159 = q.e(var52, var62 + 48);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     continue;
                  case 4:
                     var5 = q.d(var52, var62);
                     var159 = q.e(var52, var62);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 48, var62 - 24);
                     var159 = q.e(var52 + 48, var62 - 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 48, var62 + 24);
                     var159 = q.e(var52 + 48, var62 + 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 96 + 48, var62 - 72);
                     var159 = q.e(var52 + 96 + 48, var62 - 72);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 96 + 48, var62 + 72);
                     var159 = q.e(var52 + 96 + 48, var62 + 72);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 96, var62);
                     var159 = q.e(var52 + 96, var62);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var52 += 96;
                     var5 = q.d(var52 + 48, var62 - 24);
                     var159 = q.e(var52 + 48, var62 - 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 48, var62 + 24);
                     var159 = q.e(var52 + 48, var62 + 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 96, var62);
                     var159 = q.e(var52 + 96, var62);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52, var62 - 48);
                     var159 = q.e(var52, var62 - 48);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52, var62 + 48);
                     var159 = q.e(var52, var62 + 48);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var52 += 96;
                     var5 = q.d(var52 + 48, var62 - 24);
                     var159 = q.e(var52 + 48, var62 - 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 48, var62 + 24);
                     var159 = q.e(var52 + 48, var62 + 24);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52 + 96, var62);
                     var159 = q.e(var52 + 96, var62);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52, var62 - 48);
                     var159 = q.e(var52, var62 - 48);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                     var5 = q.d(var52, var62 + 48);
                     var159 = q.e(var52, var62 + 48);
                     var5 = q.d(var5 + 48, var159) & 65535 | (q.e(var5 + 48, var159) & 65535) << 16;
                     var152[var7] = var5;
                     var7++;
                  default:
                     continue;
               }
            case 22:
               var2++;
               var2++;
               var2++;
               q.a(var0, (byte)14, (byte)6, var4, var5, (byte)1).d((byte)4);
               break;
            case 23:
               var2++;
               var2++;
               q.a(var0, (byte)16, (byte)7, var4, var5, (byte)1).d((byte)4);
               break;
            case 24:
               byte var8 = var1[++var2];
               short var9 = b(var1, ++var2);
               var2 += 2;
               short var50 = b(var1, var2);
               var2 += 2;
               q.b(var4, var5, var8, var9, var50).d((byte)4);
         }
      }

      cc = new int[var7];

      for (int var61 = 0; var61 < var7; var61++) {
         cc[var61] = var6[var61];
      }

      h();
   }

   private static void U(int var0) {
      int[] var1 = new int[u * v];
      int var2 = 0;

      for (int var3 = 0; var3 < u * v - 1; var3++) {
         int var4;
         int var5 = (var4 = q.i(var3)) & 0xFF;
         var4 = var4 >> 16 & 0xFF;
         if (var5 == 1) {
            if (var4 == var0) {
               q.h(var3, 0);
            } else if (var4 != 254 && var4 != 253) {
               var1[var2] = q.g(var3) | q.h(var3) << 16;
               var2++;
            }
         }
      }

      if (o) {
         d.a(d.k[0][13], d.h(0), mJ << 1, mK << 1);
      } else {
         d.a(d.k[0][13], d.h(0), mJ, mK);
      }

      cc = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         cc[var6] = var1[var6];
      }

      q.d(z);
      cd++;
      l(27, 0);
      l(28, 0);
      f(46, -1, -1, -1);
      by();
      d.o();
      h();
      if (!O(d.l())) {
         d.k();
      }

      a(36);
   }

   private static void aM() {
      if (!bT) {
         if (x) {
            x = false;
            if (o) {
               d.a(d.k[0][13], d.h(0), mJ + 96 << 1, mK + 48 << 1);
            } else {
               d.a(d.k[0][13], d.h(0), mJ + 96, mK + 48);
            }
         }

         String var0 = "RENDER_CLEANBUF";
         if (dm > 0) {
            for (int var18 = 0; var18 < dm; var18++) {
               if (dp[var18] != -1) {
                  int var1 = dn[var18];
                  int var2 = do_array[var18];
                  int var3 = dp[var18];
                  int var4 = dq[var18];
                  var3 += var1;
                  var4 += var2;
                  if (var1 < 0) {
                     var1 = 0;
                  }

                  if (var2 < 0) {
                     var2 = 0;
                  }

                  for (int var5 = var18 + 1; var5 < dm; var5++) {
                     if (dp[var5] != -1) {
                        int var6 = dn[var5];
                        int var7 = do_array[var5];
                        int var8 = dp[var5];
                        int var9 = dq[var5];
                        var8 += var6;
                        var9 += var7;
                        if (var6 < 0) {
                           var6 = 0;
                        }

                        if (var7 < 0) {
                           var7 = 0;
                        }

                        int var17 = var9;
                        int var16 = var8;
                        int var15 = var7;
                        int var14 = var6;
                        int var13 = var4;
                        int var12 = var3;
                        int var11 = var2;
                        int var10 = var1;
                        if (var12 < var14 ? false : (var10 > var16 ? false : (var13 < var15 ? false : var11 <= var17))) {
                           if (var6 < var1) {
                              var1 = var6;
                           }

                           if (var7 < var2) {
                              var2 = var7;
                           }

                           if (var8 > var3) {
                              var3 = var8;
                           }

                           if (var9 > var4) {
                              var4 = var9;
                           }

                           dp[var5] = -1;
                        }
                     }
                  }

                  d.a(var1, var2, var3 - var1, var4 - var2);
               }
            }

            dm = -1;
         }

         var0 = "RENDER_CLEANBUF";
         if (z == 0) {
            var0 = "RENDER_BUYTERRAIN";
            var0 = "RENDER_BUYTERRAIN";
         }

         var0 = "RENDER_BOTTOMTILE";
         if (cM) {
            bw();
         }

         var0 = "RENDER_BOTTOMTILE";
         var0 = "RENDER_OBJECTSTOTILE";
         bz();
         var0 = "RENDER_OBJECTSTOTILE";
         d.a(am, 0, 0, 0);
         if (jZ > 0) {
            bw();
            bz();
            jZ--;
            d.a(am, 0, 0, 0);
         }

         var0 = "RENDER_ACTORALL";
         q.a(am);
         var0 = "RENDER_ACTORALL";
         if (F() && !dE() && !be() && cc != null) {
            for (int var28 = 0; var28 < cc.length; var28++) {
               int var32 = cc[var28] & 65535;
               int var38 = cc[var28] >> 16 & 65535;
               int var44 = q.j(var32, var38) >> 16 & 65535;
               if (H == var44) {
                  var32 -= d.k[0][13];
                  var38 -= d.h(0);
                  var32 += 94;
                  j[3][34].a(am, 0, var32, var38, 1);
               }
            }
         }

         q[] var29 = W;
         int var35 = W.length;

         for (int var40 = 0; var40 < var35; var40++) {
            if (var29[var40] != null) {
               var29[var40].aJ = false;
            }
         }

         if (q.aO) {
            q.aO = false;
         }

         if (cW() && (!F() || dE()) && eb && af != null) {
            int var30 = af.av + ec;
            var35 = af.aw + ed;
            int var31 = var30 - m;
            var35 -= n;
            d var41 = ae;
            ae.a = var31;
            var41.b = var35;
            if (!F()) {
               kp[0] = 0;
               kp[1] = 0;
               kp[2] = 800;
               kp[3] = 480;
            }

            ae.g();
            ej = true;
         }

         dQ();
      }
   }

   private static void aN() {
      if (mj) {
         boolean var1 = false;
         b(30, true, false);
         mj = false;
      }

      if (!I) {
         q.l();
         q.t();
         q.u();
         if (bq != -1 || br != -1) {
            if (i == 5 || i == 11) {
               r.bo = 5;
            }

            d.d(m, n);
            if (dm >= 200) {
               d.o();
               dm = 0;
            }

            d.a(null, 0, 0, 0);
            bq = -1;
            br = -1;
         }

         q.j();
         U = 0;

         for (int var0 = 0; var0 < W.length; var0++) {
            W[var0] = null;
         }

         V = 0;
         if (q.ac != null) {
            q[] var4 = q.ac;
            if (q.ac != null) {
               int var14 = var4.length;

               for (int var2 = 0; var2 < var14; var2++) {
                  q var3;
                  if ((var3 = var4[var2]) != null && var3.at == z) {
                     var3.aK = false;
                     switch (var3.aI) {
                        case 0:
                        default:
                           break;
                        case 1:
                           if (V < 399) {
                              var3.S();
                              X[V++] = var3;
                           }
                           break;
                        case 2:
                        case 5:
                           a(var4[var2]);
                           break;
                        case 3:
                        case 6:
                        case 7:
                        case 8:
                           a(var4[var2]);
                           break;
                        case 4:
                           a(var4[var2]);
                           break;
                        case 9:
                           a(var4[var2]);
                     }
                  }
               }
            }
         }

         if (U > 0) {
            a(W, 0, U - 1);
         }

         if (V > 0) {
            a(X, 0, V - 1);
         }

         byte var5 = F() && w();
         if (q.aL && !var5) {
            a(3, 14, true);
            a(3, 15, true);
            if (q.aj) {
               if (q.ak != null) {
                  q.ak.h = 1;
               }

               b(3, 14, true);
            } else {
               if (q.ak != null) {
                  q.ak.h = 0;
               }

               b(3, 14, false);
            }

            int var15 = ag[3][15][2] - ag[3][14][2];
            c(3, 14, 2, q.aM - (var15 >> 1));
            c(3, 14, 3, q.aN + 48);
            c(3, 15, 2, q.aM + (var15 >> 1));
            c(3, 15, 3, q.aN + 48);
            M = false;
         } else {
            a(3, 14, false);
            a(3, 15, false);
         }

         if (aO()) {
            aP();
         }

         if (bJ == -1) {
            bJ = n(9000, 20000);
         }

         var5 = 1;
         int var16 = ab.e[7];
         if (F()) {
            if (var16 >= 30) {
               var5 = 6;
            } else if (var16 >= 20) {
               var5 = 4;
            } else if (var16 >= 10) {
               var5 = 2;
            } else {
               var5 = 0;
            }
         }

         if (B < var5 && !z() && !w() && ((bK = bK + aq) >= bJ || !F())) {
            q.I();
            B++;
            bJ = -1;
            bK = -1;
         }

         cg = 0;
      } else {
         cg = cg + aq;
      }

      aV();
      cT();
      int var17 = 0;
      int var7 = nO == 3;
      cU();
      cZ();
      dP();
      if (!var7 && q.am == 0) {
         if (q.an != null) {
            if (!v(74)) {
               b(74, true, true);
               L = false;
            } else if (L) {
               ck();
               cj();
               jb[74] = 1;
               L = false;
            }
         } else {
            v();
         }
      }

      if (!var7) {
         bH();
         bM();
         if (jw > 0 && !aF && F() && !dE() && jT) {
            jT = false;
            var7 = jv[0];

            for (int var18 = 1; var18 < jv.length; var18++) {
               jv[var18 - 1] = jv[var18];
            }

            jw--;
            int var9;
            var17 = var9 = var7;
            int[] var26;
            if ((var26 = z(10, var17))[6] > 0) {
               g(var26[6]);
            }

            if (var26[7] > 0) {
               h(var26[7]);
            }

            if (var26[8] > 0) {
               i(var26[8]);
            }

            aN(var9);
         }

         boolean var10000;
         if (dO < 0 && dN > 0) {
            var7 = dL[0];

            for (int var20 = 0; var20 < dN - 1; var20++) {
               dL[var20] = dL[var20 + 1];
            }

            dN--;
            dO = var7;
            var7 = var7;
            if (dS[var7] != null) {
               gg = 0;
               gh = 0;

               for (int var28 = 0; var28 < dS[var7].length; var28++) {
                  int[] var21;
                  switch ((var21 = dS[var7][var28])[0]) {
                     case 10:
                        gg = var21[1];
                        gh = var21[2];
                        g(gg);
                        h(gh);
                        break;
                  }
               }
            }

            bI();
            if (dQ[dO][1] != 0 && dQ[dO][1] != 151 && dQ[dO][1] != 152) {
               boolean var22 = false;
               b(8, true, false);
               a(26);
            } else {
               bJ();
            }

            var10000 = 1;
         } else {
            var10000 = 0;
         }

         if (!var10000 && !v(31) && !v(8)) {
            ea = true;

            while (dV > 0 && dM < 5) {
               var17 = 0;

               while (true) {
                  if (var17 >= dU.length) {
                     var10000 = -1;
                     break;
                  }

                  if (dU[var17] != -1) {
                     var10000 = dU[var17];
                     break;
                  }

                  var17++;
               }

               var7 = var10000;
               if (var10000 >= 0) {
                  var17 = var7;

                  for (int var27 = 0; var27 < dU.length; var27++) {
                     if (dU[var27] != -1 && dU[var27] == var17) {
                        aq(dU[var27]);
                        dU[var27] = -1;
                        dV--;
                        G();
                        break;
                     }
                  }

                  bI();
                  G();
               }
            }
         }
      }

      if ((bV = bV + aq) > bW) {
         bW = bV + 80000L;
         if (!o) {
            for (int var13 = 0; var13 < a.g[3].length; var13++) {
               var17 = a.g[3][var13];
               a.g[3][var13] = -1;
               if (a.h[3][var13] != null) {
                  a.h[3][var13].i(var17 >> 10, var17 & 1023);
                  a.h[3][var13] = null;
               }
            }
         }
      }

      if (bV > bX) {
         bX = bV + 1000000L;
         aj();
      }
   }

   private static boolean aO() {
      return ab.e[31] == 1 && i == 5;
   }

   private static void aP() {
      if (C <= 0) {
         if (bM < bL) {
            bM = bM + aq;
         }

         if (!z() && bM >= bL) {
            a(25);
            bM = -1;
            C++;
            q.H();
            bL = n(300000, 420000);
         }
      }
   }

   private static void aQ() {
      cf++;
   }

   private static void aR() {
      if (--cf <= 0) {
         cf = 0;
         bP();
      }
   }

   private static void aS() {
      if (cf > 0) {
         c(true);
      } else {
         cf = 0;
         c(false);
      }
   }

   private static void c(boolean var0) {
      boolean var1 = !I && var0;
      I = var0;
      if (var1) {
         ;
      }
   }

   public static void a(int var0, int var1) {
      if (!be()) {
         if (var0 != 0 || var1 != 0) {
            var0 = m + var0;
            var1 = n + var1;
            int var2;
            int var3;
            if (S == 100) {
               var2 = p - 800;
               var3 = q - 480;
            } else {
               var2 = p - 400;
               var3 = q - 240;
            }

            if (o) {
               var2 = (p >> 1) - 800;
               var3 = (q >> 1) - 480;
            }

            if (var0 < 0) {
               var0 = 0;
            } else if (var0 > var2) {
               var0 = var2;
            }

            if (var1 < 0) {
               var1 = 0;
            } else if (var1 > var3) {
               var1 = var3;
            }

            if (m != var0 || n != var1) {
               m = var0;
               n = var1;
               bq = m;
               br = n;
            }
         }
      }
   }

   public static void m() {
      if (r.aa() == 1) {
         ab.e[14] = 0;
      }
   }

   public static void n() {
      V(-1);
   }

   private static void V(int var0) {
      boolean var1 = false;

      int var2;
      for (var2 = 0; var2 < q.af[0][1].length; var2++) {
         if (q.af[0][1][var2] != null && q.af[0][1][var2].ao == 37 && (q.af[0][1][var2].aP == 4 || q.af[0][1][var2].aP == 5)) {
            var1 = true;
            break;
         }
      }

      if (var1) {
         if (ab.e[15] > 0) {
            if (var0 > 0) {
               ab.e[15] = ab.e[15] - var0 * 1000;
               return;
            }

            ab.e[15] = ab.e[15] - (aq + cg);
            return;
         }

         ab.e[15] = 0;
         ((v)q.af[0][1][var2]).l(19);
      }
   }

   private static boolean W(int var0) {
      return (co & var0) != 0;
   }

   private static boolean X(int var0) {
      return (cA & var0) != 0;
   }

   public static int o() {
      return cD;
   }

   public static int p() {
      return cE;
   }

   public static int q() {
      return cB;
   }

   public static int r() {
      return cC;
   }

   public static boolean s() {
      return X(ck);
   }

   public static boolean t() {
      return X(cl);
   }

   public static boolean u() {
      return X(cm);
   }

   private static void aT() {
      eB = false;
      co = 0;
      cp = -1;
      cq = -1;
      cr = -1;
      cs = -1;
      ct = -1;
      cu = -1;
      cx = 0;
      cy = 0;
      cz = 0;
      cA = 0;
      cB = cv;
      cC = cw;
      cD = 0;
      cE = 0;
   }

   private static void aU() {
      co = 0;
      cz = 0;
      cA = 0;
   }

   private static void aV() {
      cA = cz;
      cz = (cz = co) & ~(ck | cm);
      int var0 = cv;
      int var1 = cw;
      if (X(ck)) {
         cD = cx;
         cE = cy;
      } else if (X(cl | cm)) {
         cD = var0 - cB;
         cE = var1 - cC;
      } else {
         cD = 0;
         cE = 0;
      }

      cB = var0;
      cC = var1;
   }

   public final void pointerPressed(int var1, int var2) {
      nP = var1;
      nQ = var2;
      ej();
      nV = true;
      System.currentTimeMillis();
      int var3 = var1;
      var1 = var2;
      var2 = mK - var3;
      cv = var1;
      cw = var2;
      cp = var1;
      cq = var2;
      cr = var1;
      cs = var2;
      co = ck;
      cz = cz | co;
      cn = System.currentTimeMillis();
   }

   public final void pointerDragged(int var1, int var2) {
      nP = var1;
      nQ = var2;
      ej();
      nX = true;
      int var3 = var1;
      var1 = var2;
      var2 = mK - var3;
      cx = var1 - cv;
      cy = var2 - cw;
      cv = var1;
      cw = var2;
      cr = var1;
      cs = var2;
      var3 = cp - var1;
      var1 = cq - var2;
      if (var3 <= -40 || var3 >= 40 || var1 <= -40 || var1 >= 40 || System.currentTimeMillis() - cn >= 150L || !fQ) {
         co = cl;
         cz = cz | co;
      }
   }

   public final void pointerReleased(int var1, int var2) {
      nP = var1;
      nQ = var2;
      ej();
      nW = true;
      int var3 = var1;
      var1 = var2;
      var2 = mK - var3;
      cx = var1 - cv;
      cy = var2 - cw;
      cv = var1;
      cw = var2;
      ct = var1;
      cu = var2;
      var3 = cp - var1;
      var1 = cq - var2;
      if (var3 > -40 && var3 < 40 && var1 > -40 && var1 < 40 && System.currentTimeMillis() - cn < 150L && i == 5 && fQ) {
         cv = cp;
         cw = cq;
         ct = cp;
         cu = cq;
         co = ck | cm;
      } else {
         co = cm;
      }

      cn = 0L;
      cz = cz | co;
   }

   public static void v() {
      if (v(74) && jb[74] != 2) {
         b(74, false, true);
      }
   }

   private static void d(int var0, int var1, int var2, int var3) {
      a(28, var0, true);
      c(28, var0, 19, var2);
      l(28, var0, var3);
      cF[var0] = var1;
      c(28, var0, 25, 1);
   }

   private static void b(int var0, int var1, String var2) {
      a(28, var0, true);
      c(28, var0, 18, 0);
      c(28, var0, 19, 0);
      c(28, var0, var2);
      cF[var0] = var1;
      c(28, var0, 25, 1);
   }

   private static boolean aW() {
      return cG == 0;
   }

   private static void aX() {
      for (int var0 = 0; var0 < 5; var0++) {
         cI[var0] = ab.e[var0 + 26];
      }
   }

   private static void aY() {
      for (int var0 = 0; var0 < 5; var0++) {
         cI[var0] = 0;
      }
   }

   private static boolean Y(int var0) {
      if (var0 == 4) {
         for (int var1 = 0; var1 < 4; var1++) {
            if (cI[var1] < 20) {
               return true;
            }
         }
      } else if (var0 != 0) {
         if (cI[var0 - 1] >= 20) {
            return false;
         }

         return true;
      }

      return false;
   }

   private static int Z(int var0) {
      return b(25, cI[var0], var0 + 5);
   }

   private static int aa(int var0) {
      return ((int[][])T[25])[cI[var0]][var0 + 10];
   }

   private static int ab(int var0) {
      return ((int[][])T[25])[cI[var0]][var0 + 15];
   }

   private static int aZ() {
      int var0 = ab.e[7];
      return ((int[][])T[31])[var0 - 1][1];
   }

   private static int ac(int var0) {
      int var1 = cI[var0];
      var0 += 26;
      var0 = ((int[][])T[var0])[var1][0];
      if (dF()) {
         return var0;
      }

      if ((var1 = ab.e[20]) <= 0) {
         w var2 = ab;
         int var3 = w.a(ab, 2);
         int var4 = 0;
         w[] var5 = new w[1];
         w var6 = null;

         for (int var7 = 0; var7 < var5.length; var7++) {
            var5[var7] = null;
         }

         for (int var24 = 0; var24 < var5.length; var24++) {
            var4 = 0;

            for (int var8 = 0; var8 < var3 + 1; var8++) {
               if ((var6 = var2.a(var2, var8, 2)) != null && var6.e[2] == 1) {
                  int var10000 = var6.e[1];
                  int var10 = var6.e[12];
                  int var9 = var10000;
                  var1 = b(2, var9, 110);
                  int var11 = 0;

                  for (int var12 = 0; var12 < var10; var12++) {
                     var11 += b(2, var9, var12 + 67);
                  }

                  if ((var1 = var1 + (var11 << 3 << 2)) > var4) {
                     var10 = var6.e[0];
                     w[] var25 = var5;
                     var11 = 0;

                     while (true) {
                        if (var11 >= var25.length) {
                           var28 = true;
                           break;
                        }

                        if (var25[var11] != null && var25[var11].e[0] == var10) {
                           var28 = false;
                           break;
                        }

                        var11++;
                     }

                     if (var28) {
                        var4 = var1;
                        var5[var24] = var6;
                     }
                  }
               }
            }
         }

         w var29 = var5[0];
         Object var18 = null;
         if ((var1 = var29.e[12]) < 5) {
            var1 = 5;
         }

         ab.e[20] = var1;
      }

      int var30 = var0 - (var1 - 1);
      int var19 = cJ;
      int var20 = 0;

      for (int var22 = 0; var22 < var19 + 1; var22++) {
         var20 += cI[var22];
      }

      return var30 * var20 / 99 + (var1 - 1);
   }

   private static void ba() {
      cK = new int[50];

      for (int var0 = 0; var0 < 50; var0++) {
         cK[0] = 0;
      }

      for (int var1 = 0; var1 < 4; var1++) {
         cK[b(14, var1, 7)] = 1;
      }

      for (int var2 = 0; var2 < 4; var2++) {
         cK[b(14, var2, 8)] = 1;
      }

      for (int var3 = 0; var3 < 2; var3++) {
         cK[b(14, var3, 9)] = 1;
      }
   }

   private static void bb() {
      for (int var0 = 0; var0 < 50; var0++) {
         cK[var0] = 1;
      }
   }

   private static boolean ad(int var0) {
      return cK[var0] > 0;
   }

   private static String ae(int var0) {
      long var1;
      long var3;
      String var5 = String.valueOf((var3 = var1 = var0) % 60L);
      String var6 = String.valueOf(var1 / 60L % 60L);
      String var2 = String.valueOf(var3 / 3600L);
      if (var5.length() == 1) {
         var5 = "0" + var5;
      }

      if (var6.length() == 1) {
         var6 = "0" + var6;
      }

      if (var2.length() == 1) {
         var2 = "0" + var2;
      }

      return var2 + ":" + var6 + ":" + var5;
   }

   static int a(int var0, int var1, int var2, int var3) {
      var0 = var2 - var0;
      var1 = var3 - var1;
      return A(var0 * var0 + var1 * var1);
   }

   static void a(int var0, int var1, int var2, int var3, int var4, int[] var5) {
      var2 -= var0;
      var3 -= var1;
      var5[0] = y(var2 * var4) + var0;
      var5[1] = y(var3 * var4) + var1;
   }

   private static boolean a(byte[] var0, short var1) {
      for (int var2 = 0; var2 < var0.length; var2++) {
         if (var0[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(short[] var0, short var1) {
      for (int var2 = 0; var2 < var0.length; var2++) {
         if (var0[var2] == var1) {
            return true;
         }
      }

      return false;
   }

   public static final boolean a(int var0, int var1, int[] var2) {
      var0 = var0 * 100 / S;
      var1 = var1 * 100 / S;
      return b(var0, var1, var2);
   }

   static int a(int var0, int var1, int var2) {
      int var3 = -1;
      int[] var4 = ((int[][])T[var0])[var1];
      switch (var0) {
         case 2:
            var3 = 15;
            break;
         case 3:
            var3 = 21 + (var2 - 1);
            break;
         case 4:
            var3 = 21 + (var2 - 1);
            break;
         case 5:
            var3 = 13;
      }

      return var4[var3];
   }

   static boolean b(int var0, int var1) {
      boolean var2 = true;
      byte var3 = -1;
      int[] var4 = ((int[][])T[var0])[var1];
      switch (var0) {
         case 2:
            var3 = 14;
            break;
         case 3:
            var3 = 20;
            break;
         case 4:
            var3 = 20;
            break;
         case 5:
            var3 = 12;
      }

      if (var3 != -1) {
         var2 = var4[var3] == 0;
      }

      return var2;
   }

   static int c(int var0, int var1) {
      byte var2 = -1;
      int[] var3 = ((int[][])T[var0])[var1];
      int var4 = 0;
      switch (var0) {
         case 1:
            var2 = 3;
            break;
         case 2:
            var2 = 11;
            var4 = bk(var1, 0);
            break;
         case 3:
            var2 = 17;
            var4 = bk(var1, 1);
            break;
         case 4:
            var2 = 17;
            var4 = bk(var1, 3);
            break;
         case 5:
            var2 = 9;
            var4 = bk(var1, 2);
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         default:
            break;
         case 13:
            var2 = 4;
      }

      return var3[var2] - (var0 = var3[var2]) * var4 / 100;
   }

   static boolean d(int var0, int var1) {
      boolean var2 = true;
      byte var3 = -1;
      int[] var4 = ((int[][])T[var0])[var1];
      switch (var0) {
         case 1:
            var2 = true;
            break;
         case 2:
            var3 = 10;
            break;
         case 3:
            var3 = 16;
            break;
         case 4:
            var3 = 16;
            break;
         case 5:
            var3 = 8;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         default:
            break;
         case 13:
            var3 = 1;
      }

      if (var3 != -1) {
         var2 = var4[var3] == 0;
      }

      return var2;
   }

   private static int g(int var0, int var1, int var2) {
      int var3 = -1;
      int[] var4 = ((int[][])T[var0])[var1];
      switch (var0) {
         case 3:
            var3 = 26 + (var2 - 1);
            break;
         case 4:
            var3 = 27 + (var2 - 1);
      }

      return var4[var3];
   }

   static int e(int var0, int var1) {
      byte var2 = -1;
      int[] var3 = ((int[][])T[var0])[var1];
      switch (var0) {
         case 3:
            var2 = 1;
            break;
         case 4:
            var2 = 1;
      }

      return var3[var2];
   }

   private static boolean s(int var0, int var1) {
      boolean var2 = true;
      byte var3 = -1;
      int[] var4 = ((int[][])T[var0])[var1];
      switch (var0) {
         case 3:
            var3 = 16;
            break;
         case 4:
            var3 = 16;
      }

      if (var3 != -1) {
         var2 = var4[16] == 0;
      }

      return var2;
   }

   private static void d(boolean var0) {
      if (o != var0) {
         o = var0;
         a var1;
         if (var0) {
            var1 = j[2][1];
         } else {
            var1 = j[2][0];
         }

         if (o) {
            d.c(48, 24);
         } else {
            d.c(96, 48);
         }

         d.a(bv, bu, bw, var1, 0);
         if (o) {
            p = d.k[0][5] << 1;
            q = d.k[0][6] << 1;
         } else {
            p = d.k[0][5];
            q = d.k[0][6];
         }

         if (var0) {
            f((m >> 1) - 200, (n >> 1) - 120);
         } else {
            f((m << 1) + 400, (n << 1) + 240);
         }

         d.d(m, n);
         d.o();

         for (int var2 = 0; var2 < q.ac.length; var2++) {
            if (q.ac[var2] != null) {
               q.ac[var2].aG = 0;
            }
         }
      }
   }

   public static void f(int var0, int var1) {
      if (m != var0 || n != var1) {
         a(var0 - m, var1 - n);
      }
   }

   public static boolean b(int var0, int var1, int[] var2) {
      return a(var0, var1, var2[0], var2[1], var2[0] + var2[2] - 1, var2[1] + var2[3] - 1);
   }

   private static void a(r var0) {
      String var1 = u(105);
      String var2 = j(b(2, var0.ar, 1), 1);
      ad[0] = var2;
      var1 = a(var1, ad, '%');
      String[] var10 = new String[7];

      for (int var3 = 0; var3 < var10.length; var3++) {
         var10[var3] = "";
      }

      int var12 = 0;

      for (int var4 = 0; var4 < 7; var4++) {
         if (var0.n(o(3)[var4][0])) {
            boolean var5 = false;
            String var6 = j(o(3)[var4][39], 1);

            for (int var7 = 0; var7 <= var12; var7++) {
               if (var10[var7].equals(var6)) {
                  var5 = true;
               }
            }

            if (!var5) {
               var10[var12] = var6;
               var12++;
            }
         }
      }

      String var13 = "";

      for (int var15 = 0; var15 < var12 - 1; var15++) {
         var13 = var13 + var10[var15] + ", ";
      }

      var13 = var13 + var10[var12 - 1];
      var2 = var13;
      var1 = var1;
      a(2, var1, 10, true, -1, "", -1, -1, true, var2);
   }

   private static void bc() {
      ch++;
   }

   private static void bd() {
      if (ch > 0) {
         ch--;
      }
   }

   private static boolean be() {
      return ch != 0;
   }

   private static void bf() {
      ci++;
   }

   private static void bg() {
      if (ci > 0) {
         ci--;
      }
   }

   static boolean w() {
      return ci != 0;
   }

   static void x() {
      cj++;
   }

   static void y() {
      if (cj > 0) {
         cj--;
      }
   }

   static boolean z() {
      return cj != 0;
   }

   private static int a(int[] var0, int var1) {
      int var2 = 0;

      for (int var3 = 4; var3 < var0.length; var3++) {
         if (var0[var3] == var1) {
            var2++;
         }
      }

      return var2;
   }

   public static void l(int var0) {
      switch (var0) {
         case 0:
            a(58);
            return;
         case 1:
            a(54);
            return;
         case 2:
            a(52);
            return;
         case 3:
            a(57);
            return;
         case 4:
            a(53);
            return;
         case 5:
            a(56);
            return;
         case 6:
            a(55);
      }
   }

   private static boolean bh() {
      return m(hD) <= 0 && n(hD) < 5 || dE();
   }

   public static void A() {
      if (!dE()) {
         cV++;
         a(hD, cV);
         if (cV >= 5) {
            cV = 0;
            a(hD, cV);
            String var0;
            var0 = (var0 = hD).substring(hD.indexOf(58) + 1);
            long var1 = -1L;

            try {
               var1 = Long.parseLong(var0);
            } catch (NumberFormatException var5) {
            }

            long var3 = var1;

            for (int var7 = 0; var7 < mi.length; var7++) {
               if (mi[var7][0] == var3) {
                  mi[var7][4] = 86400000L;
                  break;
               }
            }

            aB();
         }
      }
   }

   private static void bi() {
      for (int var0 = 0; var0 <= 0; var0++) {
         cS[0] = 0;
         cT[0] = 1200000;
         cU[0] = 10;
      }
   }

   public static boolean m(int var0) {
      return var0 == 0;
   }

   private static boolean bj() {
      if (!cY) {
         cY = true;
         String var1 = "1";
         String var0 = "IAP-EnableIAP";
         String var2;
         cX = ((var2 = GloftPDMP.b.getAppProperty(var0)) == null ? false : var2.equals(var1)) && m.a();
      }

      return cX;
   }

   private static void af(int var0) {
      dj = var0;
      bu();
      cZ = true;
      dc = -1;
      de = false;
      bl();
   }

   private static void bk() {
      cj = 0;
      b(17, false, false);
      b(13, false, false);
      b(16, false, false);
      cZ = false;
      gZ = false;
      bv();
   }

   private static void bl() {
      if (cZ) {
         do {
            dd = false;
            int var0 = dc;
            if (!de) {
               var0 = m.d();
            }

            if (var0 != dc) {
               u(dc, var0);
               t(var0, dc);
               dc = var0;
            } else {
               switch (var0) {
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                  case 7:
                  case 8:
                  case 9:
                  case 11:
                  case 12:
                  default:
                     break;
                  case 6:
                  case 10:
                     if (dg && df) {
                        dg = false;
                        de = false;
                        dh = 0L;
                     }
               }
            }
         } while (dd);
      }
   }

   private static void t(int var0, int var1) {
      di = var0;
      switch (var0) {
         case 0:
            var0 = e;
            String var14;
            switch (e) {
               case 0:
                  var14 = "EN";
                  break;
               case 1:
                  var14 = "DE";
                  break;
               case 2:
                  var14 = "FR";
                  break;
               case 3:
                  var14 = "IT";
                  break;
               case 4:
                  var14 = "ES";
                  break;
               case 5:
                  var14 = "BR";
                  break;
               case 6:
                  var14 = "PT";
                  break;
               case 7:
                  var14 = "JP";
                  break;
               case 8:
                  var14 = "CN";
                  break;
               case 9:
                  var14 = "KR";
                  break;
               case 10:
                  var14 = "RU";
                  break;
               case 11:
                  var14 = "TR";
                  break;
               case 12:
                  var14 = "PL";
                  break;
               case 13:
                  var14 = "CZ";
                  break;
               case 14:
                  var14 = "NL";
                  break;
               case 15:
                  var14 = "TH";
                  break;
               case 16:
                  var14 = "VI";
                  break;
               case 17:
                  var14 = "AR";
                  break;
               default:
                  var14 = null;
            }

            String var12 = var14;
            long var2;
            m.a(var12, var2 = cW, 0L);
            dd = true;
            return;
         case 1:
            n(false);
            return;
         case 2:
         case 8:
            de = true;
            boolean var10 = false;
            b(17, false, false);
            b(13, true, false);
            return;
         case 3:
            de = true;
            hm = m.e();
            hn = false;
            boolean var9 = false;
            b(14, true, false);
            return;
         case 4:
            return;
         case 5:
            return;
         case 6:
         case 10:
            if (var1 == -1 && dg) {
               dg = false;
               dh = 0L;
               return;
            } else {
               dg = false;
               df = true;
               de = true;
               Object var7 = null;
               int var10000 = m.a("Cash");
               var7 = false;
               if (var10000 == 0) {
                  dh = 0L;
                  dg = true;
                  df = false;
                  hm = -7;
                  hn = true;
                  b(14, true, false);
                  return;
               }

               bt();
               a(true, "Cash");
               return;
            }
         case 7:
            de = true;
            String var5 = m.h();
            ek();
            m.f();
            var1 = (int)m.i();
            y(e(var5), var1);
            if (bb > 0) {
               bC();
               bD();
               bB();
               ay();
               bb = 0;
            }

            boolean var6 = false;
            b(16, false, false);
            b(12, true, false);
            return;
         case 9:
            n(true);
            return;
         case 11:
            de = true;
            boolean var4 = false;
            b(15, false, false);
            hm = m.e();
            hn = true;
            b(14, true, false);
            return;
         case 12:
            if (var1 != 1) {
               n(false);
            }
      }
   }

   private static void u(int var0, int var1) {
      switch (var0) {
         case 0:
            return;
         case 1:
            if (var1 == 12) {
               return;
            }
         case 12:
            b(15, false, false);
            break;
         case 2:
         case 8:
            if (var1 != 7) {
               b(13, false, false);
               b(16, false, false);
               return;
            }
            break;
         case 3:
            b(14, false, false);
            return;
         case 4:
            return;
         case 5:
            return;
         case 6:
         case 10:
            return;
         case 7:
            b(13, false, false);
            b(16, false, false);
            return;
         case 9:
            b(15, false, false);
            return;
         case 11:
            return;
      }
   }

   private static void bm() {
      bk();
      bu();
      a(false, "Coin");
   }

   private static void bn() {
      switch (dj) {
         case 1:
            bk();
            if (i == 6) {
               lq = true;
               ls = 13;
               b(22, true, false);
               b(64, true, false);
               b(76, true, false);
               P(kn, ko);
               return;
            }

            aH();
            return;
         case 2:
            bm();
            return;
         default:
            de = false;
      }
   }

   private static void bo() {
      u(dc, 1);
      t(1, dc);
      dc = 1;
      dk = 0;
      de = true;
   }

   private static void e(boolean var0) {
      if (var0) {
         bo();
      } else {
         df = true;
      }
   }

   private static void bp() {
      if (m.j() == 7) {
         String var0 = u(7245);
         a(2, var0, 19);
      } else {
         bq();
      }
   }

   private static void bq() {
      de = false;
      if (System.currentTimeMillis() - oa > 3000L) {
         oa = System.currentTimeMillis();
         m.c();
      }
   }

   private static void br() {
      if (dj == 2) {
         de = false;
      } else {
         bn();
      }
   }

   private static String bs() {
      String var0 = c("Coin");
      if ("".equals(var0)) {
         var0 = c("Cash");
      }

      return var0;
   }

   private static String c(String var0) {
      String var3 = null;
      int var1 = m.a(var0);

      for (int var2 = 0; var2 < var1; var2++) {
         String var4 = var0;
         var3 = false;
         if ((var3 = m.c(m.b(var2, var4))) != null && !"".equals(var3)) {
            if ("cc_2d".equals(var3)) {
               return "cc_2d";
            }

            return var3;
         }
      }

      return "";
   }

   private static String d(String var0) {
      String var3 = null;
      int var1 = m.a(var0);

      for (int var2 = 0; var2 < var1; var2++) {
         String var4 = var0;
         var3 = false;
         if ((var3 = m.d(m.b(var2, var4))) != null && var3 != "") {
            return var3;
         }
      }

      return "";
   }

   private static String a(long var0) {
      return var0 <= 9L ? "0" + var0 : "" + var0;
   }

   private static long bt() {
      System.currentTimeMillis();
      dh = -1L;
      if (-1L <= 0L) {
         dh = 0L;
      }

      if (m.a("Cash") == 0) {
         dh = 0L;
      }

      return dh;
   }

   private static void bu() {
      aQ();
      if (cG == 0) {
         cH = true;
      }

      cG++;
   }

   private static void bv() {
      aR();
      if (--cG == 0) {
         cH = true;
      }

      if (cG < 0) {
         cG = 0;
      }
   }

   private static int v(int var0, int var1) {
      return b(12, var0, 0 + (var1 << 1));
   }

   private static int w(int var0, int var1) {
      return b(12, var0, 0 + (var1 << 1) + 1);
   }

   private static void a(String var0, boolean var1, int var2) {
      if (var1) {
         af(var2);
      } else {
         bu();
         a(false, var0);
      }
   }

   private static int e(String var0) {
      return var0 == "Coin" ? 0 : 1;
   }

   private static int x(int var0, int var1) {
      var0 = v(var0, var1);
      var1 = ag(var1 + 1 & 1);
      return var0 - var1;
   }

   private static int ag(int var0) {
      switch (var0) {
         case 0:
            return ab.e[1];
         case 1:
            return ab.e[3];
         default:
            return 0;
      }
   }

   private static void y(int var0, int var1) {
      switch (var0) {
         case 0:
            if (var1 > 0) {
               g(var1);
               return;
            }

            S(-var1);
            return;
         case 1:
            if (var1 > 0) {
               h(var1);
               return;
            } else {
               b(-var1, true);
            }
      }
   }

   public static void a(a var0, int var1, int var2, int var3) {
      if (var0 != null && var1 >= 0) {
         if (dm != -1 && dm < 300) {
            byte var4;
            if (o) {
               var4 = 2;
               var2 >>= 1;
               var3 >>= 1;
            } else {
               var4 = 1;
            }

            dn[dm] = var0.d(var1) / var4 + var2;
            do_array[dm] = var0.e(var1) / var4 + var3;
            dp[dm] = var0.b(var1) / var4;
            dq[dm] = var0.c(var1) / var4;
            dm++;
         }
      }
   }

   static int n(int var0) {
      int[][] var1 = o(2);

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2][0] == var0) {
            return var2;
         }
      }

      return -1;
   }

   private static int ah(int var0) {
      int[][] var1 = o(5);

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2][0] == var0) {
            return var2;
         }
      }

      return -1;
   }

   private static int ai(int var0) {
      int[][] var1 = o(4);

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2][0] == var0) {
            return var2;
         }
      }

      return -1;
   }

   private static int aj(int var0) {
      int[][] var1 = o(13);

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2][0] == var0) {
            return var2;
         }
      }

      return -1;
   }

   private static int ak(int var0) {
      int[][] var1 = o(3);

      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var1[var2][0] == var0) {
            return var2;
         }
      }

      return -1;
   }

   static int[][] o(int var0) {
      return var0 < 0 ? null : (int[][])T[var0];
   }

   private static int[] z(int var0, int var1) {
      return o(var0)[var1];
   }

   static int b(int var0, int var1, int var2) {
      return o(var0)[var1][var2];
   }

   private static void bw() {
      for (int var0 = 0; var0 < V; var0++) {
         if (X[var0] != null) {
            X[var0].V();
         }
      }
   }

   private static void b(byte[] var0, int var1, byte var2) {
      var0[var1] |= var2;
   }

   private static void bx() {
      dB = new byte[bu.length];

      for (int var0 = 0; var0 < bu.length; var0++) {
         if (bu[var0] == 8 || bu[var0] == 15) {
            dB[var0] = (byte)(bu[var0] & 15 | (bw[var0] & 15) << 4);
         }
      }
   }

   private static void by() {
      byte[] var0 = new byte[bs * bt];
      if (cc != null) {
         for (int var1 = 0; var1 < cc.length; var1++) {
            int var2 = cc[var1] & 65535;
            int var3 = cc[var1] >> 16 & 65535;
            q.j(var2, var3);
            int var4 = var2 / 96;
            var3 /= 48;
            if (var2 % 96 == 0) {
               b(var0, var4 + var3 * bs, dx);
               b(var0, var4 + (var3 - 1) * bs, dz);
            } else {
               b(var0, var4 + var3 * bs, dy);
               b(var0, var4 + 1 + var3 * bs, dA);
            }
         }
      }

      for (int var5 = 0; var5 < bu.length; var5++) {
         if ((dB[var5] & 15) == 8 && (var0[var5] & 15) != 0) {
            if (dB[var5] >> 4 != 0) {
               var0[var5] = (byte)(var0[var5] | 3);
            } else {
               var0[var5] = (byte)(var0[var5] | 9);
            }

            if (var0[var5] == 15) {
               bu[var5] = 116;
            } else {
               bw[var5] = 0;
            }
         }

         if ((dB[var5] & 15) == 15 && (var0[var5] & 15) != 0) {
            if (dB[var5] >> 4 != 0) {
               var0[var5] = (byte)(var0[var5] | 6);
            } else {
               var0[var5] = (byte)(var0[var5] | 12);
            }

            if (var0[var5] == 15) {
               bu[var5] = 117;
            } else {
               bw[var5] = 0;
            }
         }

         if ((var0[var5] & 15) == 0 && bu[var5] >= 95) {
            if (dB[var5] != 0) {
               bu[var5] = (byte)(dB[var5] & 15);
               bw[var5] = (byte)(dB[var5] >> 4 & 15);
            } else {
               bu[var5] = 1;
            }
         }

         if ((var0[var5] & 15) != 0 && bu[var5] < 110) {
            bu[var5] = (byte)((var0[var5] & 15) + 95 - 1);
         }
      }
   }

   private static void a(q[] var0, int var1, int var2) {
      while (true) {
         int var3 = var1;
         int var4 = var2;
         int var5 = var0[var1 + var2 >> 1].ax;

         do {
            while (var0[var3] == null || var3 < var2 && var0[var3].ax < var5) {
               var3++;
            }

            while (var0[var4] == null || var4 > var1 && var0[var4].ax > var5) {
               var4--;
            }

            if (var3 <= var4) {
               q var6 = var0[var3];
               var0[var3] = var0[var4];
               var0[var4] = var6;
               var3++;
               var4--;
            }
         } while (var3 < var4);

         if (var1 < var4) {
            a(var0, var1, var4);
         }

         if (var2 <= var3) {
            return;
         }

         var1 = var3;
         var0 = var0;
      }
   }

   private static void a(q var0) {
      if (U < 400) {
         var0.S();
         W[U++] = var0;
      }
   }

   private static void bz() {
      for (int var0 = 0; var0 < U; var0++) {
         if (W[var0] != null) {
            boolean var1 = false;

            for (int var2 = 0; var2 < Z; var2++) {
               if (aa[var2] == W[var0] && aa[var2] instanceof v) {
                  q.a(j[3][53], ((v)aa[var2]).bg, aa[var2].av, aa[var2].aw, 0);
                  var1 = true;
               }
            }

            if (!var1) {
               if (W[var0].aI == 2) {
                  W[var0].V();
               } else if (W[var0].aI == 5 && W[var0].ay == null) {
                  W[var0].V();
               }
            }
         }
      }
   }

   static void B() {
      for (int var0 = 0; var0 < U; var0++) {
         if (W[var0] != null && W[var0].T() && W[var0].T()) {
            W[var0].P();
         }
      }
   }

   public static void C() {
      du = 0;

      for (int var0 = 0; var0 < U; var0++) {
         q var1;
         if ((var1 = W[var0]) != null && var1.T()) {
            switch (var1.aI) {
               case 0:
               case 1:
               default:
                  break;
               case 2:
                  if (!var1.T() || var1.aP == 2) {
                     break;
                  }

                  b(var1);
                  if (((v)var1).bf != null) {
                     ((v)var1).ab();
                     dv[du] = var1;
                     du++;
                  }

                  ((v)var1).ac();
                  dv[du] = var1;
                  du++;

                  for (int var2 = 0; var2 < ((v)var1).aW; var2++) {
                     if (((v)var1).aV[var2] != null) {
                        dv[du] = ((v)var1).aV[var2];
                        du++;
                     }
                  }
                  break;
               case 3:
                  if (var1.T()) {
                     var1.M();
                     dv[du] = var1;
                     du++;
                  }
                  break;
               case 4:
                  var1.M();
                  break;
               case 5:
                  if (var1.T() && var1.aP != 2) {
                     b(var1);
                     if (((v)var1).bf != null) {
                        ((v)var1).ab();
                        dv[du] = var1;
                        du++;
                     }

                     ((v)var1).ac();
                     dv[du] = var1;
                     du++;
                  }
            }
         }
      }
   }

   static void D() {
      du = 0;

      for (int var0 = 0; var0 < U; var0++) {
         q var1;
         if ((var1 = W[var0]) != null && var1.T()) {
            if (var1 instanceof v && ((v)var1).be != null) {
               ((v)var1).aa();
               if (!((v)var1).bd) {
                  ((v)var1).bd = true;
               }
            }

            switch (var1.aI) {
               case 0:
               case 1:
               default:
                  break;
               case 2:
                  if (var1.T() && b(var1)) {
                     if (((v)var1).bf != null) {
                        ((v)var1).ab();
                        dv[du] = var1;
                        du++;
                     }

                     ((v)var1).ac();
                  }
                  break;
               case 3:
                  if (var1.T() && b(var1)) {
                     var1.M();
                     dv[du] = var1;
                     du++;
                  }
                  break;
               case 4:
                  if (b(var1)) {
                     var1.M();
                     dv[du] = var1;
                     du++;
                  }
                  break;
               case 5:
                  if (var1.T() && b(var1)) {
                     ((v)var1).X();
                     ((v)var1).ac();
                     dv[du] = var1;
                     du++;
                  }
                  break;
               case 6:
               case 7:
               case 8:
                  if (var1.T()) {
                     var1.O();
                     dv[du] = var1;
                     du++;
                  }
                  break;
               case 9:
                  var1.N();
            }
         }
      }
   }

   static void E() {
      du = 0;

      for (int var0 = 0; var0 < U; var0++) {
         q var1;
         if ((var1 = W[var0]) != null && var1.au == 15) {
            q.a(var1.ay);
            var1.ay.g();
            dv[du] = var1;
            du++;
         }
      }
   }

   private static boolean b(q var0) {
      var0.U();
      int var1 = 0;

      for (int var5 = 0; var5 < du; var5++) {
         q var2;
         (var2 = dv[var5]).U();
         int[] var4 = dw;
         int[] var3 = var0.aH;
         int[] var12 = var2.aH;
         boolean var20;
         if (var2.aH[2] < var3[0]) {
            var20 = 0;
         } else if (var12[0] > var3[2]) {
            var20 = 0;
         } else if (var12[3] < var3[1]) {
            var20 = 0;
         } else if (var12[1] > var3[3]) {
            var20 = 0;
         } else {
            if (var12[0] < var3[0]) {
               var4[0] = var3[0];
            } else {
               var4[0] = var12[0];
            }

            if (var12[2] < var3[2]) {
               var4[2] = var12[2];
            } else {
               var4[2] = var3[2];
            }

            if (var12[1] < var3[1]) {
               var4[1] = var3[1];
            } else {
               var4[1] = var12[1];
            }

            if (var12[3] < var3[3]) {
               var4[3] = var12[3];
            } else {
               var4[3] = var3[3];
            }

            var20 = 1;
         }

         if (var20) {
            var1 = dw[0] - 8 - 15;
            int var13 = dw[1] - 8 - 15;
            int var15 = dw[2] + 8 + 35;
            int var18 = dw[3] + 8 + 35;
            int var10003 = var15 - var1;
            int var9 = var18 - var13;
            int var8 = var10003;
            int var7 = var13;
            b(am, var1, var7, var8, var9);
            if ((!(var0 instanceof v) || ((v)var0).aP != 2 && ((v)var0).aP != 1) && var0.T()) {
               if (var0.aP != 3 && var0.aP != 2) {
                  var0.Z();
               } else {
                  q.a(j[3][53], ((v)var0).bg, var0.av, var0.aw);
               }
            }

            if (((v)var0).be != null) {
               ((v)var0).aa();
               if (!((v)var0).bd) {
                  ((v)var0).bd = true;
               }
            }

            b(am, 0, 0, 800, 480);
            if (N) {
               bl(255, 0);
               var20 = var1 + 1;
               int var10001 = var13 + 1;
               int var10002 = var15 - var1 - 2;
               int var19 = var18 - var13 - 2;
               int var16 = var10002;
               int var17 = var16;
               int var14 = var10001;
               var1 = var20;
               d(am, var1, var14, var17, var19);
            }

            var1 = 1;
         }
      }

      return (boolean)var1;
   }

   public static int c(int var0, int var1, int var2) {
      var0 = am(var0);
      short[][] var5 = dC[var0];

      for (int var3 = 0; var3 < var5.length; var3++) {
         if (var5[var3][0] == 1 && var5[var3][7] == var1) {
            return var5[var3][var2];
         }
      }

      return -1;
   }

   public static boolean g(int var0, int var1) {
      return c(var0, var1, 11) == 1;
   }

   public static int h(int var0, int var1) {
      return c(var0, var1, 12);
   }

   public static int i(int var0, int var1) {
      return c(var0, var1, 13);
   }

   public static int p(int var0) {
      var0 = am(var0);
      return dC[var0][al(var0)][9];
   }

   public static int q(int var0) {
      var0 = am(var0);
      return dC[var0][al(var0)][11];
   }

   public static int r(int var0) {
      var0 = am(var0);
      return dC[var0][al(var0)][12];
   }

   public static int s(int var0) {
      var0 = am(var0);
      return dC[var0][al(var0)][6];
   }

   public static int t(int var0) {
      var0 = am(var0);
      return dC[var0][al(var0)][7];
   }

   private static int al(int var0) {
      short[][] var2 = dC[var0];

      for (int var1 = 0; var1 < var2.length; var1++) {
         if (var2[var1][0] == 2) {
            return var1;
         }
      }

      return -1;
   }

   private static int am(int var0) {
      for (int var1 = 0; var1 < dC.length; var1++) {
         for (int var2 = 0; var2 < dC[var1].length; var2++) {
            if (dC[var1][var2][0] == 2) {
               if (dC[var1][var2][5] == var0) {
                  return var1;
               }
               break;
            }
         }
      }

      return -1;
   }

   private static void e(int var0, int var1, int var2, int var3) {
      var0 = var0;
      short var10 = dE[var0][var1];

      for (int var8 = 0; var8 < dD[var10].length; var8++) {
         short var11 = dD[var10][var8][0];
         short var4 = dD[var10][var8][1];
         short var5 = dD[var10][var8][2];
         short var6 = dD[var10][var8][3];
         short var7 = dD[var10][var8][4];
         j[4][var11].m(var5);
         j[4][var11].a(am, var4, var2 + var6, var3 + var7, 0);
      }
   }

   static w a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      w var13 = null;
      if (var0 == 0) {
         (var13 = new w()).d = 3;
         var13.e = new int[22];
         var13.e[0] = w.a(ab, 3) + 1;
         var13.e[1] = var1;
         var13.e[2] = var2;
         var13.e[3] = var3;
         var13.e[4] = var4;
         var13.e[5] = var5;
         var13.e[6] = var6;
         var13.e[7] = var7;
         var13.e[8] = var8;
         var13.e[9] = var9;
         var13.e[10] = var10;
         var13.e[11] = var11;
         var13.e[12] = var12;
         var13.e[13] = -1;
         var13.e[14] = -1;
         var13.e[15] = -1;
         var13.e[16] = 0;
         var13.e[17] = 0;
         var13.e[18] = 0;
         var13.e[20] = q.f(var11 + 48, var12);
         var13.e[21] = q.g(var11, var12 + 24);
         var13.c = 0;
         ab.b(var13);
         j();
      }

      return var13;
   }

   static w a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      w var11 = null;
      if (var0 == 0) {
         (var11 = new w()).d = 4;
         var11.e = new int[13];
         var11.e[0] = w.a(ab, 4) + 1;
         var11.e[1] = var1;
         var11.e[2] = var2;
         var11.e[3] = var3;
         var11.e[4] = var4;
         var11.e[5] = var5;
         var11.e[6] = var6;
         var11.e[7] = var7;
         var11.e[8] = var8;
         var11.e[9] = var9;
         var11.e[10] = var10;
         var11.e[11] = q.f(var9 + 48, var10);
         var11.e[12] = q.g(var9, var10 + 24);
         var11.c = 0;
         ab.b(var11);
         j();
      }

      return var11;
   }

   static w a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
      w var14 = null;
      if (var0 == 0) {
         (var14 = new w()).d = 2;
         var14.e = new int[17];
         var14.e[0] = w.a(ab, 2) + 1;
         var14.e[1] = var1;
         var14.e[2] = var13;
         var14.e[3] = var2;
         var14.e[4] = var12;
         var14.e[5] = -1;
         var14.e[12] = var9;
         var14.e[6] = var3;
         var14.e[7] = var4;
         var14.e[8] = var5;
         var14.e[9] = var6;
         var14.e[10] = var7;
         var14.e[11] = var8;
         var14.e[13] = var10;
         var14.e[14] = var11;
         var14.e[6] = var3;
         var14.c = 0;
         ab.b(var14);
         j();
      }

      return var14;
   }

   private static void bA() {
      bB();
      bC();
      bD();
   }

   private static void bB() {
      for (int var0 = 0; var0 < q.af[0][2].length; var0++) {
         if (q.af[0][2][var0] != null && ((v)q.af[0][2][var0]).bh != null) {
            ((v)q.af[0][2][var0]).aw();
         }
      }
   }

   private static void bC() {
      for (int var0 = 0; var0 < q.af[0][1].length; var0++) {
         if (q.af[0][1][var0] != null && ((v)q.af[0][1][var0]).bh != null) {
            ((v)q.af[0][1][var0]).ax();
         }
      }
   }

   private static void bD() {
      for (int var0 = 0; var0 < q.af[0][0].length; var0++) {
         if (q.af[0][0][var0] != null && ((r)q.af[0][0][var0]).bg != null) {
            ((r)q.af[0][0][var0]).aq();
         }
      }
   }

   private static void A(int var0, int var1) {
      String var6;
      switch (var0) {
         case 0:
            var6 = "/EN";
            break;
         default:
            var6 = "/EN";
      }

      String var7 = var6;
      int var2 = eg();
      b(var7);
      int var3 = var1;
      int var4;
      if (nA != null && (var4 = nA[var3]) != -1) {
         if (nE[var4] != null) {
            for (int var5 = 0; var5 < nC[var4]; var5++) {
               nE[var4][var5] = null;
            }

            nE[var4] = null;
         }

         nD[var4] = null;
         nB[var4] = null;
         nC[var4] = 0;
         nA[var3] = -1;
      }

      if (nA == null) {
         nA = new int[32];

         for (int var8 = 0; var8 < 32; var8++) {
            nA[var8] = -1;
         }

         nB = new byte[32][];
         nD = new int[32][];
         nC = new int[32];
         nE = new String[32][];
      }

      var0 = var1;
      bE(var1);
      nA[var0] = e(ng);
      v(true);
      var3 = nA[var0];
      if (nC[var3] != 0) {
         String[] var11 = new String[nC[var3]];

         for (int var12 = 0; var12 < nC[var3]; var12++) {
            var11[var12] = bH(var12 + (var3 << 10));
         }

         nE[var3] = var11;
         nD[var3] = null;
         nB[var3] = null;
         System.gc();
      }

      if (var0 == 11) {
         eg();
      } else if (var0 == 8) {
         ac = eg() - var2;
      } else if (var0 == 12) {
         dG = eg() - var2;
      }

      new StringBuffer().append("text se =").append(eg()).toString();
   }

   private static void bE() {
      int var0;
      String var1;
      if ((var1 = u(12288)) != null && (var0 = var1.indexOf(37)) != -1) {
         dH = var1.substring(0, var0) + GloftPDMP.b.getAppProperty("MIDlet-Version") + var1.substring(var0 + 1);
      }
   }

   public static String u(int var0) {
      return j(var0 - (var0 >> 10 << 10), var0 >> 10);
   }

   public static String j(int var0, int var1) {
      return bH((var1 << 10) + var0 % 2048);
   }

   private static String f(String var0) {
      char[] var1 = new char[var0.length()];
      var0.getChars(0, var0.length(), var1, 0);
      int var2 = var1.length;
      char[] var10 = var1;
      char var3 = '\u0000';
      char var4 = '\u0000';
      char var5 = '\u0000';
      char var6 = '\u0000';
      char var7 = 3;

      for (int var8 = 0; var8 < var2; var8++) {
         var3 = var10[var8];
         if ((var5 = var10[var8] >= 1569 && var10[var8] <= of ? oe[var10[var8] - 1569][0] : '\u0003') != 5) {
            var4 = '\u0000';
            var6 = '\u0003';

            for (int var9 = var8 + 1; var9 < var2; var9++) {
               if ((var10[var9] >= 1569 && var10[var9] <= of ? oe[var10[var9] - 1569][0] : '\u0003') != 5) {
                  var4 = var10[var9];
                  var6 = var10[var9] >= 1569 && var10[var9] <= of ? oe[var10[var9] - 1569][0] : '\u0003';
                  break;
               }
            }

            switch (var5) {
               case '\u0001':
                  if (var7 != 0 && var7 != 2 && var7 != 4) {
                     var10[var8] = oe[var3 - 1569][1];
                  } else {
                     var10[var8] = (char)(oe[var3 - 1569][1] + 1);
                  }
                  break;
               case '\u0002':
                  label155: {
                     if (var3 == 1604) {
                        boolean var15 = false;
                        if (var8 < var2 + 1) {
                           switch (var4) {
                              case 'آ':
                                 var15 = true;
                                 if (var7 != 0 && var7 != 2 && var7 != 4) {
                                    var10[var8] = 'ﻵ';
                                    break;
                                 }

                                 var10[var8] = 'ﻶ';
                                 break;
                              case 'أ':
                                 var15 = true;
                                 if (var7 != 0 && var7 != 2 && var7 != 4) {
                                    var10[var8] = 'ﻷ';
                                 } else {
                                    var10[var8] = 'ﻸ';
                                 }
                              case 'ؤ':
                              case 'ئ':
                              default:
                                 break;
                              case 'إ':
                                 var15 = true;
                                 if (var7 != 0 && var7 != 2 && var7 != 4) {
                                    var10[var8] = 'ﻹ';
                                    break;
                                 }

                                 var10[var8] = 'ﻺ';
                                 break;
                              case 'ا':
                                 var15 = true;
                                 if (var7 != 0 && var7 != 2 && var7 != 4) {
                                    var10[var8] = 'ﻻ';
                                 } else {
                                    var10[var8] = 'ﻼ';
                                 }
                           }
                        }

                        if (var15) {
                           var10[var8 + 1] = 31;
                           break label155;
                        }
                     }

                     if (var7 != 0 && var7 != 2 && var7 != 4) {
                        if (var6 != 1 && var6 != 2 && var6 != 4) {
                           var10[var8] = oe[var3 - 1569][1];
                        } else {
                           var10[var8] = (char)(oe[var3 - 1569][1] + 2);
                        }
                     } else if (var6 != 1 && var6 != 2 && var6 != 4) {
                        var10[var8] = (char)(oe[var3 - 1569][1] + 1);
                     } else {
                        var10[var8] = (char)(oe[var3 - 1569][1] + 3);
                     }
                  }
               case '\u0003':
               case '\u0004':
            }

            var7 = var5;
         }
      }

      return String.valueOf(var1);
   }

   private static String an(int var0) {
      String var5;
      if (var0 >= 1000000) {
         var5 = u(318);
         boolean var2 = false;
         int var3 = var0 / 1000000;
         String var4;
         if ((var4 = Integer.toString(var0 % 1000000 / 10000)).length() == 1) {
            var4 = "0" + var4;
         }

         if (var4.length() == 2 && var4.charAt(1) == '0') {
            if (var4.charAt(0) == '0') {
               var2 = true;
               var5 = a(a(a(var5, "#", ""), ",", ""), ".", "");
            } else {
               var4 = "" + var4.charAt(0);
            }
         }

         ad[0] = a((long)var3, e, " ");
         var5 = a(var5, ad, '%');
         if (!var2) {
            ad[0] = var4;
            var5 = a(var5, ad, '#');
         }
      } else {
         var5 = a((long)var0, e, " ");
      }

      return var5;
   }

   private static String a(String var0, String var1, String var2) {
      StringBuffer var3 = new StringBuffer();
      int var4 = 0;

      while ((var4 = var0.indexOf(var1)) != -1) {
         var3.append(var0.substring(0, var4) + var2);
         var0 = var0.substring(var4 + var1.length());
      }

      var3.append(var0);
      return var3.toString();
   }

   private static String b(long var0) {
      return a(var0, e, " ");
   }

   static String a(String var0, String[] var1, char var2) {
      int var3 = 0;
      String var4 = "";

      for (int var5 = 0; var5 < var0.length(); var5++) {
         if (var0.charAt(var5) == var2) {
            var4 = var4 + var1[var3];
            var3++;
         } else {
            var4 = var4 + var0.charAt(var5);
         }
      }

      return var4;
   }

   private static String ao(int var0) {
      int var4;
      int var1 = (var4 = var0) / 3600000;
      int var2 = (var0 = var4 - var1 * 3600000) / 60000;
      var0 = (var0 - var2 * 60000) / 1000;
      String var8 = "" + var1;
      String var9 = var2 >= 10 ? "" + var2 : "0" + var2;
      String var7 = var0 >= 10 ? "" + var0 : "0" + var0;
      String var3 = "";
      if (e == 17) {
         var3 = var3 + var8 + " : ";
      } else {
         var3 = var3 + var8 + ":";
      }

      if (e == 17) {
         var3 = var3 + var9 + " : ";
      } else {
         var3 = var3 + var9 + ":";
      }

      return var3 + var7;
   }

   private static boolean g(String var0) {
      int var1 = var0.length();

      for (int var2 = 0; var2 < var1; var2++) {
         char var3;
         if ((var3 = var0.charAt(var2)) >= 1536 && var3 <= 1791
            || var3 >= 1872 && var3 <= 1919
            || var3 >= 'ﭐ' && var3 <= '﷿'
            || var3 >= 'ﹰ' && var3 <= '\ufeff') {
            return true;
         }
      }

      return false;
   }

   private static int ap(int var0) {
      return dT[var0].length - 2;
   }

   static final boolean F() {
      return ab.e[10] == 1;
   }

   private static void bF() {
      ab.e[10] = 1;
      b(22, true, false);
      b(64, true, false);
      aA();
      q.c(z, 5);
      b(69, true, false);
   }

   private static void bG() {
      for (int var0 = 0; var0 < dU.length; var0++) {
         dU[var0] = -1;
      }

      dM = 0;
      dV = 0;
      dN = 0;
      dJ = 0;
      dI = 1000;
      int[] var13 = new int[150];
      int[] var2 = new int[150];
      int[] var3 = new int[150];
      int[][] var1 = new int[150][10];
      int var4 = -1;
      int var5 = -1;
      b("/16");
      byte[] var6 = B(0);
      v(true);
      int var7 = 0;
      if (var6.length > 0) {
         while (var7 < var6.length) {
            byte var8 = var6[var7];
            var7 += 1 + at(var8);
            switch (var8) {
               case 1:
                  var4++;
                  var5 = -1;
                  var13[var4] = 0;
                  var2[var4] = 0;
                  var3[var4] = 0;
                  break;
               case 2:
                  var5++;
                  var13[var4]++;
                  var1[var4][var5] = 0;
                  break;
               case 10:
               case 11:
               case 12:
                  var3[var4]++;
                  break;
               case 15:
               case 16:
                  var2[var4]++;
               case 100:
               case 126:
                  break;
               default:
                  var1[var4][var5]++;
            }
         }
      }

      dQ = new int[dI = var4 + 1][];
      dT = new int[dI][][];

      for (int var21 = 0; var21 < dI; var21++) {
         dT[var21] = new int[var13[var21]][];
      }

      dR = new int[dI][][];

      for (int var22 = 0; var22 < dI; var22++) {
         dR[var22] = new int[var2[var22]][];
      }

      dS = new int[dI][][];

      for (int var23 = 0; var23 < dI; var23++) {
         dS[var23] = new int[var3[var23]][];
      }

      dZ = new int[dI][][][];

      for (int var24 = 0; var24 < dI; var24++) {
         dZ[var24] = new int[var13[var24]][][];

         for (int var18 = 0; var18 < var13[var24]; var18++) {
            dZ[var24][var18] = new int[var1[var24][var18]][];
         }
      }

      var4 = -1;
      var5 = -1;
      int var15 = -1;
      int var19 = -1;
      int var20 = -1;
      var7 = 0;
      if (var6.length > 0) {
         while (var7 < var6.length) {
            byte var39;
            switch (var39 = var6[var7]) {
               case -29:
               case -28:
               case -27:
               case -26:
               case -25:
               case -24:
               case -23:
               case -22:
               case -21:
               case -20:
               case -18:
               case -17:
               case -16:
               case -15:
               case -14:
               case -13:
               case -12:
               case -11:
               case -10:
               case -9:
               case -8:
               case -7:
               case -6:
               case -5:
               case -4:
               case 101:
               case 102:
               case 103:
               case 104:
               case 105:
               case 106:
               case 107:
               case 109:
               case 110:
               case 111:
               case 112:
               case 113:
               case 114:
               case 115:
               case 116:
               case 117:
               case 118:
                  dZ[var4][var5][++var15] = new int[6];
                  int[] var10002 = dZ[var4][var5][var15];
                  int var11 = var5;
                  int var10 = var4;
                  int[] var101 = var10002;
                  var39 = var7;
                  byte[] var38 = var6;
                  var39 = a(var6, var39, var101);
                  var101[1] = 0;
                  var101[5] = var38[var39] & 255;
                  var39++;
                  switch (var101[0]) {
                     case -29:
                     case -28:
                     case -27:
                     case -24:
                     case -23:
                     case -22:
                     case -21:
                     case -20:
                     case -17:
                     case -16:
                     case -14:
                     case -13:
                     case -8:
                     case -7:
                     case -5:
                     case 106:
                     case 107:
                     case 108:
                     case 113:
                     case 116:
                     case 117:
                     case 118:
                        var101[2] = var38[var39] & 255;
                        var39++;
                        var101[3] = -1;
                        break;
                     case -26:
                     case -9:
                     case -6:
                     case -4:
                     case 109:
                        var101[2] = var38[var39] & 255;
                        var101[3] = var38[++var39] & 255;
                        var39++;
                        break;
                     case -25:
                     case -15:
                     case -11:
                     case 102:
                     case 103:
                     case 105:
                     case 110:
                     case 112:
                     case 114:
                     case 115:
                        var101[2] = -1;
                        var101[3] = -1;
                     case -19:
                     case -3:
                     case -2:
                     case -1:
                     case 0:
                     case 1:
                     case 2:
                     case 3:
                     case 4:
                     case 5:
                     case 6:
                     case 7:
                     case 8:
                     case 9:
                     case 10:
                     case 11:
                     case 12:
                     case 13:
                     case 14:
                     case 15:
                     case 16:
                     case 17:
                     case 18:
                     case 19:
                     case 20:
                     case 21:
                     case 22:
                     case 23:
                     case 24:
                     case 25:
                     case 26:
                     case 27:
                     case 28:
                     case 29:
                     case 30:
                     case 31:
                     case 32:
                     case 33:
                     case 34:
                     case 35:
                     case 36:
                     case 37:
                     case 38:
                     case 39:
                     case 40:
                     case 41:
                     case 42:
                     case 43:
                     case 44:
                     case 45:
                     case 46:
                     case 47:
                     case 48:
                     case 49:
                     case 50:
                     case 51:
                     case 52:
                     case 53:
                     case 54:
                     case 55:
                     case 56:
                     case 57:
                     case 58:
                     case 59:
                     case 60:
                     case 61:
                     case 62:
                     case 63:
                     case 64:
                     case 65:
                     case 66:
                     case 67:
                     case 68:
                     case 69:
                     case 70:
                     case 71:
                     case 72:
                     case 73:
                     case 74:
                     case 75:
                     case 76:
                     case 77:
                     case 78:
                     case 79:
                     case 80:
                     case 81:
                     case 82:
                     case 83:
                     case 84:
                     case 85:
                     case 86:
                     case 87:
                     case 88:
                     case 89:
                     case 90:
                     case 91:
                     case 92:
                     case 93:
                     case 94:
                     case 95:
                     case 96:
                     case 97:
                     case 98:
                     case 99:
                     case 100:
                     default:
                        break;
                     case -18:
                     case -10:
                     case 101:
                        var101[2] = var38[var39] & 255;
                        var101[3] = var38[++var39] & 255;
                        var101[4] = var38[++var39] & 255;
                        var39++;
                        break;
                     case -12:
                     case 111:
                        var101[2] = c(var38, var39);
                        var39 += 4;
                        var101[3] = var38[var39] & 255;
                        var39++;
                        break;
                     case 104:
                        var101[2] = b(var38, var39);
                        var39 += 2;
                        var101[3] = -1;
                  }

                  switch (var101[0]) {
                     case -12:
                     case 111:
                        dT[var10][var11][12] = var101[2];
                     default:
                        var7 = var39;
                        continue;
                  }
               case -19:
               case -3:
               case 0:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 13:
               case 14:
               case 17:
               case 18:
               case 19:
               case 54:
               case 55:
               case 56:
               case 57:
               case 58:
               case 59:
               case 60:
               case 61:
               case 62:
               case 63:
               case 64:
               case 65:
               case 66:
               case 67:
               case 68:
               case 69:
               case 70:
               case 71:
               case 72:
               case 73:
               case 74:
               case 75:
               case 76:
               case 77:
               case 78:
               case 79:
               case 80:
               case 81:
               case 82:
               case 83:
               case 84:
               case 85:
               case 86:
               case 87:
               case 88:
               case 89:
               case 90:
               case 91:
               case 92:
               case 93:
               case 94:
               case 95:
               case 96:
               case 97:
               case 98:
               case 99:
               case 108:
               case 119:
               case 120:
               case 121:
               case 122:
               case 123:
               case 124:
               case 125:
               default:
                  var7 += 1 + at(var39);
                  break;
               case -2:
               case -1:
                  dZ[var4][var5][++var15] = new int[3];
                  int[] var100 = dZ[var4][var5][var15];
                  var39 = var7;
                  byte[] var37 = var6;
                  var39 = a(var6, var39, var100);
                  var100[1] = 2;
                  switch (var100[0]) {
                     case -2:
                        var100[2] = var37[var39];
                        var39++;
                        break;
                     case -1:
                        var100[2] = -1;
                  }

                  var7 = var39;
                  break;
               case 1:
                  var4++;
                  var5 = -1;
                  var15 = -1;
                  var19 = -1;
                  var20 = -1;
                  dQ[var4] = new int[15];
                  int[] var99 = dQ[var4];
                  var39 = var7;
                  byte[] var36 = var6;
                  var39 = a(var6, var39, var99);
                  var99[1] = b(var36, var39);
                  var39 += 2;
                  var99[5] = b(var36, var39);
                  var39 += 2;
                  var99[6] = b(var36, var39);
                  var39 += 2;
                  var99[8] = b(var36, var39);
                  var39 += 2;
                  var99[10] = b(var36, var39);
                  var39 += 2;
                  var99[7] = b(var36, var39);
                  var39 += 2;
                  var99[13] = var36[var39] & 255;
                  var99[9] = var36[++var39] & 255;
                  var99[14] = b(var36, ++var39);
                  var39 += 2;
                  var99[3] = 0;
                  var99[11] = 1;
                  var99[12] = 1;
                  var7 = var39;
                  dQ[var4][4] = var13[var4] - 2;
                  break;
               case 2:
                  dT[var4][++var5] = new int[15];
                  int[] var98 = dT[var4][var5];
                  var39 = var7;
                  byte[] var35 = var6;
                  var39 = a(var6, var39, var98);
                  var98[5] = b(var35, var39);
                  var39 += 2;
                  var98[3] = var35[var39] & 255;
                  var98[7] = b(var35, ++var39);
                  var39 += 2;
                  var98[1] = 0;
                  var98[2] = 0;
                  var98[4] = var35[var39];
                  var39++;
                  var98[6] = 0;
                  var98[9] = 0;
                  var98[10] = 0;
                  var98[11] = 0;
                  var98[12] = 0;
                  var98[13] = 0;
                  var98[8] = 0;
                  var98[14] = var35[var39];
                  var7 = ++var39;
                  var15 = -1;
                  break;
               case 10:
               case 11:
               case 12:
                  dS[var4][++var20] = new int[9];
                  int[] var97 = dS[var4][var20];
                  var39 = var7;
                  byte[] var34 = var6;
                  var39 = a(var6, var39, var97);
                  switch (var97[0]) {
                     case 10:
                        var97[1] = c(var34, var39);
                        int var66 = var39 + 4;
                        var97[2] = var34[var66] & 255;
                        var97[3] = c(var34, ++var66);
                        var39 = var66 + 4;
                        var97[4] = var34[var39] & 255;
                        var39++;
                        break;
                     case 11:
                     case 12:
                        var97[1] = var34[var39] & 255;
                        var97[2] = var34[++var39] & 255;
                        var97[3] = b(var34, ++var39);
                        var39 += 2;
                        var97[4] = 0;
                        var97[5] = 0;
                        var97[6] = 0;
                  }

                  var7 = var39;
                  break;
               case 15:
               case 16:
                  dR[var4][++var19] = new int[4];
                  int[] var96 = dR[var4][var19];
                  var39 = var7;
                  byte[] var33 = var6;
                  var39 = a(var6, var39, var96);
                  var96[1] = 0;
                  switch (var96[0]) {
                     case 15:
                        var96[2] = b(var33, var39);
                        var39 += 2;
                        var96[3] = -1;
                        break;
                     case 16:
                        var96[2] = var33[var39] & 255;
                        var39++;
                        var96[3] = -1;
                  }

                  var7 = var39;
                  break;
               case 20:
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 26:
               case 27:
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 35:
               case 36:
               case 37:
               case 38:
               case 39:
               case 40:
               case 41:
               case 42:
               case 43:
               case 44:
               case 45:
               case 46:
               case 47:
               case 48:
               case 49:
               case 50:
               case 51:
               case 52:
               case 53:
                  dZ[var4][var5][++var15] = new int[6];
                  int[] var9 = dZ[var4][var5][var15];
                  var39 = var7;
                  byte[] var32 = var6;
                  var39 = a(var6, var39, var9);
                  var9[1] = 1;
                  switch (var9[0]) {
                     case 20:
                        var9[2] = b(var32, var39);
                        var39 += 2;
                        var9[3] = -1;
                        break;
                     case 21:
                        var9[2] = var32[var39] & 255;
                        var9[3] = b(var32, ++var39);
                        var39 += 2;
                        var9[4] = b(var32, var39);
                        var39 += 2;
                        break;
                     case 22:
                        var9[2] = b(var32, var39);
                        var39 += 2;
                        var9[3] = var32[var39] & 255;
                        var9[4] = var32[++var39] & 255;
                        var9[5] = var32[++var39] & 255;
                        var39++;
                        break;
                     case 23:
                     case 28:
                     case 37:
                     case 44:
                     case 45:
                     case 49:
                     case 50:
                     case 53:
                        var9[2] = -1;
                        var9[3] = -1;
                        break;
                     case 24:
                     case 25:
                        var9[2] = c(var32, var39);
                        var39 += 4;
                        break;
                     case 26:
                        var9[2] = b(var32, var39);
                        var39 += 2;
                        var9[3] = var32[var39] & 255;
                        var39++;
                        break;
                     case 27:
                        var9[2] = b(var32, var39);
                        int var52 = var39 + 2;
                        var9[3] = b(var32, var52);
                        var39 = var52 + 2;
                        var9[4] = var32[var39] & 255;
                        var39++;
                        break;
                     case 29:
                     case 30:
                     case 32:
                     case 33:
                     case 38:
                     case 39:
                     case 40:
                     case 41:
                     case 43:
                     case 46:
                     case 52:
                        var9[2] = var32[var39] & 255;
                        var39++;
                        var9[3] = -1;
                        break;
                     case 31:
                     case 36:
                     case 42:
                        var9[2] = var32[var39] & 255;
                        var9[3] = var32[++var39] & 255;
                        var9[4] = var32[++var39] & 255;
                        var39++;
                        break;
                     case 34:
                        var9[2] = var32[var39] & 255;
                        var9[3] = var32[++var39] & 255;
                        var9[4] = var32[++var39] & 255;
                        var9[5] = var32[++var39] & 255;
                        var39++;
                        break;
                     case 35:
                     case 48:
                        var9[2] = var32[var39];
                        var9[3] = var32[++var39];
                        var39++;
                        break;
                     case 47:
                        var9[2] = b(var32, var39);
                        var39 += 2;
                        var9[3] = b(var32, var39);
                        var39 += 2;
                        break;
                     case 51:
                        var9[2] = b(var32, var39);
                        var39 += 2;
                        var9[3] = var32[var39] & 255;
                        var9[4] = var32[++var39] & 255;
                        var9[5] = var32[++var39] & 255;
                        var39++;
                  }

                  var7 = var39;
                  break;
               case 100:
               case 126:
                  var7 += 1 + at(var39);
            }
         }
      }

      if (F() && F()) {
         w var14 = dF;
         dM = dF.e[6];

         for (int var26 = 0; var26 < 5; var26++) {
            dL[var26] = var14.e[var26 + 229];
            dK[var26] = var14.e[var26 + 1];
            dQ[dK[var26]][3] = var14.e[7 + var26 * 43];
            dQ[dK[var26]][4] = var14.e[8 + var26 * 43];
            dQ[dK[var26]][11] = var14.e[9 + var26 * 43];
            var5 = 0;

            while (true) {
               int var16 = dK[var26];
               if (var5 >= dT[var16].length) {
                  break;
               }

               dT[dK[var26]][var5][1] = var14.e[10 + (var5 << 3) + var26 * 43];
               dT[dK[var26]][var5][2] = var14.e[11 + (var5 << 3) + var26 * 43];
               dT[dK[var26]][var5][6] = var14.e[12 + (var5 << 3) + var26 * 43];
               dT[dK[var26]][var5][8] = var14.e[13 + (var5 << 3) + var26 * 43];
               dT[dK[var26]][var5][9] = var14.e[14 + (var5 << 3) + var26 * 43];
               dT[dK[var26]][var5][10] = var14.e[15 + (var5 << 3) + var26 * 43];
               dT[dK[var26]][var5][11] = var14.e[16 + (var5 << 3) + var26 * 43];
               dT[dK[var26]][var5][12] = var14.e[17 + (var5 << 3) + var26 * 43];
               if (var5 == 0 && dT[dK[var26]][var5][1] == 0) {
                  dT[dK[var26]][var5][2] = 0;
                  dQ[dK[var26]][11] = 0;
               }

               var5++;
            }
         }

         for (int var27 = 0; var27 < dI; var27++) {
            dQ[var27][2] = var14.e[var27 + 686];
            var5 = 0;

            while (true) {
               int var17 = var27;
               if (var5 >= dR[var17].length) {
                  break;
               }

               dR[var27][var5][1] = var14.e[235 + var27 * 3 + var5];
               var5++;
            }
         }

         dU[0] = var14.e[222];
         dU[1] = var14.e[223];
         dU[2] = var14.e[224];
         dU[3] = var14.e[225];
         dU[4] = var14.e[226];
         dU[5] = var14.e[227];
         dV = var14.e[228];
         dN = var14.e[233];
         dJ = var14.e[234];
      }
   }

   private static void bH() {
      for (int var4 = 0; var4 < dM; var4++) {
         int var0 = dK[var4];
         int var1 = 0;
         int var2 = dT[var0].length - 1;
         if (dT[var0][0][1] == 0) {
            var1 = (boolean)1;

            while (var1) {
               if ((var1 = dT[var0][0][2]) >= dZ[var0][0].length) {
                  dT[var0][0][1] = 1;

                  for (int var20 = 1; var20 < dT[var0].length - 1; var20++) {
                     dT[var0][var20][1] = 0;
                     int var25 = var20;
                     var1 = var0;
                     boolean var5 = false;
                     int[] var6;
                     if ((var6 = dZ[var1][var25][dT[var1][var25][2]])[1] == 0) {
                        switch (var6[0]) {
                           case -26:
                              if (cI[4] == 20) {
                                 var5 = true;
                              }
                              break;
                           case -25:
                              if (bO - cd < dT[var1][var25][5]) {
                                 var5 = true;
                              }
                              break;
                           case -13:
                              if (40 <= ab.e[7]) {
                                 var5 = true;
                              }
                              break;
                           case -11:
                              if (z != 0) {
                                 continue;
                              }

                              if (dg() < dT[var1][var25][5]) {
                                 var5 = true;
                              }
                              break;
                           case 111:
                              if (1 == dZ[var1][var25][0][3]) {
                                 int var27;
                                 if ((var27 = ab.e[1]) >= dZ[var1][var25][0][2]) {
                                    var5 = true;
                                 } else {
                                    dT[var1][var25][9] = var27;
                                    bI();
                                 }
                              }
                              break;
                           case 116:
                           case 118:
                              int var26 = var6[2];

                              for (int var7 = 0; var7 < q.af[0][0].length; var7++) {
                                 if (q.af[0][0][var7] != null && q.af[0][0][var7].ar == var26) {
                                    var5 = true;
                                 }
                              }
                        }

                        if (var5) {
                           dT[var1][var25][6]++;
                           dT[var1][var25][2]++;
                           dT[var1][var25][1] = 1;
                           boolean var28 = true;

                           for (int var29 = 1; var29 < dT[var1].length - 1; var29++) {
                              if (dT[var1][var29][1] != 1) {
                                 var28 = false;
                                 break;
                              }
                           }

                           if (var28) {
                              dQ[var1][12] = -1;
                              dT[var1][dT[var1].length - 1][8] = 1;
                           }
                        }
                     }
                  }

                  bI();
                  var4--;
                  break;
               }

               boolean var24 = dT[var0][0][4] == 1;
               var1 = a(var0, 0, var1, var4, var24);
            }
         } else if (dT[var0][var2][8] == 1) {
            int var12 = 1;

            while (var12) {
               if ((var12 = dT[var0][var2][2]) >= dZ[var0][var2].length) {
                  dT[var0][var2][1] = 1;
                  dQ[var0][2] = 1;
                  dQ[var0][3] = 0;

                  for (int var23 = var4; var23 < dM - 1; var23++) {
                     dK[var23] = dK[var23 + 1];
                  }

                  if (--dM < 0) {
                     dM = 0;
                  }

                  D(15, dQ[var0][1]);
                  if (dQ[var0][12] > 0) {
                     var12 = var0;
                     dL[dN] = var12;
                     dN++;
                  } else {
                     G();
                  }

                  dJ++;
                  bI();
                  break;
               }

               boolean var22 = dT[var0][var2][4] == 1;
               var12 = a(var0, var2, var12, var4, var22);
            }
         } else {
            for (int var19 = 1; var19 < dT[var0].length - 1; var19++) {
               if (dT[var0][var19][1] != 1) {
                  int var9 = 1;
                  boolean var3 = dT[var0][var19][4] == 1;

                  while (var9) {
                     if ((var9 = dT[var0][var19][2]) >= dZ[var0][var19].length) {
                        dT[var0][var19][1] = 1;
                        dQ[var0][4]--;
                        boolean var11 = true;

                        for (int var21 = 1; var21 < dT[var0].length - 1; var21++) {
                           if (dT[var0][var21][1] == 0) {
                              var11 = false;
                              break;
                           }
                        }

                        if (var11) {
                           dT[var0][dT[var0].length - 1][8] = 1;
                        }

                        bI();
                        var4--;
                        break;
                     }

                     var9 = a(var0, var19, var9, var4, var3);
                  }
               }
            }
         }
      }

      for (int var8 = 0; var8 < dM; var8++) {
         int var18 = dK[var8];
         if (dY[var8] > 0) {
            dY[var8] = dY[var8] - aq;
            if (dY[var8] <= 0) {
               f(1, var18, -1, -1);
            }
         }
      }
   }

   private static void aq(int var0) {
      dK[dM] = var0;

      for (int var1 = 1; var1 < dT[var0].length - 1; var1++) {
         dT[var0][var1][2] = 0;
         dT[var0][var1][1] = 1;
         dT[var0][var1][6] = 0;
      }

      dT[var0][0][2] = 0;
      dT[var0][0][1] = 0;
      dT[var0][2][2] = 0;
      dT[var0][2][1] = 0;
      dQ[var0][2] = 0;
      dQ[var0][3] = 1;
      dQ[var0][11] = 1;
      dM++;
      if (i != 3 && ea && !P(69)) {
         a(69);
         ea = false;
      }
   }

   private static void bI() {
      w var0 = dF;
      dF.e[6] = dM;

      for (int var1 = 0; var1 < 5; var1++) {
         var0.e[var1 + 1] = dK[var1];
         var0.e[var1 + 229] = dL[var1];
         if (dK[var1] != -1) {
            var0.e[7 + var1 * 43] = dQ[dK[var1]][3];
            var0.e[8 + var1 * 43] = dQ[dK[var1]][4];
            var0.e[9 + var1 * 43] = dQ[dK[var1]][11];
            int var2 = 0;

            while (true) {
               int var3 = dK[var1];
               if (var2 >= dT[var3].length) {
                  break;
               }

               var0.e[10 + (var2 << 3) + var1 * 43] = dT[dK[var1]][var2][1];
               var0.e[11 + (var2 << 3) + var1 * 43] = dT[dK[var1]][var2][2];
               var0.e[12 + (var2 << 3) + var1 * 43] = dT[dK[var1]][var2][6];
               var0.e[13 + (var2 << 3) + var1 * 43] = dT[dK[var1]][var2][8];
               var0.e[14 + (var2 << 3) + var1 * 43] = dT[dK[var1]][var2][9];
               var0.e[15 + (var2 << 3) + var1 * 43] = dT[dK[var1]][var2][10];
               var0.e[16 + (var2 << 3) + var1 * 43] = dT[dK[var1]][var2][11];
               var0.e[17 + (var2 << 3) + var1 * 43] = dT[dK[var1]][var2][12];
               var2++;
            }
         }
      }

      for (int var4 = 0; var4 < dI; var4++) {
         var0.e[var4 + 686] = dQ[var4][2];
         int var5 = 0;

         while (true) {
            int var6 = var4;
            if (var5 >= dR[var6].length) {
               break;
            }

            var0.e[235 + var4 * 3 + var5] = dR[var4][var5][1];
            var5++;
         }
      }

      var0.e[222] = dU[0];
      var0.e[223] = dU[1];
      var0.e[224] = dU[2];
      var0.e[225] = dU[3];
      var0.e[226] = dU[4];
      var0.e[227] = dU[5];
      var0.e[228] = dV;
      var0.e[233] = dN;
      var0.e[234] = dJ;
      j();
      aA();
   }

   private static void ar(int var0) {
      v var1;
      if ((var1 = q.f(var0)) == null) {
         eR = 3;
         M(6);
      } else {
         q.b(var1);
         b(63, false, true);
         b(73, false, true);
      }
   }

   private static void B(int var0, int var1) {
      switch (dT[var0][var1][14]) {
         case 0:
            eR = 3;
            M(6);
            return;
         case 1:
            eR = 1;
            M(6);
            return;
         case 2:
            eR = 0;
            M(6);
            return;
         case 3:
            eR = 2;
            M(6);
            return;
         case 4:
            ar(1);
            return;
         case 5:
            ar(5);
            return;
         case 6:
            ar(6);
            return;
         case 7:
            ar(3);
            return;
         case 8:
            ar(10);
            return;
         case 9:
            ar(2);
         default:
            return;
         case 10:
            ar(4);
      }
   }

   private static void bJ() {
      dO = -1;
      dP = -1;
      if (dJ >= dQ.length && dM <= 0) {
         b(0, u(5177) + "\n" + u(5178), 17);
      }

      G();
   }

   private static void as(int var0) {
      int var1 = dT[var0].length - 1;
      dT[var0][var1][8] = 1;
   }

   private static boolean a(int var0, int var1, int var2, int var3, boolean var4) {
      boolean var5 = true;
      switch (dZ[var0][var1][var2][1]) {
         case 0:
            if (var4) {
               dT[var0][var1][2]++;
            } else {
               var5 = false;
            }
            break;
         case 1:
            if (!var4) {
               int[] var26 = dZ[var0][var1][var2];
               int var21 = var3;
               boolean var16 = false;
               int var10 = var4;
               int[] var8 = var26;
               switch (var26[0]) {
                  case 20:
                     if (!var10) {
                        dY[var21] = var8[2];
                     }
                     break;
                  case 21:
                     if (!var10) {
                        if (var8[4] != -1) {
                           int var28 = var8[2];
                           String var30 = u(var8[3]);
                           String var20 = u(var8[4]);
                           a(var28, var30, -1, -1, var20);
                        } else {
                           d(var8[2], u(var8[3]));
                        }
                     }
                     break;
                  case 22:
                     if (!var10) {
                        if (var8[4] > 0) {
                           b(9, false, false);
                        } else {
                           if (!v(9)) {
                              b(9, true, false);
                              if (var8[5] == 0) {
                                 c(8, 0, 5, 17);
                                 c(8, 0, 6, 0);
                              } else {
                                 c(8, 0, 5, 53);
                                 c(8, 0, 6, 2);
                              }

                              c(8, 0, 7, 514);
                           }

                           String var25 = u(var8[2]);
                           a(8, 2, var25, false);
                           a(8, 3, var8[3] > 0);
                           d(8, 4, var8[3] > 0);
                           fs = false;
                        }
                     }
                     break;
                  case 23:
                     bF();
                     break;
                  case 24:
                     if (var10) {
                     }
                     break;
                  case 25:
                     if (var10) {
                     }
                     break;
                  case 26:
                     v var13;
                     if (var8[2] >= 0) {
                        var13 = q.f(var8[2]);
                     } else {
                        var13 = q.ai;
                     }

                     if (var13 == null) {
                        break;
                     }

                     f(true);
                     short var18 = 0;
                     int var23 = 0;
                     if (var13.au == 2 || var13.au == 4 || var13.au == 1) {
                        var18 = 192;
                        var23 = -48;
                     }

                     int var29 = var8[3];
                     byte var14 = (byte)var23;
                     var18 = var18;
                     var23 = var29;
                     af = var13;
                     ec = var18;
                     ed = var14;
                     ae.a(var23, -1);
                     break;
                  case 27:
                     f(true);
                     h(var8[4], var8[2], var8[3]);
                     break;
                  case 28:
                     f(false);
                     break;
                  case 29:
                     fb.a(var8[2] > 0);
                     fb.b(var8[2] > 0);
                     fI.a(var8[2] > 0);
                     fI.b(var8[2] > 0);
                  case 30:
                  case 35:
                  case 53:
                  default:
                     break;
                  case 31:
                     var10 = var8[2] > 0;
                     if (var8[4] != 255) {
                        b(var8[3], var8[4], var10);
                     } else if (var8[3] != 255) {
                        c(var8[3], var10);
                     } else {
                        c(-1, var10);
                     }
                     break;
                  case 32:
                     if (var8[2] > 0) {
                        bc();
                     } else {
                        bd();
                     }
                     break;
                  case 33:
                     if (var8[2] != 255) {
                        u.b = var8[2];
                     } else {
                        u.b = -1;
                     }
                     break;
                  case 34:
                     var10 = var8[2];
                     var4 = var8[3];
                     if (var8[4] != 0) {
                        f(true);
                        ee = true;
                        ef = var10;
                        eg = var4;
                        eh = 0;
                        ae.a(0, -1);
                        c(-1, false);
                     }

                     bh(var10, var4);
                     break;
                  case 36:
                     a(var8[3], var8[4], var8[2] == 0);
                     break;
                  case 37:
                     q.b(q.ai);
                     break;
                  case 38:
                     if (var8[2] > 0) {
                        bf();
                     } else {
                        bg();
                     }
                     break;
                  case 39:
                     K = var8[2];
                     break;
                  case 40:
                     if (var8[2] > 0) {
                        J = false;
                     } else {
                        J = true;
                     }
                     break;
                  case 41:
                     q.b(q.f(var8[2]));
                  case 42:
                     break;
                  case 43:
                     if (var8[2] > 0) {
                        bJ(11);
                     } else {
                        bK(11);
                     }
                     break;
                  case 44:
                     bK();
                     break;
                  case 45:
                     le = !le;
                     break;
                  case 46:
                     if (var8[2] == 0) {
                        ab.e[35] = 1;
                     } else {
                        ab.e[36] = 1;
                     }

                     dP = -1;
                     break;
                  case 47:
                     aZ(var8[2], var8[3]);
                     bT = true;
                     break;
                  case 48:
                     if (!var10) {
                        if (var8[2] == 0) {
                           b(bg(var8[3]), true, false);
                        } else {
                           b(bg(var8[3]), false, false);
                        }
                     }
                     break;
                  case 49:
                     dP = var0;
                     if (v(70)) {
                        k(70, false);
                     }
                     break;
                  case 50:
                     q.h();
                     break;
                  case 51:
                     if (!var10) {
                        if (var8[4] > 0) {
                           a(63);
                           b(10, false, false);
                        } else {
                           if (!v(10)) {
                              b(10, true, false);
                              if (var8[5] == 0) {
                                 c(92, 0, 5, 17);
                                 c(92, 0, 6, 0);
                              } else {
                                 c(92, 0, 5, 53);
                                 c(92, 0, 6, 2);
                              }

                              c(92, 0, 7, 514);
                           }

                           String var22 = u(var8[2]);
                           a(92, 2, var22, false);
                           a(92, 3, var8[3] > 0);
                           d(92, 4, var8[3] > 0);
                           fs = false;
                        }
                     }
                     break;
                  case 52:
                     if (var8[2] > 0) {
                        x();
                     } else {
                        y();
                     }
               }
            }

            dT[var0][var1][2]++;
            break;
         case 2:
            int[] var10000 = dZ[var0][var1][var2];
            int var6 = var2;
            var4 = (boolean)0;
            boolean var9 = false;
            int[] var7 = var10000;
            switch (var10000[0]) {
               case -2:
                  dT[var0][var1][2] = dT[var0][var1][2] + var7[2];
                  dW = false;
                  dX = -1;
                  break;
               case -1:
                  dW = true;
                  dX = dZ[var0][var1][var6 + 1][0];
                  dT[var0][var1][2]++;
            }
      }

      return var5;
   }

   static boolean b(int var0, int var1, int var2, int var3) {
      return f(var0, var1, var2, var3);
   }

   private static boolean f(int var0, int var1, int var2, int var3) {
      boolean var8 = false;

      for (int var9 = 0; var9 < dM; var9++) {
         int var6 = dK[var9];

         for (int var7 = 0; var7 < dT[var6].length; var7++) {
            if (dT[var6][var7][1] != 1 && dT[var6][var7][2] < dZ[var6][var7].length) {
               int[] var4;
               int var5 = (var4 = dZ[var6][var7][dT[var6][var7][2]])[0];
               if (var4[1] == 0) {
                  switch (var0) {
                     case 0:
                     case 3:
                        if (var5 == 104 && var1 == var4[2]) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 1:
                        if (var5 == 102 && var1 == var6) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 2:
                        if (var5 == 101 && var4[4] == 1 && var1 == var4[2] && var2 == var4[3]) {
                           C(var6, var7);
                           bh(-1, -1);
                           var8 = true;
                        }
                        break;
                     case 4:
                        if (var5 == 103 && !dc()) {
                           C(var6, var7);
                           var8 = true;
                        }
                     case 5:
                     case 7:
                     case 8:
                     case 9:
                     case 11:
                     case 12:
                     case 18:
                     case 19:
                     case 20:
                     case 52:
                     case 53:
                     case 54:
                     case 55:
                     case 56:
                     case 57:
                     case 58:
                     case 59:
                     case 60:
                     case 61:
                     case 62:
                     case 63:
                     case 64:
                     case 65:
                     case 66:
                     case 67:
                     case 68:
                     case 69:
                     case 70:
                     case 71:
                     case 72:
                     case 73:
                     case 74:
                     case 75:
                     case 76:
                     case 77:
                     case 78:
                     case 79:
                     case 80:
                     case 81:
                     case 82:
                     case 83:
                     case 84:
                     case 85:
                     case 86:
                     case 87:
                     case 88:
                     case 89:
                     case 90:
                     case 91:
                     case 92:
                     case 93:
                     case 94:
                     case 95:
                     case 96:
                     case 97:
                     case 98:
                     case 99:
                     case 101:
                     case 102:
                     case 103:
                     case 104:
                     case 105:
                     case 106:
                     case 107:
                     case 108:
                     case 109:
                     case 110:
                     case 111:
                     case 112:
                     case 113:
                     case 114:
                     case 115:
                     case 116:
                     case 117:
                     case 118:
                     case 119:
                     case 120:
                     case 121:
                     case 122:
                     case 123:
                     case 124:
                     case 125:
                     case 126:
                     case 127:
                     case 128:
                     case 129:
                     case 130:
                     case 131:
                     case 132:
                     case 133:
                     case 134:
                     case 135:
                     case 136:
                     case 137:
                     case 138:
                     case 139:
                     case 140:
                     case 141:
                     case 142:
                     case 143:
                     case 144:
                     case 145:
                     case 146:
                     case 147:
                     case 148:
                     case 149:
                     case 150:
                     case 151:
                     case 152:
                     case 153:
                     case 154:
                     case 155:
                     case 156:
                     case 157:
                     case 158:
                     case 159:
                     case 160:
                     case 161:
                     case 162:
                     case 163:
                     case 164:
                     case 165:
                     case 166:
                     case 167:
                     case 168:
                     case 169:
                     case 170:
                     case 171:
                     case 172:
                     case 173:
                     case 174:
                     case 175:
                     case 176:
                     case 177:
                     case 178:
                     case 179:
                     case 180:
                     case 181:
                     case 182:
                     case 183:
                     case 184:
                     case 185:
                     case 186:
                     case 187:
                     case 188:
                     case 189:
                     case 190:
                     case 191:
                     case 192:
                     case 193:
                     case 194:
                     case 195:
                     case 196:
                     case 197:
                     case 198:
                     case 199:
                     default:
                        break;
                     case 6:
                        if (var5 == 105) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 10:
                        if (var5 == 109 && (var1 == var4[2] || var4[2] == 255) && (var2 == var4[3] || var4[3] == 255)) {
                           C(var6, var7);
                        }
                        break;
                     case 13:
                        if (var5 == 110) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 14:
                        if (var5 == 106 && (var1 == var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 15:
                        if (var5 == 107 && (var1 == var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 16:
                        if (var5 == 111 && 1 == var4[3]) {
                           dT[var6][var7][9] = dT[var6][var7][9] + var1;
                           bI();
                           if (dT[var6][var7][9] >= var4[2]) {
                              dT[var6][var7][9] = 0;
                              C(var6, var7);
                              var8 = true;
                           }
                        }
                        break;
                     case 17:
                        if (var5 == 111 && 0 == var4[3]) {
                           dT[var6][var7][9] = dT[var6][var7][9] + var1;
                           bI();
                           if (dT[var6][var7][9] >= var4[2]) {
                              dT[var6][var7][9] = 0;
                              C(var6, var7);
                              var8 = true;
                           }
                        }
                        break;
                     case 21:
                        if (var5 == 113 && var1 == var4[2]) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 22:
                        if (var5 == 114) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 23:
                        if (var5 == 115) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 24:
                        if (var5 == 116 && (var1 == var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 25:
                        if (var5 == 117 && (var1 == var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 26:
                        if (var5 == 118) {
                           if (var1 == var4[2] || var4[2] == 255) {
                              C(var6, var7);
                              var8 = true;
                           }
                        } else if (var5 == -4
                           && (
                              (var2 == var4[2] || var4[2] == 255) && (var3 == var4[3] || var4[3] == 255)
                                 || (var3 == var4[2] || var4[2] == 255) && (var2 == var4[3] || var4[3] == 255)
                           )) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 27:
                        if (var5 == -21 && (var1 == var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 28:
                        if (var5 == -5 && (var1 == var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 29:
                        if (var5 == -6 && (var1 == var4[2] || var4[2] == 255) && (var2 == var4[3] || var4[3] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 30:
                        if (var5 == -7 && (var1 == var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 31:
                        if (var5 == -8 && (var1 == var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 32:
                        if (var5 == -22 && (var1 == var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 33:
                        if (var5 == -9 && (var1 == var4[2] || var4[2] == 255) && (var2 == var4[3] || var4[3] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 34:
                        if (var5 == -10 && (var1 == var4[2] || var4[2] == 255) && (var2 == var4[3] || var4[3] == 255) && (var3 == var4[4] || var4[4] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 35:
                        if (var5 == -11) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 36:
                        if (var5 != -12 || var2 != var4[3] && var4[3] != 255) {
                           break;
                        }

                        dT[var6][var7][9] = dT[var6][var7][9] + var1;
                        if (dT[var6][var7][9] >= var4[2]) {
                           dT[var6][var7][9] = 0;
                           C(var6, var7);
                           var8 = true;
                        }

                        bI();
                        break;
                     case 37:
                        if (var5 == -13 && (var1 >= var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 38:
                        if (var5 == -14 && var1 >= var4[2]) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 39:
                        if (var5 == -17 && (var1 == var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 40:
                        if (var5 == -20 && (var1 == var4[2] || var4[2] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 41:
                        if (var5 == -18 && (var1 == var4[2] || var4[2] == 255) && (var2 == var4[3] || var4[3] == 255) && (var3 == var4[4] || var4[4] == 255)) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 42:
                        if (var5 == -15) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 43:
                        if (var5 == -16 && var1 >= var4[2]) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 44:
                        if (var5 != -23) {
                           break;
                        }

                        boolean var17 = true;

                        for (int var20 = 0; var20 < 3 && var17; var20++) {
                           for (int var23 = 0; var23 < 3 && var17; var23++) {
                              for (int var26 = 0; var26 < 3 && var17; var26++) {
                                 int[] var29 = new int[]{-1, -1, -1};
                                 if (kN[0] != null) {
                                    var29[0] = kN[0].bm[var20 + 42];
                                 }

                                 if (kN[1] != null) {
                                    var29[1] = kN[1].bm[var23 + 42];
                                 }

                                 if (kN[2] != null) {
                                    var29[2] = kN[2].bm[var26 + 42];
                                 }

                                 if ((var29[0] == var4[2] || var4[2] == 255)
                                    && (var29[1] == var4[2] || var4[2] == 255)
                                    && (var29[2] == var4[2] || var4[2] == 255)) {
                                    C(var6, var7);
                                    var8 = true;
                                    var17 = false;
                                 }
                              }
                           }
                        }
                        break;
                     case 45:
                        if (var5 != -24) {
                           break;
                        }

                        boolean var16 = true;

                        for (int var19 = 0; var19 < 3 && var16; var19++) {
                           for (int var22 = 0; var22 < 3 && var16; var22++) {
                              for (int var25 = 0; var25 < 3 && var16; var25++) {
                                 int[] var28 = new int[]{-1, -1, -1};
                                 if (kN[0] != null) {
                                    var28[0] = kN[0].bm[var19 + 42];
                                 }

                                 if (kN[1] != null) {
                                    var28[1] = kN[1].bm[var22 + 42];
                                 }

                                 if (kN[2] != null) {
                                    var28[2] = kN[2].bm[var25 + 42];
                                 }

                                 if ((var28[0] == var4[2] || var4[2] == 255)
                                    && (var28[1] == var4[2] || var4[2] == 255)
                                    && (var28[2] == var4[2] || var4[2] == 255)) {
                                    C(var6, var7);
                                    var8 = true;
                                    var16 = false;
                                 }
                              }
                           }
                        }
                        break;
                     case 46:
                        if (var5 == -25) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 47:
                        if (var5 != -26) {
                           break;
                        }

                        boolean var15 = true;
                        if (var1 == var4[2] || var4[2] == 255) {
                           for (int var18 = 0; var18 < 3 && var15; var18++) {
                              for (int var21 = 0; var21 < 3 && var15; var21++) {
                                 for (int var24 = 0; var24 < 3 && var15; var24++) {
                                    int[] var27 = new int[]{-1, -1, -1};
                                    if (kN[0] != null) {
                                       var27[0] = kN[0].bm[var18 + 42];
                                    }

                                    if (kN[1] != null) {
                                       var27[1] = kN[1].bm[var21 + 42];
                                    }

                                    if (kN[2] != null) {
                                       var27[2] = kN[2].bm[var24 + 42];
                                    }

                                    if ((var27[0] == var4[3] || var4[3] == 255)
                                       && (var27[1] == var4[3] || var4[3] == 255)
                                       && (var27[2] == var4[3] || var4[3] == 255)) {
                                       C(var6, var7);
                                       var8 = true;
                                       var15 = false;
                                    }
                                 }
                              }
                           }
                        }
                        break;
                     case 48:
                        if (var5 != -27) {
                           break;
                        }

                        boolean var14 = true;

                        for (int var10 = 0; var10 < 3 && var14; var10++) {
                           for (int var11 = 0; var11 < 3 && var14; var11++) {
                              for (int var12 = 0; var12 < 3 && var14; var12++) {
                                 int[] var13 = new int[]{-1, -1, -1};
                                 if (kN[0] != null) {
                                    var13[0] = kN[0].bm[var10 + 42];
                                 }

                                 if (kN[1] != null) {
                                    var13[1] = kN[1].bm[var11 + 42];
                                 }

                                 if (kN[2] != null) {
                                    var13[2] = kN[2].bm[var12 + 42];
                                 }

                                 if ((var13[0] == var4[2] || var4[2] == 255)
                                    && (var13[1] == var4[2] || var4[2] == 255)
                                    && (var13[2] == var4[2] || var4[2] == 255)) {
                                    C(var6, var7);
                                    var8 = true;
                                    var14 = false;
                                 }
                              }
                           }
                        }
                        break;
                     case 49:
                        if (var5 == 112) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 50:
                        if (var5 == -28 && var1 == var4[2]) {
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 51:
                        if (var5 == -29 && var1 >= var4[2]) {
                           lf = var4[2];
                           C(var6, var7);
                           var8 = true;
                        }
                        break;
                     case 100:
                        if (dW && var1 == dX) {
                           dT[var6][var7][2] = dT[var6][var7][2] + 2;
                           dW = false;
                           dX = -1;
                        }
                        break;
                     case 200:
                        if (var5 == 101 && var4[4] == 0 && var1 == var4[2] && var2 == var4[3]) {
                           C(var6, var7);
                           bh(-1, -1);
                           var8 = true;
                        }
                  }
               }
            }
         }
      }

      if (var8) {
         bI();
      }

      return var8;
   }

   private static boolean C(int var0, int var1) {
      label15: {
         int[] var2;
         int var3 = (var2 = dT[var0][var1])[2];
         if (dZ[var0][var1][var3][5] == 1) {
            var2[6]++;
            if (var2[6] < var2[5]) {
               break label15;
            }
         }

         var2[2]++;
      }

      if (F()) {
         bI();
      }

      return true;
   }

   private static void c(int var0, boolean var1) {
      if (var0 >= 0) {
         l(bg(var0), var1);
      } else {
         boolean var2 = var1;

         for (int var3 = 0; var3 < iX; var3++) {
            l(var3, var2);
         }
      }
   }

   private static void bK() {
      bL = 0;
      bM = 100;
      aP();
      ab.e[31] = 1;
   }

   private static void D(int var0, int var1) {
      label82:
      for (int var3 = 0; var3 < dI; var3++) {
         if (dQ[var3][2] == 0 && dQ[var3][3] == 0) {
            boolean var2;
            if (dR[var3].length > 0) {
               var2 = 1;
            } else {
               var2 = 0;
            }

            for (int var4 = 0; var4 < dR[var3].length; var4++) {
               if (var0 != dR[var3][var4][0]) {
                  if (dR[var3][var4][1] != 0) {
                     continue;
                  }
               } else {
                  if (dR[var3][var4][1] == 1) {
                     continue;
                  }

                  switch (var0) {
                     case 15:
                        if (dR[var3][var4][2] == var1) {
                           dR[var3][var4][1] = 1;
                           bI();
                        } else {
                           var2 = 0;
                        }
                        continue;
                     case 16:
                        int var5 = dR[var3][var4][2];
                        if (var1 >= var5) {
                           dR[var3][var4][1] = 1;
                           bI();
                           continue;
                        }
                        break;
                     default:
                        continue;
                  }
               }

               var2 = 0;
            }

            if (var2) {
               var2 = var3;

               for (int var7 = 0; var7 < dU.length; var7++) {
                  if (dU[var7] == var2) {
                     continue label82;
                  }
               }

               for (int var8 = 0; var8 < dU.length; var8++) {
                  if (dU[var8] == -1) {
                     dU[var8] = var2;
                     dV++;
                     break;
                  }
               }

               bI();
            }
         }
      }
   }

   private static int a(byte[] var0, int var1, int[] var2) {
      var2[0] = var0[var1];
      return var1 + 1;
   }

   private static int at(int var0) {
      switch (var0) {
         case -29:
            return 2;
         case -28:
            return 2;
         case -27:
            return 2;
         case -26:
            return 3;
         case -25:
            return 1;
         case -24:
            return 2;
         case -23:
            return 2;
         case -22:
            return 2;
         case -21:
            return 2;
         case -20:
            return 2;
         case -19:
         case -3:
         case 0:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 13:
         case 14:
         case 17:
         case 18:
         case 19:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
         case 91:
         case 92:
         case 93:
         case 94:
         case 95:
         case 96:
         case 97:
         case 98:
         case 99:
         case 119:
         case 120:
         case 121:
         case 122:
         case 123:
         case 124:
         case 125:
         default:
            return 0;
         case -18:
            return 4;
         case -17:
            return 2;
         case -16:
            return 2;
         case -15:
            return 1;
         case -14:
            return 2;
         case -13:
            return 2;
         case -12:
            return 6;
         case -11:
            return 1;
         case -10:
            return 4;
         case -9:
            return 3;
         case -8:
            return 2;
         case -7:
            return 2;
         case -6:
            return 3;
         case -5:
            return 2;
         case -4:
            return 3;
         case -2:
            return 1;
         case -1:
            return 0;
         case 1:
            return 16;
         case 2:
            return 7;
         case 10:
            return 10;
         case 11:
            return 4;
         case 12:
            return 4;
         case 15:
            return 2;
         case 16:
            return 1;
         case 20:
            return 2;
         case 21:
            return 5;
         case 22:
            return 5;
         case 23:
            return 0;
         case 24:
            return 4;
         case 25:
            return 4;
         case 26:
            return 3;
         case 27:
            return 5;
         case 28:
            return 0;
         case 29:
            return 1;
         case 30:
            return 1;
         case 31:
            return 3;
         case 32:
            return 1;
         case 33:
            return 1;
         case 34:
            return 4;
         case 35:
            return 2;
         case 36:
            return 3;
         case 37:
            return 0;
         case 38:
            return 1;
         case 39:
            return 1;
         case 40:
            return 1;
         case 41:
            return 1;
         case 42:
            return 3;
         case 43:
            return 1;
         case 44:
            return 0;
         case 45:
            return 0;
         case 46:
            return 1;
         case 47:
            return 4;
         case 48:
            return 2;
         case 49:
            return 0;
         case 50:
            return 0;
         case 51:
            return 5;
         case 52:
            return 1;
         case 53:
            return 0;
         case 100:
            return 0;
         case 101:
            return 4;
         case 102:
            return 1;
         case 103:
            return 1;
         case 104:
            return 3;
         case 105:
            return 1;
         case 106:
            return 2;
         case 107:
            return 2;
         case 108:
            return 2;
         case 109:
            return 3;
         case 110:
            return 1;
         case 111:
            return 6;
         case 112:
            return 1;
         case 113:
            return 2;
         case 114:
            return 1;
         case 115:
            return 1;
         case 116:
            return 2;
         case 117:
            return 2;
         case 118:
            return 2;
         case 126:
            return 0;
      }
   }

   private static void bL() {
      if (ae == null) {
         (ae = new d(j[1][23], 0, -1)).a(0, -1);
      }
   }

   private static void bM() {
      if (!F() || dE()) {
         km = false;
         int var0 = iS;
         ei = true;
         if (var0 >= 0) {
            var0 = bf(var0);
            ei = iZ[var0];
         }
      }
   }

   private static void bN() {
      if (cW()) {
         if (!F() || dE()) {
            kk = true;
            int var0 = iT;
            int var1 = iS;
            if (var0 >= 0 && bf(var1) >= 0) {
               ;
            }

            if (eb && !ej) {
               if (ee) {
                  var1 = eg;
                  var0 = ef;
                  int var4 = var1;
                  int var3 = ef;
                  int var2 = ag[var0][var1][5];
                  int var6 = var1;
                  int var5 = var0;
                  short var16 = ag[var3][var4][6];
                  int var7 = var1;
                  var4 = var0;
                  int var13 = ag[var5][var6][2];
                  short var18 = ag[var4][var7][3];
                  int var9;
                  var6 = var9 = bf(var0);
                  var5 = jc[var6][0];
                  var6 = var9;
                  var0 = jc[var6][1];
                  j[1][var2].b(ex, var16, var13, var18, 0);
                  var13 = (ex[0] + ex[2]) / 2;
                  var2 = (ex[3] + ex[1]) / 2 - (ex[3] - ex[1]) / 4;
                  h(0, var13 + var5, var2 + var0);
               }

               var0 = null;
               ae.d.a(kp, ae.e, ae.f, ae.a, ae.b, ae.c);
               kp[1] = kp[1] - 10;
               kp[2] = kp[2] - kp[0] + 10;
               kp[3] = kp[3] - kp[1] + 10;
               ae.g();
            }

            if (ae != null) {
               ae.c(aq);
               ej = false;
            }
         }
      }
   }

   private static void f(boolean var0) {
      eb = var0;
      af = null;
      ee = false;
   }

   private static void h(int var0, int var1, int var2) {
      ae.a(var0, -1);
      d var3 = ae;
      ae.a = var1;
      var3.b = var2;
   }

   private static int E(int var0, int var1) {
      return ag[var0][var1][0];
   }

   private static void d(int var0, boolean var1) {
      for (int var2 = 0; var2 < ag[var0].length; var2++) {
         short[] var3;
         short var4;
         if ((var3 = var1 ? ag[var0][var2] : ek[var0][var2])[0] == 1 && (var4 = var3[7]) >= 0) {
            switch (var3[6]) {
               case -3:
                  var4 |= 1024;
                  break;
               case -2:
                  var4 |= 512;
            }

            var3[6] = 0;
            var3[7] = (short)var4;
         }
      }
   }

   private static void au(int var0) {
      if (ag[var0].length != ek[var0].length) {
         for (int var2 = 0; var2 < ag[var0].length; var2++) {
            ag[var0][var2] = null;
         }

         ag[var0] = null;
         em[var0] = null;
         en[var0] = null;
         ag[var0] = new short[ek[var0].length][];

         for (int var3 = 0; var3 < ek[var0].length; var3++) {
            ag[var0][var3] = new short[ek[var0][var3].length];
         }

         em[var0] = new short[ag[var0].length];
         en[var0] = new String[ag[var0].length];
      }

      for (int var1 = ek[var0].length - 1; var1 >= 0; var1--) {
         for (int var4 = 5 + ek[var0][var1][4] - 1; var4 >= 0; var4--) {
            ag[var0][var1][var4] = ek[var0][var1][var4];
         }

         em[var0][var1] = 0;
         if (ag[var0][var1][0] == 2 && ag[var0][var1][17] >= 0) {
            en[var0][var1] = u(ag[var0][var1][17]);
         } else if (ag[var0][var1][0] == 6 && ag[var0][var1][11] >= 0) {
            en[var0][var1] = u(ag[var0][var1][11]);
         } else {
            en[var0][var1] = null;
         }
      }
   }

   private static void F(int var0, int var1) {
      ag[67][var0][var1] = ek[67][var0][var1];
   }

   static void c(int var0, int var1, int var2, int var3) {
      ag[var0][var1][var2] = (short)var3;
   }

   private static int b(int var0, String var1) {
      short[] var5;
      short var2 = (var5 = ag[var0][2])[5];
      a var3 = ax(var5[7]);
      short var6 = var5[17];
      int var4 = var3.l();
      if (var6 > 0) {
         var3.m(var6);
      }

      var6 = var3.a(var1, var2, false)[0];
      var3.m(var4);
      return var6;
   }

   private static short G(int var0, int var1) {
      return ag[var0][var1][0];
   }

   private static void av(int var0) {
      H(var0, aq);
   }

   private static void H(int var0, int var1) {
      if (el[var0] != mR) {
         el[var0] = mR;

         for (int var2 = 0; var2 < ag[var0].length; var2++) {
            int var5 = 0;
            int var4 = var2;
            short var3 = 0;
            short[] var6;
            if ((var6 = ag[var0][var4])[0] == 1) {
               var3 = var6[5];
               a var7 = er[var3];
               var3 = var6[6];
               short var11;
               if ((var11 = var6[7]) >= 0 && var7 != null) {
                  int var8 = var6[12] + var1;
                  if ((var11 & 1536) != 0) {
                     var11 &= -1537;
                     var5 = var7.a(var11);
                     if (var3 < var5 - 1) {
                        var11 = var7.a(var11, var3) * es;
                        if (var8 >= var11) {
                           var8 = 0;
                           var6[6] = (short)((var3 + 1) % var5);
                           if (var6[6] == var5 - 1) {
                              var6[9] = 1;
                           }
                        }
                     } else {
                        var6[12] = 1;
                        if ((var6[7] & 1024) != 0) {
                           var6[10] = 0;
                        }
                     }
                  } else {
                     var5 = var7.a(var11);
                     var11 = var7.a(var11, var3) * es;
                     if (var8 >= var11) {
                        var8 = 0;
                        var6[6] = (short)((var3 + 1) % var5);
                     }
                  }

                  var6[12] = (short)var8;
               }
            }
         }
      }
   }

   private static void aw(int var0) {
      short[] var1;
      (var1 = ag[35][var0])[12] = 0;
      var1[9] = 0;
   }

   private static void i(int var0, int var1, int var2) {
      g(var0, var1, var2, 0);
   }

   private static void g(int var0, int var1, int var2, int var3) {
      boolean var4;
      int var7;
      int var8;
      int var9;
      int var10;
      boolean var11;
      boolean var10000;
      label118: {
         var4 = var3 == 0 || var3 == 1;
         var17 = var3 == 0 || var3 == 2;
         var7 = a(am, true);
         var8 = b(am, true);
         var9 = c(am, true);
         var10 = d(am, true);
         var11 = false;
         if (ls != -1) {
            for (int var6 = 0; var6 < ev.length; var6++) {
               if (var0 == ev[var6][0] && ls == ev[var6][0]) {
                  ew = ev[var6][1];
                  var10000 = true;
                  break label118;
               }
            }
         }

         var10000 = false;
      }

      boolean var12 = var10000;
      boolean var5;
      if (!eo[var0] && !var12) {
         var5 = true;
      } else {
         var5 = false;
      }

      for (int var21 = 0; var21 < ag[var0].length; var21++) {
         if (ag[var0][var21][0] != 404 && (!var12 || var21 != ew)) {
            if ((var0 != 28 || !bR)
               && (!bS || var0 == 51 || var0 == 50 || var0 == 49)
               && (var0 != 44 && var0 != 51 || ag[var0][var21][2] + var1 < mJ + (mJ >> 2) && ag[var0][var21][2] + var1 > -(mJ >> 2))
               && (var5 && var17 || !var5 && var4)) {
               var11 |= h(var0, var21, var1, var2);
            }
         } else {
            if (var12 && var21 == ew) {
               var11 |= h(var0, var21, var1, var2);
            }

            if (!var17) {
               break;
            }

            var5 = true;
         }
      }

      if (var11) {
         var3 = var10;
         var2 = var9;
         var1 = var8;
         var0 = var7;
         var4 = var3;
         var3 = var2;
         var2 = var1;
         b(am, var0, var2, var3, var4);
      }
   }

   private static boolean h(int var0, int var1, int var2, int var3) {
      boolean var4 = false;
      short[] var5;
      int var6 = (var5 = ag[var0][var1])[0];
      if (var5[2] + var2 < mJ + 200 && var5[2] + var2 > -100) {
         switch (var6) {
            case 1:
               if (var5[10] != 0) {
                  var2 = var2;
                  var1 = var1;
                  var0 = var0;
                  boolean var231 = false;
                  boolean var213 = false;
                  Graphics var186 = am;
                  short[] var244 = ag[var0][var1];
                  boolean var264 = (em[var0][var1] & 8) != 0;
                  boolean var273 = (em[var0][var1] & 16) != 0;
                  short var289 = var244[5];
                  short var296 = var244[6];
                  int var302 = var244[7];
                  a var312;
                  if ((var312 = j[var244[13]][var289]) != null) {
                     int var320 = 0;
                     if (var244[8] > 0) {
                        var320 = var312.l();
                        var312.m(var244[8]);
                     }

                     if (var264) {
                        H(9);
                     }

                     if (var273) {
                        H(12);
                        e(12, 1, 64);
                     }

                     if (var302 < 0) {
                        var312.a(var186, var296, var244[2] + var2, var244[3] + var3, 0);
                     } else {
                        var302 &= -1537;
                        var312.b(var302, var296);
                        if (var0 == 92 && var1 == 0) {
                           var312.a(var186, var302, var296, var244[2] + var2, var244[3] + var3, 1);
                        } else {
                           var312.a(var186, var302, var296, var244[2] + var2, var244[3] + var3, 0);
                        }
                     }

                     if (var273) {
                        a(12, false);
                     }

                     if (var264) {
                        a(9, false);
                     }

                     if (var244[8] > 0) {
                        var312.m(var320);
                     }
                  }
               }
               break;
            case 2:
               if (en[var0][var1] != null && var5[18] != 0) {
                  String var399 = en[var0][var1];
                  int var181 = var3;
                  var3 = var2;
                  var2 = var1;
                  var1 = var0;
                  String var124 = var399;
                  short var262 = 0;
                  short var227 = 0;
                  String var210 = var124;
                  Graphics var192 = am;
                  if (var210 != null) {
                     short[] var286;
                     short var310;
                     if ((var286 = ag[var1][var2])[23] != -1 && a(var286[24], var286[25], e)) {
                        var310 = var286[23];
                     } else {
                        var310 = var286[8];
                     }

                     int var413 = var286[2] + var3;
                     int var416 = var286[3] + var181;
                     short var418 = var286[5];
                     int var419 = var286[6];
                     int var423 = var286[10];
                     short var425 = var286[9];
                     short var10008 = var286[7];
                     short var10010 = var286[12];
                     short var10011 = var286[15];
                     short var10012 = var286[19];
                     short var10013 = var286[22];
                     short var235 = var286[26];
                     var227 = var10013;
                     short var365 = var10012;
                     short var211 = var10011;
                     int var193 = var10010;
                     int var356 = var310;
                     short var352 = var10008;
                     short var347 = var425;
                     short var343 = (short)var423;
                     var262 = (short)var419;
                     short var287 = var418;
                     int var334 = var416;
                     int var328 = var413;
                     String var125 = var210;
                     Graphics var319 = var192;
                     if (var125 != null) {
                        byte var272 = 0;
                        int var367 = 0;
                        int var370 = 0;
                        if (e == 17) {
                           if (var235 == 0) {
                              var125 = f(var125);
                           }

                           if (var347 == 0) {
                              var347 = 2;
                           }
                        }

                        switch (var343) {
                           case 0:
                              var272 = 16;
                              var370 = var334;
                              break;
                           case 1:
                              var272 = 2;
                              var370 = var334 + (var262 >> 1);
                              break;
                           case 2:
                              var272 = 32;
                              var370 = var334 + var262;
                        }

                        switch (var347) {
                           case 0:
                              var272 |= 4;
                              var367 = var328;
                              break;
                           case 1:
                              var272 |= 1;
                              var367 = var328 + (var287 >> 1);
                              break;
                           case 2:
                              var272 |= 8;
                              var367 = var328 + var287;
                        }

                        ey = var125;
                        if (var352 == 4) {
                           Font var126 = Font.getFont(0, 0, 16);
                           am.setFont(var126);
                           bl(0, 0);
                           a(ey, var367 + 1, var370 + 1, var272);
                           bl(255, 255);
                           a(ey, var367, var370, var272);
                        } else {
                           a var236 = ax(var352);
                           if (var356 >= 0) {
                              var236.m(var356);
                           }

                           if (var193 == 2) {
                              short[] var357 = var236.a(ey, var287, false);
                              byte var143 = var272;
                              var0 = var370;
                              var334 = var367;
                              short[] var329 = var357;
                              String var311 = ey;
                              var236.a(var319, var311, var329, var334, var0, 0, -1, var143);
                           } else if (var193 == 3) {
                              a var79 = var236;
                              short var78 = var347;
                              short var77 = var343;
                              short var76 = var262;
                              short var75 = var287;
                              int var74 = var334;
                              int var73 = var328;
                              String var72 = ey;
                              Graphics var71 = var319;
                              byte var80 = 0;
                              int var81 = 0;
                              int var82 = 0;
                              switch (var77) {
                                 case 0:
                                    var80 = 16;
                                    var82 = var74;
                                    break;
                                 case 1:
                                    var80 = 2;
                                    var82 = var74 + (var76 >> 1);
                                    break;
                                 case 2:
                                    var80 = 32;
                                    var82 = var74 + var76;
                              }

                              switch (var78) {
                                 case 0:
                                    var80 |= 4;
                                    var81 = var73;
                                    break;
                                 case 1:
                                    var80 |= 1;
                                    var81 = var73 + (var75 >> 1);
                                    break;
                                 case 2:
                                    var80 |= 8;
                                    var81 = var73 + var75;
                              }

                              int var83 = var79.i();
                              int var84 = var82 - (var83 >> 1);
                              var79.a(var72, null);
                              if (a.i > var75) {
                                 String var104 = var72;
                                 int var105 = -1;

                                 for (int var106 = 0; var106 < 10; var106++) {
                                    if (eE[var106] != null && var104.equals(eE[var106])) {
                                       var105 = var106;
                                       break;
                                    }
                                 }

                                 int var85 = var105;
                                 if (var105 == -1) {
                                    int var386 = -1;

                                    for (int var388 = 0; var388 < 10; var388++) {
                                       if (eE[var388] == null) {
                                          var386 = var388;
                                          break;
                                       }
                                    }

                                    int var86 = var386;
                                    if (var386 != -1) {
                                       short var390 = var75;
                                       String var389 = var72;
                                       int var387 = var86;
                                       eC[var387] = 0;
                                       eD[var387] = 0;
                                       eE[var387] = var389;
                                       eF[var387] = 0;
                                       eG[var387] = var390;
                                       eH[var387] = 20;
                                       eC[var86] = eC[var86] + aq;
                                       int var90 = i.b_;
                                       short var89 = var75;
                                       int var88 = var73;
                                       int var98 = var90;
                                       b(am, var88, 0, var89, var98);
                                       var79.a(var71, var72, var73, var84, 0);
                                       int var92 = mK;
                                       int var91 = mJ;
                                       int var100 = var92;
                                       int var99 = var91;
                                       b(am, 0, 0, var99, var100);
                                    }
                                 } else {
                                    eC[var85] = eC[var85] + aq;
                                    int var95 = i.b_;
                                    short var94 = var75;
                                    int var93 = var73;
                                    int var101 = var95;
                                    b(am, var93, 0, var94, var101);
                                    var79.a(var71, var72, var73 - eF[var85], var84, 0);
                                    int var97 = mK;
                                    int var96 = mJ;
                                    int var103 = var97;
                                    int var102 = var96;
                                    b(am, 0, 0, var102, var103);
                                 }
                              } else {
                                 var79.a(var71, ey, var81, var82, var80);
                              }
                           } else if (var193 == 4) {
                              short[] var358 = var236.a(ey, var287, false);
                              int var372 = var236.k() + var236.h();
                              if (var227 == 0) {
                                 int var376 = var358[0] * var372;
                                 if (X(cl) && a(cB, cC, var328, var334, var328 + var287, var334 + var262)) {
                                    eB = true;
                                 }

                                 if (X(cm)) {
                                    eB = false;
                                 }

                                 if (eB && var262 < var376) {
                                    if ((ez = ez - cE) <= 0) {
                                       ez = 0;
                                    } else if (ez > var376 - var262) {
                                       ez = var376 - var262;
                                    }

                                    eA = 0;
                                 }

                                 int var169 = var262;
                                 short var160 = var287;
                                 var1 = var334;
                                 var0 = var328;
                                 b(am, var0, var1, var160, var169);
                                 var419 = var370 - ez;
                                 byte var194 = var272;
                                 int var182 = var419;
                                 var169 = var367;
                                 short[] var161 = var358;
                                 String var129 = ey;
                                 var236.a(var319, var129, var161, var169, var182, 0, -1, var194);
                                 var1 = mK;
                                 var0 = mJ;
                                 int var68 = var1;
                                 int var67 = var0;
                                 b(am, 0, 0, var67, var68);
                                 if (var365 == 1 && var262 < var376) {
                                    b(var319, var328 + var287, var334, var262, ez, var376);
                                 }
                              } else {
                                 int var377 = var358[0] * var372 + var262;
                                 if (var262 > var358[0] * var372) {
                                    var377 += (var262 - var358[0] * var372) / 2;
                                 }

                                 short var64 = var262;
                                 short var162 = var287;
                                 var1 = var334;
                                 var0 = var328;
                                 b(am, var0, var1, var162, var64);
                                 if (ez < var377 && ez + var262 >= var377) {
                                    var419 = var370 + var377 - ez;
                                    byte var196 = var272;
                                    int var184 = var419;
                                    var3 = var367;
                                    short[] var164 = var358;
                                    String var148 = ey;
                                    var236.a(var319, var148, var164, var3, var184, 0, -1, var196);
                                 } else {
                                    var419 = var370 - ez;
                                    byte var195 = var272;
                                    int var183 = var419;
                                    var3 = var367;
                                    short[] var163 = var358;
                                    String var147 = ey;
                                    var236.a(var319, var147, var163, var3, var183, 0, -1, var195);
                                 }

                                 if (ez + 50 * aq / 1000 >= var377) {
                                    bO();
                                 }

                                 if (eA > 2000) {
                                    ez = ez + 50 * aq / 1000;
                                 } else {
                                    eA = eA + aq;
                                 }

                                 if (X(cl) && a(cB, cC, var328, var334, var328 + var287, var334 + var262)) {
                                    eB = true;
                                 }

                                 if (X(cm)) {
                                    eB = false;
                                 }

                                 if (eB && var262 < var358[0] * var372) {
                                    if ((ez = ez - cE) <= 0) {
                                       ez = 0;
                                    } else if (ez > var377) {
                                       ez = var377;
                                    }

                                    eA = 0;
                                 }

                                 int var66 = mK;
                                 int var65 = mJ;
                                 int var70 = var66;
                                 int var69 = var65;
                                 b(am, 0, 0, var69, var70);
                                 if (var365 == 1) {
                                    b(var319, var328 + var287, var334, var262, ez, var377);
                                 }
                              }
                           } else if (var193 == 5) {
                              a var382 = var236;
                              short var381 = var262;
                              short var380 = var287;
                              String var379 = ey;
                              short var383 = var382.a(var379, var380, false)[0];
                              int var384 = var382.k() + var382.h();
                              int var385 = var381 / var384;
                              int var373 = (var356 = var383 / var385 + (var383 % var385 > 0 ? 1 : 0) << 16 | var385) >> 16 & 65535;
                              int var378 = var356 & 65535;
                              if (var211 >= 0 && var211 < var373) {
                                 String var229 = ey;
                                 var286 = var236.a(ey, var287, false);
                                 var423 = var378 * var211;
                                 byte var230 = var272;
                                 int var212 = var378;
                                 var193 = var423;
                                 int var185 = var370;
                                 var3 = var367;
                                 short[] var165 = var286;
                                 String var149 = ey;
                                 var236.a(var319, var149, var165, var3, var185, var193, var212, var230);
                              }
                           } else {
                              a(var287, var236);
                              if (e == 17 && (var352 == 1 || var352 == 2)) {
                                 var356 = var236.l();
                                 if (var352 == 1) {
                                    var236.m(10);
                                 }

                                 if (var352 == 2) {
                                    var236.m(11);
                                 }

                                 var236.m(var356);
                              }

                              var236.a(var319, ey, var367, var370, var272);
                           }
                        }
                     }
                  }
               }
               break;
            case 4:
               var2 = var2;
               var1 = var1;
               var0 = var0;
               boolean var226 = false;
               boolean var209 = false;
               Graphics var180 = am;
               short[] var243;
               int var271 = (var243 = ag[var0][var1])[2] + var2;
               int var285 = var243[3] + var3;
               short var295 = var243[5];
               short var301 = var243[6];
               int var309 = var243[8] & 255;
               int var318 = var243[9] & 255;
               var0 = var243[10] & 255;
               int var327;
               int var333 = (var327 = var243[7] & 255) << 24 | var309 << 16 | var318 << 8 | var0;
               if (var327 == 255) {
                  am.setColor(var333);
                  Object var261 = null;
                  c(var180, var271, var285, var295, var301);
               } else if (var327 > 0) {
                  E(var333);
                  e(var180, var271, var285, var295, var301);
               }
               break;
            case 5:
               if (var5[7] != 0) {
                  var2 = var2;
                  var1 = var1;
                  var0 = var0;
                  var6 = (var5 = ag[var0][var1])[2] + var2;
                  int var208 = var5[3] + var3;
                  short var225 = var5[5];
                  short var234 = var5[6];
                  int var241 = var5[9] & 255;
                  int var259 = var5[10] & 255;
                  int var269 = var5[11] & 255;
                  int var283 = var5[12] & 255;
                  int var294 = var241 << 24 | var259 << 16 | var269 << 8 | var283;
                  int var300 = var241;
                  var241 = var5[13] & 255;
                  var259 = var5[14] & 255;
                  var269 = var5[15] & 255;
                  var283 = var5[16] & 255;
                  int var308 = var241 << 24 | var259 << 16 | var269 << 8 | var283;
                  byte var121 = 16;
                  switch (var5[8]) {
                     case 0:
                        var121 = 16;
                        break;
                     case 1:
                        var121 = 32;
                        break;
                     case 2:
                        var121 = 4;
                        break;
                     case 3:
                        var121 = 8;
                  }

                  if (var300 == 255 && var241 == 255) {
                     byte var351 = var121;
                     boolean var326 = false;
                     a(am, var6, var208, var225, var234, var294, var308, var351);
                  } else {
                     byte var350 = var121;
                     boolean var325 = false;
                     b(am, var6, var208, var225, var234, var294, var308, var350);
                  }
               }
               break;
            case 6:
               if (var5[10] != 0) {
                  var2 = var2;
                  var1 = var1;
                  var0 = var0;
                  boolean var223 = false;
                  int var206 = 0;
                  var6 = var0;
                  Graphics var178 = am;
                  short[] var240 = ag[var0][var1];
                  short var253 = (em[var0][var1] & 1) != 0;
                  a(et, var0, var1, var2, var3);
                  var253 = var253 && a(cB, cC, et[0], et[1], et[2], et[3]);
                  boolean var268 = (em[var0][var1] & 32) != 0;
                  int var279 = (em[var0][var1] & 4) != 0;
                  boolean var293 = (em[var0][var1] & 8) != 0;
                  boolean var299 = (em[var0][var1] & 16) != 0;
                  boolean var307 = (em[var0][var1] & 64) != 0;
                  short var316 = var240[5];
                  short var118 = var253 ? var240[9] : var240[7];
                  if (var279) {
                     var118 = var240[13];
                  }

                  short var324 = var279 ? (var240[12] != -1 ? var240[12] : var240[6]) : (var253 ? var240[8] : var240[6]);
                  a var332;
                  if ((var332 = j[1][var316]) != null) {
                     var279 = 0;
                     if (var118 > 0) {
                        var279 = var332.l();
                        var332.m(var118);
                     }

                     if (var293) {
                        H(9);
                     }

                     if (var299) {
                        H(12);
                        e(12, 1, 64);
                     }

                     if (var307) {
                        e(11, 0, 0);
                        e(11, 3, 0);
                        e(11, 6, 64);
                        e(11, 7, 64);
                        int var338 = aq;
                        nN += var338;
                     }

                     var332.a(var178, var324, var240[2] + var2, var240[3] + var3, 0);
                     if (var118 > 0) {
                        var332.m(var279);
                     }

                     if (var240[18] >= 0) {
                        if (var240[25] == 5) {
                           var253 = var240[18];
                           short var339 = var240[19];
                           e(var253, var339, var240[2] + var2 + var240[22], var240[3] + var3 + var240[23]);
                        } else {
                           var253 = var253 ? var240[21] : var240[20];
                           a var340;
                           var279 = (var340 = j[var240[25]][var240[18]]).l();
                           var340.m(var253);
                           short var345 = var240[19];
                           var340.a(var178, var345, var240[2] + var2 + var240[22], var240[3] + var3 + var240[23], 0);
                           var340.m(var279);
                        }
                     }

                     if (en[var6][var1] != null) {
                        ey = en[var6][var1];
                        if (e == 17) {
                           ey = f(ey);
                        }

                        if ((var253 = var240[14]) == 4) {
                           Font var317 = Font.getFont(0, 0, 16);
                           am.setFont(var317);
                           bl(0, 0);
                           a(ey, var240[2] + var2 + var240[15] + 1, var240[3] + var3 + var240[16] + 1, 3);
                           bl(255, 255);
                           a(ey, var240[2] + var2 + var240[15], var240[3] + var3 + var240[16], 3);
                        } else {
                           a var341 = ax(var253);
                           short var346;
                           if (var240[26] != -1 && a(var240[27], var240[28], e)) {
                              var346 = var240[26];
                           } else {
                              var346 = var240[17];
                           }

                           int var349 = 0;
                           if (var346 >= 0) {
                              var349 = var341.l();
                              var341.m(var346);
                           }

                           if (var240[24] == 1) {
                              int var355 = i.a_;
                              a(i.a_, var341);
                              int var369 = var355;
                              String var366 = ey;
                              short[] var363 = var341.a(ey, var369, false);
                              int var417 = var240[2] + var2 + var240[15];
                              int var364 = var240[3] + var3 + var240[16];
                              var279 = var417;
                              short[] var258 = var363;
                              String var375 = ey;
                              var341.a(var178, var375, var258, var279, var364, 0, -1, 3);
                           } else {
                              var341.a(var178, ey, var240[2] + var2 + var240[15], var240[3] + var3 + var240[16], 3);
                           }

                           if (var346 > 0) {
                              var341.m(var349);
                           }
                        }
                     }

                     if (var307) {
                        int[] var342 = new int[4];
                        int var415 = var240[2] + var2;
                        var206 = var240[3] + var3;
                        var1 = var415;
                        var118 = var324;
                        int[] var233 = var342;
                        var223 = null;
                        var332.a(var233, var118, var1, var206);
                     }

                     if (var299) {
                        a(12, false);
                     }

                     if (var293) {
                        a(9, false);
                     }

                     if (var268) {
                        Object var107 = null;
                        ((l)null).a.getHeight();
                        var107 = null;
                        ((l)null).a.getHeight();
                     }
                  }
               }
               break;
            case 7:
               var4 = true;
               var0 = var0;
               short[] var155;
               short var398 = (var155 = ag[var0][var1])[2];
               short var406 = var155[3];
               short var412 = var155[5];
               short var205 = var155[6];
               var6 = var412;
               short var177 = var406;
               short var167 = var398;
               Object var222 = null;
               b(am, var167, var177, var6, var205);
               break;
            case 403:
               var2 = var2;
               var1 = var1;
               var0 = var0;
               if ((var5 = ag[var0][var1])[19] != 0) {
                  int[] var188 = new int[]{0, 0, mJ, mJ};
                  int var201 = var5[15];
                  short var220 = var5[14];
                  if (var5[16] * 100 / (var201 - var220) >= var5[18] || (mR & 1) != 0) {
                     a var239;
                     (var239 = er[var5[5]]).m(var5[7]);
                     int var354 = var1;
                     short[] var362;
                     var220 = (var362 = ag[var0][var1])[15];
                     short var232 = var362[14];
                     int var114 = var362[16];
                     boolean var137 = var362[17] > 0;
                     new StringBuffer()
                        .append(" Div By Zero painting progrss bar with values: max: ")
                        .append(var220)
                        .append("; min: ")
                        .append(var232)
                        .append("; itemIndex: ")
                        .append(var354)
                        .toString();
                     var201 = (var114 - var232 << 8) / (var220 - var232);
                     switch (var362[10]) {
                        case 0:
                           var201 = y(var201 * var362[8]);
                           if (var137) {
                              et[0] = var362[2] + var362[8] - var201;
                              et[1] = var362[3];
                              et[2] = var201;
                              et[3] = var362[9];
                           } else {
                              et[0] = var362[2];
                              et[1] = var362[3];
                              et[2] = var201;
                              et[3] = var362[9];
                           }
                           break;
                        case 1:
                           var201 = y(var201 * var362[9]);
                           if (var137) {
                              et[0] = var362[2];
                              et[1] = var362[3] + var362[9] - var201;
                              et[2] = var362[8];
                              et[3] = var201;
                           } else {
                              et[0] = var362[2];
                              et[1] = var362[3];
                              et[2] = var362[8];
                              et[3] = var201;
                           }
                     }

                     int var396 = et[0];
                     int var404 = et[1];
                     int var410 = et[2];
                     int var292 = et[3];
                     int var278 = var410;
                     int var267 = var404;
                     int var252 = var396;
                     Object var323 = null;
                     b(am, var252, var267, var278, var292);
                     var239.a(am, var5[6], var5[2] + var2, var5[3] + var3, 0);
                     var396 = var188[0];
                     var404 = var188[1];
                     var410 = var188[2];
                     var114 = var188[3];
                     int var315 = var410;
                     int var306 = var404;
                     int var298 = var396;
                     b(am, var298, var306, var315, var114);
                  }
               }
               break;
            case 405:
               if (var5[9] != 0) {
                  var2 = var2;
                  var1 = var1;
                  var0 = var0;
                  boolean var219 = false;
                  boolean var200 = false;
                  Graphics var175 = am;
                  short[] var238 = ag[var0][var1];
                  boolean var250 = (em[var0][var1] & 8) != 0;
                  boolean var266 = (em[var0][var1] & 16) != 0;
                  short var277 = var238[5];
                  short var291 = var238[6];
                  short var297;
                  if ((var297 = var238[8]) == -1) {
                     a var305;
                     if ((var305 = j[1][var277]) != null) {
                        int var314 = 0;
                        if (var238[7] > 0) {
                           var314 = var305.l();
                           var305.m(var238[7]);
                        }

                        if (var250) {
                           H(9);
                        }

                        if (var266) {
                           H(12);
                           e(12, 1, 64);
                        }

                        var305.a(var175, var291, var238[2] + var2, var238[3] + var3, 0);
                        if (var266) {
                           a(12, false);
                        }

                        if (var250) {
                           a(9, false);
                        }

                        if (var238[8] > 0) {
                           var305.m(var314);
                        }
                     }
                  } else {
                     l var395 = aS[var297];
                     int var403 = var238[2] + var2;
                     int var331 = var238[3] + var3;
                     int var322 = var403;
                     l var112 = var395;
                     int var348 = var331;
                     int var344 = var322;
                     l var337 = var112;
                     var250 = null;
                     a(am, var337, var344, var348, true);
                  }
               }
               break;
            case 406:
               if (var5[7] != 0) {
                  if (var5[8] == 0) {
                     H(9);
                     e(9, 2, 0);
                  }

                  var2 = var2;
                  var1 = var1;
                  var0 = var0;
                  boolean var218 = false;
                  boolean var199 = false;
                  short[] var237 = ag[var0][var1];
                  short var276 = var237[5];
                  short var290 = var237[6];
                  e(var276, var290, var237[2] + var2, var237[3] + var3);
                  a(9, false);
               }
               break;
            case 407:
               var2 = var2;
               var1 = var1;
               var0 = var0;
               var5 = ag[var0][var1];
               int[] var10000 = new int[]{a(am, true), 0, 0, 0};
               Object var7 = null;
               var10000[1] = b(am, true);
               var10000[2] = c(am, true);
               Object var8 = null;
               var10000[3] = d(am, true);
               int[] var187 = var10000;
               var7 = new int[]{0, 0, 0, 0};
               a var12;
               int var11 = (var12 = er[var5[5]]).l();
               var12.m(var5[7]);
               var12.a(am, var5[6], var5[2] + var2, var5[3] + var3, 0);
               var12.m(var11);
               int var26 = 0;
               short[] var27;
               int var28 = (var27 = ag[var0][var1])[25];
               int var245 = var27[24];
               int var13 = var27[26];
               int var24 = var27[27] > 0;
               new StringBuffer()
                  .append(" Div By Zero painting progrss bar with values: max: ")
                  .append(var28)
                  .append("; min: ")
                  .append(var245)
                  .append("; itemIndex: ")
                  .append(var1)
                  .toString();
               var8 = (var13 - var245 << 8) / (var28 - var245);
               switch (var27[11]) {
                  case 0:
                     var8 = y(var8 * var27[9]);
                     if (var24) {
                        et[0] = var27[2] + var27[9] - var8 + var2;
                        et[1] = var27[3] + var3;
                        et[2] = (int)var8;
                        et[3] = var27[10];
                     } else {
                        et[0] = var27[2] + var2;
                        et[1] = var27[3] + var3;
                        et[2] = (int)var8;
                        et[3] = var27[10];
                     }
                     break;
                  case 1:
                     var8 = y(var8 * var27[10]);
                     if (var24) {
                        et[0] = var27[2] + var2;
                        et[1] = var27[3] + var27[10] - var8 + var3;
                        et[2] = var27[9];
                        et[3] = (int)var8;
                     } else {
                        et[0] = var27[2] + var2;
                        et[1] = var27[3] + var3;
                        et[2] = var27[9];
                        et[3] = (int)var8;
                     }
               }

               int var10001 = var187[0];
               int var10002 = var187[1];
               int var10003 = var187[2];
               int var10004 = var187[3];
               int var10005 = et[0];
               int var10006 = et[1];
               int var10007 = et[2];
               var24 = et[3];
               var13 = var10007;
               var245 = var10006;
               var28 = var10005;
               int var371 = var10004;
               int var23 = var10003;
               int var9 = var10002;
               var26 = var10001;
               int[] var25 = (int[])var7;
               ((Object[])var7)[0] = var25[1] = var25[2] = var25[3] = 0;
               int var19 = var24;
               int var18 = var13;
               int var16 = var245;
               int var20 = var28;
               int var17 = var371;
               int var265 = var23;
               int var10 = var9;
               var8 = var26;
               boolean var392;
               if (var20 + var18 <= var8 || var16 + var19 <= var10 || var20 >= var8 + var265 || var16 >= var10 + var17) {
                  var392 = false;
               } else {
                  if (var26 < var28) {
                     var25[0] = var28;
                     if (var26 + var23 < var28 + var13) {
                        var25[2] = var26 + var23 - var28;
                     } else {
                        var25[2] = var13;
                     }
                  } else {
                     var25[0] = var26;
                     if (var26 + var23 > var28 + var13) {
                        var25[2] = var28 + var13 - var26;
                     } else {
                        var25[2] = var23;
                     }
                  }

                  if (var9 < var245) {
                     var25[1] = var245;
                     if (var9 + var371 < var245 + var24) {
                        var25[3] = var9 + var371 - var245;
                     } else {
                        var25[3] = var24;
                     }
                  } else {
                     var25[1] = var9;
                     if (var9 + var371 > var245 + var24) {
                        var25[3] = var245 + var24 - var9;
                     } else {
                        var25[3] = var371;
                     }
                  }

                  var392 = true;
               }

               if (var392) {
                  int var393 = (int)((Object[])var7)[0];
                  var10001 = (int)((Object[])var7)[1];
                  var10002 = (int)((Object[])var7)[2];
                  var245 = (int)((Object[])var7)[3];
                  var13 = var10002;
                  var19 = var10001;
                  var18 = var393;
                  b(am, var18, var19, var13, var245);
                  a var14;
                  var245 = (var14 = er[var5[12]]).l();
                  var14.m(var5[14]);
                  var14.a(am, var5[13], var5[2] + var2, var5[3] + var3, 0);
                  var14.m(var245);
                  int var394 = var187[0];
                  var10001 = var187[1];
                  var10002 = var187[2];
                  var23 = var187[3];
                  int var22 = var10002;
                  int var21 = var10001;
                  var20 = var394;
                  b(am, var20, var21, var22, var23);
                  short var15 = var5[15];
                  short var304 = var5[16];
                  short var313 = var5[17];
                  if (N(var0, var1)) {
                     if (var5[21] != -1) {
                        var15 = var5[21];
                     }

                     if (var5[22] != -1) {
                        var304 = var5[22];
                     }

                     if (var5[23] != -1) {
                        var313 = var5[23];
                     }
                  } else if ((em[var0][var1] & 1) != 0 || (em[var0][var1] & 2) != 0) {
                     if (var5[18] != -1) {
                        var15 = var5[18];
                     }

                     if (var5[19] != -1) {
                        var304 = var5[19];
                     }

                     if (var5[20] != -1) {
                        var313 = var5[20];
                     }
                  }

                  a var109;
                  var245 = (var109 = er[var15]).l();
                  var109.m(var313);
                  var109.a(am, var304, var5[2] + var2 + ((Object[])var7)[2], var5[3] + var3, 0);
                  var109.m(var245);
               }
         }
      }

      return var4;
   }

   private static boolean I(int var0, int var1) {
      return ag[var0][var1][10] != 0;
   }

   private static void d(int var0, int var1, boolean var2) {
      ag[var0][var1][10] = (short)(var2 ? 1 : 0);
   }

   private static void j(int var0, int var1, int var2) {
      c(var0, var1, 6, var2);
   }

   private static void k(int var0, int var1, int var2) {
      c(var0, var1, 8, var2);
   }

   private static boolean J(int var0, int var1) {
      return ag[var0][var1][10] != 0;
   }

   private static void c(int var0, int var1, String var2) {
      en[var0][var1] = var2;
   }

   private static void l(int var0, int var1, int var2) {
      c(var0, var1, 11, var2);
      en[var0][var1] = u(ag[var0][var1][11]);
   }

   static void a(int var0, int var1, boolean var2) {
      ag[var0][var1][10] = (short)(var2 ? 1 : 0);
   }

   private static void e(int var0, int var1, boolean var2) {
      if (var2) {
         em[var0][var1] = (short)(em[var0][var1] | 1);
      } else {
         em[var0][var1] = (short)(em[var0][var1] & -2);
      }
   }

   static void b(int var0, int var1, boolean var2) {
      c(var0, var1, !var2);
   }

   static void c(int var0, int var1, boolean var2) {
      if (var2) {
         em[var0][var1] = (short)(em[var0][var1] & -5);
      } else {
         em[var0][var1] = (short)(em[var0][var1] | 4);
      }
   }

   private static boolean K(int var0, int var1) {
      return (em[var0][var1] & 4) != 0;
   }

   private static void f(int var0, int var1, boolean var2) {
      ag[var0][var1][18] = (short)(var2 ? 1 : 0);
   }

   private static void a(int[] var0, int var1, int var2, int var3, int var4) {
      short[] var5 = ag[var1][var2];
      b(var0, var1, var2, var5[2] + var3, var5[3] + var4);
   }

   private static void b(int[] var0, int var1, int var2, int var3, int var4) {
      boolean var5 = (em[var1][var2] & 1) != 0;
      boolean var6 = (em[var1][var2] & 4) != 0;
      short[] var7;
      short var9 = (var7 = ag[var1][var2])[5];
      a var10;
      if ((var10 = j[1][var9]) != null) {
         short var8 = var6 ? (var7[12] != -1 ? var7[12] : var7[6]) : (var5 ? var7[8] : var7[6]);
         var9 = var8;
         var10.a(var0, var9, var3, var4);
      }
   }

   private static void m(int var0, int var1, int var2) {
      String var3 = u(var2);
      a(var0, var1, var3, false);
   }

   static void a(int var0, int var1, String var2) {
      a(var0, var1, var2, false);
   }

   private static void a(int var0, int var1, String var2, boolean var3) {
      en[var0][var1] = var2;
      if (var3) {
         boolean var4 = false;
         boolean var10000;
         if (var2 == null) {
            var10000 = false;
         } else {
            a var5 = ax(2);

            for (int var6 = 0; var6 < var2.length(); var6++) {
               if ((var3 = var2.charAt(var6)) != ' ' && var5.k(var3) == 1) {
                  var4 = true;
                  break;
               }
            }

            var10000 = var4;
         }

         if (var10000) {
            c(var0, var1, 7, 4);
         }
      }
   }

   private static void b(int[] var0) {
      c(var0, 86, 9, 0, 0);
   }

   private static void c(int[] var0, int var1, int var2, int var3, int var4) {
      short[] var6;
      short var9 = (var6 = ag[var1][var2])[5];
      short var5 = var6[6];
      int var7 = var6[7];
      a var10;
      if ((var10 = j[1][var9]) != null) {
         if (var7 >= 0) {
            var7 &= -1537;
            var10.a(var0, var7, var5, var3, var4);
         } else {
            var10.a(var0, var5, var3, var4);
         }
      }
   }

   private static void g(int var0, int var1, boolean var2) {
      if (!var2) {
         ag[var0][var1][7] = 0;
      } else {
         ag[var0][var1][7] = 1;
      }
   }

   private static void n(int var0, int var1, int var2) {
      ag[var0][var1][5] = (short)var2;
   }

   private static void L(int var0, int var1) {
      ag[var0][var1][6] = 1;
   }

   private static void M(int var0, int var1) {
      ag[85][var0][5] = 31;
      ag[85][var0][6] = (short)var1;
      ag[85][var0][7] = 0;
   }

   private static void b(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = a(am, true);
      int var7 = b(am, true);
      int var8 = c(am, true);
      int var9 = d(am, true);
      int var12 = var3;
      b(am, var1, var2, 7, var3);
      am.setColor(15497216);
      int var11 = var1;
      c(var0, var1, var2, 7, var12);
      am.setColor(16441517);
      int var10001 = var1 + 1;
      int var10002 = var2 + 1;
      var1 = var3 - 2;
      var12 = var10002;
      c(var0, var10001, var12, 5, var1);
      am.setColor(15497216);
      var1 = var3;
      int var10 = 0;
      if (var5 > 0 || var1 < var5 && var5 > 0) {
         int var19;
         var1 = (var19 = (var1 << 8) / var5) * var1 >> 8;
         var10 = var19 * var4 >> 8;
      }

      var10001 = var2 + var10;
      var2 = var1;
      var1 = var10001;
      c(var0, var11, var1, 7, var2);
      var1 = var9;
      int var21 = var8;
      int var20 = var7;
      int var13 = var6;
      b(am, var13, var20, var21, var1);
   }

   private static a ax(int var0) {
      a var1 = null;
      if (var0 == 1) {
         switch (e) {
            case 7:
            case 9:
            case 15:
            case 16:
            case 17:
               break;
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
               var1 = j[0][0];
         }
      } else if (var0 == 2) {
         switch (e) {
            case 7:
            case 9:
            case 15:
            case 16:
            case 17:
               break;
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
               var1 = j[0][1];
         }
      } else if (var0 == 3) {
         switch (e) {
            case 7:
            case 9:
            case 15:
            case 16:
            case 17:
               break;
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
               var1 = j[0][6];
         }
      } else if (var0 == 4) {
         switch (e) {
            case 7:
            case 9:
            case 15:
            case 16:
            case 17:
               break;
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
               var1 = j[0][1];
         }
      } else {
         switch (e) {
            case 7:
            case 9:
            case 15:
            case 16:
            case 17:
               break;
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            default:
               var1 = j[0][2];
         }
      }

      return var1;
   }

   private static void bO() {
      ez = 0;
      eA = 0;
   }

   private static int[] a(int var0, a var1) {
      int[] var2 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
      int var3 = 0;
      byte var4 = 0;

      while (var3 < ey.length()) {
         char var10000 = ey.charAt(var3);
         int var5 = 0;
         if (var10000 == '^') {
            try {
               var5 = Integer.parseInt(ey.substring(var3 + 1, var3 + 3));
            } catch (NumberFormatException var10) {
               var5 = -1;
            }

            int var6;
            int var7;
            var6 = (var7 = (var6 = i.a_) / var1.j() + (var6 % var1.j() != 0 ? 3 : 2)) * var1.j();
            String var8 = ey.substring(0, var3);

            for (int var9 = 0; var9 < var7; var9++) {
               var8 = var8 + ' ';
            }

            short[] var13 = var1.a(var8, var0, false);
            var2[var4] = var5;
            var2[var4 + 1] = var13[0];
            var2[var4 + 2] = var13[var13[0] << 1] - (var6 >> 1);
            ey = var8 + ey.substring(var3 + 3);
            var4 += 3;
         }

         var3++;
      }

      return var2;
   }

   private static int i(int var0, int var1, int var2, int var3) {
      int var4 = -1;
      int var5 = ag[var0].length;
      if (var3 >= 0) {
         if (j(var0, var3, var1, var2)) {
            var4 = var3;
         }
      } else if (X(cl | ck | cm)) {
         boolean var6 = false;
         int var14 = 0;
         var5--;

         for (; var5 >= 0 && var4 == -1; var5--) {
            switch (G(var0, var5)) {
               case 6:
                  if (j(var0, var5, var1, var2)) {
                     var4 = var5;
                  }
                  break;
               case 10:
                  if (X(ck)) {
                     boolean var10001;
                     label93: {
                        int var28 = 0;
                        int var23 = var5;
                        int var21 = var0;
                        if ((em[var0][var23] & 4) == 0) {
                           int var40 = var23;
                           int var35 = ag[var0][var23][2] + var1;
                           int var42 = var23;
                           var28 = var0;
                           var14 = ag[var28][var40][3] + var2;
                           var40 = var23;
                           var23 = var35 + ag[var21][var42][5] - 1;
                           var28 = var14 + ag[var28][var40][6] - 1;
                           if (a(cB, cC, var35, var14, var23, var28)) {
                              ay(var0);
                              var10001 = true;
                              break label93;
                           }
                        }

                        var10001 = false;
                     }

                     var14 |= var10001;
                     var6 = true;
                  }
                  break;
               case 407:
                  int var9 = 0;
                  int var8 = var5;
                  int var7 = var0;
                  boolean var11 = false;
                  boolean var10000;
                  if (N(var0, var8)) {
                     var10000 = false;
                  } else {
                     int var10 = var8;
                     if (ag[var7][var10][8] == 0) {
                        var10000 = false;
                     } else {
                        int var12 = 0;
                        var10 = var8;
                        int[] var13 = et;
                        var10 = var10;
                        int[] var25 = var13;
                        short[] var33 = ag[var7][var10];
                        var25[0] = var33[2] + var1;
                        var25[1] = var33[3] + var2;
                        var25[2] = var33[9];
                        var25[3] = var33[10];
                        var13[2] += var13[0];
                        var13[3] += var13[1];
                        if (a(cB, cC, et[0], et[1], et[2], et[3])) {
                           if (X(ck)) {
                              bP();
                              i(var0, var8, true);
                              var11 = true;
                           }

                           if (X(cl)) {
                              bP();
                              i(var0, var8, true);
                              var11 = true;
                           }

                           if (X(cm)) {
                              i(var0, var8, false);
                              var11 = true;
                           }

                           short[] var22;
                           var9 = (var22 = ag[var0][var8])[25];
                           short var34 = var22[24];
                           if (var22[11] == 0) {
                              if (var22[27] > 0) {
                                 var12 = et[2] - cB;
                                 var7 = et[2] - et[0];
                                 var9 = var34 + (var9 - var34) * var12 / var7;
                              } else {
                                 var12 = cB - et[0];
                                 var7 = et[2] - et[0];
                                 var9 = var34 + (var9 - var34) * var12 / var7;
                              }
                           } else if (var22[27] > 0) {
                              var12 = et[3] - cC;
                              var7 = et[3] - et[1];
                              var9 = var34 + (var9 - var34) * var12 / var7;
                           } else {
                              var12 = cC - et[1];
                              var7 = et[3] - et[1];
                              var9 = var34 + (var9 - var34) * var12 / var7;
                           }

                           var22[26] = (short)var9;
                        } else {
                           i(var0, var8, false);
                        }

                        var10000 = var11;
                     }
                  }

                  if (var10000) {
                     var4 = var5;
                  }
            }
         }

         if (var6 && !var14 && var0 == eq) {
            ep = eq;
            eq = -1;
         }

         if (var0 == eq) {
            aU();
         }
      }

      if (ep == var0) {
         ep = -1;
         return -2;
      } else {
         return var4;
      }
   }

   private static boolean j(int var0, int var1, int var2, int var3) {
      boolean var4 = false;
      if (K(var0, var1)) {
         return false;
      }

      if (!J(var0, var1)) {
         return false;
      }

      a(et, var0, var1, var2, var3);
      if (a(cB, cC, et[0], et[1], et[2], et[3])) {
         boolean var5 = false;
         if (X(ck)) {
            var5 = true;
            bP();
            e(var0, var1, true);
            if (!F() || dE()) {
               f(2, var0, var1, -1);
            }
         }

         if (X(cl)) {
            var5 = true;
            bP();
            e(var0, var1, true);
         }

         if (X(cm)) {
            var5 = true;
            e(var0, var1, false);
            var4 = true;
         }

         if (var5) {
            aU();
         }
      } else {
         e(var0, var1, false);
      }

      return var4;
   }

   private static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var0 >= var2 && var0 <= var4 && var1 >= var3 && var1 <= var5;
   }

   private static void ay(int var0) {
      if (var0 != eq) {
         ep = eq;
         eq = var0;
      }
   }

   private static void bP() {
      if (ag != null) {
         for (int var0 = 0; var0 < ag.length; var0++) {
            int var1 = var0;

            for (int var2 = 0; var2 < ag[var1].length; var2++) {
               if (E(var1, var2) == 6) {
                  e(var1, var2, false);
               }
            }
         }
      }
   }

   private static void k(int var0, int var1, int var2, int var3) {
      eu[0] = a(am, true);
      eu[1] = b(am, true);
      eu[2] = c(am, true);
      eu[3] = d(am, true);
      var2 = var2;
      var1 = var1;
      var0 = var0;
      b(am, var0, var1, var2, var3);
   }

   private static void bQ() {
      int var10000 = eu[0];
      int var10001 = eu[1];
      int var10002 = eu[2];
      int var3 = eu[3];
      int var2 = var10002;
      int var1 = var10001;
      int var0 = var10000;
      b(am, var0, var1, var2, var3);
   }

   private static void h(int var0, int var1, boolean var2) {
      short[] var3 = ag[var0][var1];
      if (var2) {
         var3[19] = 1;
      } else {
         var3[19] = 0;
      }
   }

   private static void o(int var0, int var1, int var2) {
      short[] var3 = ag[var0][var1];
      var2 = var2 < var3[14] ? var3[14] : (var2 > var3[15] ? var3[15] : var2);
      ag[var0][var1][16] = (short)var2;
   }

   private static void p(int var0, int var1, int var2) {
      short[] var3;
      (var3 = ag[var0][var1])[15] = (short)var2;
      var3[14] = 0;
   }

   private static boolean a(short var0, short var1, int var2) {
      var0 = 0 | var0;
      var1 <<= 17;
      var0 |= var1;
      var1 = 1 << var2 + 1;
      return (var0 & var1) != 0;
   }

   private static boolean N(int var0, int var1) {
      return (em[var0][var1] & 4) != 0;
   }

   private static void i(int var0, int var1, boolean var2) {
      if (var2) {
         em[var0][var1] = (short)(em[var0][var1] | 1);
      } else {
         em[var0][var1] = (short)(em[var0][var1] & -2);
      }
   }

   private static void O(int var0, int var1) {
      if (var1 != ag[var0].length) {
         short[][] var2 = new short[var1][];
         short[] var3 = new short[var1];
         String[] var4 = new String[var1];

         for (int var5 = 0; var5 < ag[var0].length && var5 < var1; var5++) {
            var2[var5] = ag[var0][var5];
            var3[var5] = em[var0][var5];
            var4[var5] = en[var0][var5];
         }

         ag[var0] = var2;
         em[var0] = var3;
         en[var0] = var4;
      }
   }

   private static void q(int var0, int var1, int var2) {
      ag[var0][var2] = null;
      ag[var0][var2] = new short[ek[var0][var1].length];

      for (int var3 = 0; var3 < ag[var0][var1].length; var3++) {
         ag[var0][var2][var3] = ag[var0][var1][var3];
      }

      em[var0][var2] = em[var0][var1];
      if (en[var0][var1] != null) {
         en[var0][var2] = new String(en[var0][var1]);
      }
   }

   private static void bR() {
      if (ab.e[7] < 40) {
         a(3, 10, u(106) + " " + an(ab.e[7]));
      } else {
         String var0;
         if (e != 15 && e != 17) {
            var0 = u(106) + " " + u(107);
         } else {
            var0 = u(106) + u(107);
         }

         a(3, 10, var0);
         o(3, 1, 100);
      }

      int[] var4 = new int[2];
      int[] var1 = new int[2];
      int[] var2 = new int[2];
      int[] var3 = new int[2];
      var4[0] = ab.e[2];
      var4[1] = ab.e[1];
      if (var4[0] != var4[1]) {
         int var5 = b(var4, 1);
         a(3, 11, an(var5));
         ab.e[2] = var5;
         if (i == 6) {
            lq = true;
            kk = true;
         }
      } else {
         a(3, 11, an(var4[1]));
      }

      var1[0] = ab.e[4];
      var1[1] = ab.e[3];
      if (var1[0] != var1[1]) {
         int var6 = b(var1, 1);
         a(3, 12, an(var6));
         ab.e[4] = var6;
         if (i == 6) {
            lq = true;
            kk = true;
         }
      } else {
         a(3, 12, an(var1[1]));
      }

      var2[0] = ab.e[6];
      var2[1] = ab.e[5];
      if (var2[0] != var2[1]) {
         int var7 = b(var2, 1);
         a(3, 13, "" + an(var7));
         ab.e[6] = var7;
      } else {
         a(3, 13, "" + an(var2[1]));
      }

      var3[0] = ab.e[9];
      var3[1] = ab.e[8];
      if (var3[0] != var3[1]) {
         int var8 = b(var3, 4);
         ab.e[9] = var8;
      }

      if (ab.e[9] >= bH && ab.e[7] < 40 && !v(31)) {
         aL();
      }

      if (eJ < 1000) {
         int var9 = (ab.e[8] - ab.e[9]) * eJ / 1000;
         int var10 = 100 * (ab.e[9] + var9) / eI;
         eJ = eJ + aq;
         o(3, 1, var10);
         if (eJ >= 1000) {
            bS();
         }
      }

      if (dh == 0L && I(3, 16)) {
         d(3, 16, false);
      } else {
         if (dh > 0L && !I(3, 16)) {
            d(3, 16, true);
         }
      }
   }

   private static void az(int var0) {
      eI = var0;
      eJ = 0;
   }

   private static void bS() {
      eI = bH;
      int var0 = 100 * ab.e[8] / eI;
      o(3, 1, var0);
      eJ = 1001;
   }

   static void G() {
      d(6, 5, false);
      f(6, 2, false);
      d(6, 1, false);
      d(6, 4, false);
      c(6, 0, 19, 13);
      if (z != 0) {
         c(6, 3, 18, 23);
         c(6, 3, 19, 44);
         c(6, 3, 7, 0);
         c(6, 3, 9, 1);
      }

      if (F()) {
         f(6, 2, z == 0);
         d(6, 1, z == 0);
         a(6, 2, "" + dM);
         eO = false;

         for (int var0 = 0; var0 < dM; var0++) {
            if (dQ[dK[var0]][11] == 1) {
               eO = true;
               break;
            }
         }

         if (eO) {
            d(6, 4, z == 0);
            c(6, 0, 19, 14);
         }
      }

      a(6, 0, F() & z == 0);
      a(6, 3, F());
      if (dJ >= dI && dM <= 0) {
         c(6, 0, 10, 0);
         f(6, 2, false);
      }
   }

   private static void bT() {
      for (int var0 = 0; var0 < 3; var0++) {
         a(4, var0 + 2, false);
         d(4, var0 + 7, false);
      }

      for (int var2 = 0; var2 < dM; var2++) {
         a(4, var2 + 2, true);
         d(4, var2 + 7, dQ[dK[var2]][11] > 0);
         int var1 = dQ[dK[var2]][8];
         c(4, var2 + 2, 19, var1);
         byte var3;
         if (dQ[dK[var2]][9] == 0) {
            var3 = 23;
         } else {
            var3 = 21;
         }

         c(4, var2 + 2, 18, var3);
         if (dQ[dK[var2]][1] == 151 || dQ[dK[var2]][1] == 152) {
            c(4, var2 + 2, 7, 7);
            c(4, var2 + 2, 9, 8);
         }
      }
   }

   static void k(int var0, int var1) {
      eZ[var0][var1] = 1;
      aw();
   }

   private static int bU() {
      int var0 = 0;

      for (int var1 = 0; var1 < eZ.length; var1++) {
         for (int var2 = 0; var2 < eZ[var1].length; var2++) {
            if (eZ[var1][var2] != 0) {
               var0++;
            }
         }
      }

      return var0;
   }

   private static int bV() {
      int var0 = 0;

      for (int var1 = 0; var1 < eZ.length; var1++) {
         for (int var2 = 0; var2 < eZ[var1].length; var2++) {
            var0++;
         }
      }

      return var0 - 1;
   }

   private static void bW() {
      d(13, 24, false);
      d(13, 25, false);
      d(13, 26, false);

      for (int var0 = 0; var0 < mt.length; var0++) {
         switch (mt[var0]) {
            case 0:
               d(13, 19, true);
               if (eT == 0) {
                  if (R(mu[var0], 0)) {
                     d(13, 24, true);
                  }

                  if (R(mu[var0], 1)) {
                     d(13, 25, true);
                  }

                  if (R(mu[var0], 2)) {
                     d(13, 26, true);
                  }
               }
               break;
            case 1:
               d(13, 20, true);
               break;
            case 2:
               d(13, 22, true);
               break;
            case 3:
               d(13, 21, true);
         }
      }

      switch (mo) {
         case 0:
            d(13, 19, true);
            if (eT == 0) {
               if (R(mp, 0)) {
                  d(13, 24, true);
               }

               if (R(mp, 1)) {
                  d(13, 25, true);
               }

               if (R(mp, 2)) {
                  d(13, 26, true);
                  return;
               }
            }
            break;
         case 1:
            d(13, 20, true);
            return;
         case 2:
            d(13, 22, true);
            return;
         case 3:
            d(13, 21, true);
      }
   }

   private static void aA(int var0) {
      P(var0, 0);
   }

   private static void P(int var0, int var1) {
      eT = var0;
      eU = var1;

      for (int var2 = 4; var2 < 9; var2++) {
         b(13, var2, false);
      }

      for (int var3 = 12; var3 < 16; var3++) {
         a(13, var3, false);
      }

      if (eS[eT] > 1) {
         c(13, 12, 17, 6);
         c(13, 13, 17, 4);
         c(13, 14, 17, 4);

         for (int var4 = 12; var4 < eS[eT] + 12; var4++) {
            b(13, var4, false);
            a(13, var4, true);
         }
      }

      switch (var0) {
         case 0:
            b(13, 8, true);
            break;
         case 1:
            b(13, 7, true);
            break;
         case 2:
            b(13, 5, true);
            break;
         case 3:
            b(13, 6, true);
            break;
         case 4:
            b(13, 4, true);
      }

      boolean var5;
      b(75, var5 = var0 == 4, false);
      b(13, 12 + eU, true);
      a(13, 15, false);
      bX();
      bW();
   }

   private static void aB(int var0) {
      eU = var0;

      for (int var1 = 12; var1 < 16; var1++) {
         a(13, var1, false);
         c(13, var1, 17, var1 == 12 + eU ? 6 : 4);
      }

      if (eS[eT] > 1) {
         for (int var2 = 12; var2 < eS[eT] + 12; var2++) {
            b(13, var2, false);
            a(13, var2, true);
         }
      }

      b(13, 12 + eU, true);
      bX();
      a(13, 15, false);
   }

   private static int aC(int var0) {
      byte var1 = 0;
      int var2 = 0;
      switch (var0) {
         case 0:
            var1 = 11;
            break;
         case 1:
            var1 = 22;
            break;
         case 2:
            var1 = 17;
            break;
         case 3:
            var1 = 0;
      }

      for (int var3 = 0; var3 < var1; var3++) {
         if (ad(n(b(14, var3, var0)))) {
            var2++;
         }
      }

      return var2;
   }

   private static void Q(int var0, int var1) {
      fg = new int[var0];
      byte var5 = 0;
      int var2 = 0;
      switch (var1) {
         case 0:
            var5 = 11;
            break;
         case 1:
            var5 = 22;
            break;
         case 2:
            var5 = 17;
            break;
         case 3:
            var5 = 0;
      }

      for (int var3 = 0; var3 < var5; var3++) {
         int var4;
         if (ad(var4 = n(b(14, var3, var1)))) {
            fg[var2] = var4;
            var2++;
         }
      }
   }

   private static boolean R(int var0, int var1) {
      byte var2 = 0;
      switch (var1) {
         case 0:
            var2 = 11;
            break;
         case 1:
            var2 = 22;
            break;
         case 2:
            var2 = 17;
            break;
         case 3:
            var2 = 0;
      }

      for (int var3 = 0; var3 < var2; var3++) {
         int var4 = n(b(14, var3, var1));
         if (var0 == var4) {
            return true;
         }
      }

      return false;
   }

   private static void a(int[][] var0, int var1, int var2, int var3, int var4, int var5) {
      var4 = var0[var2][var4];
      int var6 = var0[var2][var5];
      if ((var2 = bk(var2, var3)) > 0) {
         var4 -= var4 * var2 / 100;
         d(27, 6 + var1 * 20, true);
         d(27, 9 + var1 * 20, true);
         f(27, 8 + var1 * 20, true);
         String var8 = u(288);
         ad[0] = "-" + var2;
         String var9 = a(var8, ad, '#');
         a(27, 7 + var1 * 20, var9);
         a(27, 8 + var1 * 20, a((long)var4, e, " "));
         c(27, 1 + var1 * 20, a((long)var6, e, " "));
         c(27, 1 + var1 * 20, 15, 42);
         c(27, 1 + var1 * 20, 16, 4);
      } else {
         c(27, 1 + var1 * 20, a((long)var4, e, " "));
      }
   }

   private static void bX() {
      int var0;
      int var1;
      int var2;
      b(et, 13, 11, ag[13][11][2], ag[13][11][3]);
      var0 = et[2] - et[0];
      var1 = et[3] - et[1];
      fb.k();
      fb.b();
      fb.a(1);
      fb.c(ag[13][9][5]);
      fb.d(ag[13][9][6]);
      var2 = -1;
      label104:
      switch (eT) {
         case 0:
            switch (eU) {
               case 0:
                  Q(var2 = aC(0), 0);
                  break label104;
               case 1:
                  Q(var2 = aC(1), 1);
                  break label104;
               case 2:
                  Q(var2 = aC(2), 2);
                  break label104;
               case 3:
                  Q(var2 = aC(3), 3);
               default:
                  break label104;
            }
         case 1:
            var2 = 7;
            break;
         case 2:
            var2 = 17;
            break;
         case 3:
            var2 = 5;
            break;
         case 4:
            var2 = 0;
      }

      fb.b(var2);
      fa = var2;
      d(13, 17, fa > 4);
      d(13, 18, fa > 4);
      fb.g(var0 + 1);
      fb.h(var1 + 1);
      fb.e(ag[13][9][7] + var0);
      fb.f(var1);
      if (eT == 0) {
         fh = new int[var2];

         for (int var7 = 0; var7 < var2; var7++) {
            fh[var7] = -1000;
         }
      }

      au(27);
      O(27, ag[27].length + 20 * (var2 - 1));

      for (int var3 = 0; var3 < var2; var3++) {
         if (var3 != 0) {
            q(27, 0, var3 * 20);
            q(27, 1, var3 * 20 + 1);
            q(27, 5, var3 * 20 + 5);
            q(27, 2, var3 * 20 + 2);
            q(27, 3, var3 * 20 + 3);
            q(27, 4, var3 * 20 + 4);
            q(27, 6, var3 * 20 + 6);
            q(27, 7, var3 * 20 + 7);
            q(27, 8, var3 * 20 + 8);
            q(27, 9, var3 * 20 + 9);
            q(27, 10, var3 * 20 + 10);
            q(27, 11, var3 * 20 + 11);
            q(27, 12, var3 * 20 + 12);
            q(27, 13, var3 * 20 + 13);
            q(27, 14, var3 * 20 + 14);
            q(27, 15, var3 * 20 + 15);
            q(27, 16, var3 * 20 + 16);
            q(27, 17, var3 * 20 + 17);
            q(27, 18, var3 * 20 + 18);
            q(27, 19, var3 * 20 + 19);
            short var8 = ag[27][0][2];
            short var38 = ag[27][0][3];
            c(27, var3 * 20, 2, var8 + fb.i(var3));
            c(27, var3 * 20, 3, var38 + fb.j(var3));
            var8 = ag[27][1][2];
            var38 = ag[27][1][3];
            c(27, var3 * 20 + 1, 2, var8 + fb.i(var3));
            c(27, var3 * 20 + 1, 3, var38 + fb.j(var3));
            var8 = ag[27][5][2];
            var38 = ag[27][5][3];
            c(27, var3 * 20 + 5, 2, var8 + fb.i(var3));
            c(27, var3 * 20 + 5, 3, var38 + fb.j(var3));
            var8 = ag[27][2][2];
            var38 = ag[27][2][3];
            c(27, var3 * 20 + 2, 2, var8 + fb.i(var3));
            c(27, var3 * 20 + 2, 3, var38 + fb.j(var3));
            var8 = ag[27][3][2];
            var38 = ag[27][3][3];
            c(27, var3 * 20 + 3, 2, var8 + fb.i(var3));
            c(27, var3 * 20 + 3, 3, var38 + fb.j(var3));
            var8 = ag[27][4][2];
            var38 = ag[27][4][3];
            c(27, var3 * 20 + 4, 2, var8 + fb.i(var3));
            c(27, var3 * 20 + 4, 3, var38 + fb.j(var3));
            var8 = ag[27][6][2];
            var38 = ag[27][6][3];
            c(27, var3 * 20 + 6, 2, var8 + fb.i(var3));
            c(27, var3 * 20 + 6, 3, var38 + fb.j(var3));
            var8 = ag[27][7][2];
            var38 = ag[27][7][3];
            c(27, var3 * 20 + 7, 2, var8 + fb.i(var3));
            c(27, var3 * 20 + 7, 3, var38 + fb.j(var3));
            var8 = ag[27][8][2];
            var38 = ag[27][8][3];
            c(27, var3 * 20 + 8, 2, var8 + fb.i(var3));
            c(27, var3 * 20 + 8, 3, var38 + fb.j(var3));
            var8 = ag[27][9][2];
            var38 = ag[27][9][3];
            c(27, var3 * 20 + 9, 2, var8 + fb.i(var3));
            c(27, var3 * 20 + 9, 3, var38 + fb.j(var3));
            var8 = ag[27][10][2];
            var38 = ag[27][10][3];
            c(27, var3 * 20 + 10, 2, var8 + fb.i(var3));
            c(27, var3 * 20 + 10, 3, var38 + fb.j(var3));
         }
      }

      for (int var61 = 0; var61 < var2; var61++) {
         if (eT == 0) {
            int var4 = ag[27][11][2] - ag[27][0][2];
            int var5 = ag[27][19][2] - ag[27][0][2];
            short var19 = ag[27][11][2];
            short var49 = ag[27][11][3];
            c(27, var61 * 20 + 11, 2, var19 - var4 + fb.i(var61));
            c(27, var61 * 20 + 11, 3, var49 + fb.j(var61));
            var19 = ag[27][12][2];
            var49 = ag[27][12][3];
            c(27, var61 * 20 + 12, 2, var19 - var4 + fb.i(var61));
            c(27, var61 * 20 + 12, 3, var49 + fb.j(var61));
            var19 = ag[27][13][2];
            var49 = ag[27][13][3];
            c(27, var61 * 20 + 13, 2, var19 - var4 + fb.i(var61));
            c(27, var61 * 20 + 13, 3, var49 + fb.j(var61));
            var19 = ag[27][14][2];
            var49 = ag[27][14][3];
            c(27, var61 * 20 + 14, 2, var19 - var4 + fb.i(var61));
            c(27, var61 * 20 + 14, 3, var49 + fb.j(var61));
            var19 = ag[27][15][2];
            var49 = ag[27][15][3];
            c(27, var61 * 20 + 15, 2, var19 - var4 + fb.i(var61));
            c(27, var61 * 20 + 15, 3, var49 + fb.j(var61));
            var19 = ag[27][16][2];
            var49 = ag[27][16][3];
            c(27, var61 * 20 + 16, 2, var19 - var4 + fb.i(var61));
            c(27, var61 * 20 + 16, 3, var49 + fb.j(var61));
            var19 = ag[27][17][2];
            var49 = ag[27][17][3];
            c(27, var61 * 20 + 17, 2, var19 - var4 + fb.i(var61));
            c(27, var61 * 20 + 17, 3, var49 + fb.j(var61));
            var19 = ag[27][18][2];
            var49 = ag[27][18][3];
            c(27, var61 * 20 + 18, 2, var19 - var4 + fb.i(var61));
            c(27, var61 * 20 + 18, 3, var49 + fb.j(var61));
            var19 = ag[27][19][2];
            var49 = ag[27][19][3];
            c(27, var61 * 20 + 19, 2, var19 - var5 + fb.i(var61));
            c(27, var61 * 20 + 19, 3, var49 + fb.j(var61));
         }

         int var62 = 0;
         int var6 = 0;
         switch (eT) {
            case 0:
               var0 = var61;
               var62 = fg[var0];
               var6 = eV[var62][1];
               g(27, 3 + var61 * 20, true);
               n(27, 3 + var61 * 20, var62);
               c(27, 0 + var61 * 20, 18, -1);
               c(27, 0 + var61 * 20, 19, -1);
               c(27, 0 + var61 * 20, 20, -1);
               int var10001 = 4 + var61 * 20;
               String var70 = j(var6, 1);
               a(27, var10001, var70, false);
               c(27, 11 + var61 * 20, 18, -1);
               c(27, 11 + var61 * 20, 19, -1);
               c(27, 11 + var61 * 20, 20, -1);
               var10001 = 12 + var61 * 20;
               var70 = j(var6, 1);
               a(27, var10001, var70, false);
               if ((var0 = eV[var62][21]) > 0) {
                  var0 = 60000 / var0;
                  String var34 = "" + var0;
                  a(27, 17 + var61 * 20, var34);
                  a(27, 18 + var61 * 20, u(1202));
               } else {
                  a(27, 17 + var61 * 20, "10");
                  c(27, 16 + var61 * 20, 6, 48);
                  a(27, 18 + var61 * 20, u(1204));
               }

               var0 = o(9)[var62][1];
               c(27, 13 + var61 * 20, 5, 24);
               c(27, 13 + var61 * 20, 6, var0 + 15);
               if ((var0 = o(9)[var62][2]) != 15) {
                  c(27, 14 + var61 * 20, 5, 24);
                  c(27, 14 + var61 * 20, 6, var0 + 15);
               }

               if ((var0 = o(9)[var62][3]) != 15) {
                  c(27, 15 + var61 * 20, 5, 24);
                  c(27, 15 + var61 * 20, 6, var0 + 15);
               }

               e(var61, true);
               f(var61, false);
               if (eV[var62][18] <= ab.e[7]) {
                  c(27, 1 + var61 * 20, true);
                  if (eV[var62][10] == 0) {
                     c(27, 1 + var61 * 20, 19, 72);
                  } else {
                     c(27, 1 + var61 * 20, 19, 48);
                  }

                  c(27, 1 + var61 * 20, 18, 23);
                  c(27, 1 + var61 * 20, 20, 0);
                  a(eV, var61, var62, eT, 11, 13);
                  if (eV[var62][19] > 0) {
                     d(27, 10 + var61 * 20, true);
                  }
               } else {
                  c(27, 1 + var61 * 20, u(106) + " " + eV[var62][18]);
                  c(27, 1 + var61 * 20, 18, 21);
                  c(27, 1 + var61 * 20, 19, 7);
                  c(27, 1 + var61 * 20, 20, 0);
                  c(27, 1 + var61 * 20, false);
               }
               break;
            case 1:
               var62 = ak(b(14, var61, 6));
               var6 = eW[var62][39];
               int var69 = eW[var62][9];
               var0 = eW[var62][10];
               var1 = eW[var62][12];
               c(27, 0 + var61 * 20, 18, var69);
               c(27, 0 + var61 * 20, 19, var0);
               c(27, 0 + var61 * 20, 20, var1);
               a(27, 4 + var61 * 20, j(var6, 1));
               a(eW, var61, var62, eT, 17, 19);
               if (eW[var62][38] <= ab.e[7]) {
                  if (q.f() >= aJ() && var62 != 6) {
                     l(27, 1 + var61 * 20, 107);
                     c(27, 1 + var61 * 20, 15, 0);
                     c(27, 1 + var61 * 20, 18, -1);
                     c(27, 1 + var61 * 20, 19, -1);
                     c(27, 1 + var61 * 20, false);
                  } else {
                     c(27, 1 + var61 * 20, true);
                  }

                  if (eW[var62][16] == 0) {
                     c(27, 1 + var61 * 20, 19, 72);
                  } else {
                     c(27, 1 + var61 * 20, 19, 48);
                  }

                  c(27, 1 + var61 * 20, 18, 23);
                  c(27, 1 + var61 * 20, 20, 0);
               } else {
                  c(27, 1 + var61 * 20, u(106) + " " + eW[var62][38]);
                  c(27, 1 + var61 * 20, 18, 21);
                  c(27, 1 + var61 * 20, 19, 7);
                  c(27, 1 + var61 * 20, 20, 0);
                  c(27, 1 + var61 * 20, false);
               }
               break;
            case 2:
               var62 = ah(b(14, var61, 5));
               var6 = eX[var62][18];
               int var68 = eX[var62][4];
               var0 = eX[var62][5];
               var1 = eX[var62][7];
               c(27, 0 + var61 * 20, 18, var68);
               c(27, 0 + var61 * 20, 19, var0);
               c(27, 0 + var61 * 20, 20, var1);
               c(27, 0 + var61 * 20, 21, var1);
               a(27, 4 + var61 * 20, j(var6, 1));
               if (eX[var62][17] <= ab.e[7]) {
                  c(27, 1 + var61 * 20, true);
                  a(eX, var61, var62, eT, 9, 11);
                  if (eX[var62][8] == 0) {
                     c(27, 1 + var61 * 20, 18, 23);
                     c(27, 1 + var61 * 20, 19, 72);
                     c(27, 1 + var61 * 20, 20, 0);
                  } else {
                     c(27, 1 + var61 * 20, 18, 23);
                     c(27, 1 + var61 * 20, 19, 48);
                     c(27, 1 + var61 * 20, 20, 0);
                  }
               } else {
                  c(27, 1 + var61 * 20, u(106) + " " + eX[var62][17]);
                  c(27, 1 + var61 * 20, 18, 21);
                  c(27, 1 + var61 * 20, 19, 7);
                  c(27, 1 + var61 * 20, 20, 0);
                  c(27, 1 + var61 * 20, false);
               }
               break;
            case 3:
               var62 = ai(b(14, var61, 4));
               var6 = eY[var62][37];
               int var67 = eY[var62][9];
               var0 = eY[var62][10];
               var1 = eY[var62][12];
               c(27, 0 + var61 * 20, 18, var67);
               c(27, 0 + var61 * 20, 19, var0);
               c(27, 0 + var61 * 20, 20, var1);
               a(27, 4 + var61 * 20, j(var6, 1));
               if (eY[var62][36] <= ab.e[7]) {
                  if (q.g() >= aK() && eY[var62][0] == 1) {
                     l(27, 1 + var61 * 20, 107);
                     c(27, 1 + var61 * 20, 15, 0);
                     c(27, 1 + var61 * 20, 18, -1);
                     c(27, 1 + var61 * 20, 19, -1);
                     c(27, 1 + var61 * 20, false);
                  } else if (eY[var62][0] != 1 && q.c(eY[var62][0]) > 0) {
                     l(27, 1 + var61 * 20, 263);
                     c(27, 1 + var61 * 20, 15, 0);
                     c(27, 1 + var61 * 20, 18, -1);
                     c(27, 1 + var61 * 20, 19, -1);
                     c(27, 1 + var61 * 20, false);
                  } else {
                     a(eY, var61, var62, eT, 17, 19);
                     c(27, 1 + var61 * 20, a((long)eY[var62][17], e, " "));
                     c(27, 1 + var61 * 20, true);
                     if (eY[var62][16] == 0) {
                        c(27, 1 + var61 * 20, 19, 72);
                     } else {
                        c(27, 1 + var61 * 20, 19, 48);
                     }

                     c(27, 1 + var61 * 20, 18, 23);
                     c(27, 1 + var61 * 20, 20, 0);
                  }
               } else {
                  c(27, 1 + var61 * 20, u(106) + " " + eY[var62][36]);
                  c(27, 1 + var61 * 20, 18, 21);
                  c(27, 1 + var61 * 20, 19, 7);
                  c(27, 1 + var61 * 20, 20, 0);
                  c(27, 1 + var61 * 20, false);
               }
         }
      }

      fb.a(false);
      fb.b(true);
      fd = et[0];
      fe = et[1];
      fc[0] = ag[13][9][2];
      fc[1] = ag[13][9][3];
      fc[2] = ag[13][9][5];
      fc[3] = ag[13][9][6];
      fb.k();
      ff = 0;
   }

   private static void bY() {
      fb.i();
      int var0 = cB;
      int var1 = cC;
      if (b(var0, var1, fc)) {
         km = true;
         if (X(cl)) {
            fb.b(cD, cE);
         }

         if (W(cm)) {
            fb.a(cD, cE);
            var0 = fb.c(cB - fd, cC - fe);
            if (u.b >= 0 && u.b != var0) {
               return;
            }

            if (var0 >= 0) {
               ff = var0;
               S(var0, cm);
               fb.j();
            }
         }

         if (X(cl | ck)) {
            var0 = fb.c(cB - fd, cC - fe);
            if (u.b >= 0 && u.b != var0) {
               return;
            }

            if (var0 >= 0) {
               S(var0, ck);
            }
         }
      }

      d(13, 17, fa > 4 && fb.c() < 0);
      d(13, 18, fa > 4 && fb.c() > -(fb.g() - fb.e()));
   }

   private static void e(int var0, boolean var1) {
      a(27, 0 + var0 * 20, var1);
      a(27, 1 + var0 * 20, var1);
      g(27, 3 + var0 * 20, var1);
      f(27, 4 + var0 * 20, var1);
   }

   private static void f(int var0, boolean var1) {
      a(27, 11 + var0 * 20, var1);
      f(27, 12 + var0 * 20, var1);
      d(27, 16 + var0 * 20, var1);
      f(27, 17 + var0 * 20, var1);
      f(27, 18 + var0 * 20, var1);
      d(27, 13 + var0 * 20, var1);
      int var2 = fg[var0];
      if (o(9)[var2][2] != 15) {
         d(27, 14 + var0 * 20, var1);
      }

      if (o(9)[var2][3] != 15) {
         d(27, 15 + var0 * 20, var1);
      }
   }

   private static void S(int var0, int var1) {
      int var2 = fb.c();
      int var3 = fb.d();
      var2 = i(27, var2, var3, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm && !u.c && aR >= 400) {
         var1 = ff;
         var3 = ff;
         if (eT == 0) {
            var1 = fg[var3];
         } else if (eT == 3) {
            var1 = ai(b(14, var1, 4));
         } else if (eT == 2) {
            var1 = ah(b(14, var1, 5));
         } else if (eT == 1) {
            var1 = ak(b(14, var1, 6));
         }

         switch (var2 % 20) {
            case 0:
            case 5:
               if (eT == 0) {
                  a(51);
                  e(var3, false);
                  d(27, 19 + var3 * 20, true);
                  fh[var3] = 25000;
               } else {
                  a(51);
                  if (eT == 1) {
                     l(var1);
                  }

                  au(eT, var1);
               }
               break;
            case 1:
               var2 = bk(var1, eT);
               r(var1, eT, var2);
               break;
            case 11:
               a(50);
               f(var3, false);
               d(27, 19 + var3 * 20, true);
               fh[var3] = 0;
         }

         var1 = var0;
         var2 = fg[var1];
         if (eV[var2][18] <= ab.e[7]) {
            eV[var2][19] = 0;
            d(27, 10 + var0 * 20, false);
         }
      }
   }

   private static void bZ() {
      String var0 = "Shop_UnlockNew";
      byte[] var1 = new byte[0 + 4 * (eV.length << 1) + 2 * (eV.length << 1)];
      int var2 = 0;

      for (int var3 = 0; var3 < eV.length; var3++) {
         a(var1, var2, (byte)eV[var3][19]);
         var2++;
      }

      try {
         a(var0, var1);
      } catch (RecordStoreException var4) {
      }
   }

   private static void T(int var0, int var1) {
      if (var0 == 0) {
         Date var2;
         (var2 = new Date()).getTime();
         int var5;
         if ((var5 = a(var2) - mr) < 0) {
            var5 += 7;
         }

         int var6 = 7 - var5;
         String var4 = u(287);
         ad[0] = "" + var6;
         var4 = a(var4, ad, '#');
         a(41, 4, var4);
         l(mp, mo, mq, 0);
         l(mu[0], mt[0], mv[0], 10);
         l(mu[1], mt[1], mv[1], 20);
         l(mu[2], mt[2], mv[2], 30);

         for (int var3 = 0; var3 < fh.length; var3++) {
            fh[var3] = -1000;
         }
      }

      if (var0 == 2) {
         Calendar var7;
         int var12 = (var7 = Calendar.getInstance()).get(11);
         int var16 = var7.get(12);
         int var8 = var7.get(13);
         var12 = 24 - var12;
         var16 = 60 - var16;
         int var9;
         if ((var9 = 60 - var8) >= 60) {
            var9 = 0;
            var16 = (var16 + 1) % 60;
         }

         String var10 = "" + var9;
         String var18 = "" + var16;
         String var14 = "" + var12;
         if (var10.length() == 1) {
            var10 = "0" + var10;
         }

         if (var18.length() == 1) {
            var18 = "0" + var18;
         }

         if (var14.length() == 1) {
            var14 = "0" + var14;
         }

         String var11 = var14 + ":" + var18 + ":" + var10;
         a(41, 3, var11);
      }

      if (var0 == 5) {
         switch (var1) {
            case 5:
            case 14:
               a(51);
               if (mo == 0) {
                  g(0, false);
                  j(0, mp, true);
                  fh[0] = 2500;
                  return;
               }

               au(mo, mp);
               return;
            case 6:
               if (mo != 0) {
                  a(60);
               }

               ml = 0;
               r(mp, mo, mq);
               return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 45:
            case 46:
            case 47:
            case 48:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            default:
               break;
            case 15:
            case 24:
               a(51);
               if (mt[0] == 0) {
                  g(10, false);
                  j(8, mu[0], true);
                  fh[1] = 2500;
                  return;
               }

               au(mt[0], mu[0]);
               return;
            case 16:
               if (mt[0] != 0) {
                  a(60);
               }

               r(mu[0], mt[0], mv[0]);
               if (!v(3)) {
                  eT = mt[0];
                  ff = mu[0];
                  return;
               }
               break;
            case 25:
            case 34:
               a(51);
               if (mt[1] == 0) {
                  g(20, false);
                  j(16, mu[1], true);
                  fh[2] = 2500;
                  return;
               }

               au(mt[1], mu[1]);
               return;
            case 26:
               if (mt[1] != 0) {
                  a(60);
               }

               r(mu[1], mt[1], mv[1]);
               if (!v(3)) {
                  eT = mt[1];
                  ff = mu[1];
                  return;
               }
               break;
            case 35:
            case 44:
               a(51);
               if (mt[2] == 0) {
                  g(30, false);
                  j(24, mu[2], true);
                  fh[3] = 2500;
                  return;
               }

               au(mt[2], mu[2]);
               return;
            case 36:
               if (mt[2] != 0) {
                  a(60);
               }

               r(mu[2], mt[2], mv[2]);
               if (!v(3)) {
                  eT = mt[2];
                  ff = mu[2];
                  return;
               }
               break;
            case 49:
               a(50);
               g(0, true);
               j(0, mp, false);
               return;
            case 57:
               a(50);
               g(10, true);
               j(8, mu[0], false);
               return;
            case 65:
               a(50);
               g(20, true);
               j(16, mu[1], false);
               return;
            case 73:
               a(50);
               g(30, true);
               j(24, mu[2], false);
         }
      }
   }

   private static void ca() {
      for (int var0 = 0; var0 < 4; var0++) {
         if (fh[var0] > 0) {
            fh[var0] = fh[var0] - aq;
            if (fh[var0] <= 0) {
               g(var0 * 10, true);
               if (var0 == 0) {
                  a(50);
                  j(0, mp, false);
               } else {
                  a(50);
                  j(var0 << 3, mu[var0 - 1], false);
               }

               kk = true;
               kl = 5;
            }
         }
      }
   }

   private static void g(int var0, boolean var1) {
      a(41, var0 + 6, var1);
      a(41, var0 + 5, var1);
      g(41, var0 + 9, var1);
      f(41, var0 + 10, var1);
   }

   private static void j(int var0, int var1, boolean var2) {
      a(41, var0 + 49, (boolean)var2);
      f(41, var0 + 50, (boolean)var2);
      d(41, var0 + 54, (boolean)var2);
      f(41, var0 + 55, (boolean)var2);
      f(41, var0 + 56, (boolean)var2);
      int var3 = o(9)[var1][1];
      d(41, var0 + 51, (boolean)var2);
      c(41, var0 + 51, 6, var3 + 15);
      if ((var3 = o(9)[var1][2]) != 15) {
         d(41, var0 + 52, (boolean)var2);
         c(41, var0 + 52, 6, var3 + 15);
      }

      if ((var3 = o(9)[var1][3]) != 15) {
         d(41, var0 + 53, (boolean)var2);
         c(41, var0 + 53, 6, var3 + 15);
      }

      int var10001 = var0 + 50;
      String var6 = j(eV[var1][1], 1);
      a(41, var10001, var6, false);
      if ((var1 = eV[var1][21]) > 0) {
         var2 = 60000 / var1;
         var1 = 60000 - var2 * var1;
         var2 += var1 / 1000;
         new StringBuffer().append("").append(var2).toString();
         a(41, var0 + 55, an(var2));
         a(41, var0 + 56, u(1202));
      } else {
         a(41, var0 + 55, "" + b(10L));
         c(41, var0 + 54, 6, 48);
         a(41, var0 + 56, u(1204));
      }
   }

   private static void r(int var0, int var1, int var2) {
      jq = 2;
      jr = var0;
      jt = q.an;
      js = var2;
      if (var1 != 0) {
         if (var1 == 1) {
            a(60);
            jq = 2;
            jr = var0;
            jt = q.an;
            q.a(z, 2, eW[var0][0], -1, -1);
            M(5);
         } else if (var1 == 3) {
            a(60);
            jq = 2;
            jr = var0;
            jt = q.an;
            byte var9 = cP[var0];
            q.a(z, var9, eY[var0][0], -1, -1);
            M(5);
         } else {
            if (var1 == 2) {
               a(60);
               jq = 2;
               jr = var0;
               jt = q.an;
               q.a(z, 8, eX[var0][0], -1, -1);
               M(5);
            }
         }
      } else {
         int var3 = eV[var0][11];
         int var4 = eV[var0][10];
         var3 -= var3 * var2 / 100;
         if (q.J().ak()) {
            if (ab.e[1] >= var3 || !bj()) {
               a(60);
            }

            boolean var10000;
            label73: {
               int var5 = 0;
               int var6 = -1;
               switch (var1) {
                  case 0:
                     if (eV[var0][18] > ab.e[7]) {
                        var10000 = false;
                        break label73;
                     }

                     var5 = eV[var0][11];
                     var6 = eV[var0][10];
                     var5 -= var5 * var2 / 100;
                     break;
                  case 1:
                     var5 = eW[var0][17];
                     var6 = eW[var0][16];
                     var5 -= var5 * var2 / 100;
                     break;
                  case 2:
                     if (eX[var0][17] > ab.e[7]) {
                        var10000 = false;
                        break label73;
                     }

                     var5 = eX[var0][9];
                     var6 = eX[var0][8];
                     var5 -= var5 * var2 / 100;
                     break;
                  case 3:
                     var5 = eY[var0][17];
                     var6 = eY[var0][16];
                     var5 -= var5 * var2 / 100;
                  case 4:
               }

               jq = 2;
               jr = var0;
               jt = q.an;
               var10000 = a(var6 == 0, var5, false);
            }

            if (var10000) {
               M(5);
               q.a(z, eV[var0][0], null, (byte)13, (byte)1, true);
               k(var1, var0);
               l(48, 0);
               a(var4 == 0, var3);
               q.c(q.J());
               var0 = eV[var0][0];
               f(10, 0, var0, -1);
               return;
            }
         } else {
            a(60);
            cb();
         }
      }
   }

   private static void cb() {
      v var0;
      if ((var0 = q.f(1)).aT < var0.aU) {
         d(3, u(129));
      } else {
         d(3, u(130));
      }
   }

   private static void l(int var0, int var1, int var2, int var3) {
      byte var9 = 48;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      switch (var1) {
         case 0:
            var4 = eV[var0][1];
            var8 = eV[var0][11];
            if (eV[var0][10] == 0) {
               var9 = 72;
            }
            break;
         case 1:
            var4 = eW[var0][39];
            var5 = eW[var0][9];
            var6 = eW[var0][10];
            var7 = eW[var0][12];
            var8 = eW[var0][17];
            if (eW[var0][16] == 0) {
               var9 = 72;
            }
            break;
         case 2:
            var4 = eX[var0][18];
            var5 = eX[var0][4];
            var6 = eX[var0][5];
            var7 = eX[var0][7];
            var8 = eX[var0][9];
            if (eX[var0][8] == 0) {
               var9 = 72;
            }
            break;
         case 3:
            var5 = eY[var0][9];
            var6 = eY[var0][10];
            var7 = eY[var0][12];
            var4 = eY[var0][37];
            if (q.g() >= aK() && eY[var0][0] == 1) {
               c(41, var3 + 6, 18, -1);
               c(41, var3 + 6, false);
               d(41, var3 + 13, false);
               l(41, var3 + 6, 107);
               d(41, var3 + 13, false);
               d(41, var3 + 8, false);
               var8 = 0;
               c(41, var3 + 6, 17, 0);
               c(41, var3 + 6, 15, 0);
               c(41, var3 + 6, 16, 0);
            } else if (eY[var0][0] != 1 && q.c(eY[var0][0]) > 0) {
               c(41, var3 + 6, 18, -1);
               c(41, var3 + 6, false);
               l(41, var3 + 6, 263);
               d(41, var3 + 13, false);
               d(41, var3 + 8, false);
               var8 = 0;
               c(41, var3 + 6, 17, 0);
               c(41, var3 + 6, 15, 0);
               c(41, var3 + 6, 16, 0);
            } else {
               var8 = eY[var0][17];
               if (eY[var0][16] == 0) {
                  var9 = 72;
               }
            }
      }

      if (var8 > 0) {
         c(41, var3 + 6, "" + an(var8));
         c(41, var3 + 6, 19, var9);
         a(41, var3 + 10, "" + j(var4, 1));
         String var10 = u(288);
         ad[0] = "-" + var2;
         String var11 = a(var10, ad, '#');
         a(41, var3 + 12, var11);
         a(41, var3 + 11, "" + an(var8 - var8 * var2 / 100));
      }

      if (var1 == 0) {
         g(41, var3 + 9, true);
         n(41, var3 + 9, var0);
         c(41, var3 + 7, 10, 0);
      } else {
         c(41, var3 + 7, 5, var5);
         c(41, var3 + 7, 6, var6);
         c(41, var3 + 7, 8, var7);
         c(41, var3 + 7, 10, 1);
         g(41, var3 + 9, false);
      }
   }

   private static void cc() {
      a(68);
      if (q.an != null && q.an.aP != 2) {
         q.a((byte)1);
         q.a(q.an.av - m + q.an.aR * 48, q.an.aw - n);
      }

      b(74, false, true);
      b(68, false, true);
   }

   private static void cd() {
      boolean var0 = s(q.b(q.an.au), q.an.ar);
      int var1 = g(q.b(q.an.au), q.an.ar, q.an.aT);
      String var10000 = u(var0 ? 65 : 66);
      String var3 = String.valueOf(var1);
      String[] var9 = new String[]{var3};
      String var2 = var10000;
      String var7 = "";
      int var13 = var2.indexOf(37);
      int var4 = 0;
      if (var13 < 0) {
         var10000 = var2;
      } else {
         int var5 = 0;
         var4 = 0;

         do {
            if ((var4 = var2.indexOf(37, var4)) < 0 || var4 == var2.length() - 1) {
               var7 = var7 + var2.substring(var5);
               var4 = -1;
            } else if (var2.charAt(var4 + 1) == 's') {
               int var6 = -1;
               if (var4 + 2 < var2.length()) {
                  var6 = var2.charAt(var4 + 2) - '0';
               }

               if (var6 >= 0 && var6 <= 9) {
                  var7 = var7 + var2.substring(var5, var4);
                  var7 = var7 + var9[var6];
                  var4 = var5 = var4 + 3;
               } else {
                  var4++;
               }
            } else {
               var4++;
            }
         } while (var4 >= 0);

         var10000 = var7;
      }

      var2 = var10000;
      if (var0) {
         jq = 0;
         jt = q.an;
         if (a(var0, var1)) {
            q.an.d((byte)6);
         }

         q.h();
      } else {
         a(2, var2, 3);
      }
   }

   private static void ce() {
      String.valueOf(q.E());
      b(18, true, true);
   }

   private static void cf() {
      int var0 = q.an.D();
      if (q.an.au == 8) {
         String var3 = u(280);
         ad[0] = "" + var0;
         var3 = a(var3, ad, '#');
         a(2, var3, 7);
      } else {
         String var1 = u(68);
         ad[0] = "" + var0;
         var1 = a(var1, ad, '#');
         a(2, var1, 7);
      }
   }

   private static void aD(int var0) {
      switch (var0 = cF[var0]) {
         case 0:
            cc();
            return;
         case 1:
            a(60);
            au(1, q.an.ar);
            return;
         case 2:
            a(60);
            ce();
            return;
         case 3:
            a(60);
            cd();
            return;
         case 4:
            a(60);
            cf();
            return;
         case 6:
         case 7:
         case 8:
            a(60);
            if (Q != null) {
               q.a(Q, false);
               R = -1;
            }

            R = var0 - 6;
            Q = q.an.o(R);
            if (z == 0) {
               b(65, true, false);
               return;
            }

            b(56, true, false);
            return;
         case 9:
            a(32);
            byte var1 = q.an.ar;
            f(36, q.an.ap(), var1, -1);
            q.an.aq();
            q.an.af();
            q.i();
            return;
         case 10:
            a(32);
            v.a(0, v.an(), q.an, q.an.aR * 48, -48);
            q.an.bi = true;
            A();

            for (int var3 = 0; var3 < q.an.aW; var3++) {
               if (q.an.aV[var3] != null) {
                  q.an.aV[var3].bn = false;
               }
            }

            q.i();
            f(40, c(z), -1, -1);
         case 5:
      }
   }

   private static void cg() {
      au(28);
      int var0 = q.an.aP;
      int var1 = q.an.at();
      int var2 = q.an.aW;
      int var3 = q.an.aX;
      int var4 = q.an.aY > 0;

      for (int var5 = 0; var5 <= 9; var5++) {
         a(28, var5, false);
      }

      int var18 = 0;
      switch (var0) {
         case 2:
            d(0, 2, 10, 38);
            var18++;
            break;
         case 4:
         case 7:
            if (z == 0) {
               if (var0 != 7) {
                  d(0, 0, 17, 27);
                  var18++;
               }

               d(var18, 1, 14, 29);
               var18++;
               if (var0 == 7) {
                  d(var18, 2, 10, 38);
                  var18++;
               }

               if (var2 == 0 && !var4) {
                  d(var18, 4, 12, 32);
                  var2 = q.an.D();
                  f(28, var18 + 10, true);
                  int var10001 = var18 + 10;
                  String var11 = a((long)var2, e, " ");
                  a(28, var10001, var11, false);
                  var18++;
               }

               if (var1 && var0 != 7) {
                  d(var18, 3, 13, 28);
                  var2 = g(q.b(q.an.au), q.an.ar, q.an.aT);
                  f(28, var18 + 10, true);
                  int var19 = var18 + 10;
                  String var13 = a((long)var2, e, " ");
                  a(28, var19, var13, false);
                  var18++;
               }

               for (int var14 = 0; var14 < var3; var14++) {
                  if (q.an.aV[var14] != null) {
                     b(var18, var14 + 6, q.an.aV[var14].ap());
                     if (q.an.aV[var14].bm[41] == 0) {
                        var0 = b(2, q.an.aV[var14].ar, 119);
                        var1 = b(2, q.an.aV[var14].ar, 120);
                        var4 = b(2, q.an.aV[var14].ar, 121);
                     } else {
                        var0 = b(2, q.an.aV[var14].ar, 122);
                        var1 = b(2, q.an.aV[var14].ar, 123);
                        var4 = b(2, q.an.aV[var14].ar, 124);
                     }

                     c(28, var18, 18, var0);
                     c(28, var18, 19, var1);
                     c(28, var18, 20, var4);
                     c(28, var18, 23, 0);
                     c(28, var18, 16, 30);
                     c(28, var18, 14, 2);
                     c(28, var18, 17, 3);
                     c(28, var18, 7, 11);
                     var18++;
                  }
               }

               if (q.an.ap() > 0) {
                  d(var18, 9, 18, 33);
                  var18++;
               }
            } else {
               d(0, 1, 14, 29);
               var18++;

               for (int var15 = 0; var15 < var3; var15++) {
                  if (q.an.aV[var15] != null) {
                     b(var18, var15 + 6, q.an.aV[var15].ap());
                     if (q.an.aV[var15].bm[41] == 0) {
                        var0 = b(2, q.an.aV[var15].ar, 119);
                        var1 = b(2, q.an.aV[var15].ar, 120);
                        var4 = b(2, q.an.aV[var15].ar, 121);
                     } else {
                        var0 = b(2, q.an.aV[var15].ar, 122);
                        var1 = b(2, q.an.aV[var15].ar, 123);
                        var4 = b(2, q.an.aV[var15].ar, 124);
                     }

                     c(28, var18, 18, var0);
                     c(28, var18, 19, var1);
                     c(28, var18, 20, var4);
                     c(28, var18, 23, 0);
                     c(28, var18, 16, 30);
                     c(28, var18, 14, 2);
                     c(28, var18, 17, 3);
                     c(28, var18, 7, 11);
                     var18++;
                  }
               }

               if (bh() && !q.an.bi) {
                  d(var18, 10, 18, 33);
                  var18++;
               }
            }
      }

      fj = (byte)var18;
      fo = 0;
   }

   private static void aE(int var0) {
      switch (var0 = cF[var0]) {
         case 0:
            cc();
            return;
         case 1:
            a(60);
            au(3, q.an.ar);
            return;
         case 2:
            a(60);
            ce();
            return;
         case 3:
            a(60);
            cd();
            return;
         case 5:
            R = -1;
            a(60);
            String.valueOf(q.E());
            b(18, true, true);
            return;
         case 6:
         case 7:
         case 8:
         case 9:
            a(60);
            q.K();
            R = var0 - 6;
            if (q.an.aV[R].bg.e[16] == 1) {
               k(0, q.an.aV[R].ar, true);
               return;
            }

            b(60, true, false);
            return;
         case 10:
         case 11:
         case 12:
         case 13:
            R = var0 - 10;
            a(60);
            ce();
            return;
         case 14:
            a(60);
            q.K();
            if (q.an != null && q.an.aP != 2 && q.J().ak()) {
               M(6);
            }

            q.h();
         case 4:
      }
   }

   public static void H() {
      au(28);
      byte var0 = q.an.aP;
      int var1 = q.an.at();
      int var2 = q.an.aW;
      int var3 = q.an.aX;

      for (int var4 = 0; var4 <= 9; var4++) {
         a(28, var4, false);
      }

      int var10 = 0;
      switch (var0) {
         case 2:
            d(0, 2, 10, 38);
            var10++;
            break;
         case 4:
         case 7:
            if (z == 0) {
               if (var0 != 7) {
                  d(0, 0, 17, 27);
                  var10++;
               }

               d(var10, 1, 14, 29);
               var10++;
               if (var0 == 7) {
                  d(var10, 5, 10, 38);
                  var10++;
               }

               if (var1 && var0 != 7) {
                  d(var10, 3, 13, 28);
                  var10++;
               }

               for (int var8 = 0; var8 < var3; var8++) {
                  if (q.an.aV[var8] != null) {
                     if (q.an.aV[var8].aP == 14) {
                        int var10001 = var8 + 10;
                        int var10002 = b(2, q.an.aV[var8].ar, 107);
                        byte var7 = q.an.aV[var8].ar;
                        int var6 = var10002;
                        int var5 = var10001;
                        var1 = var10;
                        a(28, var1, true);
                        c(28, var1, 18, var6);
                        c(28, var1, 19, var7);
                        l(28, var1, 38);
                        cF[var1] = var5;
                        c(28, var1, 25, 1);
                        c(28, var10, 23, 20);
                        c(28, var10, 25, 3);
                        c(28, var10, 18, b(2, q.an.aV[var8].ar, 107));
                        c(28, var10, 19, 0);
                        c(28, var10, 20, b(2, q.an.aV[var8].ar, 108));
                        c(28, var10, 21, b(2, q.an.aV[var8].ar, 108));
                     } else {
                        d(var10, var8 + 6, 35, 30);
                     }

                     var10++;
                  }
               }

               if (var2 < var3) {
                  d(var10, 14, 25, 31);
                  var10++;
               }
            } else {
               d(0, 1, 14, 29);
               var10++;
            }
      }

      fj = (byte)var10;
      fo = 0;
   }

   private static void aF(int var0) {
      int var10000 = cF[var0];
      int var2 = 0;
      switch (var10000) {
         case 0:
            cc();
            return;
         case 1:
            a(60);
            au(3, q.an.ar);
            return;
         case 2:
            a(60);
            ce();
            return;
         case 3:
         case 5:
         default:
            break;
         case 4:
            a(60);
            cf();
            return;
         case 6:
            a(60);
            if (z == 0) {
               b(61, true, false);
               return;
            }

            if (bh()) {
               b(61, true, false);
               return;
            }

            ch();
            return;
         case 7:
            a(60);
            q.an.as();
            if (q.an.au == 3) {
               q.i();
               return;
            }
            break;
         case 8:
            a(60);
            if (q.J().ak()) {
               r var5 = q.an.aV[0];
               q.J().a(var5);
               var5.d((byte)13);
               var5.e(q.J());
               q.an.p(0);
               q.an.d((byte)4);
               if (q.an.au == 3) {
                  q.i();
               }

               return;
            }

            d(3, u(102));
            return;
         case 9:
            a(60);
            r var7 = q.an.aV[0];
            var2 = null;
            var2 = var7.D();
            String var1 = u(268);
            ad[0] = "" + var2;
            var1 = a(var1, ad, '#');
            a(2, var1, 9);
      }
   }

   private static void ch() {
      String var0 = u(286);
      ad[0] = ao(m(hD));
      var0 = a(var0, ad, '%');
      fi = true;
      d(3, var0);
   }

   private static void ci() {
      au(28);
      int var0 = q.an.aP;
      q.an.at();
      int var1 = q.an.aW;

      for (int var2 = 0; var2 <= 9; var2++) {
         a(28, var2, false);
      }

      int var6 = 0;
      int var3 = 0;
      switch (var0) {
         case 2:
         case 23:
            d(0, 2, 10, 38);
            var6++;
            break;
         case 4:
            if (z == 0) {
               d(0, 0, 17, 27);
               var6++;
               d(1, 1, 14, 29);
               var6++;
               if (var1 == 0) {
                  d(2, 4, 12, 32);
                  var0 = q.an.D();
                  f(28, 12, true);
                  String var5 = a((long)var0, e, " ");
                  a(28, 12, var5, false);
                  var6++;
               }

               d(var6, 6, 9, 37);
               var6++;
               if (q.an.al()) {
                  d(var6, 7, 38, 109);
                  var6++;
               }
            } else {
               d(0, 1, 14, 29);
               var6++;
               d(1, 6, 9, 37);
               var6++;
               if (q.an.al()) {
                  d(2, 7, 38, 109);
                  var6++;
               }
            }
            break;
         case 25:
            d(0, 0, 17, 27);
            var6++;
            d(1, 1, 14, 29);
            var6++;
            d(7, 8, 37, 110);
            var3++;
            d(2, 9, 37, 32);
            var6++;
      }

      fj = (byte)var6;
      fo = (byte)var3;
   }

   private static void aG(int var0) {
      switch (cF[var0]) {
         case 0:
            cc();
            return;
         case 1:
            a(60);
            au(3, q.an.ar);
            return;
         case 2:
            a(60);
            ce();
            return;
         case 3:
            a(60);
            cd();
            return;
         case 4:
            a(60);
            cf();
            return;
         case 6:
            a(60);
            if (z == 0) {
               b(62, true, false);
               return;
            } else {
               if (!bh()) {
                  ch();
                  return;
               }

               v.a(0, v.an(), q.an, q.an.aR * 48, -48);
               A();
               q.i();
               f(32, -1, -1, -1);
               return;
            }
         case 7:
            a(60);
            q.an.d((byte)12);
            var0 = q.an.aZ;
            f(31, q.an.aZ, -1, -1);
         case 5:
      }
   }

   public static void I() {
      au(28);
      byte var0 = q.an.aP;
      boolean var1 = q.an.at();

      for (int var2 = 0; var2 <= 9; var2++) {
         a(28, var2, false);
      }

      int var5 = 0;
      switch (var0) {
         case 2:
            d(0, 2, 10, 38);
            var5++;
         case 3:
         case 5:
         case 6:
         case 8:
         case 9:
         default:
            break;
         case 4:
         case 7:
         case 10:
         case 11:
            if (z == 0) {
               if (var0 != 7 && var0 != 10) {
                  d(0, 0, 17, 27);
                  var5++;
               }

               d(var5, 1, 14, 29);
               var5++;
               if (var0 == 7) {
                  d(var5, 2, 10, 38);
                  var5++;
               }

               if (var0 == 4) {
                  d(var5, 4, 12, 32);
                  int var3 = q.an.D();
                  f(28, var5 + 10, true);
                  int var10001 = var5 + 10;
                  String var4 = a((long)var3, e, " ");
                  a(28, var10001, var4, false);
                  var5++;
               }

               if (var1 && var0 != 7 && var0 != 10) {
                  d(var5, 3, 13, 28);
                  int var7 = g(q.b(q.an.au), q.an.ar, q.an.aT);
                  f(28, var5 + 10, true);
                  int var9 = var5 + 10;
                  String var8 = a((long)var7, e, " ");
                  a(28, var9, var8, false);
                  var5++;
               }

               if (q.an.am()) {
                  d(var5, 6, 11, 39);
                  var5++;
               }

               if (var0 == 10) {
                  d(var5, 2, 10, 38);
                  var5++;
               }

               if (var0 == 11) {
                  d(var5 + 7, 7, 32, 42);
                  var5++;
               }
            } else {
               d(0, 1, 14, 29);
               var5++;
               d(1, 6, 11, 39);
               var5++;
            }
      }

      fj = (byte)var5;
      fo = 0;
   }

   private static void U(int var0, int var1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IllegalStateException: Could not find destination nodes for stat id {Block}:99 from source 98
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.setEdges(FlattenStatementsHelper.java:563)
      //   at org.jetbrains.java.decompiler.modules.decompiler.flow.FlattenStatementsHelper.buildDirectGraph(FlattenStatementsHelper.java:50)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.<init>(VarDefinitionHelper.java:151)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarDefinitionHelper.<init>(VarDefinitionHelper.java:52)
      //   at org.jetbrains.java.decompiler.modules.decompiler.vars.VarProcessor.setVarDefinitions(VarProcessor.java:52)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:458)
      //
      // Bytecode:
      // 000: iload 0
      // 001: ifne 02a
      // 004: invokestatic t.bP ()V
      // 007: getstatic t.iV I
      // 00a: invokestatic t.bf (I)I
      // 00d: bipush 1
      // 00e: invokestatic t.m (IZ)V
      // 011: getstatic t.iV I
      // 014: invokestatic t.bf (I)I
      // 017: invokestatic t.be (I)V
      // 01a: bipush 68
      // 01c: bipush 0
      // 01d: istore 5
      // 01f: bipush 0
      // 020: istore 4
      // 022: bipush 0
      // 023: bipush 1
      // 024: invokestatic t.b (IZZ)V
      // 027: invokestatic t.ck ()V
      // 02a: iload 0
      // 02b: bipush 1
      // 02c: if_icmpne 05c
      // 02f: bipush 9
      // 031: invokestatic t.v (I)Z
      // 034: ifeq 049
      // 037: bipush 0
      // 038: istore 4
      // 03a: getstatic t.jb [I
      // 03d: bipush 9
      // 03f: iaload
      // 040: ifne 049
      // 043: invokestatic t.F ()Z
      // 046: ifne 05c
      // 049: getstatic q.am B
      // 04c: ifne 05c
      // 04f: bipush 68
      // 051: bipush 0
      // 052: istore 5
      // 054: bipush 0
      // 055: istore 4
      // 057: bipush 1
      // 058: bipush 1
      // 059: invokestatic t.b (IZZ)V
      // 05c: iload 0
      // 05d: bipush 2
      // 05e: if_icmpne 2e5
      // 061: bipush 0
      // 062: istore 4
      // 064: getstatic t.jb [I
      // 067: bipush 74
      // 069: iaload
      // 06a: tableswitch 635 0 2 611 26 329
      // 084: bipush 68
      // 086: bipush 0
      // 087: istore 5
      // 089: bipush 0
      // 08a: bipush 0
      // 08b: invokestatic t.b (IZZ)V
      // 08e: bipush 70
      // 090: bipush 0
      // 091: bipush 0
      // 092: invokestatic t.b (IZZ)V
      // 095: bipush 73
      // 097: bipush 0
      // 098: bipush 0
      // 099: invokestatic t.b (IZZ)V
      // 09c: getstatic t.fk I
      // 09f: getstatic t.aq I
      // 0a2: iadd
      // 0a3: putstatic t.fk I
      // 0a6: getstatic t.fj B
      // 0a9: getstatic t.fo B
      // 0ac: if_icmple 0b6
      // 0af: getstatic t.fj B
      // 0b2: istore 2
      // 0b3: goto 0ba
      // 0b6: getstatic t.fo B
      // 0b9: istore 2
      // 0ba: bipush 0
      // 0bb: istore 3
      // 0bc: iload 3
      // 0bd: iload 2
      // 0be: if_icmpge 1b0
      // 0c1: getstatic t.fk I
      // 0c4: iload 3
      // 0c5: bipush 90
      // 0c7: imul
      // 0c8: if_icmple 1aa
      // 0cb: getstatic t.fk I
      // 0ce: iload 3
      // 0cf: bipush 90
      // 0d1: imul
      // 0d2: isub
      // 0d3: dup
      // 0d4: istore 4
      // 0d6: sipush 300
      // 0d9: if_icmpge 14a
      // 0dc: iload 3
      // 0dd: getstatic t.fj B
      // 0e0: if_icmpge 110
      // 0e3: getstatic t.fl I
      // 0e6: iload 4
      // 0e8: getstatic t.fm I
      // 0eb: getstatic t.fl I
      // 0ee: isub
      // 0ef: imul
      // 0f0: sipush 300
      // 0f3: idiv
      // 0f4: iadd
      // 0f5: istore 5
      // 0f7: bipush 28
      // 0f9: iload 3
      // 0fa: bipush 3
      // 0fb: iload 5
      // 0fd: invokestatic t.c (IIII)V
      // 100: bipush 28
      // 102: iload 3
      // 103: bipush 10
      // 105: iadd
      // 106: bipush 3
      // 107: iload 5
      // 109: getstatic t.fn I
      // 10c: isub
      // 10d: invokestatic t.c (IIII)V
      // 110: iload 3
      // 111: getstatic t.fo B
      // 114: if_icmpge 1aa
      // 117: getstatic t.fp I
      // 11a: iload 4
      // 11c: getstatic t.fq I
      // 11f: getstatic t.fp I
      // 122: isub
      // 123: imul
      // 124: sipush 300
      // 127: idiv
      // 128: iadd
      // 129: istore 5
      // 12b: bipush 28
      // 12d: iload 3
      // 12e: bipush 7
      // 130: iadd
      // 131: bipush 2
      // 132: iload 5
      // 134: invokestatic t.c (IIII)V
      // 137: bipush 28
      // 139: iload 3
      // 13a: bipush 17
      // 13c: iadd
      // 13d: bipush 2
      // 13e: iload 5
      // 140: getstatic t.fn I
      // 143: isub
      // 144: invokestatic t.c (IIII)V
      // 147: goto 1aa
      // 14a: iload 3
      // 14b: getstatic t.fj B
      // 14e: if_icmpge 16c
      // 151: bipush 28
      // 153: iload 3
      // 154: bipush 3
      // 155: getstatic t.fm I
      // 158: invokestatic t.c (IIII)V
      // 15b: bipush 28
      // 15d: iload 3
      // 15e: bipush 10
      // 160: iadd
      // 161: bipush 3
      // 162: getstatic t.fm I
      // 165: getstatic t.fn I
      // 168: isub
      // 169: invokestatic t.c (IIII)V
      // 16c: iload 3
      // 16d: getstatic t.fo B
      // 170: if_icmpge 191
      // 173: bipush 28
      // 175: iload 3
      // 176: bipush 7
      // 178: iadd
      // 179: bipush 2
      // 17a: getstatic t.fq I
      // 17d: invokestatic t.c (IIII)V
      // 180: bipush 28
      // 182: iload 3
      // 183: bipush 17
      // 185: iadd
      // 186: bipush 2
      // 187: getstatic t.fq I
      // 18a: getstatic t.fn I
      // 18d: isub
      // 18e: invokestatic t.c (IIII)V
      // 191: iload 3
      // 192: getstatic t.fj B
      // 195: bipush 1
      // 196: isub
      // 197: if_icmplt 1aa
      // 19a: iload 3
      // 19b: getstatic t.fo B
      // 19e: bipush 1
      // 19f: isub
      // 1a0: if_icmplt 1aa
      // 1a3: getstatic t.jb [I
      // 1a6: bipush 74
      // 1a8: bipush 0
      // 1a9: iastore
      // 1aa: iinc 3 1
      // 1ad: goto 0bc
      // 1b0: goto 2e5
      // 1b3: getstatic t.fk I
      // 1b6: getstatic t.aq I
      // 1b9: iadd
      // 1ba: putstatic t.fk I
      // 1bd: getstatic t.fj B
      // 1c0: getstatic t.fo B
      // 1c3: if_icmple 1cd
      // 1c6: getstatic t.fj B
      // 1c9: istore 2
      // 1ca: goto 1d1
      // 1cd: getstatic t.fo B
      // 1d0: istore 2
      // 1d1: bipush 0
      // 1d2: istore 3
      // 1d3: iload 3
      // 1d4: iload 2
      // 1d5: if_icmpge 2ca
      // 1d8: getstatic t.fk I
      // 1db: iload 3
      // 1dc: bipush 90
      // 1de: imul
      // 1df: if_icmple 2c4
      // 1e2: getstatic t.fk I
      // 1e5: iload 3
      // 1e6: bipush 90
      // 1e8: imul
      // 1e9: isub
      // 1ea: dup
      // 1eb: istore 4
      // 1ed: sipush 300
      // 1f0: if_icmpge 261
      // 1f3: iload 3
      // 1f4: getstatic t.fj B
      // 1f7: if_icmpge 227
      // 1fa: getstatic t.fm I
      // 1fd: iload 4
      // 1ff: getstatic t.fm I
      // 202: getstatic t.fl I
      // 205: isub
      // 206: imul
      // 207: sipush 300
      // 20a: idiv
      // 20b: isub
      // 20c: istore 5
      // 20e: bipush 28
      // 210: iload 3
      // 211: bipush 3
      // 212: iload 5
      // 214: invokestatic t.c (IIII)V
      // 217: bipush 28
      // 219: iload 3
      // 21a: bipush 10
      // 21c: iadd
      // 21d: bipush 3
      // 21e: iload 5
      // 220: getstatic t.fn I
      // 223: isub
      // 224: invokestatic t.c (IIII)V
      // 227: iload 3
      // 228: getstatic t.fo B
      // 22b: if_icmpge 2c4
      // 22e: getstatic t.fq I
      // 231: iload 4
      // 233: getstatic t.fq I
      // 236: getstatic t.fp I
      // 239: isub
      // 23a: imul
      // 23b: sipush 300
      // 23e: idiv
      // 23f: isub
      // 240: istore 5
      // 242: bipush 28
      // 244: iload 3
      // 245: bipush 7
      // 247: iadd
      // 248: bipush 2
      // 249: iload 5
      // 24b: invokestatic t.c (IIII)V
      // 24e: bipush 28
      // 250: iload 3
      // 251: bipush 17
      // 253: iadd
      // 254: bipush 2
      // 255: iload 5
      // 257: getstatic t.fn I
      // 25a: isub
      // 25b: invokestatic t.c (IIII)V
      // 25e: goto 2c4
      // 261: iload 3
      // 262: getstatic t.fj B
      // 265: if_icmpge 283
      // 268: bipush 28
      // 26a: iload 3
      // 26b: bipush 3
      // 26c: getstatic t.fl I
      // 26f: invokestatic t.c (IIII)V
      // 272: bipush 28
      // 274: iload 3
      // 275: bipush 10
      // 277: iadd
      // 278: bipush 3
      // 279: getstatic t.fl I
      // 27c: getstatic t.fn I
      // 27f: isub
      // 280: invokestatic t.c (IIII)V
      // 283: iload 3
      // 284: getstatic t.fo B
      // 287: if_icmpge 2a8
      // 28a: bipush 28
      // 28c: iload 3
      // 28d: bipush 7
      // 28f: iadd
      // 290: bipush 2
      // 291: getstatic t.fp I
      // 294: invokestatic t.c (IIII)V
      // 297: bipush 28
      // 299: iload 3
      // 29a: bipush 17
      // 29c: iadd
      // 29d: bipush 2
      // 29e: getstatic t.fq I
      // 2a1: getstatic t.fn I
      // 2a4: isub
      // 2a5: invokestatic t.c (IIII)V
      // 2a8: iload 3
      // 2a9: getstatic t.fj B
      // 2ac: bipush 1
      // 2ad: isub
      // 2ae: if_icmplt 2c4
      // 2b1: iload 3
      // 2b2: getstatic t.fo B
      // 2b5: bipush 1
      // 2b6: isub
      // 2b7: if_icmplt 2c4
      // 2ba: bipush 74
      // 2bc: bipush 0
      // 2bd: istore 5
      // 2bf: bipush 0
      // 2c0: bipush 0
      // 2c1: invokestatic t.b (IZZ)V
      // 2c4: iinc 3 1
      // 2c7: goto 1d3
      // 2ca: goto 2e5
      // 2cd: bipush 68
      // 2cf: bipush 0
      // 2d0: istore 5
      // 2d2: bipush 0
      // 2d3: bipush 0
      // 2d4: invokestatic t.b (IZZ)V
      // 2d7: bipush 70
      // 2d9: bipush 0
      // 2da: bipush 0
      // 2db: invokestatic t.b (IZZ)V
      // 2de: bipush 73
      // 2e0: bipush 0
      // 2e1: bipush 0
      // 2e2: invokestatic t.b (IZZ)V
      // 2e5: iload 0
      // 2e6: bipush 6
      // 2e8: if_icmpne 2fb
      // 2eb: invokestatic t.cj ()V
      // 2ee: bipush 0
      // 2ef: istore 5
      // 2f1: bipush 0
      // 2f2: istore 4
      // 2f4: getstatic t.jb [I
      // 2f7: bipush 74
      // 2f9: bipush 1
      // 2fa: iastore
      // 2fb: iload 0
      // 2fc: bipush 7
      // 2fe: if_icmpne 326
      // 301: getstatic t.ag [[[S
      // 304: bipush 28
      // 306: aaload
      // 307: bipush 0
      // 308: aaload
      // 309: bipush 3
      // 30a: saload
      // 30b: dup
      // 30c: putstatic t.fm I
      // 30f: bipush 120
      // 311: iadd
      // 312: putstatic t.fl I
      // 315: bipush 0
      // 316: putstatic t.fk I
      // 319: bipush 0
      // 31a: istore 5
      // 31c: bipush 0
      // 31d: istore 4
      // 31f: getstatic t.jb [I
      // 322: bipush 74
      // 324: bipush 2
      // 325: iastore
      // 326: iload 0
      // 327: bipush 5
      // 328: if_icmpne 574
      // 32b: getstatic q.an Lv;
      // 32e: ifnull 335
      // 331: iload 1
      // 332: ifge 336
      // 335: return
      // 336: getstatic q.an Lv;
      // 339: getfield q.au B
      // 33c: istore 2
      // 33d: new java/lang/StringBuffer
      // 340: dup
      // 341: invokespecial java/lang/StringBuffer.<init> ()V
      // 344: ldc "HUD BUILDING AND TYPE: "
      // 346: invokevirtual java/lang/StringBuffer.append (Ljava/lang/String;)Ljava/lang/StringBuffer;
      // 349: iload 2
      // 34a: invokevirtual java/lang/StringBuffer.append (I)Ljava/lang/StringBuffer;
      // 34d: invokevirtual java/lang/StringBuffer.toString ()Ljava/lang/String;
      // 350: pop
      // 351: aconst_null
      // 352: astore 4
      // 354: aconst_null
      // 355: astore 5
      // 357: iload 2
      // 358: tableswitch 540 1 10 61 56 526 536 242 151 387 531 540 66
      // 390: iload 1
      // 391: invokestatic t.aD (I)V
      // 394: return
      // 395: iload 1
      // 396: invokestatic t.aE (I)V
      // 399: return
      // 39a: iload 1
      // 39b: istore 0
      // 39c: getstatic t.cF [I
      // 39f: iload 0
      // 3a0: iaload
      // 3a1: lookupswitch 77 2 2 69 6 27
      // 3bc: getstatic q.an Lv;
      // 3bf: invokevirtual q.C ()I
      // 3c2: istore 0
      // 3c3: bipush 1
      // 3c4: putstatic t.jq I
      // 3c7: getstatic q.an Lv;
      // 3ca: putstatic t.jt Lq;
      // 3cd: getstatic t.ab Lw;
      // 3d0: getfield w.e [I
      // 3d3: pop
      // 3d4: bipush 1
      // 3d5: iload 0
      // 3d6: invokestatic t.a (ZI)Z
      // 3d9: ifeq 3ee
      // 3dc: getstatic q.an Lv;
      // 3df: invokevirtual v.ar ()V
      // 3e2: invokestatic t.ck ()V
      // 3e5: return
      // 3e6: bipush 60
      // 3e8: invokestatic t.a (I)V
      // 3eb: invokestatic t.ce ()V
      // 3ee: return
      // 3ef: iload 1
      // 3f0: istore 0
      // 3f1: getstatic t.cF [I
      // 3f4: iload 0
      // 3f5: iaload
      // 3f6: tableswitch 83 0 6 42 46 62 83 71 83 75
      // 420: invokestatic t.cc ()V
      // 423: return
      // 424: bipush 60
      // 426: invokestatic t.a (I)V
      // 429: bipush 3
      // 42a: getstatic q.an Lv;
      // 42d: getfield q.ar B
      // 430: invokestatic t.au (II)V
      // 433: return
      // 434: bipush 60
      // 436: invokestatic t.a (I)V
      // 439: invokestatic t.ce ()V
      // 43c: return
      // 43d: invokestatic t.cf ()V
      // 440: return
      // 441: bipush 60
      // 443: invokestatic t.a (I)V
      // 446: invokestatic q.y ()V
      // 449: return
      // 44a: iload 1
      // 44b: istore 0
      // 44c: getstatic t.cF [I
      // 44f: iload 0
      // 450: iaload
      // 451: tableswitch 137 0 6 43 47 63 137 72 137 81
      // 47c: invokestatic t.cc ()V
      // 47f: return
      // 480: bipush 60
      // 482: invokestatic t.a (I)V
      // 485: bipush 3
      // 486: getstatic q.an Lv;
      // 489: getfield q.ar B
      // 48c: invokestatic t.au (II)V
      // 48f: return
      // 490: bipush 60
      // 492: invokestatic t.a (I)V
      // 495: invokestatic t.ce ()V
      // 498: return
      // 499: bipush 60
      // 49b: invokestatic t.a (I)V
      // 49e: invokestatic t.cf ()V
      // 4a1: return
      // 4a2: bipush 60
      // 4a4: invokestatic t.a (I)V
      // 4a7: invokestatic t.cs ()I
      // 4aa: ifne 4b8
      // 4ad: bipush 3
      // 4ae: sipush 6170
      // 4b1: invokestatic t.u (I)Ljava/lang/String;
      // 4b4: invokestatic t.d (ILjava/lang/String;)V
      // 4b7: return
      // 4b8: getstatic t.ab Lw;
      // 4bb: getfield w.e [I
      // 4be: bipush 13
      // 4c0: iaload
      // 4c1: ifle 4d6
      // 4c4: bipush 2
      // 4c5: putstatic t.lC I
      // 4c8: bipush 35
      // 4ca: bipush 0
      // 4cb: istore 5
      // 4cd: bipush 0
      // 4ce: istore 4
      // 4d0: bipush 1
      // 4d1: bipush 0
      // 4d2: invokestatic t.b (IZZ)V
      // 4d5: return
      // 4d6: bipush 0
      // 4d7: invokestatic t.bq (I)V
      // 4da: return
      // 4db: iload 1
      // 4dc: istore 0
      // 4dd: getstatic t.cF [I
      // 4e0: iload 0
      // 4e1: iaload
      // 4e2: tableswitch 131 0 6 42 46 57 131 66 131 75
      // 50c: invokestatic t.cc ()V
      // 50f: return
      // 510: bipush 3
      // 511: getstatic q.an Lv;
      // 514: getfield q.ar B
      // 517: invokestatic t.au (II)V
      // 51a: return
      // 51b: bipush 60
      // 51d: invokestatic t.a (I)V
      // 520: invokestatic t.ce ()V
      // 523: return
      // 524: bipush 60
      // 526: invokestatic t.a (I)V
      // 529: invokestatic t.cf ()V
      // 52c: return
      // 52d: bipush 60
      // 52f: invokestatic t.a (I)V
      // 532: bipush 0
      // 533: putstatic t.lC I
      // 536: getstatic t.ab Lw;
      // 539: getfield w.e [I
      // 53c: bipush 12
      // 53e: iaload
      // 53f: ifle 552
      // 542: bipush 35
      // 544: bipush 0
      // 545: istore 5
      // 547: bipush 0
      // 548: istore 4
      // 54a: bipush 1
      // 54b: bipush 0
      // 54c: invokestatic t.b (IZZ)V
      // 54f: goto 562
      // 552: getstatic t.ab Lw;
      // 555: getfield w.e [I
      // 558: bipush 12
      // 55a: ldc 86400000
      // 55c: iastore
      // 55d: bipush 10
      // 55f: invokestatic t.M (I)V
      // 562: invokestatic t.aT ()V
      // 565: return
      // 566: iload 1
      // 567: invokestatic t.aF (I)V
      // 56a: return
      // 56b: iload 1
      // 56c: invokestatic t.aF (I)V
      // 56f: return
      // 570: iload 1
      // 571: invokestatic t.aG (I)V
      // 574: return
   }

   private static void cj() {
      fm = ag[28][0][3];
      fn = ag[28][0][3] - ag[28][10][3];
      fl = fm + 120;
      fk = 0;
      fp = (fq = ag[28][7][2]) + 120;

      for (int var0 = 0; var0 < 0 + fj; var0++) {
         c(28, var0, 3, fl);
      }

      for (int var1 = 10; var1 < 10 + fj; var1++) {
         c(28, var1, 3, fl - fn);
      }

      for (int var2 = 7; var2 < 7 + fo; var2++) {
         c(28, var2, 2, fp);
      }
   }

   private static void ck() {
      fj = 0;
      if (q.an != null) {
         au(28);
         byte var0 = 0;
         switch (q.an.au) {
            case 1:
               H();
               return;
            case 2:
               cg();
               return;
            case 3:
               ci();
               return;
            case 4:
               I();
            case 9:
            default:
               return;
            case 5:
               var0 = q.an.aP;
               q.an.at();

               for (int var17 = 0; var17 <= 9; var17++) {
                  a(28, var17, false);
               }

               switch (var0) {
                  case 2:
                     d(0, 2, 10, 38);
                     fj = 1;
                     fo = 0;
                     return;
                  case 4:
                     if (z == 0) {
                        d(0, 0, 17, 27);
                        d(1, 1, 14, 29);
                        d(2, 4, 12, 32);
                        int var18 = q.an.D();
                        f(28, 12, true);
                        String var10 = a((long)var18, e, " ");
                        a(28, 12, var10, false);
                        d(3, 6, 76, 41);
                        fj = 4;
                        fo = 0;
                        return;
                     } else {
                        d(0, 1, 14, 29);
                        fj = 1;
                        fo = 0;
                     }
                  default:
                     return;
               }
            case 6:
               var0 = q.an.aP;
               q.an.at();

               for (int var15 = 0; var15 <= 9; var15++) {
                  a(28, var15, false);
               }

               switch (var0) {
                  case 2:
                     d(0, 2, 10, 38);
                     fj = 1;
                     fo = 0;
                     return;
                  case 4:
                     if (z == 0) {
                        d(0, 0, 17, 27);
                        d(1, 1, 14, 29);
                        d(2, 4, 12, 32);
                        int var16 = q.an.D();
                        f(28, 12, true);
                        String var8 = a((long)var16, e, " ");
                        a(28, 12, var8, false);
                        d(3, 6, 10, 303);
                        fj = 4;
                        fo = 0;
                        return;
                     } else {
                        d(0, 1, 14, 29);
                        fj = 1;
                        fo = 0;
                     }
                  default:
                     return;
               }
            case 7:
               var0 = q.an.aP;
               q.an.at();

               for (int var13 = 0; var13 <= 9; var13++) {
                  a(28, var13, false);
               }

               switch (var0) {
                  case 2:
                     d(0, 2, 10, 38);
                     fj = 1;
                     fo = 0;
                     return;
                  case 4:
                     if (z == 0) {
                        d(0, 0, 17, 27);
                        d(1, 1, 14, 29);
                        d(2, 4, 12, 32);
                        int var14 = q.an.D();
                        f(28, 12, true);
                        String var6 = a((long)var14, e, " ");
                        a(28, 12, var6, false);
                        fj = 3;
                        fo = 0;
                        return;
                     } else {
                        d(0, 1, 14, 29);
                        fj = 1;
                        fo = 0;
                     }
                  default:
                     return;
               }
            case 8:
               q.an.at();

               for (int var11 = 0; var11 <= 9; var11++) {
                  a(28, var11, false);
               }

               if (z == 0) {
                  if (q.am == 0) {
                     d(0, 0, 17, 27);
                     d(1, 4, 12, 32);
                     int var12 = q.an.D();
                     f(28, 11, true);
                     String var4 = a((long)var12, e, " ");
                     a(28, 11, var4, false);
                  }

                  fj = 2;
                  fo = 0;
               }

               return;
            case 10:
               var0 = q.an.aP;
               q.an.at();

               for (int var1 = 0; var1 <= 9; var1++) {
                  a(28, var1, false);
               }

               switch (var0) {
                  case 4:
                     if (z == 0) {
                        d(0, 6, 12, 35);
                        fj = 1;
                        fo = 0;
                        f(28, 10, true);
                        String var3 = a((long)q.an.C(), e, " ");
                        a(28, 10, var3, false);
                        return;
                     }
                     break;
                  case 19:
                     d(0, 2, 10, 38);
                     fj = 1;
                     fo = 0;
               }
         }
      }
   }

   private static void V(int var0, int var1) {
      if (var0 == 0) {
         cX();
         ft = true;
         m(bf(iV), true);
         String var2 = jj;
         a(7, 4, var2, false);
         var2 = jk;
         a(7, 3, var2, false);
         if (jm != -1) {
            c(7, 5, 5, jm);
         }

         if (jn != -1) {
            c(7, 5, 6, jn);
         }

         aQ();
      }

      if (var0 == 5 && var1 == 2) {
         a(60);
         b(7, false, false);
         if (jf[0][2] >= 0) {
            bi(1);
         }

         aU();
         db();
      }

      if (var0 == 3) {
         if (ft) {
            a(63);
            ft = false;
         }

         H(iV, aq);
      }
   }

   private static void W(int var0, int var1) {
      if (var0 == 0) {
         cX();
         fu = true;
         if (F()) {
            b(73, false, true);
            if (!dE()) {
               b(68, false, true);
               c(8, 0, 5, jm);
               c(8, 0, 6, 0);
               int var2 = jn | 512;
               c(8, 0, 7, var2);
            }
         }

         if (F() && !dE()) {
            bf();
            x();
         }
      }

      if (var0 == 1 && F() && !dE()) {
         b(68, true, true);
         bg();
         y();
      }

      if (var0 == 3) {
         if (fu) {
            dF();
            if (d.l() == 73 || d.l() == 61) {
               d.k();
            }

            a(63);
            fu = false;
         }

         H(iV, aq);
      }

      if (var0 == 2) {
         if (fs && F() && ((fr = fr + aq) >= 4000 || q.an != null)) {
            fr = -1;
            b(9, false, false);
            b(68, true, true);
            fs = true;
            if (jf[0][2] >= 0) {
               bi(1);
            }
         }

         int var3 = b(8, en[8][2]);
         c(8, 2, 3, ek[8][2][3]);
         c(8, 1, 3, ek[8][1][3]);
         switch (var3) {
            case 0:
               break;
            case 1:
               j(8, 1, 98);
               c(8, 4, 3, 400);
               break;
            case 2:
               j(8, 1, 98);
               c(8, 4, 3, 400);
               break;
            case 3:
               j(8, 1, 97);
               c(8, 4, 3, 425);
               break;
            case 4:
               j(8, 1, 97);
               c(8, 4, 3, 425);
               break;
            case 5:
               j(8, 1, 19);
               break;
            case 6:
               j(8, 1, 107);
               c(8, 4, 3, 450);
               c(8, 1, 3, 375);
               c(8, 2, 3, 300);
               break;
            default:
               j(8, 1, 19);
         }
      }

      if (var0 == 5 && var1 == 3) {
         a(60);
         if (F() && !dE()) {
            b(9, false, false);
            b(68, true, true);
         }

         if (jf[0][2] >= 0) {
            bi(1);
         }
      }
   }

   private static void X(int var0, int var1) {
      if (var0 == 0) {
         cX();
         ft = true;
         if (F()) {
            b(73, false, true);
            if (!dE()) {
               b(68, false, true);
               c(8, 0, 5, jm);
               c(8, 0, 6, 3);
               int var2 = jn | 512;
               c(8, 0, 7, var2);
            }
         }

         if (F() && !dE()) {
            bf();
         }
      }

      if (var0 == 1 && F() && !dE()) {
         bg();
      }

      if (var0 == 3) {
         if (ft) {
            a(63);
            ft = false;
         }

         H(iV, aq);
      }

      if (var0 == 2) {
         if (fs && F() && ((fr = fr + aq) >= 4000 || q.an != null)) {
            fr = -1;
            b(10, false, false);
            b(68, true, true);
            fs = true;
            if (jf[0][2] >= 0) {
               bi(1);
            }
         }

         int var3 = b(92, en[92][2]);
         if (e == 17 && (var3 = en[92][2].length() / 35 + 1) >= 3) {
            var3++;
         }

         switch (var3) {
            case 0:
               break;
            case 1:
               j(92, 1, 109);
               c(92, 4, 3, 400);
               break;
            case 2:
               j(92, 1, 109);
               c(92, 4, 3, 400);
               break;
            case 3:
               j(92, 1, 108);
               c(92, 4, 3, 425);
               break;
            case 4:
               j(92, 1, 108);
               c(92, 4, 3, 425);
               break;
            case 5:
               j(92, 1, 111);
               break;
            case 6:
               j(92, 1, 110);
               c(92, 4, 3, 450);
               break;
            default:
               j(92, 1, 111);
         }
      }

      if (var0 == 5 && var1 == 3) {
         a(60);
         dE();
         if (F() && !dE()) {
            b(10, false, false);
            b(68, true, true);
         }

         if (jf[0][2] >= 0) {
            bi(1);
         }
      }
   }

   private static void Y(int var0, int var1) {
      if (var0 == 0) {
         cX();
         ft = true;
         m(bf(iV), true);
         if (jf[0][6] == 1) {
            a(9, 6, false);
            f(9, 2, true);
            String var2 = jl;
            a(9, 2, var2, false);
            c(9, 2, 10, 0);
         } else {
            a(9, 6, false);
            f(9, 2, false);
            c(9, 2, 10, 1);
         }

         String var4 = jk;
         a(9, 5, var4, false);
         if (fv) {
            fv = false;
            bO();
            c(9, 1, 3, ag[9][1][3] + 16);
            c(9, 1, 6, ag[9][1][6] + 32);
            c(9, 1, 12, 4);
            c(9, 1, 10, 0);
            c(9, 1, 22, 0);
            c(9, 1, 19, 1);
         }

         if (fw) {
            fw = false;
            c(9, 1, 26, 1);
            l(9, 3, 7257);
            c(9, 3, 18, -1);
            c(9, 3, 19, 0);
         } else if (fx) {
            fx = false;
            l(9, 3, 7272);
            l(9, 4, 7273);
            c(9, 3, 18, -1);
            c(9, 3, 19, 0);
            c(9, 4, 18, -1);
            c(9, 4, 19, 0);
         } else if (fy) {
            fy = false;
            l(9, 3, 7275);
            l(9, 4, 7276);
            c(9, 3, 18, -1);
            c(9, 3, 19, 0);
            c(9, 4, 18, -1);
            c(9, 4, 19, 0);
         } else if (fz) {
            fz = false;
            l(9, 3, 7281);
            l(9, 4, 7282);
            c(9, 3, 18, -1);
            c(9, 3, 19, 0);
            c(9, 4, 18, -1);
            c(9, 4, 19, 0);
         } else {
            c(9, 1, 26, 0);
         }

         var4 = jj;
         a(9, 1, var4, false);
         aQ();
      }

      if (var0 == 3) {
         if (ft) {
            ft = false;
         }

         cY();
         H(iV, aq);
      }

      if (var0 == 5) {
         if (var1 == 3 || var1 == 4) {
            b(5, false, false);
            if (var1 == 3) {
               if (jf[0][2] != 7) {
                  a(60);
               }

               bi(1);
            } else {
               a(61);
               bi(0);
            }

            aU();
            db();
            if (ls != 84) {
               aH();
               return;
            }
         } else if (var1 == 6) {
            r var3 = q.an.aV[R];
            k(0, var3.ar, true);
         }
      }
   }

   private static void Z(int var0, int var1) {
      if (var0 == 0) {
         cX();
         ft = true;
         m(bf(iV), true);
         if (jf[0][6] == 1) {
            a(30, 6, true);
            f(30, 2, true);
            String var2 = jl;
            a(30, 2, var2, false);
            c(30, 2, 10, 0);
         } else {
            a(30, 6, false);
            f(30, 2, false);
            c(30, 2, 10, 1);
         }

         String var5 = jj;
         a(30, 1, var5, false);
         var5 = jk;
         a(30, 5, var5, false);
         aQ();
      }

      if (var0 == 3) {
         if (ft) {
            ft = false;
         }

         cY();
         H(iV, aq);
      }

      if (var0 == 5) {
         if (var1 == 3 || var1 == 4) {
            boolean var4 = true;
            if (var1 == 3) {
               a(60);
               bi(1);
               if (jf[0][2] == 13 || jf[0][2] == 14) {
                  var4 = false;
               }
            } else {
               a(61);
               bi(0);
            }

            if (var4) {
               b(20, false, false);
            }

            aU();
            aH();
            db();
            return;
         }

         if (var1 == 6) {
            r var3 = q.an.aV[R];
            k(0, var3.ar, true);
         }
      }
   }

   private static void aa(int var0, int var1) {
      if (var0 == 0) {
         cX();
         ft = true;
         m(bf(iV), true);
         String var2 = jj;
         a(10, 1, var2, false);
         var2 = jk;
         a(10, 3, var2, false);
         aQ();
      }

      if (var0 == 2 && fi) {
         String var4 = u(286);
         ad[0] = ao(m(hD));
         var4 = a(var4, ad, '%');
         var4 = var4;
         a(10, 1, var4, false);
      }

      if (var0 == 1) {
         if (i == 6) {
            lt = 2;
            lq = true;
            ls = 13;
         }

         fi = false;
      }

      if (var0 == 3) {
         if (ft) {
            ft = false;
         }

         H(iV, aq);
         cY();
      }

      if (var0 == 5 && var1 == 2) {
         a(60);
         b(3, false, false);
         if (jf[0][2] >= 0) {
            bi(1);
         }

         aU();
         if (!v(67)) {
            aH();
         }

         db();
      }
   }

   private static void ab(int var0, int var1) {
      if (var0 == 0) {
         cX();
         ft = true;
         m(bf(iV), true);
         String var2 = jj;
         a(90, 1, var2, false);
         var2 = jk;
         a(90, 2, var2, false);
         if (jf[0][4] == 1) {
            j(90, 3, 1);
         } else {
            j(90, 3, 0);
         }

         aQ();
      }

      if (var0 == 3) {
         if (ft) {
            ft = false;
         }

         H(iV, aq);
         cY();
      }

      if (var0 == 5 && var1 == 4) {
         a(60);
         b(4, false, false);
         if (jf[0][2] >= 0) {
            bi(1);
         }

         aU();
         db();
      }
   }

   private static void ac(int var0, int var1) {
      if (var0 == 0) {
         cX();
         ft = true;
         m(bf(iV), true);
         if (jf[0][6] == 1) {
            a(11, 6, true);
            f(11, 3, true);
            String var2 = jl;
            a(11, 3, var2, false);
            c(11, 3, 10, 0);
         } else {
            a(11, 6, false);
            f(11, 3, false);
            c(11, 3, 10, 1);
         }

         String var4 = jj;
         a(11, 2, var4, false);
         var4 = jk;
         a(11, 0, var4, false);
         aQ();
      }

      if (var0 == 3) {
         if (ft) {
            ft = false;
         }

         cY();
         H(iV, aq);
      }

      if (var0 == 5) {
         if (var1 == 4 || var1 == 5) {
            b(6, false, false);
            if (var1 == 4) {
               a(60);
               bi(1);
            } else {
               a(61);
               bi(0);
            }

            aU();
            db();
            return;
         }

         if (var1 == 6) {
            r var3 = q.an.aV[R];
            k(0, var3.ar, true);
            return;
         }

         if (var1 == 7) {
            a(60);
            b(1, true, false);
         }
      }
   }

   private static void ad(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         int var3 = 0;
         int var2 = 0;
         b(68, false, true);
         Q.bb[0] = Q.bb[1] = Q.ba;
         o(24, 7, Q.bb[0]);
         ah = o(2)[Q.ar];
         String var4 = Q.d(false);
         a(24, 5, var4, false);
         if (ah[0] != 49) {
            j(24, 11, 46);
            var2 = ah[21 + Q.aZ - 1];
            var2 = 60000 / var2;
            String var10 = var2 + u(298);
            a(24, 4, u(106) + " " + Q.aZ);
            if (Q.aZ == 40) {
               c(24, 14, 13, 2);
               c(24, 14, false);
               a(24, 19, u(107));
            } else {
               var3 = ah[67 + (Q.aZ < 40 ? Q.aZ : 40) - 1];
               a(24, 19, "x " + var3);
            }

            a(24, 10, var10);
         } else {
            j(24, 11, 49);
            a(24, 4, u(106) + " " + Q.aZ);
            if (Q.aZ == 40) {
               c(24, 14, 13, 2);
               c(24, 14, false);
               a(24, 19, u(107));
            } else {
               j(24, 11, 49);
               a(24, 4, u(106) + " " + Q.aZ);
               if (Q.aZ == 40) {
                  c(24, 14, 13, 2);
                  c(24, 14, false);
                  a(24, 19, u(107));
               } else {
                  var2 = ah[67 + (Q.aZ < 40 ? Q.aZ : 40) - 1];
                  a(24, 19, "x " + var2);
               }

               a(24, 10, "10 " + u(1204));
            }

            a(24, 10, "10 " + u(1204));
         }

         if (Q.bm[41] != 0 && ah[0] != 49) {
            b(24, 15, false);
         } else {
            b(24, 15, true);
         }

         if (Q.bm[42] != 15) {
            d(24, 3, true);
            j(24, 3, Q.bm[42]);
         }

         if (Q.bm[43] != 15 && Q.bm[43] != Q.bm[42]) {
            d(24, 21, true);
            j(24, 21, Q.bm[43]);
         }

         if (Q.bm[44] != 15) {
            d(24, 22, true);
            j(24, 22, Q.bm[44]);
         }

         cl();
         q.c(z, 4);
         x();
         bf();
         bc();
         if (F()) {
            x();
            q.a(false);
         }

         aQ();
         bR = true;
      }

      if (var0 == 1) {
         cg();
         y();
         bg();
         bd();
         if (F()) {
            y();
         }

         r.be = false;
         bR = false;
         if (R != -1) {
            r var12;
            q.an.aV[R].a((var12 = q.an.aV[R]).bl[0], -1, false);
         }

         aR();
      }

      if (var0 == 2) {
         cl();
         if (Q.aZ < 40) {
            c(24, 14, true);
         }

         q.an.aV[R].k();

         for (int var13 = 0; var13 < q.af[z][4].length; var13++) {
            if (q.af[z][4][var13] != null) {
               q.af[z][4][var13].k();
            }
         }
      }

      if (var0 == 4) {
         int[] var14;
         c(var14 = new int[4], 24, 1, ag[24][1][2], ag[24][1][3]);
         if (R != -1) {
            short var22 = ag[24][8][2];
            short var29 = ag[24][8][3];
            int var10000 = var14[0];
            int var10001 = var14[1];
            int var10002 = var14[2] - var14[0];
            int var7 = var14[3] - var14[1];
            int var6 = var10002;
            int var5 = var10001;
            int var15 = var10000;
            b(am, var15, var5, var6, var7);
            Q.k(var22, var29);
            var14 = null;
            b(am, 0, 0, 800, 480);
         }
      }

      if (var0 == 5) {
         switch (var1) {
            case 14:
               Q.ak();
               return;
            case 15:
               a(60);
               boolean var36 = q.a(true);
               boolean var20 = false;
               if (!var36) {
                  boolean var28 = false;
                  b(65, false, false);
                  if (q.f(3) == null) {
                     String var33 = u(300);
                     a(2, var33, 11);
                     return;
                  }

                  String var32 = u(205);
                  d(3, var32);
                  return;
               }

               boolean var27 = false;
               b(65, false, false);
               q.an.W();
               return;
            case 16:
               a(60);
               boolean var35 = q.a(Q, true, false);
               boolean var19 = false;
               if (!var35) {
                  String var25 = u(302);
                  d(3, var25);
               } else {
                  boolean var26 = false;
                  b(65, false, false);
               }

               q.an.W();
               return;
            case 17:
               q.a(Q, false);
               a(60);
               r var34 = q.an.aV[R];
               Object var18 = null;
               int var24 = var34.D();
               String var30 = u(104);
               ad[0] = "" + var24;
               var30 = a(var30, ad, '#');
               a(2, var30, 8);
            case 18:
            case 19:
            default:
               break;
            case 20:
               a(61);
               boolean var23 = false;
               boolean var17 = false;
               b(65, false, false);
               l = (l |= 1) | 2;
               return;
         }
      }
   }

   private static void cl() {
      if (Q.aZ != 40) {
         if (Q.bb[1] != Q.bb[0]) {
            int var0 = fA = fA + aq;
            int var1 = Q.bb[0];
            int var2 = Q.bb[1];
            var0 = a(var0, 0, 300, var1, var2);
            o(24, 7, var0);
            if (var0 >= Q.bb[1]) {
               Q.bb[0] = Q.bb[1];
            }

            if (var0 >= 100) {
               Q.bb[0] = Q.bb[1] = 0;
               o(24, 7, 0);
            }
         } else {
            fA = 0;
            if (Q.bf == 0) {
               int var4 = ah[67 + (Q.aZ < 40 ? Q.aZ : 40) - 1];
               Q.bf = var4 << 2;
            } else {
               int var5 = Q.ba * 100 / Q.bf;
               o(24, 7, var5);
            }
         }

         if (aI <= 15 && F() && Q.bf != 0) {
            if (Q.bf == 0) {
               Q.bf = Q.aj();
            }

            int var6 = Q.ba * 100 / Q.bf;
            o(24, 7, var6);
            return;
         }
      } else {
         o(24, 7, 100);
      }
   }

   private static void ae(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         b(68, false, true);
         cm();
         bc();
         bf();
      }

      if (var0 == 1) {
         cg();
         bd();
         bg();
      }

      if (var0 == 3) {
         cY();
      }

      if (var0 == 4) {
         int[] var2;
         c(var2 = new int[4], 42, 1, ag[42][1][2], ag[42][1][3]);
         short var3 = ag[42][5][2];
         short var4 = ag[42][5][3];
         int var10000 = var2[0];
         int var10001 = var2[1];
         int var10002 = var2[2] - var2[0];
         int var7 = var2[3] - var2[1];
         int var6 = var10002;
         int var5 = var10001;
         int var8 = var10000;
         b(am, var8, var5, var6, var7);
         Q.k(var3, var4);
         b(am, 0, 0, 800, 480);
      }

      if (var0 == 5) {
         switch (var1) {
            case 8:
               if (!bh()) {
                  a(60);
                  ch();
                  return;
               }

               if (!r.be) {
                  Q.ai();
                  cm();
                  cg();
                  f(27, c(z), -1, -1);
                  v.a(0, v.an(), q.an, q.an.aR * 48, -48);
                  b(56, false, false);
                  A();
                  return;
               }

               return;
            case 9:
               a(60);
               if (!bh()) {
                  ch();
                  return;
               }

               if (!q.a(true)) {
                  b(56, false, false);
                  String var9 = u(301);
                  d(3, var9);
                  return;
               }
               break;
            case 10:
            default:
               return;
            case 11:
               a(61);
         }

         b(56, false, false);
      }
   }

   private static void cm() {
      ah = o(2)[Q.bc];
      String var0 = Q.d(false);
      a(42, 4, var0, false);
      if (Q.bm[41] == 0) {
         b(42, 9, true);
      }

      b(42, 8, Q.bn);
      if (Q.bm[42] != 15) {
         d(42, 3, true);
         j(42, 3, Q.bm[42]);
      }

      if (Q.bm[43] != 15 && Q.bm[43] != Q.bm[42]) {
         d(42, 12, true);
         j(42, 12, Q.bm[43]);
      }

      if (Q.bm[44] != 15) {
         d(42, 13, true);
         j(42, 13, Q.bm[44]);
      }

      if (q.L() && Q.ar != 49) {
         c(42, 9, true);
      } else {
         c(42, 9, false);
      }
   }

   private static void af(int var0, int var1) {
      if (var0 == 0) {
         if (b()) {
            d.k();
         }

         lq = true;
         ls = 23;
         bS();
         m(31, true);
         a(59);
         q.c(z, 4);
         fD = 0;
         fE = new int[10][6];

         for (int var2 = 0; var2 < 3; var2++) {
            c(23, var2 + 9, 10, 0);
            c(23, var2 + 20, 18, 0);
            fE[var2][0] = -1;
            fE[var2][1] = -1;
            fE[var2][2] = -1;
            fE[var2][3] = -1;
            fE[var2][4] = -1;
            fE[var2][5] = -1;
         }

         fB = o(2);
         fC = o(5);
         String var3 = u(81);
         a(23, 25, var3, false);
         a(23, 7, u(267) + " " + ab.e[7]);
         a(23, 8, u(46));
         int var4;
         if ((var4 = o(0)[ab.e[7] - 2][4]) != 0) {
            if (e == 17) {
               c(23, 27, 7, 2);
               c(23, 27, 8, 9);
               a(23, 27, u(256));
               c(23, 26, 7, 2);
               c(23, 26, 8, 6);
               a(23, 26, a((long)var4, e, " "));
            } else {
               a(23, 26, u(256));
               a(23, 27, a((long)var4, e, " "));
            }

            g(var4);
         } else {
            f(23, 26, false);
            f(23, 27, false);
            d(23, 28, false);
         }

         cn();
         aQ();
         x();
      }

      if (var0 == 1) {
         y();
         aR();
         b(37, ab.e[7], -1, -1);
      }

      if (var0 == 5) {
         switch (var1) {
            case 6:
               a(60);
               m(31, false);
               b(31, false, false);
               if (!v(8)) {
                  aH();
               }

               l |= 2;
         }
      }

      if (var0 == 3) {
         av(iV);
         if (ag[23][5][9] == 1) {
            c(23, 5, 7, 1);
            d(23, true);
            c(23, 5, 9, 0);
         }
      }
   }

   private static void cn() {
      for (int var0 = 0; var0 < 50; var0++) {
         if (fB[var0][18] == ab.e[7]) {
            int var1 = fB[var0][0];
            boolean var2 = false;

            for (int var3 = 0; var3 < 4; var3++) {
               var2 = b(14, var3, 7) == var1 || var2;
            }

            for (int var8 = 0; var8 < 4; var8++) {
               var2 = b(14, var8, 8) == var1 || var2;
            }

            for (int var9 = 0; var9 < 2; var9++) {
               var2 = b(14, var9, 9) == var1 || var2;
            }

            if (var2) {
               fE[fD][0] = 0;
               fE[fD][1] = 0;
               fE[fD][2] = fB[var0][1];
               fE[fD][3] = 0;
               fE[fD][4] = 0;
               fE[fD][5] = var0;
               fD++;
            }
         }
      }

      for (int var4 = 0; var4 < 17; var4++) {
         if (fC[var4][17] == ab.e[7]) {
            fE[fD][0] = fC[var4][4];
            fE[fD][1] = fC[var4][5];
            fE[fD][2] = fC[var4][18];
            fE[fD][3] = fC[var4][7];
            fE[fD][4] = 1;
            fE[fD][5] = var4;
            fD++;
         }
      }

      for (int var5 = 0; var5 < 6; var5++) {
         if (o(4)[var5][36] == ab.e[7]) {
            fE[fD][0] = o(4)[var5][9];
            fE[fD][1] = o(4)[var5][10];
            fE[fD][2] = o(4)[var5][37];
            fE[fD][3] = o(4)[var5][12];
            fE[fD][4] = 1;
            fE[fD][5] = var5;
            fD++;
         }
      }

      for (int var6 = 0; var6 < 7; var6++) {
         if (o(3)[var6][38] == ab.e[7]) {
            fE[fD][0] = o(3)[var6][9];
            fE[fD][1] = o(3)[var6][10];
            fE[fD][2] = o(3)[var6][39];
            fE[fD][3] = o(3)[var6][12];
            fE[fD][4] = 1;
            fE[fD][5] = var6;
            fD++;
         }
      }

      if (fD == 1) {
         if (fE[0][4] == 1) {
            c(23, 10, 10, 1);
            c(23, 21, 18, 1);
            c(23, 10, 5, fE[0][0]);
            c(23, 10, 6, fE[0][1]);
            String var10 = j(fE[0][2], 1);
            a(23, 21, var10, false);
            c(23, 10, 8, fE[0][3]);
         } else {
            f(23, 21, true);
            String var11 = j(fE[0][2], 1);
            a(23, 21, var11, false);
            g(23, 16, true);
            n(23, 16, fE[0][5]);
         }
      }

      if (fD == 2) {
         if (fE[0][4] == 1) {
            c(23, 12, 10, 1);
            c(23, 23, 18, 1);
            c(23, 12, 5, fE[0][0]);
            c(23, 12, 6, fE[0][1]);
            String var12 = j(fE[0][2], 1);
            a(23, 23, var12, false);
            c(23, 12, 8, fE[0][3]);
         } else {
            f(23, 23, true);
            String var13 = j(fE[0][2], 1);
            a(23, 23, var13, false);
            g(23, 18, true);
            n(23, 18, fE[0][5]);
         }

         if (fE[1][4] == 1) {
            c(23, 13, 10, 1);
            c(23, 24, 18, 1);
            c(23, 13, 5, fE[1][0]);
            c(23, 13, 6, fE[1][1]);
            String var14 = j(fE[1][2], 1);
            a(23, 24, var14, false);
            c(23, 13, 8, fE[1][3]);
         } else {
            f(23, 24, true);
            String var15 = j(fE[1][2], 1);
            a(23, 24, var15, false);
            g(23, 19, true);
            n(23, 19, fE[1][5]);
         }
      }

      if (fD >= 3) {
         for (int var7 = 0; var7 < 3; var7++) {
            if (fE[var7][0] != -1) {
               if (fE[var7][4] == 1) {
                  c(23, var7 + 9, 10, 1);
                  c(23, var7 + 20, 18, 1);
                  c(23, var7 + 9, 5, fE[var7][0]);
                  c(23, var7 + 9, 6, fE[var7][1]);
                  int var10001 = var7 + 20;
                  String var16 = j(fE[var7][2], 1);
                  a(23, var10001, var16, false);
                  c(23, var7 + 9, 8, fE[var7][3]);
               } else {
                  f(23, var7 + 20, true);
                  int var18 = var7 + 20;
                  String var17 = j(fE[var7][2], 1);
                  a(23, var18, var17, false);
                  g(23, var7 + 15, true);
                  n(23, var7 + 15, fE[var7][5]);
               }
            }
         }
      }
   }

   private static void ag(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         aQ();
         q.c(z, 4);
         cp();
         b(et, 34, 2, ag[34][2][2], ag[34][2][3]);
         int var2 = et[2] - et[0];
         int var3 = et[3] - et[1];
         fI.k();
         fI.b();
         fI.a(1);
         fI.c(ag[34][7][5]);
         fI.d(ag[34][7][6]);
         int var4 = 0;

         for (int var5 = 0; var5 < 9; var5++) {
            if (fH[aj(b(14, var5, 10))][6] <= q.an.aT) {
               var4++;
            }
         }

         fI.b(var4);
         fN = new byte[var4];
         fO = new short[var4];

         for (int var29 = 0; var29 < var4; var29++) {
            fN[var29] = 0;
            fO[var29] = 0;
         }

         fF = var4 > 4;
         fI.g(var2 + 1);
         fI.h(var3 + 1);
         fI.e(ag[34][7][7] + var2);
         fI.f(var3);
         au(35);
         O(35, ag[35].length + 11 * (var4 - 1));
         byte var24 = 0;
         switch (q.an.aT) {
            case 1:
               var24 = 6;
               break;
            case 2:
               var24 = 3;
               break;
            case 3:
               var24 = 0;
         }

         for (int var6 = 0; var6 < var4; var6++) {
            if (var6 != 0) {
               q(35, 0, var6 * 11);
               q(35, 1, var6 * 11 + 1);
               q(35, 2, var6 * 11 + 2);
               q(35, 3, var6 * 11 + 3);
               q(35, 4, var6 * 11 + 4);
               q(35, 5, var6 * 11 + 5);
               q(35, 6, var6 * 11 + 6);
               q(35, 7, var6 * 11 + 7);
               q(35, 8, var6 * 11 + 8);
               q(35, 10, var6 * 11 + 10);
               q(35, 9, var6 * 11 + 9);
               short var30 = ag[35][0][2];
               short var9 = ag[35][0][3];
               c(35, var6 * 11, 2, var30 + fI.i(var6));
               c(35, var6 * 11, 3, var9 + fI.j(var6));
               var30 = ag[35][1][2];
               var9 = ag[35][1][3];
               c(35, var6 * 11 + 1, 2, var30 + fI.i(var6));
               c(35, var6 * 11 + 1, 3, var9 + fI.j(var6));
               var30 = ag[35][2][2];
               var9 = ag[35][2][3];
               c(35, var6 * 11 + 2, 2, var30 + fI.i(var6));
               c(35, var6 * 11 + 2, 3, var9 + fI.j(var6));
               var30 = ag[35][3][2];
               var9 = ag[35][3][3];
               c(35, var6 * 11 + 3, 2, var30 + fI.i(var6));
               c(35, var6 * 11 + 3, 3, var9 + fI.j(var6));
               var30 = ag[35][4][2];
               var9 = ag[35][4][3];
               c(35, var6 * 11 + 4, 2, var30 + fI.i(var6));
               c(35, var6 * 11 + 4, 3, var9 + fI.j(var6));
               var30 = ag[35][5][2];
               var9 = ag[35][5][3];
               c(35, var6 * 11 + 5, 2, var30 + fI.i(var6));
               c(35, var6 * 11 + 5, 3, var9 + fI.j(var6));
               var30 = ag[35][7][2];
               var9 = ag[35][7][3];
               c(35, var6 * 11 + 7, 2, var30 + fI.i(var6));
               c(35, var6 * 11 + 7, 3, var9 + fI.j(var6));
               var30 = ag[35][8][2];
               var9 = ag[35][8][3];
               c(35, var6 * 11 + 8, 2, var30 + fI.i(var6));
               c(35, var6 * 11 + 8, 3, var9 + fI.j(var6));
               var30 = ag[35][10][2];
               var9 = ag[35][10][3];
               c(35, var6 * 11 + 10, 2, var30 + fI.i(var6));
               c(35, var6 * 11 + 10, 3, var9 + fI.j(var6));
               var30 = ag[35][6][2];
               var9 = ag[35][6][3];
               c(35, var6 * 11 + 6, 2, var30 + fI.i(var6));
               c(35, var6 * 11 + 6, 3, var9 + fI.j(var6));
               var30 = ag[35][9][2];
               var9 = ag[35][9][3];
               c(35, var6 * 11 + 9, 2, var30 + fI.i(var6));
               c(35, var6 * 11 + 9, 3, var9 + fI.j(var6));
            }

            int var8 = aj(b(14, var6 + var24, 10));
            int var41 = fH[var8][7];
            int var7 = fH[var8][2];
            var2 = fH[var8][8];
            c(35, 2 + var6 * 11, 6, var2);
            a(35, 5 + var6 * 11, "x " + var7);
            a(35, 4 + var6 * 11, u(var41));
            c(35, 1 + var6 * 11, a((long)fH[var8][4], e, " "));
            a(35, 8 + var6 * 11, ae(fH[var8][3]));
            a(35, 9 + var6 * 11, u(312));
            if (fH[var8][6] <= q.an.aT) {
               if (fH[var8][1] == 0) {
                  c(35, 1 + var6 * 11, 18, 23);
                  c(35, 1 + var6 * 11, 19, 72);
                  c(35, 1 + var6 * 11, 20, 0);
               } else {
                  c(35, 1 + var6 * 11, 18, 23);
                  c(35, 1 + var6 * 11, 19, 49);
                  c(35, 1 + var6 * 11, 20, 0);
               }
            } else {
               c(35, 1 + var6 * 11, u(106) + " " + fH[var8][6]);
               c(35, 1 + var6 * 11, 18, 21);
               c(35, 1 + var6 * 11, 19, 7);
               c(35, 1 + var6 * 11, 20, 0);
               b(35, 1 + var6 * 11, true);
            }
         }

         fI.a(false);
         fI.b(true);
         fK = et[0];
         fL = et[1];
         fJ[0] = ag[34][7][2];
         fJ[1] = ag[34][7][3];
         fJ[2] = ag[34][7][5];
         fJ[3] = ag[34][7][6];
         fI.k();
         fM = 0;
         cY();
         d(34, 5, fF && fI.c() < 0);
         d(34, 6, fF && fI.c() > -(fI.g() - fI.e()));
      }

      if (var0 == 2) {
         H(35, aq >> 1);
         fI.i();
         int var21 = cB;
         int var25 = cC;
         label119:
         if (b(var21, var25, fJ)) {
            if (X(cl)) {
               fI.b(cD, cE);
            }

            if (W(cm)) {
               fI.a(cD, cE);
               int var27 = fI.c(cB - fK, cC - fL);
               if (u.b >= 0 && u.b != var27) {
                  break label119;
               }

               if (var27 >= 0) {
                  fM = var27;
                  ah(var27, cm);
                  fI.j();
               }
            }

            if (X(cl | ck)) {
               int var28 = fI.c(cB - fK, cC - fL);
               if ((u.b < 0 || u.b == var28) && var28 >= 0) {
                  ah(var28, ck);
               }
            }
         }

         co();
         if (u.c) {
            aR = 0;
         }

         d(34, 5, fF && fI.c() < 0);
         d(34, 6, fF && fI.c() > -(fI.g() - fI.e()));
      }

      if (var0 == 1) {
         ck();
         aR();
      }

      if (var0 == 4) {
         k(fJ[0], fJ[1], fJ[2], fJ[3]);
         int var22 = fI.c();
         int var26 = fI.d();
         i(35, var22, var26);
         bQ();
         h(34, 5, 0, 0);
         h(34, 6, 0, 0);
      }

      if (var0 == 5) {
         switch (var1) {
            case 4:
               a(61);
               boolean var23 = false;
               b(62, false, false);
         }
      }
   }

   private static void aH(int var0) {
      if (fN[var0] == 0) {
         a(51);
         fN[var0] = 1;
         fO[var0] = fG;
         a(35, var0 * 11, false);
         a(35, var0 * 11 + 1, false);
         d(35, var0 * 11 + 2, false);
         d(35, var0 * 11 + 3, false);
         f(35, var0 * 11 + 4, false);
         f(35, var0 * 11 + 5, false);
         a(35, var0 * 11 + 6, false);
         a(35, var0 * 11 + 7, true);
         f(35, var0 * 11 + 8, true);
         f(35, var0 * 11 + 9, true);
         aw(var0 * 11 + 10);
         d(35, var0 * 11 + 10, true);
      } else {
         a(50);
         fN[var0] = 0;
         fO[var0] = 0;
         a(35, var0 * 11, true);
         a(35, var0 * 11 + 1, true);
         d(35, var0 * 11 + 2, true);
         d(35, var0 * 11 + 3, true);
         f(35, var0 * 11 + 4, true);
         f(35, var0 * 11 + 5, true);
         a(35, var0 * 11 + 6, true);
         a(35, var0 * 11 + 7, false);
         f(35, var0 * 11 + 8, false);
         f(35, var0 * 11 + 9, false);
         aw(var0 * 11 + 10);
         d(35, var0 * 11 + 10, true);
      }
   }

   private static void co() {
      for (int var0 = 0; var0 < fN.length; var0++) {
         if (fN[var0] == 1) {
            fO[var0] = (short)(fO[var0] - aq);
            if (fO[var0] <= 0) {
               aH(var0);
            }
         }
      }
   }

   private static void cp() {
      fH = o(13);
   }

   private static void ah(int var0, int var1) {
      int var2 = fI.c();
      int var3 = fI.d();
      int var9 = var3;
      var2 = i(35, var2, var9, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm && !u.c && aR >= 400) {
         var1 = var2;
         var0 = fM;
         switch (var1 % 11) {
            case 0:
            case 6:
               aH(var0);
               return;
            case 1:
               int var7 = 0;
               switch (q.an.aT) {
                  case 1:
                     var7 = 6;
                     break;
                  case 2:
                     var7 = 3;
                     break;
                  case 3:
                     var7 = 0;
               }

               var7 = aj(b(14, var0 + var7, 10));
               var2 = fH[var7][4];
               var3 = fH[var7][1];
               if (z == 0) {
                  if (fH[var7][6] <= q.an.aT) {
                     jq = 3;
                     jr = var7;
                     jt = q.an;
                     if (a(var3 == 0, var2, false)) {
                        q.an.n(var7);
                        a(var3 == 0, var2);
                        b(62, false, false);
                        l(17, 0);
                        l(18, var7);
                        f(30, var7, -1, -1);
                        return;
                     }
                  }
               } else {
                  b(62, false, false);
                  q.an.aZ = var7;
                  v.a(1, q.an.r(5), q.an, q.an.aR * 48, -48);
                  A();
                  q.an.bi = true;
                  q.i();
                  f(32, var0, -1, -1);
               }
            case 2:
            case 3:
            case 4:
            case 5:
            default:
               break;
            case 7:
               aH(var0);
               return;
         }
      }
   }

   private static void ai(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         be(bf(iV));
         cq();
         x();
         aQ();
         lq = true;
         ls = 18;
         fQ = false;
         a(2, 0, false);
         a(18, 21, aW());
         a(18, 21, F());
      }

      if (var0 == 2) {
         fR.i();
         int var2 = cB;
         int var3 = cC;
         label153:
         if (b(var2, var3, fS)) {
            if (X(cl)) {
               fR.b(cD, cE);
            }

            if (X(cl | ck)) {
               var2 = fR.c(cB - fT, cC - fU);
               if (u.b >= 0 && u.b != var2) {
                  break label153;
               }

               if (var2 >= 0) {
                  aj(var2, ck);
               }
            }

            if (W(cm)) {
               fR.a(cD, cE);
               var2 = fR.c(cB - fT, cC - fU);
               if (u.b < 0 || u.b == var2) {
                  if (var2 >= 0) {
                     fV = var2;
                     aj(var2, cm);
                     fR.j();
                  }

                  aT();
               }
            }
         }

         fW.i();
         var2 = cB;
         var3 = cC;
         label138:
         if (b(var2, var3, fX)) {
            if (X(cl)) {
               fW.b(cD, cE);
            }

            if (X(cl | ck)) {
               var2 = fW.c(cB - fY, cC - fZ);
               if (u.b >= 0 && u.b != var2) {
                  break label138;
               }

               if (var2 >= 0) {
                  ak(var2, ck);
               }
            }

            if (W(cm)) {
               fW.a(cD, cE);
               var2 = fW.c(cB - fY, cC - fZ);
               if ((u.b < 0 || u.b == var2) && var2 >= 0) {
                  ga = var2;
                  ak(var2, cm);
                  fW.j();
               }
            }
         }

         d(18, 10, fP && fR.d() < 0);
         d(18, 11, fP && fR.d() > -(fR.h() - fR.f()));
         d(18, 12, fP && fW.d() < 0);
         d(18, 13, fP && fW.d() > -(fW.h() - fW.f()));
      }

      if (var0 == 1) {
         aR();
         y();
         aH();
         fQ = true;
      }

      if (var0 == 3) {
         H(iV, aq);
      }

      if (var0 == 4) {
         if (q.an != null && q.an.aV[0] != null) {
            g(18, 17, true);
            n(18, 17, q.an.aV[0].ar);
         } else {
            g(18, 17, false);
         }

         if (q.an != null && q.an.aV[1] != null) {
            g(18, 18, true);
            n(18, 18, q.an.aV[1].ar);
         } else {
            g(18, 18, false);
         }

         k(fS[0], fS[1], fS[2], fS[3]);
         int var14 = fR.c();
         int var9 = fR.d();
         var9 = var9;
         g(32, var14, var9, 0);
         bQ();
         k(fX[0], fX[1], fX[2], fX[3]);
         var14 = fW.c();
         var9 = fW.d();
         var9 = var9;
         g(33, var14, var9, 0);
         bQ();
      }

      if (var0 == 5) {
         switch (var1) {
            case 7:
               d.k();
               a(0);
               if (z == 0) {
                  q.an.a(q.an.aV[0], q.an.aV[1]);
                  ck();
               } else {
                  q.an.b(q.an.aV[0], q.an.aV[1]);
               }

               b(61, false, false);
               a(2, 0, aW());
               a(2, 0, F());
               fQ = true;
               return;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            default:
               break;
            case 14:
               a(61);
               q.an.as();
               cq();
               fQ = false;
               return;
            case 19:
               a(61);
               b(61, false, false);
               ck();
               a(2, 0, aW());
               a(2, 0, F());
               fQ = true;
               return;
            case 20:
               a(60);
               au(3, q.an.ar);
               return;
            case 21:
               s(true);
         }
      }
   }

   private static void cq() {
      au(32);
      au(33);
      b(et, 32, 0, ag[32][0][2], ag[32][0][3]);
      int var0 = et[2] - et[0];
      int var1 = et[3] - et[1];
      fR.k();
      fR.b();
      fR.a(0);
      fR.c(ag[18][15][5]);
      fR.d(ag[18][15][6]);
      int var2 = g(true);
      fR.b(var2);
      int var24;
      fP = (var24 = var2) > 3;
      fR.g(var0 + 1);
      fR.h(var1 + 1);
      fR.e(var0);
      fR.f(ag[18][15][7] + var1);
      au(32);
      O(32, ag[32].length + 4 * (var24 - 1));

      for (int var3 = 0; var3 < var24; var3++) {
         if (var3 != 0) {
            q(32, 0, var3 << 2);
            q(32, 1, (var3 << 2) + 1);
            q(32, 2, (var3 << 2) + 2);
            q(32, 3, (var3 << 2) + 3);
            short var4 = ag[32][0][2];
            short var15 = ag[32][0][3];
            c(32, var3 << 2, 2, var4 + fR.i(var3));
            c(32, var3 << 2, 3, var15 + fR.j(var3));
            var4 = ag[32][1][2];
            var15 = ag[32][1][3];
            c(32, (var3 << 2) + 1, 2, var4 + fR.i(var3));
            c(32, (var3 << 2) + 1, 3, var15 + fR.j(var3));
            var4 = ag[32][2][2];
            var15 = ag[32][2][3];
            c(32, (var3 << 2) + 2, 2, var4 + fR.i(var3));
            c(32, (var3 << 2) + 2, 3, var15 + fR.j(var3));
            var4 = ag[32][3][2];
            var15 = ag[32][3][3];
            c(32, (var3 << 2) + 3, 2, var4 + fR.i(var3));
            c(32, (var3 << 2) + 3, 3, var15 + fR.j(var3));
         }
      }

      for (int var26 = 0; var26 < var24; var26++) {
         r var8 = aI(var26);
         if (z != 0 && z != 11) {
            c(32, 0 + (var26 << 2), var8.an());
         } else {
            c(32, 0 + (var26 << 2), var8.ao());
         }

         if (var8.bm[42] != 15) {
            d(32, (var26 << 2) + 1, true);
            j(32, (var26 << 2) + 1, var8.bm[42] + 15);
         }

         if (var8.bm[43] != 15 && var8.bm[43] != var8.bm[42]) {
            d(32, (var26 << 2) + 2, true);
            j(32, (var26 << 2) + 2, var8.bm[43] + 15);
         }

         if (var8.bm[44] != 15) {
            d(32, (var26 << 2) + 3, true);
            j(32, (var26 << 2) + 3, var8.bm[44] + 15);
         }
      }

      d(18, 10, fP && fV > 0);
      d(18, 11, fP);
      fR.a(true);
      fR.b(false);
      fT = et[0];
      fU = et[1];
      fS[0] = ag[18][15][2];
      fS[1] = ag[18][15][3];
      fS[2] = ag[18][15][5];
      fS[3] = ag[18][15][6];
      fR.k();
      fV = 0;
      b(et, 33, 0, ag[33][0][2], ag[33][0][3]);
      var0 = et[2] - et[0];
      var1 = et[3] - et[1];
      fW.k();
      fW.b();
      fW.a(0);
      fW.c(ag[18][16][5]);
      fW.d(ag[18][16][6]);
      var2 = g(true);
      fW.b(var2);
      fW.g(var0 + 1);
      fW.h(var1 + 1);
      fW.e(var0);
      fW.f(ag[18][16][7] + var1);
      au(33);
      O(33, ag[33].length + 4 * (var2 - 1));

      for (int var27 = 0; var27 < var2; var27++) {
         if (var27 != 0) {
            q(33, 0, var27 << 2);
            q(33, 1, (var27 << 2) + 1);
            q(33, 2, (var27 << 2) + 2);
            q(33, 3, (var27 << 2) + 3);
            short var10 = ag[33][0][2];
            short var20 = ag[33][0][3];
            c(33, var27 << 2, 2, var10 + fW.i(var27));
            c(33, var27 << 2, 3, var20 + fW.j(var27));
            var10 = ag[33][1][2];
            var20 = ag[33][1][3];
            c(33, (var27 << 2) + 1, 2, var10 + fW.i(var27));
            c(33, (var27 << 2) + 1, 3, var20 + fW.j(var27));
            var10 = ag[33][2][2];
            var20 = ag[33][2][3];
            c(33, (var27 << 2) + 2, 2, var10 + fW.i(var27));
            c(33, (var27 << 2) + 2, 3, var20 + fW.j(var27));
            var10 = ag[33][3][2];
            var20 = ag[33][3][3];
            c(33, (var27 << 2) + 3, 2, var10 + fW.i(var27));
            c(33, (var27 << 2) + 3, 3, var20 + fW.j(var27));
         }
      }

      for (int var28 = 0; var28 < var2; var28++) {
         r var14 = aI(var28);
         if (z != 0 && z != 11) {
            c(33, 0 + (var28 << 2), var14.an());
         } else {
            c(33, 0 + (var28 << 2), var14.ao());
         }

         if (var14.bm[42] != 15) {
            d(33, (var28 << 2) + 1, true);
            j(33, (var28 << 2) + 1, var14.bm[42] + 15);
         }

         if (var14.bm[43] != 15 && var14.bm[43] != var14.bm[42]) {
            d(33, (var28 << 2) + 2, true);
            j(33, (var28 << 2) + 2, var14.bm[43] + 15);
         }

         if (var14.bm[44] != 15) {
            d(33, (var28 << 2) + 3, true);
            j(33, (var28 << 2) + 3, var14.bm[44] + 15);
         }
      }

      d(18, 12, fP && fW.d() < 0);
      d(18, 13, fP && fW.d() > -(fW.h() - fW.f()));
      fW.a(true);
      fW.b(false);
      fY = et[0];
      fZ = et[1];
      fX[0] = ag[18][16][2];
      fX[1] = ag[18][16][3];
      fX[2] = ag[18][16][5];
      fX[3] = ag[18][16][6];
      fW.k();
      ga = 0;
      cr();
   }

   private static void cr() {
      r var0 = null;

      for (int var1 = 0; var1 < fR.a(); var1++) {
         var0 = aI(var1);
         b(32, 0 + (var1 << 2), false);
         b(33, 0 + (var1 << 2), false);
         if (q.an != null && q.an.aV[0] != null && q.an.aV[0].d(false).equals(var0.d(false))) {
            b(32, 0 + (var1 << 2), true);
            b(33, 0 + (var1 << 2), true);
         }

         if (q.an != null && q.an.aV[1] != null && q.an.aV[1].d(false).equals(var0.d(false))) {
            b(32, 0 + (var1 << 2), true);
            b(33, 0 + (var1 << 2), true);
         }
      }

      c(18, 7, ct());
      c(18, 14, !cu());
   }

   private static void aj(int var0, int var1) {
      int var2 = fR.c();
      int var3 = fR.d();
      int var8 = var3;
      var2 = i(32, var2, var8, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm) {
         var1 = var2;
         var0 = fV;
         switch (var1 % 4) {
            case 0:
               a(60);
               if (q.an != null && q.an.aV[0] != null) {
                  r var6;
                  (var6 = q.an.aV[0]).ag().p(0);
                  var6.af().aj();
                  var6.af().a(var6);
                  var6.e(var6.af());
               }

               r var7;
               (var7 = aI(var0)).ag().q(var7.aS);
               var7.ag().p(var7.aS);
               q.an.aV[0] = var7;
               q.an.aW++;
               var7.e(q.an);
               cr();
               ci();
               c(18, 7, ct());
               c(18, 14, !cu());
         }
      }
   }

   private static void ak(int var0, int var1) {
      int var2 = fW.c();
      int var3 = fW.d();
      int var8 = var3;
      var2 = i(33, var2, var8, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm) {
         var1 = var2;
         var0 = ga;
         switch (var1 % 4) {
            case 0:
               a(60);
               if (q.an != null && q.an.aV[1] != null) {
                  r var6;
                  (var6 = q.an.aV[1]).ag().p(1);
                  var6.af().aj();
                  var6.af().a(var6);
                  var6.e(var6.af());
               }

               r var7;
               (var7 = aI(var0)).ag().q(var7.aS);
               var7.ag().p(var7.aS);
               q.an.aV[1] = var7;
               q.an.aW++;
               var7.e(q.an);
               cr();
               ci();
               c(18, 7, ct());
               c(18, 14, !cu());
         }
      }
   }

   private static int cs() {
      return g(false);
   }

   private static int g(boolean var0) {
      Object var1 = null;
      int var2 = 0;

      for (int var3 = 0; var3 < q.af[z][0].length; var3++) {
         if ((var1 = (r)q.af[z][0][var3]) != null && ((r)var1).bm[41] != 0 && ((q)var1).aP == 4 && (!var0 || ((q)var1).ar != 49)) {
            var2++;
         }
      }

      return var2;
   }

   private static r aI(int var0) {
      r var1 = null;
      int var2 = 0;

      for (int var3 = 0; var3 < q.af[z][0].length; var3++) {
         if ((var1 = (r)q.af[z][0][var3]) != null && var1.bm[41] != 0 && var1.aP == 4 && var1.ar != 49) {
            if (var2 == var0) {
               return var1;
            }

            var2++;
         }
      }

      return null;
   }

   private static boolean ct() {
      return q.an.aV[0] != null && q.an.aV[1] != null;
   }

   private static boolean cu() {
      return q.an.aV[0] == null && q.an.aV[1] == null;
   }

   private static void al(int var0, int var1) {
      if (var0 == 0) {
         kA = new int[kv];

         for (int var2 = 0; var2 < kv; var2++) {
            kA[var2] = -1;
         }

         kD = 0;
         bP();
         m(bf(iV), true);
         be(bf(iV));
         bP();
         eT = 0;
         eU = 0;
         b(et, 36, 26, ag[36][26][2], ag[36][26][3]);
         int var8 = et[2] - et[0];
         int var3 = et[3] - et[1];
         fb.k();
         fb.b();
         fb.a(1);
         fb.c(ag[36][6][5]);
         fb.d(ag[36][6][6]);
         int var5 = (kE = r.ac()).length;
         fb.b(var5);
         fb.g(var8 + 1);
         fb.h(var3 + 1);
         fb.e(ag[36][6][7] + var8);
         fb.f(var3);
         int var6 = kE.length;
         au(38);
         O(38, ag[38].length + 9 * (var6 - 1));

         for (int var4 = 0; var4 < var6; var4++) {
            if (var4 != 0) {
               q(38, 0, var4 * 9);
               q(38, 1, var4 * 9 + 1);
               q(38, 2, var4 * 9 + 2);
               q(38, 3, var4 * 9 + 3);
               q(38, 4, var4 * 9 + 4);
               q(38, 5, var4 * 9 + 5);
               q(38, 6, var4 * 9 + 6);
               q(38, 7, var4 * 9 + 7);
               q(38, 8, var4 * 9 + 8);
               short var9 = ag[38][0][2];
               short var27 = ag[38][0][3];
               c(38, var4 * 9, 2, var9 + fb.i(var4));
               c(38, var4 * 9, 3, var27 + fb.j(var4));
               var9 = ag[38][1][2];
               var27 = ag[38][1][3];
               c(38, var4 * 9 + 1, 2, var9 + fb.i(var4));
               c(38, var4 * 9 + 1, 3, var27 + fb.j(var4));
               d(38, var4 * 9 + 1, false);
               var9 = ag[38][4][2];
               var27 = ag[38][4][3];
               c(38, var4 * 9 + 4, 2, var9 + fb.i(var4));
               c(38, var4 * 9 + 4, 3, var27 + fb.j(var4));
               var9 = ag[38][2][2];
               var27 = ag[38][2][3];
               c(38, var4 * 9 + 2, 2, var9 + fb.i(var4));
               c(38, var4 * 9 + 2, 3, var27 + fb.j(var4));
               var9 = ag[38][5][2];
               var27 = ag[38][5][3];
               c(38, var4 * 9 + 5, 2, var9 + fb.i(var4));
               c(38, var4 * 9 + 5, 3, var27 + fb.j(var4));
               var9 = ag[38][6][2];
               var27 = ag[38][6][3];
               c(38, var4 * 9 + 6, 2, var9 + fb.i(var4));
               c(38, var4 * 9 + 6, 3, var27 + fb.j(var4));
               var9 = ag[38][7][2];
               var27 = ag[38][7][3];
               c(38, var4 * 9 + 7, 2, var9 + fb.i(var4));
               c(38, var4 * 9 + 7, 3, var27 + fb.j(var4));
               var9 = ag[38][3][2];
               var27 = ag[38][3][3];
               c(38, var4 * 9 + 3, 2, var9 + fb.i(var4));
               c(38, var4 * 9 + 3, 3, var27 + fb.j(var4));
               var9 = ag[38][8][2];
               var27 = ag[38][8][3];
               c(38, var4 * 9 + 8, 2, var9 + fb.i(var4));
               c(38, var4 * 9 + 8, 3, var27 + fb.j(var4));
            }

            r var36;
            int var18 = (var36 = (r)q.ac[kE[var4]]).ar;
            o(2);
            n(38, 2 + var4 * 9, var18);
            int var10001 = 3 + var4 * 9;
            String var19 = ((r)q.ac[kE[var4]]).d(true);
            a(38, var10001, var19, false);
            c(38, 8 + var4 * 9, "" + var36.aZ);
            var18 = var36.bm[42];
            c(38, 5 + var4 * 9, 5, 24);
            c(38, 5 + var4 * 9, 6, var18 + 15);
            if ((var18 = var36.bm[43]) != 15) {
               c(38, 6 + var4 * 9, 5, 24);
               c(38, 6 + var4 * 9, 6, var18 + 15);
               d(38, 6 + var4 * 9, true);
            } else {
               d(38, 6 + var4 * 9, false);
            }

            if ((var18 = var36.bm[44]) != 15) {
               c(38, 7 + var4 * 9, 5, 24);
               c(38, 7 + var4 * 9, 6, var18 + 15);
               d(38, 7 + var4 * 9, true);
            } else {
               d(38, 7 + var4 * 9, false);
            }
         }

         fb.a(false);
         fb.b(true);
         fd = et[0];
         fe = et[1];
         fc[0] = ag[36][6][2];
         fc[1] = ag[36][6][3];
         fc[2] = ag[36][6][5];
         fc[3] = ag[36][6][6];
         fb.k();
         ff = 0;
         c(36, 4, false);
         c(36, 5, false);
         a(36, 4, kT != 2);
         a(36, 5, kT == 2);
         l(36, 5, 6167);
         d(36, 24, kE.length > 4 && fb.c() < 0);
         d(36, 25, kE.length > 4 && fb.c() > -(fb.g() - fb.e()));
         lt = 2;
         lq = true;
         ls = 36;
      }

      if (var0 == 2) {
         av(iV);
         fb.i();
         int var23 = cB;
         int var37 = cC;
         label147:
         if (b(var23, var37, fc)) {
            if (X(cl)) {
               fb.b(cD, cE);
            }

            if (X(cl | ck)) {
               int var40 = fb.c(cB - fd, cC - fe);
               if (u.b >= 0 && u.b != var40) {
                  break label147;
               }

               if (var40 >= 0) {
                  am(var40, ck);
               }
            }

            if (W(cm)) {
               fb.a(cD, cE);
               int var41 = fb.c(cB - fd, cC - fe);
               if ((u.b < 0 || u.b == var41) && var41 >= 0) {
                  ff = var41;
                  am(var41, cm);
                  fb.j();
               }
            }
         }

         c(36, 4, cx());
         c(36, 5, cx());
         d(36, 24, kE.length > 4 && fb.c() < 0);
         d(36, 25, kE.length > 4 && fb.c() > -(fb.g() - fb.e()));
         if (u.c) {
            aR = 0;
         }
      }

      if (var0 == 4) {
         k(fc[0], fc[1], fc[2], fc[3]);
         int var24 = fb.c();
         int var38 = fb.d();
         i(38, var24, var38);
         bQ();
         if (lt > 0) {
            lt--;
            lq = true;
         }

         h(36, 24, 0, 0);
         h(36, 25, 0, 0);
      }

      if (var0 == 5) {
         switch (var1) {
            case 4:
               a(60);
               kj = false;
               cv();
               if (kW) {
                  bm = 86400000;
                  M(9);
                  M(9);
                  return;
               }

               if (kT == 1) {
                  String var26;
                  String var39 = (var26 = hD).substring(hD.indexOf(58) + 1);
                  long var42 = -1L;

                  try {
                     var42 = Long.parseLong(var39);
                  } catch (NumberFormatException var7) {
                  }

                  c(var42);
               }

               if (ab.e[13] <= 0) {
                  ab.e[13] = 86400000;
                  M(9);
                  return;
               }

               jq = 5;
               if (a(false, b(23, ab.e[7] - 1, 27), false, false)) {
                  M(9);
                  return;
               }
               break;
            case 5:
               a(60);
               kj = false;
               cv();
               M(15);
               return;
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
               break;
            case 7:
               a(61);
               boolean var25 = false;
               b(38, false, false);
               if (kW) {
                  M(14);
                  kW = false;
                  return;
               }

               if (kT == 0) {
                  M(5);
                  ls = -1;
                  aH();
                  return;
               }

               if (kT == 1) {
                  M(14);
                  return;
               }
               break;
            case 11:
               a(61);
               aJ(0);
               return;
            case 16:
               a(61);
               aJ(1);
               return;
            case 21:
               a(61);
               aJ(2);
         }
      }
   }

   private static void cv() {
      int[] var0 = kA;
      if (kA != null && var0.length != 0) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            if (var0[var1] == -1) {
               for (int var2 = var1 + 1; var2 < var0.length; var2++) {
                  if (var0[var2] != -1) {
                     var0[var1] = var0[var2];
                     var0[var2] = -1;
                     var2 = var0.length;
                  }
               }
            }
         }
      }
   }

   private static void cw() {
      b(42, false, false);
      b(42, false, false);
      b(41, false, false);

      for (int var0 = 0; var0 < kv + kw; var0++) {
         if (kN[var0] != null) {
            kN[var0].ae();
         }
      }

      lE = true;
      lD = false;
      if (kT == 2) {
         M(5);
      } else if (kT == 0) {
         M(5);
      } else if (kT == 1) {
         M(14);
      }

      aH();
   }

   private static void am(int var0, int var1) {
      int var2 = fb.c();
      int var3 = fb.d();
      int var11 = var3;
      var2 = i(38, var2, var11, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm && !u.c && aR >= 400) {
         var1 = var2;
         var0 = ff;
         n(b(14, var0, 0));
         switch (var1 % 9) {
            case 0:
               var0 = var1;
               var1 /= 9;
               var2 = -1;

               for (int var16 = 0; var16 < kv; var16++) {
                  if (kA[var16] == var1) {
                     var2 = var16;
                  }
               }

               label82: {
                  if (var2 != -1) {
                     kD--;
                     kA[var2] = -1;
                  } else {
                     if (kD >= kv) {
                        break label82;
                     }

                     for (int var17 = 0; var17 < kv; var17++) {
                        if (kA[var17] == -1) {
                           kA[var17] = var1;
                           break;
                        }
                     }

                     kD++;
                  }

                  d(38, var0 + 1, var2 == -1);
               }

               var0 = 0;

               for (int var10 = 0; var10 < kv; var10++) {
                  if (kA[var10] != -1) {
                     var2 = var10 * 5;
                     var3 = ((r)q.ac[kE[kA[var10]]]).bc;
                     d(36, var2 + 13, false);
                     d(36, var2 + 12, false);
                     a(36, var2 + 11, true);
                     n(36, var2 + 10, var3);
                     g(36, var2 + 10, true);
                     var0++;
                  } else {
                     aK(var10);
                  }
               }

               if (var0 > gb) {
                  a(60);
               } else {
                  a(61);
               }

               gb = var0;
               return;
            case 4:
               a(51);
               var1 /= 9;
               r var13 = (r)q.ac[kE[var1]];
               au(0, var13.ar);
         }
      }
   }

   private static void aJ(int var0) {
      if (kA[var0] != -1) {
         d(38, kA[var0] * 9 + 1, false);
         aK(var0);
         kA[var0] = -1;
         kD--;
      }
   }

   private static void aK(int var0) {
      new StringBuffer().append("numberOfDragonToCancel = ").append(var0).toString();
      int var1 = 9 + var0 * 5;
      int var2;
      c(36, var2 = var1 + 4, 5, 23);
      d(36, var1 + 3, true);
      a(36, var1 + 2, false);
      j(36, var2, 43);
      d(36, var2, true);
      g(36, 10 + var0 * 5, false);
   }

   private static boolean cx() {
      for (int var0 = 0; var0 < kv; var0++) {
         if (kA[var0] != -1) {
            return true;
         }
      }

      return false;
   }

   private static void an(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         b(37, 46, dE());
         String var4 = "";
         int var3 = 0;
         int var2 = 0;
         a(37, 67, var4, false);
         var4 = "";
         a(37, 68, var4, false);
         if (ks != null) {
            var2 = b(2, ks.ag.ar, 122);
            var3 = b(2, ks.ag.ar, 123);
            int var14 = b(2, ks.ag.ar, 124);
            c(37, 35, 5, var2);
            c(37, 35, 6, var3);
            c(37, 35, 8, var14);
            var4 = ks.ag.d(true);
            a(37, 61, var4, false);
            if (cI[cJ] == 19) {
               m(37, 62, 6175 + cJ);
            } else {
               m(37, 62, 6181);
               if (kL + 1 > dp()) {
                  kL = dp() - 1;
               }

               a(37, 66, "" + (kL + 1) + "/" + dp());
            }

            var2 = b(2, ku.ag.ar, 122);
            var3 = b(2, ku.ag.ar, 123);
            int var16 = b(2, ku.ag.ar, 124);
            c(37, 37, 5, var2);
            c(37, 37, 6, var3);
            c(37, 37, 8, var16);
            dr();
            h(true);
            h(false);
            cz();
            cy();
            j(kF && !kG);
         }

         if (lj) {
            a(37, 65, true);
            c(37, 65, true);
            d(37, 64, true);
            i(false);
            j(false);
            k(false);
         }
      }

      if (var0 == 2) {
         av(iV);
      }

      if (var0 == 11) {
         switch (var1) {
            case 65:
               a(60);
               if (li) {
                  du();
               } else {
                  li = true;
               }
         }
      }

      if (var0 == 5) {
         switch (var1) {
            case 14:
            case 15:
            case 16:
            case 17:
               if (kH || kI) {
                  return;
               }

               a(39 + n(0, 3));
               if (al == null && kF) {
                  if (ks.ag.bd > 0) {
                     kF = false;
                  }

                  br(gd[var1 - 14]);
                  short var8 = ag[37][54][2];
                  short var12 = ag[37][54][3];
                  al = q.a(var8, var12, 41, false);
                  cz();
                  cy();
                  if (!kF) {
                     j(false);
                     k(false);
                  }
               }
               break;
            case 46:
               if (!gc && !dF()) {
                  r(true);
               } else {
                  boolean var11 = false;
                  boolean var7 = false;
                  b(0, true, false);
               }

               lq = true;
               ls = 57;
               return;
            case 50:
            case 51:
            case 52:
               if (ks.ag.bd > 0) {
                  a(60);
                  ll = var1 - 50;
                  lg = 0;
                  lf = 0;
                  lj = true;
                  f(37, 30, true);
                  a(37, 65, true);
                  c(37, 65, true);
                  d(37, 64, true);
                  i(false);
                  j(false);
                  k(false);
                  return;
               }
               break;
            case 70:
               lx = true;
               ds();
               return;
            case 71:
               lx = false;
               ds();
               return;
         }
      }
   }

   private static void h(boolean var0) {
      q var1;
      if (var0) {
         var0 = 40;
         var1 = ks;
      } else {
         var0 = 43;
         var1 = ku;
      }

      for (int var2 = 0; var2 < 3; var2++) {
         int var3 = var1.ag.bm[var2 + 42];
         d(37, var0 + var2, var3 != 15);
         if (var3 != 15) {
            j(37, var0 + var2, var3 + 15);
         }
      }
   }

   private static void cy() {
      c(37, 0, 7, 0);
      j(true);
      c(37, 31, 18, 0);
      if (!dE()) {
         b(37, 46, false);
      }

      gc = false;
   }

   private static void cz() {
      ky = 0;
      gd = new int[kV - 1];
      int var0 = 0;

      for (int var1 = 0; var1 < kV; var1++) {
         if (var1 != ld) {
            gd[var0] = var1;
            int var2 = kt[var1].ag.ar;
            int var3 = b(2, var2, 122);
            int var4 = b(2, var2, 123);
            var2 = b(2, var2, 124);
            c(37, 2 + (var0 << 1), 5, var3);
            c(37, 2 + (var0 << 1), 6, var4);
            c(37, 2 + (var0 << 1), 8, var2);
            var2 = kt[var1].ag.bd * 100 / kt[var1].ag.aW;
            p(37, 23 + (var0 << 1), 100);
            o(37, 23 + (var0 << 1), var2);
            if (kt[var1].ag.bd <= 0) {
               d(37, var0 + 18, true);
               b(37, var0 + 14, true);
               c(37, var0 + 10, 7, 127);
            } else {
               d(37, var0 + 18, false);
               b(37, var0 + 14, false);
               c(37, var0 + 10, 7, 0);
            }

            a(37, var0 + 14, true);
            c(37, 2 + (var0 << 1), 10, 1);
            c(37, 23 + (var0 << 1), 19, 1);
            d(37, 22 + (var0 << 1), true);
            var0++;
         }
      }

      while (var0 < 4) {
         d(37, var0 + 18, false);
         a(37, var0 + 14, false);
         c(37, 2 + (var0 << 1), 10, 0);
         c(37, 23 + (var0 << 1), 19, 0);
         d(37, 22 + (var0 << 1), false);
         c(37, var0 + 10, 7, 0);
         var0++;
      }
   }

   private static void i(boolean var0) {
      a(37, 50, var0);
      a(37, 51, var0);
      a(37, 52, var0);
      d(37, 47, var0);
      d(37, 48, var0);
      d(37, 49, var0);
      if (var0) {
         dr();
      }
   }

   private static void j(boolean var0) {
      c(37, 50, var0);
      c(37, 51, var0);
      c(37, 52, var0);
   }

   private static void k(boolean var0) {
      for (int var1 = 0; var1 < gd.length; var1++) {
         c(37, var1 + 14, var0 && kt[gd[var1]].ag.bd > 0);
      }
   }

   private static void ao(int var0, int var1) {
      if (var0 == 0) {
         kh = true;
         lz = 7;
         ly = 0;
         new StringBuffer().append("s_isPlayerWonFightingMinigame =").append(lx ? "true" : "false").toString();
         if (lx) {
            int var2 = ab.e[7];
            int var3 = kS[var2][25];
            int var4 = kS[var2][26];
            g(var3);
            h(var4);
            a(48, 30, "" + (var4 + la));
            a(48, 24, "" + (var3 + kZ));
            a(48, 27, "" + lb);
            f(48, 24, false);
            f(48, 30, false);
            f(48, 27, false);
            if (kW) {
               bj++;
            }
         } else {
            a(62);
            if (kW) {
               bk++;
            }
         }

         a(48, 21, u(lx ? 6159 : 6160));
         if (lx) {
            c(48, 3, 6, 77);
            c(48, 3, 8, 3);
            c(48, 21, 8, 6);
         } else {
            c(48, 4, 6, 77);
            c(48, 4, 8, 3);
            c(48, 21, 8, 7);
         }

         for (int var14 = 0; var14 < kV; var14++) {
            c(48, 9 + (var14 << 2), 6, lx && kt[var14].ag.bd > 0 ? 4 : 5);
            int var7 = kN[var14].bc;
            n(48, 7 + (var14 << 2), var7);
         }

         for (int var15 = 0; var15 < kU; var15++) {
            c(48, 10 + (var15 << 2), 6, !lx && var15 >= kL ? 4 : 5);
            int var8 = kO[var15].bc;
            n(48, 8 + (var15 << 2), var8);
         }

         kW = false;
         bP();
         m(bf(iV), true);
         be(bf(iV));
         lq = true;
         ls = 48;
      }

      if (var0 == 1) {
         kh = false;
      }

      if (var0 == 2) {
         av(iV);
         if (al != null) {
            al.a();
         }

         int var5;
         if ((var5 = 7 + ly / 300) != lz) {
            if (var5 - lz > 1) {
               var5--;
            }

            lz = var5;
         }

         if (var5 == 24 || var5 == 30 || var5 == 27 || var5 == 23 || var5 == 29 || var5 == 26 || var5 == 21) {
            ly += 300;
         } else if (var5 <= 31) {
            int var9 = kV;
            int var16 = kU;
            boolean var10;
            if (var10 = var9 < 2 && var5 == 11
               || var9 < 3 && var5 == 15
               || var9 < 2 && var5 == 13
               || var9 < 3 && var5 == 17
               || var16 < 2 && var5 == 12
               || var16 < 3 && var5 == 16
               || var16 < 2 && var5 == 14
               || var16 < 3 && var5 == 18) {
               ly += 300;
            } else {
               ly = ly + aq;
               if (var5 == 31) {
                  a(48, var5, !var10);
               } else if (var5 == 19) {
                  if (lx) {
                     a(26);
                     d(48, var5, true);
                     f(48, 21, true);
                  }
               } else if (var5 == 20) {
                  if (!lx) {
                     d(48, var5, true);
                     f(48, 21, true);
                  }
               } else if (var5 != 22 && var5 != 28 && var5 != 25) {
                  if (var5 == 31) {
                     a(48, 31, true);
                  } else if (var5 != 7 && var5 != 11 && var5 != 15 && var5 != 8 && var5 != 12 && var5 != 16) {
                     d(48, var5, !var10);
                  } else {
                     g(48, var5, !var10);
                  }
               } else if (lx) {
                  d(48, var5, true);
                  d(48, var5 + 1, true);
                  f(48, var5 + 2, true);
               }

               if (lx && var5 == 21) {
                  var10 = var5;
                  short var10000 = ag[48][var10][2];
                  var10 = var5;
                  var10 = var10000 + ag[48][var10][5] / 2;
                  var16 = var5;
                  var5 = ag[48][var16][3] + ag[48][var5][6] / 2;
                  al = q.a(var10, var5, 41, false);
                  ly += 300;
               }
            }
         }
      }

      if (var0 == 3 && ag[48][19][9] == 1) {
         c(48, 19, 7, 1);
         d(48, true);
         c(48, 19, 9, 0);
      }

      if (var0 == 4 && al != null) {
         al.b();
      }

      if (var0 == 5) {
         switch (var1) {
            case 31:
               a(60);
               if (kT == 1) {
                  if (lT == 4) {
                     cw();
                     return;
                  }
               } else {
                  cw();
               }
         }
      }
   }

   private static void ap(int var0, int var1) {
      if (var0 == 0) {
         kh = true;
         bP();
         m(bf(iV), true);
         be(bf(iV));
         if (kZ > 0) {
            String var2 = an(kZ);
            a(82, 12, var2, false);
         } else {
            String var4 = "-";
            a(82, 12, var4, false);
         }

         if (la > 0) {
            String var5 = an(la);
            a(82, 13, var5, false);
         } else {
            String var6 = "-";
            a(82, 13, var6, false);
         }

         if (lb > 0) {
            String var7 = an(lb);
            a(82, 15, var7, false);
         } else {
            String var8 = "-";
            a(82, 15, var8, false);
         }

         if (dE()) {
            d(82, 3, false);
         }

         int var9 = Z(cJ);
         int var3 = aa(cJ);
         g(var9);
         i(var3);
         if (var3 > 0) {
            String var10 = an(var3);
            a(82, 14, var10, false);
            c(82, 9, 5, 21);
            c(82, 9, 6, 15);
         } else {
            String var11 = an(var9);
            a(82, 14, var11, false);
            c(82, 9, 5, 23);
            c(82, 9, 6, 46);
         }

         a(26);
         lq = true;
         ls = 82;
      }

      if (var0 == 5) {
         switch (var1) {
            case 17:
               kh = false;
               a(60);
               if (cI[cJ] == 20 && jO <= 100) {
                  a(0, u(13330 + cJ), 44);
                  return;
               }

               cw();
         }
      }
   }

   private static void aq(int var0, int var1) {
      if (var0 == 0) {
         kh = true;
         bP();
         m(bf(iV), true);
         ge = ab(cJ);
         c(83, 6, "" + ab(cJ));
         ad[0] = "" + dv();
         String var2 = a(u(13369), ad, '#');
         a(83, 5, var2);
         ks.ag.k(3);
         gf = 0;
         p(83, 9, 5000);
         lq = true;
         ls = 83;
      }

      if (var0 == 2) {
         ks.ag.k();
         if ((gf = gf + aq) > 5000) {
            o(83, 9, 0);
            a(61);
            al();
            cw();
            gf = 0;
         } else {
            o(83, 9, 5000 - gf);
         }
      }

      if (var0 == 4) {
         ks.ag.k(ag[83][7][2], ag[83][7][3]);
      }

      if (var0 == 5) {
         switch (var1) {
            case 6:
               kh = false;
               a(60);
               int var3 = ge;
               lq = true;
               lr = true;
               ls = -1;
               if (a(false, var3)) {
                  f(37, 59, false);
                  cy();
                  b(39, false, false);
                  lE = false;
                  lD = false;
                  kH = false;
                  do_method();
                  br(0);
                  lq = true;
                  lr = true;
                  ls = -1;
                  cz();
                  a(22);
               }
         }
      }
   }

   private static void ar(int var0, int var1) {
      if (var0 == 0) {
         bP();
         String var4 = u(dQ[dP][6]);
         a(14, 7, var4, false);
         var4 = u(dQ[dP][5]);
         a(14, 20, var4, false);
         var4 = "";
         a(14, 8, var4, false);
         var4 = "";
         a(14, 9, var4, false);
         var4 = "";
         a(14, 10, var4, false);
         if (bj()) {
            a(14, 23, "" + dQ[dP][10]);
         } else {
            a(14, 23, "" + dQ[dP][14]);
         }

         d(14, 2, false);
         d(14, 3, false);
         d(14, 4, false);
         j(14, 6, dQ[dP][8]);
         byte var2;
         if (dQ[dP][9] == 0) {
            var2 = 23;
         } else {
            var2 = 21;
         }

         byte var23 = (byte)var2;
         c(14, 6, 5, var23);
         byte var3 = 0;
         if (ap(dP) == 1) {
            var3 = 76;
         } else if (ap(dP) == 2) {
            var3 = 38;
         }

         for (int var24 = 1; var24 < dT[dP].length - 1; var24++) {
            String var11 = u(dT[dP][var24][7]);
            a(14, 8 + (var24 - 1), var11);
            d(14, 2 + (var24 - 1), var11 != "");
            d(14, 17 + (var24 - 1), dT[dP][var24][1] > 0);
            a(14, 14 + (var24 - 1), dT[dP][var24][1] == 0);
            if (J(14, 14 + (var24 - 1))) {
               a(14, 14 + (var24 - 1), dT[dP][var24][14] != -1);
            }

            int var5 = var3;
            var2 = var24;
            int var8;
            c(14, var8 = 11 + (var2 - 1), 3, ek[14][var8][3] + var5);
            switch (dT[dP][var2][3]) {
               case 0:
                  String var29 = "" + dT[dP][var2][6];
                  if (dT[dP][var2][1] > 0) {
                     var29 = "" + dT[dP][var2][5];
                  }

                  String var30 = var29 + "/" + dT[dP][var2][5];
                  a(14, var8, var30);
                  break;
               case 1:
                  var5 = dT[dP][var2][9];
                  int var6 = dT[dP][var2][12];
                  String var27 = an(var5);
                  String var7 = an(var6);
                  String var28;
                  if (e == 17 && var6 >= 1000000) {
                     var28 = var7 + "/" + var27;
                  } else {
                     var28 = var27 + "/" + var7;
                  }

                  if (dT[dP][var2][1] > 0) {
                     var28 = var7 + "/" + var7;
                  }

                  a(14, var8, var28);
                  break;
               default:
                  a(14, var8, "");
            }

            c(14, var5 = 8 + (var24 - 1), 3, ek[14][var5][3] + var3);
            c(14, var2 = 2 + (var24 - 1), 3, ek[14][var2][3] + var3);
            c(14, var2 = 17 + (var24 - 1), 3, ek[14][var2][3] + var3);
            c(14, var2 = 14 + (var24 - 1), 3, ek[14][var2][3] + var3);
            if (dZ[dP][var24][0][0] == -14 && ab.e[31] == 0) {
               bK();
            }
         }
      }

      if (var0 == 2) {
         switch (jb[63]) {
            case 1:
               jc[63][2] = jc[63][2] + 179200 * aq / 1000;
               jc[63][0] = y(jc[63][2]);
               if (jc[63][0] >= 0) {
                  jc[63][0] = 0;
                  jb[63] = 0;
                  ay(iW[63]);
               }
               break;
            case 2:
               jc[63][2] = jc[63][2] - 179200 * aq / 1000;
               jc[63][0] = y(jc[63][2]);
               if (jc[63][0] <= 240) {
                  b(63, false, false);
               }
         }
      }

      if (var0 == 5) {
         switch (var1) {
            case -2:
            case 26:
               a(61);
               if (jb[63] == 0) {
                  b(63, false, true);
                  int var16 = jc[4][0];
                  int var18 = jc[4][1];
                  var16 = ag[4][6][2] + var16;
                  int var25 = ag[4][6][3] + var18;
                  var1 = var16 + ag[4][6][5] - 1;
                  int var32 = var25 + ag[4][6][6] - 1;
                  if (!a(cB, cC, var16, var25, var1, var32)) {
                     b(73, false, true);
                     eP = true;
                  }
               }
               break;
            case 14:
               a(60);
               B(dP, 1);
               break;
            case 15:
               a(60);
               B(dP, 2);
               break;
            case 16:
               a(60);
               B(dP, 3);
               break;
            case 21:
               a(60);
               if (bj()) {
                  var1 = dQ[dP][10];
               } else {
                  var1 = dQ[dP][14];
               }

               if (a(false, var1)) {
                  b(73, false, true);
                  b(63, false, true);
                  as(dP);
               }
         }
      }

      if (var0 == 6) {
         jb[63] = 1;
         jc[63][2] = -61440;
      }

      if (var0 == 7) {
         jb[63] = 2;
         jc[63][2] = 0;
      }
   }

   private static void as(int var0, int var1) {
      if (var0 == 0) {
         lq = true;
         ls = 15;
         cX();
         m(bf(iV), true);
         be(bf(iV));
         aQ();
         x();
         q.c(z, 4);
         if (v.bl != null) {
            for (int var2 = 0; var2 < v.bl.length; var2++) {
               v.bl[var2] = null;
            }
         }

         G();
         String var4 = u(dQ[dO][6]);
         a(15, 10, var4, false);
         var4 = u(dQ[dO][7]);
         a(15, 12, var4, false);
         if (gg == 0) {
            var4 = "-";
            a(15, 7, var4, false);
         } else {
            var4 = an(gg);
            a(15, 7, var4, false);
         }

         if (gh == 0) {
            d(15, 6, false);
            f(15, 11, false);
            var4 = "-";
            a(15, 11, var4, false);
         } else {
            var4 = an(gh);
            a(15, 7, var4, false);
         }

         byte var3;
         byte var10;
         if (dQ[dO][13] != 0 && dQ[dO][13] == 1) {
            var10 = 53;
            var3 = 1;
         } else {
            var10 = 17;
            var3 = 2;
         }

         c(15, 2, 5, var10);
         c(15, 2, 6, var3);
      }

      if (var0 == 1) {
         aR();
         y();
         bJ();
      }

      if (var0 == 5 && var1 == 4) {
         a(60);
         b(8, false, false);
         aH();
         l |= 2;
      }

      if (var0 == 3) {
         H(iV, aq);
      }
   }

   private static void at(int var0, int var1) {
      if (var0 == 0) {
         gi = true;
         bP();
         m(bf(iV), true);
         bf();
         bc();
         x();
      }

      if (var0 == 2 && q.an != null) {
         if (q.an.ao == 37) {
            String var2 = ae(ab.e[15] / 1000);
            var2 = var2;
            a(31, 23, var2, false);
         } else {
            byte var5 = q.an.aT;
            int var3 = o(3)[q.an.ar][var5 + 35 - 1];
            a(31, 21, j(117, 0) + " " + var5);
            a(31, 23, q.an.ap() + " / " + a((long)var3, e, " "));
         }
      }

      if (var0 == 1) {
         bg();
         bd();
         y();
      }

      if (var0 == 3) {
         av(iV);
      }

      if (var0 == 5) {
         switch (var1) {
            case 26:
               a(61);
               m(57, false);
               b(57, false, false);
               gi = false;
               gj = -1;
               gk = -1;
         }
      }
   }

   private static void au(int var0, int var1) {
      gj = var0;
      gk = var1;
      k(var0, var1, false);
   }

   private static void k(int var0, int var1, boolean var2) {
      if (var0 != 0) {
         b(57, true, false);
         m(57, true);
      }

      switch (var0) {
         case 0:
            aO(var1);
            break;
         case 1:
            var0 = var1;
            int var3 = 1;
            if (q.an != null) {
               var3 = q.an.aT;
               a(31, 21, j(117, 0) + " " + var3);
            }

            int var4 = o(3)[var0][9];
            int var5 = o(3)[var0][39];
            var3 = o(3)[var0][var3 + 35 - 1];
            int var6 = o(3)[var0][40];
            c(31, 3, 5, var4);
            c(31, 3, 6, 0);
            a(31, 20, j(var5, 1));
            if (z != 0 || q.an == null || !q.an.ad()) {
               d(31, 18, false);
               f(31, 23, false);
            } else if (q.an != null) {
               a(31, 23, q.an.ap() + " / " + a((long)var3, e, " "));
            } else {
               a(31, 23, u(107) + " " + a((long)var3, e, " "));
            }

            a(31, 25, j(var6, 1));
            m(31, 22, 116);

            for (int var9 = 0; var9 < 11; var9++) {
               if ((var5 = o(3)[var0][var9 + 41]) != 15) {
                  c(31, var9 + 7, 6, var5);
               } else {
                  c(31, var9 + 7, 10, 0);
               }
            }

            c(31, 4, 10, 0);
            c(31, 5, 10, 0);
            c(31, 6, 10, 0);
            c(31, 19, 10, 0);
            c(31, 24, 18, 0);
            if (o(3)[var0][13] == 0) {
               c(31, 21, 18, 0);
            }
            break;
         case 2:
            aL(var1);
            break;
         case 3:
            aM(var1);
         case 4:
      }

      if (var2) {
         aO(var1);
      }
   }

   private static void aL(int var0) {
      int var1 = o(5)[var0][4];
      int var2 = o(5)[var0][5];
      int var3 = o(5)[var0][18];
      int var4 = o(5)[var0][19];
      var0 = o(5)[var0][7];
      c(31, 3, 5, var1);
      c(31, 3, 6, var2);
      c(31, 3, 8, var0);
      String var7 = j(var3, 1);
      a(31, 20, var7, false);
      String var8 = j(var4, 1);
      a(31, 25, var8, false);
      c(31, 4, 10, 0);
      c(31, 5, 10, 0);
      c(31, 6, 10, 0);

      for (int var6 = 0; var6 < 11; var6++) {
         c(31, var6 + 7, 10, 0);
      }

      c(31, 19, 10, 0);
      c(31, 24, 18, 0);
      c(31, 18, 10, 0);
      c(31, 23, 18, 0);
      c(31, 22, 18, 0);
   }

   private static void aM(int var0) {
      int var1 = 0;
      if (q.an != null) {
         if (q.an.au != 3) {
            var1 = q.an.aT;
            a(31, 21, j(117, 0) + " " + var1);
         } else {
            a(31, 21, " ");
            c(31, 21, 18, 0);
         }
      }

      var1 = o(4)[var0][9];
      int var2 = o(4)[var0][10];
      int var3 = o(4)[var0][37];
      int var4 = o(4)[var0][38];
      c(31, 3, 5, var1);
      c(31, 3, 6, var2);
      a(31, 20, j(var3, 1));
      a(31, 25, j(var4, 1));
      c(31, 4, 10, 0);
      c(31, 5, 10, 0);
      c(31, 6, 10, 0);

      for (int var7 = 0; var7 < 11; var7++) {
         c(31, var7 + 7, 10, 0);
      }

      c(31, 19, 10, 0);
      c(31, 24, 18, 0);
      c(31, 18, 10, 0);
      c(31, 23, 18, 0);
      c(31, 22, 18, 0);
      if (o(4)[var0][13] == 0) {
         c(31, 21, 18, 0);
      }

      if (q.an.ao == 37 && z == 0) {
         c(31, 23, 18, 1);
         String var8 = ae(ab.e[15] / 1000);
         a(31, 23, var8);
      }
   }

   private static void av(int var0, int var1) {
      if (var0 == 0) {
         cX();
         m(bf(iV), true);
         aQ();
      }

      if (var0 == 1) {
         aR();
      }

      if (var0 == 3) {
         cY();
         H(iV, aq);
      }

      if (var0 == 5) {
         if (var1 == 2) {
            a(60);
            r var5;
            if ((var5 = q.J().aV[R]).aP == 15) {
               a(60);
               boolean var10000 = q.a(var5, true);
               boolean var7 = false;
               if (!var10000) {
                  a(var5);
               }

               q.an.W();
            }

            b(59, false, false);
            return;
         }

         if (var1 == 3) {
            a(60);
            var1 = q.an.aV[R].D();
            String var3 = u(268);
            ad[0] = "" + var1;
            String var4 = a(var3, ad, '#');
            a(2, var4, 37);
            return;
         }

         if (var1 == 5) {
            r var2 = q.an.aV[R];
            k(0, var2.ar, true);
         }
      }
   }

   private static void aw(int var0, int var1) {
      if (var0 == 0) {
         cX();
         m(bf(iV), true);
         aQ();
         q.c(z, 4);
         r var2;
         int var3 = (var2 = q.an.aV[R]).ar;
         gl = o(2);
         gm = o(9);
         int var4 = gl[var3][1];
         int var5 = gl[var3][3];
         n(89, 11, var3);
         String var7 = j(var4, 1);
         a(89, 4, var7, false);
         var7 = j(var5, 10);
         a(89, 14, var7, false);
         String[] var16 = new String[7];

         for (int var18 = 0; var18 < var16.length; var18++) {
            var16[var18] = "";
         }

         var5 = 0;

         for (int var6 = 0; var6 < 7; var6++) {
            if (var2.n(o(3)[var6][0])) {
               boolean var22 = false;
               String var8 = j(o(3)[var6][39], 1);

               for (int var9 = 0; var9 <= var5; var9++) {
                  if (var16[var9].equals(var8)) {
                     var22 = true;
                  }
               }

               if (!var22) {
                  var16[var5] = var8;
                  var5++;
               }
            }
         }

         String var20 = "";

         for (int var23 = 0; var23 < var5 - 1; var23++) {
            var20 = var20 + var16[var23] + ", ";
         }

         a(89, 5, var20 + var16[var5 - 1]);
         int var14 = gm[var3][1];
         var4 = gm[var3][2];
         var3 = gm[var3][3];
         if (var14 != 15) {
            c(89, 8, 6, var14);
         } else {
            c(89, 8, 10, 0);
         }

         if (var4 != 15 && var4 != var14) {
            c(89, 9, 6, var4);
         } else {
            c(89, 9, 10, 0);
         }

         if (var3 != 15) {
            c(89, 10, 6, var3);
         } else {
            c(89, 10, 10, 0);
         }
      }

      if (var0 == 1) {
         aR();
      }

      if (var0 == 3) {
         cY();
         av(iV);
      }

      if (var0 == 5) {
         if (var1 == 7) {
            a(60);
            r var12;
            if (!q.a(var12 = q.J().aV[R], true)) {
               a(var12);
            }

            q.an.W();
            q.an = null;
            b(60, false, false);
            return;
         }

         if (var1 == 6) {
            a(60);
            var1 = q.an.aV[R].D();
            String var10 = u(268);
            ad[0] = "" + var1;
            String var11 = a(var10, ad, '#');
            a(2, var11, 37);
            return;
         }

         if (var1 == 1) {
            a(61);
            b(60, false, false);
         }
      }
   }

   private static void ax(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         be(bf(iV));
         b(64, true, false);
         aQ();
         x();
         lq = true;
         gn = true;
         ls = 43;
         q.c(z, 4);

         for (int var3 = 0; var3 < 15; var3++) {
            c(43, var3 + 5, true);
            c(43, var3 + 5, 7, 2);
         }

         cA();
         d(43, 21, go && gH.c() < 0);
         d(43, 22, go && gH.c() > -(gH.g() - gH.e()));
         a(2, 0, false);
         a(18, 21, aW());
         a(18, 21, F());
         bP = true;
      }

      if (var0 == 2) {
         gH.i();
         int var2 = cB;
         int var10 = cC;
         label104:
         if (b(var2, var10, gI)) {
            if (X(cl)) {
               gH.b(cD, cE);
            }

            if (W(cm)) {
               if (X(cl)) {
                  break label104;
               }

               gH.a(cD, cE);
               var2 = gH.c(cB - gJ, cC - gK);
               if (u.b >= 0 && u.b != var2) {
                  break label104;
               }

               if (var2 >= 0) {
                  gL = var2;
                  ay(var2, cm);
                  gH.j();
               }
            }

            if (X(cl | ck)) {
               var2 = gH.c(cB - gJ, cC - gK);
               if ((u.b < 0 || u.b == var2) && var2 >= 0) {
                  ay(var2, ck);
               }
            }
         }

         if (u.c) {
            aR = 0;
         }

         d(43, 21, go && gH.c() < 0);
         d(43, 22, go && gH.c() > -(gH.g() - gH.e()));
      }

      if (var0 == 1) {
         aR();
         y();
         bP = false;
      }

      if (var0 == 4) {
         k(gI[0], gI[1], gI[2], gI[3]);
         int var11 = gH.c();
         int var7 = gH.d();
         var7 = var7;
         g(44, var11, var7, 0);
         bQ();
         h(43, 21, 0, 0);
         h(43, 22, 0, 0);
      }

      if (var0 == 5) {
         switch (var1) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
               a(60);
               byte var4;
               if (ag[43][var1][7] == 2) {
                  var4 = 0;
               } else {
                  var4 = 2;
               }

               for (int var9 = 0; var9 < 15; var9++) {
                  c(43, var9 + 5, 7, 2);
               }

               c(43, var1, 7, var4);
               cA();
               return;
            case 20:
               aH();
               aR();
               gn = false;
               b(66, false, false);
               a(61);
               a(2, 0, aW());
               a(2, 0, F());
               return;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            default:
               break;
            case 26:
               s(true);
         }
      }
   }

   private static void cA() {
      b(et, 43, 24, ag[43][24][2], ag[43][24][3]);
      int var0 = et[2] - et[0];
      int var1 = et[3] - et[1];
      gH.k();
      gH.b();
      gH.a(1);
      gH.c(ag[43][23][5]);
      gH.d(ag[43][23][6]);
      gr = ag[43][5][7] == 0;
      gs = ag[43][6][7] == 0;
      gt = ag[43][7][7] == 0;
      gu = ag[43][8][7] == 0;
      gv = ag[43][9][7] == 0;
      gw = ag[43][10][7] == 0;
      gx = ag[43][11][7] == 0;
      gy = ag[43][12][7] == 0;
      gz = ag[43][13][7] == 0;
      gA = ag[43][14][7] == 0;
      gB = ag[43][15][7] == 0;
      gC = ag[43][16][7] == 0;
      gD = ag[43][17][7] == 0;
      gE = ag[43][18][7] == 0;
      gF = ag[43][19][7] == 0;
      if (!gr && !gs && !gt && !gu && !gv && !gw && !gx && !gy && !gz && !gA && !gB && !gC && !gD && !gE && !gF) {
         gG = true;
      } else {
         gG = false;
      }

      String var3 = "";
      if (gr) {
         var3 = u(1186);
      } else if (gs) {
         var3 = u(1187);
      } else if (gt) {
         var3 = u(1188);
      } else if (gu) {
         var3 = u(1189);
      } else if (gv) {
         var3 = u(1190);
      } else if (gw) {
         var3 = u(1191);
      } else if (gx) {
         var3 = u(1192);
      } else if (gy) {
         var3 = u(1193);
      } else if (gz) {
         var3 = u(1194);
      } else if (gA) {
         var3 = u(1195);
      } else if (gB) {
         var3 = u(1196);
      } else if (gC) {
         var3 = u(1197);
      } else if (gD) {
         var3 = u(1198);
      } else if (gE) {
         var3 = u(1199);
      } else if (gF) {
         var3 = u(1200);
      } else if (gG) {
         var3 = u(1201);
      }

      String var8 = var3;
      int var6 = 0;
      int var4 = 0;
      a(43, 25, var8, false);
      int var2 = 0;
      if (gG) {
         for (int var11 = 0; var11 < gp.length; var11++) {
            var4 = o(9)[var11][1];
            int var5 = o(9)[var11][2];
            var6 = o(9)[var11][3];
            gq[var2 * 7] = 0;
            gq[var2 * 7 + 1] = 0;
            gq[var2 * 7 + 2] = var4;
            gq[var2 * 7 + 3] = var5;
            gq[var2 * 7 + 4] = var6;
            gq[var2 * 7 + 5] = o(2)[var11][1];
            gq[var2 * 7 + 6] = var11;
            var2++;
         }
      } else {
         for (int var12 = 0; var12 < gp.length; var12++) {
            var4 = o(9)[var12][1];
            int var29 = o(9)[var12][2];
            var6 = o(9)[var12][3];
            if (var4 != 15) {
               int var7 = var2;
               if (var4 == 0 && gr) {
                  var2++;
               } else if (var4 == 1 && gs) {
                  var2++;
               } else if (var4 == 2 && gt) {
                  var2++;
               } else if (var4 == 3 && gu) {
                  var2++;
               } else if (var4 == 4 && gv) {
                  var2++;
               } else if (var4 == 5 && gw) {
                  var2++;
               } else if (var4 == 6 && gx) {
                  var2++;
               } else if (var4 == 7 && gy) {
                  var2++;
               } else if (var4 == 8 && gz) {
                  var2++;
               } else if (var4 == 9 && gA) {
                  var2++;
               } else if (var4 == 10 && gB) {
                  var2++;
               } else if (var4 == 11 && gC) {
                  var2++;
               } else if (var4 == 12 && gD) {
                  var2++;
               } else if (var4 == 13 && gE) {
                  var2++;
               } else if (var4 == 14 && gF) {
                  var2++;
               }

               if (var7 != var2) {
                  gq[var7 * 7] = 0;
                  gq[var7 * 7 + 1] = 0;
                  gq[var7 * 7 + 2] = var4;
                  gq[var7 * 7 + 3] = var29;
                  gq[var7 * 7 + 4] = var6;
                  gq[var7 * 7 + 5] = o(2)[var12][1];
                  gq[var7 * 7 + 6] = var12;
                  continue;
               }
            }

            if (var29 != var4) {
               int var34 = var2;
               if (var29 == 0 && gr) {
                  var2++;
               } else if (var29 == 1 && gs) {
                  var2++;
               } else if (var29 == 2 && gt) {
                  var2++;
               } else if (var29 == 3 && gu) {
                  var2++;
               } else if (var29 == 4 && gv) {
                  var2++;
               } else if (var29 == 5 && gw) {
                  var2++;
               } else if (var29 == 6 && gx) {
                  var2++;
               } else if (var29 == 7 && gy) {
                  var2++;
               } else if (var29 == 8 && gz) {
                  var2++;
               } else if (var29 == 9 && gA) {
                  var2++;
               } else if (var29 == 10 && gB) {
                  var2++;
               } else if (var29 == 11 && gC) {
                  var2++;
               } else if (var29 == 12 && gD) {
                  var2++;
               } else if (var29 == 13 && gE) {
                  var2++;
               } else if (var29 == 14 && gF) {
                  var2++;
               }

               if (var34 != var2) {
                  gq[var34 * 7] = 0;
                  gq[var34 * 7 + 1] = 0;
                  gq[var34 * 7 + 2] = var4;
                  gq[var34 * 7 + 3] = var29;
                  gq[var34 * 7 + 4] = var6;
                  gq[var34 * 7 + 5] = o(2)[var12][1];
                  gq[var34 * 7 + 6] = var12;
                  continue;
               }
            }

            if (var6 != var29) {
               int var35 = var2;
               if (var6 == 0 && gr) {
                  var2++;
               } else if (var6 == 1 && gs) {
                  var2++;
               } else if (var6 == 2 && gt) {
                  var2++;
               } else if (var6 == 3 && gu) {
                  var2++;
               } else if (var6 == 4 && gv) {
                  var2++;
               } else if (var6 == 5 && gw) {
                  var2++;
               } else if (var6 == 6 && gx) {
                  var2++;
               } else if (var6 == 7 && gy) {
                  var2++;
               } else if (var6 == 8 && gz) {
                  var2++;
               } else if (var6 == 9 && gA) {
                  var2++;
               } else if (var6 == 10 && gB) {
                  var2++;
               } else if (var6 == 11 && gC) {
                  var2++;
               } else if (var6 == 12 && gD) {
                  var2++;
               } else if (var6 == 13 && gE) {
                  var2++;
               } else if (var6 == 14 && gF) {
                  var2++;
               }

               if (var35 != var2) {
                  gq[var35 * 7] = 0;
                  gq[var35 * 7 + 1] = 0;
                  gq[var35 * 7 + 2] = var4;
                  gq[var35 * 7 + 3] = var29;
                  gq[var35 * 7 + 4] = var6;
                  gq[var35 * 7 + 5] = o(2)[var12][1];
                  gq[var35 * 7 + 6] = var12;
               }
            }
         }
      }

      gH.b(var2);
      go = var2 > 4;
      gH.g(var0 + 1);
      gH.h(var1 + 1);
      gH.e(ag[43][23][7] + var0);
      gH.f(var1);
      au(44);
      O(44, ag[44].length + 6 * (var2 - 1));

      for (int var30 = 0; var30 < var2; var30++) {
         if (var30 != 0) {
            q(44, 0, var30 * 6);
            q(44, 1, var30 * 6 + 1);
            q(44, 2, var30 * 6 + 2);
            q(44, 3, var30 * 6 + 3);
            q(44, 4, var30 * 6 + 4);
            q(44, 5, var30 * 6 + 5);
            short var13 = ag[44][0][2];
            short var22 = ag[44][0][3];
            c(44, var30 * 6, 2, var13 + gH.i(var30));
            c(44, var30 * 6, 3, var22 + gH.j(var30));
            short var14 = ag[44][1][2];
            var22 = ag[44][1][3];
            c(44, var30 * 6 + 1, 2, var14 + gH.i(var30));
            c(44, var30 * 6 + 1, 3, var22 + gH.j(var30));
            short var15 = ag[44][2][2];
            var22 = ag[44][2][3];
            c(44, var30 * 6 + 2, 2, var15 + gH.i(var30));
            c(44, var30 * 6 + 2, 3, var22 + gH.j(var30));
            short var16 = ag[44][3][2];
            var22 = ag[44][3][3];
            c(44, var30 * 6 + 3, 2, var16 + gH.i(var30));
            c(44, var30 * 6 + 3, 3, var22 + gH.j(var30));
            short var17 = ag[44][4][2];
            var22 = ag[44][4][3];
            c(44, var30 * 6 + 4, 2, var17 + gH.i(var30));
            c(44, var30 * 6 + 4, 3, var22 + gH.j(var30));
            short var18 = ag[44][5][2];
            var22 = ag[44][5][3];
            c(44, var30 * 6 + 5, 2, var18 + gH.i(var30));
            c(44, var30 * 6 + 5, 3, var22 + gH.j(var30));
         }

         int var36 = gq[var30 * 7 + 2];
         int var19 = gq[var30 * 7 + 3];
         var0 = gq[var30 * 7 + 4];
         var1 = gq[var30 * 7 + 5];
         var4 = gq[var30 * 7 + 6];
         if (gp[var4] != 0) {
            d(44, 5 + var30 * 6, true);
         } else {
            d(44, 5 + var30 * 6, false);
         }

         int var10000 = 0 + var30 * 6;
         int var37 = var4;
         var6 = var10000;
         ag[44][var6][25] = 5;
         ag[44][var6][18] = (short)var37;
         ag[44][var6][19] = 1;
         int var10001 = 4 + var30 * 6;
         var8 = j(var1, 1);
         a(44, var10001, var8, false);
         if (var36 != 15) {
            c(44, 1 + var30 * 6, 6, var36);
            c(44, 1 + var30 * 6, 10, 1);
         } else {
            c(44, 1 + var30 * 6, 10, 0);
         }

         if (var19 != 15 && var19 != var36) {
            c(44, 2 + var30 * 6, 6, var19);
            c(44, 2 + var30 * 6, 10, 1);
         } else {
            c(44, 2 + var30 * 6, 10, 0);
         }

         if (var0 != 15 && var0 != var19) {
            c(44, 3 + var30 * 6, 6, var0);
            c(44, 3 + var30 * 6, 10, 1);
         } else {
            c(44, 3 + var30 * 6, 10, 0);
         }
      }

      gH.a(false);
      gH.b(true);
      gJ = et[0];
      gK = et[1];
      gI[0] = ag[43][23][2];
      gI[1] = ag[43][23][3];
      gI[2] = ag[43][23][5];
      gI[3] = ag[43][23][6];
      gH.k();
      gL = 0;
   }

   private static void ay(int var0, int var1) {
      int var2 = gH.c();
      int var3 = gH.d();
      int var6 = var3;
      var2 = i(44, var2, var6, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm && !u.c && aR >= 400) {
         var1 = var2;
         var0 = gL;
         switch (var1 % 6) {
            case 0:
               a(51);
               aO(gq[var0 * 7 + 6]);
         }
      }
   }

   private static void az(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         bf();
         bc();
      }

      if (var0 == 1) {
         bg();
         bd();
      }

      if (var0 == 2) {
         H(iV, aq);
         if (lC != 2) {
            String var2 = u(132);
            String var3 = ao(ab.e[12]);
            String var4 = "100";
            ad[0] = var3;
            var2 = a(var2, ad, '%');
            ad[0] = var4;
            var2 = a(var2, ad, '#');
            var4 = var2;
            a(46, 2, var4, false);
            if (ab.e[12] < 0) {
               b(bf(iV), false, false);
               ab.e[12] = 86400000;
               lC = 0;
               M(10);
            }
         } else {
            String var7 = u(132);
            String var10 = ao(ab.e[13]);
            String var12 = "" + b(23, ab.e[7], 27);
            ad[0] = var10;
            var7 = a(var7, ad, '%');
            ad[0] = var12;
            var7 = a(var7, ad, '#');
            a(46, 2, var7);
            if (ab.e[13] < 0) {
               b(bf(iV), false, false);
               bq(0);
            }
         }
      }

      if (var0 == 5) {
         switch (var1) {
            case 3:
               a(72);
               if (lC == 2 && b(false, b(23, ab.e[7] - 1, 27))) {
                  a(72);
                  bq(0);
               }

               b(35, false, false);
               return;
            case 4:
               a(61);
               b(bf(iV), false, false);
         }
      }
   }

   private static void aA(int var0, int var1) {
      if (var0 == 0) {
         m(bf(iV), true);
         int[] var2 = z(10, ju);
         String var5 = j(var2[4], 9);
         short var4 = 0;
         short var3 = 0;
         a(49, 5, var5, false);
         cB();
         var5 = j(var2[3], 9);
         a(49, 3, var5, false);
         int var10 = var2[1];
         c(49, 11, 5, var10);
         j(49, 11, var2[2]);
         a(49, 6, "x " + a((long)var2[6], e, " "));
         a(49, 7, "x " + a((long)var2[7], e, " "));
         a(49, 8, "x " + a((long)var2[8], e, " "));
         if (var2[6] == 0) {
            d(49, 12, false);
            f(49, 6, false);
            short var6 = ag[49][8][2];
            var3 = ag[49][8][3];
            var4 = ag[49][14][2];
            short var11 = ag[49][14][3];
            c(49, 13, 2, var4);
            c(49, 13, 3, var11);
            c(49, 7, 2, var6);
            c(49, 7, 3, var3);
         }

         bc();
         bf();
         x();
      }

      if (var0 == 2) {
         cB();
      }

      if (var0 == 5) {
         switch (var1) {
            case 10:
               a(61);
               l(true);
         }
      }
   }

   private static void aN(int var0) {
      ju = var0;
      b(21, true, false);
   }

   private static void l(boolean var0) {
      if (v(21)) {
         b(21, false, false);
         if (var0) {
            bd();
            bg();
            y();
         }
      }

      jT = true;
      k(74, false);
   }

   private static void cB() {
      String var0 = n(ju, true);
      a(49, 4, var0, false);
   }

   private static void aB(int var0, int var1) {
      if (var0 == 0) {
         bf();
         bc();
         bP();
         gM = o(10);
         b(et, 50, 6, ag[50][6][2], ag[50][6][3]);
         int var2 = et[2] - et[0];
         int var3 = et[3] - et[1];
         gN.k();
         gN.b();
         gN.a(1);
         gN.c(ag[50][4][5]);
         gN.d(ag[50][4][6]);
         int var4 = 0;

         for (int var5 = 0; var5 < gM.length; var5++) {
            if (gM[var5][9] == 0) {
               var4++;
            }
         }

         gN.b(var4);
         gN.g(var2 + 1);
         gN.h(var3 + 1);
         gN.e(ag[50][4][7] + var2);
         gN.f(var3);
         au(51);
         O(51, ag[51].length + 6 * (var4 - 1));

         for (int var19 = 0; var19 < var4; var19++) {
            if (var19 != 0) {
               q(51, 0, var19 * 6);
               q(51, 3, var19 * 6 + 3);
               q(51, 1, var19 * 6 + 1);
               q(51, 2, var19 * 6 + 2);
               q(51, 4, var19 * 6 + 4);
               q(51, 5, var19 * 6 + 5);
               short var27 = ag[51][0][2];
               short var10 = ag[51][0][3];
               c(51, var19 * 6, 2, var27 + gN.i(var19));
               c(51, var19 * 6, 3, var10 + gN.j(var19));
               var27 = ag[51][3][2];
               var10 = ag[51][3][3];
               c(51, var19 * 6 + 3, 2, var27 + gN.i(var19));
               c(51, var19 * 6 + 3, 3, var10 + gN.j(var19));
               var27 = ag[51][1][2];
               var10 = ag[51][1][3];
               c(51, var19 * 6 + 1, 2, var27 + gN.i(var19));
               c(51, var19 * 6 + 1, 3, var10 + gN.j(var19));
               var27 = ag[51][2][2];
               var10 = ag[51][2][3];
               c(51, var19 * 6 + 2, 2, var27 + gN.i(var19));
               c(51, var19 * 6 + 2, 3, var10 + gN.j(var19));
               var27 = ag[51][4][2];
               var10 = ag[51][4][3];
               c(51, var19 * 6 + 4, 2, var27 + gN.i(var19));
               c(51, var19 * 6 + 4, 3, var10 + gN.j(var19));
               var27 = ag[51][5][2];
               var10 = ag[51][5][3];
               c(51, var19 * 6 + 5, 2, var27 + gN.i(var19));
               c(51, var19 * 6 + 5, 3, var10 + gN.j(var19));
            }
         }

         for (int var20 = 0; var20 < var4; var20++) {
            int var7 = gM[var20][3];
            var2 = gM[var20][1];
            int var33 = gM[var20][2];
            byte var6;
            if (bk(var20)) {
               var6 = 0;
               d(51, 4 + var20 * 6, true);
               f(51, 5 + var20 * 6, false);
            } else {
               f(51, 5 + var20 * 6, true);
               int var10001 = 5 + var20 * 6;
               String var9 = n(var20, false);
               a(51, var10001, var9, false);
               var6 = 1;
            }

            d(51, 1 + var20 * 6, true);
            int var38 = 1 + var20 * 6;
            int var35 = var2;
            c(51, var38, 5, var35);
            j(51, 1 + var20 * 6, var33);
            k(51, 0 + var20 * 6, var6);
            k(51, 1 + var20 * 6, var6);
            var38 = 2 + var20 * 6;
            String var36 = j(var7, 9);
            a(51, var38, var36, false);
         }

         gN.a(false);
         gN.b(true);
         gP = et[0];
         gQ = et[1];
         gO[0] = ag[50][4][2];
         gO[1] = ag[50][4][3];
         gO[2] = ag[50][4][5];
         gO[3] = ag[50][4][6];
         gN.k();
         gR = 0;
         m(bf(iV), true);
         bS = true;
         d(50, 8, gN.c() < 0);
         d(50, 9, gN.c() > -(gN.g() - gN.e()));
      }

      if (var0 == 2) {
         int var23 = gN.a();

         for (int var34 = 0; var34 < var23; var34++) {
            int var40 = 5 + var34 * 6;
            String var37 = n(var34, false);
            a(51, var40, var37, false);
         }

         gN.i();
         int var17 = cB;
         int var21 = cC;
         if (b(var17, var21, gO)) {
            if (X(cl)) {
               gN.b(cD, cE);
            }

            if (W(cm)) {
               gN.a(cD, cE);
               if ((var23 = gN.c(cB - gP, cC - gQ)) >= 0) {
                  gR = var23;
                  aC(var23, cm);
                  gN.j();
               }
            }

            if (X(cl | ck) && (var23 = gN.c(cB - gP, cC - gQ)) >= 0) {
               aC(var23, ck);
            }
         }

         d(50, 8, gN.c() < 0);
         d(50, 9, gN.c() > -(gN.g() - gN.e()));
      }

      if (var0 == 4) {
         boolean var18 = false;
         k(gO[0], gO[1], gO[2], gO[3]);
         int var22 = gN.c();
         int var26 = gN.d();
         g(51, var22, var26, 0);
         bQ();
         h(50, 8, 0, 0);
         h(50, 9, 0, 0);
      }

      if (var0 == 1) {
         m(bf(iV), false);
         bg();
         bd();
         bS = false;
      }

      if (var0 == 5) {
         switch (var1) {
            case 5:
               a(61);
               b(25, false, false);
               lq = true;
               ls = 57;
               b(27, true, false);
         }
      }
   }

   private static void aC(int var0, int var1) {
      int var2 = gN.c();
      int var3 = gN.d();
      int var6 = var3;
      var2 = i(51, var2, var6, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm) {
         var1 = var2;
         var0 = gR;
         switch (var1 % 6) {
            case 3:
               a(51);
               aN(var0);
         }
      }
   }

   private static void aD(int var0, int var1) {
      if (var0 == 0) {
         bc();
         bf();
         q.c(z, 4);
      }

      if (var0 == 2 && v(64)) {
         s(3, 2, 0);
      }

      if (var0 == 1) {
         bd();
         bg();
      }

      if (var0 == 5) {
         switch (var1) {
            case 9:
               a(61);
               m(33, false);
               b(33, false, false);
               if (q.an != null && q.an.aV[R] != null && q.an.aV[R].bg.e[16] == 1) {
                  q.an.aV[R].bg.e[16] = 0;
                  b(60, true, false);
                  return;
               }
               break;
            case 22:
               a(60);
               if (gU == 1) {
                  aP(gV);
                  return;
               }

               if (gU == 2) {
                  aQ(gV);
               }

               return;
            case 23:
               a(60);
               if (gU == 0) {
                  aQ(gV);
                  return;
               }

               if (gU == 1) {
                  var0 = gV;
                  gU = 2;
                  int[] var5;
                  byte[] var7 = new byte[a(var5 = z(9, var0), 51)];
                  int var2 = 0;

                  for (int var3 = 4; var3 < var5.length; var3++) {
                     if (var5[var3] == 51) {
                        var7[var2] = (byte)(var3 - 4);
                        var2++;
                     }
                  }

                  byte[] var6 = var7;
                  String var8 = u(325);
                  a(52, 12, var8, false);
                  a(52, 22, true);
                  a(52, 23, false);

                  for (int var9 = 14; var9 < 22; var9++) {
                     d(52, var9, false);
                  }

                  if (var6.length == 0) {
                     f(52, 13, true);
                     return;
                  }

                  f(52, 13, false);

                  for (int var10 = 14; var10 < var6.length + 14; var10++) {
                     d(52, var10, true);
                     j(52, var10, var6[var10 - 14]);
                  }
               }
         }
      }
   }

   private static void aO(int var0) {
      gS = o(2);
      gT = o(9);
      gU = 0;
      b(33, true, false);
      m(33, true);
      aP(var0);
      int var3;
      gV = var3 = var0;
      int var1 = gS[var3][1];
      int var2 = gS[var3][3];
      n(52, 10, var3);
      String var5 = j(var1, 1);
      a(52, 7, var5, false);
      String var6 = j(var2, 10);
      a(52, 8, var6, false);
      var1 = gT[var3][1];
      var2 = gT[var3][2];
      var0 = gT[var3][3];
      if (var1 != 15) {
         c(52, 3, 6, var1);
      } else {
         c(52, 3, 10, 0);
      }

      if (var2 != 15 && var2 != var1) {
         c(52, 4, 6, var2);
      } else {
         c(52, 4, 10, 0);
      }

      if (var0 != 15) {
         c(52, 5, 6, var0);
      } else {
         c(52, 5, 10, 0);
      }
   }

   private static void aP(int var0) {
      gU = 0;
      int[] var4;
      byte[] var1 = new byte[a(var4 = z(9, var0), 50)];
      int var2 = 0;

      for (int var3 = 4; var3 < var4.length; var3++) {
         if (var4[var3] == 50) {
            var1[var2] = (byte)(var3 - 4);
            var2++;
         }
      }

      byte[] var5 = var1;
      String var8 = u(324);
      a(52, 12, var8, false);
      a(52, 22, false);
      a(52, 23, true);

      for (int var6 = 14; var6 < 22; var6++) {
         d(52, var6, false);
      }

      if (var5.length == 0) {
         f(52, 13, true);
      } else {
         f(52, 13, false);

         for (int var7 = 14; var7 < var5.length + 14; var7++) {
            d(52, var7, true);
            j(52, var7, var5[var7 - 14]);
         }
      }
   }

   private static void aQ(int var0) {
      gU = 1;
      int[] var4;
      byte[] var1 = new byte[a(var4 = z(9, var0), 52)];
      int var2 = 0;

      for (int var3 = 4; var3 < var4.length; var3++) {
         if (var4[var3] == 52) {
            var1[var2] = (byte)(var3 - 4);
            var2++;
         }
      }

      byte[] var5 = var1;
      String var8 = u(326);
      a(52, 12, var8, false);
      a(52, 22, true);
      a(52, 23, true);

      for (int var6 = 14; var6 < 22; var6++) {
         d(52, var6, false);
      }

      if (var5.length == 0) {
         f(52, 13, true);
      } else {
         f(52, 13, false);

         for (int var7 = 14; var7 < var5.length + 14; var7++) {
            d(52, var7, true);
            j(52, var7, var5[var7 - 14]);
         }
      }
   }

   private static void aE(int var0, int var1) {
      if (var0 == 0) {
         bS();
         m(bf(iV), true);
         aQ();
         c(65, 7, "" + b(24, cd + 1, 0));
         c(65, 6, "" + b(24, cd + 1, 1));
         q.K();
      }

      if (var0 == 2) {
         int var2 = ab.e[2];
         int var3 = ab.e[1];
         int var4 = ab.e[4];
         int var5 = ab.e[3];
         if (var2 != var3 || var4 != var5) {
            bh(64);
         }
      }

      if (var0 == 1) {
         aR();
      }

      if (var0 == 5) {
         switch (var1) {
            case 6:
               a(60);
               if (a(false, b(24, cd + 1, 1))) {
                  v.a(1, b(24, cd + 1, 2), gX, gY);
                  U(gW);
                  boolean var7 = false;
                  b(55, false, false);
                  return;
               }
               break;
            case 7:
               jq = 4;
               a(60);
               if (a(true, b(24, cd + 1, 0), true, true)) {
                  v.a(1, b(24, cd + 1, 2), gX, gY);
                  U(gW);
                  b(55, false, false);
                  return;
               }
               break;
            case 11:
               a(61);
               boolean var6 = false;
               b(55, false, false);
         }
      }
   }

   public static void a(byte var0, int var1, int var2) {
      if (dN <= 0) {
         gX = var1;
         gY = var2;
         gW = var0;
         b(55, true, false);
      }
   }

   private static void aF(int var0, int var1) {
      if (var0 == 0) {
         x();
         m(13, true);
         be(13);
         if (bs().equals("cc_2d")) {
            String var2 = u(7239);
            a(71, 6, var2, false);
            a(71, 9, false);
            c(71, 8, 2, c.a >> 1);
         }

         String var3 = u(7278);
         a(71, 4, var3, false);
         var3 = u(7279);
         a(71, 6, var3, false);
         q.c(z, 4);
      }

      if (var0 == 1) {
         y();
      }

      if (var0 == 5) {
         switch (var1) {
            case 7:
               a(60);
               a(2, u(7255), 20);
               break;
            case 8:
               a(60);
               cR();
               b(16, true, false);
               return;
            case 9:
               a(60);
               mL.setCurrent(null);
               return;
            case 10:
               a(60);
               bp();
               return;
            case 11:
               a(61);
               cR();
               bk();
               kk = true;
               kl = 5;
               kq = true;
               if (i == 6) {
                  lq = true;
                  ls = 13;
                  b(22, true, false);
                  b(64, true, false);
                  b(76, true, false);
                  P(kn, ko);
                  return;
               }

               aH();
               return;
         }
      }
   }

   private static void aG(int var0, int var1) {
      if (var0 == 0) {
         lq = true;
         ls = 86;
         if (i == 6) {
            boolean var2 = false;
            b(22, false, false);
            b(64, false, false);
            b(76, false, false);
            kn = eT;
            ko = eU;
         }

         gZ = true;
         x();
         m(17, true);
         be(17);
         int var4 = hb;
         au(86);
         hb = (boolean)var4;
         if (!var4) {
            cC();
         } else {
            String var5 = ha;
            String var14 = u(7213);
            int var15 = 0;
            a(86, 4, var14, false);
            m(dh > 0L);
            int var6;
            if ((var6 = m.a(var5)) == 0) {
               for (int var64 = 0; var64 < 16; var64++) {
                  int var42 = var64 + 9;
                  switch (ag[86][var42][0]) {
                     case 1:
                        d(86, var42, false);
                        break;
                     case 2:
                        f(86, var42, false);
                        break;
                     case 6:
                        a(86, var42, false);
                  }
               }
            } else {
               aR(var6 - 1);
               boolean var7 = bs().equals("cc_2d");

               for (int var8 = 0; var8 < var6; var8++) {
                  int var3;
                  String var16;
                  int var35;
                  String var45;
                  String var10 = (var16 = e(var8, var5)) == null
                     ? ""
                     : (
                        (var3 = var16.indexOf(43)) >= 0
                           ? var16.substring(0, var3).trim()
                           : (
                              var16.toLowerCase().startsWith("bs ") && (var35 = (var45 = var16.substring(3).trim()).indexOf(32)) >= 0
                                 ? var16.substring(0, 3) + var45.substring(0, var35)
                                 : var16.trim()
                           )
                     );
                  int var11 = m.b(var8, var5) - 1;
                  int var12 = (int)f(var8, var5);
                  String var36 = var5;
                  var15 = var8;
                  String var10000;
                  if ((var4 = m.j()) == 2 || var4 == 5 || var4 == 4) {
                     var10000 = u(7246);
                  } else if (var4 == 6) {
                     var10000 = g(var15, var36) == 1 ? u(7248) : u(7247);
                  } else if (var4 == 9 || var4 == 13 || var4 == 1) {
                     var10000 = '(' + u(7249) + ')';
                  } else if (var4 == 12) {
                     var10000 = '(' + u(7283) + ')';
                  } else {
                     label298: {
                        String var18;
                        if ((var18 = e(var15, var36)) != null) {
                           if ((var3 = var18.indexOf(43)) >= 0) {
                              var10000 = var18.substring(var3).trim();
                              break label298;
                           }

                           if (var18.toLowerCase().startsWith("bs ") && (var3 = var18.indexOf(32, 3)) >= 0) {
                              var10000 = var18.substring(var3 + 1).trim();
                              break label298;
                           }
                        }

                        var10000 = "";
                     }
                  }

                  String var13 = var10000;
                  String var19 = u(hj[1][var11]);
                  var3 = var12;
                  String var47 = var10;
                  if (var3 <= 0) {
                     var3 = var12;
                  }

                  int var9 = 9 + (var8 << 4);
                  a(86, var9 + 2, var19);
                  int var10001 = var9 + 1;
                  int var107 = he[var11 << 1];
                  c(86, var10001, 5, var107);
                  j(86, var9 + 1, he[(var11 << 1) + 1]);
                  String var20 = "";
                  if (var13 != null && var13 != "") {
                     var20 = "\n" + var13;
                  }

                  String var89 = var10 + var20;
                  if (e == 17 && !g(var89)) {
                     c(86, var9 + 7, 26, 1);
                     c(86, var9 + 6, 26, 1);
                  }

                  a(86, var9 + 7, var10 + var20);
                  a(86, var9 + 6, var10 + var20);
                  a(86, var9 + 10, "" + b((long)var12));
                  d(86, var9 + 5, false);
                  if (var47 != null && !"".equals(var47) && !" ".equals(var47) && !var10.equals(var47)) {
                     a(86, var9 + 9, var47);
                     a(86, var9 + 8, var47);
                     d(86, var9 + 11, true);
                  } else {
                     d(86, var9 + 14, false);
                     f(86, var9 + 9, false);
                     f(86, var9 + 8, false);
                     d(86, var9 + 11, false);
                  }

                  label277: {
                     if (var3 == var12) {
                        d(86, var9 + 15, false);
                        f(86, var9 + 3, false);
                        var15 = var9 + 10;
                        short var22 = ag[86][var15][3];
                        c(86, var9 + 10, 3, var22 - 17);
                     } else {
                        if (e == 17) {
                           c(86, var15 = var9 + 15, 2, ag[86][var15][2] + 20);
                           c(86, var15 = var9 + 15, 3, ag[86][var15][3] - 3);
                        }

                        a(86, var9 + 3, "" + var3);
                        if (var3 < var12) {
                           var10001 = var9 + 13;
                           int var40 = var12;
                           var15 = var3;
                           String var110;
                           if (var40 > 0 && var15 > 0) {
                              int var111 = var40 << 8;
                              int var48 = 0;
                              if (((var48 = (var111 / var15 - 256) * 100 >>> 7) & 1) > 0) {
                                 var48 = (var48 >> 1) + 1;
                              } else {
                                 var48 >>= 1;
                              }

                              String var26 = u(7250);
                              ad[0] = "" + var48;
                              var110 = a(var26, ad, '#');
                           } else {
                              var110 = "";
                           }

                           a(86, var10001, var110);
                           d(86, var9 + 11, true);
                           c(86, var15 = var9 + 1, 3, ag[86][var15][3] + 10);
                           break label277;
                        }
                     }

                     d(86, var9 + 11, false);
                  }

                  if (var10 == null || "".equals(var10) || " ".equals(var10)) {
                     c(86, var9 + 7, u(7215));
                     c(86, var9 + 6, u(7215));
                  }
               }

               if (var7) {
                  a(86, 3, false);
               }

               if (var6 == 1) {
                  int[] var69;
                  b(var69 = new int[4]);
                  int var77 = var69[2] - var69[0];
                  int var82 = var69[3] - var69[1];
                  int var90 = ag[86][9][2];
                  int var95 = ag[86][9][2];
                  var90 += var69[0];
                  var95 += var69[1];
                  int var102 = c.a - var77 >> 1;
                  var15 = var95 + (var82 + 5 << 1) + var82 >> 1;

                  for (int var41 = 0; var41 < 16; var41++) {
                     var4 = var41 + 9;
                     short var52 = ag[86][var4][2];
                     int var56 = var41 + 9;
                     short var57 = ag[86][var56][3];
                     c(86, var41 + 9, 2, var102 + (var52 - var90));
                     c(86, var41 + 9, 3, var15 + (var57 - var95));
                  }
               }

               if (m.j() == 4) {
                  a(86, 8, u(7277));
               }
            }
         }

         q.c(z, 4);
      }

      if (var0 == 3) {
         av(iV);
      }

      if (var0 == 2 && I(86, 5)) {
         if (dh == 0L) {
            m(false);
         } else {
            long var53 = 0L;
            long var60;
            long var70 = (var60 = dh / 1000L) / 60L;
            var60 %= 60L;
            long var83 = var70 / 60L;
            var70 %= 60L;
            long var97 = var83 / 24L;
            var83 %= 24L;
            String var29 = a(var83) + ":" + a(var70) + ":" + a(var60);
            if (var97 > 0L) {
               String var43;
               if (var97 == 1L) {
                  var43 = u(7268);
               } else {
                  var43 = u(7270);
               }

               ad[0] = "" + var97;
               var29 = a(var43, ad, '#') + " " + var29;
            }

            String var44 = u(7269);
            ad[0] = "\\5" + var29;
            a(86, 6, a(var44, ad, '#'));
         }
      }

      if (var0 == 5) {
         switch (var1) {
            case 2:
               a(61);
               cj = 0;
               a(61);
               if (hb) {
                  cR();
                  if (dj == 2) {
                     bm();
                  } else {
                     bk();
                  }

                  if (i == 6) {
                     lq = true;
                     ls = 13;
                     boolean var31 = false;
                     b(22, true, false);
                     b(64, true, false);
                     b(76, true, false);
                     P(kn, ko);
                  } else {
                     aH();
                  }
               } else {
                  cR();
                  bv();
                  if (i == 6) {
                     lq = true;
                     ls = 13;
                     boolean var32 = false;
                     b(22, true, false);
                     b(64, true, false);
                     b(76, true, false);
                     P(kn, ko);
                  } else {
                     aH();
                  }
               }
               break;
            case 3:
               a(60);
               boolean var30 = false;
               b(1, true, false);
         }

         for (int var33 = 0; var33 < 6; var33++) {
            if (9 + (var33 << 4) + 4 == var1) {
               if (hb) {
                  boolean var54 = false;
                  String var62 = ha;
                  int var58 = var33;
                  da = var33;
                  db = var62;
                  int var65 = m.j();
                  boolean var72 = false;
                  String var78 = null;
                  byte var85 = 0;
                  boolean var92 = false;
                  String var98 = u(7252);
                  if (var65 == 2 || var65 == 5) {
                     var92 = true;
                     var85 = 1;
                     var78 = u(7240);
                     var72 = true;
                  } else if (var65 == 3) {
                     var78 = u(7243);
                     if (e == 7) {
                        var78 = var78 + "\n";
                     }

                     fv = true;
                     var98 = u(7256);
                     var72 = true;
                  } else if (var65 == 4) {
                     var85 = 1;
                     var78 = u(7242);
                     var98 = u(7251);
                     fw = true;
                     var72 = true;
                  } else if (var65 == 6) {
                     int var104;
                     var85 = (byte)((var104 = g(var58, var62)) == 1 ? 2 : 1);
                     var78 = u(7244);
                     if (var104 != 1) {
                        var78 = a(var78, "de #", "d' #");
                     }

                     var72 = true;
                     var98 = u(7256);
                  } else if (var65 == 8 || var65 == 7) {
                     var85 = 0;
                     var78 = u(7253) + " #";
                     var72 = true;
                     var98 = u(7256);
                  } else if (var65 == 9 || var65 == 13) {
                     var98 = u(7256);
                     var78 = u(7253) + " # (" + u(7254) + ")";
                     if (var65 == 13) {
                        var78 = u(7280) + " # (" + u(7254) + ")";
                        fz = true;
                     }

                     var72 = true;
                  } else if (var65 == 12) {
                     var78 = u(7253) + " # (" + u(7283) + ")";
                     var72 = true;
                     var98 = u(7256);
                  } else if (var65 == 11) {
                     var98 = "";
                     var78 = u(7274);
                     int var103 = (int)f(var58, var62);
                     String var34 = e(var58, var62);
                     ad[0] = Integer.toString(var103) + " gems";
                     ad[1] = var34;
                     var78 = a(var78, ad, '#');
                     fy = true;
                     var72 = true;
                  } else if (var65 == 10) {
                     var98 = "";
                     var78 = u(7271);
                     fx = true;
                     var72 = true;
                  }

                  if (var72) {
                     df = false;
                     String var105 = e(var58, var62);
                     ad[0] = var105;
                     ad[1] = "" + var85;
                     var78 = a(var78, ad, '#');
                     if (var92) {
                        a(7, var78, var98);
                     } else {
                        a(2, var78, var98);
                     }
                  } else {
                     bo();
                  }
               } else {
                  a(63);
                  int var55 = var33;
                  int var59;
                  int var63 = (var59 = e(ha)) + 1 & 1;
                  int var86 = var59;
                  int var93 = v(var55, var59);
                  int var99 = var86 + 1 & 1;
                  if (var93 <= ag(var99)) {
                     var86 = var59;
                     int var81 = var55;
                     var93 = v(var55, var86);
                     var99 = w(var81, var86);
                     y(var86 + 1 & 1, -var93);
                     y(var86, var99);
                     int var66 = w(var55, var59);
                     String var108 = u(7169);
                     String var106 = a((long)var66, e, " ");
                     var99 = var59;
                     String var88 = var108;
                     a(8, var88, -1, var99, var106);
                  } else if (bj() && var63 == 1) {
                     int var68 = x(var55, var59);
                     String var75 = u(7177);
                     ad[0] = "" + var68;
                     var75 = a(var75, ad, '#');
                     a(2, var75, 16);
                  } else {
                     int var67 = x(var55, var59);
                     String var73 = u(7176);
                     if (var63 == 1) {
                        var73 = u(7177);
                     }

                     ad[0] = "" + var67;
                     var73 = a(var73, ad, '#');
                     d(3, var73);
                  }
               }
               break;
            }
         }
      }

      if (var0 == 1) {
         gZ = false;
         y();
      }
   }

   private static void cC() {
      aR(5);
      int var0 = e(ha);
      String var6 = u(hd[var0]);
      int var5 = 0;
      var5 = (boolean)0;
      a(86, 4, var6, false);
      int var10003 = mJ / 2;
      a var1 = ax(ag[86][4][7]);
      String var2 = en[86][4];
      var1.a(var2, null);
      c(86, 4, 2, var10003 - a.i / 2);
      c(86, 4, 9, 0);
      int[] var7 = hg[var0];
      int var8 = hc[var0 + 1 & 1];

      for (int var3 = 0; var3 < 6; var3++) {
         int var4 = 9 + (var3 << 4);
         d(86, var4 + 14, false);
         var5 = var4 + 7;
         int var12 = ag[86][var5][3];
         c(86, var4 + 7, 3, var12 - 17);
         c(86, var4 + 6, 3, var12 - 17);
         f(86, var4 + 9, false);
         f(86, var4 + 8, false);
         d(86, var4 + 15, false);
         var12 = var4 + 10;
         int var14 = ag[86][var12][3];
         c(86, var4 + 10, 3, var14 - 17);
         f(86, var4 + 3, false);
         f(86, var4 + 12, false);
         d(86, var4 + 11, false);
         int var10001 = var4 + 2;
         var6 = u(hj[var0][var3]);
         a(86, var10001, var6, false);
         var10001 = var4 + 1;
         int var19 = var7[var3 << 1];
         c(86, var10001, 5, var19);
         j(86, var4 + 1, var7[(var3 << 1) + 1]);
         var14 = v(var3, var0);
         a(86, var4 + 7, "" + b((long)var14));
         a(86, var4 + 6, "" + b((long)var14));
         var14 = w(var3, var0);
         a(86, var4 + 10, "" + b((long)var14));
         j(86, var4 + 5, var8);
         d(86, var4 + 5, true);
         var10001 = var4 + 5;
         var14 = var4 + 4;
         c(86, var10001, 2, ag[86][var14][2] - 5);
         var10001 = var4 + 5;
         var4 += 4;
         c(86, var10001, 3, ag[86][var4][3] + 15);
      }

      a(86, 3, false);
      m(false);
   }

   private static void aR(int var0) {
      O(86, 9 + (++var0 << 4));
      int[] var1;
      b(var1 = new int[4]);
      int var2 = var1[2] - var1[0];
      int var9 = var1[3] - var1[1];

      for (int var3 = 1; var3 < var0; var3++) {
         for (int var4 = 0; var4 < 16; var4++) {
            int var5 = 9 + (var3 << 4) + var4;
            q(86, var4 + 9, var5);
            int var6 = var4 + 9;
            short var10 = ag[86][var6][2];
            int var7 = var4 + 9;
            short var11 = ag[86][var7][3];
            c(86, var5, 2, var10 + (var3 & 1) * (var2 + 10));
            c(86, var5, 3, var11 + (var3 >> 1) * (var9 + 5));
         }
      }
   }

   private static void m(boolean var0) {
      d(86, 5, var0);
      f(86, 6, var0);
      d(86, 7, var0);
   }

   private static void a(boolean var0, String var1) {
      hb = var0;
      ha = var1;
      b(17, true, false);
   }

   private static void aS(int var0) {
      if (var0 == 0) {
         x();
         m(15, true);
         be(15);
         hl = 250;
         o(60, 4, hl);
         if (hk) {
            m(60, 6, 7168);
         }
      }

      if (var0 == 1) {
         y();
      }

      if (var0 == 3) {
         H(60, aq);
      }

      if (var0 == 2 && dk >= 0) {
         if (dk == 2) {
            dk = -1;
            String var2 = db;
            int var1 = da;
            String var4 = var2;
            var0 = da;
            if (System.currentTimeMillis() - oa > 3000L) {
               oa = System.currentTimeMillis();
               m.a(m.b(var0, var4), var4, 0L);
            }

            de = false;
            return;
         }

         dk++;
      }
   }

   private static void n(boolean var0) {
      hk = var0;
      b(15, true, false);
   }

   private static void aH(int var0, int var1) {
      if (var0 == 0) {
         x();
         m(bf(iV), true);
         be(bf(iV));
         String var10001;
         switch (hm) {
            case -10:
               var10001 = u(7265);
               break;
            case -9:
               var10001 = u(7264);
               break;
            case -8:
               var10001 = "";
               break;
            case -7:
               var10001 = u(7263);
               break;
            case -6:
               var10001 = u(7262);
               break;
            case -5:
               var10001 = u(7261);
               break;
            case -4:
               var10001 = u(7260);
               break;
            case -3:
               var10001 = "";
               break;
            case -2:
               var10001 = u(7259);
               break;
            case -1:
               var10001 = u(7258);
               break;
            default:
               var10001 = u(7172);
         }

         String var2 = var10001;
         a(56, 4, var2, false);
      }

      if (var0 == 1) {
         y();
      }

      if (var0 == 5) {
         switch (var1) {
            case 3:
               a(60);
               cR();
               if (hn) {
                  if (dj == 2) {
                     bm();
                     return;
                  }

                  bk();
                  return;
               }

               de = false;
         }
      }
   }

   private static void aI(int var0, int var1) {
      if (var0 == 0) {
         x();
         m(1, true);
         be(1);
         df = false;
         String var2 = d("Coin");
         if ("".equals(var2)) {
            var2 = d("Cash");
         }

         if (e == 2) {
            int var3 = (var2 = var2).length();

            for (int var4 = 0; var4 < var3; var4++) {
               switch (var2.charAt(var4)) {
                  case 'À':
                  case 'Â':
                     var2 = var2.substring(0, var4) + 'A' + var2.substring(var4 + 1, var3);
                  case 'Á':
                  case 'Ã':
                  case 'Ä':
                  case 'Å':
                  case 'Æ':
                  case 'Ì':
                  case 'Í':
                  case 'Ð':
                  case 'Ñ':
                  case 'Ò':
                  case 'Ó':
                  case 'Õ':
                  case 'Ö':
                  case '×':
                  case 'Ø':
                  case 'Ú':
                  default:
                     break;
                  case 'Ç':
                     var2 = var2.substring(0, var4) + 'C' + var2.substring(var4 + 1, var3);
                     break;
                  case 'È':
                  case 'É':
                  case 'Ê':
                  case 'Ë':
                     var2 = var2.substring(0, var4) + 'E' + var2.substring(var4 + 1, var3);
                     break;
                  case 'Î':
                  case 'Ï':
                     var2 = var2.substring(0, var4) + 'I' + var2.substring(var4 + 1, var3);
                     break;
                  case 'Ô':
                     var2 = var2.substring(0, var4) + 'O' + var2.substring(var4 + 1, var3);
                     break;
                  case 'Ù':
                  case 'Û':
                     var2 = var2.substring(0, var4) + 'U' + var2.substring(var4 + 1, var3);
               }
            }
         }

         String var5;
         var2 = (var5 = var2) == null ? null : var5.replace('“', '"').replace('”', '"');
         var2 = var2 + "\n";
         bO();
         a(62, 5, var2);
      }

      if (var0 == 5) {
         switch (var1) {
            case 6:
               a(61);
               df = true;
               cR();
         }
      }

      if (var0 == 1) {
         y();
      }
   }

   private static void aJ(int var0, int var1) {
      if (var0 == 0) {
         m(16, true);
         be(16);
         ho = 0;
         hq = true;
         x();
         q.c(z, 4);
      }

      if (var0 == 2 && hq) {
         hq = false;

         for (int var2 = 0; var2 < hp.length; var2++) {
            String var3 = "-";
            int var4 = var2 + 29;
            if (var2 < ho) {
               var3 = "" + hp[var2];
            }

            a(53, var4, var3);
         }
      }

      if (var0 == 5) {
         switch (var1) {
            case 10:
               a(61);
               cR();
               boolean var6 = false;
               b(13, true, false);
               break;
            case 11:
               a(60);
               int var8 = 0;
               if (ho < hp.length) {
                  d(3, u(7229));
               } else {
                  for (int var9 = 0; var9 < ho; var9++) {
                     var8 = var8 * 10 + hp[var9];
                  }

                  var1 = var8;
                  if (m.a(var1)) {
                     de = false;
                  } else {
                     d(3, u(7231));
                  }
               }
               break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
               a(60);
               int var7 = var1 - 12;
               if (ho < hp.length) {
                  hq = true;
                  hp[ho] = var7;
                  ho++;
               }
               break;
            case 22:
               a(61);
               if (ho > 0) {
                  hq = true;
                  ho = 0;
               }
               break;
            case 23:
               a(61);
               if (ho > 0) {
                  hq = true;
                  ho--;
               }
         }
      }

      if (var0 == 1) {
         y();
      }
   }

   private static void aK(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         String var2 = "C H E A T S";
         a(12, 3, var2, false);
         var2 = nf;
         if (nf != null) {
            c(12, 4, "Add money +" + var2);
         } else {
            c(12, 4, "Add money +100000");
         }

         c(12, 5, "Add gems +100000");
         c(12, 6, "Add goods +100000");
         c(12, 7, "Unhide dragons shop");
         c(12, 8, "Viking");
         c(12, 9, "Phy debug");
         c(12, 11, "GetExp (1/4 lvl)");
         c(12, 12, "Skip tuto");
         c(12, 13, "Complete Quests");
         c(12, 14, "Max Exp");
         c(12, 15, "Reset timers");
         c(12, 16, "Skip 1 Hour");
         c(12, 17, "Update Render Dragons");
         c(12, 18, "Render Buildings");
         c(12, 19, "Render Terrain");
         c(12, 20, "Render GUI");
         c(12, 21, "CloudSave");
      }

      if (var0 == 2) {
         if (P) {
            c(12, 10, "Fast time is ON");
         } else {
            c(12, 10, "Fast time is OFF");
         }

         av(iV);
      }

      if (var0 == 5) {
         switch (var1) {
            case 4:
               g(100000);
               return;
            case 5:
               h(100000);
               return;
            case 6:
               i(100000);
               return;
            case 7:
               dL();
               ab.e[19] = 50;
               return;
            case 8:
               bL = 0;
               bM = 100;
               aP();
               return;
            case 9:
               N = !N;
               return;
            case 10:
               P = !P;
               return;
            case 11:
               v.a(1, bH / 4, m + (mJ >> 1), n + (mK >> 1));
               return;
            case 12:
               dT[0][0][1] = 1;
               bF();
               return;
            case 13:
               b(73, false, true);
               b(63, false, true);

               for (int var4 = 0; var4 < dM; var4++) {
                  if (dK[var4] <= 100) {
                     as(dK[var4]);
                     return;
                  }
               }

               return;
            case 14:
               ab.e[9] = ab.e[8];
               ab.e[8] = bH - 1;
               az(bH);
               return;
            case 15:
            case 21:
            default:
               break;
            case 16:
               g += 3600000L;
               return;
            case 17:
               O = !O;
               return;
            case 18:
               cL = !cL;
               return;
            case 19:
               cM = !cM;
               return;
            case 20:
               cN = !cN;
               break;
            case 22:
               b(29, false, false);
               return;
         }
      }
   }

   private static void aL(int var0, int var1) {
      if (var0 == 0) {
         m(bf(iV), true);
         String var2 = "";
         String var3 = u(294);
         ad[0] = var2;
         var3 = a(var3, ad, '#');
         String var4 = var3;
         a(64, 1, var4, false);
         aQ();
      }

      if (var0 == 2) {
         int var12;
         if ((var12 = l(hD)) > 0) {
            c(64, 4, false);
            c(64, 4, ao(var12));
         } else {
            c(64, 4, true);
         }

         if (j(hD) > 0) {
            c(64, 2, false);
            c(64, 2, ao(j(hD)));
         } else {
            c(64, 2, true);
            c(64, 2, u(175));
         }
      }

      if (var0 == 1) {
         aR();
      }

      if (var0 == 5) {
         switch (var1) {
            case 2:
               a(60);
               if (g(false) == 0) {
                  d(3, u(6170));
               } else {
                  b(50, false, false);
                  bq(1);
               }
               break;
            case 3:
               a(60);
               b(50, false, false);
               if (hD.equals("facebook:0")) {
                  dz();
               } else {
                  x();
                  if (r) {
                     q.x();
                  }

                  l(42, 0);
                  d(false);
                  r = false;
                  z = 11;
                  q.e(11);
                  by = 2;
                  M(3);
                  bz = 11;
                  M = true;
               }
               break;
            case 4:
               a(60);
               b(50, false, false);
               String var10;
               String var13 = (var10 = hD).substring(hD.indexOf(58) + 1);
               long var14 = -1L;

               try {
                  var14 = Long.parseLong(var13);
               } catch (NumberFormatException var8) {
               }

               long var6 = var14;

               for (int var9 = 0; var9 < mi.length; var9++) {
                  if (mi[var9][0] == var6) {
                     mi[var9][3] = 86400000L;
                     break;
                  }
               }

               aB();
               if (!hD.equals("facebook:0")) {
                  dC();
               }
               break;
            case 5:
               a(61);
               b(50, false, false);
         }
      }

      if (var0 == 3) {
         H(iV, aq);
      }
   }

   private static void aM(int var0, int var1) {
      if (var0 == 0) {
         ht = 0;
         m(bf(iV), true);
         aT(0);
         hy = ag[67][12][2];
         hz = ag[67][12][3];
         hA = ag[67][6][2];
         hB = ag[67][6][5];
         aQ();
      }

      if (var0 == 1) {
         aR();
      }

      if (var0 == 5) {
         label78:
         switch (var1) {
            case 7:
               a(61);
               if (ht == 0) {
                  b(23, false, false);
                  lq = true;
                  ls = 57;
                  b(27, true, false);
                  cM();
               } else {
                  aT(--ht);
               }
               break;
            case 8:
               a(60);
               hv--;
               hx--;
               aT(2);
               break;
            case 9:
               a(60);
               hv++;
               hx++;
               aT(2);
               break;
            case 10:
               a(61);
               a(6, u(44), 36);
               lq = true;
               ls = 57;
               b(27, true, false);
            case 11:
            case 12:
            case 13:
            case 14:
            default:
               break;
            case 15:
            case 16:
            case 17:
               a(60);
               hu = var1 - 15;
               aT(++ht);
               break;
            case 18:
               switch (hu) {
                  case 0:
                     hv = 0;
                     break label78;
                  case 1:
                     hv = 22;
                     break label78;
                  case 2:
                     hv = 29;
                     hw = 2;
                  default:
                     break label78;
               }
            case 19:
               switch (hu) {
                  case 0:
                     hv = 1;
                     hw = 6;
                     break label78;
                  case 1:
                     hv = 23;
                     break label78;
                  case 2:
                     hv = 31;
                  default:
                     break label78;
               }
            case 20:
               switch (hu) {
                  case 0:
                     hv = 7;
                     break label78;
                  case 1:
                     hv = 24;
                     break label78;
                  case 2:
                     hv = 32;
                  default:
                     break label78;
               }
            case 21:
               switch (hu) {
                  case 0:
                     hv = 8;
                     break label78;
                  case 1:
                     hv = 25;
                     break label78;
                  case 2:
                     hv = 33;
                  default:
                     break label78;
               }
            case 22:
               switch (hu) {
                  case 0:
                     hv = 9;
                     hw = 8;
                     break label78;
                  case 1:
                     hv = 26;
                  default:
                     break label78;
               }
            case 23:
               switch (hu) {
                  case 0:
                     hv = 17;
                     hw = 3;
                     break label78;
                  case 1:
                     hv = 27;
                  default:
                     break label78;
               }
            case 24:
               switch (hu) {
                  case 0:
                     hv = 20;
                     break label78;
                  case 1:
                     hv = 28;
                  default:
                     break label78;
               }
            case 25:
               hv = 21;
         }

         if (var1 >= 18 && 25 >= var1) {
            a(60);
            if (hs == null) {
               hs = new int[34][6];

               for (int var2 = 0; var2 < 34; var2++) {
                  hs[var2] = new int[6];
                  hs[var2][3] = -1;
                  hs[var2][2] = -1;
                  hs[var2][2] = -1;
                  hs[var2][1] = 1;
                  hs[21][4] = 0;
                  hs[21][5] = 0;
               }

               hs[0][0] = 11280;
               hs[1][0] = 11292;
               hs[2][0] = 11294;
               hs[3][0] = 11296;
               hs[4][0] = 11298;
               hs[5][0] = 11300;
               hs[6][0] = 11302;
               hs[7][0] = 11282;
               hs[7][1] = 3;
               hs[7][2] = 11;
               hs[7][3] = 0;
               hs[7][4] = 30;
               hs[8][0] = 11304;
               hs[9][0] = 11264;
               hs[10][0] = 11266;
               hs[10][2] = 13;
               hs[10][3] = 0;
               hs[11][0] = 11268;
               hs[11][2] = 49;
               hs[11][3] = 0;
               hs[12][0] = 11270;
               hs[12][2] = 14;
               hs[12][3] = 0;
               hs[13][0] = 11272;
               hs[13][2] = 12;
               hs[13][3] = 0;
               hs[14][0] = 11274;
               hs[14][2] = 16;
               hs[14][3] = 0;
               hs[15][0] = 11276;
               hs[15][2] = 48;
               hs[15][3] = 0;
               hs[16][0] = 11278;
               hs[17][0] = 11286;
               hs[17][2] = 0;
               hs[17][3] = 0;
               hs[18][0] = 11288;
               hs[18][2] = 24;
               hs[18][3] = 30;
               hs[18][4] = 20;
               hs[18][5] = -13;
               hs[19][0] = 11290;
               hs[20][0] = 11284;
               hs[20][1] = 3;
               hs[20][2] = 22;
               hs[20][4] = -60;
               hs[20][3] = 0;
               hs[21][0] = 11306;
               hs[21][2] = 17;
               hs[21][3] = 2;
               hs[21][5] = 120;
               hs[21][4] = -25;
               hs[24][0] = 11312;
               hs[27][0] = 11316;
               hs[27][2] = 53;
               hs[27][3] = 1;
               hs[27][5] = 130;
               hs[27][4] = 20;
               hs[28][0] = 11314;
               hs[29][0] = 11322;
               hs[29][2] = 23;
               hs[29][3] = 34;
               hs[29][5] = -40;
               hs[29][4] = -25;
               hs[30][0] = 11324;
               hs[30][2] = 23;
               hs[30][3] = 34;
               hs[30][5] = -40;
               hs[30][4] = -25;
               hs[31][0] = 11326;
               hs[31][2] = 21;
               hs[31][3] = 15;
               hs[31][5] = -25;
               hs[31][4] = -10;
               hs[32][0] = 11328;
               hs[32][2] = 43;
               hs[32][3] = 1;
               hs[32][1] = 3;
               hs[32][5] = -20;
               hs[33][0] = 11330;
               hs[33][2] = 21;
               hs[33][3] = 12;
               hs[33][4] = 7;
               hs[33][5] = -30;
            }

            aT(2);
         }
      }

      if (var0 == 3) {
         H(iV, aq);
      }
   }

   private static void aT(int var0) {
      switch (var0) {
         case 0:
            ht = 0;
            d(67, 12, false);
            d(67, 13, false);
            g(67, 11, false);
            f(67, 6, false);
            o(true);
            p(false);
            m(67, 4, 163);
            break;
         case 1:
            hw = 0;
            hx = 0;
            ht = 1;
            f(67, 6, false);
            d(67, 12, false);
            d(67, 13, false);
            g(67, 11, false);
            o(false);
            p(true);
            m(67, 4, 11332 + hu);
            break;
         case 2:
            d(67, 12, false);
            d(67, 13, false);
            g(67, 11, false);
            ht = 2;
            var0 = hs[hv][0];
            int var1 = hs[hv][2];
            int var2 = hs[hv][3];
            c(67, 6, 9, 1);
            if (var1 != -1) {
               int var3 = 100;
               if (hv == 17) {
                  g(67, 11, true);
               } else {
                  int var4;
                  q(var4 = hs[hv][1], var1);
                  var3 = j[var4][var1].b(var2);
                  var4 = var4 == 1 ? 12 : 13;
                  int var5 = var1;
                  c(67, var4, 5, var5);
                  c(67, var4, 2, hy + hs[hv][4]);
                  c(67, var4, 3, hz + hs[hv][5]);
                  j(67, var4, var2);
                  d(67, var4, true);
               }

               c(67, 6, 2, hA + var3 / 2 + 50);
               c(67, 6, 5, hB - var3 / 2 - 50);
            } else {
               short var11 = ag[67][14][5];
               c(67, 6, 2, hA - var11);
               c(67, 6, 5, hB + var11);
            }

            f(67, 6, true);
            o(false);
            p(false);
            m(67, 4, var0);
            m(67, 6, var0 + 1);
      }

      if (ht != 2) {
         a(67, 8, false);
         a(67, 9, false);
         f(67, 5, false);
      } else {
         if (hx == 0) {
            a(67, 8, false);
            a(67, 9, hw != 0);
         } else if (hx == hw - 1) {
            a(67, 8, true);
            a(67, 9, false);
         } else {
            a(67, 8, true);
            a(67, 9, true);
         }

         f(67, 5, hw != 0);
         String var7 = u(137);
         String var10 = "" + (hx + 1);
         ad[0] = var10;
         String var8 = a(var7, ad, '%');
         ad[0] = "" + hw;
         String var9 = a(var8, ad, '#');
         a(67, 5, var9);
      }
   }

   private static void o(boolean var0) {
      a(67, 15, var0);
      a(67, 16, var0);
      a(67, 17, var0);
   }

   private static void p(boolean var0) {
      byte var1 = 0;
      short var2 = 11335;
      switch (hu) {
         case 0:
            var1 = 8;
            cD();
            break;
         case 1:
            var1 = 7;
            var2 = 11343;
            c(67, 20, 2, 241);
            c(67, 20, 3, 145);
            c(67, 23, 2, 564);
            c(67, 23, 3, 145);
            c(67, 24, 2, 398);
            c(67, 24, 3, 225);
            break;
         case 2:
            var1 = 4;
            var2 = 11350;
            cD();
      }

      for (int var3 = 0; var3 < var1; var3++) {
         if (hu != 1 || var3 != 0 && var3 != 1 && var3 != 3 && var3 != 4) {
            a(67, var3 + 18, var0);
            if (var0) {
               l(67, var3 + 18, var2 + var3);
            }
         }
      }
   }

   private static void cD() {
      for (int var0 = 0; var0 < 8; var0++) {
         F(var0 + 18, 2);
         F(var0 + 18, 3);
      }
   }

   private static void aN(int var0, int var1) {
      if (var0 == 0) {
         m(bf(iV), true);
         if (aX) {
            d.k();
         }

         a(1);
         hC = 0;
         bO();
         cE();
         aQ();
         String var2 = dH;
         a(68, 8, var2, false);
      }

      if (var0 == 2) {
         if (mI) {
            ki++;
         }

         if (!P(1)) {
            a(1);
         }
      }

      if (var0 == 1) {
         al();
         aR();
      }

      if (var0 == 5) {
         switch (var1) {
            case 6:
               a(61);
               b(24, false, false);
               lq = true;
               ls = 57;
               if (!kj) {
                  s(false);
               } else {
                  r(false);
               }
               break;
            case 7:
               a(60);
               hC--;
               cE();
            case 8:
            default:
               break;
            case 9:
               a(60);
               hC++;
               cE();
         }
      }

      if (var0 == 3) {
         H(iV, aq);
      }
   }

   private static void cE() {
      if (hC == 0) {
         a(68, 7, false);
         a(68, 9, true);
      } else if (hC == dG - 1) {
         a(68, 7, true);
         a(68, 9, false);
      } else {
         a(68, 7, true);
         a(68, 9, true);
      }

      String var0 = u(137);
      String var1 = "" + (hC + 1);
      ad[0] = var1;
      var0 = a(var0, ad, '%');
      ad[0] = "" + dG;
      var0 = a(var0, ad, '#');
      a(68, 5, var0);
      var0 = u(12288);
      var1 = u(12289);
      var0 = var0 + "\n\n";
      var0 = var0 + var1;
      a(68, 8, var0);
   }

   private static void aO(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         be(bf(iV));
         b(64, true, false);
         x();
         q.q();
         boolean var2 = false;

         for (int var3 = 0; var3 < 5; var3++) {
            if (Y(var3)) {
               c(77, var3 + 12, 18, 21);
               c(77, var3 + 12, 19, 7);
               c(77, var3 + 12, 7, 5);
               c(77, var3 + 12, 17, 7);
            } else {
               int var4 = var3;
               if (cI[var4] >= 20) {
                  b(77, var3 + 12, true);
                  c(77, var3 + 12, 13, 2);
                  c(77, var3 + 12, 17, 5);
               } else {
                  c(77, var3 + 12, 17, 3);
                  if (!var2) {
                     c(77, var3 + 12, 17, 6);
                     cJ = var3;
                     h(var3, false);
                     var2 = true;
                  }
               }
            }
         }

         lq = true;
         ls = 77;
         if (!var2) {
            cJ = 4;
            h(4, false);
         }

         a(2, 0, false);
         a(77, 20, aW());
         a(77, 20, F());
      }

      if (var0 == 1) {
         aR();
         y();
      }

      if (var0 == 2) {
         H(iV, aq);
         if (!I) {
            aQ();
         }
      }

      if (var0 == 5) {
         switch (var1) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
               h(var1 - 12, true);
               return;
            case 17:
               a(60);
               if (g(false) == 0 && !dE()) {
                  d(3, u(6170));
               } else {
                  bq(2);
                  b(67, false, false);
               }

               lq = true;
               ls = 84;
               return;
            case 18:
               a(61);
               b(67, false, false);
               aH();
               a(2, 0, aW());
               a(2, 0, F());
               return;
            case 19:
            default:
               break;
            case 20:
               s(true);
         }
      }
   }

   private static void h(int var0, boolean var1) {
      if (!Y(var0)) {
         if (var1) {
            a(60);
         }

         b(77, 12 + cJ, false);
         b(77, var0 + 12, true);
         c(77, 12 + cJ, 17, 3);
         c(77, var0 + 12, 17, 6);
         String var2 = u(var0 + 13317);
         var1 = (boolean)0;
         a(77, 19, var2, false);
         var2 = an(Z(var0));
         a(77, 9, var2, false);
         if ((var1 = aa(var0)) > 0) {
            var2 = an(var1);
            a(77, 10, var2, false);
         } else {
            f(77, 10, false);
            d(77, 8, false);
         }

         a(77, 6, "" + ((int[][])T[25])[cI[var0]][var0] + "/" + (var0 + 1) * 20);
         cJ = var0;
         bO();
      } else {
         if (Y(var0)) {
            a(62);
            d(3, u(13368));
         }
      }
   }

   private static void aP(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         if (lR != null) {
            cF();
         } else {
            String var2 = u(254);
            ad[0] = "0";
            a(var2, ad, '#');
            f(80, 5, false);
         }
      }

      if (var0 == 2) {
         H(81, aq);
         if (lR != null) {
            int var3 = 0;

            for (int var4 = 0; var4 < lR.length; var4++) {
               if (lR[var4][1].equals("msg")) {
                  if (!lR[var4][6].equals("facebook:ned")) {
                     if ((var3 = l(lR[var4][6])) > 0) {
                        c(81, 1 + var4 * 7, false);
                        c(81, 1 + var4 * 7, ao(var3));
                     } else {
                        c(81, 1 + var4 * 7, true);
                     }
                  } else {
                     a(81, 1 + var4 * 7, false);
                  }
               }
            }

            hF.i();
            int var5 = cB;
            var3 = cC;
            label70:
            if (b(var5, var3, hG)) {
               if (X(cl)) {
                  hF.b(cD, cE);
               }

               if (W(cm)) {
                  hF.a(cD, cE);
                  var5 = hF.c(cB - hH, cC - hI);
                  if (u.b >= 0 && u.b != var5) {
                     break label70;
                  }

                  if (var5 >= 0) {
                     hJ = var5;
                     aQ(var5, cm);
                     hF.j();
                  }
               }

               if (X(cl | ck)) {
                  var5 = hF.c(cB - hH, cC - hI);
                  if ((u.b < 0 || u.b == var5) && var5 >= 0) {
                     aQ(var5, ck);
                  }
               }
            }

            if (u.c) {
               aR = 0;
            }
         }
      }

      if (var0 == 4 && lR != null) {
         k(hG[0], hG[1], hG[2], hG[3]);
         int var11 = hF.c();
         int var8 = hF.d();
         g(81, var11, var8, 0);
         bQ();
      }

      if (var0 == 5) {
         switch (var1) {
            case 1:
               a(61);
               boolean var12 = false;
               b(48, false, false);
         }
      }
   }

   private static void aU(int var0) {
      String var1 = null;

      for (int var2 = 0; var2 < lR.length; var2++) {
         if (lR[var2][1].equals("gift")) {
            if (!lR[var2][3].equals("cash") && lR[var2][3].equals("gems")) {
            }
         } else if (lR[var2][3].equals("pvp")) {
            var1 = u(189);
            ad[0] = "" + lR[var2][2];
            lR[var2][5] = a(var1, ad, '%');
         } else if (lR[var2][3].equals("gems")) {
            var1 = u(342);
            ad[0] = "" + lR[var2][2];
            lR[var2][5] = a(var1, ad, '#');
         }
      }

      au(81);
      boolean var6 = false;
      O(81, ag[81].length + 7 * (var0 - 1));
      var1 = null;

      for (int var3 = 0; var3 < var0; var3++) {
         if (var3 != 0) {
            q(81, 0, var3 * 7);
            q(81, 4, var3 * 7 + 4);
            q(81, 1, var3 * 7 + 1);
            q(81, 2, var3 * 7 + 2);
            q(81, 3, var3 * 7 + 3);
            q(81, 5, var3 * 7 + 5);
            q(81, 6, var3 * 7 + 6);
            short var8 = ag[81][0][2];
            short var27 = ag[81][0][3];
            c(81, var3 * 7, 2, var8 + hF.i(var3));
            c(81, var3 * 7, 3, var27 + hF.j(var3));
            short var9 = ag[81][4][2];
            var27 = ag[81][4][3];
            c(81, var3 * 7 + 4, 2, var9 + hF.i(var3));
            c(81, var3 * 7 + 4, 3, var27 + hF.j(var3));
            short var10 = ag[81][1][2];
            var27 = ag[81][1][3];
            c(81, var3 * 7 + 1, 2, var10 + hF.i(var3));
            c(81, var3 * 7 + 1, 3, var27 + hF.j(var3));
            short var11 = ag[81][2][2];
            var27 = ag[81][2][3];
            c(81, var3 * 7 + 2, 2, var11 + hF.i(var3));
            c(81, var3 * 7 + 2, 3, var27 + hF.j(var3));
            short var12 = ag[81][3][2];
            var27 = ag[81][3][3];
            c(81, var3 * 7 + 3, 2, var12 + hF.i(var3));
            c(81, var3 * 7 + 3, 3, var27 + hF.j(var3));
            short var13 = ag[81][5][2];
            var27 = ag[81][5][3];
            c(81, var3 * 7 + 5, 2, var13 + hF.i(var3));
            c(81, var3 * 7 + 5, 3, var27 + hF.j(var3));
            short var14 = ag[81][6][2];
            var27 = ag[81][6][3];
            c(81, var3 * 7 + 6, 2, var14 + hF.i(var3));
            c(81, var3 * 7 + 6, 3, var27 + hF.j(var3));
         }

         if (lR[var3][1].equals("msg")) {
            if (!lR[var3][6].equals("facebook:ned")) {
               var1 = u(179);
               ad[0] = lR[var3][5];
               var1 = a(var1, ad, '#');
               a(81, var3 * 7 + 6, var1);
               var1 = u(178);
               ad[0] = lR[var3][2];
               var1 = a(var1, ad, '#');
               a(81, var3 * 7 + 5, var1);
            } else {
               String var34 = u(284);
               ad[0] = u(3102);
               var34 = a(var34, ad, '#');
               var1 = u(179);
               ad[0] = var34;
               var1 = a(var1, ad, '#');
               a(81, var3 * 7 + 6, var1);
               var1 = u(178);
               ad[0] = u(3102);
               var1 = a(var1, ad, '#');
               a(81, var3 * 7 + 5, var1);
               a(81, 1 + var3 * 7, false);
               c(81, 3 + var3 * 7, 6, 4);
            }
         } else {
            var1 = u(179);
            ad[0] = lR[var3][5];
            var1 = a(var1, ad, '#');
            a(81, var3 * 7 + 6, var1);
            var1 = u(178);
            ad[0] = lR[var3][2];
            var1 = a(var1, ad, '#');
            a(81, var3 * 7 + 5, var1);
            a(81, 1 + var3 * 7, false);
         }

         if (lR[var3][0].equals("0")) {
            d(81, 4 + var3 * 7, true);
            a(81, 2 + var3 * 7, false);
         } else {
            d(81, 4 + var3 * 7, false);
            a(81, 2 + var3 * 7, true);
         }
      }
   }

   private static void cF() {
      String var0 = u(254);
      ad[0] = "" + dB();
      var0 = a(var0, ad, '#');
      a(80, 5, var0);
      if (dB() == 0) {
         f(80, 5, false);
      }

      b(et, 80, 3, ag[80][3][2], ag[80][3][3]);
      int var4 = et[2] - et[0];
      int var1 = et[3] - et[1];
      hF.k();
      hF.b();
      hF.a(0);
      hF.c(ag[80][2][5]);
      hF.d(ag[80][2][6]);
      int var2;
      if (lR != null) {
         var2 = lR.length;
      } else {
         var2 = 0;
      }

      hF.b(var2);
      hF.g(var4 + 1);
      hF.h(var1 + 1);
      hF.e(var4);
      hF.f(ag[80][2][7] + var1);
      aU(var2);
      d(80, 6, var2 > 3);
      d(80, 7, var2 > 3);
      hF.a(true);
      hF.b(false);
      hH = et[0];
      hI = et[1];
      hG[0] = ag[80][2][2];
      hG[1] = ag[80][2][3];
      hG[2] = ag[80][2][5];
      hG[3] = ag[80][2][6];
      hF.k();
      hJ = 0;
   }

   private static void aQ(int var0, int var1) {
      int var2 = hF.c();
      int var3 = hF.d();
      int var10 = var3;
      var2 = i(81, var2, var10, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm && !u.c && aR >= 400) {
         var1 = var2;
         var0 = hJ;
         switch (var1 % 7) {
            case 0:
               a(60);
               if (!bv(var0)) {
                  String var10000 = lR[var0][1];
                  String var16 = lR[var0][3];
                  String var15 = lR[var0][4];
                  String var12 = var16;
                  Object var7 = null;
                  if (var10000.equals("msg")) {
                     var7 = false;
                     if (var12.equals("gems")) {
                        h(0);
                     } else if (var12.equals("cash")) {
                        g(0);
                     } else if (var12.equals("xp")) {
                        k(0);
                     }
                  } else {
                     var7 = false;
                     if (var12.equals("gems")) {
                        h(Integer.parseInt(var15));
                     } else if (var12.equals("cash")) {
                        g(Integer.parseInt(var15));
                     } else if (var12.equals("xp")) {
                        k(Integer.parseInt(var15));
                     } else if (var12.equals("reset")) {
                        dl();
                        by = 7;
                        M(3);
                        bz = 17;
                        lS = true;
                     }
                  }
               }

               bu(var0);
               cF();
               hK = var0;
               label63:
               if (bv(var0)) {
                  var2 = hK;
                  if (lR[var2][1].equals("gift")) {
                     hL = true;
                     hM = lR[hK][3];
                     hN = Integer.parseInt(lR[hK][4]);
                  } else {
                     var2 = hK;
                     if (lR[var2][1].equals("cloud_save")) {
                        hL = false;
                        hM = lR[hK][3];
                        b(47, true, false);
                        break label63;
                     }

                     hL = false;
                     hM = lR[hK][3];
                     if (lR[hK][3].equals("pvp")) {
                        b(45, true, false);
                        break label63;
                     }
                  }

                  b(46, true, false);
               }

               bu(var0);
               break;
            case 2:
               String var5 = u(340);
               a(2, var5, 48);
               a(60);
               return;
         }
      }
   }

   private static void aR(int var0, int var1) {
      if (var0 == 0) {
         m(bf(iV), true);
         be(bf(iV));
         bP();
         kA = new int[kv];

         for (int var2 = 0; var2 < kv; var2++) {
            kA[var2] = -1;
         }

         kD = 0;
         hT = false;
         hU = false;
         ib = new int[(ia = new w[kw]).length];
         int var6 = ab.e[7];
         w[] var3 = new w[10];

         for (int var4 = 0; var4 < 10; var4++) {
            w var5;
            (var5 = new w()).d = 2;
            var5.e = new int[17];
            var5.e[0] = w.a(ab, 2) + 1;
            var5.e[1] = ((int[][])T[31])[var6 - 1][var4 + 2];
            var5.e[12] = (byte)ac(cJ);
            var5.c = 0;
            var3[var4] = var5;
         }

         w[] var7 = var3;
         if (!dE()) {
            hS[0] = var7[n(0, var7.length)];
            hS[1] = var7[n(0, var7.length)];
         } else {
            hS[0] = dH();
            hS[1] = dH();
         }

         for (int var17 = 0; var17 < ib.length; var17++) {
            ib[var17] = -1;
         }

         cG();
         q(true);
         kB = new int[kw];
         kC = new String[kw];

         for (int var8 = 0; var8 < kB.length; var8++) {
            kB[var8] = -1;
            kC[var8] = new String();
            kC[var8] = "";
         }

         if (hQ) {
            d(84, 34, eQ && fb.c() < 0);
            d(84, 35, eQ && fb.c() > -(fb.g() - fb.e()));
         } else {
            d(84, 34, hO && hV.c() < 0);
            d(84, 35, hO && hV.c() > -(hV.g() - hV.e()));
         }
      }

      if (var0 == 2) {
         av(iV);
         if (lU == 4) {
            if (hQ) {
               fb.i();
               int var9 = cB;
               int var18 = cC;
               label214:
               if (b(var9, var18, fc)) {
                  if (X(cl)) {
                     fb.b(cD, cE);
                  }

                  if (X(cl | ck)) {
                     cO = "INPUT PRESSED!";
                     var9 = fb.c(cB - fd, cC - fe);
                     if (u.b >= 0 && u.b != var9) {
                        break label214;
                     }

                     if (var9 >= 0) {
                        aT(var9, ck);
                     }
                  }

                  if (X(cm)) {
                     cO = cO + "INPUT RELEASED SYNC!";
                  }

                  if (W(cm)) {
                     cO = cO + "INPUT RELEASED!";
                     fb.a(cD, cE);
                     var9 = fb.c(cB - fd, cC - fe);
                     if ((u.b < 0 || u.b == var9) && var9 >= 0) {
                        ff = var9;
                        aT(var9, cm);
                        fb.j();
                     }
                  }
               }

               d(84, 34, eQ && fb.c() < 0);
               d(84, 35, eQ && fb.c() > -(fb.g() - fb.e()));
            } else {
               hV.i();
               int var12 = cB;
               int var19 = cC;
               label188:
               if (b(var12, var19, hW)) {
                  if (X(cl)) {
                     hV.b(cD, cE);
                  }

                  if (W(cm)) {
                     hV.a(cD, cE);
                     var12 = hV.c(cB - hX, cC - hY);
                     if (u.b >= 0 && u.b != var12) {
                        break label188;
                     }

                     if (var12 >= 0) {
                        hZ = var12;
                        aS(var12, cm);
                        hV.j();
                     }
                  }

                  if (X(cl | ck)) {
                     var12 = hV.c(cB - hX, cC - hY);
                     if ((u.b < 0 || u.b == var12) && var12 >= 0) {
                        aS(var12, ck);
                     }
                  }
               }

               cI();
               d(84, 34, hO && hV.c() < 0);
               d(84, 35, hO && hV.c() > -(hV.g() - hV.e()));
            }

            if (u.c) {
               aR = 0;
            }
         }

         c(84, 4, cx());
      }

      if (var0 == 4) {
         if (hQ) {
            k(fc[0], fc[1], fc[2], fc[3]);
            int var15 = fb.c();
            int var20 = fb.d();
            i(38, var15, var20);
            bQ();
         } else {
            k(hW[0], hW[1], hW[2], hW[3]);
            int var21 = hV.c();
            int var16 = hV.d();
            i(85, var21, var16);
            bQ();
         }

         h(84, 34, 0, 0);
         h(84, 35, 0, 0);
      }

      if (var0 == 5) {
         switch (var1) {
            case 4:
               a(60);
               kj = false;
               if (hT && !dE()) {
                  a(false, aZ(), false, false);
               }

               if (hU && !dE()) {
                  a(false, aZ(), false, false);
               }

               if (!kC[0].equals("")) {
                  k(kC[0]);
               }

               if (!kC[1].equals("")) {
                  k(kC[1]);
               }

               cv();
               M(9);
               return;
            case 5:
               a(61);
               if (hT || hU) {
                  hT = false;
                  hU = false;
               }

               b(36, false, false);
               M(5);
               aH();
               return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
            case 19:
            case 20:
            case 22:
            case 24:
            case 25:
            case 27:
            case 29:
            case 31:
            default:
               break;
            case 11:
            case 16:
            case 21:
               a(60);
               q(true);
               return;
            case 13:
               a(61);
               aY(0);
               if (!hQ) {
                  q(true);
                  return;
               }
               break;
            case 18:
               a(61);
               aY(1);
               if (!hQ) {
                  q(true);
                  return;
               }
               break;
            case 23:
               a(61);
               aY(2);
               if (!hQ) {
                  q(true);
                  return;
               }
               break;
            case 26:
            case 30:
               a(60);
               q(false);
               break;
            case 28:
               a(61);
               hT = false;
               aV(0);
               if (hQ) {
                  q(false);
                  return;
               }
               break;
            case 32:
               a(61);
               hU = false;
               aV(1);
               if (hQ) {
                  q(false);
                  return;
               }
         }
      }
   }

   private static void q(boolean var0) {
      hQ = var0;
      c(84, 11, !var0);
      c(84, 16, !var0);
      c(84, 21, !var0);
      c(84, 26, var0);
      c(84, 30, var0);
      (hQ ? fb : hV).a = 0;
   }

   private static void cG() {
      hP = 0;
      eT = 0;
      eU = 0;
      b(et, 84, 8, ag[84][8][2], ag[84][8][3]);
      int var0 = et[2] - et[0];
      int var1 = et[3] - et[1];
      fb.k();
      fb.b();
      fb.a(1);
      fb.c(ag[84][6][5]);
      fb.d(ag[84][6][6]);
      if (dE()) {
         int[] var2;
         (var2 = new int[1])[0] = 27;
         kE = var2;
         int var30 = var2.length;
         eQ = false;
         fb.b(var30);
         fb.g(var0 + 1);
         fb.h(var1 + 1);
         fb.e(ag[84][6][7] + var0);
         fb.f(var1);
         int var31 = kE.length;
         au(38);
         O(38, ag[38].length + 9 * (var31 - 1));

         for (int var3 = 0; var3 < var31; var3++) {
            if (var3 != 0) {
               q(38, 0, var3 * 9);
               q(38, 1, var3 * 9 + 1);
               q(38, 2, var3 * 9 + 2);
               q(38, 3, var3 * 9 + 3);
               q(38, 4, var3 * 9 + 4);
               q(38, 5, var3 * 9 + 5);
               q(38, 6, var3 * 9 + 6);
               q(38, 7, var3 * 9 + 7);
               q(38, 8, var3 * 9 + 8);
               short var5 = ag[38][0][2];
               short var19 = ag[38][0][3];
               c(38, var3 * 9, 2, var5 + fb.i(var3));
               c(38, var3 * 9, 3, var19 + fb.j(var3));
               var5 = ag[38][1][2];
               var19 = ag[38][1][3];
               c(38, var3 * 9 + 1, 2, var5 + fb.i(var3));
               c(38, var3 * 9 + 1, 3, var19 + fb.j(var3));
               d(38, var3 * 9 + 1, false);
               var5 = ag[38][4][2];
               var19 = ag[38][4][3];
               c(38, var3 * 9 + 4, 2, var5 + fb.i(var3));
               c(38, var3 * 9 + 4, 3, var19 + fb.j(var3));
               var5 = ag[38][2][2];
               var19 = ag[38][2][3];
               c(38, var3 * 9 + 2, 2, var5 + fb.i(var3));
               c(38, var3 * 9 + 2, 3, var19 + fb.j(var3));
               var5 = ag[38][5][2];
               var19 = ag[38][5][3];
               c(38, var3 * 9 + 5, 2, var5 + fb.i(var3));
               c(38, var3 * 9 + 5, 3, var19 + fb.j(var3));
               var5 = ag[38][6][2];
               var19 = ag[38][6][3];
               c(38, var3 * 9 + 6, 2, var5 + fb.i(var3));
               c(38, var3 * 9 + 6, 3, var19 + fb.j(var3));
               var5 = ag[38][7][2];
               var19 = ag[38][7][3];
               c(38, var3 * 9 + 7, 2, var5 + fb.i(var3));
               c(38, var3 * 9 + 7, 3, var19 + fb.j(var3));
               var5 = ag[38][3][2];
               var19 = ag[38][3][3];
               c(38, var3 * 9 + 3, 2, var5 + fb.i(var3));
               c(38, var3 * 9 + 3, 3, var19 + fb.j(var3));
               var5 = ag[38][8][2];
               var19 = ag[38][8][3];
               c(38, var3 * 9 + 8, 2, var5 + fb.i(var3));
               c(38, var3 * 9 + 8, 3, var19 + fb.j(var3));
            }

            r var28;
            int var14 = (var28 = q.a(kE[var3], (byte)4)).ar;
            o(2);
            n(38, 2 + var3 * 9, var14);
            int var10001 = 3 + var3 * 9;
            String var4 = "";
            a(38, var10001, var4, false);
            c(38, 8 + var3 * 9, "" + var28.aZ);
            b(38, 8 + var3 * 9, true);
            b(38, 4 + var3 * 9, true);
            var14 = var28.bm[42];
            c(38, 5 + var3 * 9, 5, 24);
            c(38, 5 + var3 * 9, 6, var14 + 15);
            if ((var14 = var28.bm[43]) != 15) {
               c(38, 6 + var3 * 9, 5, 24);
               c(38, 6 + var3 * 9, 6, var14 + 15);
               d(38, 6 + var3 * 9, true);
            } else {
               d(38, 6 + var3 * 9, false);
            }

            if ((var14 = var28.bm[44]) != 15) {
               c(38, 7 + var3 * 9, 5, 24);
               c(38, 7 + var3 * 9, 6, var14 + 15);
               d(38, 7 + var3 * 9, true);
            } else {
               d(38, 7 + var3 * 9, false);
            }
         }
      } else {
         int var32;
         eQ = (var32 = (kE = r.ac()).length) > 4;
         fb.b(var32);
         fb.g(var0 + 1);
         fb.h(var1 + 1);
         fb.e(ag[84][6][7] + var0);
         fb.f(var1);
         cH();
         hO = true;
      }

      fb.a(false);
      fb.b(true);
      fd = et[0];
      fe = et[1];
      fc[0] = ag[84][6][2];
      fc[1] = ag[84][6][3];
      fc[2] = ag[84][6][5];
      fc[3] = ag[84][6][6];
      fb.k();
      ff = 0;
      dD();
      b(et, 84, 8, ag[84][8][2], ag[84][8][3]);
      var0 = et[2] - et[0];
      var1 = et[3] - et[1];
      hV.k();
      hV.b();
      hV.a(1);
      hV.c(ag[84][6][5]);
      hV.d(ag[84][6][6]);
      hV.b(2);
      hV.g(var0 + 1);
      hV.h(var1 + 1);
      hV.e(ag[84][6][7] + var0);
      hV.f(var1);
      aX(2);
      hV.a(false);
      hV.b(true);
      hX = et[0];
      hY = et[1];
      hW[0] = ag[84][6][2];
      hW[1] = ag[84][6][3];
      hW[2] = ag[84][6][5];
      hW[3] = ag[84][6][6];
      hV.k();
      hZ = 0;
   }

   private static void a(int var0, w var1) {
      if (var0 == 0) {
         a(84, 28, true);
         a(84, 26, false);
         n(84, 27, var1.e[1]);
         L(84, 27);
         g(84, 27, true);
      } else {
         a(84, 32, true);
         a(84, 30, false);
         n(84, 31, var1.e[1]);
         L(84, 31);
         g(84, 31, true);
      }
   }

   private static void aV(int var0) {
      ia[var0] = null;
      int var1 = ib[var0];
      b(85, var1 * 10 + 8, false);
      ib[var0] = -1;
      kB[var0] = -1;
      kC[var0] = "";
      if (var0 == 0) {
         a(84, 28, false);
         a(84, 26, true);
         g(84, 27, false);
      } else {
         a(84, 32, false);
         a(84, 30, true);
         g(84, 31, false);
      }
   }

   private static void aW(int var0) {
      b(85, var0 * 10 + 8, true);
      fh[var0] = 0;
      w var1;
      (var1 = new w()).d = 2;
      var1.e = new int[17];
      var1.e[0] = w.a(ab, 2) + 1;
      if (var0 != 0 && var0 != 1) {
         if (var1.e[12] == 0) {
            var1.e[12] = 1;
         }

         var1.c = 0;

         for (int var4 = 0; var4 < ia.length; var4++) {
            if (ia[var4] == null) {
               if (var4 == 0) {
                  hT = false;
               } else if (var4 == 1) {
                  hU = false;
               }

               ia[var4] = var1;
               ib[var4] = var0;
               kB[var4] = var4;
               a(var4, var1);
               return;
            }
         }
      } else {
         var1 = hS[var0];

         for (int var2 = 0; var2 < ia.length; var2++) {
            if (ia[var2] == null) {
               if (var2 == 0) {
                  hT = true;
               } else if (var2 == 1) {
                  hU = true;
               }

               ia[var2] = var1;
               ib[var2] = var0;
               kB[var2] = var2;
               kC[var2] = "";
               a(var2, var1);
               return;
            }
         }
      }
   }

   private static void aX(int var0) {
      fh = new int[2];

      for (int var8 = 0; var8 < 2; var8++) {
         fh[var8] = -1000;
      }

      au(85);
      O(85, ag[85].length + 10);
      short var1 = 0;

      for (int var2 = 0; var2 < 2; var2++) {
         if (var2 != 0) {
            q(85, 0, 10);
            q(85, 1, 11);
            q(85, 2, 12);
            short var9 = ag[85][0][2];
            var1 = ag[85][0][3];
            c(85, 10, 2, var9 + hV.i(1));
            c(85, 10, 3, var1 + hV.j(1));
            var9 = ag[85][1][2];
            var1 = ag[85][1][3];
            c(85, 11, 2, var9 + hV.i(1));
            c(85, 11, 3, var1 + hV.j(1));
            var9 = ag[85][2][2];
            var1 = ag[85][2][3];
            c(85, 12, 2, var9 + hV.i(1));
            c(85, 12, 3, var1 + hV.j(1));
            q(85, 3, 13);
            q(85, 4, 14);
            q(85, 5, 15);
            q(85, 6, 16);
            q(85, 7, 17);
            q(85, 8, 18);
            q(85, 9, 19);
         }

         m(85, 2 + var2 * 10, 186);
         a(85, var2 * 10 + 8, true);
         l(85, var2 * 10 + 8, 6169);
         if (var2 == 0) {
            M(1, 4);
         }

         if (var2 == 1) {
            M(11, 8);
         }

         int var3 = ag[85][3][2] - ag[85][0][2];
         int var4 = ag[85][9][2] - ag[85][0][2];
         int var12 = ag[85][3][2];
         var1 = ag[85][3][3];
         c(85, var2 * 10 + 3, 2, var12 - var3 + hV.i(var2));
         c(85, var2 * 10 + 3, 3, var1 + hV.j(var2));
         var12 = hS[var2].e[1];
         int var5 = o(9)[var12][1];
         int var6 = o(9)[var12][2];
         int var7 = o(9)[var12][3];
         short var14 = ag[85][4][2];
         var1 = ag[85][4][3];
         c(85, var2 * 10 + 4, 2, var14 - var3 + hV.i(var2));
         c(85, var2 * 10 + 4, 3, var1 + hV.j(var2));
         c(85, var2 * 10 + 4, 6, var5);
         var14 = ag[85][5][2];
         var1 = ag[85][5][3];
         c(85, var2 * 10 + 5, 2, var14 - var3 + hV.i(var2));
         c(85, var2 * 10 + 5, 3, var1 + hV.j(var2));
         c(85, var2 * 10 + 5, 6, var6);
         var14 = ag[85][6][2];
         var1 = ag[85][6][3];
         c(85, var2 * 10 + 6, 2, var14 - var3 + hV.i(var2));
         c(85, var2 * 10 + 6, 3, var1 + hV.j(var2));
         c(85, var2 * 10 + 6, 6, var7);
         var14 = ag[85][7][2];
         var1 = ag[85][7][3];
         c(85, var2 * 10 + 7, 2, var14 + hV.i(var2));
         c(85, var2 * 10 + 7, 3, var1 + hV.j(var2));
         n(85, var2 * 10 + 7, hS[var2].e[1]);
         L(85, var2 * 10 + 7);
         var14 = ag[85][8][2];
         var1 = ag[85][8][3];
         c(85, var2 * 10 + 8, 2, var14 + hV.i(var2));
         c(85, var2 * 10 + 8, 3, var1 + hV.j(var2));
         var14 = ag[85][9][2];
         var1 = ag[85][9][3];
         c(85, var2 * 10 + 9, 2, var14 - var4 + hV.i(var2));
         c(85, var2 * 10 + 9, 3, var1 + hV.j(var2));
      }
   }

   private static void aS(int var0, int var1) {
      int var2 = hV.c();
      int var3 = hV.d();
      int var8 = var3;
      var2 = i(85, var2, var8, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm && !u.c && aR >= 400) {
         var1 = var2;
         var0 = hZ;
         switch (var1 % 10) {
            case 0:
               return;
            case 3:
               if (!dE()) {
                  hR = var0;
               }
               break;
            case 8:
               a(60);
               if (fh[var0] > 0) {
                  if (var0 != 0 && var0 != 1) {
                     aW(var0);
                  } else {
                     String var6 = u(269);
                     ad[0] = "" + aZ();
                     String var7 = a(var6, ad, '#');
                     a(2, var7, 34);
                     R = var0;
                  }
               } else {
                  j(var0, false);
                  d(85, 9 + var0 * 10, true);
                  fh[var0] = 10000;
                  lq = true;
                  ls = 84;
               }

               if (!F() || dE()) {
                  b(200, 85, 8, -1);
                  return;
               }
         }
      }
   }

   private static void h(String var0) {
      iO = var0;
      b(19, true, false);
   }

   private static void cH() {
      int var0 = kE.length;
      au(38);
      short var1 = 0;
      O(38, ag[38].length + 9 * (var0 - 1));

      for (int var3 = 0; var3 < var0; var3++) {
         if (var3 != 0) {
            q(38, 0, var3 * 9);
            q(38, 1, var3 * 9 + 1);
            q(38, 2, var3 * 9 + 2);
            q(38, 3, var3 * 9 + 3);
            q(38, 4, var3 * 9 + 4);
            q(38, 5, var3 * 9 + 5);
            q(38, 6, var3 * 9 + 6);
            q(38, 7, var3 * 9 + 7);
            q(38, 8, var3 * 9 + 8);
            var1 = ag[38][0][2];
            short var2 = ag[38][0][3];
            c(38, var3 * 9, 2, var1 + fb.i(var3));
            c(38, var3 * 9, 3, var2 + fb.j(var3));
            var1 = ag[38][1][2];
            var2 = ag[38][1][3];
            c(38, var3 * 9 + 1, 2, var1 + fb.i(var3));
            c(38, var3 * 9 + 1, 3, var2 + fb.j(var3));
            d(38, var3 * 9 + 1, false);
            var1 = ag[38][4][2];
            var2 = ag[38][4][3];
            c(38, var3 * 9 + 4, 2, var1 + fb.i(var3));
            c(38, var3 * 9 + 4, 3, var2 + fb.j(var3));
            var1 = ag[38][2][2];
            var2 = ag[38][2][3];
            c(38, var3 * 9 + 2, 2, var1 + fb.i(var3));
            c(38, var3 * 9 + 2, 3, var2 + fb.j(var3));
            var1 = ag[38][5][2];
            var2 = ag[38][5][3];
            c(38, var3 * 9 + 5, 2, var1 + fb.i(var3));
            c(38, var3 * 9 + 5, 3, var2 + fb.j(var3));
            var1 = ag[38][6][2];
            var2 = ag[38][6][3];
            c(38, var3 * 9 + 6, 2, var1 + fb.i(var3));
            c(38, var3 * 9 + 6, 3, var2 + fb.j(var3));
            var1 = ag[38][7][2];
            var2 = ag[38][7][3];
            c(38, var3 * 9 + 7, 2, var1 + fb.i(var3));
            c(38, var3 * 9 + 7, 3, var2 + fb.j(var3));
            var1 = ag[38][3][2];
            var2 = ag[38][3][3];
            c(38, var3 * 9 + 3, 2, var1 + fb.i(var3));
            c(38, var3 * 9 + 3, 3, var2 + fb.j(var3));
            var1 = ag[38][8][2];
            var2 = ag[38][8][3];
            c(38, var3 * 9 + 8, 2, var1 + fb.i(var3));
            c(38, var3 * 9 + 8, 3, var2 + fb.j(var3));
         }

         r var26;
         int var14 = (var26 = (r)q.ac[kE[var3]]).ar;
         o(2);
         n(38, 2 + var3 * 9, var14);
         int var10001 = 3 + var3 * 9;
         String var4 = ((r)q.ac[kE[var3]]).d(true);
         a(38, var10001, var4, false);
         c(38, 8 + var3 * 9, "" + var26.aZ);
         var14 = var26.bm[42];
         c(38, 5 + var3 * 9, 5, 24);
         c(38, 5 + var3 * 9, 6, var14 + 15);
         if ((var14 = var26.bm[43]) != 15) {
            c(38, 6 + var3 * 9, 5, 24);
            c(38, 6 + var3 * 9, 6, var14 + 15);
            d(38, 6 + var3 * 9, true);
         } else {
            d(38, 6 + var3 * 9, false);
         }

         if ((var14 = var26.bm[44]) != 15) {
            c(38, 7 + var3 * 9, 5, 24);
            c(38, 7 + var3 * 9, 6, var14 + 15);
            d(38, 7 + var3 * 9, true);
         } else {
            d(38, 7 + var3 * 9, false);
         }
      }
   }

   private static void aT(int var0, int var1) {
      int var2 = fb.c();
      int var3 = fb.d();
      int var9 = var3;
      var2 = i(38, var2, var9, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm && !u.c && aR >= 400) {
         if (!dE()) {
            var1 = var2;
            var0 = ff;
            n(b(14, var0, 0));
            switch (var1 % 9) {
               case 0:
                  ba(var1);
                  var0 = 0;
                  new StringBuffer().append("PLAYER DRAGONS: ").append(kv).toString();

                  for (int var8 = 0; var8 < kv; var8++) {
                     if (kA[var8] != -1) {
                        var2 = ((r)q.ac[kE[kA[var8]]]).bc;
                        a(84, 11 + var8 * 5, false);
                        d(84, 14 + var8 * 5, false);
                        a(84, 13 + var8 * 5, true);
                        n(84, 12 + var8 * 5, var2);
                        g(84, 12 + var8 * 5, true);
                        var0++;
                     } else {
                        aZ(var8);
                     }
                  }

                  if (var0 > ic) {
                     a(60);
                  } else {
                     a(61);
                  }

                  ic = var0;
                  return;
               case 4:
                  a(51);
                  var1 /= 9;
                  r var11 = (r)q.ac[kE[var1]];
                  au(0, var11.ar);
               default:
                  return;
            }
         }

         bw(var2);
         if (!F() || dE()) {
            b(200, 38, ff, -1);
         }
      }
   }

   private static void aY(int var0) {
      if (kA[var0] != -1) {
         d(38, kA[var0] * 9 + 1, false);
         aZ(var0);
         kA[var0] = -1;
         kD--;
      }
   }

   private static void aZ(int var0) {
      a(84, 11 + var0 * 5, true);
      d(84, 14 + var0 * 5, true);
      a(84, 13 + var0 * 5, false);
      g(84, 12 + var0 * 5, false);
   }

   private static void ba(int var0) {
      var0 /= 9;
      int var1 = -1;

      for (int var2 = 0; var2 < kv; var2++) {
         if (kA[var2] == var0) {
            var1 = var2;
         }
      }

      if (var1 != -1) {
         kD--;
         kA[var1] = -1;
         d(38, var0 * 9 + 1, false);
      } else if (kD < kv) {
         for (int var4 = 0; var4 < kv; var4++) {
            if (kA[var4] == -1) {
               kA[var4] = var0;
               break;
            }
         }

         kD++;
         d(38, var0 * 9 + 1, true);
      }
   }

   private static void cI() {
      for (int var0 = 0; var0 < ag[85].length; var0++) {
         short[] var3;
         if ((var3 = ag[85][var0])[0] == 1) {
            int var1 = var0 / 10;
            if (fh[var1] != -1000) {
               if (hR == var1) {
                  hR = -1;
                  fh[var1] = -1000;
               }

               if (fh[var1] > 0) {
                  if (!dE()) {
                     fh[var1] = fh[var1] - aq;
                  }
               } else {
                  i(var1, false);
                  d(85, 9 + var1 * 10, true);
                  fh[var1] = -1000;
               }
            }

            short var8 = var3[5];
            a var4 = er[var8];
            var8 = var3[6];
            short var2;
            if ((var2 = var3[7]) >= 0 && var4 != null) {
               int var5 = var3[12] + aq;
               var2 &= -1537;
               int var6 = var4.a(var2);
               if (var8 < var6 - 1) {
                  int var7 = var4.a(var2, var8) * es;
                  if (var5 >= var7) {
                     var5 = 0;
                     var3[6] = (short)((var8 + 1) % var6);
                     if (var3[6] == var6 - 1) {
                        var3[9] = 1;
                     }
                  }
               } else {
                  var3[12] = 1;
               }

               int var11 = var4.a(var2, var8) * es;
               if (var5 >= var11) {
                  var5 = 0;
                  var3[6] = (short)((var8 + 1) % var6);
                  d(85, var0, false);
                  if (fh[var0 / 10] == -1000) {
                     j(var0 / 10, true);
                  } else {
                     i(var0 / 10, true);
                  }
               }

               var3[12] = (short)var5;
            }
         }
      }
   }

   private static void i(int var0, boolean var1) {
      int var2 = hS[var0].e[1];
      a(85, 3 + var0 * 10, var1);
      d(85, 4 + var0 * 10, var1);
      if (o(9)[var2][2] != 15) {
         d(85, 5 + var0 * 10, var1);
      }

      if (o(9)[var2][3] != 15) {
         d(85, 6 + var0 * 10, var1);
      }

      g(85, 7 + var0 * 10, var1);
      if (var1) {
         if (var0 != 0 && var0 != 1) {
            l(85, 8 + var0 * 10, 6171);
         } else {
            l(85, 8 + var0 * 10, 6167);
         }
      }

      a(85, 8 + var0 * 10, var1);
   }

   private static void j(int var0, boolean var1) {
      a(85, 0 + var0 * 10, var1);
      if (var1) {
         l(85, 8 + var0 * 10, 6169);
      }

      a(85, 8 + var0 * 10, var1);
      c(85, 1 + var0 * 10, 9, var1 ? 1 : 0);
      c(85, 2 + var0 * 10, 18, var1 ? 1 : 0);
   }

   private static void aU(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         String var2 = lR[hK][5];
         a(79, 16, var2, false);
         m(79, 26, 6160);
         switch (ie) {
            case 3:
               g(79, 19, true);
               d(79, 22, true);
               f(79, 13, true);
               a(79, 13, u(106) + " " + is);
               n(79, 19, ir);
               L(79, 19);
               if (im >= 3) {
                  c(79, 22, 6, 5);
               } else {
                  c(79, 22, 6, 4);
               }
            case 2:
               g(79, 18, true);
               d(79, 21, true);
               f(79, 12, true);
               a(79, 12, u(106) + " " + iq);
               n(79, 18, ip);
               L(79, 18);
               if (im >= 2) {
                  c(79, 21, 6, 5);
               } else {
                  c(79, 21, 6, 4);
               }
            case 1:
               g(79, 17, true);
               d(79, 20, true);
               f(79, 11, true);
               a(79, 11, u(106) + " " + io);
               n(79, 17, in);
               L(79, 17);
               if (im > 0) {
                  c(79, 20, 6, 5);
               } else {
                  c(79, 20, 6, 4);
               }
            default:
               switch (id) {
                  case 3:
                     g(79, 6, true);
                     d(79, 9, true);
                     f(79, 15, true);
                     a(79, 15, u(106) + " " + il);
                     n(79, 6, ik);
                     L(79, 6);
                     if (if_val >= 3) {
                        c(79, 9, 6, 5);
                     } else {
                        c(79, 9, 6, 4);
                     }
                  case 2:
                     g(79, 5, true);
                     d(79, 8, true);
                     f(79, 14, true);
                     a(79, 14, u(106) + " " + ij);
                     n(79, 5, ii);
                     L(79, 5);
                     if (if_val >= 2) {
                        c(79, 8, 6, 5);
                     } else {
                        c(79, 8, 6, 4);
                     }
                  case 1:
                     g(79, 4, true);
                     d(79, 7, true);
                     f(79, 10, true);
                     a(79, 10, u(106) + " " + ih);
                     n(79, 4, ig);
                     L(79, 4);
                     if (if_val > 0) {
                        c(79, 7, 6, 5);
                     } else {
                        c(79, 7, 6, 4);
                     }
               }
         }
      }

      if (var0 == 2) {
         av(iV);
      }

      if (var0 == 5) {
         switch (var1) {
            case 24:
               a(60);
               lR = bt(hK);
               b(45, false, false);
               break;
            case 25:
               a(60);
               b(45, false, false);
               return;
         }
      }
   }

   private static void aV(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         int var2 = 0;
         String var3 = "";
         if (!hL) {
            if (hM.equals("gems")) {
               j(78, 6, 51);
               var3 = u(188);
            } else if (hM.equals("cash")) {
               j(78, 6, 34);
               var3 = u(192);
            } else if (hM.equals("xp")) {
               j(78, 6, 62);
               var3 = u(193);
            }
         } else {
            if (hM.equals("gems")) {
               j(78, 6, 51);
               var3 = u(188);
            } else if (hM.equals("cash")) {
               j(78, 6, 34);
               var3 = u(192);
            } else if (hM.equals("xp")) {
               j(78, 6, 62);
               var3 = u(193);
            }

            var2 = hN;
            a(78, 8, lR[hK][5], true);
         }

         ad[0] = "" + var2;
         var3 = a(var3, ad, '#');
         if (!lR[hK][6].equals("facebook:ned")) {
            ad[0] = lR[hK][2];
         } else {
            ad[0] = u(3102);
         }

         var3 = a(var3, ad, '%');
         a(78, 7, var3);
         a(78, 10, u(190));
      }

      if (var0 == 2) {
         av(iV);
      }

      if (var0 == 5) {
         switch (var1) {
            case 3:
               a(61);
               b(46, false, false);
               return;
            case 4:
               String var4 = u(340);
               a(2, var4, 48);
               a(60);
         }
      }
   }

   private static void aW(int var0, int var1) {
      if (var0 == 0) {
         m(bf(iV), true);
         int var3 = ab.e[7];
         h(29, 29, false);
         d(29, 18, true);
         c(29, 17, 9, 0);
         m(29, 14, 3102);
         m(29, 32, 3102);
         String var2 = "";
         a(29, 12, var2, false);
         int var5 = it[cJ()][0];
         int var4 = it[cJ()][1];
         n(29, 4, var5);
         d(29, 5, false);
         a(29, 6, u(106) + " " + var3);
         a(29, 37, "" + var4);
         a(29, 23, true);
         d(29, 28, false);
         f(29, 9, false);
         f(29, 11, false);
         f(29, 15, false);
         f(29, 30, false);
         f(29, 31, false);
         f(29, 32, false);
         f(29, 33, false);
         f(29, 34, false);
         f(29, 35, false);
         f(29, 36, false);
         if (var5 != -1) {
            if (b(9, var5, 3) != 15) {
               j(29, 25, b(9, var5, 1) + 15);
               j(29, 26, b(9, var5, 2) + 15);
               j(29, 27, b(9, var5, 3) + 15);
               d(29, 25, true);
               d(29, 26, true);
               d(29, 27, true);
            } else if (b(9, var5, 2) != 15) {
               j(29, 25, b(9, var5, 1) + 15);
               j(29, 26, b(9, var5, 2) + 15);
               d(29, 25, true);
               d(29, 26, true);
               d(29, 27, false);
            } else {
               j(29, 25, b(9, var5, 1) + 15);
               d(29, 25, true);
               d(29, 26, false);
               d(29, 27, false);
            }
         }

         a(29, 16, u(201));
      }

      if (var0 == 2) {
         if (bm > 0) {
            c(29, 23, false);
            c(29, 23, ao(bm));
         } else {
            c(29, 23, true);
         }
      }

      if (var0 == 5) {
         switch (var1) {
            case 19:
               a(61);
               b(51, false, false);
               ls = -1;
               aH();
               kW = false;
               M(5);
               break;
            case 20:
               a(60);
               dz();
            case 21:
            case 22:
            default:
               break;
            case 23:
               a(60);
               if (cs() == 0 && !dE()) {
                  d(3, u(6170));
               } else {
                  bq(0);
                  kW = true;
               }
         }
      }

      if (var0 == 3) {
         cY();
      }
   }

   private static int cJ() {
      int var0;
      if ((var0 = ab.e[7]) >= 15) {
         return 2;
      } else {
         return var0 >= 10 ? 1 : 0;
      }
   }

   private static void aX(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         bf();
         bc();
         int var2 = a(new Date());
         int var3 = ab.e[32];

         for (int var4 = 0; var4 < 5; var4++) {
            int var5 = var4 - var3;
            int var6;
            if ((var6 = var2 + var5) < 0) {
               var6 += 7;
            }

            if (var6 >= 7) {
               var6 -= 7;
            }

            String var7;
            if (var5 == 0) {
               var7 = u(247);
            } else if (var5 == -1) {
               var7 = u(249);
            } else if (var5 == 1) {
               var7 = u(248);
            } else {
               var7 = u(var6 + 240);
            }

            a(88, var4 + 7, var7);
            if (var5 < 0) {
               c(88, var4 + 7, 8, 3);
            }

            if (var5 == 0) {
               c(88, var4 + 7, 8, 9);
               c(88, var4 + 2, 6, 94);
               c(88, var4 + 2, 8, 4);
            }

            if (var5 > 0) {
               c(88, var4 + 7, 8, 5);
               c(88, var4 + 2, 6, 90);
               c(88, var4 + 2, 8, 3);
            }

            d(88, var4 + 16, var5 < 0);
         }

         int[] var9;
         (var9 = new int[]{0, 0, 0})[0] = dM();
         var9[1] = dN();
         var9[2] = dO();
         int var10 = 0;
         if (var9[0] > 0) {
            var10++;
         }

         if (var9[1] > 0) {
            var10++;
         }

         if (var9[2] > 0) {
            var10++;
         }

         switch (var10) {
            case 1:
               d(88, 34, true);
               f(88, 37, true);
               if (var9[0] > 0) {
                  c(88, 34, 5, 23);
                  c(88, 34, 6, 72);
                  a(88, 37, "" + var9[0]);
               } else if (var9[1] > 0) {
                  c(88, 34, 5, 23);
                  c(88, 34, 6, 48);
                  a(88, 37, "" + var9[1]);
               } else if (var9[2] > 0) {
                  c(88, 34, 5, 21);
                  c(88, 34, 6, 15);
                  a(88, 37, "" + var9[2]);
               }
               break;
            case 2:
               d(88, 33, true);
               d(88, 35, true);
               f(88, 36, true);
               f(88, 38, true);
               byte var11 = 33;
               byte var12 = 36;
               if (var9[0] > 0) {
                  c(88, 33, 5, 23);
                  c(88, 33, 6, 72);
                  a(88, 36, "" + var9[0]);
                  var11 = 35;
                  var12 = 38;
               }

               if (var9[1] > 0) {
                  c(88, var11, 5, 23);
                  c(88, var11, 6, 48);
                  a(88, var12, "" + var9[1]);
                  var11 = 35;
                  var12 = 38;
               }

               if (var9[2] > 0) {
                  c(88, var11, 5, 21);
                  c(88, var11, 6, 15);
                  a(88, var12, "" + var9[2]);
               }
               break;
            case 3:
               d(88, 33, true);
               d(88, 35, true);
               f(88, 36, true);
               f(88, 38, true);
               d(88, 34, true);
               f(88, 37, true);
               a(88, 36, "" + var9[0]);
               a(88, 37, "" + var9[1]);
               a(88, 38, "" + var9[2]);
               c(88, 33, 5, 23);
               c(88, 33, 6, 72);
               c(88, 34, 5, 23);
               c(88, 34, 6, 48);
               c(88, 35, 5, 21);
               c(88, 35, 6, 15);
         }

         a(2, 0, false);
      }

      if (var0 == 1) {
         bg();
         bd();
         a(2, 0, true);
      }

      if (var0 == 3) {
         a(2, 0, false);
         cY();
      }

      if (var0 == 5) {
         switch (var1) {
            case 39:
               a(60);
               b(30, false, false);
               g(dM());
               h(dN());
               i(dO());
               var0 = a(new Date());
               ab.e[32]++;
               ab.e[33] = var0;
               j();
         }
      }
   }

   private static void aY(int var0, int var1) {
      if (var0 == 0) {
         iu = true;
         m(bf(iV), true);
         be(bf(iV));
         au(20);
         bO();
         String var2 = iw;
         a(20, 7, var2, false);
         var2 = ix;
         a(20, 6, var2, false);
         aQ();
         if (dE() || v(40)) {
            iv = 26;
         }

         a(1);
         lq = true;
         ls = 20;
         if (aM == 3) {
            kc = 0L;
         }
      }

      if (var0 == 1) {
         iu = false;
         aR();
      }

      if (var0 == 2) {
         H(iV, aq);
         if (!a()) {
            a(1);
         }
      }

      if (var0 == 5) {
         switch (var1) {
            case 8:
               al();
               if (iv == -1) {
                  a(60);
               }

               b(bf(iV), false, false);
               if (iv != -1) {
                  a(iv);
                  iv = -1;
               }

               if (i != 9) {
                  ls = -1;
                  aH();
               }

               bT = false;
               if (F()) {
                  b(69, true, false);
               }
         }
      }
   }

   private static void aZ(int var0, int var1) {
      iw = u(var0);
      ix = u(var1);
      lq = true;
      ls = 20;
      b(32, true, false);
   }

   private static void ba(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         q.c(z, 4);
         au(57);
         au(58);
         if (!kj) {
            cK();
         } else {
            cL();
         }

         aQ();
         lq = true;
         ls = 57;
         if (v(21)) {
            l(true);
         } else {
            l(false);
         }

         if (kg) {
            a(60);
         }

         if (j.a()) {
            a(57, 9, true);
         }

         a(57, 10, j.c());
      }

      if (var0 == 1) {
         aR();
         kg = false;
         if (ak()) {
            d.k();
         }
      }

      if (var0 == 2) {
         H(57, aq);
         iH.i();
         int var2 = cB;
         int var3 = cC;
         boolean var4 = (em[57][9] & 1) != 0;
         c(57, 9, 17, var4 ? 3 : 10);
         var4 = (em[57][10] & 1) != 0;
         c(57, 10, 17, var4 ? 3 : 10);
         label92:
         if (b(var2, var3, iI)) {
            if (W(cm)) {
               iH.a(cD, cE);
               var2 = iH.c(cB - iJ, cC - iK);
               if (u.b >= 0 && u.b != var2) {
                  break label92;
               }

               if (var2 >= 0) {
                  iL = var2;
                  bb(var2, cm);
                  iH.j();
               }
            }

            if (X(cl | ck)) {
               var2 = iH.c(cB - iJ, cC - iK);
               if ((u.b < 0 || u.b == var2) && var2 >= 0) {
                  bb(var2, ck);
               }
            }
         }

         if (u.c) {
            aR = 0;
         }
      }

      if (var0 == 4) {
         k(iI[0], iI[1], iI[2], iI[3]);
         int var7 = iH.c();
         int var8 = iH.d();
         int var10 = var8;
         g(58, var7, var10, 0);
         bQ();
      }

      if (var0 == 5) {
         switch (var1) {
            case 5:
               bb(0);
               return;
            case 6:
               bb(1);
               return;
            case 7:
               bb(2);
            case 8:
            default:
               break;
            case 9:
               aj();
               a(60);
               dl();
               dI();
               return;
            case 10:
               a(60);
               j.b();
               return;
         }
      }
   }

   private static void a(int var0, byte var1) {
      iF[var0] = var1;
      if (var1 != -1) {
         a(57, var0 + 5, true);
      } else {
         a(57, var0 + 5, false);
      }
   }

   private static void i(String var0) {
      iG[2] = var0;
      c(57, 7, var0);
   }

   private static void a(byte var0, String var1) {
      var0 = (byte)var0;
      if (iz == null) {
         iz = new byte[1];
         iA = new String[1];
         iE = new int[1];
         iB = new byte[1];
         iC = new byte[1];
         iD = new byte[1];
      } else {
         byte[] var2 = new byte[iz.length + 1];
         String[] var3 = new String[iA.length + 1];
         int[] var4 = new int[iE.length + 1];
         byte[] var5 = new byte[iB.length + 1];
         byte[] var6 = new byte[iC.length + 1];
         byte[] var7 = new byte[iD.length + 1];

         for (int var8 = 0; var8 < iz.length; var8++) {
            var2[var8] = iz[var8];
            var3[var8] = iA[var8];
            var4[var8] = iE[var8];
            var5[var8] = iB[var8];
            var6[var8] = iC[var8];
            var7[var8] = iD[var8];
         }

         iz = var2;
         iA = var3;
         iE = var4;
         iB = var5;
         iC = var6;
         iD = var7;
      }

      int var10000 = iz.length - 1;
      byte var13 = var0;
      var0 = var10000;
      iz[var0] = var13;
      var10000 = iA.length - 1;
      String var14 = var1;
      var0 = var10000;
      iA[var0] = var14;
      var0 = iE.length - 1;
      iE[var0] = -1;
   }

   private static void c(int var0, String var1) {
      c(58, var0 + 0, var1);
   }

   private static void cK() {
      m(57, 4, 19);
      iz = null;
      iA = null;
      iE = null;
      if (jV) {
         a((byte)0, u(6));
      }

      a((byte)1, u(7));
      if (z == 0) {
         a((byte)3, u(9));
      }

      a((byte)4, u(165));
      cN();
      if (!v(23)) {
         a(0, (byte)0);
      }

      a(1, (byte)-1);
      a(2, (byte)4);
      i(u(11));
      if (j.a()) {
         a(57, 9, true);
      }
   }

   private static void cL() {
      m(57, 4, 19);
      iz = null;
      iA = null;
      iE = null;
      if (jV) {
         a((byte)0, u(6));
      }

      a((byte)1, u(7));
      a((byte)3, u(9));
      a((byte)4, u(165));
      cN();
      a(0, (byte)7);
      a(1, (byte)-1);
      a(2, (byte)6);
      i(u(13));
      if (j.a()) {
         a(57, 9, true);
      }
   }

   private static void cM() {
      m(57, 4, 7);
      iz = null;
      iA = null;
      iE = null;
      String var0 = u(159);
      String var1;
      if (aX) {
         var1 = u(305);
      } else {
         var1 = u(306);
      }

      ad[0] = var1;
      var0 = a(var0, ad, '%');
      a((byte)5, var0);
      var0 = u(160);
      if (aW) {
         var1 = u(305);
      } else {
         var1 = u(306);
      }

      ad[0] = var1;
      var0 = a(var0, ad, '%');
      a((byte)6, var0);
      var0 = u(161);
      if (aY) {
         var1 = u(305);
      } else {
         var1 = u(306);
      }

      ad[0] = var1;
      var0 = a(var0, ad, '%');
      a((byte)7, var0);
      a((byte)8, u(10));
      a((byte)9, u(163));
      cN();
      if (!kj) {
         a(0, (byte)1);
      } else {
         a(0, (byte)3);
      }

      a(1, (byte)-1);
      a(2, (byte)4);
      i(u(11));
      if (j.a()) {
         a(57, 9, false);
      }
   }

   private static void bb(int var0) {
      switch (iF[var0]) {
         case 0:
            if (aW) {
               a(61);
            }

            dl();
            if (gn) {
               lq = true;
               ls = 43;
               b(66, true, false);
               return;
            }

            if (hE) {
               lq = true;
               ls = 77;
               b(67, true, false);
               hE = false;
               return;
            }

            if (i != 6) {
               lq = true;
               lr = true;
               ls = -1;
               aH();

               try {
                  Thread.sleep(50L);
                  return;
               } catch (Exception var1) {
                  return;
               }
            }

            lq = true;
            ls = 13;
            b(22, true, false);
            b(76, true, false);
            P(kn, ko);
            if (gi) {
               au(gj, gk);
               return;
            }
            break;
         case 1:
            a(61);
            cK();
            return;
         case 2:
            a(61);
            cM();
            return;
         case 3:
            a(61);
            cL();
            return;
         case 4:
            a(60);
            a(6, u(44), 36);
            return;
         case 5:
            if (aW) {
               a(61);
            }

            lD = false;
            lE = false;
            kj = false;
            if (lC == 2) {
               if (ks != null && ks.ag != null) {
                  ks.ag.b(true);
               }

               for (int var3 = 0; var3 < kx; var3++) {
                  if (kO[var3] != null) {
                     q.a(kO[var3], 0);
                  }
               }

               dm();
               lq = true;
               lr = true;
               ls = -1;
               return;
            }
            break;
         case 6:
            a(60);
            a(6, u(339), 47);
            break;
         case 7:
            if (aW) {
               a(61);
            }

            lD = false;
            kj = false;
            kg = false;
            b(27, false, false);
            if (lC == 2) {
               b(42, true, false);
               k(21, 1, kJ ? 1 : 0);

               for (int var2 = 4; var2 <= 13; var2++) {
                  d(21, var2, !kJ);
               }

               lq = true;
               lr = true;
               ls = -1;
               return;
            }
      }
   }

   private static void cN() {
      b(et, 57, 8, ag[57][8][2], ag[57][8][3]);
      int var0 = et[2] - et[0];
      iH.k();
      iH.b();
      iH.a(0);
      iH.c(ag[57][11][5]);
      iH.d(ag[57][11][6]);
      int var1 = iz.length;
      iH.b(var1);
      iH.g(var0 + 1);
      iH.h(53);
      iH.e(var0);
      iH.f(ag[57][11][7] + 52);
      au(58);
      O(58, ag[58].length + 1 * (var1 - 1));
      int var2 = 0;

      for (int var3 = 0; var3 < var1; var3++) {
         if (var3 != 0) {
            q(58, 0, var3);
            short var4 = ag[58][0][2];
            var2 = ag[58][0][3] + iH.a(var3, false);
            c(58, var3, 2, var4 + iH.i(var3));
            c(58, var3, 3, var2);
            if (j.a() && iz[var3] == 2) {
               c(58, var3 + 0, 7, 6);
               c(58, var3 + 0, 17, 2);
            }
         }
      }

      for (int var13 = 0; var13 < var1; var13++) {
         var0 = var13;
         if (iB[var0] == 0) {
            int var10001 = var13 + 0;
            var0 = var13;
            c(58, var10001, iA[var0]);
         } else {
            var2 = var13 + 0;
            c(58, var2, 11, -1);
            en[58][var2] = null;
            int var14 = var13 + 0;
            var0 = var13;
            c(58, var14, 18, iB[var0]);
            var14 = var13 + 0;
            var0 = var13;
            c(58, var14, 19, iC[var0]);
            var14 = var13 + 0;
            var0 = var13;
            c(58, var14, 20, iD[var0]);
            var14 = var13 + 0;
            var0 = var13;
            c(58, var14, 21, iD[var0]);
         }
      }

      iH.a(true);
      iH.b(false);
      iJ = et[0];
      iK = et[1];
      iI[0] = ag[57][11][2];
      iI[1] = ag[57][11][3];
      iI[2] = ag[57][11][5];
      iI[3] = ag[57][11][6];
      iH.k();
      iL = 0;
   }

   private static void bb(int var0, int var1) {
      int var2 = iH.c();
      int var3 = iH.d();
      int var18 = var3;
      var2 = i(58, var2, var18, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm && !u.c && aR >= 400) {
         var0 = iL;
         var0 = iL;
         switch (iz[var0]) {
            case 0:
               a(60);
               String var6;
               if ((var6 = m.k()) != null && !var6.equals("0")) {
                  String var14;
                  if ((var14 = System.getProperty("IMEI")) != null) {
                     byte[] var10000 = var14.getBytes();
                     var14 = f(var10000, var10000.length);
                  }

                  var6 = var6 + "&opref=" + var14;
                  String var15 = "MIDlet-Version";
                  String var16;
                  if ((var16 = ap.getAppProperty(var15)) != null) {
                     String var7 = var6 + "&extra_13=";
                     String var17 = b.a(var16);
                     var6 = var7 + var17;
                  }
               }

               q(var6);
               break;
            case 1:
               a(60);
               cM();
               break;
            case 2:
               eK = true;
               a(60);
               dl();
               dI();
               break;
            case 3:
               a(60);
               b(25, true, false);
               lq = true;
               ls = 50;
               b(27, false, false);
               break;
            case 4:
               a(60);
               if (!v(24)) {
                  ki++;
               }

               b(24, true, false);
               lq = true;
               ls = 68;
               b(27, false, false);
               break;
            case 5:
               if (aX = !aX) {
                  d.k();
                  a(26);
               } else {
                  d.k();
               }

               String var12 = u(159);
               String var22;
               if (aX) {
                  var22 = u(305);
               } else {
                  var22 = u(306);
               }

               ad[0] = var22;
               String var13 = a(var12, ad, '%');
               c(var0, var13);
               break;
            case 6:
               if (aW = !aW) {
                  d.k();
                  a(60);
               }

               String var10 = u(160);
               String var21;
               if (aW) {
                  var21 = u(305);
               } else {
                  var21 = u(306);
               }

               ad[0] = var21;
               String var11 = a(var10, ad, '%');
               c(var0, var11);
               break;
            case 7:
               a(60);
               if (aY) {
                  aY = false;
               } else {
                  ef();
                  aY = true;
               }

               String var8 = u(161);
               String var20;
               if (aY) {
                  var20 = u(305);
               } else {
                  var20 = u(306);
               }

               ad[0] = var20;
               String var9 = a(var8, ad, '%');
               c(var0, var9);
               break;
            case 8:
               a(60);
               a(6, u(138), 13);
               break;
            case 9:
               a(60);
               b(23, true, false);
               b(27, false, false);
               lq = true;
               ls = 67;
         }

         an();
      }
   }

   private static void bc(int var0) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
         bf();
         bc();
         x();
      }

      if (var0 == 1) {
         bg();
         bd();
         y();
      }

      if (var0 == 3) {
         H(iV, aq);
      }
   }

   private static void bc(int var0, int var1) {
      if (var0 == 0) {
         m(bf(iV), true);
         c(94, 6, 26, ab.e[42]);
         c(94, 5, 26, ab.e[41]);
         cO();
         be(bf(iV));
      }

      if (var0 == 2) {
         aV();
         cO();
      }

      if (var0 == 5) {
         switch (var1) {
            case 4:
               a(61);
               boolean var4 = false;
               b(26, false, false);
               break;
            case 5:
               if (W(ck | cl)) {
                  iN = false;
                  iM = true;
               }
               break;
            case 6:
               if (W(ck | cl)) {
                  iN = true;
                  iM = false;
               }
         }

         if (W(cm)) {
            if (iN) {
               short var5 = ag[94][6][26];

               try {
                  ab.e[42] = var5;
                  j();
                  if (var5 == 0) {
                     if (aX) {
                        d.e(0);
                        aX = false;
                     }
                  } else if (!aX) {
                     aX = true;
                  }
               } catch (Exception var3) {
               }

               a(26);
               iN = false;
            } else if (iM) {
               short var6 = ag[94][5][26];

               try {
                  d.f(var6);
                  ab.e[41] = var6;
                  j();
                  if (var6 == 0) {
                     if (aW) {
                        d.e(0);
                        d.e(0);
                        d.e(0);
                        d.e(0);
                        aW = false;
                     }
                  } else if (!aW) {
                     aW = true;
                  }
               } catch (Exception var2) {
               }

               a(60);
               iM = false;
            }
         }
      }

      if (var0 == 3) {
         cY();
      }
   }

   private static void cO() {
      short var0 = ag[94][6][26];
      short var1 = ag[94][5][26];
      String var2 = u(159);
      String var3 = u(160);
      ad[0] = "" + var0;
      var2 = a(var2, ad, '%');
      a(94, 7, var2);
      ad[0] = "" + var1;
      var3 = a(var3, ad, '%');
      a(94, 8, var3);
   }

   private static void bd(int var0) {
      if (var0 == 0) {
         cX();
         m(bf(iV), true);
         String var1 = iO;
         a(97, 2, var1, false);
      }

      if (var0 == 3) {
         H(iV, aq);
      }
   }

   private static void bd(int var0, int var1) {
      if (var0 == 0) {
         bP();
         m(bf(iV), true);
      }

      if (var0 == 5) {
         switch (var1) {
            case 3:
               b(79, false, false);
               b(64, true, false);
               b(68, true, true);
               b(64, true, false);
               b(22, true, false);
               b(true);
               h();
               return;
            case 4:
               b(79, false, false);
               by = 1;
               M(3);
               bz = 5;
         }
      }
   }

   private static void be(int var0, int var1) {
      if (var0 == 0) {
         cX();
         m(bf(iV), true);
         if (q.an.au == 1) {
            ;
         }

         aQ();
      }

      if (var0 == 1) {
         aR();
      }

      if (var0 == 3) {
         H(iV, aq);
         cY();
      }

      if (var0 == 2) {
         int var2 = ab.e[2];
         int var3 = ab.e[1];
         int var4 = ab.e[4];
         int var5 = ab.e[3];
         if (var2 != var3 || var4 != var5) {
            bh(64);
         }

         String var16 = "";
         a(69, 11, var16, false);
         long var6;
         if (q.an.au == 1 && R != -1) {
            var6 = q.an.aV[R].al - (g - q.an.aV[R].aA);
            long var20 = (q.an.aV[R].aC - var6) * 100L;
            long var22 = q.an.aV[R].aC;
            var2 = (int)(var20 / var22);
            String var18 = "";
            a(69, 11, var18, false);
         } else {
            var6 = q.an.al - (g - q.an.aA);
            long var8 = (q.an.aC - var6) * 100L;
            long var10 = q.an.aC;
            var2 = (int)(var8 / var10);
            if (q.an.au == 10) {
               m(69, 11, 35);
            } else {
               if (q.an.au == 2) {
                  var3 = o(3)[q.an.ar][39];
               } else if (q.an.au == 8) {
                  var3 = o(5)[q.an.ar][18];
               } else {
                  var3 = o(4)[q.an.ar][37];
               }

               String var17 = j(var3, 1);
               a(69, 11, var17, false);
            }
         }

         long var19;
         String var21 = String.valueOf((var19 = var6 / 1000L) % 60L);
         String var9 = String.valueOf(var19 / 60L % 60L);
         String var23 = String.valueOf(var19 / 3600L);
         if (var21.length() == 1) {
            var21 = "0" + var21;
         }

         if (var9.length() == 1) {
            var9 = "0" + var9;
         }

         if (var23.length() == 1) {
            var23 = "0" + var23;
         }

         String var11 = String.valueOf(q.E());
         String var15;
         if (e == 17) {
            var15 = var23 + " : " + var9 + " : " + var21;
         } else {
            var15 = var23 + ":" + var9 + ":" + var21;
         }

         a(69, 8, var11);
         a(69, 7, var15);
         if (var2 >= 100) {
            if (!F()) {
               a(69, 7, "00:00:00");
            } else {
               if (q.an.au == 1 && R != -1) {
                  q.an.aV[R].z();
                  R = -1;
               } else {
                  q.an.z();
               }

               q.h();
               b(18, false, false);
            }
         }

         o(69, 2, var2);
      }

      if (var0 == 5) {
         if (var1 == 10) {
            var0 = q.E();
            if (a(false, var0)) {
               a(71);
               cR();
               if (q.an.au == 1 && R != -1) {
                  q.an.aV[R].z();
                  if (F()) {
                     if (q.an.aV[R].bg.e[16] == 0) {
                        b(60, true, false);
                     } else {
                        k(0, q.an.aV[R].ar, true);
                     }
                  }
               } else {
                  q.an.z();
               }

               if (q.an.au != 1 && R == -1 || !F()) {
                  q.h();
               }
            }

            return;
         }

         if (var1 == 9) {
            a(61);
            cR();
         }
      }
   }

   private static void bf(int var0, int var1) {
      if (var0 == 0) {
         bP();
         au(98);
         au(61);
         cP();
         m(49, true);
         be(49);
      }

      if (var0 == 2) {
         H(iV, aq);
         iP.i();
         int var2 = cB;
         int var3 = cC;
         if (b(var2, var3, iQ)) {
            if (X(cl)) {
               iP.b(cD, cE);
            }

            if (W(cm)) {
               iP.a(cD, cE);
               if ((var2 = iP.c(cB, cC)) >= 0) {
                  iR = var2;
                  bg(var2, cm);
                  iP.j();
               }
            }

            if (X(cl | ck) && (var2 = iP.c(cB, cC)) >= 0) {
               bg(var2, ck);
            }
         }

         if (u.c) {
            aR = 0;
         }
      }

      if (var0 == 5) {
         switch (var1) {
            case 2:
               boolean var5 = false;
               b(49, false, false);
               break;
            case 3:
               a(60);
               int var9 = 0;

               for (int var11 = 0; var11 < ((Object[])null).length; var11++) {
                  if (((Object[])null)[var11]) {
                     var9++;
                  }
               }

               e[] var12 = new e[var9];
               var9 = 0;

               for (int var4 = 0; var4 < ((Object[])null).length; var4++) {
                  if (((Object[])null)[var4]) {
                     var12[var9] = null;
                     var9++;
                  }
               }

               a(u(228), "|", "");
               return;
            case 4:
            case 5:
            default:
               break;
            case 6:
               a(60);

               for (int var8 = 0; var8 < ((Object[])null).length; var8++) {
                  ((Object[])null)[var8] = true;
                  d(98, 2 + var8 * 3, ((Object[])null)[var8]);
               }

               cP();
               return;
         }
      }
   }

   private static void cP() {
      a(61, 6, false);
      c(61, 3, false);
   }

   private static void bg(int var0, int var1) {
      int var2 = iP.c();
      int var3 = iP.d();
      int var6 = var3;
      var2 = i(98, var2, var6, -1);
      if (var0 != -1 && var2 != -1 && var1 == cm && !u.c && aR >= 400) {
         var1 = var2;
         var0 = iR;
         switch (var1 % 3) {
            case 0:
               ((Object[])null)[var0] = !((Object[])null)[var0];
               d(98, 2 + var0 * 3, ((Object[])null)[var0]);
               cP();
         }
      }
   }

   private static void bh(int var0, int var1) {
      iS = var0;
      iT = var1;
      iU = false;
      if (var0 != -1 && var1 != -1) {
         a(iS, iT, true);
      }
   }

   private static void s(int var0, int var1, int var2) {
      iV = var0;
      switch (var0) {
         case 2:
            int var30 = var2;
            var0 = var1;
            if (var1 == 0) {
               a(2, 0, aW());
               if (J(2, 0)) {
                  a(2, 0, F());
               }

               if (v(67) || v(61) || v(66)) {
                  a(2, 0, false);
               }

               c(2, 1, "Cheats");
            }

            if (var0 == 2) {
               if (cH) {
                  cH = false;
                  a(2, 0, aW());
                  if (v(67) || v(76) || v(61) || v(66)) {
                     a(2, 0, false);
                  }
               }

               a(2, 1, false);
            }

            if (var0 == 5) {
               switch (var30) {
                  case 0:
                     s(true);
                     return;
                  case 1:
                     return;
                  case 2:
                     a(60);
                     boolean var56 = false;
                     if ((S += 10) > cR) {
                        S = cR;
                     }

                     return;
                  case 3:
                     a(60);
                     boolean var55 = false;
                     if ((S -= 10) < cQ) {
                        S = cQ;
                     }
               }
            }

            return;
         case 3:
            int var29 = var2;
            var0 = var1;
            if (var1 == 0) {
               if (!F()) {
                  for (int var53 = 0; var53 < 17; var53++) {
                     if (ag[3][var53][0] == 6) {
                        b(3, var53, true);
                     }
                  }
               }

               b(3, 8, !F() || dE());
               b(3, 9, !F() || dE());
               bS();
               d(3, 16, dh > 0L && !K(3, 9));
               if (!bj()) {
                  a(3, 8, false);
               }

               bR();
            }

            if (var0 == 3) {
               H(iV, aq);
            }

            if (var0 == 2) {
               bR();
            }

            if (var0 == 5) {
               switch (var29) {
                  case 8:
                     a(60);
                     dd();
                     a("Coin", false, 0);
                     return;
                  case 9:
                     a(60);
                     dd();
                     if (bj()) {
                        a("Cash", true, 0);
                        return;
                     }

                     a("Cash", false, 0);
                     return;
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  default:
                     break;
                  case 14:
                     if (q.am == 1) {
                        a(28);
                        q.r();
                     } else {
                        v var54 = q.ah;
                        q.p();
                        if (var54.au == 8 && b(5, ff, 20) == 1) {
                           j[3][var54.ao].c(var54.ap);
                           q.a(z, 8, b(5, ff, 0), var54.av + 24, var54.aw - 24);
                        }

                        y = true;
                     }

                     M = true;
                     return;
                  case 15:
                     a(61);
                     if (q.am == 1) {
                        q.s();
                     } else {
                        q.q();
                     }

                     M = true;
               }
            }

            return;
         case 4:
            int var28 = var2;
            var0 = var1;
            if (var1 == 0) {
               bP();
               bT();
            }

            if (var0 == 2) {
               H(iV, aq);
               int var84 = jb[73];
               int var48 = 0;
               switch (var84) {
                  case 1:
                     jc[73][2] = jc[73][2] - 179200 * aq / 1000;
                     jc[73][1] = y(jc[73][2]);
                     int var61 = 300 - dM * 75;
                     if (jc[73][1] <= var61) {
                        jc[73][1] = var61;
                        jb[73] = 0;
                        var48 = iW[73];
                        if (!v(63)) {
                           ay(var48);
                        }
                     }
                     break;
                  case 2:
                     jc[73][2] = jc[73][2] + 179200 * aq / 1000;
                     jc[73][1] = y(jc[73][2]);
                     if (jc[73][1] >= 300) {
                        b(73, false, false);
                     }
               }

               if (q.an != null && v(73) && jb[73] == 0) {
                  b(73, false, true);
               }
            }

            if (var0 == 5) {
               if (v(9)) {
                  return;
               }

               switch (var28) {
                  case -2:
                     if (!v(63) && jb[73] == 0) {
                        b(73, false, true);
                     }
                  case -1:
                  case 0:
                  case 1:
                  default:
                     break;
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                     a(60);
                     var2 = var28 - 2;
                     dP = dK[var2];
                     if (dQ[dP][11] > 0) {
                        byte var51 = 30;
                        byte var62 = 0;
                        if (dQ[dP][13] == 0) {
                           var51 = 17;
                           var62 = 2;
                        } else if (dQ[dP][13] == 1) {
                           var51 = 53;
                           var62 = 0;
                        }

                        au(8);
                        byte var68 = var51;
                        String var64 = "";
                        fs = false;
                        a(1, var64, 32, true, -1, null, var68, var62, false, "");
                        String var70 = u(dQ[dP][6] + 1);
                        a(8, 2, var70, false);
                        a(8, 3, true);
                        d(8, 4, true);
                        q.h();
                        dQ[dP][11] = 0;
                        bI();
                     } else if (!v(63) && !v(9)) {
                        b(63, true, true);
                     }

                     bT();
                     G();
               }
            }

            if (var0 == 6) {
               a(74);
               jb[73] = 1;
               jc[73][2] = 76800;
            }

            if (var0 == 7) {
               a(73);
               jb[73] = 2;
               var2 = 300 - dM * 75;
               jc[73][2] = var2 << 8;
            }

            return;
         case 5:
            int var27 = var2;
            var0 = var1;
            if (var1 == 0) {
               bP();
               a(5, 2, dG() || ab.e[35] > 0);
               a(5, 1, dF() || ab.e[36] > 0);
               if (F()) {
                  b(69, false, true);
               }
            }

            if (var0 == 2) {
               int var82 = jb[70];
               boolean var47 = false;
               switch (var82) {
                  case 1:
                     jc[70][2] = jc[70][2] - 179200 * aq / 1000;
                     jc[70][1] = y(jc[70][2]);
                     if (jc[70][1] <= 0) {
                        jc[70][1] = 0;
                        jb[70] = 0;
                        ay(iW[70]);
                     }
                     break;
                  case 2:
                     jc[70][2] = jc[70][2] + 179200 * aq / 1000;
                     jc[70][1] = y(jc[70][2]);
                     if (jc[70][1] >= 240) {
                        if (F()) {
                           b(69, true, true);
                        }

                        b(70, false, false);
                     }
               }
            }

            if (var0 == 5) {
               switch (var27) {
                  case -2:
                     a(60);
                     if (jb[70] == 0) {
                        b(70, false, true);
                        b(69, false, true);
                     }
                  case -1:
                  case 0:
                  default:
                     break;
                  case 1:
                     a(60);
                     b(67, true, false);
                     break;
                  case 2:
                     a(60);
                     M(14);
                     break;
                  case 3:
                     a(60);
                     b(66, true, false);
                     break;
                  case 4:
                     M(6);
               }
            }

            if (var0 == 6) {
               a(76);
               jb[70] = 1;
               jc[70][2] = 61440;
            }

            if (var0 == 7) {
               a(75);
               jb[70] = 2;
               jc[70][2] = 0;
            }

            if (var0 == 3) {
               H(iV, aq);
            }

            return;
         case 6:
            int var26 = var2;
            var0 = var1;
            if (var1 == 0) {
               bP();
               G();
            }

            if (var0 == 2) {
               H(iV, aq);
               if (z == 0 && F()) {
                  int var60 = 0;

                  boolean var10002;
                  while (true) {
                     if (var60 > 0) {
                        var10002 = false;
                        break;
                     }

                     boolean var45 = false;
                     if (ab.e[7] > 0 && cT[0] <= 0) {
                        var10002 = true;
                        break;
                     }

                     var60++;
                  }

                  d(6, 5, var10002);
               }

               switch (jb[68]) {
                  case 0:
                     if (dE()) {
                        f(15, 6, -1, -1);
                     }
                     break;
                  case 1:
                     eL = eL + aq;
                     var2 = eM + eL * (eN - eM) / 160;
                     c(6, 0, 2, var2);
                     c(6, 3, 2, mJ - var2);
                     if (eL > 160) {
                        c(6, 0, 2, eN);
                        c(6, 3, 2, mJ - eN);
                        jb[68] = 0;
                     }
                     break;
                  case 2:
                     b(68, false, false);
               }
            }

            if (var0 == 6) {
               eM = (eN = ag[6][0][2]) - 100;
               eL = 0;
               c(6, 0, 2, eM);
               c(6, 3, 2, mJ - eM);
               jb[68] = 1;
            }

            if (var0 == 7) {
               fm = ag[6][0][2];
               fl = eN + 100;
               fk = 0;
               jb[68] = 2;
            }

            if (var0 == 5 && jb[68] == 0) {
               switch (var26) {
                  case 0:
                     if (dM == 0) {
                        b(0, u(5179), 17);
                        return;
                     }

                     if (!v(73) || jb[73] == 2 && !eP) {
                        b(73, true, true);
                        return;
                     }

                     eP = false;
                     b(73, false, true);
                     if (v(63)) {
                        b(63, false, true);
                        return;
                     }
                     break;
                  case 3:
                     if (z == 0) {
                        if (v(70) && jb[70] != 2) {
                           if (z == 0) {
                              b(70, false, true);
                              return;
                           }

                           b(71, false, true);
                           return;
                        }

                        if (z == 0) {
                           b(70, true, true);
                           return;
                        }

                        b(71, true, true);
                        return;
                     }

                     if (aW) {
                        a(61);
                     }

                     dA();
               }
            }

            return;
         case 7:
            V(var1, var2);
            return;
         case 8:
            W(var1, var2);
            return;
         case 9:
            Y(var1, var2);
            return;
         case 10:
            aa(var1, var2);
            return;
         case 11:
            ac(var1, var2);
            return;
         case 12:
            aK(var1, var2);
            return;
         case 13:
            int var25 = var2;
            var0 = var1;
            if (var1 == 0) {
               bP();
               bW();
               P(eR, 0);
               q.h();
               q.c(z, 4);
               a(2, 0, false);
               a(13, 30, aW());
               a(13, 30, F());
               lt = 2;
               lq = true;
               ls = 13;
            }

            if (var0 == 2) {
               f(13, 16, false);
               switch (eT) {
                  case 0:
                     var2 = 0;

                     for (; var2 < ag[27].length; var2++) {
                        int var57 = var2 / 20;
                        if (fh[var57] != -1000) {
                           if (fh[var57] > 0) {
                              fh[var57] = fh[var57] - aq;
                           } else {
                              a(60);
                              f(var57, false);
                              d(27, 19 + var57 * 20, true);
                              fh[var57] = -1000;
                              kk = true;
                              kl = 5;
                           }
                        }

                        short[] var58 = ag[27][var2];
                        if ((var2 + 1) % 20 == 0) {
                           short var4 = var58[5];
                           a var69 = er[var4];
                           var4 = var58[6];
                           short var5;
                           if ((var5 = var58[7]) >= 0 && var69 != null) {
                              int var7 = var58[12] + aq;
                              if ((var5 & 1536) != 0) {
                                 var5 &= -1537;
                                 int var8 = var69.a(var5);
                                 if (var4 < var8 - 1) {
                                    var5 = var69.a(var5, var4) * es;
                                    if (var7 >= var5) {
                                       var7 = 0;
                                       var58[6] = (short)((var4 + 1) % var8);
                                       if (var58[6] == var8 - 1) {
                                          var58[9] = 1;
                                       }
                                    }
                                 } else {
                                    var58[12] = 1;
                                 }
                              } else {
                                 int var71 = var69.a(var5);
                                 var5 = var69.a(var5, var4) * es;
                                 if (var7 >= var5) {
                                    var7 = 0;
                                    var58[6] = (short)((var4 + 1) % var71);
                                    d(27, var2, false);
                                    if (fh[var2 / 20] == -1000) {
                                       e(var2 / 20, true);
                                    } else {
                                       f(var2 / 20, true);
                                    }
                                 }
                              }

                              var58[12] = (short)var7;
                           }
                        }
                     }

                     bY();
                     H(27, aq);
                     break;
                  case 1:
                     String var39 = u(307);
                     ad[0] = "" + aJ();
                     String var40 = a(var39, ad, '%');
                     ad[0] = "" + ab.e[7];
                     String var41 = a(var40, ad, '#');
                     if (!v(75)) {
                        f(13, 16, true);
                     }

                     a(13, 16, var41);
                     bY();
                     break;
                  case 2:
                     bY();
                     break;
                  case 3:
                     String var36 = u(329);
                     ad[0] = "" + aK();
                     String var37 = a(var36, ad, '%');
                     ad[0] = "" + ab.e[7];
                     String var38 = a(var37, ad, '#');
                     if (!v(75)) {
                        f(13, 16, true);
                     }

                     a(13, 16, var38);
                     bY();
                     break;
                  case 4:
                     ca();
               }

               if (u.c) {
                  aR = 0;
               }
            }

            if (var0 == 3) {
               av(iV);
            }

            if (var0 == 4) {
               switch (eT) {
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                     int var43 = 0;
                     k(fc[0], fc[1], fc[2], fc[3]);
                     int var59 = fb.c();
                     var43 = fb.d();
                     i(27, var59, var43);
                     bQ();
                     h(13, 17, 0, 0);
                     h(13, 18, 0, 0);
                  default:
                     if (lt > 0) {
                        lt--;
                        lq = true;
                     }
               }
            }

            if (var0 == 5) {
               switch (var25) {
                  case 4:
                     a(60);
                     aA(4);
                     break;
                  case 5:
                     a(60);
                     aA(2);
                     break;
                  case 6:
                     a(60);
                     aA(3);
                     break;
                  case 7:
                     a(60);
                     aA(1);
                     break;
                  case 8:
                     a(60);
                     aA(0);
                  case 9:
                  case 11:
                  case 16:
                  case 17:
                  case 18:
                  case 19:
                  case 20:
                  case 21:
                  case 22:
                  case 23:
                  case 24:
                  case 25:
                  case 26:
                  case 27:
                  case 28:
                  case 29:
                  default:
                     break;
                  case 10:
                     a(61);
                     M(5);
                     break;
                  case 12:
                     a(60);
                     aB(0);
                     break;
                  case 13:
                     a(60);
                     aB(1);
                     break;
                  case 14:
                     a(60);
                     aB(2);
                     break;
                  case 15:
                     a(60);
                     aB(3);
                     break;
                  case 30:
                     s(true);
               }
            }

            if (var0 == 1) {
               a(2, 0, aW());
               a(2, 0, F());
            }

            return;
         case 14:
            ar(var1, var2);
            return;
         case 15:
            as(var1, var2);
            return;
         case 18:
            ai(var1, var2);
            return;
         case 19:
            int var24 = var2;
            var0 = var1;
            if (var1 == 0) {
               bP();
            }

            if (var0 == 2) {
               H(iV, aq);
               int var78 = jb[72];
               boolean var35 = false;
               switch (var78) {
                  case 1:
                     jc[72][2] = jc[72][2] + 179200 * aq / 1000;
                     jc[72][0] = y(jc[72][2]);
                     if (jc[72][0] >= 0) {
                        jc[72][0] = 0;
                        jb[72] = 0;
                     }
                     break;
                  case 2:
                     jc[72][2] = jc[72][2] - 179200 * aq / 1000;
                     jc[72][0] = y(jc[72][2]);
                     if (jc[72][0] <= 300) {
                        b(72, false, false);
                     }
               }
            }

            if (var0 == 5) {
               switch (var24) {
                  case 2:
                     a(60);
                     f(49, -1, -1, -1);
               }
            }

            if (var0 == 6) {
               jb[72] = 1;
               jc[72][2] = -76800;
            }

            if (var0 == 7) {
               jb[72] = 2;
               jc[72][2] = 0;
            }

            return;
         case 20:
            aY(var1, var2);
            return;
         case 23:
            af(var1, var2);
            return;
         case 24:
            ad(var1, var2);
            return;
         case 28:
            U(var1, var2);
            return;
         case 29:
            aW(var1, var2);
            return;
         case 30:
            Z(var1, var2);
            return;
         case 31:
            at(var1, var2);
            return;
         case 34:
            ag(var1, var2);
            return;
         case 36:
            al(var1, var2);
            return;
         case 37:
            an(var1, var2);
            return;
         case 40:
            int var23 = var2;
            var0 = var1;
            if (var1 == 0) {
               bP();
            }

            if (var0 == 2) {
               int var76 = jb[71];
               boolean var34 = false;
               switch (var76) {
                  case 1:
                     jc[71][2] = jc[71][2] - 179200 * aq / 1000;
                     jc[71][1] = y(jc[71][2]);
                     if (jc[71][1] <= 0) {
                        jc[71][1] = 0;
                        jb[71] = 0;
                        ay(iW[71]);
                     }
                     break;
                  case 2:
                     jc[71][2] = jc[71][2] + 179200 * aq / 1000;
                     jc[71][1] = y(jc[71][2]);
                     if (jc[71][1] >= 240) {
                        b(71, false, false);
                     }
               }
            }

            if (var0 == 5) {
               switch (var23) {
                  case -2:
                     a(60);
                     if (jb[71] == 0) {
                        b(71, false, true);
                     }
                     break;
                  case 2:
                     a(60);
                     dA();
               }
            }

            if (var0 == 6) {
               jb[71] = 1;
               jc[71][2] = 61440;
            }

            if (var0 == 7) {
               jb[71] = 2;
               jc[71][2] = 0;
            }

            return;
         case 41:
            T(var1, var2);
            return;
         case 42:
            ae(var1, var2);
            return;
         case 43:
            ax(var1, var2);
            return;
         case 45:
            av(var1, var2);
            return;
         case 46:
            az(var1, var2);
            return;
         case 48:
            ao(var1, var2);
            return;
         case 49:
            aA(var1, var2);
            return;
         case 50:
            aB(var1, var2);
            return;
         case 52:
            aD(var1, var2);
            return;
         case 53:
            aJ(var1, var2);
            return;
         case 54:
            int var22 = var2;
            var0 = var1;
            if (var1 == 0) {
               x();
               m(11, true);
               be(11);
               bO();
               a(54, 4, hr);
            }

            if (var0 == 5) {
               switch (var22) {
                  case 3:
                     cR();
                     e(true);
                     break;
                  case 5:
                     cR();
                     e(false);
               }
            }

            if (var0 == 1) {
               y();
            }

            return;
         case 55:
            int var21 = var2;
            var0 = var1;
            if (var1 == 0) {
               x();
               m(12, true);
               be(12);
               String var32 = m.h();
               m.f();
               int var3 = e(var32);
               var2 = ek() - 1;
               m(55, 6, hj[var3][var2]);
               a(55, 7, "" + (int)m.i());
               int var6 = hg[var3][var2 << 1];
               c(55, 4, 5, var6);
               j(55, 4, hg[var3][(var2 << 1) + 1]);
               q.c(z, 4);
            }

            if (var0 == 5) {
               switch (var21) {
                  case 8:
                     a(60);
                     cR();
                     br();
               }
            }

            if (var0 == 1) {
               y();
            }

            return;
         case 56:
            aH(var1, var2);
            return;
         case 57:
            ba(var1, var2);
            return;
         case 60:
            aS(var1);
            return;
         case 61:
            bf(var1, var2);
         case 16:
         case 17:
         case 21:
         case 22:
         case 25:
         case 26:
         case 27:
         case 32:
         case 33:
         case 35:
         case 38:
         case 39:
         case 44:
         case 47:
         case 51:
         case 58:
         case 59:
         case 63:
         case 66:
         case 70:
         case 72:
         case 73:
         case 74:
         case 75:
         case 81:
         case 85:
         case 87:
         case 91:
         case 95:
         default:
            return;
         case 62:
            aI(var1, var2);
            return;
         case 64:
            aL(var1, var2);
            return;
         case 65:
            aE(var1, var2);
            return;
         case 67:
            aM(var1, var2);
            return;
         case 68:
            aN(var1, var2);
            return;
         case 69:
            be(var1, var2);
            return;
         case 71:
            aF(var1, var2);
            return;
         case 76:
            int var20 = var2;
            var0 = var1;
            if (var1 == 0) {
               bP();
            }

            if (var0 == 2) {
               H(iV, aq);
               int var72 = jb[69];
               boolean var31 = false;
               switch (var72) {
                  case 1:
                     jc[69][2] = jc[69][2] - 179200 * aq / 1000;
                     jc[69][0] = y(jc[69][2]);
                     if (jc[69][0] <= 0) {
                        jc[69][0] = 0;
                        jb[69] = 0;
                     }
                     break;
                  case 2:
                     jc[69][2] = jc[69][2] + 179200 * aq / 1000;
                     jc[69][0] = y(jc[69][2]);
                     if (jc[69][0] >= 240) {
                        b(69, false, false);
                     }
               }

               if (o) {
                  c(76, 1, 6, 15);
                  c(76, 1, 8, 15);
               } else {
                  c(76, 1, 6, 16);
                  c(76, 1, 8, 16);
               }
            }

            if (var0 == 5) {
               switch (var20) {
                  case 1:
                     a(60);
                     d(!o);
                     if (o) {
                        c(76, 1, 6, 15);
                        c(76, 1, 8, 15);
                     } else {
                        c(76, 1, 6, 16);
                        c(76, 1, 8, 16);
                     }

                     jZ = 1;
               }
            }

            if (var0 == 6) {
               jb[69] = 1;
               jc[69][2] = 61440;
            }

            if (var0 == 7) {
               jb[69] = 2;
               jc[69][2] = 0;
            }

            return;
         case 77:
            aO(var1, var2);
            return;
         case 78:
            aV(var1, var2);
            return;
         case 79:
            aU(var1, var2);
            return;
         case 80:
            aP(var1, var2);
            return;
         case 82:
            ap(var1, var2);
            return;
         case 83:
            aq(var1, var2);
            return;
         case 84:
            aR(var1, var2);
            return;
         case 86:
            aG(var1, var2);
            return;
         case 88:
            aX(var1, var2);
            return;
         case 89:
            aw(var1, var2);
            return;
         case 90:
            ab(var1, var2);
            return;
         case 92:
            X(var1, var2);
            return;
         case 93:
            bc(var1);
            return;
         case 94:
            bc(var1, var2);
            return;
         case 96:
            bd(var1, var2);
            return;
         case 97:
            bd(var1);
      }
   }

   static boolean v(int var0) {
      if (var0 == -1) {
         for (int var1 = 0; var1 < iX; var1++) {
            if (iY[var1]) {
               return true;
            }
         }

         return false;
      } else {
         return iY[var0];
      }
   }

   private static void k(int var0, boolean var1) {
      iZ[var0] = iY[var0];
      iY[var0] = var1;
   }

   private static void l(int var0, boolean var1) {
      if (var1) {
         jd[var0] = jd[var0] | 1;
      } else {
         jd[var0] = jd[var0] & -2;
      }
   }

   private static void m(int var0, boolean var1) {
      if (var1) {
         jd[var0] = jd[var0] | 2;
      } else {
         jd[var0] = jd[var0] & -3;
      }
   }

   private static void be(int var0) {
      jd[var0] = jd[var0] | 4;
   }

   private static void cQ() {
      for (int var0 = 0; var0 < iX; var0++) {
         k(var0, false);
      }
   }

   static void a(int var0, boolean var1, boolean var2) {
      b(68, true, true);
   }

   private static void b(int var0, boolean var1, boolean var2) {
      jd[var0] = 0;
      if (var1 || !var1 && !var2) {
         k(var0, var1);
      }

      if (var1) {
         int var3 = var0;
         int var4 = iW[var3];
         cX();
         au(iW[var3]);
         jc[var3][0] = 0;
         jc[var3][1] = 0;
         jd[var3] = 0;
         s(var4, 0, 0);
         je[var0]++;
         f(15, var0, -1, -1);
      }

      if (var2 && iY[var0]) {
         int var6 = var0;
         var2 = iW[var6];
         if (var1) {
            s(var2, 6, 0);
         } else {
            s(var2, 7, 0);
         }
      }

      if (var1 && !iY[var0]) {
         iZ[var0] = false;
      }
   }

   private static void cR() {
      int var0 = iV;

      for (int var1 = 0; var1 < iX; var1++) {
         int var2 = var1;
         if (iW[var2] == var0) {
            b(var1, false, false);
            return;
         }
      }
   }

   private static int bf(int var0) {
      for (int var1 = 0; var1 < iX; var1++) {
         int var2 = var1;
         if (iW[var2] == var0) {
            return var1;
         }
      }

      return -1;
   }

   private static void cS() {
      for (int var0 = 0; var0 < iX; var0++) {
         au(var0);
      }
   }

   private static void cT() {
      for (int var1 = 0; var1 < iX; var1++) {
         int var0 = var1;
         int var8 = var1;
         int var3 = iW[var8];
         int var2 = iS;
         if ((iS < 0 || var2 == var3) && iY[var0]) {
            int var4 = var0;
            if ((jd[var4] & 1) == 0) {
               var2 = jc[var0][0];
               var0 = jc[var0][1];
               int var6 = var0;
               int var5 = var2;
               var4 = var3;
               int var7 = -1;
               var8 = var4;
               var8 = ag[var8].length;
               if (X(ck)) {
                  var8--;

                  while (var8 >= 0 && var7 == -1) {
                     switch (G(var4, var8)) {
                        case 6:
                           int var10 = var8;
                           int var9 = var4;
                           boolean var11 = false;
                           boolean var10000;
                           if (K(var9, var10)) {
                              var10000 = false;
                           } else if (!J(var9, var10)) {
                              var10000 = false;
                           } else {
                              a(et, var9, var10, var5, var6);
                              if (a(cB, cC, et[0], et[1], et[2], et[3]) && X(ck)) {
                                 var11 = true;
                              }

                              var10000 = var11;
                           }

                           if (var10000) {
                              var7 = var8;
                           }
                        default:
                           var8--;
                     }
                  }
               }

               var4 = var7;
               var2 = i(var3, var2, var0, iT);
               var5 = var4;
               s(var3, 11, var5);
               var5 = var2;
               var4 = var3;
               if (var5 != -1 && (!F() || dE())) {
                  var2 = var5;
                  f(200, var4, var2, -1);
               }

               s(var4, 5, var5);
            }
         }

         if (iY[var1] && (jd[var1] & 2) != 0) {
            break;
         }
      }
   }

   private static void cU() {
      for (int var0 = 0; var0 < iX; var0++) {
         bh(var0);
         if (iZ[var0] && (jd[var0] & 2) != 0) {
            break;
         }
      }
   }

   private static void cV() {
      if (cN) {
         int var0 = iX - 1;

         for (int var1 = 0; var1 < iX; var1++) {
            if (iZ[var1] && (jd[var1] & 4) != 0) {
               var0 = var1;
               break;
            }
         }

         for (int var5 = iX - 1; var5 >= 0; var5--) {
            int var4 = var5;
            int var2 = iW[var4];
            if (var5 <= var0 && iZ[var5]) {
               if (!ja[var5]) {
                  ja[var5] = true;
                  s(var2, 9, 0);
               }

               int var3 = var5;
               var4 = var5;
               int var7;
               s(var7 = iW[var4], 3, 0);
               if (var7 == ls) {
                  if (lq) {
                     am = d.m[0][0];
                     g(var7, jc[var3][0], jc[var3][1], 1);
                     am = null;
                     b((Graphics)null);
                     lq = false;
                  }

                  a(am, d.l[0][0], 0, 0, false);
                  g(var7, jc[var3][0], jc[var3][1], 2);
               } else {
                  g(var7, jc[var3][0], jc[var3][1], 0);
               }

               s(var7, 4, 0);
            } else if (ja[var5]) {
               ja[var5] = false;
               s(var2, 10, 0);
            }

            if (iZ[var5] && !iY[var5]) {
               while (je[var5] > 0) {
                  je[var5]--;
                  s(var2, 1, 0);
               }

               f(14, var2, -1, -1);
            }

            iZ[var5] = iY[var5];
         }
      }
   }

   private static int bg(int var0) {
      int var1 = -1;

      for (int var2 = 0; var2 < iW.length; var2++) {
         if (iW[var2] == var0) {
            var1 = var2;
            break;
         }
      }

      return var1;
   }

   private static boolean cW() {
      boolean var0 = true;

      for (int var1 = 0; var1 < iX; var1++) {
         if (iY[var1] && (jd[var1] & 8) != 0) {
            var0 = false;
            break;
         }
      }

      return var0;
   }

   private static void bh(int var0) {
      bQ = true;
      bU = true;
      if (iY[var0]) {
         if ((var0 = iW[var0]) == 24) {
            bQ = false;
         }

         if (var0 == 15 || var0 == 50 || var0 == 49) {
            bU = false;
         }

         s(var0, 2, 0);
      }
   }

   private static void cX() {
      for (int var0 = 0; var0 < iW.length; var0++) {
         int var1 = iW[var0];

         for (int var2 = 0; var2 < ag[var1].length; var2++) {
            if (E(var1, var2) == 6) {
               e(var1, var2, false);
            }
         }
      }
   }

   private static void cY() {
      E(2130706432);
      e(am, 0, 0, i.a_, i.b_);
   }

   private static void cZ() {
      while (jo > 0) {
         int var0 = jf[0][5];
         if (v(var0)) {
            jp = (jp = jp + aq) & 65535;
            break;
         }

         db();
      }
   }

   private static void da() {
      int var0 = jf[0][0];
      jp = 0;
      switch (var0) {
         case 0:
            jf[0][5] = 7;
            b(7, true, true);
            break;
         case 1:
            jf[0][5] = 9;
            b(9, true, true);
            break;
         case 2:
            jf[0][5] = 5;
            b(5, true, true);
            lq = true;
            if (ls != 84) {
               aH();
               ls = -1;
            }
            break;
         case 3:
            jf[0][5] = 3;
            b(3, true, true);
            aH();
            ls = -1;
            d(10, 4, false);
            break;
         case 4:
            jf[0][5] = 3;
            b(3, true, true);
            a(10, 2, false);
            d(10, 4, false);
         case 5:
         default:
            break;
         case 6:
            jf[0][5] = 20;
            b(20, true, true);
            aH();
            ls = -1;
            break;
         case 7:
            jf[0][5] = 6;
            b(6, true, true);
            break;
         case 8:
            jf[0][5] = 4;
            b(4, true, true);
            break;
         case 9:
            jf[0][5] = 3;
            b(3, true, true);
            a(10, 2, false);
            d(10, 4, true);
      }

      q.c(z, 4);
   }

   private static void b(int var0, String var1, int var2) {
      a(var0, var1, -1, true, -1, null, var2, 2, false, "");
   }

   private static void d(int var0, String var1) {
      a(var0, var1, -1, -1, null);
   }

   static void a(int var0, String var1, int var2) {
      a(var0, var1, var2, -1, "");
   }

   private static void a(int var0, String var1, String var2) {
      a(var0, var1, 25, -1, var2);
   }

   private static void a(int var0, String var1, int var2, int var3, String var4) {
      a(var0, var1, var2, true, var3, var4, -1, -1, false, "");
   }

   private static void a(int var0, String var1, int var2, boolean var3, int var4, String var5, int var6, int var7, boolean var8, String var9) {
      if (jo < 14) {
         jf[jo][0] = var0;
         jf[jo][1] = 1;
         jf[jo][6] = var8 ? 1 : 0;
         jf[jo][2] = var2;
         jf[jo][4] = var4;
         jf[jo][3] = 0;
         jg[jo] = var1;
         jh[jo] = var5;
         ji[jo] = var9;
         jo++;
         jj = jg[0];
         jk = jh[0];
         jl = ji[0];
         jm = var6;
         jn = var7;
         if (jo == 1) {
            da();
         }
      }
   }

   private static boolean db() {
      if (jo > 0) {
         for (int var0 = 0; var0 < 14; var0++) {
            for (int var1 = 0; var1 < 7; var1++) {
               jf[var0][var1] = jf[var0 + 1][var1];
            }

            jg[var0] = jg[var0 + 1];
            jh[var0] = jh[var0 + 1];
            ji[var0] = ji[var0 + 1];
         }

         jo--;
         jj = jg[0];
         jk = jh[0];
         jl = ji[0];
         aR();
         if (jo > 0) {
            da();
         }
      }

      if (!dc()) {
         f(4, -1, -1, -1);
      }

      return jo > 0;
   }

   private static boolean dc() {
      return jo > 0;
   }

   private static void dd() {
      while (dc()) {
         b(jf[0][5], false, false);
         db();
      }
   }

   private static void bi(int var0) {
      int var1 = jf[0][2];
      int var5 = var0 == 1;
      switch (var1) {
         case 0:
            if (var5) {
               return;
            }
            break;
         case 1:
            if (var5) {
               a("Coin", false, 1);
               return;
            }
            break;
         case 2:
            if (var5) {
               a("Cash", bj(), 1);
               return;
            }
            break;
         case 3:
            if (var5) {
               boolean var21 = s(q.b(q.an.au), q.an.ar);
               int var24 = g(q.b(q.an.au), q.an.ar, q.an.aT);
               if (a(var21, var24)) {
                  q.an.d((byte)6);
               }

               q.h();
               return;
            }
            break;
         case 4:
         case 12:
         case 17:
         case 21:
         case 28:
         case 29:
         case 30:
         case 31:
         case 35:
         case 40:
         case 46:
         default:
            var1 = jf[0][5];
            s(iW[var1], 8, var5 ? 0 : 1);
            break;
         case 5:
            if (var5) {
               var1 = q.E();
               if (a(false, var1)) {
                  a(71);
                  q.an.z();
               }

               q.h();
               return;
            }
            break;
         case 6:
            if (var5) {
               if (a(true, q.an.C())) {
                  q.an.ar();
               }

               ck();
               return;
            }
            break;
         case 7:
            if (var5) {
               a(30);
               q.an.m(z);
               ab.a(q.an.bh.e[0], 3);
               q.a(q.an, z);
               q.an = null;
               return;
            }
            break;
         case 8:
            if (var5) {
               Q.ag().p(R);
               a(30);
               Q.am();
               ab.a(Q.bg.e[0], 2);
               q.a(Q, z);
               Q = null;
               b(65, false, false);
               R = -1;
               ck();
               return;
            }
            break;
         case 9:
            if (var5) {
               r var18;
               (var18 = q.an.aV[0]).ag().p(0);
               a(30);
               var18.am();
               ab.a(var18.bg.e[0], 2);
               q.a(var18, z);
               q.an.d((byte)4);
               q.i();
               return;
            }
            break;
         case 10:
            if (var5) {
               eR = 1;
               M(6);
               return;
            }
            break;
         case 11:
            if (var5) {
               eR = 3;
               M(6);
               return;
            }
            break;
         case 13:
            if (var5) {
               a(6, u(139), 14);
               return;
            }
            break;
         case 14:
            if (var5) {
               a(6, u(140), 15);
               return;
            }
            break;
         case 15:
            if (var5) {
               q.q();
               if (q.ah != null) {
                  q.s();
               }

               M = true;
               dl();
               by = 7;
               M(3);
               bz = 5;
               return;
            }

            lq = true;
            ls = 57;
            return;
         case 16:
            if (var5) {
               b(17, false, false);
               bv();
               af(2);
               return;
            }
            break;
         case 18:
            if (var5) {
               bp();
               return;
            }
            break;
         case 19:
            if (var5) {
               bq();
               return;
            }
            break;
         case 20:
            if (var5) {
               m.g();
               bn();
               return;
            }
            break;
         case 22:
            de = false;
            return;
         case 23:
            bk();
            return;
         case 24:
            b(17, false, false);
            bk();
            return;
         case 25:
            e((boolean)var5);
            return;
         case 26:
            if (var5) {
               if (a(false, bN)) {
                  var1 = ab.e[1];
                  a(true, var1);
                  switch (jq) {
                     case 0:
                        jt.d((byte)6);
                        jq = -1;
                        jr = -1;
                        jt = null;
                        q.h();
                        return;
                     case 1:
                        ((v)jt).ar();
                        jq = -1;
                        jr = -1;
                        jt = null;
                        q.h();
                        return;
                     case 2:
                        int var22 = jr;
                        var5 = js;
                        if (eT == 0) {
                           if (q.J().ak()) {
                              var1 = eV[var22][11];
                              int var3 = eV[var22][10];
                              var1 -= var1 * var5 / 100;
                              M(5);
                              q.a(z, eV[var22][0], null, (byte)13, (byte)1, true);
                              a(var3 == 0, var1);
                              q.b(q.J());
                              var22 = eV[var22][0];
                              f(10, 0, var22, -1);
                           } else {
                              cb();
                           }

                           jq = -1;
                           jr = -1;
                           jt = null;
                           q.h();
                           return;
                        }

                        if (eT != 1 && eT != 3 && eT != 2) {
                           break;
                        }

                        int var4;
                        int var25;
                        var1 = eU;
                        var5 = eT;
                        var4 = eT;
                        var1 = var22;
                        var5 = var1;
                        label177:
                        switch (var5) {
                           case 0:
                              switch (var5) {
                                 case 0:
                                    var25 = n(b(14, var1, 0));
                                    break label177;
                                 case 1:
                                    var25 = n(b(14, var1, 1));
                                    break label177;
                                 case 2:
                                    var25 = n(b(14, var1, 2));
                                    break label177;
                                 case 3:
                                    var25 = n(b(14, var1, 3));
                                    break label177;
                                 default:
                                    var25 = -1;
                                    break label177;
                              }
                           case 1:
                              var25 = ak(b(14, var1, 6));
                              break;
                           case 2:
                              var25 = ah(b(14, var1, 5));
                              break;
                           case 3:
                              var25 = ai(b(14, var1, 4));
                              break;
                           default:
                              var25 = var1;
                        }

                        var5 = var25;
                        eZ[var4][var5] = 1;
                        aw();
                        l(48, 0);
                        q.o();
                        if (eT == 1) {
                           b(3, var1, 17);
                           b(3, var1, 16);
                           return;
                        }

                        if (eT == 3) {
                           b(4, var1, 17);
                           b(4, var1, 16);
                           return;
                        }

                        if (eT == 2) {
                           b(5, var1, 9);
                           b(5, var1, 8);
                        }

                        return;
                     case 3:
                        ((v)jt).n(jr);
                        b(62, false, false);
                        l(17, 0);
                        l(18, jr);
                        var5 = jr;
                        f(30, jr, -1, -1);
                        jq = -1;
                        jr = -1;
                        jt = null;
                        break;
                     case 4:
                        v.a(1, b(24, cd + 1, 2), gX, gY);
                        U(gW);
                        return;
                     case 5:
                        M(9);
                        return;
                  }

                  return;
               }
            } else if (q.aL) {
               q.q();
               return;
            }
            break;
         case 27:
            if (var5 && a(false, bN)) {
               ab.e[5] = ah[67 + (Q.aZ < 40 ? Q.aZ : 40) - 1];
               Q.ak();
               return;
            }
            break;
         case 32:
            b(63, true, true);
            b(73, true, true);
            return;
         case 33:
            q.H();
            bL = n(300000, 420000);
            return;
         case 34:
            if (var5) {
               if (dE()) {
                  a(72);
                  aW(R);
                  return;
               }

               if (!hT && !hU) {
                  if (a(false, aZ(), false)) {
                     a(72);
                     aW(R);
                     return;
                  }
               } else if (a(false, aZ() << 1, false)) {
                  a(72);
                  aW(R);
                  return;
               }
            }
            break;
         case 36:
            if (var5) {
               bA();
               b(true);
               ao = -1;
               return;
            }

            lq = true;
            ls = 57;
            return;
         case 37:
            if (var5) {
               r var11 = q.an.aV[R];
               a(30);
               var11.am();
               var11.ag().p(R);
               if (R != -1) {
                  q.a(var11, false);
                  R = -1;
               }

               ab.a(var11.bg.e[0], 2);
               q.a(var11, z);
               q.i();
               boolean var12 = false;
               b(60, false, false);
               R = -1;
               return;
            }
            break;
         case 38:
            if (var5) {
               if (a(false, 50)) {
                  g += 3600000L;
                  V(3600);
                  if (q.af[z][0] != null) {
                     for (int var2 = 0; var2 < q.af[z][0].length; var2++) {
                        if (q.af[z][0][var2] != null && q.af[z][0][var2].aP == 4) {
                           q.af[z][0][var2].aA = g;
                        }
                     }
                  }
               }

               bA();
               ay();
               return;
            }
            break;
         case 39:
            M(5);
            return;
         case 41:
            if (var5) {
               return;
            }
            break;
         case 42:
            if (var5) {
               hU = false;
               aV(1);
               if (hQ) {
                  q(false);
                  return;
               }
            }
            break;
         case 43:
            if (var5) {
               b(36, false, false);
               M(5);
               return;
            }
            break;
         case 44:
            cw();
            return;
         case 45:
            bE = false;
            return;
         case 47:
            if (var5) {
               b(27, false, false);
               if (lC == 2) {
                  cw();
                  b(42, false, false);
               }

               lD = false;
               lE = false;
               M(5);
               return;
            }
            break;
         case 48:
            if (var5) {
               lR = bt(hJ);
               b(46, false, false);
               cF();
               return;
            }
            break;
         case 49:
            a(84, 33, false);
            cG();
            return;
         case 50:
            a(74, 6, false);
            return;
      }
   }

   private static void bj(int var0) {
      jv[jw] = var0;
      jw++;
   }

   static void l(int var0, int var1) {
      int[] var2 = z(10, var0);
      switch (var0) {
         case 0:
            int var10000 = df();
            boolean var5 = false;
            if (var10000 == 50) {
               bl(var0);
            }
            break;
         case 1:
            if (bm(0)) {
               bl(var0);
            }
            break;
         case 2:
            if (bm(1)) {
               bl(var0);
            }
            break;
         case 3:
            if (bm(2)) {
               bl(var0);
            }
            break;
         case 4:
            if (bm(3)) {
               bl(var0);
            }
            break;
         case 5:
            if (bm(7)) {
               bl(var0);
            }
            break;
         case 6:
            if (bm(8)) {
               bl(var0);
            }
            break;
         case 7:
            if (bm(9)) {
               bl(var0);
            }
            break;
         case 8:
            if (bm(6)) {
               bl(var0);
            }
            break;
         case 9:
            if (bm(5)) {
               bl(var0);
            }
            break;
         case 10:
            if (bm(10)) {
               bl(var0);
            }
            break;
         case 11:
            if (bm(13)) {
               bl(var0);
            }
            break;
         case 12:
            var1 = 1 << var1;
            if (bp(jz |= var1) >= 10) {
               bl(var0);
            }
            break;
         case 13:
            if (jA <= var2[5]) {
               jA++;
            }

            if (jA >= var2[5]) {
               bl(var0);
            }
            break;
         case 14:
            if (jB <= var2[5]) {
               jB++;
            }

            if (jB >= var2[5]) {
               bl(var0);
            }
            break;
         case 15:
            if (var1 >= var2[5]) {
               bl(var0);
            }
            break;
         case 16:
            if (var1 >= var2[5]) {
               bl(var0);
            }
            break;
         case 17:
            if (jC <= var2[5]) {
               jC++;
            }

            if (jC >= var2[5]) {
               bl(var0);
            }
            break;
         case 18:
            var1 = 1 << var1;
            if ((jD |= var1) == 511) {
               bl(var0);
            }
            break;
         case 19:
            if (jE <= var2[5]) {
               jE++;
            }

            if (jE >= var2[5]) {
               bl(var0);
            }
            break;
         case 20:
            if (jF <= var2[5]) {
               jF += var1;
            }

            if (jF >= var2[5]) {
               bl(var0);
            }
            break;
         case 21:
            if (jG <= var2[5]) {
               jG += var1;
            }

            if (jG >= var2[5]) {
               bl(var0);
            }
            break;
         case 22:
            if (jH <= var2[5]) {
               jH++;
            }

            if (jH >= var2[5]) {
               bl(var0);
            }
            break;
         case 23:
            if (bi(4, 3) == var2[5]) {
               bl(var0);
            }
            break;
         case 24:
            if (bi(1, 3) == 1) {
               bl(var0);
            }
            break;
         case 25:
            if (bi(8, -1) >= var2[5]) {
               bl(var0);
            }
            break;
         case 26:
            if (jI <= var2[5]) {
               jI++;
            }

            if (jI >= var2[5]) {
               bl(var0);
            }
            break;
         case 27:
            if (cd <= var2[5]) {
               jJ++;
            }

            if (cd >= var2[5]) {
               bl(var0);
            }
            break;
         case 28:
            if (cd >= bO) {
               bl(var0);
            }
            break;
         case 29:
            if (aj >= var2[5]) {
               bl(var0);
            }
            break;
         case 30:
            if (aj >= var2[5]) {
               bl(var0);
            }
            break;
         case 31:
            if (jK >= var2[5]) {
               bl(var0);
            }
            break;
         case 32:
            if (jK >= var2[5]) {
               bl(var0);
            }
            break;
         case 33:
            if (jL >= var2[5]) {
               bl(var0);
            }
            break;
         case 34:
            if (jM >= var2[5]) {
               bl(var0);
            }
            break;
         case 35:
            bl(var0);
            break;
         case 36:
            bl(var0);
            break;
         case 37:
            bl(var0);
            break;
         case 38:
            bl(var0);
            break;
         case 39:
            bl(var0);
            break;
         case 40:
            bl(var0);
            break;
         case 41:
            if (jO >= var2[5] - 1) {
               bl(var0);
            }

            jO++;
            break;
         case 42:
            if (!dE()) {
               if (jP <= var2[5]) {
                  jP++;
               }

               if (jP >= var2[5]) {
                  bl(var0);
               }
            }
            break;
         case 43:
            if (jQ / 1000 >= var2[5]) {
               bl(var0);
            }
            break;
         case 44:
            if (jR >= var2[5]) {
               bl(var0);
            }
            break;
         case 45:
            if (dg() == 0) {
               bl(var0);
            }
            break;
         case 46:
            if (di() == 0) {
               bl(var0);
            }
            break;
         case 47:
            if (dh() == 0) {
               bl(var0);
            }
            break;
         case 48:
            if (bU() >= bV()) {
               bl(var0);
            }
            break;
         case 49:
            if (jS >= var2[5] - 1) {
               bl(var0);
            } else {
               jS++;
            }
            break;
         default:
            new StringBuffer().append(" Unknown type ").append(var0).toString();
      }

      de();
   }

   private static boolean bk(int var0) {
      new StringBuffer().append(" param error iAchievType ").append(var0).toString();
      int var1;
      if (var0 > 31) {
         var1 = jy;
         var0 = 1 << var0 - 31;
      } else {
         var1 = jx;
         var0 = 1 << var0;
      }

      return (var1 & var0) != 0;
   }

   private static void bl(int var0) {
      new StringBuffer().append(" param error iAchievType ").append(var0).toString();
      int var1;
      int var2;
      if (var0 > 31) {
         var1 = jy;
         var2 = 1 << var0 - 31;
      } else {
         var1 = jx;
         var2 = 1 << var0;
      }

      var1 |= var2;
      if (var0 > 31) {
         if (var1 != jy) {
            bj(var0);
         }
      } else if (var1 != jx) {
         bj(var0);
      }

      if (var0 > 31) {
         jy = var1;
      } else {
         jx = var1;
      }
   }

   private static void de() {
      jU++;
   }

   private static boolean bm(int var0) {
      int var1 = bn(var0);
      var0 = bo(var0);
      return var1 == var0;
   }

   private static int bn(int var0) {
      int[][] var1 = o(9);
      int var2 = 0;

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (var1[var3][0] < 50 && (var1[var3][1] == var0 || var1[var3][2] == var0 || var1[var3][3] == var0)) {
            var2++;
         }
      }

      return var2;
   }

   private static int df() {
      r var0 = null;
      int var1 = 0;
      int[] var2 = new int[50];

      for (int var3 = 0; var3 < q.af[z][0].length; var3++) {
         if ((var0 = (r)q.af[z][0][var3]) != null && var0.aP == 4 && var2[var0.bc] == 0) {
            var1++;
            var2[var0.bc] = 1;
         }
      }

      return var1;
   }

   private static int bo(int var0) {
      r var1 = null;
      int var2 = 0;
      int[] var3 = new int[50];

      for (int var4 = 0; var4 < q.af[z][0].length; var4++) {
         if ((var1 = (r)q.af[z][0][var4]) != null && var1.aP == 4 && var3[var1.bc] == 0 && (var1.bm[42] == var0 || var1.bm[43] == var0 || var1.bm[44] == var0)) {
            var2++;
            var3[var1.bc] = 1;
         }
      }

      return var2;
   }

   private static int bi(int var0, int var1) {
      Object var2 = null;
      int var3 = 0;

      for (int var4 = 0; var4 < q.af[z][1].length; var4++) {
         if ((var2 = (v)q.af[z][1][var4]) != null
            && ((q)var2).au == var0
            && !((v)var2).bc
            && ((q)var2).ar != 17
            && ((q)var2).ar != 18
            && (var1 <= 0 || ((v)var2).aT == var1)) {
            var3++;
         }
      }

      return var3;
   }

   private static int dg() {
      Object var0 = null;
      int var1 = 0;

      for (int var2 = 0; var2 < q.af[z][2].length; var2++) {
         if ((var0 = (v)q.af[z][2][var2]) != null && ((q)var0).au == 10 && !((v)var0).bc) {
            var1++;
         }
      }

      return var1;
   }

   private static int dh() {
      Object var0 = null;
      int var1 = 0;

      for (int var2 = 0; var2 < q.af[z][2].length; var2++) {
         if ((var0 = (v)q.af[z][2][var2]) != null
            && ((q)var0).au == 10
            && !((v)var0).bc
            && (
               b(1, ((q)var0).ar, 0) == 4
                  || b(1, ((q)var0).ar, 0) == 6
                  || b(1, ((q)var0).ar, 0) == 5
                  || b(1, ((q)var0).ar, 0) == 7
                  || b(1, ((q)var0).ar, 0) == 1
            )) {
            var1++;
         }
      }

      return var1;
   }

   private static int di() {
      Object var0 = null;
      int var1 = 0;

      for (int var2 = 0; var2 < q.af[z][2].length; var2++) {
         if ((var0 = (v)q.af[z][2][var2]) != null
            && ((q)var0).au == 10
            && !((v)var0).bc
            && (b(1, ((q)var0).ar, 0) == 0 || b(1, ((q)var0).ar, 0) == 3 || b(1, ((q)var0).ar, 0) == 2)) {
            var1++;
         }
      }

      return var1;
   }

   private static String a(int var0, int var1, boolean var2, int[] var3) {
      int var8;
      if (!bk(var3[0])) {
         var8 = Math.min(var0, var1);
      } else {
         var8 = var1;
      }

      String var4;
      if (var2) {
         var4 = u(137);
      } else {
         var4 = u(136);
      }

      if (e == 17 && var1 >= 1000000) {
         StringBuffer var5 = new StringBuffer();

         for (int var6 = var4.length() - 1; var6 >= 0; var6--) {
            var5.append(var4.charAt(var6));
         }

         var4 = var5.toString();
      }

      String var7;
      if (var2) {
         var7 = an(var8);
      } else {
         var7 = an(var1 - var0);
      }

      if (var2) {
         ad[0] = an(var1);
         var4 = a(var4, ad, '#');
      }

      ad[0] = var7;
      return a(var4, ad, '%');
   }

   private static String n(int var0, boolean var1) {
      String var2 = "";
      String var3;
      if (var1) {
         var3 = u(137);
      } else {
         var3 = u(136);
      }

      int[] var4 = z(10, var0);
      switch (var0) {
         case 0:
            var2 = a(df(), 50, var1, var4);
            break;
         case 1:
            var2 = a(bo(0), bn(0), var1, var4);
            break;
         case 2:
            var2 = a(bo(1), bn(1), var1, var4);
            break;
         case 3:
            var2 = a(bo(2), bn(2), var1, var4);
            break;
         case 4:
            var2 = a(bo(3), bn(3), var1, var4);
            break;
         case 5:
            var2 = a(bo(7), bn(7), var1, var4);
            break;
         case 6:
            var2 = a(bo(8), bn(8), var1, var4);
            break;
         case 7:
            var2 = a(bo(9), bn(9), var1, var4);
            break;
         case 8:
            var2 = a(bo(6), bn(6), var1, var4);
            break;
         case 9:
            var2 = a(bo(5), bn(5), var1, var4);
            break;
         case 10:
            var2 = a(bo(10), bn(10), var1, var4);
            break;
         case 11:
            var2 = a(bo(13), bn(13), var1, var4);
            break;
         case 12:
            var2 = a(bp(jz), 10, var1, var4);
            break;
         case 13:
            var2 = a(jA, var4[5], var1, var4);
            break;
         case 14:
            var2 = a(jB, var4[5], var1, var4);
            break;
         case 15:
            var2 = a(ab.e[7], var4[5], var1, var4);
            break;
         case 16:
            var2 = a(ab.e[7], var4[5], var1, var4);
            break;
         case 17:
            var2 = a(jC, var4[5], var1, var4);
            break;
         case 18:
            var2 = a(bp(jD), 9, var1, var4);
            break;
         case 19:
            var2 = a(jE, var4[5], var1, var4);
            break;
         case 20:
            var2 = a(jF, var4[5], var1, var4);
            break;
         case 21:
            var2 = a(jG, var4[5], var1, var4);
            break;
         case 22:
            var2 = a(jH, var4[5], var1, var4);
            break;
         case 23:
            var2 = a(bi(4, 3), var4[5], var1, var4);
         case 24:
         case 28:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
            break;
         case 25:
            var2 = a(bi(8, -1), var4[5], var1, var4);
            break;
         case 26:
            var2 = a(jI, var4[5], var1, var4);
            break;
         case 27:
            var2 = a(jJ, var4[5], var1, var4);
            break;
         case 29:
            var2 = a(aj, var4[5], var1, var4);
            break;
         case 30:
            var2 = a(aj, var4[5], var1, var4);
            break;
         case 31:
            var2 = a(jK, var4[5], var1, var4);
            break;
         case 32:
            var2 = a(jK, var4[5], var1, var4);
            break;
         case 33:
            var2 = a(jL, var4[5], var1, var4);
            break;
         case 34:
            var2 = a(jM, var4[5], var1, var4);
            break;
         case 41:
            var2 = a(jO, var4[5], var1, var4);
            break;
         case 42:
            var2 = a(jP, var4[5], var1, var4);
            break;
         case 43:
            ae(jQ / 1000);
            ae(var4[5] - jQ / 1000);
            String var25 = ae(var4[5]);
            String var10;
            if (jQ / 1000 >= var4[5]) {
               var10 = ae(var4[5]);
               var2 = ae(0);
            } else {
               var10 = ae(jQ / 1000);
               var2 = ae(var4[5] - jQ / 1000);
               var25 = ae(var4[5]);
            }

            String var11;
            if (var1) {
               var11 = "" + var10;
            } else {
               var11 = "" + var2;
            }

            ad[0] = var11;
            String var21;
            var2 = var21 = a(var3, ad, '%');
            if (var1) {
               ad[0] = "" + var25;
               var2 = a(var21, ad, '#');
            }
            break;
         case 44:
            var2 = a(jR, var4[5], var1, var4);
            break;
         case 45:
            int var15 = -((var0 = dg()) - ab.e[37]);
            String var24;
            if (var1) {
               var24 = "" + var15;
            } else {
               var24 = "" + var0;
            }

            ad[0] = var24;
            String var20;
            var2 = var20 = a(var3, ad, '%');
            if (var1) {
               ad[0] = "" + ab.e[37];
               var2 = a(var20, ad, '#');
            }
            break;
         case 46:
            int var14 = -((var0 = di()) - ab.e[39]);
            String var23;
            if (var1) {
               var23 = "" + var14;
            } else {
               var23 = "" + var0;
            }

            ad[0] = var23;
            String var19;
            var2 = var19 = a(var3, ad, '%');
            if (var1) {
               ad[0] = "" + ab.e[39];
               var2 = a(var19, ad, '#');
            }
            break;
         case 47:
            int var13 = -((var0 = dh()) - ab.e[38]);
            String var22;
            if (var1) {
               var22 = "" + var13;
            } else {
               var22 = "" + var0;
            }

            ad[0] = var22;
            String var18;
            var2 = var18 = a(var3, ad, '%');
            if (var1) {
               ad[0] = "" + ab.e[38];
               var2 = a(var18, ad, '#');
            }
            break;
         case 48:
            var0 = bV() - bU();
            int var12 = bU();
            String var5;
            if (var1) {
               var5 = "" + var12;
            } else {
               var5 = "" + var0;
            }

            ad[0] = var5;
            String var17;
            var2 = var17 = a(var3, ad, '%');
            if (var1) {
               ad[0] = "" + bV();
               var2 = a(var17, ad, '#');
            }
            break;
         case 49:
            var2 = a(jS, var4[5], var1, var4);
            break;
         default:
            new StringBuffer().append(" Unknown type ").append(var0).toString();
      }

      return var2;
   }

   private static int bp(int var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < 31; var2++) {
         if ((1 << var2 & var0) != 0) {
            var1++;
         }
      }

      return var1;
   }

   private static void dj() {
      if (!a()) {
         if (kc < 0L) {
            kc = kd;
            kb = n(20000, 40001);
            return;
         }

         if (kc + kb < kd) {
            kc = -1L;
            a(n(2, 22));
         }
      }
   }

   private static void dk() {
      if (!P(80)) {
         if (kf < 0L) {
            kf = kd;
            ke = n(4000, 8001);
         } else if (kf + ke < kd) {
            kf = -1L;
            int var0;
            byte var1;
            if ((var0 = n(0, 3)) == 0) {
               var1 = 78;
            } else if (var0 == 1) {
               var1 = 79;
            } else {
               var1 = 80;
            }

            if (!a()) {
               a(var1);
            }
         }
      }

      if (ak >= 0) {
         if (ak > 600) {
            ak = -1;
            if (i == 5) {
               a(70);
               return;
            }
         } else {
            ak = ak + aq;
         }
      }
   }

   private static void r(boolean var0) {
      if (!dE() && !v(27) && !v(17) && !v(41) && !v(18) && !v(24) && !kh) {
         if ((!gc && F() && !dE() && !cZ && !gZ && !eK || var0) && !kg) {
            kg = true;
            kj = true;
            aF = true;
            dd();
            al();
            b(27, true, false);
         }
      }
   }

   private static void s(boolean var0) {
      if (!v(27) && !v(25) && !v(17) && !v(41) && !v(18) && !v(24)) {
         boolean var1 = F() && !dE() && !cZ && !gZ && !eK && !v(30) && !v(36) && !v(38);
         if (!dG() && (var1 || var0) && !kg) {
            d.k();
            kg = true;
            kj = false;
            dd();
            b(22, false, false);
            b(27, true, false);
            bT = true;
            if (v(66)) {
               b(66, false, false);
            }

            lq = true;
            ls = 57;
            if (v(67)) {
               b(67, false, false);
               hE = true;
            }

            if (i == 6) {
               b(22, false, false);
               b(76, false, false);
               kn = eT;
               ko = eU;
               if (gi) {
                  m(57, false);
                  b(57, false, false);
               }
            }

            b(27, true, false);

            while (ki > 0) {
               ki--;
               bd();
               bg();
               y();
            }

            bc();
            bf();
            x();
         }
      }
   }

   private static void dl() {
      kg = false;
      bT = false;
      b(27, false, false);
      b(22, true, false);
      bd();
      bg();
      y();
      kc = 0L;
      kb = 0L;
      kf = 0L;
      ke = 0L;
   }

   private static int b(int[] var0, int var1) {
      if (var0[0] == var0[1]) {
         return var0[1];
      }

      if ((kr = kr - aq / var1) >= 0) {
         return var0[0];
      }

      kr = 30;
      if (var0[0] > var0[1]) {
         if (var0[0] - var0[1] < 10) {
            var0[0]--;
         } else {
            var0[0] -= (var0[0] - var0[1]) / 2;
         }
      } else if (var0[1] - var0[0] < 10) {
         var0[0]++;
      } else {
         var0[0] += (var0[1] - var0[0]) / 2;
      }

      return var0[0];
   }

   private static void bq(int var0) {
      lC = 2;
      kT = var0;
      if (var0 == 0) {
         kv = 3;
         kx = 3;
         kw = 0;
      }

      if (kT == 2) {
         kv = 3;
         kx = 10;
         kw = 2;
      }

      M(10);
   }

   private static void dm() {
      kZ = 0;
      la = 0;
      lb = 0;
      boolean var0 = kT == 2;
      if (kR == null) {
         kR = (int[][])T[21];
      }

      if (kS == null) {
         kS = (int[][])T[23];
      }

      cQ();
      cS();
      aT();
      q(1, 21);
      q(1, 23);
      q(1, 28);
      q(1, 6);
      q(1, 3);
      q(3, 23);
      int var2 = 0;
      b(38, false, false);
      b(42, true, false);
      kF = true;
      kG = false;
      kH = false;
      kI = false;
      lm = 0;
      kM = 0;
      kK = new int[10];
      (kY = new d(j[3][1], 0, -1)).a(0, -1);
      lE = false;

      for (int var1 = 0; var1 < kK.length; var1++) {
         var2 = var1 + 4;
         kK[var1] = ag[21][var2][7];
      }

      li = false;
      lj = false;
      f(37, 30, false);
      lk = false;
      lf = 0;
      lg = 0;
      a(37, 65, false);
      c(37, 65, false);
      d(37, 64, false);
      if (kT == 0) {
         kL = 0;
         kU = 0;
         kO = new r[kx];
         var2 = cJ();

         for (int var3 = 0; var3 < kx; var3++) {
            int var6 = it[var2][0] - var3;
            int var4 = it[var2][1] - var3;
            r var7;
            if ((var7 = q.a(var6, (byte)var4)) != null) {
               kO[var3] = var7;
               kU++;
            }
         }

         dq();
         kV = 0;
         kN = new r[kv];

         for (int var18 = 0; var18 < kv; var18++) {
            r var8;
            if (kA[var18] != -1 && (var8 = (r)q.ac[kE[kA[var18]]]) != null) {
               kN[var18] = var8;
               kV++;
            }
         }

         do_method();
         br(0);
      } else if (kT == 2) {
         kL = 0;
         kU = 0;
         kO = new r[kx];
         int var9 = cJ;
         int var26 = cI[var9];
         int var23 = kx;
         int[] var19 = new int[kx];
         if (var26 < 20) {
            var9 += 26;

            for (int var5 = 0; var5 < var23; var5++) {
               var19[var5] = ((int[][])T[var9])[var26][var5 + 1];
            }
         } else {
            for (int var10 = 0; var10 < var23; var10++) {
               var19[var10] = n(0, 50);
            }
         }

         lc = var19;

         for (int var24 = 0; var24 < kx; var24++) {
            r var20;
            if (lc[var24] >= 0 && (var20 = q.a(lc[var24], (byte)1)) != null) {
               kO[kU] = var20;
               kU++;
            }
         }

         dq();
         kV = 0;
         kN = new r[kv + kw];

         for (int var21 = 0; var21 < kv; var21++) {
            r var12;
            if (kA[var21] != -1 && (var12 = !dE() ? (r)q.ac[kE[kA[var21]]] : (var21 == 0 ? q.a(27, (byte)4) : null)) != null) {
               kN[kV] = var12;
               kV++;
            }
         }

         for (int var22 = 0; var22 < kw; var22++) {
            if (kB[var22] != -1) {
               w var25;
               var9 = (byte)(var25 = ia[kB[var22]]).e[12];
               if (ib[var22] != 0 && ib[var22] != 1) {
                  var26 = ac(cJ);
                  if (var9 > var26) {
                     var9 = var26;
                  }
               }

               r var14;
               if ((var14 = q.a(var25.e[1], (byte)var9)) != null) {
                  kN[kV] = var14;
                  kV++;
               }
            }
         }

         do_method();
         br(0);
      }

      kz = -1L;
      a(22);
      kJ = var0;
      d(21, 0, var0);
      j[1][3].m(var0 ? 1 : 0);
      k(21, 1, var0 ? 1 : 0);

      for (int var15 = 4; var15 <= 13; var15++) {
         d(21, var15, !var0);
      }

      ln = 0;
      cz();
      cy();
   }

   private static void dn() {
      kQ = new int[3];

      for (int var0 = 0; var0 < 3; var0++) {
         kQ[var0] = ku.ag.bm[var0 + 42];
         if (kQ[var0] == 15) {
            kQ[var0] = -1;
         }
      }
   }

   private static void br(int var0) {
      ld = var0;
      ks = kt[var0];
      ks.ag.a(1, -1, true);
      int var3 = ks.ag.ar;
      int var1 = b(2, var3, 122);
      int var2 = b(2, var3, 123);
      var3 = b(2, var3, 124);
      c(37, 35, 5, var1);
      c(37, 35, 6, var2);
      c(37, 35, 8, var3);
      String var5 = ks.ag.d(true);
      a(37, 61, var5, false);
      dr();
      h(true);
   }

   private static void do_method() {
      kt = new q[kV];

      for (int var0 = 0; var0 < kV; var0++) {
         kt[var0] = q.a(ag[37][54][2], ag[37][54][3], kN[var0]);
         r var1;
         (var1 = kN[var0]).c(false);
         var1.b(true);
         var1.a(1, -1, true);
         var1.aW = ((int[][])T[8])[var1.aZ - 1][1];
         var1.bd = var1.aW;
         int var2 = ((int[][])T[8])[var1.aZ - 1][2];
         var1.aV = var2;
         kt[var0].ag = var1;
      }
   }

   private static int dp() {
      int var0 = 0;

      for (int var1 = 0; var1 < kO.length; var1++) {
         if (kO[var1] != null) {
            var0++;
         }
      }

      return var0;
   }

   private static void dq() {
      a(39 + n(0, 3));
      a(37, 66, "" + (kL + 1) + "/" + dp());
      int var0 = ag[37][53][2];
      int var1 = ag[37][53][3];
      (ku = q.a(var0, var1, kO[kL])).ag = kO[kL];
      var0 = ab.e[7];
      kX = null;
      if (kT != 0 && kT != 1) {
         if (kT == 2) {
            if (cI[cJ] == 19) {
               ku.ag.aZ = (byte)ac(cJ);
               ku.ag.aW = 4 * ((int[][])T[8])[ku.ag.aZ - 1][1];
               var0 = ((int[][])T[8])[ku.ag.aZ - 1][2];
               ku.ag.aV = var0;
               kX = new d();
               j[3][23].m(1);
               kX.a(j[3][23]);
               kX.a(0, -1);
            } else {
               ku.ag.aZ = (byte)ac(cJ);
               ku.ag.aW = ((int[][])T[8])[ku.ag.aZ - 1][1];
               var0 = ((int[][])T[8])[ku.ag.aZ - 1][2];
               ku.ag.aV = var0;
            }
         }
      } else {
         if (kW) {
            ku.ag.aZ = kO[kL].aZ;
         } else {
            ku.ag.aZ = (byte)kS[var0][0];
         }

         ku.ag.aW = ((int[][])T[8])[ku.ag.aZ - 1][1];
         var0 = ((int[][])T[8])[ku.ag.aZ - 1][2];
         ku.ag.aV = var0;
      }

      ku.ag.bd = ku.ag.aW;
      ku.ag.c(false);
      ku.ag.b(false);
      ku.ag.a(1, -1, true);
      dn();
      short var7 = ag[37][53][2];
      var1 = ag[37][53][3];
      al = q.a(var7, var1, 41, false);
      ku.ag.a(1, -1, true);
      int var8 = ku.ag.ar;
      var1 = b(2, var8, 122);
      int var2 = b(2, var8, 123);
      var8 = b(2, var8, 124);
      c(37, 37, 5, var1);
      c(37, 37, 6, var2);
      c(37, 37, 8, var8);
      h(false);
   }

   private static void dr() {
      kP = new int[3];

      for (int var0 = 0; var0 < 3; var0++) {
         kP[var0] = ks.ag.bm[var0 + 42];
         if (kP[var0] != 15) {
            c(37, var0 + 50, 6, kP[var0] + 31);
            c(37, var0 + 50, 8, kP[var0] + 31);
            c(37, var0 + 50, 12, kP[var0] + 31);
            a(37, var0 + 50, true);
            d(37, var0 + 47, true);
         } else {
            kP[var0] = -1;
            a(37, var0 + 50, false);
            d(37, var0 + 47, false);
         }
      }
   }

   private static void ds() {
      lE = true;
      lD = true;
      if (kT != 2) {
         if (lx) {
            if (!kW) {
               jK++;
               jL++;
               jM = 0;
               l(31, 0);
               l(32, 0);
               l(33, 0);
               if (kV == 1) {
                  l(35, 0);
               }
            }
         } else {
            l(34, 0);
            if (!kW) {
               jL = 0;
               jM++;
               l(34, 0);
            }
         }

         boolean var10 = false;
         b(41, true, false);
      } else if (!lx) {
         boolean var9 = false;
         b(39, true, false);
      } else {
         boolean var2 = false;
         b(40, true, false);
         int var0 = cJ;
         cI[var0]++;
         l(41, 0);
         int[][] var1 = o(35);
         var2 = false;
         int var3 = -1;
         int var4 = -1;

         for (int var5 = 0; var5 < var1.length; var5++) {
            if (var1[var5][0] == jO) {
               var2 = true;
               var3 = var1[var5][1];
               var4 = var1[var5][2];
               break;
            }
         }

         if (var2) {
            String var10000 = j(var3, 13);
            String var7 = j(var4, 13);
            iw = var10000;
            ix = var7;
            lq = true;
            ls = 20;
            var2 = false;
            b(32, true, false);
         }

         if (cI[var0] >= 20) {
            cI[var0] = 20;
            switch (var0) {
               case 0:
                  l(36, 0);
                  break;
               case 1:
                  l(37, 0);
                  break;
               case 2:
                  l(38, 0);
                  break;
               case 3:
                  l(39, 0);
                  break;
               case 4:
                  l(40, 0);
            }
         }

         ab.e[var0 + 26] = cI[var0];
      }
   }

   private static void dt() {
      if (!le) {
         if (!kH || kG || !dw()) {
            try {
               if (ky >= 60000) {
                  if (!d.g(0)) {
                     a(22);
                     ky = 0;
                  }
               } else {
                  ky = ky + aq;
               }
            } catch (Exception var13) {
            }
         } else if (kM < 5000) {
            if (lx) {
               c(37, 60, 8, 8);
               String var0 = u(6162);
               boolean var5 = false;
               a(37, 60, var0, false);
               f(37, 60, true);
            } else {
               c(37, 59, 8, 9);
               String var14 = u(6162);
               boolean var52 = false;
               a(37, 59, var14, false);
               f(37, 59, true);
            }

            kM = kM + aq;
         } else {
            ds();
         }

         q.m();
         if (li) {
            lg = lg + aq;
            if (lk) {
               if (lg > 1600) {
                  li = false;
                  lj = false;
                  f(37, 30, false);
                  a(37, 65, false);
                  d(37, 64, false);
                  f(37, 69, false);
                  lk = false;
                  int var8 = ll;
                  if (!kG && dw() && !kI && !kH) {
                     j(false);
                     k(false);
                     ks.ag.aU = var8;
                     kG = true;
                     ks.ag.k(5);
                     o(kP[ks.ag.aU], false);
                     bs(2);
                  }

                  i(true);
               }
            } else {
               int var7;
               lf = lg / 15 * (var7 = lg / 15) / b(2, ks.ag.ar, 117);
               if (dF()) {
                  int var6 = lf;
                  boolean var53 = false;
                  f(51, var6, -1, -1);
               }

               if (lf >= 100) {
                  lf = 100;
                  du();
               }
            }
         }
      }

      if (al != null) {
         al.a();
      }

      int var54 = 0;
      H(21, aq);
      ks.ag.ad();
      if (kX != null) {
         kX.c(aq);
      }

      kY.c(aq);
      if (ku.ag.m(0) && ku.ag.bh[0]) {
         r var15 = ku.ag;
         int var1 = ku.ag.av;
         int var2 = var15.aw;
         int[] var3 = var15.bj[var15.bk[0] + 1];
         int var4 = c(var15.bm[40], var15.l(var15.bk[0]), 12);
         var54 = c(var15.bm[40], var15.l(var15.bk[0]), 13);
         var4 *= var15.bm[35];
         var1 += var3[7] + var4;
         var2 += var3[8] + var54;
         if (kX != null) {
            d var10000 = kX;
            var1 += q(var15.bm[40]);
            d var16 = var10000;
            var10000.a = var1;
            var16.b = var2;
         }
      }

      ku.ag.ad();
      label378:
      if (kz >= 0L) {
         if (kI) {
            if (kz > 1500L) {
               if (dw()) {
                  if (kF) {
                     c(37, 0, 7, 180);
                     j(false);
                     c(37, 31, 18, 1);
                     b(37, 46, true);
                     gc = true;
                     a(59, 1, false);
                  } else {
                     dq();
                  }

                  kz = -1L;
                  kI = false;
                  f(37, 59, false);
                  f(37, 60, false);
               }
               break label378;
            }

            if (ks.ag.bd <= 0) {
               f(37, 59, true);
            } else {
               if (ku.ag.bd > 0) {
                  break label378;
               }

               f(37, 60, true);
            }
         } else if (kz > 1500L) {
            f(37, 59, false);
            f(37, 60, false);
            kz = -1L;
            break label378;
         }

         kz = kz + aq;
      }

      if (!le) {
         if (!kI && ks.ag.bi != 5 && ku.ag.bi != 5 && kG && dw()) {
            var54 = 1;
            int var12 = 0;
            long var62;
            if (kF) {
               int var58 = kP[ks.ag.aU];

               for (int var17 = 0; var17 < 3; var17++) {
                  int var11;
                  if ((var11 = kQ[var17]) != -1) {
                     var54 *= kR[var58][var11];
                     var12++;
                  }
               }

               var62 = (long)ks.ag.aV * var54 / bD(var12);
               ku.ag.bd = (int)(ku.ag.bd - var62 * lh);
               if (var62 < 0L) {
                  ku.ag.bd = -1;
                  var62 = 4294967295L;
               }

               lw = 300;
               a(n(64, 68));
               if (ku.ag.bd <= 0) {
                  ku.ag.bd = 0;
                  if (++kL < kx && kO[kL] != null) {
                     kI = true;
                     c(37, 60, 8, 8);
                     String var18 = u(6162);
                     a(37, 60, var18, false);
                     kz = 0L;
                  } else {
                     kH = true;
                     lx = true;
                     kM = 0;
                     t(lx);
                  }
               }
            } else {
               kI = false;
               f(37, 60, false);
               int var59 = kQ[ku.ag.aU];

               for (int var19 = 0; var19 < 3; var19++) {
                  int var68;
                  if ((var68 = kP[var19]) != -1) {
                     var54 *= kR[var59][var68];
                     var12++;
                  }
               }

               int var72;
               if (dE()) {
                  var72 = 1;
               } else {
                  int var44 = n(0, 100);
                  int var49 = b(2, ku.ag.ar, 111);
                  int var20 = b(2, ku.ag.ar, 112);
                  var72 = var44 < var49 ? 2 : (var44 < var20 ? 1 : 0);
               }

               lh = var72;
               var62 = (long)ku.ag.aV * var54 / bD(var12);
               ks.ag.bd = (int)(ks.ag.bd - var62 * lh);
               lw = 300;
               a(n(64, 68));
               if (ks.ag.bd <= 0) {
                  ks.ag.bd = 0;
                  boolean var45 = false;

                  for (int var50 = 0; var50 < kV; var50++) {
                     if (kt[var50].ag.bd > 0) {
                        var45 = true;
                     }
                  }

                  if (var45) {
                     c(37, 59, 8, 9);
                     String var21 = u(6162);
                     a(37, 59, var21, false);
                     kI = true;
                     kz = 0L;
                  } else {
                     kH = true;
                     lx = false;
                     kM = 0;
                     t(lx);
                  }
               }
            }

            int var22 = kF ? ks.ag.aV : ku.ag.aV;
            int var39 = kF ? 60 : 59;
            int var42 = kF ? 59 : 60;
            if (var62 != var22 && !kI && ks.ag.bd > 0 && ku.ag.bd > 0 && lh != 0) {
               f(37, var39, true);
               if (var62 == 0L) {
                  c(37, var39, 8, 1);
                  String var24 = u(6154);
                  a(37, var39, var24, false);
               } else if (var62 < var22) {
                  c(37, var39, 8, 2);
                  String var25 = u(6155);
                  a(37, var39, var25, false);
               } else {
                  c(37, var39, 8, 3);
                  String var26 = u(6156);
                  a(37, var39, var26, false);
               }
            } else {
               String var23 = "";
               a(37, var39, var23, false);
            }

            if (lh == 0) {
               if (!kF) {
                  f(37, var39, true);
                  c(37, var39, 8, 9);
                  String var27 = u(6173);
                  a(37, var39, var27, false);
               }
            } else if (lh == 2) {
               if (!kF) {
                  f(37, var42, true);
                  c(37, var42, 8, 8);
                  String var28 = u(6172);
                  a(37, var42, var28, false);
               }
            } else {
               String var29 = "";
               a(37, var42, var29, false);
            }

            kz = 0L;
            kG = false;
            if (!(kF = !kF)) {
               int var46;
               if ((var46 = n(0, 100)) < 20) {
                  if (!b()) {
                     d.k();
                  }

                  var22 = o(38)[ab.e[7] - 1][0];
                  bj(0, var22);
                  if (lh != 0) {
                     kZ += var22;
                  }

                  if (lh == 2) {
                     var22 <<= 1;
                     kZ += var22;
                  }
               } else if (var46 >= 20 && var46 < 30) {
                  if (!b()) {
                     d.k();
                  }

                  var22 = o(38)[ab.e[7] - 1][2];
                  bj(2, var22);
                  if (lh != 0) {
                     lb += var22;
                  }

                  if (lh == 2) {
                     var22 <<= 1;
                     lb += var22;
                  }
               } else if (var46 >= 30 && var46 < 35) {
                  if (!b()) {
                     d.k();
                  }

                  var22 = o(38)[ab.e[7] - 1][1];
                  bj(3, var22);
                  if (lh != 0) {
                     la += var22;
                  }

                  if (lh == 2) {
                     var22 <<= 1;
                     la += var22;
                  }
               }
            }

            if (dE()) {
               int var60;
               f(50, var60 = kF ? 0 : 1, -1, -1);
            } else {
               j(kF);
               k(kF);
            }
         }

         if (!kG && dw() && !kF && !kH && !kI) {
            long var63 = 0L;
            var54 = 0;

            for (int var61 = 0; var61 < 3; var61++) {
               if (kQ[var61] != -1) {
                  int var36 = 1;
                  int var40 = 0;
                  int var43 = kQ[var61];

                  for (int var47 = 0; var47 < 3; var47++) {
                     int var51;
                     if ((var51 = kP[var47]) != -1) {
                        var36 *= kR[var43][var51];
                        var40++;
                     }
                  }

                  long var69;
                  if ((var69 = ku.ag.aV * var36 / bD(var40)) > var63) {
                     var63 = var69;
                     var54 = var61;
                  }
               }
            }

            ku.ag.aU = var54;
            kG = true;
            ku.ag.k(5);
            o(kQ[ku.ag.aU], true);
            bs(1);
         }
      }

      for (int var64 = 0; var64 < lA.length; var64++) {
         if (lA[var64] != null) {
            lA[var64].b();
         }
      }

      if (lB != null) {
         lB.b();
      }

      dP();
      if (lp > 0) {
         lp = lp - aq;
      }

      if (ln != 0 && lp < 0 && (lo = lo - aq) < 0) {
         ln = 0;
      }

      if (aq < 40) {
         lm++;
      } else {
         lm = lm + aq / 40;
      }

      lm = lm % c.a;
      if (lw > 0) {
         long var73 = ks.ag.bd + ((long)lu - ks.ag.bd) * lw / 300L;
         long var65 = 0L;
         int var70 = (int)(var73 * 100L / ks.ag.aW);
         o(37, 56, var70);
         var70 = (int)((ku.ag.bd + ((long)lv - ku.ag.bd) * lw / 300L) * 100L / ku.ag.aW);
         o(37, 58, var70);
         lw = lw - aq;
      } else {
         long var66 = ks.ag.bd * 100L / ks.ag.aW;
         o(37, 56, (int)var66);
         lu = ks.ag.bd;
         var66 = ku.ag.bd * 100L / ku.ag.aW;
         o(37, 58, (int)var66);
         lv = ku.ag.bd;
      }

      p(37, 58, 100);
      p(37, 56, 100);
   }

   private static void du() {
      lk = true;
      lg = 0;
      short var0 = ag[37][63][5];
      int var1 = ag[37][63][6];
      int var2 = ag[37][63][2];
      short var3 = ag[37][63][3];
      int var4 = lf * var1 / 100;
      int var5 = b(2, ks.ag.ar, 114);
      int var6 = b(2, ks.ag.ar, 113);
      int var7 = b(2, ks.ag.ar, 116);
      int var8 = b(2, ks.ag.ar, 115);
      f(37, 69, true);
      if (lf >= var7 && lf <= var8) {
         String var19 = u(6172);
         a(37, 69, var19, false);
         c(37, 69, 8, 8);
         lh = 2;
      } else if (lf >= var5 && lf <= var6) {
         String var18 = u(6174);
         a(37, 69, var18, false);
         c(37, 69, 8, 1);
         lh = 1;
      } else {
         String var17 = u(6173);
         a(37, 69, var17, false);
         c(37, 69, 8, 9);
         lh = 0;
      }

      if (lf <= 100) {
         if (lB == null) {
            lB = s.a(0, 2, 0, 0, 0);
            d var15;
            (var15 = new d()).a(j[3][0]);
            var15.a(lh != 0 ? 0 : 2, 1);
            int var10001 = var2 + var0 / 2 - 5;
            var2 = var3 + var1 - var4 - 2;
            var1 = var10001;
            d var9 = var15;
            var15.a = var1;
            var9.b = var2;
            var15.h = 0;
            lB.c(0, var1, var2);
            d var20 = var15;
            lB.c[0] = var20;
            lB.d[0] = 0;
            d var16;
            (var16 = new d()).a(j[3][0]);
            var16.a(lh != 0 ? 0 : 2, 1);
            d var10 = var16;
            var16.a = var1;
            var10.b = var2;
            var16.h = 0;
            var1 = var1;
            d var11 = var16;
            var16.a = var1;
            var11.b = var2;
            lB.c(1, var1, var2);
            d var21 = var16;
            lB.c[1] = var21;
            lB.d[1] = 0;
         } else {
            lB.a();
         }
      }

      c(37, 65, false);
   }

   private static int dv() {
      int var0 = 0;

      for (int var1 = 0; var1 < kO.length; var1++) {
         if (kO[var1] != null) {
            var0++;
         }
      }

      return var0 - kL;
   }

   private static void t(boolean var0) {
      if (kT == 2) {
         f(47, cJ, 0, 0);
      }

      if (kT == 0) {
         if (kW) {
            f(48, 0, 0, 0);
         } else {
            f(44, 0, 0, 0);
         }

         if (var0) {
            f(45, 0, 0, 0);
         }
      }
   }

   private static boolean dw() {
      boolean var0 = true;

      for (int var1 = 0; var1 < lA.length; var1++) {
         if (lA[var1] != null) {
            var0 = var0 && lA[var1].c();
         }
      }

      return var0;
   }

   private static void bs(int var0) {
      lo = 500;
      ln = var0;
   }

   private static void o(int var0, boolean var1) {
      switch (var0 = var0) {
         case 0:
            s[] var364 = lA;
            s var355;
            (var355 = s.a(2, 0, 1, 1, 5)).a(82);
            var355.a(0, 1000, 90);
            var355.a(1, 1200, 90);
            var355.a(2, 1300, 90);
            var355.a(3, 1400, 90);
            var355.a(4, 1500, 600);
            int var45 = 310;
            int var114 = 128000;
            int var76 = 204800;
            int var345 = 0;
            if (var1) {
               var114 = -204800;
               var76 = -128000;
               var45 = mJ - 310 - 10;
               var345 = mJ;
            }

            p var115 = p.a(50, 300, 600, var45, 380, 10, 10, var114, var76, -51200, 51200, 0, -100, -1, -1, 1, var345, 0, 0, 0, 0);
            var355.e[0] = var115;
            var355.f[0] = 1000;
            var355.g[0] = 6;
            var355.h[0] = 0;
            var355.i[0] = 0;
            var355.j[0] = false;
            var355.k[0] = 0;
            var355.b(0, 0, 0);
            var45 = 560;
            var345 = 510;
            if (var1) {
               var45 = mJ - 560 - 100;
               var345 = mJ - 510;
            }

            p var116 = p.a(5, 400, 600, var45, 480, 100, 10, 0, 0, 0, 0, 0, 0, -1, -1, 1, var345, 280, 0, 0, 900);
            var355.e[1] = var116;
            var355.f[1] = 1500;
            var355.g[1] = 6;
            var355.h[1] = 0;
            var355.i[1] = 0;
            var355.j[1] = false;
            var355.k[1] = 0;
            var355.b(1, 0, 0);
            var355.a[0] = 60;
            var355.b[0] = 1700;
            var355.l = null;
            var364[var0] = var355;
            break;
         case 1:
            s[] var363 = lA;
            s var354;
            (var354 = s.a(3, 3, 1, 1, 5)).a(81);
            var354.a(0, 1000, 90);
            var354.a(1, 1200, 90);
            var354.a(2, 1300, 90);
            var354.a(3, 1400, 90);
            var354.a(4, 1500, 600);
            int var39 = 310;
            int var107 = 10000;
            short var70 = 10000;
            int var323 = 410;
            if (var1) {
               var107 = -10000;
               var70 = -10000;
               var39 = mJ - 310 - 10;
               var323 = mJ - 410 - 200;
            }

            p var108 = p.a(10, 700, 1200, var39, 380, 10, 10, var107, var70, 20000, 40000, 0, 0, -1, -1, 1, var323, 380, 200, 10, 1000);
            var354.e[0] = var108;
            var354.f[0] = 1000;
            var354.g[0] = 5;
            var354.h[0] = 0;
            var354.i[0] = 0;
            var354.j[0] = false;
            var354.k[0] = 0;
            var354.b(0, 0, 0);
            var39 = 310;
            var107 = (short)10000;
            var70 = 10000;
            var323 = 410;
            if (var1) {
               var107 = (short)-10000;
               var70 = -10000;
               var39 = mJ - 310 - 10;
               var323 = mJ - 410 - 200;
            }

            p var110 = p.a(10, 700, 1200, var39, 380, 10, 10, var107, var70, -40000, -20000, 0, 0, -1, -1, 1, var323, 380, 200, 10, 1000);
            var354.e[1] = var110;
            var354.f[1] = 1000;
            var354.g[1] = 5;
            var354.h[1] = 0;
            var354.i[1] = 0;
            int var325 = 0;
            byte var215 = 1;
            var354.j[var215] = false;
            var325 = (byte)0;
            var215 = 1;
            var354.k[var215] = var325;
            var354.b(1, 0, 0);
            var39 = 310;
            var107 = (short)1000;
            var70 = 30000;
            var325 = 0;
            if (var1) {
               var107 = (short)-30000;
               var70 = -1000;
               var39 = mJ - 310 - 10;
               var325 = mJ - 200;
            }

            p var112 = p.a(20, 700, 800, var39, 380, 10, 10, var107, var70, -30000, 30000, 0, 0, -1, -1, 0, var325, 380, 200, 10, 0);
            p var328 = var112;
            var215 = 2;
            var354.e[var215] = var328;
            short var329 = 1000;
            var215 = 2;
            var354.f[var215] = var329;
            byte var330 = 5;
            var215 = 2;
            var354.g[var215] = var330;
            byte var331 = 0;
            var215 = 2;
            var354.h[var215] = 0;
            var331 = 0;
            var215 = 2;
            var354.i[var215] = var331;
            int var333 = 0;
            var215 = 2;
            var354.j[var215] = false;
            var333 = (byte)0;
            var215 = 2;
            var354.k[var215] = var333;
            var354.b(2, 0, 0);
            q(1, 28);
            var39 = 530;
            if (var1) {
               var39 = mJ - 530;
            }

            d var73;
            (var73 = new d()).a(j[1][28]);
            var73.a(0, 1);
            var73.h = 2;
            var333 = var39;
            d var224 = var73;
            var73.a = var333;
            var224.b = 380;
            d var336 = var73;
            var215 = 0;
            var354.c[var215] = var336;
            var354.c(0, var39, 380);
            int var337 = 1800;
            var215 = 0;
            var354.d[var215] = var337;
            var39 = 560;
            if (var1) {
               var39 = mJ - 560;
            }

            d var74;
            (var74 = new d()).a(j[1][28]);
            var74.a(0, 1);
            var74.h = 2;
            var74.c();
            var107 = var39;
            d var227 = var74;
            var74.a = var107;
            var227.b = 380;
            d var338 = var74;
            var215 = 1;
            var354.c[var215] = var338;
            var354.c(1, var39, 380);
            var337 = (short)2000;
            var215 = 1;
            var354.d[var215] = var337;
            var39 = 550;
            if (var1) {
               var39 = mJ - 550;
            }

            d var75;
            (var75 = new d()).a(j[1][28]);
            var75.a(0, 1);
            var75.h = 2;
            var75.c();
            var337 = var39;
            d var230 = var75;
            var75.a = var337;
            var230.b = 380;
            d var341 = var75;
            var215 = 2;
            var354.c[var215] = var341;
            var354.c(2, var39, 380);
            short var342 = 2200;
            var215 = 2;
            var354.d[var215] = var342;
            short var343 = 60;
            var215 = 0;
            var354.a[var215] = var343;
            var343 = 2000;
            var215 = 0;
            var354.b[var215] = var343;
            Object var235 = null;
            var354.l = null;
            var363[var0] = var354;
            break;
         case 2:
            s[] var362 = lA;
            s var353;
            (var353 = s.a(2, 3, 1, 1, 5)).a(86);
            var353.a(0, 1650, 30);
            var353.a(1, 1700, 30);
            var353.a(2, 1750, 30);
            var353.a(3, 1800, 30);
            var353.a(4, 1850, 1200);
            int var34 = mJ / 2;
            int var102 = mJ;
            byte var187 = 1;
            int var297 = 10;
            if (var1) {
               var187 = -1;
               var34 = mJ - var34 - var102;
               var297 = mJ - 10 - 10;
            }

            p var103 = p.a(20, 400, 700, var34, 0, var102, 10, 0, 0, 140000, 150000, var187, 2000, -1, -1, 1, var297, 10, 10, 10, 0);
            p var298 = var103;
            var187 = 0;
            var353.e[var187] = var298;
            short var299 = 1000;
            var187 = 0;
            var353.f[var187] = var299;
            byte var300 = 3;
            var187 = 0;
            var353.g[var187] = var300;
            byte var301 = 0;
            var187 = 0;
            var353.h[var187] = 0;
            var301 = 1;
            var187 = 0;
            var353.i[var187] = var301;
            int var303 = 0;
            var187 = 0;
            var353.j[var187] = false;
            var303 = (byte)0;
            var187 = 0;
            var353.k[var187] = var303;
            var353.b(0, 0, 0);
            var34 = mJ / 2;
            int var66 = mK - 50;
            var102 = mJ;
            var187 = 1;
            var303 = 10;
            if (var1) {
               var187 = -1;
               var34 = mJ - var34 - var102;
               var303 = mJ - 10 - 10;
            }

            p var105 = p.a(20, 400, 800, var34, var66, var102, 10, -40000, 40000, -60000, -50000, var187, 10000, -1, -1, 1, var303, 10, 10, 10, 0);
            p var306 = var105;
            var187 = 1;
            var353.e[var187] = var306;
            short var307 = 1600;
            var187 = 1;
            var353.f[var187] = var307;
            byte var308 = 3;
            var187 = 1;
            var353.g[var187] = var308;
            byte var309 = 0;
            var187 = 1;
            var353.h[var187] = 0;
            var309 = 0;
            var187 = 1;
            var353.i[var187] = var309;
            int var311 = 0;
            var187 = 1;
            var353.j[var187] = false;
            var311 = (byte)0;
            var187 = 1;
            var353.k[var187] = var311;
            var353.b(1, 0, 0);
            q(1, 28);
            var34 = 530;
            if (var1) {
               var34 = mJ - 530;
            }

            d var67;
            (var67 = new d()).a(j[1][28]);
            var67.a(0, 1);
            var67.h = 0;
            var311 = var34;
            d var203 = var67;
            var67.a = var311;
            var203.b = 380;
            d var314 = var67;
            var187 = 0;
            var353.c[var187] = var314;
            var353.c(0, var34, 380);
            int var315 = 1800;
            var187 = 0;
            var353.d[var187] = var315;
            var34 = 560;
            if (var1) {
               var34 = mJ - 560;
            }

            d var68;
            (var68 = new d()).a(j[1][28]);
            var68.a(0, 1);
            var68.h = 0;
            var68.c();
            var102 = var34;
            d var206 = var68;
            var68.a = var102;
            var206.b = 380;
            d var316 = var68;
            var187 = 1;
            var353.c[var187] = var316;
            var353.c(1, var34, 380);
            var315 = (short)2000;
            var187 = 1;
            var353.d[var187] = var315;
            var34 = 550;
            if (var1) {
               var34 = mJ - 550;
            }

            d var69;
            (var69 = new d()).a(j[1][28]);
            var69.a(0, 1);
            var69.h = 0;
            var69.c();
            var315 = var34;
            d var209 = var69;
            var69.a = var315;
            var209.b = 380;
            d var319 = var69;
            var187 = 2;
            var353.c[var187] = var319;
            var353.c(2, var34, 380);
            short var320 = 2200;
            var187 = 2;
            var353.d[var187] = var320;
            short var321 = 60;
            var187 = 0;
            var353.a[var187] = var321;
            var321 = 2000;
            var187 = 0;
            var353.b[var187] = var321;
            Object var214 = null;
            var353.l = null;
            var362[var0] = var353;
            break;
         case 3:
            s[] var361 = lA;
            s var352;
            (var352 = s.a(4, 3, 1, 1, 5)).a(85);
            var352.a(0, 1000, 90);
            var352.a(1, 1200, 90);
            var352.a(2, 1300, 90);
            var352.a(3, 1400, 90);
            var352.a(4, 1500, 600);
            int var27 = 560;
            int var93 = 20000;
            short var59 = 20000;
            short var144 = 1000;
            int var255 = 860;
            if (var1) {
               var93 = -20000;
               var59 = -20000;
               var144 = -1000;
               var27 = mJ - 560 - 10;
               var255 = mJ - 860 - 300;
            }

            p var94 = p.a(10, 400, 700, var27, 380, 10, 10, var93, var59, 200000, 200000, var144, 0, -1, -1, 1, var255, 380, 300, 10, 100000);
            p var256 = var94;
            short var145 = 0;
            var352.e[var145] = var256;
            short var257 = 1000;
            var145 = (byte)0;
            var352.f[var145] = var257;
            byte var258 = 6;
            var145 = (byte)0;
            var352.g[var145] = var258;
            byte var259 = 0;
            var145 = (byte)0;
            var352.h[var145] = 0;
            var259 = 0;
            var145 = (byte)0;
            var352.i[var145] = var259;
            int var261 = 0;
            var145 = (byte)0;
            var352.j[var145] = false;
            var261 = (byte)1;
            var145 = (byte)0;
            var352.k[var145] = var261;
            var352.b(0, 0, 0);
            var27 = 460;
            var93 = (short)10000;
            var59 = 10000;
            var261 = 510;
            if (var1) {
               var93 = (short)-10000;
               var59 = -10000;
               var27 = mJ - 460 - 200;
               var261 = mJ - 510 - 200;
            }

            p var96 = p.a(10, 700, 1000, var27, 380, 200, 10, var93, var59, 20000, 40000, 0, 0, -1, -1, 1, var261, 180, 200, 10, 1000);
            p var264 = var96;
            var145 = (byte)1;
            var352.e[var145] = var264;
            short var265 = 1400;
            var145 = (byte)1;
            var352.f[var145] = var265;
            byte var266 = 35;
            var145 = (byte)1;
            var352.g[var145] = var266;
            byte var267 = 0;
            var145 = (byte)1;
            var352.h[var145] = 0;
            var267 = 3;
            var145 = (byte)1;
            var352.i[var145] = var267;
            int var269 = 0;
            var145 = (byte)1;
            var352.j[var145] = false;
            var269 = (byte)0;
            var145 = (byte)1;
            var352.k[var145] = var269;
            var352.b(1, 0, 0);
            var27 = 560;
            var93 = (short)20000;
            var59 = 20000;
            var145 = 1000;
            var269 = 860;
            if (var1) {
               var93 = (short)-20000;
               var59 = -20000;
               var145 = -1000;
               var27 = mJ - 560 - 10;
               var269 = mJ - 860 - 300;
            }

            p var98 = p.a(10, 400, 700, var27, 280, 10, 10, var93, var59, 200000, 200000, var145, 0, -1, -1, 1, var269, 330, 300, 10, 100000);
            p var272 = var98;
            short var160 = 2;
            var352.e[var160] = var272;
            short var273 = 1300;
            var160 = (byte)2;
            var352.f[var160] = var273;
            byte var274 = 6;
            var160 = (byte)2;
            var352.g[var160] = var274;
            byte var275 = 0;
            var160 = (byte)2;
            var352.h[var160] = 0;
            var275 = 0;
            var160 = (byte)2;
            var352.i[var160] = var275;
            int var277 = 0;
            var160 = (byte)2;
            var352.j[var160] = false;
            var277 = (byte)1;
            var160 = (byte)2;
            var352.k[var160] = var277;
            var352.b(2, 0, 0);
            var27 = 560;
            var93 = (short)20000;
            var59 = 20000;
            var160 = 1000;
            var277 = 860;
            if (var1) {
               var93 = (short)-20000;
               var59 = -20000;
               var160 = -1000;
               var27 = mJ - 560 - 10;
               var277 = mJ - 860 - 300;
            }

            p var100 = p.a(10, 400, 600, var27, 180, 10, 10, var93, var59, 200000, 200000, var160, 0, -1, -1, 1, var277, 230, 300, 10, 100000);
            p var280 = var100;
            byte var168 = 3;
            var352.e[var168] = var280;
            short var281 = 1600;
            var168 = 3;
            var352.f[var168] = var281;
            byte var282 = 6;
            var168 = 3;
            var352.g[var168] = var282;
            byte var283 = 0;
            var168 = 3;
            var352.h[var168] = 0;
            var283 = 0;
            var168 = 3;
            var352.i[var168] = var283;
            int var285 = 0;
            var168 = 3;
            var352.j[var168] = false;
            var285 = (byte)1;
            var168 = 3;
            var352.k[var168] = var285;
            var352.b(3, 0, 0);
            q(1, 28);
            var27 = 530;
            if (var1) {
               var27 = mJ - 530;
            }

            d var63;
            (var63 = new d()).a(j[1][28]);
            var63.a(0, 1);
            var63.h = 0;
            var285 = var27;
            d var175 = var63;
            var63.a = var285;
            var175.b = 380;
            d var288 = var63;
            var168 = 0;
            var352.c[var168] = var288;
            var352.c(0, var27, 380);
            int var289 = 1800;
            var168 = 0;
            var352.d[var168] = var289;
            var27 = 560;
            if (var1) {
               var27 = mJ - 560;
            }

            d var64;
            (var64 = new d()).a(j[1][28]);
            var64.a(0, 1);
            var64.h = 0;
            var64.c();
            var93 = var27;
            d var178 = var64;
            var64.a = var93;
            var178.b = 380;
            d var290 = var64;
            var168 = 1;
            var352.c[var168] = var290;
            var352.c(1, var27, 380);
            var289 = (short)2000;
            var168 = 1;
            var352.d[var168] = var289;
            var27 = 550;
            if (var1) {
               var27 = mJ - 550;
            }

            d var65;
            (var65 = new d()).a(j[1][28]);
            var65.a(0, 1);
            var65.h = 0;
            var65.c();
            d var292 = var65;
            var168 = 2;
            var352.c[var168] = var292;
            var352.c(2, var27, 380);
            var289 = (short)2200;
            var168 = 2;
            var352.d[var168] = var289;
            var289 = var27;
            d var183 = var65;
            var65.a = var289;
            var183.b = 380;
            short var295 = 60;
            var168 = 0;
            var352.a[var168] = var295;
            var295 = 2000;
            var168 = 0;
            var352.b[var168] = var295;
            Object var186 = null;
            var352.l = null;
            var361[var0] = var352;
            break;
         case 4:
         case 9:
            s[] var360 = lA;
            s var351;
            (var351 = s.a(0, 4, 4, 1, 4)).a(84);
            var351.a(0, 1000, 100);
            var351.a(1, 1150, 100);
            var351.a(2, 1300, 100);
            var351.a(3, 1450, 500);
            int var23 = 540;
            if (var1) {
               var23 = R() - 540;
            }

            d var89;
            (var89 = new d()).a(j[3][2]);
            var89.a(0, 1);
            var89.h = 0;
            var351.a(0, var89);
            var351.c(0, var23, 440);
            var351.g(0, 1000);
            int var140 = var23;
            d var57 = var89;
            var89.a = var140;
            var57.b = 440;
            var23 = 560;
            if (var1) {
               var23 = R() - 560;
            }

            (var89 = new d()).a(j[3][2]);
            var89.a(0, 1);
            var89.h = 0;
            var140 = var23;
            d var253 = var89;
            var89.a = var140;
            var253.b = 440;
            var351.a(1, var89);
            var351.c(1, var23, 440);
            var351.g(1, 1150);
            var23 = 610;
            if (var1) {
               var23 = R() - 610;
            }

            (var89 = new d()).a(j[3][2]);
            var89.a(0, 1);
            var89.h = 0;
            var140 = var23;
            var253 = var89;
            var89.a = var140;
            var253.b = 440;
            var351.a(2, var89);
            var351.c(2, var23, 440);
            var351.g(2, 1300);
            var23 = 510;
            if (var1) {
               var23 = R() - 510;
            }

            (var89 = new d()).a(j[3][2]);
            var89.a(0, 1);
            var89.h = 0;
            var140 = var23;
            var57 = var89;
            var89.a = var140;
            var57.b = 440;
            var351.a(3, var89);
            var351.c(3, var23, 440);
            var351.g(3, 1450);
            var351.e(0, 60);
            var351.f(0, 1500);
            var351.e(1, 30);
            var351.f(1, 1000);
            var351.e(2, 30);
            var351.f(2, 1150);
            var351.e(3, 30);
            var351.f(3, 1300);
            var351.a(null);
            var360[var0] = var351;
            break;
         case 5:
            s[] var359 = lA;
            s var350;
            (var350 = s.a(0, 1, 1, 1, 1)).a(83);
            var350.a(0, 1050, 2000);
            int var22 = 310;
            if (var1) {
               var22 = mJ - 310;
            }

            d var88;
            (var88 = new d()).a(j[3][4]);
            var88.a(1, 1);
            var88.h = 1;
            int var134 = var22;
            d var56 = var88;
            var88.a = var134;
            var56.b = 380;
            if (var1) {
               var88.c();
            }

            d var249 = var88;
            byte var135 = 0;
            var350.c[var135] = var249;
            var350.c(0, var22, 380);
            short var250 = 1000;
            var135 = 0;
            var350.d[var135] = var250;
            byte var251 = 60;
            var135 = 0;
            var350.a[var135] = var251;
            short var252 = 3000;
            var135 = 0;
            var350.b[var135] = var252;
            Object var139 = null;
            var350.l = null;
            var359[var0] = var350;
            break;
         case 6:
            s[] var358 = lA;
            s var349;
            (var349 = s.a(0, 3, 1, 1, 3)).a(84);
            var349.a(0, 1050, 800);
            var349.a(0, 1450, 800);
            var349.a(0, 1850, 1000);
            int var19 = 510;
            if (var1) {
               var19 = mJ - 510;
            }

            d var85;
            (var85 = new d()).a(j[3][4]);
            var85.a(0, 1);
            var85.h = 0;
            var85.c();
            int var127 = var19;
            d var55 = var85;
            var85.a = var127;
            var55.b = 380;
            d var243 = var85;
            int var128 = 0;
            var349.c[var128] = var243;
            var349.c(0, var19, 380);
            short var244 = 1000;
            var128 = (byte)0;
            var349.d[var128] = var244;
            var19 = 560;
            if (var1) {
               var19 = mJ - 560;
            }

            (var85 = new d()).a(j[3][4]);
            var85.a(0, 1);
            var85.h = 0;
            var128 = var19;
            var243 = var85;
            var85.a = var128;
            var243.b = 380;
            var243 = var85;
            int var131 = 1;
            var349.c[var131] = var243;
            var349.c(1, var19, 380);
            short var247 = 1800;
            var131 = (byte)1;
            var349.d[var131] = var247;
            var19 = 610;
            if (var1) {
               var19 = mJ - 610;
            }

            (var85 = new d()).a(j[3][4]);
            var85.a(0, 1);
            var85.h = 0;
            var131 = var19;
            var243 = var85;
            var85.a = var131;
            var243.b = 380;
            var349.a(2, var85);
            var349.c(2, var19, 380);
            var349.g(2, 1400);
            var349.e(0, 60);
            var349.f(0, 3000);
            var349.a(null);
            var358[var0] = var349;
            break;
         case 7:
            s[] var357 = lA;
            s var348;
            (var348 = s.a(2, 3, 1, 1, 5)).a(86);
            var348.a(0, 1650, 30);
            var348.a(1, 1700, 30);
            var348.a(2, 1750, 30);
            var348.a(3, 1800, 30);
            var348.a(4, 1850, 1050);
            int var14 = 210;
            short var122 = 1;
            int var239 = 10;
            if (var1) {
               var122 = -1;
               var14 = R() - 210 - 200;
               var239 = R() - 10 - 10;
            }

            p var81 = p.a(5, 400, 800, var14, 480, 200, 10, 0, 0, -50000, -50000, var122, -1000, -1, -1, 1, var239, 10, 10, 10, 0);
            var348.a(0, var81);
            var348.a(0, 1000);
            var348.b(0, 3);
            var348.c(0, 0);
            var348.d(0, 3);
            var348.a(0, false);
            var348.a(0, (byte)1);
            var348.b(0, 0, 0);
            var14 = 210;
            int var82 = 200000;
            int var51 = 300000;
            var122 = 20000;
            var239 = 610;
            if (var1) {
               var82 = -300000;
               var51 = -200000;
               var122 = -20000;
               var14 = R() - 210 - 200;
               var239 = R() - 610 - 10;
            }

            var81 = p.a(5, 500, 900, var14, 330, 200, 100, var82, var51, 0, 0, var122, 0, -1, -1, 1, var239, 440, 10, 10, 1000);
            var348.a(1, var81);
            var348.a(1, 1600);
            var348.b(1, 3);
            var348.c(1, 0);
            var348.d(1, 4);
            var348.a(1, false);
            var348.a(1, (byte)1);
            var348.b(1, 0, 0);
            q(1, 28);
            var14 = 530;
            if (var1) {
               var14 = R() - 530;
            }

            d var52;
            (var52 = new d()).a(j[1][28]);
            var52.a(0, 1);
            var52.h = 0;
            var239 = var14;
            d var124 = var52;
            var52.a = var239;
            var124.b = 380;
            var348.a(0, var52);
            var348.c(0, var14, 380);
            var348.g(0, 1800);
            var14 = 560;
            if (var1) {
               var14 = R() - 560;
            }

            d var53;
            (var53 = new d()).a(j[1][28]);
            var53.a(0, 1);
            var53.h = 0;
            int var84 = var14;
            d var125 = var53;
            var53.a = var84;
            var125.b = 380;
            var348.a(1, var53);
            var348.c(1, var14, 380);
            var348.g(1, 2000);
            var14 = 550;
            if (var1) {
               var14 = R() - 550;
            }

            d var54;
            (var54 = new d()).a(j[1][28]);
            var54.a(0, 1);
            var54.h = 0;
            var54.c();
            var239 = var14;
            d var126 = var54;
            var54.a = var239;
            var126.b = 380;
            var348.a(2, var54);
            var348.c(2, var14, 380);
            var348.g(2, 2000);
            var348.e(0, 60);
            var348.f(0, 2000);
            var348.a(null);
            var357[var0] = var348;
            break;
         case 8:
            s[] var356 = lA;
            s var347;
            (var347 = s.a(2, 3, 1, 1, 5)).a(85);
            var347.a(0, 1000, 90);
            var347.a(1, 1200, 90);
            var347.a(2, 1300, 90);
            var347.a(3, 1400, 90);
            var347.a(4, 1500, 200);
            int var9 = 210;
            short var117 = 1;
            int var6 = 10;
            if (var1) {
               var117 = -1;
               var9 = R() - 210 - 200;
               var6 = R() - 10 - 10;
            }

            p var77 = p.a(20, 400, 800, var9, 480, 200, 10, 0, 0, -50000, -50000, var117, -1000, -1, -1, 1, var6, 10, 10, 10, 0);
            var347.a(0, var77);
            var347.a(0, 1000);
            var347.b(0, 35);
            var347.c(0, 0);
            var347.d(0, 3);
            var347.a(0, false);
            var347.a(0, (byte)0);
            var347.b(0, 0, 0);
            var9 = 210;
            int var78 = 200000;
            int var47 = 300000;
            var117 = 20000;
            var6 = 610;
            if (var1) {
               var78 = -300000;
               var47 = -200000;
               var117 = -20000;
               var9 = R() - 210 - 200;
               var6 = R() - 610 - 10;
            }

            var77 = p.a(20, 500, 900, var9, 330, 200, 100, var78, var47, 0, 0, var117, 0, -1, -1, 1, var6, 320, 10, 10, 0);
            var347.a(1, var77);
            var347.a(1, 1600);
            var347.b(1, 35);
            var347.c(1, 0);
            var347.d(1, 4);
            var347.a(1, false);
            var347.a(1, (byte)0);
            var347.b(1, 0, 0);
            q(1, 28);
            var9 = 530;
            if (var1) {
               var9 = R() - 530;
            }

            d var48;
            (var48 = new d()).a(j[1][28]);
            var48.a(0, 1);
            var48.h = 3;
            var6 = var9;
            d var119 = var48;
            var48.a = var6;
            var119.b = 380;
            var347.a(0, var48);
            var347.c(0, var9, 380);
            var347.g(0, 1800);
            var9 = 560;
            if (var1) {
               var9 = R() - 560;
            }

            d var49;
            (var49 = new d()).a(j[1][28]);
            var49.a(0, 1);
            var49.h = 3;
            var49.c();
            int var80 = var9;
            d var120 = var49;
            var49.a = var80;
            var120.b = 380;
            var347.a(1, var49);
            var347.c(1, var9, 380);
            var347.g(1, 2000);
            var9 = 550;
            if (var1) {
               var9 = R() - 550;
            }

            d var50;
            (var50 = new d()).a(j[1][28]);
            var50.a(0, 1);
            var50.h = 3;
            var50.c();
            var6 = var9;
            d var121 = var50;
            var50.a = var6;
            var121.b = 380;
            var347.a(2, var50);
            var347.c(2, var9, 380);
            var347.g(2, 2200);
            var347.e(0, 60);
            var347.f(0, 2000);
            var347.a(null);
            var356[var0] = var347;
            break;
         case 10:
            lA[var0] = u(var1);
         case 11:
         case 12:
         default:
            break;
         case 13:
            s[] var10000 = lA;
            s var7;
            (var7 = s.a(0, 1, 2, 1, 2)).a(86);
            var7.a(0, 1000, 300);
            var7.a(1, 2500, 500);
            int var2 = 590;
            if (var1) {
               var2 = R() - 590;
            }

            d var4;
            (var4 = new d()).a(j[3][3]);
            var4.a(11, 1);
            var4.h = 2;
            int var5 = var2;
            d var3 = var4;
            var4.a = var5;
            var3.b = 380;
            var7.a(0, var4);
            var7.c(0, var2, 380);
            var7.g(0, 1000);
            var7.e(0, 30);
            var7.f(0, 2500);
            var7.e(1, 60);
            var7.f(1, 2660);
            var7.a(null);
            var10000[var0] = var7;
      }

      lp = 1700;
      if (lA[var0] != null) {
         lA[var0].a();
      }
   }

   private static void bj(int var0, int var1) {
      if (lh != 0) {
         short var2 = ag[37][53][2];
         int var3 = ag[37][53][3] - 100;
         v.a(var0, var1, m + var2, n + var3);
         if (lh == 2) {
            v.a(var0, var1 << 1, m + var2, n + var3);
         }
      }
   }

   private static s u(boolean var0) {
      s var6;
      (var6 = s.a(2, 5, 1, 1, 7)).a(87);
      var6.a(0, 1000, 90);
      var6.a(1, 1200, 90);
      var6.a(2, 1300, 90);
      var6.a(3, 1400, 90);
      var6.a(4, 1500, 1300);
      var6.a(5, 2850, 100);
      var6.a(6, 2070, 200);
      int var1 = mJ / 2;
      int var2 = mK / 2;
      if (var0) {
         var1 = mJ - var1;
      }

      d var3;
      (var3 = new d()).a(j[3][6]);
      var3.a(7, 1);
      var3.h = 1;
      int var5 = var1;
      d var4 = var3;
      var3.a = var5;
      var4.b = var2;
      d var34 = var3;
      var6.c[0] = var34;
      var6.c(0, var1, var2);
      var6.d[0] = 0;
      var1 = mJ / 2;
      var2 = mK / 2;
      if (var0) {
         var1 = mJ - var1;
      }

      (var3 = new d()).a(j[3][6]);
      var3.a(7, 1);
      var3.h = 1;
      int var7 = var2;
      var5 = var1;
      var4 = var3;
      var3.a = var5;
      var4.b = var7;
      d var36 = var3;
      var6.c[1] = var36;
      var6.c(1, var1, var2);
      var6.d[1] = 50;
      var1 = mJ / 2;
      var2 = mK / 2;
      if (var0) {
         var1 = mJ - var1;
      }

      (var3 = new d()).a(j[3][6]);
      var3.a(7, 1);
      var3.h = 2;
      var7 = var2;
      var5 = var1;
      var4 = var3;
      var3.a = var5;
      var4.b = var7;
      d var38 = var3;
      var6.c[2] = var38;
      var6.c(2, var1, var2);
      var6.d[2] = 100;
      var1 = mJ / 2;
      var2 = mK / 2;
      if (var0) {
         var1 = mJ - var1;
      }

      (var3 = new d()).a(j[3][6]);
      var3.a(7, 1);
      var3.h = 2;
      var7 = var2;
      var5 = var1;
      var4 = var3;
      var3.a = var5;
      var4.b = var7;
      d var40 = var3;
      var6.c[3] = var40;
      var6.c(3, var1, var2);
      var6.d[3] = 150;
      var1 = mJ / 2;
      var2 = mK / 2;
      if (var0) {
         var1 = mJ - var1;
      }

      (var3 = new d()).a(j[3][6]);
      var3.a(7, 1);
      var3.h = 2;
      var7 = var2;
      var5 = var1;
      var4 = var3;
      var3.a = var5;
      var4.b = var7;
      d var42 = var3;
      var6.c[4] = var42;
      var6.c(4, var1, var2);
      var6.d[4] = 200;
      var1 = 0;
      var2 = mJ;
      int var26 = mK;
      int var32 = mJ / 2;
      var5 = mK / 2;
      if (var0) {
         var1 = mJ - var2;
         var32 = mJ - var32 - 10;
      }

      p var13 = p.a(20, 1000, 400, var1, 0, var2, var26, 0, 0, 0, 0, 0, 0, -1, -1, 1, var32, var5, 10, 10, 2000);
      p var44 = var13;
      var6.e[0] = var44;
      var6.f[0] = 1000;
      var6.g[0] = 3;
      var6.h[0] = 0;
      var6.i[0] = 0;
      var6.j[0] = false;
      var6.k[0] = 0;
      var6.b(0, 0, 0);
      var1 = 0;
      var2 = mJ;
      int var27 = mK;
      int var33 = mJ / 2;
      var5 = mK / 2;
      if (var0) {
         var1 = mJ - var2;
         var33 = mJ - var33 - 10;
      }

      p var15 = p.a(10, 1000, 400, var1, 0, var2, var27, 0, 0, 0, 0, 0, 0, -1, -1, 1, var33, var5, 10, 10, 2000);
      p var46 = var15;
      var6.e[1] = var46;
      var6.f[1] = 1000;
      var6.g[1] = 3;
      var6.h[1] = 0;
      var6.i[1] = 0;
      var6.j[1] = false;
      var6.k[1] = 1;
      var6.b(1, 0, 0);
      var6.l = null;
      return var6;
   }

   private static void dx() {
      for (int var0 = 0; var0 < lA.length; var0++) {
         lA[var0] = null;
      }

      lB = null;
   }

   private static void dy() {
      for (int var0 = 0; var0 < lA.length; var0++) {
         if (lA[var0] != null) {
            lA[var0].d();
         }
      }

      if (lB != null) {
         lB.d();
      }
   }

   private static void dz() {
      x();
      int var0 = c(3);
      if (r) {
         q.x();
      }

      l(42, 0);
      d(false);
      r = false;
      z = 3;
      q.e(3);
      by = 2;
      M(3);
      bz = 11;
      cS[var0] = 600000;
      M = false;
   }

   private static void dA() {
      y();
      d(false);
      r = true;
      z = 0;
      q.e(0);
      q.w();
      by = 2;
      M(3);
      bz = 5;
   }

   private static String[][] bt(int var0) {
      if (lR == null) {
         return null;
      }

      String[][] var1;
      if (lR.length == 1) {
         var1 = null;
      } else {
         var1 = new String[lR.length - 1][7];
         int var2 = 0;

         for (int var3 = 0; var3 < lR.length; var3++) {
            if (var0 != var3) {
               var1[var2][0] = lR[var3][0];
               var1[var2][1] = lR[var3][1];
               var1[var2][2] = lR[var3][2];
               var1[var2][3] = lR[var3][3];
               var1[var2][4] = lR[var3][4];
               var1[var2][5] = lR[var3][5];
               var1[var2][6] = lR[var3][6];
               var2++;
            }
         }
      }

      as();
      return var1;
   }

   private static void bu(int var0) {
      lR[var0][0] = "1";
      as();
   }

   private static boolean bv(int var0) {
      return !lR[var0][0].equals("0");
   }

   private static int dB() {
      int var0 = 0;
      if (lR != null) {
         for (int var1 = 0; var1 < lR.length; var1++) {
            if (lR[var1][0].equals("0")) {
               var0++;
            }
         }
      }

      return var0;
   }

   private static void dC() {
      d(74, 18, false);
      d(74, 19, false);
   }

   private static void dD() {
      b(19, false, false);
      switch (lU) {
         case 3:
            h(u(230));
            return;
         case 4:
            return;
         case 5:
            h(u(231));
            if (!lG || lJ) {
               lP = lO;
               lJ = false;
               bA();
               byte[] var10000 = w.a(ab);
               String var0 = f(var10000, var10000.length);
               String var3 = "public";
               String var2 = var0;
               String var1 = "world";
               var0 = "me";
               Object[] var4;
               (var4 = new Object[5])[0] = new Integer(17);
               var4[1] = var0;
               var4[2] = var1;
               var4[3] = var2;
               var4[4] = var3;
               return;
            } else if (i == 15) {
               dD();
               return;
            } else if (i == 14) {
               dC();
            }
         default:
            return;
         case 20:
            h(u(231));
            return;
         case 22:
            h(u(231));
      }
   }

   private static boolean dE() {
      int var0;
      return dP >= 0 && dQ != null ? (var0 = dQ[dP][1]) == 151 || var0 == 152 : false;
   }

   private static boolean dF() {
      return dP < 0 ? false : dQ[dP][1] == 151;
   }

   private static boolean dG() {
      return dP < 0 ? false : dQ[dP][1] == 152;
   }

   private static w dH() {
      w var0;
      (var0 = new w()).d = 2;
      var0.e = new int[17];
      var0.e[0] = w.a(ab, 2) + 1;
      var0.e[1] = 16;
      var0.e[12] = 7;
      var0.c = 0;
      return var0;
   }

   private static void bw(int var0) {
      switch (var0 % 9) {
         case 0:
            ba(var0);

            for (int var2 = 0; var2 < kv; var2++) {
               if (kA[var2] != -1) {
                  a(60);
                  int var1 = q.a(kE[var2], (byte)1).bc;
                  a(84, 11 + var2 * 5, false);
                  d(84, 14 + var2 * 5, false);
                  a(84, 13 + var2 * 5, true);
                  n(84, 12 + var2 * 5, var1);
                  g(84, 12 + var2 * 5, true);
               }
            }
      }
   }

   private static void dI() {
      lV = false;
      M(13);
   }

   private static void dJ() {
      byte[] var0 = s("PN_DRAGONTOKENS");
      int var1 = 0;
      int var2 = 0;
      int var3;
      if (var0 != null && F() && !bF && (var3 = c(var0, 0)) != 0) {
         lW = new String[var3][];
         var1 += 4;

         for (int var4 = 0; var4 < var3; var4++) {
            var2 = c(var0, var1);
            var1 += 4;
            lW[var4] = new String[2];
            lW[var4][0] = "" + var2;
            var2 = c(var0, var1);
            var1 += 4;
            byte[] var5 = new byte[var2];
            b(var0, var1, var5);
            lW[var4][1] = new String(var5);
            var1 += var2;
         }
      } else {
         lW = null;
      }
   }

   public static String w(int var0) {
      if (lW != null) {
         for (int var1 = 0; var1 < lW.length; var1++) {
            if (lW[var1][0].equals("" + var0)) {
               return lW[var1][1];
            }
         }
      }

      return null;
   }

   public static void a(int var0, String var1) {
      if (lW == null) {
         (lW = new String[1][2])[0][0] = "" + var0;
         lW[0][1] = var1;
      } else {
         String[][] var2 = new String[lW.length + 1][2];

         for (int var3 = 0; var3 < lW.length; var3++) {
            var2[var3][0] = lW[var3][0];
            var2[var3][1] = lW[var3][1];
         }

         var2[var2.length - 1][0] = "" + var0;
         var2[var2.length - 1][1] = var1;
         lW = var2;
      }

      dK();
   }

   public static void x(int var0) {
      if (lW.length == 1) {
         lW = null;
      } else {
         String[][] var1 = new String[lW.length - 1][2];
         int var2 = 0;

         for (int var3 = 0; var3 < lW.length; var3++) {
            if (!lW[var3][0].equals("" + var0)) {
               var1[var2][0] = lW[var3][0];
               var1[var2][1] = lW[var3][1];
               var2++;
            }
         }

         lW = var1;
      }

      dK();
   }

   private static void dK() {
      mb++;
   }

   public static void J() {
   }

   public static String K() {
      String var0 = "java";
      mc++;
      return var0;
   }

   private static void c(long var0) {
      for (int var2 = 0; var2 < mi.length; var2++) {
         if (mi[var2][0] == var0) {
            mi[var2][1] = 86400000L;
            break;
         }
      }

      aB();
   }

   private static int j(String var0) {
      var0 = var0.substring(var0.indexOf(58) + 1);
      long var1 = -1L;

      try {
         var1 = Long.parseLong(var0);
      } catch (NumberFormatException var5) {
      }

      long var3 = var1;
      if (mi != null) {
         for (int var7 = 0; var7 < mi.length; var7++) {
            if (mi[var7][0] == var3) {
               return (int)mi[var7][1];
            }
         }
      }

      d(var3);
      return 0;
   }

   private static void k(String var0) {
      var0 = var0.substring(var0.indexOf(58) + 1);
      long var1 = -1L;

      try {
         var1 = Long.parseLong(var0);
      } catch (NumberFormatException var5) {
      }

      long var3 = var1;

      for (int var7 = 0; var7 < mi.length; var7++) {
         if (mi[var7][0] == var3) {
            mi[var7][2] = 86400000L;
            break;
         }
      }

      aB();
   }

   private static int l(String var0) {
      var0 = var0.substring(var0.indexOf(58) + 1);
      long var1 = -1L;

      try {
         var1 = Long.parseLong(var0);
      } catch (NumberFormatException var5) {
      }

      long var3 = var1;
      if (mi != null) {
         for (int var7 = 0; var7 < mi.length; var7++) {
            if (mi[var7][0] == var3) {
               return (int)mi[var7][3];
            }
         }
      }

      d(var3);
      return 0;
   }

   private static int m(String var0) {
      var0 = var0.substring(var0.indexOf(58) + 1);
      long var1 = -1L;

      try {
         var1 = Long.parseLong(var0);
      } catch (NumberFormatException var5) {
      }

      long var3 = var1;
      if (mi != null) {
         for (int var7 = 0; var7 < mi.length; var7++) {
            if (mi[var7][0] == var3) {
               return (int)mi[var7][4];
            }
         }
      }

      d(var3);
      return 0;
   }

   private static void a(String var0, int var1) {
      var0 = var0.substring(var0.indexOf(58) + 1);
      long var2 = -1L;

      try {
         var2 = Long.parseLong(var0);
      } catch (NumberFormatException var6) {
      }

      int var8 = var1;
      long var4 = var2;

      for (int var9 = 0; var9 < mi.length; var9++) {
         if (mi[var9][0] == var4) {
            mi[var9][5] = var8;
            break;
         }
      }

      aB();
   }

   private static int n(String var0) {
      var0 = var0.substring(var0.indexOf(58) + 1);
      long var1 = -1L;

      try {
         var1 = Long.parseLong(var0);
      } catch (NumberFormatException var5) {
      }

      long var3 = var1;
      if (mi != null) {
         for (int var7 = 0; var7 < mi.length; var7++) {
            if (mi[var7][0] == var3) {
               return (int)mi[var7][5];
            }
         }
      }

      d(var3);
      return 0;
   }

   private static void d(long var0) {
      if (mi == null) {
         (mi = new long[1][])[0] = new long[6];
         mi[0][0] = var0;
         mi[0][1] = 0L;
         mi[0][2] = 0L;
         mi[0][3] = 0L;
         mi[0][4] = 0L;
         mi[0][5] = 0L;
      } else {
         long[][] var2 = new long[mi.length + 1][6];

         for (int var3 = 0; var3 < mi.length; var3++) {
            var2[var3][0] = mi[var3][0];
            var2[var3][1] = mi[var3][1];
            var2[var3][2] = mi[var3][2];
            var2[var3][3] = mi[var3][3];
            var2[var3][4] = mi[var3][4];
            var2[var3][5] = mi[var3][5];
         }

         var2[var2.length - 1][0] = var0;
         var2[var2.length - 1][1] = 0L;
         var2[var2.length - 1][2] = 0L;
         var2[var2.length - 1][3] = 0L;
         var2[var2.length - 1][4] = 0L;
         var2[var2.length - 1][5] = 0L;
         mi = var2;
      }

      aB();
   }

   private static void dL() {
      if (mi != null) {
         for (int var0 = 0; var0 < mi.length; var0++) {
            mi[var0][1] = 0L;
            mi[var0][2] = 0L;
            mi[var0][3] = 0L;
            mi[var0][4] = 0L;
            mi[var0][5] = 0L;
         }
      }
   }

   private static int dM() {
      int var0 = ab.e[7];
      int var1 = ab.e[32];
      return ((int[][])T[34])[var0 - 1][0 + var1 * 3];
   }

   private static int dN() {
      int var0 = ab.e[7];
      int var1 = ab.e[32];
      return ((int[][])T[34])[var0 - 1][2 + var1 * 3];
   }

   private static int dO() {
      int var0 = ab.e[7];
      int var1 = ab.e[32];
      return ((int[][])T[34])[var0 - 1][1 + var1 * 3];
   }

   private static int a(Date var0) {
      String var2 = var0.toString().substring(0, 3);
      byte var1 = 0;
      if (var2.equals("Mon")) {
         var1 = 0;
      } else if (var2.equals("Tue")) {
         var1 = 1;
      } else if (var2.equals("Wed")) {
         var1 = 2;
      } else if (var2.equals("Thu")) {
         var1 = 3;
      } else if (var2.equals("Fri")) {
         var1 = 4;
      } else if (var2.equals("Sat")) {
         var1 = 5;
      } else if (var2.equals("Sun")) {
         var1 = 6;
      }

      return var1;
   }

   private static int bx(int var0) {
      byte var1 = 0;
      switch (var0) {
         case 0:
            var1 = 55;
            break;
         case 1:
            var1 = 55;
            break;
         case 2:
            var1 = 55;
            break;
         case 3:
            var1 = 57;
      }

      return var1;
   }

   private static int by(int var0) {
      byte var1 = 0;
      switch (var0) {
         case 0:
            var1 = 0;
            break;
         case 1:
            var1 = 1;
            break;
         case 2:
            var1 = 2;
            break;
         case 3:
            var1 = 0;
      }

      return var1;
   }

   private static int bz(int var0) {
      byte var1 = 0;
      switch (var0) {
         case 0:
            var1 = 1;
            break;
         case 1:
            var1 = 1;
            break;
         case 2:
            var1 = 1;
            break;
         case 3:
            var1 = 1;
      }

      return var1;
   }

   private static void dP() {
      for (int var0 = 0; var0 < mk.length; var0++) {
         if (mk[var0] != null) {
            mk[var0].b();
         }
      }
   }

   private static void dQ() {
      for (int var0 = 0; var0 < mk.length; var0++) {
         if (mk[var0] != null) {
            mk[var0].d();
         }
      }
   }

   public static void a(q var0, int var1, int var2, int var3) {
      a(var1, var0, var2, var3);
   }

   public static void d(int var0, int var1, int var2) {
      var1 -= m;
      var2 -= n;
      a(var0, null, var1, var2);
   }

   private static void a(int var0, q var1, int var2, int var3) {
      for (int var4 = 0; var4 < mk.length; var4++) {
         if (mk[var4] == null || mk[var4].c()) {
            if (mk[var4] == null) {
               s[] var10000 = mk;
               var2 = var2;
               int var12 = var0;
               q var9 = var1;
               s var5;
               (var5 = s.a(2, 1, 0, 0, 5)).a(0, 0, 90);
               var5.a(1, 200, 90);
               var5.a(2, 300, 90);
               var5.a(3, 400, 90);
               var5.a(4, 500, 100);
               p var6 = p.a(8, 600, 800, 0, 0, 1, 1, -30000, 30000, -30720, -25600, 0, 0, -1, -1, 1, 0, 0, 0, 0, 0);
               p var8 = var6;
               var5.e[0] = var8;
               boolean var19 = false;
               var5.f[0] = 0;
               var5.g[0] = 0;
               var5.h[0] = 0;
               var5.i[0] = 1;
               var5.j[0] = false;
               var5.k[0] = 0;
               var5.b(0, var2, var3);
               var6 = p.a(8, 600, 3000, 0, 0, 1, 1, -30000, 30000, -89600, -76800, 0, 120000, -1, -1, 1, 0, 0, 0, 0, 0);
               var8 = var6;
               var5.e[1] = var8;
               int var17 = bx(var12);
               int var7 = by(var12);
               int var13 = bz(var12);
               boolean var21 = false;
               var5.f[1] = 0;
               int var22 = var17;
               var5.g[1] = var22;
               int var23 = var13;
               var5.h[1] = var23;
               int var24 = var7;
               var5.i[1] = var24;
               var5.j[1] = true;
               var5.k[1] = 0;
               var5.b(1, var2, var3);
               var5.l = var9;
               d var10;
               (var10 = new d()).a(j[3][0]);
               var10.a(0, 1);
               d var25 = var10;
               var5.c[0] = var25;
               var5.c(0, var2, var3);
               boolean var26 = false;
               var5.d[0] = 0;
               var10000[var4] = var5;
            } else {
               int var15 = bx(var0);
               int var18 = by(var0);
               var0 = bz(var0);
               mk[var4].l = var1;
               s var30 = mk[var4];
               int var27 = var15;
               var30.g[1] = var27;
               var30 = mk[var4];
               var27 = var0;
               var30.h[1] = var27;
               var30 = mk[var4];
               var27 = var18;
               var30.i[1] = var27;
               mk[var4].b(0, var2, var3);
               mk[var4].b(1, var2, var3);
               mk[var4].c(0, var2, var3);
            }

            mk[var4].a();
            return;
         }
      }
   }

   private static void dR() {
      if (!F()) {
         dS();
         dY();
      }
   }

   private static void dS() {
      for (int var0 = 0; var0 < 50; var0++) {
         mw[var0] = 1;
      }

      dT();
   }

   private static void dT() {
      for (int var0 = 0; var0 < 4; var0++) {
         mw[b(14, var0, 7)] = -1;
      }

      for (int var1 = 0; var1 < 4; var1++) {
         mw[b(14, var1, 8)] = -1;
      }

      for (int var2 = 0; var2 < 2; var2++) {
         mw[b(14, var2, 9)] = -1;
      }
   }

   private static boolean dU() {
      dT();
      my = 0;

      do {
         int var0 = 0;

         for (int var1 = 0; var1 < 50; var1++) {
            if (ad(var1) || ab.e[7] < b(2, var1, 18)) {
               var0++;
            } else if (!bA(var1) && mw[var1] == 1) {
               mx[my] = var1;
               my++;
            }
         }

         if (var0 == 50) {
            return false;
         }

         if (my <= 0) {
            dS();
         }
      } while (my <= 0);

      return true;
   }

   private static void dV() {
      dT();
      my = 0;
      int var0 = 0;

      do {
         var0 = 0;

         for (int var1 = 49; var1 >= 0; var1--) {
            if (ab.e[7] >= eV[var1][18]) {
               if (!bA(var1) && mw[var1] == 1) {
                  mx[my] = var1;
                  my++;
               }

               var0++;
            }

            if (var0 > 5) {
               break;
            }
         }

         if (my <= 0) {
            dS();
         }
      } while (my <= 0);
   }

   private static boolean bA(int var0) {
      for (int var1 = 0; var1 < 3; var1++) {
         if (mt[var1] == 0 && mu[var1] == var0) {
            return true;
         }
      }

      return false;
   }

   private static int bB(int var0) {
      int var1 = n(0, 100);
      if ((var0 = var0 / 2) >= mB.length) {
         var0 = mB.length - 1;
      }

      var0 = mB[var0];
      int var2 = 0;
      int var3 = 0;

      for (int var4 = 0; var4 < 8; var4++) {
         var2 += (var0 + -120) * var4 + 1000;
      }

      int var8;
      for (var8 = 0; var8 < 8; var8++) {
         int var5 = (var0 + -120) * var8 + 1000;
         var3 += var5 * 100 / var2;
         if (var1 < var3) {
            break;
         }
      }

      return var8 * 5 + 20;
   }

   private static void dW() {
      boolean var0 = F();
      dT();
      mA = 0;

      for (int var1 = 0; var1 < 7; var1++) {
         if (b(3, var1, 16) == 1) {
            mz[mA] = var1 & 65535;
            mz[mA] = mz[mA] | 65536;
            mA++;
         }
      }

      for (int var3 = 0; var3 < 6; var3++) {
         if (b(4, var3, 16) == 1 && q.c(b(4, var3, 0)) <= 0) {
            mz[mA] = var3 & 65535;
            mz[mA] = mz[mA] | 196608;
            mA++;
         }
      }

      for (int var4 = 0; var4 < 17; var4++) {
         if (b(5, var4, 8) == 1) {
            mz[mA] = var4 & 65535;
            mz[mA] = mz[mA] | 131072;
            mA++;
         }
      }

      if (var0) {
         for (int var5 = 0; var5 < 50; var5++) {
            if (ad(var5) && mw[var5] != -1) {
               mz[mA] = var5 & 65535;
               mz[mA] = mz[mA];
               mA++;
            }

            if (mA > 50) {
               break;
            }
         }
      }

      int[] var2 = new int[]{0, 0, 0};

      do {
         var2[0] = n(0, mA);
         var2[1] = n(0, mA);
         var2[2] = n(0, mA);
      } while (var2[0] == var2[1] || var2[0] == var2[2] || var2[1] == var2[2]);

      for (int var6 = 0; var6 < 3; var6++) {
         mu[var6] = mz[var2[var6]] & 65535;
         mt[var6] = mz[var2[var6]] >> 16 & 65535;
         mv[var6] = bB(ml);
      }
   }

   private static void dX() {
      mC++;
   }

   private static void dY() {
      String var0 = "PROMOSYSTEM";
      byte[] var1;
      a(var1 = new byte[270], 0, (byte)mm);
      a(var1, 1, (byte)mr);
      a(var1, 2, mn);
      a(var1, 10, ms);
      a(var1, 18, ml);
      a(var1, 22, mo);
      a(var1, 26, mp);
      a(var1, 30, mq);
      a(var1, 34, mt[0]);
      a(var1, 38, mu[0]);
      a(var1, 42, mv[0]);
      a(var1, 46, mt[1]);
      a(var1, 50, mu[1]);
      a(var1, 54, mv[1]);
      a(var1, 58, mt[2]);
      a(var1, 62, mu[2]);
      a(var1, 66, mv[2]);

      for (int var2 = 0; var2 < 50; var2++) {
         a(var1, 70, mw[var2]);
      }

      try {
         a(var0, var1);
      } catch (RecordStoreException var3) {
      }
   }

   private static void dZ() {
      byte[] var0;
      if ((var0 = s("PROMOSYSTEM")) != null && F() && !bF) {
         mm = var0[0];
         mr = var0[1];
         mn = e(var0, 2);
         ms = e(var0, 10);
         ml = c(var0, 18);
         mo = c(var0, 22);
         mp = c(var0, 26);
         mq = c(var0, 30);
         mt[0] = c(var0, 34);
         mu[0] = c(var0, 38);
         mv[0] = c(var0, 42);
         mt[1] = c(var0, 46);
         mu[1] = c(var0, 50);
         mv[1] = c(var0, 54);
         mt[2] = c(var0, 58);
         mu[2] = c(var0, 62);
         mv[2] = c(var0, 66);

         for (int var1 = 0; var1 < 50; var1++) {
            mw[var1] = c(var0, 70);
         }
      }
   }

   private static int bk(int var0, int var1) {
      if (mo == var1 && mp == var0) {
         return mq;
      }

      for (int var2 = 0; var2 < 3; var2++) {
         if (mt[var2] == var1 && mu[var2] == var0) {
            return mv[var2];
         }
      }

      return 0;
   }

   static a a(a var0) {
      if (!o) {
         return null;
      }

      for (int var1 = 0; var1 < mE.length; var1++) {
         if (j[mE[var1][0]][mE[var1][1]] == var0) {
            return j[mE[var1][0]][mE[var1][2]];
         }
      }

      return null;
   }

   static {
      int[] var10000 = new byte[]{
         -128,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0
      };
      int[] var0 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
      var10000 = new byte[]{0};
      byte[][] var2 = new byte[][]{{23, 1}, {63, 2}};
      R();
      S();
      R();
      S();
      R();
      S();
      R();
      S();
      R();
      S();
      R();
      S();
      R();
      S();
      R();
      S();
      R();
      S();
      R();
      S();
      R();
      S();
      int[][] var3 = new int[][]{
         {c.a - 120, 0}, {0, 0}, {0, c.b - 120}, {c.a - 120, c.b - 120}, {c.a - 120, (c.b >> 1) - 60}, {(c.a >> 1) - 60, (c.b >> 1) - 60}
      };
      var10000 = new int[]{-1, -1};
      var0 = new int[]{7203, 7204, 7205, 7206};
      var0 = new int[]{25, 15, 0};
      System.currentTimeMillis();
      new Random();
   }

   protected final void L() {
      if (ao < 0) {
         mJ = 800;
         mK = 480;
         mT = new byte[mY];
         mU = new byte[mY];
         nO = 0;
         if (!ny) {
            nx = new int[256];

            for (int var1 = 0; var1 < 256; var1++) {
               int var2 = var1;

               for (int var3 = 8; var3 > 0; var3--) {
                  if ((var2 & 1) == 1) {
                     var2 = var2 >>> 1 ^ -306674912;
                  } else {
                     var2 >>>= 1;
                  }
               }

               nx[var1] = var2;
            }

            ny = true;
         }

         long var4 = System.currentTimeMillis();
         if (mZ == null) {
            mZ = new Random(var4);
         } else {
            mZ.setSeed(var4);
         }

         ao = 0;
         new Thread(this).start();
      }
   }

   protected static void M() {
      if (!an) {
         an = true;
         d.m();
      }
   }

   protected final void N() {
      if (an) {
         long var1;
         mG = var1 = System.currentTimeMillis();
         mP = var1;
         this.mO = var1;
         an = false;
         this.ea();
         mI = true;
         if (!mM) {
            this.repaint();
         }

         eb();
      }
   }

   public final void sizeChanged(int var1, int var2) {
   }

   private void ea() {
      this.setFullScreenMode(true);
      if (mL != null && mL.getCurrent() != this) {
         mL.setCurrent(this);
      }
   }

   public final void run() {
      try {
         this.ea();
         mM = false;

         while (ao >= 0) {
            t var1 = this;
            if (!an) {
               var1.repaint();
               var1.serviceRepaints();
               long var2 = System.currentTimeMillis();
               var1.mO = Math.min(var1.mO, var2);
               Thread.sleep(Math.max(1L, mN - (var2 - var1.mO)));
               var1.mO = System.currentTimeMillis();
            } else {
               var1.mO = Math.min(var1.mO, System.currentTimeMillis());
               Thread.sleep(1L);
            }
         }
      } catch (Exception var4) {
         ao = -1;
      }

      mT = null;
      mU = null;
      nr = null;
      System.gc();
      ap.notifyDestroyed();
   }

   public final void paint(Graphics var1) {
      Graphics var2 = var1;
      t var9 = this;
      long var4 = System.currentTimeMillis() - mH;
      mH = System.currentTimeMillis();
      if (var4 > 3000L && mH != 0L) {
         M();
         var9.N();
      }

      if (!an && !mM) {
         mM = true;
         if (ao != -1) {
            for (int var6 = 0; var6 < mY; var6++) {
               mT[var6] = mU[var6];
               if (mU[var6] != 0) {
                  if (mU[var6] < 0) {
                     mU[var6] = 0;
                  } else if (mU[var6] < 126) {
                     if (mU[var6] == 1) {
                        ;
                     }

                     mU[var6]++;
                     if (var6 >= 18) {
                        mU[var6] = (byte)(-mU[var6]);
                     }
                  }
               }
            }

            if (mV > 0) {
               if (mV != Integer.MAX_VALUE) {
                  mV = mV - aq;
               }

               eb();
            }
         }

         switch (nO) {
            case 0:
            case 3:
            default:
               break;
            case 1:
               bL(4);
               break;
            case 2:
               bL(0);
         }

         nR = nT;
         nS = nU;
         if (nV) {
            bL(1);
            nV = false;
         } else if (nW) {
            bL(2);
            nW = false;
            nX = false;
         } else if (nX) {
            bL(3);
            nX = false;
         }

         nT = nP;
         nU = nQ;
         if ((aq = (int)((mG = System.currentTimeMillis()) - mP)) < 0) {
            aq = 0;
         }

         if (aq > 1000) {
            aq = 1000;
         }

         mP = mG;
         mQ = mQ + aq;
         mR++;

         try {
            mF = var2;
            am = var2;
            t var3 = var9;
            f = System.currentTimeMillis();
            switch (i) {
               case 5:
               case 6:
               case 9:
               case 11:
               case 14:
               case 15:
                  g = g + aq;
                  aK = aK + aq;
                  if (z == 0 && r.aa() > 0) {
                     ab.e[14] = ab.e[14] + aq;
                  }

                  l(44, 0);
                  l(43, 0);
               case 7:
               case 8:
               case 10:
               case 12:
               case 13:
            }

            jQ = jQ + aq;
            if (ab != null) {
               if (ab.e[12] > 0) {
                  ab.e[12] = ab.e[12] - aq;
               }

               if (ab.e[13] > 0) {
                  ab.e[13] = ab.e[13] - aq;
               }
            }

            if (bl > 0) {
               bl = bl - aq;
            }

            if (bm > 0) {
               bm = bm - aq;
            }

            if (mi != null) {
               for (int var10 = 0; var10 < mi.length; var10++) {
                  if (mi[var10][1] > 0L) {
                     mi[var10][1] = mi[var10][1] - aq;
                     if (mi[var10][1] < 0L) {
                        mi[var10][1] = 0L;
                     }
                  }

                  if (mi[var10][2] > 0L) {
                     mi[var10][2] = mi[var10][2] - aq;
                     if (mi[var10][2] < 0L) {
                        mi[var10][2] = 0L;
                     }
                  }

                  if (mi[var10][3] > 0L) {
                     mi[var10][3] = mi[var10][3] - aq;
                     if (mi[var10][3] < 0L) {
                        mi[var10][3] = 0L;
                     }
                  }

                  if (mi[var10][4] > 0L) {
                     mi[var10][4] = mi[var10][4] - aq;
                     if (mi[var10][4] < 0L) {
                        mi[var10][4] = 0L;
                     }
                  }
               }
            }

            if (ab != null && i > 3) {
               ab.e[19] = ab.e[19] - aq;
               if (ab.e[19] <= 0) {
                  String var11 = u(284);
                  ad[0] = u(3102);
                  a(var11, ad, '#');
                  ab.e[19] = 86400000;
                  j();
               }
            }

            if (ab != null) {
               ;
            }

            if (lG) {
               if (!lH && (lL = lL - aq) <= 0) {
                  lL = lK;
                  lH = true;
               }

               if (!lI && (lN = lN - aq) <= 0) {
                  lN = lM;
                  lI = true;
               }

               if (!lJ && (lP = lP - aq) <= 0) {
                  lP = lO;
                  lJ = true;
               }
            }

            if (dm == -1) {
               dm = 0;
            }

            if (dh != 0L) {
               bt();
               if (dh == 0L) {
                  dg = true;
               }
            }

            if (!cZ && di == 7) {
               di = 6;
               dc = 6;
               m.g();
            }

            if (cZ) {
               bl();
            }

            if (mh >= 5 && mg) {
               mg = false;
               if (!mf) {
                  me = System.currentTimeMillis();
                  mf = true;
               }

               if (System.currentTimeMillis() - me >= 1800000L) {
                  mh = 1;
               }
            }

            t var12 = var3;
            if (aO) {
               var12.N(3);
               dd();
               aO = false;
               aP = true;
               aM = i;
               i = aN;
               aN = -1;
            }

            if (aP) {
               aP = false;
               aQ = 0;
               aR = 0;
               if (iY == null) {
                  iY = new boolean[iX];
               }

               if (iZ == null) {
                  iZ = new boolean[iX];
               }

               if (jd == null) {
                  jd = new int[iX];
               }

               if (jb == null) {
                  jb = new int[iX];
               }

               if (ja == null) {
                  ja = new boolean[iX];
               }

               if (jc == null) {
                  jc = new int[iX][3];
               }

               if (je == null) {
                  je = new int[iX];
               }

               for (int var14 = 0; var14 < iX; var14++) {
                  iY[var14] = false;
                  iZ[var14] = false;
                  jd[var14] = 0;
                  je[var14] = 0;
                  jb[var14] = 0;
                  ja[var14] = false;
                  jc[var14][0] = 0;
                  jc[var14][1] = 0;
               }

               cQ();
               aT();
               if (jf == null) {
                  jf = new int[15][7];
               }

               if (jg == null) {
                  jg = new String[15];
               }

               if (jh == null) {
                  jh = new String[15];
               }

               if (ji == null) {
                  ji = new String[15];
               }

               jj = null;
               jk = null;
               jl = null;
               jo = 0;
               jp = 0;
               var12.N(0);
               switch (i) {
                  case 14:
                  case 15:
                     b(true);
               }
            }

            var12.N(1);
            aQ++;
            aR = aR + aq;
            if (i == 5 && lF > 0) {
               lF--;
            }

            d.j();
            var3.N(2);
            aH++;
            long var15;
            if ((var15 = System.currentTimeMillis()) - aJ > 1000L) {
               aI = 1000 * aH / (int)(var15 - aJ);
               aH = 0;
               aJ = var15;
            }

            if (N && j != null && j[0] != null && j[0][1] != null && j[0][1].j != null) {
               am.setColor(-16777216);
               int var13 = mJ / 3;
               c(am, 0, 0, var13, 20);
               j[0][1].m(1);
               j[0][1].a(am, "DBG: = " + cO, 5, 35, 20);
            }
         } catch (Exception var8) {
            ao = -1;
         }

         mM = false;
      }

      mI = false;
   }

   static final void a(String var0) {
      as = true;
      mS = var0;
      new Thread(new o()).start();
   }

   static final void O() {
      as = false;
      if (mS != null) {
         try {
            ap.platformRequest(mS);
         } catch (Exception var0) {
         }
      }

      ao = -1;
      ap.notifyDestroyed();
   }

   protected final void keyPressed(int var1) {
      byte var2 = bC(var1);
      if (mU != null) {
         if (mU[var2] <= 0) {
            if (mU[var2] < 0) {
               mU[var2] = 0;
            }

            if (mU[var2] < 126) {
               mU[var2]++;
            }
         }
      }
   }

   protected final void keyReleased(int var1) {
      byte var2 = bC(var1);
      if (mU != null) {
         if (mU[var2] > 0) {
            mU[var2] = (byte)(-mU[var2]);
         }
      }
   }

   private static byte bC(int var0) {
      Integer var2 = new Integer(var0);
      if (mW == null) {
         return 0;
      } else {
         Integer var1;
         if ((var1 = (Integer)mW.get(var2)) != null) {
            return var1.byteValue();
         } else {
            return (var1 = (Integer)mX.get(var2)) != null ? var1.byteValue() : 0;
         }
      }
   }

   private static void eb() {
      if (mT != null && mU != null) {
         for (int var0 = 0; var0 < mY; var0++) {
            mT[var0] = 0;
            mU[var0] = 0;
         }
      }
   }

   static void P() {
   }

   static final int y(int var0) {
      return var0 + 128 >> 8;
   }

   static int m(int var0, int var1) {
      var0 = var0 * var0 + var1 * var1;
      var1 = 1;

      for (int var2 = 0; var2 < 30; var2++) {
         var1 = var1 + var0 / var1 >> 1;
      }

      return var1;
   }

   static int n(int var0, int var1) {
      if (var1 != var0) {
         int var2;
         if ((var2 = mZ.nextInt()) < 0) {
            var2 = -var2;
         }

         return var0 + var2 % (var1 - var0);
      } else {
         return var1;
      }
   }

   static int z(int var0) {
      if (var0 < 0) {
         var0 = -var0;
      }

      if ((var0 = var0 & ne - 1) <= 64) {
         return na[var0];
      } else if (var0 < nc) {
         var0 = nc - var0;
         return -na[var0];
      } else if (var0 <= nd) {
         var0 -= nc;
         return -na[var0];
      } else {
         var0 = ne - var0;
         return na[var0];
      }
   }

   static int A(int var0) {
      if (var0 >= 65536) {
         if (var0 >= 16777216) {
            if (var0 >= 268435456) {
               return var0 >= 1073741824 ? nb[var0 >> 24] << 8 : nb[var0 >> 22] << 7;
            } else {
               return var0 >= 67108864 ? nb[var0 >> 20] << 6 : nb[var0 >> 18] << 5;
            }
         } else if (var0 >= 1048576) {
            return var0 >= 4194304 ? nb[var0 >> 16] << 4 : nb[var0 >> 14] << 3;
         } else {
            return var0 >= 262144 ? nb[var0 >> 12] << 2 : nb[var0 >> 10] << 1;
         }
      } else if (var0 >= 256) {
         if (var0 >= 4096) {
            return var0 >= 16384 ? nb[var0 >> 8] : nb[var0 >> 6] >> 1;
         } else {
            return var0 >= 1024 ? nb[var0 >> 4] >> 2 : nb[var0 >> 2] >> 3;
         }
      } else {
         return var0 >= 0 ? nb[var0] >> 4 : 0;
      }
   }

   static final void a(int[] var0, int[] var1) {
      int var10001 = var1[0];
      int var10002 = var1[1];
      int var10003 = var1[2];
      int var4 = var1[3];
      int var3 = var10003;
      int var2 = var10002;
      int var6 = var10001;
      var0 = var0;
      if (var0[0] > var6) {
         var0[0] = var6;
      }

      if (var0[1] > var2) {
         var0[1] = var2;
      }

      if (var0[2] < var3) {
         var0[2] = var3;
      }

      if (var0[3] < var4) {
         var0[3] = var4;
      }
   }

   private static final int b(int var0, int var1, int var2, int var3, int var4, int var5) {
      return (var0 * var4 + (var1 << 1) * var3 + var2 * var5) / 65536;
   }

   static void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var9 = var6 * var6;
      int var7;
      int var8 = (256 - var6) * (var7 = 256 - var6);
      var7 *= var6;
      at = b(var0, var2, var4, var7, var8, var9);
      au = b(var1, var3, var5, var7, var8, var9);
   }

   static final int o(int var0, int var1) {
      return (int)((long)var0 * var1 + 128L >> 8);
   }

   static final int p(int var0, int var1) {
      return (int)(((long)var0 << 8 << 1) / var1 + 1L) >> 1;
   }

   private static int bD(int var0) {
      byte var1 = 1;

      for (int var2 = 0; var2 < var0; var2++) {
         var1 *= 10;
      }

      return var1;
   }

   private static void ec() {
      int var0;
      if (np == nn - 1) {
         var0 = nl - no[np];
      } else {
         var0 = no[np + 1] - no[np];
      }

      nm = new int[var0 + 1];

      for (int var1 = 0; var1 < var0 + 1; var1++) {
         nm[var1] = ed() & 0xFF | (ed() & 0xFF) << 8 | (ed() & 0xFF) << 16 | (ed() & 0xFF) << 24;
      }
   }

   private static InputStream o(String var0) {
      return javax.microedition.lcdui.ResourceLoader.open(var0);
   }

   static final void b(String var0) {
      nh = 1;
      if (nf == null || var0 == null || var0.compareTo(nf) != 0) {
         v(true);
         nf = var0;
         ni = null;
         nj = 0;
         ng = p(nf);
         nl = (short)ee();
         no = new short[nn = (short)ee()];

         for (int var1 = 0; var1 < nn; var1++) {
            no[var1] = (short)ee();
         }

         np = 0;
         ec();
      }
   }

   private static InputStream p(String var0) {
      InputStream var1 = null;
      if (nh == 3) {
         var1 = new ByteArrayInputStream(null, 0, ((Object[])null).length);
      } else if (nh != 2 && nh == 1) {
         var1 = o(var0);
      }

      return var1;
   }

   static final void Q() {
      v(true);
   }

   private static final void v(boolean var0) {
      if (ng != null) {
         try {
            ng.close();
         } catch (Exception var1) {
         }

         ng = null;
      }

      nk = 0;
      if (nh == 3) {
         ni = null;
      }

      if (var0) {
         nf = null;
      }

      System.gc();
   }

   private static int bE(int var0) {
      int var1 = nn - 1;

      while (var1 >= 0 && no[var1] > var0) {
         var1--;
      }

      if (np != var1) {
         np = var1;
         v(false);
         if (np == 0) {
            String var7 = nf;
            nf = null;
            b(var7);
         } else {
            ng = p(nf + "." + np);
            ec();
         }
      } else if (ng == null) {
         if (np == 0) {
            String var8 = nf;
            nf = null;
            b(var8);
         } else {
            ng = p(nf + "." + np);
         }
      }

      int var5;
      int var2 = var5 = var0 - no[np];
      var1 = nm[var2];
      var2 = var5 + 1;
      var0 = nm[var2] - var1;
      if (nk != var1) {
         if (nk > var1) {
            try {
               if (ng != null) {
                  try {
                     ng.close();
                  } catch (Throwable var3) {
                  }

                  ng = null;
               }
            } catch (Throwable var4) {
            }

            if (np == 0) {
               ng = p(nf);
            } else {
               ng = p(nf + "." + np);
            }
         } else {
            var1 -= nk;
         }

         bF(var1);
      }

      if (var0 > 0) {
         aw = ed() & 0xFF;
         var0--;
      }

      return var0;
   }

   static final byte[] B(int var0) {
      byte[] var1;
      byte[] var10000 = var1 = new byte[bE(var0)];
      d(var10000, var10000.length);
      return var1;
   }

   private static void bF(int var0) {
      if (var0 != 0) {
         if (nh == 3) {
            nk += var0;

            try {
               while (var0 > 0) {
                  var0 = (int)(var0 - ng.skip(var0));
               }
            } catch (Exception var1) {
            }
         } else {
            if (nq == null) {
               nq = new byte[256];
            }

            while (var0 > 256) {
               d(nq, 256);
               var0 -= 256;
            }

            if (var0 > 0) {
               d(nq, var0);
            }
         }
      }
   }

   private static int ed() {
      int var0 = 0;

      try {
         var0 = ng.read();
      } catch (Exception var1) {
      }

      nk++;
      return var0;
   }

   private static int ee() {
      return ed() & 0xFF | (ed() & 0xFF) << 8;
   }

   private static int d(byte[] var0, int var1) {
      int var2 = 0;
      int var3 = var1;
      int var4 = 0;

      try {
         while (var3 > 0) {
            var4 = ng.read(var0, var2, var3);
            var3 -= var4;
            var2 += var4;
         }
      } catch (Exception var5) {
      }

      nk += var1;
      return var1;
   }

   static final Object C(int var0) {
      bE(var0);
      nv = 0;
      Object var1 = a(ng);
      nk = nk + nv;
      return var1;
   }

   static String D(int var0) {
      if (var0 >= nr.length) {
         return "";
      }

      try {
         return new String(nr[var0], "UTF-8");
      } catch (Exception var1) {
         return "";
      }
   }

   private static void bl(int var0, int var1) {
      am.setColor(0xFF000000 | var0 << 16 | var1 << 8);
   }

   private static void a(Graphics var0, int var1, int var2, int var3) {
      var1 = (var1 & 0xFF) << 16 | (var2 & 0xFF) << 8 | var3 & 0xFF;
      var0.setColor(var1);
   }

   static final int a(Graphics var0, boolean var1) {
      return var1 ? var0.getClipY() : var0.getClipX();
   }

   static final int b(Graphics var0, boolean var1) {
      return var1 ? a.e - var0.getClipX() - var0.getClipWidth() : var0.getClipY();
   }

   static final int c(Graphics var0, boolean var1) {
      return var1 ? var0.getClipHeight() : var0.getClipWidth();
   }

   static final int d(Graphics var0, boolean var1) {
      return var1 ? var0.getClipWidth() : var0.getClipHeight();
   }

   static final void a(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = var1;
      var1 = a.e - var2 - var4;
      var2 = var5;
      var5 = var3;
      var3 = var4;
      var4 = var5;
      var0.clipRect(var1, var2, var3, var4);
   }

   static final void b(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = var1;
      var1 = a.e - var2 - var4;
      var2 = var5;
      var5 = var3;
      var3 = var4;
      var4 = var5;
      var0.setClip(var1, var2, var3, var4);
   }

   static final boolean a(Graphics var0) {
      return var0 != null;
   }

   static final void a(Graphics var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var5) {
         var5 = var1;
         var1 = a.e - var2 - 1;
         var2 = var5;
         var5 = var3;
         var3 = a.e - var4 - 1;
         var4 = var5;
      }

      var0.drawLine(var1, var2, var3, var4);
   }

   static final void c(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = var1;
      var1 = a.e - var2 - var4;
      var2 = var5;
      var5 = var3;
      var3 = var4;
      var4 = var5;
      var0.fillRect(var1, var2, var3, var4);
   }

   static final void d(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = var1;
      var1 = a.e - var2 - var4 - 1;
      var2 = var5;
      var5 = var3;
      var3 = var4;
      var4 = var5;
      var0.drawRect(var1, var2, var3, var4);
   }

   static final void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1;
      var1 = a.e - var2 - var4;
      var2 = var7;
      var7 = var3;
      var3 = var4;
      var4 = var7;
      var5 -= 90;
      var0.fillArc(var1, var2, var3, var4, var5, var6);
   }

   static final void b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1;
      var1 = a.e - var2 - var4;
      var2 = var7;
      var7 = var3;
      var3 = var4;
      var4 = var7;
      var5 -= 90;
      var0.drawArc(var1, var2, var3, var4, var5, var6);
   }

   static final void a(String var0, int var1, int var2, int var3) {
      try {
         if (((var3 = var3) & 2) != 0) {
            var3 = var3 & -3 | 64;
         }

         am.drawString(var0, var1, var2, var3);
      } catch (Exception var4) {
      }
   }

   static final void a(Graphics var0, l var1, int var2, int var3, boolean var4) {
      try {
         if (var4) {
            var4 = var1.a.getHeight();
            int var6 = var1.a.getWidth();
            a(var0, var1, var6, var4, 0, var2, var3, 20, true);
         } else {
            var0.drawImage(var1.a, var2, var3, 20);
         }
      } catch (Exception var5) {
      }
   }

   static final void a(Graphics var0, l var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      if (var8) {
         if (var4 == 0) {
            var4 = 5;
         } else if (var4 == 5) {
            var4 = 3;
         } else if (var4 == 3) {
            var4 = 6;
         } else if (var4 == 6) {
            var4 = 0;
         } else if (var4 == 2) {
            var4 = 7;
         }

         var7 = var5;
         var5 = a.e - var6;
         var6 = var7;
         var7 = 24;
      }

      if (var2 >= var1.a.getWidth()) {
         var2 += var1.a.getWidth() - var2;
      }

      if (var3 >= var1.a.getHeight()) {
         var3 += var1.a.getHeight() - var3;
      }

      if (var3 > 0 && var2 > 0) {
         try {
            var0.drawRegion(var1.a, 0, 0, var2, var3, var4, var5, var6, var7);
         } catch (Exception var9) {
         }
      }
   }

   static final void c(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1;
      var1 = a.e - var2 - 1;
      var2 = var7;
      var7 = var3;
      var3 = a.e - var4 - 1;
      var4 = var7;
      var7 = var5;
      var5 = a.e - var6 - 1;
      var6 = var7;
      var0.fillTriangle(var1, var2, var3, var4, var5, var6);
      a(var0, var1, var2, var3, var4, false);
      a(var0, var1, var2, var5, var6, false);
      a(var0, var5, var6, var3, var4, false);
   }

   static final l a(int[] var0, int var1, int var2, boolean var3) {
      return l.a(var0, var1, var2, var3);
   }

   static final void a(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, boolean var10) {
      if (var10) {
         var2 = var7;
         if ((var9 & 4) != 0) {
            var2 = var6;
            if (((var9 = var9 & -5) & 2) != 0) {
               var9 &= -3;
            } else {
               var9 |= 2;
            }

            if ((var9 & 1) != 0) {
               var9 &= -2;
            } else {
               var9 |= 1;
            }
         } else {
            var9 |= 4;
         }

         int var11 = var4;
         var4 = a.e - var5 - var2;
         var5 = var11;
      }

      if (var9 != 0) {
         var2 = 0;
         if ((var9 & 4) != 0) {
            var2 = var6;
            var6 = var7;
            var7 = var3;
            var3 = var6;
         }

         int var12 = var9;
         var10 = var7;
         var1 = a.b(var1, var6, var10, var12);
         if ((var9 & 4) != 0) {
            var7 = var2;
         }
      }

      var2 = var0.getTranslateX();
      int var19 = var0.getTranslateY();
      var0.translate(-var2, -var19);
      var0.drawRGB(var1, 0, var3, var4 + var2, var5 + var19, var6, var7, var8);
      var0.translate(var2, var19);
   }

   static final void b(Graphics var0) {
      if (var0 == null) {
         am = mF;
      } else {
         am = var0;
      }
   }

   static final int R() {
      return mJ;
   }

   static final int S() {
      return mK;
   }

   private static boolean q(String var0) {
      try {
         return ap.platformRequest(var0);
      } catch (Exception var1) {
         return false;
      }
   }

   private static void ef() {
      try {
         if (ns < mG) {
            mL.vibrate(300);
            ns = mG + 200L;
         }
      } catch (Exception var0) {
      }
   }

   static int a(byte[] var0, int var1, byte var2) {
      var0[var1++] = var2;
      return var1;
   }

   static int a(byte[] var0, int var1, int var2) {
      var0[var1++] = (byte)var2;
      var0[var1++] = (byte)(var2 >>> 8);
      var0[var1++] = (byte)(var2 >>> 16);
      var0[var1++] = (byte)(var2 >> 24);
      return var1;
   }

   private static int a(byte[] var0, int var1, long var2) {
      var0[var1++] = (byte)(var2 & 255L);
      var0[var1++] = (byte)(var2 >>> 8 & 255L);
      var0[var1++] = (byte)(var2 >>> 16 & 255L);
      var0[var1++] = (byte)(var2 >>> 24 & 255L);
      var0[var1++] = (byte)(var2 >>> 32 & 255L);
      var0[var1++] = (byte)(var2 >>> 40 & 255L);
      var0[var1++] = (byte)(var2 >>> 48 & 255L);
      var0[var1++] = (byte)(var2 >>> 56 & 255L);
      return var1;
   }

   static byte a(byte[] var0, int var1) {
      return var0[var1];
   }

   static short b(byte[] var0, int var1) {
      return (short)(var0[var1++] & 0xFF | (var0[var1] & 255) << 8);
   }

   static int c(byte[] var0, int var1) {
      return var0[var1++] & 0xFF | (var0[var1++] & 0xFF) << 8 | (var0[var1++] & 0xFF) << 16 | (var0[var1] & 0xFF) << 24;
   }

   private static long e(byte[] var0, int var1) {
      return var0[var1++] & 0xFF
         | (long)(var0[var1++] & 0xFF) << 8
         | (long)(var0[var1++] & 0xFF) << 16
         | (long)(var0[var1++] & 0xFF) << 24
         | (long)(var0[var1++] & 0xFF) << 32
         | (long)(var0[var1++] & 0xFF) << 40
         | (long)(var0[var1++] & 0xFF) << 48
         | (long)(var0[var1] & 0xFF) << 56;
   }

   static void a(Object var0, int var1, Object var2, int var3, int var4) {
      System.arraycopy(var0, var1, var2, var3, var4);
   }

   private static int a(byte[] var0, int var1, byte[] var2) {
      a(var2, 0, var0, var1, var2.length);
      return var1 + var2.length;
   }

   private static int b(byte[] var0, int var1, byte[] var2) {
      a(var0, var1, var2, 0, var2.length);
      return var1 + var2.length;
   }

   static void a(int[] var0) {
      int var1;
      if ((var1 = var0.length) > 0) {
         var0[0] = 0;
      }

      for (byte var2 = 1; var2 < var1; var2 += var2) {
         System.arraycopy(var0, 0, var0, var2, var1 - var2 < var2 ? var1 - var2 : var2);
      }
   }

   private static Object bG(int var0) {
      Object var3 = null;

      try {
         if (nu == null || 530 < nt) {
            if (nu != null) {
               nu.close();
            }

            nu = o("/888");
            nt = 0;
         }

         nu.skip(530 - nt);
         int var1 = nu.available();
         var3 = a(nu);
         var1 -= nu.available();
         nt = var1 + 530;
      } catch (IOException var2) {
      }

      return var3;
   }

   private static Object a(InputStream var0) {
      Object[] var1 = null;

      try {
         int var2;
         int var3 = (var2 = b(var0)) >> 4;
         int var4 = var2 & 7;
         if ((var2 & 8) != 0) {
            var2 = c(var0);
         } else {
            var2 = b(var0);
         }

         switch (var4) {
            case 0:
               byte[] var17 = new byte[var2];

               for (int var13 = 0; var13 < var2; var13++) {
                  var17[var13] = (byte)b(var0);
               }

               var1 = var17;
               break;
            case 1:
               short[] var16 = new short[var2];
               if (var3 == 0) {
                  for (int var12 = 0; var12 < var2; var12++) {
                     var16[var12] = (byte)b(var0);
                  }
               } else {
                  for (int var11 = 0; var11 < var2; var11++) {
                     var16[var11] = (short)c(var0);
                  }
               }

               var1 = var16;
               break;
            case 2:
               int[] var15 = new int[var2];
               if (var3 == 0) {
                  for (int var10 = 0; var10 < var2; var10++) {
                     var15[var10] = (byte)b(var0);
                  }
               } else if (var3 == 1) {
                  for (int var9 = 0; var9 < var2; var9++) {
                     var15[var9] = (short)c(var0);
                  }
               } else {
                  for (int var8 = 0; var8 < var2; var8++) {
                     var15[var8] = d(var0);
                  }
               }

               var1 = var15;
               break;
            default:
               Object[] var14;
               switch (var4 & 3) {
                  case 0:
                     if (var3 == 2) {
                        var14 = (Object[])(new byte[var2][]);
                     } else {
                        var14 = (Object[])(new byte[var2][][]);
                     }
                     break;
                  case 1:
                     if (var3 == 2) {
                        var14 = (Object[])(new short[var2][]);
                     } else {
                        var14 = (Object[])(new short[var2][][]);
                     }
                     break;
                  default:
                     if (var3 == 2) {
                        var14 = (Object[])(new int[var2][]);
                     } else {
                        var14 = (Object[])(new int[var2][][]);
                     }
               }

               for (int var7 = 0; var7 < var2; var7++) {
                  var14[var7] = a(var0);
               }

               var1 = var14;
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   private static int b(InputStream var0) {
      int var1;
      if ((var1 = var0.read()) >= 0) {
         nv++;
      }

      return var1;
   }

   private static int c(InputStream var0) {
      return b(var0) & 0xFF | (b(var0) & 0xFF) << 8;
   }

   private static int d(InputStream var0) {
      return b(var0) & 0xFF | (b(var0) & 0xFF) << 8 | (b(var0) & 0xFF) << 16 | (b(var0) & 0xFF) << 24;
   }

   private static int a(InputStream var0, byte[] var1, int var2) {
      int var3 = 0;
      int var4 = var2;
      int var5 = 0;

      try {
         while (var4 > 0) {
            var5 = var0.read(var1, var3, var4);
            var4 -= var5;
            var3 += var5;
         }
      } catch (Exception var6) {
      }

      nv += var2;
      return var2;
   }

   private static int[] a(byte[] var0, boolean var1) {
      int var3 = (var0.length & 3) == 0 ? var0.length >>> 2 : (var0.length >>> 2) + 1;
      int[] var2;
      if (var1) {
         (var2 = new int[var3 + 1])[var3] = var0.length;
      } else {
         var2 = new int[var3];
      }

      var3 = var0.length;

      for (int var4 = 0; var4 < var3; var4++) {
         var2[var4 >>> 2] = var2[var4 >>> 2] | (255 & var0[var4]) << ((var4 & 3) << 3);
      }

      return var2;
   }

   static String a(byte[] var0) {
      StringBuffer var1 = new StringBuffer(var0.length << 1);

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1.append(nw[var0[var2] >> 4 & 15]);
         var1.append(nw[var0[var2] & 15]);
      }

      return var1.toString();
   }

   static int a(int[] var0, int var1, int var2, int var3) {
      var3 = ~var3;

      while (var2-- != 0) {
         for (int var5 = 0; var5 < 4; var5++) {
            byte var4 = (byte)(var0[var1] >> var5);
            var3 = nx[(var3 ^ var4) & 0xFF] ^ var3 >>> 8;
         }

         var1++;
      }

      return ~var3;
   }

   static byte[] a(byte[] var0, String var1) {
      byte[] var2 = null;
      if (!"".equals(var1) && var1 != null) {
         var2 = var1.getBytes();
      }

      byte[] var12 = var2;
      var0 = (byte[])var0;
      if (var0.length == 0) {
         return var0;
      }

      int[] var22 = a(var0, true);
      int[] var13 = a(var12, false);
      var0 = var22;
      int var16;
      if ((var16 = var22.length - 1) > 0) {
         if (var13.length < 4) {
            int[] var3 = new int[4];
            System.arraycopy(var13, 0, var3, 0, var13.length);
            var13 = var3;
         }

         int var18 = var0[var16];
         int var4 = 0;
         int var5 = 0;
         int var8 = 6 + 52 / (var16 + 1);

         while (var8-- > 0) {
            int var6 = (var5 += -1640531527) >>> 2 & 3;

            int var7;
            for (var7 = 0; var7 < var16; var7++) {
               var4 = var0[var7 + 1];
               var18 = var0[var7] += (var18 >>> 5 ^ var4 << 2) + (var4 >>> 3 ^ var18 << 4) ^ (var5 ^ var4) + (var13[var7 & 3 ^ var6] ^ var18);
            }

            var4 = var0[0];
            var18 = var0[var16] += (var18 >>> 5 ^ var4 << 2) + (var4 >>> 3 ^ var18 << 4) ^ (var5 ^ var4) + (var13[var7 & 3 ^ var6] ^ var18);
         }
      }

      boolean var14 = false;
      int[] var11 = var0;
      int var19;
      var2 = new byte[var19 = var0.length << 2];

      for (int var15 = 0; var15 < var19; var15++) {
         var2[var15] = (byte)(var11[var15 >>> 2] >>> ((var15 & 3) << 3));
      }

      return var2;
   }

   private static int e(InputStream var0) {
      int var1 = 0;

      try {
         var1 = b(var0);
         nC[var1] = d(var0);
         if (nC[var1] > 1024) {
            nC[var1] = 1024;
         }

         nD[var1] = new int[nC[var1] + 1];

         for (int var2 = 1; var2 < nC[var1] + 1; var2++) {
            nD[var1][var2] = d(var0);
         }

         nB[var1] = new byte[nD[var1][nC[var1]]];
         a(var0, nB[var1], nB[var1].length);
      } catch (Exception var3) {
      }

      return var1;
   }

   private static String bH(int var0) {
      int var1 = var0 >> 10;
      var0 &= 1023;
      if (nE != null && nE[var1] != null) {
         return nE[var1][var0];
      }

      try {
         int var2;
         return (var2 = nD[var1][var0 + 1] - nD[var1][var0]) == 0 ? null : new String(nB[var1], nD[var1][var0], var2, nz);
      } catch (Exception var3) {
         return null;
      }
   }

   private static int eg() {
      if (nC == null) {
         return 0;
      }

      int var0 = 0;

      for (int var1 = 0; var1 < 32; var1++) {
         var0 += nC[var1];
      }

      return var0;
   }

   static String a(long var0, int var2, String var3) {
      if (var0 < 1000L) {
         return "" + var0;
      }

      String var4 = "";
      switch (var2) {
         case 0:
         case 7:
         case 8:
         case 9:
         case 15:
         case 17:
            var4 = ",";
            break;
         case 1:
         case 3:
         case 5:
         case 16:
            var4 = ".";
            break;
         case 2:
         case 4:
         case 6:
         case 10:
            if (var0 >= 10000L) {
               var4 = var3;
            }
            break;
         case 11:
         case 14:
            if (var0 >= 10000L) {
               var4 = ".";
            }
            break;
         case 12:
         case 13:
            var4 = var3;
            break;
         default:
            return "" + var0;
      }

      String var8 = "";
      long var5 = var0 % 1000L < 0L ? -(var0 % 1000L) : var0 % 1000L;
      var0 /= 1000L;

      while (var5 != 0L || var0 != 0L) {
         if (var5 < 10L) {
            var8 = "00" + (var5 < 0L ? -var5 : var5) + var8;
         } else if (var5 < 100L) {
            var8 = "0" + (var5 < 0L ? -var5 : var5) + var8;
         } else {
            var8 = (var5 < 0L ? -var5 : var5) + var8;
         }

         var5 = var0 % 1000L;
         if ((var0 /= 1000L) != 0L) {
            var8 = var4 + var8;
         } else if (var5 != 0L) {
            var8 = var5 + var4 + var8;
            var5 = 0L;
         }
      }

      return var8;
   }

   private static void eh() {
      if (nF != null) {
         try {
            nF.closeRecordStore();
         } catch (RecordStoreException var0) {
         }

         nF = null;
      }
   }

   private static void r(String var0) {
      nF = RecordStore.openRecordStore(var0, true);
   }

   private static byte[] s(String var0) {
      String var1 = "";
      var0 = var0;
      if (!"".equals(var1)) {
         var1.getBytes();
      }

      return t(var0);
   }

   private static byte[] t(String var0) {
      byte[] var1 = null;

      try {
         r(var0);
         if (nF.getNumRecords() > 0) {
            var1 = nF.getRecord(1);
         }
      } catch (RecordStoreException var2) {
         var1 = null;
      }

      eh();
      return var1;
   }

   private static void a(String var0, byte[] var1) {
      String var2 = "";
      var1 = var1;
      var0 = var0;
      if (!"".equals(var2)) {
         var2.getBytes();
      }

      int var7 = var1.length;
      int var4 = var7;
      var1 = var1;
      r(var0);
      if (nF.getNumRecords() > 0) {
         nF.setRecord(1, var1, 0, var4);
      } else {
         nF.addRecord(var1, 0, var4);
      }

      eh();
   }

   private static void u(String var0) {
      if (s(var0) != null) {
         RecordStore.deleteRecordStore(var0);
      }
   }

   static void E(int var0) {
      if (nH == null) {
         nH = new int[1];
         nI = new int[1][];
         nJ = new l[1];
      }

      int var2 = 0;

      int var10000;
      while (true) {
         if (var2 >= nH.length) {
            var10000 = -1;
            break;
         }

         if (nH[var2] == var0) {
            var10000 = var2;
            break;
         }

         var2++;
      }

      int var1 = var10000;
      if (var10000 == -1 || nJ == null) {
         nG++;
         var1 = 0;
         nH[0] = var0;
         nI[0] = a.a;
         if (nI[0] == null) {
            nI[0] = new int[10000];
         }

         var2 = 10000;

         while (var2 > 0) {
            nI[0][--var2] = var0;
         }

         int[] var10002 = nI[0];
         boolean var4 = true;
         byte var3 = 100;
         byte var6 = 100;
         nJ[0] = l.a(var10002, var6, var3, var4);
      }

      nG = var1;
   }

   static void e(Graphics var0, int var1, int var2, int var3, int var4) {
      int var5 = a(var0, true);
      int var6 = b(var0, true);
      int var7 = c(var0, true);
      int var8 = d(var0, true);
      int var9 = var1 > var5 ? var1 : var5;
      int var10 = var2 > var6 ? var2 : var6;
      var3 = (var1 + var3 < var5 + var7 ? var1 + var3 : var5 + var7) - var9;
      var4 = (var2 + var4 < var6 + var8 ? var2 + var4 : var6 + var8) - var10;
      if (var3 > 0 && var4 > 0) {
         int var12 = var4;
         int var11 = var3;
         var1 = var10;
         b(var0, var9, var1, var11, var12);
         var1 = var9;
         var9 = a.e - var10 - var4;
         var10 = var1;
         var1 = var3;
         var3 = var4;
         var4 = var1;
         var3 += var9;
         var4 += var10;

         for (int var16 = var9; var16 < var3; var16 += 100) {
            for (int var17 = var10; var17 < var4; var17 += 100) {
               a(var0, nJ[nG], var16, var17, false);
            }
         }

         b(var0, var5, var6, var7, var8);
      }
   }

   static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var5 >>> 24;
      var5 &= 16777215;
      c(var0, var1 + 1, var2, var1 + var3, var2, var5, var6, var6);
      c(var0, var1, var2, var1, var2 + var4, var5, var6, var6);
      c(var0, var1 + var3, var2 + var4, var1 + var3, var2, var5, var6, var6);
      c(var0, var1 + var3 + 1, var2 + var4, var1, var2 + var4, var5, var6, var6);
   }

   static final int F(int var0) {
      int var1 = var0 >>> 24;
      int var3 = var0;
      int var2 = var0 >> 16 & 0xFF;
      var0 = var0 >> 8 & 0xFF;
      var3 &= 255;
      var0 = (var2 * 30 + var0 * 59 + var3 * 11) / 100;
      var2 = var0;
      int var6 = var0;
      return var1 << 24 | var6 << 16 | var6 << 8 | var2;
   }

   public static int[] G(int var0) {
      return ay[var0];
   }

   public static int T() {
      int var0;
      if ((var0 = ax & 1046496) != 0) {
         for (int var1 = 0; var1 < 20; var1++) {
            if ((var0 & 1 << var1) != 0) {
               return var1;
            }
         }
      }

      return -1;
   }

   private static final void a(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      a(var0, var1, 0, var2, var3, var4, var5, var6, var7, 0, false);
   }

   private static void ei() {
      ax = 0;
      nN = 0;
      (ay = new int[20][])[19] = new int[2];
      bI(19);
      ay[9] = new int[3];
      bI(9);
      ay[12] = new int[2];
      bI(12);
      ay[13] = new int[7];
      bI(13);
      nM = 0;
   }

   private static void bI(int var0) {
      switch (var0) {
         case 0:
            return;
         case 1:
            return;
         case 9:
            ay[9][1] = -1;
            ay[9][0] = -1;
            ay[9][2] = 0;
            return;
         case 10:
            return;
         case 11:
            return;
         case 12:
            ay[12][1] = 255;
            ay[12][0] = -1;
            return;
         case 13:
            ay[13][1] = 100;
            ay[13][2] = -1;
            ay[13][0] = -1;
            ay[13][3] = 100;
            ay[13][4] = 100;
            ay[13][5] = 0;
            ay[13][6] = 0;
            return;
         case 16:
            ay[16][0] = 0;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 14:
         case 15:
         case 17:
         default:
            return;
         case 18:
            return;
         case 19:
            ay[19][0] = -1;
            ay[19][1] = 0;
      }
   }

   private static void bJ(int var0) {
      nM |= 1 << var0;
   }

   private static void bK(int var0) {
      nM &= ~(1 << var0);
   }

   static final void H(int var0) {
      ax |= 1 << var0;
      if ((1 << var0 & 2559) != 0) {
         ax &= -2560;
      }

      if ((1 << var0 & 31) != 0) {
         bJ(var0);
      }
   }

   static final void a(int var0, boolean var1) {
      ax &= ~(1 << var0);
      if ((1 << var0 & 31) != 0) {
         bK(var0);
      }

      if (var1) {
         bI(var0);
      }
   }

   static final boolean I(int var0) {
      return (ax & 1 << var0) != 0;
   }

   static final void e(int var0, int var1, int var2) {
      ay[var0][var1] = var2;
   }

   static final int U() {
      int var0;
      return (var0 = ay[13][1]) != 100 ? var0 : ay[13][3];
   }

   static final int V() {
      int var0;
      return (var0 = ay[13][1]) != 100 ? var0 : ay[13][4];
   }

   static final boolean W() {
      return ay[13][5] != 0;
   }

   static final int X() {
      return ay[13][6];
   }

   static final void J(int var0) {
      e(13, 1, var0);
      e(13, 3, var0);
      e(13, 4, var0);
   }

   static final void a(boolean var0) {
      e(13, 5, var0 ? 1 : 0);
   }

   static final int Y() {
      return ay[16][0];
   }

   static final void K(int var0) {
      ay[16][1] = var0;
   }

   static final int Z() {
      return ay[16][1];
   }

   static final void L(int var0) {
      ay[16][2] = var0;
   }

   static final int aa() {
      return ay[16][2];
   }

   static final void a(int var0, int var1, int var2, int[] var3) {
      int var4 = z(64 - var0);
      var0 = z(var0);
      b(var4, var0, var1, var2, var3);
   }

   private static void b(int var0, int var1, int var2, int var3, int[] var4) {
      var4[0] = y(var2 * var1 - var3 * var0);
      var4[1] = y(var3 * var1 + var2 * var0);
   }

   static final void a(int var0, int var1, int var2, int var3, int[] var4) {
      b(var0, var1, 0, var3, a.f);
      int var5 = a.f[0];
      int var6 = a.f[1];
      b(var0, var1, var2, var3, a.f);
      var3 = a.f[0];
      int var7 = a.f[1];
      b(var0, var1, var2, 0, a.f);
      var0 = a.f[0];
      var1 = a.f[1];
      var4[0] = Math.max(Math.abs(var3), Math.abs(var0 - var5));
      var4[1] = Math.max(Math.abs(var7), Math.abs(var1 - var6));
   }

   private static final boolean c(boolean var0, int var1) {
      if (var1 == 1) {
         return false;
      } else {
         return var1 == 2 ? true : var0;
      }
   }

   static final int[] a(Graphics var0, l var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, boolean var9) {
      int[] var17 = a.a((int[])null);
      int var13 = var5;
      int var12 = var4;
      boolean var14 = false;
      boolean var15 = false;
      int var11 = var4;
      boolean var16 = false;
      int[] var10 = var17;
      var12 = var12;
      var11 = var11;
      var10 = var10;
      var1.a.getRGB(var10, 0, var11, 0, 0, var12, var13);
      return a(var0, var17, var2, var3, var4, var5, var6, var7, var8, false);
   }

   static final int[] a(Graphics var0, int[] var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, boolean var9) {
      az = (boolean)var7;
      nK = var4;
      nL = var5;
      aA = var2;
      aB = var3;
      if ((ax & 22016) != 0) {
         if ((var6 & 4) != 0) {
            nK = var5;
            nL = var4;
            var4 = nK;
            var5 = nL;
         }

         int var11 = var5;
         var1 = a.b(var1, var4, var11, var6);
      }

      aC = var4;
      aD = var5;
      int[] var10 = a.c(var1);
      if ((ax & 8192) != 0) {
         var8 = c((boolean)var8, ay[13][0]);
         int var100;
         if ((var100 = ay[13][6]) % ne != 0) {
            var7 = 1;
            int var14 = var6;
            int var13 = var100;
            var5 = var5;
            int var12 = var4;
            var100 = var3;
            int var97 = var2;
            int[] var48 = var10;
            int[] var40 = var1;
            if ((var6 & 4) != 0) {
               var14 = var6 & -5;
               var13 += 64;
            }

            if (var14 != 0) {
               int var18 = var14;
               var48 = a.c(var40 = a.b(var40, var12, var5, var18));
            }

            int var17 = var13;
            int var16 = z(64 - var17);
            var17 = z(var13);
            a(var16, var17, var12, var5, a.f);
            int var130 = a.f[0];
            var4 = a.f[1];
            int var35 = var130 >> 1;
            int var19 = var4 >> 1;
            int var20 = var130 - var12 >> 1;
            int var21 = var4 - var5 >> 1;
            int var15 = var19 * var16;
            int var24 = -var19 * var17;
            var13 = var35 * var16;
            var14 = var35 * var17;
            int var25 = var35 - var20;
            int var26 = var19 - var21;
            var20 = -var14;
            int var22 = -var13;

            for (int var140 = 0; var140 < var130; var140++) {
               int var23 = var20 - var15;
               int var36 = var24 - var22;
               var19 = var140;

               for (int var27 = 0; var27 < var4; var27++) {
                  var13 = var25 + y(var23);
                  var14 = var26 + y(var36);
                  var23 += var16;
                  var36 += var17;
                  if (var13 >= 0 && var14 >= 0 && var13 < var12 && var14 < var5) {
                     var48[var19] = var40[var14 * var12 + var13];
                  } else {
                     var48[var19] = 0;
                  }

                  var19 += var130;
               }

               var20 += var17;
               var22 += var16;
            }

            aA = var97;
            aB = var100;
            aC = var130;
            aD = var4;
            az = true;
            var10 = var48;
            var1 = var48;
            var10 = a.c(var10);
            var2 = aA;
            var3 = aB;
            var4 = aC;
            var5 = aD;
            var6 &= ~var6;
         }

         var100 = V();
         int var104 = U();
         int var10009 = ay[13][2];
         int var131 = var6;
         int var125 = var8;
         boolean var123 = (boolean)var7;
         int var120 = var10009;
         int var114 = var104;
         int var108 = var100;
         var5 = var5;
         var104 = var4;
         var100 = var3;
         int var99 = var2;
         int[] var49 = var10;
         int[] var41 = var1;
         Graphics var37 = var0;
         int var135 = 0;
         int var138 = var131 & -2;
         if ((var131 & 4) != 0) {
            var138 = var131;
            var131 = 0;
         }

         if (var138 != 0) {
            if ((var138 & 4) != 0) {
               nK = var5;
               nL = var104;
               var104 = nK;
               var5 = nL;
            }

            var4 = var138;
            var3 = var5;
            var2 = var104;
            Object var30 = null;
            var49 = a.c(var41 = a.b(var41, var2, var3, var4));
         }

         int var141 = var104 * var108 / 100 + (var104 * var108 % 100 != 0 ? 1 : 0);
         var138 = var5 * var114 / 100 + (var5 * var114 % 100 != 0 ? 1 : 0);
         aC = var141;
         aD = var138;
         if (var141 > 0 && var138 > 0) {
            int var142 = (var104 << 8) / var141;
            int var143 = (var5 << 8) / var138;
            a(var37, false);
            b(var37, false);
            c(var37, false);
            d(var37, false);
            var114 = var141;
            int var146 = var141;
            int var147;
            if ((var147 = var49.length / var141) <= 0) {
               return null;
            }

            int var144 = var147;
            int var31 = var100;
            if (var120 < 0) {
               var4 = var147 * var141;
               if ((var131 & 1) != 0) {
                  var131 = (var114 - var146) * var142;
                  var5 = var142;
               } else {
                  var131 = (var146 - 1) * var142;
                  var5 = -var142;
               }

               if ((var144 = var138 - var138 / var147 * var147) == 0) {
                  var144 = var147;
               }

               var125 = var144;
               var135 = var144 * var141;
               int var32 = var100 + var138 - var144;
               var6 = var138;
               var7 = var138 * var143;

               while (--var6 >= 0) {
                  var114 = (((var7 -= var143) >> 8) * var104 << 8) + var131;

                  for (int var94 = var146; --var94 >= 0; var114 += var5) {
                     var49[--var135] = var41[var114 >> 8];
                  }

                  if (--var144 == 0) {
                     if (var9) {
                        a(var37, var49, var141, var99, var32, var141, var125, var123);
                     }

                     var125 = var147;
                     var32 -= var147;
                     var144 = var147;
                     var135 = var4;
                  }
               }
            } else {
               if ((var131 & 1) != 0) {
                  var4 = (var114 - 1) * var142;
                  var131 = -var142;
               } else {
                  var4 = 0;
                  var131 = var142;
               }

               if (!var125 && !var123) {
                  var120 = (var120 & 0xFF) << 24;
                  var5 = 0;

                  for (int var129 = 0; var5 < var138; var129 += var143) {
                     var108 = (var129 >> 8) * var104;
                     var6 = 0;

                     for (int var90 = var4; var6 < var141; var90 += var131) {
                        var114 = var108 + (var90 >> 8);
                        var49[var135++] = var120 | var41[var114] & 16777215;
                        var6++;
                     }

                     if (--var144 == 0) {
                        if (var9) {
                           a(var37, var49, var141, var99, var31, var141, var147, true);
                        }

                        var31 += var147;
                        var144 = var147;
                        var135 = 0;
                     }

                     var5++;
                  }
               } else if (!var125 && var123) {
                  var120 = (var120 & 0xFF) << 24;
                  var5 = 0;

                  for (int var128 = 0; var5 < var138; var128 += var143) {
                     var108 = (var128 >> 8) * var104;
                     var6 = 0;

                     for (int var89 = var4; var6 < var141; var89 += var131) {
                        var114 = var108 + (var89 >> 8);
                        if ((var8 = var41[var114] & 16777215) != 16711935 && var8 != 0) {
                           var49[var135++] = var120 | var8;
                        } else {
                           var49[var135++] = 0;
                        }

                        var6++;
                     }

                     if (--var144 == 0) {
                        if (var9) {
                           a(var37, var49, var141, var99, var31, var141, var147, true);
                        }

                        var31 += var147;
                        var144 = var147;
                        var135 = 0;
                     }

                     var5++;
                  }
               } else {
                  var5 = 0;

                  for (int var127 = 0; var5 < var138; var127 += var143) {
                     var108 = (var127 >> 8) * var104;
                     var6 = 0;

                     for (int var88 = var4; var6 < var141; var88 += var131) {
                        var114 = var108 + (var88 >> 8);
                        var8 = ((var41[var114] >>> 24) * var120 >> 8 & 0xFF & 0xFF) << 24;
                        var49[var135++] = var8 | var41[var114] & 16777215;
                        var6++;
                     }

                     if (--var144 == 0) {
                        if (var9) {
                           a(var37, var49, var141, var99, var31, var141, var147, true);
                        }

                        var31 += var147;
                        var144 = var147;
                        var135 = 0;
                     }

                     var5++;
                  }
               }

               if (var9 && var144 != var147) {
                  a(var37, var49, var141, var99, var31, var141, var147 - var144, true);
               }
            }

            return var9 ? null : var49;
         } else {
            return null;
         }
      } else {
         if ((ax & 262144) == 0 && (ax & 131072) == 0 && (ax & 65536) == 0) {
            if ((ax & 4096) != 0) {
               boolean var92 = c((boolean)var8, ay[12][0]);
               int var154 = var4 * var5;
               int var156 = ay[12][1];
               boolean var67 = var92;
               int var56 = var7;
               var3 = var156;
               var2 = var154;
               int[] var34 = var10;
               int[] var29 = var1;
               var3 = (var3 < 0 ? 0 : (var3 > 255 ? 255 : var3)) & 0xFF;
               if (var67) {
                  while (var2 > 0) {
                     if ((var56 = var29[--var2] >>> 24) != 0) {
                        var56 = (var56 * var3 >> 8 & 0xFF) << 24;
                        var34[var2] = var29[var2] & 16777215 | var56;
                     } else {
                        var34[var2] = 0;
                     }
                  }
               } else if (var56) {
                  var3 <<= 24;

                  while (var2 > 0) {
                     if ((var29[--var2] & 0xFF000000) != 0) {
                        var34[var2] = var29[var2] & 16777215 | var3;
                     } else {
                        var34[var2] = 0;
                     }
                  }
               } else {
                  var3 <<= 24;

                  while (var2 > 0) {
                     var34[--var2] = var29[var2] & 16777215 | var3;
                  }
               }

               az = true;
               return var34;
            }

            if ((ax & 512) != 0) {
               boolean var91 = c((boolean)var8, ay[9][0]);
               int var10002 = var4 * var5;
               int var10003 = ay[9][2];
               int var10004 = ay[9][1];
               int var74 = var91;
               int var63 = var7;
               var4 = var10004;
               var3 = var10003;
               var2 = var10002;
               int[] var33 = var10;
               int[] var28 = var1;
               if (var4 < 0) {
                  if (var3 <= 0) {
                     while (var2 != 0) {
                        var74 = (var63 = var28[--var2]) >> 16 & 0xFF & 0xFF;
                        var33[var2] = var63 & -65536 | var74 << 8 | var74;
                     }
                  } else if (var3 < 255) {
                     while (var2 != 0) {
                        var74 = (var63 = var28[--var2]) >> 16 & 0xFF & 0xFF;
                        var33[var2] = var63 & -65536;
                        var7 = var63 >> 8 & 0xFF & 0xFF;
                        var4 = var74 + ((var7 - var74) * var3 >> 8);
                        var33[var2] |= (var4 & 0xFF) << 8;
                        var7 = var63 & 0xFF;
                        var4 = var74 + ((var7 - var74) * var3 >> 8);
                        var33[var2] |= var4 & 0xFF;
                     }
                  } else {
                     var33 = var28;
                  }
               } else {
                  az = true;
                  if (var74) {
                     while (var2 != 0) {
                        var74 = var28[--var2] >> 16 & 0xFF & 0xFF;
                        var7 = ((var28[var2] >>> 24) * var4 >> 8 & 0xFF) << 24;
                        var33[var2] = var7 | var74 << 16 | var74 << 8 | var74;
                     }
                  } else if (var63) {
                     var4 <<= 24;

                     while (var2 != 0) {
                        if (((var63 = var28[--var2]) & 16711935) != 16711935) {
                           var74 = var63 >> 16 & 0xFF & 0xFF;
                           var33[var2] = var4 | var74 << 16 | var74 << 8 | var74;
                        } else {
                           var33[var2] = 0;
                        }
                     }
                  } else {
                     var4 <<= 24;

                     while (var2 != 0) {
                        var74 = var28[--var2] >> 16 & 0xFF & 0xFF;
                        var33[var2] = var4 | var74 << 16 | var74 << 8 | var74;
                     }
                  }
               }

               return var33;
            }

            if ((ax & 1024) == 0 && (ax & 32) == 0 && (ax & 64) == 0 && (ax & 128) == 0 && (ax & 256) == 0 && (ax & 16384) == 0) {
               ;
            }
         }

         return null;
      }
   }

   static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var5 >> 16 & 0xFF;
      int var9 = var5 >> 8 & 0xFF;
      var5 &= 255;
      int var10 = var6 >> 16 & 0xFF;
      int var11 = var6 >> 8 & 0xFF;
      var6 &= 255;
      var10 -= var8;
      var11 -= var9;
      var6 -= var5;
      var3 = var1 + var3 - 1;
      var4 = var2 + var4 - 1;
      var8 <<= 16;
      var9 <<= 16;
      var5 <<= 16;
      if (var7 == 4) {
         var7 = var3 - var1;
         var10 = (var10 << 16) / var7;
         var11 = (var11 << 16) / var7;
         var6 = (var6 << 16) / var7;

         for (int var31 = var3; var31 >= var1; var31--) {
            a(var0, var8 >> 16, var9 >> 16, var5 >> 16);
            int var47 = var31;
            a(var0, var31, var2, var47, var4, true);
            var8 += var10;
            var9 += var11;
            var5 += var6;
         }
      } else if (var7 == 8) {
         var7 = var3 - var1;
         var10 = (var10 << 16) / var7;
         var11 = (var11 << 16) / var7;
         var6 = (var6 << 16) / var7;

         for (int var29 = var1; var29 <= var3; var29++) {
            a(var0, var8 >> 16, var9 >> 16, var5 >> 16);
            int var46 = var29;
            a(var0, var29, var2, var46, var4, true);
            var8 += var10;
            var9 += var11;
            var5 += var6;
         }
      } else if (var7 == 16) {
         var7 = var4 - var2;
         var10 = (var10 << 16) / var7;
         var11 = (var11 << 16) / var7;
         var6 = (var6 << 16) / var7;

         for (int var27 = var4; var27 >= var2; var27--) {
            a(var0, var8 >> 16, var9 >> 16, var5 >> 16);
            int var45 = var27;
            int var44 = var27;
            a(var0, var1, var44, var3, var45, true);
            var8 += var10;
            var9 += var11;
            var5 += var6;
         }
      } else {
         if (var7 == 32) {
            var7 = var4 - var2;
            var10 = (var10 << 16) / var7;
            var11 = (var11 << 16) / var7;
            var6 = (var6 << 16) / var7;

            for (int var25 = var2; var25 <= var4; var25++) {
               a(var0, var8 >> 16, var9 >> 16, var5 >> 16);
               int var13 = var25;
               int var12 = var25;
               a(var0, var1, var12, var3, var13, true);
               var8 += var10;
               var9 += var11;
               var5 += var6;
            }
         }
      }
   }

   static void b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3;
      int var9 = var4;
      if (var7 == 16 || var7 == 32) {
         var8 = var4;
         var9 = var3;
      }

      if (var7 == 4 || var7 == 16) {
         int var10 = var5;
         var5 = var6;
         var6 = var10;
      }

      int[] var11 = a.a((int[])null);
      int var12 = var9 < var11.length / var8 ? var9 : var11.length / var8;
      int var13 = var5 >>> 24;
      int var14 = var5 >> 16 & 0xFF;
      int var15 = var5 >> 8 & 0xFF;
      int var16 = var5 & 0xFF;
      int var39 = var6 >>> 24;
      int var17 = var6 >> 16 & 0xFF;
      int var18 = var6 >> 8 & 0xFF;
      var6 &= 255;
      var8--;
      int var19 = (var39 - var13 << 16) / var8;
      var17 = (var17 - var14 << 16) / var8;
      int var20 = (var18 - var15 << 16) / var8;
      int var21 = (var6 - var16 << 16) / var8;
      var8++;
      var13 <<= 16;
      var14 <<= 16;
      var15 <<= 16;
      var16 <<= 16;
      if (var7 != 4 && var7 != 8) {
         var18 = 1;
         var6 = 0;
      } else {
         var18 = var3;
         var6 = -(var3 * var12) + 1;
      }

      var39 = 0;

      for (int var22 = 0; var22 < var8; var22++) {
         for (int var23 = var12; --var23 >= 0; var39 += var18) {
            var11[var39] = var5;
         }

         var13 += var19;
         var14 += var17;
         var15 += var20;
         var16 += var21;
         var5 = var13 << 8 & 0xFF000000 | var14 & 0xFF0000 | var15 >> 8 & 0xFF00 | var16 >> 16 & 0xFF;
         var39 += var6;
      }

      if (var7 != 4 && var7 != 8) {
         if (var7 == 16 || var7 == 32) {
            while (var9 > 0) {
               var8 = var12 < var9 ? var12 : var9;
               var7 = var1;
               var6 = var12;
               var39 = var8;
               var7 = var7;
               var6 = var6;
               var7 = var7;
               var6 = var6;
               a(var0, var11, 0, var6, var7, var2, var39, var4, true, 0, true);
               var1 += var12;
               var9 -= var12;
            }
         }
      } else {
         while (var9 > 0) {
            var39 = var12 < var9 ? var12 : var9;
            var7 = var2;
            var13 = var39;
            var7 = var7;
            var8 = var7;
            var7 = var3;
            a(var0, var11, 0, var7, var1, var8, var3, var13, true, 0, true);
            var2 += var12;
            var9 -= var12;
         }
      }
   }

   public final void addCommand(Command var1) {
      super.addCommand(var1);
   }

   static final int ab() {
      return nO;
   }

   private static final void bL(int var0) {
      var0 = var0;
      nO = var0;
   }

   private static final void ej() {
      int var0 = nQ;
      nQ = mK - nP;
      nP = var0;
   }

   static final int ac() {
      return nP;
   }

   static final int ad() {
      return nQ;
   }

   static final int ae() {
      return nR;
   }

   static final int af() {
      return nS;
   }

   public static String b(byte[] var0) {
      return f(var0, var0.length);
   }

   private static String f(byte[] var0, int var1) {
      if (nZ == null) {
         nZ = new int[128];

         for (int var2 = 0; var2 < nZ.length; var2++) {
            nZ[var2] = -1;
         }

         int var13 = 0;

         while (var13 < nY.length) {
            nZ[nY[var13]] = var13++;
         }
      }

      char[] var4 = new char[(var1 + 2) / 3 << 2];
      byte var14 = 0;

      for (byte var3 = 0; var3 < var4.length; var3 += 4) {
         int var10002 = var1 - var14;
         byte var9 = var3;
         char[] var8 = var4;
         int var7 = var10002;
         byte var6 = var14;
         byte[] var5 = var0;
         byte var11 = 0;
         byte var12 = 0;
         byte var10 = var5[var6];
         var8[var9] = nY[var10 >>> 2 & 63];
         if (var7 > 2) {
            var11 = var5[var6 + 1];
            var12 = var5[var6 + 2];
            var8[var9 + 1] = nY[(var10 << 4 & 48) + (var11 >>> 4 & 15)];
            var8[var9 + 2] = nY[(var11 << 2 & 60) + (var12 >>> 6 & 3)];
            var8[var9 + 3] = nY[var12 & 63];
         } else if (var7 > 1) {
            var11 = var5[var6 + 1];
            var8[var9 + 1] = nY[(var10 << 4 & 48) + (var11 >>> 4 & 15)];
            var8[var9 + 2] = nY[var11 << 2 & 60];
            var8[var9 + 3] = '=';
         } else {
            var8[var9 + 1] = nY[var10 << 4 & 48];
            var8[var9 + 2] = '=';
            var8[var9 + 3] = '=';
         }

         var14 += 3;
      }

      return new String(var4);
   }

   private static String e(int var0, String var1) {
      return m.b(m.b(var0, var1));
   }

   private static long f(int var0, String var1) {
      return m.a(m.b(var0, var1), var1);
   }

   private static int g(int var0, String var1) {
      return m.e(m.b(var0, var1));
   }

   private static int ek() {
      int var0 = m.f();
      String var1 = m.h();
      return m.b(var0, var1);
   }

   private static void c(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var3 - var1;
      int var9 = var4 - var2;
      if ((var8 < 0 ? -var8 : var8) > (var9 < 0 ? -var9 : var9)) {
         if (var3 < var1) {
            var8 = var1;
            var1 = var3;
            var3 = var8;
            var8 = var2;
            var2 = var4;
            var4 = var8;
            var8 = var6;
            var6 = var7;
            var7 = var8;
         }

         var8 = var3 - var1;
         var9 = var4 - var2;
         int var54 = 0;
         if (var8 != 0) {
            var54 = (var9 << 16) / var8;
         }

         int var56 = var1;
         var1 = var2 << 16;
         var2 = var56;
         var1 += var54;
         var4 = 0;
         if (var8 != 0) {
            var4 = (var7 - var6 << 16) / var8;
         }

         int[] var35 = a.a((int[])null);
         var6 <<= 16;
         boolean var45 = false;
         var9 = var2;
         var2 = var2 > a(var0, true) ? var2 : a(var0, true);
         var3 = var3 < a(var0, true) + c(var0, true) ? var3 : a(var0, true) + c(var0, true);
         var9 = var2 - var9;
         var1 += var54 * var9;
         var6 += var4 * var9;
         var9 = b(var0, true) + d(var0, true);
         var56 = b(var0, true);

         while (var2 < var3) {
            int var59;
            if ((var59 = var1 >> 16) >= var56 && var59 < var9) {
               var45 = true;
               int var62 = var1 & 65535;
               int var68 = (65535 - var62 >> 8) * var6 & 0xFF000000;
               var35[0] = var68 | var5;
               var68 = (var62 >> 8) * var6 & 0xFF000000;
               var35[1] = var68 | var5;
               var59 = var59;
               var68 = var2;
               var68 = var68;
               int var72 = var59;
               var62 = var68;
               a(var0, var35, 0, 1, var62, var72, 1, 2, true, 0, true);
               var1 += var54;
               var6 += var4;
            } else {
               var1 += var54;
               var6 += var4;
               if (var45) {
                  return;
               }
            }

            var2++;
         }
      } else {
         if (var4 < var2) {
            var8 = var1;
            var1 = var3;
            var3 = var8;
            var8 = var2;
            var2 = var4;
            var4 = var8;
            var8 = var6;
            var6 = var7;
            var7 = var8;
         }

         var8 = var3 - var1;
         var9 = var4 - var2;
         int var10 = 0;
         if (var9 != 0) {
            var10 = (var8 << 16) / var9;
         }

         int var11 = var2;
         var1 <<= 16;
         var2 = var11;
         var1 += var10;
         var3 = var4;
         var4 = 0;
         if (var9 != 0) {
            var4 = (var7 - var6 << 16) / var9;
         }

         var6 <<= 16;
         int[] var34 = a.a;
         boolean var40 = false;
         var9 = var2;
         var2 = var2 > b(var0, true) ? var2 : b(var0, true);
         var3 = var3 < b(var0, true) + d(var0, true) ? var3 : b(var0, true) + d(var0, true);
         var9 = var2 - var9;
         var1 += var10 * var9;
         var6 += var4 * var9;
         var9 = a(var0, true) + c(var0, true);
         var11 = a(var0, true);

         while (var2 < var3) {
            int var12;
            if ((var12 = var1 >> 16) >= var11 && var12 < var9) {
               var40 = true;
               int var13 = var1 & 65535;
               int var14 = (65535 - var13 >> 8) * var6 & 0xFF000000;
               var34[0] = var14 | var5;
               var14 = (var13 >> 8) * var6 & 0xFF000000;
               var34[1] = var14 | var5;
               int var58 = var2;
               var14 = var12;
               var14 = var14;
               int var67 = var58;
               var13 = var14;
               a(var0, var34, 0, 2, var13, var67, 2, 1, true, 0, true);
               var1 += var10;
               var6 += var4;
            } else {
               var1 += var10;
               var6 += var4;
               if (var40) {
                  return;
               }
            }

            var2++;
         }
      }
   }

   public static boolean a(char[] var0, int var1) {
      if (od == null) {
         od = (int[][])bG(530);
      }

      int var3 = 0;

      for (int var2 = 0; var2 < var1; var2++) {
         int var5;
         if ((var5 = bM(var0[var2])) == 3 || var5 == 4) {
            var3 = 1;
            break;
         }
      }

      if (!var3) {
         return false;
      }

      int[] var51 = new int[var1];
      int[] var6 = new int[var1];
      byte[] var7 = new byte[var1];
      var3 = 1;
      int var4 = 18;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;

      for (int var18 = 0; var18 < var1; var18++) {
         var8 = bM(var0[var18]);
         byte var10000 = var0[var18] == 1 || var0[var18] == '\\';
         int var11 = 0;
         if (var10000 && var18 < var1 - 1) {
            if (var0[var18] == '\\') {
               var10 = (byte)(var0[var18 + 1] - '0');
            } else {
               var10 = (byte)var0[var18 + 1];
            }

            var0[var18] = 14;
            var0[var18 + 1] = 14;
            var7[var18] = -1;
            var7[var18 + 1] = -1;
            var8 = 14;
         }

         if (var7[var18] != -1) {
            var7[var18] = (byte)var10;
         }

         switch (var8) {
            case 1:
               var3 = var6[var18] = var3 + 2 & -2;
               var6[var18] = bm(var6[var18], var4);
               var4 = 18;
               break;
            case 2:
               var3 = var6[var18] = var3 + 2 & -2;
               var4 = 0;
               var8 = 0;
               var9 = 1;
               break;
            case 3:
            case 4:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            default:
               var6[var18] = var3;
               if (var4 != 18) {
                  var8 = var4;
               }
               break;
            case 5:
               var3 = var6[var18] = var3 + 1 | 1;
               var6[var18] = bm(var6[var18], var4);
               var4 = 18;
               break;
            case 6:
               var3 = var6[var18] = var3 + 1 | 1;
               var4 = 3;
               var8 = 3;
               var9 = 1;
               break;
            case 7:
               var4 = var18;
               int[] var33 = var6;
               if (var4 > 0) {
                  var11 = var33[--var4];

                  while (var4 >= 0 && var33[var4] == var11) {
                     var4--;
                  }

                  var10000 = (byte)(var4 >= 0 ? var33[var4] : -1);
               } else {
                  var10000 = -1;
               }

               label525: {
                  byte var69 = var10000;
                  if (var10000 == -1) {
                     var3 = 1;
                  } else {
                     var3 = var69 & 63;
                     int var12;
                     if (((var12 = var69 & 192) & 64) != 0) {
                        var4 = 3;
                        break label525;
                     }

                     if ((var12 & 128) != 0) {
                        var4 = 0;
                        break label525;
                     }
                  }

                  var4 = 18;
               }

               var6[var18] = var3;
               break;
            case 16:
            case 17:
               var6[var18] = var3;
               var8 = 18;
               if (var4 != 18) {
                  var8 = var4;
               }
         }

         var51[var18] = var8;
      }

      if (var9) {
         for (int var19 = 0; var19 < var1; var19++) {
            var6[var19] &= 63;
         }
      }

      for (int var20 = 0; var20 < var1; var20++) {
         switch (var51[var20]) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
               var51[var20] = 14;
               var0[var20] = 31;
               break;
            case 3:
            case 4:
         }
      }

      var3 = 1;
      int var70 = 0;

      for (int var21 = 0; var21 < var1; var21++) {
         if (var6[var21] != var3) {
            var3 = var6[var21];
            var70++;
         }
      }

      int[] var73 = new int[++var70];
      var4 = 0;
      var8 = 0;
      var3 = 1;

      for (int var22 = 0; var22 < var1; var22++) {
         if (var6[var22] != var3) {
            var73[var4++] = var8;
            var8 = var22;
            var3 = var6[var22];
         }
      }

      var73[var4] = var8;
      var3 = 1;

      for (int var48 = 0; var48 < var70; var48++) {
         var9 = var73[var48];
         var8 = a(var73, var48, var1);
         var10 = var6[var9];
         int var13;
         if (var48 == var70 - 1) {
            var13 = 1;
         } else {
            var13 = var6[var73[var13 = var48 + 1]];
         }

         int var14 = Math.max(var3, var10) % 2;
         int var15 = Math.max(var10, var13) % 2;
         int var16 = var14;
         int var17 = var14;

         for (int var23 = var9; var23 < var8; var23++) {
            if (var51[var23] == 13) {
               var51[var23] = var16;
            }

            if (var51[var23] == 8 && var17 == 4) {
               var51[var23] = 11;
            }

            if (var51[var23] == 4) {
               var17 = var51[var23];
               var51[var23] = 3;
            } else if (var51[var23] == 3 || var51[var23] == 0) {
               var17 = var51[var23];
            }

            var16 = var51[var23];
         }

         var16 = var14;
         var17 = var14;

         for (int var24 = var9; var24 < var8; var24++) {
            var3 = var24 == var8 - 1 ? var15 : var51[var24 + 1];
            if (var16 == 8 && var3 == 8) {
               if (var51[var24] == 9 || var51[var24] == 12) {
                  var51[var24] = var3;
               }
            } else if (var16 == 11 && var3 == 11 && var51[var24] == 12) {
               var51[var24] = var3;
            }

            if (var51[var24] == 10 || var51[var24] == 14) {
               if (var16 == 8) {
                  var51[var24] = var16;
               } else {
                  var3 = var24 + 1;

                  while (var3 < var8 && (var51[var3] == 10 || var51[var3] == 14)) {
                     var3++;
                  }

                  if (var3 < var8 && var51[var3] == 8) {
                     for (int var61 = var24; var61 < var3; var61++) {
                        var51[var61] = 8;
                     }
                  }
               }
            }

            switch (var51[var24]) {
               case 9:
               case 10:
               case 12:
               case 14:
                  var51[var24] = 18;
               case 11:
               case 13:
               default:
                  if (var17 == 0 && var51[var24] == 8) {
                     var51[var24] = var17;
                  }

                  if (var51[var24] == 3 || var51[var24] == 0 || var51[var24] == 4) {
                     var17 = var51[var24];
                  }

                  var16 = var51[var24];
            }
         }

         var3 = var10;
      }

      var3 = 1;

      for (int var49 = 0; var49 < var70; var49++) {
         var9 = var73[var49];
         var8 = a(var73, var49, var1);
         int var77 = (var10 = var6[var9]) % 2 == 0 ? 0 : 3;
         int var81;
         if (var49 == var70 - 1) {
            var81 = 1;
         } else {
            var81 = var6[var73[var81 = var49 + 1]];
         }

         int var87 = Math.max(var3, var10) % 2;
         int var92 = Math.max(var10, var81) % 2;
         int var94 = var87;
         var3 = -1;

         for (int var25 = var9; var25 <= var8; var25++) {
            byte var63 = -1;
            switch (var25 == var8 ? var92 : var51[var25]) {
               case 0:
                  var63 = 0;
               case 1:
               case 2:
               case 4:
               case 5:
               case 6:
               case 7:
               case 9:
               case 10:
               case 12:
               case 13:
               default:
                  break;
               case 3:
               case 8:
               case 11:
                  var63 = 3;
                  break;
               case 14:
               case 15:
               case 16:
               case 17:
               case 18:
                  if (var3 == -1) {
                     var3 = var25;
                  }
            }

            if (var63 != -1) {
               if (var3 != -1) {
                  var81 = var94 == var63 ? var94 : var77;

                  while (var3 < var25) {
                     var51[var3] = var81;
                     var3++;
                  }
               }

               var94 = var63;
               var3 = -1;
            }
         }

         var3 = var10;
      }

      for (int var26 = 0; var26 < var1; var26++) {
         if ((var6[var26] & 1) == 0) {
            if (var51[var26] != 3) {
               if (var51[var26] == 11 || var51[var26] == 8) {
                  var6[var26] += 2;
               }
               continue;
            }
         } else if (var51[var26] != 0 && var51[var26] != 8 && var51[var26] != 11) {
            continue;
         }

         var6[var26]++;
      }

      var3 = var1 - 1;

      while (var3 > 0 && bM(var0[var3]) == 17) {
         var3--;
      }

      if (var3 < var1 - 1) {
         var3++;

         while (var3 < var1) {
            var6[var3] = 1;
            var3++;
         }
      }

      for (int var27 = 0; var27 < var1; var27++) {
         if ((var8 = bM(var0[var27])) != 17) {
            if (var8 == 15 || var8 == 16) {
               var6[var27] = 1;
            }
         } else {
            var3 = var27;

            while (var3 < var1 && bM(var0[var3]) == 17) {
               var3++;
            }

            if (var3 == var1 || bM(var0[var3]) == 15 || bM(var0[var3]) == 16) {
               while (--var3 >= var27) {
                  var6[var3] = 1;
               }
            }
         }
      }

      for (int var28 = 0; var28 < var1; var28++) {
         if (var6[var28] % 2 == 1) {
            var0[var28] = a(var0[var28]);
         }
      }

      int var29 = 0;
      var9 = var6[0];

      while (var29 < var1) {
         if (var6[var29] > var9) {
            var9 = var6[var29];
         }

         var29++;
      }

      for (int var58 = var9; var58 > 0; var58--) {
         var10 = var1;
         int var52 = var9;
         var29 = var58;
         int[] var72 = var6;
         byte[] var50 = var7;
         char[] var44 = var0;
         int var74 = 0;
         int var78 = 0;
         int var84 = 0;

         while (var74 < var1 && var78 < var1) {
            int var88 = var52;
            var84 = var29;
            var78 = var74;
            var73 = var72;
            var78 = var78;

            int var96;
            while (true) {
               if (var78 >= var10) {
                  var96 = var10;
                  break;
               }

               if (var73[var78] >= var84 && var73[var78] <= var88) {
                  var96 = var78;
                  break;
               }

               var78++;
            }

            var78 = var96;
            var74 = var96;

            while (var74 < var1 && var52 >= var72[var74] && var29 <= var72[var74]) {
               var74++;
            }

            for (int var86 = var74 - 1; var86 > var78; var78++) {
               char var89 = var44[var86];
               var44[var86] = var44[var78];
               var44[var78] = var89;
               byte var90 = var50[var86];
               var50[var86] = var50[var78];
               var50[var78] = var90;
               var86--;
            }
         }
      }

      byte var59 = 0;

      for (int var31 = 0; var31 < var1 - 1; var31++) {
         if (var7[var31] == -1) {
            var0[var31] = 1;
            if (var31 < var1 - 2) {
               var59 = var7[var31 + 2];
            }

            var0[var31 + 1] = (char)var59;
            var7[var31 + 1] = 0;
         }
      }

      return true;
   }

   private static char a(char var0) {
      if ((var0 & '\uff00') == 0) {
         switch (var0) {
            case '(':
               var0 = ')';
               break;
            case ')':
               var0 = '(';
               break;
            case '<':
               var0 = '>';
               break;
            case '>':
               var0 = '<';
               break;
            case '[':
               var0 = ']';
               break;
            case ']':
               var0 = '[';
               break;
            case '{':
               var0 = '}';
               break;
            case '}':
               var0 = '{';
               break;
            case '«':
               var0 = 187;
               break;
            case '»':
               var0 = 171;
         }
      } else if ((var0 & '\uff00') == 8192) {
         switch (var0) {
            case '‹':
               var0 = 8250;
               break;
            case '›':
               var0 = 8249;
               break;
            case '⁅':
               var0 = 8262;
               break;
            case '⁆':
               var0 = 8261;
               break;
            case '⁽':
               var0 = 8318;
               break;
            case '⁾':
               var0 = 8317;
               break;
            case '₍':
               var0 = 8334;
               break;
            case '₎':
               var0 = 8333;
         }
      } else if ((var0 & '\uff00') == 8704) {
         switch (var0) {
            case '∈':
               var0 = 8715;
               break;
            case '∉':
               var0 = 8716;
               break;
            case '∊':
               var0 = 8717;
               break;
            case '∋':
               var0 = 8712;
               break;
            case '∌':
               var0 = 8713;
               break;
            case '∍':
               var0 = 8714;
            case '∎':
            case '∏':
            case '∐':
            case '∑':
            case '−':
            case '∓':
            case '∔':
            case '∖':
            case '∗':
            case '∘':
            case '∙':
            case '√':
            case '∛':
            case '∜':
            case '∝':
            case '∞':
            case '∟':
            case '∠':
            case '∡':
            case '∢':
            case '∣':
            case '∤':
            case '∥':
            case '∦':
            case '∧':
            case '∨':
            case '∩':
            case '∪':
            case '∫':
            case '∬':
            case '∭':
            case '∮':
            case '∯':
            case '∰':
            case '∱':
            case '∲':
            case '∳':
            case '∴':
            case '∵':
            case '∶':
            case '∷':
            case '∸':
            case '∹':
            case '∺':
            case '∻':
            case '∾':
            case '∿':
            case '≀':
            case '≁':
            case '≂':
            case '≄':
            case '≅':
            case '≆':
            case '≇':
            case '≈':
            case '≉':
            case '≊':
            case '≋':
            case '≌':
            case '≍':
            case '≎':
            case '≏':
            case '≐':
            case '≑':
            case '≖':
            case '≗':
            case '≘':
            case '≙':
            case '≚':
            case '≛':
            case '≜':
            case '≝':
            case '≞':
            case '≟':
            case '≠':
            case '≡':
            case '≢':
            case '≣':
            case '≬':
            case '≭':
            case '⊌':
            case '⊍':
            case '⊎':
            case '⊓':
            case '⊔':
            case '⊕':
            case '⊖':
            case '⊗':
            case '⊙':
            case '⊚':
            case '⊛':
            case '⊜':
            case '⊝':
            case '⊞':
            case '⊟':
            case '⊠':
            case '⊡':
            case '⊤':
            case '⊥':
            case '⊧':
            case '⊪':
            case '⊬':
            case '⊭':
            case '⊮':
            case '⊯':
            case '⊸':
            case '⊹':
            case '⊺':
            case '⊻':
            case '⊼':
            case '⊽':
            case '⊾':
            case '⊿':
            case '⋀':
            case '⋁':
            case '⋂':
            case '⋃':
            case '⋄':
            case '⋅':
            case '⋆':
            case '⋇':
            case '⋈':
            case '⋎':
            case '⋏':
            case '⋒':
            case '⋓':
            case '⋔':
            case '⋕':
            case '⋮':
            case '⋯':
            case '⋵':
            case '⋸':
            case '⋹':
            default:
               break;
            case '∕':
               var0 = 10741;
               break;
            case '∼':
               var0 = 8765;
               break;
            case '∽':
               var0 = 8764;
               break;
            case '≃':
               var0 = 8909;
               break;
            case '≒':
               var0 = 8787;
               break;
            case '≓':
               var0 = 8786;
               break;
            case '≔':
               var0 = 8789;
               break;
            case '≕':
               var0 = 8788;
               break;
            case '≤':
               var0 = 8805;
               break;
            case '≥':
               var0 = 8804;
               break;
            case '≦':
               var0 = 8807;
               break;
            case '≧':
               var0 = 8806;
               break;
            case '≨':
               var0 = 8809;
               break;
            case '≩':
               var0 = 8808;
               break;
            case '≪':
               var0 = 8811;
               break;
            case '≫':
               var0 = 8810;
               break;
            case '≮':
               var0 = 8815;
               break;
            case '≯':
               var0 = 8814;
               break;
            case '≰':
               var0 = 8817;
               break;
            case '≱':
               var0 = 8816;
               break;
            case '≲':
               var0 = 8819;
               break;
            case '≳':
               var0 = 8818;
               break;
            case '≴':
               var0 = 8821;
               break;
            case '≵':
               var0 = 8820;
               break;
            case '≶':
               var0 = 8823;
               break;
            case '≷':
               var0 = 8822;
               break;
            case '≸':
               var0 = 8825;
               break;
            case '≹':
               var0 = 8824;
               break;
            case '≺':
               var0 = 8827;
               break;
            case '≻':
               var0 = 8826;
               break;
            case '≼':
               var0 = 8829;
               break;
            case '≽':
               var0 = 8828;
               break;
            case '≾':
               var0 = 8831;
               break;
            case '≿':
               var0 = 8830;
               break;
            case '⊀':
               var0 = 8833;
               break;
            case '⊁':
               var0 = 8832;
               break;
            case '⊂':
               var0 = 8835;
               break;
            case '⊃':
               var0 = 8834;
               break;
            case '⊄':
               var0 = 8837;
               break;
            case '⊅':
               var0 = 8836;
               break;
            case '⊆':
               var0 = 8839;
               break;
            case '⊇':
               var0 = 8838;
               break;
            case '⊈':
               var0 = 8841;
               break;
            case '⊉':
               var0 = 8840;
               break;
            case '⊊':
               var0 = 8843;
               break;
            case '⊋':
               var0 = 8842;
               break;
            case '⊏':
               var0 = 8848;
               break;
            case '⊐':
               var0 = 8847;
               break;
            case '⊑':
               var0 = 8850;
               break;
            case '⊒':
               var0 = 8849;
               break;
            case '⊘':
               var0 = 10680;
               break;
            case '⊢':
               var0 = 8867;
               break;
            case '⊣':
               var0 = 8866;
               break;
            case '⊦':
               var0 = 10974;
               break;
            case '⊨':
               var0 = 10980;
               break;
            case '⊩':
               var0 = 10979;
               break;
            case '⊫':
               var0 = 10981;
               break;
            case '⊰':
               var0 = 8881;
               break;
            case '⊱':
               var0 = 8880;
               break;
            case '⊲':
               var0 = 8883;
               break;
            case '⊳':
               var0 = 8882;
               break;
            case '⊴':
               var0 = 8885;
               break;
            case '⊵':
               var0 = 8884;
               break;
            case '⊶':
               var0 = 8887;
               break;
            case '⊷':
               var0 = 8886;
               break;
            case '⋉':
               var0 = 8906;
               break;
            case '⋊':
               var0 = 8905;
               break;
            case '⋋':
               var0 = 8908;
               break;
            case '⋌':
               var0 = 8907;
               break;
            case '⋍':
               var0 = 8771;
               break;
            case '⋐':
               var0 = 8913;
               break;
            case '⋑':
               var0 = 8912;
               break;
            case '⋖':
               var0 = 8919;
               break;
            case '⋗':
               var0 = 8918;
               break;
            case '⋘':
               var0 = 8921;
               break;
            case '⋙':
               var0 = 8920;
               break;
            case '⋚':
               var0 = 8923;
               break;
            case '⋛':
               var0 = 8922;
               break;
            case '⋜':
               var0 = 8925;
               break;
            case '⋝':
               var0 = 8924;
               break;
            case '⋞':
               var0 = 8927;
               break;
            case '⋟':
               var0 = 8926;
               break;
            case '⋠':
               var0 = 8929;
               break;
            case '⋡':
               var0 = 8928;
               break;
            case '⋢':
               var0 = 8931;
               break;
            case '⋣':
               var0 = 8930;
               break;
            case '⋤':
               var0 = 8933;
               break;
            case '⋥':
               var0 = 8932;
               break;
            case '⋦':
               var0 = 8935;
               break;
            case '⋧':
               var0 = 8934;
               break;
            case '⋨':
               var0 = 8937;
               break;
            case '⋩':
               var0 = 8936;
               break;
            case '⋪':
               var0 = 8939;
               break;
            case '⋫':
               var0 = 8938;
               break;
            case '⋬':
               var0 = 8941;
               break;
            case '⋭':
               var0 = 8940;
               break;
            case '⋰':
               var0 = 8945;
               break;
            case '⋱':
               var0 = 8944;
               break;
            case '⋲':
               var0 = 8954;
               break;
            case '⋳':
               var0 = 8955;
               break;
            case '⋴':
               var0 = 8956;
               break;
            case '⋶':
               var0 = 8957;
               break;
            case '⋷':
               var0 = 8958;
               break;
            case '⋺':
               var0 = 8946;
               break;
            case '⋻':
               var0 = 8947;
               break;
            case '⋼':
               var0 = 8948;
               break;
            case '⋽':
               var0 = 8950;
               break;
            case '⋾':
               var0 = 8951;
         }
      } else if ((var0 & '\uff00') == 8960) {
         switch (var0) {
            case '⌈':
               var0 = 8969;
               break;
            case '⌉':
               var0 = 8968;
               break;
            case '⌊':
               var0 = 8971;
               break;
            case '⌋':
               var0 = 8970;
               break;
            case '〈':
               var0 = 9002;
               break;
            case '〉':
               var0 = 9001;
         }
      } else if ((var0 & '\uff00') == 9984) {
         switch (var0) {
            case '❨':
               var0 = 10089;
               break;
            case '❩':
               var0 = 10088;
               break;
            case '❪':
               var0 = 10091;
               break;
            case '❫':
               var0 = 10090;
               break;
            case '❬':
               var0 = 10093;
               break;
            case '❭':
               var0 = 10092;
               break;
            case '❮':
               var0 = 10095;
               break;
            case '❯':
               var0 = 10094;
               break;
            case '❰':
               var0 = 10097;
               break;
            case '❱':
               var0 = 10096;
               break;
            case '❲':
               var0 = 10099;
               break;
            case '❳':
               var0 = 10098;
               break;
            case '❴':
               var0 = 10101;
               break;
            case '❵':
               var0 = 10100;
               break;
            case '⟕':
               var0 = 10198;
               break;
            case '⟖':
               var0 = 10197;
               break;
            case '⟝':
               var0 = 10206;
               break;
            case '⟞':
               var0 = 10205;
               break;
            case '⟢':
               var0 = 10211;
               break;
            case '⟣':
               var0 = 10210;
               break;
            case '⟤':
               var0 = 10213;
               break;
            case '⟥':
               var0 = 10212;
               break;
            case '⟦':
               var0 = 10215;
               break;
            case '⟧':
               var0 = 10214;
               break;
            case '⟨':
               var0 = 10217;
               break;
            case '⟩':
               var0 = 10216;
               break;
            case '⟪':
               var0 = 10219;
               break;
            case '⟫':
               var0 = 10218;
         }
      } else if ((var0 & '\uff00') == 10496) {
         switch (var0) {
            case '⦃':
               var0 = 10628;
               break;
            case '⦄':
               var0 = 10627;
               break;
            case '⦅':
               var0 = 10630;
               break;
            case '⦆':
               var0 = 10629;
               break;
            case '⦇':
               var0 = 10632;
               break;
            case '⦈':
               var0 = 10631;
               break;
            case '⦉':
               var0 = 10634;
               break;
            case '⦊':
               var0 = 10633;
               break;
            case '⦋':
               var0 = 10636;
               break;
            case '⦌':
               var0 = 10635;
               break;
            case '⦍':
               var0 = 10640;
               break;
            case '⦎':
               var0 = 10639;
               break;
            case '⦏':
               var0 = 10638;
               break;
            case '⦐':
               var0 = 10637;
               break;
            case '⦑':
               var0 = 10642;
               break;
            case '⦒':
               var0 = 10641;
               break;
            case '⦓':
               var0 = 10644;
               break;
            case '⦔':
               var0 = 10643;
               break;
            case '⦕':
               var0 = 10646;
               break;
            case '⦖':
               var0 = 10645;
               break;
            case '⦗':
               var0 = 10648;
               break;
            case '⦘':
               var0 = 10647;
            case '⦙':
            case '⦚':
            case '⦛':
            case '⦜':
            case '⦝':
            case '⦞':
            case '⦟':
            case '⦠':
            case '⦡':
            case '⦢':
            case '⦣':
            case '⦤':
            case '⦥':
            case '⦦':
            case '⦧':
            case '⦨':
            case '⦩':
            case '⦪':
            case '⦫':
            case '⦬':
            case '⦭':
            case '⦮':
            case '⦯':
            case '⦰':
            case '⦱':
            case '⦲':
            case '⦳':
            case '⦴':
            case '⦵':
            case '⦶':
            case '⦷':
            case '⦹':
            case '⦺':
            case '⦻':
            case '⦼':
            case '⦽':
            case '⦾':
            case '⦿':
            case '⧂':
            case '⧃':
            case '⧆':
            case '⧇':
            case '⧈':
            case '⧉':
            case '⧊':
            case '⧋':
            case '⧌':
            case '⧍':
            case '⧎':
            case '⧓':
            case '⧖':
            case '⧗':
            case '⧜':
            case '⧝':
            case '⧞':
            case '⧟':
            case '⧠':
            case '⧡':
            case '⧢':
            case '⧣':
            case '⧤':
            case '⧥':
            case '⧦':
            case '⧧':
            case '⧨':
            case '⧩':
            case '⧪':
            case '⧫':
            case '⧬':
            case '⧭':
            case '⧮':
            case '⧯':
            case '⧰':
            case '⧱':
            case '⧲':
            case '⧳':
            case '⧴':
            case '⧶':
            case '⧷':
            case '⧺':
            case '⧻':
            default:
               break;
            case '⦸':
               var0 = 8856;
               break;
            case '⧀':
               var0 = 10689;
               break;
            case '⧁':
               var0 = 10688;
               break;
            case '⧄':
               var0 = 10693;
               break;
            case '⧅':
               var0 = 10692;
               break;
            case '⧏':
               var0 = 10704;
               break;
            case '⧐':
               var0 = 10703;
               break;
            case '⧑':
               var0 = 10706;
               break;
            case '⧒':
               var0 = 10705;
               break;
            case '⧔':
               var0 = 10709;
               break;
            case '⧕':
               var0 = 10708;
               break;
            case '⧘':
               var0 = 10713;
               break;
            case '⧙':
               var0 = 10712;
               break;
            case '⧚':
               var0 = 10715;
               break;
            case '⧛':
               var0 = 10714;
               break;
            case '⧵':
               var0 = 8725;
               break;
            case '⧸':
               var0 = 10745;
               break;
            case '⧹':
               var0 = 10744;
               break;
            case '⧼':
               var0 = 10749;
               break;
            case '⧽':
               var0 = 10748;
         }
      } else if ((var0 & '\uff00') == 10752) {
         switch (var0) {
            case '⨫':
               var0 = 10796;
               break;
            case '⨬':
               var0 = 10795;
               break;
            case '⨭':
               var0 = 10796;
               break;
            case '⨮':
               var0 = 10797;
            case '⨯':
            case '⨰':
            case '⨱':
            case '⨲':
            case '⨳':
            case '⨶':
            case '⨷':
            case '⨸':
            case '⨹':
            case '⨺':
            case '⨻':
            case '⨾':
            case '⨿':
            case '⩀':
            case '⩁':
            case '⩂':
            case '⩃':
            case '⩄':
            case '⩅':
            case '⩆':
            case '⩇':
            case '⩈':
            case '⩉':
            case '⩊':
            case '⩋':
            case '⩌':
            case '⩍':
            case '⩎':
            case '⩏':
            case '⩐':
            case '⩑':
            case '⩒':
            case '⩓':
            case '⩔':
            case '⩕':
            case '⩖':
            case '⩗':
            case '⩘':
            case '⩙':
            case '⩚':
            case '⩛':
            case '⩜':
            case '⩝':
            case '⩞':
            case '⩟':
            case '⩠':
            case '⩡':
            case '⩢':
            case '⩣':
            case '⩦':
            case '⩧':
            case '⩨':
            case '⩩':
            case '⩪':
            case '⩫':
            case '⩬':
            case '⩭':
            case '⩮':
            case '⩯':
            case '⩰':
            case '⩱':
            case '⩲':
            case '⩳':
            case '⩴':
            case '⩵':
            case '⩶':
            case '⩷':
            case '⩸':
            case '⩻':
            case '⩼':
            case '⪅':
            case '⪆':
            case '⪇':
            case '⪈':
            case '⪉':
            case '⪊':
            case '⪍':
            case '⪎':
            case '⪏':
            case '⪐':
            case '⪝':
            case '⪞':
            case '⪟':
            case '⪠':
            case '⪣':
            case '⪤':
            case '⪥':
            case '⪮':
            case '⪱':
            case '⪲':
            case '⪵':
            case '⪶':
            case '⪷':
            case '⪸':
            case '⪹':
            case '⪺':
            case '⫇':
            case '⫈':
            case '⫉':
            case '⫊':
            case '⫋':
            case '⫌':
            case '⫗':
            case '⫘':
            case '⫙':
            case '⫚':
            case '⫛':
            case '⫝̸':
            case '⫝':
            case '⫟':
            case '⫠':
            case '⫡':
            case '⫢':
            case '⫦':
            case '⫧':
            case '⫨':
            case '⫩':
            case '⫪':
            case '⫫':
            case '⫮':
            case '⫯':
            case '⫰':
            case '⫱':
            case '⫲':
            case '⫳':
            case '⫴':
            case '⫵':
            case '⫶':
            default:
               break;
            case '⨴':
               var0 = 10805;
               break;
            case '⨵':
               var0 = 10804;
               break;
            case '⨼':
               var0 = 10813;
               break;
            case '⨽':
               var0 = 10812;
               break;
            case '⩤':
               var0 = 10853;
               break;
            case '⩥':
               var0 = 10852;
               break;
            case '⩹':
               var0 = 10874;
               break;
            case '⩺':
               var0 = 10873;
               break;
            case '⩽':
               var0 = 10878;
               break;
            case '⩾':
               var0 = 10877;
               break;
            case '⩿':
               var0 = 10880;
               break;
            case '⪀':
               var0 = 10879;
               break;
            case '⪁':
               var0 = 10882;
               break;
            case '⪂':
               var0 = 10881;
               break;
            case '⪃':
               var0 = 10884;
               break;
            case '⪄':
               var0 = 10883;
               break;
            case '⪋':
               var0 = 10892;
               break;
            case '⪌':
               var0 = 10891;
               break;
            case '⪑':
               var0 = 10898;
               break;
            case '⪒':
               var0 = 10897;
               break;
            case '⪓':
               var0 = 10900;
               break;
            case '⪔':
               var0 = 10899;
               break;
            case '⪕':
               var0 = 10902;
               break;
            case '⪖':
               var0 = 10901;
               break;
            case '⪗':
               var0 = 10904;
               break;
            case '⪘':
               var0 = 10903;
               break;
            case '⪙':
               var0 = 10906;
               break;
            case '⪚':
               var0 = 10905;
               break;
            case '⪛':
               var0 = 10908;
               break;
            case '⪜':
               var0 = 10907;
               break;
            case '⪡':
               var0 = 10914;
               break;
            case '⪢':
               var0 = 10913;
               break;
            case '⪦':
               var0 = 10919;
               break;
            case '⪧':
               var0 = 10918;
               break;
            case '⪨':
               var0 = 10921;
               break;
            case '⪩':
               var0 = 10920;
               break;
            case '⪪':
               var0 = 10923;
               break;
            case '⪫':
               var0 = 10922;
               break;
            case '⪬':
               var0 = 10925;
               break;
            case '⪭':
               var0 = 10924;
               break;
            case '⪯':
               var0 = 10928;
               break;
            case '⪰':
               var0 = 10927;
               break;
            case '⪳':
               var0 = 10932;
               break;
            case '⪴':
               var0 = 10931;
               break;
            case '⪻':
               var0 = 10940;
               break;
            case '⪼':
               var0 = 10939;
               break;
            case '⪽':
               var0 = 10942;
               break;
            case '⪾':
               var0 = 10941;
               break;
            case '⪿':
               var0 = 10944;
               break;
            case '⫀':
               var0 = 10943;
               break;
            case '⫁':
               var0 = 10946;
               break;
            case '⫂':
               var0 = 10945;
               break;
            case '⫃':
               var0 = 10948;
               break;
            case '⫄':
               var0 = 10947;
               break;
            case '⫅':
               var0 = 10950;
               break;
            case '⫆':
               var0 = 10949;
               break;
            case '⫍':
               var0 = 10958;
               break;
            case '⫎':
               var0 = 10957;
               break;
            case '⫏':
               var0 = 10960;
               break;
            case '⫐':
               var0 = 10959;
               break;
            case '⫑':
               var0 = 10962;
               break;
            case '⫒':
               var0 = 10961;
               break;
            case '⫓':
               var0 = 10964;
               break;
            case '⫔':
               var0 = 10963;
               break;
            case '⫕':
               var0 = 10966;
               break;
            case '⫖':
               var0 = 10965;
               break;
            case '⫞':
               var0 = 8870;
               break;
            case '⫣':
               var0 = 8873;
               break;
            case '⫤':
               var0 = 8872;
               break;
            case '⫥':
               var0 = 8875;
               break;
            case '⫬':
               var0 = 10989;
               break;
            case '⫭':
               var0 = 10988;
               break;
            case '⫷':
               var0 = 11000;
               break;
            case '⫸':
               var0 = 10999;
               break;
            case '⫹':
               var0 = 11002;
               break;
            case '⫺':
               var0 = 11001;
         }
      } else if ((var0 & '\uff00') == 12288) {
         switch (var0) {
            case '〈':
               var0 = 12297;
               break;
            case '〉':
               var0 = 12296;
               break;
            case '《':
               var0 = 12299;
               break;
            case '》':
               var0 = 12298;
               break;
            case '「':
               var0 = 12301;
               break;
            case '」':
               var0 = 12300;
               break;
            case '『':
               var0 = 12303;
               break;
            case '』':
               var0 = 12302;
               break;
            case '【':
               var0 = 12305;
               break;
            case '】':
               var0 = 12304;
            case '〒':
            case '〓':
            default:
               break;
            case '〔':
               var0 = 12309;
               break;
            case '〕':
               var0 = 12308;
               break;
            case '〖':
               var0 = 12311;
               break;
            case '〗':
               var0 = 12310;
               break;
            case '〘':
               var0 = 12313;
               break;
            case '〙':
               var0 = 12312;
               break;
            case '〚':
               var0 = 12315;
               break;
            case '〛':
               var0 = 12314;
         }
      } else if ((var0 & '\uff00') == 65280) {
         switch (var0) {
            case '（':
               var0 = '）';
               break;
            case '）':
               var0 = '（';
               break;
            case '＜':
               var0 = '＞';
               break;
            case '＞':
               var0 = '＜';
               break;
            case '［':
               var0 = '］';
               break;
            case '］':
               var0 = '［';
               break;
            case '｛':
               var0 = '｝';
               break;
            case '｝':
               var0 = '｛';
               break;
            case '｟':
               var0 = '｠';
               break;
            case '｠':
               var0 = '｟';
               break;
            case '｢':
               var0 = '｣';
               break;
            case '｣':
               var0 = '｢';
         }
      }

      return var0;
   }

   private static int bm(int var0, int var1) {
      if (var1 == 18) {
         return var0;
      } else if (var1 == 3) {
         return var0 | 64;
      } else {
         return var1 == 0 ? var0 | 128 : var0;
      }
   }

   private static final int a(int[] var0, int var1, int var2) {
      return var1 == var0.length - 1 ? var2 : var0[var1 + 1];
   }

   private static int bM(int var0) {
      int var1 = -1;
      int var2 = od.length;
      int var3 = 0;

      while (var2 - var1 > 1) {
         var3 = (var1 + var2) / 2;
         if (var0 < od[var3][0]) {
            var2 = var3;
         } else {
            if (var0 <= od[var3][ob]) {
               return od[var3][oc];
            }

            var1 = var3;
         }
      }

      return 18;
   }
}
