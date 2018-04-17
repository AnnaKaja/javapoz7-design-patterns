package com.sda.chain;

import com.sun.org.apache.xpath.internal.SourceTree;

public class PoliceChainItem implements ChainItem {

    @Override
    public boolean isMyResponsibility(String value) {
        return "crime".equals(value);
    }

    @Override
    public void action(String value) {
        System.out.println("action for police");

    }
}
