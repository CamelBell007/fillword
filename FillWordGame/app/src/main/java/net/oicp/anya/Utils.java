package net.oicp.anya;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.HashMap;

public class Utils
{
  public static final String FILE_NAME = "file_name";
  public static final String HINTS = "hints";
  public static final String HORIZON_HINTS = "horizon_hints";
  public static boolean IS_HORIZONAL = true;
  public static int LAST_PUZZLE_SERIAL = 0;
  public static final String PERCENT = "percent";
  public static final int PORT = 1949;
  public static final String PUZZLE_NAME = "puzzle_name";
  public static final String READ_TIME = "read_time";
  public static final String SERIAL_NUMBER = "serial_number";
  public static final String SERVER = "anya.oicp.net";
  private static final String SETTING_INFOS = "Sheep_crossword_info";
  public static final int VERSION = 10;
  public static final String VERTICAL_HINTS = "vertical_hints";
  public static HashMap<Integer, String> horHints = new HashMap();
  public static HashMap<Integer, String> verHints = new HashMap();
  
  static
  {
    LAST_PUZZLE_SERIAL = 10;
  }
  
  /* Error */
  public static int freshPuzzles(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 72	net/oicp/anya/Utils:isNetworkAvailable	(Landroid/content/Context;)Z
    //   4: ifeq +636 -> 640
    //   7: new 74	java/net/Socket
    //   10: dup
    //   11: invokespecial 75	java/net/Socket:<init>	()V
    //   14: astore_1
    //   15: aload_1
    //   16: new 77	java/net/InetSocketAddress
    //   19: dup
    //   20: ldc 36
    //   22: sipush 1949
    //   25: invokespecial 80	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   28: sipush 5000
    //   31: invokevirtual 84	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   34: aload_1
    //   35: sipush 10000
    //   38: invokevirtual 88	java/net/Socket:setSoTimeout	(I)V
    //   41: new 90	java/io/DataOutputStream
    //   44: dup
    //   45: aload_1
    //   46: invokevirtual 94	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   49: invokespecial 97	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   52: astore 17
    //   54: new 99	java/io/DataInputStream
    //   57: dup
    //   58: aload_1
    //   59: invokevirtual 103	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   62: invokespecial 106	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   65: astore 18
    //   67: aload 17
    //   69: iconst_4
    //   70: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   73: aload 17
    //   75: iconst_0
    //   76: invokevirtual 112	java/io/DataOutputStream:writeByte	(I)V
    //   79: aload 17
    //   81: iconst_0
    //   82: invokevirtual 112	java/io/DataOutputStream:writeByte	(I)V
    //   85: aload 17
    //   87: iconst_1
    //   88: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   91: aload 17
    //   93: iconst_1
    //   94: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   97: aload 17
    //   99: iconst_3
    //   100: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   103: aload 17
    //   105: iconst_4
    //   106: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   109: aload 17
    //   111: getstatic 61	net/oicp/anya/Utils:LAST_PUZZLE_SERIAL	I
    //   114: invokevirtual 115	java/io/DataOutputStream:writeInt	(I)V
    //   117: aload 17
    //   119: invokevirtual 118	java/io/DataOutputStream:flush	()V
    //   122: aload 18
    //   124: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   127: iconst_4
    //   128: if_icmpeq +11 -> 139
    //   131: ldc 124
    //   133: ldc 126
    //   135: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   138: pop
    //   139: aload 18
    //   141: invokevirtual 136	java/io/DataInputStream:readByte	()B
    //   144: istore 21
    //   146: iload 21
    //   148: iconst_1
    //   149: if_icmpeq +26 -> 175
    //   152: ldc 124
    //   154: new 138	java/lang/StringBuilder
    //   157: dup
    //   158: ldc -116
    //   160: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   163: iload 21
    //   165: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   168: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   174: pop
    //   175: aload 18
    //   177: invokevirtual 136	java/io/DataInputStream:readByte	()B
    //   180: istore 23
    //   182: ldc 124
    //   184: new 138	java/lang/StringBuilder
    //   187: dup
    //   188: ldc -103
    //   190: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   193: iload 23
    //   195: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   198: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   201: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   204: pop
    //   205: iload 23
    //   207: ifeq +36 -> 243
    //   210: ldc 124
    //   212: new 138	java/lang/StringBuilder
    //   215: dup
    //   216: ldc -116
    //   218: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   221: iload 21
    //   223: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   226: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   229: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   232: pop
    //   233: aload_0
    //   234: ldc -99
    //   236: iconst_0
    //   237: invokestatic 163	android/widget/Toast:makeText	(Landroid/content/Context;II)Landroid/widget/Toast;
    //   240: invokevirtual 166	android/widget/Toast:show	()V
    //   243: aload 18
    //   245: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   248: istore 26
    //   250: ldc 124
    //   252: new 138	java/lang/StringBuilder
    //   255: dup
    //   256: ldc -88
    //   258: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   261: iload 26
    //   263: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   266: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   272: pop
    //   273: aload 18
    //   275: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   278: istore 28
    //   280: ldc 124
    //   282: new 138	java/lang/StringBuilder
    //   285: dup
    //   286: ldc -86
    //   288: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   291: iload 28
    //   293: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   296: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   299: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   302: pop
    //   303: iconst_0
    //   304: istore 30
    //   306: iconst_0
    //   307: istore 31
    //   309: iload 30
    //   311: iload 28
    //   313: if_icmplt +34 -> 347
    //   316: aload 17
    //   318: ifnull +8 -> 326
    //   321: aload 17
    //   323: invokevirtual 173	java/io/DataOutputStream:close	()V
    //   326: aload 18
    //   328: ifnull +8 -> 336
    //   331: aload 18
    //   333: invokevirtual 174	java/io/DataInputStream:close	()V
    //   336: aload_1
    //   337: ifnull +448 -> 785
    //   340: aload_1
    //   341: invokevirtual 175	java/net/Socket:close	()V
    //   344: iload 31
    //   346: ireturn
    //   347: iload 30
    //   349: iconst_1
    //   350: iadd
    //   351: istore 32
    //   353: aload_0
    //   354: new 138	java/lang/StringBuilder
    //   357: dup
    //   358: ldc -79
    //   360: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   363: iload 32
    //   365: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   368: ldc -77
    //   370: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   376: iconst_1
    //   377: invokestatic 185	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   380: invokevirtual 166	android/widget/Toast:show	()V
    //   383: aload 18
    //   385: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   388: pop
    //   389: aload 18
    //   391: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   394: newarray <illegal type>
    //   396: astore 37
    //   398: aload 18
    //   400: aload 37
    //   402: invokevirtual 189	java/io/DataInputStream:readFully	([B)V
    //   405: iload 32
    //   407: getstatic 61	net/oicp/anya/Utils:LAST_PUZZLE_SERIAL	I
    //   410: iadd
    //   411: istore 38
    //   413: new 191	java/io/File
    //   416: dup
    //   417: new 138	java/lang/StringBuilder
    //   420: dup
    //   421: ldc -63
    //   423: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   426: iload 38
    //   428: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   431: ldc -61
    //   433: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   436: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   439: invokespecial 196	java/io/File:<init>	(Ljava/lang/String;)V
    //   442: aload 37
    //   444: aload 37
    //   446: arraylength
    //   447: invokestatic 200	net/oicp/anya/Utils:writeBytes2File	(Ljava/io/File;[BI)V
    //   450: ldc 124
    //   452: new 138	java/lang/StringBuilder
    //   455: dup
    //   456: ldc -54
    //   458: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   461: iload 38
    //   463: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   466: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   469: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   472: pop
    //   473: iload 31
    //   475: iconst_1
    //   476: iadd
    //   477: istore 40
    //   479: iinc 30 1
    //   482: iload 40
    //   484: istore 31
    //   486: goto -177 -> 309
    //   489: astore 7
    //   491: aconst_null
    //   492: astore 8
    //   494: iconst_0
    //   495: istore 9
    //   497: aload 7
    //   499: astore 10
    //   501: aconst_null
    //   502: astore 11
    //   504: ldc 124
    //   506: new 138	java/lang/StringBuilder
    //   509: dup
    //   510: ldc -52
    //   512: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   515: aload 10
    //   517: invokevirtual 207	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   520: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   523: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   526: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   529: pop
    //   530: aload_0
    //   531: ldc -47
    //   533: iconst_1
    //   534: invokestatic 185	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   537: invokevirtual 166	android/widget/Toast:show	()V
    //   540: aload 11
    //   542: ifnull +8 -> 550
    //   545: aload 11
    //   547: invokevirtual 173	java/io/DataOutputStream:close	()V
    //   550: aload 8
    //   552: ifnull +8 -> 560
    //   555: aload 8
    //   557: invokevirtual 174	java/io/DataInputStream:close	()V
    //   560: aload_1
    //   561: ifnull +227 -> 788
    //   564: aload_1
    //   565: invokevirtual 175	java/net/Socket:close	()V
    //   568: iload 9
    //   570: ireturn
    //   571: astore 16
    //   573: aload 16
    //   575: invokevirtual 212	java/io/IOException:printStackTrace	()V
    //   578: iload 9
    //   580: ireturn
    //   581: astore_2
    //   582: aload_2
    //   583: astore_3
    //   584: aconst_null
    //   585: astore 4
    //   587: aconst_null
    //   588: astore 5
    //   590: aload 5
    //   592: ifnull +8 -> 600
    //   595: aload 5
    //   597: invokevirtual 173	java/io/DataOutputStream:close	()V
    //   600: aload 4
    //   602: ifnull +8 -> 610
    //   605: aload 4
    //   607: invokevirtual 174	java/io/DataInputStream:close	()V
    //   610: aload_1
    //   611: ifnull +7 -> 618
    //   614: aload_1
    //   615: invokevirtual 175	java/net/Socket:close	()V
    //   618: aload_3
    //   619: athrow
    //   620: astore 6
    //   622: aload 6
    //   624: invokevirtual 212	java/io/IOException:printStackTrace	()V
    //   627: goto -9 -> 618
    //   630: astore 41
    //   632: aload 41
    //   634: invokevirtual 212	java/io/IOException:printStackTrace	()V
    //   637: iload 31
    //   639: ireturn
    //   640: aload_0
    //   641: ldc -42
    //   643: iconst_1
    //   644: invokestatic 185	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   647: invokevirtual 166	android/widget/Toast:show	()V
    //   650: iconst_0
    //   651: ireturn
    //   652: astore 44
    //   654: aload 44
    //   656: astore_3
    //   657: aload 17
    //   659: astore 5
    //   661: aconst_null
    //   662: astore 4
    //   664: goto -74 -> 590
    //   667: astore 20
    //   669: aload 18
    //   671: astore 4
    //   673: aload 20
    //   675: astore_3
    //   676: aload 17
    //   678: astore 5
    //   680: goto -90 -> 590
    //   683: astore 34
    //   685: aload 18
    //   687: astore 4
    //   689: iload 31
    //   691: pop
    //   692: aload 34
    //   694: astore_3
    //   695: aload 17
    //   697: astore 5
    //   699: goto -109 -> 590
    //   702: astore 12
    //   704: iload 9
    //   706: pop
    //   707: aload 8
    //   709: astore 14
    //   711: aload 12
    //   713: astore_3
    //   714: aload 11
    //   716: astore 5
    //   718: aload 14
    //   720: astore 4
    //   722: goto -132 -> 590
    //   725: astore 43
    //   727: aload 43
    //   729: astore 10
    //   731: aload 17
    //   733: astore 11
    //   735: aconst_null
    //   736: astore 8
    //   738: iconst_0
    //   739: istore 9
    //   741: goto -237 -> 504
    //   744: astore 19
    //   746: aload 19
    //   748: astore 10
    //   750: aload 17
    //   752: astore 11
    //   754: aload 18
    //   756: astore 8
    //   758: iconst_0
    //   759: istore 9
    //   761: goto -257 -> 504
    //   764: astore 33
    //   766: aload 33
    //   768: astore 10
    //   770: iload 31
    //   772: istore 9
    //   774: aload 17
    //   776: astore 11
    //   778: aload 18
    //   780: astore 8
    //   782: goto -278 -> 504
    //   785: iload 31
    //   787: ireturn
    //   788: iload 9
    //   790: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	791	0	paramContext	Context
    //   14	601	1	localSocket	java.net.Socket
    //   581	2	2	localObject1	Object
    //   583	131	3	localObject2	Object
    //   585	136	4	localObject3	Object
    //   588	129	5	localDataOutputStream1	java.io.DataOutputStream
    //   620	3	6	localIOException1	IOException
    //   489	9	7	localIOException2	IOException
    //   492	289	8	localDataInputStream1	java.io.DataInputStream
    //   495	294	9	i	int
    //   499	270	10	localObject4	Object
    //   502	275	11	localDataOutputStream2	java.io.DataOutputStream
    //   702	10	12	localObject5	Object
    //   709	10	14	localDataInputStream2	java.io.DataInputStream
    //   571	3	16	localIOException3	IOException
    //   52	723	17	localDataOutputStream3	java.io.DataOutputStream
    //   65	714	18	localDataInputStream3	java.io.DataInputStream
    //   744	3	19	localIOException4	IOException
    //   667	7	20	localObject6	Object
    //   144	78	21	j	int
    //   180	26	23	k	int
    //   248	14	26	m	int
    //   278	36	28	n	int
    //   304	176	30	i1	int
    //   307	479	31	i2	int
    //   351	60	32	i3	int
    //   764	3	33	localIOException5	IOException
    //   683	10	34	localObject7	Object
    //   396	49	37	arrayOfByte	byte[]
    //   411	51	38	i4	int
    //   477	6	40	i5	int
    //   630	3	41	localIOException6	IOException
    //   725	3	43	localIOException7	IOException
    //   652	3	44	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   15	54	489	java/io/IOException
    //   545	550	571	java/io/IOException
    //   555	560	571	java/io/IOException
    //   564	568	571	java/io/IOException
    //   15	54	581	finally
    //   595	600	620	java/io/IOException
    //   605	610	620	java/io/IOException
    //   614	618	620	java/io/IOException
    //   321	326	630	java/io/IOException
    //   331	336	630	java/io/IOException
    //   340	344	630	java/io/IOException
    //   54	67	652	finally
    //   67	139	667	finally
    //   139	146	667	finally
    //   152	175	667	finally
    //   175	205	667	finally
    //   210	243	667	finally
    //   243	303	667	finally
    //   353	473	683	finally
    //   504	540	702	finally
    //   54	67	725	java/io/IOException
    //   67	139	744	java/io/IOException
    //   139	146	744	java/io/IOException
    //   152	175	744	java/io/IOException
    //   175	205	744	java/io/IOException
    //   210	243	744	java/io/IOException
    //   243	303	744	java/io/IOException
    //   353	473	764	java/io/IOException
  }
  
  public static byte[] getBytesFromFile(File paramFile, long paramLong)
    throws IOException
  {
    FileInputStream localFileInputStream = new FileInputStream(paramFile);
    if ((paramLong == 0L) || (paramLong > paramFile.length())) {
      paramLong = paramFile.length();
    }
    if (paramLong > 2147483647L) {
      return null;
    }
    byte[] arrayOfByte = new byte[(int)paramLong];
    int i = 0;
    for (;;)
    {
      int j;
      if (i < arrayOfByte.length)
      {
        j = localFileInputStream.read(arrayOfByte, i, arrayOfByte.length - i);
        if (j >= 0) {}
      }
      else
      {
        if (i >= arrayOfByte.length) {
          break;
        }
        throw new IOException("Could not completely read file " + paramFile.getName());
      }
      i += j;
    }
    localFileInputStream.close();
    return arrayOfByte;
  }
  
  /* Error */
  public static String getDownUrl(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 72	net/oicp/anya/Utils:isNetworkAvailable	(Landroid/content/Context;)Z
    //   4: ifeq +623 -> 627
    //   7: new 74	java/net/Socket
    //   10: dup
    //   11: invokespecial 75	java/net/Socket:<init>	()V
    //   14: astore_1
    //   15: aconst_null
    //   16: astore_2
    //   17: aload_1
    //   18: new 77	java/net/InetSocketAddress
    //   21: dup
    //   22: ldc 36
    //   24: sipush 1949
    //   27: invokespecial 80	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   30: sipush 5000
    //   33: invokevirtual 84	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   36: aload_1
    //   37: sipush 10000
    //   40: invokevirtual 88	java/net/Socket:setSoTimeout	(I)V
    //   43: new 90	java/io/DataOutputStream
    //   46: dup
    //   47: aload_1
    //   48: invokevirtual 94	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   51: invokespecial 97	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   54: astore 5
    //   56: new 99	java/io/DataInputStream
    //   59: dup
    //   60: aload_1
    //   61: invokevirtual 103	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   64: invokespecial 106	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   67: astore 15
    //   69: aload 5
    //   71: iconst_1
    //   72: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   75: aload 5
    //   77: iconst_0
    //   78: invokevirtual 112	java/io/DataOutputStream:writeByte	(I)V
    //   81: aload 5
    //   83: iconst_0
    //   84: invokevirtual 112	java/io/DataOutputStream:writeByte	(I)V
    //   87: aload 5
    //   89: iconst_1
    //   90: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   93: aload 5
    //   95: iconst_1
    //   96: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   99: aload 5
    //   101: iconst_1
    //   102: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   105: aload 5
    //   107: iconst_4
    //   108: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   111: aload 5
    //   113: bipush 10
    //   115: invokevirtual 115	java/io/DataOutputStream:writeInt	(I)V
    //   118: aload 5
    //   120: invokevirtual 118	java/io/DataOutputStream:flush	()V
    //   123: aload 15
    //   125: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   128: iconst_1
    //   129: if_icmpeq +11 -> 140
    //   132: ldc 124
    //   134: ldc 126
    //   136: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   139: pop
    //   140: aload 15
    //   142: invokevirtual 136	java/io/DataInputStream:readByte	()B
    //   145: istore 17
    //   147: iload 17
    //   149: iconst_1
    //   150: if_icmpeq +26 -> 176
    //   153: ldc 124
    //   155: new 138	java/lang/StringBuilder
    //   158: dup
    //   159: ldc -116
    //   161: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   164: iload 17
    //   166: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   169: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   172: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   175: pop
    //   176: aload 15
    //   178: invokevirtual 136	java/io/DataInputStream:readByte	()B
    //   181: istore 19
    //   183: ldc 124
    //   185: new 138	java/lang/StringBuilder
    //   188: dup
    //   189: ldc -103
    //   191: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   194: iload 19
    //   196: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   199: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   202: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   205: pop
    //   206: iload 19
    //   208: ifeq +26 -> 234
    //   211: ldc 124
    //   213: new 138	java/lang/StringBuilder
    //   216: dup
    //   217: ldc -116
    //   219: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   222: iload 19
    //   224: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   227: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   230: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   233: pop
    //   234: aload 15
    //   236: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   239: istore 22
    //   241: ldc 124
    //   243: new 138	java/lang/StringBuilder
    //   246: dup
    //   247: ldc -88
    //   249: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   252: iload 22
    //   254: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   257: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   260: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   263: pop
    //   264: aload 15
    //   266: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   269: istore 24
    //   271: ldc 124
    //   273: new 138	java/lang/StringBuilder
    //   276: dup
    //   277: ldc -86
    //   279: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   282: iload 24
    //   284: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   287: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   290: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   293: pop
    //   294: iload 24
    //   296: iconst_1
    //   297: if_icmpne +324 -> 621
    //   300: aload 15
    //   302: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   305: pop
    //   306: aload 15
    //   308: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   311: newarray <illegal type>
    //   313: astore 27
    //   315: aload 15
    //   317: aload 27
    //   319: invokevirtual 189	java/io/DataInputStream:readFully	([B)V
    //   322: new 244	java/lang/String
    //   325: dup
    //   326: aload 27
    //   328: invokespecial 246	java/lang/String:<init>	([B)V
    //   331: astore 28
    //   333: ldc 124
    //   335: new 138	java/lang/StringBuilder
    //   338: dup
    //   339: ldc -8
    //   341: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   344: aload 28
    //   346: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   349: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   352: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   355: pop
    //   356: aload 5
    //   358: ifnull +8 -> 366
    //   361: aload 5
    //   363: invokevirtual 173	java/io/DataOutputStream:close	()V
    //   366: aload 15
    //   368: ifnull +8 -> 376
    //   371: aload 15
    //   373: invokevirtual 174	java/io/DataInputStream:close	()V
    //   376: aload_1
    //   377: ifnull +145 -> 522
    //   380: aload_1
    //   381: invokevirtual 175	java/net/Socket:close	()V
    //   384: aload 28
    //   386: areturn
    //   387: astore 8
    //   389: aconst_null
    //   390: astore 9
    //   392: aload 8
    //   394: astore 10
    //   396: aconst_null
    //   397: astore 5
    //   399: ldc 124
    //   401: new 138	java/lang/StringBuilder
    //   404: dup
    //   405: ldc -52
    //   407: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   410: aload 10
    //   412: invokevirtual 207	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   415: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   418: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   421: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   424: pop
    //   425: aload 5
    //   427: ifnull +8 -> 435
    //   430: aload 5
    //   432: invokevirtual 173	java/io/DataOutputStream:close	()V
    //   435: aload_2
    //   436: ifnull +7 -> 443
    //   439: aload_2
    //   440: invokevirtual 174	java/io/DataInputStream:close	()V
    //   443: aload_1
    //   444: ifnull +174 -> 618
    //   447: aload_1
    //   448: invokevirtual 175	java/net/Socket:close	()V
    //   451: aload 9
    //   453: areturn
    //   454: astore 14
    //   456: aload 14
    //   458: invokevirtual 212	java/io/IOException:printStackTrace	()V
    //   461: aload 9
    //   463: areturn
    //   464: astore_3
    //   465: aload_3
    //   466: astore 4
    //   468: aconst_null
    //   469: astore 5
    //   471: aconst_null
    //   472: astore 6
    //   474: aload 5
    //   476: ifnull +8 -> 484
    //   479: aload 5
    //   481: invokevirtual 173	java/io/DataOutputStream:close	()V
    //   484: aload 6
    //   486: ifnull +8 -> 494
    //   489: aload 6
    //   491: invokevirtual 174	java/io/DataInputStream:close	()V
    //   494: aload_1
    //   495: ifnull +7 -> 502
    //   498: aload_1
    //   499: invokevirtual 175	java/net/Socket:close	()V
    //   502: aload 4
    //   504: athrow
    //   505: astore 7
    //   507: aload 7
    //   509: invokevirtual 212	java/io/IOException:printStackTrace	()V
    //   512: goto -10 -> 502
    //   515: astore 33
    //   517: aload 33
    //   519: invokevirtual 212	java/io/IOException:printStackTrace	()V
    //   522: aload 28
    //   524: areturn
    //   525: astore 35
    //   527: aload 35
    //   529: astore 4
    //   531: aconst_null
    //   532: astore 6
    //   534: goto -60 -> 474
    //   537: astore 16
    //   539: aload 16
    //   541: astore 4
    //   543: aload 15
    //   545: astore 6
    //   547: goto -73 -> 474
    //   550: astore 30
    //   552: aload 28
    //   554: pop
    //   555: aload 15
    //   557: astore 6
    //   559: aload 30
    //   561: astore 4
    //   563: goto -89 -> 474
    //   566: astore 11
    //   568: aload_2
    //   569: astore 6
    //   571: aload 9
    //   573: pop
    //   574: aload 11
    //   576: astore 4
    //   578: goto -104 -> 474
    //   581: astore 10
    //   583: aconst_null
    //   584: astore_2
    //   585: aconst_null
    //   586: astore 9
    //   588: goto -189 -> 399
    //   591: astore 10
    //   593: aload 15
    //   595: astore_2
    //   596: aconst_null
    //   597: astore 9
    //   599: goto -200 -> 399
    //   602: astore 29
    //   604: aload 15
    //   606: astore_2
    //   607: aload 28
    //   609: astore 9
    //   611: aload 29
    //   613: astore 10
    //   615: goto -216 -> 399
    //   618: aload 9
    //   620: areturn
    //   621: aconst_null
    //   622: astore 28
    //   624: goto -268 -> 356
    //   627: aconst_null
    //   628: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	629	0	paramContext	Context
    //   14	485	1	localSocket	java.net.Socket
    //   16	591	2	localObject1	Object
    //   464	2	3	localObject2	Object
    //   466	111	4	localObject3	Object
    //   54	426	5	localDataOutputStream	java.io.DataOutputStream
    //   472	98	6	localObject4	Object
    //   505	3	7	localIOException1	IOException
    //   387	6	8	localIOException2	IOException
    //   390	229	9	str1	String
    //   394	17	10	localIOException3	IOException
    //   581	1	10	localIOException4	IOException
    //   591	1	10	localIOException5	IOException
    //   613	1	10	localObject5	Object
    //   566	9	11	localObject6	Object
    //   454	3	14	localIOException6	IOException
    //   67	538	15	localDataInputStream	java.io.DataInputStream
    //   537	3	16	localObject7	Object
    //   145	20	17	i	int
    //   181	42	19	j	int
    //   239	14	22	k	int
    //   269	29	24	m	int
    //   313	14	27	arrayOfByte	byte[]
    //   331	292	28	str2	String
    //   602	10	29	localIOException7	IOException
    //   550	10	30	localObject8	Object
    //   515	3	33	localIOException8	IOException
    //   525	3	35	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   17	56	387	java/io/IOException
    //   430	435	454	java/io/IOException
    //   439	443	454	java/io/IOException
    //   447	451	454	java/io/IOException
    //   17	56	464	finally
    //   479	484	505	java/io/IOException
    //   489	494	505	java/io/IOException
    //   498	502	505	java/io/IOException
    //   361	366	515	java/io/IOException
    //   371	376	515	java/io/IOException
    //   380	384	515	java/io/IOException
    //   56	69	525	finally
    //   69	140	537	finally
    //   140	147	537	finally
    //   153	176	537	finally
    //   176	206	537	finally
    //   211	234	537	finally
    //   234	294	537	finally
    //   300	333	537	finally
    //   333	356	550	finally
    //   399	425	566	finally
    //   56	69	581	java/io/IOException
    //   69	140	591	java/io/IOException
    //   140	147	591	java/io/IOException
    //   153	176	591	java/io/IOException
    //   176	206	591	java/io/IOException
    //   211	234	591	java/io/IOException
    //   234	294	591	java/io/IOException
    //   300	333	591	java/io/IOException
    //   333	356	602	java/io/IOException
  }
  
  public static String getFirstFile()
  {
    return "1.puz";
  }
  
  public static String getSerialNum()
  {
    String str = null;
    try
    {
      Class localClass = Class.forName("android.os.SystemProperties");
      str = (String)localClass.getMethod("get", new Class[] { String.class }).invoke(localClass, new Object[] { "ro.serialno" });
      Log.d("Utils", "serial:" + str);
      return str;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return str;
  }
  
  public static boolean isNetworkAvailable(Context paramContext)
  {
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    NetworkInfo[] arrayOfNetworkInfo;
    int i;
    if (localConnectivityManager != null)
    {
      arrayOfNetworkInfo = localConnectivityManager.getAllNetworkInfo();
      if (arrayOfNetworkInfo != null) {
        i = arrayOfNetworkInfo.length;
      }
    }
    for (int j = 0;; j++)
    {
      if (j >= i) {
        return false;
      }
      NetworkInfo localNetworkInfo = arrayOfNetworkInfo[j];
      Log.d("Check Network status:", localNetworkInfo.toString());
      if (localNetworkInfo.getState() == State.CONNECTED) {
        return true;
      }
    }
  }
  
  public static void setLastFile(Context paramContext, String[] paramArrayOfString)
  {
    paramContext.getSharedPreferences("Sheep_crossword_info", 0).edit().commit();
  }
  
  /* Error */
  public static int submitScore(Context paramContext, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 330
    //   4: invokevirtual 287	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   7: checkcast 332	android/telephony/TelephonyManager
    //   10: invokevirtual 335	android/telephony/TelephonyManager:getDeviceId	()Ljava/lang/String;
    //   13: astore_3
    //   14: ldc 124
    //   16: new 138	java/lang/StringBuilder
    //   19: dup
    //   20: ldc_w 337
    //   23: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   26: aload_3
    //   27: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   36: pop
    //   37: new 74	java/net/Socket
    //   40: dup
    //   41: invokespecial 75	java/net/Socket:<init>	()V
    //   44: astore 5
    //   46: aload 5
    //   48: new 77	java/net/InetSocketAddress
    //   51: dup
    //   52: ldc 36
    //   54: sipush 1949
    //   57: invokespecial 80	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   60: sipush 5000
    //   63: invokevirtual 84	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   66: aload 5
    //   68: sipush 10000
    //   71: invokevirtual 88	java/net/Socket:setSoTimeout	(I)V
    //   74: new 90	java/io/DataOutputStream
    //   77: dup
    //   78: aload 5
    //   80: invokevirtual 94	java/net/Socket:getOutputStream	()Ljava/io/OutputStream;
    //   83: invokespecial 97	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   86: astore 20
    //   88: new 99	java/io/DataInputStream
    //   91: dup
    //   92: aload 5
    //   94: invokevirtual 103	java/net/Socket:getInputStream	()Ljava/io/InputStream;
    //   97: invokespecial 106	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   100: astore 21
    //   102: aload 20
    //   104: iconst_3
    //   105: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   108: aload 20
    //   110: iconst_0
    //   111: invokevirtual 112	java/io/DataOutputStream:writeByte	(I)V
    //   114: aload 20
    //   116: iconst_0
    //   117: invokevirtual 112	java/io/DataOutputStream:writeByte	(I)V
    //   120: aload 20
    //   122: iconst_1
    //   123: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   126: aload 20
    //   128: iconst_3
    //   129: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   132: aload 20
    //   134: iconst_3
    //   135: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   138: aload 20
    //   140: iconst_4
    //   141: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   144: aload 20
    //   146: iload_1
    //   147: invokevirtual 115	java/io/DataOutputStream:writeInt	(I)V
    //   150: aload 20
    //   152: bipush 7
    //   154: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   157: aload 20
    //   159: iconst_4
    //   160: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   163: aload 20
    //   165: iload_2
    //   166: invokevirtual 115	java/io/DataOutputStream:writeInt	(I)V
    //   169: aload 20
    //   171: bipush 10
    //   173: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   176: aload 20
    //   178: aload_3
    //   179: invokevirtual 341	java/lang/String:getBytes	()[B
    //   182: arraylength
    //   183: i2s
    //   184: invokevirtual 109	java/io/DataOutputStream:writeShort	(I)V
    //   187: aload 20
    //   189: aload_3
    //   190: invokevirtual 341	java/lang/String:getBytes	()[B
    //   193: invokevirtual 344	java/io/DataOutputStream:write	([B)V
    //   196: aload 20
    //   198: invokevirtual 118	java/io/DataOutputStream:flush	()V
    //   201: aload 21
    //   203: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   206: iconst_3
    //   207: if_icmpeq +11 -> 218
    //   210: ldc 124
    //   212: ldc 126
    //   214: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   217: pop
    //   218: aload 21
    //   220: invokevirtual 136	java/io/DataInputStream:readByte	()B
    //   223: istore 24
    //   225: iload 24
    //   227: iconst_1
    //   228: if_icmpeq +26 -> 254
    //   231: ldc 124
    //   233: new 138	java/lang/StringBuilder
    //   236: dup
    //   237: ldc -116
    //   239: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   242: iload 24
    //   244: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   247: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   250: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   253: pop
    //   254: aload 21
    //   256: invokevirtual 136	java/io/DataInputStream:readByte	()B
    //   259: istore 26
    //   261: ldc 124
    //   263: new 138	java/lang/StringBuilder
    //   266: dup
    //   267: ldc -103
    //   269: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   272: iload 26
    //   274: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   277: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   280: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   283: pop
    //   284: iload 26
    //   286: ifeq +36 -> 322
    //   289: ldc 124
    //   291: new 138	java/lang/StringBuilder
    //   294: dup
    //   295: ldc -116
    //   297: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   300: iload 24
    //   302: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   305: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   308: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   311: pop
    //   312: aload_0
    //   313: ldc -99
    //   315: iconst_0
    //   316: invokestatic 163	android/widget/Toast:makeText	(Landroid/content/Context;II)Landroid/widget/Toast;
    //   319: invokevirtual 166	android/widget/Toast:show	()V
    //   322: aload 21
    //   324: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   327: istore 29
    //   329: ldc 124
    //   331: new 138	java/lang/StringBuilder
    //   334: dup
    //   335: ldc -88
    //   337: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   340: iload 29
    //   342: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   345: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   348: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   351: pop
    //   352: aload 21
    //   354: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   357: istore 31
    //   359: ldc 124
    //   361: new 138	java/lang/StringBuilder
    //   364: dup
    //   365: ldc -86
    //   367: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   370: iload 31
    //   372: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   375: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   378: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   381: pop
    //   382: iload 31
    //   384: iconst_2
    //   385: if_icmpne +108 -> 493
    //   388: aload 21
    //   390: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   393: pop
    //   394: aload 21
    //   396: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   399: pop
    //   400: aload 21
    //   402: invokevirtual 348	java/io/DataInputStream:readInt	()I
    //   405: istore 35
    //   407: aload 21
    //   409: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   412: pop
    //   413: aload 21
    //   415: invokevirtual 122	java/io/DataInputStream:readShort	()S
    //   418: pop
    //   419: aload 21
    //   421: invokevirtual 348	java/io/DataInputStream:readInt	()I
    //   424: istore 38
    //   426: ldc 124
    //   428: new 138	java/lang/StringBuilder
    //   431: dup
    //   432: ldc_w 350
    //   435: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   438: iload 35
    //   440: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   443: ldc_w 352
    //   446: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: iload 38
    //   451: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   454: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   457: invokestatic 156	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   460: pop
    //   461: aload_0
    //   462: new 138	java/lang/StringBuilder
    //   465: dup
    //   466: ldc_w 354
    //   469: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   472: iload 35
    //   474: invokevirtual 147	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   477: ldc_w 356
    //   480: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   483: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   486: iconst_1
    //   487: invokestatic 185	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   490: invokevirtual 166	android/widget/Toast:show	()V
    //   493: aload 20
    //   495: ifnull +8 -> 503
    //   498: aload 20
    //   500: invokevirtual 173	java/io/DataOutputStream:close	()V
    //   503: aload 21
    //   505: ifnull +8 -> 513
    //   508: aload 21
    //   510: invokevirtual 174	java/io/DataInputStream:close	()V
    //   513: aload 5
    //   515: ifnull +157 -> 672
    //   518: aload 5
    //   520: invokevirtual 175	java/net/Socket:close	()V
    //   523: iconst_0
    //   524: ireturn
    //   525: astore 11
    //   527: aload 11
    //   529: astore 12
    //   531: aconst_null
    //   532: astore 13
    //   534: aconst_null
    //   535: astore 9
    //   537: ldc 124
    //   539: new 138	java/lang/StringBuilder
    //   542: dup
    //   543: ldc -52
    //   545: invokespecial 143	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   548: aload 12
    //   550: invokevirtual 207	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   553: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   556: invokevirtual 151	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   559: invokestatic 132	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   562: pop
    //   563: aload 9
    //   565: ifnull +8 -> 573
    //   568: aload 9
    //   570: invokevirtual 173	java/io/DataOutputStream:close	()V
    //   573: aload 13
    //   575: ifnull +8 -> 583
    //   578: aload 13
    //   580: invokevirtual 174	java/io/DataInputStream:close	()V
    //   583: aload 5
    //   585: ifnull +168 -> 753
    //   588: aload 5
    //   590: invokevirtual 175	java/net/Socket:close	()V
    //   593: aload 13
    //   595: pop
    //   596: iconst_0
    //   597: ireturn
    //   598: astore 16
    //   600: aload 16
    //   602: invokevirtual 212	java/io/IOException:printStackTrace	()V
    //   605: aload 13
    //   607: pop
    //   608: iconst_0
    //   609: ireturn
    //   610: astore 6
    //   612: aload 6
    //   614: astore 7
    //   616: aconst_null
    //   617: astore 8
    //   619: aconst_null
    //   620: astore 9
    //   622: aload 9
    //   624: ifnull +8 -> 632
    //   627: aload 9
    //   629: invokevirtual 173	java/io/DataOutputStream:close	()V
    //   632: aload 8
    //   634: ifnull +8 -> 642
    //   637: aload 8
    //   639: invokevirtual 174	java/io/DataInputStream:close	()V
    //   642: aload 5
    //   644: ifnull +8 -> 652
    //   647: aload 5
    //   649: invokevirtual 175	java/net/Socket:close	()V
    //   652: aload 7
    //   654: athrow
    //   655: astore 10
    //   657: aload 10
    //   659: invokevirtual 212	java/io/IOException:printStackTrace	()V
    //   662: goto -10 -> 652
    //   665: astore 40
    //   667: aload 40
    //   669: invokevirtual 212	java/io/IOException:printStackTrace	()V
    //   672: iconst_0
    //   673: ireturn
    //   674: astore 43
    //   676: aload 43
    //   678: astore 7
    //   680: aload 20
    //   682: astore 9
    //   684: aconst_null
    //   685: astore 8
    //   687: goto -65 -> 622
    //   690: astore 23
    //   692: aload 23
    //   694: astore 7
    //   696: aload 21
    //   698: astore 8
    //   700: aload 20
    //   702: astore 9
    //   704: goto -82 -> 622
    //   707: astore 14
    //   709: aload 13
    //   711: astore 8
    //   713: aload 14
    //   715: astore 7
    //   717: goto -95 -> 622
    //   720: astore 42
    //   722: aload 42
    //   724: astore 12
    //   726: aload 20
    //   728: astore 9
    //   730: aconst_null
    //   731: astore 13
    //   733: goto -196 -> 537
    //   736: astore 22
    //   738: aload 22
    //   740: astore 12
    //   742: aload 21
    //   744: astore 13
    //   746: aload 20
    //   748: astore 9
    //   750: goto -213 -> 537
    //   753: aload 13
    //   755: pop
    //   756: iconst_0
    //   757: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	758	0	paramContext	Context
    //   0	758	1	paramInt1	int
    //   0	758	2	paramInt2	int
    //   13	177	3	str	String
    //   44	604	5	localSocket	java.net.Socket
    //   610	3	6	localObject1	Object
    //   614	102	7	localObject2	Object
    //   617	95	8	localDataInputStream1	java.io.DataInputStream
    //   535	214	9	localDataOutputStream1	java.io.DataOutputStream
    //   655	3	10	localIOException1	IOException
    //   525	3	11	localIOException2	IOException
    //   529	212	12	localObject3	Object
    //   532	222	13	localDataInputStream2	java.io.DataInputStream
    //   707	7	14	localObject4	Object
    //   598	3	16	localIOException3	IOException
    //   86	661	20	localDataOutputStream2	java.io.DataOutputStream
    //   100	643	21	localDataInputStream3	java.io.DataInputStream
    //   736	3	22	localIOException4	IOException
    //   690	3	23	localObject5	Object
    //   223	78	24	i	int
    //   259	26	26	j	int
    //   327	14	29	k	int
    //   357	29	31	m	int
    //   405	68	35	n	int
    //   424	26	38	i1	int
    //   665	3	40	localIOException5	IOException
    //   720	3	42	localIOException6	IOException
    //   674	3	43	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   46	88	525	java/io/IOException
    //   568	573	598	java/io/IOException
    //   578	583	598	java/io/IOException
    //   588	593	598	java/io/IOException
    //   46	88	610	finally
    //   627	632	655	java/io/IOException
    //   637	642	655	java/io/IOException
    //   647	652	655	java/io/IOException
    //   498	503	665	java/io/IOException
    //   508	513	665	java/io/IOException
    //   518	523	665	java/io/IOException
    //   88	102	674	finally
    //   102	218	690	finally
    //   218	225	690	finally
    //   231	254	690	finally
    //   254	284	690	finally
    //   289	322	690	finally
    //   322	382	690	finally
    //   388	493	690	finally
    //   537	563	707	finally
    //   88	102	720	java/io/IOException
    //   102	218	736	java/io/IOException
    //   218	225	736	java/io/IOException
    //   231	254	736	java/io/IOException
    //   254	284	736	java/io/IOException
    //   289	322	736	java/io/IOException
    //   322	382	736	java/io/IOException
    //   388	493	736	java/io/IOException
  }
  
  public static void writeBytes2File(File paramFile, byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(paramFile);
      localFileOutputStream.write(paramArrayOfByte, 0, paramInt);
      localFileOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
    }
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */