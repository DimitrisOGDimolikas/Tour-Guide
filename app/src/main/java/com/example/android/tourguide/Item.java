package com.example.android.tourguide;

public class Item {

    // Variables
    private int mLocationTitle;
    private int mLocationDescription;
    private int mLocationAddress = NO_ADDRESS_PROVIDED;
    private int mLocationNumber = NO_NUMBER_PROVIDED;
    private int mImageId = NO_IMAGE_PROVIDED;
    private final static int NO_IMAGE_PROVIDED = -1;
    private final static int NO_ADDRESS_PROVIDED = -1;
    private final static int NO_NUMBER_PROVIDED = -1;

    public Item(int title, int description, int address, int number, int imageId) {
        mLocationTitle = title;
        mLocationDescription = description;
        mLocationAddress = address;
        mLocationNumber = number;
        mImageId = imageId;
    }

    public Item(int title, int description, int address, int imageId) {
        mLocationTitle = title;
        mLocationAddress = address;
        mLocationDescription = description;
        mImageId = imageId;
    }

    public Item(int title, int description, int imageId) {
        mLocationTitle = title;
        mLocationDescription = description;
        mImageId = imageId;
    }

    // Getters
    public int getmLocationTitle() { return mLocationTitle; }

    public int getmLocationDescription() { return mLocationDescription; }

    public int getmLocationAddress() { return mLocationAddress; }

    public int getmLocationNumber() { return mLocationNumber; }

    public int getImageId(){ return mImageId; }

    // We check if there's something missing or our Item doesn't have
    //that "something" because we didn't initialize it/them for the Item
    // != -1 -> true, has image/address/number
    public boolean hasAddress(){ return mLocationAddress != NO_ADDRESS_PROVIDED; }

    public boolean hasNumber(){ return mLocationNumber !=  NO_NUMBER_PROVIDED; }

    public boolean hasImage(){ return mImageId != NO_IMAGE_PROVIDED; }

}