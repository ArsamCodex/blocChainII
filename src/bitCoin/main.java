//package bitCoin;
//
//import java.io.UnsupportedEncodingException;
//import java.math.BigDecimal;
//import java.math.BigInteger;
//import java.nio.charset.StandardCharsets;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//
//public class main {
//
//
//    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
//
//
//        int difficulty = 1;
//        String newHash = mine(2, "", "00000000839a8e6886ab5951d76f411475428afc90947ee320161bbf18eb6048", difficulty);
//        System.out.println(newHash);
//
//
//    }
//
//    public static String sha256(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException {
//        MessageDigest md = MessageDigest.getInstance("SHA-256");
//
//        byte[] hash = md.digest(input.getBytes(StandardCharsets.UTF_8));
//        return convertByteArrayToHexString(hash);
//    }
//
//    private static String convertByteArrayToHexString(byte[] arrayBytes) {
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = 0; i < arrayBytes.length; i++) {
//            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
//                    .substring(1));
//        }
//        return stringBuffer.toString();
//    }
//
//    private static String mine(int blockNumber, String transaction, String previousHash, int prefexZero) throws UnsupportedEncodingException, NoSuchAlgorithmException {
//
//
//
////        BigInteger nonce = BigInteger.valueOf(2573394689L);
////        int nonce = 0;
//
//
//////        BigInteger:
////        for (BigInteger bi = BigInteger.valueOf(1);
////             bi.compareTo(b) <= 0;
////             bi = bi.add(BigInteger.ONE))
//////
//
//
//        int nonce = 0;
//
//        String text = blockNumber + transaction + previousHash + nonce;
//        String newHash = sha256(text);
//        return newHash;
//    }
//
//
//}
