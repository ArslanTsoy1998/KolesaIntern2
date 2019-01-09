package com.example.arslan.kolesaintern2;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Date;

public class AnalyticsModel {

    @NonNull
    private String mSection;
    @NonNull
    private String mRegionAlias;
    @NonNull
    private String mTitle;
    @NonNull
    private String mPhone;
    @NonNull
    private Date mCreateDate;


    @Nullable
    private String mSubsection;
    @Nullable
    private String mCategory;
    @Nullable
    private String mAddress;
    private float mLatitude;
    private float mLongitude;
    @Nullable
    private String mSubTitle;
    @Nullable
    private String mText;
    @Nullable
    private String mEmail;


    public static class Builder {
        @NonNull
        private String mSection;
        @NonNull
        private String mRegionAlias;
        @NonNull
        private String mTitle;
        @NonNull
        private String mPhone;
        @NonNull
        private Date mCreateDate;


        @Nullable
        private String mSubsection;
        @Nullable
        private String mCategory;
        @Nullable
        private String mAddress;
        private float mLatitude;
        private float mLongitude;
        @Nullable
        private String mSubTitle;
        @Nullable
        private String mText;
        @Nullable
        private String mEmail;

        public Builder(@NonNull String section,
                       @NonNull String regionAlias,
                       @NonNull String title,
                       @NonNull String phone,
                       @NonNull Date createDate
        ) {
            mSection = section;
            mRegionAlias = regionAlias;
            mTitle = title;
            mPhone = phone;
            mCreateDate = createDate;

        }

        public Builder subsection(String val) {
            this.mSubsection = val;
            return this;
        }

        public Builder category(String val) {
            this.mCategory = val;
            return this;
        }

        public Builder address(String val) {
            this.mAddress = val;
            return this;
        }

        public Builder latitude(float val) {
            this.mLatitude = val;
            return this;
        }

        public Builder longtitude(float val) {
            this.mLongitude = val;
            return this;
        }

        public Builder subTitle(String val) {
            this.mSubTitle = val;
            return this;
        }

        public Builder text(String val) {
            this.mText = val;
            return this;
        }

        public Builder email(String val) {
            this.mEmail = val;
            return this;
        }

        public AnalyticsModel build(){
            return new AnalyticsModel(this);
        }

    }

    private AnalyticsModel(Builder builder) {
        this.mSection = builder.mSection;
        this.mRegionAlias = builder.mRegionAlias;
        this.mTitle = builder.mTitle;
        this.mPhone = builder.mPhone;
        this.mCreateDate = builder.mCreateDate;
    }




}
