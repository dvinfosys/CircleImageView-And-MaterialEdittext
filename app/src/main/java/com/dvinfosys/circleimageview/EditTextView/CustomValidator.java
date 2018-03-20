package com.dvinfosys.circleimageview.EditTextView;

public abstract class CustomValidator {

    protected String errorMessage;

    public CustomValidator(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setErrorMessage(String errorMessage){
        this.errorMessage=errorMessage;
    }
    public String getErrorMessage()
    {
        return this.errorMessage;
    }

    public abstract boolean isValid(CharSequence text,boolean isEmpty);
}
