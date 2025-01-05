package com.example.list_viewtp;



public class Item {
    private final int imageResId;
    private final String text;
    private final int iconId;
    public Item(int imageResId, String text,int iconId) {
        this.imageResId = imageResId;
        this.text = text;
        this.iconId=iconId;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getText() {
        return text;
    }
    public int getIconId() {
        return iconId;
    }

}

