package com.company.project.homework.lesson11.images;

public final class Editor implements Cloneable {
    private Drawable drawable;

    public Editor(Drawable drawable) {
        setDrawable(drawable);
    }

    public void setDrawable(final Drawable drawable) {
        this.drawable = drawable;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void show() {
        drawable.draw();
    }

    @Override
    public Editor clone() throws CloneNotSupportedException {
        Editor editorCloned = (Editor) super.clone();
        editorCloned.setDrawable(getDrawable().clone());
//        Drawable clonedImage = (Image) super.clone();
//        Drawable clonedGallery = (Gallery) super.clone();
//        editorCloned.drawable = (Drawable) super.clone();

//        if (getDrawable() instanceof Image){
//            editorCloned.drawable = (Image) super.clone();
//        }
//        if (getDrawable() instanceof Gallery){
//            editorCloned.drawable = (Gallery) super.clone();
//        }
        return editorCloned;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "drawable=" + drawable +
                '}';
    }
}