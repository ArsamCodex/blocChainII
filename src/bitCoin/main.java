package bitCoin;

import java.io.UnsupportedEncodingException;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class main {


    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {


        StringBuilder newHash = mine(2, "", "0055545839a8e6886ab5951d76f411475428afc90947ee320161bbf18eb6048");



    }

    public static String sha256(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");

        byte[] hash = md.digest(input.getBytes(StandardCharsets.UTF_8));
        return convertByteArrayToHexString(hash);
    }

    private static String convertByteArrayToHexString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
                    .substring(1));
        }
        return stringBuffer.toString();
    }

    public static StringBuilder mine(int blockNumber, String transaction, String previousHash) throws UnsupportedEncodingException, NoSuchAlgorithmException {


        StringBuilder fin = new StringBuilder();


        int nonce = 1;

        for (int i = 0; i < 100; nonce++) {

            String text = blockNumber + transaction + previousHash + nonce;
            String newHash = sha256(text);
            // THIS IS NETWORK DIFFICAULTY IN REAL A GOOD HASH MUST BEGIN WHITH 20 ZERO , U CAN CAHNGE THEM AND RIGHT GUESS 6.5 BITCOIN ?! CHEERS
            if (newHash.startsWith("000000", 0))
                 fin.append(newHash);

            System.out.println(newHash);
            System.out.println(nonce);
            continue;





        }
        return fin;


    }
}


