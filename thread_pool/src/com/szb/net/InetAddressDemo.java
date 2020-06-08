package com.szb.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author ww
 * @date 2020/6/4 10:58
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        InetAddress byName = InetAddress.getByName("DESKTOP-0M41KNV");
        System.out.println(byName);
    }
}
