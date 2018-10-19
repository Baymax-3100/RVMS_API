package me.masumhasan.rvms_api

import java.security.KeyPair
import java.security.KeyStore
import java.security.PrivateKey
import java.security.PublicKey

class RSAAuthentication {

    public static KeyPair getKeyPairFromKeyStore() throws Exception {
        InputStream ins = RSAAuthentication.class.getResourceAsStream("/rvms.jks");

        KeyStore keyStore = KeyStore.getInstance("JCEKS");
        keyStore.load(ins, "s3cr3t".toCharArray());   //Keystore password
        KeyStore.PasswordProtection keyPassword =       //Key password
                new KeyStore.PasswordProtection("s3cr3t".toCharArray());

        KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry("rvms", keyPassword);

        java.security.cert.Certificate cert = keyStore.getCertificate("rvms");
        PublicKey publicKey = cert.getPublicKey();
        PrivateKey privateKey = privateKeyEntry.getPrivateKey();

        return new KeyPair(publicKey, privateKey);
    }
}
