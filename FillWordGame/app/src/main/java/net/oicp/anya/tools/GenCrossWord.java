package net.oicp.anya.tools;

import java.io.File;
import java.io.UnsupportedEncodingException;
import net.oicp.anya.Utils;

public class GenCrossWord
{
  public static void genAllCrossword()
  {
    genCrossword1();
    genCrossword2();
    genCrossword3();
    genCrossword4();
    genCrossword5();
    genCrossword6();
    genCrossword7();
    genCrossword8();
    genCrossword9();
    genCrossword10();
  }
  
  /* Error */
  public static void genCrossword1()
  {
    // Byte code:
    //   0: sipush 4096
    //   3: newarray <illegal type>
    //   5: astore_0
    //   6: ldc 43
    //   8: invokevirtual 49	java/lang/String:getBytes	()[B
    //   11: astore_1
    //   12: aload_1
    //   13: iconst_0
    //   14: aload_0
    //   15: iconst_0
    //   16: aload_1
    //   17: arraylength
    //   18: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   21: aload_1
    //   22: arraylength
    //   23: istore_2
    //   24: iload_2
    //   25: iconst_1
    //   26: iadd
    //   27: istore_3
    //   28: aload_0
    //   29: iload_2
    //   30: iconst_0
    //   31: bastore
    //   32: iload_3
    //   33: iconst_1
    //   34: iadd
    //   35: istore 4
    //   37: aload_0
    //   38: iload_3
    //   39: iconst_0
    //   40: bastore
    //   41: iload 4
    //   43: iconst_1
    //   44: iadd
    //   45: istore 5
    //   47: aload_0
    //   48: iload 4
    //   50: iconst_0
    //   51: bastore
    //   52: iload 5
    //   54: iconst_1
    //   55: iadd
    //   56: istore 6
    //   58: aload_0
    //   59: iload 5
    //   61: iconst_1
    //   62: bastore
    //   63: iload 6
    //   65: iconst_1
    //   66: iadd
    //   67: istore 7
    //   69: aload_0
    //   70: iload 6
    //   72: iconst_1
    //   73: bastore
    //   74: iload 7
    //   76: iconst_1
    //   77: iadd
    //   78: istore 8
    //   80: aload_0
    //   81: iload 7
    //   83: bipush 10
    //   85: bastore
    //   86: iload 8
    //   88: iconst_1
    //   89: iadd
    //   90: istore 9
    //   92: aload_0
    //   93: iload 8
    //   95: bipush 10
    //   97: bastore
    //   98: ldc 57
    //   100: ldc 59
    //   102: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   105: astore 13
    //   107: aload 13
    //   109: iconst_0
    //   110: aload_0
    //   111: iload 9
    //   113: aload 13
    //   115: arraylength
    //   116: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   119: iload 9
    //   121: aload 13
    //   123: arraylength
    //   124: iadd
    //   125: istore 14
    //   127: iload 14
    //   129: iconst_1
    //   130: iadd
    //   131: istore 9
    //   133: aload_0
    //   134: iload 14
    //   136: iconst_0
    //   137: bastore
    //   138: ldc 64
    //   140: ldc 59
    //   142: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   145: astore 15
    //   147: aload 15
    //   149: iconst_0
    //   150: aload_0
    //   151: iload 9
    //   153: aload 15
    //   155: arraylength
    //   156: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   159: iload 9
    //   161: aload 15
    //   163: arraylength
    //   164: iadd
    //   165: istore 16
    //   167: iload 16
    //   169: iconst_1
    //   170: iadd
    //   171: istore 9
    //   173: aload_0
    //   174: iload 16
    //   176: iconst_0
    //   177: bastore
    //   178: ldc 66
    //   180: ldc 59
    //   182: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   185: astore 17
    //   187: aload 17
    //   189: iconst_0
    //   190: aload_0
    //   191: iload 9
    //   193: aload 17
    //   195: arraylength
    //   196: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   199: iload 9
    //   201: aload 17
    //   203: arraylength
    //   204: iadd
    //   205: istore 18
    //   207: iload 18
    //   209: iconst_1
    //   210: iadd
    //   211: istore 9
    //   213: aload_0
    //   214: iload 18
    //   216: iconst_0
    //   217: bastore
    //   218: ldc 68
    //   220: ldc 59
    //   222: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   225: astore 19
    //   227: aload 19
    //   229: iconst_0
    //   230: aload_0
    //   231: iload 9
    //   233: aload 19
    //   235: arraylength
    //   236: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   239: iload 9
    //   241: aload 19
    //   243: arraylength
    //   244: iadd
    //   245: istore 20
    //   247: iload 20
    //   249: iconst_1
    //   250: iadd
    //   251: istore 9
    //   253: aload_0
    //   254: iload 20
    //   256: iconst_0
    //   257: bastore
    //   258: iload 9
    //   260: iconst_1
    //   261: iadd
    //   262: istore 12
    //   264: aload_0
    //   265: iload 9
    //   267: iconst_0
    //   268: bastore
    //   269: ldc 70
    //   271: ldc 59
    //   273: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   276: astore 22
    //   278: aload 22
    //   280: iconst_0
    //   281: aload_0
    //   282: iload 12
    //   284: aload 22
    //   286: arraylength
    //   287: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   290: aload 22
    //   292: arraylength
    //   293: istore 23
    //   295: iload 12
    //   297: iload 23
    //   299: iadd
    //   300: istore 24
    //   302: iload 24
    //   304: iconst_1
    //   305: iadd
    //   306: istore 9
    //   308: aload_0
    //   309: iload 24
    //   311: iconst_0
    //   312: bastore
    //   313: ldc 72
    //   315: ldc 59
    //   317: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   320: astore 25
    //   322: aload 25
    //   324: iconst_0
    //   325: aload_0
    //   326: iload 9
    //   328: aload 25
    //   330: arraylength
    //   331: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   334: iload 9
    //   336: aload 25
    //   338: arraylength
    //   339: iadd
    //   340: istore 26
    //   342: iload 26
    //   344: iconst_1
    //   345: iadd
    //   346: istore 9
    //   348: aload_0
    //   349: iload 26
    //   351: iconst_0
    //   352: bastore
    //   353: ldc 74
    //   355: ldc 59
    //   357: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   360: astore 27
    //   362: aload 27
    //   364: iconst_0
    //   365: aload_0
    //   366: iload 9
    //   368: aload 27
    //   370: arraylength
    //   371: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   374: iload 9
    //   376: aload 27
    //   378: arraylength
    //   379: iadd
    //   380: istore 28
    //   382: iload 28
    //   384: iconst_1
    //   385: iadd
    //   386: istore 9
    //   388: aload_0
    //   389: iload 28
    //   391: iconst_0
    //   392: bastore
    //   393: ldc 76
    //   395: ldc 59
    //   397: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   400: astore 29
    //   402: aload 29
    //   404: iconst_0
    //   405: aload_0
    //   406: iload 9
    //   408: aload 29
    //   410: arraylength
    //   411: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   414: iload 9
    //   416: aload 29
    //   418: arraylength
    //   419: iadd
    //   420: istore 30
    //   422: iload 30
    //   424: iconst_1
    //   425: iadd
    //   426: istore 9
    //   428: aload_0
    //   429: iload 30
    //   431: iconst_0
    //   432: bastore
    //   433: ldc 78
    //   435: ldc 59
    //   437: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   440: astore 31
    //   442: aload 31
    //   444: iconst_0
    //   445: aload_0
    //   446: iload 9
    //   448: aload 31
    //   450: arraylength
    //   451: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   454: iload 9
    //   456: aload 31
    //   458: arraylength
    //   459: iadd
    //   460: istore 32
    //   462: iload 32
    //   464: iconst_1
    //   465: iadd
    //   466: istore 9
    //   468: aload_0
    //   469: iload 32
    //   471: iconst_0
    //   472: bastore
    //   473: iload 9
    //   475: iconst_1
    //   476: iadd
    //   477: istore 12
    //   479: aload_0
    //   480: iload 9
    //   482: iconst_0
    //   483: bastore
    //   484: ldc 80
    //   486: ldc 59
    //   488: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   491: astore 33
    //   493: aload 33
    //   495: iconst_0
    //   496: aload_0
    //   497: iload 12
    //   499: aload 33
    //   501: arraylength
    //   502: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   505: aload 33
    //   507: arraylength
    //   508: istore 34
    //   510: iload 12
    //   512: iload 34
    //   514: iadd
    //   515: istore 35
    //   517: iload 35
    //   519: iconst_1
    //   520: iadd
    //   521: istore 9
    //   523: aload_0
    //   524: iload 35
    //   526: iconst_0
    //   527: bastore
    //   528: iload 9
    //   530: iconst_1
    //   531: iadd
    //   532: istore 12
    //   534: aload_0
    //   535: iload 9
    //   537: iconst_0
    //   538: bastore
    //   539: ldc 82
    //   541: ldc 59
    //   543: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   546: astore 36
    //   548: aload 36
    //   550: iconst_0
    //   551: aload_0
    //   552: iload 12
    //   554: aload 36
    //   556: arraylength
    //   557: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   560: aload 36
    //   562: arraylength
    //   563: istore 37
    //   565: iload 12
    //   567: iload 37
    //   569: iadd
    //   570: istore 38
    //   572: iload 38
    //   574: iconst_1
    //   575: iadd
    //   576: istore 9
    //   578: aload_0
    //   579: iload 38
    //   581: iconst_0
    //   582: bastore
    //   583: ldc 84
    //   585: ldc 59
    //   587: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   590: astore 39
    //   592: aload 39
    //   594: iconst_0
    //   595: aload_0
    //   596: iload 9
    //   598: aload 39
    //   600: arraylength
    //   601: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   604: iload 9
    //   606: aload 39
    //   608: arraylength
    //   609: iadd
    //   610: istore 40
    //   612: iload 40
    //   614: iconst_1
    //   615: iadd
    //   616: istore 9
    //   618: aload_0
    //   619: iload 40
    //   621: iconst_0
    //   622: bastore
    //   623: iload 9
    //   625: iconst_1
    //   626: iadd
    //   627: istore 12
    //   629: aload_0
    //   630: iload 9
    //   632: iconst_0
    //   633: bastore
    //   634: ldc 86
    //   636: ldc 59
    //   638: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   641: astore 41
    //   643: aload 41
    //   645: iconst_0
    //   646: aload_0
    //   647: iload 12
    //   649: aload 41
    //   651: arraylength
    //   652: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   655: aload 41
    //   657: arraylength
    //   658: istore 42
    //   660: iload 12
    //   662: iload 42
    //   664: iadd
    //   665: istore 43
    //   667: iload 43
    //   669: iconst_1
    //   670: iadd
    //   671: istore 9
    //   673: aload_0
    //   674: iload 43
    //   676: iconst_0
    //   677: bastore
    //   678: iload 9
    //   680: iconst_1
    //   681: iadd
    //   682: istore 12
    //   684: aload_0
    //   685: iload 9
    //   687: iconst_0
    //   688: bastore
    //   689: ldc 88
    //   691: ldc 59
    //   693: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   696: astore 44
    //   698: aload 44
    //   700: iconst_0
    //   701: aload_0
    //   702: iload 12
    //   704: aload 44
    //   706: arraylength
    //   707: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   710: aload 44
    //   712: arraylength
    //   713: istore 45
    //   715: iload 12
    //   717: iload 45
    //   719: iadd
    //   720: istore 46
    //   722: iload 46
    //   724: iconst_1
    //   725: iadd
    //   726: istore 9
    //   728: aload_0
    //   729: iload 46
    //   731: iconst_0
    //   732: bastore
    //   733: iload 9
    //   735: iconst_1
    //   736: iadd
    //   737: istore 12
    //   739: aload_0
    //   740: iload 9
    //   742: iconst_0
    //   743: bastore
    //   744: ldc 90
    //   746: ldc 59
    //   748: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   751: astore 47
    //   753: aload 47
    //   755: iconst_0
    //   756: aload_0
    //   757: iload 12
    //   759: aload 47
    //   761: arraylength
    //   762: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   765: aload 47
    //   767: arraylength
    //   768: istore 48
    //   770: iload 12
    //   772: iload 48
    //   774: iadd
    //   775: istore 49
    //   777: iload 49
    //   779: iconst_1
    //   780: iadd
    //   781: istore 9
    //   783: aload_0
    //   784: iload 49
    //   786: iconst_0
    //   787: bastore
    //   788: ldc 92
    //   790: ldc 59
    //   792: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   795: astore 50
    //   797: aload 50
    //   799: iconst_0
    //   800: aload_0
    //   801: iload 9
    //   803: aload 50
    //   805: arraylength
    //   806: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   809: iload 9
    //   811: aload 50
    //   813: arraylength
    //   814: iadd
    //   815: istore 51
    //   817: iload 51
    //   819: iconst_1
    //   820: iadd
    //   821: istore 9
    //   823: aload_0
    //   824: iload 51
    //   826: iconst_0
    //   827: bastore
    //   828: ldc 94
    //   830: ldc 59
    //   832: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   835: astore 52
    //   837: aload 52
    //   839: iconst_0
    //   840: aload_0
    //   841: iload 9
    //   843: aload 52
    //   845: arraylength
    //   846: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   849: iload 9
    //   851: aload 52
    //   853: arraylength
    //   854: iadd
    //   855: istore 53
    //   857: iload 53
    //   859: iconst_1
    //   860: iadd
    //   861: istore 9
    //   863: aload_0
    //   864: iload 53
    //   866: iconst_0
    //   867: bastore
    //   868: iload 9
    //   870: iconst_1
    //   871: iadd
    //   872: istore 12
    //   874: aload_0
    //   875: iload 9
    //   877: iconst_0
    //   878: bastore
    //   879: ldc 96
    //   881: ldc 59
    //   883: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   886: astore 54
    //   888: aload 54
    //   890: iconst_0
    //   891: aload_0
    //   892: iload 12
    //   894: aload 54
    //   896: arraylength
    //   897: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   900: aload 54
    //   902: arraylength
    //   903: istore 55
    //   905: iload 12
    //   907: iload 55
    //   909: iadd
    //   910: istore 56
    //   912: iload 56
    //   914: iconst_1
    //   915: iadd
    //   916: istore 9
    //   918: aload_0
    //   919: iload 56
    //   921: iconst_0
    //   922: bastore
    //   923: ldc 98
    //   925: ldc 59
    //   927: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   930: astore 57
    //   932: aload 57
    //   934: iconst_0
    //   935: aload_0
    //   936: iload 9
    //   938: aload 57
    //   940: arraylength
    //   941: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   944: iload 9
    //   946: aload 57
    //   948: arraylength
    //   949: iadd
    //   950: istore 58
    //   952: iload 58
    //   954: iconst_1
    //   955: iadd
    //   956: istore 9
    //   958: aload_0
    //   959: iload 58
    //   961: iconst_0
    //   962: bastore
    //   963: iload 9
    //   965: iconst_1
    //   966: iadd
    //   967: istore 12
    //   969: aload_0
    //   970: iload 9
    //   972: iconst_0
    //   973: bastore
    //   974: ldc 100
    //   976: ldc 59
    //   978: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   981: astore 59
    //   983: aload 59
    //   985: iconst_0
    //   986: aload_0
    //   987: iload 12
    //   989: aload 59
    //   991: arraylength
    //   992: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   995: aload 59
    //   997: arraylength
    //   998: istore 60
    //   1000: iload 12
    //   1002: iload 60
    //   1004: iadd
    //   1005: istore 61
    //   1007: iload 61
    //   1009: iconst_1
    //   1010: iadd
    //   1011: istore 9
    //   1013: aload_0
    //   1014: iload 61
    //   1016: iconst_0
    //   1017: bastore
    //   1018: ldc 102
    //   1020: ldc 59
    //   1022: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1025: astore 62
    //   1027: aload 62
    //   1029: iconst_0
    //   1030: aload_0
    //   1031: iload 9
    //   1033: aload 62
    //   1035: arraylength
    //   1036: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1039: iload 9
    //   1041: aload 62
    //   1043: arraylength
    //   1044: iadd
    //   1045: istore 63
    //   1047: iload 63
    //   1049: iconst_1
    //   1050: iadd
    //   1051: istore 9
    //   1053: aload_0
    //   1054: iload 63
    //   1056: iconst_0
    //   1057: bastore
    //   1058: iload 9
    //   1060: iconst_1
    //   1061: iadd
    //   1062: istore 12
    //   1064: aload_0
    //   1065: iload 9
    //   1067: iconst_0
    //   1068: bastore
    //   1069: ldc 104
    //   1071: ldc 59
    //   1073: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1076: astore 64
    //   1078: aload 64
    //   1080: iconst_0
    //   1081: aload_0
    //   1082: iload 12
    //   1084: aload 64
    //   1086: arraylength
    //   1087: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1090: aload 64
    //   1092: arraylength
    //   1093: istore 65
    //   1095: iload 12
    //   1097: iload 65
    //   1099: iadd
    //   1100: istore 66
    //   1102: iload 66
    //   1104: iconst_1
    //   1105: iadd
    //   1106: istore 9
    //   1108: aload_0
    //   1109: iload 66
    //   1111: iconst_0
    //   1112: bastore
    //   1113: ldc 106
    //   1115: ldc 59
    //   1117: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1120: astore 67
    //   1122: aload 67
    //   1124: iconst_0
    //   1125: aload_0
    //   1126: iload 9
    //   1128: aload 67
    //   1130: arraylength
    //   1131: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1134: iload 9
    //   1136: aload 67
    //   1138: arraylength
    //   1139: iadd
    //   1140: istore 68
    //   1142: iload 68
    //   1144: iconst_1
    //   1145: iadd
    //   1146: istore 9
    //   1148: aload_0
    //   1149: iload 68
    //   1151: iconst_0
    //   1152: bastore
    //   1153: ldc 108
    //   1155: ldc 59
    //   1157: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1160: astore 69
    //   1162: aload 69
    //   1164: iconst_0
    //   1165: aload_0
    //   1166: iload 9
    //   1168: aload 69
    //   1170: arraylength
    //   1171: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1174: iload 9
    //   1176: aload 69
    //   1178: arraylength
    //   1179: iadd
    //   1180: istore 70
    //   1182: iload 70
    //   1184: iconst_1
    //   1185: iadd
    //   1186: istore 9
    //   1188: aload_0
    //   1189: iload 70
    //   1191: iconst_0
    //   1192: bastore
    //   1193: ldc 110
    //   1195: ldc 59
    //   1197: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1200: astore 71
    //   1202: aload 71
    //   1204: iconst_0
    //   1205: aload_0
    //   1206: iload 9
    //   1208: aload 71
    //   1210: arraylength
    //   1211: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1214: iload 9
    //   1216: aload 71
    //   1218: arraylength
    //   1219: iadd
    //   1220: istore 72
    //   1222: iload 72
    //   1224: iconst_1
    //   1225: iadd
    //   1226: istore 9
    //   1228: aload_0
    //   1229: iload 72
    //   1231: iconst_0
    //   1232: bastore
    //   1233: ldc 112
    //   1235: ldc 59
    //   1237: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1240: astore 73
    //   1242: aload 73
    //   1244: iconst_0
    //   1245: aload_0
    //   1246: iload 9
    //   1248: aload 73
    //   1250: arraylength
    //   1251: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1254: iload 9
    //   1256: aload 73
    //   1258: arraylength
    //   1259: iadd
    //   1260: istore 74
    //   1262: iload 74
    //   1264: iconst_1
    //   1265: iadd
    //   1266: istore 9
    //   1268: aload_0
    //   1269: iload 74
    //   1271: iconst_0
    //   1272: bastore
    //   1273: iload 9
    //   1275: iconst_1
    //   1276: iadd
    //   1277: istore 12
    //   1279: aload_0
    //   1280: iload 9
    //   1282: iconst_0
    //   1283: bastore
    //   1284: ldc 114
    //   1286: ldc 59
    //   1288: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1291: astore 75
    //   1293: aload 75
    //   1295: iconst_0
    //   1296: aload_0
    //   1297: iload 12
    //   1299: aload 75
    //   1301: arraylength
    //   1302: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1305: aload 75
    //   1307: arraylength
    //   1308: istore 76
    //   1310: iload 12
    //   1312: iload 76
    //   1314: iadd
    //   1315: istore 77
    //   1317: iload 77
    //   1319: iconst_1
    //   1320: iadd
    //   1321: istore 9
    //   1323: aload_0
    //   1324: iload 77
    //   1326: iconst_0
    //   1327: bastore
    //   1328: iload 9
    //   1330: iconst_1
    //   1331: iadd
    //   1332: istore 12
    //   1334: aload_0
    //   1335: iload 9
    //   1337: iconst_1
    //   1338: bastore
    //   1339: ldc 116
    //   1341: ldc 59
    //   1343: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1346: astore 78
    //   1348: aload 78
    //   1350: iconst_0
    //   1351: aload_0
    //   1352: iload 12
    //   1354: aload 78
    //   1356: arraylength
    //   1357: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1360: aload 78
    //   1362: arraylength
    //   1363: istore 79
    //   1365: iload 12
    //   1367: iload 79
    //   1369: iadd
    //   1370: istore 80
    //   1372: iload 80
    //   1374: iconst_1
    //   1375: iadd
    //   1376: istore 9
    //   1378: aload_0
    //   1379: iload 80
    //   1381: iconst_0
    //   1382: bastore
    //   1383: iload 9
    //   1385: iconst_1
    //   1386: iadd
    //   1387: istore 12
    //   1389: aload_0
    //   1390: iload 9
    //   1392: iconst_0
    //   1393: bastore
    //   1394: iload 12
    //   1396: iconst_1
    //   1397: iadd
    //   1398: istore 9
    //   1400: aload_0
    //   1401: iload 12
    //   1403: iconst_2
    //   1404: bastore
    //   1405: ldc 118
    //   1407: ldc 59
    //   1409: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1412: astore 81
    //   1414: aload 81
    //   1416: iconst_0
    //   1417: aload_0
    //   1418: iload 9
    //   1420: aload 81
    //   1422: arraylength
    //   1423: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1426: iload 9
    //   1428: aload 81
    //   1430: arraylength
    //   1431: iadd
    //   1432: istore 82
    //   1434: iload 82
    //   1436: iconst_1
    //   1437: iadd
    //   1438: istore 9
    //   1440: aload_0
    //   1441: iload 82
    //   1443: iconst_0
    //   1444: bastore
    //   1445: iload 9
    //   1447: iconst_1
    //   1448: iadd
    //   1449: istore 12
    //   1451: aload_0
    //   1452: iload 9
    //   1454: iconst_2
    //   1455: bastore
    //   1456: iload 12
    //   1458: iconst_1
    //   1459: iadd
    //   1460: istore 9
    //   1462: aload_0
    //   1463: iload 12
    //   1465: iconst_2
    //   1466: bastore
    //   1467: ldc 120
    //   1469: ldc 59
    //   1471: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1474: astore 83
    //   1476: aload 83
    //   1478: iconst_0
    //   1479: aload_0
    //   1480: iload 9
    //   1482: aload 83
    //   1484: arraylength
    //   1485: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1488: iload 9
    //   1490: aload 83
    //   1492: arraylength
    //   1493: iadd
    //   1494: istore 84
    //   1496: iload 84
    //   1498: iconst_1
    //   1499: iadd
    //   1500: istore 9
    //   1502: aload_0
    //   1503: iload 84
    //   1505: iconst_0
    //   1506: bastore
    //   1507: iload 9
    //   1509: iconst_1
    //   1510: iadd
    //   1511: istore 12
    //   1513: aload_0
    //   1514: iload 9
    //   1516: iconst_4
    //   1517: bastore
    //   1518: iload 12
    //   1520: iconst_1
    //   1521: iadd
    //   1522: istore 9
    //   1524: aload_0
    //   1525: iload 12
    //   1527: iconst_2
    //   1528: bastore
    //   1529: ldc 122
    //   1531: ldc 59
    //   1533: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1536: astore 85
    //   1538: aload 85
    //   1540: iconst_0
    //   1541: aload_0
    //   1542: iload 9
    //   1544: aload 85
    //   1546: arraylength
    //   1547: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1550: iload 9
    //   1552: aload 85
    //   1554: arraylength
    //   1555: iadd
    //   1556: istore 86
    //   1558: iload 86
    //   1560: iconst_1
    //   1561: iadd
    //   1562: istore 9
    //   1564: aload_0
    //   1565: iload 86
    //   1567: iconst_0
    //   1568: bastore
    //   1569: iload 9
    //   1571: iconst_1
    //   1572: iadd
    //   1573: istore 12
    //   1575: aload_0
    //   1576: iload 9
    //   1578: bipush 7
    //   1580: bastore
    //   1581: iload 12
    //   1583: iconst_1
    //   1584: iadd
    //   1585: istore 9
    //   1587: aload_0
    //   1588: iload 12
    //   1590: iconst_1
    //   1591: bastore
    //   1592: ldc 124
    //   1594: ldc 59
    //   1596: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1599: astore 87
    //   1601: aload 87
    //   1603: iconst_0
    //   1604: aload_0
    //   1605: iload 9
    //   1607: aload 87
    //   1609: arraylength
    //   1610: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1613: iload 9
    //   1615: aload 87
    //   1617: arraylength
    //   1618: iadd
    //   1619: istore 88
    //   1621: iload 88
    //   1623: iconst_1
    //   1624: iadd
    //   1625: istore 9
    //   1627: aload_0
    //   1628: iload 88
    //   1630: iconst_0
    //   1631: bastore
    //   1632: iload 9
    //   1634: iconst_1
    //   1635: iadd
    //   1636: istore 12
    //   1638: aload_0
    //   1639: iload 9
    //   1641: bipush 7
    //   1643: bastore
    //   1644: iload 12
    //   1646: iconst_1
    //   1647: iadd
    //   1648: istore 9
    //   1650: aload_0
    //   1651: iload 12
    //   1653: iconst_2
    //   1654: bastore
    //   1655: ldc 126
    //   1657: ldc 59
    //   1659: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1662: astore 89
    //   1664: aload 89
    //   1666: iconst_0
    //   1667: aload_0
    //   1668: iload 9
    //   1670: aload 89
    //   1672: arraylength
    //   1673: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1676: iload 9
    //   1678: aload 89
    //   1680: arraylength
    //   1681: iadd
    //   1682: istore 90
    //   1684: iload 90
    //   1686: iconst_1
    //   1687: iadd
    //   1688: istore 9
    //   1690: aload_0
    //   1691: iload 90
    //   1693: iconst_0
    //   1694: bastore
    //   1695: iload 9
    //   1697: iconst_1
    //   1698: iadd
    //   1699: istore 12
    //   1701: aload_0
    //   1702: iload 9
    //   1704: bipush 9
    //   1706: bastore
    //   1707: iload 12
    //   1709: iconst_1
    //   1710: iadd
    //   1711: istore 9
    //   1713: aload_0
    //   1714: iload 12
    //   1716: iconst_2
    //   1717: bastore
    //   1718: ldc -128
    //   1720: ldc 59
    //   1722: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1725: astore 91
    //   1727: aload 91
    //   1729: iconst_0
    //   1730: aload_0
    //   1731: iload 9
    //   1733: aload 91
    //   1735: arraylength
    //   1736: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1739: iload 9
    //   1741: aload 91
    //   1743: arraylength
    //   1744: iadd
    //   1745: istore 92
    //   1747: iload 92
    //   1749: iconst_1
    //   1750: iadd
    //   1751: istore 9
    //   1753: aload_0
    //   1754: iload 92
    //   1756: iconst_0
    //   1757: bastore
    //   1758: iload 9
    //   1760: iconst_1
    //   1761: iadd
    //   1762: istore 12
    //   1764: aload_0
    //   1765: iload 9
    //   1767: bipush 24
    //   1769: bastore
    //   1770: iload 12
    //   1772: iconst_1
    //   1773: iadd
    //   1774: istore 9
    //   1776: aload_0
    //   1777: iload 12
    //   1779: iconst_1
    //   1780: bastore
    //   1781: ldc -126
    //   1783: ldc 59
    //   1785: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1788: astore 93
    //   1790: aload 93
    //   1792: iconst_0
    //   1793: aload_0
    //   1794: iload 9
    //   1796: aload 93
    //   1798: arraylength
    //   1799: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1802: iload 9
    //   1804: aload 93
    //   1806: arraylength
    //   1807: iadd
    //   1808: istore 94
    //   1810: iload 94
    //   1812: iconst_1
    //   1813: iadd
    //   1814: istore 9
    //   1816: aload_0
    //   1817: iload 94
    //   1819: iconst_0
    //   1820: bastore
    //   1821: iload 9
    //   1823: iconst_1
    //   1824: iadd
    //   1825: istore 12
    //   1827: aload_0
    //   1828: iload 9
    //   1830: bipush 33
    //   1832: bastore
    //   1833: iload 12
    //   1835: iconst_1
    //   1836: iadd
    //   1837: istore 9
    //   1839: aload_0
    //   1840: iload 12
    //   1842: iconst_1
    //   1843: bastore
    //   1844: ldc -124
    //   1846: ldc 59
    //   1848: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1851: astore 95
    //   1853: aload 95
    //   1855: iconst_0
    //   1856: aload_0
    //   1857: iload 9
    //   1859: aload 95
    //   1861: arraylength
    //   1862: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1865: iload 9
    //   1867: aload 95
    //   1869: arraylength
    //   1870: iadd
    //   1871: istore 96
    //   1873: iload 96
    //   1875: iconst_1
    //   1876: iadd
    //   1877: istore 9
    //   1879: aload_0
    //   1880: iload 96
    //   1882: iconst_0
    //   1883: bastore
    //   1884: iload 9
    //   1886: iconst_1
    //   1887: iadd
    //   1888: istore 12
    //   1890: aload_0
    //   1891: iload 9
    //   1893: bipush 40
    //   1895: bastore
    //   1896: iload 12
    //   1898: iconst_1
    //   1899: iadd
    //   1900: istore 9
    //   1902: aload_0
    //   1903: iload 12
    //   1905: iconst_1
    //   1906: bastore
    //   1907: ldc -122
    //   1909: ldc 59
    //   1911: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1914: astore 97
    //   1916: aload 97
    //   1918: iconst_0
    //   1919: aload_0
    //   1920: iload 9
    //   1922: aload 97
    //   1924: arraylength
    //   1925: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1928: iload 9
    //   1930: aload 97
    //   1932: arraylength
    //   1933: iadd
    //   1934: istore 98
    //   1936: iload 98
    //   1938: iconst_1
    //   1939: iadd
    //   1940: istore 9
    //   1942: aload_0
    //   1943: iload 98
    //   1945: iconst_0
    //   1946: bastore
    //   1947: iload 9
    //   1949: iconst_1
    //   1950: iadd
    //   1951: istore 12
    //   1953: aload_0
    //   1954: iload 9
    //   1956: bipush 42
    //   1958: bastore
    //   1959: iload 12
    //   1961: iconst_1
    //   1962: iadd
    //   1963: istore 9
    //   1965: aload_0
    //   1966: iload 12
    //   1968: iconst_2
    //   1969: bastore
    //   1970: ldc -120
    //   1972: ldc 59
    //   1974: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1977: astore 99
    //   1979: aload 99
    //   1981: iconst_0
    //   1982: aload_0
    //   1983: iload 9
    //   1985: aload 99
    //   1987: arraylength
    //   1988: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1991: iload 9
    //   1993: aload 99
    //   1995: arraylength
    //   1996: iadd
    //   1997: istore 100
    //   1999: iload 100
    //   2001: iconst_1
    //   2002: iadd
    //   2003: istore 9
    //   2005: aload_0
    //   2006: iload 100
    //   2008: iconst_0
    //   2009: bastore
    //   2010: iload 9
    //   2012: iconst_1
    //   2013: iadd
    //   2014: istore 12
    //   2016: aload_0
    //   2017: iload 9
    //   2019: bipush 45
    //   2021: bastore
    //   2022: iload 12
    //   2024: iconst_1
    //   2025: iadd
    //   2026: istore 9
    //   2028: aload_0
    //   2029: iload 12
    //   2031: iconst_1
    //   2032: bastore
    //   2033: ldc -118
    //   2035: ldc 59
    //   2037: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2040: astore 101
    //   2042: aload 101
    //   2044: iconst_0
    //   2045: aload_0
    //   2046: iload 9
    //   2048: aload 101
    //   2050: arraylength
    //   2051: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2054: iload 9
    //   2056: aload 101
    //   2058: arraylength
    //   2059: iadd
    //   2060: istore 102
    //   2062: iload 102
    //   2064: iconst_1
    //   2065: iadd
    //   2066: istore 9
    //   2068: aload_0
    //   2069: iload 102
    //   2071: iconst_0
    //   2072: bastore
    //   2073: iload 9
    //   2075: iconst_1
    //   2076: iadd
    //   2077: istore 12
    //   2079: aload_0
    //   2080: iload 9
    //   2082: bipush 46
    //   2084: bastore
    //   2085: iload 12
    //   2087: iconst_1
    //   2088: iadd
    //   2089: istore 9
    //   2091: aload_0
    //   2092: iload 12
    //   2094: iconst_2
    //   2095: bastore
    //   2096: ldc -116
    //   2098: ldc 59
    //   2100: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2103: astore 103
    //   2105: aload 103
    //   2107: iconst_0
    //   2108: aload_0
    //   2109: iload 9
    //   2111: aload 103
    //   2113: arraylength
    //   2114: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2117: iload 9
    //   2119: aload 103
    //   2121: arraylength
    //   2122: iadd
    //   2123: istore 104
    //   2125: iload 104
    //   2127: iconst_1
    //   2128: iadd
    //   2129: istore 9
    //   2131: aload_0
    //   2132: iload 104
    //   2134: iconst_0
    //   2135: bastore
    //   2136: iload 9
    //   2138: iconst_1
    //   2139: iadd
    //   2140: istore 12
    //   2142: aload_0
    //   2143: iload 9
    //   2145: bipush 52
    //   2147: bastore
    //   2148: iload 12
    //   2150: iconst_1
    //   2151: iadd
    //   2152: istore 9
    //   2154: aload_0
    //   2155: iload 12
    //   2157: iconst_1
    //   2158: bastore
    //   2159: ldc -114
    //   2161: ldc 59
    //   2163: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2166: astore 105
    //   2168: aload 105
    //   2170: iconst_0
    //   2171: aload_0
    //   2172: iload 9
    //   2174: aload 105
    //   2176: arraylength
    //   2177: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2180: iload 9
    //   2182: aload 105
    //   2184: arraylength
    //   2185: iadd
    //   2186: istore 106
    //   2188: iload 106
    //   2190: iconst_1
    //   2191: iadd
    //   2192: istore 9
    //   2194: aload_0
    //   2195: iload 106
    //   2197: iconst_0
    //   2198: bastore
    //   2199: iload 9
    //   2201: iconst_1
    //   2202: iadd
    //   2203: istore 12
    //   2205: aload_0
    //   2206: iload 9
    //   2208: bipush 54
    //   2210: bastore
    //   2211: iload 12
    //   2213: iconst_1
    //   2214: iadd
    //   2215: istore 9
    //   2217: aload_0
    //   2218: iload 12
    //   2220: iconst_2
    //   2221: bastore
    //   2222: ldc -112
    //   2224: ldc 59
    //   2226: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2229: astore 107
    //   2231: aload 107
    //   2233: iconst_0
    //   2234: aload_0
    //   2235: iload 9
    //   2237: aload 107
    //   2239: arraylength
    //   2240: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2243: iload 9
    //   2245: aload 107
    //   2247: arraylength
    //   2248: iadd
    //   2249: istore 108
    //   2251: iload 108
    //   2253: iconst_1
    //   2254: iadd
    //   2255: istore 9
    //   2257: aload_0
    //   2258: iload 108
    //   2260: iconst_0
    //   2261: bastore
    //   2262: iload 9
    //   2264: iconst_1
    //   2265: iadd
    //   2266: istore 12
    //   2268: aload_0
    //   2269: iload 9
    //   2271: bipush 56
    //   2273: bastore
    //   2274: iload 12
    //   2276: iconst_1
    //   2277: iadd
    //   2278: istore 9
    //   2280: aload_0
    //   2281: iload 12
    //   2283: iconst_1
    //   2284: bastore
    //   2285: ldc -110
    //   2287: ldc 59
    //   2289: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2292: astore 109
    //   2294: aload 109
    //   2296: iconst_0
    //   2297: aload_0
    //   2298: iload 9
    //   2300: aload 109
    //   2302: arraylength
    //   2303: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2306: iload 9
    //   2308: aload 109
    //   2310: arraylength
    //   2311: iadd
    //   2312: istore 110
    //   2314: iload 110
    //   2316: iconst_1
    //   2317: iadd
    //   2318: istore 9
    //   2320: aload_0
    //   2321: iload 110
    //   2323: iconst_0
    //   2324: bastore
    //   2325: iload 9
    //   2327: iconst_1
    //   2328: iadd
    //   2329: istore 12
    //   2331: aload_0
    //   2332: iload 9
    //   2334: bipush 57
    //   2336: bastore
    //   2337: iload 12
    //   2339: iconst_1
    //   2340: iadd
    //   2341: istore 9
    //   2343: aload_0
    //   2344: iload 12
    //   2346: iconst_2
    //   2347: bastore
    //   2348: ldc -108
    //   2350: ldc 59
    //   2352: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2355: astore 111
    //   2357: aload 111
    //   2359: iconst_0
    //   2360: aload_0
    //   2361: iload 9
    //   2363: aload 111
    //   2365: arraylength
    //   2366: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2369: iload 9
    //   2371: aload 111
    //   2373: arraylength
    //   2374: iadd
    //   2375: istore 112
    //   2377: iload 112
    //   2379: iconst_1
    //   2380: iadd
    //   2381: istore 9
    //   2383: aload_0
    //   2384: iload 112
    //   2386: iconst_0
    //   2387: bastore
    //   2388: iload 9
    //   2390: iconst_1
    //   2391: iadd
    //   2392: istore 12
    //   2394: aload_0
    //   2395: iload 9
    //   2397: bipush 60
    //   2399: bastore
    //   2400: iload 12
    //   2402: iconst_1
    //   2403: iadd
    //   2404: istore 9
    //   2406: aload_0
    //   2407: iload 12
    //   2409: iconst_1
    //   2410: bastore
    //   2411: ldc -106
    //   2413: ldc 59
    //   2415: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2418: astore 113
    //   2420: aload 113
    //   2422: iconst_0
    //   2423: aload_0
    //   2424: iload 9
    //   2426: aload 113
    //   2428: arraylength
    //   2429: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2432: iload 9
    //   2434: aload 113
    //   2436: arraylength
    //   2437: iadd
    //   2438: istore 114
    //   2440: iload 114
    //   2442: iconst_1
    //   2443: iadd
    //   2444: istore 9
    //   2446: aload_0
    //   2447: iload 114
    //   2449: iconst_0
    //   2450: bastore
    //   2451: iload 9
    //   2453: iconst_1
    //   2454: iadd
    //   2455: istore 12
    //   2457: aload_0
    //   2458: iload 9
    //   2460: bipush 60
    //   2462: bastore
    //   2463: iload 12
    //   2465: iconst_1
    //   2466: iadd
    //   2467: istore 9
    //   2469: aload_0
    //   2470: iload 12
    //   2472: iconst_2
    //   2473: bastore
    //   2474: ldc -104
    //   2476: ldc 59
    //   2478: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2481: astore 115
    //   2483: aload 115
    //   2485: iconst_0
    //   2486: aload_0
    //   2487: iload 9
    //   2489: aload 115
    //   2491: arraylength
    //   2492: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2495: iload 9
    //   2497: aload 115
    //   2499: arraylength
    //   2500: iadd
    //   2501: istore 116
    //   2503: iload 116
    //   2505: iconst_1
    //   2506: iadd
    //   2507: istore 9
    //   2509: aload_0
    //   2510: iload 116
    //   2512: iconst_0
    //   2513: bastore
    //   2514: iload 9
    //   2516: iconst_1
    //   2517: iadd
    //   2518: istore 12
    //   2520: aload_0
    //   2521: iload 9
    //   2523: bipush 73
    //   2525: bastore
    //   2526: iload 12
    //   2528: iconst_1
    //   2529: iadd
    //   2530: istore 9
    //   2532: aload_0
    //   2533: iload 12
    //   2535: iconst_1
    //   2536: bastore
    //   2537: ldc -102
    //   2539: ldc 59
    //   2541: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2544: astore 117
    //   2546: aload 117
    //   2548: iconst_0
    //   2549: aload_0
    //   2550: iload 9
    //   2552: aload 117
    //   2554: arraylength
    //   2555: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2558: iload 9
    //   2560: aload 117
    //   2562: arraylength
    //   2563: iadd
    //   2564: istore 118
    //   2566: iload 118
    //   2568: iconst_1
    //   2569: iadd
    //   2570: istore 9
    //   2572: aload_0
    //   2573: iload 118
    //   2575: iconst_0
    //   2576: bastore
    //   2577: iload 9
    //   2579: iconst_1
    //   2580: iadd
    //   2581: istore 12
    //   2583: aload_0
    //   2584: iload 9
    //   2586: bipush 82
    //   2588: bastore
    //   2589: iload 12
    //   2591: iconst_1
    //   2592: iadd
    //   2593: istore 9
    //   2595: aload_0
    //   2596: iload 12
    //   2598: iconst_2
    //   2599: bastore
    //   2600: ldc -100
    //   2602: ldc 59
    //   2604: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2607: astore 119
    //   2609: aload 119
    //   2611: iconst_0
    //   2612: aload_0
    //   2613: iload 9
    //   2615: aload 119
    //   2617: arraylength
    //   2618: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2621: iload 9
    //   2623: aload 119
    //   2625: arraylength
    //   2626: iadd
    //   2627: istore 120
    //   2629: iload 120
    //   2631: iconst_1
    //   2632: iadd
    //   2633: istore 9
    //   2635: aload_0
    //   2636: iload 120
    //   2638: iconst_0
    //   2639: bastore
    //   2640: iload 9
    //   2642: iconst_1
    //   2643: iadd
    //   2644: istore 12
    //   2646: aload_0
    //   2647: iload 9
    //   2649: bipush 86
    //   2651: bastore
    //   2652: iload 12
    //   2654: iconst_1
    //   2655: iadd
    //   2656: istore 9
    //   2658: aload_0
    //   2659: iload 12
    //   2661: iconst_1
    //   2662: bastore
    //   2663: ldc -98
    //   2665: ldc 59
    //   2667: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2670: astore 121
    //   2672: aload 121
    //   2674: iconst_0
    //   2675: aload_0
    //   2676: iload 9
    //   2678: aload 121
    //   2680: arraylength
    //   2681: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2684: iload 9
    //   2686: aload 121
    //   2688: arraylength
    //   2689: iadd
    //   2690: istore 122
    //   2692: iload 122
    //   2694: iconst_1
    //   2695: iadd
    //   2696: istore 9
    //   2698: aload_0
    //   2699: iload 122
    //   2701: iconst_0
    //   2702: bastore
    //   2703: iload 9
    //   2705: iconst_1
    //   2706: iadd
    //   2707: istore 12
    //   2709: aload_0
    //   2710: iload 9
    //   2712: bipush 86
    //   2714: bastore
    //   2715: iload 12
    //   2717: iconst_1
    //   2718: iadd
    //   2719: istore 9
    //   2721: aload_0
    //   2722: iload 12
    //   2724: iconst_2
    //   2725: bastore
    //   2726: ldc -96
    //   2728: ldc 59
    //   2730: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2733: astore 123
    //   2735: aload 123
    //   2737: iconst_0
    //   2738: aload_0
    //   2739: iload 9
    //   2741: aload 123
    //   2743: arraylength
    //   2744: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2747: iload 9
    //   2749: aload 123
    //   2751: arraylength
    //   2752: iadd
    //   2753: istore 124
    //   2755: iload 124
    //   2757: iconst_1
    //   2758: iadd
    //   2759: istore 9
    //   2761: aload_0
    //   2762: iload 124
    //   2764: iconst_0
    //   2765: bastore
    //   2766: iload 9
    //   2768: iconst_1
    //   2769: iadd
    //   2770: istore 12
    //   2772: aload_0
    //   2773: iload 9
    //   2775: bipush 89
    //   2777: bastore
    //   2778: iload 12
    //   2780: iconst_1
    //   2781: iadd
    //   2782: istore 9
    //   2784: aload_0
    //   2785: iload 12
    //   2787: iconst_2
    //   2788: bastore
    //   2789: ldc -94
    //   2791: ldc 59
    //   2793: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2796: astore 125
    //   2798: aload 125
    //   2800: iconst_0
    //   2801: aload_0
    //   2802: iload 9
    //   2804: aload 125
    //   2806: arraylength
    //   2807: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2810: iload 9
    //   2812: aload 125
    //   2814: arraylength
    //   2815: iadd
    //   2816: istore 126
    //   2818: iload 126
    //   2820: iconst_1
    //   2821: iadd
    //   2822: istore 9
    //   2824: aload_0
    //   2825: iload 126
    //   2827: iconst_0
    //   2828: bastore
    //   2829: iload 9
    //   2831: iconst_1
    //   2832: iadd
    //   2833: istore 12
    //   2835: aload_0
    //   2836: iload 9
    //   2838: bipush 90
    //   2840: bastore
    //   2841: iload 12
    //   2843: iconst_1
    //   2844: iadd
    //   2845: istore 9
    //   2847: aload_0
    //   2848: iload 12
    //   2850: iconst_1
    //   2851: bastore
    //   2852: ldc -92
    //   2854: ldc 59
    //   2856: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2859: astore 127
    //   2861: aload 127
    //   2863: iconst_0
    //   2864: aload_0
    //   2865: iload 9
    //   2867: aload 127
    //   2869: arraylength
    //   2870: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2873: iload 9
    //   2875: aload 127
    //   2877: arraylength
    //   2878: iadd
    //   2879: istore -128
    //   2881: iload -128
    //   2883: iconst_1
    //   2884: iadd
    //   2885: istore 9
    //   2887: aload_0
    //   2888: iload -128
    //   2890: iconst_0
    //   2891: bastore
    //   2892: iload 9
    //   2894: iconst_1
    //   2895: iadd
    //   2896: istore 12
    //   2898: aload_0
    //   2899: iload 9
    //   2901: bipush 95
    //   2903: bastore
    //   2904: iload 12
    //   2906: iconst_1
    //   2907: iadd
    //   2908: istore 9
    //   2910: aload_0
    //   2911: iload 12
    //   2913: iconst_1
    //   2914: bastore
    //   2915: ldc -90
    //   2917: ldc 59
    //   2919: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2922: astore -127
    //   2924: aload -127
    //   2926: iconst_0
    //   2927: aload_0
    //   2928: iload 9
    //   2930: aload -127
    //   2932: arraylength
    //   2933: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2936: iload 9
    //   2938: aload -127
    //   2940: arraylength
    //   2941: iadd
    //   2942: istore -126
    //   2944: iload -126
    //   2946: iconst_1
    //   2947: iadd
    //   2948: istore 9
    //   2950: aload_0
    //   2951: iload -126
    //   2953: iconst_0
    //   2954: bastore
    //   2955: iload 9
    //   2957: istore 12
    //   2959: new 168	java/io/File
    //   2962: dup
    //   2963: ldc -86
    //   2965: invokespecial 173	java/io/File:<init>	(Ljava/lang/String;)V
    //   2968: aload_0
    //   2969: iload 12
    //   2971: invokestatic 179	net/oicp/anya/Utils:writeBytes2File	(Ljava/io/File;[BI)V
    //   2974: return
    //   2975: astore 10
    //   2977: aload 10
    //   2979: astore 11
    //   2981: iload 9
    //   2983: istore 12
    //   2985: aload 11
    //   2987: invokevirtual 182	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   2990: goto -31 -> 2959
    //   2993: astore 21
    //   2995: aload 21
    //   2997: astore 11
    //   2999: goto -14 -> 2985
    // Local variable table:
    //   start	length	slot	name	signature
    //   5	2964	0	arrayOfByte1	byte[]
    //   11	11	1	arrayOfByte2	byte[]
    //   23	7	2	i	int
    //   27	12	3	j	int
    //   35	14	4	k	int
    //   45	15	5	m	int
    //   56	15	6	n	int
    //   67	15	7	i1	int
    //   78	16	8	i2	int
    //   90	2892	9	i3	int
    //   2975	3	10	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   2979	19	11	localObject	Object
    //   262	2722	12	i4	int
    //   105	17	13	arrayOfByte3	byte[]
    //   125	10	14	i5	int
    //   145	17	15	arrayOfByte4	byte[]
    //   165	10	16	i6	int
    //   185	17	17	arrayOfByte5	byte[]
    //   205	10	18	i7	int
    //   225	17	19	arrayOfByte6	byte[]
    //   245	10	20	i8	int
    //   2993	3	21	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   276	15	22	arrayOfByte7	byte[]
    //   293	7	23	i9	int
    //   300	10	24	i10	int
    //   320	17	25	arrayOfByte8	byte[]
    //   340	10	26	i11	int
    //   360	17	27	arrayOfByte9	byte[]
    //   380	10	28	i12	int
    //   400	17	29	arrayOfByte10	byte[]
    //   420	10	30	i13	int
    //   440	17	31	arrayOfByte11	byte[]
    //   460	10	32	i14	int
    //   491	15	33	arrayOfByte12	byte[]
    //   508	7	34	i15	int
    //   515	10	35	i16	int
    //   546	15	36	arrayOfByte13	byte[]
    //   563	7	37	i17	int
    //   570	10	38	i18	int
    //   590	17	39	arrayOfByte14	byte[]
    //   610	10	40	i19	int
    //   641	15	41	arrayOfByte15	byte[]
    //   658	7	42	i20	int
    //   665	10	43	i21	int
    //   696	15	44	arrayOfByte16	byte[]
    //   713	7	45	i22	int
    //   720	10	46	i23	int
    //   751	15	47	arrayOfByte17	byte[]
    //   768	7	48	i24	int
    //   775	10	49	i25	int
    //   795	17	50	arrayOfByte18	byte[]
    //   815	10	51	i26	int
    //   835	17	52	arrayOfByte19	byte[]
    //   855	10	53	i27	int
    //   886	15	54	arrayOfByte20	byte[]
    //   903	7	55	i28	int
    //   910	10	56	i29	int
    //   930	17	57	arrayOfByte21	byte[]
    //   950	10	58	i30	int
    //   981	15	59	arrayOfByte22	byte[]
    //   998	7	60	i31	int
    //   1005	10	61	i32	int
    //   1025	17	62	arrayOfByte23	byte[]
    //   1045	10	63	i33	int
    //   1076	15	64	arrayOfByte24	byte[]
    //   1093	7	65	i34	int
    //   1100	10	66	i35	int
    //   1120	17	67	arrayOfByte25	byte[]
    //   1140	10	68	i36	int
    //   1160	17	69	arrayOfByte26	byte[]
    //   1180	10	70	i37	int
    //   1200	17	71	arrayOfByte27	byte[]
    //   1220	10	72	i38	int
    //   1240	17	73	arrayOfByte28	byte[]
    //   1260	10	74	i39	int
    //   1291	15	75	arrayOfByte29	byte[]
    //   1308	7	76	i40	int
    //   1315	10	77	i41	int
    //   1346	15	78	arrayOfByte30	byte[]
    //   1363	7	79	i42	int
    //   1370	10	80	i43	int
    //   1412	17	81	arrayOfByte31	byte[]
    //   1432	10	82	i44	int
    //   1474	17	83	arrayOfByte32	byte[]
    //   1494	10	84	i45	int
    //   1536	17	85	arrayOfByte33	byte[]
    //   1556	10	86	i46	int
    //   1599	17	87	arrayOfByte34	byte[]
    //   1619	10	88	i47	int
    //   1662	17	89	arrayOfByte35	byte[]
    //   1682	10	90	i48	int
    //   1725	17	91	arrayOfByte36	byte[]
    //   1745	10	92	i49	int
    //   1788	17	93	arrayOfByte37	byte[]
    //   1808	10	94	i50	int
    //   1851	17	95	arrayOfByte38	byte[]
    //   1871	10	96	i51	int
    //   1914	17	97	arrayOfByte39	byte[]
    //   1934	10	98	i52	int
    //   1977	17	99	arrayOfByte40	byte[]
    //   1997	10	100	i53	int
    //   2040	17	101	arrayOfByte41	byte[]
    //   2060	10	102	i54	int
    //   2103	17	103	arrayOfByte42	byte[]
    //   2123	10	104	i55	int
    //   2166	17	105	arrayOfByte43	byte[]
    //   2186	10	106	i56	int
    //   2229	17	107	arrayOfByte44	byte[]
    //   2249	10	108	i57	int
    //   2292	17	109	arrayOfByte45	byte[]
    //   2312	10	110	i58	int
    //   2355	17	111	arrayOfByte46	byte[]
    //   2375	10	112	i59	int
    //   2418	17	113	arrayOfByte47	byte[]
    //   2438	10	114	i60	int
    //   2481	17	115	arrayOfByte48	byte[]
    //   2501	10	116	i61	int
    //   2544	17	117	arrayOfByte49	byte[]
    //   2564	10	118	i62	int
    //   2607	17	119	arrayOfByte50	byte[]
    //   2627	10	120	i63	int
    //   2670	17	121	arrayOfByte51	byte[]
    //   2690	10	122	i64	int
    //   2733	17	123	arrayOfByte52	byte[]
    //   2753	10	124	i65	int
    //   2796	17	125	arrayOfByte53	byte[]
    //   2816	10	126	i66	int
    //   2859	17	127	arrayOfByte54	byte[]
    //   2879	10	128	i67	int
    //   2922	17	129	arrayOfByte55	byte[]
    //   2942	10	130	i68	int
    // Exception table:
    //   from	to	target	type
    //   98	127	2975	java/io/UnsupportedEncodingException
    //   133	167	2975	java/io/UnsupportedEncodingException
    //   173	207	2975	java/io/UnsupportedEncodingException
    //   213	247	2975	java/io/UnsupportedEncodingException
    //   253	258	2975	java/io/UnsupportedEncodingException
    //   308	342	2975	java/io/UnsupportedEncodingException
    //   348	382	2975	java/io/UnsupportedEncodingException
    //   388	422	2975	java/io/UnsupportedEncodingException
    //   428	462	2975	java/io/UnsupportedEncodingException
    //   468	473	2975	java/io/UnsupportedEncodingException
    //   523	528	2975	java/io/UnsupportedEncodingException
    //   578	612	2975	java/io/UnsupportedEncodingException
    //   618	623	2975	java/io/UnsupportedEncodingException
    //   673	678	2975	java/io/UnsupportedEncodingException
    //   728	733	2975	java/io/UnsupportedEncodingException
    //   783	817	2975	java/io/UnsupportedEncodingException
    //   823	857	2975	java/io/UnsupportedEncodingException
    //   863	868	2975	java/io/UnsupportedEncodingException
    //   918	952	2975	java/io/UnsupportedEncodingException
    //   958	963	2975	java/io/UnsupportedEncodingException
    //   1013	1047	2975	java/io/UnsupportedEncodingException
    //   1053	1058	2975	java/io/UnsupportedEncodingException
    //   1108	1142	2975	java/io/UnsupportedEncodingException
    //   1148	1182	2975	java/io/UnsupportedEncodingException
    //   1188	1222	2975	java/io/UnsupportedEncodingException
    //   1228	1262	2975	java/io/UnsupportedEncodingException
    //   1268	1273	2975	java/io/UnsupportedEncodingException
    //   1323	1328	2975	java/io/UnsupportedEncodingException
    //   1378	1383	2975	java/io/UnsupportedEncodingException
    //   1400	1434	2975	java/io/UnsupportedEncodingException
    //   1440	1445	2975	java/io/UnsupportedEncodingException
    //   1462	1496	2975	java/io/UnsupportedEncodingException
    //   1502	1507	2975	java/io/UnsupportedEncodingException
    //   1524	1558	2975	java/io/UnsupportedEncodingException
    //   1564	1569	2975	java/io/UnsupportedEncodingException
    //   1587	1621	2975	java/io/UnsupportedEncodingException
    //   1627	1632	2975	java/io/UnsupportedEncodingException
    //   1650	1684	2975	java/io/UnsupportedEncodingException
    //   1690	1695	2975	java/io/UnsupportedEncodingException
    //   1713	1747	2975	java/io/UnsupportedEncodingException
    //   1753	1758	2975	java/io/UnsupportedEncodingException
    //   1776	1810	2975	java/io/UnsupportedEncodingException
    //   1816	1821	2975	java/io/UnsupportedEncodingException
    //   1839	1873	2975	java/io/UnsupportedEncodingException
    //   1879	1884	2975	java/io/UnsupportedEncodingException
    //   1902	1936	2975	java/io/UnsupportedEncodingException
    //   1942	1947	2975	java/io/UnsupportedEncodingException
    //   1965	1999	2975	java/io/UnsupportedEncodingException
    //   2005	2010	2975	java/io/UnsupportedEncodingException
    //   2028	2062	2975	java/io/UnsupportedEncodingException
    //   2068	2073	2975	java/io/UnsupportedEncodingException
    //   2091	2125	2975	java/io/UnsupportedEncodingException
    //   2131	2136	2975	java/io/UnsupportedEncodingException
    //   2154	2188	2975	java/io/UnsupportedEncodingException
    //   2194	2199	2975	java/io/UnsupportedEncodingException
    //   2217	2251	2975	java/io/UnsupportedEncodingException
    //   2257	2262	2975	java/io/UnsupportedEncodingException
    //   2280	2314	2975	java/io/UnsupportedEncodingException
    //   2320	2325	2975	java/io/UnsupportedEncodingException
    //   2343	2377	2975	java/io/UnsupportedEncodingException
    //   2383	2388	2975	java/io/UnsupportedEncodingException
    //   2406	2440	2975	java/io/UnsupportedEncodingException
    //   2446	2451	2975	java/io/UnsupportedEncodingException
    //   2469	2503	2975	java/io/UnsupportedEncodingException
    //   2509	2514	2975	java/io/UnsupportedEncodingException
    //   2532	2566	2975	java/io/UnsupportedEncodingException
    //   2572	2577	2975	java/io/UnsupportedEncodingException
    //   2595	2629	2975	java/io/UnsupportedEncodingException
    //   2635	2640	2975	java/io/UnsupportedEncodingException
    //   2658	2692	2975	java/io/UnsupportedEncodingException
    //   2698	2703	2975	java/io/UnsupportedEncodingException
    //   2721	2755	2975	java/io/UnsupportedEncodingException
    //   2761	2766	2975	java/io/UnsupportedEncodingException
    //   2784	2818	2975	java/io/UnsupportedEncodingException
    //   2824	2829	2975	java/io/UnsupportedEncodingException
    //   2847	2881	2975	java/io/UnsupportedEncodingException
    //   2887	2892	2975	java/io/UnsupportedEncodingException
    //   2910	2944	2975	java/io/UnsupportedEncodingException
    //   2950	2955	2975	java/io/UnsupportedEncodingException
    //   264	295	2993	java/io/UnsupportedEncodingException
    //   479	510	2993	java/io/UnsupportedEncodingException
    //   534	565	2993	java/io/UnsupportedEncodingException
    //   629	660	2993	java/io/UnsupportedEncodingException
    //   684	715	2993	java/io/UnsupportedEncodingException
    //   739	770	2993	java/io/UnsupportedEncodingException
    //   874	905	2993	java/io/UnsupportedEncodingException
    //   969	1000	2993	java/io/UnsupportedEncodingException
    //   1064	1095	2993	java/io/UnsupportedEncodingException
    //   1279	1310	2993	java/io/UnsupportedEncodingException
    //   1334	1365	2993	java/io/UnsupportedEncodingException
    //   1389	1394	2993	java/io/UnsupportedEncodingException
    //   1451	1456	2993	java/io/UnsupportedEncodingException
    //   1513	1518	2993	java/io/UnsupportedEncodingException
    //   1575	1581	2993	java/io/UnsupportedEncodingException
    //   1638	1644	2993	java/io/UnsupportedEncodingException
    //   1701	1707	2993	java/io/UnsupportedEncodingException
    //   1764	1770	2993	java/io/UnsupportedEncodingException
    //   1827	1833	2993	java/io/UnsupportedEncodingException
    //   1890	1896	2993	java/io/UnsupportedEncodingException
    //   1953	1959	2993	java/io/UnsupportedEncodingException
    //   2016	2022	2993	java/io/UnsupportedEncodingException
    //   2079	2085	2993	java/io/UnsupportedEncodingException
    //   2142	2148	2993	java/io/UnsupportedEncodingException
    //   2205	2211	2993	java/io/UnsupportedEncodingException
    //   2268	2274	2993	java/io/UnsupportedEncodingException
    //   2331	2337	2993	java/io/UnsupportedEncodingException
    //   2394	2400	2993	java/io/UnsupportedEncodingException
    //   2457	2463	2993	java/io/UnsupportedEncodingException
    //   2520	2526	2993	java/io/UnsupportedEncodingException
    //   2583	2589	2993	java/io/UnsupportedEncodingException
    //   2646	2652	2993	java/io/UnsupportedEncodingException
    //   2709	2715	2993	java/io/UnsupportedEncodingException
    //   2772	2778	2993	java/io/UnsupportedEncodingException
    //   2835	2841	2993	java/io/UnsupportedEncodingException
    //   2898	2904	2993	java/io/UnsupportedEncodingException
  }
  
  /* Error */
  public static void genCrossword10()
  {
    // Byte code:
    //   0: sipush 4096
    //   3: newarray <illegal type>
    //   5: astore_0
    //   6: ldc 43
    //   8: invokevirtual 49	java/lang/String:getBytes	()[B
    //   11: astore_1
    //   12: aload_1
    //   13: iconst_0
    //   14: aload_0
    //   15: iconst_0
    //   16: aload_1
    //   17: arraylength
    //   18: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   21: aload_1
    //   22: arraylength
    //   23: istore_2
    //   24: iload_2
    //   25: iconst_1
    //   26: iadd
    //   27: istore_3
    //   28: aload_0
    //   29: iload_2
    //   30: iconst_0
    //   31: bastore
    //   32: iload_3
    //   33: iconst_1
    //   34: iadd
    //   35: istore 4
    //   37: aload_0
    //   38: iload_3
    //   39: iconst_0
    //   40: bastore
    //   41: iload 4
    //   43: iconst_1
    //   44: iadd
    //   45: istore 5
    //   47: aload_0
    //   48: iload 4
    //   50: iconst_0
    //   51: bastore
    //   52: iload 5
    //   54: iconst_1
    //   55: iadd
    //   56: istore 6
    //   58: aload_0
    //   59: iload 5
    //   61: bipush 10
    //   63: bastore
    //   64: iload 6
    //   66: iconst_1
    //   67: iadd
    //   68: istore 7
    //   70: aload_0
    //   71: iload 6
    //   73: iconst_1
    //   74: bastore
    //   75: iload 7
    //   77: iconst_1
    //   78: iadd
    //   79: istore 8
    //   81: aload_0
    //   82: iload 7
    //   84: bipush 10
    //   86: bastore
    //   87: iload 8
    //   89: iconst_1
    //   90: iadd
    //   91: istore 9
    //   93: aload_0
    //   94: iload 8
    //   96: bipush 10
    //   98: bastore
    //   99: ldc -72
    //   101: ldc 59
    //   103: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   106: astore 13
    //   108: aload 13
    //   110: iconst_0
    //   111: aload_0
    //   112: iload 9
    //   114: aload 13
    //   116: arraylength
    //   117: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   120: iload 9
    //   122: aload 13
    //   124: arraylength
    //   125: iadd
    //   126: istore 14
    //   128: iload 14
    //   130: iconst_1
    //   131: iadd
    //   132: istore 9
    //   134: aload_0
    //   135: iload 14
    //   137: iconst_0
    //   138: bastore
    //   139: ldc -70
    //   141: ldc 59
    //   143: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   146: astore 15
    //   148: aload 15
    //   150: iconst_0
    //   151: aload_0
    //   152: iload 9
    //   154: aload 15
    //   156: arraylength
    //   157: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   160: iload 9
    //   162: aload 15
    //   164: arraylength
    //   165: iadd
    //   166: istore 16
    //   168: iload 16
    //   170: iconst_1
    //   171: iadd
    //   172: istore 9
    //   174: aload_0
    //   175: iload 16
    //   177: iconst_0
    //   178: bastore
    //   179: ldc -68
    //   181: ldc 59
    //   183: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   186: astore 17
    //   188: aload 17
    //   190: iconst_0
    //   191: aload_0
    //   192: iload 9
    //   194: aload 17
    //   196: arraylength
    //   197: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   200: iload 9
    //   202: aload 17
    //   204: arraylength
    //   205: iadd
    //   206: istore 18
    //   208: iload 18
    //   210: iconst_1
    //   211: iadd
    //   212: istore 9
    //   214: aload_0
    //   215: iload 18
    //   217: iconst_0
    //   218: bastore
    //   219: ldc -66
    //   221: ldc 59
    //   223: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   226: astore 19
    //   228: aload 19
    //   230: iconst_0
    //   231: aload_0
    //   232: iload 9
    //   234: aload 19
    //   236: arraylength
    //   237: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   240: iload 9
    //   242: aload 19
    //   244: arraylength
    //   245: iadd
    //   246: istore 20
    //   248: iload 20
    //   250: iconst_1
    //   251: iadd
    //   252: istore 9
    //   254: aload_0
    //   255: iload 20
    //   257: iconst_0
    //   258: bastore
    //   259: iload 9
    //   261: iconst_1
    //   262: iadd
    //   263: istore 12
    //   265: aload_0
    //   266: iload 9
    //   268: iconst_0
    //   269: bastore
    //   270: iload 12
    //   272: iconst_1
    //   273: iadd
    //   274: istore 9
    //   276: aload_0
    //   277: iload 12
    //   279: iconst_0
    //   280: bastore
    //   281: ldc -64
    //   283: ldc 59
    //   285: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   288: astore 22
    //   290: aload 22
    //   292: iconst_0
    //   293: aload_0
    //   294: iload 9
    //   296: aload 22
    //   298: arraylength
    //   299: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   302: iload 9
    //   304: aload 22
    //   306: arraylength
    //   307: iadd
    //   308: istore 23
    //   310: iload 23
    //   312: iconst_1
    //   313: iadd
    //   314: istore 9
    //   316: aload_0
    //   317: iload 23
    //   319: iconst_0
    //   320: bastore
    //   321: iload 9
    //   323: iconst_1
    //   324: iadd
    //   325: istore 12
    //   327: aload_0
    //   328: iload 9
    //   330: iconst_0
    //   331: bastore
    //   332: iload 12
    //   334: iconst_1
    //   335: iadd
    //   336: istore 9
    //   338: aload_0
    //   339: iload 12
    //   341: iconst_0
    //   342: bastore
    //   343: ldc -62
    //   345: ldc 59
    //   347: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   350: astore 24
    //   352: aload 24
    //   354: iconst_0
    //   355: aload_0
    //   356: iload 9
    //   358: aload 24
    //   360: arraylength
    //   361: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   364: iload 9
    //   366: aload 24
    //   368: arraylength
    //   369: iadd
    //   370: istore 25
    //   372: iload 25
    //   374: iconst_1
    //   375: iadd
    //   376: istore 9
    //   378: aload_0
    //   379: iload 25
    //   381: iconst_0
    //   382: bastore
    //   383: ldc -60
    //   385: ldc 59
    //   387: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   390: astore 26
    //   392: aload 26
    //   394: iconst_0
    //   395: aload_0
    //   396: iload 9
    //   398: aload 26
    //   400: arraylength
    //   401: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   404: iload 9
    //   406: aload 26
    //   408: arraylength
    //   409: iadd
    //   410: istore 27
    //   412: iload 27
    //   414: iconst_1
    //   415: iadd
    //   416: istore 9
    //   418: aload_0
    //   419: iload 27
    //   421: iconst_0
    //   422: bastore
    //   423: iload 9
    //   425: iconst_1
    //   426: iadd
    //   427: istore 12
    //   429: aload_0
    //   430: iload 9
    //   432: iconst_0
    //   433: bastore
    //   434: iload 12
    //   436: iconst_1
    //   437: iadd
    //   438: istore 9
    //   440: aload_0
    //   441: iload 12
    //   443: iconst_0
    //   444: bastore
    //   445: iload 9
    //   447: iconst_1
    //   448: iadd
    //   449: istore 12
    //   451: aload_0
    //   452: iload 9
    //   454: iconst_0
    //   455: bastore
    //   456: ldc -58
    //   458: ldc 59
    //   460: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   463: astore 28
    //   465: aload 28
    //   467: iconst_0
    //   468: aload_0
    //   469: iload 12
    //   471: aload 28
    //   473: arraylength
    //   474: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   477: aload 28
    //   479: arraylength
    //   480: istore 29
    //   482: iload 12
    //   484: iload 29
    //   486: iadd
    //   487: istore 30
    //   489: iload 30
    //   491: iconst_1
    //   492: iadd
    //   493: istore 9
    //   495: aload_0
    //   496: iload 30
    //   498: iconst_0
    //   499: bastore
    //   500: ldc -56
    //   502: ldc 59
    //   504: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   507: astore 31
    //   509: aload 31
    //   511: iconst_0
    //   512: aload_0
    //   513: iload 9
    //   515: aload 31
    //   517: arraylength
    //   518: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   521: iload 9
    //   523: aload 31
    //   525: arraylength
    //   526: iadd
    //   527: istore 32
    //   529: iload 32
    //   531: iconst_1
    //   532: iadd
    //   533: istore 9
    //   535: aload_0
    //   536: iload 32
    //   538: iconst_0
    //   539: bastore
    //   540: iload 9
    //   542: iconst_1
    //   543: iadd
    //   544: istore 12
    //   546: aload_0
    //   547: iload 9
    //   549: iconst_0
    //   550: bastore
    //   551: ldc -54
    //   553: ldc 59
    //   555: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   558: astore 33
    //   560: aload 33
    //   562: iconst_0
    //   563: aload_0
    //   564: iload 12
    //   566: aload 33
    //   568: arraylength
    //   569: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   572: aload 33
    //   574: arraylength
    //   575: istore 34
    //   577: iload 12
    //   579: iload 34
    //   581: iadd
    //   582: istore 35
    //   584: iload 35
    //   586: iconst_1
    //   587: iadd
    //   588: istore 9
    //   590: aload_0
    //   591: iload 35
    //   593: iconst_0
    //   594: bastore
    //   595: ldc -52
    //   597: ldc 59
    //   599: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   602: astore 36
    //   604: aload 36
    //   606: iconst_0
    //   607: aload_0
    //   608: iload 9
    //   610: aload 36
    //   612: arraylength
    //   613: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   616: iload 9
    //   618: aload 36
    //   620: arraylength
    //   621: iadd
    //   622: istore 37
    //   624: iload 37
    //   626: iconst_1
    //   627: iadd
    //   628: istore 9
    //   630: aload_0
    //   631: iload 37
    //   633: iconst_0
    //   634: bastore
    //   635: ldc -50
    //   637: ldc 59
    //   639: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   642: astore 38
    //   644: aload 38
    //   646: iconst_0
    //   647: aload_0
    //   648: iload 9
    //   650: aload 38
    //   652: arraylength
    //   653: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   656: iload 9
    //   658: aload 38
    //   660: arraylength
    //   661: iadd
    //   662: istore 39
    //   664: iload 39
    //   666: iconst_1
    //   667: iadd
    //   668: istore 9
    //   670: aload_0
    //   671: iload 39
    //   673: iconst_0
    //   674: bastore
    //   675: iload 9
    //   677: iconst_1
    //   678: iadd
    //   679: istore 12
    //   681: aload_0
    //   682: iload 9
    //   684: iconst_0
    //   685: bastore
    //   686: ldc -48
    //   688: ldc 59
    //   690: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   693: astore 40
    //   695: aload 40
    //   697: iconst_0
    //   698: aload_0
    //   699: iload 12
    //   701: aload 40
    //   703: arraylength
    //   704: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   707: aload 40
    //   709: arraylength
    //   710: istore 41
    //   712: iload 12
    //   714: iload 41
    //   716: iadd
    //   717: istore 42
    //   719: iload 42
    //   721: iconst_1
    //   722: iadd
    //   723: istore 9
    //   725: aload_0
    //   726: iload 42
    //   728: iconst_0
    //   729: bastore
    //   730: iload 9
    //   732: iconst_1
    //   733: iadd
    //   734: istore 12
    //   736: aload_0
    //   737: iload 9
    //   739: iconst_0
    //   740: bastore
    //   741: ldc -46
    //   743: ldc 59
    //   745: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   748: astore 43
    //   750: aload 43
    //   752: iconst_0
    //   753: aload_0
    //   754: iload 12
    //   756: aload 43
    //   758: arraylength
    //   759: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   762: aload 43
    //   764: arraylength
    //   765: istore 44
    //   767: iload 12
    //   769: iload 44
    //   771: iadd
    //   772: istore 45
    //   774: iload 45
    //   776: iconst_1
    //   777: iadd
    //   778: istore 9
    //   780: aload_0
    //   781: iload 45
    //   783: iconst_0
    //   784: bastore
    //   785: iload 9
    //   787: iconst_1
    //   788: iadd
    //   789: istore 12
    //   791: aload_0
    //   792: iload 9
    //   794: iconst_0
    //   795: bastore
    //   796: ldc -44
    //   798: ldc 59
    //   800: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   803: astore 46
    //   805: aload 46
    //   807: iconst_0
    //   808: aload_0
    //   809: iload 12
    //   811: aload 46
    //   813: arraylength
    //   814: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   817: aload 46
    //   819: arraylength
    //   820: istore 47
    //   822: iload 12
    //   824: iload 47
    //   826: iadd
    //   827: istore 48
    //   829: iload 48
    //   831: iconst_1
    //   832: iadd
    //   833: istore 9
    //   835: aload_0
    //   836: iload 48
    //   838: iconst_0
    //   839: bastore
    //   840: ldc -42
    //   842: ldc 59
    //   844: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   847: astore 49
    //   849: aload 49
    //   851: iconst_0
    //   852: aload_0
    //   853: iload 9
    //   855: aload 49
    //   857: arraylength
    //   858: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   861: iload 9
    //   863: aload 49
    //   865: arraylength
    //   866: iadd
    //   867: istore 50
    //   869: iload 50
    //   871: iconst_1
    //   872: iadd
    //   873: istore 9
    //   875: aload_0
    //   876: iload 50
    //   878: iconst_0
    //   879: bastore
    //   880: iload 9
    //   882: iconst_1
    //   883: iadd
    //   884: istore 12
    //   886: aload_0
    //   887: iload 9
    //   889: iconst_0
    //   890: bastore
    //   891: ldc -56
    //   893: ldc 59
    //   895: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   898: astore 51
    //   900: aload 51
    //   902: iconst_0
    //   903: aload_0
    //   904: iload 12
    //   906: aload 51
    //   908: arraylength
    //   909: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   912: aload 51
    //   914: arraylength
    //   915: istore 52
    //   917: iload 12
    //   919: iload 52
    //   921: iadd
    //   922: istore 53
    //   924: iload 53
    //   926: iconst_1
    //   927: iadd
    //   928: istore 9
    //   930: aload_0
    //   931: iload 53
    //   933: iconst_0
    //   934: bastore
    //   935: ldc -40
    //   937: ldc 59
    //   939: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   942: astore 54
    //   944: aload 54
    //   946: iconst_0
    //   947: aload_0
    //   948: iload 9
    //   950: aload 54
    //   952: arraylength
    //   953: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   956: iload 9
    //   958: aload 54
    //   960: arraylength
    //   961: iadd
    //   962: istore 55
    //   964: iload 55
    //   966: iconst_1
    //   967: iadd
    //   968: istore 9
    //   970: aload_0
    //   971: iload 55
    //   973: iconst_0
    //   974: bastore
    //   975: ldc -38
    //   977: ldc 59
    //   979: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   982: astore 56
    //   984: aload 56
    //   986: iconst_0
    //   987: aload_0
    //   988: iload 9
    //   990: aload 56
    //   992: arraylength
    //   993: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   996: iload 9
    //   998: aload 56
    //   1000: arraylength
    //   1001: iadd
    //   1002: istore 57
    //   1004: iload 57
    //   1006: iconst_1
    //   1007: iadd
    //   1008: istore 9
    //   1010: aload_0
    //   1011: iload 57
    //   1013: iconst_0
    //   1014: bastore
    //   1015: ldc -44
    //   1017: ldc 59
    //   1019: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1022: astore 58
    //   1024: aload 58
    //   1026: iconst_0
    //   1027: aload_0
    //   1028: iload 9
    //   1030: aload 58
    //   1032: arraylength
    //   1033: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1036: iload 9
    //   1038: aload 58
    //   1040: arraylength
    //   1041: iadd
    //   1042: istore 59
    //   1044: iload 59
    //   1046: iconst_1
    //   1047: iadd
    //   1048: istore 9
    //   1050: aload_0
    //   1051: iload 59
    //   1053: iconst_0
    //   1054: bastore
    //   1055: iload 9
    //   1057: iconst_1
    //   1058: iadd
    //   1059: istore 12
    //   1061: aload_0
    //   1062: iload 9
    //   1064: iconst_0
    //   1065: bastore
    //   1066: ldc -36
    //   1068: ldc 59
    //   1070: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1073: astore 60
    //   1075: aload 60
    //   1077: iconst_0
    //   1078: aload_0
    //   1079: iload 12
    //   1081: aload 60
    //   1083: arraylength
    //   1084: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1087: aload 60
    //   1089: arraylength
    //   1090: istore 61
    //   1092: iload 12
    //   1094: iload 61
    //   1096: iadd
    //   1097: istore 62
    //   1099: iload 62
    //   1101: iconst_1
    //   1102: iadd
    //   1103: istore 9
    //   1105: aload_0
    //   1106: iload 62
    //   1108: iconst_0
    //   1109: bastore
    //   1110: iload 9
    //   1112: iconst_1
    //   1113: iadd
    //   1114: istore 12
    //   1116: aload_0
    //   1117: iload 9
    //   1119: iconst_0
    //   1120: bastore
    //   1121: ldc -34
    //   1123: ldc 59
    //   1125: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1128: astore 63
    //   1130: aload 63
    //   1132: iconst_0
    //   1133: aload_0
    //   1134: iload 12
    //   1136: aload 63
    //   1138: arraylength
    //   1139: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1142: aload 63
    //   1144: arraylength
    //   1145: istore 64
    //   1147: iload 12
    //   1149: iload 64
    //   1151: iadd
    //   1152: istore 65
    //   1154: iload 65
    //   1156: iconst_1
    //   1157: iadd
    //   1158: istore 9
    //   1160: aload_0
    //   1161: iload 65
    //   1163: iconst_0
    //   1164: bastore
    //   1165: ldc -32
    //   1167: ldc 59
    //   1169: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1172: astore 66
    //   1174: aload 66
    //   1176: iconst_0
    //   1177: aload_0
    //   1178: iload 9
    //   1180: aload 66
    //   1182: arraylength
    //   1183: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1186: iload 9
    //   1188: aload 66
    //   1190: arraylength
    //   1191: iadd
    //   1192: istore 67
    //   1194: iload 67
    //   1196: iconst_1
    //   1197: iadd
    //   1198: istore 9
    //   1200: aload_0
    //   1201: iload 67
    //   1203: iconst_0
    //   1204: bastore
    //   1205: iload 9
    //   1207: iconst_1
    //   1208: iadd
    //   1209: istore 12
    //   1211: aload_0
    //   1212: iload 9
    //   1214: iconst_0
    //   1215: bastore
    //   1216: ldc -30
    //   1218: ldc 59
    //   1220: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1223: astore 68
    //   1225: aload 68
    //   1227: iconst_0
    //   1228: aload_0
    //   1229: iload 12
    //   1231: aload 68
    //   1233: arraylength
    //   1234: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1237: aload 68
    //   1239: arraylength
    //   1240: istore 69
    //   1242: iload 12
    //   1244: iload 69
    //   1246: iadd
    //   1247: istore 70
    //   1249: iload 70
    //   1251: iconst_1
    //   1252: iadd
    //   1253: istore 9
    //   1255: aload_0
    //   1256: iload 70
    //   1258: iconst_0
    //   1259: bastore
    //   1260: iload 9
    //   1262: iconst_1
    //   1263: iadd
    //   1264: istore 12
    //   1266: aload_0
    //   1267: iload 9
    //   1269: iconst_1
    //   1270: bastore
    //   1271: ldc -28
    //   1273: ldc 59
    //   1275: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1278: astore 71
    //   1280: aload 71
    //   1282: iconst_0
    //   1283: aload_0
    //   1284: iload 12
    //   1286: aload 71
    //   1288: arraylength
    //   1289: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1292: aload 71
    //   1294: arraylength
    //   1295: istore 72
    //   1297: iload 12
    //   1299: iload 72
    //   1301: iadd
    //   1302: istore 73
    //   1304: iload 73
    //   1306: iconst_1
    //   1307: iadd
    //   1308: istore 9
    //   1310: aload_0
    //   1311: iload 73
    //   1313: iconst_0
    //   1314: bastore
    //   1315: iload 9
    //   1317: iconst_1
    //   1318: iadd
    //   1319: istore 12
    //   1321: aload_0
    //   1322: iload 9
    //   1324: iconst_0
    //   1325: bastore
    //   1326: iload 12
    //   1328: iconst_1
    //   1329: iadd
    //   1330: istore 9
    //   1332: aload_0
    //   1333: iload 12
    //   1335: iconst_2
    //   1336: bastore
    //   1337: ldc -26
    //   1339: ldc 59
    //   1341: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1344: astore 74
    //   1346: aload 74
    //   1348: iconst_0
    //   1349: aload_0
    //   1350: iload 9
    //   1352: aload 74
    //   1354: arraylength
    //   1355: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1358: iload 9
    //   1360: aload 74
    //   1362: arraylength
    //   1363: iadd
    //   1364: istore 75
    //   1366: iload 75
    //   1368: iconst_1
    //   1369: iadd
    //   1370: istore 9
    //   1372: aload_0
    //   1373: iload 75
    //   1375: iconst_0
    //   1376: bastore
    //   1377: iload 9
    //   1379: iconst_1
    //   1380: iadd
    //   1381: istore 12
    //   1383: aload_0
    //   1384: iload 9
    //   1386: iconst_2
    //   1387: bastore
    //   1388: iload 12
    //   1390: iconst_1
    //   1391: iadd
    //   1392: istore 9
    //   1394: aload_0
    //   1395: iload 12
    //   1397: iconst_2
    //   1398: bastore
    //   1399: ldc -24
    //   1401: ldc 59
    //   1403: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1406: astore 76
    //   1408: aload 76
    //   1410: iconst_0
    //   1411: aload_0
    //   1412: iload 9
    //   1414: aload 76
    //   1416: arraylength
    //   1417: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1420: iload 9
    //   1422: aload 76
    //   1424: arraylength
    //   1425: iadd
    //   1426: istore 77
    //   1428: iload 77
    //   1430: iconst_1
    //   1431: iadd
    //   1432: istore 9
    //   1434: aload_0
    //   1435: iload 77
    //   1437: iconst_0
    //   1438: bastore
    //   1439: iload 9
    //   1441: iconst_1
    //   1442: iadd
    //   1443: istore 12
    //   1445: aload_0
    //   1446: iload 9
    //   1448: bipush 6
    //   1450: bastore
    //   1451: iload 12
    //   1453: iconst_1
    //   1454: iadd
    //   1455: istore 9
    //   1457: aload_0
    //   1458: iload 12
    //   1460: iconst_2
    //   1461: bastore
    //   1462: ldc -22
    //   1464: ldc 59
    //   1466: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1469: astore 78
    //   1471: aload 78
    //   1473: iconst_0
    //   1474: aload_0
    //   1475: iload 9
    //   1477: aload 78
    //   1479: arraylength
    //   1480: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1483: iload 9
    //   1485: aload 78
    //   1487: arraylength
    //   1488: iadd
    //   1489: istore 79
    //   1491: iload 79
    //   1493: iconst_1
    //   1494: iadd
    //   1495: istore 9
    //   1497: aload_0
    //   1498: iload 79
    //   1500: iconst_0
    //   1501: bastore
    //   1502: iload 9
    //   1504: iconst_1
    //   1505: iadd
    //   1506: istore 12
    //   1508: aload_0
    //   1509: iload 9
    //   1511: bipush 8
    //   1513: bastore
    //   1514: iload 12
    //   1516: iconst_1
    //   1517: iadd
    //   1518: istore 9
    //   1520: aload_0
    //   1521: iload 12
    //   1523: iconst_2
    //   1524: bastore
    //   1525: ldc -20
    //   1527: ldc 59
    //   1529: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1532: astore 80
    //   1534: aload 80
    //   1536: iconst_0
    //   1537: aload_0
    //   1538: iload 9
    //   1540: aload 80
    //   1542: arraylength
    //   1543: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1546: iload 9
    //   1548: aload 80
    //   1550: arraylength
    //   1551: iadd
    //   1552: istore 81
    //   1554: iload 81
    //   1556: iconst_1
    //   1557: iadd
    //   1558: istore 9
    //   1560: aload_0
    //   1561: iload 81
    //   1563: iconst_0
    //   1564: bastore
    //   1565: iload 9
    //   1567: iconst_1
    //   1568: iadd
    //   1569: istore 12
    //   1571: aload_0
    //   1572: iload 9
    //   1574: bipush 16
    //   1576: bastore
    //   1577: iload 12
    //   1579: iconst_1
    //   1580: iadd
    //   1581: istore 9
    //   1583: aload_0
    //   1584: iload 12
    //   1586: iconst_1
    //   1587: bastore
    //   1588: ldc -18
    //   1590: ldc 59
    //   1592: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1595: astore 82
    //   1597: aload 82
    //   1599: iconst_0
    //   1600: aload_0
    //   1601: iload 9
    //   1603: aload 82
    //   1605: arraylength
    //   1606: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1609: iload 9
    //   1611: aload 82
    //   1613: arraylength
    //   1614: iadd
    //   1615: istore 83
    //   1617: iload 83
    //   1619: iconst_1
    //   1620: iadd
    //   1621: istore 9
    //   1623: aload_0
    //   1624: iload 83
    //   1626: iconst_0
    //   1627: bastore
    //   1628: iload 9
    //   1630: iconst_1
    //   1631: iadd
    //   1632: istore 12
    //   1634: aload_0
    //   1635: iload 9
    //   1637: bipush 20
    //   1639: bastore
    //   1640: iload 12
    //   1642: iconst_1
    //   1643: iadd
    //   1644: istore 9
    //   1646: aload_0
    //   1647: iload 12
    //   1649: iconst_1
    //   1650: bastore
    //   1651: ldc -16
    //   1653: ldc 59
    //   1655: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1658: astore 84
    //   1660: aload 84
    //   1662: iconst_0
    //   1663: aload_0
    //   1664: iload 9
    //   1666: aload 84
    //   1668: arraylength
    //   1669: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1672: iload 9
    //   1674: aload 84
    //   1676: arraylength
    //   1677: iadd
    //   1678: istore 85
    //   1680: iload 85
    //   1682: iconst_1
    //   1683: iadd
    //   1684: istore 9
    //   1686: aload_0
    //   1687: iload 85
    //   1689: iconst_0
    //   1690: bastore
    //   1691: iload 9
    //   1693: iconst_1
    //   1694: iadd
    //   1695: istore 12
    //   1697: aload_0
    //   1698: iload 9
    //   1700: bipush 35
    //   1702: bastore
    //   1703: iload 12
    //   1705: iconst_1
    //   1706: iadd
    //   1707: istore 9
    //   1709: aload_0
    //   1710: iload 12
    //   1712: iconst_1
    //   1713: bastore
    //   1714: ldc -14
    //   1716: ldc 59
    //   1718: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1721: astore 86
    //   1723: aload 86
    //   1725: iconst_0
    //   1726: aload_0
    //   1727: iload 9
    //   1729: aload 86
    //   1731: arraylength
    //   1732: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1735: iload 9
    //   1737: aload 86
    //   1739: arraylength
    //   1740: iadd
    //   1741: istore 87
    //   1743: iload 87
    //   1745: iconst_1
    //   1746: iadd
    //   1747: istore 9
    //   1749: aload_0
    //   1750: iload 87
    //   1752: iconst_0
    //   1753: bastore
    //   1754: iload 9
    //   1756: iconst_1
    //   1757: iadd
    //   1758: istore 12
    //   1760: aload_0
    //   1761: iload 9
    //   1763: bipush 35
    //   1765: bastore
    //   1766: iload 12
    //   1768: iconst_1
    //   1769: iadd
    //   1770: istore 9
    //   1772: aload_0
    //   1773: iload 12
    //   1775: iconst_2
    //   1776: bastore
    //   1777: ldc -12
    //   1779: ldc 59
    //   1781: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1784: astore 88
    //   1786: aload 88
    //   1788: iconst_0
    //   1789: aload_0
    //   1790: iload 9
    //   1792: aload 88
    //   1794: arraylength
    //   1795: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1798: iload 9
    //   1800: aload 88
    //   1802: arraylength
    //   1803: iadd
    //   1804: istore 89
    //   1806: iload 89
    //   1808: iconst_1
    //   1809: iadd
    //   1810: istore 9
    //   1812: aload_0
    //   1813: iload 89
    //   1815: iconst_0
    //   1816: bastore
    //   1817: iload 9
    //   1819: iconst_1
    //   1820: iadd
    //   1821: istore 12
    //   1823: aload_0
    //   1824: iload 9
    //   1826: bipush 40
    //   1828: bastore
    //   1829: iload 12
    //   1831: iconst_1
    //   1832: iadd
    //   1833: istore 9
    //   1835: aload_0
    //   1836: iload 12
    //   1838: iconst_1
    //   1839: bastore
    //   1840: ldc -10
    //   1842: ldc 59
    //   1844: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1847: astore 90
    //   1849: aload 90
    //   1851: iconst_0
    //   1852: aload_0
    //   1853: iload 9
    //   1855: aload 90
    //   1857: arraylength
    //   1858: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1861: iload 9
    //   1863: aload 90
    //   1865: arraylength
    //   1866: iadd
    //   1867: istore 91
    //   1869: iload 91
    //   1871: iconst_1
    //   1872: iadd
    //   1873: istore 9
    //   1875: aload_0
    //   1876: iload 91
    //   1878: iconst_0
    //   1879: bastore
    //   1880: iload 9
    //   1882: iconst_1
    //   1883: iadd
    //   1884: istore 12
    //   1886: aload_0
    //   1887: iload 9
    //   1889: bipush 42
    //   1891: bastore
    //   1892: iload 12
    //   1894: iconst_1
    //   1895: iadd
    //   1896: istore 9
    //   1898: aload_0
    //   1899: iload 12
    //   1901: iconst_2
    //   1902: bastore
    //   1903: ldc -8
    //   1905: ldc 59
    //   1907: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1910: astore 92
    //   1912: aload 92
    //   1914: iconst_0
    //   1915: aload_0
    //   1916: iload 9
    //   1918: aload 92
    //   1920: arraylength
    //   1921: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1924: iload 9
    //   1926: aload 92
    //   1928: arraylength
    //   1929: iadd
    //   1930: istore 93
    //   1932: iload 93
    //   1934: iconst_1
    //   1935: iadd
    //   1936: istore 9
    //   1938: aload_0
    //   1939: iload 93
    //   1941: iconst_0
    //   1942: bastore
    //   1943: iload 9
    //   1945: iconst_1
    //   1946: iadd
    //   1947: istore 12
    //   1949: aload_0
    //   1950: iload 9
    //   1952: bipush 55
    //   1954: bastore
    //   1955: iload 12
    //   1957: iconst_1
    //   1958: iadd
    //   1959: istore 9
    //   1961: aload_0
    //   1962: iload 12
    //   1964: iconst_1
    //   1965: bastore
    //   1966: ldc -6
    //   1968: ldc 59
    //   1970: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1973: astore 94
    //   1975: aload 94
    //   1977: iconst_0
    //   1978: aload_0
    //   1979: iload 9
    //   1981: aload 94
    //   1983: arraylength
    //   1984: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1987: iload 9
    //   1989: aload 94
    //   1991: arraylength
    //   1992: iadd
    //   1993: istore 95
    //   1995: iload 95
    //   1997: iconst_1
    //   1998: iadd
    //   1999: istore 9
    //   2001: aload_0
    //   2002: iload 95
    //   2004: iconst_0
    //   2005: bastore
    //   2006: iload 9
    //   2008: iconst_1
    //   2009: iadd
    //   2010: istore 12
    //   2012: aload_0
    //   2013: iload 9
    //   2015: bipush 57
    //   2017: bastore
    //   2018: iload 12
    //   2020: iconst_1
    //   2021: iadd
    //   2022: istore 9
    //   2024: aload_0
    //   2025: iload 12
    //   2027: iconst_2
    //   2028: bastore
    //   2029: ldc -4
    //   2031: ldc 59
    //   2033: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2036: astore 96
    //   2038: aload 96
    //   2040: iconst_0
    //   2041: aload_0
    //   2042: iload 9
    //   2044: aload 96
    //   2046: arraylength
    //   2047: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2050: iload 9
    //   2052: aload 96
    //   2054: arraylength
    //   2055: iadd
    //   2056: istore 97
    //   2058: iload 97
    //   2060: iconst_1
    //   2061: iadd
    //   2062: istore 9
    //   2064: aload_0
    //   2065: iload 97
    //   2067: iconst_0
    //   2068: bastore
    //   2069: iload 9
    //   2071: iconst_1
    //   2072: iadd
    //   2073: istore 12
    //   2075: aload_0
    //   2076: iload 9
    //   2078: bipush 60
    //   2080: bastore
    //   2081: iload 12
    //   2083: iconst_1
    //   2084: iadd
    //   2085: istore 9
    //   2087: aload_0
    //   2088: iload 12
    //   2090: iconst_1
    //   2091: bastore
    //   2092: ldc -2
    //   2094: ldc 59
    //   2096: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2099: astore 98
    //   2101: aload 98
    //   2103: iconst_0
    //   2104: aload_0
    //   2105: iload 9
    //   2107: aload 98
    //   2109: arraylength
    //   2110: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2113: iload 9
    //   2115: aload 98
    //   2117: arraylength
    //   2118: iadd
    //   2119: istore 99
    //   2121: iload 99
    //   2123: iconst_1
    //   2124: iadd
    //   2125: istore 9
    //   2127: aload_0
    //   2128: iload 99
    //   2130: iconst_0
    //   2131: bastore
    //   2132: iload 9
    //   2134: iconst_1
    //   2135: iadd
    //   2136: istore 12
    //   2138: aload_0
    //   2139: iload 9
    //   2141: bipush 64
    //   2143: bastore
    //   2144: iload 12
    //   2146: iconst_1
    //   2147: iadd
    //   2148: istore 9
    //   2150: aload_0
    //   2151: iload 12
    //   2153: iconst_2
    //   2154: bastore
    //   2155: ldc_w 256
    //   2158: ldc 59
    //   2160: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2163: astore 100
    //   2165: aload 100
    //   2167: iconst_0
    //   2168: aload_0
    //   2169: iload 9
    //   2171: aload 100
    //   2173: arraylength
    //   2174: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2177: iload 9
    //   2179: aload 100
    //   2181: arraylength
    //   2182: iadd
    //   2183: istore 101
    //   2185: iload 101
    //   2187: iconst_1
    //   2188: iadd
    //   2189: istore 9
    //   2191: aload_0
    //   2192: iload 101
    //   2194: iconst_0
    //   2195: bastore
    //   2196: iload 9
    //   2198: iconst_1
    //   2199: iadd
    //   2200: istore 12
    //   2202: aload_0
    //   2203: iload 9
    //   2205: bipush 69
    //   2207: bastore
    //   2208: iload 12
    //   2210: iconst_1
    //   2211: iadd
    //   2212: istore 9
    //   2214: aload_0
    //   2215: iload 12
    //   2217: iconst_2
    //   2218: bastore
    //   2219: ldc_w 258
    //   2222: ldc 59
    //   2224: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2227: astore 102
    //   2229: aload 102
    //   2231: iconst_0
    //   2232: aload_0
    //   2233: iload 9
    //   2235: aload 102
    //   2237: arraylength
    //   2238: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2241: iload 9
    //   2243: aload 102
    //   2245: arraylength
    //   2246: iadd
    //   2247: istore 103
    //   2249: iload 103
    //   2251: iconst_1
    //   2252: iadd
    //   2253: istore 9
    //   2255: aload_0
    //   2256: iload 103
    //   2258: iconst_0
    //   2259: bastore
    //   2260: iload 9
    //   2262: iconst_1
    //   2263: iadd
    //   2264: istore 12
    //   2266: aload_0
    //   2267: iload 9
    //   2269: bipush 74
    //   2271: bastore
    //   2272: iload 12
    //   2274: iconst_1
    //   2275: iadd
    //   2276: istore 9
    //   2278: aload_0
    //   2279: iload 12
    //   2281: iconst_1
    //   2282: bastore
    //   2283: ldc_w 260
    //   2286: ldc 59
    //   2288: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2291: astore 104
    //   2293: aload 104
    //   2295: iconst_0
    //   2296: aload_0
    //   2297: iload 9
    //   2299: aload 104
    //   2301: arraylength
    //   2302: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2305: iload 9
    //   2307: aload 104
    //   2309: arraylength
    //   2310: iadd
    //   2311: istore 105
    //   2313: iload 105
    //   2315: iconst_1
    //   2316: iadd
    //   2317: istore 9
    //   2319: aload_0
    //   2320: iload 105
    //   2322: iconst_0
    //   2323: bastore
    //   2324: iload 9
    //   2326: iconst_1
    //   2327: iadd
    //   2328: istore 12
    //   2330: aload_0
    //   2331: iload 9
    //   2333: bipush 81
    //   2335: bastore
    //   2336: iload 12
    //   2338: iconst_1
    //   2339: iadd
    //   2340: istore 9
    //   2342: aload_0
    //   2343: iload 12
    //   2345: iconst_2
    //   2346: bastore
    //   2347: ldc_w 262
    //   2350: ldc 59
    //   2352: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2355: astore 106
    //   2357: aload 106
    //   2359: iconst_0
    //   2360: aload_0
    //   2361: iload 9
    //   2363: aload 106
    //   2365: arraylength
    //   2366: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2369: iload 9
    //   2371: aload 106
    //   2373: arraylength
    //   2374: iadd
    //   2375: istore 107
    //   2377: iload 107
    //   2379: iconst_1
    //   2380: iadd
    //   2381: istore 9
    //   2383: aload_0
    //   2384: iload 107
    //   2386: iconst_0
    //   2387: bastore
    //   2388: iload 9
    //   2390: iconst_1
    //   2391: iadd
    //   2392: istore 12
    //   2394: aload_0
    //   2395: iload 9
    //   2397: bipush 90
    //   2399: bastore
    //   2400: iload 12
    //   2402: iconst_1
    //   2403: iadd
    //   2404: istore 9
    //   2406: aload_0
    //   2407: iload 12
    //   2409: iconst_1
    //   2410: bastore
    //   2411: ldc_w 264
    //   2414: ldc 59
    //   2416: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2419: astore 108
    //   2421: aload 108
    //   2423: iconst_0
    //   2424: aload_0
    //   2425: iload 9
    //   2427: aload 108
    //   2429: arraylength
    //   2430: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2433: iload 9
    //   2435: aload 108
    //   2437: arraylength
    //   2438: iadd
    //   2439: istore 109
    //   2441: iload 109
    //   2443: iconst_1
    //   2444: iadd
    //   2445: istore 9
    //   2447: aload_0
    //   2448: iload 109
    //   2450: iconst_0
    //   2451: bastore
    //   2452: iload 9
    //   2454: iconst_1
    //   2455: iadd
    //   2456: istore 12
    //   2458: aload_0
    //   2459: iload 9
    //   2461: bipush 97
    //   2463: bastore
    //   2464: iload 12
    //   2466: iconst_1
    //   2467: iadd
    //   2468: istore 9
    //   2470: aload_0
    //   2471: iload 12
    //   2473: iconst_1
    //   2474: bastore
    //   2475: ldc_w 266
    //   2478: ldc 59
    //   2480: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2483: astore 110
    //   2485: aload 110
    //   2487: iconst_0
    //   2488: aload_0
    //   2489: iload 9
    //   2491: aload 110
    //   2493: arraylength
    //   2494: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2497: iload 9
    //   2499: aload 110
    //   2501: arraylength
    //   2502: iadd
    //   2503: istore 111
    //   2505: iload 111
    //   2507: iconst_1
    //   2508: iadd
    //   2509: istore 9
    //   2511: aload_0
    //   2512: iload 111
    //   2514: iconst_0
    //   2515: bastore
    //   2516: iload 9
    //   2518: istore 12
    //   2520: new 168	java/io/File
    //   2523: dup
    //   2524: ldc_w 268
    //   2527: invokespecial 173	java/io/File:<init>	(Ljava/lang/String;)V
    //   2530: aload_0
    //   2531: iload 12
    //   2533: invokestatic 179	net/oicp/anya/Utils:writeBytes2File	(Ljava/io/File;[BI)V
    //   2536: return
    //   2537: astore 10
    //   2539: aload 10
    //   2541: astore 11
    //   2543: iload 9
    //   2545: istore 12
    //   2547: aload 11
    //   2549: invokevirtual 182	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   2552: goto -32 -> 2520
    //   2555: astore 21
    //   2557: aload 21
    //   2559: astore 11
    //   2561: goto -14 -> 2547
    // Local variable table:
    //   start	length	slot	name	signature
    //   5	2526	0	arrayOfByte1	byte[]
    //   11	11	1	arrayOfByte2	byte[]
    //   23	7	2	i	int
    //   27	12	3	j	int
    //   35	14	4	k	int
    //   45	15	5	m	int
    //   56	16	6	n	int
    //   68	15	7	i1	int
    //   79	16	8	i2	int
    //   91	2453	9	i3	int
    //   2537	3	10	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   2541	19	11	localObject	Object
    //   263	2283	12	i4	int
    //   106	17	13	arrayOfByte3	byte[]
    //   126	10	14	i5	int
    //   146	17	15	arrayOfByte4	byte[]
    //   166	10	16	i6	int
    //   186	17	17	arrayOfByte5	byte[]
    //   206	10	18	i7	int
    //   226	17	19	arrayOfByte6	byte[]
    //   246	10	20	i8	int
    //   2555	3	21	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   288	17	22	arrayOfByte7	byte[]
    //   308	10	23	i9	int
    //   350	17	24	arrayOfByte8	byte[]
    //   370	10	25	i10	int
    //   390	17	26	arrayOfByte9	byte[]
    //   410	10	27	i11	int
    //   463	15	28	arrayOfByte10	byte[]
    //   480	7	29	i12	int
    //   487	10	30	i13	int
    //   507	17	31	arrayOfByte11	byte[]
    //   527	10	32	i14	int
    //   558	15	33	arrayOfByte12	byte[]
    //   575	7	34	i15	int
    //   582	10	35	i16	int
    //   602	17	36	arrayOfByte13	byte[]
    //   622	10	37	i17	int
    //   642	17	38	arrayOfByte14	byte[]
    //   662	10	39	i18	int
    //   693	15	40	arrayOfByte15	byte[]
    //   710	7	41	i19	int
    //   717	10	42	i20	int
    //   748	15	43	arrayOfByte16	byte[]
    //   765	7	44	i21	int
    //   772	10	45	i22	int
    //   803	15	46	arrayOfByte17	byte[]
    //   820	7	47	i23	int
    //   827	10	48	i24	int
    //   847	17	49	arrayOfByte18	byte[]
    //   867	10	50	i25	int
    //   898	15	51	arrayOfByte19	byte[]
    //   915	7	52	i26	int
    //   922	10	53	i27	int
    //   942	17	54	arrayOfByte20	byte[]
    //   962	10	55	i28	int
    //   982	17	56	arrayOfByte21	byte[]
    //   1002	10	57	i29	int
    //   1022	17	58	arrayOfByte22	byte[]
    //   1042	10	59	i30	int
    //   1073	15	60	arrayOfByte23	byte[]
    //   1090	7	61	i31	int
    //   1097	10	62	i32	int
    //   1128	15	63	arrayOfByte24	byte[]
    //   1145	7	64	i33	int
    //   1152	10	65	i34	int
    //   1172	17	66	arrayOfByte25	byte[]
    //   1192	10	67	i35	int
    //   1223	15	68	arrayOfByte26	byte[]
    //   1240	7	69	i36	int
    //   1247	10	70	i37	int
    //   1278	15	71	arrayOfByte27	byte[]
    //   1295	7	72	i38	int
    //   1302	10	73	i39	int
    //   1344	17	74	arrayOfByte28	byte[]
    //   1364	10	75	i40	int
    //   1406	17	76	arrayOfByte29	byte[]
    //   1426	10	77	i41	int
    //   1469	17	78	arrayOfByte30	byte[]
    //   1489	10	79	i42	int
    //   1532	17	80	arrayOfByte31	byte[]
    //   1552	10	81	i43	int
    //   1595	17	82	arrayOfByte32	byte[]
    //   1615	10	83	i44	int
    //   1658	17	84	arrayOfByte33	byte[]
    //   1678	10	85	i45	int
    //   1721	17	86	arrayOfByte34	byte[]
    //   1741	10	87	i46	int
    //   1784	17	88	arrayOfByte35	byte[]
    //   1804	10	89	i47	int
    //   1847	17	90	arrayOfByte36	byte[]
    //   1867	10	91	i48	int
    //   1910	17	92	arrayOfByte37	byte[]
    //   1930	10	93	i49	int
    //   1973	17	94	arrayOfByte38	byte[]
    //   1993	10	95	i50	int
    //   2036	17	96	arrayOfByte39	byte[]
    //   2056	10	97	i51	int
    //   2099	17	98	arrayOfByte40	byte[]
    //   2119	10	99	i52	int
    //   2163	17	100	arrayOfByte41	byte[]
    //   2183	10	101	i53	int
    //   2227	17	102	arrayOfByte42	byte[]
    //   2247	10	103	i54	int
    //   2291	17	104	arrayOfByte43	byte[]
    //   2311	10	105	i55	int
    //   2355	17	106	arrayOfByte44	byte[]
    //   2375	10	107	i56	int
    //   2419	17	108	arrayOfByte45	byte[]
    //   2439	10	109	i57	int
    //   2483	17	110	arrayOfByte46	byte[]
    //   2503	10	111	i58	int
    // Exception table:
    //   from	to	target	type
    //   99	128	2537	java/io/UnsupportedEncodingException
    //   134	168	2537	java/io/UnsupportedEncodingException
    //   174	208	2537	java/io/UnsupportedEncodingException
    //   214	248	2537	java/io/UnsupportedEncodingException
    //   254	259	2537	java/io/UnsupportedEncodingException
    //   276	310	2537	java/io/UnsupportedEncodingException
    //   316	321	2537	java/io/UnsupportedEncodingException
    //   338	372	2537	java/io/UnsupportedEncodingException
    //   378	412	2537	java/io/UnsupportedEncodingException
    //   418	423	2537	java/io/UnsupportedEncodingException
    //   440	445	2537	java/io/UnsupportedEncodingException
    //   495	529	2537	java/io/UnsupportedEncodingException
    //   535	540	2537	java/io/UnsupportedEncodingException
    //   590	624	2537	java/io/UnsupportedEncodingException
    //   630	664	2537	java/io/UnsupportedEncodingException
    //   670	675	2537	java/io/UnsupportedEncodingException
    //   725	730	2537	java/io/UnsupportedEncodingException
    //   780	785	2537	java/io/UnsupportedEncodingException
    //   835	869	2537	java/io/UnsupportedEncodingException
    //   875	880	2537	java/io/UnsupportedEncodingException
    //   930	964	2537	java/io/UnsupportedEncodingException
    //   970	1004	2537	java/io/UnsupportedEncodingException
    //   1010	1044	2537	java/io/UnsupportedEncodingException
    //   1050	1055	2537	java/io/UnsupportedEncodingException
    //   1105	1110	2537	java/io/UnsupportedEncodingException
    //   1160	1194	2537	java/io/UnsupportedEncodingException
    //   1200	1205	2537	java/io/UnsupportedEncodingException
    //   1255	1260	2537	java/io/UnsupportedEncodingException
    //   1310	1315	2537	java/io/UnsupportedEncodingException
    //   1332	1366	2537	java/io/UnsupportedEncodingException
    //   1372	1377	2537	java/io/UnsupportedEncodingException
    //   1394	1428	2537	java/io/UnsupportedEncodingException
    //   1434	1439	2537	java/io/UnsupportedEncodingException
    //   1457	1491	2537	java/io/UnsupportedEncodingException
    //   1497	1502	2537	java/io/UnsupportedEncodingException
    //   1520	1554	2537	java/io/UnsupportedEncodingException
    //   1560	1565	2537	java/io/UnsupportedEncodingException
    //   1583	1617	2537	java/io/UnsupportedEncodingException
    //   1623	1628	2537	java/io/UnsupportedEncodingException
    //   1646	1680	2537	java/io/UnsupportedEncodingException
    //   1686	1691	2537	java/io/UnsupportedEncodingException
    //   1709	1743	2537	java/io/UnsupportedEncodingException
    //   1749	1754	2537	java/io/UnsupportedEncodingException
    //   1772	1806	2537	java/io/UnsupportedEncodingException
    //   1812	1817	2537	java/io/UnsupportedEncodingException
    //   1835	1869	2537	java/io/UnsupportedEncodingException
    //   1875	1880	2537	java/io/UnsupportedEncodingException
    //   1898	1932	2537	java/io/UnsupportedEncodingException
    //   1938	1943	2537	java/io/UnsupportedEncodingException
    //   1961	1995	2537	java/io/UnsupportedEncodingException
    //   2001	2006	2537	java/io/UnsupportedEncodingException
    //   2024	2058	2537	java/io/UnsupportedEncodingException
    //   2064	2069	2537	java/io/UnsupportedEncodingException
    //   2087	2121	2537	java/io/UnsupportedEncodingException
    //   2127	2132	2537	java/io/UnsupportedEncodingException
    //   2150	2185	2537	java/io/UnsupportedEncodingException
    //   2191	2196	2537	java/io/UnsupportedEncodingException
    //   2214	2249	2537	java/io/UnsupportedEncodingException
    //   2255	2260	2537	java/io/UnsupportedEncodingException
    //   2278	2313	2537	java/io/UnsupportedEncodingException
    //   2319	2324	2537	java/io/UnsupportedEncodingException
    //   2342	2377	2537	java/io/UnsupportedEncodingException
    //   2383	2388	2537	java/io/UnsupportedEncodingException
    //   2406	2441	2537	java/io/UnsupportedEncodingException
    //   2447	2452	2537	java/io/UnsupportedEncodingException
    //   2470	2505	2537	java/io/UnsupportedEncodingException
    //   2511	2516	2537	java/io/UnsupportedEncodingException
    //   265	270	2555	java/io/UnsupportedEncodingException
    //   327	332	2555	java/io/UnsupportedEncodingException
    //   429	434	2555	java/io/UnsupportedEncodingException
    //   451	482	2555	java/io/UnsupportedEncodingException
    //   546	577	2555	java/io/UnsupportedEncodingException
    //   681	712	2555	java/io/UnsupportedEncodingException
    //   736	767	2555	java/io/UnsupportedEncodingException
    //   791	822	2555	java/io/UnsupportedEncodingException
    //   886	917	2555	java/io/UnsupportedEncodingException
    //   1061	1092	2555	java/io/UnsupportedEncodingException
    //   1116	1147	2555	java/io/UnsupportedEncodingException
    //   1211	1242	2555	java/io/UnsupportedEncodingException
    //   1266	1297	2555	java/io/UnsupportedEncodingException
    //   1321	1326	2555	java/io/UnsupportedEncodingException
    //   1383	1388	2555	java/io/UnsupportedEncodingException
    //   1445	1451	2555	java/io/UnsupportedEncodingException
    //   1508	1514	2555	java/io/UnsupportedEncodingException
    //   1571	1577	2555	java/io/UnsupportedEncodingException
    //   1634	1640	2555	java/io/UnsupportedEncodingException
    //   1697	1703	2555	java/io/UnsupportedEncodingException
    //   1760	1766	2555	java/io/UnsupportedEncodingException
    //   1823	1829	2555	java/io/UnsupportedEncodingException
    //   1886	1892	2555	java/io/UnsupportedEncodingException
    //   1949	1955	2555	java/io/UnsupportedEncodingException
    //   2012	2018	2555	java/io/UnsupportedEncodingException
    //   2075	2081	2555	java/io/UnsupportedEncodingException
    //   2138	2144	2555	java/io/UnsupportedEncodingException
    //   2202	2208	2555	java/io/UnsupportedEncodingException
    //   2266	2272	2555	java/io/UnsupportedEncodingException
    //   2330	2336	2555	java/io/UnsupportedEncodingException
    //   2394	2400	2555	java/io/UnsupportedEncodingException
    //   2458	2464	2555	java/io/UnsupportedEncodingException
  }
  
  public static void genCrossword11()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 16;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "中秋节".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        byte[] arrayOfByte4 = "大".getBytes("GBK");
        System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i3, arrayOfByte4.length);
        int i6 = i3 + arrayOfByte4.length;
        i3 = i6 + 1;
        arrayOfByte1[i6] = 0;
        byte[] arrayOfByte5 = "陈坤".getBytes("GBK");
        System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
        int i7 = i3 + arrayOfByte5.length;
        i3 = i7 + 1;
        arrayOfByte1[i7] = 0;
        byte[] arrayOfByte6 = "硅".getBytes("GBK");
        System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
        int i8 = i3 + arrayOfByte6.length;
        i3 = i8 + 1;
        arrayOfByte1[i8] = 0;
        byte[] arrayOfByte7 = "水".getBytes("GBK");
        System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
        int i9 = i3 + arrayOfByte7.length;
        i3 = i9 + 1;
        arrayOfByte1[i9] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte8;
        int i10;
        int i11;
        byte[] arrayOfByte9;
        int i12;
        byte[] arrayOfByte10;
        int i13;
        byte[] arrayOfByte11;
        int i14;
        byte[] arrayOfByte12;
        int i15;
        byte[] arrayOfByte13;
        int i16;
        int i17;
        byte[] arrayOfByte14;
        int i18;
        byte[] arrayOfByte15;
        int i19;
        byte[] arrayOfByte16;
        int i20;
        byte[] arrayOfByte17;
        int i21;
        byte[] arrayOfByte18;
        int i22;
        byte[] arrayOfByte19;
        int i23;
        byte[] arrayOfByte20;
        int i24;
        byte[] arrayOfByte21;
        int i25;
        byte[] arrayOfByte22;
        int i26;
        byte[] arrayOfByte23;
        int i27;
        int i28;
        byte[] arrayOfByte24;
        int i29;
        byte[] arrayOfByte25;
        int i30;
        int i31;
        byte[] arrayOfByte26;
        int i32;
        byte[] arrayOfByte27;
        int i33;
        int i34;
        byte[] arrayOfByte28;
        int i35;
        int i36;
        byte[] arrayOfByte29;
        int i37;
        byte[] arrayOfByte30;
        int i38;
        int i39;
        byte[] arrayOfByte31;
        int i40;
        byte[] arrayOfByte32;
        int i41;
        byte[] arrayOfByte33;
        int i42;
        byte[] arrayOfByte34;
        int i43;
        byte[] arrayOfByte35;
        int i44;
        byte[] arrayOfByte36;
        int i45;
        byte[] arrayOfByte37;
        int i46;
        byte[] arrayOfByte38;
        int i47;
        byte[] arrayOfByte39;
        int i48;
        byte[] arrayOfByte40;
        int i49;
        byte[] arrayOfByte41;
        int i50;
        byte[] arrayOfByte42;
        int i51;
        byte[] arrayOfByte43;
        int i52;
        byte[] arrayOfByte44;
        int i53;
        byte[] arrayOfByte45;
        int i54;
        byte[] arrayOfByte46;
        int i55;
        byte[] arrayOfByte47;
        int i56;
        byte[] arrayOfByte48;
        int i57;
        byte[] arrayOfByte49;
        int i58;
        byte[] arrayOfByte50;
        int i59;
        byte[] arrayOfByte51;
        int i60;
        byte[] arrayOfByte52;
        int i61;
        byte[] arrayOfByte53;
        int i62;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte8 = "事".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i4, arrayOfByte8.length);
          i10 = arrayOfByte8.length;
          i11 = i4 + i10;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          arrayOfByte9 = "可".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i12 = i3 + arrayOfByte9.length;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte10 = "波谷".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i13 = i3 + arrayOfByte10.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte11 = "共享软件".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i14 = i3 + arrayOfByte11.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte12 = "辛吉斯".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i15 = i3 + arrayOfByte12.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte13 = "长".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i16 = arrayOfByte13.length;
          i17 = i4 + i16;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte14 = "搜".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i18 = i3 + arrayOfByte14.length;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte15 = "祥".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i19 = i3 + arrayOfByte15.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte16 = "生惊天地泣鬼神".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i20 = i3 + arrayOfByte16.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          arrayOfByte17 = "三文鱼".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i21 = i3 + arrayOfByte17.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte18 = "一".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i22 = i3 + arrayOfByte18.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte19 = "传家宝".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i23 = i3 + arrayOfByte19.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          arrayOfByte20 = "片黄色领骑衫".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i24 = i3 + arrayOfByte20.length;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte21 = "蒙".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i25 = i3 + arrayOfByte21.length;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte22 = "晓".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i26 = i3 + arrayOfByte22.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte23 = "马".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i4, arrayOfByte23.length);
          i27 = arrayOfByte23.length;
          i28 = i4 + i27;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte24 = "圣菲波哥大明".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i29 = i3 + arrayOfByte24.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte25 = "找".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i4, arrayOfByte25.length);
          i30 = arrayOfByte25.length;
          i31 = i4 + i30;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          arrayOfByte26 = "保".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i32 = i3 + arrayOfByte26.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte27 = "马".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i4, arrayOfByte27.length);
          i33 = arrayOfByte27.length;
          i34 = i4 + i33;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte28 = "乞力马扎罗山".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i4, arrayOfByte28.length);
          i35 = arrayOfByte28.length;
          i36 = i4 + i35;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          arrayOfByte29 = "利智".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i37 = i3 + arrayOfByte29.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte30 = "我国传统节日，民间有合家团圆、吃月饼、赏月的习俗".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i4, arrayOfByte30.length);
          i38 = arrayOfByte30.length;
          i39 = i4 + i38;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "王勃《滕王阁序》中的名句".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i40 = i3 + arrayOfByte31.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 4;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "杜琪峰导演，陈慧琳、任贤齐等主演的电影".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i41 = i3 + arrayOfByte32.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 6;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte33 = "男明星，主演的影片有《花木兰》、《画皮》、《云水谣》等".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i42 = i3 + arrayOfByte33.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 6;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "香港导演，代表作有《如果爱》、《武侠》、《投名状》等".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i43 = i3 + arrayOfByte34.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "美国重要的电子工业基地。后泛称新兴专业科学城区".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i44 = i3 + arrayOfByte35.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 18;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte36 = "横波在正交于传递方向上达到负向位移最大值的位置".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i45 = i3 + arrayOfByte36.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 18;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte37 = "兴起于伊朗高原西部的西亚古国".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i46 = i3 + arrayOfByte37.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 21;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte38 = "以“先使用后付费”的方式销售的享有版权的软件".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i47 = i3 + arrayOfByte38.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 26;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "瑞士著名女子网球运动员，她在1997年成为有史以来最年轻的世界排名第一的女选手".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i48 = i3 + arrayOfByte39.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 27;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "一首一家三口对答式的蒙族小曲".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i49 = i3 + arrayOfByte40.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 35;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "TVB古装神话剧，剧中主要人物有好彩妹、晏喜和石敢当等".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i50 = i3 + arrayOfByte41.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 39;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte42 = "日本料理的代表，音译为“沙西米”".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i51 = i3 + arrayOfByte42.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "使天地为之震惊，使鬼神为之哭泣".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i52 = i3 + arrayOfByte43.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 47;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte44 = "一种较广地分布在北半球高纬度地区的冷水鱼类，肉质非常鲜美".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i53 = i3 + arrayOfByte44.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 55;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte45 = "家庭内部代代相传的有价值之物".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i54 = i3 + arrayOfByte45.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "环法自行车赛中总成绩领先的车手穿的衣服".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i55 = i3 + arrayOfByte46.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "男明星，主演的影片有《赵氏孤儿》、《唐伯虎点秋香2》、《风声》等".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i56 = i3 + arrayOfByte47.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 63;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "比喻东西就在自己这里，还到处去找".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i57 = i3 + arrayOfByte48.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 68;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "英国陆军元帅，第二次世界大战中盟军指挥官之一".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i58 = i3 + arrayOfByte49.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 75;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte50 = "哥伦比亚首都和最大城市。多古建筑和艺术遗迹，有黄金和绿宝石博物馆等".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i59 = i3 + arrayOfByte50.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 75;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte51 = "巴西最大城市和工业中心".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i60 = i3 + arrayOfByte51.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 91;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "非洲第一高山，在坦桑尼亚东北部".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i61 = i3 + arrayOfByte52.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 98;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte53 = "李连杰的妻子，1986年亚洲小姐冠军".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i62 = i3 + arrayOfByte53.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/11.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword1120()
  {
    genCrossword11();
    genCrossword12();
    genCrossword13();
    genCrossword14();
    genCrossword15();
    genCrossword16();
    genCrossword17();
    genCrossword18();
    genCrossword19();
    genCrossword20();
  }
  
  public static void genCrossword12()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 17;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "塑化剂".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        byte[] arrayOfByte7;
        int i10;
        byte[] arrayOfByte8;
        int i11;
        byte[] arrayOfByte9;
        int i12;
        byte[] arrayOfByte10;
        int i13;
        byte[] arrayOfByte11;
        int i14;
        byte[] arrayOfByte12;
        int i15;
        byte[] arrayOfByte13;
        int i16;
        byte[] arrayOfByte14;
        int i17;
        byte[] arrayOfByte15;
        int i18;
        int i19;
        byte[] arrayOfByte16;
        int i20;
        byte[] arrayOfByte17;
        int i21;
        byte[] arrayOfByte18;
        int i22;
        byte[] arrayOfByte19;
        int i23;
        int i24;
        byte[] arrayOfByte20;
        int i25;
        byte[] arrayOfByte21;
        int i26;
        int i27;
        byte[] arrayOfByte22;
        int i28;
        int i29;
        byte[] arrayOfByte23;
        int i30;
        int i31;
        byte[] arrayOfByte24;
        int i32;
        int i33;
        byte[] arrayOfByte25;
        int i34;
        int i35;
        byte[] arrayOfByte26;
        int i36;
        byte[] arrayOfByte27;
        int i37;
        byte[] arrayOfByte28;
        int i38;
        int i39;
        byte[] arrayOfByte29;
        int i40;
        int i41;
        byte[] arrayOfByte30;
        int i42;
        int i43;
        byte[] arrayOfByte31;
        int i44;
        byte[] arrayOfByte32;
        int i45;
        byte[] arrayOfByte33;
        int i46;
        byte[] arrayOfByte34;
        int i47;
        byte[] arrayOfByte35;
        int i48;
        byte[] arrayOfByte36;
        int i49;
        byte[] arrayOfByte37;
        int i50;
        byte[] arrayOfByte38;
        int i51;
        byte[] arrayOfByte39;
        int i52;
        byte[] arrayOfByte40;
        int i53;
        byte[] arrayOfByte41;
        int i54;
        byte[] arrayOfByte42;
        int i55;
        byte[] arrayOfByte43;
        int i56;
        byte[] arrayOfByte44;
        int i57;
        byte[] arrayOfByte45;
        int i58;
        byte[] arrayOfByte46;
        int i59;
        byte[] arrayOfByte47;
        int i60;
        byte[] arrayOfByte48;
        int i61;
        byte[] arrayOfByte49;
        int i62;
        byte[] arrayOfByte50;
        int i63;
        byte[] arrayOfByte51;
        int i64;
        byte[] arrayOfByte52;
        int i65;
        byte[] arrayOfByte53;
        int i66;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "惧".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte5 = "大本钟".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
          i8 = i3 + arrayOfByte5.length;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          arrayOfByte6 = "干".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i9 = i3 + arrayOfByte6.length;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          arrayOfByte7 = "约翰内斯堡".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
          i10 = i3 + arrayOfByte7.length;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          arrayOfByte8 = "欣枕戈待旦".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i11 = i3 + arrayOfByte8.length;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte9 = "礁".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i12 = i3 + arrayOfByte9.length;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte10 = "桐".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i13 = i3 + arrayOfByte10.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte11 = "为".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i14 = i3 + arrayOfByte11.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte12 = "河东狮吼".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i15 = i3 + arrayOfByte12.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte13 = "黑".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i16 = i3 + arrayOfByte13.length;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          arrayOfByte14 = "杨玉环".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i17 = i3 + arrayOfByte14.length;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte15 = "子".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i4, arrayOfByte15.length);
          i18 = arrayOfByte15.length;
          i19 = i4 + i18;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte16 = "躲猫猫".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i20 = i3 + arrayOfByte16.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          arrayOfByte17 = "帛".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i21 = i3 + arrayOfByte17.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte18 = "魔杰座".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i22 = i3 + arrayOfByte18.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte19 = "警".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i4, arrayOfByte19.length);
          i23 = arrayOfByte19.length;
          i24 = i4 + i23;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          arrayOfByte20 = "东".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i25 = i3 + arrayOfByte20.length;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte21 = "鬼".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i4, arrayOfByte21.length);
          i26 = arrayOfByte21.length;
          i27 = i4 + i26;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte22 = "不想长大北京现代".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i4, arrayOfByte22.length);
          i28 = arrayOfByte22.length;
          i29 = i4 + i28;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte23 = "可".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i4, arrayOfByte23.length);
          i30 = arrayOfByte23.length;
          i31 = i4 + i30;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte24 = "连平".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i4, arrayOfByte24.length);
          i32 = arrayOfByte24.length;
          i33 = i4 + i32;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte25 = "言之成理".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i4, arrayOfByte25.length);
          i34 = arrayOfByte25.length;
          i35 = i4 + i34;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          arrayOfByte26 = "黎".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i36 = i3 + arrayOfByte26.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          arrayOfByte27 = "原".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i37 = i3 + arrayOfByte27.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte28 = "人".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i4, arrayOfByte28.length);
          i38 = arrayOfByte28.length;
          i39 = i4 + i38;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte29 = "喻世明言".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i4, arrayOfByte29.length);
          i40 = arrayOfByte29.length;
          i41 = i4 + i40;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte30 = "工业上被广泛使用的高分子材料助剂。在台湾被不法商家添加到食品中，引发重大食品安全危机".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i4, arrayOfByte30.length);
          i42 = arrayOfByte30.length;
          i43 = i4 + i42;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "比喻把战争或争斗变为和平、友好".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i44 = i3 + arrayOfByte31.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "书面语，怕老婆的意思".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i45 = i3 + arrayOfByte32.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte33 = "英国国会会议厅附属钟楼的大报时钟的昵称，它是伦敦市的标志以及英国的象征".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i46 = i3 + arrayOfByte33.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "澳大利亚昆士兰的旅游胜地。当地旅游局寻找护岛人的活动堪称网络营销案例的经典".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i47 = i3 + arrayOfByte34.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "女生组合“Twins”的成员之一".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i48 = i3 + arrayOfByte35.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 13;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte36 = "南非最大城市，素有“黄金之城”的美称".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i49 = i3 + arrayOfByte36.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 13;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte37 = "西亚重要内流河。源于黎巴嫩同叙利亚之间的山地，注入死海".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i50 = i3 + arrayOfByte37.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte38 = "形容时刻准备作战".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i51 = i3 + arrayOfByte38.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 33;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "古天乐、张柏芝主演的一部古装喜剧片".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i52 = i3 + arrayOfByte39.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 35;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "十二星座之一，位于巨蟹座和处女座之间".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i53 = i3 + arrayOfByte40.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 38;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "经典国产动画片，主角是一只黑猫".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i54 = i3 + arrayOfByte41.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "我国古代“四大美女”之一".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i55 = i3 + arrayOfByte42.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 47;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "一种游戏，也称捉迷藏。可能致人死亡".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i56 = i3 + arrayOfByte43.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 53;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte44 = "周杰伦的一张专辑，收录了《稻香》、《说好的幸福呢》等歌曲".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i57 = i3 + arrayOfByte44.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 53;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "艾尔.帕西诺、基努.里维斯等主演的一部经典影片".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i58 = i3 + arrayOfByte45.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte46 = "我国三大平原中纬度最高的一个，为重要农业基地".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i59 = i3 + arrayOfByte46.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 66;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "S.H.E.的一首歌曲，首句为“为什么就是找不到无邪的玫瑰花”".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i60 = i3 + arrayOfByte47.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 66;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "没法跟他讲道理。形容蛮横或固执".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i61 = i3 + arrayOfByte48.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 69;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "辽宁省南部的一座美丽城市，有“北方明珠”之称".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i62 = i3 + arrayOfByte49.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 70;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte50 = "中韩合资的一家汽车公司，旗下车型有雅绅特、索纳塔、伊兰特等".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i63 = i3 + arrayOfByte50.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 83;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "话说得有一定道理".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i64 = i3 + arrayOfByte51.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 88;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte52 = "香港男明星，其主演的影片有《梅兰芳》、《大城小事》等".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i65 = i3 + arrayOfByte52.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 96;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte53 = "明代冯梦龙编著的白话短篇小说集，与《警世通言》、《醒世恒言》合称“三言”".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i66 = i3 + arrayOfByte53.length;
          i3 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/12.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword13()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 18;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "建党伟业".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        byte[] arrayOfByte4 = "元春".getBytes("GBK");
        System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i3, arrayOfByte4.length);
        int i6 = i3 + arrayOfByte4.length;
        i3 = i6 + 1;
        arrayOfByte1[i6] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte5;
        int i7;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        byte[] arrayOfByte7;
        int i10;
        byte[] arrayOfByte8;
        int i11;
        byte[] arrayOfByte9;
        int i12;
        byte[] arrayOfByte10;
        int i13;
        byte[] arrayOfByte11;
        int i14;
        byte[] arrayOfByte12;
        int i15;
        int i16;
        byte[] arrayOfByte13;
        int i17;
        byte[] arrayOfByte14;
        int i18;
        byte[] arrayOfByte15;
        int i19;
        int i20;
        byte[] arrayOfByte16;
        int i21;
        byte[] arrayOfByte17;
        int i22;
        int i23;
        byte[] arrayOfByte18;
        int i24;
        int i25;
        byte[] arrayOfByte19;
        int i26;
        int i27;
        byte[] arrayOfByte20;
        int i28;
        int i29;
        byte[] arrayOfByte21;
        int i30;
        byte[] arrayOfByte22;
        int i31;
        byte[] arrayOfByte23;
        int i32;
        byte[] arrayOfByte24;
        int i33;
        int i34;
        byte[] arrayOfByte25;
        int i35;
        byte[] arrayOfByte26;
        int i36;
        int i37;
        byte[] arrayOfByte27;
        int i38;
        byte[] arrayOfByte28;
        int i39;
        byte[] arrayOfByte29;
        int i40;
        byte[] arrayOfByte30;
        int i41;
        byte[] arrayOfByte31;
        int i42;
        byte[] arrayOfByte32;
        int i43;
        byte[] arrayOfByte33;
        int i44;
        byte[] arrayOfByte34;
        int i45;
        byte[] arrayOfByte35;
        int i46;
        byte[] arrayOfByte36;
        int i47;
        byte[] arrayOfByte37;
        int i48;
        byte[] arrayOfByte38;
        int i49;
        byte[] arrayOfByte39;
        int i50;
        byte[] arrayOfByte40;
        int i51;
        byte[] arrayOfByte41;
        int i52;
        byte[] arrayOfByte42;
        int i53;
        byte[] arrayOfByte43;
        int i54;
        byte[] arrayOfByte44;
        int i55;
        byte[] arrayOfByte45;
        int i56;
        byte[] arrayOfByte46;
        int i57;
        byte[] arrayOfByte47;
        int i58;
        byte[] arrayOfByte48;
        int i59;
        byte[] arrayOfByte49;
        int i60;
        byte[] arrayOfByte50;
        int i61;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte5 = "爱设".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i4, arrayOfByte5.length);
          i7 = arrayOfByte5.length;
          i8 = i4 + i7;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte6 = "祖".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i9 = i3 + arrayOfByte6.length;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          arrayOfByte7 = "运用自如银河英雄传说".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
          i10 = i3 + arrayOfByte7.length;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte8 = "潮行".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i11 = i3 + arrayOfByte8.length;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          arrayOfByte9 = "雄".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i12 = i3 + arrayOfByte9.length;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte10 = "秘".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i13 = i3 + arrayOfByte10.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte11 = "高山流水".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i14 = i3 + arrayOfByte11.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte12 = "无".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i4, arrayOfByte12.length);
          i15 = arrayOfByte12.length;
          i16 = i4 + i15;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          arrayOfByte13 = "方鸿渐".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i17 = i3 + arrayOfByte13.length;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte14 = "富可敌国".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i18 = i3 + arrayOfByte14.length;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte15 = "离群索居".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i4, arrayOfByte15.length);
          i19 = arrayOfByte15.length;
          i20 = i4 + i19;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          arrayOfByte16 = "可".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i21 = i3 + arrayOfByte16.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte17 = "圆规".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i4, arrayOfByte17.length);
          i22 = arrayOfByte17.length;
          i23 = i4 + i22;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte18 = "爱".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i4, arrayOfByte18.length);
          i24 = arrayOfByte18.length;
          i25 = i4 + i24;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte19 = "西".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i4, arrayOfByte19.length);
          i26 = arrayOfByte19.length;
          i27 = i4 + i26;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte20 = "桌".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i4, arrayOfByte20.length);
          i28 = arrayOfByte20.length;
          i29 = i4 + i28;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte21 = "陶喆".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i30 = i3 + arrayOfByte21.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte22 = "过千里走单骑".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i31 = i3 + arrayOfByte22.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          arrayOfByte23 = "行".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i32 = i3 + arrayOfByte23.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte24 = "劳金".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i4, arrayOfByte24.length);
          i33 = arrayOfByte24.length;
          i34 = i4 + i33;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte25 = "士为知己者死".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i35 = i3 + arrayOfByte25.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte26 = "中影集团摄制的建党90周年献礼大片，汇聚了众多一线明星参演".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i4, arrayOfByte26.length);
          i36 = arrayOfByte26.length;
          i37 = i4 + i36;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte27 = "我国四大国有商业银行之一".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i38 = i3 + arrayOfByte27.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte28 = "《红楼梦》中贾家嫁入皇宫的女子".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i39 = i3 + arrayOfByte28.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 6;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte29 = "在春节前后一段时间的运输业务".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i40 = i3 + arrayOfByte29.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte30 = "张信哲的一首歌，首句为“不问你为何流眼泪”".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i41 = i3 + arrayOfByte30.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 14;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "祖先遗传下来的秘密配方".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i42 = i3 + arrayOfByte31.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 13;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte32 = "南非最大城市，素有“黄金之城”的美称".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i43 = i3 + arrayOfByte32.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 16;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte33 = "形容运用得非常熟练自然".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i44 = i3 + arrayOfByte33.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte34 = "田中芳树的一部架空历史小说".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i45 = i3 + arrayOfByte34.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 22;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "一款经典的神话主题回合制策略游戏".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i46 = i3 + arrayOfByte35.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 36;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte36 = "比喻知己或知音，也比喻乐曲高妙".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i47 = i3 + arrayOfByte36.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 36;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte37 = "战国末燕国人，为谋刺秦始皇的荆轲送行时，曾在易水为其击筑伴唱".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i48 = i3 + arrayOfByte37.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 44;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte38 = "《围城》中的男主人公".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i49 = i3 + arrayOfByte38.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 50;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "形容极为富有".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i50 = i3 + arrayOfByte39.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 51;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "位于青海省西南部的国家级自然保护区，藏羚羊的主要栖息地之一".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i51 = i3 + arrayOfByte40.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 56;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "离开集体或群众，过孤独的生活".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i52 = i3 + arrayOfByte41.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 58;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte42 = "一个知名手机品牌".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i53 = i3 + arrayOfByte42.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 64;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "绘圆用的绘图工具".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i54 = i3 + arrayOfByte43.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 64;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "传说中亚瑟王手下最高等的骑士，因他们聚会的桌子是个圆桌而得名".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i55 = i3 + arrayOfByte44.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 76;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte45 = "男歌星，推出的专辑有《太平盛世》、《黑色柳丁》等".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i56 = i3 + arrayOfByte45.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 76;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte46 = "我国著名教育家、民主革命家".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i57 = i3 + arrayOfByte46.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 79;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "由于长时间过度劳累而造成的突然死亡".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i58 = i3 + arrayOfByte47.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 80;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte48 = "张艺谋导演的一部影片，高仓健、蒋雯主演".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i59 = i3 + arrayOfByte48.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 80;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "用于称他人的女儿，有尊贵之意".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i60 = i3 + arrayOfByte49.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 94;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte50 = "指甘愿为赏识自己、栽培自己的人献身".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i61 = i3 + arrayOfByte50.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/13.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword14()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 19;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "周".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        int i10;
        byte[] arrayOfByte7;
        int i11;
        int i12;
        byte[] arrayOfByte8;
        int i13;
        int i14;
        byte[] arrayOfByte9;
        int i15;
        int i16;
        byte[] arrayOfByte10;
        int i17;
        byte[] arrayOfByte11;
        int i18;
        byte[] arrayOfByte12;
        int i19;
        int i20;
        byte[] arrayOfByte13;
        int i21;
        int i22;
        byte[] arrayOfByte14;
        int i23;
        int i24;
        byte[] arrayOfByte15;
        int i25;
        int i26;
        byte[] arrayOfByte16;
        int i27;
        int i28;
        byte[] arrayOfByte17;
        int i29;
        byte[] arrayOfByte18;
        int i30;
        byte[] arrayOfByte19;
        int i31;
        byte[] arrayOfByte20;
        int i32;
        byte[] arrayOfByte21;
        int i33;
        byte[] arrayOfByte22;
        int i34;
        byte[] arrayOfByte23;
        int i35;
        byte[] arrayOfByte24;
        int i36;
        byte[] arrayOfByte25;
        int i37;
        byte[] arrayOfByte26;
        int i38;
        byte[] arrayOfByte27;
        int i39;
        int i40;
        byte[] arrayOfByte28;
        int i41;
        byte[] arrayOfByte29;
        int i42;
        int i43;
        byte[] arrayOfByte30;
        int i44;
        byte[] arrayOfByte31;
        int i45;
        byte[] arrayOfByte32;
        int i46;
        byte[] arrayOfByte33;
        int i47;
        byte[] arrayOfByte34;
        int i48;
        byte[] arrayOfByte35;
        int i49;
        byte[] arrayOfByte36;
        int i50;
        byte[] arrayOfByte37;
        int i51;
        byte[] arrayOfByte38;
        int i52;
        byte[] arrayOfByte39;
        int i53;
        byte[] arrayOfByte40;
        int i54;
        byte[] arrayOfByte41;
        int i55;
        byte[] arrayOfByte42;
        int i56;
        byte[] arrayOfByte43;
        int i57;
        byte[] arrayOfByte44;
        int i58;
        byte[] arrayOfByte45;
        int i59;
        byte[] arrayOfByte46;
        int i60;
        byte[] arrayOfByte47;
        int i61;
        byte[] arrayOfByte48;
        int i62;
        byte[] arrayOfByte49;
        int i63;
        byte[] arrayOfByte50;
        int i64;
        byte[] arrayOfByte51;
        int i65;
        byte[] arrayOfByte52;
        int i66;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "一刀切".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte5 = "半立地太岁".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
          i8 = i3 + arrayOfByte5.length;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte6 = "乱世佳人波".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i4, arrayOfByte6.length);
          i9 = arrayOfByte6.length;
          i10 = i4 + i9;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte7 = "一".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i4, arrayOfByte7.length);
          i11 = arrayOfByte7.length;
          i12 = i4 + i11;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte8 = "舞".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i4, arrayOfByte8.length);
          i13 = arrayOfByte8.length;
          i14 = i4 + i13;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte9 = "马".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i4, arrayOfByte9.length);
          i15 = arrayOfByte9.length;
          i16 = i4 + i15;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          arrayOfByte10 = "欢".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i17 = i3 + arrayOfByte10.length;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          arrayOfByte11 = "枯木逢春".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i18 = i3 + arrayOfByte11.length;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte12 = "座欣欣向荣".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i4, arrayOfByte12.length);
          i19 = arrayOfByte12.length;
          i20 = i4 + i19;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte13 = "秋刀鱼".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i21 = arrayOfByte13.length;
          i22 = i4 + i21;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte14 = "鼓".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i4, arrayOfByte14.length);
          i23 = arrayOfByte14.length;
          i24 = i4 + i23;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte15 = "火锅".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i4, arrayOfByte15.length);
          i25 = arrayOfByte15.length;
          i26 = i4 + i25;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte16 = "肠".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i4, arrayOfByte16.length);
          i27 = arrayOfByte16.length;
          i28 = i4 + i27;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte17 = "起舞弄清影".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i29 = i3 + arrayOfByte17.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte18 = "可".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i30 = i3 + arrayOfByte18.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte19 = "剑蝶重".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i31 = i3 + arrayOfByte19.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          arrayOfByte20 = "虚".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i32 = i3 + arrayOfByte20.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte21 = "忍无可忍".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i33 = i3 + arrayOfByte21.length;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte22 = "泳机".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i34 = i3 + arrayOfByte22.length;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          arrayOfByte23 = "作".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i35 = i3 + arrayOfByte23.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          arrayOfByte24 = "者".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i36 = i3 + arrayOfByte24.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          arrayOfByte25 = "西".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i37 = i3 + arrayOfByte25.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          arrayOfByte26 = "菜".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i38 = i3 + arrayOfByte26.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte27 = "通假字".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i4, arrayOfByte27.length);
          i39 = arrayOfByte27.length;
          i40 = i4 + i39;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          arrayOfByte28 = "千里走单骑".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i41 = i3 + arrayOfByte28.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 2;
          arrayOfByte29 = "上海著名滑稽演员，其艺术形式为独创的海派清口".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i4, arrayOfByte29.length);
          i42 = arrayOfByte29.length;
          i43 = i4 + i42;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 3;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte30 = "比喻不顾实际情况，强求划一".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i44 = i3 + arrayOfByte30.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 3;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "白居易《赋得古原草送别》中“离离原上草”的下句".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i45 = i3 + arrayOfByte31.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "南天最耀眼的星座之一。除太阳之外，离我们最近的一颗恒星就在这个星座中".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i46 = i3 + arrayOfByte32.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 10;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte33 = "《水浒传》中人物阮小二的绰号".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i47 = i3 + arrayOfByte33.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 16;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte34 = "费雯丽、克拉克.盖博主演的一部经典影片".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i48 = i3 + arrayOfByte34.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 16;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "周杰伦专辑《七里香》中的一首歌，讲述歌手乘坐时光机回到三国时期的情景".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i49 = i3 + arrayOfByte35.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 31;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "形容高兴而振奋".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i50 = i3 + arrayOfByte36.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 33;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "比喻垂危的病人或事物重新获得生机".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i51 = i3 + arrayOfByte37.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte38 = "形容草木长得茂盛。比喻事业蓬勃发展，兴旺昌盛".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i52 = i3 + arrayOfByte38.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 46;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "一种冷水性大洋洄游鱼类，主要分布在日本北海道外，西北太平洋海域".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i53 = i3 + arrayOfByte39.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 48;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "传说专诸刺杀王僚所用的武器，由铸剑大师欧冶子所铸".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i54 = i3 + arrayOfByte40.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 54;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "我国一种传统饮食方式，把肉片或蔬菜等放在汤里，随煮随吃".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i55 = i3 + arrayOfByte41.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 54;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte42 = "日本漫画家岸本齐史的代表作".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i56 = i3 + arrayOfByte42.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "苏轼词作《水调歌头》中“何似在人间”的上句".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i57 = i3 + arrayOfByte43.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "建筑工地常用的大型机械".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i58 = i3 + arrayOfByte44.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 62;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "耍花招欺骗人".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i59 = i3 + arrayOfByte45.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 66;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte46 = "位于青海省西南部的国家级自然保护区，藏羚羊的主要栖息地之一".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i60 = i3 + arrayOfByte46.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 68;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "吴尊、蔡卓妍、胡歌、庾澄庆等主演的一部影片，取材于经典爱情故事《梁祝》".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i61 = i3 + arrayOfByte47.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 69;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "一种游泳姿势，跟蛙泳相似，但两臂划水后须提出水面再向前摆去".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i62 = i3 + arrayOfByte48.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 74;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "再也忍受不下去了".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i63 = i3 + arrayOfByte49.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 88;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "计算机上一些操作用的选单".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i64 = i3 + arrayOfByte50.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 91;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "通用假借的字，用音同、音近或形近的字代替某一个字".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i65 = i3 + arrayOfByte51.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 95;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "张艺谋导演的一部影片，高仓健、蒋雯主演".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i66 = i3 + arrayOfByte52.length;
          i3 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/14.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword15()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 20;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "京沪高铁".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        byte[] arrayOfByte4 = "北欧".getBytes("GBK");
        System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i3, arrayOfByte4.length);
        int i6 = i3 + arrayOfByte4.length;
        i3 = i6 + 1;
        arrayOfByte1[i6] = 0;
        byte[] arrayOfByte5 = "白".getBytes("GBK");
        System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
        int i7 = i3 + arrayOfByte5.length;
        i3 = i7 + 1;
        arrayOfByte1[i7] = 0;
        byte[] arrayOfByte6 = "剧".getBytes("GBK");
        System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
        int i8 = i3 + arrayOfByte6.length;
        i3 = i8 + 1;
        arrayOfByte1[i8] = 0;
        byte[] arrayOfByte7 = "尔".getBytes("GBK");
        System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
        int i9 = i3 + arrayOfByte7.length;
        i3 = i9 + 1;
        arrayOfByte1[i9] = 0;
        byte[] arrayOfByte8 = "衣".getBytes("GBK");
        System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
        int i10 = i3 + arrayOfByte8.length;
        i3 = i10 + 1;
        arrayOfByte1[i10] = 0;
        byte[] arrayOfByte9 = "拉贝日记".getBytes("GBK");
        System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
        int i11 = i3 + arrayOfByte9.length;
        i3 = i11 + 1;
        arrayOfByte1[i11] = 0;
        byte[] arrayOfByte10 = "转基因食品".getBytes("GBK");
        System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
        int i12 = i3 + arrayOfByte10.length;
        i3 = i12 + 1;
        arrayOfByte1[i12] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte11;
        int i13;
        int i14;
        byte[] arrayOfByte12;
        int i15;
        int i16;
        byte[] arrayOfByte13;
        int i17;
        int i18;
        byte[] arrayOfByte14;
        int i19;
        byte[] arrayOfByte15;
        int i20;
        byte[] arrayOfByte16;
        int i21;
        int i22;
        byte[] arrayOfByte17;
        int i23;
        byte[] arrayOfByte18;
        int i24;
        byte[] arrayOfByte19;
        int i25;
        int i26;
        byte[] arrayOfByte20;
        int i27;
        int i28;
        byte[] arrayOfByte21;
        int i29;
        byte[] arrayOfByte22;
        int i30;
        byte[] arrayOfByte23;
        int i31;
        byte[] arrayOfByte24;
        int i32;
        byte[] arrayOfByte25;
        int i33;
        int i34;
        byte[] arrayOfByte26;
        int i35;
        byte[] arrayOfByte27;
        int i36;
        byte[] arrayOfByte28;
        int i37;
        byte[] arrayOfByte29;
        int i38;
        byte[] arrayOfByte30;
        int i39;
        byte[] arrayOfByte31;
        int i40;
        byte[] arrayOfByte32;
        int i41;
        byte[] arrayOfByte33;
        int i42;
        int i43;
        byte[] arrayOfByte34;
        int i44;
        byte[] arrayOfByte35;
        int i45;
        byte[] arrayOfByte36;
        int i46;
        byte[] arrayOfByte37;
        int i47;
        byte[] arrayOfByte38;
        int i48;
        byte[] arrayOfByte39;
        int i49;
        byte[] arrayOfByte40;
        int i50;
        byte[] arrayOfByte41;
        int i51;
        byte[] arrayOfByte42;
        int i52;
        byte[] arrayOfByte43;
        int i53;
        byte[] arrayOfByte44;
        int i54;
        byte[] arrayOfByte45;
        int i55;
        byte[] arrayOfByte46;
        int i56;
        byte[] arrayOfByte47;
        int i57;
        byte[] arrayOfByte48;
        int i58;
        byte[] arrayOfByte49;
        int i59;
        byte[] arrayOfByte50;
        int i60;
        byte[] arrayOfByte51;
        int i61;
        byte[] arrayOfByte52;
        int i62;
        byte[] arrayOfByte53;
        int i63;
        byte[] arrayOfByte54;
        int i64;
        byte[] arrayOfByte55;
        int i65;
        byte[] arrayOfByte56;
        int i66;
        byte[] arrayOfByte57;
        int i67;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte11 = "依".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i4, arrayOfByte11.length);
          i13 = arrayOfByte11.length;
          i14 = i4 + i13;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte12 = "危".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i4, arrayOfByte12.length);
          i15 = arrayOfByte12.length;
          i16 = i4 + i15;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte13 = "父".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i17 = arrayOfByte13.length;
          i18 = i4 + i17;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte14 = "昆仑山脉".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i19 = i3 + arrayOfByte14.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte15 = "为".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i20 = i3 + arrayOfByte15.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte16 = "母大虫".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i4, arrayOfByte16.length);
          i21 = arrayOfByte16.length;
          i22 = i4 + i21;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte17 = "尽".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i23 = i3 + arrayOfByte17.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          arrayOfByte18 = "长安铃木".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i24 = i3 + arrayOfByte18.length;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte19 = "记".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i4, arrayOfByte19.length);
          i25 = arrayOfByte19.length;
          i26 = i4 + i25;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte20 = "安孙".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i4, arrayOfByte20.length);
          i27 = arrayOfByte20.length;
          i28 = i4 + i27;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte21 = "木".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i29 = i3 + arrayOfByte21.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte22 = "冲绳".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i30 = i3 + arrayOfByte22.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte23 = "孔庆东无".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i31 = i3 + arrayOfByte23.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          arrayOfByte24 = "保剑锋".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i32 = i3 + arrayOfByte24.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte25 = "雀".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i4, arrayOfByte25.length);
          i33 = arrayOfByte25.length;
          i34 = i4 + i33;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          arrayOfByte26 = "尼忌".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i35 = i3 + arrayOfByte26.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          arrayOfByte27 = "奈".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i36 = i3 + arrayOfByte27.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          arrayOfByte28 = "枪王之王".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i37 = i3 + arrayOfByte28.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          arrayOfByte29 = "奥".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i38 = i3 + arrayOfByte29.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          arrayOfByte30 = "睡美人".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i39 = i3 + arrayOfByte30.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte31 = "朝".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i40 = i3 + arrayOfByte31.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          arrayOfByte32 = "尼".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i41 = i3 + arrayOfByte32.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte33 = "新中国成立以来一次建设里程最长、投资最大、标准最高的高速铁路，从北京南站出发终止于上海虹桥站".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i4, arrayOfByte33.length);
          i42 = arrayOfByte33.length;
          i43 = i4 + i42;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "我国主要剧种之一，由清代中叶的徽调、汉调相继传入北京合流演变而成".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i44 = i3 + arrayOfByte34.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 2;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "苏联作家，代表作有《童年》、《在人间》、《我的大学》等".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i45 = i3 + arrayOfByte35.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte36 = "欧洲北部，包括丹麦、挪威、瑞典、芬兰和冰岛等国".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i46 = i3 + arrayOfByte36.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 6;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte37 = "瑞士著名数学家、自然科学家。在数学的各个领域，常常见到以其命名的公式、定理和重要常数".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i47 = i3 + arrayOfByte37.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 8;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "王之涣《登鹳雀楼》中的一句".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i48 = i3 + arrayOfByte38.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 14;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte39 = "指生活所依赖的人".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i49 = i3 + arrayOfByte39.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 16;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte40 = "一名德国友人亲身目击南京大屠杀所作的真实记录".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i50 = i3 + arrayOfByte40.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 21;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "通过改造动植物的基因制造出来的具备新特征的食品种类".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i51 = i3 + arrayOfByte41.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "形容草木长得茂盛。比喻事业蓬勃发展，兴旺昌盛".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i52 = i3 + arrayOfByte42.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 21;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "由危险转为平安（多指局势或病情）".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i53 = i3 + arrayOfByte43.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 36;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte44 = "我国著名山脉，西起帕米尔高原，横贯西藏和新疆间，向东延入青海境内".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i54 = i3 + arrayOfByte44.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 36;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "法国科学家、科普作家法布尔的传世佳作".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i55 = i3 + arrayOfByte45.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 44;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "《水浒传》中顾大嫂的绰号".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i56 = i3 + arrayOfByte46.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 50;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "一家中日合资的汽车公司，旗下车型有雨燕、天语等".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i57 = i3 + arrayOfByte47.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 50;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "唐代宰相，其妹为唐太宗的皇后".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i58 = i3 + arrayOfByte48.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 52;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "日本女明星，曾在《东京爱情故事》中饰演赤名莉香".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i59 = i3 + arrayOfByte49.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 59;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "世界著名电影大师，其作品有《云上的日子》、《红色沙漠》等".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i60 = i3 + arrayOfByte50.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 64;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "日本九州南部的县，是日本最南也是最西的县".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i61 = i3 + arrayOfByte51.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 64;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte52 = "通常指双手握持，发射手枪弹的自动枪械".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i62 = i3 + arrayOfByte52.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 67;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte53 = "北大怪才，代表作有《47楼207》、《空山疯语》等".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i63 = i3 + arrayOfByte53.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 67;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte54 = "古代印度摩揭陀国的奴隶制王朝，因其创造者旃陀罗.笈多出身于孔雀家族而得名".getBytes("GBK");
          System.arraycopy(arrayOfByte54, 0, arrayOfByte1, i3, arrayOfByte54.length);
          i64 = i3 + arrayOfByte54.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 72;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte55 = "男明星，曾主演《湘江北去》、《又见一帘幽梦》等影视作品".getBytes("GBK");
          System.arraycopy(arrayOfByte55, 0, arrayOfByte1, i3, arrayOfByte55.length);
          i65 = i3 + arrayOfByte55.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 84;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte56 = "尔冬升导演，古天乐、吴彦祖、李冰冰等主演的一部影片".getBytes("GBK");
          System.arraycopy(arrayOfByte56, 0, arrayOfByte1, i3, arrayOfByte56.length);
          i66 = i3 + arrayOfByte56.length;
          i3 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 91;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte57 = "童话人物，被纺锤扎了手指而沉睡多年".getBytes("GBK");
          System.arraycopy(arrayOfByte57, 0, arrayOfByte1, i3, arrayOfByte57.length);
          i67 = i3 + arrayOfByte57.length;
          i3 = i67 + 1;
          arrayOfByte1[i67] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/15.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword16()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 21;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "李娜".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        byte[] arrayOfByte4 = "但".getBytes("GBK");
        System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i3, arrayOfByte4.length);
        int i6 = i3 + arrayOfByte4.length;
        i3 = i6 + 1;
        arrayOfByte1[i6] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte5;
        int i7;
        byte[] arrayOfByte6;
        int i8;
        int i9;
        byte[] arrayOfByte7;
        int i10;
        int i11;
        byte[] arrayOfByte8;
        int i12;
        byte[] arrayOfByte9;
        int i13;
        byte[] arrayOfByte10;
        int i14;
        byte[] arrayOfByte11;
        int i15;
        byte[] arrayOfByte12;
        int i16;
        byte[] arrayOfByte13;
        int i17;
        byte[] arrayOfByte14;
        int i18;
        byte[] arrayOfByte15;
        int i19;
        byte[] arrayOfByte16;
        int i20;
        int i21;
        byte[] arrayOfByte17;
        int i22;
        byte[] arrayOfByte18;
        int i23;
        byte[] arrayOfByte19;
        int i24;
        byte[] arrayOfByte20;
        int i25;
        byte[] arrayOfByte21;
        int i26;
        byte[] arrayOfByte22;
        int i27;
        byte[] arrayOfByte23;
        int i28;
        int i29;
        byte[] arrayOfByte24;
        int i30;
        byte[] arrayOfByte25;
        int i31;
        int i32;
        byte[] arrayOfByte26;
        int i33;
        byte[] arrayOfByte27;
        int i34;
        byte[] arrayOfByte28;
        int i35;
        int i36;
        byte[] arrayOfByte29;
        int i37;
        byte[] arrayOfByte30;
        int i38;
        byte[] arrayOfByte31;
        int i39;
        byte[] arrayOfByte32;
        int i40;
        byte[] arrayOfByte33;
        int i41;
        byte[] arrayOfByte34;
        int i42;
        byte[] arrayOfByte35;
        int i43;
        byte[] arrayOfByte36;
        int i44;
        byte[] arrayOfByte37;
        int i45;
        byte[] arrayOfByte38;
        int i46;
        byte[] arrayOfByte39;
        int i47;
        byte[] arrayOfByte40;
        int i48;
        byte[] arrayOfByte41;
        int i49;
        byte[] arrayOfByte42;
        int i50;
        byte[] arrayOfByte43;
        int i51;
        byte[] arrayOfByte44;
        int i52;
        byte[] arrayOfByte45;
        int i53;
        byte[] arrayOfByte46;
        int i54;
        byte[] arrayOfByte47;
        int i55;
        byte[] arrayOfByte48;
        int i56;
        byte[] arrayOfByte49;
        int i57;
        byte[] arrayOfByte50;
        int i58;
        byte[] arrayOfByte51;
        int i59;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte5 = "小".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
          i7 = i3 + arrayOfByte5.length;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte6 = "小".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i4, arrayOfByte6.length);
          i8 = arrayOfByte6.length;
          i9 = i4 + i8;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte7 = "愿".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i4, arrayOfByte7.length);
          i10 = arrayOfByte7.length;
          i11 = i4 + i10;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          arrayOfByte8 = "朱门酒肉臭龙的传人".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i12 = i3 + arrayOfByte8.length;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte9 = "七".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i13 = i3 + arrayOfByte9.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte10 = "窝".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i14 = i3 + arrayOfByte10.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte11 = "氧".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i15 = i3 + arrayOfByte11.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte12 = "长江七号".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i16 = i3 + arrayOfByte12.length;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte13 = "旷日持久".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i17 = i3 + arrayOfByte13.length;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte14 = "地球仪".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i18 = i3 + arrayOfByte14.length;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte15 = "照".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i19 = i3 + arrayOfByte15.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte16 = "手无寸铁".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i4, arrayOfByte16.length);
          i20 = arrayOfByte16.length;
          i21 = i4 + i20;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte17 = "重整旗鼓".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i22 = i3 + arrayOfByte17.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte18 = "光".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i23 = i3 + arrayOfByte18.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          arrayOfByte19 = "大庆".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i24 = i3 + arrayOfByte19.length;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          arrayOfByte20 = "开".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i25 = i3 + arrayOfByte20.length;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte21 = "莫斯科大学闸".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i26 = i3 + arrayOfByte21.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          arrayOfByte22 = "飞得更高".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i27 = i3 + arrayOfByte22.length;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte23 = "银".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i4, arrayOfByte23.length);
          i28 = arrayOfByte23.length;
          i29 = i4 + i28;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte24 = "蟹".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i30 = i3 + arrayOfByte24.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte25 = "胜".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i4, arrayOfByte25.length);
          i31 = arrayOfByte25.length;
          i32 = i4 + i31;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte26 = "窟".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i33 = i3 + arrayOfByte26.length;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte27 = "自行车".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i34 = i3 + arrayOfByte27.length;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte28 = "非常给力的女子网球明星，首位夺得大满贯赛事单打冠军的亚洲选手".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i4, arrayOfByte28.length);
          i35 = arrayOfByte28.length;
          i36 = i4 + i35;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte29 = "一代功夫巨星，他主演的功夫片风靡全球，中国功夫也随之闻名于世界".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i37 = i3 + arrayOfByte29.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 3;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte30 = "苏轼《水调歌头》词中“千里共婵娟”的上句".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i38 = i3 + arrayOfByte30.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "林俊杰和蔡卓妍演唱的一首歌，其中一句为“一辈子暖暖的好，我永远爱你到老”".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i39 = i3 + arrayOfByte31.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 15;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte32 = "唐代诗人杜甫的名句，下句为“路有冻死骨”".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i40 = i3 + arrayOfByte32.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 15;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "古龙作品《武林外史》中的女主人公".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i41 = i3 + arrayOfByte33.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 19;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "氧的同素异形体，用作氧化剂、杀菌剂等".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i42 = i3 + arrayOfByte34.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte35 = "一首脍炙人口的老歌，首句为“遥远的东方有一条江，它的名字就叫长江”".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i43 = i3 + arrayOfByte35.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 33;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte36 = "周星驰自导自演的一部科幻喜剧电影".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i44 = i3 + arrayOfByte36.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "荒废时间，拖得很久".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i45 = i3 + arrayOfByte37.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 41;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "王小帅导演，王学圻、秦昊、范冰冰等主演的影片".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i46 = i3 + arrayOfByte38.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 47;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "地球的模型，供教学和军事上使用".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i47 = i3 + arrayOfByte39.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 47;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "大城市的一种交通工具，可以把人挤成“相片”".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i48 = i3 + arrayOfByte40.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 54;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "手里没有任何武器".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i49 = i3 + arrayOfByte41.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 54;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte42 = "打击乐器，扁圆形，一面蒙皮，周围有金属片或环，常用做舞蹈的伴奏乐器".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i50 = i3 + arrayOfByte42.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 61;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "比喻失败之后，整顿力量，准备再干".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i51 = i3 + arrayOfByte43.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 63;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "比喻事情一开始就取得成功".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i52 = i3 + arrayOfByte44.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 68;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "我国一家股份制商业银行，成立于1992年8月".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i53 = i3 + arrayOfByte45.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 70;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "我国最大的石油工业基地和重要的石化工业基地".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i54 = i3 + arrayOfByte46.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 70;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "江苏阳澄湖盛产的一种知名水产品".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i55 = i3 + arrayOfByte47.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 75;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte48 = "俄罗斯的一所综合性国立大学，是俄罗斯最大的教学、科研、文化中心".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i56 = i3 + arrayOfByte48.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 75;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "我国的一处世界文化遗产，在甘肃省敦煌市区东南鸣沙山东麓，俗称千佛洞".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i57 = i3 + arrayOfByte49.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 82;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte50 = "汪峰的一首歌，首句为“生命就像一条大河，时而宁静时而疯狂”".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i58 = i3 + arrayOfByte50.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 97;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "用人力驱动的两轮交通工具".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i59 = i3 + arrayOfByte51.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/16.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword17()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 22;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "苹果".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        int i9;
        byte[] arrayOfByte6;
        int i10;
        byte[] arrayOfByte7;
        int i11;
        byte[] arrayOfByte8;
        int i12;
        byte[] arrayOfByte9;
        int i13;
        byte[] arrayOfByte10;
        int i14;
        byte[] arrayOfByte11;
        int i15;
        byte[] arrayOfByte12;
        int i16;
        int i17;
        byte[] arrayOfByte13;
        int i18;
        int i19;
        byte[] arrayOfByte14;
        int i20;
        int i21;
        byte[] arrayOfByte15;
        int i22;
        int i23;
        byte[] arrayOfByte16;
        int i24;
        int i25;
        byte[] arrayOfByte17;
        int i26;
        byte[] arrayOfByte18;
        int i27;
        int i28;
        byte[] arrayOfByte19;
        int i29;
        int i30;
        byte[] arrayOfByte20;
        int i31;
        byte[] arrayOfByte21;
        int i32;
        int i33;
        byte[] arrayOfByte22;
        int i34;
        byte[] arrayOfByte23;
        int i35;
        byte[] arrayOfByte24;
        int i36;
        byte[] arrayOfByte25;
        int i37;
        int i38;
        byte[] arrayOfByte26;
        int i39;
        byte[] arrayOfByte27;
        int i40;
        int i41;
        byte[] arrayOfByte28;
        int i42;
        byte[] arrayOfByte29;
        int i43;
        int i44;
        byte[] arrayOfByte30;
        int i45;
        byte[] arrayOfByte31;
        int i46;
        byte[] arrayOfByte32;
        int i47;
        byte[] arrayOfByte33;
        int i48;
        byte[] arrayOfByte34;
        int i49;
        byte[] arrayOfByte35;
        int i50;
        byte[] arrayOfByte36;
        int i51;
        byte[] arrayOfByte37;
        int i52;
        byte[] arrayOfByte38;
        int i53;
        byte[] arrayOfByte39;
        int i54;
        byte[] arrayOfByte40;
        int i55;
        byte[] arrayOfByte41;
        int i56;
        byte[] arrayOfByte42;
        int i57;
        byte[] arrayOfByte43;
        int i58;
        byte[] arrayOfByte44;
        int i59;
        byte[] arrayOfByte45;
        int i60;
        byte[] arrayOfByte46;
        int i61;
        byte[] arrayOfByte47;
        int i62;
        byte[] arrayOfByte48;
        int i63;
        byte[] arrayOfByte49;
        int i64;
        byte[] arrayOfByte50;
        int i65;
        byte[] arrayOfByte51;
        int i66;
        byte[] arrayOfByte52;
        int i67;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "富".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte5 = "程".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i4, arrayOfByte5.length);
          i8 = arrayOfByte5.length;
          i9 = i4 + i8;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          arrayOfByte6 = "菩".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i10 = i3 + arrayOfByte6.length;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          arrayOfByte7 = "戈".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
          i11 = i3 + arrayOfByte7.length;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          arrayOfByte8 = "布兰妮".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i12 = i3 + arrayOfByte8.length;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte9 = "普拉提心理学".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i13 = i3 + arrayOfByte9.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte10 = "克".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i14 = i3 + arrayOfByte10.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte11 = "贾".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i15 = i3 + arrayOfByte11.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte12 = "本灵".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i4, arrayOfByte12.length);
          i16 = arrayOfByte12.length;
          i17 = i4 + i16;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte13 = "枪林弹雨".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i18 = arrayOfByte13.length;
          i19 = i4 + i18;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte14 = "无鸡飞蛋打".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i4, arrayOfByte14.length);
          i20 = arrayOfByte14.length;
          i21 = i4 + i20;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte15 = "村上春树汤".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i4, arrayOfByte15.length);
          i22 = arrayOfByte15.length;
          i23 = i4 + i22;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte16 = "出".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i4, arrayOfByte16.length);
          i24 = arrayOfByte16.length;
          i25 = i4 + i24;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte17 = "月".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i26 = i3 + arrayOfByte17.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte18 = "节".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i4, arrayOfByte18.length);
          i27 = arrayOfByte18.length;
          i28 = i4 + i27;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte19 = "洛".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i4, arrayOfByte19.length);
          i29 = arrayOfByte19.length;
          i30 = i4 + i29;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte20 = "头头是道".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i31 = i3 + arrayOfByte20.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte21 = "乱太阳神鸟".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i4, arrayOfByte21.length);
          i32 = arrayOfByte21.length;
          i33 = i4 + i32;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte22 = "故".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i34 = i3 + arrayOfByte22.length;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          arrayOfByte23 = "草裙舞".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i35 = i3 + arrayOfByte23.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          arrayOfByte24 = "纸".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i36 = i3 + arrayOfByte24.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte25 = "回乡偶书".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i4, arrayOfByte25.length);
          i37 = arrayOfByte25.length;
          i38 = i4 + i37;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          arrayOfByte26 = "春杨贵妃".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i39 = i3 + arrayOfByte26.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte27 = "明".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i4, arrayOfByte27.length);
          i40 = arrayOfByte27.length;
          i41 = i4 + i40;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte28 = "秋".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i42 = i3 + arrayOfByte28.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte29 = "世界知名科技公司，旗下产品有MAC、iPhone、iPad等".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i4, arrayOfByte29.length);
          i43 = arrayOfByte29.length;
          i44 = i4 + i43;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte30 = "俄国著名作家，代表作有《死魂灵》、《钦差大臣》等".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i45 = i3 + arrayOfByte30.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 4;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "18世纪美国一位科学家、政治家和文学家；避雷针的发明者".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i46 = i3 + arrayOfByte31.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "东汉末年东吴的武将，历仕孙坚、孙策、孙权三任君主。在东吴诸将中年岁最长，被尊称为“程公”".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i47 = i3 + arrayOfByte32.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "唐代僧人慧能所作名偈（佛诗）的一句，下句为“明镜亦非台”".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i48 = i3 + arrayOfByte33.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 13;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte34 = "美国当红女歌星，绰号“小甜甜”".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i49 = i3 + arrayOfByte34.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 17;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte35 = "一种舒缓全身肌肉及提高人体躯干控制能力的健身方式，起源于德国".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i50 = i3 + arrayOfByte35.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte36 = "研究心理规律的科学".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i51 = i3 + arrayOfByte36.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte37 = "世界上最畅销的系列读物之一，为读者讲述了一个个充满哲理的小故事".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i52 = i3 + arrayOfByte37.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 26;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "《红楼梦》中人物，曾担任过林黛玉的家庭教师".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i53 = i3 + arrayOfByte38.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 33;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "形容战斗激烈".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i54 = i3 + arrayOfByte39.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 33;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "比喻首先打击或惩办带头的人".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i55 = i3 + arrayOfByte40.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "比喻两头落空，一无所得".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i56 = i3 + arrayOfByte41.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 46;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "日本当代著名作家，作品有《挪威的森林》、《1Q84》等".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i57 = i3 + arrayOfByte42.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 48;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "我国最盛大、最热闹的一个传统节日".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i58 = i3 + arrayOfByte43.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 55;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "杜甫《月夜忆舍弟》中“露从今夜白”的下句".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i59 = i3 + arrayOfByte44.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 61;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "比喻著作有价值，流传广".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i60 = i3 + arrayOfByte45.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 63;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "形容说话或做事很有条理".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i61 = i3 + arrayOfByte46.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 69;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "周杰伦专辑《七里香》中的一首歌，讲述歌手乘坐时光机回到三国时期的情景".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i62 = i3 + arrayOfByte47.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 70;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte48 = "中国文化遗产标志，源于金沙遗址的出土文物".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i63 = i3 + arrayOfByte48.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 77;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "夏威夷的特色舞蹈".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i64 = i3 + arrayOfByte49.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 77;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "一种书法字体，特点是笔画相连，书写时速度快".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i65 = i3 + arrayOfByte50.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 84;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "贺知章的一首七绝，是一首久客异乡，返回故里的感怀诗".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i66 = i3 + arrayOfByte51.length;
          i3 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 90;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "我国古代“四大美女”之一".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i67 = i3 + arrayOfByte52.length;
          i3 = i67 + 1;
          arrayOfByte1[i67] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/17.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword18()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 23;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "加".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        byte[] arrayOfByte4 = "扎".getBytes("GBK");
        System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i3, arrayOfByte4.length);
        int i6 = i3 + arrayOfByte4.length;
        i3 = i6 + 1;
        arrayOfByte1[i6] = 0;
        byte[] arrayOfByte5 = "倒车雷达".getBytes("GBK");
        System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
        int i7 = i3 + arrayOfByte5.length;
        i3 = i7 + 1;
        arrayOfByte1[i7] = 0;
        byte[] arrayOfByte6 = "大勒沃库森".getBytes("GBK");
        System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
        int i8 = i3 + arrayOfByte6.length;
        i3 = i8 + 1;
        arrayOfByte1[i8] = 0;
        byte[] arrayOfByte7 = "水".getBytes("GBK");
        System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
        int i9 = i3 + arrayOfByte7.length;
        i3 = i9 + 1;
        arrayOfByte1[i9] = 0;
        byte[] arrayOfByte8 = "芬兰浴比".getBytes("GBK");
        System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
        int i10 = i3 + arrayOfByte8.length;
        i3 = i10 + 1;
        arrayOfByte1[i10] = 0;
        byte[] arrayOfByte9 = "米".getBytes("GBK");
        System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
        int i11 = i3 + arrayOfByte9.length;
        i3 = i11 + 1;
        arrayOfByte1[i11] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte10;
        int i12;
        int i13;
        byte[] arrayOfByte11;
        int i14;
        byte[] arrayOfByte12;
        int i15;
        byte[] arrayOfByte13;
        int i16;
        int i17;
        byte[] arrayOfByte14;
        int i18;
        byte[] arrayOfByte15;
        int i19;
        byte[] arrayOfByte16;
        int i20;
        byte[] arrayOfByte17;
        int i21;
        byte[] arrayOfByte18;
        int i22;
        byte[] arrayOfByte19;
        int i23;
        byte[] arrayOfByte20;
        int i24;
        byte[] arrayOfByte21;
        int i25;
        byte[] arrayOfByte22;
        int i26;
        byte[] arrayOfByte23;
        int i27;
        byte[] arrayOfByte24;
        int i28;
        byte[] arrayOfByte25;
        int i29;
        byte[] arrayOfByte26;
        int i30;
        byte[] arrayOfByte27;
        int i31;
        byte[] arrayOfByte28;
        int i32;
        int i33;
        byte[] arrayOfByte29;
        int i34;
        int i35;
        byte[] arrayOfByte30;
        int i36;
        byte[] arrayOfByte31;
        int i37;
        int i38;
        byte[] arrayOfByte32;
        int i39;
        byte[] arrayOfByte33;
        int i40;
        byte[] arrayOfByte34;
        int i41;
        byte[] arrayOfByte35;
        int i42;
        byte[] arrayOfByte36;
        int i43;
        byte[] arrayOfByte37;
        int i44;
        byte[] arrayOfByte38;
        int i45;
        byte[] arrayOfByte39;
        int i46;
        byte[] arrayOfByte40;
        int i47;
        byte[] arrayOfByte41;
        int i48;
        byte[] arrayOfByte42;
        int i49;
        byte[] arrayOfByte43;
        int i50;
        byte[] arrayOfByte44;
        int i51;
        byte[] arrayOfByte45;
        int i52;
        byte[] arrayOfByte46;
        int i53;
        byte[] arrayOfByte47;
        int i54;
        byte[] arrayOfByte48;
        int i55;
        byte[] arrayOfByte49;
        int i56;
        byte[] arrayOfByte50;
        int i57;
        byte[] arrayOfByte51;
        int i58;
        byte[] arrayOfByte52;
        int i59;
        byte[] arrayOfByte53;
        int i60;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte10 = "马".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i4, arrayOfByte10.length);
          i12 = arrayOfByte10.length;
          i13 = i4 + i12;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte11 = "奇".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i14 = i3 + arrayOfByte11.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte12 = "女海".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i15 = i3 + arrayOfByte12.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte13 = "笔走龙蛇".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i16 = arrayOfByte13.length;
          i17 = i4 + i16;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          arrayOfByte14 = "李".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i18 = i3 + arrayOfByte14.length;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte15 = "盗墓笔记".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i19 = i3 + arrayOfByte15.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte16 = "长白山".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i20 = i3 + arrayOfByte16.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte17 = "本是同根生".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i21 = i3 + arrayOfByte17.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte18 = "寨华锐风电".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i22 = i3 + arrayOfByte18.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte19 = "居".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i23 = i3 + arrayOfByte19.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          arrayOfByte20 = "界".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i24 = i3 + arrayOfByte20.length;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          arrayOfByte21 = "机".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i25 = i3 + arrayOfByte21.length;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte22 = "意".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i26 = i3 + arrayOfByte22.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          arrayOfByte23 = "脑".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i27 = i3 + arrayOfByte23.length;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          arrayOfByte24 = "长江".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i28 = i3 + arrayOfByte24.length;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte25 = "齐".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i29 = i3 + arrayOfByte25.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte26 = "二进制".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i30 = i3 + arrayOfByte26.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte27 = "比干".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i31 = i3 + arrayOfByte27.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte28 = "达".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i4, arrayOfByte28.length);
          i32 = arrayOfByte28.length;
          i33 = i4 + i32;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte29 = "取".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i4, arrayOfByte29.length);
          i34 = arrayOfByte29.length;
          i35 = i4 + i34;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte30 = "里约热内卢".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i36 = i3 + arrayOfByte30.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 2;
          arrayOfByte31 = "约翰尼.德普主演的系列冒险影片，最近推出了第4部".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i4, arrayOfByte31.length);
          i37 = arrayOfByte31.length;
          i38 = i4 + i37;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 2;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "2010年南非世界杯吉祥物".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i39 = i3 + arrayOfByte32.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 4;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte33 = "辅助汽车倒车、泊位的电子产品，司机无需回头便可知车后有无障碍物".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i40 = i3 + arrayOfByte33.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "形容来往车马很多，连续不断的热闹情景".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i41 = i3 + arrayOfByte34.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "意大利文艺复兴时期著名画家、科学家".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i42 = i3 + arrayOfByte35.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "著名女作家铁凝的一部长篇小说".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i43 = i3 + arrayOfByte36.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 10;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "德甲传统强队，主场为拜耳竞技场".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i44 = i3 + arrayOfByte37.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 17;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte38 = "以一个欧洲国家命名的洗浴方式，也称“桑拿浴”".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i45 = i3 + arrayOfByte38.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 33;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "形容书法笔势雄健活泼".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i46 = i3 + arrayOfByte39.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 33;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "便携式电脑的俗称".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i47 = i3 + arrayOfByte40.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 38;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "唐代伟大的浪漫主义诗人，号“青莲居士”".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i48 = i3 + arrayOfByte41.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "畅销小说，作者南派三叔".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i49 = i3 + arrayOfByte42.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 47;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "吉林省东部的一座山，为我国重要林区，特产人参".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i50 = i3 + arrayOfByte43.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 47;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "热门网络玄幻小说，作者辰东".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i51 = i3 + arrayOfByte44.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 49;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "指一些价格低廉、功能齐全的贴牌手机和名称五花八门的杂牌手机".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i52 = i3 + arrayOfByte45.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 53;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "曹植《七步诗》中“相煎何太急”的上句".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i53 = i3 + arrayOfByte46.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "今年在A股上市的一家风电企业，上市首日“血洗”打新者。股票代码：601558".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i54 = i3 + arrayOfByte47.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 61;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "意志坚决地追求上进，力图有所作为".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i55 = i3 + arrayOfByte48.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 75;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "我国和亚洲第一大河".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i56 = i3 + arrayOfByte49.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 78;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "法国足球明星，在2006年世界杯决赛中因顶人被红牌罚下".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i57 = i3 + arrayOfByte50.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 80;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "一种数位进制，广泛应用在电子计算机的计算中".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i58 = i3 + arrayOfByte51.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 84;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "商代名相，相传被纣王剖心".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i59 = i3 + arrayOfByte52.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 95;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte53 = "巴西第二大城市，全国最大进口港，南美洲著名旅游胜地".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i60 = i3 + arrayOfByte53.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/18.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword19()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 24;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "故宫".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        byte[] arrayOfByte4 = "发烧友".getBytes("GBK");
        System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i3, arrayOfByte4.length);
        int i6 = i3 + arrayOfByte4.length;
        i3 = i6 + 1;
        arrayOfByte1[i6] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte5;
        int i7;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        byte[] arrayOfByte7;
        int i10;
        int i11;
        byte[] arrayOfByte8;
        int i12;
        int i13;
        byte[] arrayOfByte9;
        int i14;
        int i15;
        byte[] arrayOfByte10;
        int i16;
        byte[] arrayOfByte11;
        int i17;
        byte[] arrayOfByte12;
        int i18;
        byte[] arrayOfByte13;
        int i19;
        byte[] arrayOfByte14;
        int i20;
        int i21;
        byte[] arrayOfByte15;
        int i22;
        byte[] arrayOfByte16;
        int i23;
        byte[] arrayOfByte17;
        int i24;
        int i25;
        byte[] arrayOfByte18;
        int i26;
        int i27;
        byte[] arrayOfByte19;
        int i28;
        byte[] arrayOfByte20;
        int i29;
        byte[] arrayOfByte21;
        int i30;
        int i31;
        byte[] arrayOfByte22;
        int i32;
        byte[] arrayOfByte23;
        int i33;
        byte[] arrayOfByte24;
        int i34;
        byte[] arrayOfByte25;
        int i35;
        byte[] arrayOfByte26;
        int i36;
        int i37;
        byte[] arrayOfByte27;
        int i38;
        byte[] arrayOfByte28;
        int i39;
        int i40;
        byte[] arrayOfByte29;
        int i41;
        byte[] arrayOfByte30;
        int i42;
        byte[] arrayOfByte31;
        int i43;
        int i44;
        byte[] arrayOfByte32;
        int i45;
        byte[] arrayOfByte33;
        int i46;
        byte[] arrayOfByte34;
        int i47;
        byte[] arrayOfByte35;
        int i48;
        byte[] arrayOfByte36;
        int i49;
        byte[] arrayOfByte37;
        int i50;
        byte[] arrayOfByte38;
        int i51;
        byte[] arrayOfByte39;
        int i52;
        byte[] arrayOfByte40;
        int i53;
        byte[] arrayOfByte41;
        int i54;
        byte[] arrayOfByte42;
        int i55;
        byte[] arrayOfByte43;
        int i56;
        byte[] arrayOfByte44;
        int i57;
        byte[] arrayOfByte45;
        int i58;
        byte[] arrayOfByte46;
        int i59;
        byte[] arrayOfByte47;
        int i60;
        byte[] arrayOfByte48;
        int i61;
        byte[] arrayOfByte49;
        int i62;
        byte[] arrayOfByte50;
        int i63;
        byte[] arrayOfByte51;
        int i64;
        byte[] arrayOfByte52;
        int i65;
        byte[] arrayOfByte53;
        int i66;
        byte[] arrayOfByte54;
        int i67;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte5 = "激".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i4, arrayOfByte5.length);
          i7 = arrayOfByte5.length;
          i8 = i4 + i7;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          arrayOfByte6 = "人".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i9 = i3 + arrayOfByte6.length;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte7 = "如".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i4, arrayOfByte7.length);
          i10 = arrayOfByte7.length;
          i11 = i4 + i10;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte8 = "王侯将相西门吹雪".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i4, arrayOfByte8.length);
          i12 = arrayOfByte8.length;
          i13 = i4 + i12;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte9 = "羲".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i4, arrayOfByte9.length);
          i14 = arrayOfByte9.length;
          i15 = i4 + i14;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte10 = "法".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i16 = i3 + arrayOfByte10.length;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          arrayOfByte11 = "辞".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i17 = i3 + arrayOfByte11.length;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte12 = "一技之长".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i18 = i3 + arrayOfByte12.length;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte13 = "冯黄河大合唱".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i19 = i3 + arrayOfByte13.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte14 = "安意如鹤".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i4, arrayOfByte14.length);
          i20 = arrayOfByte14.length;
          i21 = i4 + i20;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte15 = "兵".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i22 = i3 + arrayOfByte15.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte16 = "一".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i23 = i3 + arrayOfByte16.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte17 = "乱".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i4, arrayOfByte17.length);
          i24 = arrayOfByte17.length;
          i25 = i4 + i24;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte18 = "楼".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i4, arrayOfByte18.length);
          i26 = arrayOfByte18.length;
          i27 = i4 + i26;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          arrayOfByte19 = "小".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i28 = i3 + arrayOfByte19.length;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte20 = "和稀泥".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i29 = i3 + arrayOfByte20.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte21 = "恒".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i4, arrayOfByte21.length);
          i30 = arrayOfByte21.length;
          i31 = i4 + i30;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          arrayOfByte22 = "飞将军".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i32 = i3 + arrayOfByte22.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte23 = "土".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i33 = i3 + arrayOfByte23.length;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte24 = "黄秋生".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i34 = i3 + arrayOfByte24.length;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          arrayOfByte25 = "轮".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i35 = i3 + arrayOfByte25.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte26 = "开元盛世".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i4, arrayOfByte26.length);
          i36 = arrayOfByte26.length;
          i37 = i4 + i36;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          arrayOfByte27 = "指北海道".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i38 = i3 + arrayOfByte27.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte28 = "素".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i4, arrayOfByte28.length);
          i39 = arrayOfByte28.length;
          i40 = i4 + i39;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          arrayOfByte29 = "仁".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i41 = i3 + arrayOfByte29.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          arrayOfByte30 = "数".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i42 = i3 + arrayOfByte30.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte31 = "明、清两代的皇宫。最近爆出丢宝贝、写错字、建会所等新闻，被推上风头浪尖".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i4, arrayOfByte31.length);
          i43 = arrayOfByte31.length;
          i44 = i4 + i43;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "李白诗作《送孟浩然之广陵》中“烟花三月下扬州”的上句".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i45 = i3 + arrayOfByte32.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 3;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte33 = "对某种物品或事情有强烈兴趣的人".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i46 = i3 + arrayOfByte33.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 3;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "周杰伦的一首歌，首句为“狼牙月，伊人憔悴，我举杯饮尽了风雪”".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i47 = i3 + arrayOfByte34.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 8;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "用反话去激人，促使人决心去做事的方法".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i48 = i3 + arrayOfByte35.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 16;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte36 = "泛指封建社会中位尊、禄厚、权重、势大的贵族".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i49 = i3 + arrayOfByte36.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 16;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte37 = "东晋书法家，被后人尊称为“书圣”".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i50 = i3 + arrayOfByte37.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte38 = "古龙武侠小说中一位著名的剑客，是陆小凤的好友".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i51 = i3 + arrayOfByte38.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 34;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "指有某种技能或特长".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i52 = i3 + arrayOfByte39.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 34;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "成语，指相互配合相互呼应".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i53 = i3 + arrayOfByte40.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 37;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "作家韩寒的一部武侠小说".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i54 = i3 + arrayOfByte41.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 39;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte42 = "我国第一位飞机设计师".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i55 = i3 + arrayOfByte42.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "光未然作词，冼星海作曲的著名合唱曲".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i56 = i3 + arrayOfByte43.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 42;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "成龙、王力宏、刘承俊等主演的古装影片".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i57 = i3 + arrayOfByte44.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 47;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte45 = "“80后”畅销书作家，作品有《人生若只如初见》、《惜春记》、《美人何处》等".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i58 = i3 + arrayOfByte45.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 64;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "比喻无原则地用调和、折中的办法处理事情".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i59 = i3 + arrayOfByte46.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 65;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "钪、钇、镧、铈等17种元素的统称，在18世纪，这17种元素都尚未被大量发现因而得名".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i60 = i3 + arrayOfByte47.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 69;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "反映香港股市价幅趋势最有影响的一种股价指数".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i61 = i3 + arrayOfByte48.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 71;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "西汉名将李广的绰号".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i62 = i3 + arrayOfByte49.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 71;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "人气偶像组合，代表歌曲有《小小大人物》、《超喜欢你》等".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i63 = i3 + arrayOfByte50.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 77;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "香港男明星，主演的影片有《无间道》、《金钱帝国》、《老港正传》等".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i64 = i3 + arrayOfByte51.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 77;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte52 = "《白毛女》中一个主要反派角色，为富不仁横祸乡里的恶霸".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i65 = i3 + arrayOfByte52.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 84;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte53 = "唐玄宗统治前期所开创的一个国势强盛的时代".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i66 = i3 + arrayOfByte53.length;
          i3 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 90;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte54 = "日本第二大岛，海洋渔业、伐木业、乳牛业在全国占首要地位".getBytes("GBK");
          System.arraycopy(arrayOfByte54, 0, arrayOfByte1, i3, arrayOfByte54.length);
          i67 = i3 + arrayOfByte54.length;
          i3 = i67 + 1;
          arrayOfByte1[i67] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/19.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword2()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 2;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "华南理工大学".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        byte[] arrayOfByte4 = "十".getBytes("GBK");
        System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i3, arrayOfByte4.length);
        int i6 = i3 + arrayOfByte4.length;
        i3 = i6 + 1;
        arrayOfByte1[i6] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte5;
        int i7;
        byte[] arrayOfByte6;
        int i8;
        int i9;
        byte[] arrayOfByte7;
        int i10;
        int i11;
        byte[] arrayOfByte8;
        int i12;
        byte[] arrayOfByte9;
        int i13;
        byte[] arrayOfByte10;
        int i14;
        int i15;
        byte[] arrayOfByte11;
        int i16;
        byte[] arrayOfByte12;
        int i17;
        byte[] arrayOfByte13;
        int i18;
        int i19;
        byte[] arrayOfByte14;
        int i20;
        byte[] arrayOfByte15;
        int i21;
        byte[] arrayOfByte16;
        int i22;
        byte[] arrayOfByte17;
        int i23;
        byte[] arrayOfByte18;
        int i24;
        byte[] arrayOfByte19;
        int i25;
        byte[] arrayOfByte20;
        int i26;
        int i27;
        byte[] arrayOfByte21;
        int i28;
        int i29;
        byte[] arrayOfByte22;
        int i30;
        int i31;
        byte[] arrayOfByte23;
        int i32;
        byte[] arrayOfByte24;
        int i33;
        byte[] arrayOfByte25;
        int i34;
        byte[] arrayOfByte26;
        int i35;
        byte[] arrayOfByte27;
        int i36;
        byte[] arrayOfByte28;
        int i37;
        byte[] arrayOfByte29;
        int i38;
        byte[] arrayOfByte30;
        int i39;
        byte[] arrayOfByte31;
        int i40;
        byte[] arrayOfByte32;
        int i41;
        byte[] arrayOfByte33;
        int i42;
        byte[] arrayOfByte34;
        int i43;
        byte[] arrayOfByte35;
        int i44;
        byte[] arrayOfByte36;
        int i45;
        byte[] arrayOfByte37;
        int i46;
        byte[] arrayOfByte38;
        int i47;
        byte[] arrayOfByte39;
        int i48;
        byte[] arrayOfByte40;
        int i49;
        byte[] arrayOfByte41;
        int i50;
        byte[] arrayOfByte42;
        int i51;
        byte[] arrayOfByte43;
        int i52;
        byte[] arrayOfByte44;
        int i53;
        byte[] arrayOfByte45;
        int i54;
        byte[] arrayOfByte46;
        int i55;
        byte[] arrayOfByte47;
        int i56;
        byte[] arrayOfByte48;
        int i57;
        byte[] arrayOfByte49;
        int i58;
        byte[] arrayOfByte50;
        int i59;
        byte[] arrayOfByte51;
        int i60;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte5 = "方".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
          i7 = i3 + arrayOfByte5.length;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte6 = "西".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i4, arrayOfByte6.length);
          i8 = arrayOfByte6.length;
          i9 = i4 + i8;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte7 = "万".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i4, arrayOfByte7.length);
          i10 = arrayOfByte7.length;
          i11 = i4 + i10;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          arrayOfByte8 = "柏".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i12 = i3 + arrayOfByte8.length;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte9 = "周".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i13 = i3 + arrayOfByte9.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte10 = "洋葱".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i4, arrayOfByte10.length);
          i14 = arrayOfByte10.length;
          i15 = i4 + i14;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte11 = "火".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i16 = i3 + arrayOfByte11.length;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          arrayOfByte12 = "林本末倒置".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i17 = i3 + arrayOfByte12.length;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte13 = "狗急跳墙来".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i18 = arrayOfByte13.length;
          i19 = i4 + i18;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte14 = "数".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i20 = i3 + arrayOfByte14.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          arrayOfByte15 = "平".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i21 = i3 + arrayOfByte15.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte16 = "不".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i22 = i3 + arrayOfByte16.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte17 = "无".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i23 = i3 + arrayOfByte17.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte18 = "安全理事会".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i24 = i3 + arrayOfByte18.length;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          arrayOfByte19 = "一千零一夜".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i25 = i3 + arrayOfByte19.length;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte20 = "在".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i4, arrayOfByte20.length);
          i26 = arrayOfByte20.length;
          i27 = i4 + i26;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte21 = "物".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i4, arrayOfByte21.length);
          i28 = arrayOfByte21.length;
          i29 = i4 + i28;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte22 = "氧".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i4, arrayOfByte22.length);
          i30 = arrayOfByte22.length;
          i31 = i4 + i30;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte23 = "人之初".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i32 = i3 + arrayOfByte23.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte24 = "格式化".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i33 = i3 + arrayOfByte24.length;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte25 = "冷".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i34 = i3 + arrayOfByte25.length;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          arrayOfByte26 = "为".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i35 = i3 + arrayOfByte26.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          arrayOfByte27 = "恋天伦".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i36 = i3 + arrayOfByte27.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          arrayOfByte28 = "碳酸饮料".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i37 = i3 + arrayOfByte28.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte29 = "一所位于广州的高等学府".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i38 = i3 + arrayOfByte29.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte30 = "国内著名周报".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i39 = i3 + arrayOfByte30.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 4;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "位干美洲、欧洲和非洲之间的大洋".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i40 = i3 + arrayOfByte31.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "形容事情紧急到了极点".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i41 = i3 + arrayOfByte32.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 19;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "一曾分隔东西柏林的建筑".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i42 = i3 + arrayOfByte33.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 24;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte34 = "一种蔬菜".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i43 = i3 + arrayOfByte34.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 30;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte35 = "指颠倒主次".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i44 = i3 + arrayOfByte35.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 30;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "六祖慧能的一句佛偈".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i45 = i3 + arrayOfByte36.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 32;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte37 = "和原数的乘积等干1的数".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i46 = i3 + arrayOfByte37.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 36;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte38 = "走投无路时不顾一切的行动".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i47 = i3 + arrayOfByte38.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 36;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte39 = "天津著名食品".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i48 = i3 + arrayOfByte39.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 44;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "西方圣诞节的前夜".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i49 = i3 + arrayOfByte40.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 54;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "联合国的一个重要机构".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i50 = i3 + arrayOfByte41.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "(天方夜谭)的别名".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i51 = i3 + arrayOfByte42.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 57;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "指事情能否成功，取决干人是否努力去做".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i52 = i3 + arrayOfByte43.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 63;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "有毒气体，煤气的主要成分之一".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i53 = i3 + arrayOfByte44.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 77;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte45 = "(三字经)中“性本善”的前一句".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i54 = i3 + arrayOfByte45.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 79;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte46 = "第一次恋爱".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i55 = i3 + arrayOfByte46.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 81;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "对电脑磁盘进行的一种操作".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i56 = i3 + arrayOfByte47.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 81;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "在1998年重返太空的高龄太空人".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i57 = i3 + arrayOfByte48.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 85;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "冰冻的饮料".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i58 = i3 + arrayOfByte49.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 90;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte50 = "指父子、兄弟等关系的书面语".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i59 = i3 + arrayOfByte50.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 93;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "汽水、可乐等有汽饮品的统称".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i60 = i3 + arrayOfByte51.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/2.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword20()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 25;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "最爱".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        byte[] arrayOfByte5;
        int i7;
        byte[] arrayOfByte6;
        int i8;
        byte[] arrayOfByte7;
        int i9;
        int i10;
        byte[] arrayOfByte8;
        int i11;
        byte[] arrayOfByte9;
        int i12;
        int i13;
        byte[] arrayOfByte10;
        int i14;
        byte[] arrayOfByte11;
        int i15;
        byte[] arrayOfByte12;
        int i16;
        byte[] arrayOfByte13;
        int i17;
        int i18;
        byte[] arrayOfByte14;
        int i19;
        byte[] arrayOfByte15;
        int i20;
        byte[] arrayOfByte16;
        int i21;
        byte[] arrayOfByte17;
        int i22;
        byte[] arrayOfByte18;
        int i23;
        byte[] arrayOfByte19;
        int i24;
        int i25;
        byte[] arrayOfByte20;
        int i26;
        byte[] arrayOfByte21;
        int i27;
        byte[] arrayOfByte22;
        int i28;
        byte[] arrayOfByte23;
        int i29;
        int i30;
        byte[] arrayOfByte24;
        int i31;
        byte[] arrayOfByte25;
        int i32;
        byte[] arrayOfByte26;
        int i33;
        byte[] arrayOfByte27;
        int i34;
        int i35;
        byte[] arrayOfByte28;
        int i36;
        byte[] arrayOfByte29;
        int i37;
        int i38;
        byte[] arrayOfByte30;
        int i39;
        byte[] arrayOfByte31;
        int i40;
        byte[] arrayOfByte32;
        int i41;
        byte[] arrayOfByte33;
        int i42;
        byte[] arrayOfByte34;
        int i43;
        byte[] arrayOfByte35;
        int i44;
        byte[] arrayOfByte36;
        int i45;
        byte[] arrayOfByte37;
        int i46;
        byte[] arrayOfByte38;
        int i47;
        byte[] arrayOfByte39;
        int i48;
        byte[] arrayOfByte40;
        int i49;
        byte[] arrayOfByte41;
        int i50;
        byte[] arrayOfByte42;
        int i51;
        byte[] arrayOfByte43;
        int i52;
        byte[] arrayOfByte44;
        int i53;
        byte[] arrayOfByte45;
        int i54;
        byte[] arrayOfByte46;
        int i55;
        byte[] arrayOfByte47;
        int i56;
        byte[] arrayOfByte48;
        int i57;
        byte[] arrayOfByte49;
        int i58;
        byte[] arrayOfByte50;
        int i59;
        byte[] arrayOfByte51;
        int i60;
        byte[] arrayOfByte52;
        int i61;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte4 = "周瑜打黄盖后".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i3, arrayOfByte4.length);
          i6 = i3 + arrayOfByte4.length;
          i3 = i6 + 1;
          arrayOfByte1[i6] = 0;
          arrayOfByte5 = "武林外传".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
          i7 = i3 + arrayOfByte5.length;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte6 = "蛇".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i8 = i3 + arrayOfByte6.length;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte7 = "的".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i4, arrayOfByte7.length);
          i9 = arrayOfByte7.length;
          i10 = i4 + i9;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          arrayOfByte8 = "则".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i11 = i3 + arrayOfByte8.length;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte9 = "雄".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i4, arrayOfByte9.length);
          i12 = arrayOfByte9.length;
          i13 = i4 + i12;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte10 = "打".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i14 = i3 + arrayOfByte10.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte11 = "十晚来天欲雪".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i15 = i3 + arrayOfByte11.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte12 = "横七竖八餐".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i16 = i3 + arrayOfByte12.length;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte13 = "望".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i17 = arrayOfByte13.length;
          i18 = i4 + i17;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte14 = "霸".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i19 = i3 + arrayOfByte14.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte15 = "寸".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i20 = i3 + arrayOfByte15.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          arrayOfByte16 = "般".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i21 = i3 + arrayOfByte16.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte17 = "洞".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i22 = i3 + arrayOfByte17.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte18 = "都铎王朝".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i23 = i3 + arrayOfByte18.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte19 = "武门庭若市".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i4, arrayOfByte19.length);
          i24 = arrayOfByte19.length;
          i25 = i4 + i24;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte20 = "别".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i26 = i3 + arrayOfByte20.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          arrayOfByte21 = "手工艺".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i27 = i3 + arrayOfByte21.length;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          arrayOfByte22 = "湖".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i28 = i3 + arrayOfByte22.length;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte23 = "泰姬陵".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i4, arrayOfByte23.length);
          i29 = arrayOfByte23.length;
          i30 = i4 + i29;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte24 = "程".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i31 = i3 + arrayOfByte24.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte25 = "令".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i32 = i3 + arrayOfByte25.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte26 = "戈".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i33 = i3 + arrayOfByte26.length;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte27 = "李师师伊斯坦布尔".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i4, arrayOfByte27.length);
          i34 = arrayOfByte27.length;
          i35 = i4 + i34;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          arrayOfByte28 = "王刚".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i36 = i3 + arrayOfByte28.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte29 = "顾长卫导演，郭富城、章子怡领衔主演的爱情电影".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i4, arrayOfByte29.length);
          i37 = arrayOfByte29.length;
          i38 = i4 + i37;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte30 = "达.芬奇的一幅名画，作于1495-1497年".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i39 = i3 + arrayOfByte30.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte31 = "比喻两厢情愿".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i40 = i3 + arrayOfByte31.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "男歌手，代表歌曲有《哈萨雅琪》、《我的心太乱》等".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i41 = i3 + arrayOfByte32.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "比喻说话做事必须抓住主要环节".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i42 = i3 + arrayOfByte33.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 12;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte34 = "古装电视喜剧，主要人物有佟湘玉、白展堂、吕秀才等".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i43 = i3 + arrayOfByte34.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 12;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "我国古代一位女皇帝".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i44 = i3 + arrayOfByte35.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 29;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "王力宏的一张专辑，收录了《柴米油盐酱醋茶》、《你不知道的事》等歌曲".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i45 = i3 + arrayOfByte36.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 30;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "白居易《问刘十九》中“能饮一杯无”的上句".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i46 = i3 + arrayOfByte37.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 33;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "一部美国连续剧，讲述曼哈顿四个单身女人的故事".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i47 = i3 + arrayOfByte38.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 36;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "有的横，有的竖，杂乱无章。形容纵横杂乱".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i48 = i3 + arrayOfByte39.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 45;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "陈凯歌导演，张国荣、张丰毅、巩俐等主演的一部经典影片".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i49 = i3 + arrayOfByte40.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 51;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "我国的一个淡水湖泊，位于湖南省岳阳市南".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i50 = i3 + arrayOfByte41.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 53;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "英国的封建王朝。1485年由都铎家族的亨利(即“亨利七世”)结束玫瑰战争后建立".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i51 = i3 + arrayOfByte42.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "形容来的人很多，非常热闹".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i52 = i3 + arrayOfByte43.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 67;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte44 = "指具有高度技巧性、艺术性的手工，如挑花、刺绣等".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i53 = i3 + arrayOfByte44.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 68;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "技术干部的职务名称之一".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i54 = i3 + arrayOfByte45.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 74;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "印度古陵墓，世界七大建筑奇迹之一".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i55 = i3 + arrayOfByte46.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 74;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "印度著名诗人，1913年获诺贝尔文学奖".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i56 = i3 + arrayOfByte47.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 82;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "称对方女婿的敬词".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i57 = i3 + arrayOfByte48.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 87;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "北宋末年的名妓，传说她与宋徽宗有过一段风流韵事".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i58 = i3 + arrayOfByte49.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 87;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "网络流行语：我爸是____".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i59 = i3 + arrayOfByte50.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 90;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "土耳其最大城市和港口，是世界上唯一地跨两大洲(亚、欧)的城市".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i60 = i3 + arrayOfByte51.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 96;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "有“和珅专业户”之称的著名演员".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i61 = i3 + arrayOfByte52.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/20.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword21()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 32;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "青瓷".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        byte[] arrayOfByte7;
        int i10;
        byte[] arrayOfByte8;
        int i11;
        byte[] arrayOfByte9;
        int i12;
        byte[] arrayOfByte10;
        int i13;
        int i14;
        byte[] arrayOfByte11;
        int i15;
        byte[] arrayOfByte12;
        int i16;
        byte[] arrayOfByte13;
        int i17;
        int i18;
        byte[] arrayOfByte14;
        int i19;
        byte[] arrayOfByte15;
        int i20;
        int i21;
        byte[] arrayOfByte16;
        int i22;
        byte[] arrayOfByte17;
        int i23;
        byte[] arrayOfByte18;
        int i24;
        byte[] arrayOfByte19;
        int i25;
        byte[] arrayOfByte20;
        int i26;
        int i27;
        byte[] arrayOfByte21;
        int i28;
        byte[] arrayOfByte22;
        int i29;
        int i30;
        byte[] arrayOfByte23;
        int i31;
        byte[] arrayOfByte24;
        int i32;
        byte[] arrayOfByte25;
        int i33;
        byte[] arrayOfByte26;
        int i34;
        byte[] arrayOfByte27;
        int i35;
        int i36;
        byte[] arrayOfByte28;
        int i37;
        int i38;
        byte[] arrayOfByte29;
        int i39;
        byte[] arrayOfByte30;
        int i40;
        byte[] arrayOfByte31;
        int i41;
        byte[] arrayOfByte32;
        int i42;
        int i43;
        byte[] arrayOfByte33;
        int i44;
        byte[] arrayOfByte34;
        int i45;
        byte[] arrayOfByte35;
        int i46;
        byte[] arrayOfByte36;
        int i47;
        byte[] arrayOfByte37;
        int i48;
        byte[] arrayOfByte38;
        int i49;
        byte[] arrayOfByte39;
        int i50;
        byte[] arrayOfByte40;
        int i51;
        byte[] arrayOfByte41;
        int i52;
        byte[] arrayOfByte42;
        int i53;
        byte[] arrayOfByte43;
        int i54;
        byte[] arrayOfByte44;
        int i55;
        byte[] arrayOfByte45;
        int i56;
        byte[] arrayOfByte46;
        int i57;
        byte[] arrayOfByte47;
        int i58;
        byte[] arrayOfByte48;
        int i59;
        byte[] arrayOfByte49;
        int i60;
        byte[] arrayOfByte50;
        int i61;
        byte[] arrayOfByte51;
        int i62;
        byte[] arrayOfByte52;
        int i63;
        byte[] arrayOfByte53;
        int i64;
        byte[] arrayOfByte54;
        int i65;
        byte[] arrayOfByte55;
        int i66;
        byte[] arrayOfByte56;
        int i67;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "倪震".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte5 = "明".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
          i8 = i3 + arrayOfByte5.length;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          arrayOfByte6 = "剪天".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i9 = i3 + arrayOfByte6.length;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          arrayOfByte7 = "张".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
          i10 = i3 + arrayOfByte7.length;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          arrayOfByte8 = "虹".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i11 = i3 + arrayOfByte8.length;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          arrayOfByte9 = "圆月弯刀无人信高洁".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i12 = i3 + arrayOfByte9.length;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte10 = "几".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i4, arrayOfByte10.length);
          i13 = arrayOfByte10.length;
          i14 = i4 + i13;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte11 = "差片".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i15 = i3 + arrayOfByte11.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte12 = "哲".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i16 = i3 + arrayOfByte12.length;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte13 = "四".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i17 = arrayOfByte13.length;
          i18 = i4 + i17;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte14 = "时".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i19 = i3 + arrayOfByte14.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte15 = "云南".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i4, arrayOfByte15.length);
          i20 = arrayOfByte15.length;
          i21 = i4 + i20;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte16 = "野百合也有春天".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i22 = i3 + arrayOfByte16.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte17 = "派".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i23 = i3 + arrayOfByte17.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          arrayOfByte18 = "寺".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i24 = i3 + arrayOfByte18.length;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          arrayOfByte19 = "院".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i25 = i3 + arrayOfByte19.length;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte20 = "之".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i4, arrayOfByte20.length);
          i26 = arrayOfByte20.length;
          i27 = i4 + i26;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          arrayOfByte21 = "第三个人".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i28 = i3 + arrayOfByte21.length;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte22 = "口".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i4, arrayOfByte22.length);
          i29 = arrayOfByte22.length;
          i30 = i4 + i29;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte23 = "歌德".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i31 = i3 + arrayOfByte23.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          arrayOfByte24 = "叔".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i32 = i3 + arrayOfByte24.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte25 = "来的都是客".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i33 = i3 + arrayOfByte25.length;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte26 = "川".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i34 = i3 + arrayOfByte26.length;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte27 = "多少".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i4, arrayOfByte27.length);
          i35 = arrayOfByte27.length;
          i36 = i4 + i35;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte28 = "心".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i4, arrayOfByte28.length);
          i37 = arrayOfByte28.length;
          i38 = i4 + i37;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          arrayOfByte29 = "回家莫扎特".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i39 = i3 + arrayOfByte29.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          arrayOfByte30 = "白马非马".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i40 = i3 + arrayOfByte30.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          arrayOfByte31 = "康".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i41 = i3 + arrayOfByte31.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte32 = "国内首部展现拍卖行业商战风云的大戏，张国立、王志文领衔主演".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i4, arrayOfByte32.length);
          i42 = arrayOfByte32.length;
          i43 = i4 + i42;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "唐诗名句，上句“牛渚西江夜”".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i44 = i3 + arrayOfByte33.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 4;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte34 = "香港作家、电台节目主持，《Yes!》杂志创办人之一".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i45 = i3 + arrayOfByte34.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 4;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "中国艺人。因婷美内衣广告，被评为“全国十大广告明星”之一，参演《武林外传》".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i46 = i3 + arrayOfByte35.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "宋词名句，下句“把酒问青天”".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i47 = i3 + arrayOfByte36.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte37 = "指工农业产品交换时，工业品价格高于价值，农产品价格低于价值所出现的差额".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i48 = i3 + arrayOfByte37.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 12;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "台湾男歌手，有“情歌王子”之称".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i49 = i3 + arrayOfByte38.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 16;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "古龙作品中从神魔小说到推理小说的代表作".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i50 = i3 + arrayOfByte39.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte40 = "[唐]骆宾王《在狱咏蝉》句，下句“谁为表予心”".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i51 = i3 + arrayOfByte40.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 35;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "华北地区民用住宅中的一种组合建筑形式，是一种四四方方或者是长方形的院落".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i52 = i3 + arrayOfByte41.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "省名，简称：滇".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i53 = i3 + arrayOfByte42.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 41;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "著名网络作家，代表作品：《盗墓笔记》，《大漠苍狼》等".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i54 = i3 + arrayOfByte43.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 43;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte44 = "罗大佑歌曲，首句“我爱你想你念你怨你”".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i55 = i3 + arrayOfByte44.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 43;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "刘长卿诗句，下句“云峰水隔深”".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i56 = i3 + arrayOfByte45.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 48;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte46 = "门德尔松创作的所有“无词歌”中最为著名的曲子".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i57 = i3 + arrayOfByte46.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "改编自英国著名小说家格雷厄姆·格林的短篇小说，被评选为英国电影史上最佳影片第一名".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i58 = i3 + arrayOfByte47.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 66;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "成语，指口所言说与心所思想不一致，日常生活中多用作贬义".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i59 = i3 + arrayOfByte48.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 68;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "18世纪中叶到19世纪初德国和欧洲最重要的剧作家、诗人、思想家".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i60 = i3 + arrayOfByte49.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 69;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "日本战国时代末期杰出的政治家和军事家，江户幕府的第一代将军".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i61 = i3 + arrayOfByte50.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 73;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "现代京剧《沙家浜》著名唱词，下句“全凭嘴一张”".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i62 = i3 + arrayOfByte51.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 82;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "陈奕迅演唱歌曲，首句“我用尽所有方式找个人给我安慰 ”".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i63 = i3 + arrayOfByte52.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 82;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte53 = "英国台球运动员，世界锦标赛冠军、世界斯诺克中国公开赛冠军".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i64 = i3 + arrayOfByte53.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 88;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte54 = "周渝民主演电视剧，其在片中饰“苏台英”".getBytes("GBK");
          System.arraycopy(arrayOfByte54, 0, arrayOfByte1, i3, arrayOfByte54.length);
          i65 = i3 + arrayOfByte54.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 90;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte55 = "欧洲最伟大的古典主义音乐作曲家之一，代表作品：《安魂曲》，《牧人王》等".getBytes("GBK");
          System.arraycopy(arrayOfByte55, 0, arrayOfByte1, i3, arrayOfByte55.length);
          i66 = i3 + arrayOfByte55.length;
          i3 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 94;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte56 = "中国古代伟大的逻辑学家公孙龙提出的一个著名的逻辑问题".getBytes("GBK");
          System.arraycopy(arrayOfByte56, 0, arrayOfByte1, i3, arrayOfByte56.length);
          i67 = i3 + arrayOfByte56.length;
          i3 = i67 + 1;
          arrayOfByte1[i67] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/21.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword2130()
  {
    genCrossword21();
    genCrossword22();
    genCrossword23();
    genCrossword24();
    genCrossword25();
    genCrossword26();
    genCrossword27();
    genCrossword28();
    genCrossword29();
    genCrossword30();
  }
  
  public static void genCrossword22()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 33;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "勇敢传说".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        int i9;
        byte[] arrayOfByte6;
        int i10;
        byte[] arrayOfByte7;
        int i11;
        int i12;
        byte[] arrayOfByte8;
        int i13;
        byte[] arrayOfByte9;
        int i14;
        int i15;
        byte[] arrayOfByte10;
        int i16;
        byte[] arrayOfByte11;
        int i17;
        byte[] arrayOfByte12;
        int i18;
        int i19;
        byte[] arrayOfByte13;
        int i20;
        int i21;
        byte[] arrayOfByte14;
        int i22;
        int i23;
        byte[] arrayOfByte15;
        int i24;
        byte[] arrayOfByte16;
        int i25;
        byte[] arrayOfByte17;
        int i26;
        byte[] arrayOfByte18;
        int i27;
        byte[] arrayOfByte19;
        int i28;
        byte[] arrayOfByte20;
        int i29;
        int i30;
        byte[] arrayOfByte21;
        int i31;
        byte[] arrayOfByte22;
        int i32;
        byte[] arrayOfByte23;
        int i33;
        int i34;
        byte[] arrayOfByte24;
        int i35;
        byte[] arrayOfByte25;
        int i36;
        byte[] arrayOfByte26;
        int i37;
        byte[] arrayOfByte27;
        int i38;
        int i39;
        byte[] arrayOfByte28;
        int i40;
        int i41;
        byte[] arrayOfByte29;
        int i42;
        byte[] arrayOfByte30;
        int i43;
        int i44;
        byte[] arrayOfByte31;
        int i45;
        byte[] arrayOfByte32;
        int i46;
        byte[] arrayOfByte33;
        int i47;
        byte[] arrayOfByte34;
        int i48;
        byte[] arrayOfByte35;
        int i49;
        byte[] arrayOfByte36;
        int i50;
        byte[] arrayOfByte37;
        int i51;
        byte[] arrayOfByte38;
        int i52;
        byte[] arrayOfByte39;
        int i53;
        byte[] arrayOfByte40;
        int i54;
        byte[] arrayOfByte41;
        int i55;
        byte[] arrayOfByte42;
        int i56;
        byte[] arrayOfByte43;
        int i57;
        byte[] arrayOfByte44;
        int i58;
        byte[] arrayOfByte45;
        int i59;
        byte[] arrayOfByte46;
        int i60;
        byte[] arrayOfByte47;
        int i61;
        byte[] arrayOfByte48;
        int i62;
        byte[] arrayOfByte49;
        int i63;
        byte[] arrayOfByte50;
        int i64;
        byte[] arrayOfByte51;
        int i65;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "复仇之魂闯".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte5 = "出师表".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i4, arrayOfByte5.length);
          i8 = arrayOfByte5.length;
          i9 = i4 + i8;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          arrayOfByte6 = "玟".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i10 = i3 + arrayOfByte6.length;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte7 = "夺帅".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i4, arrayOfByte7.length);
          i11 = arrayOfByte7.length;
          i12 = i4 + i11;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte8 = "你".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i13 = i3 + arrayOfByte8.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte9 = "辛晓琪".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i4, arrayOfByte9.length);
          i14 = arrayOfByte9.length;
          i15 = i4 + i14;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte10 = "命".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i16 = i3 + arrayOfByte10.length;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          arrayOfByte11 = "我的歌声里".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i17 = i3 + arrayOfByte11.length;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte12 = "落岛".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i4, arrayOfByte12.length);
          i18 = arrayOfByte12.length;
          i19 = i4 + i18;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte13 = "故".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i20 = arrayOfByte13.length;
          i21 = i4 + i20;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte14 = "奇".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i4, arrayOfByte14.length);
          i22 = arrayOfByte14.length;
          i23 = i4 + i22;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          arrayOfByte15 = "红日".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i24 = i3 + arrayOfByte15.length;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          arrayOfByte16 = "男儿事长征".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i25 = i3 + arrayOfByte16.length;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte17 = "明".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i26 = i3 + arrayOfByte17.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          arrayOfByte18 = "满".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i27 = i3 + arrayOfByte18.length;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          arrayOfByte19 = "人".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i28 = i3 + arrayOfByte19.length;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte20 = "江".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i4, arrayOfByte20.length);
          i29 = arrayOfByte20.length;
          i30 = i4 + i29;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte21 = "一日三秋陈百祥".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i31 = i3 + arrayOfByte21.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          arrayOfByte22 = "七".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i32 = i3 + arrayOfByte22.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte23 = "岁".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i4, arrayOfByte23.length);
          i33 = arrayOfByte23.length;
          i34 = i4 + i33;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          arrayOfByte24 = "山".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i35 = i3 + arrayOfByte24.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          arrayOfByte25 = "分".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i36 = i3 + arrayOfByte25.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          arrayOfByte26 = "大号是中华".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i37 = i3 + arrayOfByte26.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte27 = "千百度".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i4, arrayOfByte27.length);
          i38 = arrayOfByte27.length;
          i39 = i4 + i38;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte28 = "否".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i4, arrayOfByte28.length);
          i40 = arrayOfByte28.length;
          i41 = i4 + i40;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          arrayOfByte29 = "新德里".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i42 = i3 + arrayOfByte29.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte30 = "由马克褢德鲁斯和布兰达查普执导的冒险动画，讲述主人公梅莉达抗争传统束缚，追求自由从而改变自己命运的瑰丽故事，6月19日全国上映".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i4, arrayOfByte30.length);
          i43 = arrayOfByte30.length;
          i44 = i4 + i43;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "由美国拍摄的一部动作惊悚片，肖恩·康纳利，尼古拉斯·凯奇领衔主演".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i45 = i3 + arrayOfByte31.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 3;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "安徽卫视一档访谈类节目".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i46 = i3 + arrayOfByte32.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 6;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte33 = "基于魔兽争霸3：冰封王座的多人实时对战自定义地图里一名中立的敏捷型英雄，位于黎明酒馆".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i47 = i3 + arrayOfByte33.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "东方卫视《谁能百里挑一》女主持人".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i48 = i3 + arrayOfByte34.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 13;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte35 = "诸葛亮名篇".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i49 = i3 + arrayOfByte35.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte36 = "香港动作片，洪金宝、李修贤、任达华等领衔主演".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i50 = i3 + arrayOfByte36.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 26;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "台湾女歌手，被封为“疗伤系情歌天后”".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i51 = i3 + arrayOfByte37.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 26;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "美国职业篮球运动员，司职得分后卫与控球后卫，效力于亚特兰大老鹰队".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i52 = i3 + arrayOfByte38.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 32;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "原创音乐人曲婉婷传唱最广的一首歌曲，奇艺网首部自制剧《在线爱》主题曲".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i53 = i3 + arrayOfByte39.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 39;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "[唐]王维《归嵩山作》句，上句“荒城临古渡”".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i54 = i3 + arrayOfByte40.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 48;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "李克勤演唱歌曲，首句“命运就算颠沛流离”".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i55 = i3 + arrayOfByte41.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 51;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "李颀诗句，下句“少小幽燕客”".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i56 = i3 + arrayOfByte42.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 51;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "美国爱情喜剧电影，梅尔·吉布森， 海伦·亨特领衔主演".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i57 = i3 + arrayOfByte43.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 54;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "由周星驰执导，通过一个科幻童话，来凸显父子之爱的充满温情并带有科幻色彩的喜剧动作剧片".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i58 = i3 + arrayOfByte44.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 57;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "唐诗名句，上句“那堪正飘泊”".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i59 = i3 + arrayOfByte45.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 66;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "成语，出自《诗经》。比喻分别时间虽短，却觉得很长。形容对人思念殷切".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i60 = i3 + arrayOfByte46.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 70;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "香港著名喜剧演员，别名“阿叻”".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i61 = i3 + arrayOfByte47.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 83;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte48 = "陈小春主演的《精武陈真》主题曲".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i62 = i3 + arrayOfByte48.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 85;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "罗大佑演唱歌曲，“多少次的寂寞挣扎在心头”是其中一句歌词".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i63 = i3 + arrayOfByte49.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 90;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte50 = "时尚女鞋品牌".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i64 = i3 + arrayOfByte50.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 97;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "印度共和国首都".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i65 = i3 + arrayOfByte51.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/22.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword23()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 34;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "车手".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        byte[] arrayOfByte4 = "飞入寻常百姓家到".getBytes("GBK");
        System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i3, arrayOfByte4.length);
        int i6 = i3 + arrayOfByte4.length;
        i3 = i6 + 1;
        arrayOfByte1[i6] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte5;
        int i7;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        int i10;
        byte[] arrayOfByte7;
        int i11;
        int i12;
        byte[] arrayOfByte8;
        int i13;
        byte[] arrayOfByte9;
        int i14;
        byte[] arrayOfByte10;
        int i15;
        int i16;
        byte[] arrayOfByte11;
        int i17;
        byte[] arrayOfByte12;
        int i18;
        int i19;
        byte[] arrayOfByte13;
        int i20;
        byte[] arrayOfByte14;
        int i21;
        byte[] arrayOfByte15;
        int i22;
        byte[] arrayOfByte16;
        int i23;
        int i24;
        byte[] arrayOfByte17;
        int i25;
        byte[] arrayOfByte18;
        int i26;
        int i27;
        byte[] arrayOfByte19;
        int i28;
        byte[] arrayOfByte20;
        int i29;
        byte[] arrayOfByte21;
        int i30;
        byte[] arrayOfByte22;
        int i31;
        byte[] arrayOfByte23;
        int i32;
        int i33;
        byte[] arrayOfByte24;
        int i34;
        byte[] arrayOfByte25;
        int i35;
        byte[] arrayOfByte26;
        int i36;
        byte[] arrayOfByte27;
        int i37;
        byte[] arrayOfByte28;
        int i38;
        int i39;
        byte[] arrayOfByte29;
        int i40;
        byte[] arrayOfByte30;
        int i41;
        byte[] arrayOfByte31;
        int i42;
        byte[] arrayOfByte32;
        int i43;
        byte[] arrayOfByte33;
        int i44;
        byte[] arrayOfByte34;
        int i45;
        byte[] arrayOfByte35;
        int i46;
        byte[] arrayOfByte36;
        int i47;
        byte[] arrayOfByte37;
        int i48;
        byte[] arrayOfByte38;
        int i49;
        byte[] arrayOfByte39;
        int i50;
        byte[] arrayOfByte40;
        int i51;
        byte[] arrayOfByte41;
        int i52;
        byte[] arrayOfByte42;
        int i53;
        byte[] arrayOfByte43;
        int i54;
        byte[] arrayOfByte44;
        int i55;
        byte[] arrayOfByte45;
        int i56;
        byte[] arrayOfByte46;
        int i57;
        byte[] arrayOfByte47;
        int i58;
        byte[] arrayOfByte48;
        int i59;
        byte[] arrayOfByte49;
        int i60;
        byte[] arrayOfByte50;
        int i61;
        byte[] arrayOfByte51;
        int i62;
        byte[] arrayOfByte52;
        int i63;
        byte[] arrayOfByte53;
        int i64;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte5 = "熊".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i4, arrayOfByte5.length);
          i7 = arrayOfByte5.length;
          i8 = i4 + i7;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte6 = "遇".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i4, arrayOfByte6.length);
          i9 = arrayOfByte6.length;
          i10 = i4 + i9;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte7 = "常山空天入海".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i4, arrayOfByte7.length);
          i11 = arrayOfByte7.length;
          i12 = i4 + i11;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte8 = "春秋".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i13 = i3 + arrayOfByte8.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte9 = "菜前".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i14 = i3 + arrayOfByte9.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte10 = "梦".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i4, arrayOfByte10.length);
          i15 = arrayOfByte10.length;
          i16 = i4 + i15;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          arrayOfByte11 = "苦".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i17 = i3 + arrayOfByte11.length;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte12 = "无".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i4, arrayOfByte12.length);
          i18 = arrayOfByte12.length;
          i19 = i4 + i18;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte13 = "必胜客".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i20 = i3 + arrayOfByte13.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          arrayOfByte14 = "觉道资无穷".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i21 = i3 + arrayOfByte14.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte15 = "有".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i22 = i3 + arrayOfByte15.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte16 = "绿".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i4, arrayOfByte16.length);
          i23 = arrayOfByte16.length;
          i24 = i4 + i23;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          arrayOfByte17 = "来".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i25 = i3 + arrayOfByte17.length;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte18 = "大方路边的野花不要采".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i4, arrayOfByte18.length);
          i26 = arrayOfByte18.length;
          i27 = i4 + i26;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          arrayOfByte19 = "舟".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i28 = i3 + arrayOfByte19.length;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte20 = "城".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i29 = i3 + arrayOfByte20.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte21 = "仙".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i30 = i3 + arrayOfByte21.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte22 = "易".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i31 = i3 + arrayOfByte22.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte23 = "老子".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i4, arrayOfByte23.length);
          i32 = arrayOfByte23.length;
          i33 = i4 + i32;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte24 = "浪".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i34 = i3 + arrayOfByte24.length;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          arrayOfByte25 = "踪迹".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i35 = i3 + arrayOfByte25.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          arrayOfByte26 = "张老三".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i36 = i3 + arrayOfByte26.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          arrayOfByte27 = "赵子龙".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i37 = i3 + arrayOfByte27.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte28 = "小飞".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i4, arrayOfByte28.length);
          i38 = arrayOfByte28.length;
          i39 = i4 + i38;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          arrayOfByte29 = "届".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i40 = i3 + arrayOfByte29.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte30 = "由导演郑宝瑞拍摄，余文乐，黄秋生，徐熙媛等主演，影片主要讲述了一个以赛车为核心的纯正港产警匪故事，6月21日全国上映".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i41 = i3 + arrayOfByte30.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "比喻事到临头，总会有解决的办法或者方法".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i42 = i3 + arrayOfByte31.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 3;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte32 = "唐诗名句，上句“旧时王谢堂前燕”".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i43 = i3 + arrayOfByte32.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 3;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "典故成语，比喻圣主得贤臣的征兆".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i44 = i3 + arrayOfByte33.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 6;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "明朝开国名将，字伯仁，号燕衡".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i45 = i3 + arrayOfByte34.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "电视剧，由黄志忠、左小青主演，反映了上世纪七十年代末的一群人的平凡生活".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i46 = i3 + arrayOfByte35.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte36 = "宋张炎《渡江云》词首句".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i47 = i3 + arrayOfByte36.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 26;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "古代中国的儒家典籍，被列为“五经”之一".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i48 = i3 + arrayOfByte37.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 35;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "杜甫五言诗句，上句“告归常局促”".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i49 = i3 + arrayOfByte38.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 38;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte39 = "数学术语，就是在自变量的某个变化过程中绝对值无限增大的变量或函数".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i50 = i3 + arrayOfByte39.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte40 = "全球最大的比萨专卖连锁企业之一".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i51 = i3 + arrayOfByte40.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 44;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "岑参五言诗句，上句“誓将挂冠去”".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i52 = i3 + arrayOfByte41.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 53;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte42 = "清朝李百川著小说".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i53 = i3 + arrayOfByte42.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 58;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "贵州地名，被誉为黔西北的“旱码头”".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i54 = i3 + arrayOfByte43.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 59;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "科普作家、学者、诗人，知名反伪打假人士".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i55 = i3 + arrayOfByte44.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte45 = "邓丽君演唱歌曲，首句“送你送到小村外 ”".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i56 = i3 + arrayOfByte45.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 61;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte46 = "台湾著名武侠作家古龙的一部杰出小说，属于小李飞刀系列第二部分".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i57 = i3 + arrayOfByte46.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 78;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "道家学派创始人".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i58 = i3 + arrayOfByte47.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 78;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "1966、1967、1968三届初、高中毕业生的合称".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i59 = i3 + arrayOfByte48.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 83;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "朱自清散文，首句“这是一张尺多宽的小小的横幅”".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i60 = i3 + arrayOfByte49.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 86;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte50 = "徐尧原创并演唱网络热歌，“一个人在外面闯荡也挺难”是其中一句歌词".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i61 = i3 + arrayOfByte50.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 86;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte51 = "三国时期蜀汉重要将领，官至车骑将军，封西乡侯".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i62 = i3 + arrayOfByte51.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 90;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "三国时期蜀国将军，曾在汉中以数十骑拒曹操大军".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i63 = i3 + arrayOfByte52.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 95;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte53 = "围棋术语，在己方原有棋子呈日字形的对角交叉点下子".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i64 = i3 + arrayOfByte53.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/23.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword24()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 35;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "画皮二".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        int i10;
        byte[] arrayOfByte7;
        int i11;
        int i12;
        byte[] arrayOfByte8;
        int i13;
        byte[] arrayOfByte9;
        int i14;
        byte[] arrayOfByte10;
        int i15;
        byte[] arrayOfByte11;
        int i16;
        int i17;
        byte[] arrayOfByte12;
        int i18;
        int i19;
        byte[] arrayOfByte13;
        int i20;
        byte[] arrayOfByte14;
        int i21;
        int i22;
        byte[] arrayOfByte15;
        int i23;
        int i24;
        byte[] arrayOfByte16;
        int i25;
        byte[] arrayOfByte17;
        int i26;
        byte[] arrayOfByte18;
        int i27;
        byte[] arrayOfByte19;
        int i28;
        byte[] arrayOfByte20;
        int i29;
        byte[] arrayOfByte21;
        int i30;
        int i31;
        byte[] arrayOfByte22;
        int i32;
        byte[] arrayOfByte23;
        int i33;
        byte[] arrayOfByte24;
        int i34;
        byte[] arrayOfByte25;
        int i35;
        int i36;
        byte[] arrayOfByte26;
        int i37;
        byte[] arrayOfByte27;
        int i38;
        byte[] arrayOfByte28;
        int i39;
        int i40;
        byte[] arrayOfByte29;
        int i41;
        byte[] arrayOfByte30;
        int i42;
        int i43;
        byte[] arrayOfByte31;
        int i44;
        byte[] arrayOfByte32;
        int i45;
        byte[] arrayOfByte33;
        int i46;
        byte[] arrayOfByte34;
        int i47;
        byte[] arrayOfByte35;
        int i48;
        byte[] arrayOfByte36;
        int i49;
        byte[] arrayOfByte37;
        int i50;
        byte[] arrayOfByte38;
        int i51;
        byte[] arrayOfByte39;
        int i52;
        byte[] arrayOfByte40;
        int i53;
        byte[] arrayOfByte41;
        int i54;
        byte[] arrayOfByte42;
        int i55;
        byte[] arrayOfByte43;
        int i56;
        byte[] arrayOfByte44;
        int i57;
        byte[] arrayOfByte45;
        int i58;
        byte[] arrayOfByte46;
        int i59;
        byte[] arrayOfByte47;
        int i60;
        byte[] arrayOfByte48;
        int i61;
        byte[] arrayOfByte49;
        int i62;
        byte[] arrayOfByte50;
        int i63;
        byte[] arrayOfByte51;
        int i64;
        byte[] arrayOfByte52;
        int i65;
        byte[] arrayOfByte53;
        int i66;
        byte[] arrayOfByte54;
        int i67;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "金".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte5 = "大乐透地".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
          i8 = i3 + arrayOfByte5.length;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte6 = "爱上巧克力".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i4, arrayOfByte6.length);
          i9 = arrayOfByte6.length;
          i10 = i4 + i9;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte7 = "为你钟情".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i4, arrayOfByte7.length);
          i11 = arrayOfByte7.length;
          i12 = i4 + i11;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte8 = "巧".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i13 = i3 + arrayOfByte8.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte9 = "水".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i14 = i3 + arrayOfByte9.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte10 = "张牢".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i15 = i3 + arrayOfByte10.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte11 = "连".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i4, arrayOfByte11.length);
          i16 = arrayOfByte11.length;
          i17 = i4 + i16;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte12 = "圣手书生".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i4, arrayOfByte12.length);
          i18 = arrayOfByte12.length;
          i19 = i4 + i18;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte13 = "烽火连三月".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i20 = i3 + arrayOfByte13.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte14 = "剑".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i4, arrayOfByte14.length);
          i21 = arrayOfByte14.length;
          i22 = i4 + i21;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte15 = "火".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i4, arrayOfByte15.length);
          i23 = arrayOfByte15.length;
          i24 = i4 + i23;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          arrayOfByte16 = "看".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i25 = i3 + arrayOfByte16.length;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte17 = "涌".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i26 = i3 + arrayOfByte17.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          arrayOfByte18 = "周恩来吴佳妮".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i27 = i3 + arrayOfByte18.length;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          arrayOfByte19 = "吴大维".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i28 = i3 + arrayOfByte19.length;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte20 = "仇".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i29 = i3 + arrayOfByte20.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte21 = "人".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i4, arrayOfByte21.length);
          i30 = arrayOfByte21.length;
          i31 = i4 + i30;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          arrayOfByte22 = "方".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i32 = i3 + arrayOfByte22.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte23 = "江".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i33 = i3 + arrayOfByte23.length;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte24 = "纪录片周".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i34 = i3 + arrayOfByte24.length;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte25 = "中国流".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i4, arrayOfByte25.length);
          i35 = arrayOfByte25.length;
          i36 = i4 + i35;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          arrayOfByte26 = "连".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i37 = i3 + arrayOfByte26.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          arrayOfByte27 = "仔通风报信".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i38 = i3 + arrayOfByte27.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte28 = "珠海".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i4, arrayOfByte28.length);
          i39 = arrayOfByte28.length;
          i40 = i4 + i39;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          arrayOfByte29 = "癀".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i41 = i3 + arrayOfByte29.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte30 = "东方魔幻爱情电影，重新汇集周迅，赵薇，陈坤“吸金魔幻三人组”。更集合了新晋人气明星杨幂、冯绍峰以及实力唱将费翔，6月28日内地暑期档隆重上映".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i4, arrayOfByte30.length);
          i42 = arrayOfByte30.length;
          i43 = i4 + i42;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "“ 豪放不羁”的反义成语".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i44 = i3 + arrayOfByte31.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "内地女艺人，1998年参演《西游记》孔雀公主一角走进观众视线".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i45 = i3 + arrayOfByte32.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte33 = "中国彩票的其中一种玩法".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i46 = i3 + arrayOfByte33.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "美国经典漫画人物".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i47 = i3 + arrayOfByte34.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 13;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte35 = "三立“华人电视剧”系列的第二部作品。由曾之乔、吴建豪、王子翊 、张勋杰、昆凌、MC40主演；四、张国荣演唱歌曲，末句“用那真心痴爱来做证”".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i48 = i3 + arrayOfByte35.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 13;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "浙江卫视著名相亲交友节目".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i49 = i3 + arrayOfByte36.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "张国荣演唱歌曲，末句“用那真心痴爱来做证”".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i50 = i3 + arrayOfByte37.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 29;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "元曲《西厢记》里的人物".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i51 = i3 + arrayOfByte38.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 36;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "《水浒传》108将“萧让”的绰号".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i52 = i3 + arrayOfByte39.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 38;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "金庸的首部长篇武侠小说".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i53 = i3 + arrayOfByte40.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 41;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "杜甫名句，下句“家书抵万金”".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i54 = i3 + arrayOfByte41.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 41;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte42 = "刘德华电影，又名《旗正飘飘》".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i55 = i3 + arrayOfByte42.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 45;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "杜甫名句，上句“星垂平野阔”".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i56 = i3 + arrayOfByte43.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 57;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte44 = "共和国第一任总理".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i57 = i3 + arrayOfByte44.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte45 = "体坛名宿， 她的高低杠的腹弹腾越被人们称为“佳妮腾越”".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i58 = i3 + arrayOfByte45.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 64;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "香港艺人，出生于台湾，现为美国籍".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i59 = i3 + arrayOfByte46.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 73;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "香港知名艺人，有“香港李察基尔”之称".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i60 = i3 + arrayOfByte47.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 77;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte48 = "以展现真实为本质，并用真实引发人们思考的电影或电视艺术形式".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i61 = i3 + arrayOfByte48.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 77;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "中学历史老师，中央电视台《百家讲坛》栏目主讲人".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i62 = i3 + arrayOfByte49.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 79;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "由牛黄、三七、蛇胆、麝香等制成的中成药锭剂，具有消炎、清凉解毒、消肿止痛等作用".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i63 = i3 + arrayOfByte50.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 80;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte51 = "《水浒传》108将之一，绰号“小霸王”".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i64 = i3 + arrayOfByte51.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 83;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "围棋术语，指围棋布局的一种方法，由中国棋手陈祖德九段首创".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i65 = i3 + arrayOfByte52.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 90;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte53 = "成语，指把对立双方中一方的机密暗中告诉另一方".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i66 = i3 + arrayOfByte53.length;
          i3 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 96;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte54 = "珠江三角洲南端的一个重要城市，是中国的五个经济特区之一".getBytes("GBK");
          System.arraycopy(arrayOfByte54, 0, arrayOfByte1, i3, arrayOfByte54.length);
          i67 = i3 + arrayOfByte54.length;
          i3 = i67 + 1;
          arrayOfByte1[i67] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/24.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword25()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 36;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "蛟龙号".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        int i9;
        byte[] arrayOfByte6;
        int i10;
        int i11;
        byte[] arrayOfByte7;
        int i12;
        byte[] arrayOfByte8;
        int i13;
        byte[] arrayOfByte9;
        int i14;
        byte[] arrayOfByte10;
        int i15;
        byte[] arrayOfByte11;
        int i16;
        int i17;
        byte[] arrayOfByte12;
        int i18;
        byte[] arrayOfByte13;
        int i19;
        int i20;
        byte[] arrayOfByte14;
        int i21;
        byte[] arrayOfByte15;
        int i22;
        byte[] arrayOfByte16;
        int i23;
        byte[] arrayOfByte17;
        int i24;
        int i25;
        byte[] arrayOfByte18;
        int i26;
        byte[] arrayOfByte19;
        int i27;
        byte[] arrayOfByte20;
        int i28;
        byte[] arrayOfByte21;
        int i29;
        byte[] arrayOfByte22;
        int i30;
        byte[] arrayOfByte23;
        int i31;
        int i32;
        byte[] arrayOfByte24;
        int i33;
        int i34;
        byte[] arrayOfByte25;
        int i35;
        byte[] arrayOfByte26;
        int i36;
        int i37;
        byte[] arrayOfByte27;
        int i38;
        byte[] arrayOfByte28;
        int i39;
        byte[] arrayOfByte29;
        int i40;
        int i41;
        byte[] arrayOfByte30;
        int i42;
        byte[] arrayOfByte31;
        int i43;
        byte[] arrayOfByte32;
        int i44;
        int i45;
        byte[] arrayOfByte33;
        int i46;
        byte[] arrayOfByte34;
        int i47;
        byte[] arrayOfByte35;
        int i48;
        byte[] arrayOfByte36;
        int i49;
        byte[] arrayOfByte37;
        int i50;
        byte[] arrayOfByte38;
        int i51;
        byte[] arrayOfByte39;
        int i52;
        byte[] arrayOfByte40;
        int i53;
        byte[] arrayOfByte41;
        int i54;
        byte[] arrayOfByte42;
        int i55;
        byte[] arrayOfByte43;
        int i56;
        byte[] arrayOfByte44;
        int i57;
        byte[] arrayOfByte45;
        int i58;
        byte[] arrayOfByte46;
        int i59;
        byte[] arrayOfByte47;
        int i60;
        byte[] arrayOfByte48;
        int i61;
        byte[] arrayOfByte49;
        int i62;
        byte[] arrayOfByte50;
        int i63;
        byte[] arrayOfByte51;
        int i64;
        byte[] arrayOfByte52;
        int i65;
        byte[] arrayOfByte53;
        int i66;
        byte[] arrayOfByte54;
        int i67;
        byte[] arrayOfByte55;
        int i68;
        byte[] arrayOfByte56;
        int i69;
        byte[] arrayOfByte57;
        int i70;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "露".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte5 = "好".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i4, arrayOfByte5.length);
          i8 = arrayOfByte5.length;
          i9 = i4 + i8;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte6 = "种".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i4, arrayOfByte6.length);
          i10 = arrayOfByte6.length;
          i11 = i4 + i10;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          arrayOfByte7 = "天".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
          i12 = i3 + arrayOfByte7.length;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte8 = "露重飞难进不自著罗衣".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i13 = i3 + arrayOfByte8.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte9 = "上".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i14 = i3 + arrayOfByte9.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte10 = "得".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i15 = i3 + arrayOfByte10.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte11 = "与".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i4, arrayOfByte11.length);
          i16 = arrayOfByte11.length;
          i17 = i4 + i16;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          arrayOfByte12 = "地".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i18 = i3 + arrayOfByte12.length;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte13 = "君君".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i19 = arrayOfByte13.length;
          i20 = i4 + i19;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          arrayOfByte14 = "刘".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i21 = i3 + arrayOfByte14.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte15 = "常".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i22 = i3 + arrayOfByte15.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte16 = "网球王子".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i23 = i3 + arrayOfByte16.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte17 = "玄无人区".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i4, arrayOfByte17.length);
          i24 = arrayOfByte17.length;
          i25 = i4 + i24;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte18 = "蛋".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i26 = i3 + arrayOfByte18.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          arrayOfByte19 = "堂吉诃德".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i27 = i3 + arrayOfByte19.length;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          arrayOfByte20 = "殊".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i28 = i3 + arrayOfByte20.length;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte21 = "汉白玉".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i29 = i3 + arrayOfByte21.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte22 = "他".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i30 = i3 + arrayOfByte22.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte23 = "美".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i4, arrayOfByte23.length);
          i31 = arrayOfByte23.length;
          i32 = i4 + i31;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte24 = "武".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i4, arrayOfByte24.length);
          i33 = arrayOfByte24.length;
          i34 = i4 + i33;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          arrayOfByte25 = "观".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i35 = i3 + arrayOfByte25.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte26 = "超人人小鬼大".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i4, arrayOfByte26.length);
          i36 = arrayOfByte26.length;
          i37 = i4 + i36;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          arrayOfByte27 = "音乐之声".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i38 = i3 + arrayOfByte27.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          arrayOfByte28 = "计".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i39 = i3 + arrayOfByte28.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte29 = "帝锦".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i4, arrayOfByte29.length);
          i40 = arrayOfByte29.length;
          i41 = i4 + i40;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          arrayOfByte30 = "和".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i42 = i3 + arrayOfByte30.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          arrayOfByte31 = "波兰".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i43 = i3 + arrayOfByte31.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte32 = "我国首台自主设计、自主集成研制的作业型深海载人潜水器，近日深潜7020米创纪录，可征服全球99.8%海底".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i4, arrayOfByte32.length);
          i44 = arrayOfByte32.length;
          i45 = i4 + i44;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "杜甫诗句，上句“高帝子孙尽隆准”".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i46 = i3 + arrayOfByte33.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "著名植物蛋白饮料".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i47 = i3 + arrayOfByte34.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 8;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "丁当演唱歌曲，首句“爱让我们变得比单身愚笨 ”".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i48 = i3 + arrayOfByte35.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 13;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "梦幻西游中盘丝洞门派技能 ".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i49 = i3 + arrayOfByte36.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 15;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "骆宾王诗句，下句“风多响易沉”".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i50 = i3 + arrayOfByte37.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 16;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "杜甫诗句，上句“焉知二十载”".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i51 = i3 + arrayOfByte38.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "王维诗句，上句“邀人傅脂粉”".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i52 = i3 + arrayOfByte39.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 36;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte40 = "大陆艺人，2005年参加《我型我秀》而被大众熟知，有“天然美少年”的称号".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i53 = i3 + arrayOfByte40.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 39;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "即刘备".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i54 = i3 + arrayOfByte41.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 43;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "继《灌篮高手》《足球小将》《棒球英豪》三大日本运动巅峰动漫之后，又一部以运动为主题的成功漫画".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i55 = i3 + arrayOfByte42.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 44;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "能被50%饱和度硫酸铵溶液沉淀的单纯蛋白质".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i56 = i3 + arrayOfByte43.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 50;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte44 = "宁浩执导的国内首部西部公路片电影".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i57 = i3 + arrayOfByte44.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 56;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte45 = "文艺复兴时期的现实主义杰作，作者塞万提斯".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i58 = i3 + arrayOfByte45.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 57;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte46 = "属于弹拨乐器，通常有六条弦，形状与提琴相似".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i59 = i3 + arrayOfByte46.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 63;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "主要成分是碳酸钙，它是一种化合物，化学式是CaCO3".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i60 = i3 + arrayOfByte47.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 63;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "胡玫执导电视剧，陈宝国、焦晃、归亚蕾等领衔主演".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i61 = i3 + arrayOfByte48.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 65;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "赵薇和谢霆锋超级组合领衔主演，香港著名导演许鞍华指导的文艺片佳作".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i62 = i3 + arrayOfByte49.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 70;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "三十六计之一".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i63 = i3 + arrayOfByte50.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 78;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "五月天演唱歌曲，首句“世界如果被残酷攻击只要给我一个电话亭 ”".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i64 = i3 + arrayOfByte51.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 78;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte52 = "频率高于20000赫兹的声波".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i65 = i3 + arrayOfByte52.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 80;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte53 = "成语，指年纪小而头脑却很精明，为人调皮，鬼主意多".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i66 = i3 + arrayOfByte53.length;
          i3 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 85;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte54 = "一部改编自玛丽亚·冯·崔普的著作《崔普家庭演唱团》的电影作品".getBytes("GBK");
          System.arraycopy(arrayOfByte54, 0, arrayOfByte1, i3, arrayOfByte54.length);
          i67 = i3 + arrayOfByte54.length;
          i3 = i67 + 1;
          arrayOfByte1[i67] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 86;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte55 = "《水浒传》108将之一，绰号“铁叫子”".getBytes("GBK");
          System.arraycopy(arrayOfByte55, 0, arrayOfByte1, i3, arrayOfByte55.length);
          i68 = i3 + arrayOfByte55.length;
          i3 = i68 + 1;
          arrayOfByte1[i68] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 93;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte56 = "电视剧，改编自起点女生网的同名小说，由安七炫、林文龙、施艳飞等主演".getBytes("GBK");
          System.arraycopy(arrayOfByte56, 0, arrayOfByte1, i3, arrayOfByte56.length);
          i69 = i3 + arrayOfByte56.length;
          i3 = i69 + 1;
          arrayOfByte1[i69] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 98;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte57 = "2012欧洲杯主办国之一".getBytes("GBK");
          System.arraycopy(arrayOfByte57, 0, arrayOfByte1, i3, arrayOfByte57.length);
          i70 = i3 + arrayOfByte57.length;
          i3 = i70 + 1;
          arrayOfByte1[i70] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/25.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  /* Error */
  public static void genCrossword26()
  {
    // Byte code:
    //   0: sipush 4096
    //   3: newarray <illegal type>
    //   5: astore_0
    //   6: ldc 43
    //   8: invokevirtual 49	java/lang/String:getBytes	()[B
    //   11: astore_1
    //   12: aload_1
    //   13: iconst_0
    //   14: aload_0
    //   15: iconst_0
    //   16: aload_1
    //   17: arraylength
    //   18: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   21: aload_1
    //   22: arraylength
    //   23: istore_2
    //   24: iload_2
    //   25: iconst_1
    //   26: iadd
    //   27: istore_3
    //   28: aload_0
    //   29: iload_2
    //   30: iconst_0
    //   31: bastore
    //   32: iload_3
    //   33: iconst_1
    //   34: iadd
    //   35: istore 4
    //   37: aload_0
    //   38: iload_3
    //   39: iconst_0
    //   40: bastore
    //   41: iload 4
    //   43: iconst_1
    //   44: iadd
    //   45: istore 5
    //   47: aload_0
    //   48: iload 4
    //   50: iconst_0
    //   51: bastore
    //   52: iload 5
    //   54: iconst_1
    //   55: iadd
    //   56: istore 6
    //   58: aload_0
    //   59: iload 5
    //   61: bipush 37
    //   63: bastore
    //   64: iload 6
    //   66: iconst_1
    //   67: iadd
    //   68: istore 7
    //   70: aload_0
    //   71: iload 6
    //   73: iconst_1
    //   74: bastore
    //   75: iload 7
    //   77: iconst_1
    //   78: iadd
    //   79: istore 8
    //   81: aload_0
    //   82: iload 7
    //   84: bipush 10
    //   86: bastore
    //   87: iload 8
    //   89: iconst_1
    //   90: iadd
    //   91: istore 9
    //   93: aload_0
    //   94: iload 8
    //   96: bipush 10
    //   98: bastore
    //   99: ldc_w 1892
    //   102: ldc 59
    //   104: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   107: astore 13
    //   109: aload 13
    //   111: iconst_0
    //   112: aload_0
    //   113: iload 9
    //   115: aload 13
    //   117: arraylength
    //   118: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   121: iload 9
    //   123: aload 13
    //   125: arraylength
    //   126: iadd
    //   127: istore 14
    //   129: iload 14
    //   131: iconst_1
    //   132: iadd
    //   133: istore 9
    //   135: aload_0
    //   136: iload 14
    //   138: iconst_0
    //   139: bastore
    //   140: ldc_w 1894
    //   143: ldc 59
    //   145: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   148: astore 15
    //   150: aload 15
    //   152: iconst_0
    //   153: aload_0
    //   154: iload 9
    //   156: aload 15
    //   158: arraylength
    //   159: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   162: iload 9
    //   164: aload 15
    //   166: arraylength
    //   167: iadd
    //   168: istore 16
    //   170: iload 16
    //   172: iconst_1
    //   173: iadd
    //   174: istore 9
    //   176: aload_0
    //   177: iload 16
    //   179: iconst_0
    //   180: bastore
    //   181: ldc_w 1392
    //   184: ldc 59
    //   186: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   189: astore 17
    //   191: aload 17
    //   193: iconst_0
    //   194: aload_0
    //   195: iload 9
    //   197: aload 17
    //   199: arraylength
    //   200: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   203: iload 9
    //   205: aload 17
    //   207: arraylength
    //   208: iadd
    //   209: istore 18
    //   211: iload 18
    //   213: iconst_1
    //   214: iadd
    //   215: istore 9
    //   217: aload_0
    //   218: iload 18
    //   220: iconst_0
    //   221: bastore
    //   222: iload 9
    //   224: iconst_1
    //   225: iadd
    //   226: istore 12
    //   228: aload_0
    //   229: iload 9
    //   231: iconst_0
    //   232: bastore
    //   233: ldc -36
    //   235: ldc 59
    //   237: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   240: astore 20
    //   242: aload 20
    //   244: iconst_0
    //   245: aload_0
    //   246: iload 12
    //   248: aload 20
    //   250: arraylength
    //   251: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   254: aload 20
    //   256: arraylength
    //   257: istore 21
    //   259: iload 12
    //   261: iload 21
    //   263: iadd
    //   264: istore 22
    //   266: iload 22
    //   268: iconst_1
    //   269: iadd
    //   270: istore 9
    //   272: aload_0
    //   273: iload 22
    //   275: iconst_0
    //   276: bastore
    //   277: iload 9
    //   279: iconst_1
    //   280: iadd
    //   281: istore 12
    //   283: aload_0
    //   284: iload 9
    //   286: iconst_0
    //   287: bastore
    //   288: ldc_w 1896
    //   291: ldc 59
    //   293: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   296: astore 23
    //   298: aload 23
    //   300: iconst_0
    //   301: aload_0
    //   302: iload 12
    //   304: aload 23
    //   306: arraylength
    //   307: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   310: aload 23
    //   312: arraylength
    //   313: istore 24
    //   315: iload 12
    //   317: iload 24
    //   319: iadd
    //   320: istore 25
    //   322: iload 25
    //   324: iconst_1
    //   325: iadd
    //   326: istore 9
    //   328: aload_0
    //   329: iload 25
    //   331: iconst_0
    //   332: bastore
    //   333: ldc_w 1898
    //   336: ldc 59
    //   338: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   341: astore 26
    //   343: aload 26
    //   345: iconst_0
    //   346: aload_0
    //   347: iload 9
    //   349: aload 26
    //   351: arraylength
    //   352: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   355: iload 9
    //   357: aload 26
    //   359: arraylength
    //   360: iadd
    //   361: istore 27
    //   363: iload 27
    //   365: iconst_1
    //   366: iadd
    //   367: istore 9
    //   369: aload_0
    //   370: iload 27
    //   372: iconst_0
    //   373: bastore
    //   374: iload 9
    //   376: iconst_1
    //   377: iadd
    //   378: istore 12
    //   380: aload_0
    //   381: iload 9
    //   383: iconst_0
    //   384: bastore
    //   385: ldc_w 1900
    //   388: ldc 59
    //   390: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   393: astore 28
    //   395: aload 28
    //   397: iconst_0
    //   398: aload_0
    //   399: iload 12
    //   401: aload 28
    //   403: arraylength
    //   404: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   407: aload 28
    //   409: arraylength
    //   410: istore 29
    //   412: iload 12
    //   414: iload 29
    //   416: iadd
    //   417: istore 30
    //   419: iload 30
    //   421: iconst_1
    //   422: iadd
    //   423: istore 9
    //   425: aload_0
    //   426: iload 30
    //   428: iconst_0
    //   429: bastore
    //   430: ldc_w 1902
    //   433: ldc 59
    //   435: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   438: astore 31
    //   440: aload 31
    //   442: iconst_0
    //   443: aload_0
    //   444: iload 9
    //   446: aload 31
    //   448: arraylength
    //   449: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   452: iload 9
    //   454: aload 31
    //   456: arraylength
    //   457: iadd
    //   458: istore 32
    //   460: iload 32
    //   462: iconst_1
    //   463: iadd
    //   464: istore 9
    //   466: aload_0
    //   467: iload 32
    //   469: iconst_0
    //   470: bastore
    //   471: ldc_w 1904
    //   474: ldc 59
    //   476: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   479: astore 33
    //   481: aload 33
    //   483: iconst_0
    //   484: aload_0
    //   485: iload 9
    //   487: aload 33
    //   489: arraylength
    //   490: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   493: iload 9
    //   495: aload 33
    //   497: arraylength
    //   498: iadd
    //   499: istore 34
    //   501: iload 34
    //   503: iconst_1
    //   504: iadd
    //   505: istore 9
    //   507: aload_0
    //   508: iload 34
    //   510: iconst_0
    //   511: bastore
    //   512: ldc_w 1906
    //   515: ldc 59
    //   517: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   520: astore 35
    //   522: aload 35
    //   524: iconst_0
    //   525: aload_0
    //   526: iload 9
    //   528: aload 35
    //   530: arraylength
    //   531: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   534: iload 9
    //   536: aload 35
    //   538: arraylength
    //   539: iadd
    //   540: istore 36
    //   542: iload 36
    //   544: iconst_1
    //   545: iadd
    //   546: istore 9
    //   548: aload_0
    //   549: iload 36
    //   551: iconst_0
    //   552: bastore
    //   553: ldc_w 1908
    //   556: ldc 59
    //   558: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   561: astore 37
    //   563: aload 37
    //   565: iconst_0
    //   566: aload_0
    //   567: iload 9
    //   569: aload 37
    //   571: arraylength
    //   572: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   575: iload 9
    //   577: aload 37
    //   579: arraylength
    //   580: iadd
    //   581: istore 38
    //   583: iload 38
    //   585: iconst_1
    //   586: iadd
    //   587: istore 9
    //   589: aload_0
    //   590: iload 38
    //   592: iconst_0
    //   593: bastore
    //   594: ldc 108
    //   596: ldc 59
    //   598: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   601: astore 39
    //   603: aload 39
    //   605: iconst_0
    //   606: aload_0
    //   607: iload 9
    //   609: aload 39
    //   611: arraylength
    //   612: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   615: iload 9
    //   617: aload 39
    //   619: arraylength
    //   620: iadd
    //   621: istore 40
    //   623: iload 40
    //   625: iconst_1
    //   626: iadd
    //   627: istore 9
    //   629: aload_0
    //   630: iload 40
    //   632: iconst_0
    //   633: bastore
    //   634: iload 9
    //   636: iconst_1
    //   637: iadd
    //   638: istore 12
    //   640: aload_0
    //   641: iload 9
    //   643: iconst_0
    //   644: bastore
    //   645: ldc_w 1910
    //   648: ldc 59
    //   650: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   653: astore 41
    //   655: aload 41
    //   657: iconst_0
    //   658: aload_0
    //   659: iload 12
    //   661: aload 41
    //   663: arraylength
    //   664: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   667: aload 41
    //   669: arraylength
    //   670: istore 42
    //   672: iload 12
    //   674: iload 42
    //   676: iadd
    //   677: istore 43
    //   679: iload 43
    //   681: iconst_1
    //   682: iadd
    //   683: istore 9
    //   685: aload_0
    //   686: iload 43
    //   688: iconst_0
    //   689: bastore
    //   690: ldc_w 1912
    //   693: ldc 59
    //   695: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   698: astore 44
    //   700: aload 44
    //   702: iconst_0
    //   703: aload_0
    //   704: iload 9
    //   706: aload 44
    //   708: arraylength
    //   709: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   712: iload 9
    //   714: aload 44
    //   716: arraylength
    //   717: iadd
    //   718: istore 45
    //   720: iload 45
    //   722: iconst_1
    //   723: iadd
    //   724: istore 9
    //   726: aload_0
    //   727: iload 45
    //   729: iconst_0
    //   730: bastore
    //   731: iload 9
    //   733: iconst_1
    //   734: iadd
    //   735: istore 12
    //   737: aload_0
    //   738: iload 9
    //   740: iconst_0
    //   741: bastore
    //   742: ldc_w 1914
    //   745: ldc 59
    //   747: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   750: astore 46
    //   752: aload 46
    //   754: iconst_0
    //   755: aload_0
    //   756: iload 12
    //   758: aload 46
    //   760: arraylength
    //   761: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   764: aload 46
    //   766: arraylength
    //   767: istore 47
    //   769: iload 12
    //   771: iload 47
    //   773: iadd
    //   774: istore 48
    //   776: iload 48
    //   778: iconst_1
    //   779: iadd
    //   780: istore 9
    //   782: aload_0
    //   783: iload 48
    //   785: iconst_0
    //   786: bastore
    //   787: iload 9
    //   789: iconst_1
    //   790: iadd
    //   791: istore 12
    //   793: aload_0
    //   794: iload 9
    //   796: iconst_0
    //   797: bastore
    //   798: ldc_w 1916
    //   801: ldc 59
    //   803: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   806: astore 49
    //   808: aload 49
    //   810: iconst_0
    //   811: aload_0
    //   812: iload 12
    //   814: aload 49
    //   816: arraylength
    //   817: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   820: aload 49
    //   822: arraylength
    //   823: istore 50
    //   825: iload 12
    //   827: iload 50
    //   829: iadd
    //   830: istore 51
    //   832: iload 51
    //   834: iconst_1
    //   835: iadd
    //   836: istore 9
    //   838: aload_0
    //   839: iload 51
    //   841: iconst_0
    //   842: bastore
    //   843: ldc_w 1918
    //   846: ldc 59
    //   848: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   851: astore 52
    //   853: aload 52
    //   855: iconst_0
    //   856: aload_0
    //   857: iload 9
    //   859: aload 52
    //   861: arraylength
    //   862: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   865: iload 9
    //   867: aload 52
    //   869: arraylength
    //   870: iadd
    //   871: istore 53
    //   873: iload 53
    //   875: iconst_1
    //   876: iadd
    //   877: istore 9
    //   879: aload_0
    //   880: iload 53
    //   882: iconst_0
    //   883: bastore
    //   884: ldc_w 1920
    //   887: ldc 59
    //   889: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   892: astore 54
    //   894: aload 54
    //   896: iconst_0
    //   897: aload_0
    //   898: iload 9
    //   900: aload 54
    //   902: arraylength
    //   903: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   906: iload 9
    //   908: aload 54
    //   910: arraylength
    //   911: iadd
    //   912: istore 55
    //   914: iload 55
    //   916: iconst_1
    //   917: iadd
    //   918: istore 9
    //   920: aload_0
    //   921: iload 55
    //   923: iconst_0
    //   924: bastore
    //   925: ldc_w 1922
    //   928: ldc 59
    //   930: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   933: astore 56
    //   935: aload 56
    //   937: iconst_0
    //   938: aload_0
    //   939: iload 9
    //   941: aload 56
    //   943: arraylength
    //   944: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   947: iload 9
    //   949: aload 56
    //   951: arraylength
    //   952: iadd
    //   953: istore 57
    //   955: iload 57
    //   957: iconst_1
    //   958: iadd
    //   959: istore 9
    //   961: aload_0
    //   962: iload 57
    //   964: iconst_0
    //   965: bastore
    //   966: ldc_w 1924
    //   969: ldc 59
    //   971: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   974: astore 58
    //   976: aload 58
    //   978: iconst_0
    //   979: aload_0
    //   980: iload 9
    //   982: aload 58
    //   984: arraylength
    //   985: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   988: iload 9
    //   990: aload 58
    //   992: arraylength
    //   993: iadd
    //   994: istore 59
    //   996: iload 59
    //   998: iconst_1
    //   999: iadd
    //   1000: istore 9
    //   1002: aload_0
    //   1003: iload 59
    //   1005: iconst_0
    //   1006: bastore
    //   1007: ldc_w 1926
    //   1010: ldc 59
    //   1012: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1015: astore 60
    //   1017: aload 60
    //   1019: iconst_0
    //   1020: aload_0
    //   1021: iload 9
    //   1023: aload 60
    //   1025: arraylength
    //   1026: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1029: iload 9
    //   1031: aload 60
    //   1033: arraylength
    //   1034: iadd
    //   1035: istore 61
    //   1037: iload 61
    //   1039: iconst_1
    //   1040: iadd
    //   1041: istore 9
    //   1043: aload_0
    //   1044: iload 61
    //   1046: iconst_0
    //   1047: bastore
    //   1048: iload 9
    //   1050: iconst_1
    //   1051: iadd
    //   1052: istore 12
    //   1054: aload_0
    //   1055: iload 9
    //   1057: iconst_0
    //   1058: bastore
    //   1059: ldc_w 1928
    //   1062: ldc 59
    //   1064: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1067: astore 62
    //   1069: aload 62
    //   1071: iconst_0
    //   1072: aload_0
    //   1073: iload 12
    //   1075: aload 62
    //   1077: arraylength
    //   1078: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1081: aload 62
    //   1083: arraylength
    //   1084: istore 63
    //   1086: iload 12
    //   1088: iload 63
    //   1090: iadd
    //   1091: istore 64
    //   1093: iload 64
    //   1095: iconst_1
    //   1096: iadd
    //   1097: istore 9
    //   1099: aload_0
    //   1100: iload 64
    //   1102: iconst_0
    //   1103: bastore
    //   1104: ldc_w 1930
    //   1107: ldc 59
    //   1109: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1112: astore 65
    //   1114: aload 65
    //   1116: iconst_0
    //   1117: aload_0
    //   1118: iload 9
    //   1120: aload 65
    //   1122: arraylength
    //   1123: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1126: iload 9
    //   1128: aload 65
    //   1130: arraylength
    //   1131: iadd
    //   1132: istore 66
    //   1134: iload 66
    //   1136: iconst_1
    //   1137: iadd
    //   1138: istore 9
    //   1140: aload_0
    //   1141: iload 66
    //   1143: iconst_0
    //   1144: bastore
    //   1145: ldc_w 1932
    //   1148: ldc 59
    //   1150: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1153: astore 67
    //   1155: aload 67
    //   1157: iconst_0
    //   1158: aload_0
    //   1159: iload 9
    //   1161: aload 67
    //   1163: arraylength
    //   1164: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1167: iload 9
    //   1169: aload 67
    //   1171: arraylength
    //   1172: iadd
    //   1173: istore 68
    //   1175: iload 68
    //   1177: iconst_1
    //   1178: iadd
    //   1179: istore 9
    //   1181: aload_0
    //   1182: iload 68
    //   1184: iconst_0
    //   1185: bastore
    //   1186: ldc -70
    //   1188: ldc 59
    //   1190: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1193: astore 69
    //   1195: aload 69
    //   1197: iconst_0
    //   1198: aload_0
    //   1199: iload 9
    //   1201: aload 69
    //   1203: arraylength
    //   1204: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1207: iload 9
    //   1209: aload 69
    //   1211: arraylength
    //   1212: iadd
    //   1213: istore 70
    //   1215: iload 70
    //   1217: iconst_1
    //   1218: iadd
    //   1219: istore 9
    //   1221: aload_0
    //   1222: iload 70
    //   1224: iconst_0
    //   1225: bastore
    //   1226: ldc_w 1934
    //   1229: ldc 59
    //   1231: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1234: astore 71
    //   1236: aload 71
    //   1238: iconst_0
    //   1239: aload_0
    //   1240: iload 9
    //   1242: aload 71
    //   1244: arraylength
    //   1245: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1248: iload 9
    //   1250: aload 71
    //   1252: arraylength
    //   1253: iadd
    //   1254: istore 72
    //   1256: iload 72
    //   1258: iconst_1
    //   1259: iadd
    //   1260: istore 9
    //   1262: aload_0
    //   1263: iload 72
    //   1265: iconst_0
    //   1266: bastore
    //   1267: ldc_w 1936
    //   1270: ldc 59
    //   1272: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1275: astore 73
    //   1277: aload 73
    //   1279: iconst_0
    //   1280: aload_0
    //   1281: iload 9
    //   1283: aload 73
    //   1285: arraylength
    //   1286: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1289: iload 9
    //   1291: aload 73
    //   1293: arraylength
    //   1294: iadd
    //   1295: istore 74
    //   1297: iload 74
    //   1299: iconst_1
    //   1300: iadd
    //   1301: istore 9
    //   1303: aload_0
    //   1304: iload 74
    //   1306: iconst_0
    //   1307: bastore
    //   1308: iload 9
    //   1310: iconst_1
    //   1311: iadd
    //   1312: istore 12
    //   1314: aload_0
    //   1315: iload 9
    //   1317: iconst_0
    //   1318: bastore
    //   1319: iload 12
    //   1321: iconst_1
    //   1322: iadd
    //   1323: istore 9
    //   1325: aload_0
    //   1326: iload 12
    //   1328: iconst_0
    //   1329: bastore
    //   1330: iload 9
    //   1332: iconst_1
    //   1333: iadd
    //   1334: istore 12
    //   1336: aload_0
    //   1337: iload 9
    //   1339: iconst_1
    //   1340: bastore
    //   1341: ldc_w 1938
    //   1344: ldc 59
    //   1346: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1349: astore 75
    //   1351: aload 75
    //   1353: iconst_0
    //   1354: aload_0
    //   1355: iload 12
    //   1357: aload 75
    //   1359: arraylength
    //   1360: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1363: aload 75
    //   1365: arraylength
    //   1366: istore 76
    //   1368: iload 12
    //   1370: iload 76
    //   1372: iadd
    //   1373: istore 77
    //   1375: iload 77
    //   1377: iconst_1
    //   1378: iadd
    //   1379: istore 9
    //   1381: aload_0
    //   1382: iload 77
    //   1384: iconst_0
    //   1385: bastore
    //   1386: iload 9
    //   1388: iconst_1
    //   1389: iadd
    //   1390: istore 12
    //   1392: aload_0
    //   1393: iload 9
    //   1395: iconst_1
    //   1396: bastore
    //   1397: iload 12
    //   1399: iconst_1
    //   1400: iadd
    //   1401: istore 9
    //   1403: aload_0
    //   1404: iload 12
    //   1406: iconst_2
    //   1407: bastore
    //   1408: ldc_w 1940
    //   1411: ldc 59
    //   1413: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1416: astore 78
    //   1418: aload 78
    //   1420: iconst_0
    //   1421: aload_0
    //   1422: iload 9
    //   1424: aload 78
    //   1426: arraylength
    //   1427: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1430: iload 9
    //   1432: aload 78
    //   1434: arraylength
    //   1435: iadd
    //   1436: istore 79
    //   1438: iload 79
    //   1440: iconst_1
    //   1441: iadd
    //   1442: istore 9
    //   1444: aload_0
    //   1445: iload 79
    //   1447: iconst_0
    //   1448: bastore
    //   1449: iload 9
    //   1451: iconst_1
    //   1452: iadd
    //   1453: istore 12
    //   1455: aload_0
    //   1456: iload 9
    //   1458: iconst_4
    //   1459: bastore
    //   1460: iload 12
    //   1462: iconst_1
    //   1463: iadd
    //   1464: istore 9
    //   1466: aload_0
    //   1467: iload 12
    //   1469: iconst_2
    //   1470: bastore
    //   1471: ldc_w 1942
    //   1474: ldc 59
    //   1476: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1479: astore 80
    //   1481: aload 80
    //   1483: iconst_0
    //   1484: aload_0
    //   1485: iload 9
    //   1487: aload 80
    //   1489: arraylength
    //   1490: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1493: iload 9
    //   1495: aload 80
    //   1497: arraylength
    //   1498: iadd
    //   1499: istore 81
    //   1501: iload 81
    //   1503: iconst_1
    //   1504: iadd
    //   1505: istore 9
    //   1507: aload_0
    //   1508: iload 81
    //   1510: iconst_0
    //   1511: bastore
    //   1512: iload 9
    //   1514: iconst_1
    //   1515: iadd
    //   1516: istore 12
    //   1518: aload_0
    //   1519: iload 9
    //   1521: bipush 7
    //   1523: bastore
    //   1524: iload 12
    //   1526: iconst_1
    //   1527: iadd
    //   1528: istore 9
    //   1530: aload_0
    //   1531: iload 12
    //   1533: iconst_2
    //   1534: bastore
    //   1535: ldc_w 1944
    //   1538: ldc 59
    //   1540: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1543: astore 82
    //   1545: aload 82
    //   1547: iconst_0
    //   1548: aload_0
    //   1549: iload 9
    //   1551: aload 82
    //   1553: arraylength
    //   1554: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1557: iload 9
    //   1559: aload 82
    //   1561: arraylength
    //   1562: iadd
    //   1563: istore 83
    //   1565: iload 83
    //   1567: iconst_1
    //   1568: iadd
    //   1569: istore 9
    //   1571: aload_0
    //   1572: iload 83
    //   1574: iconst_0
    //   1575: bastore
    //   1576: iload 9
    //   1578: iconst_1
    //   1579: iadd
    //   1580: istore 12
    //   1582: aload_0
    //   1583: iload 9
    //   1585: bipush 9
    //   1587: bastore
    //   1588: iload 12
    //   1590: iconst_1
    //   1591: iadd
    //   1592: istore 9
    //   1594: aload_0
    //   1595: iload 12
    //   1597: iconst_2
    //   1598: bastore
    //   1599: ldc_w 1946
    //   1602: ldc 59
    //   1604: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1607: astore 84
    //   1609: aload 84
    //   1611: iconst_0
    //   1612: aload_0
    //   1613: iload 9
    //   1615: aload 84
    //   1617: arraylength
    //   1618: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1621: iload 9
    //   1623: aload 84
    //   1625: arraylength
    //   1626: iadd
    //   1627: istore 85
    //   1629: iload 85
    //   1631: iconst_1
    //   1632: iadd
    //   1633: istore 9
    //   1635: aload_0
    //   1636: iload 85
    //   1638: iconst_0
    //   1639: bastore
    //   1640: iload 9
    //   1642: iconst_1
    //   1643: iadd
    //   1644: istore 12
    //   1646: aload_0
    //   1647: iload 9
    //   1649: bipush 17
    //   1651: bastore
    //   1652: iload 12
    //   1654: iconst_1
    //   1655: iadd
    //   1656: istore 9
    //   1658: aload_0
    //   1659: iload 12
    //   1661: iconst_1
    //   1662: bastore
    //   1663: ldc_w 1948
    //   1666: ldc 59
    //   1668: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1671: astore 86
    //   1673: aload 86
    //   1675: iconst_0
    //   1676: aload_0
    //   1677: iload 9
    //   1679: aload 86
    //   1681: arraylength
    //   1682: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1685: iload 9
    //   1687: aload 86
    //   1689: arraylength
    //   1690: iadd
    //   1691: istore 87
    //   1693: iload 87
    //   1695: iconst_1
    //   1696: iadd
    //   1697: istore 9
    //   1699: aload_0
    //   1700: iload 87
    //   1702: iconst_0
    //   1703: bastore
    //   1704: iload 9
    //   1706: iconst_1
    //   1707: iadd
    //   1708: istore 12
    //   1710: aload_0
    //   1711: iload 9
    //   1713: bipush 20
    //   1715: bastore
    //   1716: iload 12
    //   1718: iconst_1
    //   1719: iadd
    //   1720: istore 9
    //   1722: aload_0
    //   1723: iload 12
    //   1725: iconst_1
    //   1726: bastore
    //   1727: ldc_w 1950
    //   1730: ldc 59
    //   1732: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1735: astore 88
    //   1737: aload 88
    //   1739: iconst_0
    //   1740: aload_0
    //   1741: iload 9
    //   1743: aload 88
    //   1745: arraylength
    //   1746: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1749: iload 9
    //   1751: aload 88
    //   1753: arraylength
    //   1754: iadd
    //   1755: istore 89
    //   1757: iload 89
    //   1759: iconst_1
    //   1760: iadd
    //   1761: istore 9
    //   1763: aload_0
    //   1764: iload 89
    //   1766: iconst_0
    //   1767: bastore
    //   1768: iload 9
    //   1770: iconst_1
    //   1771: iadd
    //   1772: istore 12
    //   1774: aload_0
    //   1775: iload 9
    //   1777: bipush 20
    //   1779: bastore
    //   1780: iload 12
    //   1782: iconst_1
    //   1783: iadd
    //   1784: istore 9
    //   1786: aload_0
    //   1787: iload 12
    //   1789: iconst_2
    //   1790: bastore
    //   1791: ldc_w 1952
    //   1794: ldc 59
    //   1796: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1799: astore 90
    //   1801: aload 90
    //   1803: iconst_0
    //   1804: aload_0
    //   1805: iload 9
    //   1807: aload 90
    //   1809: arraylength
    //   1810: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1813: iload 9
    //   1815: aload 90
    //   1817: arraylength
    //   1818: iadd
    //   1819: istore 91
    //   1821: iload 91
    //   1823: iconst_1
    //   1824: iadd
    //   1825: istore 9
    //   1827: aload_0
    //   1828: iload 91
    //   1830: iconst_0
    //   1831: bastore
    //   1832: iload 9
    //   1834: iconst_1
    //   1835: iadd
    //   1836: istore 12
    //   1838: aload_0
    //   1839: iload 9
    //   1841: bipush 23
    //   1843: bastore
    //   1844: iload 12
    //   1846: iconst_1
    //   1847: iadd
    //   1848: istore 9
    //   1850: aload_0
    //   1851: iload 12
    //   1853: iconst_1
    //   1854: bastore
    //   1855: ldc_w 1954
    //   1858: ldc 59
    //   1860: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1863: astore 92
    //   1865: aload 92
    //   1867: iconst_0
    //   1868: aload_0
    //   1869: iload 9
    //   1871: aload 92
    //   1873: arraylength
    //   1874: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1877: iload 9
    //   1879: aload 92
    //   1881: arraylength
    //   1882: iadd
    //   1883: istore 93
    //   1885: iload 93
    //   1887: iconst_1
    //   1888: iadd
    //   1889: istore 9
    //   1891: aload_0
    //   1892: iload 93
    //   1894: iconst_0
    //   1895: bastore
    //   1896: iload 9
    //   1898: iconst_1
    //   1899: iadd
    //   1900: istore 12
    //   1902: aload_0
    //   1903: iload 9
    //   1905: bipush 26
    //   1907: bastore
    //   1908: iload 12
    //   1910: iconst_1
    //   1911: iadd
    //   1912: istore 9
    //   1914: aload_0
    //   1915: iload 12
    //   1917: iconst_2
    //   1918: bastore
    //   1919: ldc_w 1956
    //   1922: ldc 59
    //   1924: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1927: astore 94
    //   1929: aload 94
    //   1931: iconst_0
    //   1932: aload_0
    //   1933: iload 9
    //   1935: aload 94
    //   1937: arraylength
    //   1938: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1941: iload 9
    //   1943: aload 94
    //   1945: arraylength
    //   1946: iadd
    //   1947: istore 95
    //   1949: iload 95
    //   1951: iconst_1
    //   1952: iadd
    //   1953: istore 9
    //   1955: aload_0
    //   1956: iload 95
    //   1958: iconst_0
    //   1959: bastore
    //   1960: iload 9
    //   1962: iconst_1
    //   1963: iadd
    //   1964: istore 12
    //   1966: aload_0
    //   1967: iload 9
    //   1969: bipush 32
    //   1971: bastore
    //   1972: iload 12
    //   1974: iconst_1
    //   1975: iadd
    //   1976: istore 9
    //   1978: aload_0
    //   1979: iload 12
    //   1981: iconst_2
    //   1982: bastore
    //   1983: ldc_w 1958
    //   1986: ldc 59
    //   1988: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1991: astore 96
    //   1993: aload 96
    //   1995: iconst_0
    //   1996: aload_0
    //   1997: iload 9
    //   1999: aload 96
    //   2001: arraylength
    //   2002: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2005: iload 9
    //   2007: aload 96
    //   2009: arraylength
    //   2010: iadd
    //   2011: istore 97
    //   2013: iload 97
    //   2015: iconst_1
    //   2016: iadd
    //   2017: istore 9
    //   2019: aload_0
    //   2020: iload 97
    //   2022: iconst_0
    //   2023: bastore
    //   2024: iload 9
    //   2026: iconst_1
    //   2027: iadd
    //   2028: istore 12
    //   2030: aload_0
    //   2031: iload 9
    //   2033: bipush 36
    //   2035: bastore
    //   2036: iload 12
    //   2038: iconst_1
    //   2039: iadd
    //   2040: istore 9
    //   2042: aload_0
    //   2043: iload 12
    //   2045: iconst_1
    //   2046: bastore
    //   2047: ldc_w 1960
    //   2050: ldc 59
    //   2052: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2055: astore 98
    //   2057: aload 98
    //   2059: iconst_0
    //   2060: aload_0
    //   2061: iload 9
    //   2063: aload 98
    //   2065: arraylength
    //   2066: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2069: iload 9
    //   2071: aload 98
    //   2073: arraylength
    //   2074: iadd
    //   2075: istore 99
    //   2077: iload 99
    //   2079: iconst_1
    //   2080: iadd
    //   2081: istore 9
    //   2083: aload_0
    //   2084: iload 99
    //   2086: iconst_0
    //   2087: bastore
    //   2088: iload 9
    //   2090: iconst_1
    //   2091: iadd
    //   2092: istore 12
    //   2094: aload_0
    //   2095: iload 9
    //   2097: bipush 37
    //   2099: bastore
    //   2100: iload 12
    //   2102: iconst_1
    //   2103: iadd
    //   2104: istore 9
    //   2106: aload_0
    //   2107: iload 12
    //   2109: iconst_2
    //   2110: bastore
    //   2111: ldc_w 1962
    //   2114: ldc 59
    //   2116: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2119: astore 100
    //   2121: aload 100
    //   2123: iconst_0
    //   2124: aload_0
    //   2125: iload 9
    //   2127: aload 100
    //   2129: arraylength
    //   2130: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2133: iload 9
    //   2135: aload 100
    //   2137: arraylength
    //   2138: iadd
    //   2139: istore 101
    //   2141: iload 101
    //   2143: iconst_1
    //   2144: iadd
    //   2145: istore 9
    //   2147: aload_0
    //   2148: iload 101
    //   2150: iconst_0
    //   2151: bastore
    //   2152: iload 9
    //   2154: iconst_1
    //   2155: iadd
    //   2156: istore 12
    //   2158: aload_0
    //   2159: iload 9
    //   2161: bipush 40
    //   2163: bastore
    //   2164: iload 12
    //   2166: iconst_1
    //   2167: iadd
    //   2168: istore 9
    //   2170: aload_0
    //   2171: iload 12
    //   2173: iconst_1
    //   2174: bastore
    //   2175: ldc_w 1964
    //   2178: ldc 59
    //   2180: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2183: astore 102
    //   2185: aload 102
    //   2187: iconst_0
    //   2188: aload_0
    //   2189: iload 9
    //   2191: aload 102
    //   2193: arraylength
    //   2194: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2197: iload 9
    //   2199: aload 102
    //   2201: arraylength
    //   2202: iadd
    //   2203: istore 103
    //   2205: iload 103
    //   2207: iconst_1
    //   2208: iadd
    //   2209: istore 9
    //   2211: aload_0
    //   2212: iload 103
    //   2214: iconst_0
    //   2215: bastore
    //   2216: iload 9
    //   2218: iconst_1
    //   2219: iadd
    //   2220: istore 12
    //   2222: aload_0
    //   2223: iload 9
    //   2225: bipush 49
    //   2227: bastore
    //   2228: iload 12
    //   2230: iconst_1
    //   2231: iadd
    //   2232: istore 9
    //   2234: aload_0
    //   2235: iload 12
    //   2237: iconst_2
    //   2238: bastore
    //   2239: ldc_w 1966
    //   2242: ldc 59
    //   2244: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2247: astore 104
    //   2249: aload 104
    //   2251: iconst_0
    //   2252: aload_0
    //   2253: iload 9
    //   2255: aload 104
    //   2257: arraylength
    //   2258: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2261: iload 9
    //   2263: aload 104
    //   2265: arraylength
    //   2266: iadd
    //   2267: istore 105
    //   2269: iload 105
    //   2271: iconst_1
    //   2272: iadd
    //   2273: istore 9
    //   2275: aload_0
    //   2276: iload 105
    //   2278: iconst_0
    //   2279: bastore
    //   2280: iload 9
    //   2282: iconst_1
    //   2283: iadd
    //   2284: istore 12
    //   2286: aload_0
    //   2287: iload 9
    //   2289: bipush 53
    //   2291: bastore
    //   2292: iload 12
    //   2294: iconst_1
    //   2295: iadd
    //   2296: istore 9
    //   2298: aload_0
    //   2299: iload 12
    //   2301: iconst_1
    //   2302: bastore
    //   2303: ldc_w 1968
    //   2306: ldc 59
    //   2308: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2311: astore 106
    //   2313: aload 106
    //   2315: iconst_0
    //   2316: aload_0
    //   2317: iload 9
    //   2319: aload 106
    //   2321: arraylength
    //   2322: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2325: iload 9
    //   2327: aload 106
    //   2329: arraylength
    //   2330: iadd
    //   2331: istore 107
    //   2333: iload 107
    //   2335: iconst_1
    //   2336: iadd
    //   2337: istore 9
    //   2339: aload_0
    //   2340: iload 107
    //   2342: iconst_0
    //   2343: bastore
    //   2344: iload 9
    //   2346: iconst_1
    //   2347: iadd
    //   2348: istore 12
    //   2350: aload_0
    //   2351: iload 9
    //   2353: bipush 56
    //   2355: bastore
    //   2356: iload 12
    //   2358: iconst_1
    //   2359: iadd
    //   2360: istore 9
    //   2362: aload_0
    //   2363: iload 12
    //   2365: iconst_2
    //   2366: bastore
    //   2367: ldc_w 1970
    //   2370: ldc 59
    //   2372: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2375: astore 108
    //   2377: aload 108
    //   2379: iconst_0
    //   2380: aload_0
    //   2381: iload 9
    //   2383: aload 108
    //   2385: arraylength
    //   2386: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2389: iload 9
    //   2391: aload 108
    //   2393: arraylength
    //   2394: iadd
    //   2395: istore 109
    //   2397: iload 109
    //   2399: iconst_1
    //   2400: iadd
    //   2401: istore 9
    //   2403: aload_0
    //   2404: iload 109
    //   2406: iconst_0
    //   2407: bastore
    //   2408: iload 9
    //   2410: iconst_1
    //   2411: iadd
    //   2412: istore 12
    //   2414: aload_0
    //   2415: iload 9
    //   2417: bipush 60
    //   2419: bastore
    //   2420: iload 12
    //   2422: iconst_1
    //   2423: iadd
    //   2424: istore 9
    //   2426: aload_0
    //   2427: iload 12
    //   2429: iconst_1
    //   2430: bastore
    //   2431: ldc_w 1972
    //   2434: ldc 59
    //   2436: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2439: astore 110
    //   2441: aload 110
    //   2443: iconst_0
    //   2444: aload_0
    //   2445: iload 9
    //   2447: aload 110
    //   2449: arraylength
    //   2450: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2453: iload 9
    //   2455: aload 110
    //   2457: arraylength
    //   2458: iadd
    //   2459: istore 111
    //   2461: iload 111
    //   2463: iconst_1
    //   2464: iadd
    //   2465: istore 9
    //   2467: aload_0
    //   2468: iload 111
    //   2470: iconst_0
    //   2471: bastore
    //   2472: iload 9
    //   2474: iconst_1
    //   2475: iadd
    //   2476: istore 12
    //   2478: aload_0
    //   2479: iload 9
    //   2481: bipush 61
    //   2483: bastore
    //   2484: iload 12
    //   2486: iconst_1
    //   2487: iadd
    //   2488: istore 9
    //   2490: aload_0
    //   2491: iload 12
    //   2493: iconst_2
    //   2494: bastore
    //   2495: ldc_w 1974
    //   2498: ldc 59
    //   2500: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2503: astore 112
    //   2505: aload 112
    //   2507: iconst_0
    //   2508: aload_0
    //   2509: iload 9
    //   2511: aload 112
    //   2513: arraylength
    //   2514: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2517: iload 9
    //   2519: aload 112
    //   2521: arraylength
    //   2522: iadd
    //   2523: istore 113
    //   2525: iload 113
    //   2527: iconst_1
    //   2528: iadd
    //   2529: istore 9
    //   2531: aload_0
    //   2532: iload 113
    //   2534: iconst_0
    //   2535: bastore
    //   2536: iload 9
    //   2538: iconst_1
    //   2539: iadd
    //   2540: istore 12
    //   2542: aload_0
    //   2543: iload 9
    //   2545: bipush 66
    //   2547: bastore
    //   2548: iload 12
    //   2550: iconst_1
    //   2551: iadd
    //   2552: istore 9
    //   2554: aload_0
    //   2555: iload 12
    //   2557: iconst_1
    //   2558: bastore
    //   2559: ldc_w 1976
    //   2562: ldc 59
    //   2564: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2567: astore 114
    //   2569: aload 114
    //   2571: iconst_0
    //   2572: aload_0
    //   2573: iload 9
    //   2575: aload 114
    //   2577: arraylength
    //   2578: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2581: iload 9
    //   2583: aload 114
    //   2585: arraylength
    //   2586: iadd
    //   2587: istore 115
    //   2589: iload 115
    //   2591: iconst_1
    //   2592: iadd
    //   2593: istore 9
    //   2595: aload_0
    //   2596: iload 115
    //   2598: iconst_0
    //   2599: bastore
    //   2600: iload 9
    //   2602: iconst_1
    //   2603: iadd
    //   2604: istore 12
    //   2606: aload_0
    //   2607: iload 9
    //   2609: bipush 73
    //   2611: bastore
    //   2612: iload 12
    //   2614: iconst_1
    //   2615: iadd
    //   2616: istore 9
    //   2618: aload_0
    //   2619: iload 12
    //   2621: iconst_2
    //   2622: bastore
    //   2623: ldc_w 1978
    //   2626: ldc 59
    //   2628: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2631: astore 116
    //   2633: aload 116
    //   2635: iconst_0
    //   2636: aload_0
    //   2637: iload 9
    //   2639: aload 116
    //   2641: arraylength
    //   2642: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2645: iload 9
    //   2647: aload 116
    //   2649: arraylength
    //   2650: iadd
    //   2651: istore 117
    //   2653: iload 117
    //   2655: iconst_1
    //   2656: iadd
    //   2657: istore 9
    //   2659: aload_0
    //   2660: iload 117
    //   2662: iconst_0
    //   2663: bastore
    //   2664: iload 9
    //   2666: iconst_1
    //   2667: iadd
    //   2668: istore 12
    //   2670: aload_0
    //   2671: iload 9
    //   2673: bipush 75
    //   2675: bastore
    //   2676: iload 12
    //   2678: iconst_1
    //   2679: iadd
    //   2680: istore 9
    //   2682: aload_0
    //   2683: iload 12
    //   2685: iconst_1
    //   2686: bastore
    //   2687: ldc_w 1980
    //   2690: ldc 59
    //   2692: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2695: astore 118
    //   2697: aload 118
    //   2699: iconst_0
    //   2700: aload_0
    //   2701: iload 9
    //   2703: aload 118
    //   2705: arraylength
    //   2706: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2709: iload 9
    //   2711: aload 118
    //   2713: arraylength
    //   2714: iadd
    //   2715: istore 119
    //   2717: iload 119
    //   2719: iconst_1
    //   2720: iadd
    //   2721: istore 9
    //   2723: aload_0
    //   2724: iload 119
    //   2726: iconst_0
    //   2727: bastore
    //   2728: iload 9
    //   2730: iconst_1
    //   2731: iadd
    //   2732: istore 12
    //   2734: aload_0
    //   2735: iload 9
    //   2737: bipush 83
    //   2739: bastore
    //   2740: iload 12
    //   2742: iconst_1
    //   2743: iadd
    //   2744: istore 9
    //   2746: aload_0
    //   2747: iload 12
    //   2749: iconst_1
    //   2750: bastore
    //   2751: ldc_w 1982
    //   2754: ldc 59
    //   2756: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2759: astore 120
    //   2761: aload 120
    //   2763: iconst_0
    //   2764: aload_0
    //   2765: iload 9
    //   2767: aload 120
    //   2769: arraylength
    //   2770: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2773: iload 9
    //   2775: aload 120
    //   2777: arraylength
    //   2778: iadd
    //   2779: istore 121
    //   2781: iload 121
    //   2783: iconst_1
    //   2784: iadd
    //   2785: istore 9
    //   2787: aload_0
    //   2788: iload 121
    //   2790: iconst_0
    //   2791: bastore
    //   2792: iload 9
    //   2794: iconst_1
    //   2795: iadd
    //   2796: istore 12
    //   2798: aload_0
    //   2799: iload 9
    //   2801: bipush 88
    //   2803: bastore
    //   2804: iload 12
    //   2806: iconst_1
    //   2807: iadd
    //   2808: istore 9
    //   2810: aload_0
    //   2811: iload 12
    //   2813: iconst_1
    //   2814: bastore
    //   2815: ldc_w 1984
    //   2818: ldc 59
    //   2820: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2823: astore 122
    //   2825: aload 122
    //   2827: iconst_0
    //   2828: aload_0
    //   2829: iload 9
    //   2831: aload 122
    //   2833: arraylength
    //   2834: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2837: iload 9
    //   2839: aload 122
    //   2841: arraylength
    //   2842: iadd
    //   2843: istore 123
    //   2845: iload 123
    //   2847: iconst_1
    //   2848: iadd
    //   2849: istore 9
    //   2851: aload_0
    //   2852: iload 123
    //   2854: iconst_0
    //   2855: bastore
    //   2856: iload 9
    //   2858: iconst_1
    //   2859: iadd
    //   2860: istore 12
    //   2862: aload_0
    //   2863: iload 9
    //   2865: bipush 90
    //   2867: bastore
    //   2868: iload 12
    //   2870: iconst_1
    //   2871: iadd
    //   2872: istore 9
    //   2874: aload_0
    //   2875: iload 12
    //   2877: iconst_1
    //   2878: bastore
    //   2879: ldc_w 1986
    //   2882: ldc 59
    //   2884: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2887: astore 124
    //   2889: aload 124
    //   2891: iconst_0
    //   2892: aload_0
    //   2893: iload 9
    //   2895: aload 124
    //   2897: arraylength
    //   2898: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2901: iload 9
    //   2903: aload 124
    //   2905: arraylength
    //   2906: iadd
    //   2907: istore 125
    //   2909: iload 125
    //   2911: iconst_1
    //   2912: iadd
    //   2913: istore 9
    //   2915: aload_0
    //   2916: iload 125
    //   2918: iconst_0
    //   2919: bastore
    //   2920: iload 9
    //   2922: iconst_1
    //   2923: iadd
    //   2924: istore 12
    //   2926: aload_0
    //   2927: iload 9
    //   2929: bipush 95
    //   2931: bastore
    //   2932: iload 12
    //   2934: iconst_1
    //   2935: iadd
    //   2936: istore 9
    //   2938: aload_0
    //   2939: iload 12
    //   2941: iconst_1
    //   2942: bastore
    //   2943: ldc_w 1988
    //   2946: ldc 59
    //   2948: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2951: astore 126
    //   2953: aload 126
    //   2955: iconst_0
    //   2956: aload_0
    //   2957: iload 9
    //   2959: aload 126
    //   2961: arraylength
    //   2962: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2965: iload 9
    //   2967: aload 126
    //   2969: arraylength
    //   2970: iadd
    //   2971: istore 127
    //   2973: iload 127
    //   2975: iconst_1
    //   2976: iadd
    //   2977: istore 9
    //   2979: aload_0
    //   2980: iload 127
    //   2982: iconst_0
    //   2983: bastore
    //   2984: iload 9
    //   2986: istore 12
    //   2988: new 168	java/io/File
    //   2991: dup
    //   2992: ldc_w 1990
    //   2995: invokespecial 173	java/io/File:<init>	(Ljava/lang/String;)V
    //   2998: aload_0
    //   2999: iload 12
    //   3001: invokestatic 179	net/oicp/anya/Utils:writeBytes2File	(Ljava/io/File;[BI)V
    //   3004: return
    //   3005: astore 10
    //   3007: aload 10
    //   3009: astore 11
    //   3011: iload 9
    //   3013: istore 12
    //   3015: aload 11
    //   3017: invokevirtual 182	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   3020: goto -32 -> 2988
    //   3023: astore 19
    //   3025: aload 19
    //   3027: astore 11
    //   3029: goto -14 -> 3015
    // Local variable table:
    //   start	length	slot	name	signature
    //   5	2994	0	arrayOfByte1	byte[]
    //   11	11	1	arrayOfByte2	byte[]
    //   23	7	2	i	int
    //   27	12	3	j	int
    //   35	14	4	k	int
    //   45	15	5	m	int
    //   56	16	6	n	int
    //   68	15	7	i1	int
    //   79	16	8	i2	int
    //   91	2921	9	i3	int
    //   3005	3	10	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   3009	19	11	localObject	Object
    //   226	2788	12	i4	int
    //   107	17	13	arrayOfByte3	byte[]
    //   127	10	14	i5	int
    //   148	17	15	arrayOfByte4	byte[]
    //   168	10	16	i6	int
    //   189	17	17	arrayOfByte5	byte[]
    //   209	10	18	i7	int
    //   3023	3	19	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   240	15	20	arrayOfByte6	byte[]
    //   257	7	21	i8	int
    //   264	10	22	i9	int
    //   296	15	23	arrayOfByte7	byte[]
    //   313	7	24	i10	int
    //   320	10	25	i11	int
    //   341	17	26	arrayOfByte8	byte[]
    //   361	10	27	i12	int
    //   393	15	28	arrayOfByte9	byte[]
    //   410	7	29	i13	int
    //   417	10	30	i14	int
    //   438	17	31	arrayOfByte10	byte[]
    //   458	10	32	i15	int
    //   479	17	33	arrayOfByte11	byte[]
    //   499	10	34	i16	int
    //   520	17	35	arrayOfByte12	byte[]
    //   540	10	36	i17	int
    //   561	17	37	arrayOfByte13	byte[]
    //   581	10	38	i18	int
    //   601	17	39	arrayOfByte14	byte[]
    //   621	10	40	i19	int
    //   653	15	41	arrayOfByte15	byte[]
    //   670	7	42	i20	int
    //   677	10	43	i21	int
    //   698	17	44	arrayOfByte16	byte[]
    //   718	10	45	i22	int
    //   750	15	46	arrayOfByte17	byte[]
    //   767	7	47	i23	int
    //   774	10	48	i24	int
    //   806	15	49	arrayOfByte18	byte[]
    //   823	7	50	i25	int
    //   830	10	51	i26	int
    //   851	17	52	arrayOfByte19	byte[]
    //   871	10	53	i27	int
    //   892	17	54	arrayOfByte20	byte[]
    //   912	10	55	i28	int
    //   933	17	56	arrayOfByte21	byte[]
    //   953	10	57	i29	int
    //   974	17	58	arrayOfByte22	byte[]
    //   994	10	59	i30	int
    //   1015	17	60	arrayOfByte23	byte[]
    //   1035	10	61	i31	int
    //   1067	15	62	arrayOfByte24	byte[]
    //   1084	7	63	i32	int
    //   1091	10	64	i33	int
    //   1112	17	65	arrayOfByte25	byte[]
    //   1132	10	66	i34	int
    //   1153	17	67	arrayOfByte26	byte[]
    //   1173	10	68	i35	int
    //   1193	17	69	arrayOfByte27	byte[]
    //   1213	10	70	i36	int
    //   1234	17	71	arrayOfByte28	byte[]
    //   1254	10	72	i37	int
    //   1275	17	73	arrayOfByte29	byte[]
    //   1295	10	74	i38	int
    //   1349	15	75	arrayOfByte30	byte[]
    //   1366	7	76	i39	int
    //   1373	10	77	i40	int
    //   1416	17	78	arrayOfByte31	byte[]
    //   1436	10	79	i41	int
    //   1479	17	80	arrayOfByte32	byte[]
    //   1499	10	81	i42	int
    //   1543	17	82	arrayOfByte33	byte[]
    //   1563	10	83	i43	int
    //   1607	17	84	arrayOfByte34	byte[]
    //   1627	10	85	i44	int
    //   1671	17	86	arrayOfByte35	byte[]
    //   1691	10	87	i45	int
    //   1735	17	88	arrayOfByte36	byte[]
    //   1755	10	89	i46	int
    //   1799	17	90	arrayOfByte37	byte[]
    //   1819	10	91	i47	int
    //   1863	17	92	arrayOfByte38	byte[]
    //   1883	10	93	i48	int
    //   1927	17	94	arrayOfByte39	byte[]
    //   1947	10	95	i49	int
    //   1991	17	96	arrayOfByte40	byte[]
    //   2011	10	97	i50	int
    //   2055	17	98	arrayOfByte41	byte[]
    //   2075	10	99	i51	int
    //   2119	17	100	arrayOfByte42	byte[]
    //   2139	10	101	i52	int
    //   2183	17	102	arrayOfByte43	byte[]
    //   2203	10	103	i53	int
    //   2247	17	104	arrayOfByte44	byte[]
    //   2267	10	105	i54	int
    //   2311	17	106	arrayOfByte45	byte[]
    //   2331	10	107	i55	int
    //   2375	17	108	arrayOfByte46	byte[]
    //   2395	10	109	i56	int
    //   2439	17	110	arrayOfByte47	byte[]
    //   2459	10	111	i57	int
    //   2503	17	112	arrayOfByte48	byte[]
    //   2523	10	113	i58	int
    //   2567	17	114	arrayOfByte49	byte[]
    //   2587	10	115	i59	int
    //   2631	17	116	arrayOfByte50	byte[]
    //   2651	10	117	i60	int
    //   2695	17	118	arrayOfByte51	byte[]
    //   2715	10	119	i61	int
    //   2759	17	120	arrayOfByte52	byte[]
    //   2779	10	121	i62	int
    //   2823	17	122	arrayOfByte53	byte[]
    //   2843	10	123	i63	int
    //   2887	17	124	arrayOfByte54	byte[]
    //   2907	10	125	i64	int
    //   2951	17	126	arrayOfByte55	byte[]
    //   2971	10	127	i65	int
    // Exception table:
    //   from	to	target	type
    //   99	129	3005	java/io/UnsupportedEncodingException
    //   135	170	3005	java/io/UnsupportedEncodingException
    //   176	211	3005	java/io/UnsupportedEncodingException
    //   217	222	3005	java/io/UnsupportedEncodingException
    //   272	277	3005	java/io/UnsupportedEncodingException
    //   328	363	3005	java/io/UnsupportedEncodingException
    //   369	374	3005	java/io/UnsupportedEncodingException
    //   425	460	3005	java/io/UnsupportedEncodingException
    //   466	501	3005	java/io/UnsupportedEncodingException
    //   507	542	3005	java/io/UnsupportedEncodingException
    //   548	583	3005	java/io/UnsupportedEncodingException
    //   589	623	3005	java/io/UnsupportedEncodingException
    //   629	634	3005	java/io/UnsupportedEncodingException
    //   685	720	3005	java/io/UnsupportedEncodingException
    //   726	731	3005	java/io/UnsupportedEncodingException
    //   782	787	3005	java/io/UnsupportedEncodingException
    //   838	873	3005	java/io/UnsupportedEncodingException
    //   879	914	3005	java/io/UnsupportedEncodingException
    //   920	955	3005	java/io/UnsupportedEncodingException
    //   961	996	3005	java/io/UnsupportedEncodingException
    //   1002	1037	3005	java/io/UnsupportedEncodingException
    //   1043	1048	3005	java/io/UnsupportedEncodingException
    //   1099	1134	3005	java/io/UnsupportedEncodingException
    //   1140	1175	3005	java/io/UnsupportedEncodingException
    //   1181	1215	3005	java/io/UnsupportedEncodingException
    //   1221	1256	3005	java/io/UnsupportedEncodingException
    //   1262	1297	3005	java/io/UnsupportedEncodingException
    //   1303	1308	3005	java/io/UnsupportedEncodingException
    //   1325	1330	3005	java/io/UnsupportedEncodingException
    //   1381	1386	3005	java/io/UnsupportedEncodingException
    //   1403	1438	3005	java/io/UnsupportedEncodingException
    //   1444	1449	3005	java/io/UnsupportedEncodingException
    //   1466	1501	3005	java/io/UnsupportedEncodingException
    //   1507	1512	3005	java/io/UnsupportedEncodingException
    //   1530	1565	3005	java/io/UnsupportedEncodingException
    //   1571	1576	3005	java/io/UnsupportedEncodingException
    //   1594	1629	3005	java/io/UnsupportedEncodingException
    //   1635	1640	3005	java/io/UnsupportedEncodingException
    //   1658	1693	3005	java/io/UnsupportedEncodingException
    //   1699	1704	3005	java/io/UnsupportedEncodingException
    //   1722	1757	3005	java/io/UnsupportedEncodingException
    //   1763	1768	3005	java/io/UnsupportedEncodingException
    //   1786	1821	3005	java/io/UnsupportedEncodingException
    //   1827	1832	3005	java/io/UnsupportedEncodingException
    //   1850	1885	3005	java/io/UnsupportedEncodingException
    //   1891	1896	3005	java/io/UnsupportedEncodingException
    //   1914	1949	3005	java/io/UnsupportedEncodingException
    //   1955	1960	3005	java/io/UnsupportedEncodingException
    //   1978	2013	3005	java/io/UnsupportedEncodingException
    //   2019	2024	3005	java/io/UnsupportedEncodingException
    //   2042	2077	3005	java/io/UnsupportedEncodingException
    //   2083	2088	3005	java/io/UnsupportedEncodingException
    //   2106	2141	3005	java/io/UnsupportedEncodingException
    //   2147	2152	3005	java/io/UnsupportedEncodingException
    //   2170	2205	3005	java/io/UnsupportedEncodingException
    //   2211	2216	3005	java/io/UnsupportedEncodingException
    //   2234	2269	3005	java/io/UnsupportedEncodingException
    //   2275	2280	3005	java/io/UnsupportedEncodingException
    //   2298	2333	3005	java/io/UnsupportedEncodingException
    //   2339	2344	3005	java/io/UnsupportedEncodingException
    //   2362	2397	3005	java/io/UnsupportedEncodingException
    //   2403	2408	3005	java/io/UnsupportedEncodingException
    //   2426	2461	3005	java/io/UnsupportedEncodingException
    //   2467	2472	3005	java/io/UnsupportedEncodingException
    //   2490	2525	3005	java/io/UnsupportedEncodingException
    //   2531	2536	3005	java/io/UnsupportedEncodingException
    //   2554	2589	3005	java/io/UnsupportedEncodingException
    //   2595	2600	3005	java/io/UnsupportedEncodingException
    //   2618	2653	3005	java/io/UnsupportedEncodingException
    //   2659	2664	3005	java/io/UnsupportedEncodingException
    //   2682	2717	3005	java/io/UnsupportedEncodingException
    //   2723	2728	3005	java/io/UnsupportedEncodingException
    //   2746	2781	3005	java/io/UnsupportedEncodingException
    //   2787	2792	3005	java/io/UnsupportedEncodingException
    //   2810	2845	3005	java/io/UnsupportedEncodingException
    //   2851	2856	3005	java/io/UnsupportedEncodingException
    //   2874	2909	3005	java/io/UnsupportedEncodingException
    //   2915	2920	3005	java/io/UnsupportedEncodingException
    //   2938	2973	3005	java/io/UnsupportedEncodingException
    //   2979	2984	3005	java/io/UnsupportedEncodingException
    //   228	259	3023	java/io/UnsupportedEncodingException
    //   283	315	3023	java/io/UnsupportedEncodingException
    //   380	412	3023	java/io/UnsupportedEncodingException
    //   640	672	3023	java/io/UnsupportedEncodingException
    //   737	769	3023	java/io/UnsupportedEncodingException
    //   793	825	3023	java/io/UnsupportedEncodingException
    //   1054	1086	3023	java/io/UnsupportedEncodingException
    //   1314	1319	3023	java/io/UnsupportedEncodingException
    //   1336	1368	3023	java/io/UnsupportedEncodingException
    //   1392	1397	3023	java/io/UnsupportedEncodingException
    //   1455	1460	3023	java/io/UnsupportedEncodingException
    //   1518	1524	3023	java/io/UnsupportedEncodingException
    //   1582	1588	3023	java/io/UnsupportedEncodingException
    //   1646	1652	3023	java/io/UnsupportedEncodingException
    //   1710	1716	3023	java/io/UnsupportedEncodingException
    //   1774	1780	3023	java/io/UnsupportedEncodingException
    //   1838	1844	3023	java/io/UnsupportedEncodingException
    //   1902	1908	3023	java/io/UnsupportedEncodingException
    //   1966	1972	3023	java/io/UnsupportedEncodingException
    //   2030	2036	3023	java/io/UnsupportedEncodingException
    //   2094	2100	3023	java/io/UnsupportedEncodingException
    //   2158	2164	3023	java/io/UnsupportedEncodingException
    //   2222	2228	3023	java/io/UnsupportedEncodingException
    //   2286	2292	3023	java/io/UnsupportedEncodingException
    //   2350	2356	3023	java/io/UnsupportedEncodingException
    //   2414	2420	3023	java/io/UnsupportedEncodingException
    //   2478	2484	3023	java/io/UnsupportedEncodingException
    //   2542	2548	3023	java/io/UnsupportedEncodingException
    //   2606	2612	3023	java/io/UnsupportedEncodingException
    //   2670	2676	3023	java/io/UnsupportedEncodingException
    //   2734	2740	3023	java/io/UnsupportedEncodingException
    //   2798	2804	3023	java/io/UnsupportedEncodingException
    //   2862	2868	3023	java/io/UnsupportedEncodingException
    //   2926	2932	3023	java/io/UnsupportedEncodingException
  }
  
  public static void genCrossword27()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 38;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "独".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        byte[] arrayOfByte7;
        int i10;
        byte[] arrayOfByte8;
        int i11;
        int i12;
        byte[] arrayOfByte9;
        int i13;
        byte[] arrayOfByte10;
        int i14;
        int i15;
        byte[] arrayOfByte11;
        int i16;
        byte[] arrayOfByte12;
        int i17;
        byte[] arrayOfByte13;
        int i18;
        int i19;
        byte[] arrayOfByte14;
        int i20;
        byte[] arrayOfByte15;
        int i21;
        int i22;
        byte[] arrayOfByte16;
        int i23;
        byte[] arrayOfByte17;
        int i24;
        byte[] arrayOfByte18;
        int i25;
        byte[] arrayOfByte19;
        int i26;
        byte[] arrayOfByte20;
        int i27;
        byte[] arrayOfByte21;
        int i28;
        byte[] arrayOfByte22;
        int i29;
        byte[] arrayOfByte23;
        int i30;
        byte[] arrayOfByte24;
        int i31;
        byte[] arrayOfByte25;
        int i32;
        byte[] arrayOfByte26;
        int i33;
        byte[] arrayOfByte27;
        int i34;
        byte[] arrayOfByte28;
        int i35;
        byte[] arrayOfByte29;
        int i36;
        byte[] arrayOfByte30;
        int i37;
        int i38;
        byte[] arrayOfByte31;
        int i39;
        byte[] arrayOfByte32;
        int i40;
        byte[] arrayOfByte33;
        int i41;
        byte[] arrayOfByte34;
        int i42;
        byte[] arrayOfByte35;
        int i43;
        byte[] arrayOfByte36;
        int i44;
        byte[] arrayOfByte37;
        int i45;
        byte[] arrayOfByte38;
        int i46;
        byte[] arrayOfByte39;
        int i47;
        byte[] arrayOfByte40;
        int i48;
        byte[] arrayOfByte41;
        int i49;
        byte[] arrayOfByte42;
        int i50;
        byte[] arrayOfByte43;
        int i51;
        byte[] arrayOfByte44;
        int i52;
        byte[] arrayOfByte45;
        int i53;
        byte[] arrayOfByte46;
        int i54;
        byte[] arrayOfByte47;
        int i55;
        byte[] arrayOfByte48;
        int i56;
        byte[] arrayOfByte49;
        int i57;
        byte[] arrayOfByte50;
        int i58;
        byte[] arrayOfByte51;
        int i59;
        byte[] arrayOfByte52;
        int i60;
        byte[] arrayOfByte53;
        int i61;
        byte[] arrayOfByte54;
        int i62;
        byte[] arrayOfByte55;
        int i63;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "东亚运动会".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte5 = "玄在水一方".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
          i8 = i3 + arrayOfByte5.length;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          arrayOfByte6 = "筹".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i9 = i3 + arrayOfByte6.length;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          arrayOfByte7 = "计算机异".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
          i10 = i3 + arrayOfByte7.length;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte8 = "朔".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i4, arrayOfByte8.length);
          i11 = arrayOfByte8.length;
          i12 = i4 + i11;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte9 = "帷".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i13 = i3 + arrayOfByte9.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte10 = "术".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i4, arrayOfByte10.length);
          i14 = arrayOfByte10.length;
          i15 = i4 + i14;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte11 = "乡".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i16 = i3 + arrayOfByte11.length;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          arrayOfByte12 = "三".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i17 = i3 + arrayOfByte12.length;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte13 = "幄".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i18 = arrayOfByte13.length;
          i19 = i4 + i18;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte14 = "恶".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i20 = i3 + arrayOfByte14.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte15 = "为人民服务".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i4, arrayOfByte15.length);
          i21 = arrayOfByte15.length;
          i22 = i4 + i21;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte16 = "兵来将挡异".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i23 = i3 + arrayOfByte16.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          arrayOfByte17 = "主".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i24 = i3 + arrayOfByte17.length;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte18 = "车".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i25 = i3 + arrayOfByte18.length;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte19 = "军".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i26 = i3 + arrayOfByte19.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          arrayOfByte20 = "客".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i27 = i3 + arrayOfByte20.length;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          arrayOfByte21 = "义勇军进行曲".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i28 = i3 + arrayOfByte21.length;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte22 = "食".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i29 = i3 + arrayOfByte22.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte23 = "终".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i30 = i3 + arrayOfByte23.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte24 = "不明灭".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i31 = i3 + arrayOfByte24.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          arrayOfByte25 = "波哥大".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i32 = i3 + arrayOfByte25.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte26 = "人参果".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i33 = i3 + arrayOfByte26.length;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte27 = "绝情谷".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i34 = i3 + arrayOfByte27.length;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          arrayOfByte28 = "麻沸散".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i35 = i3 + arrayOfByte28.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          arrayOfByte29 = "腹".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i36 = i3 + arrayOfByte29.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 2;
          arrayOfByte30 = "王维的一句诗，“每逢佳节倍思亲”的上句".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i4, arrayOfByte30.length);
          i37 = arrayOfByte30.length;
          i38 = i4 + i37;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 3;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte31 = "亚洲一个地区性综合运动会，四年一届，主要是太平洋沿岸国家参加".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i39 = i3 + arrayOfByte31.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 3;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "一位性格诙谐的西汉文学家，相传曾经喝过“君山不死酒”".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i40 = i3 + arrayOfByte32.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "指在后方决定作战策略".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i41 = i3 + arrayOfByte33.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "监督和管理财务的工作名称".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i42 = i3 + arrayOfByte34.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "道家用来称呼深奥的道理的一个词".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i43 = i3 + arrayOfByte35.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 10;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte36 = "琼瑶的一部作品".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i44 = i3 + arrayOfByte36.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 17;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "电脑的另一个叫法".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i45 = i3 + arrayOfByte37.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 18;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "数学中最基础，最初等的分支部分".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i46 = i3 + arrayOfByte38.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 32;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte39 = "孙中山在他领导的民主革命中提出的政治纲领".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i47 = i3 + arrayOfByte39.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 37;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "上古时代有名的勇士名字".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i48 = i3 + arrayOfByte40.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "毛泽东在张思德追悼会上所作的著名讲话".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i49 = i3 + arrayOfByte41.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 46;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "成语，比喻不管对方策略如何，己方总有应对的办法，和“水来土掩”相对".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i50 = i3 + arrayOfByte42.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 46;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "杜甫的一首诗名".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i51 = i3 + arrayOfByte43.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 48;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "一个象棋术语".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i52 = i3 + arrayOfByte44.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 62;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte45 = "田汉作词，聂耳作曲的一首中国最著名的歌".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i53 = i3 + arrayOfByte45.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 67;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte46 = "成语，指事情最终结束的样子".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i54 = i3 + arrayOfByte46.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 69;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "成语，指吃不饱饭".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i55 = i3 + arrayOfByte47.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 80;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte48 = "指时隐时现，忽明忽暗".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i56 = i3 + arrayOfByte48.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 81;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "一个指完全消灭或者完全丧失的词".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i57 = i3 + arrayOfByte49.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 83;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte50 = "哥伦比亚的首都".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i58 = i3 + arrayOfByte50.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 83;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte51 = "一个周期内，横波在横坐标以下的最低部分".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i59 = i3 + arrayOfByte51.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 85;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte52 = "一种毒 品".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i60 = i3 + arrayOfByte52.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 87;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte53 = "西游记》里提到的一种仙果，样子如同儿童".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i61 = i3 + arrayOfByte53.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 91;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte54 = "《神雕侠侣》中的一个地名，书中描写生长有一种罕见的有毒植物".getBytes("GBK");
          System.arraycopy(arrayOfByte54, 0, arrayOfByte1, i3, arrayOfByte54.length);
          i62 = i3 + arrayOfByte54.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 95;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte55 = "我国古代的一种麻醉剂，已经失传".getBytes("GBK");
          System.arraycopy(arrayOfByte55, 0, arrayOfByte1, i3, arrayOfByte55.length);
          i63 = i3 + arrayOfByte55.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/27.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword28()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 39;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "艺术家".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        int i9;
        byte[] arrayOfByte6;
        int i10;
        byte[] arrayOfByte7;
        int i11;
        int i12;
        byte[] arrayOfByte8;
        int i13;
        byte[] arrayOfByte9;
        int i14;
        byte[] arrayOfByte10;
        int i15;
        int i16;
        byte[] arrayOfByte11;
        int i17;
        int i18;
        byte[] arrayOfByte12;
        int i19;
        byte[] arrayOfByte13;
        int i20;
        byte[] arrayOfByte14;
        int i21;
        byte[] arrayOfByte15;
        int i22;
        byte[] arrayOfByte16;
        int i23;
        byte[] arrayOfByte17;
        int i24;
        int i25;
        byte[] arrayOfByte18;
        int i26;
        byte[] arrayOfByte19;
        int i27;
        byte[] arrayOfByte20;
        int i28;
        int i29;
        byte[] arrayOfByte21;
        int i30;
        byte[] arrayOfByte22;
        int i31;
        byte[] arrayOfByte23;
        int i32;
        int i33;
        byte[] arrayOfByte24;
        int i34;
        byte[] arrayOfByte25;
        int i35;
        byte[] arrayOfByte26;
        int i36;
        byte[] arrayOfByte27;
        int i37;
        byte[] arrayOfByte28;
        int i38;
        byte[] arrayOfByte29;
        int i39;
        byte[] arrayOfByte30;
        int i40;
        byte[] arrayOfByte31;
        int i41;
        byte[] arrayOfByte32;
        int i42;
        int i43;
        byte[] arrayOfByte33;
        int i44;
        byte[] arrayOfByte34;
        int i45;
        byte[] arrayOfByte35;
        int i46;
        byte[] arrayOfByte36;
        int i47;
        byte[] arrayOfByte37;
        int i48;
        byte[] arrayOfByte38;
        int i49;
        byte[] arrayOfByte39;
        int i50;
        byte[] arrayOfByte40;
        int i51;
        byte[] arrayOfByte41;
        int i52;
        byte[] arrayOfByte42;
        int i53;
        byte[] arrayOfByte43;
        int i54;
        byte[] arrayOfByte44;
        int i55;
        byte[] arrayOfByte45;
        int i56;
        byte[] arrayOfByte46;
        int i57;
        byte[] arrayOfByte47;
        int i58;
        byte[] arrayOfByte48;
        int i59;
        byte[] arrayOfByte49;
        int i60;
        byte[] arrayOfByte50;
        int i61;
        byte[] arrayOfByte51;
        int i62;
        byte[] arrayOfByte52;
        int i63;
        byte[] arrayOfByte53;
        int i64;
        byte[] arrayOfByte54;
        int i65;
        byte[] arrayOfByte55;
        int i66;
        byte[] arrayOfByte56;
        int i67;
        byte[] arrayOfByte57;
        int i68;
        byte[] arrayOfByte58;
        int i69;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "空山新雨后术".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte5 = "大王花".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i4, arrayOfByte5.length);
          i8 = arrayOfByte5.length;
          i9 = i4 + i8;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          arrayOfByte6 = "白".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i10 = i3 + arrayOfByte6.length;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte7 = "人机对话".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i4, arrayOfByte7.length);
          i11 = arrayOfByte7.length;
          i12 = i4 + i11;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte8 = "墙".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i13 = i3 + arrayOfByte8.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte9 = "娘子关生".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i14 = i3 + arrayOfByte9.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte10 = "西".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i4, arrayOfByte10.length);
          i15 = arrayOfByte10.length;
          i16 = i4 + i15;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte11 = "扬子".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i4, arrayOfByte11.length);
          i17 = arrayOfByte11.length;
          i18 = i4 + i17;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte12 = "咏".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i19 = i3 + arrayOfByte12.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte13 = "浮云游子意".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i20 = i3 + arrayOfByte13.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          arrayOfByte14 = "传".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i21 = i3 + arrayOfByte14.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte15 = "荷".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i22 = i3 + arrayOfByte15.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte16 = "士".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i23 = i3 + arrayOfByte16.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte17 = "路".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i4, arrayOfByte17.length);
          i24 = arrayOfByte17.length;
          i25 = i4 + i24;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte18 = "吴奇隆".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i26 = i3 + arrayOfByte18.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          arrayOfByte19 = "道德观察".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i27 = i3 + arrayOfByte19.length;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte20 = "敏".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i4, arrayOfByte20.length);
          i28 = arrayOfByte20.length;
          i29 = i4 + i28;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte21 = "中".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i30 = i3 + arrayOfByte21.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte22 = "格".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i31 = i3 + arrayOfByte22.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte23 = "哈".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i4, arrayOfByte23.length);
          i32 = arrayOfByte23.length;
          i33 = i4 + i32;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte24 = "徐霞客".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i34 = i3 + arrayOfByte24.length;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          arrayOfByte25 = "火拉".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i35 = i3 + arrayOfByte25.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          arrayOfByte26 = "艾尔之光".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i36 = i3 + arrayOfByte26.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          arrayOfByte27 = "中".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i37 = i3 + arrayOfByte27.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          arrayOfByte28 = "龙斯诺".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i38 = i3 + arrayOfByte28.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          arrayOfByte29 = "省".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i39 = i3 + arrayOfByte29.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          arrayOfByte30 = "启".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i40 = i3 + arrayOfByte30.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          arrayOfByte31 = "行必果".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i41 = i3 + arrayOfByte31.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte32 = "法国电影，近日获第84届奥斯卡金像奖最佳影片、最佳男主角、最佳导演等5项大奖".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i4, arrayOfByte32.length);
          i42 = arrayOfByte32.length;
          i43 = i4 + i42;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "由朱军主持的央视一谈话类节目".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i44 = i3 + arrayOfByte33.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte34 = "王维写的山水诗《山居秋暝》的首句".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i45 = i3 + arrayOfByte34.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "用砖或者蝴蝶瓦按一定的图案砌筑的漏空花窗".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i46 = i3 + arrayOfByte35.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "赵雅芝经典剧目".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i47 = i3 + arrayOfByte36.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 13;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "印尼热带森林中的一种花，花朵巨大，散发臭味".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i48 = i3 + arrayOfByte37.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 13;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "周星驰主演的无厘头搞笑片".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i49 = i3 + arrayOfByte38.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "借助计算机及网络技术对考试进行实施、管理的一种测试形式".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i50 = i3 + arrayOfByte39.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 27;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte40 = "长城关口，有万里长城第九关之称".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i51 = i3 + arrayOfByte40.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 29;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "香港演员，有古装“港剧一姐”之称".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i52 = i3 + arrayOfByte41.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 36;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "从扬州以下至入海口的长江下游河段的旧称".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i53 = i3 + arrayOfByte42.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 41;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "出自李白诗《送友人》，下句：落日故人情".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i54 = i3 + arrayOfByte43.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 41;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "以德国民间传说为题材的长篇诗剧".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i55 = i3 + arrayOfByte44.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 44;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "即孔子弟子仲由".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i56 = i3 + arrayOfByte45.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 56;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "影、视、歌三栖艺人，曾经的台湾四小天王之一".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i57 = i3 + arrayOfByte46.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 56;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "跳水名将，近获第18届国际泳联跳水世界杯女子单人3米板冠军".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i58 = i3 + arrayOfByte47.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 58;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "湖北古地名，历史上刘备三顾茅庐的史事就发生在这里".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i59 = i3 + arrayOfByte48.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "CCTV-12主打节目，每日21：48首播".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i60 = i3 + arrayOfByte49.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "好莱坞著名演员，曾凭《华尔街》一片成为奥斯卡最佳男主角奖得主".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i61 = i3 + arrayOfByte50.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 63;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte51 = "建于1912年的中国旧省级行政区，张自忠曾任主席".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i62 = i3 + arrayOfByte51.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 75;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "被后人奉为“游圣”的历史名人".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i63 = i3 + arrayOfByte52.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 75;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte53 = "明科学家，编著《农政全书》".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i64 = i3 + arrayOfByte53.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 77;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte54 = "李白饮酒名诗《客中作》的别名".getBytes("GBK");
          System.arraycopy(arrayOfByte54, 0, arrayOfByte1, i3, arrayOfByte54.length);
          i65 = i3 + arrayOfByte54.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 79;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte55 = "水果，因其外表肉质鳞片似蛟龙外鳞而得名".getBytes("GBK");
          System.arraycopy(arrayOfByte55, 0, arrayOfByte1, i3, arrayOfByte55.length);
          i66 = i3 + arrayOfByte55.length;
          i3 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 82;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte56 = "韩国Q版网络角色扮演游戏《ELSWORD》的中文名".getBytes("GBK");
          System.arraycopy(arrayOfByte56, 0, arrayOfByte1, i3, arrayOfByte56.length);
          i67 = i3 + arrayOfByte56.length;
          i3 = i67 + 1;
          arrayOfByte1[i67] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 90;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte57 = "美国记者，1936年访问陕北根据地，次年写成《西行漫记》一书".getBytes("GBK");
          System.arraycopy(arrayOfByte57, 0, arrayOfByte1, i3, arrayOfByte57.length);
          i68 = i3 + arrayOfByte57.length;
          i3 = i68 + 1;
          arrayOfByte1[i68] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 97;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte58 = "六字成语“言必信”的下半句".getBytes("GBK");
          System.arraycopy(arrayOfByte58, 0, arrayOfByte1, i3, arrayOfByte58.length);
          i69 = i3 + arrayOfByte58.length;
          i3 = i69 + 1;
          arrayOfByte1[i69] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/28.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword29()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 40;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "画皮二".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        byte[] arrayOfByte4 = "蒙".getBytes("GBK");
        System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i3, arrayOfByte4.length);
        int i6 = i3 + arrayOfByte4.length;
        i3 = i6 + 1;
        arrayOfByte1[i6] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte5;
        int i7;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        byte[] arrayOfByte7;
        int i10;
        byte[] arrayOfByte8;
        int i11;
        byte[] arrayOfByte9;
        int i12;
        byte[] arrayOfByte10;
        int i13;
        byte[] arrayOfByte11;
        int i14;
        byte[] arrayOfByte12;
        int i15;
        byte[] arrayOfByte13;
        int i16;
        byte[] arrayOfByte14;
        int i17;
        byte[] arrayOfByte15;
        int i18;
        byte[] arrayOfByte16;
        int i19;
        byte[] arrayOfByte17;
        int i20;
        byte[] arrayOfByte18;
        int i21;
        int i22;
        byte[] arrayOfByte19;
        int i23;
        byte[] arrayOfByte20;
        int i24;
        int i25;
        byte[] arrayOfByte21;
        int i26;
        byte[] arrayOfByte22;
        int i27;
        byte[] arrayOfByte23;
        int i28;
        byte[] arrayOfByte24;
        int i29;
        byte[] arrayOfByte25;
        int i30;
        byte[] arrayOfByte26;
        int i31;
        byte[] arrayOfByte27;
        int i32;
        byte[] arrayOfByte28;
        int i33;
        byte[] arrayOfByte29;
        int i34;
        int i35;
        byte[] arrayOfByte30;
        int i36;
        byte[] arrayOfByte31;
        int i37;
        int i38;
        byte[] arrayOfByte32;
        int i39;
        int i40;
        byte[] arrayOfByte33;
        int i41;
        byte[] arrayOfByte34;
        int i42;
        byte[] arrayOfByte35;
        int i43;
        byte[] arrayOfByte36;
        int i44;
        byte[] arrayOfByte37;
        int i45;
        byte[] arrayOfByte38;
        int i46;
        byte[] arrayOfByte39;
        int i47;
        byte[] arrayOfByte40;
        int i48;
        byte[] arrayOfByte41;
        int i49;
        byte[] arrayOfByte42;
        int i50;
        byte[] arrayOfByte43;
        int i51;
        byte[] arrayOfByte44;
        int i52;
        byte[] arrayOfByte45;
        int i53;
        byte[] arrayOfByte46;
        int i54;
        byte[] arrayOfByte47;
        int i55;
        byte[] arrayOfByte48;
        int i56;
        byte[] arrayOfByte49;
        int i57;
        byte[] arrayOfByte50;
        int i58;
        byte[] arrayOfByte51;
        int i59;
        byte[] arrayOfByte52;
        int i60;
        byte[] arrayOfByte53;
        int i61;
        byte[] arrayOfByte54;
        int i62;
        byte[] arrayOfByte55;
        int i63;
        byte[] arrayOfByte56;
        int i64;
        byte[] arrayOfByte57;
        int i65;
        byte[] arrayOfByte58;
        int i66;
        byte[] arrayOfByte59;
        int i67;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte5 = "夺命金中".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i4, arrayOfByte5.length);
          i7 = arrayOfByte5.length;
          i8 = i4 + i7;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte6 = "自报家门".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i9 = i3 + arrayOfByte6.length;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          arrayOfByte7 = "乌仙人指路".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
          i10 = i3 + arrayOfByte7.length;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          arrayOfByte8 = "喜".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i11 = i3 + arrayOfByte8.length;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          arrayOfByte9 = "之".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i12 = i3 + arrayOfByte9.length;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte10 = "中".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i13 = i3 + arrayOfByte10.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte11 = "路".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i14 = i3 + arrayOfByte11.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte12 = "不".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i15 = i3 + arrayOfByte12.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte13 = "变叶木".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i16 = i3 + arrayOfByte13.length;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          arrayOfByte14 = "豪".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i17 = i3 + arrayOfByte14.length;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          arrayOfByte15 = "通风报信".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i18 = i3 + arrayOfByte15.length;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte16 = "问".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i19 = i3 + arrayOfByte16.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte17 = "罗杰斯".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i20 = i3 + arrayOfByte17.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte18 = "忧".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i4, arrayOfByte18.length);
          i21 = arrayOfByte18.length;
          i22 = i4 + i21;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte19 = "向前冲".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i23 = i3 + arrayOfByte19.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte20 = "巴菲特".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i4, arrayOfByte20.length);
          i24 = arrayOfByte20.length;
          i25 = i4 + i24;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte21 = "游".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i26 = i3 + arrayOfByte21.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          arrayOfByte22 = "传".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i27 = i3 + arrayOfByte22.length;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          arrayOfByte23 = "植".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i28 = i3 + arrayOfByte23.length;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte24 = "达".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i29 = i3 + arrayOfByte24.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte25 = "奥".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i30 = i3 + arrayOfByte25.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte26 = "标致".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i31 = i3 + arrayOfByte26.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          arrayOfByte27 = "关被丁克".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i32 = i3 + arrayOfByte27.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte28 = "会员卡".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i33 = i3 + arrayOfByte28.length;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte29 = "云图".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i4, arrayOfByte29.length);
          i34 = arrayOfByte29.length;
          i35 = i4 + i34;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          arrayOfByte30 = "斯诺".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i36 = i3 + arrayOfByte30.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte31 = "尺短寸长".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i4, arrayOfByte31.length);
          i37 = arrayOfByte31.length;
          i38 = i4 + i37;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte32 = "由知名导演乌尔善执导、著名电影明星赵薇、周迅、陈坤等主演的魔幻爱情片".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i4, arrayOfByte32.length);
          i39 = arrayOfByte32.length;
          i40 = i4 + i39;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "金莎演唱的歌，首句：我怎么舍得看不见".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i41 = i3 + arrayOfByte33.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 4;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "云南一个县，是“中国过桥米线之乡”、“中国石榴之乡”".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i42 = i3 + arrayOfByte34.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte35 = "香港知名导演杜琪峰作品，故事围绕3名身份地位各不相同的人物展开".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i43 = i3 + arrayOfByte35.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "明代石亨、曹吉祥等于景泰八年（1457）拥明英宗复位的政变".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i44 = i3 + arrayOfByte36.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "印尼热带森林中的一种花，花朵巨大，散发臭味".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i45 = i3 + arrayOfByte37.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 13;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "太阳的别称，因传说太阳中有三足乌".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i46 = i3 + arrayOfByte38.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 14;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "戏曲演员一出场先把角色的姓名、家世、来历介绍给观众".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i47 = i3 + arrayOfByte39.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 15;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "只报告高兴的事，不报告忧愁的事情".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i48 = i3 + arrayOfByte40.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "黄山著名景点，位于云谷寺至皮篷路口".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i49 = i3 + arrayOfByte41.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 21;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte42 = "指才智勇力出众的人".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i50 = i3 + arrayOfByte42.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 23;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "中药指枫香的果实，有祛风﹑活血﹑除湿等作用".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i51 = i3 + arrayOfByte43.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 37;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte44 = "别称“洒金榕”的常绿灌木".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i52 = i3 + arrayOfByte44.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 38;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "邱礼涛执导的香港电影，是叶问系列电影之一".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i53 = i3 + arrayOfByte45.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 43;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "把对立双方中一方的机密暗中告诉另一方".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i54 = i3 + arrayOfByte46.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 50;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "现代华尔街的风云人物，“量子基金”创始人之一".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i55 = i3 + arrayOfByte47.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 52;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "古罗马奴隶起义领袖".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i56 = i3 + arrayOfByte48.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 57;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "徐怀钰歌曲，其中有一句是：伸出双臂一起拥抱这世界".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i57 = i3 + arrayOfByte49.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 62;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte50 = "著名投资商，曾在2008年的《福布斯》富豪榜上位列第一".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i58 = i3 + arrayOfByte50.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 64;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte51 = "即特殊奥林匹克运动会".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i59 = i3 + arrayOfByte51.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 66;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte52 = "一种测量长度、内外径、深度的量具".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i60 = i3 + arrayOfByte52.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 70;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte53 = "反映不同植物群落类型的分布面积和规律的地图".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i61 = i3 + arrayOfByte53.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 76;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte54 = "汽车品牌，LOGO是只狮子".getBytes("GBK");
          System.arraycopy(arrayOfByte54, 0, arrayOfByte1, i3, arrayOfByte54.length);
          i62 = i3 + arrayOfByte54.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 79;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte55 = "2011年甄子丹主演电影，姜文在片中扮演曹操".getBytes("GBK");
          System.arraycopy(arrayOfByte55, 0, arrayOfByte1, i3, arrayOfByte55.length);
          i63 = i3 + arrayOfByte55.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 80;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte56 = "一是指因经济原因或其他原因而不生育的夫妇，二是指想生孩子，却怀不上孩子的不孕不育夫妇".getBytes("GBK");
          System.arraycopy(arrayOfByte56, 0, arrayOfByte1, i3, arrayOfByte56.length);
          i64 = i3 + arrayOfByte56.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 84;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte57 = "普通身份识别卡，包括商场、宾馆等消费场所的会员认证".getBytes("GBK");
          System.arraycopy(arrayOfByte57, 0, arrayOfByte1, i3, arrayOfByte57.length);
          i65 = i3 + arrayOfByte57.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 92;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte58 = "美国记者，1936年访问陕北根据地，次年写成《西行漫记》一书".getBytes("GBK");
          System.arraycopy(arrayOfByte58, 0, arrayOfByte1, i3, arrayOfByte58.length);
          i66 = i3 + arrayOfByte58.length;
          i3 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 96;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte59 = "比喻人或物各有长处，也各有短处".getBytes("GBK");
          System.arraycopy(arrayOfByte59, 0, arrayOfByte1, i3, arrayOfByte59.length);
          i67 = i3 + arrayOfByte59.length;
          i3 = i67 + 1;
          arrayOfByte1[i67] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/29.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword3()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 3;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "小螺号".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        byte[] arrayOfByte4 = "老".getBytes("GBK");
        System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i3, arrayOfByte4.length);
        int i6 = i3 + arrayOfByte4.length;
        i3 = i6 + 1;
        arrayOfByte1[i6] = 0;
        byte[] arrayOfByte5 = "百".getBytes("GBK");
        System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
        int i7 = i3 + arrayOfByte5.length;
        i3 = i7 + 1;
        arrayOfByte1[i7] = 0;
        byte[] arrayOfByte6 = "一灯丑".getBytes("GBK");
        System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
        int i8 = i3 + arrayOfByte6.length;
        i3 = i8 + 1;
        arrayOfByte1[i8] = 0;
        byte[] arrayOfByte7 = "外星人".getBytes("GBK");
        System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
        int i9 = i3 + arrayOfByte7.length;
        i3 = i9 + 1;
        arrayOfByte1[i9] = 0;
        byte[] arrayOfByte8 = "里斯本".getBytes("GBK");
        System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
        int i10 = i3 + arrayOfByte8.length;
        i3 = i10 + 1;
        arrayOfByte1[i10] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte9;
        int i11;
        byte[] arrayOfByte10;
        int i12;
        byte[] arrayOfByte11;
        int i13;
        byte[] arrayOfByte12;
        int i14;
        byte[] arrayOfByte13;
        int i15;
        byte[] arrayOfByte14;
        int i16;
        byte[] arrayOfByte15;
        int i17;
        int i18;
        byte[] arrayOfByte16;
        int i19;
        int i20;
        byte[] arrayOfByte17;
        int i21;
        byte[] arrayOfByte18;
        int i22;
        byte[] arrayOfByte19;
        int i23;
        byte[] arrayOfByte20;
        int i24;
        int i25;
        byte[] arrayOfByte21;
        int i26;
        byte[] arrayOfByte22;
        int i27;
        int i28;
        byte[] arrayOfByte23;
        int i29;
        byte[] arrayOfByte24;
        int i30;
        byte[] arrayOfByte25;
        int i31;
        int i32;
        byte[] arrayOfByte26;
        int i33;
        byte[] arrayOfByte27;
        int i34;
        byte[] arrayOfByte28;
        int i35;
        int i36;
        byte[] arrayOfByte29;
        int i37;
        byte[] arrayOfByte30;
        int i38;
        byte[] arrayOfByte31;
        int i39;
        byte[] arrayOfByte32;
        int i40;
        byte[] arrayOfByte33;
        int i41;
        byte[] arrayOfByte34;
        int i42;
        byte[] arrayOfByte35;
        int i43;
        byte[] arrayOfByte36;
        int i44;
        byte[] arrayOfByte37;
        int i45;
        byte[] arrayOfByte38;
        int i46;
        byte[] arrayOfByte39;
        int i47;
        byte[] arrayOfByte40;
        int i48;
        byte[] arrayOfByte41;
        int i49;
        byte[] arrayOfByte42;
        int i50;
        byte[] arrayOfByte43;
        int i51;
        byte[] arrayOfByte44;
        int i52;
        byte[] arrayOfByte45;
        int i53;
        byte[] arrayOfByte46;
        int i54;
        byte[] arrayOfByte47;
        int i55;
        byte[] arrayOfByte48;
        int i56;
        byte[] arrayOfByte49;
        int i57;
        byte[] arrayOfByte50;
        int i58;
        byte[] arrayOfByte51;
        int i59;
        byte[] arrayOfByte52;
        int i60;
        byte[] arrayOfByte53;
        int i61;
        byte[] arrayOfByte54;
        int i62;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte9 = "与".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i11 = i3 + arrayOfByte9.length;
          i3 = i11 + 1;
          arrayOfByte1[i11] = 0;
          arrayOfByte10 = "奚".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i12 = i3 + arrayOfByte10.length;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte11 = "万".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i13 = i3 + arrayOfByte11.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte12 = "直布罗陀海峡".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i14 = i3 + arrayOfByte12.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte13 = "比利时教".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i15 = i3 + arrayOfByte13.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte14 = "斯".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i16 = i3 + arrayOfByte14.length;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte15 = "目".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i4, arrayOfByte15.length);
          i17 = arrayOfByte15.length;
          i18 = i4 + i17;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte16 = "生".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i4, arrayOfByte16.length);
          i19 = arrayOfByte16.length;
          i20 = i4 + i19;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          arrayOfByte17 = "福无双至".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i21 = i3 + arrayOfByte17.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte18 = "鱼洗".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i22 = i3 + arrayOfByte18.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte19 = "死".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i23 = i3 + arrayOfByte19.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte20 = "心".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i4, arrayOfByte20.length);
          i24 = arrayOfByte20.length;
          i25 = i4 + i24;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte21 = "亲".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i26 = i3 + arrayOfByte21.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte22 = "心".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i4, arrayOfByte22.length);
          i27 = arrayOfByte22.length;
          i28 = i4 + i27;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte23 = "相声".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i29 = i3 + arrayOfByte23.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte24 = "睡".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i30 = i3 + arrayOfByte24.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte25 = "辛亥革命许".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i4, arrayOfByte25.length);
          i31 = arrayOfByte25.length;
          i32 = i4 + i31;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte26 = "春眠不觉晓".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i33 = i3 + arrayOfByte26.length;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte27 = "面".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i34 = i3 + arrayOfByte27.length;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte28 = "马季".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i4, arrayOfByte28.length);
          i35 = arrayOfByte28.length;
          i36 = i4 + i35;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte29 = "琪".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i37 = i3 + arrayOfByte29.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte30 = "一首儿歌".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i38 = i3 + arrayOfByte30.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "马戏团中做滑稽表演的人".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i39 = i3 + arrayOfByte31.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 2;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "报社因临时需要增出的小张报纸".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i40 = i3 + arrayOfByte32.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 4;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "海明威的一部著作".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i41 = i3 + arrayOfByte33.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 6;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "舂秋名相，身价是五张羊皮".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i42 = i3 + arrayOfByte34.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 8;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte35 = "(射雕英雄传)中段皇爷出家后的法号".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i43 = i3 + arrayOfByte35.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 8;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "祝贺生意人的用语".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i44 = i3 + arrayOfByte36.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 12;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "罗纳尔多的绰号".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i45 = i3 + arrayOfByte37.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 16;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte38 = "葡萄牙的首都".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i46 = i3 + arrayOfByte38.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 30;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "地中海和大西洋之间的海峡".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i47 = i3 + arrayOfByte39.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 30;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "“问世间，情是何物”的下句".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i48 = i3 + arrayOfByte40.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 32;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "美国前总统，曾推行新政".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i49 = i3 + arrayOfByte41.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 37;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "一个欧洲国家".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i50 = i3 + arrayOfByte42.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 37;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "双眼长在同一边的海洋生物".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i51 = i3 + arrayOfByte43.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 52;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte44 = "“祸不单行”的上句".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i52 = i3 + arrayOfByte44.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 53;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "张国荣演唱的一首歌".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i53 = i3 + arrayOfByte45.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 55;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte46 = "关系最近的亲戚".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i54 = i3 + arrayOfByte46.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 57;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "一种文物，中间盛水，用手摩擦边缘可使水因共振而溅起水花".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i55 = i3 + arrayOfByte47.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 58;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "成语，比喻彻底改过".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i56 = i3 + arrayOfByte48.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 70;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "一种传统曲艺".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i57 = i3 + arrayOfByte49.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 76;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte50 = "孙中山领导的推翻清朝的运动".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i58 = i3 + arrayOfByte50.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 76;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte51 = "一位台湾女歌星 ".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i59 = i3 + arrayOfByte51.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 82;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "古诗(春晓)中的一句".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i60 = i3 + arrayOfByte52.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 82;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte53 = "万物复苏的季节".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i61 = i3 + arrayOfByte53.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 91;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte54 = "一位相声表演艺术家".getBytes("GBK");
          System.arraycopy(arrayOfByte54, 0, arrayOfByte1, i3, arrayOfByte54.length);
          i62 = i3 + arrayOfByte54.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/3.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  /* Error */
  public static void genCrossword30()
  {
    // Byte code:
    //   0: sipush 4096
    //   3: newarray <illegal type>
    //   5: astore_0
    //   6: ldc 43
    //   8: invokevirtual 49	java/lang/String:getBytes	()[B
    //   11: astore_1
    //   12: aload_1
    //   13: iconst_0
    //   14: aload_0
    //   15: iconst_0
    //   16: aload_1
    //   17: arraylength
    //   18: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   21: aload_1
    //   22: arraylength
    //   23: istore_2
    //   24: iload_2
    //   25: iconst_1
    //   26: iadd
    //   27: istore_3
    //   28: aload_0
    //   29: iload_2
    //   30: iconst_0
    //   31: bastore
    //   32: iload_3
    //   33: iconst_1
    //   34: iadd
    //   35: istore 4
    //   37: aload_0
    //   38: iload_3
    //   39: iconst_0
    //   40: bastore
    //   41: iload 4
    //   43: iconst_1
    //   44: iadd
    //   45: istore 5
    //   47: aload_0
    //   48: iload 4
    //   50: iconst_0
    //   51: bastore
    //   52: iload 5
    //   54: iconst_1
    //   55: iadd
    //   56: istore 6
    //   58: aload_0
    //   59: iload 5
    //   61: bipush 41
    //   63: bastore
    //   64: iload 6
    //   66: iconst_1
    //   67: iadd
    //   68: istore 7
    //   70: aload_0
    //   71: iload 6
    //   73: iconst_1
    //   74: bastore
    //   75: iload 7
    //   77: iconst_1
    //   78: iadd
    //   79: istore 8
    //   81: aload_0
    //   82: iload 7
    //   84: bipush 10
    //   86: bastore
    //   87: iload 8
    //   89: iconst_1
    //   90: iadd
    //   91: istore 9
    //   93: aload_0
    //   94: iload 8
    //   96: bipush 10
    //   98: bastore
    //   99: ldc_w 1892
    //   102: ldc 59
    //   104: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   107: astore 13
    //   109: aload 13
    //   111: iconst_0
    //   112: aload_0
    //   113: iload 9
    //   115: aload 13
    //   117: arraylength
    //   118: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   121: iload 9
    //   123: aload 13
    //   125: arraylength
    //   126: iadd
    //   127: istore 14
    //   129: iload 14
    //   131: iconst_1
    //   132: iadd
    //   133: istore 9
    //   135: aload_0
    //   136: iload 14
    //   138: iconst_0
    //   139: bastore
    //   140: ldc_w 2394
    //   143: ldc 59
    //   145: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   148: astore 15
    //   150: aload 15
    //   152: iconst_0
    //   153: aload_0
    //   154: iload 9
    //   156: aload 15
    //   158: arraylength
    //   159: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   162: iload 9
    //   164: aload 15
    //   166: arraylength
    //   167: iadd
    //   168: istore 16
    //   170: iload 16
    //   172: iconst_1
    //   173: iadd
    //   174: istore 9
    //   176: aload_0
    //   177: iload 16
    //   179: iconst_0
    //   180: bastore
    //   181: ldc_w 2396
    //   184: ldc 59
    //   186: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   189: astore 17
    //   191: aload 17
    //   193: iconst_0
    //   194: aload_0
    //   195: iload 9
    //   197: aload 17
    //   199: arraylength
    //   200: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   203: iload 9
    //   205: aload 17
    //   207: arraylength
    //   208: iadd
    //   209: istore 18
    //   211: iload 18
    //   213: iconst_1
    //   214: iadd
    //   215: istore 9
    //   217: aload_0
    //   218: iload 18
    //   220: iconst_0
    //   221: bastore
    //   222: iload 9
    //   224: iconst_1
    //   225: iadd
    //   226: istore 12
    //   228: aload_0
    //   229: iload 9
    //   231: iconst_0
    //   232: bastore
    //   233: ldc -36
    //   235: ldc 59
    //   237: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   240: astore 20
    //   242: aload 20
    //   244: iconst_0
    //   245: aload_0
    //   246: iload 12
    //   248: aload 20
    //   250: arraylength
    //   251: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   254: aload 20
    //   256: arraylength
    //   257: istore 21
    //   259: iload 12
    //   261: iload 21
    //   263: iadd
    //   264: istore 22
    //   266: iload 22
    //   268: iconst_1
    //   269: iadd
    //   270: istore 9
    //   272: aload_0
    //   273: iload 22
    //   275: iconst_0
    //   276: bastore
    //   277: iload 9
    //   279: iconst_1
    //   280: iadd
    //   281: istore 12
    //   283: aload_0
    //   284: iload 9
    //   286: iconst_0
    //   287: bastore
    //   288: ldc_w 2398
    //   291: ldc 59
    //   293: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   296: astore 23
    //   298: aload 23
    //   300: iconst_0
    //   301: aload_0
    //   302: iload 12
    //   304: aload 23
    //   306: arraylength
    //   307: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   310: aload 23
    //   312: arraylength
    //   313: istore 24
    //   315: iload 12
    //   317: iload 24
    //   319: iadd
    //   320: istore 25
    //   322: iload 25
    //   324: iconst_1
    //   325: iadd
    //   326: istore 9
    //   328: aload_0
    //   329: iload 25
    //   331: iconst_0
    //   332: bastore
    //   333: ldc_w 1271
    //   336: ldc 59
    //   338: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   341: astore 26
    //   343: aload 26
    //   345: iconst_0
    //   346: aload_0
    //   347: iload 9
    //   349: aload 26
    //   351: arraylength
    //   352: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   355: iload 9
    //   357: aload 26
    //   359: arraylength
    //   360: iadd
    //   361: istore 27
    //   363: iload 27
    //   365: iconst_1
    //   366: iadd
    //   367: istore 9
    //   369: aload_0
    //   370: iload 27
    //   372: iconst_0
    //   373: bastore
    //   374: iload 9
    //   376: iconst_1
    //   377: iadd
    //   378: istore 12
    //   380: aload_0
    //   381: iload 9
    //   383: iconst_0
    //   384: bastore
    //   385: ldc_w 2400
    //   388: ldc 59
    //   390: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   393: astore 28
    //   395: aload 28
    //   397: iconst_0
    //   398: aload_0
    //   399: iload 12
    //   401: aload 28
    //   403: arraylength
    //   404: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   407: aload 28
    //   409: arraylength
    //   410: istore 29
    //   412: iload 12
    //   414: iload 29
    //   416: iadd
    //   417: istore 30
    //   419: iload 30
    //   421: iconst_1
    //   422: iadd
    //   423: istore 9
    //   425: aload_0
    //   426: iload 30
    //   428: iconst_0
    //   429: bastore
    //   430: ldc_w 2402
    //   433: ldc 59
    //   435: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   438: astore 31
    //   440: aload 31
    //   442: iconst_0
    //   443: aload_0
    //   444: iload 9
    //   446: aload 31
    //   448: arraylength
    //   449: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   452: iload 9
    //   454: aload 31
    //   456: arraylength
    //   457: iadd
    //   458: istore 32
    //   460: iload 32
    //   462: iconst_1
    //   463: iadd
    //   464: istore 9
    //   466: aload_0
    //   467: iload 32
    //   469: iconst_0
    //   470: bastore
    //   471: ldc_w 2404
    //   474: ldc 59
    //   476: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   479: astore 33
    //   481: aload 33
    //   483: iconst_0
    //   484: aload_0
    //   485: iload 9
    //   487: aload 33
    //   489: arraylength
    //   490: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   493: iload 9
    //   495: aload 33
    //   497: arraylength
    //   498: iadd
    //   499: istore 34
    //   501: iload 34
    //   503: iconst_1
    //   504: iadd
    //   505: istore 9
    //   507: aload_0
    //   508: iload 34
    //   510: iconst_0
    //   511: bastore
    //   512: ldc_w 2406
    //   515: ldc 59
    //   517: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   520: astore 35
    //   522: aload 35
    //   524: iconst_0
    //   525: aload_0
    //   526: iload 9
    //   528: aload 35
    //   530: arraylength
    //   531: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   534: iload 9
    //   536: aload 35
    //   538: arraylength
    //   539: iadd
    //   540: istore 36
    //   542: iload 36
    //   544: iconst_1
    //   545: iadd
    //   546: istore 9
    //   548: aload_0
    //   549: iload 36
    //   551: iconst_0
    //   552: bastore
    //   553: ldc_w 2408
    //   556: ldc 59
    //   558: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   561: astore 37
    //   563: aload 37
    //   565: iconst_0
    //   566: aload_0
    //   567: iload 9
    //   569: aload 37
    //   571: arraylength
    //   572: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   575: iload 9
    //   577: aload 37
    //   579: arraylength
    //   580: iadd
    //   581: istore 38
    //   583: iload 38
    //   585: iconst_1
    //   586: iadd
    //   587: istore 9
    //   589: aload_0
    //   590: iload 38
    //   592: iconst_0
    //   593: bastore
    //   594: ldc_w 2410
    //   597: ldc 59
    //   599: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   602: astore 39
    //   604: aload 39
    //   606: iconst_0
    //   607: aload_0
    //   608: iload 9
    //   610: aload 39
    //   612: arraylength
    //   613: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   616: iload 9
    //   618: aload 39
    //   620: arraylength
    //   621: iadd
    //   622: istore 40
    //   624: iload 40
    //   626: iconst_1
    //   627: iadd
    //   628: istore 9
    //   630: aload_0
    //   631: iload 40
    //   633: iconst_0
    //   634: bastore
    //   635: ldc_w 1690
    //   638: ldc 59
    //   640: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   643: astore 41
    //   645: aload 41
    //   647: iconst_0
    //   648: aload_0
    //   649: iload 9
    //   651: aload 41
    //   653: arraylength
    //   654: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   657: iload 9
    //   659: aload 41
    //   661: arraylength
    //   662: iadd
    //   663: istore 42
    //   665: iload 42
    //   667: iconst_1
    //   668: iadd
    //   669: istore 9
    //   671: aload_0
    //   672: iload 42
    //   674: iconst_0
    //   675: bastore
    //   676: ldc 108
    //   678: ldc 59
    //   680: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   683: astore 43
    //   685: aload 43
    //   687: iconst_0
    //   688: aload_0
    //   689: iload 9
    //   691: aload 43
    //   693: arraylength
    //   694: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   697: iload 9
    //   699: aload 43
    //   701: arraylength
    //   702: iadd
    //   703: istore 44
    //   705: iload 44
    //   707: iconst_1
    //   708: iadd
    //   709: istore 9
    //   711: aload_0
    //   712: iload 44
    //   714: iconst_0
    //   715: bastore
    //   716: ldc_w 2412
    //   719: ldc 59
    //   721: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   724: astore 45
    //   726: aload 45
    //   728: iconst_0
    //   729: aload_0
    //   730: iload 9
    //   732: aload 45
    //   734: arraylength
    //   735: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   738: iload 9
    //   740: aload 45
    //   742: arraylength
    //   743: iadd
    //   744: istore 46
    //   746: iload 46
    //   748: iconst_1
    //   749: iadd
    //   750: istore 9
    //   752: aload_0
    //   753: iload 46
    //   755: iconst_0
    //   756: bastore
    //   757: ldc_w 2414
    //   760: ldc 59
    //   762: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   765: astore 47
    //   767: aload 47
    //   769: iconst_0
    //   770: aload_0
    //   771: iload 9
    //   773: aload 47
    //   775: arraylength
    //   776: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   779: iload 9
    //   781: aload 47
    //   783: arraylength
    //   784: iadd
    //   785: istore 48
    //   787: iload 48
    //   789: iconst_1
    //   790: iadd
    //   791: istore 9
    //   793: aload_0
    //   794: iload 48
    //   796: iconst_0
    //   797: bastore
    //   798: ldc_w 2416
    //   801: ldc 59
    //   803: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   806: astore 49
    //   808: aload 49
    //   810: iconst_0
    //   811: aload_0
    //   812: iload 9
    //   814: aload 49
    //   816: arraylength
    //   817: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   820: iload 9
    //   822: aload 49
    //   824: arraylength
    //   825: iadd
    //   826: istore 50
    //   828: iload 50
    //   830: iconst_1
    //   831: iadd
    //   832: istore 9
    //   834: aload_0
    //   835: iload 50
    //   837: iconst_0
    //   838: bastore
    //   839: ldc_w 2418
    //   842: ldc 59
    //   844: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   847: astore 51
    //   849: aload 51
    //   851: iconst_0
    //   852: aload_0
    //   853: iload 9
    //   855: aload 51
    //   857: arraylength
    //   858: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   861: iload 9
    //   863: aload 51
    //   865: arraylength
    //   866: iadd
    //   867: istore 52
    //   869: iload 52
    //   871: iconst_1
    //   872: iadd
    //   873: istore 9
    //   875: aload_0
    //   876: iload 52
    //   878: iconst_0
    //   879: bastore
    //   880: ldc_w 419
    //   883: ldc 59
    //   885: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   888: astore 53
    //   890: aload 53
    //   892: iconst_0
    //   893: aload_0
    //   894: iload 9
    //   896: aload 53
    //   898: arraylength
    //   899: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   902: iload 9
    //   904: aload 53
    //   906: arraylength
    //   907: iadd
    //   908: istore 54
    //   910: iload 54
    //   912: iconst_1
    //   913: iadd
    //   914: istore 9
    //   916: aload_0
    //   917: iload 54
    //   919: iconst_0
    //   920: bastore
    //   921: ldc_w 1918
    //   924: ldc 59
    //   926: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   929: astore 55
    //   931: aload 55
    //   933: iconst_0
    //   934: aload_0
    //   935: iload 9
    //   937: aload 55
    //   939: arraylength
    //   940: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   943: iload 9
    //   945: aload 55
    //   947: arraylength
    //   948: iadd
    //   949: istore 56
    //   951: iload 56
    //   953: iconst_1
    //   954: iadd
    //   955: istore 9
    //   957: aload_0
    //   958: iload 56
    //   960: iconst_0
    //   961: bastore
    //   962: iload 9
    //   964: iconst_1
    //   965: iadd
    //   966: istore 12
    //   968: aload_0
    //   969: iload 9
    //   971: iconst_0
    //   972: bastore
    //   973: ldc_w 2420
    //   976: ldc 59
    //   978: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   981: astore 57
    //   983: aload 57
    //   985: iconst_0
    //   986: aload_0
    //   987: iload 12
    //   989: aload 57
    //   991: arraylength
    //   992: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   995: aload 57
    //   997: arraylength
    //   998: istore 58
    //   1000: iload 12
    //   1002: iload 58
    //   1004: iadd
    //   1005: istore 59
    //   1007: iload 59
    //   1009: iconst_1
    //   1010: iadd
    //   1011: istore 9
    //   1013: aload_0
    //   1014: iload 59
    //   1016: iconst_0
    //   1017: bastore
    //   1018: ldc_w 2422
    //   1021: ldc 59
    //   1023: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1026: astore 60
    //   1028: aload 60
    //   1030: iconst_0
    //   1031: aload_0
    //   1032: iload 9
    //   1034: aload 60
    //   1036: arraylength
    //   1037: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1040: iload 9
    //   1042: aload 60
    //   1044: arraylength
    //   1045: iadd
    //   1046: istore 61
    //   1048: iload 61
    //   1050: iconst_1
    //   1051: iadd
    //   1052: istore 9
    //   1054: aload_0
    //   1055: iload 61
    //   1057: iconst_0
    //   1058: bastore
    //   1059: ldc_w 2424
    //   1062: ldc 59
    //   1064: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1067: astore 62
    //   1069: aload 62
    //   1071: iconst_0
    //   1072: aload_0
    //   1073: iload 9
    //   1075: aload 62
    //   1077: arraylength
    //   1078: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1081: iload 9
    //   1083: aload 62
    //   1085: arraylength
    //   1086: iadd
    //   1087: istore 63
    //   1089: iload 63
    //   1091: iconst_1
    //   1092: iadd
    //   1093: istore 9
    //   1095: aload_0
    //   1096: iload 63
    //   1098: iconst_0
    //   1099: bastore
    //   1100: iload 9
    //   1102: iconst_1
    //   1103: iadd
    //   1104: istore 12
    //   1106: aload_0
    //   1107: iload 9
    //   1109: iconst_0
    //   1110: bastore
    //   1111: ldc_w 2426
    //   1114: ldc 59
    //   1116: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1119: astore 64
    //   1121: aload 64
    //   1123: iconst_0
    //   1124: aload_0
    //   1125: iload 12
    //   1127: aload 64
    //   1129: arraylength
    //   1130: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1133: aload 64
    //   1135: arraylength
    //   1136: istore 65
    //   1138: iload 12
    //   1140: iload 65
    //   1142: iadd
    //   1143: istore 66
    //   1145: iload 66
    //   1147: iconst_1
    //   1148: iadd
    //   1149: istore 9
    //   1151: aload_0
    //   1152: iload 66
    //   1154: iconst_0
    //   1155: bastore
    //   1156: ldc_w 2428
    //   1159: ldc 59
    //   1161: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1164: astore 67
    //   1166: aload 67
    //   1168: iconst_0
    //   1169: aload_0
    //   1170: iload 9
    //   1172: aload 67
    //   1174: arraylength
    //   1175: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1178: iload 9
    //   1180: aload 67
    //   1182: arraylength
    //   1183: iadd
    //   1184: istore 68
    //   1186: iload 68
    //   1188: iconst_1
    //   1189: iadd
    //   1190: istore 9
    //   1192: aload_0
    //   1193: iload 68
    //   1195: iconst_0
    //   1196: bastore
    //   1197: ldc_w 2430
    //   1200: ldc 59
    //   1202: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1205: astore 69
    //   1207: aload 69
    //   1209: iconst_0
    //   1210: aload_0
    //   1211: iload 9
    //   1213: aload 69
    //   1215: arraylength
    //   1216: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1219: iload 9
    //   1221: aload 69
    //   1223: arraylength
    //   1224: iadd
    //   1225: istore 70
    //   1227: iload 70
    //   1229: iconst_1
    //   1230: iadd
    //   1231: istore 9
    //   1233: aload_0
    //   1234: iload 70
    //   1236: iconst_0
    //   1237: bastore
    //   1238: ldc_w 2432
    //   1241: ldc 59
    //   1243: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1246: astore 71
    //   1248: aload 71
    //   1250: iconst_0
    //   1251: aload_0
    //   1252: iload 9
    //   1254: aload 71
    //   1256: arraylength
    //   1257: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1260: iload 9
    //   1262: aload 71
    //   1264: arraylength
    //   1265: iadd
    //   1266: istore 72
    //   1268: iload 72
    //   1270: iconst_1
    //   1271: iadd
    //   1272: istore 9
    //   1274: aload_0
    //   1275: iload 72
    //   1277: iconst_0
    //   1278: bastore
    //   1279: ldc_w 2434
    //   1282: ldc 59
    //   1284: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1287: astore 73
    //   1289: aload 73
    //   1291: iconst_0
    //   1292: aload_0
    //   1293: iload 9
    //   1295: aload 73
    //   1297: arraylength
    //   1298: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1301: iload 9
    //   1303: aload 73
    //   1305: arraylength
    //   1306: iadd
    //   1307: istore 74
    //   1309: iload 74
    //   1311: iconst_1
    //   1312: iadd
    //   1313: istore 9
    //   1315: aload_0
    //   1316: iload 74
    //   1318: iconst_0
    //   1319: bastore
    //   1320: ldc_w 2436
    //   1323: ldc 59
    //   1325: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1328: astore 75
    //   1330: aload 75
    //   1332: iconst_0
    //   1333: aload_0
    //   1334: iload 9
    //   1336: aload 75
    //   1338: arraylength
    //   1339: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1342: iload 9
    //   1344: aload 75
    //   1346: arraylength
    //   1347: iadd
    //   1348: istore 76
    //   1350: iload 76
    //   1352: iconst_1
    //   1353: iadd
    //   1354: istore 9
    //   1356: aload_0
    //   1357: iload 76
    //   1359: iconst_0
    //   1360: bastore
    //   1361: iload 9
    //   1363: iconst_1
    //   1364: iadd
    //   1365: istore 12
    //   1367: aload_0
    //   1368: iload 9
    //   1370: iconst_0
    //   1371: bastore
    //   1372: ldc_w 2438
    //   1375: ldc 59
    //   1377: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1380: astore 77
    //   1382: aload 77
    //   1384: iconst_0
    //   1385: aload_0
    //   1386: iload 12
    //   1388: aload 77
    //   1390: arraylength
    //   1391: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1394: aload 77
    //   1396: arraylength
    //   1397: istore 78
    //   1399: iload 12
    //   1401: iload 78
    //   1403: iadd
    //   1404: istore 79
    //   1406: iload 79
    //   1408: iconst_1
    //   1409: iadd
    //   1410: istore 9
    //   1412: aload_0
    //   1413: iload 79
    //   1415: iconst_0
    //   1416: bastore
    //   1417: iload 9
    //   1419: iconst_1
    //   1420: iadd
    //   1421: istore 12
    //   1423: aload_0
    //   1424: iload 9
    //   1426: iconst_1
    //   1427: bastore
    //   1428: ldc_w 2440
    //   1431: ldc 59
    //   1433: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1436: astore 80
    //   1438: aload 80
    //   1440: iconst_0
    //   1441: aload_0
    //   1442: iload 12
    //   1444: aload 80
    //   1446: arraylength
    //   1447: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1450: aload 80
    //   1452: arraylength
    //   1453: istore 81
    //   1455: iload 12
    //   1457: iload 81
    //   1459: iadd
    //   1460: istore 82
    //   1462: iload 82
    //   1464: iconst_1
    //   1465: iadd
    //   1466: istore 9
    //   1468: aload_0
    //   1469: iload 82
    //   1471: iconst_0
    //   1472: bastore
    //   1473: iload 9
    //   1475: iconst_1
    //   1476: iadd
    //   1477: istore 12
    //   1479: aload_0
    //   1480: iload 9
    //   1482: iconst_1
    //   1483: bastore
    //   1484: iload 12
    //   1486: iconst_1
    //   1487: iadd
    //   1488: istore 9
    //   1490: aload_0
    //   1491: iload 12
    //   1493: iconst_2
    //   1494: bastore
    //   1495: ldc_w 2442
    //   1498: ldc 59
    //   1500: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1503: astore 83
    //   1505: aload 83
    //   1507: iconst_0
    //   1508: aload_0
    //   1509: iload 9
    //   1511: aload 83
    //   1513: arraylength
    //   1514: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1517: iload 9
    //   1519: aload 83
    //   1521: arraylength
    //   1522: iadd
    //   1523: istore 84
    //   1525: iload 84
    //   1527: iconst_1
    //   1528: iadd
    //   1529: istore 9
    //   1531: aload_0
    //   1532: iload 84
    //   1534: iconst_0
    //   1535: bastore
    //   1536: iload 9
    //   1538: iconst_1
    //   1539: iadd
    //   1540: istore 12
    //   1542: aload_0
    //   1543: iload 9
    //   1545: iconst_4
    //   1546: bastore
    //   1547: iload 12
    //   1549: iconst_1
    //   1550: iadd
    //   1551: istore 9
    //   1553: aload_0
    //   1554: iload 12
    //   1556: iconst_2
    //   1557: bastore
    //   1558: ldc_w 2444
    //   1561: ldc 59
    //   1563: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1566: astore 85
    //   1568: aload 85
    //   1570: iconst_0
    //   1571: aload_0
    //   1572: iload 9
    //   1574: aload 85
    //   1576: arraylength
    //   1577: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1580: iload 9
    //   1582: aload 85
    //   1584: arraylength
    //   1585: iadd
    //   1586: istore 86
    //   1588: iload 86
    //   1590: iconst_1
    //   1591: iadd
    //   1592: istore 9
    //   1594: aload_0
    //   1595: iload 86
    //   1597: iconst_0
    //   1598: bastore
    //   1599: iload 9
    //   1601: iconst_1
    //   1602: iadd
    //   1603: istore 12
    //   1605: aload_0
    //   1606: iload 9
    //   1608: bipush 7
    //   1610: bastore
    //   1611: iload 12
    //   1613: iconst_1
    //   1614: iadd
    //   1615: istore 9
    //   1617: aload_0
    //   1618: iload 12
    //   1620: iconst_2
    //   1621: bastore
    //   1622: ldc_w 2446
    //   1625: ldc 59
    //   1627: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1630: astore 87
    //   1632: aload 87
    //   1634: iconst_0
    //   1635: aload_0
    //   1636: iload 9
    //   1638: aload 87
    //   1640: arraylength
    //   1641: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1644: iload 9
    //   1646: aload 87
    //   1648: arraylength
    //   1649: iadd
    //   1650: istore 88
    //   1652: iload 88
    //   1654: iconst_1
    //   1655: iadd
    //   1656: istore 9
    //   1658: aload_0
    //   1659: iload 88
    //   1661: iconst_0
    //   1662: bastore
    //   1663: iload 9
    //   1665: iconst_1
    //   1666: iadd
    //   1667: istore 12
    //   1669: aload_0
    //   1670: iload 9
    //   1672: bipush 9
    //   1674: bastore
    //   1675: iload 12
    //   1677: iconst_1
    //   1678: iadd
    //   1679: istore 9
    //   1681: aload_0
    //   1682: iload 12
    //   1684: iconst_2
    //   1685: bastore
    //   1686: ldc_w 2448
    //   1689: ldc 59
    //   1691: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1694: astore 89
    //   1696: aload 89
    //   1698: iconst_0
    //   1699: aload_0
    //   1700: iload 9
    //   1702: aload 89
    //   1704: arraylength
    //   1705: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1708: iload 9
    //   1710: aload 89
    //   1712: arraylength
    //   1713: iadd
    //   1714: istore 90
    //   1716: iload 90
    //   1718: iconst_1
    //   1719: iadd
    //   1720: istore 9
    //   1722: aload_0
    //   1723: iload 90
    //   1725: iconst_0
    //   1726: bastore
    //   1727: iload 9
    //   1729: iconst_1
    //   1730: iadd
    //   1731: istore 12
    //   1733: aload_0
    //   1734: iload 9
    //   1736: bipush 17
    //   1738: bastore
    //   1739: iload 12
    //   1741: iconst_1
    //   1742: iadd
    //   1743: istore 9
    //   1745: aload_0
    //   1746: iload 12
    //   1748: iconst_1
    //   1749: bastore
    //   1750: ldc_w 2450
    //   1753: ldc 59
    //   1755: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1758: astore 91
    //   1760: aload 91
    //   1762: iconst_0
    //   1763: aload_0
    //   1764: iload 9
    //   1766: aload 91
    //   1768: arraylength
    //   1769: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1772: iload 9
    //   1774: aload 91
    //   1776: arraylength
    //   1777: iadd
    //   1778: istore 92
    //   1780: iload 92
    //   1782: iconst_1
    //   1783: iadd
    //   1784: istore 9
    //   1786: aload_0
    //   1787: iload 92
    //   1789: iconst_0
    //   1790: bastore
    //   1791: iload 9
    //   1793: iconst_1
    //   1794: iadd
    //   1795: istore 12
    //   1797: aload_0
    //   1798: iload 9
    //   1800: bipush 20
    //   1802: bastore
    //   1803: iload 12
    //   1805: iconst_1
    //   1806: iadd
    //   1807: istore 9
    //   1809: aload_0
    //   1810: iload 12
    //   1812: iconst_1
    //   1813: bastore
    //   1814: ldc_w 2452
    //   1817: ldc 59
    //   1819: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1822: astore 93
    //   1824: aload 93
    //   1826: iconst_0
    //   1827: aload_0
    //   1828: iload 9
    //   1830: aload 93
    //   1832: arraylength
    //   1833: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1836: iload 9
    //   1838: aload 93
    //   1840: arraylength
    //   1841: iadd
    //   1842: istore 94
    //   1844: iload 94
    //   1846: iconst_1
    //   1847: iadd
    //   1848: istore 9
    //   1850: aload_0
    //   1851: iload 94
    //   1853: iconst_0
    //   1854: bastore
    //   1855: iload 9
    //   1857: iconst_1
    //   1858: iadd
    //   1859: istore 12
    //   1861: aload_0
    //   1862: iload 9
    //   1864: bipush 33
    //   1866: bastore
    //   1867: iload 12
    //   1869: iconst_1
    //   1870: iadd
    //   1871: istore 9
    //   1873: aload_0
    //   1874: iload 12
    //   1876: iconst_1
    //   1877: bastore
    //   1878: ldc_w 2454
    //   1881: ldc 59
    //   1883: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1886: astore 95
    //   1888: aload 95
    //   1890: iconst_0
    //   1891: aload_0
    //   1892: iload 9
    //   1894: aload 95
    //   1896: arraylength
    //   1897: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1900: iload 9
    //   1902: aload 95
    //   1904: arraylength
    //   1905: iadd
    //   1906: istore 96
    //   1908: iload 96
    //   1910: iconst_1
    //   1911: iadd
    //   1912: istore 9
    //   1914: aload_0
    //   1915: iload 96
    //   1917: iconst_0
    //   1918: bastore
    //   1919: iload 9
    //   1921: iconst_1
    //   1922: iadd
    //   1923: istore 12
    //   1925: aload_0
    //   1926: iload 9
    //   1928: bipush 36
    //   1930: bastore
    //   1931: iload 12
    //   1933: iconst_1
    //   1934: iadd
    //   1935: istore 9
    //   1937: aload_0
    //   1938: iload 12
    //   1940: iconst_2
    //   1941: bastore
    //   1942: ldc_w 2456
    //   1945: ldc 59
    //   1947: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1950: astore 97
    //   1952: aload 97
    //   1954: iconst_0
    //   1955: aload_0
    //   1956: iload 9
    //   1958: aload 97
    //   1960: arraylength
    //   1961: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1964: iload 9
    //   1966: aload 97
    //   1968: arraylength
    //   1969: iadd
    //   1970: istore 98
    //   1972: iload 98
    //   1974: iconst_1
    //   1975: iadd
    //   1976: istore 9
    //   1978: aload_0
    //   1979: iload 98
    //   1981: iconst_0
    //   1982: bastore
    //   1983: iload 9
    //   1985: iconst_1
    //   1986: iadd
    //   1987: istore 12
    //   1989: aload_0
    //   1990: iload 9
    //   1992: bipush 38
    //   1994: bastore
    //   1995: iload 12
    //   1997: iconst_1
    //   1998: iadd
    //   1999: istore 9
    //   2001: aload_0
    //   2002: iload 12
    //   2004: iconst_2
    //   2005: bastore
    //   2006: ldc_w 2458
    //   2009: ldc 59
    //   2011: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2014: astore 99
    //   2016: aload 99
    //   2018: iconst_0
    //   2019: aload_0
    //   2020: iload 9
    //   2022: aload 99
    //   2024: arraylength
    //   2025: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2028: iload 9
    //   2030: aload 99
    //   2032: arraylength
    //   2033: iadd
    //   2034: istore 100
    //   2036: iload 100
    //   2038: iconst_1
    //   2039: iadd
    //   2040: istore 9
    //   2042: aload_0
    //   2043: iload 100
    //   2045: iconst_0
    //   2046: bastore
    //   2047: iload 9
    //   2049: iconst_1
    //   2050: iadd
    //   2051: istore 12
    //   2053: aload_0
    //   2054: iload 9
    //   2056: bipush 40
    //   2058: bastore
    //   2059: iload 12
    //   2061: iconst_1
    //   2062: iadd
    //   2063: istore 9
    //   2065: aload_0
    //   2066: iload 12
    //   2068: iconst_2
    //   2069: bastore
    //   2070: ldc_w 2460
    //   2073: ldc 59
    //   2075: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2078: astore 101
    //   2080: aload 101
    //   2082: iconst_0
    //   2083: aload_0
    //   2084: iload 9
    //   2086: aload 101
    //   2088: arraylength
    //   2089: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2092: iload 9
    //   2094: aload 101
    //   2096: arraylength
    //   2097: iadd
    //   2098: istore 102
    //   2100: iload 102
    //   2102: iconst_1
    //   2103: iadd
    //   2104: istore 9
    //   2106: aload_0
    //   2107: iload 102
    //   2109: iconst_0
    //   2110: bastore
    //   2111: iload 9
    //   2113: iconst_1
    //   2114: iadd
    //   2115: istore 12
    //   2117: aload_0
    //   2118: iload 9
    //   2120: bipush 42
    //   2122: bastore
    //   2123: iload 12
    //   2125: iconst_1
    //   2126: iadd
    //   2127: istore 9
    //   2129: aload_0
    //   2130: iload 12
    //   2132: iconst_2
    //   2133: bastore
    //   2134: ldc_w 2462
    //   2137: ldc 59
    //   2139: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2142: astore 103
    //   2144: aload 103
    //   2146: iconst_0
    //   2147: aload_0
    //   2148: iload 9
    //   2150: aload 103
    //   2152: arraylength
    //   2153: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2156: iload 9
    //   2158: aload 103
    //   2160: arraylength
    //   2161: iadd
    //   2162: istore 104
    //   2164: iload 104
    //   2166: iconst_1
    //   2167: iadd
    //   2168: istore 9
    //   2170: aload_0
    //   2171: iload 104
    //   2173: iconst_0
    //   2174: bastore
    //   2175: iload 9
    //   2177: iconst_1
    //   2178: iadd
    //   2179: istore 12
    //   2181: aload_0
    //   2182: iload 9
    //   2184: bipush 46
    //   2186: bastore
    //   2187: iload 12
    //   2189: iconst_1
    //   2190: iadd
    //   2191: istore 9
    //   2193: aload_0
    //   2194: iload 12
    //   2196: iconst_1
    //   2197: bastore
    //   2198: ldc_w 2464
    //   2201: ldc 59
    //   2203: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2206: astore 105
    //   2208: aload 105
    //   2210: iconst_0
    //   2211: aload_0
    //   2212: iload 9
    //   2214: aload 105
    //   2216: arraylength
    //   2217: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2220: iload 9
    //   2222: aload 105
    //   2224: arraylength
    //   2225: iadd
    //   2226: istore 106
    //   2228: iload 106
    //   2230: iconst_1
    //   2231: iadd
    //   2232: istore 9
    //   2234: aload_0
    //   2235: iload 106
    //   2237: iconst_0
    //   2238: bastore
    //   2239: iload 9
    //   2241: iconst_1
    //   2242: iadd
    //   2243: istore 12
    //   2245: aload_0
    //   2246: iload 9
    //   2248: bipush 50
    //   2250: bastore
    //   2251: iload 12
    //   2253: iconst_1
    //   2254: iadd
    //   2255: istore 9
    //   2257: aload_0
    //   2258: iload 12
    //   2260: iconst_1
    //   2261: bastore
    //   2262: ldc_w 2466
    //   2265: ldc 59
    //   2267: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2270: astore 107
    //   2272: aload 107
    //   2274: iconst_0
    //   2275: aload_0
    //   2276: iload 9
    //   2278: aload 107
    //   2280: arraylength
    //   2281: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2284: iload 9
    //   2286: aload 107
    //   2288: arraylength
    //   2289: iadd
    //   2290: istore 108
    //   2292: iload 108
    //   2294: iconst_1
    //   2295: iadd
    //   2296: istore 9
    //   2298: aload_0
    //   2299: iload 108
    //   2301: iconst_0
    //   2302: bastore
    //   2303: iload 9
    //   2305: iconst_1
    //   2306: iadd
    //   2307: istore 12
    //   2309: aload_0
    //   2310: iload 9
    //   2312: bipush 67
    //   2314: bastore
    //   2315: iload 12
    //   2317: iconst_1
    //   2318: iadd
    //   2319: istore 9
    //   2321: aload_0
    //   2322: iload 12
    //   2324: iconst_1
    //   2325: bastore
    //   2326: ldc_w 2468
    //   2329: ldc 59
    //   2331: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2334: astore 109
    //   2336: aload 109
    //   2338: iconst_0
    //   2339: aload_0
    //   2340: iload 9
    //   2342: aload 109
    //   2344: arraylength
    //   2345: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2348: iload 9
    //   2350: aload 109
    //   2352: arraylength
    //   2353: iadd
    //   2354: istore 110
    //   2356: iload 110
    //   2358: iconst_1
    //   2359: iadd
    //   2360: istore 9
    //   2362: aload_0
    //   2363: iload 110
    //   2365: iconst_0
    //   2366: bastore
    //   2367: iload 9
    //   2369: iconst_1
    //   2370: iadd
    //   2371: istore 12
    //   2373: aload_0
    //   2374: iload 9
    //   2376: bipush 69
    //   2378: bastore
    //   2379: iload 12
    //   2381: iconst_1
    //   2382: iadd
    //   2383: istore 9
    //   2385: aload_0
    //   2386: iload 12
    //   2388: iconst_2
    //   2389: bastore
    //   2390: ldc_w 2470
    //   2393: ldc 59
    //   2395: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2398: astore 111
    //   2400: aload 111
    //   2402: iconst_0
    //   2403: aload_0
    //   2404: iload 9
    //   2406: aload 111
    //   2408: arraylength
    //   2409: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2412: iload 9
    //   2414: aload 111
    //   2416: arraylength
    //   2417: iadd
    //   2418: istore 112
    //   2420: iload 112
    //   2422: iconst_1
    //   2423: iadd
    //   2424: istore 9
    //   2426: aload_0
    //   2427: iload 112
    //   2429: iconst_0
    //   2430: bastore
    //   2431: iload 9
    //   2433: iconst_1
    //   2434: iadd
    //   2435: istore 12
    //   2437: aload_0
    //   2438: iload 9
    //   2440: bipush 71
    //   2442: bastore
    //   2443: iload 12
    //   2445: iconst_1
    //   2446: iadd
    //   2447: istore 9
    //   2449: aload_0
    //   2450: iload 12
    //   2452: iconst_1
    //   2453: bastore
    //   2454: ldc_w 2472
    //   2457: ldc 59
    //   2459: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2462: astore 113
    //   2464: aload 113
    //   2466: iconst_0
    //   2467: aload_0
    //   2468: iload 9
    //   2470: aload 113
    //   2472: arraylength
    //   2473: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2476: iload 9
    //   2478: aload 113
    //   2480: arraylength
    //   2481: iadd
    //   2482: istore 114
    //   2484: iload 114
    //   2486: iconst_1
    //   2487: iadd
    //   2488: istore 9
    //   2490: aload_0
    //   2491: iload 114
    //   2493: iconst_0
    //   2494: bastore
    //   2495: iload 9
    //   2497: iconst_1
    //   2498: iadd
    //   2499: istore 12
    //   2501: aload_0
    //   2502: iload 9
    //   2504: bipush 71
    //   2506: bastore
    //   2507: iload 12
    //   2509: iconst_1
    //   2510: iadd
    //   2511: istore 9
    //   2513: aload_0
    //   2514: iload 12
    //   2516: iconst_2
    //   2517: bastore
    //   2518: ldc_w 2474
    //   2521: ldc 59
    //   2523: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2526: astore 115
    //   2528: aload 115
    //   2530: iconst_0
    //   2531: aload_0
    //   2532: iload 9
    //   2534: aload 115
    //   2536: arraylength
    //   2537: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2540: iload 9
    //   2542: aload 115
    //   2544: arraylength
    //   2545: iadd
    //   2546: istore 116
    //   2548: iload 116
    //   2550: iconst_1
    //   2551: iadd
    //   2552: istore 9
    //   2554: aload_0
    //   2555: iload 116
    //   2557: iconst_0
    //   2558: bastore
    //   2559: iload 9
    //   2561: iconst_1
    //   2562: iadd
    //   2563: istore 12
    //   2565: aload_0
    //   2566: iload 9
    //   2568: bipush 73
    //   2570: bastore
    //   2571: iload 12
    //   2573: iconst_1
    //   2574: iadd
    //   2575: istore 9
    //   2577: aload_0
    //   2578: iload 12
    //   2580: iconst_2
    //   2581: bastore
    //   2582: ldc_w 2476
    //   2585: ldc 59
    //   2587: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2590: astore 117
    //   2592: aload 117
    //   2594: iconst_0
    //   2595: aload_0
    //   2596: iload 9
    //   2598: aload 117
    //   2600: arraylength
    //   2601: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2604: iload 9
    //   2606: aload 117
    //   2608: arraylength
    //   2609: iadd
    //   2610: istore 118
    //   2612: iload 118
    //   2614: iconst_1
    //   2615: iadd
    //   2616: istore 9
    //   2618: aload_0
    //   2619: iload 118
    //   2621: iconst_0
    //   2622: bastore
    //   2623: iload 9
    //   2625: iconst_1
    //   2626: iadd
    //   2627: istore 12
    //   2629: aload_0
    //   2630: iload 9
    //   2632: bipush 75
    //   2634: bastore
    //   2635: iload 12
    //   2637: iconst_1
    //   2638: iadd
    //   2639: istore 9
    //   2641: aload_0
    //   2642: iload 12
    //   2644: iconst_1
    //   2645: bastore
    //   2646: ldc_w 2478
    //   2649: ldc 59
    //   2651: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2654: astore 119
    //   2656: aload 119
    //   2658: iconst_0
    //   2659: aload_0
    //   2660: iload 9
    //   2662: aload 119
    //   2664: arraylength
    //   2665: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2668: iload 9
    //   2670: aload 119
    //   2672: arraylength
    //   2673: iadd
    //   2674: istore 120
    //   2676: iload 120
    //   2678: iconst_1
    //   2679: iadd
    //   2680: istore 9
    //   2682: aload_0
    //   2683: iload 120
    //   2685: iconst_0
    //   2686: bastore
    //   2687: iload 9
    //   2689: iconst_1
    //   2690: iadd
    //   2691: istore 12
    //   2693: aload_0
    //   2694: iload 9
    //   2696: bipush 75
    //   2698: bastore
    //   2699: iload 12
    //   2701: iconst_1
    //   2702: iadd
    //   2703: istore 9
    //   2705: aload_0
    //   2706: iload 12
    //   2708: iconst_2
    //   2709: bastore
    //   2710: ldc_w 2480
    //   2713: ldc 59
    //   2715: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2718: astore 121
    //   2720: aload 121
    //   2722: iconst_0
    //   2723: aload_0
    //   2724: iload 9
    //   2726: aload 121
    //   2728: arraylength
    //   2729: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2732: iload 9
    //   2734: aload 121
    //   2736: arraylength
    //   2737: iadd
    //   2738: istore 122
    //   2740: iload 122
    //   2742: iconst_1
    //   2743: iadd
    //   2744: istore 9
    //   2746: aload_0
    //   2747: iload 122
    //   2749: iconst_0
    //   2750: bastore
    //   2751: iload 9
    //   2753: iconst_1
    //   2754: iadd
    //   2755: istore 12
    //   2757: aload_0
    //   2758: iload 9
    //   2760: bipush 87
    //   2762: bastore
    //   2763: iload 12
    //   2765: iconst_1
    //   2766: iadd
    //   2767: istore 9
    //   2769: aload_0
    //   2770: iload 12
    //   2772: iconst_1
    //   2773: bastore
    //   2774: ldc_w 2482
    //   2777: ldc 59
    //   2779: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2782: astore 123
    //   2784: aload 123
    //   2786: iconst_0
    //   2787: aload_0
    //   2788: iload 9
    //   2790: aload 123
    //   2792: arraylength
    //   2793: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2796: iload 9
    //   2798: aload 123
    //   2800: arraylength
    //   2801: iadd
    //   2802: istore 124
    //   2804: iload 124
    //   2806: iconst_1
    //   2807: iadd
    //   2808: istore 9
    //   2810: aload_0
    //   2811: iload 124
    //   2813: iconst_0
    //   2814: bastore
    //   2815: iload 9
    //   2817: iconst_1
    //   2818: iadd
    //   2819: istore 12
    //   2821: aload_0
    //   2822: iload 9
    //   2824: bipush 90
    //   2826: bastore
    //   2827: iload 12
    //   2829: iconst_1
    //   2830: iadd
    //   2831: istore 9
    //   2833: aload_0
    //   2834: iload 12
    //   2836: iconst_1
    //   2837: bastore
    //   2838: ldc_w 2484
    //   2841: ldc 59
    //   2843: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2846: astore 125
    //   2848: aload 125
    //   2850: iconst_0
    //   2851: aload_0
    //   2852: iload 9
    //   2854: aload 125
    //   2856: arraylength
    //   2857: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2860: iload 9
    //   2862: aload 125
    //   2864: arraylength
    //   2865: iadd
    //   2866: istore 126
    //   2868: iload 126
    //   2870: iconst_1
    //   2871: iadd
    //   2872: istore 9
    //   2874: aload_0
    //   2875: iload 126
    //   2877: iconst_0
    //   2878: bastore
    //   2879: iload 9
    //   2881: iconst_1
    //   2882: iadd
    //   2883: istore 12
    //   2885: aload_0
    //   2886: iload 9
    //   2888: bipush 93
    //   2890: bastore
    //   2891: iload 12
    //   2893: iconst_1
    //   2894: iadd
    //   2895: istore 9
    //   2897: aload_0
    //   2898: iload 12
    //   2900: iconst_1
    //   2901: bastore
    //   2902: ldc_w 2486
    //   2905: ldc 59
    //   2907: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2910: astore 127
    //   2912: aload 127
    //   2914: iconst_0
    //   2915: aload_0
    //   2916: iload 9
    //   2918: aload 127
    //   2920: arraylength
    //   2921: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2924: iload 9
    //   2926: aload 127
    //   2928: arraylength
    //   2929: iadd
    //   2930: istore -128
    //   2932: iload -128
    //   2934: iconst_1
    //   2935: iadd
    //   2936: istore 9
    //   2938: aload_0
    //   2939: iload -128
    //   2941: iconst_0
    //   2942: bastore
    //   2943: iload 9
    //   2945: istore 12
    //   2947: new 168	java/io/File
    //   2950: dup
    //   2951: ldc_w 2488
    //   2954: invokespecial 173	java/io/File:<init>	(Ljava/lang/String;)V
    //   2957: aload_0
    //   2958: iload 12
    //   2960: invokestatic 179	net/oicp/anya/Utils:writeBytes2File	(Ljava/io/File;[BI)V
    //   2963: return
    //   2964: astore 10
    //   2966: aload 10
    //   2968: astore 11
    //   2970: iload 9
    //   2972: istore 12
    //   2974: aload 11
    //   2976: invokevirtual 182	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   2979: goto -32 -> 2947
    //   2982: astore 19
    //   2984: aload 19
    //   2986: astore 11
    //   2988: goto -14 -> 2974
    // Local variable table:
    //   start	length	slot	name	signature
    //   5	2953	0	arrayOfByte1	byte[]
    //   11	11	1	arrayOfByte2	byte[]
    //   23	7	2	i	int
    //   27	12	3	j	int
    //   35	14	4	k	int
    //   45	15	5	m	int
    //   56	16	6	n	int
    //   68	15	7	i1	int
    //   79	16	8	i2	int
    //   91	2880	9	i3	int
    //   2964	3	10	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   2968	19	11	localObject	Object
    //   226	2747	12	i4	int
    //   107	17	13	arrayOfByte3	byte[]
    //   127	10	14	i5	int
    //   148	17	15	arrayOfByte4	byte[]
    //   168	10	16	i6	int
    //   189	17	17	arrayOfByte5	byte[]
    //   209	10	18	i7	int
    //   2982	3	19	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   240	15	20	arrayOfByte6	byte[]
    //   257	7	21	i8	int
    //   264	10	22	i9	int
    //   296	15	23	arrayOfByte7	byte[]
    //   313	7	24	i10	int
    //   320	10	25	i11	int
    //   341	17	26	arrayOfByte8	byte[]
    //   361	10	27	i12	int
    //   393	15	28	arrayOfByte9	byte[]
    //   410	7	29	i13	int
    //   417	10	30	i14	int
    //   438	17	31	arrayOfByte10	byte[]
    //   458	10	32	i15	int
    //   479	17	33	arrayOfByte11	byte[]
    //   499	10	34	i16	int
    //   520	17	35	arrayOfByte12	byte[]
    //   540	10	36	i17	int
    //   561	17	37	arrayOfByte13	byte[]
    //   581	10	38	i18	int
    //   602	17	39	arrayOfByte14	byte[]
    //   622	10	40	i19	int
    //   643	17	41	arrayOfByte15	byte[]
    //   663	10	42	i20	int
    //   683	17	43	arrayOfByte16	byte[]
    //   703	10	44	i21	int
    //   724	17	45	arrayOfByte17	byte[]
    //   744	10	46	i22	int
    //   765	17	47	arrayOfByte18	byte[]
    //   785	10	48	i23	int
    //   806	17	49	arrayOfByte19	byte[]
    //   826	10	50	i24	int
    //   847	17	51	arrayOfByte20	byte[]
    //   867	10	52	i25	int
    //   888	17	53	arrayOfByte21	byte[]
    //   908	10	54	i26	int
    //   929	17	55	arrayOfByte22	byte[]
    //   949	10	56	i27	int
    //   981	15	57	arrayOfByte23	byte[]
    //   998	7	58	i28	int
    //   1005	10	59	i29	int
    //   1026	17	60	arrayOfByte24	byte[]
    //   1046	10	61	i30	int
    //   1067	17	62	arrayOfByte25	byte[]
    //   1087	10	63	i31	int
    //   1119	15	64	arrayOfByte26	byte[]
    //   1136	7	65	i32	int
    //   1143	10	66	i33	int
    //   1164	17	67	arrayOfByte27	byte[]
    //   1184	10	68	i34	int
    //   1205	17	69	arrayOfByte28	byte[]
    //   1225	10	70	i35	int
    //   1246	17	71	arrayOfByte29	byte[]
    //   1266	10	72	i36	int
    //   1287	17	73	arrayOfByte30	byte[]
    //   1307	10	74	i37	int
    //   1328	17	75	arrayOfByte31	byte[]
    //   1348	10	76	i38	int
    //   1380	15	77	arrayOfByte32	byte[]
    //   1397	7	78	i39	int
    //   1404	10	79	i40	int
    //   1436	15	80	arrayOfByte33	byte[]
    //   1453	7	81	i41	int
    //   1460	10	82	i42	int
    //   1503	17	83	arrayOfByte34	byte[]
    //   1523	10	84	i43	int
    //   1566	17	85	arrayOfByte35	byte[]
    //   1586	10	86	i44	int
    //   1630	17	87	arrayOfByte36	byte[]
    //   1650	10	88	i45	int
    //   1694	17	89	arrayOfByte37	byte[]
    //   1714	10	90	i46	int
    //   1758	17	91	arrayOfByte38	byte[]
    //   1778	10	92	i47	int
    //   1822	17	93	arrayOfByte39	byte[]
    //   1842	10	94	i48	int
    //   1886	17	95	arrayOfByte40	byte[]
    //   1906	10	96	i49	int
    //   1950	17	97	arrayOfByte41	byte[]
    //   1970	10	98	i50	int
    //   2014	17	99	arrayOfByte42	byte[]
    //   2034	10	100	i51	int
    //   2078	17	101	arrayOfByte43	byte[]
    //   2098	10	102	i52	int
    //   2142	17	103	arrayOfByte44	byte[]
    //   2162	10	104	i53	int
    //   2206	17	105	arrayOfByte45	byte[]
    //   2226	10	106	i54	int
    //   2270	17	107	arrayOfByte46	byte[]
    //   2290	10	108	i55	int
    //   2334	17	109	arrayOfByte47	byte[]
    //   2354	10	110	i56	int
    //   2398	17	111	arrayOfByte48	byte[]
    //   2418	10	112	i57	int
    //   2462	17	113	arrayOfByte49	byte[]
    //   2482	10	114	i58	int
    //   2526	17	115	arrayOfByte50	byte[]
    //   2546	10	116	i59	int
    //   2590	17	117	arrayOfByte51	byte[]
    //   2610	10	118	i60	int
    //   2654	17	119	arrayOfByte52	byte[]
    //   2674	10	120	i61	int
    //   2718	17	121	arrayOfByte53	byte[]
    //   2738	10	122	i62	int
    //   2782	17	123	arrayOfByte54	byte[]
    //   2802	10	124	i63	int
    //   2846	17	125	arrayOfByte55	byte[]
    //   2866	10	126	i64	int
    //   2910	17	127	arrayOfByte56	byte[]
    //   2930	10	128	i65	int
    // Exception table:
    //   from	to	target	type
    //   99	129	2964	java/io/UnsupportedEncodingException
    //   135	170	2964	java/io/UnsupportedEncodingException
    //   176	211	2964	java/io/UnsupportedEncodingException
    //   217	222	2964	java/io/UnsupportedEncodingException
    //   272	277	2964	java/io/UnsupportedEncodingException
    //   328	363	2964	java/io/UnsupportedEncodingException
    //   369	374	2964	java/io/UnsupportedEncodingException
    //   425	460	2964	java/io/UnsupportedEncodingException
    //   466	501	2964	java/io/UnsupportedEncodingException
    //   507	542	2964	java/io/UnsupportedEncodingException
    //   548	583	2964	java/io/UnsupportedEncodingException
    //   589	624	2964	java/io/UnsupportedEncodingException
    //   630	665	2964	java/io/UnsupportedEncodingException
    //   671	705	2964	java/io/UnsupportedEncodingException
    //   711	746	2964	java/io/UnsupportedEncodingException
    //   752	787	2964	java/io/UnsupportedEncodingException
    //   793	828	2964	java/io/UnsupportedEncodingException
    //   834	869	2964	java/io/UnsupportedEncodingException
    //   875	910	2964	java/io/UnsupportedEncodingException
    //   916	951	2964	java/io/UnsupportedEncodingException
    //   957	962	2964	java/io/UnsupportedEncodingException
    //   1013	1048	2964	java/io/UnsupportedEncodingException
    //   1054	1089	2964	java/io/UnsupportedEncodingException
    //   1095	1100	2964	java/io/UnsupportedEncodingException
    //   1151	1186	2964	java/io/UnsupportedEncodingException
    //   1192	1227	2964	java/io/UnsupportedEncodingException
    //   1233	1268	2964	java/io/UnsupportedEncodingException
    //   1274	1309	2964	java/io/UnsupportedEncodingException
    //   1315	1350	2964	java/io/UnsupportedEncodingException
    //   1356	1361	2964	java/io/UnsupportedEncodingException
    //   1412	1417	2964	java/io/UnsupportedEncodingException
    //   1468	1473	2964	java/io/UnsupportedEncodingException
    //   1490	1525	2964	java/io/UnsupportedEncodingException
    //   1531	1536	2964	java/io/UnsupportedEncodingException
    //   1553	1588	2964	java/io/UnsupportedEncodingException
    //   1594	1599	2964	java/io/UnsupportedEncodingException
    //   1617	1652	2964	java/io/UnsupportedEncodingException
    //   1658	1663	2964	java/io/UnsupportedEncodingException
    //   1681	1716	2964	java/io/UnsupportedEncodingException
    //   1722	1727	2964	java/io/UnsupportedEncodingException
    //   1745	1780	2964	java/io/UnsupportedEncodingException
    //   1786	1791	2964	java/io/UnsupportedEncodingException
    //   1809	1844	2964	java/io/UnsupportedEncodingException
    //   1850	1855	2964	java/io/UnsupportedEncodingException
    //   1873	1908	2964	java/io/UnsupportedEncodingException
    //   1914	1919	2964	java/io/UnsupportedEncodingException
    //   1937	1972	2964	java/io/UnsupportedEncodingException
    //   1978	1983	2964	java/io/UnsupportedEncodingException
    //   2001	2036	2964	java/io/UnsupportedEncodingException
    //   2042	2047	2964	java/io/UnsupportedEncodingException
    //   2065	2100	2964	java/io/UnsupportedEncodingException
    //   2106	2111	2964	java/io/UnsupportedEncodingException
    //   2129	2164	2964	java/io/UnsupportedEncodingException
    //   2170	2175	2964	java/io/UnsupportedEncodingException
    //   2193	2228	2964	java/io/UnsupportedEncodingException
    //   2234	2239	2964	java/io/UnsupportedEncodingException
    //   2257	2292	2964	java/io/UnsupportedEncodingException
    //   2298	2303	2964	java/io/UnsupportedEncodingException
    //   2321	2356	2964	java/io/UnsupportedEncodingException
    //   2362	2367	2964	java/io/UnsupportedEncodingException
    //   2385	2420	2964	java/io/UnsupportedEncodingException
    //   2426	2431	2964	java/io/UnsupportedEncodingException
    //   2449	2484	2964	java/io/UnsupportedEncodingException
    //   2490	2495	2964	java/io/UnsupportedEncodingException
    //   2513	2548	2964	java/io/UnsupportedEncodingException
    //   2554	2559	2964	java/io/UnsupportedEncodingException
    //   2577	2612	2964	java/io/UnsupportedEncodingException
    //   2618	2623	2964	java/io/UnsupportedEncodingException
    //   2641	2676	2964	java/io/UnsupportedEncodingException
    //   2682	2687	2964	java/io/UnsupportedEncodingException
    //   2705	2740	2964	java/io/UnsupportedEncodingException
    //   2746	2751	2964	java/io/UnsupportedEncodingException
    //   2769	2804	2964	java/io/UnsupportedEncodingException
    //   2810	2815	2964	java/io/UnsupportedEncodingException
    //   2833	2868	2964	java/io/UnsupportedEncodingException
    //   2874	2879	2964	java/io/UnsupportedEncodingException
    //   2897	2932	2964	java/io/UnsupportedEncodingException
    //   2938	2943	2964	java/io/UnsupportedEncodingException
    //   228	259	2982	java/io/UnsupportedEncodingException
    //   283	315	2982	java/io/UnsupportedEncodingException
    //   380	412	2982	java/io/UnsupportedEncodingException
    //   968	1000	2982	java/io/UnsupportedEncodingException
    //   1106	1138	2982	java/io/UnsupportedEncodingException
    //   1367	1399	2982	java/io/UnsupportedEncodingException
    //   1423	1455	2982	java/io/UnsupportedEncodingException
    //   1479	1484	2982	java/io/UnsupportedEncodingException
    //   1542	1547	2982	java/io/UnsupportedEncodingException
    //   1605	1611	2982	java/io/UnsupportedEncodingException
    //   1669	1675	2982	java/io/UnsupportedEncodingException
    //   1733	1739	2982	java/io/UnsupportedEncodingException
    //   1797	1803	2982	java/io/UnsupportedEncodingException
    //   1861	1867	2982	java/io/UnsupportedEncodingException
    //   1925	1931	2982	java/io/UnsupportedEncodingException
    //   1989	1995	2982	java/io/UnsupportedEncodingException
    //   2053	2059	2982	java/io/UnsupportedEncodingException
    //   2117	2123	2982	java/io/UnsupportedEncodingException
    //   2181	2187	2982	java/io/UnsupportedEncodingException
    //   2245	2251	2982	java/io/UnsupportedEncodingException
    //   2309	2315	2982	java/io/UnsupportedEncodingException
    //   2373	2379	2982	java/io/UnsupportedEncodingException
    //   2437	2443	2982	java/io/UnsupportedEncodingException
    //   2501	2507	2982	java/io/UnsupportedEncodingException
    //   2565	2571	2982	java/io/UnsupportedEncodingException
    //   2629	2635	2982	java/io/UnsupportedEncodingException
    //   2693	2699	2982	java/io/UnsupportedEncodingException
    //   2757	2763	2982	java/io/UnsupportedEncodingException
    //   2821	2827	2982	java/io/UnsupportedEncodingException
    //   2885	2891	2982	java/io/UnsupportedEncodingException
  }
  
  public static void genCrossword4()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 4;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "椎间盘突出".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        int i10;
        byte[] arrayOfByte7;
        int i11;
        int i12;
        byte[] arrayOfByte8;
        int i13;
        byte[] arrayOfByte9;
        int i14;
        byte[] arrayOfByte10;
        int i15;
        byte[] arrayOfByte11;
        int i16;
        int i17;
        byte[] arrayOfByte12;
        int i18;
        byte[] arrayOfByte13;
        int i19;
        byte[] arrayOfByte14;
        int i20;
        byte[] arrayOfByte15;
        int i21;
        byte[] arrayOfByte16;
        int i22;
        int i23;
        byte[] arrayOfByte17;
        int i24;
        byte[] arrayOfByte18;
        int i25;
        byte[] arrayOfByte19;
        int i26;
        byte[] arrayOfByte20;
        int i27;
        int i28;
        byte[] arrayOfByte21;
        int i29;
        byte[] arrayOfByte22;
        int i30;
        byte[] arrayOfByte23;
        int i31;
        byte[] arrayOfByte24;
        int i32;
        byte[] arrayOfByte25;
        int i33;
        byte[] arrayOfByte26;
        int i34;
        int i35;
        byte[] arrayOfByte27;
        int i36;
        byte[] arrayOfByte28;
        int i37;
        byte[] arrayOfByte29;
        int i38;
        byte[] arrayOfByte30;
        int i39;
        byte[] arrayOfByte31;
        int i40;
        byte[] arrayOfByte32;
        int i41;
        byte[] arrayOfByte33;
        int i42;
        byte[] arrayOfByte34;
        int i43;
        byte[] arrayOfByte35;
        int i44;
        byte[] arrayOfByte36;
        int i45;
        byte[] arrayOfByte37;
        int i46;
        byte[] arrayOfByte38;
        int i47;
        byte[] arrayOfByte39;
        int i48;
        byte[] arrayOfByte40;
        int i49;
        byte[] arrayOfByte41;
        int i50;
        byte[] arrayOfByte42;
        int i51;
        byte[] arrayOfByte43;
        int i52;
        byte[] arrayOfByte44;
        int i53;
        byte[] arrayOfByte45;
        int i54;
        byte[] arrayOfByte46;
        int i55;
        byte[] arrayOfByte47;
        int i56;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "蓝".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte5 = "一".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
          i8 = i3 + arrayOfByte5.length;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte6 = "古".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i4, arrayOfByte6.length);
          i9 = arrayOfByte6.length;
          i10 = i4 + i9;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte7 = "言师采药去亚洲开发银行".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i4, arrayOfByte7.length);
          i11 = arrayOfByte7.length;
          i12 = i4 + i11;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte8 = "和".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i3, arrayOfByte8.length);
          i13 = i3 + arrayOfByte8.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte9 = "不历".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i14 = i3 + arrayOfByte9.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte10 = "天".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i15 = i3 + arrayOfByte10.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte11 = "不".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i4, arrayOfByte11.length);
          i16 = arrayOfByte11.length;
          i17 = i4 + i16;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte12 = "复山崩地裂".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i18 = i3 + arrayOfByte12.length;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte13 = "一去不复返大".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i19 = i3 + arrayOfByte13.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte14 = "魏".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i20 = i3 + arrayOfByte14.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte15 = "活".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i21 = i3 + arrayOfByte15.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte16 = "面壁".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i4, arrayOfByte16.length);
          i22 = arrayOfByte16.length;
          i23 = i4 + i22;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          arrayOfByte17 = "蜀".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i24 = i3 + arrayOfByte17.length;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte18 = "节约白面".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i25 = i3 + arrayOfByte18.length;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          arrayOfByte19 = "周吴郑王".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i26 = i3 + arrayOfByte19.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte20 = "定".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i4, arrayOfByte20.length);
          i27 = arrayOfByte20.length;
          i28 = i4 + i27;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte21 = "俱".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i29 = i3 + arrayOfByte21.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte22 = "恩".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i30 = i3 + arrayOfByte22.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte23 = "成".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i31 = i3 + arrayOfByte23.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte24 = "俗回到未来".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i32 = i3 + arrayOfByte24.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte25 = "功到自然成".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i3, arrayOfByte25.length);
          i33 = i3 + arrayOfByte25.length;
          i3 = i33 + 1;
          arrayOfByte1[i33] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte26 = "由于椎间盘内外力平衡失调产生的一种病".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i4, arrayOfByte26.length);
          i34 = arrayOfByte26.length;
          i35 = i4 + i34;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 2;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte27 = "古神话故事，用斧头砍开天地".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i36 = i3 + arrayOfByte27.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte28 = "八仙之一".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i37 = i3 + arrayOfByte28.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte29 = "形容荆轲的一句话".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i38 = i3 + arrayOfByte29.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 15;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte30 = "“松下问童子”的下一句".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i39 = i3 + arrayOfByte30.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 15;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "说的是一套，做的又是另外一套".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i40 = i3 + arrayOfByte31.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte32 = "亚太地区一个国际性的发展金融机构，总部设在菲律宾首都马尼拉".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i41 = i3 + arrayOfByte32.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "俄罗斯大帝".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i42 = i3 + arrayOfByte33.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 40;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte34 = "非常大的灾难".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i43 = i3 + arrayOfByte34.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 45;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte35 = "形容荆轲的一句话".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i44 = i3 + arrayOfByte35.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 48;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "西方一节日".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i45 = i3 + arrayOfByte36.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 54;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte37 = "三国的另外一种说法".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i46 = i3 + arrayOfByte37.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 61;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte38 = "和尚一种惩罚方式".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i47 = i3 + arrayOfByte38.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 61;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte39 = "各方面都能照顾到，没有遗漏疏忽。也指虽然照顾到各方面，但一般化".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i48 = i3 + arrayOfByte39.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 68;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte40 = "浪费的反意".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i49 = i3 + arrayOfByte40.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 69;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "指事物的名称或社会习惯往往是由人民群众经过长期社会实践而确定或形成".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i50 = i3 + arrayOfByte41.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 70;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "由小麦制成".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i51 = i3 + arrayOfByte42.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 73;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "百家姓中一句".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i52 = i3 + arrayOfByte43.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 73;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "曾任国家总理".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i53 = i3 + arrayOfByte44.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 75;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "收复台湾的民族英雄".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i54 = i3 + arrayOfByte45.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 90;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "美国电影".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i55 = i3 + arrayOfByte46.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 95;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "只要努力必然成功".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i56 = i3 + arrayOfByte47.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/4.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword5()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 5;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "胡天八月即飞雪".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        byte[] arrayOfByte7;
        int i10;
        byte[] arrayOfByte8;
        int i11;
        int i12;
        byte[] arrayOfByte9;
        int i13;
        byte[] arrayOfByte10;
        int i14;
        byte[] arrayOfByte11;
        int i15;
        byte[] arrayOfByte12;
        int i16;
        int i17;
        byte[] arrayOfByte13;
        int i18;
        byte[] arrayOfByte14;
        int i19;
        byte[] arrayOfByte15;
        int i20;
        int i21;
        byte[] arrayOfByte16;
        int i22;
        int i23;
        byte[] arrayOfByte17;
        int i24;
        byte[] arrayOfByte18;
        int i25;
        int i26;
        byte[] arrayOfByte19;
        int i27;
        byte[] arrayOfByte20;
        int i28;
        byte[] arrayOfByte21;
        int i29;
        byte[] arrayOfByte22;
        int i30;
        byte[] arrayOfByte23;
        int i31;
        byte[] arrayOfByte24;
        int i32;
        byte[] arrayOfByte25;
        int i33;
        int i34;
        byte[] arrayOfByte26;
        int i35;
        byte[] arrayOfByte27;
        int i36;
        byte[] arrayOfByte28;
        int i37;
        byte[] arrayOfByte29;
        int i38;
        byte[] arrayOfByte30;
        int i39;
        byte[] arrayOfByte31;
        int i40;
        byte[] arrayOfByte32;
        int i41;
        byte[] arrayOfByte33;
        int i42;
        byte[] arrayOfByte34;
        int i43;
        byte[] arrayOfByte35;
        int i44;
        byte[] arrayOfByte36;
        int i45;
        byte[] arrayOfByte37;
        int i46;
        byte[] arrayOfByte38;
        int i47;
        byte[] arrayOfByte39;
        int i48;
        byte[] arrayOfByte40;
        int i49;
        byte[] arrayOfByte41;
        int i50;
        byte[] arrayOfByte42;
        int i51;
        byte[] arrayOfByte43;
        int i52;
        byte[] arrayOfByte44;
        int i53;
        byte[] arrayOfByte45;
        int i54;
        byte[] arrayOfByte46;
        int i55;
        byte[] arrayOfByte47;
        int i56;
        byte[] arrayOfByte48;
        int i57;
        byte[] arrayOfByte49;
        int i58;
        byte[] arrayOfByte50;
        int i59;
        byte[] arrayOfByte51;
        int i60;
        byte[] arrayOfByte52;
        int i61;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "阿".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte5 = "老".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
          i8 = i3 + arrayOfByte5.length;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          arrayOfByte6 = "狐".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i9 = i3 + arrayOfByte6.length;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          arrayOfByte7 = "诺贝尔老好人".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
          i10 = i3 + arrayOfByte7.length;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte8 = "外".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i4, arrayOfByte8.length);
          i11 = arrayOfByte8.length;
          i12 = i4 + i11;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte9 = "亚".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i3, arrayOfByte9.length);
          i13 = i3 + arrayOfByte9.length;
          i3 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte10 = "卑挝".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i14 = i3 + arrayOfByte10.length;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte11 = "不老的传说".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i15 = i3 + arrayOfByte11.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte12 = "斯".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i4, arrayOfByte12.length);
          i16 = arrayOfByte12.length;
          i17 = i4 + i16;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          arrayOfByte13 = "可可".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i18 = i3 + arrayOfByte13.length;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte14 = "确".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i19 = i3 + arrayOfByte14.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte15 = "五指山".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i4, arrayOfByte15.length);
          i20 = arrayOfByte15.length;
          i21 = i4 + i20;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte16 = "貌".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i4, arrayOfByte16.length);
          i22 = arrayOfByte16.length;
          i23 = i4 + i22;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          arrayOfByte17 = "良性循环".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i24 = i3 + arrayOfByte17.length;
          i3 = i24 + 1;
          arrayOfByte1[i24] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte18 = "拔刀相助".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i4, arrayOfByte18.length);
          i25 = arrayOfByte18.length;
          i26 = i4 + i25;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte19 = "夜猫子".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i3, arrayOfByte19.length);
          i27 = i3 + arrayOfByte19.length;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte20 = "学".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i28 = i3 + arrayOfByte20.length;
          i3 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte21 = "风凉话".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i29 = i3 + arrayOfByte21.length;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte22 = "不".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i3, arrayOfByte22.length);
          i30 = i3 + arrayOfByte22.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte23 = "紫白金青".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i31 = i3 + arrayOfByte23.length;
          i3 = i31 + 1;
          arrayOfByte1[i31] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte24 = "失学红日".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i3, arrayOfByte24.length);
          i32 = i3 + arrayOfByte24.length;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte25 = "海上花列传".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i4, arrayOfByte25.length);
          i33 = arrayOfByte25.length;
          i34 = i4 + i33;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte26 = "岑参诗一句".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i35 = i3 + arrayOfByte26.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 3;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte27 = "媒人的别称".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i3, arrayOfByte27.length);
          i36 = i3 + arrayOfByte27.length;
          i3 = i36 + 1;
          arrayOfByte1[i36] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 5;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte28 = "金庸小说名".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i37 = i3 + arrayOfByte28.length;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte29 = "欧洲名山".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i38 = i3 + arrayOfByte29.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 17;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte30 = "瑞典著名化学家".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i3, arrayOfByte30.length);
          i39 = i3 + arrayOfByte30.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 17;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "《圣经》中用于挽救地球物种的船名".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i40 = i3 + arrayOfByte31.length;
          i3 = i40 + 1;
          arrayOfByte1[i40] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte32 = "缺乏原则的厚道人".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i41 = i3 + arrayOfByte32.length;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "亚洲国家名".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i42 = i3 + arrayOfByte33.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 22;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "俗语，不能凭外表评价人".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i43 = i3 + arrayOfByte34.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 32;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte35 = "张学友歌名".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i44 = i3 + arrayOfByte35.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 34;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "一种布料".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i45 = i3 + arrayOfByte36.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 41;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "一种经济作物".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i46 = i3 + arrayOfByte37.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 47;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte38 = "中国海南名山".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i47 = i3 + arrayOfByte38.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 47;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte39 = "中央电视台体育节目".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i48 = i3 + arrayOfByte39.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 54;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte40 = "具备好结果的变化过程".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i49 = i3 + arrayOfByte40.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 60;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "路见不平的下一句".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i50 = i3 + arrayOfByte41.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 63;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte42 = "用来资助贫困学生的专用款项".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i51 = i3 + arrayOfByte42.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 67;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "俗指擅长熬夜的人".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i52 = i3 + arrayOfByte43.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 69;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "《三字经》一句，指家长在教育中的责任".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i53 = i3 + arrayOfByte44.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 75;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte45 = "用于打击别人的嘲讽言语".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i54 = i3 + arrayOfByte45.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 81;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "金庸笔下明教的四大法王".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i55 = i3 + arrayOfByte46.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 81;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "冯小宁导演的电影".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i56 = i3 + arrayOfByte47.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 84;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "中国西部省份".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i57 = i3 + arrayOfByte48.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 88;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "因各种原因无法接受教育".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i58 = i3 + arrayOfByte49.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 88;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "没人继承而没有延续".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i59 = i3 + arrayOfByte50.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 90;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "李克勤歌名".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i60 = i3 + arrayOfByte51.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 94;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "清代谴责小说一".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i61 = i3 + arrayOfByte52.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/5.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  /* Error */
  public static void genCrossword6()
  {
    // Byte code:
    //   0: sipush 4096
    //   3: newarray <illegal type>
    //   5: astore_0
    //   6: ldc 43
    //   8: invokevirtual 49	java/lang/String:getBytes	()[B
    //   11: astore_1
    //   12: aload_1
    //   13: iconst_0
    //   14: aload_0
    //   15: iconst_0
    //   16: aload_1
    //   17: arraylength
    //   18: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   21: aload_1
    //   22: arraylength
    //   23: istore_2
    //   24: iload_2
    //   25: iconst_1
    //   26: iadd
    //   27: istore_3
    //   28: aload_0
    //   29: iload_2
    //   30: iconst_0
    //   31: bastore
    //   32: iload_3
    //   33: iconst_1
    //   34: iadd
    //   35: istore 4
    //   37: aload_0
    //   38: iload_3
    //   39: iconst_0
    //   40: bastore
    //   41: iload 4
    //   43: iconst_1
    //   44: iadd
    //   45: istore 5
    //   47: aload_0
    //   48: iload 4
    //   50: iconst_0
    //   51: bastore
    //   52: iload 5
    //   54: iconst_1
    //   55: iadd
    //   56: istore 6
    //   58: aload_0
    //   59: iload 5
    //   61: bipush 6
    //   63: bastore
    //   64: iload 6
    //   66: iconst_1
    //   67: iadd
    //   68: istore 7
    //   70: aload_0
    //   71: iload 6
    //   73: iconst_1
    //   74: bastore
    //   75: iload 7
    //   77: iconst_1
    //   78: iadd
    //   79: istore 8
    //   81: aload_0
    //   82: iload 7
    //   84: bipush 10
    //   86: bastore
    //   87: iload 8
    //   89: iconst_1
    //   90: iadd
    //   91: istore 9
    //   93: aload_0
    //   94: iload 8
    //   96: bipush 10
    //   98: bastore
    //   99: ldc_w 2666
    //   102: ldc 59
    //   104: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   107: astore 13
    //   109: aload 13
    //   111: iconst_0
    //   112: aload_0
    //   113: iload 9
    //   115: aload 13
    //   117: arraylength
    //   118: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   121: iload 9
    //   123: aload 13
    //   125: arraylength
    //   126: iadd
    //   127: istore 14
    //   129: iload 14
    //   131: iconst_1
    //   132: iadd
    //   133: istore 9
    //   135: aload_0
    //   136: iload 14
    //   138: iconst_0
    //   139: bastore
    //   140: ldc_w 2668
    //   143: ldc 59
    //   145: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   148: astore 15
    //   150: aload 15
    //   152: iconst_0
    //   153: aload_0
    //   154: iload 9
    //   156: aload 15
    //   158: arraylength
    //   159: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   162: iload 9
    //   164: aload 15
    //   166: arraylength
    //   167: iadd
    //   168: istore 16
    //   170: iload 16
    //   172: iconst_1
    //   173: iadd
    //   174: istore 9
    //   176: aload_0
    //   177: iload 16
    //   179: iconst_0
    //   180: bastore
    //   181: ldc_w 2670
    //   184: ldc 59
    //   186: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   189: astore 17
    //   191: aload 17
    //   193: iconst_0
    //   194: aload_0
    //   195: iload 9
    //   197: aload 17
    //   199: arraylength
    //   200: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   203: iload 9
    //   205: aload 17
    //   207: arraylength
    //   208: iadd
    //   209: istore 18
    //   211: iload 18
    //   213: iconst_1
    //   214: iadd
    //   215: istore 9
    //   217: aload_0
    //   218: iload 18
    //   220: iconst_0
    //   221: bastore
    //   222: iload 9
    //   224: iconst_1
    //   225: iadd
    //   226: istore 12
    //   228: aload_0
    //   229: iload 9
    //   231: iconst_0
    //   232: bastore
    //   233: ldc_w 2672
    //   236: ldc 59
    //   238: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   241: astore 20
    //   243: aload 20
    //   245: iconst_0
    //   246: aload_0
    //   247: iload 12
    //   249: aload 20
    //   251: arraylength
    //   252: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   255: aload 20
    //   257: arraylength
    //   258: istore 21
    //   260: iload 12
    //   262: iload 21
    //   264: iadd
    //   265: istore 22
    //   267: iload 22
    //   269: iconst_1
    //   270: iadd
    //   271: istore 9
    //   273: aload_0
    //   274: iload 22
    //   276: iconst_0
    //   277: bastore
    //   278: iload 9
    //   280: iconst_1
    //   281: iadd
    //   282: istore 12
    //   284: aload_0
    //   285: iload 9
    //   287: iconst_0
    //   288: bastore
    //   289: iload 12
    //   291: iconst_1
    //   292: iadd
    //   293: istore 9
    //   295: aload_0
    //   296: iload 12
    //   298: iconst_0
    //   299: bastore
    //   300: iload 9
    //   302: iconst_1
    //   303: iadd
    //   304: istore 12
    //   306: aload_0
    //   307: iload 9
    //   309: iconst_0
    //   310: bastore
    //   311: iload 12
    //   313: iconst_1
    //   314: iadd
    //   315: istore 9
    //   317: aload_0
    //   318: iload 12
    //   320: iconst_0
    //   321: bastore
    //   322: ldc_w 2674
    //   325: ldc 59
    //   327: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   330: astore 23
    //   332: aload 23
    //   334: iconst_0
    //   335: aload_0
    //   336: iload 9
    //   338: aload 23
    //   340: arraylength
    //   341: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   344: iload 9
    //   346: aload 23
    //   348: arraylength
    //   349: iadd
    //   350: istore 24
    //   352: iload 24
    //   354: iconst_1
    //   355: iadd
    //   356: istore 9
    //   358: aload_0
    //   359: iload 24
    //   361: iconst_0
    //   362: bastore
    //   363: ldc_w 2676
    //   366: ldc 59
    //   368: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   371: astore 25
    //   373: aload 25
    //   375: iconst_0
    //   376: aload_0
    //   377: iload 9
    //   379: aload 25
    //   381: arraylength
    //   382: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   385: iload 9
    //   387: aload 25
    //   389: arraylength
    //   390: iadd
    //   391: istore 26
    //   393: iload 26
    //   395: iconst_1
    //   396: iadd
    //   397: istore 9
    //   399: aload_0
    //   400: iload 26
    //   402: iconst_0
    //   403: bastore
    //   404: iload 9
    //   406: iconst_1
    //   407: iadd
    //   408: istore 12
    //   410: aload_0
    //   411: iload 9
    //   413: iconst_0
    //   414: bastore
    //   415: iload 12
    //   417: iconst_1
    //   418: iadd
    //   419: istore 9
    //   421: aload_0
    //   422: iload 12
    //   424: iconst_0
    //   425: bastore
    //   426: ldc_w 2678
    //   429: ldc 59
    //   431: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   434: astore 27
    //   436: aload 27
    //   438: iconst_0
    //   439: aload_0
    //   440: iload 9
    //   442: aload 27
    //   444: arraylength
    //   445: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   448: iload 9
    //   450: aload 27
    //   452: arraylength
    //   453: iadd
    //   454: istore 28
    //   456: iload 28
    //   458: iconst_1
    //   459: iadd
    //   460: istore 9
    //   462: aload_0
    //   463: iload 28
    //   465: iconst_0
    //   466: bastore
    //   467: ldc_w 2680
    //   470: ldc 59
    //   472: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   475: astore 29
    //   477: aload 29
    //   479: iconst_0
    //   480: aload_0
    //   481: iload 9
    //   483: aload 29
    //   485: arraylength
    //   486: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   489: iload 9
    //   491: aload 29
    //   493: arraylength
    //   494: iadd
    //   495: istore 30
    //   497: iload 30
    //   499: iconst_1
    //   500: iadd
    //   501: istore 9
    //   503: aload_0
    //   504: iload 30
    //   506: iconst_0
    //   507: bastore
    //   508: ldc_w 2682
    //   511: ldc 59
    //   513: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   516: astore 31
    //   518: aload 31
    //   520: iconst_0
    //   521: aload_0
    //   522: iload 9
    //   524: aload 31
    //   526: arraylength
    //   527: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   530: iload 9
    //   532: aload 31
    //   534: arraylength
    //   535: iadd
    //   536: istore 32
    //   538: iload 32
    //   540: iconst_1
    //   541: iadd
    //   542: istore 9
    //   544: aload_0
    //   545: iload 32
    //   547: iconst_0
    //   548: bastore
    //   549: iload 9
    //   551: iconst_1
    //   552: iadd
    //   553: istore 12
    //   555: aload_0
    //   556: iload 9
    //   558: iconst_0
    //   559: bastore
    //   560: iload 12
    //   562: iconst_1
    //   563: iadd
    //   564: istore 9
    //   566: aload_0
    //   567: iload 12
    //   569: iconst_0
    //   570: bastore
    //   571: iload 9
    //   573: iconst_1
    //   574: iadd
    //   575: istore 12
    //   577: aload_0
    //   578: iload 9
    //   580: iconst_0
    //   581: bastore
    //   582: iload 12
    //   584: iconst_1
    //   585: iadd
    //   586: istore 9
    //   588: aload_0
    //   589: iload 12
    //   591: iconst_0
    //   592: bastore
    //   593: ldc_w 2228
    //   596: ldc 59
    //   598: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   601: astore 33
    //   603: aload 33
    //   605: iconst_0
    //   606: aload_0
    //   607: iload 9
    //   609: aload 33
    //   611: arraylength
    //   612: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   615: iload 9
    //   617: aload 33
    //   619: arraylength
    //   620: iadd
    //   621: istore 34
    //   623: iload 34
    //   625: iconst_1
    //   626: iadd
    //   627: istore 9
    //   629: aload_0
    //   630: iload 34
    //   632: iconst_0
    //   633: bastore
    //   634: ldc_w 2684
    //   637: ldc 59
    //   639: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   642: astore 35
    //   644: aload 35
    //   646: iconst_0
    //   647: aload_0
    //   648: iload 9
    //   650: aload 35
    //   652: arraylength
    //   653: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   656: iload 9
    //   658: aload 35
    //   660: arraylength
    //   661: iadd
    //   662: istore 36
    //   664: iload 36
    //   666: iconst_1
    //   667: iadd
    //   668: istore 9
    //   670: aload_0
    //   671: iload 36
    //   673: iconst_0
    //   674: bastore
    //   675: ldc_w 2686
    //   678: ldc 59
    //   680: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   683: astore 37
    //   685: aload 37
    //   687: iconst_0
    //   688: aload_0
    //   689: iload 9
    //   691: aload 37
    //   693: arraylength
    //   694: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   697: iload 9
    //   699: aload 37
    //   701: arraylength
    //   702: iadd
    //   703: istore 38
    //   705: iload 38
    //   707: iconst_1
    //   708: iadd
    //   709: istore 9
    //   711: aload_0
    //   712: iload 38
    //   714: iconst_0
    //   715: bastore
    //   716: iload 9
    //   718: iconst_1
    //   719: iadd
    //   720: istore 12
    //   722: aload_0
    //   723: iload 9
    //   725: iconst_0
    //   726: bastore
    //   727: iload 12
    //   729: iconst_1
    //   730: iadd
    //   731: istore 9
    //   733: aload_0
    //   734: iload 12
    //   736: iconst_0
    //   737: bastore
    //   738: ldc_w 2688
    //   741: ldc 59
    //   743: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   746: astore 39
    //   748: aload 39
    //   750: iconst_0
    //   751: aload_0
    //   752: iload 9
    //   754: aload 39
    //   756: arraylength
    //   757: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   760: iload 9
    //   762: aload 39
    //   764: arraylength
    //   765: iadd
    //   766: istore 40
    //   768: iload 40
    //   770: iconst_1
    //   771: iadd
    //   772: istore 9
    //   774: aload_0
    //   775: iload 40
    //   777: iconst_0
    //   778: bastore
    //   779: ldc_w 2690
    //   782: ldc 59
    //   784: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   787: astore 41
    //   789: aload 41
    //   791: iconst_0
    //   792: aload_0
    //   793: iload 9
    //   795: aload 41
    //   797: arraylength
    //   798: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   801: iload 9
    //   803: aload 41
    //   805: arraylength
    //   806: iadd
    //   807: istore 42
    //   809: iload 42
    //   811: iconst_1
    //   812: iadd
    //   813: istore 9
    //   815: aload_0
    //   816: iload 42
    //   818: iconst_0
    //   819: bastore
    //   820: iload 9
    //   822: iconst_1
    //   823: iadd
    //   824: istore 12
    //   826: aload_0
    //   827: iload 9
    //   829: iconst_0
    //   830: bastore
    //   831: ldc_w 2692
    //   834: ldc 59
    //   836: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   839: astore 43
    //   841: aload 43
    //   843: iconst_0
    //   844: aload_0
    //   845: iload 12
    //   847: aload 43
    //   849: arraylength
    //   850: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   853: aload 43
    //   855: arraylength
    //   856: istore 44
    //   858: iload 12
    //   860: iload 44
    //   862: iadd
    //   863: istore 45
    //   865: iload 45
    //   867: iconst_1
    //   868: iadd
    //   869: istore 9
    //   871: aload_0
    //   872: iload 45
    //   874: iconst_0
    //   875: bastore
    //   876: iload 9
    //   878: iconst_1
    //   879: iadd
    //   880: istore 12
    //   882: aload_0
    //   883: iload 9
    //   885: iconst_0
    //   886: bastore
    //   887: ldc_w 1177
    //   890: ldc 59
    //   892: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   895: astore 46
    //   897: aload 46
    //   899: iconst_0
    //   900: aload_0
    //   901: iload 12
    //   903: aload 46
    //   905: arraylength
    //   906: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   909: aload 46
    //   911: arraylength
    //   912: istore 47
    //   914: iload 12
    //   916: iload 47
    //   918: iadd
    //   919: istore 48
    //   921: iload 48
    //   923: iconst_1
    //   924: iadd
    //   925: istore 9
    //   927: aload_0
    //   928: iload 48
    //   930: iconst_0
    //   931: bastore
    //   932: ldc_w 2694
    //   935: ldc 59
    //   937: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   940: astore 49
    //   942: aload 49
    //   944: iconst_0
    //   945: aload_0
    //   946: iload 9
    //   948: aload 49
    //   950: arraylength
    //   951: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   954: iload 9
    //   956: aload 49
    //   958: arraylength
    //   959: iadd
    //   960: istore 50
    //   962: iload 50
    //   964: iconst_1
    //   965: iadd
    //   966: istore 9
    //   968: aload_0
    //   969: iload 50
    //   971: iconst_0
    //   972: bastore
    //   973: ldc_w 2696
    //   976: ldc 59
    //   978: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   981: astore 51
    //   983: aload 51
    //   985: iconst_0
    //   986: aload_0
    //   987: iload 9
    //   989: aload 51
    //   991: arraylength
    //   992: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   995: iload 9
    //   997: aload 51
    //   999: arraylength
    //   1000: iadd
    //   1001: istore 52
    //   1003: iload 52
    //   1005: iconst_1
    //   1006: iadd
    //   1007: istore 9
    //   1009: aload_0
    //   1010: iload 52
    //   1012: iconst_0
    //   1013: bastore
    //   1014: ldc_w 2698
    //   1017: ldc 59
    //   1019: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1022: astore 53
    //   1024: aload 53
    //   1026: iconst_0
    //   1027: aload_0
    //   1028: iload 9
    //   1030: aload 53
    //   1032: arraylength
    //   1033: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1036: iload 9
    //   1038: aload 53
    //   1040: arraylength
    //   1041: iadd
    //   1042: istore 54
    //   1044: iload 54
    //   1046: iconst_1
    //   1047: iadd
    //   1048: istore 9
    //   1050: aload_0
    //   1051: iload 54
    //   1053: iconst_0
    //   1054: bastore
    //   1055: iload 9
    //   1057: iconst_1
    //   1058: iadd
    //   1059: istore 12
    //   1061: aload_0
    //   1062: iload 9
    //   1064: iconst_0
    //   1065: bastore
    //   1066: iload 12
    //   1068: iconst_1
    //   1069: iadd
    //   1070: istore 9
    //   1072: aload_0
    //   1073: iload 12
    //   1075: iconst_0
    //   1076: bastore
    //   1077: ldc_w 2700
    //   1080: ldc 59
    //   1082: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1085: astore 55
    //   1087: aload 55
    //   1089: iconst_0
    //   1090: aload_0
    //   1091: iload 9
    //   1093: aload 55
    //   1095: arraylength
    //   1096: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1099: iload 9
    //   1101: aload 55
    //   1103: arraylength
    //   1104: iadd
    //   1105: istore 56
    //   1107: iload 56
    //   1109: iconst_1
    //   1110: iadd
    //   1111: istore 9
    //   1113: aload_0
    //   1114: iload 56
    //   1116: iconst_0
    //   1117: bastore
    //   1118: ldc_w 2702
    //   1121: ldc 59
    //   1123: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1126: astore 57
    //   1128: aload 57
    //   1130: iconst_0
    //   1131: aload_0
    //   1132: iload 9
    //   1134: aload 57
    //   1136: arraylength
    //   1137: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1140: iload 9
    //   1142: aload 57
    //   1144: arraylength
    //   1145: iadd
    //   1146: istore 58
    //   1148: iload 58
    //   1150: iconst_1
    //   1151: iadd
    //   1152: istore 9
    //   1154: aload_0
    //   1155: iload 58
    //   1157: iconst_0
    //   1158: bastore
    //   1159: iload 9
    //   1161: iconst_1
    //   1162: iadd
    //   1163: istore 12
    //   1165: aload_0
    //   1166: iload 9
    //   1168: iconst_0
    //   1169: bastore
    //   1170: iload 12
    //   1172: iconst_1
    //   1173: iadd
    //   1174: istore 9
    //   1176: aload_0
    //   1177: iload 12
    //   1179: iconst_0
    //   1180: bastore
    //   1181: ldc_w 625
    //   1184: ldc 59
    //   1186: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1189: astore 59
    //   1191: aload 59
    //   1193: iconst_0
    //   1194: aload_0
    //   1195: iload 9
    //   1197: aload 59
    //   1199: arraylength
    //   1200: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1203: iload 9
    //   1205: aload 59
    //   1207: arraylength
    //   1208: iadd
    //   1209: istore 60
    //   1211: iload 60
    //   1213: iconst_1
    //   1214: iadd
    //   1215: istore 9
    //   1217: aload_0
    //   1218: iload 60
    //   1220: iconst_0
    //   1221: bastore
    //   1222: ldc_w 2704
    //   1225: ldc 59
    //   1227: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1230: astore 61
    //   1232: aload 61
    //   1234: iconst_0
    //   1235: aload_0
    //   1236: iload 9
    //   1238: aload 61
    //   1240: arraylength
    //   1241: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1244: iload 9
    //   1246: aload 61
    //   1248: arraylength
    //   1249: iadd
    //   1250: istore 62
    //   1252: iload 62
    //   1254: iconst_1
    //   1255: iadd
    //   1256: istore 9
    //   1258: aload_0
    //   1259: iload 62
    //   1261: iconst_0
    //   1262: bastore
    //   1263: ldc_w 2706
    //   1266: ldc 59
    //   1268: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1271: astore 63
    //   1273: aload 63
    //   1275: iconst_0
    //   1276: aload_0
    //   1277: iload 9
    //   1279: aload 63
    //   1281: arraylength
    //   1282: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1285: iload 9
    //   1287: aload 63
    //   1289: arraylength
    //   1290: iadd
    //   1291: istore 64
    //   1293: iload 64
    //   1295: iconst_1
    //   1296: iadd
    //   1297: istore 9
    //   1299: aload_0
    //   1300: iload 64
    //   1302: iconst_0
    //   1303: bastore
    //   1304: iload 9
    //   1306: iconst_1
    //   1307: iadd
    //   1308: istore 12
    //   1310: aload_0
    //   1311: iload 9
    //   1313: iconst_1
    //   1314: bastore
    //   1315: ldc_w 2708
    //   1318: ldc 59
    //   1320: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1323: astore 65
    //   1325: aload 65
    //   1327: iconst_0
    //   1328: aload_0
    //   1329: iload 12
    //   1331: aload 65
    //   1333: arraylength
    //   1334: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1337: aload 65
    //   1339: arraylength
    //   1340: istore 66
    //   1342: iload 12
    //   1344: iload 66
    //   1346: iadd
    //   1347: istore 67
    //   1349: iload 67
    //   1351: iconst_1
    //   1352: iadd
    //   1353: istore 9
    //   1355: aload_0
    //   1356: iload 67
    //   1358: iconst_0
    //   1359: bastore
    //   1360: iload 9
    //   1362: iconst_1
    //   1363: iadd
    //   1364: istore 12
    //   1366: aload_0
    //   1367: iload 9
    //   1369: iconst_0
    //   1370: bastore
    //   1371: iload 12
    //   1373: iconst_1
    //   1374: iadd
    //   1375: istore 9
    //   1377: aload_0
    //   1378: iload 12
    //   1380: iconst_2
    //   1381: bastore
    //   1382: ldc_w 2710
    //   1385: ldc 59
    //   1387: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1390: astore 68
    //   1392: aload 68
    //   1394: iconst_0
    //   1395: aload_0
    //   1396: iload 9
    //   1398: aload 68
    //   1400: arraylength
    //   1401: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1404: iload 9
    //   1406: aload 68
    //   1408: arraylength
    //   1409: iadd
    //   1410: istore 69
    //   1412: iload 69
    //   1414: iconst_1
    //   1415: iadd
    //   1416: istore 9
    //   1418: aload_0
    //   1419: iload 69
    //   1421: iconst_0
    //   1422: bastore
    //   1423: iload 9
    //   1425: iconst_1
    //   1426: iadd
    //   1427: istore 12
    //   1429: aload_0
    //   1430: iload 9
    //   1432: iconst_3
    //   1433: bastore
    //   1434: iload 12
    //   1436: iconst_1
    //   1437: iadd
    //   1438: istore 9
    //   1440: aload_0
    //   1441: iload 12
    //   1443: iconst_2
    //   1444: bastore
    //   1445: ldc_w 2712
    //   1448: ldc 59
    //   1450: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1453: astore 70
    //   1455: aload 70
    //   1457: iconst_0
    //   1458: aload_0
    //   1459: iload 9
    //   1461: aload 70
    //   1463: arraylength
    //   1464: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1467: iload 9
    //   1469: aload 70
    //   1471: arraylength
    //   1472: iadd
    //   1473: istore 71
    //   1475: iload 71
    //   1477: iconst_1
    //   1478: iadd
    //   1479: istore 9
    //   1481: aload_0
    //   1482: iload 71
    //   1484: iconst_0
    //   1485: bastore
    //   1486: iload 9
    //   1488: iconst_1
    //   1489: iadd
    //   1490: istore 12
    //   1492: aload_0
    //   1493: iload 9
    //   1495: iconst_5
    //   1496: bastore
    //   1497: iload 12
    //   1499: iconst_1
    //   1500: iadd
    //   1501: istore 9
    //   1503: aload_0
    //   1504: iload 12
    //   1506: iconst_1
    //   1507: bastore
    //   1508: ldc_w 2714
    //   1511: ldc 59
    //   1513: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1516: astore 72
    //   1518: aload 72
    //   1520: iconst_0
    //   1521: aload_0
    //   1522: iload 9
    //   1524: aload 72
    //   1526: arraylength
    //   1527: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1530: iload 9
    //   1532: aload 72
    //   1534: arraylength
    //   1535: iadd
    //   1536: istore 73
    //   1538: iload 73
    //   1540: iconst_1
    //   1541: iadd
    //   1542: istore 9
    //   1544: aload_0
    //   1545: iload 73
    //   1547: iconst_0
    //   1548: bastore
    //   1549: iload 9
    //   1551: iconst_1
    //   1552: iadd
    //   1553: istore 12
    //   1555: aload_0
    //   1556: iload 9
    //   1558: iconst_5
    //   1559: bastore
    //   1560: iload 12
    //   1562: iconst_1
    //   1563: iadd
    //   1564: istore 9
    //   1566: aload_0
    //   1567: iload 12
    //   1569: iconst_2
    //   1570: bastore
    //   1571: ldc_w 2716
    //   1574: ldc 59
    //   1576: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1579: astore 74
    //   1581: aload 74
    //   1583: iconst_0
    //   1584: aload_0
    //   1585: iload 9
    //   1587: aload 74
    //   1589: arraylength
    //   1590: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1593: iload 9
    //   1595: aload 74
    //   1597: arraylength
    //   1598: iadd
    //   1599: istore 75
    //   1601: iload 75
    //   1603: iconst_1
    //   1604: iadd
    //   1605: istore 9
    //   1607: aload_0
    //   1608: iload 75
    //   1610: iconst_0
    //   1611: bastore
    //   1612: iload 9
    //   1614: iconst_1
    //   1615: iadd
    //   1616: istore 12
    //   1618: aload_0
    //   1619: iload 9
    //   1621: bipush 13
    //   1623: bastore
    //   1624: iload 12
    //   1626: iconst_1
    //   1627: iadd
    //   1628: istore 9
    //   1630: aload_0
    //   1631: iload 12
    //   1633: iconst_1
    //   1634: bastore
    //   1635: ldc_w 2718
    //   1638: ldc 59
    //   1640: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1643: astore 76
    //   1645: aload 76
    //   1647: iconst_0
    //   1648: aload_0
    //   1649: iload 9
    //   1651: aload 76
    //   1653: arraylength
    //   1654: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1657: iload 9
    //   1659: aload 76
    //   1661: arraylength
    //   1662: iadd
    //   1663: istore 77
    //   1665: iload 77
    //   1667: iconst_1
    //   1668: iadd
    //   1669: istore 9
    //   1671: aload_0
    //   1672: iload 77
    //   1674: iconst_0
    //   1675: bastore
    //   1676: iload 9
    //   1678: iconst_1
    //   1679: iadd
    //   1680: istore 12
    //   1682: aload_0
    //   1683: iload 9
    //   1685: bipush 21
    //   1687: bastore
    //   1688: iload 12
    //   1690: iconst_1
    //   1691: iadd
    //   1692: istore 9
    //   1694: aload_0
    //   1695: iload 12
    //   1697: iconst_2
    //   1698: bastore
    //   1699: ldc_w 2720
    //   1702: ldc 59
    //   1704: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1707: astore 78
    //   1709: aload 78
    //   1711: iconst_0
    //   1712: aload_0
    //   1713: iload 9
    //   1715: aload 78
    //   1717: arraylength
    //   1718: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1721: iload 9
    //   1723: aload 78
    //   1725: arraylength
    //   1726: iadd
    //   1727: istore 79
    //   1729: iload 79
    //   1731: iconst_1
    //   1732: iadd
    //   1733: istore 9
    //   1735: aload_0
    //   1736: iload 79
    //   1738: iconst_0
    //   1739: bastore
    //   1740: iload 9
    //   1742: iconst_1
    //   1743: iadd
    //   1744: istore 12
    //   1746: aload_0
    //   1747: iload 9
    //   1749: bipush 27
    //   1751: bastore
    //   1752: iload 12
    //   1754: iconst_1
    //   1755: iadd
    //   1756: istore 9
    //   1758: aload_0
    //   1759: iload 12
    //   1761: iconst_1
    //   1762: bastore
    //   1763: ldc_w 2722
    //   1766: ldc 59
    //   1768: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1771: astore 80
    //   1773: aload 80
    //   1775: iconst_0
    //   1776: aload_0
    //   1777: iload 9
    //   1779: aload 80
    //   1781: arraylength
    //   1782: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1785: iload 9
    //   1787: aload 80
    //   1789: arraylength
    //   1790: iadd
    //   1791: istore 81
    //   1793: iload 81
    //   1795: iconst_1
    //   1796: iadd
    //   1797: istore 9
    //   1799: aload_0
    //   1800: iload 81
    //   1802: iconst_0
    //   1803: bastore
    //   1804: iload 9
    //   1806: iconst_1
    //   1807: iadd
    //   1808: istore 12
    //   1810: aload_0
    //   1811: iload 9
    //   1813: bipush 27
    //   1815: bastore
    //   1816: iload 12
    //   1818: iconst_1
    //   1819: iadd
    //   1820: istore 9
    //   1822: aload_0
    //   1823: iload 12
    //   1825: iconst_2
    //   1826: bastore
    //   1827: ldc_w 2724
    //   1830: ldc 59
    //   1832: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1835: astore 82
    //   1837: aload 82
    //   1839: iconst_0
    //   1840: aload_0
    //   1841: iload 9
    //   1843: aload 82
    //   1845: arraylength
    //   1846: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1849: iload 9
    //   1851: aload 82
    //   1853: arraylength
    //   1854: iadd
    //   1855: istore 83
    //   1857: iload 83
    //   1859: iconst_1
    //   1860: iadd
    //   1861: istore 9
    //   1863: aload_0
    //   1864: iload 83
    //   1866: iconst_0
    //   1867: bastore
    //   1868: iload 9
    //   1870: iconst_1
    //   1871: iadd
    //   1872: istore 12
    //   1874: aload_0
    //   1875: iload 9
    //   1877: bipush 30
    //   1879: bastore
    //   1880: iload 12
    //   1882: iconst_1
    //   1883: iadd
    //   1884: istore 9
    //   1886: aload_0
    //   1887: iload 12
    //   1889: iconst_1
    //   1890: bastore
    //   1891: ldc_w 2726
    //   1894: ldc 59
    //   1896: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1899: astore 84
    //   1901: aload 84
    //   1903: iconst_0
    //   1904: aload_0
    //   1905: iload 9
    //   1907: aload 84
    //   1909: arraylength
    //   1910: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1913: iload 9
    //   1915: aload 84
    //   1917: arraylength
    //   1918: iadd
    //   1919: istore 85
    //   1921: iload 85
    //   1923: iconst_1
    //   1924: iadd
    //   1925: istore 9
    //   1927: aload_0
    //   1928: iload 85
    //   1930: iconst_0
    //   1931: bastore
    //   1932: iload 9
    //   1934: iconst_1
    //   1935: iadd
    //   1936: istore 12
    //   1938: aload_0
    //   1939: iload 9
    //   1941: bipush 30
    //   1943: bastore
    //   1944: iload 12
    //   1946: iconst_1
    //   1947: iadd
    //   1948: istore 9
    //   1950: aload_0
    //   1951: iload 12
    //   1953: iconst_2
    //   1954: bastore
    //   1955: ldc_w 2728
    //   1958: ldc 59
    //   1960: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   1963: astore 86
    //   1965: aload 86
    //   1967: iconst_0
    //   1968: aload_0
    //   1969: iload 9
    //   1971: aload 86
    //   1973: arraylength
    //   1974: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1977: iload 9
    //   1979: aload 86
    //   1981: arraylength
    //   1982: iadd
    //   1983: istore 87
    //   1985: iload 87
    //   1987: iconst_1
    //   1988: iadd
    //   1989: istore 9
    //   1991: aload_0
    //   1992: iload 87
    //   1994: iconst_0
    //   1995: bastore
    //   1996: iload 9
    //   1998: iconst_1
    //   1999: iadd
    //   2000: istore 12
    //   2002: aload_0
    //   2003: iload 9
    //   2005: bipush 36
    //   2007: bastore
    //   2008: iload 12
    //   2010: iconst_1
    //   2011: iadd
    //   2012: istore 9
    //   2014: aload_0
    //   2015: iload 12
    //   2017: iconst_2
    //   2018: bastore
    //   2019: ldc_w 2730
    //   2022: ldc 59
    //   2024: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2027: astore 88
    //   2029: aload 88
    //   2031: iconst_0
    //   2032: aload_0
    //   2033: iload 9
    //   2035: aload 88
    //   2037: arraylength
    //   2038: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2041: iload 9
    //   2043: aload 88
    //   2045: arraylength
    //   2046: iadd
    //   2047: istore 89
    //   2049: iload 89
    //   2051: iconst_1
    //   2052: iadd
    //   2053: istore 9
    //   2055: aload_0
    //   2056: iload 89
    //   2058: iconst_0
    //   2059: bastore
    //   2060: iload 9
    //   2062: iconst_1
    //   2063: iadd
    //   2064: istore 12
    //   2066: aload_0
    //   2067: iload 9
    //   2069: bipush 39
    //   2071: bastore
    //   2072: iload 12
    //   2074: iconst_1
    //   2075: iadd
    //   2076: istore 9
    //   2078: aload_0
    //   2079: iload 12
    //   2081: iconst_2
    //   2082: bastore
    //   2083: ldc_w 2732
    //   2086: ldc 59
    //   2088: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2091: astore 90
    //   2093: aload 90
    //   2095: iconst_0
    //   2096: aload_0
    //   2097: iload 9
    //   2099: aload 90
    //   2101: arraylength
    //   2102: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2105: iload 9
    //   2107: aload 90
    //   2109: arraylength
    //   2110: iadd
    //   2111: istore 91
    //   2113: iload 91
    //   2115: iconst_1
    //   2116: iadd
    //   2117: istore 9
    //   2119: aload_0
    //   2120: iload 91
    //   2122: iconst_0
    //   2123: bastore
    //   2124: iload 9
    //   2126: iconst_1
    //   2127: iadd
    //   2128: istore 12
    //   2130: aload_0
    //   2131: iload 9
    //   2133: bipush 48
    //   2135: bastore
    //   2136: iload 12
    //   2138: iconst_1
    //   2139: iadd
    //   2140: istore 9
    //   2142: aload_0
    //   2143: iload 12
    //   2145: iconst_1
    //   2146: bastore
    //   2147: ldc_w 2734
    //   2150: ldc 59
    //   2152: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2155: astore 92
    //   2157: aload 92
    //   2159: iconst_0
    //   2160: aload_0
    //   2161: iload 9
    //   2163: aload 92
    //   2165: arraylength
    //   2166: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2169: iload 9
    //   2171: aload 92
    //   2173: arraylength
    //   2174: iadd
    //   2175: istore 93
    //   2177: iload 93
    //   2179: iconst_1
    //   2180: iadd
    //   2181: istore 9
    //   2183: aload_0
    //   2184: iload 93
    //   2186: iconst_0
    //   2187: bastore
    //   2188: iload 9
    //   2190: iconst_1
    //   2191: iadd
    //   2192: istore 12
    //   2194: aload_0
    //   2195: iload 9
    //   2197: bipush 48
    //   2199: bastore
    //   2200: iload 12
    //   2202: iconst_1
    //   2203: iadd
    //   2204: istore 9
    //   2206: aload_0
    //   2207: iload 12
    //   2209: iconst_2
    //   2210: bastore
    //   2211: ldc_w 2736
    //   2214: ldc 59
    //   2216: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2219: astore 94
    //   2221: aload 94
    //   2223: iconst_0
    //   2224: aload_0
    //   2225: iload 9
    //   2227: aload 94
    //   2229: arraylength
    //   2230: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2233: iload 9
    //   2235: aload 94
    //   2237: arraylength
    //   2238: iadd
    //   2239: istore 95
    //   2241: iload 95
    //   2243: iconst_1
    //   2244: iadd
    //   2245: istore 9
    //   2247: aload_0
    //   2248: iload 95
    //   2250: iconst_0
    //   2251: bastore
    //   2252: iload 9
    //   2254: iconst_1
    //   2255: iadd
    //   2256: istore 12
    //   2258: aload_0
    //   2259: iload 9
    //   2261: bipush 52
    //   2263: bastore
    //   2264: iload 12
    //   2266: iconst_1
    //   2267: iadd
    //   2268: istore 9
    //   2270: aload_0
    //   2271: iload 12
    //   2273: iconst_1
    //   2274: bastore
    //   2275: ldc_w 2738
    //   2278: ldc 59
    //   2280: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2283: astore 96
    //   2285: aload 96
    //   2287: iconst_0
    //   2288: aload_0
    //   2289: iload 9
    //   2291: aload 96
    //   2293: arraylength
    //   2294: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2297: iload 9
    //   2299: aload 96
    //   2301: arraylength
    //   2302: iadd
    //   2303: istore 97
    //   2305: iload 97
    //   2307: iconst_1
    //   2308: iadd
    //   2309: istore 9
    //   2311: aload_0
    //   2312: iload 97
    //   2314: iconst_0
    //   2315: bastore
    //   2316: iload 9
    //   2318: iconst_1
    //   2319: iadd
    //   2320: istore 12
    //   2322: aload_0
    //   2323: iload 9
    //   2325: bipush 52
    //   2327: bastore
    //   2328: iload 12
    //   2330: iconst_1
    //   2331: iadd
    //   2332: istore 9
    //   2334: aload_0
    //   2335: iload 12
    //   2337: iconst_2
    //   2338: bastore
    //   2339: ldc_w 2740
    //   2342: ldc 59
    //   2344: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2347: astore 98
    //   2349: aload 98
    //   2351: iconst_0
    //   2352: aload_0
    //   2353: iload 9
    //   2355: aload 98
    //   2357: arraylength
    //   2358: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2361: iload 9
    //   2363: aload 98
    //   2365: arraylength
    //   2366: iadd
    //   2367: istore 99
    //   2369: iload 99
    //   2371: iconst_1
    //   2372: iadd
    //   2373: istore 9
    //   2375: aload_0
    //   2376: iload 99
    //   2378: iconst_0
    //   2379: bastore
    //   2380: iload 9
    //   2382: iconst_1
    //   2383: iadd
    //   2384: istore 12
    //   2386: aload_0
    //   2387: iload 9
    //   2389: bipush 60
    //   2391: bastore
    //   2392: iload 12
    //   2394: iconst_1
    //   2395: iadd
    //   2396: istore 9
    //   2398: aload_0
    //   2399: iload 12
    //   2401: iconst_1
    //   2402: bastore
    //   2403: ldc_w 2742
    //   2406: ldc 59
    //   2408: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2411: astore 100
    //   2413: aload 100
    //   2415: iconst_0
    //   2416: aload_0
    //   2417: iload 9
    //   2419: aload 100
    //   2421: arraylength
    //   2422: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2425: iload 9
    //   2427: aload 100
    //   2429: arraylength
    //   2430: iadd
    //   2431: istore 101
    //   2433: iload 101
    //   2435: iconst_1
    //   2436: iadd
    //   2437: istore 9
    //   2439: aload_0
    //   2440: iload 101
    //   2442: iconst_0
    //   2443: bastore
    //   2444: iload 9
    //   2446: iconst_1
    //   2447: iadd
    //   2448: istore 12
    //   2450: aload_0
    //   2451: iload 9
    //   2453: bipush 61
    //   2455: bastore
    //   2456: iload 12
    //   2458: iconst_1
    //   2459: iadd
    //   2460: istore 9
    //   2462: aload_0
    //   2463: iload 12
    //   2465: iconst_2
    //   2466: bastore
    //   2467: ldc_w 2744
    //   2470: ldc 59
    //   2472: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2475: astore 102
    //   2477: aload 102
    //   2479: iconst_0
    //   2480: aload_0
    //   2481: iload 9
    //   2483: aload 102
    //   2485: arraylength
    //   2486: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2489: iload 9
    //   2491: aload 102
    //   2493: arraylength
    //   2494: iadd
    //   2495: istore 103
    //   2497: iload 103
    //   2499: iconst_1
    //   2500: iadd
    //   2501: istore 9
    //   2503: aload_0
    //   2504: iload 103
    //   2506: iconst_0
    //   2507: bastore
    //   2508: iload 9
    //   2510: iconst_1
    //   2511: iadd
    //   2512: istore 12
    //   2514: aload_0
    //   2515: iload 9
    //   2517: bipush 65
    //   2519: bastore
    //   2520: iload 12
    //   2522: iconst_1
    //   2523: iadd
    //   2524: istore 9
    //   2526: aload_0
    //   2527: iload 12
    //   2529: iconst_1
    //   2530: bastore
    //   2531: ldc_w 2746
    //   2534: ldc 59
    //   2536: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2539: astore 104
    //   2541: aload 104
    //   2543: iconst_0
    //   2544: aload_0
    //   2545: iload 9
    //   2547: aload 104
    //   2549: arraylength
    //   2550: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2553: iload 9
    //   2555: aload 104
    //   2557: arraylength
    //   2558: iadd
    //   2559: istore 105
    //   2561: iload 105
    //   2563: iconst_1
    //   2564: iadd
    //   2565: istore 9
    //   2567: aload_0
    //   2568: iload 105
    //   2570: iconst_0
    //   2571: bastore
    //   2572: iload 9
    //   2574: iconst_1
    //   2575: iadd
    //   2576: istore 12
    //   2578: aload_0
    //   2579: iload 9
    //   2581: bipush 65
    //   2583: bastore
    //   2584: iload 12
    //   2586: iconst_1
    //   2587: iadd
    //   2588: istore 9
    //   2590: aload_0
    //   2591: iload 12
    //   2593: iconst_2
    //   2594: bastore
    //   2595: ldc_w 2748
    //   2598: ldc 59
    //   2600: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2603: astore 106
    //   2605: aload 106
    //   2607: iconst_0
    //   2608: aload_0
    //   2609: iload 9
    //   2611: aload 106
    //   2613: arraylength
    //   2614: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2617: iload 9
    //   2619: aload 106
    //   2621: arraylength
    //   2622: iadd
    //   2623: istore 107
    //   2625: iload 107
    //   2627: iconst_1
    //   2628: iadd
    //   2629: istore 9
    //   2631: aload_0
    //   2632: iload 107
    //   2634: iconst_0
    //   2635: bastore
    //   2636: iload 9
    //   2638: iconst_1
    //   2639: iadd
    //   2640: istore 12
    //   2642: aload_0
    //   2643: iload 9
    //   2645: bipush 67
    //   2647: bastore
    //   2648: iload 12
    //   2650: iconst_1
    //   2651: iadd
    //   2652: istore 9
    //   2654: aload_0
    //   2655: iload 12
    //   2657: iconst_2
    //   2658: bastore
    //   2659: ldc_w 2750
    //   2662: ldc 59
    //   2664: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2667: astore 108
    //   2669: aload 108
    //   2671: iconst_0
    //   2672: aload_0
    //   2673: iload 9
    //   2675: aload 108
    //   2677: arraylength
    //   2678: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2681: iload 9
    //   2683: aload 108
    //   2685: arraylength
    //   2686: iadd
    //   2687: istore 109
    //   2689: iload 109
    //   2691: iconst_1
    //   2692: iadd
    //   2693: istore 9
    //   2695: aload_0
    //   2696: iload 109
    //   2698: iconst_0
    //   2699: bastore
    //   2700: iload 9
    //   2702: iconst_1
    //   2703: iadd
    //   2704: istore 12
    //   2706: aload_0
    //   2707: iload 9
    //   2709: bipush 73
    //   2711: bastore
    //   2712: iload 12
    //   2714: iconst_1
    //   2715: iadd
    //   2716: istore 9
    //   2718: aload_0
    //   2719: iload 12
    //   2721: iconst_2
    //   2722: bastore
    //   2723: ldc_w 2752
    //   2726: ldc 59
    //   2728: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2731: astore 110
    //   2733: aload 110
    //   2735: iconst_0
    //   2736: aload_0
    //   2737: iload 9
    //   2739: aload 110
    //   2741: arraylength
    //   2742: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2745: iload 9
    //   2747: aload 110
    //   2749: arraylength
    //   2750: iadd
    //   2751: istore 111
    //   2753: iload 111
    //   2755: iconst_1
    //   2756: iadd
    //   2757: istore 9
    //   2759: aload_0
    //   2760: iload 111
    //   2762: iconst_0
    //   2763: bastore
    //   2764: iload 9
    //   2766: iconst_1
    //   2767: iadd
    //   2768: istore 12
    //   2770: aload_0
    //   2771: iload 9
    //   2773: bipush 81
    //   2775: bastore
    //   2776: iload 12
    //   2778: iconst_1
    //   2779: iadd
    //   2780: istore 9
    //   2782: aload_0
    //   2783: iload 12
    //   2785: iconst_1
    //   2786: bastore
    //   2787: ldc_w 2754
    //   2790: ldc 59
    //   2792: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2795: astore 112
    //   2797: aload 112
    //   2799: iconst_0
    //   2800: aload_0
    //   2801: iload 9
    //   2803: aload 112
    //   2805: arraylength
    //   2806: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2809: iload 9
    //   2811: aload 112
    //   2813: arraylength
    //   2814: iadd
    //   2815: istore 113
    //   2817: iload 113
    //   2819: iconst_1
    //   2820: iadd
    //   2821: istore 9
    //   2823: aload_0
    //   2824: iload 113
    //   2826: iconst_0
    //   2827: bastore
    //   2828: iload 9
    //   2830: iconst_1
    //   2831: iadd
    //   2832: istore 12
    //   2834: aload_0
    //   2835: iload 9
    //   2837: bipush 87
    //   2839: bastore
    //   2840: iload 12
    //   2842: iconst_1
    //   2843: iadd
    //   2844: istore 9
    //   2846: aload_0
    //   2847: iload 12
    //   2849: iconst_1
    //   2850: bastore
    //   2851: ldc_w 2756
    //   2854: ldc 59
    //   2856: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2859: astore 114
    //   2861: aload 114
    //   2863: iconst_0
    //   2864: aload_0
    //   2865: iload 9
    //   2867: aload 114
    //   2869: arraylength
    //   2870: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2873: iload 9
    //   2875: aload 114
    //   2877: arraylength
    //   2878: iadd
    //   2879: istore 115
    //   2881: iload 115
    //   2883: iconst_1
    //   2884: iadd
    //   2885: istore 9
    //   2887: aload_0
    //   2888: iload 115
    //   2890: iconst_0
    //   2891: bastore
    //   2892: iload 9
    //   2894: iconst_1
    //   2895: iadd
    //   2896: istore 12
    //   2898: aload_0
    //   2899: iload 9
    //   2901: bipush 89
    //   2903: bastore
    //   2904: iload 12
    //   2906: iconst_1
    //   2907: iadd
    //   2908: istore 9
    //   2910: aload_0
    //   2911: iload 12
    //   2913: iconst_2
    //   2914: bastore
    //   2915: ldc_w 2758
    //   2918: ldc 59
    //   2920: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2923: astore 116
    //   2925: aload 116
    //   2927: iconst_0
    //   2928: aload_0
    //   2929: iload 9
    //   2931: aload 116
    //   2933: arraylength
    //   2934: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   2937: iload 9
    //   2939: aload 116
    //   2941: arraylength
    //   2942: iadd
    //   2943: istore 117
    //   2945: iload 117
    //   2947: iconst_1
    //   2948: iadd
    //   2949: istore 9
    //   2951: aload_0
    //   2952: iload 117
    //   2954: iconst_0
    //   2955: bastore
    //   2956: iload 9
    //   2958: iconst_1
    //   2959: iadd
    //   2960: istore 12
    //   2962: aload_0
    //   2963: iload 9
    //   2965: bipush 90
    //   2967: bastore
    //   2968: iload 12
    //   2970: iconst_1
    //   2971: iadd
    //   2972: istore 9
    //   2974: aload_0
    //   2975: iload 12
    //   2977: iconst_1
    //   2978: bastore
    //   2979: ldc_w 2760
    //   2982: ldc 59
    //   2984: invokevirtual 62	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   2987: astore 118
    //   2989: aload 118
    //   2991: iconst_0
    //   2992: aload_0
    //   2993: iload 9
    //   2995: aload 118
    //   2997: arraylength
    //   2998: invokestatic 55	java/lang/System:arraycopy	(Ljava/lang/Object;ILjava/lang/Object;II)V
    //   3001: iload 9
    //   3003: aload 118
    //   3005: arraylength
    //   3006: iadd
    //   3007: istore 119
    //   3009: iload 119
    //   3011: iconst_1
    //   3012: iadd
    //   3013: istore 9
    //   3015: aload_0
    //   3016: iload 119
    //   3018: iconst_0
    //   3019: bastore
    //   3020: iload 9
    //   3022: istore 12
    //   3024: new 168	java/io/File
    //   3027: dup
    //   3028: ldc_w 2762
    //   3031: invokespecial 173	java/io/File:<init>	(Ljava/lang/String;)V
    //   3034: aload_0
    //   3035: iload 12
    //   3037: invokestatic 179	net/oicp/anya/Utils:writeBytes2File	(Ljava/io/File;[BI)V
    //   3040: return
    //   3041: astore 10
    //   3043: aload 10
    //   3045: astore 11
    //   3047: iload 9
    //   3049: istore 12
    //   3051: aload 11
    //   3053: invokevirtual 182	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   3056: goto -32 -> 3024
    //   3059: astore 19
    //   3061: aload 19
    //   3063: astore 11
    //   3065: goto -14 -> 3051
    // Local variable table:
    //   start	length	slot	name	signature
    //   5	3030	0	arrayOfByte1	byte[]
    //   11	11	1	arrayOfByte2	byte[]
    //   23	7	2	i	int
    //   27	12	3	j	int
    //   35	14	4	k	int
    //   45	15	5	m	int
    //   56	16	6	n	int
    //   68	15	7	i1	int
    //   79	16	8	i2	int
    //   91	2957	9	i3	int
    //   3041	3	10	localUnsupportedEncodingException1	UnsupportedEncodingException
    //   3045	19	11	localObject	Object
    //   226	2824	12	i4	int
    //   107	17	13	arrayOfByte3	byte[]
    //   127	10	14	i5	int
    //   148	17	15	arrayOfByte4	byte[]
    //   168	10	16	i6	int
    //   189	17	17	arrayOfByte5	byte[]
    //   209	10	18	i7	int
    //   3059	3	19	localUnsupportedEncodingException2	UnsupportedEncodingException
    //   241	15	20	arrayOfByte6	byte[]
    //   258	7	21	i8	int
    //   265	10	22	i9	int
    //   330	17	23	arrayOfByte7	byte[]
    //   350	10	24	i10	int
    //   371	17	25	arrayOfByte8	byte[]
    //   391	10	26	i11	int
    //   434	17	27	arrayOfByte9	byte[]
    //   454	10	28	i12	int
    //   475	17	29	arrayOfByte10	byte[]
    //   495	10	30	i13	int
    //   516	17	31	arrayOfByte11	byte[]
    //   536	10	32	i14	int
    //   601	17	33	arrayOfByte12	byte[]
    //   621	10	34	i15	int
    //   642	17	35	arrayOfByte13	byte[]
    //   662	10	36	i16	int
    //   683	17	37	arrayOfByte14	byte[]
    //   703	10	38	i17	int
    //   746	17	39	arrayOfByte15	byte[]
    //   766	10	40	i18	int
    //   787	17	41	arrayOfByte16	byte[]
    //   807	10	42	i19	int
    //   839	15	43	arrayOfByte17	byte[]
    //   856	7	44	i20	int
    //   863	10	45	i21	int
    //   895	15	46	arrayOfByte18	byte[]
    //   912	7	47	i22	int
    //   919	10	48	i23	int
    //   940	17	49	arrayOfByte19	byte[]
    //   960	10	50	i24	int
    //   981	17	51	arrayOfByte20	byte[]
    //   1001	10	52	i25	int
    //   1022	17	53	arrayOfByte21	byte[]
    //   1042	10	54	i26	int
    //   1085	17	55	arrayOfByte22	byte[]
    //   1105	10	56	i27	int
    //   1126	17	57	arrayOfByte23	byte[]
    //   1146	10	58	i28	int
    //   1189	17	59	arrayOfByte24	byte[]
    //   1209	10	60	i29	int
    //   1230	17	61	arrayOfByte25	byte[]
    //   1250	10	62	i30	int
    //   1271	17	63	arrayOfByte26	byte[]
    //   1291	10	64	i31	int
    //   1323	15	65	arrayOfByte27	byte[]
    //   1340	7	66	i32	int
    //   1347	10	67	i33	int
    //   1390	17	68	arrayOfByte28	byte[]
    //   1410	10	69	i34	int
    //   1453	17	70	arrayOfByte29	byte[]
    //   1473	10	71	i35	int
    //   1516	17	72	arrayOfByte30	byte[]
    //   1536	10	73	i36	int
    //   1579	17	74	arrayOfByte31	byte[]
    //   1599	10	75	i37	int
    //   1643	17	76	arrayOfByte32	byte[]
    //   1663	10	77	i38	int
    //   1707	17	78	arrayOfByte33	byte[]
    //   1727	10	79	i39	int
    //   1771	17	80	arrayOfByte34	byte[]
    //   1791	10	81	i40	int
    //   1835	17	82	arrayOfByte35	byte[]
    //   1855	10	83	i41	int
    //   1899	17	84	arrayOfByte36	byte[]
    //   1919	10	85	i42	int
    //   1963	17	86	arrayOfByte37	byte[]
    //   1983	10	87	i43	int
    //   2027	17	88	arrayOfByte38	byte[]
    //   2047	10	89	i44	int
    //   2091	17	90	arrayOfByte39	byte[]
    //   2111	10	91	i45	int
    //   2155	17	92	arrayOfByte40	byte[]
    //   2175	10	93	i46	int
    //   2219	17	94	arrayOfByte41	byte[]
    //   2239	10	95	i47	int
    //   2283	17	96	arrayOfByte42	byte[]
    //   2303	10	97	i48	int
    //   2347	17	98	arrayOfByte43	byte[]
    //   2367	10	99	i49	int
    //   2411	17	100	arrayOfByte44	byte[]
    //   2431	10	101	i50	int
    //   2475	17	102	arrayOfByte45	byte[]
    //   2495	10	103	i51	int
    //   2539	17	104	arrayOfByte46	byte[]
    //   2559	10	105	i52	int
    //   2603	17	106	arrayOfByte47	byte[]
    //   2623	10	107	i53	int
    //   2667	17	108	arrayOfByte48	byte[]
    //   2687	10	109	i54	int
    //   2731	17	110	arrayOfByte49	byte[]
    //   2751	10	111	i55	int
    //   2795	17	112	arrayOfByte50	byte[]
    //   2815	10	113	i56	int
    //   2859	17	114	arrayOfByte51	byte[]
    //   2879	10	115	i57	int
    //   2923	17	116	arrayOfByte52	byte[]
    //   2943	10	117	i58	int
    //   2987	17	118	arrayOfByte53	byte[]
    //   3007	10	119	i59	int
    // Exception table:
    //   from	to	target	type
    //   99	129	3041	java/io/UnsupportedEncodingException
    //   135	170	3041	java/io/UnsupportedEncodingException
    //   176	211	3041	java/io/UnsupportedEncodingException
    //   217	222	3041	java/io/UnsupportedEncodingException
    //   273	278	3041	java/io/UnsupportedEncodingException
    //   295	300	3041	java/io/UnsupportedEncodingException
    //   317	352	3041	java/io/UnsupportedEncodingException
    //   358	393	3041	java/io/UnsupportedEncodingException
    //   399	404	3041	java/io/UnsupportedEncodingException
    //   421	456	3041	java/io/UnsupportedEncodingException
    //   462	497	3041	java/io/UnsupportedEncodingException
    //   503	538	3041	java/io/UnsupportedEncodingException
    //   544	549	3041	java/io/UnsupportedEncodingException
    //   566	571	3041	java/io/UnsupportedEncodingException
    //   588	623	3041	java/io/UnsupportedEncodingException
    //   629	664	3041	java/io/UnsupportedEncodingException
    //   670	705	3041	java/io/UnsupportedEncodingException
    //   711	716	3041	java/io/UnsupportedEncodingException
    //   733	768	3041	java/io/UnsupportedEncodingException
    //   774	809	3041	java/io/UnsupportedEncodingException
    //   815	820	3041	java/io/UnsupportedEncodingException
    //   871	876	3041	java/io/UnsupportedEncodingException
    //   927	962	3041	java/io/UnsupportedEncodingException
    //   968	1003	3041	java/io/UnsupportedEncodingException
    //   1009	1044	3041	java/io/UnsupportedEncodingException
    //   1050	1055	3041	java/io/UnsupportedEncodingException
    //   1072	1107	3041	java/io/UnsupportedEncodingException
    //   1113	1148	3041	java/io/UnsupportedEncodingException
    //   1154	1159	3041	java/io/UnsupportedEncodingException
    //   1176	1211	3041	java/io/UnsupportedEncodingException
    //   1217	1252	3041	java/io/UnsupportedEncodingException
    //   1258	1293	3041	java/io/UnsupportedEncodingException
    //   1299	1304	3041	java/io/UnsupportedEncodingException
    //   1355	1360	3041	java/io/UnsupportedEncodingException
    //   1377	1412	3041	java/io/UnsupportedEncodingException
    //   1418	1423	3041	java/io/UnsupportedEncodingException
    //   1440	1475	3041	java/io/UnsupportedEncodingException
    //   1481	1486	3041	java/io/UnsupportedEncodingException
    //   1503	1538	3041	java/io/UnsupportedEncodingException
    //   1544	1549	3041	java/io/UnsupportedEncodingException
    //   1566	1601	3041	java/io/UnsupportedEncodingException
    //   1607	1612	3041	java/io/UnsupportedEncodingException
    //   1630	1665	3041	java/io/UnsupportedEncodingException
    //   1671	1676	3041	java/io/UnsupportedEncodingException
    //   1694	1729	3041	java/io/UnsupportedEncodingException
    //   1735	1740	3041	java/io/UnsupportedEncodingException
    //   1758	1793	3041	java/io/UnsupportedEncodingException
    //   1799	1804	3041	java/io/UnsupportedEncodingException
    //   1822	1857	3041	java/io/UnsupportedEncodingException
    //   1863	1868	3041	java/io/UnsupportedEncodingException
    //   1886	1921	3041	java/io/UnsupportedEncodingException
    //   1927	1932	3041	java/io/UnsupportedEncodingException
    //   1950	1985	3041	java/io/UnsupportedEncodingException
    //   1991	1996	3041	java/io/UnsupportedEncodingException
    //   2014	2049	3041	java/io/UnsupportedEncodingException
    //   2055	2060	3041	java/io/UnsupportedEncodingException
    //   2078	2113	3041	java/io/UnsupportedEncodingException
    //   2119	2124	3041	java/io/UnsupportedEncodingException
    //   2142	2177	3041	java/io/UnsupportedEncodingException
    //   2183	2188	3041	java/io/UnsupportedEncodingException
    //   2206	2241	3041	java/io/UnsupportedEncodingException
    //   2247	2252	3041	java/io/UnsupportedEncodingException
    //   2270	2305	3041	java/io/UnsupportedEncodingException
    //   2311	2316	3041	java/io/UnsupportedEncodingException
    //   2334	2369	3041	java/io/UnsupportedEncodingException
    //   2375	2380	3041	java/io/UnsupportedEncodingException
    //   2398	2433	3041	java/io/UnsupportedEncodingException
    //   2439	2444	3041	java/io/UnsupportedEncodingException
    //   2462	2497	3041	java/io/UnsupportedEncodingException
    //   2503	2508	3041	java/io/UnsupportedEncodingException
    //   2526	2561	3041	java/io/UnsupportedEncodingException
    //   2567	2572	3041	java/io/UnsupportedEncodingException
    //   2590	2625	3041	java/io/UnsupportedEncodingException
    //   2631	2636	3041	java/io/UnsupportedEncodingException
    //   2654	2689	3041	java/io/UnsupportedEncodingException
    //   2695	2700	3041	java/io/UnsupportedEncodingException
    //   2718	2753	3041	java/io/UnsupportedEncodingException
    //   2759	2764	3041	java/io/UnsupportedEncodingException
    //   2782	2817	3041	java/io/UnsupportedEncodingException
    //   2823	2828	3041	java/io/UnsupportedEncodingException
    //   2846	2881	3041	java/io/UnsupportedEncodingException
    //   2887	2892	3041	java/io/UnsupportedEncodingException
    //   2910	2945	3041	java/io/UnsupportedEncodingException
    //   2951	2956	3041	java/io/UnsupportedEncodingException
    //   2974	3009	3041	java/io/UnsupportedEncodingException
    //   3015	3020	3041	java/io/UnsupportedEncodingException
    //   228	260	3059	java/io/UnsupportedEncodingException
    //   284	289	3059	java/io/UnsupportedEncodingException
    //   306	311	3059	java/io/UnsupportedEncodingException
    //   410	415	3059	java/io/UnsupportedEncodingException
    //   555	560	3059	java/io/UnsupportedEncodingException
    //   577	582	3059	java/io/UnsupportedEncodingException
    //   722	727	3059	java/io/UnsupportedEncodingException
    //   826	858	3059	java/io/UnsupportedEncodingException
    //   882	914	3059	java/io/UnsupportedEncodingException
    //   1061	1066	3059	java/io/UnsupportedEncodingException
    //   1165	1170	3059	java/io/UnsupportedEncodingException
    //   1310	1342	3059	java/io/UnsupportedEncodingException
    //   1366	1371	3059	java/io/UnsupportedEncodingException
    //   1429	1434	3059	java/io/UnsupportedEncodingException
    //   1492	1497	3059	java/io/UnsupportedEncodingException
    //   1555	1560	3059	java/io/UnsupportedEncodingException
    //   1618	1624	3059	java/io/UnsupportedEncodingException
    //   1682	1688	3059	java/io/UnsupportedEncodingException
    //   1746	1752	3059	java/io/UnsupportedEncodingException
    //   1810	1816	3059	java/io/UnsupportedEncodingException
    //   1874	1880	3059	java/io/UnsupportedEncodingException
    //   1938	1944	3059	java/io/UnsupportedEncodingException
    //   2002	2008	3059	java/io/UnsupportedEncodingException
    //   2066	2072	3059	java/io/UnsupportedEncodingException
    //   2130	2136	3059	java/io/UnsupportedEncodingException
    //   2194	2200	3059	java/io/UnsupportedEncodingException
    //   2258	2264	3059	java/io/UnsupportedEncodingException
    //   2322	2328	3059	java/io/UnsupportedEncodingException
    //   2386	2392	3059	java/io/UnsupportedEncodingException
    //   2450	2456	3059	java/io/UnsupportedEncodingException
    //   2514	2520	3059	java/io/UnsupportedEncodingException
    //   2578	2584	3059	java/io/UnsupportedEncodingException
    //   2642	2648	3059	java/io/UnsupportedEncodingException
    //   2706	2712	3059	java/io/UnsupportedEncodingException
    //   2770	2776	3059	java/io/UnsupportedEncodingException
    //   2834	2840	3059	java/io/UnsupportedEncodingException
    //   2898	2904	3059	java/io/UnsupportedEncodingException
    //   2962	2968	3059	java/io/UnsupportedEncodingException
  }
  
  public static void genCrossword7()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 7;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    for (;;)
    {
      try
      {
        byte[] arrayOfByte3 = "让我悲也好".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i3, arrayOfByte3.length);
        int i5 = i3 + arrayOfByte3.length;
        i3 = i5 + 1;
        arrayOfByte1[i5] = 0;
        int i4 = i3 + 1;
        byte[] arrayOfByte4;
        int i6;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        byte[] arrayOfByte7;
        int i10;
        byte[] arrayOfByte8;
        int i11;
        int i12;
        byte[] arrayOfByte9;
        int i13;
        int i14;
        byte[] arrayOfByte10;
        int i15;
        byte[] arrayOfByte11;
        int i16;
        byte[] arrayOfByte12;
        int i17;
        byte[] arrayOfByte13;
        int i18;
        byte[] arrayOfByte14;
        int i19;
        byte[] arrayOfByte15;
        int i20;
        byte[] arrayOfByte16;
        int i21;
        byte[] arrayOfByte17;
        int i22;
        byte[] arrayOfByte18;
        int i23;
        byte[] arrayOfByte19;
        int i24;
        int i25;
        byte[] arrayOfByte20;
        int i26;
        byte[] arrayOfByte21;
        int i27;
        byte[] arrayOfByte22;
        int i28;
        int i29;
        byte[] arrayOfByte23;
        int i30;
        byte[] arrayOfByte24;
        int i31;
        int i32;
        byte[] arrayOfByte25;
        int i33;
        int i34;
        byte[] arrayOfByte26;
        int i35;
        byte[] arrayOfByte27;
        int i36;
        int i37;
        byte[] arrayOfByte28;
        int i38;
        byte[] arrayOfByte29;
        int i39;
        byte[] arrayOfByte30;
        int i40;
        int i41;
        byte[] arrayOfByte31;
        int i42;
        byte[] arrayOfByte32;
        int i43;
        byte[] arrayOfByte33;
        int i44;
        byte[] arrayOfByte34;
        int i45;
        byte[] arrayOfByte35;
        int i46;
        byte[] arrayOfByte36;
        int i47;
        byte[] arrayOfByte37;
        int i48;
        byte[] arrayOfByte38;
        int i49;
        byte[] arrayOfByte39;
        int i50;
        byte[] arrayOfByte40;
        int i51;
        byte[] arrayOfByte41;
        int i52;
        byte[] arrayOfByte42;
        int i53;
        byte[] arrayOfByte43;
        int i54;
        byte[] arrayOfByte44;
        int i55;
        byte[] arrayOfByte45;
        int i56;
        byte[] arrayOfByte46;
        int i57;
        byte[] arrayOfByte47;
        int i58;
        byte[] arrayOfByte48;
        int i59;
        byte[] arrayOfByte49;
        int i60;
        byte[] arrayOfByte50;
        int i61;
        byte[] arrayOfByte51;
        int i62;
        byte[] arrayOfByte52;
        int i63;
        byte[] arrayOfByte53;
        int i64;
        byte[] arrayOfByte54;
        int i65;
        byte[] arrayOfByte55;
        int i66;
        byte[] arrayOfByte56;
        int i67;
        byte[] arrayOfByte57;
        int i68;
        byte[] arrayOfByte58;
        int i69;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i3] = 0;
          arrayOfByte4 = "加的斯子".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i4, arrayOfByte4.length);
          i6 = arrayOfByte4.length;
          i7 = i4 + i6;
          i3 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte5 = "观".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i3, arrayOfByte5.length);
          i8 = i3 + arrayOfByte5.length;
          i3 = i8 + 1;
          arrayOfByte1[i8] = 0;
          arrayOfByte6 = "想方设法".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i3, arrayOfByte6.length);
          i9 = i3 + arrayOfByte6.length;
          i3 = i9 + 1;
          arrayOfByte1[i9] = 0;
          arrayOfByte7 = "图棋盘".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i3, arrayOfByte7.length);
          i10 = i3 + arrayOfByte7.length;
          i3 = i10 + 1;
          arrayOfByte1[i10] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte8 = "好".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i4, arrayOfByte8.length);
          i11 = arrayOfByte8.length;
          i12 = i4 + i11;
          i3 = i12 + 1;
          arrayOfByte1[i12] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte9 = "亚".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i4, arrayOfByte9.length);
          i13 = arrayOfByte9.length;
          i14 = i4 + i13;
          i3 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte10 = "根".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i3, arrayOfByte10.length);
          i15 = i3 + arrayOfByte10.length;
          i3 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte11 = "太想爱你".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i3, arrayOfByte11.length);
          i16 = i3 + arrayOfByte11.length;
          i3 = i16 + 1;
          arrayOfByte1[i16] = 0;
          arrayOfByte12 = "卡特".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i3, arrayOfByte12.length);
          i17 = i3 + arrayOfByte12.length;
          i3 = i17 + 1;
          arrayOfByte1[i17] = 0;
          arrayOfByte13 = "错".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i3, arrayOfByte13.length);
          i18 = i3 + arrayOfByte13.length;
          i3 = i18 + 1;
          arrayOfByte1[i18] = 0;
          arrayOfByte14 = "湖".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i3, arrayOfByte14.length);
          i19 = i3 + arrayOfByte14.length;
          i3 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte15 = "称".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i3, arrayOfByte15.length);
          i20 = i3 + arrayOfByte15.length;
          i3 = i20 + 1;
          arrayOfByte1[i20] = 0;
          arrayOfByte16 = "字".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i3, arrayOfByte16.length);
          i21 = i3 + arrayOfByte16.length;
          i3 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte17 = "王变节".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i3, arrayOfByte17.length);
          i22 = i3 + arrayOfByte17.length;
          i3 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte18 = "石".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i3, arrayOfByte18.length);
          i23 = i3 + arrayOfByte18.length;
          i3 = i23 + 1;
          arrayOfByte1[i23] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte19 = "雍正王朝生".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i4, arrayOfByte19.length);
          i24 = arrayOfByte19.length;
          i25 = i4 + i24;
          i3 = i25 + 1;
          arrayOfByte1[i25] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte20 = "打听".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i3, arrayOfByte20.length);
          i26 = i3 + arrayOfByte20.length;
          i3 = i26 + 1;
          arrayOfByte1[i26] = 0;
          arrayOfByte21 = "腔".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i3, arrayOfByte21.length);
          i27 = i3 + arrayOfByte21.length;
          i3 = i27 + 1;
          arrayOfByte1[i27] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte22 = "肘".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i4, arrayOfByte22.length);
          i28 = arrayOfByte22.length;
          i29 = i4 + i28;
          i3 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte23 = "舍不得".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i3, arrayOfByte23.length);
          i30 = i3 + arrayOfByte23.length;
          i3 = i30 + 1;
          arrayOfByte1[i30] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte24 = "圆周角腋窝".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i4, arrayOfByte24.length);
          i31 = arrayOfByte24.length;
          i32 = i4 + i31;
          i3 = i32 + 1;
          arrayOfByte1[i32] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte25 = "火赤链".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i4, arrayOfByte25.length);
          i33 = arrayOfByte25.length;
          i34 = i4 + i33;
          i3 = i34 + 1;
          arrayOfByte1[i34] = 0;
          arrayOfByte26 = "赧".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i3, arrayOfByte26.length);
          i35 = i3 + arrayOfByte26.length;
          i3 = i35 + 1;
          arrayOfByte1[i35] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          arrayOfByte27 = "头疼脑热".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i4, arrayOfByte27.length);
          i36 = arrayOfByte27.length;
          i37 = i4 + i36;
          i3 = i37 + 1;
          arrayOfByte1[i37] = 0;
          arrayOfByte28 = "轨".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i3, arrayOfByte28.length);
          i38 = i3 + arrayOfByte28.length;
          i3 = i38 + 1;
          arrayOfByte1[i38] = 0;
          arrayOfByte29 = "王勃".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i3, arrayOfByte29.length);
          i39 = i3 + arrayOfByte29.length;
          i3 = i39 + 1;
          arrayOfByte1[i39] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 1;
          arrayOfByte30 = "任逍遥中的一句".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i4, arrayOfByte30.length);
          i40 = arrayOfByte30.length;
          i41 = i4 + i40;
          i3 = i41 + 1;
          arrayOfByte1[i41] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 0;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "围棋术语，也叫“饶子”".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i3, arrayOfByte31.length);
          i42 = i3 + arrayOfByte31.length;
          i3 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 2;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "精神颓废，对事物的发展缺乏信心".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i3, arrayOfByte32.length);
          i43 = i3 + arrayOfByte32.length;
          i3 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 4;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "情深深雨蒙蒙的一首歌".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i3, arrayOfByte33.length);
          i44 = i3 + arrayOfByte33.length;
          i3 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte34 = "西班牙西南部的一个重要港口".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i3, arrayOfByte34.length);
          i45 = i3 + arrayOfByte34.length;
          i3 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 7;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte35 = "四则运算之一".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i3, arrayOfByte35.length);
          i46 = i3 + arrayOfByte35.length;
          i3 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 9;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "1649年被革命推翻的英国王朝".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i3, arrayOfByte36.length);
          i47 = i3 + arrayOfByte36.length;
          i3 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 14;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "不断用各种方式尝试".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i3, arrayOfByte37.length);
          i48 = i3 + arrayOfByte37.length;
          i3 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 20;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte38 = "下棋是必不可少的一种东西".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i3, arrayOfByte38.length);
          i49 = i3 + arrayOfByte38.length;
          i3 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 21;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte39 = "树根环绕，木节交错".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i3, arrayOfByte39.length);
          i50 = i3 + arrayOfByte39.length;
          i3 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 33;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte40 = "张信哲的一首歌".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i3, arrayOfByte40.length);
          i51 = i3 + arrayOfByte40.length;
          i3 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 33;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "一种多窟窿和皱纹可以用来作假山的石头".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i3, arrayOfByte41.length);
          i52 = i3 + arrayOfByte41.length;
          i3 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 35;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte42 = "一种表示亲昵的称呼".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i3, arrayOfByte42.length);
          i53 = i3 + arrayOfByte42.length;
          i3 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 38;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte43 = "上世纪70年代的一位美国总统".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i3, arrayOfByte43.length);
          i54 = i3 + arrayOfByte43.length;
          i3 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 47;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "发音非常标准精确".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i3, arrayOfByte44.length);
          i55 = i3 + arrayOfByte44.length;
          i3 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 50;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte45 = "向敌人屈服，背叛原来的阵营".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i3, arrayOfByte45.length);
          i56 = i3 + arrayOfByte45.length;
          i3 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 50;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte46 = "比喻事变发生在极近的地方".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i3, arrayOfByte46.length);
          i57 = i3 + arrayOfByte46.length;
          i3 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 56;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte47 = "唐国强主演的一部电视剧".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i3, arrayOfByte47.length);
          i58 = i3 + arrayOfByte47.length;
          i3 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 64;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte48 = "探问".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i3, arrayOfByte48.length);
          i59 = i3 + arrayOfByte48.length;
          i3 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 64;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "关系变得异常亲近密切".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i3, arrayOfByte49.length);
          i60 = i3 + arrayOfByte49.length;
          i3 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 72;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte50 = "非常爱惜，不忍放弃或离开，不愿使用或处置".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i3, arrayOfByte50.length);
          i61 = i3 + arrayOfByte50.length;
          i3 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 77;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "顶点在圆周上，两条边都与圆周相角的角".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i3, arrayOfByte51.length);
          i62 = i3 + arrayOfByte51.length;
          i3 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 78;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte52 = "周代的最后一个王".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i3, arrayOfByte52.length);
          i63 = i3 + arrayOfByte52.length;
          i3 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 80;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte53 = "上肢和肩膀连接处的下方".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i3, arrayOfByte53.length);
          i64 = i3 + arrayOfByte53.length;
          i3 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 81;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte54 = "一种用玉米面，高粱面做成的食品".getBytes("GBK");
          System.arraycopy(arrayOfByte54, 0, arrayOfByte1, i3, arrayOfByte54.length);
          i65 = i3 + arrayOfByte54.length;
          i3 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 84;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte55 = "一种无毒蛇".getBytes("GBK");
          System.arraycopy(arrayOfByte55, 0, arrayOfByte1, i3, arrayOfByte55.length);
          i66 = i3 + arrayOfByte55.length;
          i3 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 86;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte56 = "履带".getBytes("GBK");
          System.arraycopy(arrayOfByte56, 0, arrayOfByte1, i3, arrayOfByte56.length);
          i67 = i3 + arrayOfByte56.length;
          i3 = i67 + 1;
          arrayOfByte1[i67] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 91;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte57 = "泛指一般小病".getBytes("GBK");
          System.arraycopy(arrayOfByte57, 0, arrayOfByte1, i3, arrayOfByte57.length);
          i68 = i3 + arrayOfByte57.length;
          i3 = i68 + 1;
          arrayOfByte1[i68] = 0;
          i4 = i3 + 1;
          arrayOfByte1[i3] = 98;
          i3 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte58 = "初唐四杰之一".getBytes("GBK");
          System.arraycopy(arrayOfByte58, 0, arrayOfByte1, i3, arrayOfByte58.length);
          i69 = i3 + arrayOfByte58.length;
          i3 = i69 + 1;
          arrayOfByte1[i69] = 0;
          i4 = i3;
          Utils.writeBytes2File(new File("/sdcard/puz/7.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            Object localObject = localUnsupportedEncodingException2;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
        i4 = i3;
      }
    }
  }
  
  public static void genCrossword8()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 8;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    i4 = i3 + 1;
    for (;;)
    {
      try
      {
        arrayOfByte1[i3] = 0;
        byte[] arrayOfByte3 = "一".getBytes("GBK");
        System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i4, arrayOfByte3.length);
        int i5 = arrayOfByte3.length;
        int i6 = i4 + i5;
        i7 = i6 + 1;
        byte[] arrayOfByte4;
        int i8;
        byte[] arrayOfByte5;
        int i9;
        int i10;
        byte[] arrayOfByte6;
        int i11;
        int i12;
        byte[] arrayOfByte7;
        int i13;
        int i14;
        byte[] arrayOfByte8;
        int i15;
        byte[] arrayOfByte9;
        int i16;
        byte[] arrayOfByte10;
        int i17;
        int i18;
        byte[] arrayOfByte11;
        int i19;
        byte[] arrayOfByte12;
        int i20;
        byte[] arrayOfByte13;
        int i21;
        int i22;
        byte[] arrayOfByte14;
        int i23;
        int i24;
        byte[] arrayOfByte15;
        int i25;
        int i26;
        byte[] arrayOfByte16;
        int i27;
        int i28;
        byte[] arrayOfByte17;
        int i29;
        byte[] arrayOfByte18;
        int i30;
        byte[] arrayOfByte19;
        int i31;
        byte[] arrayOfByte20;
        int i32;
        byte[] arrayOfByte21;
        int i33;
        byte[] arrayOfByte22;
        int i34;
        int i35;
        byte[] arrayOfByte23;
        int i36;
        int i37;
        byte[] arrayOfByte24;
        int i38;
        byte[] arrayOfByte25;
        int i39;
        int i40;
        byte[] arrayOfByte26;
        int i41;
        byte[] arrayOfByte27;
        int i42;
        byte[] arrayOfByte28;
        int i43;
        int i44;
        byte[] arrayOfByte29;
        int i45;
        byte[] arrayOfByte30;
        int i46;
        byte[] arrayOfByte31;
        int i47;
        byte[] arrayOfByte32;
        int i48;
        byte[] arrayOfByte33;
        int i49;
        byte[] arrayOfByte34;
        int i50;
        byte[] arrayOfByte35;
        int i51;
        byte[] arrayOfByte36;
        int i52;
        byte[] arrayOfByte37;
        int i53;
        byte[] arrayOfByte38;
        int i54;
        byte[] arrayOfByte39;
        int i55;
        byte[] arrayOfByte40;
        int i56;
        byte[] arrayOfByte41;
        int i57;
        byte[] arrayOfByte42;
        int i58;
        byte[] arrayOfByte43;
        int i59;
        byte[] arrayOfByte44;
        int i60;
        byte[] arrayOfByte45;
        int i61;
        byte[] arrayOfByte46;
        int i62;
        byte[] arrayOfByte47;
        int i63;
        byte[] arrayOfByte48;
        int i64;
        byte[] arrayOfByte49;
        int i65;
        byte[] arrayOfByte50;
        int i66;
        byte[] arrayOfByte51;
        int i67;
        byte[] arrayOfByte52;
        int i68;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i6] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte4 = "中央电视台风波亭".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i7, arrayOfByte4.length);
          i8 = i7 + arrayOfByte4.length;
          i7 = i8 + 1;
          arrayOfByte1[i8] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte5 = "秋".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i4, arrayOfByte5.length);
          i9 = arrayOfByte5.length;
          i10 = i4 + i9;
          i7 = i10 + 1;
          arrayOfByte1[i10] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte6 = "力".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i4, arrayOfByte6.length);
          i11 = arrayOfByte6.length;
          i12 = i4 + i11;
          i7 = i12 + 1;
          arrayOfByte1[i12] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte7 = "未".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i4, arrayOfByte7.length);
          i13 = arrayOfByte7.length;
          i14 = i4 + i13;
          i7 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte8 = "母亲节".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i7, arrayOfByte8.length);
          i15 = i7 + arrayOfByte8.length;
          i7 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte9 = "华表".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i7, arrayOfByte9.length);
          i16 = i7 + arrayOfByte9.length;
          i7 = i16 + 1;
          arrayOfByte1[i16] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte10 = "平安夜".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i4, arrayOfByte10.length);
          i17 = arrayOfByte10.length;
          i18 = i4 + i17;
          i7 = i18 + 1;
          arrayOfByte1[i18] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte11 = "山".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i7, arrayOfByte11.length);
          i19 = i7 + arrayOfByte11.length;
          i7 = i19 + 1;
          arrayOfByte1[i19] = 0;
          arrayOfByte12 = "银廊".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i7, arrayOfByte12.length);
          i20 = i7 + arrayOfByte12.length;
          i7 = i20 + 1;
          arrayOfByte1[i20] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte13 = "叉烧包".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i4, arrayOfByte13.length);
          i21 = arrayOfByte13.length;
          i22 = i4 + i21;
          i7 = i22 + 1;
          arrayOfByte1[i22] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte14 = "外行桥".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i4, arrayOfByte14.length);
          i23 = arrayOfByte14.length;
          i24 = i4 + i23;
          i7 = i24 + 1;
          arrayOfByte1[i24] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte15 = "青".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i4, arrayOfByte15.length);
          i25 = arrayOfByte15.length;
          i26 = i4 + i25;
          i7 = i26 + 1;
          arrayOfByte1[i26] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte16 = "交".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i4, arrayOfByte16.length);
          i27 = arrayOfByte16.length;
          i28 = i4 + i27;
          i7 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte17 = "遗臭万年".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i7, arrayOfByte17.length);
          i29 = i7 + arrayOfByte17.length;
          i7 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte18 = "天龙八部".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i7, arrayOfByte18.length);
          i30 = i7 + arrayOfByte18.length;
          i7 = i30 + 1;
          arrayOfByte1[i30] = 0;
          arrayOfByte19 = "梦".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i7, arrayOfByte19.length);
          i31 = i7 + arrayOfByte19.length;
          i7 = i31 + 1;
          arrayOfByte1[i31] = 0;
          arrayOfByte20 = "夫".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i7, arrayOfByte20.length);
          i32 = i7 + arrayOfByte20.length;
          i7 = i32 + 1;
          arrayOfByte1[i32] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte21 = "的".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i7, arrayOfByte21.length);
          i33 = i7 + arrayOfByte21.length;
          i7 = i33 + 1;
          arrayOfByte1[i33] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte22 = "原".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i4, arrayOfByte22.length);
          i34 = arrayOfByte22.length;
          i35 = i4 + i34;
          i7 = i35 + 1;
          arrayOfByte1[i35] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte23 = "莫".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i4, arrayOfByte23.length);
          i36 = arrayOfByte23.length;
          i37 = i4 + i36;
          i7 = i37 + 1;
          arrayOfByte1[i37] = 0;
          arrayOfByte24 = "白蛇传".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i7, arrayOfByte24.length);
          i38 = i7 + arrayOfByte24.length;
          i7 = i38 + 1;
          arrayOfByte1[i38] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte25 = "子".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i4, arrayOfByte25.length);
          i39 = arrayOfByte25.length;
          i40 = i4 + i39;
          i7 = i40 + 1;
          arrayOfByte1[i40] = 0;
          arrayOfByte26 = "旗开得胜".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i7, arrayOfByte26.length);
          i41 = i7 + arrayOfByte26.length;
          i7 = i41 + 1;
          arrayOfByte1[i41] = 0;
          arrayOfByte27 = "人工智能".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i7, arrayOfByte27.length);
          i42 = i7 + arrayOfByte27.length;
          i7 = i42 + 1;
          arrayOfByte1[i42] = 1;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 2;
          arrayOfByte28 = "“一波又起”的上一句".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i4, arrayOfByte28.length);
          i43 = arrayOfByte28.length;
          i44 = i4 + i43;
          i7 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 5;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte29 = "国内一个权威传媒".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i7, arrayOfByte29.length);
          i45 = i7 + arrayOfByte29.length;
          i7 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 5;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte30 = "我国一个传统节日".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i7, arrayOfByte30.length);
          i46 = i7 + arrayOfByte30.length;
          i7 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 8;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte31 = "体检用的一种东西".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i7, arrayOfByte31.length);
          i47 = i7 + arrayOfByte31.length;
          i7 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 10;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte32 = "岳飞遇害之地".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i7, arrayOfByte32.length);
          i48 = i7 + arrayOfByte32.length;
          i7 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 23;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte33 = "一个西方节日".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i7, arrayOfByte33.length);
          i49 = i7 + arrayOfByte33.length;
          i7 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 23;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "孙二娘的绰号".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i7, arrayOfByte34.length);
          i50 = i7 + arrayOfByte34.length;
          i7 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 27;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte35 = "古代宫殿、陵墓等巨大建筑物前用于装饰的巨大石柱".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i7, arrayOfByte35.length);
          i51 = i7 + arrayOfByte35.length;
          i7 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 27;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte36 = "西岳".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i7, arrayOfByte36.length);
          i52 = i7 + arrayOfByte36.length;
          i7 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 31;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte37 = "一首圣诞歌曲".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i7, arrayOfByte37.length);
          i53 = i7 + arrayOfByte37.length;
          i7 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 39;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "一种金融机构".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i7, arrayOfByte38.length);
          i54 = i7 + arrayOfByte38.length;
          i7 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 40;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte39 = "一部美国畅销小说".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i7, arrayOfByte39.length);
          i55 = i7 + arrayOfByte39.length;
          i7 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 43;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte40 = "一种广式早茶的点心".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i7, arrayOfByte40.length);
          i56 = i7 + arrayOfByte40.length;
          i7 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 45;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte41 = "金超群主演的一部电视连续剧".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i7, arrayOfByte41.length);
          i57 = i7 + arrayOfByte41.length;
          i7 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 48;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "门外汉之意".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i7, arrayOfByte42.length);
          i58 = i7 + arrayOfByte42.length;
          i7 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 48;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "处理国际关系的部门".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i7, arrayOfByte43.length);
          i59 = i7 + arrayOfByte43.length;
          i7 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 60;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte44 = "坏名声长期流传，受人唾骂".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i7, arrayOfByte44.length);
          i60 = i7 + arrayOfByte44.length;
          i7 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 62;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte45 = "“一夫当关”的下一句".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i7, arrayOfByte45.length);
          i61 = i7 + arrayOfByte45.length;
          i7 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 65;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "金庸的一部小说".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i7, arrayOfByte46.length);
          i62 = i7 + arrayOfByte46.length;
          i7 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 66;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "指中国人".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i7, arrayOfByte47.length);
          i63 = i7 + arrayOfByte47.length;
          i7 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 79;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte48 = "原子核发生裂变或聚变反应时产生的能量".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i7, arrayOfByte48.length);
          i64 = i7 + arrayOfByte48.length;
          i7 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 84;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte49 = "一个西湖民间传说".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i7, arrayOfByte49.length);
          i65 = i7 + arrayOfByte49.length;
          i7 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 84;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "水浒传中的白日鼠 ".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i7, arrayOfByte50.length);
          i66 = i7 + arrayOfByte50.length;
          i7 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 91;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "马到成功之意".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i7, arrayOfByte51.length);
          i67 = i7 + arrayOfByte51.length;
          i7 = i67 + 1;
          arrayOfByte1[i67] = 0;
          i4 = i7 + 1;
          arrayOfByte1[i7] = 96;
          i7 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte52 = "电脑用语，“AI”的中文薏思".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i7, arrayOfByte52.length);
          i68 = i7 + arrayOfByte52.length;
          i7 = i68 + 1;
          arrayOfByte1[i68] = 0;
          i4 = i7;
          Utils.writeBytes2File(new File("/sdcard/puz/8.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            int i7;
            Object localObject = localUnsupportedEncodingException2;
            i4 = i7;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
      }
    }
  }
  
  public static void genCrossword9()
  {
    byte[] arrayOfByte1 = new byte['က'];
    byte[] arrayOfByte2 = "YY's puzzle".getBytes();
    System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, arrayOfByte2.length);
    int i = arrayOfByte2.length;
    int j = i + 1;
    arrayOfByte1[i] = 0;
    int k = j + 1;
    arrayOfByte1[j] = 0;
    int m = k + 1;
    arrayOfByte1[k] = 0;
    int n = m + 1;
    arrayOfByte1[m] = 9;
    int i1 = n + 1;
    arrayOfByte1[n] = 1;
    int i2 = i1 + 1;
    arrayOfByte1[i1] = 10;
    int i3 = i2 + 1;
    arrayOfByte1[i2] = 10;
    i4 = i3 + 1;
    for (;;)
    {
      try
      {
        arrayOfByte1[i3] = 0;
        i5 = i4 + 1;
        byte[] arrayOfByte3;
        int i6;
        byte[] arrayOfByte4;
        int i7;
        byte[] arrayOfByte5;
        int i8;
        byte[] arrayOfByte6;
        int i9;
        byte[] arrayOfByte7;
        int i10;
        byte[] arrayOfByte8;
        int i11;
        byte[] arrayOfByte9;
        int i12;
        byte[] arrayOfByte10;
        int i13;
        byte[] arrayOfByte11;
        int i14;
        byte[] arrayOfByte12;
        int i15;
        byte[] arrayOfByte13;
        int i16;
        byte[] arrayOfByte14;
        int i17;
        int i18;
        byte[] arrayOfByte15;
        int i19;
        int i20;
        byte[] arrayOfByte16;
        int i21;
        byte[] arrayOfByte17;
        int i22;
        byte[] arrayOfByte18;
        int i23;
        byte[] arrayOfByte19;
        int i24;
        int i25;
        byte[] arrayOfByte20;
        int i26;
        int i27;
        byte[] arrayOfByte21;
        int i28;
        byte[] arrayOfByte22;
        int i29;
        byte[] arrayOfByte23;
        int i30;
        byte[] arrayOfByte24;
        int i31;
        int i32;
        byte[] arrayOfByte25;
        int i33;
        byte[] arrayOfByte26;
        int i34;
        byte[] arrayOfByte27;
        int i35;
        int i36;
        byte[] arrayOfByte28;
        int i37;
        byte[] arrayOfByte29;
        int i38;
        int i39;
        byte[] arrayOfByte30;
        int i40;
        byte[] arrayOfByte31;
        int i41;
        int i42;
        byte[] arrayOfByte32;
        int i43;
        byte[] arrayOfByte33;
        int i44;
        byte[] arrayOfByte34;
        int i45;
        byte[] arrayOfByte35;
        int i46;
        byte[] arrayOfByte36;
        int i47;
        byte[] arrayOfByte37;
        int i48;
        byte[] arrayOfByte38;
        int i49;
        byte[] arrayOfByte39;
        int i50;
        byte[] arrayOfByte40;
        int i51;
        byte[] arrayOfByte41;
        int i52;
        byte[] arrayOfByte42;
        int i53;
        byte[] arrayOfByte43;
        int i54;
        byte[] arrayOfByte44;
        int i55;
        byte[] arrayOfByte45;
        int i56;
        byte[] arrayOfByte46;
        int i57;
        byte[] arrayOfByte47;
        int i58;
        byte[] arrayOfByte48;
        int i59;
        byte[] arrayOfByte49;
        int i60;
        byte[] arrayOfByte50;
        int i61;
        byte[] arrayOfByte51;
        int i62;
        byte[] arrayOfByte52;
        int i63;
        byte[] arrayOfByte53;
        int i64;
        byte[] arrayOfByte54;
        int i65;
        byte[] arrayOfByte55;
        int i66;
        ((UnsupportedEncodingException)localObject).printStackTrace();
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        try
        {
          arrayOfByte1[i4] = 0;
          arrayOfByte3 = "万里长城".getBytes("GBK");
          System.arraycopy(arrayOfByte3, 0, arrayOfByte1, i5, arrayOfByte3.length);
          i6 = i5 + arrayOfByte3.length;
          i5 = i6 + 1;
          arrayOfByte1[i6] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 0;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte4 = "天".getBytes("GBK");
          System.arraycopy(arrayOfByte4, 0, arrayOfByte1, i5, arrayOfByte4.length);
          i7 = i5 + arrayOfByte4.length;
          i5 = i7 + 1;
          arrayOfByte1[i7] = 0;
          arrayOfByte5 = "重水".getBytes("GBK");
          System.arraycopy(arrayOfByte5, 0, arrayOfByte1, i5, arrayOfByte5.length);
          i8 = i5 + arrayOfByte5.length;
          i5 = i8 + 1;
          arrayOfByte1[i8] = 0;
          arrayOfByte6 = "使".getBytes("GBK");
          System.arraycopy(arrayOfByte6, 0, arrayOfByte1, i5, arrayOfByte6.length);
          i9 = i5 + arrayOfByte6.length;
          i5 = i9 + 1;
          arrayOfByte1[i9] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 0;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 0;
          arrayOfByte7 = "美元坐".getBytes("GBK");
          System.arraycopy(arrayOfByte7, 0, arrayOfByte1, i5, arrayOfByte7.length);
          i10 = i5 + arrayOfByte7.length;
          i5 = i10 + 1;
          arrayOfByte1[i10] = 0;
          arrayOfByte8 = "千".getBytes("GBK");
          System.arraycopy(arrayOfByte8, 0, arrayOfByte1, i5, arrayOfByte8.length);
          i11 = i5 + arrayOfByte8.length;
          i5 = i11 + 1;
          arrayOfByte1[i11] = 0;
          arrayOfByte9 = "英格兰".getBytes("GBK");
          System.arraycopy(arrayOfByte9, 0, arrayOfByte1, i5, arrayOfByte9.length);
          i12 = i5 + arrayOfByte9.length;
          i5 = i12 + 1;
          arrayOfByte1[i12] = 0;
          arrayOfByte10 = "髯".getBytes("GBK");
          System.arraycopy(arrayOfByte10, 0, arrayOfByte1, i5, arrayOfByte10.length);
          i13 = i5 + arrayOfByte10.length;
          i5 = i13 + 1;
          arrayOfByte1[i13] = 0;
          arrayOfByte11 = "井冈山".getBytes("GBK");
          System.arraycopy(arrayOfByte11, 0, arrayOfByte1, i5, arrayOfByte11.length);
          i14 = i5 + arrayOfByte11.length;
          i5 = i14 + 1;
          arrayOfByte1[i14] = 0;
          arrayOfByte12 = "雄".getBytes("GBK");
          System.arraycopy(arrayOfByte12, 0, arrayOfByte1, i5, arrayOfByte12.length);
          i15 = i5 + arrayOfByte12.length;
          i5 = i15 + 1;
          arrayOfByte1[i15] = 0;
          arrayOfByte13 = "花花公子观".getBytes("GBK");
          System.arraycopy(arrayOfByte13, 0, arrayOfByte1, i5, arrayOfByte13.length);
          i16 = i5 + arrayOfByte13.length;
          i5 = i16 + 1;
          arrayOfByte1[i16] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 0;
          arrayOfByte14 = "烛泪".getBytes("GBK");
          System.arraycopy(arrayOfByte14, 0, arrayOfByte1, i4, arrayOfByte14.length);
          i17 = arrayOfByte14.length;
          i18 = i4 + i17;
          i5 = i18 + 1;
          arrayOfByte1[i18] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 0;
          arrayOfByte15 = "荣".getBytes("GBK");
          System.arraycopy(arrayOfByte15, 0, arrayOfByte1, i4, arrayOfByte15.length);
          i19 = arrayOfByte15.length;
          i20 = i4 + i19;
          i5 = i20 + 1;
          arrayOfByte1[i20] = 0;
          arrayOfByte16 = "夜天安门".getBytes("GBK");
          System.arraycopy(arrayOfByte16, 0, arrayOfByte1, i5, arrayOfByte16.length);
          i21 = i5 + arrayOfByte16.length;
          i5 = i21 + 1;
          arrayOfByte1[i21] = 0;
          arrayOfByte17 = "满江红".getBytes("GBK");
          System.arraycopy(arrayOfByte17, 0, arrayOfByte1, i5, arrayOfByte17.length);
          i22 = i5 + arrayOfByte17.length;
          i5 = i22 + 1;
          arrayOfByte1[i22] = 0;
          arrayOfByte18 = "山".getBytes("GBK");
          System.arraycopy(arrayOfByte18, 0, arrayOfByte1, i5, arrayOfByte18.length);
          i23 = i5 + arrayOfByte18.length;
          i5 = i23 + 1;
          arrayOfByte1[i23] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 0;
          arrayOfByte19 = "史".getBytes("GBK");
          System.arraycopy(arrayOfByte19, 0, arrayOfByte1, i4, arrayOfByte19.length);
          i24 = arrayOfByte19.length;
          i25 = i4 + i24;
          i5 = i25 + 1;
          arrayOfByte1[i25] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 0;
          arrayOfByte20 = "襟".getBytes("GBK");
          System.arraycopy(arrayOfByte20, 0, arrayOfByte1, i4, arrayOfByte20.length);
          i26 = arrayOfByte20.length;
          i27 = i4 + i26;
          i5 = i27 + 1;
          arrayOfByte1[i27] = 0;
          arrayOfByte21 = "高级中学".getBytes("GBK");
          System.arraycopy(arrayOfByte21, 0, arrayOfByte1, i5, arrayOfByte21.length);
          i28 = i5 + arrayOfByte21.length;
          i5 = i28 + 1;
          arrayOfByte1[i28] = 0;
          arrayOfByte22 = "之".getBytes("GBK");
          System.arraycopy(arrayOfByte22, 0, arrayOfByte1, i5, arrayOfByte22.length);
          i29 = i5 + arrayOfByte22.length;
          i5 = i29 + 1;
          arrayOfByte1[i29] = 0;
          arrayOfByte23 = "芝".getBytes("GBK");
          System.arraycopy(arrayOfByte23, 0, arrayOfByte1, i5, arrayOfByte23.length);
          i30 = i5 + arrayOfByte23.length;
          i5 = i30 + 1;
          arrayOfByte1[i30] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 0;
          arrayOfByte24 = "梁".getBytes("GBK");
          System.arraycopy(arrayOfByte24, 0, arrayOfByte1, i4, arrayOfByte24.length);
          i31 = arrayOfByte24.length;
          i32 = i4 + i31;
          i5 = i32 + 1;
          arrayOfByte1[i32] = 0;
          arrayOfByte25 = "相".getBytes("GBK");
          System.arraycopy(arrayOfByte25, 0, arrayOfByte1, i5, arrayOfByte25.length);
          i33 = i5 + arrayOfByte25.length;
          i5 = i33 + 1;
          arrayOfByte1[i33] = 0;
          arrayOfByte26 = "心乱如麻".getBytes("GBK");
          System.arraycopy(arrayOfByte26, 0, arrayOfByte1, i5, arrayOfByte26.length);
          i34 = i5 + arrayOfByte26.length;
          i5 = i34 + 1;
          arrayOfByte1[i34] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 0;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 0;
          arrayOfByte27 = "送".getBytes("GBK");
          System.arraycopy(arrayOfByte27, 0, arrayOfByte1, i4, arrayOfByte27.length);
          i35 = arrayOfByte27.length;
          i36 = i4 + i35;
          i5 = i36 + 1;
          arrayOfByte1[i36] = 0;
          arrayOfByte28 = "照".getBytes("GBK");
          System.arraycopy(arrayOfByte28, 0, arrayOfByte1, i5, arrayOfByte28.length);
          i37 = i5 + arrayOfByte28.length;
          i5 = i37 + 1;
          arrayOfByte1[i37] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 0;
          arrayOfByte29 = "街".getBytes("GBK");
          System.arraycopy(arrayOfByte29, 0, arrayOfByte1, i4, arrayOfByte29.length);
          i38 = arrayOfByte29.length;
          i39 = i4 + i38;
          i5 = i39 + 1;
          arrayOfByte1[i39] = 0;
          arrayOfByte30 = "省港大罢工".getBytes("GBK");
          System.arraycopy(arrayOfByte30, 0, arrayOfByte1, i5, arrayOfByte30.length);
          i40 = i5 + arrayOfByte30.length;
          i5 = i40 + 1;
          arrayOfByte1[i40] = 2;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 1;
          arrayOfByte31 = "我国著名古代建筑".getBytes("GBK");
          System.arraycopy(arrayOfByte31, 0, arrayOfByte1, i4, arrayOfByte31.length);
          i41 = arrayOfByte31.length;
          i42 = i4 + i41;
          i5 = i42 + 1;
          arrayOfByte1[i42] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 2;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte32 = "成语，形容路途遥远险阻 ".getBytes("GBK");
          System.arraycopy(arrayOfByte32, 0, arrayOfByte1, i5, arrayOfByte32.length);
          i43 = i5 + arrayOfByte32.length;
          i5 = i43 + 1;
          arrayOfByte1[i43] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 4;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte33 = "杜甫的诗(蜀相)中的一句".getBytes("GBK");
          System.arraycopy(arrayOfByte33, 0, arrayOfByte1, i5, arrayOfByte33.length);
          i44 = i5 + arrayOfByte33.length;
          i5 = i44 + 1;
          arrayOfByte1[i44] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 9;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte34 = "围棋棋盘上正中央的一点".getBytes("GBK");
          System.arraycopy(arrayOfByte34, 0, arrayOfByte1, i5, arrayOfByte34.length);
          i45 = i5 + arrayOfByte34.length;
          i5 = i45 + 1;
          arrayOfByte1[i45] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 11;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte35 = "核工业中的一种冷却剂".getBytes("GBK");
          System.arraycopy(arrayOfByte35, 0, arrayOfByte1, i5, arrayOfByte35.length);
          i46 = i5 + arrayOfByte35.length;
          i5 = i46 + 1;
          arrayOfByte1[i46] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 18;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte36 = "一种国际货币".getBytes("GBK");
          System.arraycopy(arrayOfByte36, 0, arrayOfByte1, i5, arrayOfByte36.length);
          i47 = i5 + arrayOfByte36.length;
          i5 = i47 + 1;
          arrayOfByte1[i47] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 18;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte37 = "关羽的美称".getBytes("GBK");
          System.arraycopy(arrayOfByte37, 0, arrayOfByte1, i5, arrayOfByte37.length);
          i48 = i5 + arrayOfByte37.length;
          i5 = i48 + 1;
          arrayOfByte1[i48] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 20;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte38 = "比喻眼光狭窄，看到的有限".getBytes("GBK");
          System.arraycopy(arrayOfByte38, 0, arrayOfByte1, i5, arrayOfByte38.length);
          i49 = i5 + arrayOfByte38.length;
          i5 = i49 + 1;
          arrayOfByte1[i49] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 24;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte39 = "大不列颠及北爱尔兰联合王国的一个组成部分".getBytes("GBK");
          System.arraycopy(arrayOfByte39, 0, arrayOfByte1, i5, arrayOfByte39.length);
          i50 = i5 + arrayOfByte39.length;
          i5 = i50 + 1;
          arrayOfByte1[i50] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 26;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte40 = "一种观赏植物".getBytes("GBK");
          System.arraycopy(arrayOfByte40, 0, arrayOfByte1, i5, arrayOfByte40.length);
          i51 = i5 + arrayOfByte40.length;
          i5 = i51 + 1;
          arrayOfByte1[i51] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 30;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte41 = "一个革命根据地".getBytes("GBK");
          System.arraycopy(arrayOfByte41, 0, arrayOfByte1, i5, arrayOfByte41.length);
          i52 = i5 + arrayOfByte41.length;
          i5 = i52 + 1;
          arrayOfByte1[i52] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 36;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte42 = "纨挎子弟".getBytes("GBK");
          System.arraycopy(arrayOfByte42, 0, arrayOfByte1, i5, arrayOfByte42.length);
          i53 = i5 + arrayOfByte42.length;
          i5 = i53 + 1;
          arrayOfByte1[i53] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 37;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte43 = "(水浒)中的神箭手".getBytes("GBK");
          System.arraycopy(arrayOfByte43, 0, arrayOfByte1, i5, arrayOfByte43.length);
          i54 = i5 + arrayOfByte43.length;
          i5 = i54 + 1;
          arrayOfByte1[i54] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 39;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte44 = "茅盾的一部作品".getBytes("GBK");
          System.arraycopy(arrayOfByte44, 0, arrayOfByte1, i5, arrayOfByte44.length);
          i55 = i5 + arrayOfByte44.length;
          i5 = i55 + 1;
          arrayOfByte1[i55] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 43;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte45 = "蜡烛燃烧时淌下的蜡油".getBytes("GBK");
          System.arraycopy(arrayOfByte45, 0, arrayOfByte1, i5, arrayOfByte45.length);
          i56 = i5 + arrayOfByte45.length;
          i5 = i56 + 1;
          arrayOfByte1[i56] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 50;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte46 = "北京著名建筑".getBytes("GBK");
          System.arraycopy(arrayOfByte46, 0, arrayOfByte1, i5, arrayOfByte46.length);
          i57 = i5 + arrayOfByte46.length;
          i5 = i57 + 1;
          arrayOfByte1[i57] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 51;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte47 = "发生在唐朝的一次政治动乱".getBytes("GBK");
          System.arraycopy(arrayOfByte47, 0, arrayOfByte1, i5, arrayOfByte47.length);
          i58 = i5 + arrayOfByte47.length;
          i5 = i58 + 1;
          arrayOfByte1[i58] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 54;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte48 = "岳飞的一首词".getBytes("GBK");
          System.arraycopy(arrayOfByte48, 0, arrayOfByte1, i5, arrayOfByte48.length);
          i59 = i5 + arrayOfByte48.length;
          i5 = i59 + 1;
          arrayOfByte1[i59] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 56;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte49 = "张艺谋导演的一部电影 ".getBytes("GBK");
          System.arraycopy(arrayOfByte49, 0, arrayOfByte1, i5, arrayOfByte49.length);
          i60 = i5 + arrayOfByte49.length;
          i5 = i60 + 1;
          arrayOfByte1[i60] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 58;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte50 = "王维的诗《送别》中的一句".getBytes("GBK");
          System.arraycopy(arrayOfByte50, 0, arrayOfByte1, i5, arrayOfByte50.length);
          i61 = i5 + arrayOfByte50.length;
          i5 = i61 + 1;
          arrayOfByte1[i61] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 66;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte51 = "我国实施后一阶段中等教育的学校".getBytes("GBK");
          System.arraycopy(arrayOfByte51, 0, arrayOfByte1, i5, arrayOfByte51.length);
          i62 = i5 + arrayOfByte51.length;
          i5 = i62 + 1;
          arrayOfByte1[i62] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 73;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte52 = "美国一个著名的儿童电视节目".getBytes("GBK");
          System.arraycopy(arrayOfByte52, 0, arrayOfByte1, i5, arrayOfByte52.length);
          i63 = i5 + arrayOfByte52.length;
          i5 = i63 + 1;
          arrayOfByte1[i63] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 80;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte53 = "形容心绪不宁，不知如何是好 ".getBytes("GBK");
          System.arraycopy(arrayOfByte53, 0, arrayOfByte1, i5, arrayOfByte53.length);
          i64 = i5 + arrayOfByte53.length;
          i5 = i64 + 1;
          arrayOfByte1[i64] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 80;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 2;
          arrayOfByte54 = "不必对方明说而自然明白".getBytes("GBK");
          System.arraycopy(arrayOfByte54, 0, arrayOfByte1, i5, arrayOfByte54.length);
          i65 = i5 + arrayOfByte54.length;
          i5 = i65 + 1;
          arrayOfByte1[i65] = 0;
          i4 = i5 + 1;
          arrayOfByte1[i5] = 95;
          i5 = i4 + 1;
          arrayOfByte1[i4] = 1;
          arrayOfByte55 = "1925年发生在我国的一次工人政治运动".getBytes("GBK");
          System.arraycopy(arrayOfByte55, 0, arrayOfByte1, i5, arrayOfByte55.length);
          i66 = i5 + arrayOfByte55.length;
          i5 = i66 + 1;
          arrayOfByte1[i66] = 0;
          i4 = i5;
          Utils.writeBytes2File(new File("/sdcard/puz/9.puz"), arrayOfByte1, i4);
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          for (;;)
          {
            int i5;
            Object localObject = localUnsupportedEncodingException2;
            i4 = i5;
          }
        }
        localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
        localObject = localUnsupportedEncodingException1;
      }
    }
  }
}


/* Location:              E:\反编译工程\反编译工具包\反编译工具包\dex2jar-0.0.9.15\dex2jar-0.0.9.15\项目APP\填字游戏 1.8\_dex2jar.jar!\net\oicp\anya\tools\GenCrossWord.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */