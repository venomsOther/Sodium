package me.jellysquid.mods.sodium.client.util;

public class ColorUtil {
    private static final float NORM_RGB = 1.0f / 255.0f;

    public static int encodeRGB(int r, int g, int b) {
        return 0xFF000000 | (b & 0xFF) << 16 | (g & 0xFF) << 8 | (r & 0xFF);
    }

    public static int mulPackedRGB(int color, float rw, float gw, float bw) {
        float r = unpackColorR(color) * rw;
        float g = unpackColorG(color) * gw;
        float b = unpackColorB(color) * bw;

        return encodeRGB((int) r, (int) g, (int) b);
    }

    public static int mulPacked(int color, float w) {
        float r = unpackColorR(color) * w;
        float g = unpackColorG(color) * w;
        float b = unpackColorB(color) * w;

        return encodeRGB((int) r, (int) g, (int) b);
    }

    public static float unpackColorR(int color) {
        return color >> 16 & 0xFF;
    }

    public static float unpackColorG(int color) {
        return color >> 8 & 0xFF;
    }

    public static float unpackColorB(int color) {
        return color & 0xFF;
    }

    public static float normalize(float v) {
        return v * NORM_RGB;
    }
}
