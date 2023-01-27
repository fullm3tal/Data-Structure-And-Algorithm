package leetcode.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonWordsOnce {

    public static void main(String[] args) {

//        String[] words1 = {"smcomxxvtsotqngxxldyoxo", "tcxfeznjsgsquqklenphloveasywmv", "kfxvwpnwyffaxgibcxwtgcxddo", "wvivfkgkheryfqx", "umjmsgcrzo", "ikbvacrj", "bdzbzrdbyumsptuetevnhzwgb", "qgcjbtbqfrwsocjfqgvrozstp", "jduuuzzdrsbdndlkisrspbycmj", "pisnvr", "ipbmqffwekjl", "ldbyqwurbvyzmvgwgsxdj", "nyaefxahkmdm", "hhuflpvumobuuzuercvlw", "mfoyxlhtcfyar", "nefsokwec", "yzzgmxtyle", "jxcrnblqwadyqevgvqhnztoiphsrs", "oqbqrfhufwaiwxfkov", "mcghyabenczdspsivksv", "zpeayobcipsdnycnptcd", "sqztsketgkrmezootgzcqr", "hq", "cqqqcxrtmgqnywqhx", "lscuujbwxlh", "xqbpvxtsuyydrbjx", "hggfsqfuudjimjjgnomrrz", "tqgadencifvdphzw", "mtywqxodbwsmrkojvyqtfuqc", "ppq", "hfkdcu", "yipp", "wkmrrogotfllbvripwixqe", "yjtcpbgrjghaiwqtqukvwjbb", "ct", "s", "ybilrwcmrn", "dopaausptdreximhtds", "ivbies", "rxgahbmevygrvitqiruxopnercv", "auuld", "dljjllgqdngydailtkyg", "zyeirhugljqaugmygxqk", "zvieesaqwfwwoqgixvmblzyc", "nbxnghyq", "xykawah", "orbsmwdgxqwipipzffmskz", "sejczezlhbaliorkboiizjzmojrufq", "bz", "nlrehvrvmwthdrjvkoxbpucsome", "siphinewshfadvvjdnauynhuofc", "gdpxajc", "cteppnippqqrwnumpcoqip", "kdjyrwljnmcwtlybuby", "zjgfvhqatvxaupzinqdsxol", "zszyiz", "ybfdjsxotyngxkhtqszpgfercs", "cdmdwmmukbmzohadebhzqisdt", "xrfk", "pxouqhlfkeefibrbb", "xzyrnexkoazjjrlcvydq", "jkskeusjzrjemhyahn", "j", "ngmrmkqsyucpofqqyrxnldrhahjckp", "vuwgsdnnxxhdurlqjwbzw", "mnoinjbklnwqglx", "rpdfzgumenfsisiztotcuemnhgh", "hgcesetleogeqvafsthqxdjrrxo", "yhaupioffigb", "suqgblntlxfbcuwu", "qemlelmzgotjjfheocjbxqjzjkxkri", "bymvoptxiqfcfagv", "rsxmrumrgmaqmnvvdfidpqqqtmxtkb", "svmbft", "jjurvpzfmglhleiybtrcqghhwtsr", "jkpozhxkdcicqhspmzhxbcwlerpvx", "xbixcfoeiqmdp", "uzuqvrsvozzzouvfcjndxuvegse", "yoetzkzcmxass", "eyvtzotvsmrygeta", "riywqxospqbrwvrzaubvfycpr", "kkqciqehzcdjj", "hkzmmhvqrtvlxspvluim", "bbiwsdqlvdnenwgldrrphub", "ubkdlkbrdftlvlhtdzhj", "zglzrdyilpdgjb", "ljenyjxtkpfkvinruufml", "jcanrsbuogdkzbioiifevhhopac", "vlqtfu", "vnpsdbxvqlyrtuhokixalnwpxoe", "cjlllx", "pelemxhmehqfo"};
//        String[] words2 = {"l", "uvmgfwmgtwbmgrd", "kfxvwpnwyffaxgibcxwtgcxddo", "wvivfkgkheryfqx", "umjmsgcrzo", "ikbvacrj", "mzoqxhoubtajzvng", "qgcjbtbqfrwsocjfqgvrozstp", "rpukxohalsvwz", "zdujsznjxexmsrrv", "ipbmqffwekjl", "tznjcmkvgptshyqexhpcpgfsoskhaq", "nyaefxahkmdm", "hhuflpvumobuuzuercvlw", "mfoyxlhtcfyar", "nefsokwec", "yzzgmxtyle", "jxcrnblqwadyqevgvqhnztoiphsrs", "ad", "mcghyabenczdspsivksv", "zpeayobcipsdnycnptcd", "ngaioqmsufaqrxplmshi", "hq", "cqqqcxrtmgqnywqhx", "ujyqrnbmavptinajyknwdwqhzhzwr", "vullymwbqfwadmfsrwiorry", "riclljgu", "pcdlmhphitdznkgnxil", "gxcebcrqolcmci", "ppq", "lqqgr", "kfuzoqa", "rwhawdt", "yjtcpbgrjghaiwqtqukvwjbb", "ecaw", "nqixvtuusgpkscejca", "eknfdo", "dopaausptdreximhtds", "ivbies", "dwshb", "pffwnzadwrjysoxmpsn", "dljjllgqdngydailtkyg", "zpcwdkbfm", "zvieesaqwfwwoqgixvmblzyc", "nbxnghyq", "kfehsw", "orbsmwdgxqwipipzffmskz", "teqtmzdrvfipdc", "vjv", "rdbhmuawgzdnkmyxh", "siphinewshfadvvjdnauynhuofc", "gdpxajc", "l", "kdjyrwljnmcwtlybuby", "zjgfvhqatvxaupzinqdsxol", "faaimuyztarbo", "slfsgrlqvub", "bxgt", "xrfk", "pxouqhlfkeefibrbb", "xzyrnexkoazjjrlcvydq", "rqgo", "gfyljoodostrjhjnamrovweyy", "wqymwwxmjbhbyezbt", "vuwgsdnnxxhdurlqjwbzw", "mnoinjbklnwqglx", "dqxxvqonk", "hgcesetleogeqvafsthqxdjrrxo", "yhaupioffigb", "suqgblntlxfbcuwu", "qemlelmzgotjjfheocjbxqjzjkxkri", "sgsjnowgwri", "pvsdgtwjtqwsf", "svmbft", "jzqlrhejgzm"};
//
////        String[] words1 = {"a","ab"};
////        String[] words2 ={"a","a","a","ab"};
//
        String[] words1 = {"b","bb","bbb"};
        String[] words2 ={"a","aa","aaa"};
//        String[] words1 = new String[]{"leetcode", "is", "amazing", "as", "is"};
//        String[] words2 = {"amazing", "leetcode", "is"};
        System.out.println(countWords2(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> maps = new HashMap<>();
        for (int i = 0; i < words1.length; i++) {
            int value = maps.getOrDefault(words1[i], 0);
            maps.put(words1[i], value + 1);
            if (value + 1 > 1) {
                maps.put(words1[i], value + Integer.MIN_VALUE);
            }
        }
        for (int j = 0; j < words2.length; j++) {
            if (maps.getOrDefault(words2[j], 0) >= 1) {
                maps.put(words2[j], maps.getOrDefault(words2[j], 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> map : maps.entrySet()) {
            if (map.getValue() == 2) {
                count++;
            }
        }
        return count;
    }

    public static int countWords2(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> maps = new HashMap<>();
        String  s;
        for (int i = 0; i < words1.length; i++) {
            s = words1[i];
            int value = maps.getOrDefault(s, 0);
            maps.put(s, value + 1);
            if (value + 1 > 1) {
                maps.put(s, value + Integer.MIN_VALUE);
            }
        }
        for (int j = 0; j < words2.length; j++) {
            s = words2[j];
            int value = maps.getOrDefault(s, 0);
            if (value == 1) {
                count++;
                maps.put(s, value + 1);
            }
            if(value > 1) {
                maps.remove(s);
                count--;
            }
        }
        return count;
    }

}
