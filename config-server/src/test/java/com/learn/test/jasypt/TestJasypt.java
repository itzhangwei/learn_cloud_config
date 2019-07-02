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
        String encrypt = encryptor.encrypt("~2Ga22K@Ah?g%+)-#>..");
        System.out.println(encrypt);
    }
}
