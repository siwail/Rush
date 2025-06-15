package com.rush;

public class Persik {
    float x;
    float y;
    float speed;
    float xz;
    float w = 120;
    float h = 120;
    float sx = 0;
    float sy = 0;
    float sz = 0;
    float[] tx = new float[20];
    float[] ty = new float[20];
    float[] tz = new float[20];
    float[] ts = new float[20];

    Persik(float x, float y,float speed,float xz) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.xz = xz;
        for (int i = 0; i < tx.length; i += 1) {
            tx[i] = x;
            ty[i] = y;
            tz[i] = xz;
            ts[i] = 0;
        }
    }
}
