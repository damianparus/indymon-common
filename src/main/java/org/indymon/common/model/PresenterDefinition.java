package org.indymon.common.model;

public abstract class PresenterDefinition {

    private String symbol;
    private int zIndex;
    private double minScale;
    private String clickAction;

    private String title;
    private int titleFontSize;

    private String description;
    private int descriptionFontSize;

    private int left;
    private int top;
    private int width;
    private int height;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getzIndex() {
        return zIndex;
    }

    public void setzIndex(int zIndex) {
        this.zIndex = zIndex;
    }

    public int getTitleFontSize() {
        return titleFontSize;
    }

    public void setTitleFontSize(int titleFontSize) {
        this.titleFontSize = titleFontSize;
    }

    public double getMinScale() {
        return minScale;
    }

    public void setMinScale(double minScale) {
        this.minScale = minScale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setRight(int right) {
        this.width = right - this.left;
    }

    public void setMaxRight(int rightToCheck) {
        this.width = Math.max(this.width, rightToCheck - this.left);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBottom(int bottom) {
        this.height = bottom - this.top;
    }

    public void setMaxBottom(int bottomToCheck) {
        this.height = Math.max(this.height, bottomToCheck - this.top);
    }

    public String getClickAction() {
        return clickAction;
    }

    public void setClickAction(String clickAction) {
        this.clickAction = clickAction;
    }

    public int getRight() {
        return left + width;
    }

    public int getBottom() {
        return top + height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDescriptionFontSize() {
        return descriptionFontSize;
    }

    public void setDescriptionFontSize(int descriptionFontSize) {
        this.descriptionFontSize = descriptionFontSize;
    }
}
