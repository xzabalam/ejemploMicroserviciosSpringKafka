package com.microservices.demo;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;

/**
 * Hello world!
 *
 */
public class ProbarJasypt {
    public static void main( String[] args ) {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        standardPBEStringEncryptor.setPassword("Demo_Pwd!2020");
        standardPBEStringEncryptor.setAlgorithm("PBEWITHHMACSHA512ANDAES_256");
        standardPBEStringEncryptor.setIvGenerator(new RandomIvGenerator());

        String result = standardPBEStringEncryptor.encrypt("springCloud_Pwd!");
        System.out.println(result);
        System.out.println(standardPBEStringEncryptor.decrypt(result));

    }
}
