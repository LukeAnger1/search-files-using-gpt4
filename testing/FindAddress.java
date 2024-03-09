class androidx.core.text.util.FindAddress {
  private static final java.lang.String HOUSE_COMPONENT;

  private static final java.lang.String HOUSE_END;

  private static final java.lang.String HOUSE_POST_DELIM;

  private static final java.lang.String HOUSE_PRE_DELIM;

  private static final int MAX_ADDRESS_LINES;

  private static final int MAX_ADDRESS_WORDS;

  private static final int MAX_LOCATION_NAME_DISTANCE;

  private static final int MIN_ADDRESS_WORDS;

  private static final java.lang.String NL;

  private static final java.lang.String SP;

  private static final java.lang.String WORD_DELIM;

  private static final java.lang.String WORD_END;

  private static final java.lang.String WS;

  private static final int kMaxAddressNameWordLength;

  private static final java.util.regex.Pattern sHouseNumberRe;

  private static final java.util.regex.Pattern sLocationNameRe;

  private static final java.util.regex.Pattern sStateRe;

  private static final androidx.core.text.util.FindAddress$ZipRange[] sStateZipCodeRanges;

  private static final java.util.regex.Pattern sSuffixedNumberRe;

  private static final java.util.regex.Pattern sWordRe;

  private static final java.util.regex.Pattern sZipCodeRe;

  static {};
    Code:
       0: bipush        59
       2: anewarray     #6                  // class androidx/core/text/util/FindAddress$ZipRange
       5: dup
       6: iconst_0
       7: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
      10: dup
      11: bipush        99
      13: bipush        99
      15: iconst_m1
      16: iconst_m1
      17: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
      20: aastore
      21: dup
      22: iconst_1
      23: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
      26: dup
      27: bipush        35
      29: bipush        36
      31: iconst_m1
      32: iconst_m1
      33: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
      36: aastore
      37: dup
      38: iconst_2
      39: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
      42: dup
      43: bipush        71
      45: bipush        72
      47: iconst_m1
      48: iconst_m1
      49: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
      52: aastore
      53: dup
      54: iconst_3
      55: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
      58: dup
      59: bipush        96
      61: bipush        96
      63: iconst_m1
      64: iconst_m1
      65: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
      68: aastore
      69: dup
      70: iconst_4
      71: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
      74: dup
      75: bipush        85
      77: bipush        86
      79: iconst_m1
      80: iconst_m1
      81: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
      84: aastore
      85: dup
      86: iconst_5
      87: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
      90: dup
      91: bipush        90
      93: bipush        96
      95: iconst_m1
      96: iconst_m1
      97: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     100: aastore
     101: dup
     102: bipush        6
     104: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     107: dup
     108: bipush        80
     110: bipush        81
     112: iconst_m1
     113: iconst_m1
     114: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     117: aastore
     118: dup
     119: bipush        7
     121: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     124: dup
     125: bipush        6
     127: bipush        6
     129: iconst_m1
     130: iconst_m1
     131: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     134: aastore
     135: dup
     136: bipush        8
     138: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     141: dup
     142: bipush        20
     144: bipush        20
     146: iconst_m1
     147: iconst_m1
     148: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     151: aastore
     152: dup
     153: bipush        9
     155: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     158: dup
     159: bipush        19
     161: bipush        19
     163: iconst_m1
     164: iconst_m1
     165: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     168: aastore
     169: dup
     170: bipush        10
     172: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     175: dup
     176: bipush        32
     178: bipush        34
     180: iconst_m1
     181: iconst_m1
     182: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     185: aastore
     186: dup
     187: bipush        11
     189: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     192: dup
     193: bipush        96
     195: bipush        96
     197: iconst_m1
     198: iconst_m1
     199: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     202: aastore
     203: dup
     204: bipush        12
     206: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     209: dup
     210: bipush        30
     212: bipush        31
     214: iconst_m1
     215: iconst_m1
     216: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     219: aastore
     220: dup
     221: bipush        13
     223: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     226: dup
     227: bipush        96
     229: bipush        96
     231: iconst_m1
     232: iconst_m1
     233: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     236: aastore
     237: dup
     238: bipush        14
     240: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     243: dup
     244: bipush        96
     246: bipush        96
     248: iconst_m1
     249: iconst_m1
     250: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     253: aastore
     254: dup
     255: bipush        15
     257: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     260: dup
     261: bipush        50
     263: bipush        52
     265: iconst_m1
     266: iconst_m1
     267: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     270: aastore
     271: dup
     272: bipush        16
     274: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     277: dup
     278: bipush        83
     280: bipush        83
     282: iconst_m1
     283: iconst_m1
     284: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     287: aastore
     288: dup
     289: bipush        17
     291: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     294: dup
     295: bipush        60
     297: bipush        62
     299: iconst_m1
     300: iconst_m1
     301: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     304: aastore
     305: dup
     306: bipush        18
     308: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     311: dup
     312: bipush        46
     314: bipush        47
     316: iconst_m1
     317: iconst_m1
     318: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     321: aastore
     322: dup
     323: bipush        19
     325: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     328: dup
     329: bipush        66
     331: bipush        67
     333: bipush        73
     335: iconst_m1
     336: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     339: aastore
     340: dup
     341: bipush        20
     343: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     346: dup
     347: bipush        40
     349: bipush        42
     351: iconst_m1
     352: iconst_m1
     353: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     356: aastore
     357: dup
     358: bipush        21
     360: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     363: dup
     364: bipush        70
     366: bipush        71
     368: iconst_m1
     369: iconst_m1
     370: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     373: aastore
     374: dup
     375: bipush        22
     377: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     380: dup
     381: iconst_1
     382: iconst_2
     383: iconst_m1
     384: iconst_m1
     385: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     388: aastore
     389: dup
     390: bipush        23
     392: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     395: dup
     396: bipush        20
     398: bipush        21
     400: iconst_m1
     401: iconst_m1
     402: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     405: aastore
     406: dup
     407: bipush        24
     409: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     412: dup
     413: iconst_3
     414: iconst_4
     415: iconst_m1
     416: iconst_m1
     417: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     420: aastore
     421: dup
     422: bipush        25
     424: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     427: dup
     428: bipush        96
     430: bipush        96
     432: iconst_m1
     433: iconst_m1
     434: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     437: aastore
     438: dup
     439: bipush        26
     441: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     444: dup
     445: bipush        48
     447: bipush        49
     449: iconst_m1
     450: iconst_m1
     451: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     454: aastore
     455: dup
     456: bipush        27
     458: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     461: dup
     462: bipush        55
     464: bipush        56
     466: iconst_m1
     467: iconst_m1
     468: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     471: aastore
     472: dup
     473: bipush        28
     475: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     478: dup
     479: bipush        63
     481: bipush        65
     483: iconst_m1
     484: iconst_m1
     485: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     488: aastore
     489: dup
     490: bipush        29
     492: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     495: dup
     496: bipush        96
     498: bipush        96
     500: iconst_m1
     501: iconst_m1
     502: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     505: aastore
     506: dup
     507: bipush        30
     509: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     512: dup
     513: bipush        38
     515: bipush        39
     517: iconst_m1
     518: iconst_m1
     519: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     522: aastore
     523: dup
     524: bipush        31
     526: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     529: dup
     530: bipush        55
     532: bipush        56
     534: iconst_m1
     535: iconst_m1
     536: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     539: aastore
     540: dup
     541: bipush        32
     543: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     546: dup
     547: bipush        27
     549: bipush        28
     551: iconst_m1
     552: iconst_m1
     553: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     556: aastore
     557: dup
     558: bipush        33
     560: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     563: dup
     564: bipush        58
     566: bipush        58
     568: iconst_m1
     569: iconst_m1
     570: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     573: aastore
     574: dup
     575: bipush        34
     577: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     580: dup
     581: bipush        68
     583: bipush        69
     585: iconst_m1
     586: iconst_m1
     587: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     590: aastore
     591: dup
     592: bipush        35
     594: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     597: dup
     598: iconst_3
     599: iconst_4
     600: iconst_m1
     601: iconst_m1
     602: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     605: aastore
     606: dup
     607: bipush        36
     609: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     612: dup
     613: bipush        7
     615: bipush        8
     617: iconst_m1
     618: iconst_m1
     619: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     622: aastore
     623: dup
     624: bipush        37
     626: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     629: dup
     630: bipush        87
     632: bipush        88
     634: bipush        86
     636: iconst_m1
     637: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     640: aastore
     641: dup
     642: bipush        38
     644: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     647: dup
     648: bipush        88
     650: bipush        89
     652: bipush        96
     654: iconst_m1
     655: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     658: aastore
     659: dup
     660: bipush        39
     662: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     665: dup
     666: bipush        10
     668: bipush        14
     670: iconst_0
     671: bipush        6
     673: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     676: aastore
     677: dup
     678: bipush        40
     680: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     683: dup
     684: bipush        43
     686: bipush        45
     688: iconst_m1
     689: iconst_m1
     690: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     693: aastore
     694: dup
     695: bipush        41
     697: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     700: dup
     701: bipush        73
     703: bipush        74
     705: iconst_m1
     706: iconst_m1
     707: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     710: aastore
     711: dup
     712: bipush        42
     714: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     717: dup
     718: bipush        97
     720: bipush        97
     722: iconst_m1
     723: iconst_m1
     724: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     727: aastore
     728: dup
     729: bipush        43
     731: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     734: dup
     735: bipush        15
     737: bipush        19
     739: iconst_m1
     740: iconst_m1
     741: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     744: aastore
     745: dup
     746: bipush        44
     748: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     751: dup
     752: bipush        6
     754: bipush        6
     756: iconst_0
     757: bipush        9
     759: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     762: aastore
     763: dup
     764: bipush        45
     766: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     769: dup
     770: bipush        96
     772: bipush        96
     774: iconst_m1
     775: iconst_m1
     776: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     779: aastore
     780: dup
     781: bipush        46
     783: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     786: dup
     787: iconst_2
     788: iconst_2
     789: iconst_m1
     790: iconst_m1
     791: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     794: aastore
     795: dup
     796: bipush        47
     798: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     801: dup
     802: bipush        29
     804: bipush        29
     806: iconst_m1
     807: iconst_m1
     808: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     811: aastore
     812: dup
     813: bipush        48
     815: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     818: dup
     819: bipush        57
     821: bipush        57
     823: iconst_m1
     824: iconst_m1
     825: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     828: aastore
     829: dup
     830: bipush        49
     832: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     835: dup
     836: bipush        37
     838: bipush        38
     840: iconst_m1
     841: iconst_m1
     842: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     845: aastore
     846: dup
     847: bipush        50
     849: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     852: dup
     853: bipush        75
     855: bipush        79
     857: bipush        87
     859: bipush        88
     861: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     864: aastore
     865: dup
     866: bipush        51
     868: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     871: dup
     872: bipush        84
     874: bipush        84
     876: iconst_m1
     877: iconst_m1
     878: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     881: aastore
     882: dup
     883: bipush        52
     885: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     888: dup
     889: bipush        22
     891: bipush        24
     893: bipush        20
     895: iconst_m1
     896: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     899: aastore
     900: dup
     901: bipush        53
     903: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     906: dup
     907: bipush        6
     909: bipush        9
     911: iconst_m1
     912: iconst_m1
     913: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     916: aastore
     917: dup
     918: bipush        54
     920: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     923: dup
     924: iconst_5
     925: iconst_5
     926: iconst_m1
     927: iconst_m1
     928: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     931: aastore
     932: dup
     933: bipush        55
     935: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     938: dup
     939: bipush        98
     941: bipush        99
     943: iconst_m1
     944: iconst_m1
     945: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     948: aastore
     949: dup
     950: bipush        56
     952: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     955: dup
     956: bipush        53
     958: bipush        54
     960: iconst_m1
     961: iconst_m1
     962: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     965: aastore
     966: dup
     967: bipush        57
     969: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     972: dup
     973: bipush        24
     975: bipush        26
     977: iconst_m1
     978: iconst_m1
     979: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     982: aastore
     983: dup
     984: bipush        58
     986: new           #6                  // class androidx/core/text/util/FindAddress$ZipRange
     989: dup
     990: bipush        82
     992: bipush        83
     994: iconst_m1
     995: iconst_m1
     996: invokespecial #60                 // Method androidx/core/text/util/FindAddress$ZipRange."<init>":(IIII)V
     999: aastore
    1000: putstatic     #62                 // Field sStateZipCodeRanges:[Landroidx/core/text/util/FindAddress$ZipRange;
    1003: ldc           #64                 // String [^,*•\t                　\n\r  ]+(?=[,*•\t                　\n\r  ]|$)
    1005: iconst_2
    1006: invokestatic  #70                 // Method java/util/regex/Pattern.compile:(Ljava/lang/String;I)Ljava/util/regex/Pattern;
    1009: putstatic     #72                 // Field sWordRe:Ljava/util/regex/Pattern;
    1012: ldc           #74                 // String (?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t                　\n\r  ]|$)
    1014: iconst_2
    1015: invokestatic  #70                 // Method java/util/regex/Pattern.compile:(Ljava/lang/String;I)Ljava/util/regex/Pattern;
    1018: putstatic     #76                 // Field sHouseNumberRe:Ljava/util/regex/Pattern;
    1021: ldc           #78                 // String (?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t                　]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t                　]+of[\t                　]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t                　]+states[\t                　]+of[\t                　]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t                　]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t                　]+mariana[\t                　]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t                　]+carolina)|(nd|north[\t                　]+dakota)|(ne|nebraska)|(nh|new[\t                　]+hampshire)|(nj|new[\t                　]+jersey)|(nm|new[\t                　]+mexico)|(nv|nevada)|(ny|new[\t                　]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t                　]+rico)|(pw|palau)|(ri|rhode[\t                　]+island)|(sc|south[\t                　]+carolina)|(sd|south[\t                　]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t                　]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t                　]+virginia)|(wy|wyoming))(?=[,*•\t                　\n\r  ]|$)
    1023: iconst_2
    1024: invokestatic  #70                 // Method java/util/regex/Pattern.compile:(Ljava/lang/String;I)Ljava/util/regex/Pattern;
    1027: putstatic     #80                 // Field sStateRe:Ljava/util/regex/Pattern;
    1030: ldc           #82                 // String (?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t                　\n\r  ]|$)
    1032: iconst_2
    1033: invokestatic  #70                 // Method java/util/regex/Pattern.compile:(Ljava/lang/String;I)Ljava/util/regex/Pattern;
    1036: putstatic     #84                 // Field sLocationNameRe:Ljava/util/regex/Pattern;
    1039: ldc           #86                 // String ([0-9]+)(st|nd|rd|th)
    1041: iconst_2
    1042: invokestatic  #70                 // Method java/util/regex/Pattern.compile:(Ljava/lang/String;I)Ljava/util/regex/Pattern;
    1045: putstatic     #88                 // Field sSuffixedNumberRe:Ljava/util/regex/Pattern;
    1048: ldc           #90                 // String (?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t                　\n\r  ]|$)
    1050: iconst_2
    1051: invokestatic  #70                 // Method java/util/regex/Pattern.compile:(Ljava/lang/String;I)Ljava/util/regex/Pattern;
    1054: putstatic     #92                 // Field sZipCodeRe:Ljava/util/regex/Pattern;
    1057: return

  private androidx.core.text.util.FindAddress();
    Code:
       0: aload_0
       1: invokespecial #95                 // Method java/lang/Object."<init>":()V
       4: return

  private static int attemptMatch(java.lang.String, java.util.regex.MatchResult);
    Code:
       0: aload_1
       1: invokeinterface #103,  1          // InterfaceMethod java/util/regex/MatchResult.end:()I
       6: istore_3
       7: getstatic     #72                 // Field sWordRe:Ljava/util/regex/Pattern;
      10: aload_0
      11: invokevirtual #107                // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      14: astore        13
      16: ldc           #109                // String
      18: astore_1
      19: iconst_1
      20: istore        8
      22: iconst_1
      23: istore        9
      25: iconst_1
      26: istore        7
      28: iconst_0
      29: istore        6
      31: iconst_m1
      32: istore        4
      34: iconst_m1
      35: istore        5
      37: iload_3
      38: istore_2
      39: iload_3
      40: aload_0
      41: invokevirtual #114                // Method java/lang/String.length:()I
      44: if_icmpge     428
      47: aload         13
      49: iload_3
      50: invokevirtual #120                // Method java/util/regex/Matcher.find:(I)Z
      53: ifne          64
      56: aload_0
      57: invokevirtual #114                // Method java/lang/String.length:()I
      60: istore_2
      61: iload_2
      62: ineg
      63: ireturn
      64: iload_3
      65: istore_2
      66: aload         13
      68: invokevirtual #121                // Method java/util/regex/Matcher.end:()I
      71: aload         13
      73: invokevirtual #124                // Method java/util/regex/Matcher.start:()I
      76: isub
      77: bipush        25
      79: if_icmple     91
      82: aload         13
      84: invokevirtual #121                // Method java/util/regex/Matcher.end:()I
      87: istore_2
      88: goto          61
      91: iload_2
      92: aload         13
      94: invokevirtual #124                // Method java/util/regex/Matcher.start:()I
      97: if_icmpge     131
     100: iload         8
     102: istore_3
     103: ldc           #31                 // String \n\r  
     105: aload_0
     106: iload_2
     107: invokevirtual #128                // Method java/lang/String.charAt:(I)C
     110: invokevirtual #132                // Method java/lang/String.indexOf:(I)I
     113: iconst_m1
     114: if_icmpeq     122
     117: iload         8
     119: iconst_1
     120: iadd
     121: istore_3
     122: iinc          2, 1
     125: iload_3
     126: istore        8
     128: goto          91
     131: iload         8
     133: iconst_5
     134: if_icmple     140
     137: goto          428
     140: iinc          9, 1
     143: iload         9
     145: bipush        14
     147: if_icmple     153
     150: goto          428
     153: aload_0
     154: iload_2
     155: invokestatic  #136                // Method matchHouseNumber:(Ljava/lang/String;I)Ljava/util/regex/MatchResult;
     158: ifnull        213
     161: iload         7
     163: ifeq          175
     166: iload         8
     168: iconst_1
     169: if_icmple     175
     172: iload_2
     173: ineg
     174: ireturn
     175: iload         7
     177: istore_3
     178: iload         6
     180: istore        10
     182: iload         4
     184: istore        12
     186: iload         5
     188: istore        11
     190: iload         4
     192: iconst_m1
     193: if_icmpne     395
     196: iload         7
     198: istore_3
     199: iload         6
     201: istore        10
     203: iload_2
     204: istore        12
     206: iload         5
     208: istore        11
     210: goto          395
     213: aload         13
     215: iconst_0
     216: invokevirtual #140                // Method java/util/regex/Matcher.group:(I)Ljava/lang/String;
     219: invokestatic  #144                // Method isValidLocationName:(Ljava/lang/String;)Z
     222: ifeq          241
     225: iconst_0
     226: istore_3
     227: iconst_1
     228: istore        10
     230: iload         4
     232: istore        12
     234: iload         5
     236: istore        11
     238: goto          395
     241: iload         9
     243: iconst_5
     244: if_icmpne     261
     247: iload         6
     249: ifne          261
     252: aload         13
     254: invokevirtual #121                // Method java/util/regex/Matcher.end:()I
     257: istore_2
     258: goto          428
     261: iload         5
     263: istore_3
     264: iload         6
     266: ifeq          380
     269: iload         5
     271: istore_3
     272: iload         9
     274: iconst_4
     275: if_icmple     380
     278: aload_0
     279: iload_2
     280: invokestatic  #147                // Method matchState:(Ljava/lang/String;I)Ljava/util/regex/MatchResult;
     283: astore        14
     285: iload         5
     287: istore_3
     288: aload         14
     290: ifnull        380
     293: aload_1
     294: ldc           #149                // String et
     296: invokevirtual #153                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     299: ifeq          329
     302: aload         14
     304: iconst_0
     305: invokeinterface #154,  2          // InterfaceMethod java/util/regex/MatchResult.group:(I)Ljava/lang/String;
     310: ldc           #156                // String al
     312: invokevirtual #153                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     315: ifeq          329
     318: aload         14
     320: invokeinterface #103,  1          // InterfaceMethod java/util/regex/MatchResult.end:()I
     325: istore_2
     326: goto          428
     329: getstatic     #72                 // Field sWordRe:Ljava/util/regex/Pattern;
     332: aload_0
     333: invokevirtual #107                // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
     336: astore_1
     337: aload_1
     338: aload         14
     340: invokeinterface #103,  1          // InterfaceMethod java/util/regex/MatchResult.end:()I
     345: invokevirtual #120                // Method java/util/regex/Matcher.find:(I)Z
     348: ifeq          372
     351: iload         5
     353: istore_3
     354: aload_1
     355: iconst_0
     356: invokevirtual #140                // Method java/util/regex/Matcher.group:(I)Ljava/lang/String;
     359: aload         14
     361: invokestatic  #160                // Method isValidZipCode:(Ljava/lang/String;Ljava/util/regex/MatchResult;)Z
     364: ifeq          380
     367: aload_1
     368: invokevirtual #121                // Method java/util/regex/Matcher.end:()I
     371: ireturn
     372: aload         14
     374: invokeinterface #103,  1          // InterfaceMethod java/util/regex/MatchResult.end:()I
     379: istore_3
     380: iconst_0
     381: istore_2
     382: iload_3
     383: istore        11
     385: iload         4
     387: istore        12
     389: iload         6
     391: istore        10
     393: iload_2
     394: istore_3
     395: aload         13
     397: iconst_0
     398: invokevirtual #140                // Method java/util/regex/Matcher.group:(I)Ljava/lang/String;
     401: astore_1
     402: aload         13
     404: invokevirtual #121                // Method java/util/regex/Matcher.end:()I
     407: istore_2
     408: iload_3
     409: istore        7
     411: iload         10
     413: istore        6
     415: iload         12
     417: istore        4
     419: iload         11
     421: istore        5
     423: iload_2
     424: istore_3
     425: goto          37
     428: iload         5
     430: ifle          436
     433: iload         5
     435: ireturn
     436: iload         4
     438: ifle          447
     441: iload         4
     443: istore_2
     444: goto          447
     447: iload_2
     448: ineg
     449: ireturn

  private static boolean checkHouseNumber(java.lang.String);
    Code:
       0: iconst_0
       1: istore_1
       2: iconst_0
       3: istore_3
       4: iload_1
       5: aload_0
       6: invokevirtual #114                // Method java/lang/String.length:()I
       9: if_icmpge     37
      12: iload_3
      13: istore_2
      14: aload_0
      15: iload_1
      16: invokevirtual #128                // Method java/lang/String.charAt:(I)C
      19: invokestatic  #167                // Method java/lang/Character.isDigit:(C)Z
      22: ifeq          29
      25: iload_3
      26: iconst_1
      27: iadd
      28: istore_2
      29: iinc          1, 1
      32: iload_2
      33: istore_3
      34: goto          4
      37: iload_3
      38: iconst_5
      39: if_icmple     44
      42: iconst_0
      43: ireturn
      44: getstatic     #88                 // Field sSuffixedNumberRe:Ljava/util/regex/Pattern;
      47: aload_0
      48: invokevirtual #107                // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      51: astore_0
      52: aload_0
      53: invokevirtual #170                // Method java/util/regex/Matcher.find:()Z
      56: ifeq          184
      59: aload_0
      60: iconst_1
      61: invokevirtual #140                // Method java/util/regex/Matcher.group:(I)Ljava/lang/String;
      64: invokestatic  #176                // Method java/lang/Integer.parseInt:(Ljava/lang/String;)I
      67: istore_1
      68: iload_1
      69: ifne          74
      72: iconst_0
      73: ireturn
      74: aload_0
      75: iconst_2
      76: invokevirtual #140                // Method java/util/regex/Matcher.group:(I)Ljava/lang/String;
      79: invokestatic  #182                // Method java/util/Locale.getDefault:()Ljava/util/Locale;
      82: invokevirtual #186                // Method java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
      85: astore        4
      87: iload_1
      88: bipush        10
      90: irem
      91: istore_2
      92: ldc           #188                // String th
      94: astore_0
      95: iload_2
      96: iconst_1
      97: if_icmpeq     162
     100: iload_2
     101: iconst_2
     102: if_icmpeq     140
     105: iload_2
     106: iconst_3
     107: if_icmpeq     118
     110: aload         4
     112: ldc           #188                // String th
     114: invokevirtual #153                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     117: ireturn
     118: iload_1
     119: bipush        100
     121: irem
     122: bipush        13
     124: if_icmpne     130
     127: goto          133
     130: ldc           #190                // String rd
     132: astore_0
     133: aload         4
     135: aload_0
     136: invokevirtual #153                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     139: ireturn
     140: iload_1
     141: bipush        100
     143: irem
     144: bipush        12
     146: if_icmpne     152
     149: goto          155
     152: ldc           #192                // String nd
     154: astore_0
     155: aload         4
     157: aload_0
     158: invokevirtual #153                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     161: ireturn
     162: iload_1
     163: bipush        100
     165: irem
     166: bipush        11
     168: if_icmpne     174
     171: goto          177
     174: ldc           #194                // String st
     176: astore_0
     177: aload         4
     179: aload_0
     180: invokevirtual #153                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     183: ireturn
     184: iconst_1
     185: ireturn

  static java.lang.String findAddress(java.lang.String);
    Code:
       0: getstatic     #76                 // Field sHouseNumberRe:Ljava/util/regex/Pattern;
       3: aload_0
       4: invokevirtual #107                // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
       7: astore_3
       8: iconst_0
       9: istore_1
      10: aload_3
      11: iload_1
      12: invokevirtual #120                // Method java/util/regex/Matcher.find:(I)Z
      15: ifeq          65
      18: aload_3
      19: iconst_0
      20: invokevirtual #140                // Method java/util/regex/Matcher.group:(I)Ljava/lang/String;
      23: invokestatic  #198                // Method checkHouseNumber:(Ljava/lang/String;)Z
      26: ifeq          57
      29: aload_3
      30: invokevirtual #124                // Method java/util/regex/Matcher.start:()I
      33: istore_1
      34: aload_0
      35: aload_3
      36: invokestatic  #200                // Method attemptMatch:(Ljava/lang/String;Ljava/util/regex/MatchResult;)I
      39: istore_2
      40: iload_2
      41: ifle          51
      44: aload_0
      45: iload_1
      46: iload_2
      47: invokevirtual #204                // Method java/lang/String.substring:(II)Ljava/lang/String;
      50: areturn
      51: iload_2
      52: ineg
      53: istore_1
      54: goto          10
      57: aload_3
      58: invokevirtual #121                // Method java/util/regex/Matcher.end:()I
      61: istore_1
      62: goto          10
      65: aconst_null
      66: areturn

  public static boolean isValidLocationName(java.lang.String);
    Code:
       0: getstatic     #84                 // Field sLocationNameRe:Ljava/util/regex/Pattern;
       3: aload_0
       4: invokevirtual #107                // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
       7: invokevirtual #207                // Method java/util/regex/Matcher.matches:()Z
      10: ireturn

  public static boolean isValidZipCode(java.lang.String);
    Code:
       0: getstatic     #92                 // Field sZipCodeRe:Ljava/util/regex/Pattern;
       3: aload_0
       4: invokevirtual #107                // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
       7: invokevirtual #207                // Method java/util/regex/Matcher.matches:()Z
      10: ireturn

  public static boolean isValidZipCode(java.lang.String, java.lang.String);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_0
       3: invokestatic  #147                // Method matchState:(Ljava/lang/String;I)Ljava/util/regex/MatchResult;
       6: invokestatic  #160                // Method isValidZipCode:(Ljava/lang/String;Ljava/util/regex/MatchResult;)Z
       9: ireturn

  private static boolean isValidZipCode(java.lang.String, java.util.regex.MatchResult);
    Code:
       0: iconst_0
       1: istore        5
       3: aload_1
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_1
      10: invokeinterface #211,  1          // InterfaceMethod java/util/regex/MatchResult.groupCount:()I
      15: istore_2
      16: iload_2
      17: istore_3
      18: iload_2
      19: ifle          44
      22: iload_2
      23: iconst_1
      24: isub
      25: istore_3
      26: aload_1
      27: iload_2
      28: invokeinterface #154,  2          // InterfaceMethod java/util/regex/MatchResult.group:(I)Ljava/lang/String;
      33: ifnull        39
      36: goto          44
      39: iload_3
      40: istore_2
      41: goto          16
      44: iload         5
      46: istore        4
      48: getstatic     #92                 // Field sZipCodeRe:Ljava/util/regex/Pattern;
      51: aload_0
      52: invokevirtual #107                // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      55: invokevirtual #207                // Method java/util/regex/Matcher.matches:()Z
      58: ifeq          80
      61: iload         5
      63: istore        4
      65: getstatic     #62                 // Field sStateZipCodeRanges:[Landroidx/core/text/util/FindAddress$ZipRange;
      68: iload_3
      69: aaload
      70: aload_0
      71: invokevirtual #213                // Method androidx/core/text/util/FindAddress$ZipRange.matches:(Ljava/lang/String;)Z
      74: ifeq          80
      77: iconst_1
      78: istore        4
      80: iload         4
      82: ireturn

  public static java.util.regex.MatchResult matchHouseNumber(java.lang.String, int);
    Code:
       0: iload_1
       1: ifle          22
       4: ldc           #20                 // String :,\"'\t                　\n\r  
       6: aload_0
       7: iload_1
       8: iconst_1
       9: isub
      10: invokevirtual #128                // Method java/lang/String.charAt:(I)C
      13: invokevirtual #132                // Method java/lang/String.indexOf:(I)I
      16: iconst_m1
      17: if_icmpne     22
      20: aconst_null
      21: areturn
      22: getstatic     #76                 // Field sHouseNumberRe:Ljava/util/regex/Pattern;
      25: aload_0
      26: invokevirtual #107                // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      29: iload_1
      30: aload_0
      31: invokevirtual #114                // Method java/lang/String.length:()I
      34: invokevirtual #217                // Method java/util/regex/Matcher.region:(II)Ljava/util/regex/Matcher;
      37: astore_0
      38: aload_0
      39: invokevirtual #220                // Method java/util/regex/Matcher.lookingAt:()Z
      42: ifeq          65
      45: aload_0
      46: invokevirtual #224                // Method java/util/regex/Matcher.toMatchResult:()Ljava/util/regex/MatchResult;
      49: astore_0
      50: aload_0
      51: iconst_0
      52: invokeinterface #154,  2          // InterfaceMethod java/util/regex/MatchResult.group:(I)Ljava/lang/String;
      57: invokestatic  #198                // Method checkHouseNumber:(Ljava/lang/String;)Z
      60: ifeq          65
      63: aload_0
      64: areturn
      65: aconst_null
      66: areturn

  public static java.util.regex.MatchResult matchState(java.lang.String, int);
    Code:
       0: aconst_null
       1: astore_2
       2: iload_1
       3: ifle          24
       6: ldc           #37                 // String ,*•\t                　\n\r  
       8: aload_0
       9: iload_1
      10: iconst_1
      11: isub
      12: invokevirtual #128                // Method java/lang/String.charAt:(I)C
      15: invokevirtual #132                // Method java/lang/String.indexOf:(I)I
      18: iconst_m1
      19: if_icmpne     24
      22: aconst_null
      23: areturn
      24: getstatic     #80                 // Field sStateRe:Ljava/util/regex/Pattern;
      27: aload_0
      28: invokevirtual #107                // Method java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      31: iload_1
      32: aload_0
      33: invokevirtual #114                // Method java/lang/String.length:()I
      36: invokevirtual #217                // Method java/util/regex/Matcher.region:(II)Ljava/util/regex/Matcher;
      39: astore_3
      40: aload_2
      41: astore_0
      42: aload_3
      43: invokevirtual #220                // Method java/util/regex/Matcher.lookingAt:()Z
      46: ifeq          54
      49: aload_3
      50: invokevirtual #224                // Method java/util/regex/Matcher.toMatchResult:()Ljava/util/regex/MatchResult;
      53: astore_0
      54: aload_0
      55: areturn
}
