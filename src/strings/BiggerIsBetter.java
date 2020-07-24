package strings;

import java.util.*;


public class BiggerIsBetter {

    static String biggerIsGreater(String w) {
        char[] chars = w.toCharArray();
        int cursor = w.length() - 2;
        while (cursor != -1) {
            for (int i = w.length() - 1; i > cursor; i--) {
                for (int j = i - 1; j >= cursor; j--) {
                    if (w.charAt(i) > w.charAt(j)) {
                        chars[i] = chars[j];
                        return w.substring(0, j) + w.charAt(i) + findSmallestValue(chars, j + 1, w.length());
                    }
                }
            }
            cursor--;
        }
        return "no answer";
    }

    private static String findSmallestValue(char[] chars, int j, int length) {
        quickSort(chars, j, length - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = j; i < length; i++) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    private static void quickSort(char[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    private static int partition(char[] unsorted, int low, int high) {
        int smallestElementIndex = low - 1;
        char pivotAsString = unsorted[high];
        for (int i = low; i < high; i++) {

            if (unsorted[i] < pivotAsString) {
                smallestElementIndex++;
                swap(smallestElementIndex, i, unsorted);
            }
        }
        smallestElementIndex++;
        swap(smallestElementIndex, high, unsorted);
        return smallestElementIndex;


    }

    private static void swap(int i, int j, char[] array) {
        char tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
//        System.out.println(biggerIsGreater("ehdegnmorgafrjxvksc")); // ehdegnmorgafrjxvsck
//        System.out.println(biggerIsGreater("dkhc") + " hcdk"); // xvsck
        System.out.println(biggerIsGreater("ehdegnmorgafrjxvksc") + " ehdegnmorgafrjxvsck"); // xvsck

//        "ehdegnmorgcafjkrsvx"
//        System.out.println(biggerIsGreater("aksc") + " asck"); // xvsck
        /*System.out.println(biggerIsGreater("tydwixlwghlmqo"));
        System.out.println(biggerIsGreater("wddnwjneaxbwhwamr"));
        System.out.println(biggerIsGreater("pnimbesirfbivxl"));
        System.out.println(biggerIsGreater("mijamkzpiiniveik"));
        System.out.println(biggerIsGreater("qxtwpdpwexuej"));
        System.out.println(biggerIsGreater("qtcshorwyck"));
        System.out.println(biggerIsGreater("xoojiggdcyjrupr"));
        System.out.println(biggerIsGreater("vcjmvngcdyabcmjz"));
        System.out.println(biggerIsGreater("xildrrhpca"));
        System.out.println(biggerIsGreater("rrcntnbqchsfhvijh"));
        System.out.println(biggerIsGreater("kmotatmrabtcomu"));
        System.out.println(biggerIsGreater("bnfcejmyotvw"));
        System.out.println(biggerIsGreater("dnppdkpywiaxddoqx"));
        System.out.println(biggerIsGreater("tmowsxkrodmkkra"));
        System.out.println(biggerIsGreater("jfkaehlegohwggf"));
        System.out.println(biggerIsGreater("ttylsiegnttymtyx"));
        System.out.println(biggerIsGreater("kyetllczuyibdkwyihrq"));
        System.out.println(biggerIsGreater("xdhqbvlbtmmtshefjf"));
        System.out.println(biggerIsGreater("kpdpzzohihzwgdfzgb"));
        System.out.println(biggerIsGreater("kuywptftapaa"));
        System.out.println(biggerIsGreater("qfqpegznnyludrv"));
        System.out.println(biggerIsGreater("ufwogufbzaboaepslikq"));
        System.out.println(biggerIsGreater("jfejqapjvbdcxtkry"));
        System.out.println(biggerIsGreater("sypjbvatgidyxodd"));
        System.out.println(biggerIsGreater("wdpfyqjcpcn"));
        System.out.println(biggerIsGreater("baabpjckkytudr"));
        System.out.println(biggerIsGreater("uvwurzjyzbhcqmrypraq"));
        System.out.println(biggerIsGreater("kvtwtmqygksbim"));
        System.out.println(biggerIsGreater("ivsjycnooeodwpt"));
        System.out.println(biggerIsGreater("zqyxjnnitzawipqsm"));
        System.out.println(biggerIsGreater("blmrzavodtfzyepz"));
        System.out.println(biggerIsGreater("bmqlhqndacv"));
        System.out.println(biggerIsGreater("phvauobwkrcfwdecsd"));
        System.out.println(biggerIsGreater("vpygyqubqywkndhpzw"));
        System.out.println(biggerIsGreater("yikanhdrjxw"));
        System.out.println(biggerIsGreater("vnpblfxmvwkflqobrk"));
        System.out.println(biggerIsGreater("pserilwzxwyorldsxksl"));
        System.out.println(biggerIsGreater("qymbqaehnyzhfqpqprpl"));
        System.out.println(biggerIsGreater("fcakwzuqlzglnibqmkd"));
        System.out.println(biggerIsGreater("jkscckttaeifiksgkmxx"));
        System.out.println(biggerIsGreater("dkbllravwnhhfjjrce"));
        System.out.println(biggerIsGreater("imzsyrykfvjt"));
        System.out.println(biggerIsGreater("tvogoocldlukwfcajvix"));
        System.out.println(biggerIsGreater("cvnagtypozljpragvlj"));
        System.out.println(biggerIsGreater("hwcmacxvmus"));
        System.out.println(biggerIsGreater("rhrzcpprqccf"));
        System.out.println(biggerIsGreater("clppxvwtaktchqrdif"));
        System.out.println(biggerIsGreater("qwusnlldnolhq"));
        System.out.println(biggerIsGreater("yitveovrja"));
        System.out.println(biggerIsGreater("arciyxaxtvmfgquwb"));
        System.out.println(biggerIsGreater("pzbxvxdjuuvuv"));
        System.out.println(biggerIsGreater("nxfowilpdxwlpt"));
        System.out.println(biggerIsGreater("swzsaynxbytytqtq"));
        System.out.println(biggerIsGreater("qyrogefleeyt"));
        System.out.println(biggerIsGreater("iotjgthvslvmjpcchhuf"));
        System.out.println(biggerIsGreater("knfpyjtzfq"));
        System.out.println(biggerIsGreater("tmtbfayantmwk"));
        System.out.println(biggerIsGreater("asxwzygngwn"));
        System.out.println(biggerIsGreater("rmwiwrurubt"));
        System.out.println(biggerIsGreater("bhmpfwhgqfcqfldlhs"));
        System.out.println(biggerIsGreater("yhbidtewpgp"));
        System.out.println(biggerIsGreater("jwwbeuiklpodvzii"));
        System.out.println(biggerIsGreater("anjhprmkwibe"));
        System.out.println(biggerIsGreater("lpwhqaebmr"));
        System.out.println(biggerIsGreater("dunecynelymcpyonjq"));
        System.out.println(biggerIsGreater("hblfldireuivzekegit"));
        System.out.println(biggerIsGreater("uryygzpwifrricwvge"));
        System.out.println(biggerIsGreater("kzuhaysegaxtwqtvx"));
        System.out.println(biggerIsGreater("kvarmrbpoxxujhvgpw"));
        System.out.println(biggerIsGreater("hanhaggqzdpunkugzmhq"));
        System.out.println(biggerIsGreater("gnwqwsylqeuqr"));
        System.out.println(biggerIsGreater("qzkjbnyvclrkmdtc"));
        System.out.println(biggerIsGreater("argsnaqbquv"));
        System.out.println(biggerIsGreater("obbnlkoaklcx"));
        System.out.println(biggerIsGreater("ojiilqieycsasvqosycu"));
        System.out.println(biggerIsGreater("qhlgiwsmtxbffjsxt"));
        System.out.println(biggerIsGreater("vvrvnmndeogyp"));
        System.out.println(biggerIsGreater("ibeqzyeuvfzb"));
        System.out.println(biggerIsGreater("sajpyegttujxyx"));
        System.out.println(biggerIsGreater("zmdjphzogfldlkgbchnt"));
        System.out.println(biggerIsGreater("tbanvjmwirxx"));
        System.out.println(biggerIsGreater("gmdhdlmopzyvddeqyjja"));
        System.out.println(biggerIsGreater("yxvmvedubzcpd"));
        System.out.println(biggerIsGreater("soygdzhbckfuk"));
        System.out.println(biggerIsGreater("gkbekyrhcwc"));
        System.out.println(biggerIsGreater("wevzqpnqwtpfu"));
        System.out.println(biggerIsGreater("rbobquotbysufwqjeo"));
        System.out.println(biggerIsGreater("bpgqfwoyntuhkvwo"));
        System.out.println(biggerIsGreater("schtabphairewhfmp"));
        System.out.println(biggerIsGreater("rlmrahlisggguykeu"));
        System.out.println(biggerIsGreater("fjtfrmlqvsekq"));*/
    }
}




































