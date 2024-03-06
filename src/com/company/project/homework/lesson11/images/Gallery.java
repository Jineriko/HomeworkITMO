package com.company.project.homework.lesson11.images;

import java.util.Arrays;
import java.util.Date;

public class Gallery implements Drawable, Cloneable {
    private String name;
    private Drawable[] drawables;

    public Gallery(String name, Drawable[] drawables) {
        this.drawables = drawables;
        this.name = name;
    }

    public Drawable[] getImages() {
        return drawables;
    }

    @Override
    public void draw() {
        System.out.println(name);
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }

    @Override
    public Gallery clone(){
        try {
            Gallery clonedGallery = (Gallery) super.clone();
            Drawable[] temp = getImages();
            for (int i = 0; i < drawables.length; i++){
                clonedGallery.drawables[i] = temp[i];
            }
            return clonedGallery;
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование не поддерживается");
            return null;
        }
    }
}