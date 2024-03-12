package main.groovy.com.knowmadmood.ejb

import java.util.Base64

class KnowMadMoodEJB implements Serializable {
    public static String decodeBase64(String encodedString) {
        return new String(Base64.getDecoder().decode(encodedString), "UTF-8")
    }

    public static String encodeBase64(String stringInRaw) {
        return Base64.getEncoder().encodeToString(stringInRaw.getBytes("UTF-8"));
    }
}