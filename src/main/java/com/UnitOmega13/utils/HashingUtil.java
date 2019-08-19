package com.UnitOmega13.utils;

import org.apache.log4j.Logger;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingUtil {
    private static final Logger logger = Logger.getLogger(HashingUtil.class);

    public static String hashPassword (String originalPassword) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            logger.error("Error loading SHA-256", e);
        }
        byte[] encodedHash = new byte[0];
        if (messageDigest != null) {
            encodedHash = messageDigest.digest(originalPassword.getBytes(StandardCharsets.UTF_8));
        }
        return bytesToHex(encodedHash);
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) stringBuilder.append('0');
            stringBuilder.append(hex);
        }
        return stringBuilder.toString();
    }
}
