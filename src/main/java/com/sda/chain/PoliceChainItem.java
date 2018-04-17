package com.sda.chain;

import com.sun.org.apache.xpath.internal.SourceTree;

public class PoliceChainItem implements ChainItem {

    @Override
    public boolean isMyResponsibility(String value) {
        return value.contains("crime");
    }

    @Override
    public void action(String value) {
        System.out.println("action for police");

    }
}
