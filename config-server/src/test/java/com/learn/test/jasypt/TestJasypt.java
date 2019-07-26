package com.learn.test.jasypt;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @author zack.zhang
 * @projectName learn_cloud_config
 * @title TestJasypt
 * @package com.learn.test.jasypt
 * @description
 * @date 2019-07-02 16:15
 */
public class TestJasypt {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("Everything is inferior, only reading is high.");
        // 加密
        String encrypt = encryptor.encrypt("admin");
        System.out.println(encrypt);

        // 解密
        String password = encryptor.decrypt("AQhGAHeiSflZUWUehaYFmA==");
        System.out.println(password);
    }
}
