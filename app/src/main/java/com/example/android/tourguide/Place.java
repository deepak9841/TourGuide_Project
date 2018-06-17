package com.example.android.tourguide;

/**
 * Created by dpak on 1/15/18.
 */

class Place {
    /**
     * Image resource ID for the place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Constant value that represents no image was provided for this place
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    //Description Id for the place
    private int mDescriptionId= NO_DESCRIPTION_PROVIDED;
    // Constant value that represents no description was provided for the place.
    private static final int NO_DESCRIPTION_PROVIDED = -1;
    //Information Id for the place
    private int mInformationId= NO_INFORMATION_PROVIDED;
    // Constant value that represents no information was provided for the place.
    private static final int NO_INFORMATION_PROVIDED = -1;
    // Weblink Id for the place
    private int mWeblinkId = NO_WEBLINK_PROVIDED;
    // Constant value that represents no weblink was provided for the place.
    private static final int NO_WEBLINK_PROVIDED = -1;


    private int mTitle;


    /**
     * Create a new Word object.
     *
     * @param title       is the title of the place.
     * @param description is a short introduction of a place wherever applicable.
     * @param information has opening hours or address or phone number related to the place.
     * @param weblink is the web-address for the place.
     */


    // constructor for view with all the items.
    public Place(int imageResourceId, int title, int description, int information, int weblink) {
        mDescriptionId = description;
        mTitle = title;
        mImageResourceId = imageResourceId;
        mInformationId = information;
        mWeblinkId = weblink;
    }

    // constructor for the views without description,information, weblink. the mountains acitivty
    public Place(int imageResourceId, int title) {
        mTitle = title;
        mImageResourceId = imageResourceId;
    }
    /**
     * Returns whether or not there is an image, description, information or weblink for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasDescription(){return mDescriptionId != NO_DESCRIPTION_PROVIDED;}

    public boolean hasInformation(){return mInformationId != NO_INFORMATION_PROVIDED;}

    public boolean hasWeblink(){return mWeblinkId != NO_WEBLINK_PROVIDED;}



    /**
     * Get the title of the place.
     */
    public int getTitle() {
        return mTitle;
    }

    /**
     * Get the description of the place.
     */
    public int getDescription() {
        return mDescriptionId;
    }

    //Get the image
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //Get the information
    public int getInformation() {
        return mInformationId;
    }

    // Get the weblink
    public int getWeblink() {
        return mWeblinkId;
    }


}


