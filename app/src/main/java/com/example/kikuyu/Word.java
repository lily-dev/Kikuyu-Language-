package com.example.kikuyu;

public class Word {
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Kikuyu translation for the word */
    private String mKikuyuTranslation;

    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param KikuyuTranslation is the word in the Kikuyu language
     * //@param  imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word(String defaultTranslation, String KikuyuTranslation) {
        mDefaultTranslation = defaultTranslation;
        mKikuyuTranslation = KikuyuTranslation;
    }
    public Word(String defaultTranslation, String KikuyuTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mKikuyuTranslation = KikuyuTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Kikuyu translation of the word.
     */
    public String getKikuyuTranslation() {
        return mKikuyuTranslation;
    }

    public int getImageResourceId(){return mImageResourceId;}
}
