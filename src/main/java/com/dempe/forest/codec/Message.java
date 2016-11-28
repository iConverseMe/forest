package com.dempe.forest.codec;

import com.dempe.forest.Constants;

/**
 * Created with IntelliJ IDEA.
 * User: Dempe
 * Date: 2016/11/25
 * Time: 16:29
 * To change this template use File | Settings | File Templates.
 */
public class Message {

    private Header header;

    private byte[] payload;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public byte[] getPayload() {
        return payload;
    }

    public void setPayload(byte[] payload) {
        this.payload = payload;
    }

    public byte[] encode(Object message) {
        return new byte[0];
    }

    public Object decode(byte[] buffer) {
        return null;
    }

    public void setRsp(){
        byte rsp = Constants.RSP;
        Byte extend = header.getExtend();
        byte result = (byte) (rsp|extend);
        header.setExtend(rsp);
    }
}
