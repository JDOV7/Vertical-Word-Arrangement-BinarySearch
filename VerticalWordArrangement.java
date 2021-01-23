/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

//s = "ab c"
public class VerticalWordArrangement {

    public void VerticalWordArrangement() {
        String s = "abc def ghij";
        String sSplit[] = s.split(" ");
        int iSizeMax = 0;
        String sArrSpliteds[];
        for (String string : sSplit) {
            if (string.length() > iSizeMax) {
                iSizeMax = string.length();
            }
        }
        sArrSpliteds = new String[iSizeMax];
        for (int i = 0; i < iSizeMax; i++) {
            StringBuilder sNewWord = new StringBuilder();
            for (String string : sSplit) {
                if (string.length() > i) {
                    sNewWord.append(string.charAt(i));
                } else {
                    sNewWord.append(" ");
                }
            }
            if (sNewWord.lastIndexOf(" ") == sNewWord.length() - 1) {
                sNewWord = new StringBuilder(purificar(sNewWord.toString()));
            }
            sArrSpliteds[i] = sNewWord.toString();
        }
        for (String sArrSplited : sArrSpliteds) {
            System.out.println(sArrSplited);
        }
    }

    public String purificar(String sValue) {
        StringBuilder sReturn = new StringBuilder(sValue);
        int iSearch = sReturn.lastIndexOf(" ");
        while (iSearch == sReturn.length() - 1) {
            sReturn.deleteCharAt(iSearch);
            iSearch = sReturn.lastIndexOf(" ");
        }
        return sReturn.toString();
    }
}
